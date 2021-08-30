package mir.routines.commonOperationRequiredRole;

import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
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
  
  public boolean checkImportForImportedRequiredRoles(final Import importSt) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckImportForImportedRequiredRolesRoutine routine = new CheckImportForImportedRequiredRolesRoutine(_routinesFacade, _reactionExecutionState, _caller, importSt);
    return routine.applyRoutine();
  }
  
  public boolean checkClassifierForImportedRequiredRoles(final ConcreteClassifier classifier) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckClassifierForImportedRequiredRolesRoutine routine = new CheckClassifierForImportedRequiredRolesRoutine(_routinesFacade, _reactionExecutionState, _caller, classifier);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindRequiredRoleForImport(final Import importSt, final ConcreteClassifier importingClassifier) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindRequiredRoleForImportRoutine routine = new CreateOrFindRequiredRoleForImportRoutine(_routinesFacade, _reactionExecutionState, _caller, importSt, importingClassifier);
    return routine.applyRoutine();
  }
  
  public boolean createRequiredRoleForImport(final Import importSt, final OperationInterface opInterface, final RepositoryComponent requiringCom) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateRequiredRoleForImportRoutine routine = new CreateRequiredRoleForImportRoutine(_routinesFacade, _reactionExecutionState, _caller, importSt, opInterface, requiringCom);
    return routine.applyRoutine();
  }
  
  public boolean addCorrespondenceForImportAndRequiredRole(final Import importSt, final OperationRequiredRole reqRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddCorrespondenceForImportAndRequiredRoleRoutine routine = new AddCorrespondenceForImportAndRequiredRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, importSt, reqRole);
    return routine.applyRoutine();
  }
  
  public boolean checkFieldForRequiredInterface(final Classifier classifier, final Field javaField) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckFieldForRequiredInterfaceRoutine routine = new CheckFieldForRequiredInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, classifier, javaField);
    return routine.applyRoutine();
  }
  
  public boolean createOperationRequiredRoleForField(final Field javaField, final OperationInterface operationInterface, final RepositoryComponent repoComponent) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOperationRequiredRoleForFieldRoutine routine = new CreateOperationRequiredRoleForFieldRoutine(_routinesFacade, _reactionExecutionState, _caller, javaField, operationInterface, repoComponent);
    return routine.applyRoutine();
  }
  
  public boolean removeRequiredRoleForImport(final Import importSt) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveRequiredRoleForImportRoutine routine = new RemoveRequiredRoleForImportRoutine(_routinesFacade, _reactionExecutionState, _caller, importSt);
    return routine.applyRoutine();
  }
  
  public boolean checkUpdatedFieldType(final Field field, final TypeReference oldType, final TypeReference newType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckUpdatedFieldTypeRoutine routine = new CheckUpdatedFieldTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, field, oldType, newType);
    return routine.applyRoutine();
  }
  
  public boolean removeRequiredRole(final OperationRequiredRole reqRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveRequiredRoleRoutine routine = new RemoveRequiredRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, reqRole);
    return routine.applyRoutine();
  }
  
  public boolean removeCorrespondenceForImportAndRequiredRole(final Import importSt, final OperationRequiredRole reqRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveCorrespondenceForImportAndRequiredRoleRoutine routine = new RemoveCorrespondenceForImportAndRequiredRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, importSt, reqRole);
    return routine.applyRoutine();
  }
}
