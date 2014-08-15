/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Scenario#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends EObject
{
  /**
   * Returns the value of the '<em><b>Scenario</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenario</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenario</em>' attribute.
   * @see #setScenario(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getScenario_Scenario()
   * @model
   * @generated
   */
  String getScenario();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Scenario#getScenario <em>Scenario</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scenario</em>' attribute.
   * @see #getScenario()
   * @generated
   */
  void setScenario(String value);

} // Scenario
