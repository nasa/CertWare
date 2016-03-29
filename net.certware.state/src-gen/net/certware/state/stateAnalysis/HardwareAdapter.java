/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareAdapter#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareAdapter#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareAdapter#getHardwareCommands <em>Hardware Commands</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareAdapter#getHardwareMeasurements <em>Hardware Measurements</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareAdapter#getDeviceCommands <em>Device Commands</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.HardwareAdapter#getDeviceMeasurements <em>Device Measurements</em>}</li>
 * </ul>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareAdapter()
 * @model
 * @generated
 */
public interface HardwareAdapter extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareAdapter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.HardwareAdapter#getName <em>Name</em>}' attribute.
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareAdapter_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.HardwareAdapter#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Hardware Commands</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.HardwareCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardware Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardware Commands</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareAdapter_HardwareCommands()
   * @model containment="true"
   * @generated
   */
  EList<HardwareCommand> getHardwareCommands();

  /**
   * Returns the value of the '<em><b>Hardware Measurements</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.HardwareMeasurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardware Measurements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardware Measurements</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareAdapter_HardwareMeasurements()
   * @model containment="true"
   * @generated
   */
  EList<HardwareMeasurement> getHardwareMeasurements();

  /**
   * Returns the value of the '<em><b>Device Commands</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.DeviceCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Commands</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareAdapter_DeviceCommands()
   * @model containment="true"
   * @generated
   */
  EList<DeviceCommand> getDeviceCommands();

  /**
   * Returns the value of the '<em><b>Device Measurements</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.DeviceMeasurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Measurements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Measurements</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getHardwareAdapter_DeviceMeasurements()
   * @model containment="true"
   * @generated
   */
  EList<DeviceMeasurement> getDeviceMeasurements();

} // HardwareAdapter
