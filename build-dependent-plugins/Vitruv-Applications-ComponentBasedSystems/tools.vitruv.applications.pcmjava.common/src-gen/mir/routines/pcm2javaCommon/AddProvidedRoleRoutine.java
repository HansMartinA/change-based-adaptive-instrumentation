package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import tools.vitruv.domains.java.util.JavaModificationUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddProvidedRoleRoutine extends AbstractRepairRoutineRealization {
  private AddProvidedRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final OperationProvidedRole providedRole, final Interface operationProvidingInterface, final org.emftext.language.java.classifiers.Class javaClass, final NamespaceClassifierReference namespaceClassifierReference) {
      return namespaceClassifierReference;
    }
    
    public void update0Element(final OperationProvidedRole providedRole, final Interface operationProvidingInterface, final org.emftext.language.java.classifiers.Class javaClass, final NamespaceClassifierReference namespaceClassifierReference) {
      EList<TypeReference> _implements = javaClass.getImplements();
      _implements.add(namespaceClassifierReference);
    }
    
    public EObject getCorrepondenceSourceJavaClass(final OperationProvidedRole providedRole, final Interface operationProvidingInterface) {
      InterfaceProvidingEntity _providingEntity_ProvidedRole = providedRole.getProvidingEntity_ProvidedRole();
      return _providingEntity_ProvidedRole;
    }
    
    public EObject getElement2(final OperationProvidedRole providedRole, final Interface operationProvidingInterface, final org.emftext.language.java.classifiers.Class javaClass, final NamespaceClassifierReference namespaceClassifierReference) {
      return providedRole;
    }
    
    public org.emftext.language.java.classifiers.Class getElement3(final OperationProvidedRole providedRole, final Interface operationProvidingInterface, final org.emftext.language.java.classifiers.Class javaClass, final NamespaceClassifierReference namespaceClassifierReference) {
      return javaClass;
    }
    
    public void updateNamespaceClassifierReferenceElement(final OperationProvidedRole providedRole, final Interface operationProvidingInterface, final org.emftext.language.java.classifiers.Class javaClass, final NamespaceClassifierReference namespaceClassifierReference) {
      JavaModificationUtil.createNamespaceClassifierReference(namespaceClassifierReference, operationProvidingInterface);
    }
    
    public EObject getCorrepondenceSourceOperationProvidingInterface(final OperationProvidedRole providedRole) {
      OperationInterface _providedInterface__OperationProvidedRole = providedRole.getProvidedInterface__OperationProvidedRole();
      return _providedInterface__OperationProvidedRole;
    }
  }
  
  public AddProvidedRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final OperationProvidedRole providedRole) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddProvidedRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.providedRole = providedRole;
  }
  
  private OperationProvidedRole providedRole;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddProvidedRoleRoutine with input:");
    	getLogger().trace("   providedRole: " + this.providedRole);
    }
    
    org.emftext.language.java.classifiers.Interface operationProvidingInterface = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceOperationProvidingInterface(providedRole), // correspondence source supplier
    	org.emftext.language.java.classifiers.Interface.class,
    	(org.emftext.language.java.classifiers.Interface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (operationProvidingInterface == null) {
    	return false;
    }
    org.emftext.language.java.classifiers.Class javaClass = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceJavaClass(providedRole, operationProvidingInterface), // correspondence source supplier
    	org.emftext.language.java.classifiers.Class.class,
    	(org.emftext.language.java.classifiers.Class _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (javaClass == null) {
    	return false;
    }
    org.emftext.language.java.types.NamespaceClassifierReference namespaceClassifierReference = org.emftext.language.java.types.impl.TypesFactoryImpl.eINSTANCE.createNamespaceClassifierReference();
    notifyObjectCreated(namespaceClassifierReference);
    userExecution.updateNamespaceClassifierReferenceElement(providedRole, operationProvidingInterface, javaClass, namespaceClassifierReference);
    
    addCorrespondenceBetween(userExecution.getElement1(providedRole, operationProvidingInterface, javaClass, namespaceClassifierReference), userExecution.getElement2(providedRole, operationProvidingInterface, javaClass, namespaceClassifierReference), "");
    
    // val updatedElement userExecution.getElement3(providedRole, operationProvidingInterface, javaClass, namespaceClassifierReference);
    userExecution.update0Element(providedRole, operationProvidingInterface, javaClass, namespaceClassifierReference);
    
    return true;
  }
}
