package mir.routines.pcm2javaCommon;

import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveCorrespondingParameterFromConstructorRoutine extends AbstractRepairRoutineRealization {
  private RemoveCorrespondingParameterFromConstructorRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final Constructor ctor, final NamedElement correspondenceSource, final OrdinaryParameter param) {
      return param;
    }
    
    public boolean getCorrespondingModelElementsPreconditionParam(final Constructor ctor, final NamedElement correspondenceSource, final OrdinaryParameter param) {
      boolean _contains = ctor.getParameters().contains(param);
      return _contains;
    }
    
    public EObject getCorrepondenceSourceParam(final Constructor ctor, final NamedElement correspondenceSource) {
      return correspondenceSource;
    }
  }
  
  public RemoveCorrespondingParameterFromConstructorRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Constructor ctor, final NamedElement correspondenceSource) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.RemoveCorrespondingParameterFromConstructorRoutine.ActionUserExecution(getExecutionState(), this);
    this.ctor = ctor;this.correspondenceSource = correspondenceSource;
  }
  
  private Constructor ctor;
  
  private NamedElement correspondenceSource;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveCorrespondingParameterFromConstructorRoutine with input:");
    	getLogger().trace("   ctor: " + this.ctor);
    	getLogger().trace("   correspondenceSource: " + this.correspondenceSource);
    }
    
    org.emftext.language.java.parameters.OrdinaryParameter param = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceParam(ctor, correspondenceSource), // correspondence source supplier
    	org.emftext.language.java.parameters.OrdinaryParameter.class,
    	(org.emftext.language.java.parameters.OrdinaryParameter _element) -> userExecution.getCorrespondingModelElementsPreconditionParam(ctor, correspondenceSource, _element), // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (param == null) {
    	return false;
    }
    Stream.of(new Object[] {ctor, correspondenceSource, param})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(ctor, correspondenceSource, param), accessibleElement, null));		
    deleteObject(userExecution.getElement1(ctor, correspondenceSource, param));
    
    return true;
  }
}
