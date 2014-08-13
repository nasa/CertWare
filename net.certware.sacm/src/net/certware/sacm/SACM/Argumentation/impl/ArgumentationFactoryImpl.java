/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.impl;

import net.certware.sacm.SACM.Argumentation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationFactoryImpl extends EFactoryImpl implements ArgumentationFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArgumentationFactory init() {
		try {
			ArgumentationFactory theArgumentationFactory = (ArgumentationFactory)EPackage.Registry.INSTANCE.getEFactory(ArgumentationPackage.eNS_URI);
			if (theArgumentationFactory != null) {
				return theArgumentationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArgumentationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArgumentationPackage.ARGUMENTATION: return createArgumentation();
			case ArgumentationPackage.CITATION_ELEMENT: return createCitationElement();
			case ArgumentationPackage.INFORMATION_ELEMENT: return createInformationElement();
			case ArgumentationPackage.ARGUMENT_REASONING: return createArgumentReasoning();
			case ArgumentationPackage.CLAIM: return createClaim();
			case ArgumentationPackage.ASSERTED_INFERENCE: return createAssertedInference();
			case ArgumentationPackage.ASSERTED_EVIDENCE: return createAssertedEvidence();
			case ArgumentationPackage.ASSERTED_CONTEXT: return createAssertedContext();
			case ArgumentationPackage.ASSERTED_CHALLENGE: return createAssertedChallenge();
			case ArgumentationPackage.ASSERTED_COUNTER_EVIDENCE: return createAssertedCounterEvidence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argumentation createArgumentation() {
		ArgumentationImpl argumentation = new ArgumentationImpl();
		return argumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitationElement createCitationElement() {
		CitationElementImpl citationElement = new CitationElementImpl();
		return citationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationElement createInformationElement() {
		InformationElementImpl informationElement = new InformationElementImpl();
		return informationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoning createArgumentReasoning() {
		ArgumentReasoningImpl argumentReasoning = new ArgumentReasoningImpl();
		return argumentReasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedInference createAssertedInference() {
		AssertedInferenceImpl assertedInference = new AssertedInferenceImpl();
		return assertedInference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedEvidence createAssertedEvidence() {
		AssertedEvidenceImpl assertedEvidence = new AssertedEvidenceImpl();
		return assertedEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedContext createAssertedContext() {
		AssertedContextImpl assertedContext = new AssertedContextImpl();
		return assertedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedChallenge createAssertedChallenge() {
		AssertedChallengeImpl assertedChallenge = new AssertedChallengeImpl();
		return assertedChallenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedCounterEvidence createAssertedCounterEvidence() {
		AssertedCounterEvidenceImpl assertedCounterEvidence = new AssertedCounterEvidenceImpl();
		return assertedCounterEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationPackage getArgumentationPackage() {
		return (ArgumentationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArgumentationPackage getPackage() {
		return ArgumentationPackage.eINSTANCE;
	}

} //ArgumentationFactoryImpl
