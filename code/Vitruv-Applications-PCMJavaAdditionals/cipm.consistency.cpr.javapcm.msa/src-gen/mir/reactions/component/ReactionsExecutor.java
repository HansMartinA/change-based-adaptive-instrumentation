package mir.reactions.component;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsExecutor;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadesProvider;

@SuppressWarnings("all")
class ReactionsExecutor extends AbstractReactionsExecutor {
  public ReactionsExecutor() {
    super(new cipm.consistency.domains.java.AdjustedJavaDomainProvider().getDomain(), 
    	new cipm.consistency.domains.pcm.ExtendedPcmDomainProvider().getDomain());
  }
  
  protected RoutinesFacadesProvider createRoutinesFacadesProvider() {
    return new mir.routines.component.RoutinesFacadesProvider();
  }
  
  protected void setup() {
    
  }
}
