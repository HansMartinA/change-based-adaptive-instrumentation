package org.splevo.jamopp.extraction;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emftext.language.java.JavaClasspath;
import org.splevo.commons.emf.FileResourceHandling.ResourceHandlingOptions;
import org.splevo.commons.emf.SPLevoResourceSet;
import org.splevo.extraction.SoftwareModelExtractionException;
import org.splevo.extraction.SoftwareModelExtractor;
import org.splevo.jamopp.extraction.cache.ReferenceCache;
import org.splevo.jamopp.extraction.resource.JavaSourceOrClassFileResourceCachingFactoryImpl;

import com.google.common.collect.Lists;

import jamopp.resource.JavaResource2Factory;

/**
 * Software Model Extractor for the Java technology based on the Java Model Parser and Printer
 * (JaMoPP).
 */
public class JaMoPPSoftwareModelExtractor implements SoftwareModelExtractor {

    private static Logger logger = Logger.getLogger(JaMoPPSoftwareModelExtractor.class);

    public static final boolean EXTRACTOR_EXTRACT_LAYOUT_BY_DEFAULT = false;
    public static final String EXTRACTOR_ID = "JaMoPPSoftwareModelExtractor";
    private static final String EXTRACTOR_LABEL = "JaMoPP Software Model Extractor";

    /**
     * Extract the source model of a list of java projects. One project is the main project while a
     * list of additional projects to analyze can be specified. The reason for one main project is,
     * that this one is used for example for the naming of the root inventory produced etc.
     *
     * @param projectPaths
     *            Source Paths of the projects to be extracted.
     * @param monitor
     *            The monitor to report the progress to.
     * @return The set of resources containing the extracted model.
     * @throws SoftwareModelExtractionException
     *             Identifies the extraction was not successful.
     */
    public ResourceSet extractSoftwareModel(List<String> projectPaths, IProgressMonitor monitor)
            throws SoftwareModelExtractionException {
        return extractSoftwareModel(projectPaths, monitor, null);
    }

    /**
     * Extract all java files and referenced resources to a file named according to
     * {@link JaMoPPSoftwareModelExtractor#XMI_FILE_SEGMENT} within the provided targetURI.
     *
     * <p>
     * If the sourceModelPath is null, the extractor will not use a cache file for improved
     * reference resolving.
     * </p>
     * {@inheritDoc}
     */
    @Override
    public ResourceSet extractSoftwareModel(List<String> projectPaths, IProgressMonitor monitor, String sourceModelPath)
            throws SoftwareModelExtractionException {
        return extractSoftwareModel(projectPaths, monitor, sourceModelPath, EXTRACTOR_EXTRACT_LAYOUT_BY_DEFAULT);
    }

    /**
     * Extract all java files and referenced resources to a file named according to
     * {@link JaMoPPSoftwareModelExtractor#XMI_FILE_SEGMENT} within the provided targetURI.
     *
     * <p>
     * If the sourceModelPath is null, the extractor will not use a cache file for improved
     * reference resolving.
     * </p>
     *
     *
     * @param projectPaths
     *            Source Paths of the projects to be extracted.
     * @param monitor
     *            The monitor to report the progress to.
     * @param sourceModelPath
     *            The absolute path to the directory to store information for extracted source model
     *            in.
     * @param extractLayoutInfo
     *            Option to extract layout information.
     * @return The set of resources containing the extracted model.
     * @throws SoftwareModelExtractionException
     *             Identifies the extraction was not successful.
     *
     */
    public ResourceSet extractSoftwareModel(List<String> projectPaths, IProgressMonitor monitor,
            String sourceModelPath, boolean extractLayoutInfo) throws SoftwareModelExtractionException {

        if (sourceModelPath != null) {
            logger.info("Use cache file: " + sourceModelPath);
        }

        // TODO: Refactor Code for more intuitive
        // loading-resolving-caching-workflow
        ResourceSet targetResourceSet = setUpResourceSet(sourceModelPath, extractLayoutInfo);
        List<Resource> resources = loadProjectJavaFiles(targetResourceSet, projectPaths);

        // trigger the resource resolving as soon as all resources are parsed.
        ReferenceCache cache = getReferenceCache(targetResourceSet);
        for (Resource resource : resources) {
            cache.resolve(resource);
        }

        triggerCacheSave(targetResourceSet);

        return targetResourceSet;
    }
   
    /**
     * Load all java files found in the projects into a ResourceSet and return the list of created
     * resources.
     *
     * @param targetResourceSet
     *            The preconfigured resource set to load to.
     * @param projectPaths
     *            The base paths of the projects containing the java files.
     * @return The list of newly created resources.
     * @throws SoftwareModelExtractionException
     *             thrown if a java file could not be parsed successfully.
     */
    protected List<Resource> loadProjectJavaFiles(ResourceSet targetResourceSet, Iterable<String> projectPaths)
            throws SoftwareModelExtractionException {
        List<Resource> resources = Lists.newArrayList();
        for (String projectPath : projectPaths) {
            List<Resource> projectResources = loadProjectJavaFiles(targetResourceSet, projectPath);
            resources.addAll(projectResources);
        }
        logger.info(String.format("%d Java files added to resource set", resources.size()));
        return resources;
    }

    /**
     * Load all java files found in a project into a ResourceSet and return the list of created
     * resources.
     *
     * @param targetResourceSet
     *            The preconfigured resource set to load to.
     * @param projectPath
     *            The base path of the project containing the java files.
     * @return The list of newly created resources.
     * @throws SoftwareModelExtractionException
     *             thrown if a java file could not be parsed successfully.
     */
    private List<Resource> loadProjectJavaFiles(ResourceSet targetResourceSet, String projectPath)
            throws SoftwareModelExtractionException {
        List<Resource> projectResources;
        try {
            File srcFolder = new File(projectPath);
            srcFolder.isDirectory();
            projectResources = loadAllJavaFilesInResourceSet(srcFolder, targetResourceSet);
        } catch (Exception e) {
            throw new SoftwareModelExtractionException("Failed to parse project resources. Project: " + projectPath, e);
        }
        return projectResources;
    }

