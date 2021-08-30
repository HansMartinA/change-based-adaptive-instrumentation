package mir.routines.commonDataType;

import cipm.consistency.cpr.javapcm.internal.InternalUtility;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.commons.NamedElement;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.CollectionDataType;
import org.palladiosimulator.pcm.repository.DataType;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateCollectionDataTypeRoutine extends AbstractRepairRoutineRealization {
  private CreateCollectionDataTypeRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final TypeReference typeRef, final DataType innerType, final Repository repo, final CollectionDataType collectionType) {
      Type _target = typeRef.getTarget();
      return _target;
    }
    
    public void update0Element(final TypeReference typeRef, final DataType innerType, final Repository repo, final CollectionDataType collectionType) {
      EList<DataType> _dataTypes__Repository = repo.getDataTypes__Repository();
      _dataTypes__Repository.add(collectionType);
    }
    
    public void updateCollectionTypeElement(final TypeReference typeRef, final DataType innerType, final Repository repo, final CollectionDataType collectionType) {
      Type _target = typeRef.getTarget();
      String _name = ((NamedElement) _target).getName();
      String _plus = (_name + "_of_");
      String _convertToName = InternalUtility.convertToName(innerType);
      String _plus_1 = (_plus + _convertToName);
      collectionType.setEntityName(_plus_1);
      collectionType.setInnerType_CollectionDataType(innerType);
    }
    
    public EObject getElement2(final TypeReference typeRef, final DataType innerType, final Repository repo, final CollectionDataType collectionType) {
      return collectionType;
    }
    
    public Repository getElement3(final TypeReference typeRef, final DataType innerType, final Repository repo, final CollectionDataType collectionType) {
      return repo;
    }
    
    public EObject getCorrepondenceSourceRepo(final TypeReference typeRef, final DataType innerType) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
  }
  
  public CreateCollectionDataTypeRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final TypeReference typeRef, final DataType innerType) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.CreateCollectionDataTypeRoutine.ActionUserExecution(getExecutionState(), this);
    this.typeRef = typeRef;this.innerType = innerType;
  }
  
  private TypeReference typeRef;
  
  private DataType innerType;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateCollectionDataTypeRoutine with input:");
    	getLogger().trace("   typeRef: " + this.typeRef);
    	getLogger().trace("   innerType: " + this.innerType);
    }
    
    org.palladiosimulator.pcm.repository.Repository repo = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRepo(typeRef, innerType), // correspondence source supplier
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
    userExecution.updateCollectionTypeElement(typeRef, innerType, repo, collectionType);
    
    addCorrespondenceBetween(userExecution.getElement1(typeRef, innerType, repo, collectionType), userExecution.getElement2(typeRef, innerType, repo, collectionType), "");
    
    // val updatedElement userExecution.getElement3(typeRef, innerType, repo, collectionType);
    userExecution.update0Element(typeRef, innerType, repo, collectionType);
    
    return true;
  }
}
