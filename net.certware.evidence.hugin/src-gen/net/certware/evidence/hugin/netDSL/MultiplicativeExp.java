/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.MultiplicativeExp#getLeft <em>Left</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.MultiplicativeExp#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMultiplicativeExp()
 * @model
 * @generated
 */
public interface MultiplicativeExp extends multiplicativeExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(unaryExpression)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMultiplicativeExp_Left()
   * @model containment="true"
   * @generated
   */
  unaryExpression getLeft();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.MultiplicativeExp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(unaryExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(multiplicativeExpression)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getMultiplicativeExp_Right()
   * @model containment="true"
   * @generated
   */
  multiplicativeExpression getRight();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.MultiplicativeExp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(multiplicativeExpression value);

} // MultiplicativeExp
