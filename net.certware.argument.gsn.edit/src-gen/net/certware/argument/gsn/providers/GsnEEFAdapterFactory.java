/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.providers;

import net.certware.argument.gsn.util.GsnAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class GsnEEFAdapterFactory extends GsnAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.gsn.util.GsnAdapterFactory#createGoalAdapter()
	 * 
	 */
	public Adapter createGoalAdapter() {
		return new GoalPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.gsn.util.GsnAdapterFactory#createStrategyAdapter()
	 * 
	 */
	public Adapter createStrategyAdapter() {
		return new StrategyPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.gsn.util.GsnAdapterFactory#createJustificationAdapter()
	 * 
	 */
	public Adapter createJustificationAdapter() {
		return new JustificationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.gsn.util.GsnAdapterFactory#createContextAdapter()
	 * 
	 */
	public Adapter createContextAdapter() {
		return new ContextPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.gsn.util.GsnAdapterFactory#createAssumptionAdapter()
	 * 
	 */
	public Adapter createAssumptionAdapter() {
		return new AssumptionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.gsn.util.GsnAdapterFactory#createSolutionAdapter()
	 * 
	 */
	public Adapter createSolutionAdapter() {
		return new SolutionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.gsn.util.GsnAdapterFactory#createEvidenceAdapter()
	 * 
	 */
	public Adapter createEvidenceAdapter() {
		return new EvidencePropertiesEditionProvider();
	}

}
