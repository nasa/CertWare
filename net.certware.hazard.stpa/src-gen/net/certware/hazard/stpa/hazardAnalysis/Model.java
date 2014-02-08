/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Model#getAccidents <em>Accidents</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Model#getIndicents <em>Indicents</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Accidents</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Accident}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Accidents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Accidents</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getModel_Accidents()
   * @model containment="true"
   * @generated
   */
  EList<Accident> getAccidents();

  /**
   * Returns the value of the '<em><b>Indicents</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Incident}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Indicents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Indicents</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getModel_Indicents()
   * @model containment="true"
   * @generated
   */
  EList<Incident> getIndicents();

} // Model
