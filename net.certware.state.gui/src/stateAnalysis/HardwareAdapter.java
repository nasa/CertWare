/**
 */
package stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hardware Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link stateAnalysis.HardwareAdapter#getName <em>Name</em>}</li>
 *   <li>{@link stateAnalysis.HardwareAdapter#getDescription <em>Description</em>}</li>
 *   <li>{@link stateAnalysis.HardwareAdapter#getHardwareCommands <em>Hardware Commands</em>}</li>
 *   <li>{@link stateAnalysis.HardwareAdapter#getHardwareMeasurements <em>Hardware Measurements</em>}</li>
 *   <li>{@link stateAnalysis.HardwareAdapter#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see stateAnalysis.StateAnalysisPackage#getHardwareAdapter()
 * @model annotation="gmf.node label='name' label.pattern='Hardware Adapter: {0}' tool.name='Hardware Adapter'"
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
   * @see stateAnalysis.StateAnalysisPackage#getHardwareAdapter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link stateAnalysis.HardwareAdapter#getName <em>Name</em>}' attribute.
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
   * @see stateAnalysis.StateAnalysisPackage#getHardwareAdapter_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link stateAnalysis.HardwareAdapter#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Hardware Commands</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.HardwareCommand}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardware Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardware Commands</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getHardwareAdapter_HardwareCommands()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<HardwareCommand> getHardwareCommands();

  /**
   * Returns the value of the '<em><b>Hardware Measurements</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.HardwareMeasurement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hardware Measurements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hardware Measurements</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getHardwareAdapter_HardwareMeasurements()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='list'"
   * @generated
   */
  EList<HardwareMeasurement> getHardwareMeasurements();

  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.Device}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getHardwareAdapter_Devices()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='free'"
   * @generated
   */
  EList<Device> getDevices();

} // HardwareAdapter
