package mir.routines.java2PcmClassifier;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.repository.DataType;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RenameDataTypeFromClassRoutine extends AbstractRepairRoutineRealization {
  private RenameDataTypeFromClassRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceDataType(final org.emftext.language.java.classifiers.Class javaClass) {
      return javaClass;
    }
    
    public DataType getElement1(final org.emftext.language.java.classifiers.Class javaClass, final DataType dataType) {
      return dataType;
    }
    
    public void update0Element(final org.emftext.language.java.classifiers.Class javaClass, final DataType dataType) {
      if ((dataType instanceof Entity)) {
        ((Entity)dataType).setEntityName(StringExtensions.toFirstUpper(javaClass.getName()));
      }
    }
  }
  
  public RenameDataTypeFromClassRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.classifiers.Class javaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.RenameDataTypeFromClassRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaClass = javaClass;
  }
  
  private org.emftext.language.java.classifiers.Class javaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RenameDataTypeFromClassRoutine with input:");
    	getLogger().trace("   javaClass: " + this.javaClass);
    }
    
    org.palladiosimulator.pcm.repository.DataType dataType = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceDataType(javaClass), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.DataType.class,
    	(org.palladiosimulator.pcm.repository.DataType _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (dataType == null) {
    	return false;
    }
    // val updatedElement userExecution.getElement1(javaClass, dataType);
    userExecution.update0Element(javaClass, dataType);
    
    return true;
  }
}
