package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.members.Constructor;
import org.emftext.language.java.members.Field;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import tools.vitruv.domains.java.util.JavaModificationUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateAssemblyContextConstructorRoutine extends AbstractRepairRoutineRealization {
  private CreateAssemblyContextConstructorRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceAssemblyContextField(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass) {
      return assemblyContext;
    }
    
    public void callRoutine1(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final Field assemblyContextField, final Constructor constructor, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.createAssemblyContextStatement(assemblyContext, constructor, compositeComponentJavaClass);
      JavaModificationUtil.addConstructorToClass(constructor, compositeComponentJavaClass);
    }
  }
  
  public CreateAssemblyContextConstructorRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateAssemblyContextConstructorRoutine.ActionUserExecution(getExecutionState(), this);
    this.assemblyContext = assemblyContext;this.compositeComponentJavaClass = compositeComponentJavaClass;
  }
  
  private AssemblyContext assemblyContext;
  
  private org.emftext.language.java.classifiers.Class compositeComponentJavaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateAssemblyContextConstructorRoutine with input:");
    	getLogger().trace("   assemblyContext: " + this.assemblyContext);
    	getLogger().trace("   compositeComponentJavaClass: " + this.compositeComponentJavaClass);
    }
    
    org.emftext.language.java.members.Field assemblyContextField = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceAssemblyContextField(assemblyContext, compositeComponentJavaClass), // correspondence source supplier
    	org.emftext.language.java.members.Field.class,
    	(org.emftext.language.java.members.Field _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (assemblyContextField == null) {
    	return false;
    }
    org.emftext.language.java.members.Constructor constructor = org.emftext.language.java.members.impl.MembersFactoryImpl.eINSTANCE.createConstructor();
    notifyObjectCreated(constructor);
    ;
    
    userExecution.callRoutine1(assemblyContext, compositeComponentJavaClass, assemblyContextField, constructor, this.getRoutinesFacade());
    
    return true;
  }
}
