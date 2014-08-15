/**
 */
package net.certware.argument.sfp.semiFormalProof;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Validation#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Validation#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.Validation#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getValidation()
 * @model
 * @generated
 */
public interface Validation extends EObject
{
  /**
   * Returns the value of the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' attribute.
   * @see #setAuthor(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getValidation_Author()
   * @model
   * @generated
   */
  String getAuthor();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Validation#getAuthor <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' attribute.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(String value);

  /**
   * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Stamp</em>' attribute.
   * @see #setTimeStamp(String)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getValidation_TimeStamp()
   * @model
   * @generated
   */
  String getTimeStamp();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Validation#getTimeStamp <em>Time Stamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Stamp</em>' attribute.
   * @see #getTimeStamp()
   * @generated
   */
  void setTimeStamp(String value);

  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * The literals are from the enumeration {@link net.certware.argument.sfp.semiFormalProof.ValidationKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see net.certware.argument.sfp.semiFormalProof.ValidationKind
   * @see #setState(ValidationKind)
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#getValidation_State()
   * @model
   * @generated
   */
  ValidationKind getState();

  /**
   * Sets the value of the '{@link net.certware.argument.sfp.semiFormalProof.Validation#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see net.certware.argument.sfp.semiFormalProof.ValidationKind
   * @see #getState()
   * @generated
   */
  void setState(ValidationKind value);

} // Validation
