package tools.vitruv.applications.pcmjava.integrationFromGit.test.nonIntegratedArea;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jgit.api.errors.CheckoutConflictException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRefNameException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.api.errors.RefAlreadyExistsException;
import org.eclipse.jgit.api.errors.RefNotFoundException;
import org.eclipse.jgit.revwalk.RevCommit;
import org.emftext.language.java.JavaClasspath;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import tools.vitruv.applications.pcmjava.integrationFromGit.GitChangeApplier;
import tools.vitruv.applications.pcmjava.integrationFromGit.GitRepository;
import tools.vitruv.applications.pcmjava.integrationFromGit.response.GitIntegrationChangePropagationSpecification;
import tools.vitruv.applications.pcmjava.integrationFromGit.test.ApplyingChangesTestUtil;
import tools.vitruv.applications.pcmjava.integrationFromGit.test.commits.EuFpetersenCbsPc_integratedArea_fineGrained_commits;
import tools.vitruv.applications.pcmjava.integrationFromGit.test.commits.EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits;
import tools.vitruv.applications.pcmjava.linkingintegration.tests.CodeIntegrationTest;
import tools.vitruv.applications.pcmjava.seffstatements.pojotransformations.Java2PcmWithSeffstatmantsChangePropagationSpecification;
import tools.vitruv.applications.pcmjava.tests.util.CompilationUnitManipulatorHelper;
import tools.vitruv.domains.java.builder.VitruviusJavaBuilderApplicator;
import tools.vitruv.framework.change.processing.ChangePropagationSpecification;
import tools.vitruv.framework.correspondence.Correspondence;
import tools.vitruv.framework.correspondence.CorrespondenceModel;
import tools.vitruv.framework.vsum.InternalVirtualModel;
import tools.vitruv.testutils.TestUserInteraction;

/**
 * Test for changing 'implements' in Non-Integrated Area (NIA) 
 * 
 * @author Ilia Chupakhin
 * @author Manar Mazkatli (advisor)
 */
