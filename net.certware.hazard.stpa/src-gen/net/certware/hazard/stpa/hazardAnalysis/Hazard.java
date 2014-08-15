/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getLevel <em>Level</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getRisk <em>Risk</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazard()
 * @model
 * @generated
 */
public interface Hazard extends EObject
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
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazard_Desc()
   * @model
   * @generated
   */
  String getDesc();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getDesc <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Desc</em>' attribute.
   * @see #getDesc()
   * @generated
   */
  void setDesc(String value);

  /**
   * Returns the value of the '<em><b>Level</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Level</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Level</em>' containment reference.
   * @see #setLevel(HazardLevel)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazard_Level()
   * @model containment="true"
   * @generated
   */
  HazardLevel getLevel();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getLevel <em>Level</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Level</em>' containment reference.
   * @see #getLevel()
   * @generated
   */
  void setLevel(HazardLevel value);

  /**
   * Returns the value of the '<em><b>Risk</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Risk</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Risk</em>' containment reference.
   * @see #setRisk(RiskLevel)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazard_Risk()
   * @model containment="true"
   * @generated
   */
  RiskLevel getRisk();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Hazard#getRisk <em>Risk</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Risk</em>' containment reference.
   * @see #getRisk()
   * @generated
   */
  void setRisk(RiskLevel value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link net.certware.hazard.stpa.hazardAnalysis.Constraint}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getHazard_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<Constraint> getConstraints();

} // Hazard
