package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddPackageCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private AddPackageCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
      return javaPackage;
    }
    
    public EObject getElement2(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
      return sourceElementMappedToPackage;
    }
    
    public String getTag1(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
      return newTag;
    }
  }
  
  public AddPackageCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddPackageCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.sourceElementMappedToPackage = sourceElementMappedToPackage;this.javaPackage = javaPackage;this.newTag = newTag;
  }
  
  private EObject sourceElementMappedToPackage;
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  private String newTag;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddPackageCorrespondenceRoutine with input:");
    	getLogger().trace("   sourceElementMappedToPackage: " + this.sourceElementMappedToPackage);
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    	getLogger().trace("   newTag: " + this.newTag);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(sourceElementMappedToPackage, javaPackage, newTag), userExecution.getElement2(sourceElementMappedToPackage, javaPackage, newTag), userExecution.getTag1(sourceElementMappedToPackage, javaPackage, newTag));
    
    return true;
  }
}
