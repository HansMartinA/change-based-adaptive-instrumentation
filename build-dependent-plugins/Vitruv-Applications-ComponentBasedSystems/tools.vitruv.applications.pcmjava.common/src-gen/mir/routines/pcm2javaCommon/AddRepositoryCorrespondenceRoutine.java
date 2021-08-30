package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddRepositoryCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private AddRepositoryCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final Repository pcmRepository) {
      return pcmRepository;
    }
    
    public EObject getElement2(final Repository pcmRepository) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
  }
  
  public AddRepositoryCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Repository pcmRepository) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddRepositoryCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.pcmRepository = pcmRepository;
  }
  
  private Repository pcmRepository;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddRepositoryCorrespondenceRoutine with input:");
    	getLogger().trace("   pcmRepository: " + this.pcmRepository);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(pcmRepository), userExecution.getElement2(pcmRepository), "");
    
    return true;
  }
}
