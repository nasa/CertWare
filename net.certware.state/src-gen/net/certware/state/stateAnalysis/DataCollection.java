/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.DataCollection#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.DataCollection#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.DataCollection#getPolicies <em>Policies</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.DataCollection#getProducts <em>Products</em>}</li>
 * </ul>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataCollection()
 * @model
 * @generated
 */
public interface DataCollection extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataCollection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.DataCollection#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataCollection_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.DataCollection#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Policies</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.QosPolicy}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Policies</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Policies</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataCollection_Policies()
   * @model containment="true"
   * @generated
   */
  EList<QosPolicy> getPolicies();

  /**
   * Returns the value of the '<em><b>Products</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.DataProduct}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataCollection_Products()
   * @model containment="true"
   * @generated
   */
  EList<DataProduct> getProducts();

} // DataCollection
