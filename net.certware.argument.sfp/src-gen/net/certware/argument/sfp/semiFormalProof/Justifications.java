/**
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

} // Justifications
