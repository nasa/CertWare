/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getControls <em>Controls</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getConstraint_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Constraint#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

  /**
   * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirements</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getConstraint_Requirements()
   * @model containment="true"
   * @generated
   */
  EList<Requirement> getRequirements();

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Scenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getConstraint_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

  /**
   * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Control}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controls</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getConstraint_Controls()
   * @model containment="true"
   * @generated
   */
  EList<Control> getControls();

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
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getConstraint_Notes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getNotes();

} // Constraint
