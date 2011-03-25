/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.List1#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getList1()
 * @model
 * @generated
 */
public interface List1 extends MatrixRow
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.unaryExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getList1_Items()
   * @model containment="true"
   * @generated
   */
  EList<unaryExpression> getItems();

} // List1
