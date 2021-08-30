package mir.routines.commonOperationRequiredRole;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.imports.Import;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveRequiredRoleForImportRoutine extends AbstractRepairRoutineRealization {
  private RemoveRequiredRoleForImportRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceReqRole(final Import importSt) {
      return importSt;
    }
    
    public EObject getCorrepondenceSourceAllImports(final Import importSt, final OperationRequiredRole reqRole) {
      return reqRole;
    }
    
    public void callRoutine1(final Import importSt, final OperationRequiredRole reqRole, final List<Import> allImports, @Extension final RoutinesFacade _routinesFacade) {
      int _size = allImports.size();
      boolean _tripleEquals = (_size == 1);
      if (_tripleEquals) {
        _routinesFacade.removeRequiredRole(reqRole);
      } else {
        _routinesFacade.removeCorrespondenceForImportAndRequiredRole(importSt, reqRole);
      }
    }
  }
  
  public RemoveRequiredRoleForImportRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Import importSt) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.RemoveRequiredRoleForImportRoutine.ActionUserExecution(getExecutionState(), this);
    this.importSt = importSt;
  }
  
  private Import importSt;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveRequiredRoleForImportRoutine with input:");
    	getLogger().trace("   importSt: " + this.importSt);
    }
    
    org.palladiosimulator.pcm.repository.OperationRequiredRole reqRole = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceReqRole(importSt), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationRequiredRole.class,
    	(org.palladiosimulator.pcm.repository.OperationRequiredRole _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (reqRole == null) {
    	return false;
    }
    List<org.emftext.language.java.imports.Import> allImports = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceAllImports(importSt, reqRole), // correspondence source supplier
    	org.emftext.language.java.imports.Import.class,
    	(org.emftext.language.java.imports.Import _element) -> true, // correspondence precondition checker
    	null
    );
    userExecution.callRoutine1(importSt, reqRole, allImports, this.getRoutinesFacade());
    
    return true;
  }
}
