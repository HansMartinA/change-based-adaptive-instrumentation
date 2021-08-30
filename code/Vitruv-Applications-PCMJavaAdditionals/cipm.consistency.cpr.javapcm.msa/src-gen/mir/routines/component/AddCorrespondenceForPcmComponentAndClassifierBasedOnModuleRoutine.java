package mir.routines.component;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddCorrespondenceForPcmComponentAndClassifierBasedOnModuleRoutine extends AbstractRepairRoutineRealization {
  private AddCorrespondenceForPcmComponentAndClassifierBasedOnModuleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module, final RepositoryComponent pcmComponent) {
      return pcmComponent;
    }
    
    public EObject getCorrepondenceSourcePcmComponent(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module) {
      return module;
    }
    
    public EObject getElement2(final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module, final RepositoryComponent pcmComponent) {
      return classifier;
    }
  }
  
  public AddCorrespondenceForPcmComponentAndClassifierBasedOnModuleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier classifier, final org.emftext.language.java.containers.Module module) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.component.AddCorrespondenceForPcmComponentAndClassifierBasedOnModuleRoutine.ActionUserExecution(getExecutionState(), this);
    this.classifier = classifier;this.module = module;
  }
  
  private ConcreteClassifier classifier;
  
  private org.emftext.language.java.containers.Module module;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddCorrespondenceForPcmComponentAndClassifierBasedOnModuleRoutine with input:");
    	getLogger().trace("   classifier: " + this.classifier);
    	getLogger().trace("   module: " + this.module);
    }
    
    org.palladiosimulator.pcm.repository.RepositoryComponent pcmComponent = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmComponent(classifier, module), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmComponent == null) {
    	return false;
    }
    addCorrespondenceBetween(userExecution.getElement1(classifier, module, pcmComponent), userExecution.getElement2(classifier, module, pcmComponent), "");
    
    return true;
  }
}
