package mir.routines.commonSignature;

import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.members.ClassMethod;
import tools.vitruv.applications.util.temporary.java.JavaTypeUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateSeffFromImplementingInterfacesRoutine extends AbstractRepairRoutineRealization {
  private CreateSeffFromImplementingInterfacesRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass) {
      return classMethod;
    }
    
    public void callRoutine1(final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass, @Extension final RoutinesFacade _routinesFacade) {
      final ArrayList<Interface> implementingInterfaces = JavaTypeUtil.findImplementingInterfacesFromTypeRefs(javaClass.getImplements());
      for (final Interface implementingInterface : implementingInterfaces) {
        _routinesFacade.createSeffFromImplementingInterface(classMethod, javaClass, implementingInterface);
      }
    }
  }
  
  public CreateSeffFromImplementingInterfacesRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ClassMethod classMethod, final org.emftext.language.java.classifiers.Class javaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonSignature.CreateSeffFromImplementingInterfacesRoutine.ActionUserExecution(getExecutionState(), this);
    this.classMethod = classMethod;this.javaClass = javaClass;
  }
  
  private ClassMethod classMethod;
  
  private org.emftext.language.java.classifiers.Class javaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateSeffFromImplementingInterfacesRoutine with input:");
    	getLogger().trace("   classMethod: " + this.classMethod);
    	getLogger().trace("   javaClass: " + this.javaClass);
    }
    
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(classMethod, javaClass), // correspondence source supplier
    	org.palladiosimulator.pcm.seff.ResourceDemandingSEFF.class,
    	(org.palladiosimulator.pcm.seff.ResourceDemandingSEFF _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(classMethod, javaClass, this.getRoutinesFacade());
    
    return true;
  }
}
