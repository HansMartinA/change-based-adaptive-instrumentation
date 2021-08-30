package mir.routines.commonOperationRequiredRole;

import java.io.IOException;
import java.util.Optional;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.applications.util.temporary.java.JavaTypeUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckUpdatedFieldTypeRoutine extends AbstractRepairRoutineRealization {
  private CheckUpdatedFieldTypeRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceBasicComponent(final Field field, final TypeReference oldType, final TypeReference newType, final Optional<OperationInterface> oldCorrespondingOpInterface, final Optional<RepositoryComponent> oldCorrespondingCom, final Optional<OperationInterface> opInterface, final Optional<RepositoryComponent> newCom, final Optional<OperationRequiredRole> opRequiredRole) {
      ConcreteClassifier _containingConcreteClassifier = field.getContainingConcreteClassifier();
      return _containingConcreteClassifier;
    }
    
    public EObject getCorrepondenceSourceOldCorrespondingOpInterface(final Field field, final TypeReference oldType, final TypeReference newType) {
      Classifier _normalizedClassifierFromTypeReference = JavaTypeUtil.getNormalizedClassifierFromTypeReference(oldType);
      return _normalizedClassifierFromTypeReference;
    }
    
    public EObject getCorrepondenceSourceOpRequiredRole(final Field field, final TypeReference oldType, final TypeReference newType, final Optional<OperationInterface> oldCorrespondingOpInterface, final Optional<RepositoryComponent> oldCorrespondingCom, final Optional<OperationInterface> opInterface, final Optional<RepositoryComponent> newCom) {
      return field;
    }
    
    public EObject getCorrepondenceSourceOpInterface(final Field field, final TypeReference oldType, final TypeReference newType, final Optional<OperationInterface> oldCorrespondingOpInterface, final Optional<RepositoryComponent> oldCorrespondingCom) {
      Classifier _normalizedClassifierFromTypeReference = JavaTypeUtil.getNormalizedClassifierFromTypeReference(newType);
      return _normalizedClassifierFromTypeReference;
    }
    
    public EObject getCorrepondenceSourceOldCorrespondingCom(final Field field, final TypeReference oldType, final TypeReference newType, final Optional<OperationInterface> oldCorrespondingOpInterface) {
      Classifier _normalizedClassifierFromTypeReference = JavaTypeUtil.getNormalizedClassifierFromTypeReference(oldType);
      return _normalizedClassifierFromTypeReference;
    }
    
    public EObject getCorrepondenceSourceNewCom(final Field field, final TypeReference oldType, final TypeReference newType, final Optional<OperationInterface> oldCorrespondingOpInterface, final Optional<RepositoryComponent> oldCorrespondingCom, final Optional<OperationInterface> opInterface) {
      Classifier _normalizedClassifierFromTypeReference = JavaTypeUtil.getNormalizedClassifierFromTypeReference(newType);
      return _normalizedClassifierFromTypeReference;
    }
    
    public void callRoutine1(final Field field, final TypeReference oldType, final TypeReference newType, final Optional<OperationInterface> oldCorrespondingOpInterface, final Optional<RepositoryComponent> oldCorrespondingCom, final Optional<OperationInterface> opInterface, final Optional<RepositoryComponent> newCom, final Optional<OperationRequiredRole> opRequiredRole, final BasicComponent basicComponent, @Extension final RoutinesFacade _routinesFacade) {
      if ((((((opRequiredRole.isPresent() && oldCorrespondingOpInterface.isPresent()) && opInterface.isPresent()) && oldCorrespondingCom.isPresent()) && newCom.isPresent()) && (newCom.get() != basicComponent))) {
        OperationRequiredRole _get = opRequiredRole.get();
        _get.setRequiredInterface__OperationRequiredRole(opInterface.get());
        return;
      }
      if (((((!oldCorrespondingOpInterface.isPresent()) && opInterface.isPresent()) && newCom.isPresent()) && (newCom.get() != basicComponent))) {
        _routinesFacade.createOperationRequiredRoleForField(field, opInterface.get(), basicComponent);
        return;
      }
      if ((opRequiredRole.isPresent() && ((oldCorrespondingOpInterface.isPresent() && (!opInterface.isPresent())) || ((((oldCorrespondingOpInterface.isPresent() && opInterface.isPresent()) && oldCorrespondingCom.isPresent()) && newCom.isPresent()) && (newCom.get() == basicComponent))))) {
        _routinesFacade.removeRequiredRole(opRequiredRole.get());
      }
    }
  }
  
  public CheckUpdatedFieldTypeRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Field field, final TypeReference oldType, final TypeReference newType) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.CheckUpdatedFieldTypeRoutine.ActionUserExecution(getExecutionState(), this);
    this.field = field;this.oldType = oldType;this.newType = newType;
  }
  
  private Field field;
  
  private TypeReference oldType;
  
  private TypeReference newType;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckUpdatedFieldTypeRoutine with input:");
    	getLogger().trace("   field: " + this.field);
    	getLogger().trace("   oldType: " + this.oldType);
    	getLogger().trace("   newType: " + this.newType);
    }
    
    Optional<org.palladiosimulator.pcm.repository.OperationInterface> oldCorrespondingOpInterface = Optional.ofNullable(getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOldCorrespondingOpInterface(field, oldType, newType), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	)
    );
    Optional<org.palladiosimulator.pcm.repository.RepositoryComponent> oldCorrespondingCom = Optional.ofNullable(getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOldCorrespondingCom(field, oldType, newType, oldCorrespondingOpInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	)
    );
    Optional<org.palladiosimulator.pcm.repository.OperationInterface> opInterface = Optional.ofNullable(getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOpInterface(field, oldType, newType, oldCorrespondingOpInterface, oldCorrespondingCom), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	)
    );
    Optional<org.palladiosimulator.pcm.repository.RepositoryComponent> newCom = Optional.ofNullable(getCorrespondingElement(
    	userExecution.getCorrepondenceSourceNewCom(field, oldType, newType, oldCorrespondingOpInterface, oldCorrespondingCom, opInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	)
    );
    Optional<org.palladiosimulator.pcm.repository.OperationRequiredRole> opRequiredRole = Optional.ofNullable(getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOpRequiredRole(field, oldType, newType, oldCorrespondingOpInterface, oldCorrespondingCom, opInterface, newCom), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationRequiredRole.class,
    	(org.palladiosimulator.pcm.repository.OperationRequiredRole _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	)
    );
    org.palladiosimulator.pcm.repository.BasicComponent basicComponent = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceBasicComponent(field, oldType, newType, oldCorrespondingOpInterface, oldCorrespondingCom, opInterface, newCom, opRequiredRole), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.BasicComponent.class,
    	(org.palladiosimulator.pcm.repository.BasicComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (basicComponent == null) {
    	return false;
    }
    userExecution.callRoutine1(field, oldType, newType, oldCorrespondingOpInterface, oldCorrespondingCom, opInterface, newCom, opRequiredRole, basicComponent, this.getRoutinesFacade());
    
    return true;
  }
}
