/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.SetConstruct#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.SetConstruct#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getSetConstruct()
 * @model
 * @generated
 */
public interface SetConstruct extends SetExpression
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
   * @see #setLhs(BasicTerm)
   * @see net.certware.argument.language.l.LPackage#getSetConstruct_Lhs()
   * @model containment="true"
   * @generated
   */
  BasicTerm getLhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.SetConstruct#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(BasicTerm value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(TVars)
   * @see net.certware.argument.language.l.LPackage#getSetConstruct_Rhs()
   * @model containment="true"
   * @generated
   */
  TVars getRhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.SetConstruct#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(TVars value);

} // SetConstruct
