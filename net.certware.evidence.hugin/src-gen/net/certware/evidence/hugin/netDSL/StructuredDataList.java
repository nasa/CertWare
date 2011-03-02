/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Data List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.StructuredDataList#getList <em>List</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.StructuredDataList#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getStructuredDataList()
 * @model
 * @generated
 */
public interface StructuredDataList extends EObject
{
  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(FloatDataList)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getStructuredDataList_List()
   * @model containment="true"
   * @generated
   */
  FloatDataList getList();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.StructuredDataList#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(FloatDataList value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.evidence.hugin.netDSL.StructuredDataList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getStructuredDataList_Items()
   * @model containment="true"
   * @generated
   */
  EList<StructuredDataList> getItems();

} // StructuredDataList
