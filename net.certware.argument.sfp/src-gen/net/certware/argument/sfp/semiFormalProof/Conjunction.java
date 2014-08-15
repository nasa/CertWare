/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Conjunction#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Conjunction#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getConjunction()
 * @model
 * @generated
 */
public interface Conjunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' attribute.
   * @see #setLhs(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getConjunction_Lhs()
   * @model
   * @generated
   */
  String getLhs();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Conjunction#getLhs <em>Lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' attribute.
   * @see #getLhs()
   * @generated
   */
  void setLhs(String value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Conjunction)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getConjunction_Rhs()
   * @model containment="true"
   * @generated
   */
  Conjunction getRhs();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Conjunction#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Conjunction value);

} // Conjunction
