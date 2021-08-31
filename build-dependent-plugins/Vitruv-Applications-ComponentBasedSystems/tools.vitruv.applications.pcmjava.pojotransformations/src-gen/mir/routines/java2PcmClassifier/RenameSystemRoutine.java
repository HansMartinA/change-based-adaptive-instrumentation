package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RenameSystemRoutine extends AbstractRepairRoutineRealization {
  private RenameSystemRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public org.palladiosimulator.pcm.system.System getElement1(final org.emftext.language.java.containers.Package javaPackage, final org.palladiosimulator.pcm.system.System pcmSystem) {
      return pcmSystem;
    }
    
    public void update0Element(final org.emftext.language.java.containers.Package javaPackage, final org.palladiosimulator.pcm.system.System pcmSystem) {
      pcmSystem.setEntityName(StringExtensions.toFirstUpper(javaPackage.getName()));
    }
    
    public EObject getCorrepondenceSourcePcmSystem(final org.emftext.language.java.containers.Package javaPackage) {
      return javaPackage;
    }
    
    public String getRetrieveTag1(final org.emftext.language.java.containers.Package javaPackage) {
      return "root_system";
    }
  }
  
  public RenameSystemRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.containers.Package javaPackage) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.RenameSystemRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaPackage = javaPackage;
  }
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RenameSystemRoutine with input:");
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    }
    
    org.palladiosimulator.pcm.system.System pcmSystem = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmSystem(javaPackage), // correspondence source supplier
    	org.palladiosimulator.pcm.system.System.class,
    	(org.palladiosimulator.pcm.system.System _element) -> true, // correspondence precondition checker
    	userExecution.getRetrieveTag1(javaPackage), 
    	false // asserted
    	);
    if (pcmSystem == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(javaPackage, pcmSystem);
    userExecution.update0Element(javaPackage, pcmSystem);
    
    return true;
  }
}
