/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Justifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Justifications#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Justifications#getHypothesis <em>Hypothesis</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Justifications#getEpsilon <em>Epsilon</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustifications()
 * @model
 * @generated
 */
public interface Justifications extends EObject
{
  /**
   * Returns the value of the '<em><b>Justifications</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.argument.sfp.semiFormalProof.Justification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Justifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Justifications</em>' containment reference list.
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustifications_Justifications()
   * @model containment="true"
   * @generated
   */
  EList<Justification> getJustifications();

  /**
   * Returns the value of the '<em><b>Hypothesis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hypothesis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hypothesis</em>' attribute.
   * @see #setHypothesis(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustifications_Hypothesis()
   * @model
   * @generated
   */
  String getHypothesis();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Justifications#getHypothesis <em>Hypothesis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hypothesis</em>' attribute.
   * @see #getHypothesis()
   * @generated
   */
  void setHypothesis(String value);

  /**
   * Returns the value of the '<em><b>Epsilon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Epsilon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Epsilon</em>' attribute.
   * @see #setEpsilon(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getJustifications_Epsilon()
   * @model
   * @generated
   */
  String getEpsilon();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Justifications#getEpsilon <em>Epsilon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Epsilon</em>' attribute.
   * @see #getEpsilon()
   * @generated
   */
  void setEpsilon(String value);

} // Justifications
