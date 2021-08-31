package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.containers.ContainersPackage;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

/**
 * *
 * nAdds correspondence between component and package and add component into repository.
 *  
 */
@SuppressWarnings("all")
public class AddCorrespondenceAndUpdateRepositoryRoutine extends AbstractRepairRoutineRealization {
  private AddCorrespondenceAndUpdateRepositoryRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final RepositoryComponent pcmComponent, final org.emftext.language.java.containers.Package javaPackage, final Repository pcmRepository) {
      return pcmComponent;
    }
    
    public EObject getCorrepondenceSourcePcmRepository(final RepositoryComponent pcmComponent, final org.emftext.language.java.containers.Package javaPackage) {
      return ContainersPackage.Literals.PACKAGE;
    }
    
    public void update0Element(final RepositoryComponent pcmComponent, final org.emftext.language.java.containers.Package javaPackage, final Repository pcmRepository) {
      boolean _contains = pcmRepository.getComponents__Repository().contains(pcmComponent);
      boolean _not = (!_contains);
      if (_not) {
        EList<RepositoryComponent> _components__Repository = pcmRepository.getComponents__Repository();
        _components__Repository.add(pcmComponent);
      }
    }
    
    public EObject getElement2(final RepositoryComponent pcmComponent, final org.emftext.language.java.containers.Package javaPackage, final Repository pcmRepository) {
      return javaPackage;
    }
    
    public Repository getElement3(final RepositoryComponent pcmComponent, final org.emftext.language.java.containers.Package javaPackage, final Repository pcmRepository) {
      return pcmRepository;
    }
  }
  
  public AddCorrespondenceAndUpdateRepositoryRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final RepositoryComponent pcmComponent, final org.emftext.language.java.containers.Package javaPackage) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.AddCorrespondenceAndUpdateRepositoryRoutine.ActionUserExecution(getExecutionState(), this);
    this.pcmComponent = pcmComponent;this.javaPackage = javaPackage;
  }
  
  private RepositoryComponent pcmComponent;
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddCorrespondenceAndUpdateRepositoryRoutine with input:");
    	getLogger().trace("   pcmComponent: " + this.pcmComponent);
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    }
    
    org.palladiosimulator.pcm.repository.Repository pcmRepository = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmRepository(pcmComponent, javaPackage), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmRepository == null) {
    	return false;
    }
    addCorrespondenceBetween(userExecution.getElement1(pcmComponent, javaPackage, pcmRepository), userExecution.getElement2(pcmComponent, javaPackage, pcmRepository), "");
    
    // val updatedElement userExecution.getElement3(pcmComponent, javaPackage, pcmRepository);
    userExecution.update0Element(pcmComponent, javaPackage, pcmRepository);
    
    return true;
  }
}
