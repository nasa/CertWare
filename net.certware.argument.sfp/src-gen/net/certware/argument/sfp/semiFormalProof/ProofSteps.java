/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proof Steps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.ProofSteps#getStatements <em>Statements</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.ProofSteps#isEpsilon <em>Epsilon</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getProofSteps()
 * @model
 * @generated
 */
public interface ProofSteps extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.argument.sfp.semiFormalProof.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getProofSteps_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

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
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getProofSteps_Epsilon()
   * @model
   * @generated
   */
  boolean isEpsilon();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.ProofSteps#isEpsilon <em>Epsilon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Epsilon</em>' attribute.
   * @see #isEpsilon()
   * @generated
   */
  void setEpsilon(boolean value);

} // ProofSteps
