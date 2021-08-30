package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.CompilationUnit;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddMissingClassifierCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private AddMissingClassifierCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final NamedElement pcmElement, final ConcreteClassifier javaClassifier) {
      return javaClassifier;
    }
    
    public EObject getElement4(final NamedElement pcmElement, final ConcreteClassifier javaClassifier) {
      return pcmElement;
    }
    
    public EObject getElement2(final NamedElement pcmElement, final ConcreteClassifier javaClassifier) {
      return pcmElement;
    }
    
    public EObject getElement3(final NamedElement pcmElement, final ConcreteClassifier javaClassifier) {
      CompilationUnit _containingCompilationUnit = javaClassifier.getContainingCompilationUnit();
      return _containingCompilationUnit;
    }
  }
  
  public AddMissingClassifierCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final NamedElement pcmElement, final ConcreteClassifier javaClassifier) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddMissingClassifierCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.pcmElement = pcmElement;this.javaClassifier = javaClassifier;
  }
  
  private NamedElement pcmElement;
  
  private ConcreteClassifier javaClassifier;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddMissingClassifierCorrespondenceRoutine with input:");
    	getLogger().trace("   pcmElement: " + this.pcmElement);
    	getLogger().trace("   javaClassifier: " + this.javaClassifier);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(pcmElement, javaClassifier), userExecution.getElement2(pcmElement, javaClassifier), "");
    
    addCorrespondenceBetween(userExecution.getElement3(pcmElement, javaClassifier), userExecution.getElement4(pcmElement, javaClassifier), "");
    
    return true;
  }
}
