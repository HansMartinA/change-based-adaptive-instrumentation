package mir.routines.commonOperationProvidedRole;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.emftext.language.java.classifiers.Classifier;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindOperationProvidedRoleRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindOperationProvidedRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceBasicComponent(final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass, final OperationInterface opInterface) {
      return javaClass;
    }
    
    public EObject getCorrepondenceSourceOpInterface(final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass) {
      return classifierInterface;
    }
    
    public EObject getCorrepondenceSourceProvRoles(final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass, final OperationInterface opInterface, final BasicComponent basicComponent) {
      return javaClass;
    }
    
    public void callRoutine1(final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass, final OperationInterface opInterface, final BasicComponent basicComponent, final List<OperationProvidedRole> provRoles, @Extension final RoutinesFacade _routinesFacade) {
      final Function1<OperationProvidedRole, Boolean> _function = (OperationProvidedRole it) -> {
        return Boolean.valueOf(((it.getProvidedInterface__OperationProvidedRole() == opInterface) && (it.getProvidingEntity_ProvidedRole() == basicComponent)));
      };
      final OperationProvidedRole role = IterableExtensions.<OperationProvidedRole>findFirst(provRoles, _function);
      if ((role == null)) {
        _routinesFacade.createOperationProvidedRole(opInterface, basicComponent, javaClass);
      }
    }
  }
  
  public CreateOrFindOperationProvidedRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationProvidedRole.CreateOrFindOperationProvidedRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.classifierInterface = classifierInterface;this.javaClass = javaClass;
  }
  
  private Classifier classifierInterface;
  
  private org.emftext.language.java.classifiers.Class javaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindOperationProvidedRoleRoutine with input:");
    	getLogger().trace("   classifierInterface: " + this.classifierInterface);
    	getLogger().trace("   javaClass: " + this.javaClass);
    }
    
    org.palladiosimulator.pcm.repository.OperationInterface opInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOpInterface(classifierInterface, javaClass), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (opInterface == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.BasicComponent basicComponent = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceBasicComponent(classifierInterface, javaClass, opInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.BasicComponent.class,
    	(org.palladiosimulator.pcm.repository.BasicComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (basicComponent == null) {
    	return false;
    }
    List<org.palladiosimulator.pcm.repository.OperationProvidedRole> provRoles = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceProvRoles(classifierInterface, javaClass, opInterface, basicComponent), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationProvidedRole.class,
    	(org.palladiosimulator.pcm.repository.OperationProvidedRole _element) -> true, // correspondence precondition checker
    	null
    );
    userExecution.callRoutine1(classifierInterface, javaClass, opInterface, basicComponent, provRoles, this.getRoutinesFacade());
    
    return true;
  }
}
