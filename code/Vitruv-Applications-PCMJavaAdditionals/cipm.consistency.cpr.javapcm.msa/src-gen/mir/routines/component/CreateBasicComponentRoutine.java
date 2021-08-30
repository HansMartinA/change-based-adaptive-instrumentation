package mir.routines.component;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateBasicComponentRoutine extends AbstractRepairRoutineRealization {
  private CreateBasicComponentRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public Repository getElement1(final org.emftext.language.java.containers.Module module, final Repository pcmRepository, final BasicComponent pcmBasicComponent) {
      return pcmRepository;
    }
    
    public EObject getCorrepondenceSourcePcmRepository(final org.emftext.language.java.containers.Module module) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
    
    public void update0Element(final org.emftext.language.java.containers.Module module, final Repository pcmRepository, final BasicComponent pcmBasicComponent) {
      EList<RepositoryComponent> _components__Repository = pcmRepository.getComponents__Repository();
      _components__Repository.add(pcmBasicComponent);
    }
    
    public EObject getElement2(final org.emftext.language.java.containers.Module module, final Repository pcmRepository, final BasicComponent pcmBasicComponent) {
      return pcmBasicComponent;
    }
    
    public EObject getElement3(final org.emftext.language.java.containers.Module module, final Repository pcmRepository, final BasicComponent pcmBasicComponent) {
      return module;
    }
    
    public void updatePcmBasicComponentElement(final org.emftext.language.java.containers.Module module, final Repository pcmRepository, final BasicComponent pcmBasicComponent) {
      pcmBasicComponent.setEntityName(module.getName());
    }
  }
  
  public CreateBasicComponentRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.containers.Module module) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.component.CreateBasicComponentRoutine.ActionUserExecution(getExecutionState(), this);
    this.module = module;
  }
  
  private org.emftext.language.java.containers.Module module;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateBasicComponentRoutine with input:");
    	getLogger().trace("   module: " + this.module);
    }
    
    org.palladiosimulator.pcm.repository.Repository pcmRepository = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmRepository(module), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmRepository == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.BasicComponent pcmBasicComponent = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createBasicComponent();
    notifyObjectCreated(pcmBasicComponent);
    userExecution.updatePcmBasicComponentElement(module, pcmRepository, pcmBasicComponent);
    
    // val updatedElement userExecution.getElement1(module, pcmRepository, pcmBasicComponent);
    userExecution.update0Element(module, pcmRepository, pcmBasicComponent);
    
    addCorrespondenceBetween(userExecution.getElement2(module, pcmRepository, pcmBasicComponent), userExecution.getElement3(module, pcmRepository, pcmBasicComponent), "");
    
    return true;
  }
}
