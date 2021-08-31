package mir.routines.commonOperationProvidedRole;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.types.TypeReference;
import tools.vitruv.applications.util.temporary.java.JavaTypeUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindOperationProvidedRoleFromTypeReferenceRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindOperationProvidedRoleFromTypeReferenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final TypeReference typeReference, @Extension final RoutinesFacade _routinesFacade) {
      EObject _eContainer = typeReference.eContainer();
      final org.emftext.language.java.classifiers.Class javaClass = ((org.emftext.language.java.classifiers.Class) _eContainer);
      Classifier javaInterfaceClassifier = JavaTypeUtil.getNormalizedClassifierFromTypeReference(typeReference);
      _routinesFacade.createOrFindOperationProvidedRole(javaInterfaceClassifier, javaClass);
    }
  }
  
  public CreateOrFindOperationProvidedRoleFromTypeReferenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final TypeReference typeReference) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationProvidedRole.CreateOrFindOperationProvidedRoleFromTypeReferenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.typeReference = typeReference;
  }
  
  private TypeReference typeReference;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindOperationProvidedRoleFromTypeReferenceRoutine with input:");
    	getLogger().trace("   typeReference: " + this.typeReference);
    }
    
    userExecution.callRoutine1(typeReference, this.getRoutinesFacade());
    
    return true;
  }
}
