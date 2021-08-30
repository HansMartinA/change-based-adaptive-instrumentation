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
public class CheckClassifierForImportedRequiredRolesRoutine extends AbstractRepairRoutineRealization {
  private CheckClassifierForImportedRequiredRolesRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final ConcreteClassifier classifier, @Extension final RoutinesFacade _routinesFacade) {
      EList<Import> _imports = classifier.getContainingCompilationUnit().getImports();
      for (final Import importSt : _imports) {
        _routinesFacade.createOrFindRequiredRoleForImport(importSt, classifier);
      }
    }
  }
  
  public CheckClassifierForImportedRequiredRolesRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier classifier) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonOperationRequiredRole.CheckClassifierForImportedRequiredRolesRoutine.ActionUserExecution(getExecutionState(), this);
    this.classifier = classifier;
  }
  
  private ConcreteClassifier classifier;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckClassifierForImportedRequiredRolesRoutine with input:");
    	getLogger().trace("   classifier: " + this.classifier);
    }
    
    userExecution.callRoutine1(classifier, this.getRoutinesFacade());
    
    return true;
  }
}
