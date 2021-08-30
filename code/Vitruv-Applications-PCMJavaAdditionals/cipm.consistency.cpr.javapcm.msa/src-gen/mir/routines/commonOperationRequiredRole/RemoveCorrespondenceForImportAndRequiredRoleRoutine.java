package mir.routines.commonOperationRequiredRole;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.imports.Import;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveCorrespondenceForImportAndRequiredRoleRoutine extends AbstractRepairRoutineRealization {
  private RemoveCorrespondenceForImportAndRequiredRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final Import importSt, final OperationRequiredRole reqRole) {
      return importSt;
    }
    
    public EObject getElement2(final Import importSt, final OperationRequiredRole reqRole) {
      return reqRole;
    }
  }
  
  public RemoveCorrespondenceForImportAndRequiredRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Import importSt, final OperationRequiredRole reqRole) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.RemoveCorrespondenceForImportAndRequiredRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.importSt = importSt;this.reqRole = reqRole;
  }
  
  private Import importSt;
  
  private OperationRequiredRole reqRole;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveCorrespondenceForImportAndRequiredRoleRoutine with input:");
    	getLogger().trace("   importSt: " + this.importSt);
    	getLogger().trace("   reqRole: " + this.reqRole);
    }
    
    removeCorrespondenceBetween(userExecution.getElement1(importSt, reqRole), userExecution.getElement2(importSt, reqRole), "");
    
    return true;
  }
}