    /**
     * Trigger the cache enabled JaMoPP resource cache to be saved.
     *
     * @param targetResourceSet
     *            The resource set to save the assigned cache in.
     */
    private void triggerCacheSave(ResourceSet targetResourceSet) {
        ReferenceCache cache = getReferenceCache(targetResourceSet);
        logger.debug("References not resolved from Cache: " + cache.getNotResolvedFromCacheCounterReference());
        cache.save();
    }

    /**
     * Get the reference cache of the JaMoPP java resource factory registered in a resource set.
     *
     * @param resourceSet
     *            The resource set to look up the cache.
     * @return The cache or null if none could be found.
     */
    private ReferenceCache getReferenceCache(ResourceSet resourceSet) {
        Map<String, Object> factoryMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
        Object factoryObject = factoryMap.get("java");
        JavaSourceOrClassFileResourceCachingFactoryImpl factory = (JavaSourceOrClassFileResourceCachingFactoryImpl) factoryObject;
        ReferenceCache cache = factory.getReferenceCache();
        return cache;
    }

    /**
     * Load a all files as resource in a specific folder and it's sub folders.
     *
     * @param rootFolder
     *            The root folder to recursively load all resources from.
     * @param rs
     *            The resource set to add it to.
     * @return The number of loaded java files.
     * @throws IOException
     *             An exception during resource access.
     */
    private List<Resource> loadAllJavaFilesInResourceSet(File rootFolder, ResourceSet rs) throws IOException {

        List<Resource> resources = Lists.newArrayList();

        Collection<File> javaFiles = FileUtils.listFiles(rootFolder, new String[] { "java" }, true);
        for (File javaFile : javaFiles) {
            
            Resource resource = parseResource(javaFile, rs);
            if (resource != null) {
                resources.add(resource);
            } else {
                logger.warn("Failed to load resource: " + javaFile);
            }
        }

        return resources;
    }

    /**
     * Load a specific resource.
     *
     * @param file
     *            The file object to load as resource.
     * @param rs
     *            The resource set to add it to.
     * @return The loaded resource.
     * @throws IOException
     *             An exception during resource access.
     */
    private Resource parseResource(File file, ResourceSet rs) throws IOException {
        return loadResource(file.getCanonicalPath(), rs);
    }

    /**
     * Load a specific resource.
     *
     * @param filePath
     *            The path of the file to load.
     * @param rs
     *            The resource set to add it to.
     * @return The loaded resource.
     * @throws IOException
     *             An exception during resource access.
     */
    private Resource loadResource(String filePath, ResourceSet rs) throws IOException {
        return loadResource(URI.createFileURI(filePath), rs);
    }

    /**
     * Load a specific resource.
     *
     * @param uri
     *            The uri of the resource.
     * @param rs
     *            The resource set to add it to.
     * @return The loaded resource.
     * @throws IOException
     *             An exception during resource access.
     */
    private Resource loadResource(URI uri, ResourceSet rs) throws IOException {
        return rs.getResource(uri, true);
    }

    /**
     * Setup the JaMoPP resource set and prepare the parsing options for the java resource type.
     * 
     * The jar files contained in the extracted projects are registered to the class path as well.
     * 
     * @param sourceModelDirectory
     *            The path to the directory assigned to the extracted copy.
     * @param extractLayoutInfo
     *            Flag for extraction of layout information. True means that layout information is
     *            extracted.
     * @return The initialized resource set.
     */
    private ResourceSet setUpResourceSet(String sourceModelDirectory, boolean extractLayoutInfo) {
        ArrayList<String> directories = Lists.newArrayList();
        if (sourceModelDirectory != null) {
            directories.add(sourceModelDirectory);
        }
        
        ResourceSet rs = new SPLevoResourceSet();
        initResourceSet(rs, directories, extractLayoutInfo);
        return rs;
    }

    @Override
    public String getId() {
        return EXTRACTOR_ID;
    }

    @Override
    public String getLabel() {
        return EXTRACTOR_LABEL;
    }

    @Override
    public void prepareResourceSet(ResourceSet rs, List<String> sourceModelPaths, boolean loadLayoutInformation) {
        initResourceSet(rs, sourceModelPaths, loadLayoutInformation);
    }
    
    private void initResourceSet(ResourceSet rs, List<String> sourceModelPaths, boolean loadLayoutInformation) {
        final Boolean disableLayoutOption = loadLayoutInformation ? Boolean.FALSE : Boolean.TRUE;

        JavaClasspath.get().registerStdLib();
        
        final Map<Object, Object> options = rs.getLoadOptions();
        options.put(ResourceHandlingOptions.USE_PLATFORM_RESOURCE,
                ResourceHandlingOptions.USE_PLATFORM_RESOURCE.getDefault());

        Factory originalFactory = new JavaResource2Factory();
        Factory cachedJaMoPPFactory = new JavaSourceOrClassFileResourceCachingFactoryImpl(originalFactory,
                sourceModelPaths);
        
        JavaClasspath.get(rs);

        Map<String, Object> factoryMap = rs.getResourceFactoryRegistry().getExtensionToFactoryMap();
        factoryMap.put("java", cachedJaMoPPFactory);
        // DesignDecision No caching for byte code resources to improve performance
        factoryMap.put("class", originalFactory);
    }

}
