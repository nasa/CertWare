/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unstructured Data List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.UnstructuredDataList#getList <em>List</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.UnstructuredDataList#getNormal <em>Normal</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getUnstructuredDataList()
 * @model
 * @generated
 */
public interface UnstructuredDataList extends EObject
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
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getUnstructuredDataList_List()
   * @model containment="true"
   * @generated
   */
  FloatDataList getList();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.UnstructuredDataList#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(FloatDataList value);

  /**
   * Returns the value of the '<em><b>Normal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Normal</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Normal</em>' containment reference.
   * @see #setNormal(NormalDistribution)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getUnstructuredDataList_Normal()
   * @model containment="true"
   * @generated
   */
  NormalDistribution getNormal();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.UnstructuredDataList#getNormal <em>Normal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Normal</em>' containment reference.
   * @see #getNormal()
   * @generated
   */
  void setNormal(NormalDistribution value);

} // UnstructuredDataList
