/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.providers;

import net.certware.argument.cae.util.CaeAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class CaeEEFAdapterFactory extends CaeAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.cae.util.CaeAdapterFactory#createClaimAdapter()
	 * 
	 */
	public Adapter createClaimAdapter() {
		return new ClaimPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.cae.util.CaeAdapterFactory#createArgumentAdapter()
	 * 
	 */
	public Adapter createArgumentAdapter() {
		return new ArgumentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.cae.util.CaeAdapterFactory#createEvidenceAdapter()
	 * 
	 */
	public Adapter createEvidenceAdapter() {
		return new EvidencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.cae.util.CaeAdapterFactory#createAssumptionAdapter()
	 * 
	 */
	public Adapter createAssumptionAdapter() {
		return new AssumptionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.cae.util.CaeAdapterFactory#createContextAdapter()
	 * 
	 */
	public Adapter createContextAdapter() {
		return new ContextPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.cae.util.CaeAdapterFactory#createJustificationAdapter()
	 * 
	 */
	public Adapter createJustificationAdapter() {
		return new JustificationPropertiesEditionProvider();
	}

}
