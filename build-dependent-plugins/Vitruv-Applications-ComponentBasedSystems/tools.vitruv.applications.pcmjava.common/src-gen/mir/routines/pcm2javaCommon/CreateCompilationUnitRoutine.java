package mir.routines.pcm2javaCommon;

import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.containers.CompilationUnit;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import tools.vitruv.domains.java.util.JavaPersistenceHelper;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateCompilationUnitRoutine extends AbstractRepairRoutineRealization {
  private CreateCompilationUnitRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getElement1(final NamedElement sourceElementMappedToClass, final ConcreteClassifier classifier, final org.emftext.language.java.containers.Package containingPackage, final CompilationUnit compilationUnit) {
      return compilationUnit;
    }
    
    public void updateCompilationUnitElement(final NamedElement sourceElementMappedToClass, final ConcreteClassifier classifier, final org.emftext.language.java.containers.Package containingPackage, final CompilationUnit compilationUnit) {
      EList<String> _namespaces = containingPackage.getNamespaces();
      final ArrayList<String> newNamespaces = new ArrayList<String>(_namespaces);
      String _name = containingPackage.getName();
      newNamespaces.add(_name);
      EList<String> _namespaces_1 = compilationUnit.getNamespaces();
      Iterables.<String>addAll(_namespaces_1, newNamespaces);
      String _namespacesAsString = containingPackage.getNamespacesAsString();
      String _name_1 = containingPackage.getName();
      String _plus = (_namespacesAsString + _name_1);
      String _plus_1 = (_plus + ".");
      String _firstUpper = StringExtensions.toFirstUpper(classifier.getName());
      String _plus_2 = (_plus_1 + _firstUpper);
      String _plus_3 = (_plus_2 + ".java");
      compilationUnit.setName(_plus_3);
      EList<ConcreteClassifier> _classifiers = compilationUnit.getClassifiers();
      _classifiers.add(classifier);
      this.persistProjectRelative(sourceElementMappedToClass, compilationUnit, JavaPersistenceHelper.buildJavaFilePath(compilationUnit));
    }
    
    public EObject getElement2(final NamedElement sourceElementMappedToClass, final ConcreteClassifier classifier, final org.emftext.language.java.containers.Package containingPackage, final CompilationUnit compilationUnit) {
      return sourceElementMappedToClass;
    }
  }
  
  public CreateCompilationUnitRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final NamedElement sourceElementMappedToClass, final ConcreteClassifier classifier, final org.emftext.language.java.containers.Package containingPackage) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.pcm2javaCommon.CreateCompilationUnitRoutine.ActionUserExecution(getExecutionState(), this);
    this.sourceElementMappedToClass = sourceElementMappedToClass;this.classifier = classifier;this.containingPackage = containingPackage;
  }
  
  private NamedElement sourceElementMappedToClass;
  
  private ConcreteClassifier classifier;
  
  private org.emftext.language.java.containers.Package containingPackage;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateCompilationUnitRoutine with input:");
    	getLogger().trace("   sourceElementMappedToClass: " + this.sourceElementMappedToClass);
    	getLogger().trace("   classifier: " + this.classifier);
    	getLogger().trace("   containingPackage: " + this.containingPackage);
    }
    
    org.emftext.language.java.containers.CompilationUnit compilationUnit = org.emftext.language.java.containers.impl.ContainersFactoryImpl.eINSTANCE.createCompilationUnit();
    notifyObjectCreated(compilationUnit);
    userExecution.updateCompilationUnitElement(sourceElementMappedToClass, classifier, containingPackage, compilationUnit);
    
    addCorrespondenceBetween(userExecution.getElement1(sourceElementMappedToClass, classifier, containingPackage, compilationUnit), userExecution.getElement2(sourceElementMappedToClass, classifier, containingPackage, compilationUnit), "");
    
    return true;
  }
}
