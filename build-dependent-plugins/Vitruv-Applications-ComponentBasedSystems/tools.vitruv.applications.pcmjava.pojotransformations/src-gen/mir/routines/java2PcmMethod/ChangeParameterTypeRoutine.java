package mir.routines.java2PcmMethod;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Parameter;
import tools.vitruv.applications.pcmjava.util.java2pcm.TypeReferenceCorrespondenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class ChangeParameterTypeRoutine extends AbstractRepairRoutineRealization {
  private ChangeParameterTypeRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public Parameter getElement1(final TypeReference newType, final org.emftext.language.java.parameters.Parameter javaParameter, final Parameter pcmParameter) {
      return pcmParameter;
    }
    
    public void update0Element(final TypeReference newType, final org.emftext.language.java.parameters.Parameter javaParameter, final Parameter pcmParameter) {
      DataType _xifexpression = null;
      TypeReference _typeReference = javaParameter.getTypeReference();
      boolean _tripleNotEquals = (_typeReference != null);
      if (_tripleNotEquals) {
        _xifexpression = TypeReferenceCorrespondenceHelper.getDataTypeFromTypeReference(javaParameter.getTypeReference(), this.executionState.getCorrespondenceModel(), this.executionState.getUserInteractor(), null);
      } else {
        _xifexpression = null;
      }
      pcmParameter.setDataType__Parameter(_xifexpression);
    }
    
    public EObject getCorrepondenceSourcePcmParameter(final TypeReference newType, final org.emftext.language.java.parameters.Parameter javaParameter) {
      return javaParameter;
    }
  }
  
  public ChangeParameterTypeRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final TypeReference newType, final org.emftext.language.java.parameters.Parameter javaParameter) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmMethod.ChangeParameterTypeRoutine.ActionUserExecution(getExecutionState(), this);
    this.newType = newType;this.javaParameter = javaParameter;
  }
  
  private TypeReference newType;
  
  private org.emftext.language.java.parameters.Parameter javaParameter;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine ChangeParameterTypeRoutine with input:");
    	getLogger().trace("   newType: " + this.newType);
    	getLogger().trace("   javaParameter: " + this.javaParameter);
    }
    
    org.palladiosimulator.pcm.repository.Parameter pcmParameter = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmParameter(newType, javaParameter), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Parameter.class,
    	(org.palladiosimulator.pcm.repository.Parameter _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmParameter == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(newType, javaParameter, pcmParameter);
    userExecution.update0Element(newType, javaParameter, pcmParameter);
    
    return true;
  }
}
