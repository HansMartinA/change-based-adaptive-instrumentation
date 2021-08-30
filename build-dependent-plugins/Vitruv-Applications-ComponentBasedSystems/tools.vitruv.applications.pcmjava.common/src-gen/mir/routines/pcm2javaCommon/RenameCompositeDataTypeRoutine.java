package mir.routines.pcm2javaCommon;

import com.google.common.base.Objects;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.repository.CompositeDataType;
import org.palladiosimulator.pcm.repository.Repository;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RenameCompositeDataTypeRoutine extends AbstractRepairRoutineRealization {
  private RenameCompositeDataTypeRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public boolean getCorrespondingModelElementsPreconditionDatatypesPackage(final CompositeDataType compositeDataType, final org.emftext.language.java.containers.Package datatypesPackage) {
      String _name = datatypesPackage.getName();
      boolean _equals = Objects.equal(_name, "datatypes");
      return _equals;
    }
    
    public EObject getCorrepondenceSourceDatatypesPackage(final CompositeDataType compositeDataType) {
      Repository _repository__DataType = compositeDataType.getRepository__DataType();
      return _repository__DataType;
    }
    
    public void callRoutine1(final CompositeDataType compositeDataType, final org.emftext.language.java.containers.Package datatypesPackage, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.renameJavaClassifier(compositeDataType, datatypesPackage, compositeDataType.getEntityName());
    }
  }
  
  public RenameCompositeDataTypeRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final CompositeDataType compositeDataType) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.RenameCompositeDataTypeRoutine.ActionUserExecution(getExecutionState(), this);
    this.compositeDataType = compositeDataType;
  }
  
  private CompositeDataType compositeDataType;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RenameCompositeDataTypeRoutine with input:");
    	getLogger().trace("   compositeDataType: " + this.compositeDataType);
    }
    
    org.emftext.language.java.containers.Package datatypesPackage = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceDatatypesPackage(compositeDataType), // correspondence source supplier
    	org.emftext.language.java.containers.Package.class,
    	(org.emftext.language.java.containers.Package _element) -> userExecution.getCorrespondingModelElementsPreconditionDatatypesPackage(compositeDataType, _element), // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (datatypesPackage == null) {
    	return false;
    }
    userExecution.callRoutine1(compositeDataType, datatypesPackage, this.getRoutinesFacade());
    
    return true;
  }
}
