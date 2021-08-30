package mir.routines.servlet;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.types.Type;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckServletInterfaceCreationRoutine extends AbstractRepairRoutineRealization {
  private CheckServletInterfaceCreationRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceCom(final ConcreteClassifier javaInterface) {
      return javaInterface;
    }
    
    public void callRoutine1(final ConcreteClassifier javaInterface, final RepositoryComponent com, @Extension final RoutinesFacade _routinesFacade) {
      EList<ConcreteClassifier> _allSuperClassifiers = javaInterface.getAllSuperClassifiers();
      for (final ConcreteClassifier cc : _allSuperClassifiers) {
        boolean _equals = cc.getName().equals("HttpServlet");
        if (_equals) {
          _routinesFacade.createInterface(javaInterface);
          Type _target = ((org.emftext.language.java.classifiers.Class) javaInterface).getExtends().getTarget();
          final org.emftext.language.java.classifiers.Class superClass = ((org.emftext.language.java.classifiers.Class) _target);
          _routinesFacade.createServletHierarchy(superClass);
          _routinesFacade.connectInterfacesByInheritance(javaInterface, superClass);
          return;
        }
      }
    }
  }
  
  public CheckServletInterfaceCreationRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final ConcreteClassifier javaInterface) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.servlet.CheckServletInterfaceCreationRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaInterface = javaInterface;
  }
  
  private ConcreteClassifier javaInterface;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckServletInterfaceCreationRoutine with input:");
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
