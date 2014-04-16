/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.DeviceCommand#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.DeviceCommand#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.DeviceCommand#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDeviceCommand()
 * @model
 * @generated
 */
public interface DeviceCommand extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDeviceCommand_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.DeviceCommand#getName <em>Name</em>}' attribute.
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDeviceCommand_Adapter()
   * @model
   * @generated
   */
  HardwareAdapter getAdapter();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.DeviceCommand#getAdapter <em>Adapter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adapter</em>' reference.
   * @see #getAdapter()
   * @generated
   */
  void setAdapter(HardwareAdapter value);

  /**
   * Returns the value of the '<em><b>Device</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' containment reference.
   * @see #setDevice(Device)
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getDeviceCommand_Device()
   * @model containment="true"
   * @generated
   */
  Device getDevice();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.DeviceCommand#getDevice <em>Device</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' containment reference.
   * @see #getDevice()
   * @generated
   */
  void setDevice(Device value);

} // DeviceCommand
