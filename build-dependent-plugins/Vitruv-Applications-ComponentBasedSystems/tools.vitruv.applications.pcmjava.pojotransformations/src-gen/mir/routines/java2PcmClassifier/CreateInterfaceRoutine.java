package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.palladiosimulator.pcm.repository.OperationInterface;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateInterfaceRoutine extends AbstractRepairRoutineRealization {
  private CreateInterfaceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void updatePcmInterfaceElement(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage, final OperationInterface pcmInterface) {
      pcmInterface.setEntityName(javaInterface.getName());
    }
    
    public void callRoutine1(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage, final OperationInterface pcmInterface, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.addInterfaceCorrespondence(pcmInterface, javaInterface, compilationUnit);
      _routinesFacade.updateRepositoryInterfaces(pcmInterface);
    }
  }
  
  public CreateInterfaceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package javaPackage) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.CreateInterfaceRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaInterface = javaInterface;this.compilationUnit = compilationUnit;this.javaPackage = javaPackage;
  }
  
  private Interface javaInterface;
  
  private CompilationUnit compilationUnit;
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateInterfaceRoutine with input:");
    	getLogger().trace("   javaInterface: " + this.javaInterface);
    	getLogger().trace("   compilationUnit: " + this.compilationUnit);
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    }
    
    org.palladiosimulator.pcm.repository.OperationInterface pcmInterface = org.palladiosimulator.pcm.repository.impl.RepositoryFactoryImpl.eINSTANCE.createOperationInterface();
    notifyObjectCreated(pcmInterface);
    userExecution.updatePcmInterfaceElement(javaInterface, compilationUnit, javaPackage, pcmInterface);
    
    userExecution.callRoutine1(javaInterface, compilationUnit, javaPackage, pcmInterface, this.getRoutinesFacade());
    
    return true;
  }
}
