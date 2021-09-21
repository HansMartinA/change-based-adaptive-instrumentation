package mir.routines.commonDataType;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.Origin;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Member;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.DataType;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckInnerDeclarationsCreationRoutine extends AbstractRepairRoutineRealization {
  private CheckInnerDeclarationsCreationRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final DataType type, final TypeReference typeRef, @Extension final RoutinesFacade _routinesFacade) {
      final Type refTarget = typeRef.getTarget();
      Origin _origin = refTarget.getContainingCompilationUnit().getOrigin();
      boolean _tripleNotEquals = (_origin != Origin.FILE);
      if (_tripleNotEquals) {
        return;
      }
      if (((type instanceof CompositeDataType) && (refTarget instanceof ConcreteClassifier))) {
        EList<Member> _members = ((ConcreteClassifier) refTarget).getMembers();
        for (final Member mem : _members) {
          if ((mem instanceof Field)) {
            _routinesFacade.createInnerDeclaration(((CompositeDataType) type), ((Field)mem));
          }
        }
      }
    }
  }
  
  public CheckInnerDeclarationsCreationRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final DataType type, final TypeReference typeRef) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.CheckInnerDeclarationsCreationRoutine.ActionUserExecution(getExecutionState(), this);
    this.type = type;this.typeRef = typeRef;
  }
  
  private DataType type;
  
  private TypeReference typeRef;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckInnerDeclarationsCreationRoutine with input:");
    	getLogger().trace("   type: " + this.type);
    	getLogger().trace("   typeRef: " + this.typeRef);
    }
    
    userExecution.callRoutine1(type, typeRef, this.getRoutinesFacade());
    
    return true;
  }
}
