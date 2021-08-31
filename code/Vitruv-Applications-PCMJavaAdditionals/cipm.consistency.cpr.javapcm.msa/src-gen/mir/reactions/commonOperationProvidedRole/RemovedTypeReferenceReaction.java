package mir.reactions.commonOperationProvidedRole;

import mir.routines.commonOperationProvidedRole.RoutinesFacade;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.emftext.language.java.types.TypeReference;
import tools.vitruv.applications.util.temporary.java.JavaTypeUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionRealization;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.framework.change.echange.EChange;
import tools.vitruv.framework.change.echange.feature.reference.RemoveEReference;

@SuppressWarnings("all")
public class RemovedTypeReferenceReaction extends AbstractReactionRealization {
  private RemoveEReference<org.emftext.language.java.classifiers.Class, TypeReference> removeChange;
  
  private int currentlyMatchedChange;
  
  public RemovedTypeReferenceReaction(final RoutinesFacade routinesFacade) {
    super(routinesFacade);
  }
  
  public void executeReaction(final EChange change) {
    if (!checkPrecondition(change)) {
    	return;
    }
    org.emftext.language.java.classifiers.Class affectedEObject = removeChange.getAffectedEObject();
    EReference affectedFeature = removeChange.getAffectedFeature();
    org.emftext.language.java.types.TypeReference oldValue = removeChange.getOldValue();
    int index = removeChange.getIndex();
    				
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Passed change matching of Reaction " + this.getClass().getName());
    }
    if (!checkUserDefinedPrecondition(removeChange, affectedEObject, affectedFeature, oldValue, index)) {
    	resetChanges();
    	return;
    }
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Passed complete precondition check of Reaction " + this.getClass().getName());
    }
    				
    mir.reactions.commonOperationProvidedRole.RemovedTypeReferenceReaction.ActionUserExecution userExecution = new mir.reactions.commonOperationProvidedRole.RemovedTypeReferenceReaction.ActionUserExecution(this.executionState, this);
    userExecution.callRoutine1(removeChange, affectedEObject, affectedFeature, oldValue, index, this.getRoutinesFacade());
    
    resetChanges();
  }
  
  private void resetChanges() {
    removeChange = null;
    currentlyMatchedChange = 0;
  }
  
  private boolean matchRemoveChange(final EChange change) {
    if (change instanceof RemoveEReference<?, ?>) {
    	RemoveEReference<org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.TypeReference> _localTypedChange = (RemoveEReference<org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.TypeReference>) change;
    	if (!(_localTypedChange.getAffectedEObject() instanceof org.emftext.language.java.classifiers.Class)) {
    		return false;
    	}
    	if (!_localTypedChange.getAffectedFeature().getName().equals("implements")) {
    		return false;
    	}
    	if (!(_localTypedChange.getOldValue() instanceof org.emftext.language.java.types.TypeReference)) {
    		return false;
    	}
    	this.removeChange = (RemoveEReference<org.emftext.language.java.classifiers.Class, org.emftext.language.java.types.TypeReference>) change;
    	return true;
    }
    
    return false;
  }
  
  public boolean checkPrecondition(final EChange change) {
    if (currentlyMatchedChange == 0) {
    	if (!matchRemoveChange(change)) {
    		resetChanges();
    		return false;
    	} else {
    		currentlyMatchedChange++;
    	}
    }
    
    return true;
  }
  
  private boolean checkUserDefinedPrecondition(final RemoveEReference removeChange, final org.emftext.language.java.classifiers.Class affectedEObject, final EReference affectedFeature, final TypeReference oldValue, final int index) {
    return ((oldValue instanceof NamespaceClassifierReference) || (oldValue instanceof ClassifierReference));
  }
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final RemoveEReference removeChange, final org.emftext.language.java.classifiers.Class affectedEObject, final EReference affectedFeature, final TypeReference oldValue, final int index, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.checkRemovalOfOperationProvidedRole(affectedEObject, JavaTypeUtil.getNormalizedClassifierFromTypeReference(oldValue));
    }
  }
}
