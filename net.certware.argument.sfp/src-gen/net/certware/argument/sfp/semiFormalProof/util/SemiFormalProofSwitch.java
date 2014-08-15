/**
 */
package net.certware.argument.sfp.semiFormalProof.util;

import net.certware.argument.sfp.semiFormalProof.*;

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
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage
 * @generated
 */
public class SemiFormalProofSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SemiFormalProofPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemiFormalProofSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SemiFormalProofPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SemiFormalProofPackage.PROOF:
      {
        Proof proof = (Proof)theEObject;
        T result = caseProof(proof);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemiFormalProofPackage.JUSTIFICATIONS:
      {
        Justifications justifications = (Justifications)theEObject;
        T result = caseJustifications(justifications);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemiFormalProofPackage.JUSTIFICATION:
      {
        Justification justification = (Justification)theEObject;
        T result = caseJustification(justification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemiFormalProofPackage.QUOTED_ASSERTION:
      {
        QuotedAssertion quotedAssertion = (QuotedAssertion)theEObject;
        T result = caseQuotedAssertion(quotedAssertion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemiFormalProofPackage.ENTAILMENT:
      {
        Entailment entailment = (Entailment)theEObject;
        T result = caseEntailment(entailment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemiFormalProofPackage.CONJUNCTION:
      {
        Conjunction conjunction = (Conjunction)theEObject;
        T result = caseConjunction(conjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemiFormalProofPackage.PROOF_STEPS:
      {
        ProofSteps proofSteps = (ProofSteps)theEObject;
        T result = caseProofSteps(proofSteps);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemiFormalProofPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SemiFormalProofPackage.VALIDATION:
      {
        Validation validation = (Validation)theEObject;
        T result = caseValidation(validation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proof</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proof</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProof(Proof object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Justifications</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Justifications</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJustifications(Justifications object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJustification(Justification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quoted Assertion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quoted Assertion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuotedAssertion(QuotedAssertion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entailment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entailment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntailment(Entailment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConjunction(Conjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proof Steps</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proof Steps</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProofSteps(ProofSteps object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Validation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Validation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValidation(Validation object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SemiFormalProofSwitch
