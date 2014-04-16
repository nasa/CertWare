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
