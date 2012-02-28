/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.providers;

import net.certware.argument.arm.util.ArmAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;


/**
 * 
 * 
 */
public class ArmEEFAdapterFactory extends ArmAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createTaggedValueAdapter()
	 * 
	 */
	public Adapter createTaggedValueAdapter() {
		return new TaggedValuePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createArgumentAdapter()
	 * 
	 */
	public Adapter createArgumentAdapter() {
		return new ArgumentPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createAnnotationAdapter()
	 * 
	 */
	public Adapter createAnnotationAdapter() {
		return new AnnotationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createAssertedInferenceAdapter()
	 * 
	 */
	public Adapter createAssertedInferenceAdapter() {
		return new AssertedInferencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createAssertedEvidenceAdapter()
	 * 
	 */
	public Adapter createAssertedEvidenceAdapter() {
		return new AssertedEvidencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createAssertedContextAdapter()
	 * 
	 */
	public Adapter createAssertedContextAdapter() {
		return new AssertedContextPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createAssertedCounterEvidenceAdapter()
	 * 
	 */
	public Adapter createAssertedCounterEvidenceAdapter() {
		return new AssertedCounterEvidencePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createAssertedChallengeAdapter()
	 * 
	 */
	public Adapter createAssertedChallengeAdapter() {
		return new AssertedChallengePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createClaimAdapter()
	 * 
	 */
	public Adapter createClaimAdapter() {
		return new ClaimPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createEvidenceAssertionAdapter()
	 * 
	 */
	public Adapter createEvidenceAssertionAdapter() {
		return new EvidenceAssertionPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createInformationElementAdapter()
	 * 
	 */
	public Adapter createInformationElementAdapter() {
		return new InformationElementPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createArgumentReasoningAdapter()
	 * 
	 */
	public Adapter createArgumentReasoningAdapter() {
		return new ArgumentReasoningPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.argument.arm.util.ArmAdapterFactory#createCitationElementAdapter()
	 * 
	 */
	public Adapter createCitationElementAdapter() {
		return new CitationElementPropertiesEditionProvider();
	}

}
