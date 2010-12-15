/**
 * Generated with Acceleo
 */
package net.certware.argument.eur.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * 
 * 
 */
public class EurPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public EurPackagePropertiesEditionProvider() {
		super();
		append(createArgumentPropertiesEditionProvider());
		append(createStrategyPropertiesEditionProvider());
		append(createSolutionPropertiesEditionProvider());
		append(createAssumptionPropertiesEditionProvider());
		append(createContextPropertiesEditionProvider());
		append(createJustificationPropertiesEditionProvider());
		append(createCriteriaPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Argument instances.
	 * 
	 */
	protected ArgumentPropertiesEditionProvider argumentPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Argument
	 * 
	 */
	public ArgumentPropertiesEditionProvider createArgumentPropertiesEditionProvider() {
		if (argumentPropertiesEditionProvider == null)
			argumentPropertiesEditionProvider = new ArgumentPropertiesEditionProvider();
		return argumentPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Strategy instances.
	 * 
	 */
	protected StrategyPropertiesEditionProvider strategyPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Strategy
	 * 
	 */
	public StrategyPropertiesEditionProvider createStrategyPropertiesEditionProvider() {
		if (strategyPropertiesEditionProvider == null)
			strategyPropertiesEditionProvider = new StrategyPropertiesEditionProvider();
		return strategyPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Solution instances.
	 * 
	 */
	protected SolutionPropertiesEditionProvider solutionPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Solution
	 * 
	 */
	public SolutionPropertiesEditionProvider createSolutionPropertiesEditionProvider() {
		if (solutionPropertiesEditionProvider == null)
			solutionPropertiesEditionProvider = new SolutionPropertiesEditionProvider();
		return solutionPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Assumption instances.
	 * 
	 */
	protected AssumptionPropertiesEditionProvider assumptionPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Assumption
	 * 
	 */
	public AssumptionPropertiesEditionProvider createAssumptionPropertiesEditionProvider() {
		if (assumptionPropertiesEditionProvider == null)
			assumptionPropertiesEditionProvider = new AssumptionPropertiesEditionProvider();
		return assumptionPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Context instances.
	 * 
	 */
	protected ContextPropertiesEditionProvider contextPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Context
	 * 
	 */
	public ContextPropertiesEditionProvider createContextPropertiesEditionProvider() {
		if (contextPropertiesEditionProvider == null)
			contextPropertiesEditionProvider = new ContextPropertiesEditionProvider();
		return contextPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Justification instances.
	 * 
	 */
	protected JustificationPropertiesEditionProvider justificationPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Justification
	 * 
	 */
	public JustificationPropertiesEditionProvider createJustificationPropertiesEditionProvider() {
		if (justificationPropertiesEditionProvider == null)
			justificationPropertiesEditionProvider = new JustificationPropertiesEditionProvider();
		return justificationPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Criteria instances.
	 * 
	 */
	protected CriteriaPropertiesEditionProvider criteriaPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Criteria
	 * 
	 */
	public CriteriaPropertiesEditionProvider createCriteriaPropertiesEditionProvider() {
		if (criteriaPropertiesEditionProvider == null)
			criteriaPropertiesEditionProvider = new CriteriaPropertiesEditionProvider();
		return criteriaPropertiesEditionProvider;
	}

}
