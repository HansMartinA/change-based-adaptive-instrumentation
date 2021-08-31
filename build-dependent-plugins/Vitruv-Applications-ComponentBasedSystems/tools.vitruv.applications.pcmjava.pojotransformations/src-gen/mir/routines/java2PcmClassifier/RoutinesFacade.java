package mir.routines.java2PcmClassifier;

import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Repository;
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
  
  public boolean createPackageEClassCorrespondence(final org.emftext.language.java.containers.Package jPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreatePackageEClassCorrespondenceRoutine routine = new CreatePackageEClassCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, jPackage);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindArchitecturalElement(final org.emftext.language.java.containers.Package javaPackage, final String containerName) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindArchitecturalElementRoutine routine = new CreateOrFindArchitecturalElementRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, containerName);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindArchitecturalElementInPackage(final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.containers.Package containingPackage, final String rootPackageName) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindArchitecturalElementInPackageRoutine routine = new CreateOrFindArchitecturalElementInPackageRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, containingPackage, rootPackageName);
    return routine.applyRoutine();
  }
  
  public boolean createArchitecturalElement(final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateArchitecturalElementRoutine routine = new CreateArchitecturalElementRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, name, rootPackageName);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindRepository(final org.emftext.language.java.containers.Package javaPackage, final String packageName, final String newTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindRepositoryRoutine routine = new CreateOrFindRepositoryRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, packageName, newTag);
    return routine.applyRoutine();
  }
  
  public boolean ensureFirstCaseUpperCaseRepositoryNaming(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    EnsureFirstCaseUpperCaseRepositoryNamingRoutine routine = new EnsureFirstCaseUpperCaseRepositoryNamingRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmRepository, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean addRepositoryCorrespondence(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddRepositoryCorrespondenceRoutine routine = new AddRepositoryCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmRepository, javaPackage, newTag);
    return routine.applyRoutine();
  }
  
  public boolean createRepository(final org.emftext.language.java.containers.Package javaPackage, final String packageName, final String newTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateRepositoryRoutine routine = new CreateRepositoryRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, packageName, newTag);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindSystem(final org.emftext.language.java.containers.Package javaPackage, final String name) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindSystemRoutine routine = new CreateOrFindSystemRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, name);
    return routine.applyRoutine();
  }
  
  public boolean addSystemCorrespondence(final org.palladiosimulator.pcm.system.System pcmSystem, final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddSystemCorrespondenceRoutine routine = new AddSystemCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmSystem, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean createSystem(final org.emftext.language.java.containers.Package javaPackage, final String name) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateSystemRoutine routine = new CreateSystemRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, name);
    return routine.applyRoutine();
  }
  
  public boolean createBasicComponent(final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateBasicComponentRoutine routine = new CreateBasicComponentRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, name, rootPackageName);
    return routine.applyRoutine();
  }
  
  public boolean createCompositeComponent(final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateCompositeComponentRoutine routine = new CreateCompositeComponentRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, name, rootPackageName);
    return routine.applyRoutine();
  }
  
  public boolean addCorrespondenceAndUpdateRepository(final RepositoryComponent pcmComponent, final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddCorrespondenceAndUpdateRepositoryRoutine routine = new AddCorrespondenceAndUpdateRepositoryRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmComponent, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean removeRepository(final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveRepositoryRoutine routine = new RemoveRepositoryRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean removeSystem(final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveSystemRoutine routine = new RemoveSystemRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean removeComponent(final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveComponentRoutine routine = new RemoveComponentRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean renameRepository(final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameRepositoryRoutine routine = new RenameRepositoryRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean renameSystem(final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameSystemRoutine routine = new RenameSystemRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean renameComponent(final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameComponentRoutine routine = new RenameComponentRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindPCMInterface(final Interface javaInterface, final CompilationUnit compilationUnit) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindPCMInterfaceRoutine routine = new CreateOrFindPCMInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, javaInterface, compilationUnit);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindContractsInterface(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package contractsPackage, final Repository pcmRepository) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindContractsInterfaceRoutine routine = new CreateOrFindContractsInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, javaInterface, compilationUnit, contractsPackage, pcmRepository);
    return routine.applyRoutine();
  }
  
  public boolean renameInterface(final Interface javaInterface) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameInterfaceRoutine routine = new RenameInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, javaInterface);
    return routine.applyRoutine();
  }
  
  public boolean createNonContractsInterface(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateNonContractsInterfaceRoutine routine = new CreateNonContractsInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, javaInterface, compilationUnit, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean createInterface(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateInterfaceRoutine routine = new CreateInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, javaInterface, compilationUnit, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean addInterfaceCorrespondence(final OperationInterface pcmInterface, final Interface javaInterface, final CompilationUnit compilationUnit) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddInterfaceCorrespondenceRoutine routine = new AddInterfaceCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmInterface, javaInterface, compilationUnit);
    return routine.applyRoutine();
  }
  
  public boolean updateRepositoryInterfaces(final OperationInterface pcmInterface) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    UpdateRepositoryInterfacesRoutine routine = new UpdateRepositoryInterfacesRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmInterface);
    return routine.applyRoutine();
  }
  
  public boolean renameComponentFromClass(final org.emftext.language.java.classifiers.Class javaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameComponentFromClassRoutine routine = new RenameComponentFromClassRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass);
    return routine.applyRoutine();
  }
  
  public boolean renameDataTypeFromClass(final org.emftext.language.java.classifiers.Class javaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameDataTypeFromClassRoutine routine = new RenameDataTypeFromClassRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass);
    return routine.applyRoutine();
  }
  
  public boolean classMapping(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ClassMappingRoutine routine = new ClassMappingRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass, compilationUnit, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean createDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateDataTypeRoutine routine = new CreateDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass, compilationUnit);
    return routine.applyRoutine();
  }
  
  public boolean createElement(final org.emftext.language.java.classifiers.Class javaClass, final org.emftext.language.java.containers.Package javaPackage, final CompilationUnit compilationUnit) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateElementRoutine routine = new CreateElementRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass, javaPackage, compilationUnit);
    return routine.applyRoutine();
  }
  
  public boolean checkSystemAndComponent(final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.classifiers.Class javaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckSystemAndComponentRoutine routine = new CheckSystemAndComponentRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage, javaClass);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindCompositeDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindCompositeDataTypeRoutine routine = new CreateOrFindCompositeDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass, compilationUnit);
    return routine.applyRoutine();
  }
  
  public boolean createCompositeDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateCompositeDataTypeRoutine routine = new CreateCompositeDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass, compilationUnit);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindCollectionDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindCollectionDataTypeRoutine routine = new CreateOrFindCollectionDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass, compilationUnit);
    return routine.applyRoutine();
  }
  
  public boolean createCollectionDataType(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateCollectionDataTypeRoutine routine = new CreateCollectionDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass, compilationUnit);
    return routine.applyRoutine();
  }
  
  public boolean addDataTypeCorrespondence(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final DataType dataType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddDataTypeCorrespondenceRoutine routine = new AddDataTypeCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClass, compilationUnit, dataType);
    return routine.applyRoutine();
  }
  
  public boolean addDataTypeInRepository(final DataType pcmDataType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddDataTypeInRepositoryRoutine routine = new AddDataTypeInRepositoryRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmDataType);
    return routine.applyRoutine();
  }
  
  public boolean createOperationProvidedRole(final TypeReference typeReference) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOperationProvidedRoleRoutine routine = new CreateOperationProvidedRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, typeReference);
    return routine.applyRoutine();
  }
  
  public boolean createOperationProvidedRoleFromTypeReference(final Classifier classifierInterface, final org.emftext.language.java.classifiers.Class javaClass, final TypeReference reference) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOperationProvidedRoleFromTypeReferenceRoutine routine = new CreateOperationProvidedRoleFromTypeReferenceRoutine(_routinesFacade, _reactionExecutionState, _caller, classifierInterface, javaClass, reference);
    return routine.applyRoutine();
  }
  
  public boolean createJavaSubPackages(final org.emftext.language.java.containers.Package javaPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateJavaSubPackagesRoutine routine = new CreateJavaSubPackagesRoutine(_routinesFacade, _reactionExecutionState, _caller, javaPackage);
    return routine.applyRoutine();
  }
  
  public boolean createJavaPackage(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateJavaPackageRoutine routine = new CreateJavaPackageRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElementMappedToPackage, parentPackage, packageName, newTag);
    return routine.applyRoutine();
  }
}
