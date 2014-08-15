/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Justification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Justification#isHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Justification#isEpsilon <em>Epsilon</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Justification#getNumeral <em>Numeral</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Justification#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Justification#getEntailment <em>Entailment</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustification()
 * @model
 * @generated
 */
public interface Justification extends EObject
{
  /**
   * Returns the value of the '<em><b>Hypothesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hypothesis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hypothesis</em>' attribute.
   * @see #setHypothesis(boolean)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustification_Hypothesis()
   * @model
   * @generated
   */
  boolean isHypothesis();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Justification#isHypothesis <em>Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hypothesis</em>' attribute.
   * @see #isHypothesis()
   * @generated
   */
  void setHypothesis(boolean value);

  /**
   * Returns the value of the '<em><b>Epsilon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Epsilon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Epsilon</em>' attribute.
   * @see #setEpsilon(boolean)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustification_Epsilon()
   * @model
   * @generated
   */
  boolean isEpsilon();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Justification#isEpsilon <em>Epsilon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Epsilon</em>' attribute.
   * @see #isEpsilon()
   * @generated
   */
  void setEpsilon(boolean value);

  /**
   * Returns the value of the '<em><b>Numeral</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Numeral</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Numeral</em>' attribute.
   * @see #setNumeral(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustification_Numeral()
   * @model
   * @generated
   */
  String getNumeral();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Justification#getNumeral <em>Numeral</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Numeral</em>' attribute.
   * @see #getNumeral()
   * @generated
   */
  void setNumeral(String value);

  /**
   * Returns the value of the '<em><b>Assertion</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assertion</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assertion</em>' containment reference.
   * @see #setAssertion(QuotedAssertion)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustification_Assertion()
   * @model containment="true"
   * @generated
   */
  QuotedAssertion getAssertion();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Justification#getAssertion <em>Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assertion</em>' containment reference.
   * @see #getAssertion()
   * @generated
   */
  void setAssertion(QuotedAssertion value);

  /**
   * Returns the value of the '<em><b>Entailment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entailment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entailment</em>' containment reference.
   * @see #setEntailment(Entailment)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustification_Entailment()
   * @model containment="true"
   * @generated
   */
  Entailment getEntailment();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Justification#getEntailment <em>Entailment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entailment</em>' containment reference.
   * @see #getEntailment()
   * @generated
   */
  void setEntailment(Entailment value);

} // Justification
