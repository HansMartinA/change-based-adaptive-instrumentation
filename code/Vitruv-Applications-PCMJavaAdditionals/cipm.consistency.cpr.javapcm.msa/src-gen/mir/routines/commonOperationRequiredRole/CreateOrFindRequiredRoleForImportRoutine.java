package mir.routines.commonOperationRequiredRole;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.imports.Import;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindRequiredRoleForImportRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindRequiredRoleForImportRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceContainingCom(final Import importSt, final ConcreteClassifier importingClassifier, final OperationInterface opInterface, final RepositoryComponent opInterfaceCom) {
      return importingClassifier;
    }
    
    public EObject getCorrepondenceSourceOpInterface(final Import importSt, final ConcreteClassifier importingClassifier) {
      ConcreteClassifier _classifier = importSt.getClassifier();
      return _classifier;
    }
    
    public EObject getCorrepondenceSourceOpInterfaceCom(final Import importSt, final ConcreteClassifier importingClassifier, final OperationInterface opInterface) {
      ConcreteClassifier _classifier = importSt.getClassifier();
      return _classifier;
    }
    
    public void callRoutine1(final Import importSt, final ConcreteClassifier importingClassifier, final OperationInterface opInterface, final RepositoryComponent opInterfaceCom, final RepositoryComponent containingCom, @Extension final RoutinesFacade _routinesFacade) {
      if ((opInterfaceCom != containingCom)) {
        EList<RequiredRole> _requiredRoles_InterfaceRequiringEntity = containingCom.getRequiredRoles_InterfaceRequiringEntity();
        for (final RequiredRole reqRole : _requiredRoles_InterfaceRequiringEntity) {
          if (((reqRole instanceof OperationRequiredRole) && (reqRole.getRequiringEntity_RequiredRole() == containingCom))) {
            _routinesFacade.addCorrespondenceForImportAndRequiredRole(importSt, ((OperationRequiredRole) reqRole));
            return;
          }
        }
        _routinesFacade.createRequiredRoleForImport(importSt, opInterface, containingCom);
      }
    }
  }
  
  public CreateOrFindRequiredRoleForImportRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Import importSt, final ConcreteClassifier importingClassifier) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.CreateOrFindRequiredRoleForImportRoutine.ActionUserExecution(getExecutionState(), this);
    this.importSt = importSt;this.importingClassifier = importingClassifier;
  }
  
  private Import importSt;
  
  private ConcreteClassifier importingClassifier;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindRequiredRoleForImportRoutine with input:");
    	getLogger().trace("   importSt: " + this.importSt);
    	getLogger().trace("   importingClassifier: " + this.importingClassifier);
    }
    
    org.palladiosimulator.pcm.repository.OperationInterface opInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOpInterface(importSt, importingClassifier), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (opInterface == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.RepositoryComponent opInterfaceCom = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOpInterfaceCom(importSt, importingClassifier, opInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (opInterfaceCom == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.RepositoryComponent containingCom = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceContainingCom(importSt, importingClassifier, opInterface, opInterfaceCom), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (containingCom == null) {
    	return false;
    }
    userExecution.callRoutine1(importSt, importingClassifier, opInterface, opInterfaceCom, containingCom, this.getRoutinesFacade());
    
    return true;
  }
}
