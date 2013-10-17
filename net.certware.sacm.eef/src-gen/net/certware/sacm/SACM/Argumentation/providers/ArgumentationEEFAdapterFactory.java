/**
 * Generated with Acceleo
 */
package net.certware.sacm.SACM.Argumentation.providers;

import net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class ArgumentationEEFAdapterFactory extends ArgumentationAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createArgumentationAdapter()
	 * 
	 */
	public Adapter createArgumentationAdapter() {
		return new ArgumentationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createCitationElementAdapter()
	 * 
	 */
	public Adapter createCitationElementAdapter() {
		return new CitationElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createInformationElementAdapter()
	 * 
	 */
	public Adapter createInformationElementAdapter() {
		return new InformationElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createArgumentReasoningAdapter()
	 * 
	 */
	public Adapter createArgumentReasoningAdapter() {
		return new ArgumentReasoningPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createClaimAdapter()
	 * 
	 */
	public Adapter createClaimAdapter() {
		return new ClaimPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createAssertedInferenceAdapter()
	 * 
	 */
	public Adapter createAssertedInferenceAdapter() {
		return new AssertedInferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createAssertedEvidenceAdapter()
	 * 
	 */
	public Adapter createAssertedEvidenceAdapter() {
		return new AssertedEvidencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createAssertedContextAdapter()
	 * 
	 */
	public Adapter createAssertedContextAdapter() {
		return new AssertedContextPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createAssertedChallengeAdapter()
	 * 
	 */
	public Adapter createAssertedChallengeAdapter() {
		return new AssertedChallengePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory#createAssertedCounterEvidenceAdapter()
	 * 
	 */
	public Adapter createAssertedCounterEvidenceAdapter() {
		return new AssertedCounterEvidencePropertiesEditionProvider();
	}

}
