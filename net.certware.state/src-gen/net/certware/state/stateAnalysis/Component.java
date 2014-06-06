/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.Component#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Component#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Component#getControllers <em>Controllers</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Component#getEstimators <em>Estimators</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Component#getAdapters <em>Adapters</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.Component#getName <em>Name</em>}' attribute.
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.Component#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>State Variables</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Variables</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_StateVariables()
   * @model containment="true"
   * @generated
   */
  EList<StateVariable> getStateVariables();

  /**
   * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.Controller}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controllers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controllers</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_Controllers()
   * @model containment="true"
   * @generated
   */
  EList<Controller> getControllers();

  /**
   * Returns the value of the '<em><b>Estimators</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.Estimator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estimators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimators</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_Estimators()
   * @model containment="true"
   * @generated
   */
  EList<Estimator> getEstimators();

  /**
   * Returns the value of the '<em><b>Adapters</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.HardwareAdapter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adapters</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_Adapters()
   * @model containment="true"
   * @generated
   */
  EList<HardwareAdapter> getAdapters();

} // Component
