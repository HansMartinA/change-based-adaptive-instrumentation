package mir.routines.commonOperationRequiredRole;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.imports.Import;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckImportForImportedRequiredRolesRoutine extends AbstractRepairRoutineRealization {
  private CheckImportForImportedRequiredRolesRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final Import importSt, @Extension final RoutinesFacade _routinesFacade) {
      EList<ConcreteClassifier> _classifiers = importSt.getContainingCompilationUnit().getClassifiers();
      for (final ConcreteClassifier classifier : _classifiers) {
        _routinesFacade.createOrFindRequiredRoleForImport(importSt, classifier);
      }
    }
  }
  
  public CheckImportForImportedRequiredRolesRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Import importSt) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.CheckImportForImportedRequiredRolesRoutine.ActionUserExecution(getExecutionState(), this);
    this.importSt = importSt;
  }
  
  private Import importSt;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckImportForImportedRequiredRolesRoutine with input:");
    	getLogger().trace("   importSt: " + this.importSt);
    }
    
    userExecution.callRoutine1(importSt, this.getRoutinesFacade());
    
    return true;
  }
}
