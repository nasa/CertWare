/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Or Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.OrExp#getLeft <em>Left</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.OrExp#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getOrExp()
 * @model
 * @generated
 */
public interface OrExp extends orExpression
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
   * @see #setLeft(andExpression)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getOrExp_Left()
   * @model containment="true"
   * @generated
   */
  andExpression getLeft();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.OrExp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(andExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(orExpression)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getOrExp_Right()
   * @model containment="true"
   * @generated
   */
  orExpression getRight();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.OrExp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(orExpression value);

} // OrExp
