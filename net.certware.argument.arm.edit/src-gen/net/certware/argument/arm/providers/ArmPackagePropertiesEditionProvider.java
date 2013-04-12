/*
 * Copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */
package net.certware.argument.arm.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * @author
 * 
 */
public class ArmPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public ArmPackagePropertiesEditionProvider() {
		super();
		append(createTaggedValuePropertiesEditionProvider());
		append(createArgumentPropertiesEditionProvider());
		append(createAnnotationPropertiesEditionProvider());
		append(createAssertedInferencePropertiesEditionProvider());
		append(createAssertedEvidencePropertiesEditionProvider());
		append(createAssertedContextPropertiesEditionProvider());
		append(createAssertedCounterEvidencePropertiesEditionProvider());
		append(createAssertedChallengePropertiesEditionProvider());
		append(createClaimPropertiesEditionProvider());
		append(createEvidenceAssertionPropertiesEditionProvider());
		append(createInformationElementPropertiesEditionProvider());
		append(createArgumentReasoningPropertiesEditionProvider());
		append(createCitationElementPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * TaggedValue instances.
	 * 
	 */
	protected TaggedValuePropertiesEditionProvider taggedValuePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a TaggedValue
	 * 
	 */
	public TaggedValuePropertiesEditionProvider createTaggedValuePropertiesEditionProvider() {
		if (taggedValuePropertiesEditionProvider == null)
			taggedValuePropertiesEditionProvider = new TaggedValuePropertiesEditionProvider();
		return taggedValuePropertiesEditionProvider;
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
	 * Annotation instances.
	 * 
	 */
	protected AnnotationPropertiesEditionProvider annotationPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Annotation
	 * 
	 */
	public AnnotationPropertiesEditionProvider createAnnotationPropertiesEditionProvider() {
		if (annotationPropertiesEditionProvider == null)
			annotationPropertiesEditionProvider = new AnnotationPropertiesEditionProvider();
		return annotationPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * AssertedInference instances.
	 * 
	 */
	protected AssertedInferencePropertiesEditionProvider assertedInferencePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a AssertedInference
	 * 
	 */
	public AssertedInferencePropertiesEditionProvider createAssertedInferencePropertiesEditionProvider() {
		if (assertedInferencePropertiesEditionProvider == null)
			assertedInferencePropertiesEditionProvider = new AssertedInferencePropertiesEditionProvider();
		return assertedInferencePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * AssertedEvidence instances.
	 * 
	 */
	protected AssertedEvidencePropertiesEditionProvider assertedEvidencePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a AssertedEvidence
	 * 
	 */
	public AssertedEvidencePropertiesEditionProvider createAssertedEvidencePropertiesEditionProvider() {
		if (assertedEvidencePropertiesEditionProvider == null)
			assertedEvidencePropertiesEditionProvider = new AssertedEvidencePropertiesEditionProvider();
		return assertedEvidencePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * AssertedContext instances.
	 * 
	 */
	protected AssertedContextPropertiesEditionProvider assertedContextPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a AssertedContext
	 * 
	 */
	public AssertedContextPropertiesEditionProvider createAssertedContextPropertiesEditionProvider() {
		if (assertedContextPropertiesEditionProvider == null)
			assertedContextPropertiesEditionProvider = new AssertedContextPropertiesEditionProvider();
		return assertedContextPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * AssertedCounterEvidence instances.
	 * 
	 */
	protected AssertedCounterEvidencePropertiesEditionProvider assertedCounterEvidencePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a AssertedCounterEvidence
	 * 
	 */
	public AssertedCounterEvidencePropertiesEditionProvider createAssertedCounterEvidencePropertiesEditionProvider() {
		if (assertedCounterEvidencePropertiesEditionProvider == null)
			assertedCounterEvidencePropertiesEditionProvider = new AssertedCounterEvidencePropertiesEditionProvider();
		return assertedCounterEvidencePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * AssertedChallenge instances.
	 * 
	 */
	protected AssertedChallengePropertiesEditionProvider assertedChallengePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a AssertedChallenge
	 * 
	 */
	public AssertedChallengePropertiesEditionProvider createAssertedChallengePropertiesEditionProvider() {
		if (assertedChallengePropertiesEditionProvider == null)
			assertedChallengePropertiesEditionProvider = new AssertedChallengePropertiesEditionProvider();
		return assertedChallengePropertiesEditionProvider;
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
	 * EvidenceAssertion instances.
	 * 
	 */
	protected EvidenceAssertionPropertiesEditionProvider evidenceAssertionPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a EvidenceAssertion
	 * 
	 */
	public EvidenceAssertionPropertiesEditionProvider createEvidenceAssertionPropertiesEditionProvider() {
		if (evidenceAssertionPropertiesEditionProvider == null)
			evidenceAssertionPropertiesEditionProvider = new EvidenceAssertionPropertiesEditionProvider();
		return evidenceAssertionPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * InformationElement instances.
	 * 
	 */
	protected InformationElementPropertiesEditionProvider informationElementPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a InformationElement
	 * 
	 */
	public InformationElementPropertiesEditionProvider createInformationElementPropertiesEditionProvider() {
		if (informationElementPropertiesEditionProvider == null)
			informationElementPropertiesEditionProvider = new InformationElementPropertiesEditionProvider();
		return informationElementPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * ArgumentReasoning instances.
	 * 
	 */
	protected ArgumentReasoningPropertiesEditionProvider argumentReasoningPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a ArgumentReasoning
	 * 
	 */
	public ArgumentReasoningPropertiesEditionProvider createArgumentReasoningPropertiesEditionProvider() {
		if (argumentReasoningPropertiesEditionProvider == null)
			argumentReasoningPropertiesEditionProvider = new ArgumentReasoningPropertiesEditionProvider();
		return argumentReasoningPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * CitationElement instances.
	 * 
	 */
	protected CitationElementPropertiesEditionProvider citationElementPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a CitationElement
	 * 
	 */
	public CitationElementPropertiesEditionProvider createCitationElementPropertiesEditionProvider() {
		if (citationElementPropertiesEditionProvider == null)
			citationElementPropertiesEditionProvider = new CitationElementPropertiesEditionProvider();
		return citationElementPropertiesEditionProvider;
	}

}
