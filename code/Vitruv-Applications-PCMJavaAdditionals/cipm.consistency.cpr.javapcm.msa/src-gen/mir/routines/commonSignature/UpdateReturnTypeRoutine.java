package mir.routines.commonSignature;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Repository;
import tools.vitruv.applications.pcmjava.util.java2pcm.TypeReferenceCorrespondenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class UpdateReturnTypeRoutine extends AbstractRepairRoutineRealization {
  private UpdateReturnTypeRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public OperationSignature getElement1(final Method javaMethod, final TypeReference typeReference, final OperationSignature operationSignature) {
      return operationSignature;
    }
    
    public void update0Element(final Method javaMethod, final TypeReference typeReference, final OperationSignature operationSignature) {
      final Repository repository = operationSignature.getInterface__OperationSignature().getRepository__Interface();
      operationSignature.setReturnType__OperationSignature(TypeReferenceCorrespondenceHelper.getCorrespondingPCMDataTypeForTypeReference(typeReference, this.executionState.getCorrespondenceModel(), this.executionState.getUserInteractor(), repository, javaMethod.getTypeReference().getArrayDimension()));
    }
    
    public EObject getCorrepondenceSourceOperationSignature(final Method javaMethod, final TypeReference typeReference) {
      return javaMethod;
    }
  }
  
  public UpdateReturnTypeRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Method javaMethod, final TypeReference typeReference) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.UpdateReturnTypeRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaMethod = javaMethod;this.typeReference = typeReference;
  }
  
  private Method javaMethod;
  
  private TypeReference typeReference;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine UpdateReturnTypeRoutine with input:");
    	getLogger().trace("   javaMethod: " + this.javaMethod);
    	getLogger().trace("   typeReference: " + this.typeReference);
    }
    
    org.palladiosimulator.pcm.repository.OperationSignature operationSignature = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOperationSignature(javaMethod, typeReference), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationSignature.class,
    	(org.palladiosimulator.pcm.repository.OperationSignature _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (operationSignature == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(javaMethod, typeReference, operationSignature);
    userExecution.update0Element(javaMethod, typeReference, operationSignature);
    
    return true;
  }
}
