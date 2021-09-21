package mir.routines.commonSignature;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;
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
    
    public EObject getElement1(final Method interfaceMethod, final OperationSignature operationSignature) {
      return operationSignature;
    }
    
    public EObject getCorrepondenceSourceOperationSignature(final Method interfaceMethod) {
      return interfaceMethod;
    }
    
    public void callRoutine1(final Method interfaceMethod, final OperationSignature operationSignature, @Extension final RoutinesFacade _routinesFacade) {
      EList<Parameter> _parameters = interfaceMethod.getParameters();
      for (final Parameter param : _parameters) {
        if ((param instanceof OrdinaryParameter)) {
          _routinesFacade.deleteParameter(((OrdinaryParameter)param));
        }
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
    userExecution.callRoutine1(interfaceMethod, operationSignature, this.getRoutinesFacade());
    
    Stream.of(new Object[] {interfaceMethod, operationSignature})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(interfaceMethod, operationSignature), accessibleElement, null));		
    deleteObject(userExecution.getElement1(interfaceMethod, operationSignature));
    
    return true;
  }
}
