package mir.routines.pcm2javaCommon;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.emftext.language.java.containers.ContainersPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindJavaPackageRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindJavaPackageRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
      return sourceElementMappedToPackage;
    }
    
    public String getRetrieveTag1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
      return newTag;
    }
    
    public boolean getCorrespondingModelElementsPreconditionMatchingPackages(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag, final org.emftext.language.java.containers.Package matchingPackages) {
      return (Objects.equal(matchingPackages.getName(), StringExtensions.toFirstLower(packageName)) && ((parentPackage == null) || 
        Objects.equal(matchingPackages.getNamespacesAsString(), ((parentPackage.getNamespacesAsString() + parentPackage.getName()) + "."))));
    }
    
    public EObject getCorrepondenceSourceMatchingPackages(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
      return ContainersPackage.Literals.PACKAGE;
    }
    
    public void callRoutine1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag, final List<org.emftext.language.java.containers.Package> matchingPackages, @Extension final RoutinesFacade _routinesFacade) {
      boolean _isEmpty = matchingPackages.isEmpty();
      if (_isEmpty) {
        _routinesFacade.createJavaPackage(sourceElementMappedToPackage, parentPackage, packageName, newTag);
      } else {
        _routinesFacade.addPackageCorrespondence(sourceElementMappedToPackage, IterableExtensions.<org.emftext.language.java.containers.Package>head(matchingPackages), newTag);
      }
    }
  }
  
  public CreateOrFindJavaPackageRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateOrFindJavaPackageRoutine.ActionUserExecution(getExecutionState(), this);
    this.sourceElementMappedToPackage = sourceElementMappedToPackage;this.parentPackage = parentPackage;this.packageName = packageName;this.newTag = newTag;
  }
  
  private EObject sourceElementMappedToPackage;
  
  private org.emftext.language.java.containers.Package parentPackage;
  
  private String packageName;
  
  private String newTag;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindJavaPackageRoutine with input:");
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
    List<org.emftext.language.java.containers.Package> matchingPackages = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceMatchingPackages(sourceElementMappedToPackage, parentPackage, packageName, newTag), // correspondence source supplier
    	org.emftext.language.java.containers.Package.class,
    	(org.emftext.language.java.containers.Package _element) -> userExecution.getCorrespondingModelElementsPreconditionMatchingPackages(sourceElementMappedToPackage, parentPackage, packageName, newTag, _element), // correspondence precondition checker
    	null
    );
    userExecution.callRoutine1(sourceElementMappedToPackage, parentPackage, packageName, newTag, matchingPackages, this.getRoutinesFacade());
    
    return true;
  }
}
