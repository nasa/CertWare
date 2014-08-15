/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.ModeElement#isInferred <em>Inferred</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.ModeElement#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.ModeElement#getModes <em>Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getModeElement()
 * @model
 * @generated
 */
public interface ModeElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Inferred</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inferred</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inferred</em>' attribute.
   * @see #setInferred(boolean)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getModeElement_Inferred()
   * @model
   * @generated
   */
  boolean isInferred();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ModeElement#isInferred <em>Inferred</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inferred</em>' attribute.
   * @see #isInferred()
   * @generated
   */
  void setInferred(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ModeElementType)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getModeElement_Type()
   * @model containment="true"
   * @generated
   */
  ModeElementType getType();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ModeElement#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ModeElementType value);

  /**
   * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.ModeVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modes</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getModeElement_Modes()
   * @model containment="true"
   * @generated
   */
  EList<ModeVariable> getModes();

} // ModeElement
