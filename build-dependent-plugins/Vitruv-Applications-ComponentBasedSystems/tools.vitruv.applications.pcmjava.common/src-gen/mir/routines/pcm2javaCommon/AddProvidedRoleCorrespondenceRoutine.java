package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddProvidedRoleCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private AddProvidedRoleCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final OperationProvidedRole providedRole, final TypeReference reference) {
      return reference;
    }
    
    public EObject getCorrepondenceSource1(final OperationProvidedRole providedRole, final TypeReference reference) {
      return providedRole;
    }
    
    public EObject getElement2(final OperationProvidedRole providedRole, final TypeReference reference) {
      return providedRole;
    }
  }
  
  public AddProvidedRoleCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OperationProvidedRole providedRole, final TypeReference reference) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddProvidedRoleCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.providedRole = providedRole;this.reference = reference;
  }
  
  private OperationProvidedRole providedRole;
  
  private TypeReference reference;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddProvidedRoleCorrespondenceRoutine with input:");
    	getLogger().trace("   providedRole: " + this.providedRole);
    	getLogger().trace("   reference: " + this.reference);
    }
    
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(providedRole, reference), // correspondence source supplier
    	org.emftext.language.java.types.TypeReference.class,
    	(org.emftext.language.java.types.TypeReference _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    addCorrespondenceBetween(userExecution.getElement1(providedRole, reference), userExecution.getElement2(providedRole, reference), "");
    
    return true;
  }
}
