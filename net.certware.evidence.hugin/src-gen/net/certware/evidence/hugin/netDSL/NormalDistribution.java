/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.NormalDistribution#getMean <em>Mean</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.NormalDistribution#getVariance <em>Variance</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getNormalDistribution()
 * @model
 * @generated
 */
public interface NormalDistribution extends UnstructuredDataList
{
  /**
   * Returns the value of the '<em><b>Mean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mean</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mean</em>' attribute.
   * @see #setMean(String)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getNormalDistribution_Mean()
   * @model
   * @generated
   */
  String getMean();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.NormalDistribution#getMean <em>Mean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mean</em>' attribute.
   * @see #getMean()
   * @generated
   */
  void setMean(String value);

  /**
   * Returns the value of the '<em><b>Variance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variance</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variance</em>' attribute.
   * @see #setVariance(String)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getNormalDistribution_Variance()
   * @model
   * @generated
   */
  String getVariance();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.NormalDistribution#getVariance <em>Variance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variance</em>' attribute.
   * @see #getVariance()
   * @generated
   */
  void setVariance(String value);

} // NormalDistribution
