package mir.routines.commonSignature;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.ClassMethod;
import org.palladiosimulator.pcm.seff.ResourceDemandingSEFF;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckRemovalOfSEFFRoutine extends AbstractRepairRoutineRealization {
  private CheckRemovalOfSEFFRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final ClassMethod classMethod, final ResourceDemandingSEFF seff) {
      return seff;
    }
    
    public EObject getCorrepondenceSourceSeff(final ClassMethod classMethod) {
      return classMethod;
    }
  }
  
  public CheckRemovalOfSEFFRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ClassMethod classMethod) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.CheckRemovalOfSEFFRoutine.ActionUserExecution(getExecutionState(), this);
    this.classMethod = classMethod;
  }
  
  private ClassMethod classMethod;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckRemovalOfSEFFRoutine with input:");
    	getLogger().trace("   classMethod: " + this.classMethod);
    }
    
    org.palladiosimulator.pcm.seff.ResourceDemandingSEFF seff = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceSeff(classMethod), // correspondence source supplier
    	org.palladiosimulator.pcm.seff.ResourceDemandingSEFF.class,
    	(org.palladiosimulator.pcm.seff.ResourceDemandingSEFF _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (seff == null) {
    	return false;
    }
    Stream.of(new Object[] {classMethod, seff})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(classMethod, seff), accessibleElement, null));		
    deleteObject(userExecution.getElement1(classMethod, seff));
    
    return true;
  }
}
