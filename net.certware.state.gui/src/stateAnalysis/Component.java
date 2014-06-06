/**
 */
package stateAnalysis;

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
 *   <li>{@link stateAnalysis.Component#getName <em>Name</em>}</li>
 *   <li>{@link stateAnalysis.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link stateAnalysis.Component#getStateVariables <em>State Variables</em>}</li>
 *   <li>{@link stateAnalysis.Component#getControllers <em>Controllers</em>}</li>
 *   <li>{@link stateAnalysis.Component#getEstimators <em>Estimators</em>}</li>
 *   <li>{@link stateAnalysis.Component#getAdapters <em>Adapters</em>}</li>
 * </ul>
 * </p>
 *
 * @see stateAnalysis.StateAnalysisPackage#getComponent()
 * @model annotation="gmf.node label='name' label.pattern='Component: {0}'"
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
   * @see stateAnalysis.StateAnalysisPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link stateAnalysis.Component#getName <em>Name</em>}' attribute.
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
   * @see stateAnalysis.StateAnalysisPackage#getComponent_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link stateAnalysis.Component#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>State Variables</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.StateVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Variables</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getComponent_StateVariables()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='free'"
   * @generated
   */
  EList<StateVariable> getStateVariables();

  /**
   * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.Controller}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controllers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controllers</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getComponent_Controllers()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='free'"
   * @generated
   */
  EList<Controller> getControllers();

  /**
   * Returns the value of the '<em><b>Estimators</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.Estimator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estimators</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimators</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getComponent_Estimators()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='free'"
   * @generated
   */
  EList<Estimator> getEstimators();

  /**
   * Returns the value of the '<em><b>Adapters</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.HardwareAdapter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adapters</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getComponent_Adapters()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='free'"
   * @generated
   */
  EList<HardwareAdapter> getAdapters();

} // Component
