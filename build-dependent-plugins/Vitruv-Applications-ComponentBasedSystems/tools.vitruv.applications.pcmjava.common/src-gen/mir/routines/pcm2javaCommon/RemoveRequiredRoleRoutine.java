package mir.routines.pcm2javaCommon;

import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.stream.Stream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.imports.ClassifierImport;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.Field;
import org.palladiosimulator.pcm.repository.RequiredRole;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class RemoveRequiredRoleRoutine extends AbstractRepairRoutineRealization {
  private RemoveRequiredRoleRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceRequiredInterfaceField(final RequiredRole requiredRole, final ClassifierImport requiredInterfaceImport) {
      return requiredRole;
    }
    
    public EObject getCorrepondenceSourceRequiredInterfaceImport(final RequiredRole requiredRole) {
      return requiredRole;
    }
    
    public EObject getElement1(final RequiredRole requiredRole, final ClassifierImport requiredInterfaceImport, final Field requiredInterfaceField, final org.emftext.language.java.classifiers.Class javaClass) {
      return requiredInterfaceImport;
    }
    
    public EObject getCorrepondenceSourceJavaClass(final RequiredRole requiredRole, final ClassifierImport requiredInterfaceImport, final Field requiredInterfaceField) {
      return requiredRole;
    }
    
    public EObject getElement4(final RequiredRole requiredRole, final ClassifierImport requiredInterfaceImport, final Field requiredInterfaceField, final org.emftext.language.java.classifiers.Class javaClass) {
      return requiredRole;
    }
    
    public EObject getElement2(final RequiredRole requiredRole, final ClassifierImport requiredInterfaceImport, final Field requiredInterfaceField, final org.emftext.language.java.classifiers.Class javaClass) {
      return requiredInterfaceField;
    }
    
    public EObject getElement3(final RequiredRole requiredRole, final ClassifierImport requiredInterfaceImport, final Field requiredInterfaceField, final org.emftext.language.java.classifiers.Class javaClass) {
      return javaClass;
    }
    
    public void callRoutine1(final RequiredRole requiredRole, final ClassifierImport requiredInterfaceImport, final Field requiredInterfaceField, final org.emftext.language.java.classifiers.Class javaClass, @Extension final RoutinesFacade _routinesFacade) {
      Iterable<Constructor> _filter = Iterables.<Constructor>filter(javaClass.getMembers(), Constructor.class);
      for (final Constructor ctor : _filter) {
        {
          _routinesFacade.removeParameterToFieldAssignmentFromConstructor(ctor, requiredRole.getEntityName());
          _routinesFacade.removeCorrespondingParameterFromConstructor(ctor, requiredRole);
        }
      }
    }
  }
  
  public RemoveRequiredRoleRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final RequiredRole requiredRole) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.RemoveRequiredRoleRoutine.ActionUserExecution(getExecutionState(), this);
    this.requiredRole = requiredRole;
  }
  
  private RequiredRole requiredRole;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine RemoveRequiredRoleRoutine with input:");
    	getLogger().trace("   requiredRole: " + this.requiredRole);
    }
    
    org.emftext.language.java.imports.ClassifierImport requiredInterfaceImport = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRequiredInterfaceImport(requiredRole), // correspondence source supplier
    	org.emftext.language.java.imports.ClassifierImport.class,
    	(org.emftext.language.java.imports.ClassifierImport _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (requiredInterfaceImport == null) {
    	return false;
    }
    org.emftext.language.java.members.Field requiredInterfaceField = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRequiredInterfaceField(requiredRole, requiredInterfaceImport), // correspondence source supplier
    	org.emftext.language.java.members.Field.class,
    	(org.emftext.language.java.members.Field _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (requiredInterfaceField == null) {
    	return false;
    }
    org.emftext.language.java.classifiers.Class javaClass = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceJavaClass(requiredRole, requiredInterfaceImport, requiredInterfaceField), // correspondence source supplier
    	org.emftext.language.java.classifiers.Class.class,
    	(org.emftext.language.java.classifiers.Class _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (javaClass == null) {
    	return false;
    }
    Stream.of(new Object[] {requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement1(requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass), accessibleElement, null));		
    deleteObject(userExecution.getElement1(requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass));
    
    Stream.of(new Object[] {requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass})
    	.filter(it -> it instanceof EObject).map(it -> (EObject) it).forEach(accessibleElement ->
    		removeCorrespondenceBetween(userExecution.getElement2(requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass), accessibleElement, null));		
    deleteObject(userExecution.getElement2(requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass));
    
    removeCorrespondenceBetween(userExecution.getElement3(requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass), userExecution.getElement4(requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass), "");
    
    userExecution.callRoutine1(requiredRole, requiredInterfaceImport, requiredInterfaceField, javaClass, this.getRoutinesFacade());
    
    return true;
  }
}
