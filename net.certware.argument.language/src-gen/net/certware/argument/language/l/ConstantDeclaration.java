/**
 */
package net.certware.argument.language.l;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.ConstantDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.argument.language.l.ConstantDeclaration#getCv <em>Cv</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getConstantDeclaration()
 * @model
 * @generated
 */
public interface ConstantDeclaration extends Statement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.certware.argument.language.l.LPackage#getConstantDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ConstantDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see net.certware.argument.language.l.LPackage#getConstantDeclaration_Cv()
   * @model containment="true"
   * @generated
   */
  GroundArithmeticTerm getCv();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ConstantDeclaration#getCv <em>Cv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cv</em>' containment reference.
   * @see #getCv()
   * @generated
   */
  void setCv(GroundArithmeticTerm value);

} // ConstantDeclaration
