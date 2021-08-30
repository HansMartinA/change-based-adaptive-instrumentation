package mir.routines.component;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckBasicComponentRemovalForClassifierRoutine extends AbstractRepairRoutineRealization {
  private CheckBasicComponentRemovalForClassifierRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceOtherClassifiers(final ConcreteClassifier clazz, final RepositoryComponent pcmComponent) {
      return pcmComponent;
    }
    
    public EObject getElement1(final ConcreteClassifier clazz, final RepositoryComponent pcmComponent, final List<ConcreteClassifier> otherClassifiers) {
      return clazz;
    }
    
    public EObject getCorrepondenceSourcePcmComponent(final ConcreteClassifier clazz) {
      return clazz;
    }
    
    public EObject getElement2(final ConcreteClassifier clazz, final RepositoryComponent pcmComponent, final List<ConcreteClassifier> otherClassifiers) {
      return pcmComponent;
    }
    
    public void callRoutine1(final ConcreteClassifier clazz, final RepositoryComponent pcmComponent, final List<ConcreteClassifier> otherClassifiers, @Extension final RoutinesFacade _routinesFacade) {
      int _size = otherClassifiers.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        _routinesFacade.removeComponent(pcmComponent);
      }
    }
  }
  
  public CheckBasicComponentRemovalForClassifierRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier clazz) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.component.CheckBasicComponentRemovalForClassifierRoutine.ActionUserExecution(getExecutionState(), this);
    this.clazz = clazz;
  }
  
  private ConcreteClassifier clazz;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckBasicComponentRemovalForClassifierRoutine with input:");
    	getLogger().trace("   clazz: " + this.clazz);
    }
    
    org.palladiosimulator.pcm.repository.RepositoryComponent pcmComponent = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmComponent(clazz), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmComponent == null) {
    	return false;
    }
    List<org.emftext.language.java.classifiers.ConcreteClassifier> otherClassifiers = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceOtherClassifiers(clazz, pcmComponent), // correspondence source supplier
    	org.emftext.language.java.classifiers.ConcreteClassifier.class,
    	(org.emftext.language.java.classifiers.ConcreteClassifier _element) -> true, // correspondence precondition checker
    	null
    );
    removeCorrespondenceBetween(userExecution.getElement1(clazz, pcmComponent, otherClassifiers), userExecution.getElement2(clazz, pcmComponent, otherClassifiers), "");
    
    userExecution.callRoutine1(clazz, pcmComponent, otherClassifiers, this.getRoutinesFacade());
    
    return true;
  }
}
