package mir.routines.pcm2javaCommon;

import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.instantiations.NewConstructorCall;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.InterfaceMethod;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ComposedStructure;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RequiredRole;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import org.palladiosimulator.pcm.seff.ServiceEffectSpecification;
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
  
  public boolean addRepositoryCorrespondence(final Repository pcmRepository) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddRepositoryCorrespondenceRoutine routine = new AddRepositoryCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmRepository);
    return routine.applyRoutine();
  }
  
  public boolean createRepositoryPackages(final Repository repository) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateRepositoryPackagesRoutine routine = new CreateRepositoryPackagesRoutine(_routinesFacade, _reactionExecutionState, _caller, repository);
    return routine.applyRoutine();
  }
  
  public boolean createRepositorySubPackages(final Repository repository) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateRepositorySubPackagesRoutine routine = new CreateRepositorySubPackagesRoutine(_routinesFacade, _reactionExecutionState, _caller, repository);
    return routine.applyRoutine();
  }
  
  public boolean renamePackageForRepository(final Repository repository) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenamePackageForRepositoryRoutine routine = new RenamePackageForRepositoryRoutine(_routinesFacade, _reactionExecutionState, _caller, repository);
    return routine.applyRoutine();
  }
  
  public boolean addSystemCorrespondence(final org.palladiosimulator.pcm.system.System pcmSystem) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddSystemCorrespondenceRoutine routine = new AddSystemCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmSystem);
    return routine.applyRoutine();
  }
  
  public boolean createImplementationForSystem(final org.palladiosimulator.pcm.system.System system) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateImplementationForSystemRoutine routine = new CreateImplementationForSystemRoutine(_routinesFacade, _reactionExecutionState, _caller, system);
    return routine.applyRoutine();
  }
  
  public boolean changeSystemImplementationName(final org.palladiosimulator.pcm.system.System system) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeSystemImplementationNameRoutine routine = new ChangeSystemImplementationNameRoutine(_routinesFacade, _reactionExecutionState, _caller, system);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindAssemblyContextField(final AssemblyContext assemblyContext, final ComposedStructure composedStructure) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindAssemblyContextFieldRoutine routine = new CreateOrFindAssemblyContextFieldRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, composedStructure);
    return routine.applyRoutine();
  }
  
  public boolean createAssemblyContextField(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateAssemblyContextFieldRoutine routine = new CreateAssemblyContextFieldRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass);
    return routine.applyRoutine();
  }
  
  public boolean addAssemblyContextFieldCorrespondence(final AssemblyContext assemblyContext, final Field javaField) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddAssemblyContextFieldCorrespondenceRoutine routine = new AddAssemblyContextFieldCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, javaField);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindAssemblyContextConstructor(final AssemblyContext assemblyContext, final ComposedStructure composedStructure) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindAssemblyContextConstructorRoutine routine = new CreateOrFindAssemblyContextConstructorRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, composedStructure);
    return routine.applyRoutine();
  }
  
  public boolean createAssemblyContextConstructor(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateAssemblyContextConstructorRoutine routine = new CreateAssemblyContextConstructorRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, compositeComponentJavaClass);
    return routine.applyRoutine();
  }
  
  public boolean createAssemblyContextStatement(final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateAssemblyContextStatementRoutine routine = new CreateAssemblyContextStatementRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, constructor, compositeComponentJavaClass);
    return routine.applyRoutine();
  }
  
  public boolean addAssemblyContextConstructorCorrespondence(final AssemblyContext assemblyContext, final Constructor constructor, final NewConstructorCall constructorCall) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddAssemblyContextConstructorCorrespondenceRoutine routine = new AddAssemblyContextConstructorCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, constructor, constructorCall);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindAssemblyContextImport(final AssemblyContext assemblyContext, final ComposedStructure composedStructure) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindAssemblyContextImportRoutine routine = new CreateOrFindAssemblyContextImportRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, composedStructure);
    return routine.applyRoutine();
  }
  
  public boolean createAssemblyContextImport(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateAssemblyContextImportRoutine routine = new CreateAssemblyContextImportRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass);
    return routine.applyRoutine();
  }
  
  public boolean addAssemblyContextImportCorrespondence(final AssemblyContext assemblyContext, final ClassifierImport contextClassImport) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddAssemblyContextImportCorrespondenceRoutine routine = new AddAssemblyContextImportCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, assemblyContext, contextClassImport);
    return routine.applyRoutine();
  }
  
  public boolean createComponentImplementation(final RepositoryComponent component) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateComponentImplementationRoutine routine = new CreateComponentImplementationRoutine(_routinesFacade, _reactionExecutionState, _caller, component);
    return routine.applyRoutine();
  }
  
  public boolean createImplementationForComponent(final RepositoryComponent component) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateImplementationForComponentRoutine routine = new CreateImplementationForComponentRoutine(_routinesFacade, _reactionExecutionState, _caller, component);
    return routine.applyRoutine();
  }
  
  public boolean renameComponentPackageAndClass(final RepositoryComponent component) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameComponentPackageAndClassRoutine routine = new RenameComponentPackageAndClassRoutine(_routinesFacade, _reactionExecutionState, _caller, component);
    return routine.applyRoutine();
  }
  
  public boolean renameComponentClass(final RepositoryComponent component) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameComponentClassRoutine routine = new RenameComponentClassRoutine(_routinesFacade, _reactionExecutionState, _caller, component);
    return routine.applyRoutine();
  }
  
  public boolean renameInterface(final OperationInterface interf) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameInterfaceRoutine routine = new RenameInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, interf);
    return routine.applyRoutine();
  }
  
  public boolean createCompositeDataTypeImplementation(final CompositeDataType compositeDataType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateCompositeDataTypeImplementationRoutine routine = new CreateCompositeDataTypeImplementationRoutine(_routinesFacade, _reactionExecutionState, _caller, compositeDataType);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindDataTypeClass(final NamedElement dataType, final org.emftext.language.java.containers.Package datatypesPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindDataTypeClassRoutine routine = new CreateOrFindDataTypeClassRoutine(_routinesFacade, _reactionExecutionState, _caller, dataType, datatypesPackage);
    return routine.applyRoutine();
  }
  
  public boolean renameCompositeDataType(final CompositeDataType compositeDataType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameCompositeDataTypeRoutine routine = new RenameCompositeDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, compositeDataType);
    return routine.applyRoutine();
  }
  
  public boolean createCollectionDataTypeImplementation(final CollectionDataType dataType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateCollectionDataTypeImplementationRoutine routine = new CreateCollectionDataTypeImplementationRoutine(_routinesFacade, _reactionExecutionState, _caller, dataType);
    return routine.applyRoutine();
  }
  
  public boolean addSuperTypeToDataType(final DataType dataType, final TypeReference innerTypeReference, final String superTypeQualifiedName) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddSuperTypeToDataTypeRoutine routine = new AddSuperTypeToDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, dataType, innerTypeReference, superTypeQualifiedName);
    return routine.applyRoutine();
  }
  
  public boolean renameCollectionDataType(final CollectionDataType collectionDataType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameCollectionDataTypeRoutine routine = new RenameCollectionDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, collectionDataType);
    return routine.applyRoutine();
  }
  
  public boolean createInnerDeclarationImplementation(final InnerDeclaration innerDeclaration) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateInnerDeclarationImplementationRoutine routine = new CreateInnerDeclarationImplementationRoutine(_routinesFacade, _reactionExecutionState, _caller, innerDeclaration);
    return routine.applyRoutine();
  }
  
  public boolean addInnerDeclarationToCompositeDataType(final CompositeDataType dataType, final InnerDeclaration innerDeclaration, final TypeReference dataTypeReference) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddInnerDeclarationToCompositeDataTypeRoutine routine = new AddInnerDeclarationToCompositeDataTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, dataType, innerDeclaration, dataTypeReference);
    return routine.applyRoutine();
  }
  
  public boolean renameInnerDeclarationImplementation(final InnerDeclaration innerDeclaration) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameInnerDeclarationImplementationRoutine routine = new RenameInnerDeclarationImplementationRoutine(_routinesFacade, _reactionExecutionState, _caller, innerDeclaration);
    return routine.applyRoutine();
  }
  
  public boolean changeTypeOfInnerDeclarationImplementation(final InnerDeclaration innerDeclaration) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeTypeOfInnerDeclarationImplementationRoutine routine = new ChangeTypeOfInnerDeclarationImplementationRoutine(_routinesFacade, _reactionExecutionState, _caller, innerDeclaration);
    return routine.applyRoutine();
  }
  
  public boolean changeInnerDeclarationType(final InnerDeclaration innerDeclaration, final TypeReference newTypeReference) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeInnerDeclarationTypeRoutine routine = new ChangeInnerDeclarationTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, innerDeclaration, newTypeReference);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindJavaPackage(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindJavaPackageRoutine routine = new CreateOrFindJavaPackageRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElementMappedToPackage, parentPackage, packageName, newTag);
    return routine.applyRoutine();
  }
  
  public boolean addPackageCorrespondence(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddPackageCorrespondenceRoutine routine = new AddPackageCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElementMappedToPackage, javaPackage, newTag);
    return routine.applyRoutine();
  }
  
  public boolean createJavaPackage(final EObject sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String newTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateJavaPackageRoutine routine = new CreateJavaPackageRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElementMappedToPackage, parentPackage, packageName, newTag);
    return routine.applyRoutine();
  }
  
  public boolean renameJavaPackage(final NamedElement sourceElementMappedToPackage, final org.emftext.language.java.containers.Package parentPackage, final String packageName, final String expectedTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameJavaPackageRoutine routine = new RenameJavaPackageRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElementMappedToPackage, parentPackage, packageName, expectedTag);
    return routine.applyRoutine();
  }
  
  public boolean deleteJavaPackage(final NamedElement sourceElementMappedToPackage, final String expectedTag) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    DeleteJavaPackageRoutine routine = new DeleteJavaPackageRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElementMappedToPackage, expectedTag);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindJavaClass(final NamedElement pcmElement, final org.emftext.language.java.containers.Package containingPackage, final String className) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindJavaClassRoutine routine = new CreateOrFindJavaClassRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmElement, containingPackage, className);
    return routine.applyRoutine();
  }
  
  public boolean createJavaClass(final NamedElement sourceElementMappedToClass, final org.emftext.language.java.containers.Package containingPackage, final String className) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateJavaClassRoutine routine = new CreateJavaClassRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElementMappedToClass, containingPackage, className);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindJavaInterface(final Interface pcmInterface) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindJavaInterfaceRoutine routine = new CreateOrFindJavaInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmInterface);
    return routine.applyRoutine();
  }
  
  public boolean createJavaInterface(final Interface pcmInterface, final org.emftext.language.java.containers.Package containingPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateJavaInterfaceRoutine routine = new CreateJavaInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmInterface, containingPackage);
    return routine.applyRoutine();
  }
  
  public boolean addMissingClassifierCorrespondence(final NamedElement pcmElement, final ConcreteClassifier javaClassifier) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddMissingClassifierCorrespondenceRoutine routine = new AddMissingClassifierCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, pcmElement, javaClassifier);
    return routine.applyRoutine();
  }
  
  public boolean createCompilationUnit(final NamedElement sourceElementMappedToClass, final ConcreteClassifier classifier, final org.emftext.language.java.containers.Package containingPackage) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateCompilationUnitRoutine routine = new CreateCompilationUnitRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElementMappedToClass, classifier, containingPackage);
    return routine.applyRoutine();
  }
  
  public boolean renameJavaClassifier(final NamedElement classSourceElement, final org.emftext.language.java.containers.Package containingPackage, final String className) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameJavaClassifierRoutine routine = new RenameJavaClassifierRoutine(_routinesFacade, _reactionExecutionState, _caller, classSourceElement, containingPackage, className);
    return routine.applyRoutine();
  }
  
  public boolean deleteJavaClassifier(final NamedElement sourceElement) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    DeleteJavaClassifierRoutine routine = new DeleteJavaClassifierRoutine(_routinesFacade, _reactionExecutionState, _caller, sourceElement);
    return routine.applyRoutine();
  }
  
  public boolean findOrAddProvidedRole(final OperationProvidedRole providedRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    FindOrAddProvidedRoleRoutine routine = new FindOrAddProvidedRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, providedRole);
    return routine.applyRoutine();
  }
  
  public boolean addProvidedRoleCorrespondence(final OperationProvidedRole providedRole, final TypeReference reference) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddProvidedRoleCorrespondenceRoutine routine = new AddProvidedRoleCorrespondenceRoutine(_routinesFacade, _reactionExecutionState, _caller, providedRole, reference);
    return routine.applyRoutine();
  }
  
  public boolean addProvidedRole(final OperationProvidedRole providedRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddProvidedRoleRoutine routine = new AddProvidedRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, providedRole);
    return routine.applyRoutine();
  }
  
  public boolean removeProvidedRole(final ProvidedRole providedRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveProvidedRoleRoutine routine = new RemoveProvidedRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, providedRole);
    return routine.applyRoutine();
  }
  
  public boolean addRequiredRole(final OperationRequiredRole requiredRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddRequiredRoleRoutine routine = new AddRequiredRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, requiredRole);
    return routine.applyRoutine();
  }
  
  public boolean addParameterAndAssignmentToConstructor(final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddParameterAndAssignmentToConstructorRoutine routine = new AddParameterAndAssignmentToConstructorRoutine(_routinesFacade, _reactionExecutionState, _caller, parameterCorrespondenceSource, constructor, typeReference, fieldToBeAssigned, parameterName);
    return routine.applyRoutine();
  }
  
  public boolean removeRequiredRole(final RequiredRole requiredRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveRequiredRoleRoutine routine = new RemoveRequiredRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, requiredRole);
    return routine.applyRoutine();
  }
  
  public boolean removeParameterToFieldAssignmentFromConstructor(final Constructor ctor, final String fieldName) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveParameterToFieldAssignmentFromConstructorRoutine routine = new RemoveParameterToFieldAssignmentFromConstructorRoutine(_routinesFacade, _reactionExecutionState, _caller, ctor, fieldName);
    return routine.applyRoutine();
  }
  
  public boolean removeCorrespondingParameterFromConstructor(final Constructor ctor, final NamedElement correspondenceSource) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveCorrespondingParameterFromConstructorRoutine routine = new RemoveCorrespondingParameterFromConstructorRoutine(_routinesFacade, _reactionExecutionState, _caller, ctor, correspondenceSource);
    return routine.applyRoutine();
  }
  
  public boolean reinitializeOperationRequiredRole(final OperationRequiredRole requiredRole) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ReinitializeOperationRequiredRoleRoutine routine = new ReinitializeOperationRequiredRoleRoutine(_routinesFacade, _reactionExecutionState, _caller, requiredRole);
    return routine.applyRoutine();
  }
  
  public boolean createMethodForOperationSignature(final OperationSignature operationSignature) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateMethodForOperationSignatureRoutine routine = new CreateMethodForOperationSignatureRoutine(_routinesFacade, _reactionExecutionState, _caller, operationSignature);
    return routine.applyRoutine();
  }
  
  public boolean renameMethodForOperationSignature(final OperationSignature operationSignature) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameMethodForOperationSignatureRoutine routine = new RenameMethodForOperationSignatureRoutine(_routinesFacade, _reactionExecutionState, _caller, operationSignature);
    return routine.applyRoutine();
  }
  
  public boolean changeReturnTypeOfMethodForOperationSignature(final OperationSignature operationSignature) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeReturnTypeOfMethodForOperationSignatureRoutine routine = new ChangeReturnTypeOfMethodForOperationSignatureRoutine(_routinesFacade, _reactionExecutionState, _caller, operationSignature);
    return routine.applyRoutine();
  }
  
  public boolean changeInterfaceMethodReturnType(final InterfaceMethod interfaceMethod, final DataType returnType) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeInterfaceMethodReturnTypeRoutine routine = new ChangeInterfaceMethodReturnTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, interfaceMethod, returnType);
    return routine.applyRoutine();
  }
  
  public boolean deleteMethodForOperationSignature(final OperationSignature operationSignature) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    DeleteMethodForOperationSignatureRoutine routine = new DeleteMethodForOperationSignatureRoutine(_routinesFacade, _reactionExecutionState, _caller, operationSignature);
    return routine.applyRoutine();
  }
  
  public boolean createParameter(final Parameter parameter) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateParameterRoutine routine = new CreateParameterRoutine(_routinesFacade, _reactionExecutionState, _caller, parameter);
    return routine.applyRoutine();
  }
  
  public boolean renameParameter(final Parameter parameter) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RenameParameterRoutine routine = new RenameParameterRoutine(_routinesFacade, _reactionExecutionState, _caller, parameter);
    return routine.applyRoutine();
  }
  
  public boolean changeParameterType(final Parameter parameter) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeParameterTypeRoutine routine = new ChangeParameterTypeRoutine(_routinesFacade, _reactionExecutionState, _caller, parameter);
    return routine.applyRoutine();
  }
  
  public boolean deleteParameter(final OperationSignature signature, final Parameter parameter) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    DeleteParameterRoutine routine = new DeleteParameterRoutine(_routinesFacade, _reactionExecutionState, _caller, signature, parameter);
    return routine.applyRoutine();
  }
  
  public boolean createSEFF(final ServiceEffectSpecification seff) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateSEFFRoutine routine = new CreateSEFFRoutine(_routinesFacade, _reactionExecutionState, _caller, seff);
    return routine.applyRoutine();
  }
  
  public boolean changeMethodForSeff(final ResourceDemandingSEFF seff) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    ChangeMethodForSeffRoutine routine = new ChangeMethodForSeffRoutine(_routinesFacade, _reactionExecutionState, _caller, seff);
    return routine.applyRoutine();
  }
  
  public boolean updateSEFFImplementingMethodName(final ServiceEffectSpecification seff) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    UpdateSEFFImplementingMethodNameRoutine routine = new UpdateSEFFImplementingMethodNameRoutine(_routinesFacade, _reactionExecutionState, _caller, seff);
    return routine.applyRoutine();
  }
  
  public boolean deleteMethodForSeff(final ServiceEffectSpecification seff) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    DeleteMethodForSeffRoutine routine = new DeleteMethodForSeffRoutine(_routinesFacade, _reactionExecutionState, _caller, seff);
    return routine.applyRoutine();
  }
}
