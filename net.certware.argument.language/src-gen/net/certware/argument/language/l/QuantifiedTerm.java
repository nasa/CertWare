/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.QuantifiedTerm#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getQuantifiedTerm()
 * @model
 * @generated
 */
public interface QuantifiedTerm extends Term
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(TypeId)
   * @see net.certware.argument.language.l.LPackage#getQuantifiedTerm_Name()
   * @model containment="true"
   * @generated
   */
  TypeId getName();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.QuantifiedTerm#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(TypeId value);

} // QuantifiedTerm
