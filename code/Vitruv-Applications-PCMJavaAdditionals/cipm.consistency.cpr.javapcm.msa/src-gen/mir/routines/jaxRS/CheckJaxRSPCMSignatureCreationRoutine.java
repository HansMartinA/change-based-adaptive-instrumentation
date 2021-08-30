package mir.routines.jaxRS;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.annotations.AnnotationInstance;
import org.emftext.language.java.classifiers.Annotation;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.members.Method;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckJaxRSPCMSignatureCreationRoutine extends AbstractRepairRoutineRealization {
  private CheckJaxRSPCMSignatureCreationRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final Method interfaceMethod) {
      ConcreteClassifier _containingConcreteClassifier = interfaceMethod.getContainingConcreteClassifier();
      return _containingConcreteClassifier;
    }
    
    public EObject getCorrepondenceSource2(final Method interfaceMethod) {
      return interfaceMethod;
    }
    
    public void callRoutine1(final Method interfaceMethod, @Extension final RoutinesFacade _routinesFacade) {
      EList<AnnotationInstance> _annotationInstances = interfaceMethod.getAnnotationInstances();
      for (final AnnotationInstance annot : _annotationInstances) {
        {
          Classifier _annotation = annot.getAnnotation();
          final Annotation usedAnnotation = ((Annotation) _annotation);
          boolean httpMethodAnnotation = false;
          EList<AnnotationInstance> _annotationInstances_1 = usedAnnotation.getAnnotationInstances();
          for (final AnnotationInstance annotationOnUsedAnnotation : _annotationInstances_1) {
            boolean _equals = annotationOnUsedAnnotation.getAnnotation().getName().equals("HttpMethod");
            if (_equals) {
              httpMethodAnnotation = true;
            }
          }
          if ((httpMethodAnnotation && usedAnnotation.getName().equals("Path"))) {
            _routinesFacade.createInterface(interfaceMethod.getContainingConcreteClassifier());
            _routinesFacade.createPCMSignature(interfaceMethod);
            return;
          }
        }
      }
    }
  }
  
  public CheckJaxRSPCMSignatureCreationRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Method interfaceMethod) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.jaxRS.CheckJaxRSPCMSignatureCreationRoutine.ActionUserExecution(getExecutionState(), this);
    this.interfaceMethod = interfaceMethod;
  }
  
  private Method interfaceMethod;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckJaxRSPCMSignatureCreationRoutine with input:");
    	getLogger().trace("   interfaceMethod: " + this.interfaceMethod);
    }
    
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(interfaceMethod), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource2(interfaceMethod), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationSignature.class,
    	(org.palladiosimulator.pcm.repository.OperationSignature _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(interfaceMethod, this.getRoutinesFacade());
    
    return true;
  }
}
