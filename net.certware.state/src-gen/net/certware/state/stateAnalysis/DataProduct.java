/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.DataProduct#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.DataProduct#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.DataProduct#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataProduct()
 * @model
 * @generated
 */
public interface DataProduct extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataProduct_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.DataProduct#getName <em>Name</em>}' attribute.
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataProduct_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.DataProduct#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' attribute.
   * @see #setContent(String)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDataProduct_Content()
   * @model
   * @generated
   */
  String getContent();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.DataProduct#getContent <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Content</em>' attribute.
   * @see #getContent()
   * @generated
   */
  void setContent(String value);

} // DataProduct
