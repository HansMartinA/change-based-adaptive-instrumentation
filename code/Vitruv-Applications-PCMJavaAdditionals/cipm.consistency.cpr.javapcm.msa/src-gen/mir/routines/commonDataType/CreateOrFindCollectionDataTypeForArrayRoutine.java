package mir.routines.commonDataType;

import com.google.common.collect.Iterables;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.applications.pcmjava.util.java2pcm.TypeReferenceCorrespondenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindCollectionDataTypeForArrayRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindCollectionDataTypeForArrayRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceRepo(final TypeReference elementType) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
    
    public void callRoutine1(final TypeReference elementType, final Repository repo, @Extension final RoutinesFacade _routinesFacade) {
      final DataType innerType = TypeReferenceCorrespondenceHelper.getDataTypeFromTypeReference(elementType, this.executionState.getCorrespondenceModel(), this.executionState.getUserInteractor(), repo);
      final Function1<CollectionDataType, Boolean> _function = (CollectionDataType it) -> {
        return Boolean.valueOf(((it.getInnerType_CollectionDataType() == innerType) && it.getEntityName().startsWith("Array_of_")));
      };
      final Iterable<CollectionDataType> types = IterableExtensions.<CollectionDataType>filter(Iterables.<CollectionDataType>filter(repo.getDataTypes__Repository(), CollectionDataType.class), _function);
      int _size = IterableExtensions.size(types);
      boolean _tripleEquals = (_size == 0);
      if (_tripleEquals) {
        _routinesFacade.createCollectionDataTypeForArray(innerType);
      }
    }
  }
  
  public CreateOrFindCollectionDataTypeForArrayRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final TypeReference elementType) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.CreateOrFindCollectionDataTypeForArrayRoutine.ActionUserExecution(getExecutionState(), this);
    this.elementType = elementType;
  }
  
  private TypeReference elementType;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindCollectionDataTypeForArrayRoutine with input:");
    	getLogger().trace("   elementType: " + this.elementType);
    }
    
    org.palladiosimulator.pcm.repository.Repository repo = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRepo(elementType), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (repo == null) {
    	return false;
    }
    userExecution.callRoutine1(elementType, repo, this.getRoutinesFacade());
    
    return true;
  }
}
