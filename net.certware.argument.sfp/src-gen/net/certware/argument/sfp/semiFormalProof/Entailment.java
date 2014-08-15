/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entailment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Entailment#getHead <em>Head</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Entailment#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getEntailment()
 * @model
 * @generated
 */
public interface Entailment extends EObject
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(Conjunction)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getEntailment_Head()
   * @model containment="true"
   * @generated
   */
  Conjunction getHead();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Entailment#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Conjunction value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' attribute.
   * @see #setTail(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getEntailment_Tail()
   * @model
   * @generated
   */
  String getTail();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Entailment#getTail <em>Tail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' attribute.
   * @see #getTail()
   * @generated
   */
  void setTail(String value);

} // Entailment
