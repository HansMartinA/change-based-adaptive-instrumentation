package mir.routines.commonSignature;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.Method;
import org.palladiosimulator.pcm.repository.OperationSignature;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveCorrespondenceBetweenMethodAndSignatureRoutine extends AbstractRepairRoutineRealization {
  private RemoveCorrespondenceBetweenMethodAndSignatureRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final Method method, final OperationSignature sign) {
      return method;
    }
    
    public EObject getElement2(final Method method, final OperationSignature sign) {
      return sign;
    }
  }
  
  public RemoveCorrespondenceBetweenMethodAndSignatureRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Method method, final OperationSignature sign) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.RemoveCorrespondenceBetweenMethodAndSignatureRoutine.ActionUserExecution(getExecutionState(), this);
    this.method = method;this.sign = sign;
  }
  
  private Method method;
  
  private OperationSignature sign;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveCorrespondenceBetweenMethodAndSignatureRoutine with input:");
    	getLogger().trace("   method: " + this.method);
    	getLogger().trace("   sign: " + this.sign);
    }
    
    removeCorrespondenceBetween(userExecution.getElement1(method, sign), userExecution.getElement2(method, sign), "");
    
    return true;
  }
}
