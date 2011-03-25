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
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getData <em>Data</em>}</li>
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
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(MatrixRow)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialDataAttribute_Data()
   * @model containment="true"
   * @generated
   */
  MatrixRow getData();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(MatrixRow value);

} // PotentialDataAttribute
