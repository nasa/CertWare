/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estimator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.Estimator#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Estimator#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Estimator#getDistilledMeasurements <em>Distilled Measurements</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Estimator#getStateConstraints <em>State Constraints</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Estimator#getStateUpdates <em>State Updates</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Estimator#getHardwareMeasurement <em>Hardware Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getEstimator()
 * @model
 * @generated
 */
public interface Estimator extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getEstimator_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.Estimator#getName <em>Name</em>}' attribute.
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getEstimator_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.Estimator#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Distilled Measurements</b></em>' reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.Estimator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distilled Measurements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distilled Measurements</em>' reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getEstimator_DistilledMeasurements()
   * @model
   * @generated
   */
  EList<Estimator> getDistilledMeasurements();

  /**
   * Returns the value of the '<em><b>State Constraints</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Constraints</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getEstimator_StateConstraints()
   * @model containment="true"
   * @generated
   */
  EList<StateConstraint> getStateConstraints();

  /**
   * Returns the value of the '<em><b>State Updates</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.StateUpdate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Updates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Updates</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getEstimator_StateUpdates()
   * @model containment="true"
   * @generated
   */
  EList<StateUpdate> getStateUpdates();

  /**
   * Returns the value of the '<em><b>Hardware Measurement</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.HardwareMeasurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardware Measurement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardware Measurement</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getEstimator_HardwareMeasurement()
   * @model containment="true"
   * @generated
   */
  EList<HardwareMeasurement> getHardwareMeasurement();

} // Estimator
