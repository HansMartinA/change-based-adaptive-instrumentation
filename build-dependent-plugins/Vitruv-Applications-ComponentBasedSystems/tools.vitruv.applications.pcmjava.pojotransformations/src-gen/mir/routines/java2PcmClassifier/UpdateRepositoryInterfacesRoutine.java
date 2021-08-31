package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.containers.ContainersPackage;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Repository;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class UpdateRepositoryInterfacesRoutine extends AbstractRepairRoutineRealization {
  private UpdateRepositoryInterfacesRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public Repository getElement1(final OperationInterface pcmInterface, final Repository pcmRepository) {
      return pcmRepository;
    }
    
    public EObject getCorrepondenceSourcePcmRepository(final OperationInterface pcmInterface) {
      return ContainersPackage.Literals.PACKAGE;
    }
    
    public void update0Element(final OperationInterface pcmInterface, final Repository pcmRepository) {
      EList<Interface> _interfaces__Repository = pcmRepository.getInterfaces__Repository();
      _interfaces__Repository.add(pcmInterface);
    }
  }
  
  public UpdateRepositoryInterfacesRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OperationInterface pcmInterface) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.UpdateRepositoryInterfacesRoutine.ActionUserExecution(getExecutionState(), this);
    this.pcmInterface = pcmInterface;
  }
  
  private OperationInterface pcmInterface;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine UpdateRepositoryInterfacesRoutine with input:");
    	getLogger().trace("   pcmInterface: " + this.pcmInterface);
    }
    
    org.palladiosimulator.pcm.repository.Repository pcmRepository = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmRepository(pcmInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmRepository == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(pcmInterface, pcmRepository);
    userExecution.update0Element(pcmInterface, pcmRepository);
    
    return true;
  }
}
