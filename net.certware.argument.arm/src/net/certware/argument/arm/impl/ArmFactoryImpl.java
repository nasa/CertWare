/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010 Kestrel Technology LLC (generated models) 
 */
package net.certware.argument.arm.impl;

import net.certware.argument.arm.Annotation;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.AssertedChallenge;
import net.certware.argument.arm.AssertedContext;
import net.certware.argument.arm.AssertedCounterEvidence;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedInference;
import net.certware.argument.arm.CitationElement;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.EvidenceAssertion;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.TaggedValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ArmFactoryImpl extends EFactoryImpl implements ArmFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010 Kestrel Technology LLC (generated models) "; //$NON-NLS-1$

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArmFactory init() {
		try {
			ArmFactory theArmFactory = (ArmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.omg.org/ARM"); //$NON-NLS-1$ 
			if (theArmFactory != null) {
				return theArmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmFactoryImpl() {
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
			case ArmPackage.TAGGED_VALUE: return createTaggedValue();
			case ArmPackage.ARGUMENT: return createArgument();
			case ArmPackage.ANNOTATION: return createAnnotation();
			case ArmPackage.ASSERTED_INFERENCE: return createAssertedInference();
			case ArmPackage.ASSERTED_EVIDENCE: return createAssertedEvidence();
			case ArmPackage.ASSERTED_CONTEXT: return createAssertedContext();
			case ArmPackage.ASSERTED_COUNTER_EVIDENCE: return createAssertedCounterEvidence();
			case ArmPackage.ASSERTED_CHALLENGE: return createAssertedChallenge();
			case ArmPackage.CLAIM: return createClaim();
			case ArmPackage.EVIDENCE_ASSERTION: return createEvidenceAssertion();
			case ArmPackage.INFORMATION_ELEMENT: return createInformationElement();
			case ArmPackage.ARGUMENT_REASONING: return createArgumentReasoning();
			case ArmPackage.CITATION_ELEMENT: return createCitationElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ArmPackage.STRING:
				return createStringFromString(eDataType, initialValue);
			case ArmPackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case ArmPackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ArmPackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			case ArmPackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case ArmPackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedValue createTaggedValue() {
		TaggedValueImpl taggedValue = new TaggedValueImpl();
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
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
	public AssertedCounterEvidence createAssertedCounterEvidence() {
		AssertedCounterEvidenceImpl assertedCounterEvidence = new AssertedCounterEvidenceImpl();
		return assertedCounterEvidence;
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
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceAssertion createEvidenceAssertion() {
		EvidenceAssertionImpl evidenceAssertion = new EvidenceAssertionImpl();
		return evidenceAssertion;
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
	public CitationElement createCitationElement() {
		CitationElementImpl citationElement = new CitationElementImpl();
		return citationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmPackage getArmPackage() {
		return (ArmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArmPackage getPackage() {
		return ArmPackage.eINSTANCE;
	}

} //ArmFactoryImpl