public class NIAChangeImplementsTest {
	//Project name
	private static String testProjectName = "eu.fpetersen.cbs.pc";
	//Relative path to the project which will be copied into Workspace and the copied project will be integrated into Vitruv. Commits will be applied on the copy.
	private static String testProjectPath =	"testProjects/petersen/projectToApplyCommitsOn/eu.fpetersen.cbs.pc";
	//Relative path to the folder that contains git repository as well as the project. The folder will be copied into workspace. The commits will be read from this repository.  
	private static String gitRepositoryPath = "testProjects/petersen/projectWithCommits";
	//Change propagation specification(s). It defines how the changes on JaMoPP models will be propagate to the corresponding PCM models.
	//More than one change propagation specification can be used at the same time, but not all of them are compatible with each other.
	private static ChangePropagationSpecification[] changePropagationSpecifications = {	new GitIntegrationChangePropagationSpecification()};
	//Logger used to print some useful information about program while program running on the console
	private static Logger logger = Logger.getLogger(CodeIntegrationTest.class.getSimpleName());
	//JDT Model of the integrated project
	private static IProject testProject;
	//JDT Model of the project from git repository
	private static IProject projectFromGitRepository;
	//JDT Model of the current workspace
	private static IWorkspace workspace;
	//Vitruv Virtual Model. It contains all created JaMoPP models as well as correspondences between the JaMoPP and PCM models. 
	private static InternalVirtualModel virtualModel;
	//User dialog used for informing or asking user to make a decision about propagated changes
	//private static TestUserInteraction testUserInteractor;
	//Git repository copied into workspace
	private static GitRepository gitRepository;
	//Git change applier. It applies commits on the integrated project
	private static GitChangeApplier changeApplier;
	//Contains all commits. A key is commit hash, a value is commit. 
	private static Map<String, RevCommit> commits = new HashMap<>();
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws InvocationTargetException, InterruptedException, IOException,
			URISyntaxException, GitAPIException, CoreException {
		//get workspace
		workspace = ResourcesPlugin.getWorkspace();
        //copy git repository into workspace
        gitRepository = ApplyingChangesTestUtil.copyGitRepositoryIntoWorkspace(workspace, gitRepositoryPath);
		//copy test project into workspace
        testProject = ApplyingChangesTestUtil.importAndCopyProjectIntoWorkspace(workspace, testProjectName, testProjectPath);
        //Thread.sleep(10000);
        //create change applier for copied repository
        changeApplier = new GitChangeApplier(gitRepository);
        //integrate test project in Vitruv
        virtualModel = ApplyingChangesTestUtil.integrateProjectWithChangePropagationSpecification(testProject, changePropagationSpecifications, changeApplier);
        //checkout and track branch
        gitRepository.checkoutAndTrackBranch(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.BRANCH_NAME);
        //get all commits from branch and save them in a Map. Commit hash as Key and commit itself as Value in the Map.
        List<RevCommit> commitsList = gitRepository.getAllCommitsFromBranch(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.BRANCH_NAME);
        for (RevCommit commit: commitsList) {
        	commits.put(commit.getName(), commit);
        } 
        //prepare a non-integrated area. The following steps are necessary:
    	//create nonIntegratedPackage in src folder
    	changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.INIT), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_NON_INTEGRATED_PACKAGE), testProject);
    	//create packages contracts and datatypes in nonIntegratedPackage
    	changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_NON_INTEGRATED_PACKAGE), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_CONTRACTS_DATATYPES), testProject);
    	//create package FirstClass in nonIntegratedPackage
    	changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_CONTRACTS_DATATYPES), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_CLASS_PACKAGE), testProject);
    	//create FirstClassImpl.java in package FirstClass
    	changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_CLASS_PACKAGE), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_CLASS_IMPL), testProject);
	}
	
		
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Remove Vitruv Java Builder that is responsible for change propagation
		final VitruviusJavaBuilderApplicator pcmJavaRemoveBuilder = new VitruviusJavaBuilderApplicator();
		pcmJavaRemoveBuilder.removeBuilderFromProject(testProject);
		//Remove JDT model of the copied project as well as this project from file system
		testProject.delete(true, null);
		//Remove the folder containing Vitruv meta data from file system
		FileUtils.deleteDirectory(virtualModel.getFolder());
		//Close and remove copied git repository
		gitRepository.closeRepository();
		//projectFromGitRepository.close(null);
		projectFromGitRepository.delete(true, null);
		FileUtils.deleteDirectory(new File(workspace.getRoot().getLocation().toFile(), "clonedGitRepositories"));
		// This is necessary because otherwise Maven tests will fail as
		// resources from previous tests are still in the classpath and accidentally resolved
		JavaClasspath.reset();
	}
	
	
	@Test
	public void testImplements() throws Throwable {
		testAddFirstInterface();
		testAddMethodInFirstInterface();
		testAddFirstImport();
		testAddImplementsAndMethod();
		testAddSecondInterface();
		testAddMethodInSecondInterface();
		testAddSecondImport();
		//TODO: Vitruv does NOT remove the corrspondence OperationProvidedRole for FirstInterface in FirstClassImpl, 
		//although FirstClassImpl does not implement FirstInterface anymore 
		testChangeImplementsAndAddMethod();
		testRemoveImplements();
		testRemoveBothMethods();
		testRemoveBothImports();
		
	}
	
	
	private void testAddFirstInterface()  throws Throwable  {
		//Add interface in contracts package
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_CLASS_IMPL), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_INTERFACE_FOR_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_INTERFACE_FOR_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstInterface.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstInterface.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertOperationInterfaceWithName(compUnitChanged.getElementName(), virtualModel);
		
		assertTrue("In testAddFirstInterfaceForImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testAddFirstInterfaceForImplements() corresponding PCM model does not exist, but it should exist", pcmExists);
	}

	
	private void testAddMethodInFirstInterface()  throws CoreException, InterruptedException, IOException, RefAlreadyExistsException, RefNotFoundException, InvalidRefNameException, CheckoutConflictException, GitAPIException   {
		//Add method in interface
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_INTERFACE_FOR_IMPLEMENTS), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_METHOD_IN_FIRST_INTERFACE_FOR_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_METHOD_IN_FIRST_INTERFACE_FOR_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstInterface.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstInterface.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertInterfaceMethodWithName("firstMethodInFirstInterface", compUnitChanged, virtualModel);
		
		assertTrue("In testAddMethodInFirstInterfaceForImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testAddMethodInFirstInterfaceForImplements() corresponding PCM model does not exist, but it should exist", pcmExists);
	}
	
	private void testAddFirstImport()  throws Throwable {
		//Add first import statement in FirstClassImpl.java
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_METHOD_IN_FIRST_INTERFACE_FOR_IMPLEMENTS), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_IMPORT_FOR_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_IMPORT_FOR_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertRepositoryComponentCorrespondingToCompilationUnit(compUnitChanged.getElementName(), compUnitChanged, virtualModel);
		assertTrue("In testAddFirstImportForImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testAddFirstImportForImplements() corresponding PCM model does not exist, but it should exist", pcmExists);
	}
	
	private void testAddImplementsAndMethod()  throws CoreException, InterruptedException, IOException, RefAlreadyExistsException, RefNotFoundException, InvalidRefNameException, CheckoutConflictException, GitAPIException {
		//Add implements statement and implemented method in FirstClassImpl.java
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_FIRST_IMPORT_FOR_IMPLEMENTS), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_IMPLEMENTS_AND_METHOD), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_IMPLEMENTS_AND_METHOD);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertOperationProvidedRole("FirstClassImpl.java", "FirstInterface", compUnitChanged, virtualModel);
		//Ensure that there is a corresponding PCM model for method
		boolean pcmForMethodExists = ApplyingChangesTestUtil.assertClassMethodWithName("firstMethodInFirstInterface", compUnitChanged, virtualModel);
		
		assertTrue("In testAddImplementsAndMethod() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testAddImplementsAndMethod() corresponding PCM model does not exist, but it should exist", pcmExists);
		assertTrue("In testAddImplementsAndMethod() corresponding PCM model for the method does not exist, but it should exist", pcmForMethodExists);	
	}

	
	private void testAddSecondInterface()  throws Throwable  {
		//Add interface in contracts package
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_IMPLEMENTS_AND_METHOD), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_SECOND_INTERFACE_FOR_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_SECOND_INTERFACE_FOR_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("SecondInterface.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("SecondInterface.java", testProject);
		//Necessary to avoid a run time exception in  ApplyingChangesTestUtil.assertOperationInterfaceWithName
		Thread.sleep(5000);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertOperationInterfaceWithName(compUnitChanged.getElementName(), virtualModel);
		
		assertTrue("In testAddSecondInterfaceForImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testAddSecondInterfaceForImplements() corresponding PCM model does not exist, but it should exist", pcmExists);
		
	}
	
	
	private void testAddMethodInSecondInterface()  throws CoreException, InterruptedException, IOException, RefAlreadyExistsException, RefNotFoundException, InvalidRefNameException, CheckoutConflictException, GitAPIException  {
		//Add interface in contracts package
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_SECOND_INTERFACE_FOR_IMPLEMENTS), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_METHOD_IN_SECOND_INTERFACE_FOR_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_METHOD_IN_SECOND_INTERFACE_FOR_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("SecondInterface.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("SecondInterface.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertInterfaceMethodWithName("firstMethodInSecondInterface", compUnitChanged, virtualModel);
		
		assertTrue("In testAddMethodInSecondInterfaceForImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testAddMethodInSecondInterfaceForImplements() corresponding PCM model does not exist, but it should exist", pcmExists);
	}
	
	
	private void testAddSecondImport()  throws Throwable  {
		//Add interface in contracts package
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_METHOD_IN_SECOND_INTERFACE_FOR_IMPLEMENTS), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_SECOND_IMPORT_FOR_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_SECOND_IMPORT_FOR_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertRepositoryComponentCorrespondingToCompilationUnit(compUnitChanged.getElementName(), compUnitChanged,  virtualModel);
		
		assertTrue("In testAddSecondImportForImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testAddSecondImportForImplements() corresponding PCM model does not exist, but it should exist", pcmExists);
	}
	
	
	private void testChangeImplementsAndAddMethod()  throws CoreException, InterruptedException, IOException, RefAlreadyExistsException, RefNotFoundException, InvalidRefNameException, CheckoutConflictException, GitAPIException  {
		//Add interface in contracts package
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.ADD_SECOND_IMPORT_FOR_IMPLEMENTS), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.CHANGE_IMPLEMENTS_AND_ADD_METHOD), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.CHANGE_IMPLEMENTS_AND_ADD_METHOD);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertOperationProvidedRole("FirstClassImpl.java", "SecondInterface", compUnitChanged, virtualModel);
		//Ensure that there is no corresponding PCM model
		boolean noPcmExists = ApplyingChangesTestUtil.assertNoOperationProvidedRole("FirstClassImpl.java", "FirstInterface", compUnitChanged, virtualModel);
		//Ensure that there is a corresponding PCM model for method
		boolean pcmForMethodExists = ApplyingChangesTestUtil.assertClassMethodWithName("firstMethodInSecondInterface", compUnitChanged, virtualModel);
		
		assertTrue("In testChangeImplementsAndAddMethod() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testChangeImplementsAndAddMethod() corresponding PCM model does not exist, but it should exist", pcmExists);
		assertTrue("In testChangeImplementsAndAddMethod() corresponding PCM model exists, but it should not exist", noPcmExists);
		assertTrue("In testChangeImplementsAndAddMethod() corresponding PCM model for the method does not exist, but it should exist", pcmForMethodExists);
	}
	
	
	private void testRemoveImplements()  throws CoreException, InterruptedException, IOException, RefAlreadyExistsException, RefNotFoundException, InvalidRefNameException, CheckoutConflictException, GitAPIException  {
		//Add interface in contracts package
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.CHANGE_IMPLEMENTS_AND_ADD_METHOD), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.REMOVE_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.REMOVE_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean noPcmExists = ApplyingChangesTestUtil.assertNoOperationProvidedRole("FirstClassImpl.java", "SecondInterface", compUnitChanged, virtualModel);
		
		assertTrue("In testRemoveImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testRemoveImplements() corresponding PCM model exists, but it should not exist", noPcmExists);
	}
	
	
	private void testRemoveBothMethods()  throws CoreException, InterruptedException, IOException, RefAlreadyExistsException, RefNotFoundException, InvalidRefNameException, CheckoutConflictException, GitAPIException  {
		//Add interface in contracts package
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.REMOVE_IMPLEMENTS), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.REMOVE_BOTH_METHODS_FOR_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.REMOVE_BOTH_METHODS_FOR_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean noPcmExistsForFirstMethod = ApplyingChangesTestUtil.assertNoClassMethodWithName("firstMethodInFirstInterface", compUnitChanged, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean noPcmExistsForSecondMethod = ApplyingChangesTestUtil.assertNoClassMethodWithName("secondMethodInFirstInterface", compUnitChanged, virtualModel);
		
		assertTrue("In testRemoveBothMethodsForImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testRemoveBothMethodsForImplements() corresponding PCM model exists, but it should not exist", noPcmExistsForFirstMethod);
		assertTrue("In testRemoveBothMethodsForImplements() corresponding PCM model exists, but it should not exist", noPcmExistsForSecondMethod);
		
	}
	
	
	private void testRemoveBothImports()  throws Throwable  {
		//Add interface in contracts package
		changeApplier.applyChangesFromCommit(commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.REMOVE_BOTH_METHODS_FOR_IMPLEMENTS), commits.get(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.REMOVE_BOTH_IMPORTS_FOR_IMPLEMENTS), testProject);	
		//Checkout the repository on the certain commit
		gitRepository.checkoutFromCommitId(EuFpetersenCbsPc_nonIntegratedArea_classChanges_fineGrained_Commits.REMOVE_BOTH_IMPORTS_FOR_IMPLEMENTS);
		//Create temporary model from project from git repository. It does NOT add the created project to the workspace.
		projectFromGitRepository = ApplyingChangesTestUtil.createIProject(workspace, workspace.getRoot().getLocation().toString() + "/clonedGitRepositories/" + testProjectName + ".withGit");
		//Get the changed compilation unit and the compilation unit from git repository to compare
		ICompilationUnit compUnitFromGit = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", projectFromGitRepository);
		ICompilationUnit compUnitChanged = CompilationUnitManipulatorHelper.findICompilationUnitWithClassName("FirstClassImpl.java", testProject);
		//Compare JaMoPP-Models 
		boolean jamoppClassifiersAreEqual = ApplyingChangesTestUtil.compareJaMoPPCompilationUnits(compUnitChanged, compUnitFromGit, virtualModel);
		//Ensure that there is a corresponding PCM model
		boolean pcmExists = ApplyingChangesTestUtil.assertRepositoryComponentCorrespondingToCompilationUnit(compUnitChanged.getElementName(), compUnitChanged,  virtualModel);
		
		assertTrue("In testRemoveBothImportsForImplements() the JaMoPP-models are NOT equal, but they should be", jamoppClassifiersAreEqual);
		assertTrue("In testRemoveBothImportsForImplements() corresponding PCM model does not exist, but it should exist", pcmExists);
		
	}
	
}
