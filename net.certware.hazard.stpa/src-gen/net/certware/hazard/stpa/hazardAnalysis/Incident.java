/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getRanking <em>Ranking</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getHazards <em>Hazards</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getIncident()
 * @model
 * @generated
 */
public interface Incident extends EObject
{
  /**
   * Returns the value of the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Desc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Desc</em>' attribute.
   * @see #setDesc(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getIncident_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Ranking</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ranking</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ranking</em>' attribute.
   * @see #setRanking(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getIncident_Ranking()
   * @model
   * @generated
   */
  String getRanking();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Incident#getRanking <em>Ranking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ranking</em>' attribute.
   * @see #getRanking()
   * @generated
   */
  void setRanking(String value);

  /**
   * Returns the value of the '<em><b>Hazards</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Hazard}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hazards</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hazards</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getIncident_Hazards()
   * @model containment="true"
   * @generated
   */
  EList<Hazard> getHazards();

  /**
   * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Note}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getIncident_Notes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getNotes();

} // Incident
