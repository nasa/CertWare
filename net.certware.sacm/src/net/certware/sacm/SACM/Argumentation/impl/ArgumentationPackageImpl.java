/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.impl;

import net.certware.sacm.SACM.Argumentation.ArgumentElement;
import net.certware.sacm.SACM.Argumentation.ArgumentReasoning;
import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Argumentation.ArgumentationElement;
import net.certware.sacm.SACM.Argumentation.ArgumentationFactory;
import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.AssertedChallenge;
import net.certware.sacm.SACM.Argumentation.AssertedContext;
import net.certware.sacm.SACM.Argumentation.AssertedCounterEvidence;
import net.certware.sacm.SACM.Argumentation.AssertedEvidence;
import net.certware.sacm.SACM.Argumentation.AssertedInference;
import net.certware.sacm.SACM.Argumentation.AssertedRelationship;
import net.certware.sacm.SACM.Argumentation.Assertion;
import net.certware.sacm.SACM.Argumentation.CitationElement;
import net.certware.sacm.SACM.Argumentation.Claim;
import net.certware.sacm.SACM.Argumentation.InformationElement;
import net.certware.sacm.SACM.Argumentation.ReasoningElement;

import net.certware.sacm.SACM.Evidence.EvidencePackage;

import net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl;

import net.certware.sacm.SACM.SACMPackage;

