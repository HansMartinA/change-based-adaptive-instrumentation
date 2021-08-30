package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.repository.Interface;
import org.palladiosimulator.pcm.repository.Repository;
import tools.vitruv.applications.util.temporary.java.JavaContainerAndClassifierUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindJavaInterfaceRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindJavaInterfaceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSource1(final Interface pcmInterface, final org.emftext.language.java.containers.Package contractsPackage) {
      return pcmInterface;
    }
    
    public EObject getCorrepondenceSource2(final Interface pcmInterface, final org.emftext.language.java.containers.Package contractsPackage) {
      return pcmInterface;
    }
    
    public String getRetrieveTag1(final Interface pcmInterface) {
      return "contracts";
    }
    
    public EObject getCorrepondenceSourceContractsPackage(final Interface pcmInterface) {
      Repository _repository__Interface = pcmInterface.getRepository__Interface();
      return _repository__Interface;
    }
    
    public void callRoutine1(final Interface pcmInterface, final org.emftext.language.java.containers.Package contractsPackage, @Extension final RoutinesFacade _routinesFacade) {
      final org.emftext.language.java.classifiers.Interface foundInterface = JavaContainerAndClassifierUtil.<org.emftext.language.java.classifiers.Interface>findClassifier(pcmInterface.getEntityName(), contractsPackage, org.emftext.language.java.classifiers.Interface.class);
      if ((foundInterface == null)) {
        _routinesFacade.createJavaInterface(pcmInterface, contractsPackage);
      } else {
        _routinesFacade.addMissingClassifierCorrespondence(pcmInterface, foundInterface);
      }
    }
  }
  
  public CreateOrFindJavaInterfaceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Interface pcmInterface) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateOrFindJavaInterfaceRoutine.ActionUserExecution(getExecutionState(), this);
    this.pcmInterface = pcmInterface;
  }
  
  private Interface pcmInterface;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindJavaInterfaceRoutine with input:");
    	getLogger().trace("   pcmInterface: " + this.pcmInterface);
    }
    
    org.emftext.language.java.containers.Package contractsPackage = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceContractsPackage(pcmInterface), // correspondence source supplier
    	org.emftext.language.java.containers.Package.class,
    	(org.emftext.language.java.containers.Package _element) -> true, // correspondence precondition checker
    	userExecution.getRetrieveTag1(pcmInterface), 
    	false // asserted
    	);
    if (contractsPackage == null) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(pcmInterface, contractsPackage), // correspondence source supplier
    	org.emftext.language.java.classifiers.Interface.class,
    	(org.emftext.language.java.classifiers.Interface _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource2(pcmInterface, contractsPackage), // correspondence source supplier
    	org.emftext.language.java.containers.CompilationUnit.class,
    	(org.emftext.language.java.containers.CompilationUnit _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(pcmInterface, contractsPackage, this.getRoutinesFacade());
    
    return true;
  }
}
