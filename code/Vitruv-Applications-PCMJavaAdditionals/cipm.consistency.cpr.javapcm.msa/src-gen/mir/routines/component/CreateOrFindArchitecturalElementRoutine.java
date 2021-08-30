package mir.routines.component;

import cipm.consistency.cpr.javapcm.internal.InternalUtility;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindArchitecturalElementRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindArchitecturalElementRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final ConcreteClassifier classifier) {
      return classifier;
    }
    
    public void callRoutine1(final ConcreteClassifier classifier, @Extension final RoutinesFacade _routinesFacade) {
      final org.emftext.language.java.containers.Module module = InternalUtility.getModule(classifier);
      if ((module == null)) {
        return;
      }
      _routinesFacade.createOrFindArchitecturalElementBasedOnModule(classifier, module);
    }
  }
  
  public CreateOrFindArchitecturalElementRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier classifier) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.component.CreateOrFindArchitecturalElementRoutine.ActionUserExecution(getExecutionState(), this);
    this.classifier = classifier;
  }
  
  private ConcreteClassifier classifier;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindArchitecturalElementRoutine with input:");
    	getLogger().trace("   classifier: " + this.classifier);
    }
    
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(classifier), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(classifier, this.getRoutinesFacade());
    
    return true;
  }
}
