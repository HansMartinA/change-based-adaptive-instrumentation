package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.containers.ContainersPackage;
import org.palladiosimulator.pcm.repository.Repository;
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
    
    public EObject getElement1(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
      return pcmRepository;
    }
    
    public EObject getElement4(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
      return javaPackage;
    }
    
    public EObject getElement2(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
      return ContainersPackage.Literals.PACKAGE;
    }
    
    public EObject getElement3(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
      return pcmRepository;
    }
    
    public String getTag1(final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
      return newTag;
    }
  }
  
  public AddRepositoryCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Repository pcmRepository, final org.emftext.language.java.containers.Package javaPackage, final String newTag) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.AddRepositoryCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.pcmRepository = pcmRepository;this.javaPackage = javaPackage;this.newTag = newTag;
  }
  
  private Repository pcmRepository;
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  private String newTag;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddRepositoryCorrespondenceRoutine with input:");
    	getLogger().trace("   pcmRepository: " + this.pcmRepository);
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    	getLogger().trace("   newTag: " + this.newTag);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(pcmRepository, javaPackage, newTag), userExecution.getElement2(pcmRepository, javaPackage, newTag), "");
    
    addCorrespondenceBetween(userExecution.getElement3(pcmRepository, javaPackage, newTag), userExecution.getElement4(pcmRepository, javaPackage, newTag), userExecution.getTag1(pcmRepository, javaPackage, newTag));
    
    return true;
  }
}
