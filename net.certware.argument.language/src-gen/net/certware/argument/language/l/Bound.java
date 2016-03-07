/**
 */
package net.certware.argument.language.l;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.Bound#getAv <em>Av</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getBound()
 * @model
 * @generated
 */
public interface Bound extends EObject
{
  /**
   * Returns the value of the '<em><b>Av</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Av</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Av</em>' containment reference.
   * @see #setAv(ArithmeticTerm)
   * @see net.certware.argument.language.l.LPackage#getBound_Av()
   * @model containment="true"
   * @generated
   */
  ArithmeticTerm getAv();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.Bound#getAv <em>Av</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Av</em>' containment reference.
   * @see #getAv()
   * @generated
   */
  void setAv(ArithmeticTerm value);

} // Bound
