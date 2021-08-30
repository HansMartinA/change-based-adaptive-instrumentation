package mir.routines.commonDataType;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckDataTypeRemovalRoutine extends AbstractRepairRoutineRealization {
  private CheckDataTypeRemovalRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourcePcmRepository(final ConcreteClassifier javaClass) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
    
    public EObject getCorrepondenceSourceCollTypes(final ConcreteClassifier javaClass, final Repository pcmRepository) {
      return javaClass;
    }
    
    public void callRoutine1(final ConcreteClassifier javaClass, final Repository pcmRepository, final List<CollectionDataType> collTypes, @Extension final RoutinesFacade _routinesFacade) {
      final Function1<CompositeDataType, Boolean> _function = (CompositeDataType it) -> {
        String _entityName = it.getEntityName();
        String _name = javaClass.getName();
        return Boolean.valueOf(Objects.equal(_entityName, _name));
      };
      final Consumer<CompositeDataType> _function_1 = (CompositeDataType it) -> {
        _routinesFacade.removeDataType(it);
      };
      IterableExtensions.<CompositeDataType>filter(Iterables.<CompositeDataType>filter(pcmRepository.getDataTypes__Repository(), CompositeDataType.class), _function).forEach(_function_1);
      for (final CollectionDataType type : collTypes) {
        _routinesFacade.removeDataType(type);
      }
    }
  }
  
  public CheckDataTypeRemovalRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier javaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.CheckDataTypeRemovalRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaClass = javaClass;
  }
  
  private ConcreteClassifier javaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckDataTypeRemovalRoutine with input:");
    	getLogger().trace("   javaClass: " + this.javaClass);
    }
    
    org.palladiosimulator.pcm.repository.Repository pcmRepository = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmRepository(javaClass), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmRepository == null) {
    	return false;
    }
    List<org.palladiosimulator.pcm.repository.CollectionDataType> collTypes = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceCollTypes(javaClass, pcmRepository), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.CollectionDataType.class,
    	(org.palladiosimulator.pcm.repository.CollectionDataType _element) -> true, // correspondence precondition checker
    	null
    );
    userExecution.callRoutine1(javaClass, pcmRepository, collTypes, this.getRoutinesFacade());
    
    return true;
  }
}
