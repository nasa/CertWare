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
 *   <li>{@link net.certware.state.stateAnalysis.Component#getSv <em>Sv</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Component#getController <em>Controller</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Component#getEstimator <em>Estimator</em>}</li>
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
   * Returns the value of the '<em><b>Sv</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sv</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sv</em>' containment reference.
   * @see #setSv(StateVariable)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_Sv()
   * @model containment="true"
   * @generated
   */
  StateVariable getSv();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.Component#getSv <em>Sv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sv</em>' containment reference.
   * @see #getSv()
   * @generated
   */
  void setSv(StateVariable value);

  /**
   * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.Controller}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controller</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controller</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_Controller()
   * @model containment="true"
   * @generated
   */
  EList<Controller> getController();

  /**
   * Returns the value of the '<em><b>Estimator</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.Estimator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estimator</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimator</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getComponent_Estimator()
   * @model containment="true"
   * @generated
   */
  EList<Estimator> getEstimator();

} // Component
