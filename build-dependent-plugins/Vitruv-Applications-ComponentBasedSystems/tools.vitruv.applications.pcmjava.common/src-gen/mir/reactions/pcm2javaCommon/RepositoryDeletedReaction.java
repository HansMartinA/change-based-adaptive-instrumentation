package mir.reactions.pcm2javaCommon;

import com.google.common.collect.Iterables;
import mir.routines.pcm2javaCommon.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.Repository;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionRealization;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.framework.change.echange.EChange;
import tools.vitruv.framework.change.echange.eobject.DeleteEObject;
import tools.vitruv.framework.change.echange.root.RemoveRootEObject;

@SuppressWarnings("all")
public class RepositoryDeletedReaction extends AbstractReactionRealization {
  private RemoveRootEObject<Repository> removeChange;
  
  private DeleteEObject<Repository> deleteChange;
  
  private int currentlyMatchedChange;
  
  public RepositoryDeletedReaction(final RoutinesFacade routinesFacade) {
    super(routinesFacade);
  }
  
  public void executeReaction(final EChange change) {
    if (!checkPrecondition(change)) {
    	return;
    }
    org.palladiosimulator.pcm.repository.Repository oldValue = removeChange.getOldValue();
    int index = removeChange.getIndex();
    				
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Passed complete precondition check of Reaction " + this.getClass().getName());
    }
    				
    mir.reactions.pcm2javaCommon.RepositoryDeletedReaction.ActionUserExecution userExecution = new mir.reactions.pcm2javaCommon.RepositoryDeletedReaction.ActionUserExecution(this.executionState, this);
    userExecution.callRoutine1(removeChange, oldValue, index, this.getRoutinesFacade());
    
    resetChanges();
  }
  
  private boolean matchDeleteChange(final EChange change) {
    if (change instanceof DeleteEObject<?>) {
    	DeleteEObject<org.palladiosimulator.pcm.repository.Repository> _localTypedChange = (DeleteEObject<org.palladiosimulator.pcm.repository.Repository>) change;
    	if (!(_localTypedChange.getAffectedEObject() instanceof org.palladiosimulator.pcm.repository.Repository)) {
    		return false;
    	}
    	this.deleteChange = (DeleteEObject<org.palladiosimulator.pcm.repository.Repository>) change;
    	return true;
    }
    
    return false;
  }
  
  private void resetChanges() {
    removeChange = null;
    deleteChange = null;
    currentlyMatchedChange = 0;
  }
  
  private boolean matchRemoveChange(final EChange change) {
    if (change instanceof RemoveRootEObject<?>) {
    	RemoveRootEObject<org.palladiosimulator.pcm.repository.Repository> _localTypedChange = (RemoveRootEObject<org.palladiosimulator.pcm.repository.Repository>) change;
    	if (!(_localTypedChange.getOldValue() instanceof org.palladiosimulator.pcm.repository.Repository)) {
    		return false;
    	}
    	this.removeChange = (RemoveRootEObject<org.palladiosimulator.pcm.repository.Repository>) change;
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
    	return false; // Only proceed on the last of the expected changes
    }
    if (currentlyMatchedChange == 1) {
    	if (!matchDeleteChange(change)) {
    		resetChanges();
    		checkPrecondition(change); // Reexecute to potentially register this as first change
    		return false;
    	} else {
    		currentlyMatchedChange++;
    	}
    }
    
    return true;
  }
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final RemoveRootEObject removeChange, final Repository oldValue, final int index, @Extension final RoutinesFacade _routinesFacade) {
      Iterable<BasicComponent> _filter = Iterables.<BasicComponent>filter(oldValue.getComponents__Repository(), BasicComponent.class);
      for (final BasicComponent component : _filter) {
        {
          _routinesFacade.deleteJavaClassifier(component);
          _routinesFacade.deleteJavaPackage(component, "");
        }
      }
      Iterable<OperationInterface> _filter_1 = Iterables.<OperationInterface>filter(oldValue.getInterfaces__Repository(), OperationInterface.class);
      for (final OperationInterface interface_ : _filter_1) {
        _routinesFacade.deleteJavaClassifier(interface_);
      }
      Iterable<CompositeDataType> _filter_2 = Iterables.<CompositeDataType>filter(oldValue.getDataTypes__Repository(), CompositeDataType.class);
      for (final CompositeDataType dataType : _filter_2) {
        _routinesFacade.deleteJavaClassifier(dataType);
      }
      Iterable<CollectionDataType> _filter_3 = Iterables.<CollectionDataType>filter(oldValue.getDataTypes__Repository(), CollectionDataType.class);
      for (final CollectionDataType dataType_1 : _filter_3) {
        _routinesFacade.deleteJavaClassifier(dataType_1);
      }
      _routinesFacade.deleteJavaPackage(oldValue, "repository_root");
      _routinesFacade.deleteJavaPackage(oldValue, "contracts");
      _routinesFacade.deleteJavaPackage(oldValue, "datatypes");
    }
  }
}
