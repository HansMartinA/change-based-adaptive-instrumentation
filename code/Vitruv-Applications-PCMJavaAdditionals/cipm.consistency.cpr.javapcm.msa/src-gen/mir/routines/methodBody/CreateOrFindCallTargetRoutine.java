package mir.routines.methodBody;

import cipm.consistency.cpr.javapcm.internal.InternalUtility;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.ClassMethod;
import org.emftext.language.java.members.Method;
import org.emftext.language.java.references.MethodCall;
import org.palladiosimulator.pcm.repository.BasicComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindCallTargetRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindCallTargetRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final MethodCall methCall, final Method method, final BasicComponent callCom, final BasicComponent com) {
      return method;
    }
    
    public EObject getCorrepondenceSource2(final MethodCall methCall, final Method method, final BasicComponent callCom, final BasicComponent com) {
      return method;
    }
    
    public EObject getCorrepondenceSourceCallCom(final MethodCall methCall, final Method method) {
      ConcreteClassifier _containingConcreteClassifier = methCall.getContainingConcreteClassifier();
      return _containingConcreteClassifier;
    }
    
    public EObject getCorrepondenceSourceCom(final MethodCall methCall, final Method method, final BasicComponent callCom) {
      ConcreteClassifier _containingConcreteClassifier = method.getContainingConcreteClassifier();
      return _containingConcreteClassifier;
    }
    
    public void callRoutine1(final MethodCall methCall, final Method method, final BasicComponent callCom, final BasicComponent com, @Extension final RoutinesFacade _routinesFacade) {
      final ConcreteClassifier classifier = method.getContainingConcreteClassifier();
      if (((callCom != com) && InternalUtility.isExternalCall(method, this.executionState.getCorrespondenceModel(), com))) {
        _routinesFacade.createInterface(classifier);
        _routinesFacade.createOrFindPCMSignature(method);
        if ((classifier instanceof org.emftext.language.java.classifiers.Class)) {
          _routinesFacade.createOrFindOperationProvidedRole(classifier, ((org.emftext.language.java.classifiers.Class)classifier));
          if ((method instanceof ClassMethod)) {
            _routinesFacade.createSEFF(method, ((org.emftext.language.java.classifiers.Class)classifier), ((ClassMethod)method));
          }
        }
      }
    }
  }
  
  public CreateOrFindCallTargetRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final MethodCall methCall, final Method method) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.methodBody.CreateOrFindCallTargetRoutine.ActionUserExecution(getExecutionState(), this);
    this.methCall = methCall;this.method = method;
  }
  
  private MethodCall methCall;
  
  private Method method;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindCallTargetRoutine with input:");
    	getLogger().trace("   methCall: " + this.methCall);
    	getLogger().trace("   method: " + this.method);
    }
    
    org.palladiosimulator.pcm.repository.BasicComponent callCom = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceCallCom(methCall, method), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.BasicComponent.class,
    	(org.palladiosimulator.pcm.repository.BasicComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (callCom == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.BasicComponent com = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceCom(methCall, method, callCom), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.BasicComponent.class,
    	(org.palladiosimulator.pcm.repository.BasicComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (com == null) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(methCall, method, callCom, com), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationSignature.class,
    	(org.palladiosimulator.pcm.repository.OperationSignature _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource2(methCall, method, callCom, com), // correspondence source supplier
    	org.palladiosimulator.pcm.seff.ResourceDemandingSEFF.class,
    	(org.palladiosimulator.pcm.seff.ResourceDemandingSEFF _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(methCall, method, callCom, com, this.getRoutinesFacade());
    
    return true;
  }
}
