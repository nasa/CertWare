/**
 */
package net.certware.state.stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.Subsystem#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.Subsystem#getDeploymentSets <em>Deployment Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getSubsystem()
 * @model
 * @generated
 */
public interface Subsystem extends EObject
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
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getSubsystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.certware.state.stateAnalysis.Subsystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Deployment Sets</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.state.stateAnalysis.DeploymentSet}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployment Sets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployment Sets</em>' containment reference list.
   * @see net.certware.state.stateAnalysis.StateAnalysisPackage#getSubsystem_DeploymentSets()
   * @model containment="true"
   * @generated
   */
  EList<DeploymentSet> getDeploymentSets();

} // Subsystem
