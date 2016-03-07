/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.Set#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.Set#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends SetExpression
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
   * @see net.certware.argument.language.l.LPackage#getSet_Lhs()
   * @model
   * @generated
   */
  String getLhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.Set#getLhs <em>Lhs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' attribute.
   * @see #getLhs()
   * @generated
   */
  void setLhs(String value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference.
   * @see #setTerms(GroundTerms)
   * @see net.certware.argument.language.l.LPackage#getSet_Terms()
   * @model containment="true"
   * @generated
   */
  GroundTerms getTerms();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.Set#getTerms <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms</em>' containment reference.
   * @see #getTerms()
   * @generated
   */
  void setTerms(GroundTerms value);

} // Set
