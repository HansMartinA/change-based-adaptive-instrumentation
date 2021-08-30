package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.members.Field;
import org.emftext.language.java.members.Member;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import tools.vitruv.domains.java.util.JavaModificationUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateAssemblyContextFieldRoutine extends AbstractRepairRoutineRealization {
  private CreateAssemblyContextFieldRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField) {
      return assemblyContextField;
    }
    
    public EObject getElement2(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField) {
      return assemblyContext;
    }
    
    public void updateAssemblyContextFieldElement(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final Field assemblyContextField) {
      JavaModificationUtil.createPrivateField(assemblyContextField, JavaModificationUtil.createNamespaceClassifierReference(encapsulatedComponentJavaClass), assemblyContext.getEntityName());
      EList<Member> _members = compositeComponentJavaClass.getMembers();
      _members.add(assemblyContextField);
    }
  }
  
  public CreateAssemblyContextFieldRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateAssemblyContextFieldRoutine.ActionUserExecution(getExecutionState(), this);
    this.assemblyContext = assemblyContext;this.compositeComponentJavaClass = compositeComponentJavaClass;this.encapsulatedComponentJavaClass = encapsulatedComponentJavaClass;
  }
  
  private AssemblyContext assemblyContext;
  
  private org.emftext.language.java.classifiers.Class compositeComponentJavaClass;
  
  private org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateAssemblyContextFieldRoutine with input:");
    	getLogger().trace("   assemblyContext: " + this.assemblyContext);
    	getLogger().trace("   compositeComponentJavaClass: " + this.compositeComponentJavaClass);
    	getLogger().trace("   encapsulatedComponentJavaClass: " + this.encapsulatedComponentJavaClass);
    }
    
    org.emftext.language.java.members.Field assemblyContextField = org.emftext.language.java.members.impl.MembersFactoryImpl.eINSTANCE.createField();
    notifyObjectCreated(assemblyContextField);
    userExecution.updateAssemblyContextFieldElement(assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField);
    
    addCorrespondenceBetween(userExecution.getElement1(assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField), userExecution.getElement2(assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, assemblyContextField), "");
    
    return true;
  }
}
