package mir.routines.commonInterface;

import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.Interface;
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
  
  public boolean createInterface(final ConcreteClassifier javaInterface) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    CreateInterfaceRoutine routine = new CreateInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, javaInterface);
    return routine.applyRoutine();
  }
  
  public boolean addCorrespondenceBetweenClassifierAndInterface(final ConcreteClassifier javaClassifier, final Interface pcmInterface) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    AddCorrespondenceBetweenClassifierAndInterfaceRoutine routine = new AddCorrespondenceBetweenClassifierAndInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, javaClassifier, pcmInterface);
    return routine.applyRoutine();
  }
  
  public boolean removeInterface(final Classifier classifier) {
    RoutinesFacade _routinesFacade = this;
    ReactionExecutionState _reactionExecutionState = this._getExecutionState().getReactionExecutionState();
    CallHierarchyHaving _caller = this._getExecutionState().getCaller();
    RemoveInterfaceRoutine routine = new RemoveInterfaceRoutine(_routinesFacade, _reactionExecutionState, _caller, classifier);
    return routine.applyRoutine();
  }
}
