/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.ModeVariable#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.intent.state.stateSpecification.ModeVariable#getModes <em>Modes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getModeVariable()
 * @model
 * @generated
 */
public interface ModeVariable extends EObject
{
  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getModeVariable_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link net.certware.intent.state.stateSpecification.ModeVariable#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Modes</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.Mode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modes</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getModeVariable_Modes()
   * @model containment="true"
   * @generated
   */
  EList<Mode> getModes();

} // ModeVariable
