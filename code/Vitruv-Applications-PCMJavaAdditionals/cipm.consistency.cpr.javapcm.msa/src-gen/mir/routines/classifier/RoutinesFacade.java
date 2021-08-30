package mir.routines.classifier;

import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.imports.Import;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.parameters.Parametrizable;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
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
  
  public boolean decideInterfaceCreation(final ConcreteClassifier javaInterface) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    DecideInterfaceCreationRoutine routine = new DecideInterfaceCreationRoutine(_routinesFacade, _reactionExecutionState, _caller, javaInterface);
    return routine.applyRoutine();
  }
  
  public boolean checkServletInterfaceCreation(final ConcreteClassifier javaInterface) {
    mir.routines.servlet.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet")));
    return _routinesFacade.checkServletInterfaceCreation(javaInterface);
  }
  
  public boolean createServletHierarchy(final org.emftext.language.java.classifiers.Class start) {
    mir.routines.servlet.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet")));
    return _routinesFacade.createServletHierarchy(start);
  }
  
  public boolean checkMembersForOperations(final ConcreteClassifier classifier) {
    mir.routines.servlet.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet")));
    return _routinesFacade.checkMembersForOperations(classifier);
  }
  
  public boolean connectInterfacesByInheritance(final ConcreteClassifier subClassifier, final ConcreteClassifier superClassifier) {
    mir.routines.servlet.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet")));
    return _routinesFacade.connectInterfacesByInheritance(subClassifier, superClassifier);
  }
  
  public boolean checkJaxRSPCMSignatureCreation(final Method interfaceMethod) {
    mir.routines.jaxRS.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS")));
    return _routinesFacade.checkJaxRSPCMSignatureCreation(interfaceMethod);
  }
  
  public boolean checkJaxRSInterfaceCreation(final ConcreteClassifier javaInterface) {
    mir.routines.jaxRS.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS")));
    return _routinesFacade.checkJaxRSInterfaceCreation(javaInterface);
  }
  
  public boolean createInterface(final ConcreteClassifier javaInterface) {
    mir.routines.commonInterface.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonInterface")));
    return _routinesFacade.createInterface(javaInterface);
  }
  
  public boolean addCorrespondenceBetweenClassifierAndInterface(final ConcreteClassifier javaClassifier, final Interface pcmInterface) {
    mir.routines.commonInterface.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonInterface")));
    return _routinesFacade.addCorrespondenceBetweenClassifierAndInterface(javaClassifier, pcmInterface);
  }
  
  public boolean removeInterface(final Classifier classifier) {
    mir.routines.commonInterface.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonInterface")));
    return _routinesFacade.removeInterface(classifier);
  }
  
  public boolean createOrFindOperationProvidedRoleFromTypeReference(final TypeReference typeReference) {
    mir.routines.commonOperationProvidedRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationProvidedRole")));
    return _routinesFacade.createOrFindOperationProvidedRoleFromTypeReference(typeReference);
  }
  
  public boolean createOrFindOperationProvidedRole(final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass) {
    mir.routines.commonOperationProvidedRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationProvidedRole")));
    return _routinesFacade.createOrFindOperationProvidedRole(classifierInterface, javaClass);
  }
  
  public boolean createOperationProvidedRole(final OperationInterface opInterface, final BasicComponent basicComponent, final org.emftext.language.java.classifiers.Class javaClass) {
    mir.routines.commonOperationProvidedRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationProvidedRole")));
    return _routinesFacade.createOperationProvidedRole(opInterface, basicComponent, javaClass);
  }
  
  public boolean checkRemovalOfOperationProvidedRole(final org.emftext.language.java.classifiers.Class clazz, final Classifier classifierRef) {
    mir.routines.commonOperationProvidedRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationProvidedRole")));
    return _routinesFacade.checkRemovalOfOperationProvidedRole(clazz, classifierRef);
  }
  
  public boolean removeOperationProvidedRolesForRemovedClass(final Classifier classifier) {
    mir.routines.commonOperationProvidedRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationProvidedRole")));
    return _routinesFacade.removeOperationProvidedRolesForRemovedClass(classifier);
  }
  
  public boolean removeOperationProvidedRole(final OperationProvidedRole role) {
    mir.routines.commonOperationProvidedRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationProvidedRole")));
    return _routinesFacade.removeOperationProvidedRole(role);
  }
  
  public boolean checkImportForImportedRequiredRoles(final Import importSt) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.checkImportForImportedRequiredRoles(importSt);
  }
  
  public boolean checkClassifierForImportedRequiredRoles(final ConcreteClassifier classifier) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.checkClassifierForImportedRequiredRoles(classifier);
  }
  
  public boolean createOrFindRequiredRoleForImport(final Import importSt, final ConcreteClassifier importingClassifier) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.createOrFindRequiredRoleForImport(importSt, importingClassifier);
  }
  
  public boolean createRequiredRoleForImport(final Import importSt, final OperationInterface opInterface, final RepositoryComponent requiringCom) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.createRequiredRoleForImport(importSt, opInterface, requiringCom);
  }
  
  public boolean addCorrespondenceForImportAndRequiredRole(final Import importSt, final OperationRequiredRole reqRole) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.addCorrespondenceForImportAndRequiredRole(importSt, reqRole);
  }
  
  public boolean checkFieldForRequiredInterface(final Classifier classifier, final Field javaField) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.checkFieldForRequiredInterface(classifier, javaField);
  }
  
  public boolean createOperationRequiredRoleForField(final Field javaField, final OperationInterface operationInterface, final RepositoryComponent repoComponent) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.createOperationRequiredRoleForField(javaField, operationInterface, repoComponent);
  }
  
  public boolean removeRequiredRoleForImport(final Import importSt) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.removeRequiredRoleForImport(importSt);
  }
  
  public boolean checkUpdatedFieldType(final Field field, final TypeReference oldType, final TypeReference newType) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.checkUpdatedFieldType(field, oldType, newType);
  }
  
  public boolean removeRequiredRole(final OperationRequiredRole reqRole) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.removeRequiredRole(reqRole);
  }
  
  public boolean removeCorrespondenceForImportAndRequiredRole(final Import importSt, final OperationRequiredRole reqRole) {
    mir.routines.commonOperationRequiredRole.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonOperationRequiredRole")));
    return _routinesFacade.removeCorrespondenceForImportAndRequiredRole(importSt, reqRole);
  }
  
  public boolean createOrFindPCMSignature(final Method interfaceMethod) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.createOrFindPCMSignature(interfaceMethod);
  }
  
  public boolean createPCMSignature(final Method interfaceMethod) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.createPCMSignature(interfaceMethod);
  }
  
  public boolean addCorrespondenceBetweenMethodAndOperationSignature(final Method method, final OperationSignature sign) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.addCorrespondenceBetweenMethodAndOperationSignature(method, sign);
  }
  
  public boolean createSeffFromClassInterface(final ClassMethod method, final org.emftext.language.java.classifiers.Class javaClass) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.createSeffFromClassInterface(method, javaClass);
  }
  
  public boolean createSeffFromImplementingInterfaces(final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.createSeffFromImplementingInterfaces(classMethod, javaClass);
  }
  
  public boolean createSeffFromImplementingInterface(final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass, final org.emftext.language.java.classifiers.Interface javaInterface) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.createSeffFromImplementingInterface(classMethod, javaClass, javaInterface);
  }
  
  public boolean createSEFF(final Method javaMethod, final org.emftext.language.java.classifiers.Class javaClass, final ClassMethod classMethod) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.createSEFF(javaMethod, javaClass, classMethod);
  }
  
  public boolean createParameter(final OrdinaryParameter javaParameter, final Parametrizable javaMethod) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.createParameter(javaParameter, javaMethod);
  }
  
  public boolean changeParameterName(final String newName, final Parameter javaParameter) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.changeParameterName(newName, javaParameter);
  }
  
  public boolean updateReturnType(final Method javaMethod, final TypeReference typeReference) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.updateReturnType(javaMethod, typeReference);
  }
  
  public boolean checkRemovalOfOperationSignature(final Method interfaceMethod) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.checkRemovalOfOperationSignature(interfaceMethod);
  }
  
  public boolean deleteSignature(final OperationSignature sign) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.deleteSignature(sign);
  }
  
  public boolean removeCorrespondenceBetweenMethodAndSignature(final Method method, final OperationSignature sign) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.removeCorrespondenceBetweenMethodAndSignature(method, sign);
  }
  
  public boolean checkRemovalOfSEFF(final ClassMethod classMethod) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.checkRemovalOfSEFF(classMethod);
  }
  
  public boolean deleteParameter(final OrdinaryParameter javaParameter) {
    mir.routines.commonSignature.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature")));
    return _routinesFacade.deleteParameter(javaParameter);
  }
  
  public boolean checkInnerDeclarationsCreation(final DataType type, final TypeReference typeRef) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.checkInnerDeclarationsCreation(type, typeRef);
  }
  
  public boolean createInnerDeclaration(final CompositeDataType dataType, final Field javaField) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.createInnerDeclaration(dataType, javaField);
  }
  
  public boolean checkCollectionDataTypeCreation(final TypeReference typeRef) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.checkCollectionDataTypeCreation(typeRef);
  }
  
  public boolean createOrFindCollectionDataType(final TypeReference typeRef, final TypeReference innerDeclaration) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.createOrFindCollectionDataType(typeRef, innerDeclaration);
  }
  
  public boolean createCollectionDataType(final TypeReference typeRef, final DataType innerType) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.createCollectionDataType(typeRef, innerType);
  }
  
  public boolean createOrFindCollectionDataTypeForArray(final TypeReference elementType) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.createOrFindCollectionDataTypeForArray(elementType);
  }
  
  public boolean createCollectionDataTypeForArray(final DataType innerType) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.createCollectionDataTypeForArray(innerType);
  }
  
  public boolean changeInnerDeclarationType(final TypeReference typeReference, final Field javaField) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.changeInnerDeclarationType(typeReference, javaField);
  }
  
  public boolean checkDataTypeRemoval(final ConcreteClassifier javaClass) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.checkDataTypeRemoval(javaClass);
  }
  
  public boolean removeDataType(final Entity type) {
    mir.routines.commonDataType.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("Servlet.JaxRS.common.commonSignature.commonDataType")));
    return _routinesFacade.removeDataType(type);
  }
  
  public boolean createOrFindArchitecturalElement(final ConcreteClassifier classifier) {
    mir.routines.component.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("component")));
    return _routinesFacade.createOrFindArchitecturalElement(classifier);
  }
  
  public boolean createOrFindArchitecturalElementBasedOnModule(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module) {
    mir.routines.component.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("component")));
    return _routinesFacade.createOrFindArchitecturalElementBasedOnModule(classifier, module);
  }
  
  public boolean createBasicComponent(final org.emftext.language.java.containers.Module module) {
    mir.routines.component.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("component")));
    return _routinesFacade.createBasicComponent(module);
  }
  
  public boolean addCorrespondenceForPcmComponentAndClassifierBasedOnModule(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module) {
    mir.routines.component.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("component")));
    return _routinesFacade.addCorrespondenceForPcmComponentAndClassifierBasedOnModule(classifier, module);
  }
  
  public boolean checkBasicComponentRemovalForClassifier(final ConcreteClassifier clazz) {
    mir.routines.component.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("component")));
    return _routinesFacade.checkBasicComponentRemovalForClassifier(clazz);
  }
  
  public boolean checkBasicComponentRemovalForModule(final org.emftext.language.java.containers.Module mod) {
    mir.routines.component.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("component")));
    return _routinesFacade.checkBasicComponentRemovalForModule(mod);
  }
  
  public boolean removeComponent(final RepositoryComponent com) {
    mir.routines.component.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("component")));
    return _routinesFacade.removeComponent(com);
  }
}
