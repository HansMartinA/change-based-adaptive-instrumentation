package mir.routines.commonSignature;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.palladiosimulator.pcm.repository.Parameter;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class DeleteParameterRoutine extends AbstractRepairRoutineRealization {
  private DeleteParameterRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final OrdinaryParameter javaParameter, final Parameter pcmParameter) {
      return javaParameter;
    }
    
    public EObject getElement2(final OrdinaryParameter javaParameter, final Parameter pcmParameter) {
      return pcmParameter;
    }
    
    public EObject getElement3(final OrdinaryParameter javaParameter, final Parameter pcmParameter) {
      return pcmParameter;
    }
    
    public EObject getCorrepondenceSourcePcmParameter(final OrdinaryParameter javaParameter) {
      return javaParameter;
    }
  }
  
  public DeleteParameterRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OrdinaryParameter javaParameter) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.DeleteParameterRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaParameter = javaParameter;
  }
  
  private OrdinaryParameter javaParameter;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine DeleteParameterRoutine with input:");
    	getLogger().trace("   javaParameter: " + this.javaParameter);
    }
    
    org.palladiosimulator.pcm.repository.Parameter pcmParameter = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmParameter(javaParameter), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Parameter.class,
    	(org.palladiosimulator.pcm.repository.Parameter _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmParameter == null) {
    	return false;
    }
    removeCorrespondenceBetween(userExecution.getElement1(javaParameter, pcmParameter), userExecution.getElement2(javaParameter, pcmParameter), "");
    
    Stream.of(new Object[] {javaParameter, pcmParameter})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement3(javaParameter, pcmParameter), accessibleElement, null));		
    deleteObject(userExecution.getElement3(javaParameter, pcmParameter));
    
    return true;
  }
}
