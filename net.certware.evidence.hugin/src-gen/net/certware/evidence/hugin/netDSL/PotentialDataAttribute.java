/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential Data Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getUnstructured <em>Unstructured</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getStructured <em>Structured</em>}</li>
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
   * Returns the value of the '<em><b>Structured</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structured</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured</em>' containment reference.
   * @see #setStructured(StructuredDataList)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialDataAttribute_Structured()
   * @model containment="true"
   * @generated
   */
  StructuredDataList getStructured();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getStructured <em>Structured</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structured</em>' containment reference.
   * @see #getStructured()
   * @generated
   */
  void setStructured(StructuredDataList value);

} // PotentialDataAttribute
