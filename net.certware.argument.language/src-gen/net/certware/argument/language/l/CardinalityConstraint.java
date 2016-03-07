/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.CardinalityConstraint#getLhs <em>Lhs</em>}</li>
 *   <li>{@link net.certware.argument.language.l.CardinalityConstraint#getAtom <em>Atom</em>}</li>
 *   <li>{@link net.certware.argument.language.l.CardinalityConstraint#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint()
 * @model
 * @generated
 */
public interface CardinalityConstraint extends Head
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
   * @see #setLhs(Bound)
   * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint_Lhs()
   * @model containment="true"
   * @generated
   */
  Bound getLhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.CardinalityConstraint#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Bound value);

  /**
   * Returns the value of the '<em><b>Atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' containment reference.
   * @see #setAtom(BasicPredicateAtom)
   * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint_Atom()
   * @model containment="true"
   * @generated
   */
  BasicPredicateAtom getAtom();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.CardinalityConstraint#getAtom <em>Atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' containment reference.
   * @see #getAtom()
   * @generated
   */
  void setAtom(BasicPredicateAtom value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(Bound)
   * @see net.certware.argument.language.l.LPackage#getCardinalityConstraint_Rhs()
   * @model containment="true"
   * @generated
   */
  Bound getRhs();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.CardinalityConstraint#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(Bound value);

} // CardinalityConstraint
