/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proof</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Proof#getTitle <em>Title</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Proof#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Proof#getProofSteps <em>Proof Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getProof()
 * @model
 * @generated
 */
public interface Proof extends EObject
{
  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getProof_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Proof#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Justifications</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Justifications</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Justifications</em>' containment reference.
   * @see #setJustifications(Justifications)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getProof_Justifications()
   * @model containment="true"
   * @generated
   */
  Justifications getJustifications();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Proof#getJustifications <em>Justifications</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Justifications</em>' containment reference.
   * @see #getJustifications()
   * @generated
   */
  void setJustifications(Justifications value);

  /**
   * Returns the value of the '<em><b>Proof Steps</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proof Steps</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proof Steps</em>' containment reference.
   * @see #setProofSteps(ProofSteps)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getProof_ProofSteps()
   * @model containment="true"
   * @generated
   */
  ProofSteps getProofSteps();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Proof#getProofSteps <em>Proof Steps</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proof Steps</em>' containment reference.
   * @see #getProofSteps()
   * @generated
   */
  void setProofSteps(ProofSteps value);

} // Proof
