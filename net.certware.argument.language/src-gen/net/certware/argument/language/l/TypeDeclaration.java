/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.TypeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.argument.language.l.TypeDeclaration#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getTypeDeclaration()
 * @model
 * @generated
 */
public interface TypeDeclaration extends Statement
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
   * @see net.certware.argument.language.l.LPackage#getTypeDeclaration_Name()
   * @model containment="true"
   * @generated
   */
  TypeId getName();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.TypeDeclaration#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(TypeId value);

  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(SetExpression)
   * @see net.certware.argument.language.l.LPackage#getTypeDeclaration_Exp()
   * @model containment="true"
   * @generated
   */
  SetExpression getExp();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.TypeDeclaration#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(SetExpression value);

} // TypeDeclaration
