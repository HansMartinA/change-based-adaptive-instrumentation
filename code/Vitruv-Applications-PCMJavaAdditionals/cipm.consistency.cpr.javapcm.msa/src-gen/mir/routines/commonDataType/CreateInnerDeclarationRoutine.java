package mir.routines.commonDataType;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.members.Field;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.applications.pcmjava.util.java2pcm.TypeReferenceCorrespondenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateInnerDeclarationRoutine extends AbstractRepairRoutineRealization {
  private CreateInnerDeclarationRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final CompositeDataType dataType, final Field javaField, final Repository repository, final InnerDeclaration innerDeclaration) {
      return innerDeclaration;
    }
    
    public EObject getCorrepondenceSource1(final CompositeDataType dataType, final Field javaField) {
      return javaField;
    }
    
    public EObject getElement2(final CompositeDataType dataType, final Field javaField, final Repository repository, final InnerDeclaration innerDeclaration) {
      return javaField;
    }
    
    public void callRoutine2(final CompositeDataType dataType, final Field javaField, final Repository repository, final InnerDeclaration innerDeclaration, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.checkInnerDeclarationsCreation(innerDeclaration.getDatatype_InnerDeclaration(), javaField.getTypeReference());
    }
    
    public void updateInnerDeclarationElement(final CompositeDataType dataType, final Field javaField, final Repository repository, final InnerDeclaration innerDeclaration) {
      innerDeclaration.setEntityName(javaField.getName());
      innerDeclaration.setDatatype_InnerDeclaration(TypeReferenceCorrespondenceHelper.getDataTypeFromTypeReference(javaField.getTypeReference(), this.executionState.getCorrespondenceModel(), 
        this.executionState.getUserInteractor(), repository));
      innerDeclaration.setCompositeDataType_InnerDeclaration(dataType);
    }
    
    public EObject getCorrepondenceSourceRepository(final CompositeDataType dataType, final Field javaField) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
    
    public void callRoutine1(final CompositeDataType dataType, final Field javaField, final Repository repository, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.checkCollectionDataTypeCreation(javaField.getTypeReference());
    }
  }
  
  public CreateInnerDeclarationRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final CompositeDataType dataType, final Field javaField) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.CreateInnerDeclarationRoutine.ActionUserExecution(getExecutionState(), this);
    this.dataType = dataType;this.javaField = javaField;
  }
  
  private CompositeDataType dataType;
  
  private Field javaField;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateInnerDeclarationRoutine with input:");
    	getLogger().trace("   dataType: " + this.dataType);
    	getLogger().trace("   javaField: " + this.javaField);
    }
    
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(dataType, javaField), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.InnerDeclaration.class,
    	(org.palladiosimulator.pcm.repository.InnerDeclaration _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.Repository repository = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRepository(dataType, javaField), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (repository == null) {
    	return false;
    }
    userExecution.callRoutine1(dataType, javaField, repository, this.getRoutinesFacade());
    
    org.palladiosimulator.pcm.repository.InnerDeclaration innerDeclaration = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createInnerDeclaration();
    notifyObjectCreated(innerDeclaration);
    userExecution.updateInnerDeclarationElement(dataType, javaField, repository, innerDeclaration);
    
    addCorrespondenceBetween(userExecution.getElement1(dataType, javaField, repository, innerDeclaration), userExecution.getElement2(dataType, javaField, repository, innerDeclaration), "");
    
    userExecution.callRoutine2(dataType, javaField, repository, innerDeclaration, this.getRoutinesFacade());
    
    return true;
  }
}
