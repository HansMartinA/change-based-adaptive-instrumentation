package mir.routines.java2PcmMethod;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.Field;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddAssemblyContextCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private AddAssemblyContextCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final AssemblyContext assemblyContext, final Field javaField) {
      return assemblyContext;
    }
    
    public EObject getElement2(final AssemblyContext assemblyContext, final Field javaField) {
      return javaField;
    }
  }
  
  public AddAssemblyContextCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final AssemblyContext assemblyContext, final Field javaField) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmMethod.AddAssemblyContextCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.assemblyContext = assemblyContext;this.javaField = javaField;
  }
  
  private AssemblyContext assemblyContext;
  
  private Field javaField;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddAssemblyContextCorrespondenceRoutine with input:");
    	getLogger().trace("   assemblyContext: " + this.assemblyContext);
    	getLogger().trace("   javaField: " + this.javaField);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(assemblyContext, javaField), userExecution.getElement2(assemblyContext, javaField), "");
    
    return true;
  }
}
