package mir.routines.jaxRS;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckJaxRSInterfaceCreationRoutine extends AbstractRepairRoutineRealization {
  private CheckJaxRSInterfaceCreationRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceCom(final ConcreteClassifier javaInterface) {
      return javaInterface;
    }
    
    public void callRoutine1(final ConcreteClassifier javaInterface, final RepositoryComponent com, @Extension final RoutinesFacade _routinesFacade) {
      EList<AnnotationInstance> _annotationInstances = javaInterface.getAnnotationInstances();
      for (final AnnotationInstance annot : _annotationInstances) {
        {
          final String annotName = annot.getAnnotation().getName();
          if ((annotName.equals("Path") || annotName.equals("ApplicationPath"))) {
            _routinesFacade.createInterface(javaInterface);
            return;
          }
        }
      }
    }
  }
  
  public CheckJaxRSInterfaceCreationRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier javaInterface) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.jaxRS.CheckJaxRSInterfaceCreationRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaInterface = javaInterface;
  }
  
  private ConcreteClassifier javaInterface;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckJaxRSInterfaceCreationRoutine with input:");
    	getLogger().trace("   javaInterface: " + this.javaInterface);
    }
    
    org.palladiosimulator.pcm.repository.RepositoryComponent com = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceCom(javaInterface), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (com == null) {
    	return false;
    }
    userExecution.callRoutine1(javaInterface, com, this.getRoutinesFacade());
    
    return true;
  }
}
