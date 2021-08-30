package mir.routines.commonDataType;

import cipm.consistency.cpr.javapcm.internal.InternalUtility;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.emftext.language.java.classifiers.Classifier;
import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.extensions.types.TypeReferenceExtension;
import org.emftext.language.java.types.ClassifierReference;
import org.emftext.language.java.types.Type;
import org.emftext.language.java.types.TypeReference;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CheckCollectionDataTypeCreationRoutine extends AbstractRepairRoutineRealization {
  private CheckCollectionDataTypeCreationRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine2(final TypeReference typeRef, final Repository repo, @Extension final RoutinesFacade _routinesFacade) {
      long _arrayDimension = typeRef.getArrayDimension();
      boolean _greaterThan = (_arrayDimension > 0);
      if (_greaterThan) {
        _routinesFacade.createOrFindCollectionDataTypeForArray(typeRef);
      }
    }
    
    public EObject getCorrepondenceSourceRepo(final TypeReference typeRef) {
      return RepositoryPackage.Literals.REPOSITORY;
    }
    
    public void callRoutine1(final TypeReference typeRef, final Repository repo, @Extension final RoutinesFacade _routinesFacade) {
      final Type target = typeRef.getTarget();
      if ((target instanceof ConcreteClassifier)) {
        final ClassifierReference classifierReference = typeRef.getPureClassifierReference();
        final EList<ClassifierReference> superRef = ((ConcreteClassifier)target).getSuperTypeReferences();
        for (final ClassifierReference superReference : superRef) {
          Classifier _target = superReference.getTarget();
          if ((_target instanceof Interface)) {
            final String superRefName = superReference.getTarget().getName();
            if ((superRefName.equals("Collection") && (classifierReference.getTypeArguments().size() == 1))) {
              TypeReference argRef = TypeReferenceExtension.getTypeReferenceOfTypeArgument(
                classifierReference.getTypeArguments().get(0));
              if ((argRef == null)) {
                argRef = InternalUtility.getTypeReferenceToObject(classifierReference);
              }
              if ((argRef != null)) {
                _routinesFacade.createOrFindCollectionDataType(typeRef, argRef);
              }
              return;
            } else {
              if ((superRefName.equals("Map") && (classifierReference.getTypeArguments().size() == 2))) {
                TypeReference argRef_1 = TypeReferenceExtension.getTypeReferenceOfTypeArgument(
                  classifierReference.getTypeArguments().get(1));
                if ((argRef_1 == null)) {
                  argRef_1 = InternalUtility.getTypeReferenceToObject(classifierReference);
                }
                if ((argRef_1 != null)) {
                  _routinesFacade.createOrFindCollectionDataType(typeRef, argRef_1);
                }
                return;
              }
            }
          }
        }
      }
    }
  }
  
  public CheckCollectionDataTypeCreationRoutine(final RoutinesFacade routinesFacade, final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final TypeReference typeRef) {
    super(routinesFacade, reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.commonDataType.CheckCollectionDataTypeCreationRoutine.ActionUserExecution(getExecutionState(), this);
    this.typeRef = typeRef;
  }
  
  private TypeReference typeRef;
  
  protected boolean executeRoutine() throws IOException {
    if (getLogger().isTraceEnabled()) {
    	getLogger().trace("Called routine CheckCollectionDataTypeCreationRoutine with input:");
    	getLogger().trace("   typeRef: " + this.typeRef);
    }
    
    org.palladiosimulator.pcm.repository.Repository repo = getCorrespondingElement(
    	userExecution.getCorrepondenceSourceRepo(typeRef), // correspondence source supplier
    	org.palladiosimulator.pcm.repository.Repository.class,
    	(org.palladiosimulator.pcm.repository.Repository _element) -> true, // correspondence precondition checker
    	null, 
    	false // asserted
    	);
    if (repo == null) {
    	return false;
    }
    userExecution.callRoutine1(typeRef, repo, this.getRoutinesFacade());
    
    userExecution.callRoutine2(typeRef, repo, this.getRoutinesFacade());
    
    return true;
  }
}
