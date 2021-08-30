package mir.routines.commonSignature;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.Method;
import org.palladiosimulator.pcm.repository.OperationSignature;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckRemovalOfOperationSignatureRoutine extends AbstractRepairRoutineRealization {
  private CheckRemovalOfOperationSignatureRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceClassifiers(final Method interfaceMethod, final OperationSignature operationSignature) {
      return operationSignature;
    }
    
    public EObject getCorrepondenceSourceOperationSignature(final Method interfaceMethod) {
      return interfaceMethod;
    }
    
    public void callRoutine1(final Method interfaceMethod, final OperationSignature operationSignature, final List<ConcreteClassifier> classifiers, @Extension final RoutinesFacade _routinesFacade) {
      int _size = classifiers.size();
      boolean _equals = (_size == 1);
      if (_equals) {
        _routinesFacade.deleteSignature(operationSignature);
      } else {
        _routinesFacade.removeCorrespondenceBetweenMethodAndSignature(interfaceMethod, operationSignature);
      }
    }
  }
  
  public CheckRemovalOfOperationSignatureRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Method interfaceMethod) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.CheckRemovalOfOperationSignatureRoutine.ActionUserExecution(getExecutionState(), this);
    this.interfaceMethod = interfaceMethod;
  }
  
  private Method interfaceMethod;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckRemovalOfOperationSignatureRoutine with input:");
    	getLogger().trace("   interfaceMethod: " + this.interfaceMethod);
    }
    
    org.palladiosimulator.pcm.repository.OperationSignature operationSignature = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOperationSignature(interfaceMethod), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationSignature.class,
    	(org.palladiosimulator.pcm.repository.OperationSignature _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (operationSignature == null) {
    	return false;
    }
    List<org.emftext.language.java.classifiers.ConcreteClassifier> classifiers = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceClassifiers(interfaceMethod, operationSignature), // correspondence source supplier
    	org.emftext.language.java.classifiers.ConcreteClassifier.class,
    	(org.emftext.language.java.classifiers.ConcreteClassifier _element) -> true, // correspondence precondition checker
    	null
    );
    userExecution.callRoutine1(interfaceMethod, operationSignature, classifiers, this.getRoutinesFacade());
    
    return true;
  }
}
