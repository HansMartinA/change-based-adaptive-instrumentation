package mir.routines.commonSignature;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.members.ClassMethod;
import org.palladiosimulator.pcm.repository.OperationInterface;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateSeffFromClassInterfaceRoutine extends AbstractRepairRoutineRealization {
  private CreateSeffFromClassInterfaceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final ClassMethod method, final org.emftext.language.java.classifiers.Class javaClass, final OperationInterface opInterface) {
      return method;
    }
    
    public EObject getCorrepondenceSourceOpInterface(final ClassMethod method, final org.emftext.language.java.classifiers.Class javaClass) {
      return javaClass;
    }
    
    public void callRoutine1(final ClassMethod method, final org.emftext.language.java.classifiers.Class javaClass, final OperationInterface opInterface, @Extension final RoutinesFacade _routinesFacade) {
      boolean _isPublic = method.isPublic();
      if (_isPublic) {
        _routinesFacade.createSEFF(method, javaClass, method);
      }
    }
  }
  
  public CreateSeffFromClassInterfaceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ClassMethod method, final org.emftext.language.java.classifiers.Class javaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.CreateSeffFromClassInterfaceRoutine.ActionUserExecution(getExecutionState(), this);
    this.method = method;this.javaClass = javaClass;
  }
  
  private ClassMethod method;
  
  private org.emftext.language.java.classifiers.Class javaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateSeffFromClassInterfaceRoutine with input:");
    	getLogger().trace("   method: " + this.method);
    	getLogger().trace("   javaClass: " + this.javaClass);
    }
    
    org.palladiosimulator.pcm.repository.OperationInterface opInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOpInterface(method, javaClass), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (opInterface == null) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(method, javaClass, opInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.seff.ResourceDemandingSEFF.class,
    	(org.palladiosimulator.pcm.seff.ResourceDemandingSEFF _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(method, javaClass, opInterface, this.getRoutinesFacade());
    
    return true;
  }
}
