/**
 */
package net.certware.argument.language.l;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.Limit#getCv <em>Cv</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getLimit()
 * @model
 * @generated
 */
public interface Limit extends EObject
{
  /**
   * Returns the value of the '<em><b>Cv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cv</em>' containment reference.
   * @see #setCv(GroundArithmeticTerm)
   * @see net.certware.argument.language.l.LPackage#getLimit_Cv()
   * @model containment="true"
   * @generated
   */
  GroundArithmeticTerm getCv();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.Limit#getCv <em>Cv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cv</em>' containment reference.
   * @see #getCv()
   * @generated
   */
  void setCv(GroundArithmeticTerm value);

} // Limit
