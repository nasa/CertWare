/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.Range#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.Range#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getRange()
 * @model
 * @generated
 */
public interface Range extends SetExpression
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Limit)
   * @see net.certware.argument.language.l.LPackage#getRange_Lhs()
   * @model containment="true"
   * @generated
   */
  Limit getLhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.Range#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Limit value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Limit)
   * @see net.certware.argument.language.l.LPackage#getRange_Rhs()
   * @model containment="true"
   * @generated
   */
  Limit getRhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.Range#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Limit value);

} // Range
