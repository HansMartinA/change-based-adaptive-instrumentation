package mir.routines.classifier;

import cipm.consistency.cpr.javapcm.internal.InternalUtility;
import com.google.common.base.Objects;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.Origin;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class DecideInterfaceCreationRoutine extends AbstractRepairRoutineRealization {
  private DecideInterfaceCreationRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceCom(final ConcreteClassifier javaInterface) {
      return javaInterface;
    }
    
    public void callRoutine1(final ConcreteClassifier javaInterface, final RepositoryComponent com, @Extension final RoutinesFacade _routinesFacade) {
      org.emftext.language.java.containers.Module mod = InternalUtility.getModule(javaInterface);
      if ((mod == null)) {
        return;
      }
      Origin _origin = mod.getOrigin();
      boolean _equals = Objects.equal(_origin, Origin.FILE);
      if (_equals) {
        _routinesFacade.checkJaxRSInterfaceCreation(javaInterface);
        _routinesFacade.checkServletInterfaceCreation(javaInterface);
      } else {
        Origin _origin_1 = mod.getOrigin();
        boolean _equals_1 = Objects.equal(_origin_1, Origin.ARCHIVE);
        if (_equals_1) {
          boolean _isPublic = javaInterface.isPublic();
          if (_isPublic) {
            _routinesFacade.createInterface(javaInterface);
          }
        }
      }
    }
  }
  
  public DecideInterfaceCreationRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier javaInterface) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.classifier.DecideInterfaceCreationRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaInterface = javaInterface;
  }
  
  private ConcreteClassifier javaInterface;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine DecideInterfaceCreationRoutine with input:");
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
