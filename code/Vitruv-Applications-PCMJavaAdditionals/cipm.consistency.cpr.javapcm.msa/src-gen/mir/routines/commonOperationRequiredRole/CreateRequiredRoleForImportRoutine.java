package mir.routines.commonOperationRequiredRole;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.imports.Import;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateRequiredRoleForImportRoutine extends AbstractRepairRoutineRealization {
  private CreateRequiredRoleForImportRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final Import importSt, final OperationInterface opInterface, final RepositoryComponent requiringCom) {
      return importSt;
    }
    
    public void updateReqRoleElement(final Import importSt, final OperationInterface opInterface, final RepositoryComponent requiringCom, final OperationRequiredRole reqRole) {
      reqRole.setRequiredInterface__OperationRequiredRole(opInterface);
      reqRole.setRequiringEntity_RequiredRole(requiringCom);
      String _entityName = requiringCom.getEntityName();
      String _plus = ("Component_" + _entityName);
      String _plus_1 = (_plus + "_requires_");
      String _entityName_1 = opInterface.getEntityName();
      String _plus_2 = (_plus_1 + _entityName_1);
      reqRole.setEntityName(_plus_2);
    }
    
    public void callRoutine1(final Import importSt, final OperationInterface opInterface, final RepositoryComponent requiringCom, final OperationRequiredRole reqRole, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.addCorrespondenceForImportAndRequiredRole(importSt, reqRole);
    }
  }
  
  public CreateRequiredRoleForImportRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Import importSt, final OperationInterface opInterface, final RepositoryComponent requiringCom) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.CreateRequiredRoleForImportRoutine.ActionUserExecution(getExecutionState(), this);
    this.importSt = importSt;this.opInterface = opInterface;this.requiringCom = requiringCom;
  }
  
  private Import importSt;
  
  private OperationInterface opInterface;
  
  private RepositoryComponent requiringCom;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateRequiredRoleForImportRoutine with input:");
    	getLogger().trace("   importSt: " + this.importSt);
    	getLogger().trace("   opInterface: " + this.opInterface);
    	getLogger().trace("   requiringCom: " + this.requiringCom);
    }
    
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(importSt, opInterface, requiringCom), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationRequiredRole.class,
    	(org.palladiosimulator.pcm.repository.OperationRequiredRole _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.OperationRequiredRole reqRole = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createOperationRequiredRole();
    notifyObjectCreated(reqRole);
    userExecution.updateReqRoleElement(importSt, opInterface, requiringCom, reqRole);
    
    userExecution.callRoutine1(importSt, opInterface, requiringCom, reqRole, this.getRoutinesFacade());
    
    return true;
  }
}
