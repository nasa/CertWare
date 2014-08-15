/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage
 * @generated
 */
public interface SemiFormalProofFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SemiFormalProofFactory eINSTANCE = net.certware.argument.sfp.semiFormalProof.impl.SemiFormalProofFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Proof</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proof</em>'.
   * @generated
   */
  Proof createProof();

  /**
   * Returns a new object of class '<em>Justifications</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Justifications</em>'.
   * @generated
   */
  Justifications createJustifications();

  /**
   * Returns a new object of class '<em>Justification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Justification</em>'.
   * @generated
   */
  Justification createJustification();

  /**
   * Returns a new object of class '<em>Quoted Assertion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Quoted Assertion</em>'.
   * @generated
   */
  QuotedAssertion createQuotedAssertion();

  /**
   * Returns a new object of class '<em>Entailment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entailment</em>'.
   * @generated
   */
  Entailment createEntailment();

  /**
   * Returns a new object of class '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conjunction</em>'.
   * @generated
   */
  Conjunction createConjunction();

  /**
   * Returns a new object of class '<em>Proof Steps</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Proof Steps</em>'.
   * @generated
   */
  ProofSteps createProofSteps();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Validation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Validation</em>'.
   * @generated
   */
  Validation createValidation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SemiFormalProofPackage getSemiFormalProofPackage();

} //SemiFormalProofFactory
