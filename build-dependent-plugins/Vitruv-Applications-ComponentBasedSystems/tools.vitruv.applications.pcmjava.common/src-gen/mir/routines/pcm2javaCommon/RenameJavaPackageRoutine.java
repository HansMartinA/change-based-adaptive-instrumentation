package mir.routines.pcm2javaCommon;

import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.applications.util.temporary.java.JavaContainerAndClassifierUtil;
import tools.vitruv.domains.java.util.JavaPersistenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RenameJavaPackageRoutine extends AbstractRepairRoutineRealization {
  private RenameJavaPackageRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public org.emftext.language.java.containers.Package getElement1(final NamedElement sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String expectedTag, final org.emftext.language.java.containers.Package javaPackage) {
      return javaPackage;
    }
    
    public void update0Element(final NamedElement sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String expectedTag, final org.emftext.language.java.containers.Package javaPackage) {
      final ArrayList<String> newNamespaces = CollectionLiterals.<String>newArrayList();
      if ((parentPackage != null)) {
        EList<String> _namespaces = parentPackage.getNamespaces();
        Iterables.<String>addAll(newNamespaces, _namespaces);
        String _name = parentPackage.getName();
        newNamespaces.add(_name);
      }
      boolean modified = JavaContainerAndClassifierUtil.updateNamespaces(javaPackage, newNamespaces);
      modified = (JavaContainerAndClassifierUtil.updateName(javaPackage, packageName) || modified);
      if (modified) {
        this.persistProjectRelative(sourceElementMappedToPackage, javaPackage, JavaPersistenceHelper.buildJavaFilePath(javaPackage));
      }
    }
    
    public String getRetrieveTag1(final NamedElement sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String expectedTag) {
      return expectedTag;
    }
    
    public EObject getCorrepondenceSourceJavaPackage(final NamedElement sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String expectedTag) {
      return sourceElementMappedToPackage;
    }
  }
  
  public RenameJavaPackageRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final NamedElement sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String expectedTag) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.RenameJavaPackageRoutine.ActionUserExecution(getExecutionState(), this);
    this.sourceElementMappedToPackage = sourceElementMappedToPackage;this.parentPackage = parentPackage;this.packageName = packageName;this.expectedTag = expectedTag;
  }
  
  private NamedElement sourceElementMappedToPackage;
  
  private org.emftext.language.java.containers.Package parentPackage;
  
  private String packageName;
  
  private String expectedTag;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RenameJavaPackageRoutine with input:");
    	getLogger().trace("   sourceElementMappedToPackage: " + this.sourceElementMappedToPackage);
    	getLogger().trace("   parentPackage: " + this.parentPackage);
    	getLogger().trace("   packageName: " + this.packageName);
    	getLogger().trace("   expectedTag: " + this.expectedTag);
    }
    
    org.emftext.language.java.containers.Package javaPackage = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceJavaPackage(sourceElementMappedToPackage, parentPackage, packageName, expectedTag), // correspondence source supplier
    	org.emftext.language.java.containers.Package.class,
    	(org.emftext.language.java.containers.Package _element) -> true, // correspondence precondition checker
    	userExecution.getRetrieveTag1(sourceElementMappedToPackage, parentPackage, packageName, expectedTag), 
    	false // asserted
    	);
    if (javaPackage == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(sourceElementMappedToPackage, parentPackage, packageName, expectedTag, javaPackage);
    userExecution.update0Element(sourceElementMappedToPackage, parentPackage, packageName, expectedTag, javaPackage);
    
    return true;
  }
}
