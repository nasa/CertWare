/**
 */
package stateAnalysis;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Estimator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link stateAnalysis.Estimator#getDistilledMeasurements <em>Distilled Measurements</em>}</li>
 *   <li>{@link stateAnalysis.Estimator#getStateConstraints <em>State Constraints</em>}</li>
 *   <li>{@link stateAnalysis.Estimator#getStateUpdates <em>State Updates</em>}</li>
 *   <li>{@link stateAnalysis.Estimator#getHardwareMeasurement <em>Hardware Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see stateAnalysis.StateAnalysisPackage#getEstimator()
 * @model annotation="gmf.node label='name' label.pattern='Estimator: {0}'"
 * @generated
 */
public interface Estimator extends Component
{
  /**
   * Returns the value of the '<em><b>Distilled Measurements</b></em>' reference list.
   * The list contents are of type {@link stateAnalysis.Estimator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Distilled Measurements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Distilled Measurements</em>' reference list.
   * @see stateAnalysis.StateAnalysisPackage#getEstimator_DistilledMeasurements()
   * @model annotation="gmf.link label='distilled'"
   * @generated
   */
  EList<Estimator> getDistilledMeasurements();

  /**
   * Returns the value of the '<em><b>State Constraints</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.StateConstraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Constraints</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getEstimator_StateConstraints()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<StateConstraint> getStateConstraints();

  /**
   * Returns the value of the '<em><b>State Updates</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.StateUpdate}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State Updates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Updates</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getEstimator_StateUpdates()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<StateUpdate> getStateUpdates();

  /**
   * Returns the value of the '<em><b>Hardware Measurement</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.HardwareMeasurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardware Measurement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardware Measurement</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getEstimator_HardwareMeasurement()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<HardwareMeasurement> getHardwareMeasurement();

} // Estimator
