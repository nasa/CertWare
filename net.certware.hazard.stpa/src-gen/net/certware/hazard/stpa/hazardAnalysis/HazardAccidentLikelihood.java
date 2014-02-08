/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Accident Likelihood</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazardAccidentLikelihood()
 * @model
 * @generated
 */
public interface HazardAccidentLikelihood extends EObject
{
  /**
   * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Likelihood</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Likelihood</em>' attribute.
   * @see #setLikelihood(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazardAccidentLikelihood_Likelihood()
   * @model
   * @generated
   */
  String getLikelihood();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.HazardAccidentLikelihood#getLikelihood <em>Likelihood</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Likelihood</em>' attribute.
   * @see #getLikelihood()
   * @generated
   */
  void setLikelihood(String value);

} // HazardAccidentLikelihood
