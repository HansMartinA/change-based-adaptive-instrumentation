package mir.routines.component;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckBasicComponentRemovalForModuleRoutine extends AbstractRepairRoutineRealization {
  private CheckBasicComponentRemovalForModuleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourcePcmComponent(final org.emftext.language.java.containers.Module mod) {
      return mod;
    }
    
    public void callRoutine1(final org.emftext.language.java.containers.Module mod, final RepositoryComponent pcmComponent, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.removeComponent(pcmComponent);
    }
  }
  
  public CheckBasicComponentRemovalForModuleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.containers.Module mod) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.component.CheckBasicComponentRemovalForModuleRoutine.ActionUserExecution(getExecutionState(), this);
    this.mod = mod;
  }
  
  private org.emftext.language.java.containers.Module mod;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckBasicComponentRemovalForModuleRoutine with input:");
    	getLogger().trace("   mod: " + this.mod);
    }
    
    org.palladiosimulator.pcm.repository.RepositoryComponent pcmComponent = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmComponent(mod), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmComponent == null) {
    	return false;
    }
    userExecution.callRoutine1(mod, pcmComponent, this.getRoutinesFacade());
    
    return true;
  }
}
