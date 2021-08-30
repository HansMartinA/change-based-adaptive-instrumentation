package mir.routines.servlet;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.OperationInterface;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class ConnectInterfacesByInheritanceRoutine extends AbstractRepairRoutineRealization {
  private ConnectInterfacesByInheritanceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public OperationInterface getElement1(final ConcreteClassifier subClassifier, final ConcreteClassifier superClassifier, final OperationInterface subInterface, final OperationInterface superInterface) {
      return subInterface;
    }
    
    public void update0Element(final ConcreteClassifier subClassifier, final ConcreteClassifier superClassifier, final OperationInterface subInterface, final OperationInterface superInterface) {
      EList<Interface> _parentInterfaces__Interface = subInterface.getParentInterfaces__Interface();
      _parentInterfaces__Interface.add(superInterface);
    }
    
    public EObject getCorrepondenceSourceSuperInterface(final ConcreteClassifier subClassifier, final ConcreteClassifier superClassifier, final OperationInterface subInterface) {
      return superClassifier;
    }
    
    public EObject getCorrepondenceSourceSubInterface(final ConcreteClassifier subClassifier, final ConcreteClassifier superClassifier) {
      return subClassifier;
    }
  }
  
  public ConnectInterfacesByInheritanceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier subClassifier, final ConcreteClassifier superClassifier) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.servlet.ConnectInterfacesByInheritanceRoutine.ActionUserExecution(getExecutionState(), this);
    this.subClassifier = subClassifier;this.superClassifier = superClassifier;
  }
  
  private ConcreteClassifier subClassifier;
  
  private ConcreteClassifier superClassifier;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine ConnectInterfacesByInheritanceRoutine with input:");
    	getLogger().trace("   subClassifier: " + this.subClassifier);
    	getLogger().trace("   superClassifier: " + this.superClassifier);
    }
    
    org.palladiosimulator.pcm.repository.OperationInterface subInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceSubInterface(subClassifier, superClassifier), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (subInterface == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.OperationInterface superInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceSuperInterface(subClassifier, superClassifier, subInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (superInterface == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(subClassifier, superClassifier, subInterface, superInterface);
    userExecution.update0Element(subClassifier, superClassifier, subInterface, superInterface);
    
    return true;
  }
}
