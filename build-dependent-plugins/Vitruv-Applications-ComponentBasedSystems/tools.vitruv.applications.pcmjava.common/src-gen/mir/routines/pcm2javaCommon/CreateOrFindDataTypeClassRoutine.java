package mir.routines.pcm2javaCommon;

import com.google.common.base.Objects;
import java.io.IOException;
import org.eclipse.xtext.xbase.lib.Extension;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindDataTypeClassRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindDataTypeClassRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final NamedElement dataType, final org.emftext.language.java.containers.Package datatypesPackage, @Extension final RoutinesFacade _routinesFacade) {
      String _entityName = dataType.getEntityName();
      boolean _equals = Objects.equal(_entityName, "aName");
      if (_equals) {
        _routinesFacade.createOrFindJavaClass(dataType, datatypesPackage, null);
      } else {
        _routinesFacade.createOrFindJavaClass(dataType, datatypesPackage, dataType.getEntityName());
      }
    }
  }
  
  public CreateOrFindDataTypeClassRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final NamedElement dataType, final org.emftext.language.java.containers.Package datatypesPackage) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateOrFindDataTypeClassRoutine.ActionUserExecution(getExecutionState(), this);
    this.dataType = dataType;this.datatypesPackage = datatypesPackage;
  }
  
  private NamedElement dataType;
  
  private org.emftext.language.java.containers.Package datatypesPackage;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindDataTypeClassRoutine with input:");
    	getLogger().trace("   dataType: " + this.dataType);
    	getLogger().trace("   datatypesPackage: " + this.datatypesPackage);
    }
    
    userExecution.callRoutine1(dataType, datatypesPackage, this.getRoutinesFacade());
    
    return true;
  }
}
