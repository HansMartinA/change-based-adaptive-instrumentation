package mir.reactions.common;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;
import tools.vitruv.framework.propagation.ChangePropagationSpecification;

@SuppressWarnings("all")
public class CommonChangePropagationSpecification extends AbstractReactionsChangePropagationSpecification implements ChangePropagationSpecification {
  public CommonChangePropagationSpecification() {
    super(new cipm.consistency.domains.java.AdjustedJavaDomainProvider().getDomain(), 
    	new cipm.consistency.domains.pcm.ExtendedPcmDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.common.ReactionsExecutor());
  }
}
