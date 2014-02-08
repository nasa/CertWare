/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.RiskLevel#getExposure <em>Exposure</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.RiskLevel#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getRiskLevel()
 * @model
 * @generated
 */
public interface RiskLevel extends EObject
{
  /**
   * Returns the value of the '<em><b>Exposure</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exposure</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exposure</em>' containment reference.
   * @see #setExposure(HazardExposure)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getRiskLevel_Exposure()
   * @model containment="true"
   * @generated
   */
  HazardExposure getExposure();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.RiskLevel#getExposure <em>Exposure</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exposure</em>' containment reference.
   * @see #getExposure()
   * @generated
   */
  void setExposure(HazardExposure value);

  /**
   * Returns the value of the '<em><b>Likelihood</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Likelihood</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Likelihood</em>' containment reference.
   * @see #setLikelihood(HazardAccidentLikelihood)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getRiskLevel_Likelihood()
   * @model containment="true"
   * @generated
   */
  HazardAccidentLikelihood getLikelihood();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.RiskLevel#getLikelihood <em>Likelihood</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Likelihood</em>' containment reference.
   * @see #getLikelihood()
   * @generated
   */
  void setLikelihood(HazardAccidentLikelihood value);

} // RiskLevel
