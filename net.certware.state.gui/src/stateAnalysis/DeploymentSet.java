/**
 */
package stateAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link stateAnalysis.DeploymentSet#getName <em>Name</em>}</li>
 *   <li>{@link stateAnalysis.DeploymentSet#getDescription <em>Description</em>}</li>
 *   <li>{@link stateAnalysis.DeploymentSet#getDeployments <em>Deployments</em>}</li>
 * </ul>
 * </p>
 *
 * @see stateAnalysis.StateAnalysisPackage#getDeploymentSet()
 * @model annotation="gmf.node label='name' label.pattern='Deployment Set: {0}' tool.name='Deployment Set' tool.description='Creates a new deployment set for the system'"
 * @generated
 */
public interface DeploymentSet extends EObject
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
   * @see stateAnalysis.StateAnalysisPackage#getDeploymentSet_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link stateAnalysis.DeploymentSet#getName <em>Name</em>}' attribute.
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
   * @see stateAnalysis.StateAnalysisPackage#getDeploymentSet_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link stateAnalysis.DeploymentSet#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Deployments</b></em>' containment reference list.
   * The list contents are of type {@link stateAnalysis.Deployment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deployments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deployments</em>' containment reference list.
   * @see stateAnalysis.StateAnalysisPackage#getDeploymentSet_Deployments()
   * @model containment="true"
   *        annotation="gmf.compartment collapsible='true' layout='free'"
   * @generated
   */
  EList<Deployment> getDeployments();

} // DeploymentSet
