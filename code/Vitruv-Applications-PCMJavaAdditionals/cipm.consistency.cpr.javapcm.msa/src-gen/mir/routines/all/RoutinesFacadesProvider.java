package mir.routines.all;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacadesProvider extends AbstractRoutinesFacadesProvider {
  public AbstractRepairRoutinesFacade createRoutinesFacade(final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState sharedExecutionState) {
    switch(reactionsImportPath.getPathString()) {
    	case "all": {
    		return new mir.routines.all.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody": {
    		return new mir.routines.methodBody.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody": {
    		return new mir.routines.classifierBody.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier": {
    		return new mir.routines.classifier.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.Servlet": {
    		return new mir.routines.servlet.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.Servlet.JaxRS": {
    		return new mir.routines.jaxRS.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.Servlet.JaxRS.common": {
    		return new mir.routines.common.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonInterface": {
    		return new mir.routines.commonInterface.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonOperationProvidedRole": {
    		return new mir.routines.commonOperationProvidedRole.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonOperationRequiredRole": {
    		return new mir.routines.commonOperationRequiredRole.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonSignature": {
    		return new mir.routines.commonSignature.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonSignature.commonDataType": {
    		return new mir.routines.commonDataType.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "all.methodBody.classifierBody.classifier.component": {
    		return new mir.routines.component.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	default: {
    	throw new IllegalArgumentException("Unexpected import path: " + reactionsImportPath.getPathString());
    	}
    }
  }
}
