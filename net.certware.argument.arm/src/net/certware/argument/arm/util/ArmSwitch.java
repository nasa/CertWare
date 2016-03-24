/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */
package net.certware.argument.arm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import net.certware.argument.arm.Annotation;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.AssertedChallenge;
import net.certware.argument.arm.AssertedContext;
import net.certware.argument.arm.AssertedCounterEvidence;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedInference;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.CitationElement;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.EvidenceAssertion;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.arm.TaggedValue;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.argument.arm.ArmPackage
 * @generated
 */
public class ArmSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) "; //$NON-NLS-1$

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmSwitch() {
		if (modelPackage == null) {
			modelPackage = ArmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ArmPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.TAGGED_VALUE: {
				TaggedValue taggedValue = (TaggedValue)theEObject;
				T result = caseTaggedValue(taggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseModelElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ARGUMENT_ELEMENT: {
				ArgumentElement argumentElement = (ArgumentElement)theEObject;
				T result = caseArgumentElement(argumentElement);
				if (result == null) result = caseModelElement(argumentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ARGUMENT_LINK: {
				ArgumentLink argumentLink = (ArgumentLink)theEObject;
				T result = caseArgumentLink(argumentLink);
				if (result == null) result = caseModelElement(argumentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_RELATIONSHIP: {
				AssertedRelationship assertedRelationship = (AssertedRelationship)theEObject;
				T result = caseAssertedRelationship(assertedRelationship);
				if (result == null) result = caseArgumentLink(assertedRelationship);
				if (result == null) result = caseModelElement(assertedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseArgumentLink(annotation);
				if (result == null) result = caseModelElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_INFERENCE: {
				AssertedInference assertedInference = (AssertedInference)theEObject;
				T result = caseAssertedInference(assertedInference);
				if (result == null) result = caseAssertedRelationship(assertedInference);
				if (result == null) result = caseArgumentLink(assertedInference);
				if (result == null) result = caseModelElement(assertedInference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_EVIDENCE: {
				AssertedEvidence assertedEvidence = (AssertedEvidence)theEObject;
				T result = caseAssertedEvidence(assertedEvidence);
				if (result == null) result = caseAssertedRelationship(assertedEvidence);
				if (result == null) result = caseArgumentLink(assertedEvidence);
				if (result == null) result = caseModelElement(assertedEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_CONTEXT: {
				AssertedContext assertedContext = (AssertedContext)theEObject;
				T result = caseAssertedContext(assertedContext);
				if (result == null) result = caseAssertedRelationship(assertedContext);
				if (result == null) result = caseArgumentLink(assertedContext);
				if (result == null) result = caseModelElement(assertedContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_COUNTER_EVIDENCE: {
				AssertedCounterEvidence assertedCounterEvidence = (AssertedCounterEvidence)theEObject;
				T result = caseAssertedCounterEvidence(assertedCounterEvidence);
				if (result == null) result = caseAssertedRelationship(assertedCounterEvidence);
				if (result == null) result = caseArgumentLink(assertedCounterEvidence);
				if (result == null) result = caseModelElement(assertedCounterEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_CHALLENGE: {
				AssertedChallenge assertedChallenge = (AssertedChallenge)theEObject;
				T result = caseAssertedChallenge(assertedChallenge);
				if (result == null) result = caseAssertedRelationship(assertedChallenge);
				if (result == null) result = caseArgumentLink(assertedChallenge);
				if (result == null) result = caseModelElement(assertedChallenge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.REASONING_ELEMENT: {
				ReasoningElement reasoningElement = (ReasoningElement)theEObject;
				T result = caseReasoningElement(reasoningElement);
				if (result == null) result = caseArgumentElement(reasoningElement);
				if (result == null) result = caseModelElement(reasoningElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseReasoningElement(claim);
				if (result == null) result = caseArgumentElement(claim);
				if (result == null) result = caseModelElement(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.EVIDENCE_ASSERTION: {
				EvidenceAssertion evidenceAssertion = (EvidenceAssertion)theEObject;
				T result = caseEvidenceAssertion(evidenceAssertion);
				if (result == null) result = caseClaim(evidenceAssertion);
				if (result == null) result = caseReasoningElement(evidenceAssertion);
				if (result == null) result = caseArgumentElement(evidenceAssertion);
				if (result == null) result = caseModelElement(evidenceAssertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.INFORMATION_ELEMENT: {
				InformationElement informationElement = (InformationElement)theEObject;
				T result = caseInformationElement(informationElement);
				if (result == null) result = caseArgumentElement(informationElement);
				if (result == null) result = caseModelElement(informationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ARGUMENT_REASONING: {
				ArgumentReasoning argumentReasoning = (ArgumentReasoning)theEObject;
				T result = caseArgumentReasoning(argumentReasoning);
				if (result == null) result = caseReasoningElement(argumentReasoning);
				if (result == null) result = caseArgumentElement(argumentReasoning);
				if (result == null) result = caseModelElement(argumentReasoning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.CITATION_ELEMENT: {
				CitationElement citationElement = (CitationElement)theEObject;
				T result = caseCitationElement(citationElement);
				if (result == null) result = caseArgumentElement(citationElement);
				if (result == null) result = caseModelElement(citationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedValue(TaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentElement(ArgumentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentLink(ArgumentLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedRelationship(AssertedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedInference(AssertedInference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedEvidence(AssertedEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedContext(AssertedContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedCounterEvidence(AssertedCounterEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedChallenge(AssertedChallenge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasoningElement(ReasoningElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceAssertion(EvidenceAssertion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationElement(InformationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentReasoning(ArgumentReasoning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitationElement(CitationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArmSwitch
