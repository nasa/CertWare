/**
 */
package stateAnalysis;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link stateAnalysis.Device#getName <em>Name</em>}</li>
 *   <li>{@link stateAnalysis.Device#getDescription <em>Description</em>}</li>
 *   <li>{@link stateAnalysis.Device#getDeviceCommands <em>Device Commands</em>}</li>
 *   <li>{@link stateAnalysis.Device#getDeviceMeasurements <em>Device Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see stateAnalysis.StateAnalysisPackage#getDevice()
 * @model annotation="gmf.node label='name' label.pattern='Device: {0}'"
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
   * @see stateAnalysis.StateAnalysisPackage#getDevice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link stateAnalysis.Device#getName <em>Name</em>}' attribute.
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
   * @see stateAnalysis.StateAnalysisPackage#getDevice_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link stateAnalysis.Device#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Device Commands</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.DeviceCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Commands</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getDevice_DeviceCommands()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<DeviceCommand> getDeviceCommands();

  /**
   * Returns the value of the '<em><b>Device Measurements</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.DeviceMeasurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device Measurements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device Measurements</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getDevice_DeviceMeasurements()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<DeviceMeasurement> getDeviceMeasurements();

} // Device
