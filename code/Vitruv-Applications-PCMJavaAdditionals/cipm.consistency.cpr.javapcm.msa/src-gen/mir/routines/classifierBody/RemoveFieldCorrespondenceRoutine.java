package mir.routines.classifierBody;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.Field;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveFieldCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private RemoveFieldCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final Field field, final NamedElement namedElement) {
      return namedElement;
    }
    
    public EObject getCorrepondenceSourceNamedElement(final Field field) {
      return field;
    }
  }
  
  public RemoveFieldCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Field field) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.classifierBody.RemoveFieldCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.field = field;
  }
  
  private Field field;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveFieldCorrespondenceRoutine with input:");
    	getLogger().trace("   field: " + this.field);
    }
    
    org.palladiosimulator.pcm.core.entity.NamedElement namedElement = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceNamedElement(field), // correspondence source supplier
    	org.palladiosimulator.pcm.core.entity.NamedElement.class,
    	(org.palladiosimulator.pcm.core.entity.NamedElement _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (namedElement == null) {
    	return false;
    }
    Stream.of(new Object[] {field, namedElement})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(field, namedElement), accessibleElement, null));		
    deleteObject(userExecution.getElement1(field, namedElement));
    
    return true;
  }
}
