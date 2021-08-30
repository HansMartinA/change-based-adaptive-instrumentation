package mir.routines.component;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveComponentRoutine extends AbstractRepairRoutineRealization {
  private RemoveComponentRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final RepositoryComponent com) {
      return com;
    }
  }
  
  public RemoveComponentRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final RepositoryComponent com) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.component.RemoveComponentRoutine.ActionUserExecution(getExecutionState(), this);
    this.com = com;
  }
  
  private RepositoryComponent com;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveComponentRoutine with input:");
    	getLogger().trace("   com: " + this.com);
    }
    
    Stream.of(new Object[] {com})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(com), accessibleElement, null));		
    deleteObject(userExecution.getElement1(com));
    
    return true;
  }
}
