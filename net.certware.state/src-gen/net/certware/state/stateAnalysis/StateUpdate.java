/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.StateUpdate#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.StateUpdate#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateUpdate()
 * @model
 * @generated
 */
public interface StateUpdate extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateUpdate_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.StateUpdate#getName <em>Name</em>}' attribute.
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getStateUpdate_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.StateUpdate#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // StateUpdate
