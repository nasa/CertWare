/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getUnstructured <em>Unstructured</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialDataAttribute()
 * @model
 * @generated
 */
public interface PotentialDataAttribute extends PotentialAttribute
{
  /**
   * Returns the value of the '<em><b>Unstructured</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unstructured</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unstructured</em>' containment reference.
   * @see #setUnstructured(UnstructuredDataList)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialDataAttribute_Unstructured()
   * @model containment="true"
   * @generated
   */
  UnstructuredDataList getUnstructured();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getUnstructured <em>Unstructured</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unstructured</em>' containment reference.
   * @see #getUnstructured()
   * @generated
   */
  void setUnstructured(UnstructuredDataList value);

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
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialDataAttribute_Items()
   * @model containment="true"
   * @generated
   */
  EList<StructuredDataList> getItems();

} // PotentialDataAttribute
