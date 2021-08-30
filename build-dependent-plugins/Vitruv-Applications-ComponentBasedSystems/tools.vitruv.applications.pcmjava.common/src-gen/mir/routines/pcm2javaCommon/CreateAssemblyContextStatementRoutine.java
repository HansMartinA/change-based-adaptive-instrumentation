package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.instantiations.NewConstructorCall;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.Field;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import tools.vitruv.domains.java.util.JavaModificationUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateAssemblyContextStatementRoutine extends AbstractRepairRoutineRealization {
  private CreateAssemblyContextStatementRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public Constructor getElement1(final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall) {
      return constructor;
    }
    
    public void update0Element(final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall) {
      JavaModificationUtil.createNewForFieldInConstructor(newConstructorCall, constructor, assemblyContextField);
    }
    
    public EObject getElement4(final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall) {
      return constructor;
    }
    
    public EObject getElement5(final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall) {
      return assemblyContext;
    }
    
    public EObject getElement2(final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall) {
      return newConstructorCall;
    }
    
    public EObject getCorrepondenceSourceAssemblyContextField(final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass) {
      return assemblyContext;
    }
    
    public EObject getElement3(final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final Field assemblyContextField, final NewConstructorCall newConstructorCall) {
      return assemblyContext;
    }
  }
  
  public CreateAssemblyContextStatementRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final AssemblyContext assemblyContext, final Constructor constructor, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateAssemblyContextStatementRoutine.ActionUserExecution(getExecutionState(), this);
    this.assemblyContext = assemblyContext;this.constructor = constructor;this.compositeComponentJavaClass = compositeComponentJavaClass;
  }
  
  private AssemblyContext assemblyContext;
  
  private Constructor constructor;
  
  private org.emftext.language.java.classifiers.Class compositeComponentJavaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateAssemblyContextStatementRoutine with input:");
    	getLogger().trace("   assemblyContext: " + this.assemblyContext);
    	getLogger().trace("   constructor: " + this.constructor);
    	getLogger().trace("   compositeComponentJavaClass: " + this.compositeComponentJavaClass);
    }
    
    org.emftext.language.java.members.Field assemblyContextField = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceAssemblyContextField(assemblyContext, constructor, compositeComponentJavaClass), // correspondence source supplier
    	org.emftext.language.java.members.Field.class,
    	(org.emftext.language.java.members.Field _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (assemblyContextField == null) {
    	return false;
    }
    org.emftext.language.java.instantiations.NewConstructorCall newConstructorCall = org.emftext.language.java.instantiations.impl.InstantiationsFactoryImpl.eINSTANCE.createNewConstructorCall();
    notifyObjectCreated(newConstructorCall);
    ;
    
    // val updatedElement userExecution.getElement1(assemblyContext, constructor, compositeComponentJavaClass, assemblyContextField, newConstructorCall);
    userExecution.update0Element(assemblyContext, constructor, compositeComponentJavaClass, assemblyContextField, newConstructorCall);
    
    addCorrespondenceBetween(userExecution.getElement2(assemblyContext, constructor, compositeComponentJavaClass, assemblyContextField, newConstructorCall), userExecution.getElement3(assemblyContext, constructor, compositeComponentJavaClass, assemblyContextField, newConstructorCall), "");
    
    addCorrespondenceBetween(userExecution.getElement4(assemblyContext, constructor, compositeComponentJavaClass, assemblyContextField, newConstructorCall), userExecution.getElement5(assemblyContext, constructor, compositeComponentJavaClass, assemblyContextField, newConstructorCall), "");
    
    return true;
  }
}
