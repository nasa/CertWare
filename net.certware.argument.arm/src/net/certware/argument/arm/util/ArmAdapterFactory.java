/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.argument.arm.util;

import net.certware.argument.arm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.argument.arm.ArmPackage
 * @generated
 */
public class ArmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved. (generated models) "; //$NON-NLS-1$

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArmSwitch<Adapter> modelSwitch =
		new ArmSwitch<Adapter>() {
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseTaggedValue(TaggedValue object) {
				return createTaggedValueAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseArgumentElement(ArgumentElement object) {
				return createArgumentElementAdapter();
			}
			@Override
			public Adapter caseArgumentLink(ArgumentLink object) {
				return createArgumentLinkAdapter();
			}
			@Override
			public Adapter caseAssertedRelationship(AssertedRelationship object) {
				return createAssertedRelationshipAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAssertedInference(AssertedInference object) {
				return createAssertedInferenceAdapter();
			}
			@Override
			public Adapter caseAssertedEvidence(AssertedEvidence object) {
				return createAssertedEvidenceAdapter();
			}
			@Override
			public Adapter caseAssertedContext(AssertedContext object) {
				return createAssertedContextAdapter();
			}
			@Override
			public Adapter caseAssertedCounterEvidence(AssertedCounterEvidence object) {
				return createAssertedCounterEvidenceAdapter();
			}
			@Override
			public Adapter caseAssertedChallenge(AssertedChallenge object) {
				return createAssertedChallengeAdapter();
			}
			@Override
			public Adapter caseReasoningElement(ReasoningElement object) {
				return createReasoningElementAdapter();
			}
			@Override
			public Adapter caseClaim(Claim object) {
				return createClaimAdapter();
			}
			@Override
			public Adapter caseEvidenceAssertion(EvidenceAssertion object) {
				return createEvidenceAssertionAdapter();
			}
			@Override
			public Adapter caseInformationElement(InformationElement object) {
				return createInformationElementAdapter();
			}
			@Override
			public Adapter caseArgumentReasoning(ArgumentReasoning object) {
				return createArgumentReasoningAdapter();
			}
			@Override
			public Adapter caseCitationElement(CitationElement object) {
				return createCitationElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.TaggedValue
	 * @generated
	 */
	public Adapter createTaggedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.ArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.ArgumentElement
	 * @generated
	 */
	public Adapter createArgumentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.ArgumentLink <em>Argument Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.ArgumentLink
	 * @generated
	 */
	public Adapter createArgumentLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.AssertedRelationship
	 * @generated
	 */
	public Adapter createAssertedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.AssertedInference
	 * @generated
	 */
	public Adapter createAssertedInferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.AssertedEvidence
	 * @generated
	 */
	public Adapter createAssertedEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.AssertedContext
	 * @generated
	 */
	public Adapter createAssertedContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.AssertedCounterEvidence <em>Asserted Counter Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.AssertedCounterEvidence
	 * @generated
	 */
	public Adapter createAssertedCounterEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.AssertedChallenge <em>Asserted Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.AssertedChallenge
	 * @generated
	 */
	public Adapter createAssertedChallengeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.ReasoningElement <em>Reasoning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.ReasoningElement
	 * @generated
	 */
	public Adapter createReasoningElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.Claim
	 * @generated
	 */
	public Adapter createClaimAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.EvidenceAssertion <em>Evidence Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.EvidenceAssertion
	 * @generated
	 */
	public Adapter createEvidenceAssertionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.InformationElement <em>Information Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.InformationElement
	 * @generated
	 */
	public Adapter createInformationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.ArgumentReasoning
	 * @generated
	 */
	public Adapter createArgumentReasoningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.argument.arm.CitationElement <em>Citation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.argument.arm.CitationElement
	 * @generated
	 */
	public Adapter createCitationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArmAdapterFactory
