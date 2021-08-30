package mir.routines.component;

import java.io.IOException;
import java.util.Optional;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindArchitecturalElementBasedOnModuleRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindArchitecturalElementBasedOnModuleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourcePcmComponent(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module) {
      return module;
    }
    
    public void callRoutine1(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module, final Optional<RepositoryComponent> pcmComponent, @Extension final RoutinesFacade _routinesFacade) {
      boolean _isPresent = pcmComponent.isPresent();
      boolean _not = (!_isPresent);
      if (_not) {
        _routinesFacade.createBasicComponent(module);
      }
      _routinesFacade.addCorrespondenceForPcmComponentAndClassifierBasedOnModule(classifier, module);
    }
  }
  
  public CreateOrFindArchitecturalElementBasedOnModuleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.component.CreateOrFindArchitecturalElementBasedOnModuleRoutine.ActionUserExecution(getExecutionState(), this);
    this.classifier = classifier;this.module = module;
  }
  
  private ConcreteClassifier classifier;
  
  private org.emftext.language.java.containers.Module module;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindArchitecturalElementBasedOnModuleRoutine with input:");
    	getLogger().trace("   classifier: " + this.classifier);
    	getLogger().trace("   module: " + this.module);
    }
    
    Optional<org.palladiosimulator.pcm.repository.RepositoryComponent> pcmComponent = Optional.ofNullable(getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmComponent(classifier, module), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	)
    );
    userExecution.callRoutine1(classifier, module, pcmComponent, this.getRoutinesFacade());
    
    return true;
  }
}
