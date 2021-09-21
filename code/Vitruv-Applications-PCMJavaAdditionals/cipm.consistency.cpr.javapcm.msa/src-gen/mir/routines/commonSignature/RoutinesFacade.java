package mir.routines.commonSignature;

import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.parameters.Parametrizable;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.OperationSignature;
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
  
  public boolean createOrFindPCMSignature(final Method interfaceMethod) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindPCMSignatureRoutine routine = new CreateOrFindPCMSignatureRoutine(_routinesFacade, _reactionExecutionState, _caller, interfaceMethod);
    return routine.applyRoutine();
  }
  
  public boolean createPCMSignature(final Method interfaceMethod) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreatePCMSignatureRoutine routine = new CreatePCMSignatureRoutine(_routinesFacade, _reactionExecutionState, _caller, interfaceMethod);
    return routine.applyRoutine();
  }
  
  public boolean addCorrespondenceBetweenMethodAndOperationSignature(final Method method, final OperationSignature sign) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddCorrespondenceBetweenMethodAndOperationSignatureRoutine routine = new AddCorrespondenceBetweenMethodAndOperationSignatureRoutine(_routinesFacade, _reactionExecutionState, _caller, method, sign);
    return routine.applyRoutine();
  }
  
  public boolean createSeffFromClassInterface(final ClassMethod method, final org.emftext.language.java.classifiers.Class javaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateSeffFromClassInterfaceRoutine routine = new CreateSeffFromClassInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, method, javaClass);
    return routine.applyRoutine();
  }
  
  public boolean createSeffFromImplementingInterfaces(final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateSeffFromImplementingInterfacesRoutine routine = new CreateSeffFromImplementingInterfacesRoutine(_routinesFacade, _reactionExecutionState, _caller, classMethod, javaClass);
    return routine.applyRoutine();
  }
  
  public boolean createSeffFromImplementingInterface(final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass, final Interface javaInterface) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateSeffFromImplementingInterfaceRoutine routine = new CreateSeffFromImplementingInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, classMethod, javaClass, javaInterface);
    return routine.applyRoutine();
  }
  
  public boolean createSEFF(final Method javaMethod, final org.emftext.language.java.classifiers.Class javaClass, final ClassMethod classMethod) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateSEFFRoutine routine = new CreateSEFFRoutine(_routinesFacade, _reactionExecutionState, _caller, javaMethod, javaClass, classMethod);
    return routine.applyRoutine();
  }
  
  public boolean createParameter(final OrdinaryParameter javaParameter, final Parametrizable javaMethod) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateParameterRoutine routine = new CreateParameterRoutine(_routinesFacade, _reactionExecutionState, _caller, javaParameter, javaMethod);
    return routine.applyRoutine();
  }
  
  public boolean changeParameterName(final String newName, final Parameter javaParameter) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeParameterNameRoutine routine = new ChangeParameterNameRoutine(_routinesFacade, _reactionExecutionState, _caller, newName, javaParameter);
    return routine.applyRoutine();
  }
  
  public boolean updateReturnType(final Method javaMethod, final TypeReference typeReference) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    UpdateReturnTypeRoutine routine = new UpdateReturnTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, javaMethod, typeReference);
    return routine.applyRoutine();
  }
  
  public boolean checkRemovalOfOperationSignature(final Method interfaceMethod) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckRemovalOfOperationSignatureRoutine routine = new CheckRemovalOfOperationSignatureRoutine(_routinesFacade, _reactionExecutionState, _caller, interfaceMethod);
    return routine.applyRoutine();
  }
  
  public boolean checkRemovalOfSEFF(final ClassMethod classMethod) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckRemovalOfSEFFRoutine routine = new CheckRemovalOfSEFFRoutine(_routinesFacade, _reactionExecutionState, _caller, classMethod);
    return routine.applyRoutine();
  }
  
  public boolean deleteParameter(final OrdinaryParameter javaParameter) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    DeleteParameterRoutine routine = new DeleteParameterRoutine(_routinesFacade, _reactionExecutionState, _caller, javaParameter);
    return routine.applyRoutine();
  }
  
  public boolean checkInnerDeclarationsCreation(final DataType type, final TypeReference typeRef) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.checkInnerDeclarationsCreation(type, typeRef);
  }
  
  public boolean createInnerDeclaration(final CompositeDataType dataType, final Field javaField) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.createInnerDeclaration(dataType, javaField);
  }
  
  public boolean checkCollectionDataTypeCreation(final TypeReference typeRef) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.checkCollectionDataTypeCreation(typeRef);
  }
  
  public boolean createOrFindCollectionDataType(final TypeReference typeRef, final TypeReference innerDeclaration) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.createOrFindCollectionDataType(typeRef, innerDeclaration);
  }
  
  public boolean createCollectionDataType(final TypeReference typeRef, final DataType innerType) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.createCollectionDataType(typeRef, innerType);
  }
  
  public boolean createOrFindCollectionDataTypeForArray(final TypeReference elementType) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.createOrFindCollectionDataTypeForArray(elementType);
  }
  
  public boolean createCollectionDataTypeForArray(final DataType innerType) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.createCollectionDataTypeForArray(innerType);
  }
  
  public boolean changeInnerDeclarationType(final TypeReference typeReference, final Field javaField) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.changeInnerDeclarationType(typeReference, javaField);
  }
  
  public boolean checkDataTypeRemoval(final ConcreteClassifier javaClass) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.checkDataTypeRemoval(javaClass);
  }
  
  public boolean removeDataType(final Entity type) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("commonDataType")));
    return _routinesFacade.removeDataType(type);
  }
}
