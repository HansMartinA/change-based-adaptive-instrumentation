package mir.routines.commonOperationProvidedRole;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.emftext.language.java.classifiers.Classifier;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckRemovalOfOperationProvidedRoleRoutine extends AbstractRepairRoutineRealization {
  private CheckRemovalOfOperationProvidedRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceBasicCom(final org.emftext.language.java.classifiers.Class clazz, final Classifier classifierRef, final OperationInterface interfaze) {
      return clazz;
    }
    
    public EObject getCorrepondenceSourceInterfaze(final org.emftext.language.java.classifiers.Class clazz, final Classifier classifierRef) {
      return classifierRef;
    }
    
    public EObject getCorrepondenceSourceOpRoles(final org.emftext.language.java.classifiers.Class clazz, final Classifier classifierRef, final OperationInterface interfaze, final BasicComponent basicCom) {
      return clazz;
    }
    
    public void callRoutine1(final org.emftext.language.java.classifiers.Class clazz, final Classifier classifierRef, final OperationInterface interfaze, final BasicComponent basicCom, final List<OperationProvidedRole> opRoles, @Extension final RoutinesFacade _routinesFacade) {
      final Function1<OperationProvidedRole, Boolean> _function = (OperationProvidedRole it) -> {
        return Boolean.valueOf((Objects.equal(it.getProvidedInterface__OperationProvidedRole(), interfaze) && Objects.equal(it.getProvidingEntity_ProvidedRole(), basicCom)));
      };
      final OperationProvidedRole role = IterableExtensions.<OperationProvidedRole>findFirst(opRoles, _function);
      if ((role != null)) {
        _routinesFacade.removeOperationProvidedRole(role);
      }
    }
  }
  
  public CheckRemovalOfOperationProvidedRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.classifiers.Class clazz, final Classifier classifierRef) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationProvidedRole.CheckRemovalOfOperationProvidedRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.clazz = clazz;this.classifierRef = classifierRef;
  }
  
  private org.emftext.language.java.classifiers.Class clazz;
  
  private Classifier classifierRef;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckRemovalOfOperationProvidedRoleRoutine with input:");
    	getLogger().trace("   clazz: " + this.clazz);
    	getLogger().trace("   classifierRef: " + this.classifierRef);
    }
    
    org.palladiosimulator.pcm.repository.OperationInterface interfaze = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceInterfaze(clazz, classifierRef), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (interfaze == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.BasicComponent basicCom = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceBasicCom(clazz, classifierRef, interfaze), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.BasicComponent.class,
    	(org.palladiosimulator.pcm.repository.BasicComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (basicCom == null) {
    	return false;
    }
    List<org.palladiosimulator.pcm.repository.OperationProvidedRole> opRoles = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceOpRoles(clazz, classifierRef, interfaze, basicCom), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationProvidedRole.class,
    	(org.palladiosimulator.pcm.repository.OperationProvidedRole _element) -> true, // correspondence precondition checker
    	null
    );
    userExecution.callRoutine1(clazz, classifierRef, interfaze, basicCom, opRoles, this.getRoutinesFacade());
    
    return true;
  }
}
