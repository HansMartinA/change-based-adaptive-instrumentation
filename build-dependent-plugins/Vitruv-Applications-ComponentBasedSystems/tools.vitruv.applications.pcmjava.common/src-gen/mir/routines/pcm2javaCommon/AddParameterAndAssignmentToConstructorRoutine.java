package mir.routines.pcm2javaCommon;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.parameters.OrdinaryParameter;
import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.types.NamespaceClassifierReference;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.domains.java.util.JavaModificationUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class AddParameterAndAssignmentToConstructorRoutine extends AbstractRepairRoutineRealization {
  private AddParameterAndAssignmentToConstructorRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName, final List<OrdinaryParameter> existingParameters, final OrdinaryParameter newParameter) {
      return newParameter;
    }
    
    public void update0Element(final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName, final List<OrdinaryParameter> existingParameters, final OrdinaryParameter newParameter) {
      EList<Parameter> _parameters = constructor.getParameters();
      _parameters.add(newParameter);
      final Statement asssignment = JavaModificationUtil.createAssignmentFromParameterToField(fieldToBeAssigned, newParameter);
      EList<Statement> _statements = constructor.getStatements();
      _statements.add(asssignment);
    }
    
    public EObject getCorrepondenceSourceExistingParameters(final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName) {
      return parameterCorrespondenceSource;
    }
    
    public void updateNewParameterElement(final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName, final List<OrdinaryParameter> existingParameters, final OrdinaryParameter newParameter) {
      newParameter.setName(parameterName);
      newParameter.setTypeReference(EcoreUtil.<NamespaceClassifierReference>copy(typeReference));
    }
    
    public EObject getElement2(final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName, final List<OrdinaryParameter> existingParameters, final OrdinaryParameter newParameter) {
      return parameterCorrespondenceSource;
    }
    
    public Constructor getElement3(final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName, final List<OrdinaryParameter> existingParameters, final OrdinaryParameter newParameter) {
      return constructor;
    }
    
    public boolean checkMatcherPrecondition1(final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName, final List<OrdinaryParameter> existingParameters) {
      final Function1<OrdinaryParameter, Boolean> _function = (OrdinaryParameter it) -> {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equal(_name, parameterName));
      };
      boolean _exists = IterableExtensions.<OrdinaryParameter>exists(existingParameters, _function);
      boolean _not = (!_exists);
      return _not;
    }
  }
  
  public AddParameterAndAssignmentToConstructorRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final NamedElement parameterCorrespondenceSource, final Constructor constructor, final NamespaceClassifierReference typeReference, final Field fieldToBeAssigned, final String parameterName) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.AddParameterAndAssignmentToConstructorRoutine.ActionUserExecution(getExecutionState(), this);
    this.parameterCorrespondenceSource = parameterCorrespondenceSource;this.constructor = constructor;this.typeReference = typeReference;this.fieldToBeAssigned = fieldToBeAssigned;this.parameterName = parameterName;
  }
  
  private NamedElement parameterCorrespondenceSource;
  
  private Constructor constructor;
  
  private NamespaceClassifierReference typeReference;
  
  private Field fieldToBeAssigned;
  
  private String parameterName;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine AddParameterAndAssignmentToConstructorRoutine with input:");
    	getLogger().trace("   parameterCorrespondenceSource: " + this.parameterCorrespondenceSource);
    	getLogger().trace("   constructor: " + this.constructor);
    	getLogger().trace("   typeReference: " + this.typeReference);
    	getLogger().trace("   fieldToBeAssigned: " + this.fieldToBeAssigned);
    	getLogger().trace("   parameterName: " + this.parameterName);
    }
    
    List<org.emftext.language.java.parameters.OrdinaryParameter> existingParameters = getCorrespondingElements(
    	userExecution.getCorrepondenceSourceExistingParameters(parameterCorrespondenceSource, constructor, typeReference, fieldToBeAssigned, parameterName), // correspondence source supplier
    	org.emftext.language.java.parameters.OrdinaryParameter.class,
    	(org.emftext.language.java.parameters.OrdinaryParameter _element) -> true, // correspondence precondition checker
    	null
    );
    if (!userExecution.checkMatcherPrecondition1(parameterCorrespondenceSource, constructor, typeReference, fieldToBeAssigned, parameterName, existingParameters)) {
    	return false;
    }
    org.emftext.language.java.parameters.OrdinaryParameter newParameter = org.emftext.language.java.parameters.impl.ParametersFactoryImpl.eINSTANCE.createOrdinaryParameter();
    notifyObjectCreated(newParameter);
    userExecution.updateNewParameterElement(parameterCorrespondenceSource, constructor, typeReference, fieldToBeAssigned, parameterName, existingParameters, newParameter);
    
    addCorrespondenceBetween(userExecution.getElement1(parameterCorrespondenceSource, constructor, typeReference, fieldToBeAssigned, parameterName, existingParameters, newParameter), userExecution.getElement2(parameterCorrespondenceSource, constructor, typeReference, fieldToBeAssigned, parameterName, existingParameters, newParameter), "");
    
    // val updatedElement userExecution.getElement3(parameterCorrespondenceSource, constructor, typeReference, fieldToBeAssigned, parameterName, existingParameters, newParameter);
    userExecution.update0Element(parameterCorrespondenceSource, constructor, typeReference, fieldToBeAssigned, parameterName, existingParameters, newParameter);
    
    return true;
  }
}
