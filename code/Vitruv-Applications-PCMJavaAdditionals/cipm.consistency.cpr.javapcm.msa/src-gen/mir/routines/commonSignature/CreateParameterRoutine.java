package mir.routines.commonSignature;

import edu.kit.ipd.sdq.commons.util.org.palladiosimulator.pcm.repository.ParameterUtil;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parametrizable;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import tools.vitruv.applications.pcmjava.util.java2pcm.TypeReferenceCorrespondenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateParameterRoutine extends AbstractRepairRoutineRealization {
  private CreateParameterRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final OrdinaryParameter javaParameter, final Parametrizable javaMethod, final OperationSignature operationSignature, final Parameter pcmParameter) {
      return javaParameter;
    }
    
    public void update0Element(final OrdinaryParameter javaParameter, final Parametrizable javaMethod, final OperationSignature operationSignature, final Parameter pcmParameter) {
      EList<Parameter> _parameters__OperationSignature = operationSignature.getParameters__OperationSignature();
      _parameters__OperationSignature.add(pcmParameter);
    }
    
    public EObject getElement2(final OrdinaryParameter javaParameter, final Parametrizable javaMethod, final OperationSignature operationSignature, final Parameter pcmParameter) {
      return pcmParameter;
    }
    
    public OperationSignature getElement3(final OrdinaryParameter javaParameter, final Parametrizable javaMethod, final OperationSignature operationSignature, final Parameter pcmParameter) {
      return operationSignature;
    }
    
    public void callRoutine2(final OrdinaryParameter javaParameter, final Parametrizable javaMethod, final OperationSignature operationSignature, final Parameter pcmParameter, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.checkInnerDeclarationsCreation(pcmParameter.getDataType__Parameter(), javaParameter.getTypeReference());
    }
    
    public EObject getCorrepondenceSourceOperationSignature(final OrdinaryParameter javaParameter, final Parametrizable javaMethod) {
      return javaMethod;
    }
    
    public void callRoutine1(final OrdinaryParameter javaParameter, final Parametrizable javaMethod, final OperationSignature operationSignature, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.checkCollectionDataTypeCreation(javaParameter.getTypeReference());
    }
    
    public void updatePcmParameterElement(final OrdinaryParameter javaParameter, final Parametrizable javaMethod, final OperationSignature operationSignature, final Parameter pcmParameter) {
      pcmParameter.setOperationSignature__Parameter(operationSignature);
      pcmParameter.setDataType__Parameter(TypeReferenceCorrespondenceHelper.getDataTypeFromTypeReference(javaParameter.getTypeReference(), this.executionState.getCorrespondenceModel(), 
        this.executionState.getUserInteractor(), operationSignature.getInterface__OperationSignature().getRepository__Interface()));
      ParameterUtil.setName(pcmParameter, javaParameter.getName());
    }
  }
  
  public CreateParameterRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OrdinaryParameter javaParameter, final Parametrizable javaMethod) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.CreateParameterRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaParameter = javaParameter;this.javaMethod = javaMethod;
  }
  
  private OrdinaryParameter javaParameter;
  
  private Parametrizable javaMethod;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateParameterRoutine with input:");
    	getLogger().trace("   javaParameter: " + this.javaParameter);
    	getLogger().trace("   javaMethod: " + this.javaMethod);
    }
    
    org.palladiosimulator.pcm.repository.OperationSignature operationSignature = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOperationSignature(javaParameter, javaMethod), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationSignature.class,
    	(org.palladiosimulator.pcm.repository.OperationSignature _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (operationSignature == null) {
    	return false;
    }
    userExecution.callRoutine1(javaParameter, javaMethod, operationSignature, this.getRoutinesFacade());
    
    org.palladiosimulator.pcm.repository.Parameter pcmParameter = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createParameter();
    notifyObjectCreated(pcmParameter);
    userExecution.updatePcmParameterElement(javaParameter, javaMethod, operationSignature, pcmParameter);
    
    addCorrespondenceBetween(userExecution.getElement1(javaParameter, javaMethod, operationSignature, pcmParameter), userExecution.getElement2(javaParameter, javaMethod, operationSignature, pcmParameter), "");
    
    // val updatedElement userExecution.getElement3(javaParameter, javaMethod, operationSignature, pcmParameter);
    userExecution.update0Element(javaParameter, javaMethod, operationSignature, pcmParameter);
    
    userExecution.callRoutine2(javaParameter, javaMethod, operationSignature, pcmParameter, this.getRoutinesFacade());
    
    return true;
  }
}
