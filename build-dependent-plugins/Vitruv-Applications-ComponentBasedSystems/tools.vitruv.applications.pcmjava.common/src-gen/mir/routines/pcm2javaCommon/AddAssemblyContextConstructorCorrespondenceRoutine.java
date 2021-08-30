package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.instantiations.NewConstructorCall;
import org.emftext.language.java.members.Constructor;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddAssemblyContextConstructorCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private AddAssemblyContextConstructorCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final AssemblyContext assemblyContext, final Constructor constructor, final NewConstructorCall constructorCall) {
      return constructorCall;
    }
    
    public EObject getElement4(final AssemblyContext assemblyContext, final Constructor constructor, final NewConstructorCall constructorCall) {
      return assemblyContext;
    }
    
    public EObject getElement2(final AssemblyContext assemblyContext, final Constructor constructor, final NewConstructorCall constructorCall) {
      return assemblyContext;
    }
    
    public EObject getElement3(final AssemblyContext assemblyContext, final Constructor constructor, final NewConstructorCall constructorCall) {
      return constructor;
    }
  }
  
  public AddAssemblyContextConstructorCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final AssemblyContext assemblyContext, final Constructor constructor, final NewConstructorCall constructorCall) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddAssemblyContextConstructorCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.assemblyContext = assemblyContext;this.constructor = constructor;this.constructorCall = constructorCall;
  }
  
  private AssemblyContext assemblyContext;
  
  private Constructor constructor;
  
  private NewConstructorCall constructorCall;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddAssemblyContextConstructorCorrespondenceRoutine with input:");
    	getLogger().trace("   assemblyContext: " + this.assemblyContext);
    	getLogger().trace("   constructor: " + this.constructor);
    	getLogger().trace("   constructorCall: " + this.constructorCall);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(assemblyContext, constructor, constructorCall), userExecution.getElement2(assemblyContext, constructor, constructorCall), "");
    
    addCorrespondenceBetween(userExecution.getElement3(assemblyContext, constructor, constructorCall), userExecution.getElement4(assemblyContext, constructor, constructorCall), "");
    
    return true;
  }
}
