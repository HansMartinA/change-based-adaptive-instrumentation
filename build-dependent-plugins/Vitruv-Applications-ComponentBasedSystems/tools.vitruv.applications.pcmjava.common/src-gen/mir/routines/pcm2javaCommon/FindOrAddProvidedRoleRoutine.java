package mir.routines.pcm2javaCommon;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class FindOrAddProvidedRoleRoutine extends AbstractRepairRoutineRealization {
  private FindOrAddProvidedRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceJavaClass(final OperationProvidedRole providedRole, final Interface operationProvidingInterface) {
      InterfaceProvidingEntity _providingEntity_ProvidedRole = providedRole.getProvidingEntity_ProvidedRole();
      return _providingEntity_ProvidedRole;
    }
    
    public EObject getCorrepondenceSource1(final OperationProvidedRole providedRole, final Interface operationProvidingInterface, final org.emftext.language.java.classifiers.Class javaClass) {
      return providedRole;
    }
    
    public void executeAction1(final OperationProvidedRole providedRole, final Interface operationProvidingInterface, final org.emftext.language.java.classifiers.Class javaClass, @Extension final RoutinesFacade _routinesFacade) {
      final Function1<TypeReference, Boolean> _function = (TypeReference it) -> {
        Type _target = it.getTarget();
        return Boolean.valueOf(Objects.equal(_target, operationProvidingInterface));
      };
      final Iterable<TypeReference> matchingReference = IterableExtensions.<TypeReference>filter(javaClass.getImplements(), _function);
      int _size = IterableExtensions.size(matchingReference);
      boolean _lessEqualsThan = (_size <= 1);
      Preconditions.checkState(_lessEqualsThan, "There is more than one implementation of interface %s in Java class %s", operationProvidingInterface, javaClass);
      int _size_1 = IterableExtensions.size(matchingReference);
      boolean _equals = (_size_1 == 1);
      if (_equals) {
        _routinesFacade.addProvidedRoleCorrespondence(providedRole, ((TypeReference[])Conversions.unwrapArray(matchingReference, TypeReference.class))[0]);
      } else {
        _routinesFacade.addProvidedRole(providedRole);
      }
    }
    
    public EObject getCorrepondenceSourceOperationProvidingInterface(final OperationProvidedRole providedRole) {
      OperationInterface _providedInterface__OperationProvidedRole = providedRole.getProvidedInterface__OperationProvidedRole();
      return _providedInterface__OperationProvidedRole;
    }
  }
  
  public FindOrAddProvidedRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OperationProvidedRole providedRole) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.FindOrAddProvidedRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.providedRole = providedRole;
  }
  
  private OperationProvidedRole providedRole;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine FindOrAddProvidedRoleRoutine with input:");
    	getLogger().trace("   providedRole: " + this.providedRole);
    }
    
    org.emftext.language.java.classifiers.Interface operationProvidingInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOperationProvidingInterface(providedRole), // correspondence source supplier
    	org.emftext.language.java.classifiers.Interface.class,
    	(org.emftext.language.java.classifiers.Interface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (operationProvidingInterface == null) {
    	return false;
    }
    org.emftext.language.java.classifiers.Class javaClass = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceJavaClass(providedRole, operationProvidingInterface), // correspondence source supplier
    	org.emftext.language.java.classifiers.Class.class,
    	(org.emftext.language.java.classifiers.Class _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (javaClass == null) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(providedRole, operationProvidingInterface, javaClass), // correspondence source supplier
    	org.emftext.language.java.types.NamespaceClassifierReference.class,
    	(org.emftext.language.java.types.NamespaceClassifierReference _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.executeAction1(providedRole, operationProvidingInterface, javaClass, this.getRoutinesFacade());
    
    return true;
  }
}
