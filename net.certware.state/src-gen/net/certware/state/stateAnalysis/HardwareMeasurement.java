/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareMeasurement#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareMeasurement#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareMeasurement#getEstimator <em>Estimator</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareMeasurement()
 * @model
 * @generated
 */
public interface HardwareMeasurement extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareMeasurement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.HardwareMeasurement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Adapter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adapter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adapter</em>' reference.
   * @see #setAdapter(HardwareAdapter)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareMeasurement_Adapter()
   * @model
   * @generated
   */
  HardwareAdapter getAdapter();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.HardwareMeasurement#getAdapter <em>Adapter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adapter</em>' reference.
   * @see #getAdapter()
   * @generated
   */
  void setAdapter(HardwareAdapter value);

  /**
   * Returns the value of the '<em><b>Estimator</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Estimator</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Estimator</em>' reference.
   * @see #setEstimator(Estimator)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareMeasurement_Estimator()
   * @model
   * @generated
   */
  Estimator getEstimator();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.HardwareMeasurement#getEstimator <em>Estimator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Estimator</em>' reference.
   * @see #getEstimator()
   * @generated
   */
  void setEstimator(Estimator value);

} // HardwareMeasurement
