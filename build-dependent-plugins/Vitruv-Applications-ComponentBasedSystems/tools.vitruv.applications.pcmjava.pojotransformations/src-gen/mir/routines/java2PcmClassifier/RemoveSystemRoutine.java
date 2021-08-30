package mir.routines.java2PcmClassifier;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveSystemRoutine extends AbstractRepairRoutineRealization {
  private RemoveSystemRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final org.emftext.language.java.containers.Package javaPackage, final org.palladiosimulator.pcm.system.System pcmSystem) {
      return pcmSystem;
    }
    
    public EObject getCorrepondenceSourcePcmSystem(final org.emftext.language.java.containers.Package javaPackage) {
      return javaPackage;
    }
    
    public String getRetrieveTag1(final org.emftext.language.java.containers.Package javaPackage) {
      return "root_system";
    }
  }
  
  public RemoveSystemRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.containers.Package javaPackage) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.RemoveSystemRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaPackage = javaPackage;
  }
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveSystemRoutine with input:");
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
    Stream.of(new Object[] {javaPackage, pcmSystem})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(javaPackage, pcmSystem), accessibleElement, null));		
    deleteObject(userExecution.getElement1(javaPackage, pcmSystem));
    
    return true;
  }
}
