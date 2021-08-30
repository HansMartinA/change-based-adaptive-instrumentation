package mir.routines.pcm2javaCommon;

import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.emftext.language.java.imports.ClassifierImport;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import tools.vitruv.domains.java.util.JavaModificationUtil;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateAssemblyContextImportRoutine extends AbstractRepairRoutineRealization {
  private CreateAssemblyContextImportRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final ClassifierImport contextClassImport) {
      return contextClassImport;
    }
    
    public void updateContextClassImportElement(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final ClassifierImport contextClassImport) {
      JavaModificationUtil.addImportToCompilationUnitOfClassifier(contextClassImport, compositeComponentJavaClass, encapsulatedComponentJavaClass);
    }
    
    public EObject getElement2(final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass, final ClassifierImport contextClassImport) {
      return assemblyContext;
    }
  }
  
  public CreateAssemblyContextImportRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final AssemblyContext assemblyContext, final org.emftext.language.java.classifiers.Class compositeComponentJavaClass, final org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateAssemblyContextImportRoutine.ActionUserExecution(getExecutionState(), this);
    this.assemblyContext = assemblyContext;this.compositeComponentJavaClass = compositeComponentJavaClass;this.encapsulatedComponentJavaClass = encapsulatedComponentJavaClass;
  }
  
  private AssemblyContext assemblyContext;
  
  private org.emftext.language.java.classifiers.Class compositeComponentJavaClass;
  
  private org.emftext.language.java.classifiers.Class encapsulatedComponentJavaClass;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateAssemblyContextImportRoutine with input:");
    	getLogger().trace("   assemblyContext: " + this.assemblyContext);
    	getLogger().trace("   compositeComponentJavaClass: " + this.compositeComponentJavaClass);
    	getLogger().trace("   encapsulatedComponentJavaClass: " + this.encapsulatedComponentJavaClass);
    }
    
    org.emftext.language.java.imports.ClassifierImport contextClassImport = org.emftext.language.java.imports.impl.ImportsFactoryImpl.eINSTANCE.createClassifierImport();
    notifyObjectCreated(contextClassImport);
    userExecution.updateContextClassImportElement(assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, contextClassImport);
    
    addCorrespondenceBetween(userExecution.getElement1(assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, contextClassImport), userExecution.getElement2(assemblyContext, compositeComponentJavaClass, encapsulatedComponentJavaClass, contextClassImport), "");
    
    return true;
  }
}
