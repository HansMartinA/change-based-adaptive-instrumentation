package mir.routines.java2PcmClassifier;

import com.google.common.base.Objects;
import java.io.IOException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateOrFindArchitecturalElementInPackageRoutine extends AbstractRepairRoutineRealization {
  private CreateOrFindArchitecturalElementInPackageRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourcePcmRepository(final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.containers.Package containingPackage, final String rootPackageName) {
      return containingPackage;
    }
    
    public EObject getCorrepondenceSource1(final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.containers.Package containingPackage, final String rootPackageName, final Repository pcmRepository) {
      return javaPackage;
    }
    
    public String getRetrieveTag1(final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.containers.Package containingPackage, final String rootPackageName) {
      return "package_root";
    }
    
    public void callRoutine1(final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.containers.Package containingPackage, final String rootPackageName, final Repository pcmRepository, @Extension final RoutinesFacade _routinesFacade) {
      final Function1<RepositoryComponent, Boolean> _function = (RepositoryComponent it) -> {
        String _entityName = it.getEntityName();
        String _firstUpper = StringExtensions.toFirstUpper(javaPackage.getName());
        return Boolean.valueOf(Objects.equal(_entityName, _firstUpper));
      };
      final RepositoryComponent pcmComponentCandidate = IterableExtensions.<RepositoryComponent>findFirst(pcmRepository.getComponents__Repository(), _function);
      if ((pcmComponentCandidate == null)) {
        _routinesFacade.createArchitecturalElement(javaPackage, containingPackage.getName(), rootPackageName);
      } else {
        _routinesFacade.addCorrespondenceAndUpdateRepository(pcmComponentCandidate, javaPackage);
      }
    }
  }
  
  public CreateOrFindArchitecturalElementInPackageRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final org.emftext.language.java.containers.Package javaPackage, final org.emftext.language.java.containers.Package containingPackage, final String rootPackageName) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.java2PcmClassifier.CreateOrFindArchitecturalElementInPackageRoutine.ActionUserExecution(getExecutionState(), this);
    this.javaPackage = javaPackage;this.containingPackage = containingPackage;this.rootPackageName = rootPackageName;
  }
  
  private org.emftext.language.java.containers.Package javaPackage;
  
  private org.emftext.language.java.containers.Package containingPackage;
  
  private String rootPackageName;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CreateOrFindArchitecturalElementInPackageRoutine with input:");
    	getLogger().trace("   javaPackage: " + this.javaPackage);
    	getLogger().trace("   containingPackage: " + this.containingPackage);
    	getLogger().trace("   rootPackageName: " + this.rootPackageName);
    }
    
    org.palladiosimulator.pcm.repository.Repository pcmRepository = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePcmRepository(javaPackage, containingPackage, rootPackageName), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	userExecution.getRetrieveTag1(javaPackage, containingPackage, rootPackageName), 
    	false // asserted
    	);
    if (pcmRepository == null) {
    	return false;
    }
    if (!getCorrespondingElements(
    	userExecution.getCorrepondenceSource1(javaPackage, containingPackage, rootPackageName, pcmRepository), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.RepositoryComponent.class,
    	(org.palladiosimulator.pcm.repository.RepositoryComponent _element) -> true, // correspondence precondition checker
    	null
    ).isEmpty()) {
    	return false;
    }
    userExecution.callRoutine1(javaPackage, containingPackage, rootPackageName, pcmRepository, this.getRoutinesFacade());
    
    return true;
  }
}
