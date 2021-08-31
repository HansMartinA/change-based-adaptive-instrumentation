package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.containers.CompilationUnit;
import org.palladiosimulator.pcm.repository.DataType;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddDataTypeCorrespondenceRoutine extends AbstractRepairRoutineRealization {
  private AddDataTypeCorrespondenceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final DataType dataType) {
      return dataType;
    }
    
    public EObject getElement4(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final DataType dataType) {
      return javaClass;
    }
    
    public EObject getElement2(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final DataType dataType) {
      return javaClass;
    }
    
    public EObject getElement3(final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final DataType dataType) {
      return compilationUnit;
    }
  }
  
  public AddDataTypeCorrespondenceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.classifiers.Class javaClass, final CompilationUnit compilationUnit, final DataType dataType) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.AddDataTypeCorrespondenceRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaClass = javaClass;this.compilationUnit = compilationUnit;this.dataType = dataType;
  }
  
  private org.emftext.language.java.classifiers.Class javaClass;
  
  private CompilationUnit compilationUnit;
  
  private DataType dataType;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddDataTypeCorrespondenceRoutine with input:");
    	getLogger().trace("   javaClass: " + this.javaClass);
    	getLogger().trace("   compilationUnit: " + this.compilationUnit);
    	getLogger().trace("   dataType: " + this.dataType);
    }
    
    addCorrespondenceBetween(userExecution.getElement1(javaClass, compilationUnit, dataType), userExecution.getElement2(javaClass, compilationUnit, dataType), "");
    
    addCorrespondenceBetween(userExecution.getElement3(javaClass, compilationUnit, dataType), userExecution.getElement4(javaClass, compilationUnit, dataType), "");
    
    return true;
  }
}
