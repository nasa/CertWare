/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getX <em>X</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getY <em>Y</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getIntegerLiteral()
 * @model
 * @generated
 */
public interface IntegerLiteral extends PositionAttribute, TermLiteral
{
  /**
   * Returns the value of the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' containment reference.
   * @see #setX(net.certware.evidence.hugin.netDSL.Integer)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getIntegerLiteral_X()
   * @model containment="true"
   * @generated
   */
  net.certware.evidence.hugin.netDSL.Integer getX();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getX <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' containment reference.
   * @see #getX()
   * @generated
   */
  void setX(net.certware.evidence.hugin.netDSL.Integer value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' containment reference.
   * @see #setY(net.certware.evidence.hugin.netDSL.Integer)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getIntegerLiteral_Y()
   * @model containment="true"
   * @generated
   */
  net.certware.evidence.hugin.netDSL.Integer getY();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getY <em>Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' containment reference.
   * @see #getY()
   * @generated
   */
  void setY(net.certware.evidence.hugin.netDSL.Integer value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getIntegerLiteral_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // IntegerLiteral
