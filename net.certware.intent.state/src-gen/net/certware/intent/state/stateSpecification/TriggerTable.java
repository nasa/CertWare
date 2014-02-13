/**
 */
package net.certware.intent.state.stateSpecification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.TriggerTable#getRows <em>Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getTriggerTable()
 * @model
 * @generated
 */
public interface TriggerTable extends EObject
{
  /**
   * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.intent.state.stateSpecification.Trigger}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rows</em>' containment reference list.
   * @see net.certware.intent.state.stateSpecification.StateSpecificationPackage#getTriggerTable_Rows()
   * @model containment="true"
   * @generated
   */
  EList<Trigger> getRows();

} // TriggerTable
