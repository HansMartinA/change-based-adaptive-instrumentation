package mir.routines.pcm2javaCommon;

import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.emftext.language.java.containers.ContainersPackage;
import tools.vitruv.domains.java.util.JavaPersistenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateJavaPackageRoutine extends AbstractRepairRoutineRealization {
  private CreateJavaPackageRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag, final org.emftext.language.java.containers.Package javaPackage) {
      return javaPackage;
    }
    
    public EObject getCorrepondenceSource1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
      return sourceElementMappedToPackage;
    }
    
    public EObject getElement4(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag, final org.emftext.language.java.containers.Package javaPackage) {
      return ContainersPackage.Literals.PACKAGE;
    }
    
    public String getRetrieveTag1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
      return newTag;
    }
    
    public EObject getElement2(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag, final org.emftext.language.java.containers.Package javaPackage) {
      return sourceElementMappedToPackage;
    }
    
    public EObject getElement3(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag, final org.emftext.language.java.containers.Package javaPackage) {
      return javaPackage;
    }
    
    public String getTag1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag, final org.emftext.language.java.containers.Package javaPackage) {
      return newTag;
    }
    
    public void updateJavaPackageElement(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag, final org.emftext.language.java.containers.Package javaPackage) {
      if ((parentPackage != null)) {
        EList<String> _namespaces = parentPackage.getNamespaces();
        final ArrayList<String> newNamespaces = new ArrayList<String>(_namespaces);
        String _name = parentPackage.getName();
        newNamespaces.add(_name);
        EList<String> _namespaces_1 = javaPackage.getNamespaces();
        Iterables.<String>addAll(_namespaces_1, newNamespaces);
      }
      javaPackage.setName(StringExtensions.toFirstLower(packageName));
      this.persistProjectRelative(sourceElementMappedToPackage, javaPackage, JavaPersistenceHelper.buildJavaFilePath(javaPackage));
    }
  }
  
  public CreateJavaPackageRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateJavaPackageRoutine.ActionUserExecution(getExecutionState(), this);
    this.sourceElementMappedToPackage = sourceElementMappedToPackage;this.parentPackage = parentPackage;this.packageName = packageName;this.newTag = newTag;
  }
  
  private EObject sourceElementMappedToPackage;
  
  private org.emftext.language.java.containers.Package parentPackage;
  
  private String packageName;
  
  private String newTag;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateJavaPackageRoutine with input:");
    	getLogger().trace("   sourceElementMappedToPackage: " + this.sourceElementMappedToPackage);
    	getLogger().trace("   parentPackage: " + this.parentPackage);
    	getLogger().trace("   packageName: " + this.packageName);
    	getLogger().trace("   newTag: " + this.newTag);
    }
    
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(sourceElementMappedToPackage, parentPackage, packageName, newTag), // correspondence source supplier
    	org.emftext.language.java.containers.Package.class,
    	(org.emftext.language.java.containers.Package _element) -> true, // correspondence precondition checker
    	userExecution.getRetrieveTag1(sourceElementMappedToPackage, parentPackage, packageName, newTag)
    ).isEmpty()) {
    	return false;
    }
    org.emftext.language.java.containers.Package javaPackage = org.emftext.language.java.containers.impl.ContainersFactoryImpl.eINSTANCE.createPackage();
    notifyObjectCreated(javaPackage);
    userExecution.updateJavaPackageElement(sourceElementMappedToPackage, parentPackage, packageName, newTag, javaPackage);
    
    addCorrespondenceBetween(userExecution.getElement1(sourceElementMappedToPackage, parentPackage, packageName, newTag, javaPackage), userExecution.getElement2(sourceElementMappedToPackage, parentPackage, packageName, newTag, javaPackage), userExecution.getTag1(sourceElementMappedToPackage, parentPackage, packageName, newTag, javaPackage));
    
    addCorrespondenceBetween(userExecution.getElement3(sourceElementMappedToPackage, parentPackage, packageName, newTag, javaPackage), userExecution.getElement4(sourceElementMappedToPackage, parentPackage, packageName, newTag, javaPackage), "");
    
    return true;
  }
}
