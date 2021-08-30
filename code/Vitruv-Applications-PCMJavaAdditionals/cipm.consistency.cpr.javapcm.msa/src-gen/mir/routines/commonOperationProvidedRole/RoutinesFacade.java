package mir.routines.commonOperationProvidedRole;

import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
  }
  
  public boolean createOrFindOperationProvidedRoleFromTypeReference(final TypeReference typeReference) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindOperationProvidedRoleFromTypeReferenceRoutine routine = new CreateOrFindOperationProvidedRoleFromTypeReferenceRoutine(_routinesFacade, _reactionExecutionState, _caller, typeReference);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindOperationProvidedRole(final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindOperationProvidedRoleRoutine routine = new CreateOrFindOperationProvidedRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, classifierInterface, javaClass);
    return routine.applyRoutine();
  }
  
  public boolean createOperationProvidedRole(final OperationInterface opInterface, final BasicComponent basicComponent, final org.emftext.language.java.classifiers.Class javaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOperationProvidedRoleRoutine routine = new CreateOperationProvidedRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, opInterface, basicComponent, javaClass);
    return routine.applyRoutine();
  }
  
  public boolean checkRemovalOfOperationProvidedRole(final org.emftext.language.java.classifiers.Class clazz, final Classifier classifierRef) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckRemovalOfOperationProvidedRoleRoutine routine = new CheckRemovalOfOperationProvidedRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, clazz, classifierRef);
    return routine.applyRoutine();
  }
  
  public boolean removeOperationProvidedRolesForRemovedClass(final Classifier classifier) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveOperationProvidedRolesForRemovedClassRoutine routine = new RemoveOperationProvidedRolesForRemovedClassRoutine(_routinesFacade, _reactionExecutionState, _caller, classifier);
    return routine.applyRoutine();
  }
  
  public boolean removeOperationProvidedRole(final OperationProvidedRole role) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveOperationProvidedRoleRoutine routine = new RemoveOperationProvidedRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, role);
    return routine.applyRoutine();
  }
}
