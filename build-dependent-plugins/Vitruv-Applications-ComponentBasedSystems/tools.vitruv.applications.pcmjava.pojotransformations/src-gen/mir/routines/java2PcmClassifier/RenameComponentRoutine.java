package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RenameComponentRoutine extends AbstractRepairRoutineRealization {
  private RenameComponentRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public RepositoryComponent getElement1(final org.emftext.language.java.containers.Package javaPackage, final RepositoryComponent pcmComponent) {
      return pcmComponent;
    }
    
    public void update0Element(final org.emftext.language.java.containers.Package javaPackage, final RepositoryComponent pcmComponent) {
      pcmComponent.setEntityName(StringExtensions.toFirstUpper(javaPackage.getName()));
    }
    
    public EObject getCorrepondenceSourcePcmComponent(final org.emftext.language.java.containers.Package javaPackage) {
      return javaPackage;
    }
  }
  
  public RenameComponentRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.containers.Package javaPackage) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.RenameComponentRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaPackage = javaPackage;
  }
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RenameComponentRoutine with input:");
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    }
    
    org.palladiosimulator.pcm.repository.RepositoryComponent pcmComponent = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmComponent(javaPackage), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmComponent == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(javaPackage, pcmComponent);
    userExecution.update0Element(javaPackage, pcmComponent);
    
    return true;
  }
}
