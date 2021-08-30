package mir.routines.commonOperationProvidedRole;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.Classifier;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveOperationProvidedRolesForRemovedClassRoutine extends AbstractRepairRoutineRealization {
  private RemoveOperationProvidedRolesForRemovedClassRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceOpRoles(final Classifier classifier) {
      return classifier;
    }
    
    public void callRoutine1(final Classifier classifier, final List<OperationProvidedRole> opRoles, @Extension final RoutinesFacade _routinesFacade) {
      for (final OperationProvidedRole role : opRoles) {
        _routinesFacade.removeOperationProvidedRole(role);
      }
    }
  }
  
  public RemoveOperationProvidedRolesForRemovedClassRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Classifier classifier) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationProvidedRole.RemoveOperationProvidedRolesForRemovedClassRoutine.ActionUserExecution(getExecutionState(), this);
    this.classifier = classifier;
  }
  
  private Classifier classifier;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveOperationProvidedRolesForRemovedClassRoutine with input:");
    	getLogger().trace("   classifier: " + this.classifier);
    }
    
    List<org.palladiosimulator.pcm.repository.OperationProvidedRole> opRoles = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceOpRoles(classifier), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationProvidedRole.class,
    	(org.palladiosimulator.pcm.repository.OperationProvidedRole _element) -> true, // correspondence precondition checker
    	null
    );
    userExecution.callRoutine1(classifier, opRoles, this.getRoutinesFacade());
    
    return true;
  }
}
