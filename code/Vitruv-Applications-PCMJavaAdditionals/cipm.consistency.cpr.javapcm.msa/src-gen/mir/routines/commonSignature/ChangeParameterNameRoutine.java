package mir.routines.commonSignature;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.pcm.repository.ParameterUtil;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Parameter;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class ChangeParameterNameRoutine extends AbstractRepairRoutineRealization {
  private ChangeParameterNameRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public Parameter getElement1(final String newName, final org.emftext.language.java.parameters.Parameter javaParameter, final Parameter pcmParameter) {
      return pcmParameter;
    }
    
    public void update0Element(final String newName, final org.emftext.language.java.parameters.Parameter javaParameter, final Parameter pcmParameter) {
      ParameterUtil.setName(pcmParameter, newName);
    }
    
    public EObject getCorrepondenceSourcePcmParameter(final String newName, final org.emftext.language.java.parameters.Parameter javaParameter) {
      return javaParameter;
    }
  }
  
  public ChangeParameterNameRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final String newName, final org.emftext.language.java.parameters.Parameter javaParameter) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.ChangeParameterNameRoutine.ActionUserExecution(getExecutionState(), this);
    this.newName = newName;this.javaParameter = javaParameter;
  }
  
  private String newName;
  
  private org.emftext.language.java.parameters.Parameter javaParameter;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine ChangeParameterNameRoutine with input:");
    	getLogger().trace("   newName: " + this.newName);
    	getLogger().trace("   javaParameter: " + this.javaParameter);
    }
    
    org.palladiosimulator.pcm.repository.Parameter pcmParameter = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmParameter(newName, javaParameter), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Parameter.class,
    	(org.palladiosimulator.pcm.repository.Parameter _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmParameter == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(newName, javaParameter, pcmParameter);
    userExecution.update0Element(newName, javaParameter, pcmParameter);
    
    return true;
  }
}
