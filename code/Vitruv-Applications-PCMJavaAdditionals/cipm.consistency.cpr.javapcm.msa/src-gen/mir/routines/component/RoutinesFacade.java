package mir.routines.component;

import org.emftext.language.java.classifiers.ConcreteClassifier;
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
  
  public boolean createOrFindArchitecturalElement(final ConcreteClassifier classifier) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindArchitecturalElementRoutine routine = new CreateOrFindArchitecturalElementRoutine(_routinesFacade, _reactionExecutionState, _caller, classifier);
    return routine.applyRoutine();
  }
  
  public boolean createOrFindArchitecturalElementBasedOnModule(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateOrFindArchitecturalElementBasedOnModuleRoutine routine = new CreateOrFindArchitecturalElementBasedOnModuleRoutine(_routinesFacade, _reactionExecutionState, _caller, classifier, module);
    return routine.applyRoutine();
  }
  
  public boolean createBasicComponent(final org.emftext.language.java.containers.Module module) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateBasicComponentRoutine routine = new CreateBasicComponentRoutine(_routinesFacade, _reactionExecutionState, _caller, module);
    return routine.applyRoutine();
  }
  
  public boolean addCorrespondenceForPcmComponentAndClassifierBasedOnModule(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddCorrespondenceForPcmComponentAndClassifierBasedOnModuleRoutine routine = new AddCorrespondenceForPcmComponentAndClassifierBasedOnModuleRoutine(_routinesFacade, _reactionExecutionState, _caller, classifier, module);
    return routine.applyRoutine();
  }
  
  public boolean checkBasicComponentRemovalForClassifier(final ConcreteClassifier clazz) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckBasicComponentRemovalForClassifierRoutine routine = new CheckBasicComponentRemovalForClassifierRoutine(_routinesFacade, _reactionExecutionState, _caller, clazz);
    return routine.applyRoutine();
  }
  
  public boolean checkBasicComponentRemovalForModule(final org.emftext.language.java.containers.Module mod) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CheckBasicComponentRemovalForModuleRoutine routine = new CheckBasicComponentRemovalForModuleRoutine(_routinesFacade, _reactionExecutionState, _caller, mod);
    return routine.applyRoutine();
  }
  
  public boolean removeComponent(final RepositoryComponent com) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveComponentRoutine routine = new RemoveComponentRoutine(_routinesFacade, _reactionExecutionState, _caller, com);
    return routine.applyRoutine();
  }
}
