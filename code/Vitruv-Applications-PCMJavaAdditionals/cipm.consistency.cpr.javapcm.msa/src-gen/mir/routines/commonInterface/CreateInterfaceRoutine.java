package mir.routines.commonInterface;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateInterfaceRoutine extends AbstractRepairRoutineRealization {
  private CreateInterfaceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public Repository getElement1(final ConcreteClassifier javaInterface, final Repository pcmRepository, final OperationInterface pcmInterface) {
      return pcmRepository;
    }
    
    public EObject getCorrepondenceSourcePcmRepository(final ConcreteClassifier javaInterface) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
    
    public void update0Element(final ConcreteClassifier javaInterface, final Repository pcmRepository, final OperationInterface pcmInterface) {
      EList<Interface> _interfaces__Repository = pcmRepository.getInterfaces__Repository();
      _interfaces__Repository.add(pcmInterface);
    }
    
    public EObject getCorrepondenceSource1(final ConcreteClassifier javaInterface, final Repository pcmRepository) {
      return javaInterface;
    }
    
    public void updatePcmInterfaceElement(final ConcreteClassifier javaInterface, final Repository pcmRepository, final OperationInterface pcmInterface) {
      pcmInterface.setEntityName(javaInterface.getName());
    }
    
    public void callRoutine1(final ConcreteClassifier javaInterface, final Repository pcmRepository, final OperationInterface pcmInterface, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.addCorrespondenceBetweenClassifierAndInterface(javaInterface, pcmInterface);
    }
  }
  
  public CreateInterfaceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier javaInterface) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonInterface.CreateInterfaceRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaInterface = javaInterface;
  }
  
  private ConcreteClassifier javaInterface;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateInterfaceRoutine with input:");
    	getLogger().trace("   javaInterface: " + this.javaInterface);
    }
    
    org.palladiosimulator.pcm.repository.Repository pcmRepository = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmRepository(javaInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmRepository == null) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(javaInterface, pcmRepository), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.OperationInterface pcmInterface = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createOperationInterface();
    notifyObjectCreated(pcmInterface);
    userExecution.updatePcmInterfaceElement(javaInterface, pcmRepository, pcmInterface);
    
    // val updatedElement userExecution.getElement1(javaInterface, pcmRepository, pcmInterface);
    userExecution.update0Element(javaInterface, pcmRepository, pcmInterface);
    
    userExecution.callRoutine1(javaInterface, pcmRepository, pcmInterface, this.getRoutinesFacade());
    
    return true;
  }
}
