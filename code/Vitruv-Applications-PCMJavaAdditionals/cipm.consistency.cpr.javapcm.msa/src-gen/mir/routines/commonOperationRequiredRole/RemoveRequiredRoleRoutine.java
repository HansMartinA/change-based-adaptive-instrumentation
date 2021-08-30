package mir.routines.commonOperationRequiredRole;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveRequiredRoleRoutine extends AbstractRepairRoutineRealization {
  private RemoveRequiredRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final OperationRequiredRole reqRole) {
      return reqRole;
    }
  }
  
  public RemoveRequiredRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OperationRequiredRole reqRole) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.RemoveRequiredRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.reqRole = reqRole;
  }
  
  private OperationRequiredRole reqRole;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveRequiredRoleRoutine with input:");
    	getLogger().trace("   reqRole: " + this.reqRole);
    }
    
    Stream.of(new Object[] {reqRole})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(reqRole), accessibleElement, null));		
    deleteObject(userExecution.getElement1(reqRole));
    
    return true;
  }
}
