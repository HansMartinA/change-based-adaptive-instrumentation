package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.applications.util.temporary.java.JavaContainerAndClassifierUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindJavaClassRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindJavaClassRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final NamedElement pcmElement, final org.emftext.language.java.containers.Package containingPackage, final String className) {
      return pcmElement;
    }
    
    public void callRoutine1(final NamedElement pcmElement, final org.emftext.language.java.containers.Package containingPackage, final String className, @Extension final RoutinesFacade _routinesFacade) {
      final org.emftext.language.java.classifiers.Class foundClass = JavaContainerAndClassifierUtil.<org.emftext.language.java.classifiers.Class>findClassifier(className, containingPackage, org.emftext.language.java.classifiers.Class.class);
      if ((foundClass == null)) {
        _routinesFacade.createJavaClass(pcmElement, containingPackage, className);
      } else {
        _routinesFacade.addMissingClassifierCorrespondence(pcmElement, foundClass);
      }
    }
  }
  
  public CreateOrFindJavaClassRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final NamedElement pcmElement, final org.emftext.language.java.containers.Package containingPackage, final String className) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateOrFindJavaClassRoutine.ActionUserExecution(getExecutionState(), this);
    this.pcmElement = pcmElement;this.containingPackage = containingPackage;this.className = className;
  }
  
  private NamedElement pcmElement;
  
  private org.emftext.language.java.containers.Package containingPackage;
  
  private String className;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindJavaClassRoutine with input:");
    	getLogger().trace("   pcmElement: " + this.pcmElement);
    	getLogger().trace("   containingPackage: " + this.containingPackage);
    	getLogger().trace("   className: " + this.className);
    }
    
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(pcmElement, containingPackage, className), // correspondence source supplier
    	org.emftext.language.java.classifiers.Class.class,
    	(org.emftext.language.java.classifiers.Class _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(pcmElement, containingPackage, className, this.getRoutinesFacade());
    
    return true;
  }
}
