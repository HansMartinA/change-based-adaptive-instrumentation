package mir.routines.commonDataType;

import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
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
  
  public boolean checkInnerDeclarationsCreation(final DataType type, final TypeReference typeRef) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckInnerDeclarationsCreationRoutine routine = new CheckInnerDeclarationsCreationRoutine(_routinesFacade, _reactionExecutionState, _caller, type, typeRef);
    return routine.applyRoutine();
  }
  
  public boolean createInnerDeclaration(final CompositeDataType dataType, final Field javaField) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateInnerDeclarationRoutine routine = new CreateInnerDeclarationRoutine(_routinesFacade, _reactionExecutionState, _caller, dataType, javaField);
    return routine.applyRoutine();
  }
  
  public boolean checkCollectionDataTypeCreation(final TypeReference typeRef) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckCollectionDataTypeCreationRoutine routine = new CheckCollectionDataTypeCreationRoutine(_routinesFacade, _reactionExecutionState, _caller, typeRef);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindCollectionDataType(final TypeReference typeRef, final TypeReference innerDeclaration) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindCollectionDataTypeRoutine routine = new CreateOrFindCollectionDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, typeRef, innerDeclaration);
    return routine.applyRoutine();
  }
  
  public boolean createCollectionDataType(final TypeReference typeRef, final DataType innerType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateCollectionDataTypeRoutine routine = new CreateCollectionDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, typeRef, innerType);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindCollectionDataTypeForArray(final TypeReference elementType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindCollectionDataTypeForArrayRoutine routine = new CreateOrFindCollectionDataTypeForArrayRoutine(_routinesFacade, _reactionExecutionState, _caller, elementType);
    return routine.applyRoutine();
  }
  
  public boolean createCollectionDataTypeForArray(final DataType innerType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateCollectionDataTypeForArrayRoutine routine = new CreateCollectionDataTypeForArrayRoutine(_routinesFacade, _reactionExecutionState, _caller, innerType);
    return routine.applyRoutine();
  }
  
  public boolean changeInnerDeclarationType(final TypeReference typeReference, final Field javaField) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeInnerDeclarationTypeRoutine routine = new ChangeInnerDeclarationTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, typeReference, javaField);
    return routine.applyRoutine();
  }
  
  public boolean checkDataTypeRemoval(final ConcreteClassifier javaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckDataTypeRemovalRoutine routine = new CheckDataTypeRemovalRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass);
    return routine.applyRoutine();
  }
  
  public boolean removeDataType(final Entity type) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveDataTypeRoutine routine = new RemoveDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, type);
    return routine.applyRoutine();
  }
}
