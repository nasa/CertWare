/**
 */
package net.certware.argument.language.l;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.ArithmeticLiteral#getV <em>V</em>}</li>
 *   <li>{@link net.certware.argument.language.l.ArithmeticLiteral#getTv <em>Tv</em>}</li>
 *   <li>{@link net.certware.argument.language.l.ArithmeticLiteral#getConst <em>Const</em>}</li>
 *   <li>{@link net.certware.argument.language.l.ArithmeticLiteral#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see net.certware.argument.language.l.LPackage#getArithmeticLiteral()
 * @model
 * @generated
 */
public interface ArithmeticLiteral extends EObject
{
  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>V</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(Variable)
   * @see net.certware.argument.language.l.LPackage#getArithmeticLiteral_V()
   * @model containment="true"
   * @generated
   */
  Variable getV();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ArithmeticLiteral#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(Variable value);

  /**
   * Returns the value of the '<em><b>Tv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tv</em>' containment reference.
   * @see #setTv(TypedVariable)
   * @see net.certware.argument.language.l.LPackage#getArithmeticLiteral_Tv()
   * @model containment="true"
   * @generated
   */
  TypedVariable getTv();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ArithmeticLiteral#getTv <em>Tv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tv</em>' containment reference.
   * @see #getTv()
   * @generated
   */
  void setTv(TypedVariable value);

  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(String)
   * @see net.certware.argument.language.l.LPackage#getArithmeticLiteral_Const()
   * @model
   * @generated
   */
  String getConst();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ArithmeticLiteral#getConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #getConst()
   * @generated
   */
  void setConst(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see net.certware.argument.language.l.LPackage#getArithmeticLiteral_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link net.certware.argument.language.l.ArithmeticLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ArithmeticLiteral
