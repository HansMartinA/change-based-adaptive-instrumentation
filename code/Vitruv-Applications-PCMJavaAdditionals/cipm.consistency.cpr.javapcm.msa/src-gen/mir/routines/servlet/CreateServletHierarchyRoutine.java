package mir.routines.servlet;

import java.io.IOException;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.types.Type;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateServletHierarchyRoutine extends AbstractRepairRoutineRealization {
  private CreateServletHierarchyRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final org.emftext.language.java.classifiers.Class start, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.createInterface(start);
      _routinesFacade.checkMembersForOperations(start);
      boolean _equals = start.getName().equals("GenericServlet");
      if (_equals) {
        Type _target = start.getImplements().get(0).getTarget();
        final ConcreteClassifier servletInterface = ((ConcreteClassifier) _target);
        _routinesFacade.createInterface(servletInterface);
        _routinesFacade.checkMembersForOperations(servletInterface);
        _routinesFacade.connectInterfacesByInheritance(start, servletInterface);
        return;
      }
      Type _target_1 = start.getExtends().getTarget();
      final org.emftext.language.java.classifiers.Class superClass = ((org.emftext.language.java.classifiers.Class) _target_1);
      _routinesFacade.createServletHierarchy(superClass);
      _routinesFacade.connectInterfacesByInheritance(start, superClass);
    }
  }
  
  public CreateServletHierarchyRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.classifiers.Class start) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.servlet.CreateServletHierarchyRoutine.ActionUserExecution(getExecutionState(), this);
    this.start = start;
  }
  
  private org.emftext.language.java.classifiers.Class start;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateServletHierarchyRoutine with input:");
    	getLogger().trace("   start: " + this.start);
    }
    
    userExecution.callRoutine1(start, this.getRoutinesFacade());
    
    return true;
  }
}
