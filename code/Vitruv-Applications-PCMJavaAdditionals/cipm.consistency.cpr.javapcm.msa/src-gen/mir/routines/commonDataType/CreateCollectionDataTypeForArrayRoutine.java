package mir.routines.commonDataType;

import cipm.consistency.cpr.javapcm.internal.InternalUtility;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateCollectionDataTypeForArrayRoutine extends AbstractRepairRoutineRealization {
  private CreateCollectionDataTypeForArrayRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public Repository getElement1(final DataType innerType, final Repository repo, final CollectionDataType collectionType) {
      return repo;
    }
    
    public void update0Element(final DataType innerType, final Repository repo, final CollectionDataType collectionType) {
      EList<DataType> _dataTypes__Repository = repo.getDataTypes__Repository();
      _dataTypes__Repository.add(collectionType);
    }
    
    public void updateCollectionTypeElement(final DataType innerType, final Repository repo, final CollectionDataType collectionType) {
      String _convertToName = InternalUtility.convertToName(innerType);
      String _plus = ("Array_of_" + _convertToName);
      collectionType.setEntityName(_plus);
      collectionType.setInnerType_CollectionDataType(innerType);
    }
    
    public EObject getCorrepondenceSourceRepo(final DataType innerType) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
  }
  
  public CreateCollectionDataTypeForArrayRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final DataType innerType) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.CreateCollectionDataTypeForArrayRoutine.ActionUserExecution(getExecutionState(), this);
    this.innerType = innerType;
  }
  
  private DataType innerType;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateCollectionDataTypeForArrayRoutine with input:");
    	getLogger().trace("   innerType: " + this.innerType);
    }
    
    org.palladiosimulator.pcm.repository.Repository repo = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRepo(innerType), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (repo == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.CollectionDataType collectionType = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createCollectionDataType();
    notifyObjectCreated(collectionType);
    userExecution.updateCollectionTypeElement(innerType, repo, collectionType);
    
    // val updatedElement userExecution.getElement1(innerType, repo, collectionType);
    userExecution.update0Element(innerType, repo, collectionType);
    
    return true;
  }
}
