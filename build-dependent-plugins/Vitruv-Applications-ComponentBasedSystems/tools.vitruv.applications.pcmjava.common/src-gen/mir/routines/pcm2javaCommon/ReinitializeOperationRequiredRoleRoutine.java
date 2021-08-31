package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class ReinitializeOperationRequiredRoleRoutine extends AbstractRepairRoutineRealization {
  private ReinitializeOperationRequiredRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final OperationRequiredRole requiredRole, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.removeRequiredRole(requiredRole);
      _routinesFacade.addRequiredRole(requiredRole);
    }
  }
  
  public ReinitializeOperationRequiredRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OperationRequiredRole requiredRole) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.ReinitializeOperationRequiredRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.requiredRole = requiredRole;
  }
  
  private OperationRequiredRole requiredRole;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine ReinitializeOperationRequiredRoleRoutine with input:");
    	getLogger().trace("   requiredRole: " + this.requiredRole);
    }
    
    userExecution.callRoutine1(requiredRole, this.getRoutinesFacade());
    
    return true;
  }
}
