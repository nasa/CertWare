/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.Device#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Device#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Device#getDeviceCommands <em>Device Commands</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Device#getDeviceMeasurements <em>Device Measurements</em>}</li>
 * </ul>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDevice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.Device#getName <em>Name</em>}' attribute.
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDevice_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.Device#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDevice_DeviceCommands()
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDevice_DeviceMeasurements()
   * @model containment="true"
   * @generated
   */
  EList<DeviceMeasurement> getDeviceMeasurements();

} // Device
