/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Exposure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.HazardExposure#getExposure <em>Exposure</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazardExposure()
 * @model
 * @generated
 */
public interface HazardExposure extends EObject
{
  /**
   * Returns the value of the '<em><b>Exposure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exposure</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exposure</em>' attribute.
   * @see #setExposure(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazardExposure_Exposure()
   * @model
   * @generated
   */
  String getExposure();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.HazardExposure#getExposure <em>Exposure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exposure</em>' attribute.
   * @see #getExposure()
   * @generated
   */
  void setExposure(String value);

} // HazardExposure
