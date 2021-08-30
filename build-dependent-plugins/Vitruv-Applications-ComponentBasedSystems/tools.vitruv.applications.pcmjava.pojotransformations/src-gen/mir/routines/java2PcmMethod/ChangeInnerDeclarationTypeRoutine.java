package mir.routines.java2PcmMethod;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import tools.vitruv.applications.pcmjava.util.java2pcm.TypeReferenceCorrespondenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class ChangeInnerDeclarationTypeRoutine extends AbstractRepairRoutineRealization {
  private ChangeInnerDeclarationTypeRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceInnerDeclaration(final TypeReference typeReference, final Field javaField) {
      return javaField;
    }
    
    public InnerDeclaration getElement1(final TypeReference typeReference, final Field javaField, final InnerDeclaration innerDeclaration) {
      return innerDeclaration;
    }
    
    public void update0Element(final TypeReference typeReference, final Field javaField, final InnerDeclaration innerDeclaration) {
      DataType _xifexpression = null;
      if ((typeReference != null)) {
        _xifexpression = TypeReferenceCorrespondenceHelper.getDataTypeFromTypeReference(typeReference, this.executionState.getCorrespondenceModel(), this.executionState.getUserInteractor(), null);
      } else {
        _xifexpression = null;
      }
      innerDeclaration.setDatatype_InnerDeclaration(_xifexpression);
    }
  }
  
  public ChangeInnerDeclarationTypeRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final TypeReference typeReference, final Field javaField) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmMethod.ChangeInnerDeclarationTypeRoutine.ActionUserExecution(getExecutionState(), this);
    this.typeReference = typeReference;this.javaField = javaField;
  }
  
  private TypeReference typeReference;
  
  private Field javaField;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine ChangeInnerDeclarationTypeRoutine with input:");
    	getLogger().trace("   typeReference: " + this.typeReference);
    	getLogger().trace("   javaField: " + this.javaField);
    }
    
    org.palladiosimulator.pcm.repository.InnerDeclaration innerDeclaration = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceInnerDeclaration(typeReference, javaField), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.InnerDeclaration.class,
    	(org.palladiosimulator.pcm.repository.InnerDeclaration _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (innerDeclaration == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(typeReference, javaField, innerDeclaration);
    userExecution.update0Element(typeReference, javaField, innerDeclaration);
    
    return true;
  }
}
