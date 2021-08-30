package mir.reactions.commonOperationRequiredRole;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;
import tools.vitruv.framework.propagation.ChangePropagationSpecification;

@SuppressWarnings("all")
public class CommonOperationRequiredRoleChangePropagationSpecification extends AbstractReactionsChangePropagationSpecification implements ChangePropagationSpecification {
  public CommonOperationRequiredRoleChangePropagationSpecification() {
    super(new cipm.consistency.domains.java.AdjustedJavaDomainProvider().getDomain(), 
    	new cipm.consistency.domains.pcm.ExtendedPcmDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.commonOperationRequiredRole.ReactionsExecutor());
  }
}
