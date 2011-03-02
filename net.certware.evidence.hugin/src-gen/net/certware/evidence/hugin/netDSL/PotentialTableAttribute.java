/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential Table Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getNodes <em>Nodes</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getSamples <em>Samples</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialTableAttribute()
 * @model
 * @generated
 */
public interface PotentialTableAttribute extends PotentialAttribute
{
  /**
   * Returns the value of the '<em><b>Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' containment reference.
   * @see #setNodes(ModelNodesAttribute)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialTableAttribute_Nodes()
   * @model containment="true"
   * @generated
   */
  ModelNodesAttribute getNodes();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getNodes <em>Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nodes</em>' containment reference.
   * @see #getNodes()
   * @generated
   */
  void setNodes(ModelNodesAttribute value);

  /**
   * Returns the value of the '<em><b>Samples</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Samples</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Samples</em>' containment reference.
   * @see #setSamples(SamplesAttribute)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialTableAttribute_Samples()
   * @model containment="true"
   * @generated
   */
  SamplesAttribute getSamples();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getSamples <em>Samples</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Samples</em>' containment reference.
   * @see #getSamples()
   * @generated
   */
  void setSamples(SamplesAttribute value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(ModelDataAttribute)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotentialTableAttribute_Data()
   * @model containment="true"
   * @generated
   */
  ModelDataAttribute getData();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(ModelDataAttribute value);

} // PotentialTableAttribute
