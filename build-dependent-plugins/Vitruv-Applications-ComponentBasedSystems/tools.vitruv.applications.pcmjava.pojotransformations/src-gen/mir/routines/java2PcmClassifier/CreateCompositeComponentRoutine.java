package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.repository.CompositeComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateCompositeComponentRoutine extends AbstractRepairRoutineRealization {
  private CreateCompositeComponentRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void updatePcmCompositeComponentElement(final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName, final CompositeComponent pcmCompositeComponent) {
      pcmCompositeComponent.setEntityName(name);
    }
    
    public void callRoutine1(final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName, final CompositeComponent pcmCompositeComponent, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.addCorrespondenceAndUpdateRepository(pcmCompositeComponent, javaPackage);
    }
  }
  
  public CreateCompositeComponentRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.containers.Package javaPackage, final String name, final String rootPackageName) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.CreateCompositeComponentRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaPackage = javaPackage;this.name = name;this.rootPackageName = rootPackageName;
  }
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  private String name;
  
  private String rootPackageName;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateCompositeComponentRoutine with input:");
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    	getLogger().trace("   name: " + this.name);
    	getLogger().trace("   rootPackageName: " + this.rootPackageName);
    }
    
    org.palladiosimulator.pcm.repository.CompositeComponent pcmCompositeComponent = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createCompositeComponent();
    notifyObjectCreated(pcmCompositeComponent);
    userExecution.updatePcmCompositeComponentElement(javaPackage, name, rootPackageName, pcmCompositeComponent);
    
    userExecution.callRoutine1(javaPackage, name, rootPackageName, pcmCompositeComponent, this.getRoutinesFacade());
    
    return true;
  }
}
