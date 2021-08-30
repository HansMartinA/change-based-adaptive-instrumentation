package mir.routines.commonDataType;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.types.Type;
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
public class CreateOrFindCollectionDataTypeRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindCollectionDataTypeRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceDataTypes(final TypeReference typeRef, final TypeReference innerDeclaration) {
      Type _target = typeRef.getTarget();
      return _target;
    }
    
    public EObject getCorrepondenceSourceRepo(final TypeReference typeRef, final TypeReference innerDeclaration, final List<CollectionDataType> dataTypes) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
    
    public void callRoutine1(final TypeReference typeRef, final TypeReference innerDeclaration, final List<CollectionDataType> dataTypes, final Repository repo, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.checkCollectionDataTypeCreation(innerDeclaration);
      final DataType innerType = TypeReferenceCorrespondenceHelper.getDataTypeFromTypeReference(innerDeclaration, this.executionState.getCorrespondenceModel(), this.executionState.getUserInteractor(), repo);
      for (final CollectionDataType collType : dataTypes) {
        DataType _innerType_CollectionDataType = collType.getInnerType_CollectionDataType();
        boolean _tripleEquals = (_innerType_CollectionDataType == innerType);
        if (_tripleEquals) {
          return;
        }
      }
      _routinesFacade.createCollectionDataType(typeRef, innerType);
    }
  }
  
  public CreateOrFindCollectionDataTypeRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final TypeReference typeRef, final TypeReference innerDeclaration) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.CreateOrFindCollectionDataTypeRoutine.ActionUserExecution(getExecutionState(), this);
    this.typeRef = typeRef;this.innerDeclaration = innerDeclaration;
  }
  
  private TypeReference typeRef;
  
  private TypeReference innerDeclaration;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindCollectionDataTypeRoutine with input:");
    	getLogger().trace("   typeRef: " + this.typeRef);
    	getLogger().trace("   innerDeclaration: " + this.innerDeclaration);
    }
    
    List<org.palladiosimulator.pcm.repository.CollectionDataType> dataTypes = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceDataTypes(typeRef, innerDeclaration), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.CollectionDataType.class,
    	(org.palladiosimulator.pcm.repository.CollectionDataType _element) -> true, // correspondence precondition checker
    	null
    );
    org.palladiosimulator.pcm.repository.Repository repo = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRepo(typeRef, innerDeclaration, dataTypes), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (repo == null) {
    	return false;
    }
    userExecution.callRoutine1(typeRef, innerDeclaration, dataTypes, repo, this.getRoutinesFacade());
    
    return true;
  }
}
