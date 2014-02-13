/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.ComponentInput#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.ComponentInput#getIo <em>Io</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.ComponentInput#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponentInput()
 * @model
 * @generated
 */
public interface ComponentInput extends EObject
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
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponentInput_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ComponentInput#getName <em>Name</em>}' attribute.
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
   * @see #setIo(Input)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponentInput_Io()
   * @model containment="true"
   * @generated
   */
  Input getIo();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ComponentInput#getIo <em>Io</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Io</em>' containment reference.
   * @see #getIo()
   * @generated
   */
  void setIo(Input value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Device)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getComponentInput_Source()
   * @model
   * @generated
   */
  Device getSource();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ComponentInput#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Device value);

} // ComponentInput
