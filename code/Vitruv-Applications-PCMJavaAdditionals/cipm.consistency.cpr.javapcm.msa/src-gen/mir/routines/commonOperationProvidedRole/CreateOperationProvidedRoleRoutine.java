package mir.routines.commonOperationProvidedRole;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOperationProvidedRoleRoutine extends AbstractRepairRoutineRealization {
  private CreateOperationProvidedRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final OperationInterface opInterface, final BasicComponent basicComponent, final org.emftext.language.java.classifiers.Class javaClass, final OperationProvidedRole operationProvidedRole) {
      return operationProvidedRole;
    }
    
    public void updateOperationProvidedRoleElement(final OperationInterface opInterface, final BasicComponent basicComponent, final org.emftext.language.java.classifiers.Class javaClass, final OperationProvidedRole operationProvidedRole) {
      operationProvidedRole.setProvidedInterface__OperationProvidedRole(opInterface);
      operationProvidedRole.setProvidingEntity_ProvidedRole(basicComponent);
      String _entityName = basicComponent.getEntityName();
      String _plus = (_entityName + "_provides_");
      String _entityName_1 = opInterface.getEntityName();
      String _plus_1 = (_plus + _entityName_1);
      operationProvidedRole.setEntityName(_plus_1);
    }
    
    public EObject getElement2(final OperationInterface opInterface, final BasicComponent basicComponent, final org.emftext.language.java.classifiers.Class javaClass, final OperationProvidedRole operationProvidedRole) {
      return javaClass;
    }
  }
  
  public CreateOperationProvidedRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OperationInterface opInterface, final BasicComponent basicComponent, final org.emftext.language.java.classifiers.Class javaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationProvidedRole.CreateOperationProvidedRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.opInterface = opInterface;this.basicComponent = basicComponent;this.javaClass = javaClass;
  }
  
  private OperationInterface opInterface;
  
  private BasicComponent basicComponent;
  
  private org.emftext.language.java.classifiers.Class javaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOperationProvidedRoleRoutine with input:");
    	getLogger().trace("   opInterface: " + this.opInterface);
    	getLogger().trace("   basicComponent: " + this.basicComponent);
    	getLogger().trace("   javaClass: " + this.javaClass);
    }
    
    org.palladiosimulator.pcm.repository.OperationProvidedRole operationProvidedRole = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createOperationProvidedRole();
    notifyObjectCreated(operationProvidedRole);
    userExecution.updateOperationProvidedRoleElement(opInterface, basicComponent, javaClass, operationProvidedRole);
    
    addCorrespondenceBetween(userExecution.getElement1(opInterface, basicComponent, javaClass, operationProvidedRole), userExecution.getElement2(opInterface, basicComponent, javaClass, operationProvidedRole), "");
    
    return true;
  }
}
