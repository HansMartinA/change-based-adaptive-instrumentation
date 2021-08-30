package mir.routines.pcm2javaCommon;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.CompilationUnit;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class DeleteJavaClassifierRoutine extends AbstractRepairRoutineRealization {
  private DeleteJavaClassifierRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final NamedElement sourceElement, final ConcreteClassifier javaClassifier, final CompilationUnit compilationUnit) {
      return javaClassifier;
    }
    
    public EObject getElement2(final NamedElement sourceElement, final ConcreteClassifier javaClassifier, final CompilationUnit compilationUnit) {
      return compilationUnit;
    }
    
    public EObject getCorrepondenceSourceJavaClassifier(final NamedElement sourceElement) {
      return sourceElement;
    }
    
    public EObject getCorrepondenceSourceCompilationUnit(final NamedElement sourceElement, final ConcreteClassifier javaClassifier) {
      return sourceElement;
    }
  }
  
  public DeleteJavaClassifierRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final NamedElement sourceElement) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.DeleteJavaClassifierRoutine.ActionUserExecution(getExecutionState(), this);
    this.sourceElement = sourceElement;
  }
  
  private NamedElement sourceElement;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine DeleteJavaClassifierRoutine with input:");
    	getLogger().trace("   sourceElement: " + this.sourceElement);
    }
    
    org.emftext.language.java.classifiers.ConcreteClassifier javaClassifier = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceJavaClassifier(sourceElement), // correspondence source supplier
    	org.emftext.language.java.classifiers.ConcreteClassifier.class,
    	(org.emftext.language.java.classifiers.ConcreteClassifier _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (javaClassifier == null) {
    	return false;
    }
    org.emftext.language.java.containers.CompilationUnit compilationUnit = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceCompilationUnit(sourceElement, javaClassifier), // correspondence source supplier
    	org.emftext.language.java.containers.CompilationUnit.class,
    	(org.emftext.language.java.containers.CompilationUnit _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (compilationUnit == null) {
    	return false;
    }
    Stream.of(new Object[] {sourceElement, javaClassifier, compilationUnit})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(sourceElement, javaClassifier, compilationUnit), accessibleElement, null));		
    deleteObject(userExecution.getElement1(sourceElement, javaClassifier, compilationUnit));
    
    Stream.of(new Object[] {sourceElement, javaClassifier, compilationUnit})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement2(sourceElement, javaClassifier, compilationUnit), accessibleElement, null));		
    deleteObject(userExecution.getElement2(sourceElement, javaClassifier, compilationUnit));
    
    return true;
  }
}
