/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.util;

import net.certware.sacm.SACM.Argumentation.*;

import net.certware.sacm.SACM.ModelElement;
import net.certware.sacm.SACM.SACMElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage
 * @generated
 */
public class ArgumentationSwitch<T> extends Switch<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArgumentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationSwitch() {
		if (modelPackage == null) {
			modelPackage = ArgumentationPackage.eINSTANCE;
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
			case ArgumentationPackage.ARGUMENTATION: {
				Argumentation argumentation = (Argumentation)theEObject;
				T result = caseArgumentation(argumentation);
				if (result == null) result = caseArgumentationElement(argumentation);
				if (result == null) result = caseModelElement(argumentation);
				if (result == null) result = caseSACMElement(argumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_ELEMENT: {
				ArgumentElement argumentElement = (ArgumentElement)theEObject;
				T result = caseArgumentElement(argumentElement);
				if (result == null) result = caseArgumentationElement(argumentElement);
				if (result == null) result = caseModelElement(argumentElement);
				if (result == null) result = caseSACMElement(argumentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.CITATION_ELEMENT: {
				CitationElement citationElement = (CitationElement)theEObject;
				T result = caseCitationElement(citationElement);
				if (result == null) result = caseArgumentElement(citationElement);
				if (result == null) result = caseArgumentationElement(citationElement);
				if (result == null) result = caseModelElement(citationElement);
				if (result == null) result = caseSACMElement(citationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.INFORMATION_ELEMENT: {
				InformationElement informationElement = (InformationElement)theEObject;
				T result = caseInformationElement(informationElement);
				if (result == null) result = caseArgumentElement(informationElement);
				if (result == null) result = caseArgumentationElement(informationElement);
				if (result == null) result = caseModelElement(informationElement);
				if (result == null) result = caseSACMElement(informationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.REASONING_ELEMENT: {
				ReasoningElement reasoningElement = (ReasoningElement)theEObject;
				T result = caseReasoningElement(reasoningElement);
				if (result == null) result = caseArgumentElement(reasoningElement);
				if (result == null) result = caseArgumentationElement(reasoningElement);
				if (result == null) result = caseModelElement(reasoningElement);
				if (result == null) result = caseSACMElement(reasoningElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = caseReasoningElement(assertion);
				if (result == null) result = caseArgumentElement(assertion);
				if (result == null) result = caseArgumentationElement(assertion);
				if (result == null) result = caseModelElement(assertion);
				if (result == null) result = caseSACMElement(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENT_REASONING: {
				ArgumentReasoning argumentReasoning = (ArgumentReasoning)theEObject;
				T result = caseArgumentReasoning(argumentReasoning);
				if (result == null) result = caseReasoningElement(argumentReasoning);
				if (result == null) result = caseArgumentElement(argumentReasoning);
				if (result == null) result = caseArgumentationElement(argumentReasoning);
				if (result == null) result = caseModelElement(argumentReasoning);
				if (result == null) result = caseSACMElement(argumentReasoning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_RELATIONSHIP: {
				AssertedRelationship assertedRelationship = (AssertedRelationship)theEObject;
				T result = caseAssertedRelationship(assertedRelationship);
				if (result == null) result = caseAssertion(assertedRelationship);
				if (result == null) result = caseReasoningElement(assertedRelationship);
				if (result == null) result = caseArgumentElement(assertedRelationship);
				if (result == null) result = caseArgumentationElement(assertedRelationship);
				if (result == null) result = caseModelElement(assertedRelationship);
				if (result == null) result = caseSACMElement(assertedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseAssertion(claim);
				if (result == null) result = caseReasoningElement(claim);
				if (result == null) result = caseArgumentElement(claim);
				if (result == null) result = caseArgumentationElement(claim);
				if (result == null) result = caseModelElement(claim);
				if (result == null) result = caseSACMElement(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_INFERENCE: {
				AssertedInference assertedInference = (AssertedInference)theEObject;
				T result = caseAssertedInference(assertedInference);
				if (result == null) result = caseAssertedRelationship(assertedInference);
				if (result == null) result = caseAssertion(assertedInference);
				if (result == null) result = caseReasoningElement(assertedInference);
				if (result == null) result = caseArgumentElement(assertedInference);
				if (result == null) result = caseArgumentationElement(assertedInference);
				if (result == null) result = caseModelElement(assertedInference);
				if (result == null) result = caseSACMElement(assertedInference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_EVIDENCE: {
				AssertedEvidence assertedEvidence = (AssertedEvidence)theEObject;
				T result = caseAssertedEvidence(assertedEvidence);
				if (result == null) result = caseAssertedRelationship(assertedEvidence);
				if (result == null) result = caseAssertion(assertedEvidence);
				if (result == null) result = caseReasoningElement(assertedEvidence);
				if (result == null) result = caseArgumentElement(assertedEvidence);
				if (result == null) result = caseArgumentationElement(assertedEvidence);
				if (result == null) result = caseModelElement(assertedEvidence);
				if (result == null) result = caseSACMElement(assertedEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_CONTEXT: {
				AssertedContext assertedContext = (AssertedContext)theEObject;
				T result = caseAssertedContext(assertedContext);
				if (result == null) result = caseAssertedRelationship(assertedContext);
				if (result == null) result = caseAssertion(assertedContext);
				if (result == null) result = caseReasoningElement(assertedContext);
				if (result == null) result = caseArgumentElement(assertedContext);
				if (result == null) result = caseArgumentationElement(assertedContext);
				if (result == null) result = caseModelElement(assertedContext);
				if (result == null) result = caseSACMElement(assertedContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_CHALLENGE: {
				AssertedChallenge assertedChallenge = (AssertedChallenge)theEObject;
				T result = caseAssertedChallenge(assertedChallenge);
				if (result == null) result = caseAssertedRelationship(assertedChallenge);
				if (result == null) result = caseAssertion(assertedChallenge);
				if (result == null) result = caseReasoningElement(assertedChallenge);
				if (result == null) result = caseArgumentElement(assertedChallenge);
				if (result == null) result = caseArgumentationElement(assertedChallenge);
				if (result == null) result = caseModelElement(assertedChallenge);
				if (result == null) result = caseSACMElement(assertedChallenge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ASSERTED_COUNTER_EVIDENCE: {
				AssertedCounterEvidence assertedCounterEvidence = (AssertedCounterEvidence)theEObject;
				T result = caseAssertedCounterEvidence(assertedCounterEvidence);
				if (result == null) result = caseAssertedRelationship(assertedCounterEvidence);
				if (result == null) result = caseAssertion(assertedCounterEvidence);
				if (result == null) result = caseReasoningElement(assertedCounterEvidence);
				if (result == null) result = caseArgumentElement(assertedCounterEvidence);
				if (result == null) result = caseArgumentationElement(assertedCounterEvidence);
				if (result == null) result = caseModelElement(assertedCounterEvidence);
				if (result == null) result = caseSACMElement(assertedCounterEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentationPackage.ARGUMENTATION_ELEMENT: {
				ArgumentationElement argumentationElement = (ArgumentationElement)theEObject;
				T result = caseArgumentationElement(argumentationElement);
				if (result == null) result = caseModelElement(argumentationElement);
				if (result == null) result = caseSACMElement(argumentationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentation(Argumentation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertion(Assertion object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentationElement(ArgumentationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
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

} //ArgumentationSwitch
