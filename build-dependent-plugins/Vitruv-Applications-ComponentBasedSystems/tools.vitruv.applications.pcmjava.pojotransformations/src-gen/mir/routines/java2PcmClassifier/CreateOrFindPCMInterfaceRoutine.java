package mir.routines.java2PcmClassifier;

import com.google.common.base.Objects;
import java.io.IOException;
import java.util.Optional;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersPackage;
import org.palladiosimulator.pcm.repository.Repository;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindPCMInterfaceRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindPCMInterfaceRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourcePcmRepository(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package containingPackage) {
      return containingPackage;
    }
    
    public EObject getCorrepondenceSource1(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package containingPackage, final Optional<Repository> pcmRepository) {
      return javaInterface;
    }
    
    public String getRetrieveTag1(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package containingPackage) {
      return "contracts";
    }
    
    public boolean getCorrespondingModelElementsPreconditionContainingPackage(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package containingPackage) {
      String _namespacesAsString = containingPackage.getNamespacesAsString();
      String _name = containingPackage.getName();
      String _plus = (_namespacesAsString + _name);
      String _plus_1 = (_plus + ".");
      String _namespacesAsString_1 = compilationUnit.getNamespacesAsString();
      boolean _equals = Objects.equal(_plus_1, _namespacesAsString_1);
      return _equals;
    }
    
    public EObject getCorrepondenceSourceContainingPackage(final Interface javaInterface, final CompilationUnit compilationUnit) {
      return ContainersPackage.Literals.PACKAGE;
    }
    
    public void callRoutine1(final Interface javaInterface, final CompilationUnit compilationUnit, final org.emftext.language.java.containers.Package containingPackage, final Optional<Repository> pcmRepository, @Extension final RoutinesFacade _routinesFacade) {
      boolean _isPresent = pcmRepository.isPresent();
      if (_isPresent) {
        _routinesFacade.createOrFindContractsInterface(javaInterface, compilationUnit, containingPackage, pcmRepository.get());
      } else {
        _routinesFacade.createNonContractsInterface(javaInterface, compilationUnit, containingPackage);
      }
    }
  }
  
  public CreateOrFindPCMInterfaceRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Interface javaInterface, final CompilationUnit compilationUnit) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.CreateOrFindPCMInterfaceRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaInterface = javaInterface;this.compilationUnit = compilationUnit;
  }
  
  private Interface javaInterface;
  
  private CompilationUnit compilationUnit;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindPCMInterfaceRoutine with input:");
    	getLogger().trace("   javaInterface: " + this.javaInterface);
    	getLogger().trace("   compilationUnit: " + this.compilationUnit);
    }
    
    org.emftext.language.java.containers.Package containingPackage = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceContainingPackage(javaInterface, compilationUnit), // correspondence source supplier
    	org.emftext.language.java.containers.Package.class,
    	(org.emftext.language.java.containers.Package _element) -> userExecution.getCorrespondingModelElementsPreconditionContainingPackage(javaInterface, compilationUnit, _element), // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (containingPackage == null) {
    	return false;
    }
    Optional<org.palladiosimulator.pcm.repository.Repository> pcmRepository = Optional.ofNullable(getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmRepository(javaInterface, compilationUnit, containingPackage), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	userExecution.getRetrieveTag1(javaInterface, compilationUnit, containingPackage), 
    	false // asserted
    	)
    );
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(javaInterface, compilationUnit, containingPackage, pcmRepository), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.OperationInterface.class,
    	(org.palladiosimulator.pcm.repository.OperationInterface _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(javaInterface, compilationUnit, containingPackage, pcmRepository, this.getRoutinesFacade());
    
    return true;
  }
}
