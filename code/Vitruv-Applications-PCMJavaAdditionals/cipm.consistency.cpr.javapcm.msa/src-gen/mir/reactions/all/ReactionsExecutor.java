package mir.reactions.all;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
class ReactionsExecutor extends AbstractReactionsExecutor {
  public ReactionsExecutor() {
    super(new cipm.consistency.domains.java.AdjustedJavaDomainProvider().getDomain(), 
    	new cipm.consistency.domains.pcm.ExtendedPcmDomainProvider().getDomain());
  }
  
  protected RoutinesFacadesProvider createRoutinesFacadesProvider() {
    return new mir.routines.all.RoutinesFacadesProvider();
  }
  
  protected void setup() {
    this.addReaction(new mir.reactions.commonOperationProvidedRole.AddedTypeReferenceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonOperationProvidedRole"))));
    this.addReaction(new mir.reactions.commonOperationProvidedRole.RemovedTypeReferenceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonOperationProvidedRole"))));
    this.addReaction(new mir.reactions.commonOperationRequiredRole.AddedImportReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonOperationRequiredRole"))));
    this.addReaction(new mir.reactions.commonOperationRequiredRole.RemovedImportReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier.Servlet.JaxRS.common.commonOperationRequiredRole"))));
    this.addReaction(new mir.reactions.classifier.AddedClassReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier"))));
    this.addReaction(new mir.reactions.classifier.AddedInterfaceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier"))));
    this.addReaction(new mir.reactions.classifier.RemovedClassReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier"))));
    this.addReaction(new mir.reactions.classifier.RemovedInterfaceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier"))));
    this.addReaction(new mir.reactions.classifier.RemovedModuleReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody.classifier"))));
    this.addReaction(new mir.reactions.classifierBody.AddedInterfaceMethodReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.AddedClassMethodReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.ChangedJavaReturnTypeReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.RemovedPublicModifierFromClassMethodReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.RemovedInterfaceMethodReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.RemovedClassMethodReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.RenamedMemberReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.AddedParameterReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.RemovedParameterReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.RenamedParameterReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.AddedFieldReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.ChangedFieldTypeReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.classifierBody.RemovedFieldReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody.classifierBody"))));
    this.addReaction(new mir.reactions.methodBody.AddedMethodCallReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("all.methodBody"))));
  }
}
