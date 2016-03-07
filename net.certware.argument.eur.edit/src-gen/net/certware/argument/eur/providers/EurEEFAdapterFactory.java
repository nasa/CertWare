/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.providers;

import net.certware.argument.eur.util.EurAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class EurEEFAdapterFactory extends EurAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.eur.util.EurAdapterFactory#createArgumentAdapter()
	 * 
	 */
	public Adapter createArgumentAdapter() {
		return new ArgumentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.eur.util.EurAdapterFactory#createStrategyAdapter()
	 * 
	 */
	public Adapter createStrategyAdapter() {
		return new StrategyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.eur.util.EurAdapterFactory#createSolutionAdapter()
	 * 
	 */
	public Adapter createSolutionAdapter() {
		return new SolutionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.eur.util.EurAdapterFactory#createAssumptionAdapter()
	 * 
	 */
	public Adapter createAssumptionAdapter() {
		return new AssumptionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.eur.util.EurAdapterFactory#createContextAdapter()
	 * 
	 */
	public Adapter createContextAdapter() {
		return new ContextPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.eur.util.EurAdapterFactory#createJustificationAdapter()
	 * 
	 */
	public Adapter createJustificationAdapter() {
		return new JustificationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.eur.util.EurAdapterFactory#createCriteriaAdapter()
	 * 
	 */
	public Adapter createCriteriaAdapter() {
		return new CriteriaPropertiesEditionProvider();
	}

}
