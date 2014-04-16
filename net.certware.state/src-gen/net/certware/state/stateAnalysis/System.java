/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.System#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
  /**
   * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.Subsystem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subsystems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subsystems</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getSystem_Subsystems()
   * @model containment="true"
   * @generated
   */
  EList<Subsystem> getSubsystems();

} // System
