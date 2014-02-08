/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Requirement#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Requirement#getDesigns <em>Designs</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Requirement#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject
{
  /**
   * Returns the value of the '<em><b>Requirement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' attribute.
   * @see #setRequirement(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getRequirement_Requirement()
   * @model
   * @generated
   */
  String getRequirement();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Requirement#getRequirement <em>Requirement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirement</em>' attribute.
   * @see #getRequirement()
   * @generated
   */
  void setRequirement(String value);

  /**
   * Returns the value of the '<em><b>Designs</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Design}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Designs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Designs</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getRequirement_Designs()
   * @model containment="true"
   * @generated
   */
  EList<Design> getDesigns();

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
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getRequirement_Notes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getNotes();

} // Requirement
