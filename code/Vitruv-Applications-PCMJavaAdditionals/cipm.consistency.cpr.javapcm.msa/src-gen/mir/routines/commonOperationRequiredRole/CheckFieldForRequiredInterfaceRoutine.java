package mir.routines.commonOperationRequiredRole;

import com.google.common.base.Objects;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.Field;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckFieldForRequiredInterfaceRoutine extends AbstractRepairRoutineRealization {
  private CheckFieldForRequiredInterfaceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceCorrespondingInterface(final Classifier classifier, final Field javaField) {
      return classifier;
    }
    
    public EObject getCorrepondenceSourceRepositoryComponent(final Classifier classifier, final Field javaField, final OperationInterface correspondingInterface, final RepositoryComponent correspondingComponent) {
      ConcreteClassifier _containingConcreteClassifier = javaField.getContainingConcreteClassifier();
      return _containingConcreteClassifier;
    }
    
    public EObject getCorrepondenceSourceCorrespondingComponent(final Classifier classifier, final Field javaField, final OperationInterface correspondingInterface) {
      return classifier;
    }
    
    public void callRoutine1(final Classifier classifier, final Field javaField, final OperationInterface correspondingInterface, final RepositoryComponent correspondingComponent, final RepositoryComponent repositoryComponent, @Extension final RoutinesFacade _routinesFacade) {
      boolean _notEquals = (!Objects.equal(correspondingComponent, repositoryComponent));
      if (_notEquals) {
        _routinesFacade.createOperationRequiredRoleForField(javaField, correspondingInterface, repositoryComponent);
      }
    }
  }
  
  public CheckFieldForRequiredInterfaceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Classifier classifier, final Field javaField) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.CheckFieldForRequiredInterfaceRoutine.ActionUserExecution(getExecutionState(), this);
    this.classifier = classifier;this.javaField = javaField;
  }
  
  private Classifier classifier;
  
  private Field javaField;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckFieldForRequiredInterfaceRoutine with input:");
    	getLogger().trace("   classifier: " + this.classifier);
    	getLogger().trace("   javaField: " + this.javaField);
    }
    
    org.palladiosimulator.pcm.repository.OperationInterface correspondingInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceCorrespondingInterface(classifier, javaField), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (correspondingInterface == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.RepositoryComponent correspondingComponent = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceCorrespondingComponent(classifier, javaField, correspondingInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (correspondingComponent == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.RepositoryComponent repositoryComponent = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRepositoryComponent(classifier, javaField, correspondingInterface, correspondingComponent), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (repositoryComponent == null) {
    	return false;
    }
    userExecution.callRoutine1(classifier, javaField, correspondingInterface, correspondingComponent, repositoryComponent, this.getRoutinesFacade());
    
    return true;
  }
}
