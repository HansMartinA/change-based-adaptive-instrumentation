package mir.reactions.commonOperationProvidedRole;

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
    return new mir.routines.commonOperationProvidedRole.RoutinesFacadesProvider();
  }
  
  protected void setup() {
    this.addReaction(new mir.reactions.commonOperationProvidedRole.AddedTypeReferenceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("commonOperationProvidedRole"))));
    this.addReaction(new mir.reactions.commonOperationProvidedRole.RemovedTypeReferenceReaction(this.getRoutinesFacadesProvider().getRoutinesFacade(ReactionsImportPath.fromPathString("commonOperationProvidedRole"))));
  }
}
