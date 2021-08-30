package mir.routines.commonDataType;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.InnerDeclaration;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.applications.pcmjava.util.java2pcm.TypeReferenceCorrespondenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class ChangeInnerDeclarationTypeRoutine extends AbstractRepairRoutineRealization {
  private ChangeInnerDeclarationTypeRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceInnerDeclaration(final TypeReference typeReference, final Field javaField) {
      return javaField;
    }
    
    public InnerDeclaration getElement1(final TypeReference typeReference, final Field javaField, final InnerDeclaration innerDeclaration, final Repository repository) {
      return innerDeclaration;
    }
    
    public void update0Element(final TypeReference typeReference, final Field javaField, final InnerDeclaration innerDeclaration, final Repository repository) {
      innerDeclaration.setDatatype_InnerDeclaration(TypeReferenceCorrespondenceHelper.getDataTypeFromTypeReference(typeReference, this.executionState.getCorrespondenceModel(), this.executionState.getUserInteractor(), repository));
    }
    
    public void callRoutine2(final TypeReference typeReference, final Field javaField, final InnerDeclaration innerDeclaration, final Repository repository, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.checkInnerDeclarationsCreation(innerDeclaration.getDatatype_InnerDeclaration(), typeReference);
    }
    
    public EObject getCorrepondenceSourceRepository(final TypeReference typeReference, final Field javaField, final InnerDeclaration innerDeclaration) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
    
    public void callRoutine1(final TypeReference typeReference, final Field javaField, final InnerDeclaration innerDeclaration, final Repository repository, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.checkCollectionDataTypeCreation(typeReference);
    }
  }
  
  public ChangeInnerDeclarationTypeRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final TypeReference typeReference, final Field javaField) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.ChangeInnerDeclarationTypeRoutine.ActionUserExecution(getExecutionState(), this);
    this.typeReference = typeReference;this.javaField = javaField;
  }
  
  private TypeReference typeReference;
  
  private Field javaField;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine ChangeInnerDeclarationTypeRoutine with input:");
    	getLogger().trace("   typeReference: " + this.typeReference);
    	getLogger().trace("   javaField: " + this.javaField);
    }
    
    org.palladiosimulator.pcm.repository.InnerDeclaration innerDeclaration = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceInnerDeclaration(typeReference, javaField), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.InnerDeclaration.class,
    	(org.palladiosimulator.pcm.repository.InnerDeclaration _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (innerDeclaration == null) {
    	return false;
    }
    org.palladiosimulator.pcm.repository.Repository repository = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRepository(typeReference, javaField, innerDeclaration), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (repository == null) {
    	return false;
    }
    userExecution.callRoutine1(typeReference, javaField, innerDeclaration, repository, this.getRoutinesFacade());
    
    // val updatedElement userExecution.getElement1(typeReference, javaField, innerDeclaration, repository);
    userExecution.update0Element(typeReference, javaField, innerDeclaration, repository);
    
    userExecution.callRoutine2(typeReference, javaField, innerDeclaration, repository, this.getRoutinesFacade());
    
    return true;
  }
}
