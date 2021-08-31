package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.system.SystemPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateSystemRoutine extends AbstractRepairRoutineRealization {
  private CreateSystemRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final org.emftext.language.java.containers.Package javaPackage, final String name, final org.palladiosimulator.pcm.system.System pcmSystem) {
      return pcmSystem;
    }
    
    public void updatePcmSystemElement(final org.emftext.language.java.containers.Package javaPackage, final String name, final org.palladiosimulator.pcm.system.System pcmSystem) {
      pcmSystem.setEntityName(name);
      String _entityName = pcmSystem.getEntityName();
      String _plus = ("model/" + _entityName);
      String _plus_1 = (_plus + ".system");
      this.persistProjectRelative(javaPackage, pcmSystem, _plus_1);
    }
    
    public EObject getElement4(final org.emftext.language.java.containers.Package javaPackage, final String name, final org.palladiosimulator.pcm.system.System pcmSystem) {
      return SystemPackage.Literals.SYSTEM;
    }
    
    public EObject getElement2(final org.emftext.language.java.containers.Package javaPackage, final String name, final org.palladiosimulator.pcm.system.System pcmSystem) {
      return javaPackage;
    }
    
    public EObject getElement3(final org.emftext.language.java.containers.Package javaPackage, final String name, final org.palladiosimulator.pcm.system.System pcmSystem) {
      return pcmSystem;
    }
    
    public String getTag1(final org.emftext.language.java.containers.Package javaPackage, final String name, final org.palladiosimulator.pcm.system.System pcmSystem) {
      return "root_system";
    }
  }
  
  public CreateSystemRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.containers.Package javaPackage, final String name) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.CreateSystemRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaPackage = javaPackage;this.name = name;
  }
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  private String name;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateSystemRoutine with input:");
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    	getLogger().trace("   name: " + this.name);
    }
    
    org.palladiosimulator.pcm.system.System pcmSystem = org.palladiosimulator.pcm.system.impl.SystemFactoryImpl.eINSTANCE.createSystem();
    notifyObjectCreated(pcmSystem);
    userExecution.updatePcmSystemElement(javaPackage, name, pcmSystem);
    
    addCorrespondenceBetween(userExecution.getElement1(javaPackage, name, pcmSystem), userExecution.getElement2(javaPackage, name, pcmSystem), "");
    
    addCorrespondenceBetween(userExecution.getElement3(javaPackage, name, pcmSystem), userExecution.getElement4(javaPackage, name, pcmSystem), userExecution.getTag1(javaPackage, name, pcmSystem));
    
    return true;
  }
}
