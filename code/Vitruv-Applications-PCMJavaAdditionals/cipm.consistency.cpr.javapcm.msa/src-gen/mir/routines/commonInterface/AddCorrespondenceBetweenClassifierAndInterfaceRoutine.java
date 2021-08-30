package mir.routines.commonInterface;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.Interface;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddCorrespondenceBetweenClassifierAndInterfaceRoutine extends AbstractRepairRoutineRealization {
  private AddCorrespondenceBetweenClassifierAndInterfaceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final ConcreteClassifier javaClassifier, final Interface pcmInterface) {
      return javaClassifier;
    }
    
    public EObject getElement2(final ConcreteClassifier javaClassifier, final Interface pcmInterface) {
      return pcmInterface;
    }
  }
  
  public AddCorrespondenceBetweenClassifierAndInterfaceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier javaClassifier, final Interface pcmInterface) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonInterface.AddCorrespondenceBetweenClassifierAndInterfaceRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaClassifier = javaClassifier;this.pcmInterface = pcmInterface;
  }
  
  private ConcreteClassifier javaClassifier;
  
  private Interface pcmInterface;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddCorrespondenceBetweenClassifierAndInterfaceRoutine with input:");
    	getLogger().trace("   javaClassifier: " + this.javaClassifier);
    	getLogger().trace("   pcmInterface: " + this.pcmInterface);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(javaClassifier, pcmInterface), userExecution.getElement2(javaClassifier, pcmInterface), "");
    
    return true;
  }
}
