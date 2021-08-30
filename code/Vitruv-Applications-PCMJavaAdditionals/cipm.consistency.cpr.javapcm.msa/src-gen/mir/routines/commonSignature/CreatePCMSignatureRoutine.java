package mir.routines.commonSignature;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.Method;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreatePCMSignatureRoutine extends AbstractRepairRoutineRealization {
  private CreatePCMSignatureRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public OperationInterface getElement1(final Method interfaceMethod, final OperationInterface pcmInterface, final OperationSignature operationSignature) {
      return pcmInterface;
    }
    
    public void updateOperationSignatureElement(final Method interfaceMethod, final OperationInterface pcmInterface, final OperationSignature operationSignature) {
      operationSignature.setEntityName(interfaceMethod.getName());
      operationSignature.setInterface__OperationSignature(pcmInterface);
    }
    
    public void update0Element(final Method interfaceMethod, final OperationInterface pcmInterface, final OperationSignature operationSignature) {
      EList<OperationSignature> _signatures__OperationInterface = pcmInterface.getSignatures__OperationInterface();
      _signatures__OperationInterface.add(operationSignature);
    }
    
    public EObject getCorrepondenceSource1(final Method interfaceMethod, final OperationInterface pcmInterface) {
      return interfaceMethod;
    }
    
    public EObject getCorrepondenceSourcePcmInterface(final Method interfaceMethod) {
      ConcreteClassifier _containingConcreteClassifier = interfaceMethod.getContainingConcreteClassifier();
      return _containingConcreteClassifier;
    }
    
    public void callRoutine1(final Method interfaceMethod, final OperationInterface pcmInterface, final OperationSignature operationSignature, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.addCorrespondenceBetweenMethodAndOperationSignature(interfaceMethod, operationSignature);
    }
  }
  
  public CreatePCMSignatureRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Method interfaceMethod) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.CreatePCMSignatureRoutine.ActionUserExecution(getExecutionState(), this);
    this.interfaceMethod = interfaceMethod;
  }
  
  private Method interfaceMethod;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreatePCMSignatureRoutine with input:");
    	getLogger().trace("   interfaceMethod: " + this.interfaceMethod);
    }
    
    org.palladiosimulator.pcm.repository.OperationInterface pcmInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmInterface(interfaceMethod), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmInterface == null) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(interfaceMethod, pcmInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationSignature.class,
    	(org.palladiosimulator.pcm.repository.OperationSignature _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.OperationSignature operationSignature = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createOperationSignature();
    notifyObjectCreated(operationSignature);
    userExecution.updateOperationSignatureElement(interfaceMethod, pcmInterface, operationSignature);
    
    // val updatedElement userExecution.getElement1(interfaceMethod, pcmInterface, operationSignature);
    userExecution.update0Element(interfaceMethod, pcmInterface, operationSignature);
    
    userExecution.callRoutine1(interfaceMethod, pcmInterface, operationSignature, this.getRoutinesFacade());
    
    return true;
  }
}
