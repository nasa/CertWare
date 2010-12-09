/**
 * <copyright>
 * </copyright>
 *
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
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Entailment#getConjunction <em>Conjunction</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Entailment#getId <em>Id</em>}</li>
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
   * Returns the value of the '<em><b>Conjunction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conjunction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conjunction</em>' containment reference.
   * @see #setConjunction(Conjunction)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getEntailment_Conjunction()
   * @model containment="true"
   * @generated
   */
  Conjunction getConjunction();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Entailment#getConjunction <em>Conjunction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conjunction</em>' containment reference.
   * @see #getConjunction()
   * @generated
   */
  void setConjunction(Conjunction value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getEntailment_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Entailment#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Entailment
