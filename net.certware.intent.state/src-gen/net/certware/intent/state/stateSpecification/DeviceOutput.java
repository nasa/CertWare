/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.DeviceOutput#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.DeviceOutput#getIo <em>Io</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.DeviceOutput#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getDeviceOutput()
 * @model
 * @generated
 */
public interface DeviceOutput extends EObject
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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getDeviceOutput_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.DeviceOutput#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Io</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Io</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Io</em>' containment reference.
   * @see #setIo(Output)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getDeviceOutput_Io()
   * @model containment="true"
   * @generated
   */
  Output getIo();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.DeviceOutput#getIo <em>Io</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Io</em>' containment reference.
   * @see #getIo()
   * @generated
   */
  void setIo(Output value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Component)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getDeviceOutput_Target()
   * @model
   * @generated
   */
  Component getTarget();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.DeviceOutput#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Component value);

} // DeviceOutput
