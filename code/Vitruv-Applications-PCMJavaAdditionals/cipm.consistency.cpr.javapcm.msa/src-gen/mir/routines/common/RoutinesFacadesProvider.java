package mir.routines.common;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacadesProvider extends AbstractRoutinesFacadesProvider {
  public AbstractRepairRoutinesFacade createRoutinesFacade(final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState sharedExecutionState) {
    switch(reactionsImportPath.getPathString()) {
    	case "common": {
    		return new mir.routines.common.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "common.commonInterface": {
    		return new mir.routines.commonInterface.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "common.commonOperationProvidedRole": {
    		return new mir.routines.commonOperationProvidedRole.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "common.commonOperationRequiredRole": {
    		return new mir.routines.commonOperationRequiredRole.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "common.commonSignature": {
    		return new mir.routines.commonSignature.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "common.commonSignature.commonDataType": {
    		return new mir.routines.commonDataType.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	default: {
    	throw new IllegalArgumentException("Unexpected import path: " + reactionsImportPath.getPathString());
    	}
    }
  }
}
