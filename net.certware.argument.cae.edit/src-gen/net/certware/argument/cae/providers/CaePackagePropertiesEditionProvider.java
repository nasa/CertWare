/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * 
 * 
 */
public class CaePackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public CaePackagePropertiesEditionProvider() {
		super();
		append(createClaimPropertiesEditionProvider());
		append(createArgumentPropertiesEditionProvider());
		append(createEvidencePropertiesEditionProvider());
		append(createAssumptionPropertiesEditionProvider());
		append(createContextPropertiesEditionProvider());
		append(createJustificationPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Claim instances.
	 * 
	 */
	protected ClaimPropertiesEditionProvider claimPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Claim
	 * 
	 */
	public ClaimPropertiesEditionProvider createClaimPropertiesEditionProvider() {
		if (claimPropertiesEditionProvider == null)
			claimPropertiesEditionProvider = new ClaimPropertiesEditionProvider();
		return claimPropertiesEditionProvider;
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
	 * Evidence instances.
	 * 
	 */
	protected EvidencePropertiesEditionProvider evidencePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Evidence
	 * 
	 */
	public EvidencePropertiesEditionProvider createEvidencePropertiesEditionProvider() {
		if (evidencePropertiesEditionProvider == null)
			evidencePropertiesEditionProvider = new EvidencePropertiesEditionProvider();
		return evidencePropertiesEditionProvider;
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

}
