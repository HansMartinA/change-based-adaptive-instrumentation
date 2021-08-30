package mir.routines.java2Pcm;

import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.InterfaceMethod;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.parameters.Parametrizable;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacade extends AbstractRepairRoutinesFacade {
  public RoutinesFacade(final RoutinesFacadesProvider routinesFacadesProvider, final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState executionState) {
    super(routinesFacadesProvider, reactionsImportPath, executionState);
  }
  
  public boolean createPackageEClassCorrespondence(final org.emftext.language.java.containers.Package jPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createPackageEClassCorrespondence(jPackage);
  }
  
  public boolean createOrFindArchitecturalElement(final org.emftext.language.java.containers.Package javaPackage, final String containerName) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOrFindArchitecturalElement(javaPackage, containerName);
  }
  
  public boolean createOrFindArchitecturalElementInPackage(final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.containers.Package containingPackage, final String rootPackageName) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOrFindArchitecturalElementInPackage(javaPackage, containingPackage, rootPackageName);
  }
  
  public boolean createArchitecturalElement(final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createArchitecturalElement(javaPackage, name, rootPackageName);
  }
  
  public boolean createOrFindRepository(final org.emftext.language.java.containers.Package javaPackage, final String packageName, final String newTag) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOrFindRepository(javaPackage, packageName, newTag);
  }
  
  public boolean ensureFirstCaseUpperCaseRepositoryNaming(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.ensureFirstCaseUpperCaseRepositoryNaming(pcmRepository, javaPackage);
  }
  
  public boolean addRepositoryCorrespondence(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.addRepositoryCorrespondence(pcmRepository, javaPackage, newTag);
  }
  
  public boolean createRepository(final org.emftext.language.java.containers.Package javaPackage, final String packageName, final String newTag) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createRepository(javaPackage, packageName, newTag);
  }
  
  public boolean createOrFindSystem(final org.emftext.language.java.containers.Package javaPackage, final String name) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOrFindSystem(javaPackage, name);
  }
  
  public boolean addSystemCorrespondence(final org.palladiosimulator.pcm.system.System pcmSystem, final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.addSystemCorrespondence(pcmSystem, javaPackage);
  }
  
  public boolean createSystem(final org.emftext.language.java.containers.Package javaPackage, final String name) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createSystem(javaPackage, name);
  }
  
  public boolean createBasicComponent(final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createBasicComponent(javaPackage, name, rootPackageName);
  }
  
  public boolean createCompositeComponent(final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createCompositeComponent(javaPackage, name, rootPackageName);
  }
  
  public boolean addCorrespondenceAndUpdateRepository(final RepositoryComponent pcmComponent, final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.addCorrespondenceAndUpdateRepository(pcmComponent, javaPackage);
  }
  
  public boolean removeRepository(final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.removeRepository(javaPackage);
  }
  
  public boolean removeSystem(final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.removeSystem(javaPackage);
  }
  
  public boolean removeComponent(final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.removeComponent(javaPackage);
  }
  
  public boolean renameRepository(final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.renameRepository(javaPackage);
  }
  
  public boolean renameSystem(final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.renameSystem(javaPackage);
  }
  
  public boolean renameComponent(final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.renameComponent(javaPackage);
  }
  
  public boolean createOrFindPCMInterface(final Interface javaInterface, final CompilationUnit compilationUnit) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOrFindPCMInterface(javaInterface, compilationUnit);
  }
  
  public boolean createOrFindContractsInterface(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package contractsPackage, final Repository pcmRepository) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOrFindContractsInterface(javaInterface, compilationUnit, contractsPackage, pcmRepository);
  }
  
  public boolean renameInterface(final Interface javaInterface) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.renameInterface(javaInterface);
  }
  
  public boolean createNonContractsInterface(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createNonContractsInterface(javaInterface, compilationUnit, javaPackage);
  }
  
  public boolean createInterface(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createInterface(javaInterface, compilationUnit, javaPackage);
  }
  
  public boolean addInterfaceCorrespondence(final OperationInterface pcmInterface, final Interface javaInterface, final CompilationUnit compilationUnit) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.addInterfaceCorrespondence(pcmInterface, javaInterface, compilationUnit);
  }
  
  public boolean updateRepositoryInterfaces(final OperationInterface pcmInterface) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.updateRepositoryInterfaces(pcmInterface);
  }
  
  public boolean renameComponentFromClass(final org.emftext.language.java.classifiers.Class javaClass) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.renameComponentFromClass(javaClass);
  }
  
  public boolean renameDataTypeFromClass(final org.emftext.language.java.classifiers.Class javaClass) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.renameDataTypeFromClass(javaClass);
  }
  
  public boolean classMapping(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.classMapping(javaClass, compilationUnit, javaPackage);
  }
  
  public boolean createDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createDataType(javaClass, compilationUnit);
  }
  
  public boolean createElement(final org.emftext.language.java.classifiers.Class javaClass, final org.emftext.language.java.containers.Package javaPackage, final CompilationUnit compilationUnit) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createElement(javaClass, javaPackage, compilationUnit);
  }
  
  public boolean checkSystemAndComponent(final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.classifiers.Class javaClass) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.checkSystemAndComponent(javaPackage, javaClass);
  }
  
  public boolean createOrFindCompositeDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOrFindCompositeDataType(javaClass, compilationUnit);
  }
  
  public boolean createCompositeDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createCompositeDataType(javaClass, compilationUnit);
  }
  
  public boolean createOrFindCollectionDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOrFindCollectionDataType(javaClass, compilationUnit);
  }
  
  public boolean createCollectionDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createCollectionDataType(javaClass, compilationUnit);
  }
  
  public boolean addDataTypeCorrespondence(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final DataType dataType) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.addDataTypeCorrespondence(javaClass, compilationUnit, dataType);
  }
  
  public boolean addDataTypeInRepository(final DataType pcmDataType) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.addDataTypeInRepository(pcmDataType);
  }
  
  public boolean createOperationProvidedRole(final TypeReference typeReference) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOperationProvidedRole(typeReference);
  }
  
  public boolean createOperationProvidedRoleFromTypeReference(final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass, final TypeReference reference) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createOperationProvidedRoleFromTypeReference(classifierInterface, javaClass, reference);
  }
  
  public boolean createJavaSubPackages(final org.emftext.language.java.containers.Package javaPackage) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createJavaSubPackages(javaPackage);
  }
  
  public boolean createJavaPackage(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
    mir.routines.java2PcmClassifier.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmClassifier")));
    return _routinesFacade.createJavaPackage(sourceElementMappedToPackage, parentPackage, packageName, newTag);
  }
  
  public boolean renameMember(final Member javaMember) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.renameMember(javaMember);
  }
  
  public boolean createParameter(final OrdinaryParameter javaParameter, final Parametrizable javaMethod) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createParameter(javaParameter, javaMethod);
  }
  
  public boolean deleteParameter(final OrdinaryParameter javaParameter) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.deleteParameter(javaParameter);
  }
  
  public boolean changeParameterName(final String newName, final Parameter javaParameter) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.changeParameterName(newName, javaParameter);
  }
  
  public boolean changeParameterType(final TypeReference newType, final Parameter javaParameter) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.changeParameterType(newType, javaParameter);
  }
  
  public boolean createInnerDeclaration(final ConcreteClassifier classifier, final Field javaField) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createInnerDeclaration(classifier, javaField);
  }
  
  public boolean createOrFindAssemblyContext(final ConcreteClassifier classifier, final Field javaField) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createOrFindAssemblyContext(classifier, javaField);
  }
  
  public boolean createAssemblyContext(final ConcreteClassifier classifier, final Field javaField) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createAssemblyContext(classifier, javaField);
  }
  
  public boolean addAssemblyContextCorrespondence(final AssemblyContext assemblyContext, final Field javaField) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.addAssemblyContextCorrespondence(assemblyContext, javaField);
  }
  
  public boolean fieldCreatedCorrespondingToOperationInterface(final Classifier classifier, final Field javaField) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.fieldCreatedCorrespondingToOperationInterface(classifier, javaField);
  }
  
  public boolean fieldCreatedCorrespondingToRepositoryComponent(final Classifier classifier, final Field javaField) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.fieldCreatedCorrespondingToRepositoryComponent(classifier, javaField);
  }
  
  public boolean createOperationRequiredRoleCorrespondingToField(final Field javaField, final OperationInterface operationInterface, final RepositoryComponent repoComponent) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createOperationRequiredRoleCorrespondingToField(javaField, operationInterface, repoComponent);
  }
  
  public boolean changeInnerDeclarationType(final TypeReference typeReference, final Field javaField) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.changeInnerDeclarationType(typeReference, javaField);
  }
  
  public boolean createSeffFromImplementingInterfaces(final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createSeffFromImplementingInterfaces(classMethod, javaClass);
  }
  
  public boolean createSeffFromImplementingInterface(final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass, final Interface javaInterface) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createSeffFromImplementingInterface(classMethod, javaClass, javaInterface);
  }
  
  public boolean createSEFF(final Method javaMethod, final org.emftext.language.java.classifiers.Class javaClass, final ClassMethod classMethod) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createSEFF(javaMethod, javaClass, classMethod);
  }
  
  public boolean createPCMSignature(final InterfaceMethod interfaceMethod) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.createPCMSignature(interfaceMethod);
  }
  
  public boolean changeReturnType(final Method javaMethod, final TypeReference typeReference) {
    mir.routines.java2PcmMethod.RoutinesFacade _routinesFacade = this._getRoutinesFacadesProvider().getRoutinesFacade(this._getReactionsImportPath().append(ReactionsImportPath.fromPathString("java2PcmMethod")));
    return _routinesFacade.changeReturnType(javaMethod, typeReference);
  }
}
