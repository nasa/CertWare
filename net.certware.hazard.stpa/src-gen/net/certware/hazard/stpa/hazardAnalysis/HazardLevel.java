/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.HazardLevel#getSeverity <em>Severity</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.HazardLevel#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazardLevel()
 * @model
 * @generated
 */
public interface HazardLevel extends EObject
{
  /**
   * Returns the value of the '<em><b>Severity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Severity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Severity</em>' containment reference.
   * @see #setSeverity(HazardSeverity)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazardLevel_Severity()
   * @model containment="true"
   * @generated
   */
  HazardSeverity getSeverity();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLevel#getSeverity <em>Severity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Severity</em>' containment reference.
   * @see #getSeverity()
   * @generated
   */
  void setSeverity(HazardSeverity value);

  /**
   * Returns the value of the '<em><b>Likelihood</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Likelihood</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Likelihood</em>' containment reference.
   * @see #setLikelihood(HazardLikelihood)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazardLevel_Likelihood()
   * @model containment="true"
   * @generated
   */
  HazardLikelihood getLikelihood();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.HazardLevel#getLikelihood <em>Likelihood</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Likelihood</em>' containment reference.
   * @see #getLikelihood()
   * @generated
   */
  void setLikelihood(HazardLikelihood value);

} // HazardLevel
