package mir.routines.pcm2javaCommon;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class DeleteJavaPackageRoutine extends AbstractRepairRoutineRealization {
  private DeleteJavaPackageRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final NamedElement sourceElementMappedToPackage, final String expectedTag, final org.emftext.language.java.containers.Package javaPackage) {
      return javaPackage;
    }
    
    public String getRetrieveTag1(final NamedElement sourceElementMappedToPackage, final String expectedTag) {
      return expectedTag;
    }
    
    public EObject getCorrepondenceSourceJavaPackage(final NamedElement sourceElementMappedToPackage, final String expectedTag) {
      return sourceElementMappedToPackage;
    }
  }
  
  public DeleteJavaPackageRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final NamedElement sourceElementMappedToPackage, final String expectedTag) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.DeleteJavaPackageRoutine.ActionUserExecution(getExecutionState(), this);
    this.sourceElementMappedToPackage = sourceElementMappedToPackage;this.expectedTag = expectedTag;
  }
  
  private NamedElement sourceElementMappedToPackage;
  
  private String expectedTag;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine DeleteJavaPackageRoutine with input:");
    	getLogger().trace("   sourceElementMappedToPackage: " + this.sourceElementMappedToPackage);
    	getLogger().trace("   expectedTag: " + this.expectedTag);
    }
    
    org.emftext.language.java.containers.Package javaPackage = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceJavaPackage(sourceElementMappedToPackage, expectedTag), // correspondence source supplier
    	org.emftext.language.java.containers.Package.class,
    	(org.emftext.language.java.containers.Package _element) -> true, // correspondence precondition checker
    	userExecution.getRetrieveTag1(sourceElementMappedToPackage, expectedTag), 
    	false // asserted
    	);
    if (javaPackage == null) {
    	return false;
    }
    Stream.of(new Object[] {sourceElementMappedToPackage, expectedTag, javaPackage})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(sourceElementMappedToPackage, expectedTag, javaPackage), accessibleElement, null));		
    deleteObject(userExecution.getElement1(sourceElementMappedToPackage, expectedTag, javaPackage));
    
    return true;
  }
}
