package mir.routines.commonOperationRequiredRole;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.imports.Import;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddCorrespondenceForImportAndRequiredRoleRoutine extends AbstractRepairRoutineRealization {
  private AddCorrespondenceForImportAndRequiredRoleRoutine.ActionUserExecution userExecution;
  
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
  
  public AddCorrespondenceForImportAndRequiredRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Import importSt, final OperationRequiredRole reqRole) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.AddCorrespondenceForImportAndRequiredRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.importSt = importSt;this.reqRole = reqRole;
  }
  
  private Import importSt;
  
  private OperationRequiredRole reqRole;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddCorrespondenceForImportAndRequiredRoleRoutine with input:");
    	getLogger().trace("   importSt: " + this.importSt);
    	getLogger().trace("   reqRole: " + this.reqRole);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(importSt, reqRole), userExecution.getElement2(importSt, reqRole), "");
    
    return true;
  }
}
