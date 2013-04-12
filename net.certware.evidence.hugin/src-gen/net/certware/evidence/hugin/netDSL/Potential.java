/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Potential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.Potential#getGraph <em>Graph</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.Potential#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotential()
 * @model
 * @generated
 */
public interface Potential extends DomainElement
{
  /**
   * Returns the value of the '<em><b>Graph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Graph</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graph</em>' containment reference.
   * @see #setGraph(PotentialGraph)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotential_Graph()
   * @model containment="true"
   * @generated
   */
  PotentialGraph getGraph();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.Potential#getGraph <em>Graph</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Graph</em>' containment reference.
   * @see #getGraph()
   * @generated
   */
  void setGraph(PotentialGraph value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' containment reference.
   * @see #setModel(PotentialModel)
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#getPotential_Model()
   * @model containment="true"
   * @generated
   */
  PotentialModel getModel();

  /**
   * Sets the value of the '{@link net.certware.evidence.hugin.netDSL.Potential#getModel <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' containment reference.
   * @see #getModel()
   * @generated
   */
  void setModel(PotentialModel value);

} // Potential
