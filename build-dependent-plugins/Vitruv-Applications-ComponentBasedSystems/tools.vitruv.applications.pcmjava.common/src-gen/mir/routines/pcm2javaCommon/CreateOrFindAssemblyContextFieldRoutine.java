package mir.routines.pcm2javaCommon;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.emftext.language.java.members.Field;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.ComposedStructure;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindAssemblyContextFieldRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindAssemblyContextFieldRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourceEncapsulatedComponentJavaClass(final AssemblyContext assemblyContext, final ComposedStructure composedStructure, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass) {
      RepositoryComponent _encapsulatedComponent__AssemblyContext = assemblyContext.getEncapsulatedComponent__AssemblyContext();
      return _encapsulatedComponent__AssemblyContext;
    }
    
    public EObject getCorrepondenceSource1(final AssemblyContext assemblyContext, final ComposedStructure composedStructure, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass) {
      return assemblyContext;
    }
    
    public EObject getCorrepondenceSourceCompositeComponentJavaClass(final AssemblyContext assemblyContext, final ComposedStructure composedStructure) {
      return composedStructure;
    }
    
    public void callRoutine1(final AssemblyContext assemblyContext, final ComposedStructure composedStructure, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, @Extension final RoutinesFacade _routinesFacade) {
      final Function1<Field, Boolean> _function = (Field it) -> {
        String _name = it.getName();
        String _entityName = assemblyContext.getEntityName();
        return Boolean.valueOf(Objects.equal(_name, _entityName));
      };
      final Field foundField = IterableExtensions.<Field>findFirst(Iterables.<Field>filter(compositeComponentJavaClass.getMembers(), Field.class), _function);
      if ((foundField == null)) {
        _routinesFacade.createAssemblyContextField(assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass);
      } else {
        _routinesFacade.addAssemblyContextFieldCorrespondence(assemblyContext, foundField);
      }
    }
  }
  
  public CreateOrFindAssemblyContextFieldRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final AssemblyContext assemblyContext, final ComposedStructure composedStructure) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateOrFindAssemblyContextFieldRoutine.ActionUserExecution(getExecutionState(), this);
    this.assemblyContext = assemblyContext;this.composedStructure = composedStructure;
  }
  
  private AssemblyContext assemblyContext;
  
  private ComposedStructure composedStructure;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindAssemblyContextFieldRoutine with input:");
    	getLogger().trace("   assemblyContext: " + this.assemblyContext);
    	getLogger().trace("   composedStructure: " + this.composedStructure);
    }
    
    org.emftext.language.java.classifiers.Class compositeComponentJavaClass = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceCompositeComponentJavaClass(assemblyContext, composedStructure), // correspondence source supplier
    	org.emftext.language.java.classifiers.Class.class,
    	(org.emftext.language.java.classifiers.Class _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (compositeComponentJavaClass == null) {
    	return false;
    }
    org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceEncapsulatedComponentJavaClass(assemblyContext, composedStructure, compositeComponentJavaClass), // correspondence source supplier
    	org.emftext.language.java.classifiers.Class.class,
    	(org.emftext.language.java.classifiers.Class _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (encapsulatedComponentJavaClass == null) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(assemblyContext, composedStructure, compositeComponentJavaClass, encapsulatedComponentJavaClass), // correspondence source supplier
    	org.emftext.language.java.members.Field.class,
    	(org.emftext.language.java.members.Field _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(assemblyContext, composedStructure, compositeComponentJavaClass, encapsulatedComponentJavaClass, this.getRoutinesFacade());
    
    return true;
  }
}
