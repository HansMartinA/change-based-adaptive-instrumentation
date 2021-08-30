package mir.routines.java2PcmMethod;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.Member;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RenameMemberRoutine extends AbstractRepairRoutineRealization {
  private RenameMemberRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public NamedElement getElement1(final Member javaMember, final NamedElement pcmElement) {
      return pcmElement;
    }
    
    public void update0Element(final Member javaMember, final NamedElement pcmElement) {
      pcmElement.setEntityName(javaMember.getName());
    }
    
    public EObject getCorrepondenceSourcePcmElement(final Member javaMember) {
      return javaMember;
    }
  }
  
  public RenameMemberRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Member javaMember) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmMethod.RenameMemberRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaMember = javaMember;
  }
  
  private Member javaMember;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RenameMemberRoutine with input:");
    	getLogger().trace("   javaMember: " + this.javaMember);
    }
    
    org.palladiosimulator.pcm.core.entity.NamedElement pcmElement = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmElement(javaMember), // correspondence source supplier
    	org.palladiosimulator.pcm.core.entity.NamedElement.class,
    	(org.palladiosimulator.pcm.core.entity.NamedElement _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (pcmElement == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(javaMember, pcmElement);
    userExecution.update0Element(javaMember, pcmElement);
    
    return true;
  }
}
