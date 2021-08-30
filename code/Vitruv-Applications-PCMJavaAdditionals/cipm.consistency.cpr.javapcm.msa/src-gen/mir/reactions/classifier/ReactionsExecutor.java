package mir.reactions.classifier;

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
    return new mir.routines.classifier.RoutinesFacadesProvider();
  }
  
  protected void setup() {
    this.addReaction(new mir.reactions.commonOperationProvidedRole.AddedTypeReferenceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier.Servlet.JaxRS.common.commonOperationProvidedRole"))));
    this.addReaction(new mir.reactions.commonOperationProvidedRole.RemovedTypeReferenceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier.Servlet.JaxRS.common.commonOperationProvidedRole"))));
    this.addReaction(new mir.reactions.commonOperationRequiredRole.AddedImportReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier.Servlet.JaxRS.common.commonOperationRequiredRole"))));
    this.addReaction(new mir.reactions.commonOperationRequiredRole.RemovedImportReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier.Servlet.JaxRS.common.commonOperationRequiredRole"))));
    this.addReaction(new mir.reactions.classifier.AddedClassReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier"))));
    this.addReaction(new mir.reactions.classifier.AddedInterfaceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier"))));
    this.addReaction(new mir.reactions.classifier.RemovedClassReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier"))));
    this.addReaction(new mir.reactions.classifier.RemovedInterfaceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier"))));
    this.addReaction(new mir.reactions.classifier.RemovedModuleReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("classifier"))));
  }
}
