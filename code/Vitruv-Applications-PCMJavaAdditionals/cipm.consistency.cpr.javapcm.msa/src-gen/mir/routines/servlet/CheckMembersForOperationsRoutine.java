package mir.routines.servlet;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.members.Method;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckMembersForOperationsRoutine extends AbstractRepairRoutineRealization {
  private CheckMembersForOperationsRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final ConcreteClassifier classifier, @Extension final RoutinesFacade _routinesFacade) {
      EList<Member> _members = classifier.getMembers();
      for (final Member mem : _members) {
        if ((mem instanceof Method)) {
          boolean _isPublic = ((Method)mem).isPublic();
          if (_isPublic) {
            _routinesFacade.createOrFindPCMSignature(((Method)mem));
          }
        }
      }
    }
  }
  
  public CheckMembersForOperationsRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier classifier) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.servlet.CheckMembersForOperationsRoutine.ActionUserExecution(getExecutionState(), this);
    this.classifier = classifier;
  }
  
  private ConcreteClassifier classifier;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckMembersForOperationsRoutine with input:");
    	getLogger().trace("   classifier: " + this.classifier);
    }
    
    userExecution.callRoutine1(classifier, this.getRoutinesFacade());
    
    return true;
  }
}
