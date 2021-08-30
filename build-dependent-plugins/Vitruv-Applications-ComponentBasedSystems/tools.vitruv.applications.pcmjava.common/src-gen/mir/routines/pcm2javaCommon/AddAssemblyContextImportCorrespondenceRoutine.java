package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.imports.ClassifierImport;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddAssemblyContextImportCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private AddAssemblyContextImportCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final AssemblyContext assemblyContext, final ClassifierImport contextClassImport) {
      return contextClassImport;
    }
    
    public EObject getElement2(final AssemblyContext assemblyContext, final ClassifierImport contextClassImport) {
      return assemblyContext;
    }
  }
  
  public AddAssemblyContextImportCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final AssemblyContext assemblyContext, final ClassifierImport contextClassImport) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddAssemblyContextImportCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.assemblyContext = assemblyContext;this.contextClassImport = contextClassImport;
  }
  
  private AssemblyContext assemblyContext;
  
  private ClassifierImport contextClassImport;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddAssemblyContextImportCorrespondenceRoutine with input:");
    	getLogger().trace("   assemblyContext: " + this.assemblyContext);
    	getLogger().trace("   contextClassImport: " + this.contextClassImport);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(assemblyContext, contextClassImport), userExecution.getElement2(assemblyContext, contextClassImport), "");
    
    return true;
  }
}
