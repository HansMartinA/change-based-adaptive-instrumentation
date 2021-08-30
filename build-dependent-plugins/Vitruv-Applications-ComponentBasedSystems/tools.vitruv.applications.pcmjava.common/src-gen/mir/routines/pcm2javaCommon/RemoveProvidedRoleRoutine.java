package mir.routines.pcm2javaCommon;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveProvidedRoleRoutine extends AbstractRepairRoutineRealization {
  private RemoveProvidedRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final ProvidedRole providedRole, final TypeReference typeReference) {
      ClassifierReference _pureClassifierReference = typeReference.getPureClassifierReference();
      return _pureClassifierReference;
    }
    
    public EObject getCorrepondenceSourceTypeReference(final ProvidedRole providedRole) {
      return providedRole;
    }
    
    public EObject getElement2(final ProvidedRole providedRole, final TypeReference typeReference) {
      return typeReference;
    }
  }
  
  public RemoveProvidedRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ProvidedRole providedRole) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.RemoveProvidedRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.providedRole = providedRole;
  }
  
  private ProvidedRole providedRole;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveProvidedRoleRoutine with input:");
    	getLogger().trace("   providedRole: " + this.providedRole);
    }
    
    org.emftext.language.java.types.TypeReference typeReference = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceTypeReference(providedRole), // correspondence source supplier
    	org.emftext.language.java.types.TypeReference.class,
    	(org.emftext.language.java.types.TypeReference _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (typeReference == null) {
    	return false;
    }
    Stream.of(new Object[] {providedRole, typeReference})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(providedRole, typeReference), accessibleElement, null));		
    deleteObject(userExecution.getElement1(providedRole, typeReference));
    
    Stream.of(new Object[] {providedRole, typeReference})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement2(providedRole, typeReference), accessibleElement, null));		
    deleteObject(userExecution.getElement2(providedRole, typeReference));
    
    return true;
  }
}