import net.certware.sacm.SACM.impl.SACMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationPackageImpl extends EPackageImpl implements ArgumentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasoningElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentReasoningEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedInferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedChallengeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedCounterEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentationElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArgumentationPackageImpl() {
		super(eNS_URI, ArgumentationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArgumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArgumentationPackage init() {
		if (isInited) return (ArgumentationPackage)EPackage.Registry.INSTANCE.getEPackage(ArgumentationPackage.eNS_URI);

		// Obtain or create and register package
		ArgumentationPackageImpl theArgumentationPackage = (ArgumentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArgumentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArgumentationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		SACMPackageImpl theSACMPackage = (SACMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SACMPackage.eNS_URI) instanceof SACMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SACMPackage.eNS_URI) : SACMPackage.eINSTANCE);
		EvidencePackageImpl theEvidencePackage = (EvidencePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EvidencePackage.eNS_URI) instanceof EvidencePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EvidencePackage.eNS_URI) : EvidencePackage.eINSTANCE);

		// Create package meta-data objects
		theArgumentationPackage.createPackageContents();
		theSACMPackage.createPackageContents();
		theEvidencePackage.createPackageContents();

		// Initialize created meta-data
		theArgumentationPackage.initializePackageContents();
		theSACMPackage.initializePackageContents();
		theEvidencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArgumentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArgumentationPackage.eNS_URI, theArgumentationPackage);
		return theArgumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentation() {
		return argumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentation_Argumentation() {
		return (EReference)argumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentation_ArgumentElement() {
		return (EReference)argumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentElement() {
		return argumentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitationElement() {
		return citationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitationElement_ArgumentElementReference() {
		return (EReference)citationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitationElement_ArgumentationReference() {
		return (EReference)citationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationElement() {
		return informationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationElement_Evidence() {
		return (EReference)informationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformationElement_Url() {
		return (EAttribute)informationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoningElement() {
		return reasoningElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentReasoning() {
		return argumentReasoningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentReasoning_Structure() {
		return (EReference)argumentReasoningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentReasoning_DescribedInference() {
		return (EReference)argumentReasoningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentReasoning_DescribedChallenge() {
		return (EReference)argumentReasoningEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedRelationship() {
		return assertedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertedRelationship_Source() {
		return (EReference)assertedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertedRelationship_Target() {
		return (EReference)assertedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_Assumed() {
		return (EAttribute)claimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_ToBeSupported() {
		return (EAttribute)claimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedInference() {
		return assertedInferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedEvidence() {
		return assertedEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedContext() {
		return assertedContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedChallenge() {
		return assertedChallengeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedCounterEvidence() {
		return assertedCounterEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentationElement() {
		return argumentationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentationElement_Description() {
		return (EAttribute)argumentationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentationElement_Content() {
		return (EAttribute)argumentationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactory getArgumentationFactory() {
		return (ArgumentationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		argumentationEClass = createEClass(ARGUMENTATION);
		createEReference(argumentationEClass, ARGUMENTATION__ARGUMENTATION);
		createEReference(argumentationEClass, ARGUMENTATION__ARGUMENT_ELEMENT);

		argumentElementEClass = createEClass(ARGUMENT_ELEMENT);

		citationElementEClass = createEClass(CITATION_ELEMENT);
		createEReference(citationElementEClass, CITATION_ELEMENT__ARGUMENT_ELEMENT_REFERENCE);
		createEReference(citationElementEClass, CITATION_ELEMENT__ARGUMENTATION_REFERENCE);

		informationElementEClass = createEClass(INFORMATION_ELEMENT);
		createEReference(informationElementEClass, INFORMATION_ELEMENT__EVIDENCE);
		createEAttribute(informationElementEClass, INFORMATION_ELEMENT__URL);

		reasoningElementEClass = createEClass(REASONING_ELEMENT);

		assertionEClass = createEClass(ASSERTION);

		argumentReasoningEClass = createEClass(ARGUMENT_REASONING);
		createEReference(argumentReasoningEClass, ARGUMENT_REASONING__STRUCTURE);
		createEReference(argumentReasoningEClass, ARGUMENT_REASONING__DESCRIBED_INFERENCE);
		createEReference(argumentReasoningEClass, ARGUMENT_REASONING__DESCRIBED_CHALLENGE);

		assertedRelationshipEClass = createEClass(ASSERTED_RELATIONSHIP);
		createEReference(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__SOURCE);
		createEReference(assertedRelationshipEClass, ASSERTED_RELATIONSHIP__TARGET);

		claimEClass = createEClass(CLAIM);
		createEAttribute(claimEClass, CLAIM__ASSUMED);
		createEAttribute(claimEClass, CLAIM__TO_BE_SUPPORTED);

		assertedInferenceEClass = createEClass(ASSERTED_INFERENCE);

		assertedEvidenceEClass = createEClass(ASSERTED_EVIDENCE);

		assertedContextEClass = createEClass(ASSERTED_CONTEXT);

		assertedChallengeEClass = createEClass(ASSERTED_CHALLENGE);

		assertedCounterEvidenceEClass = createEClass(ASSERTED_COUNTER_EVIDENCE);

		argumentationElementEClass = createEClass(ARGUMENTATION_ELEMENT);
		createEAttribute(argumentationElementEClass, ARGUMENTATION_ELEMENT__DESCRIPTION);
		createEAttribute(argumentationElementEClass, ARGUMENTATION_ELEMENT__CONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EvidencePackage theEvidencePackage = (EvidencePackage)EPackage.Registry.INSTANCE.getEPackage(EvidencePackage.eNS_URI);
		SACMPackage theSACMPackage = (SACMPackage)EPackage.Registry.INSTANCE.getEPackage(SACMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		argumentationEClass.getESuperTypes().add(this.getArgumentationElement());
		argumentElementEClass.getESuperTypes().add(this.getArgumentationElement());
		citationElementEClass.getESuperTypes().add(this.getArgumentElement());
		informationElementEClass.getESuperTypes().add(this.getArgumentElement());
		reasoningElementEClass.getESuperTypes().add(this.getArgumentElement());
		assertionEClass.getESuperTypes().add(this.getReasoningElement());
		argumentReasoningEClass.getESuperTypes().add(this.getReasoningElement());
		assertedRelationshipEClass.getESuperTypes().add(this.getAssertion());
		claimEClass.getESuperTypes().add(this.getAssertion());
		assertedInferenceEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedEvidenceEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedContextEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedChallengeEClass.getESuperTypes().add(this.getAssertedRelationship());
		assertedCounterEvidenceEClass.getESuperTypes().add(this.getAssertedRelationship());
		argumentationElementEClass.getESuperTypes().add(theSACMPackage.getModelElement());

		// Initialize classes and features; add operations and parameters
		initEClass(argumentationEClass, Argumentation.class, "Argumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArgumentation_Argumentation(), this.getArgumentation(), null, "argumentation", null, 0, -1, Argumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentation_ArgumentElement(), this.getArgumentElement(), null, "argumentElement", null, 0, -1, Argumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(argumentElementEClass, ArgumentElement.class, "ArgumentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(citationElementEClass, CitationElement.class, "CitationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCitationElement_ArgumentElementReference(), this.getArgumentElement(), null, "argumentElementReference", null, 0, -1, CitationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getCitationElement_ArgumentationReference(), this.getArgumentation(), null, "argumentationReference", null, 0, -1, CitationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(informationElementEClass, InformationElement.class, "InformationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getInformationElement_Evidence(), theEvidencePackage.getEvidenceItem(), null, "evidence", null, 0, -1, InformationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getInformationElement_Url(), theSACMPackage.getString(), "url", null, 1, 1, InformationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reasoningElementEClass, ReasoningElement.class, "ReasoningElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(argumentReasoningEClass, ArgumentReasoning.class, "ArgumentReasoning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArgumentReasoning_Structure(), this.getArgumentation(), null, "structure", null, 0, -1, ArgumentReasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentReasoning_DescribedInference(), this.getAssertedInference(), null, "describedInference", null, 0, -1, ArgumentReasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentReasoning_DescribedChallenge(), this.getAssertedChallenge(), null, "describedChallenge", null, 0, -1, ArgumentReasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(assertedRelationshipEClass, AssertedRelationship.class, "AssertedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getAssertedRelationship_Source(), this.getArgumentElement(), null, "source", null, 0, -1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getAssertedRelationship_Target(), this.getArgumentElement(), null, "target", null, 0, -1, AssertedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(claimEClass, Claim.class, "Claim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getClaim_Assumed(), theSACMPackage.getBoolean(), "assumed", null, 1, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getClaim_ToBeSupported(), theSACMPackage.getBoolean(), "toBeSupported", null, 1, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(assertedInferenceEClass, AssertedInference.class, "AssertedInference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(assertedEvidenceEClass, AssertedEvidence.class, "AssertedEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(assertedContextEClass, AssertedContext.class, "AssertedContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(assertedChallengeEClass, AssertedChallenge.class, "AssertedChallenge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(assertedCounterEvidenceEClass, AssertedCounterEvidence.class, "AssertedCounterEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(argumentationElementEClass, ArgumentationElement.class, "ArgumentationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArgumentationElement_Description(), theSACMPackage.getString(), "description", null, 1, 1, ArgumentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getArgumentationElement_Content(), theSACMPackage.getString(), "content", null, 1, 1, ArgumentationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
	}

} //ArgumentationPackageImpl
