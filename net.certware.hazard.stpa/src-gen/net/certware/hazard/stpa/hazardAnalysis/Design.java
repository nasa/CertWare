/**
 */
package net.certware.hazard.stpa.hazardAnalysis;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Design#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Design#getAnalysis <em>Analysis</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.Design#getRationale <em>Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getDesign()
 * @model
 * @generated
 */
public interface Design extends EObject
{
  /**
   * Returns the value of the '<em><b>Allocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allocation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allocation</em>' attribute.
   * @see #setAllocation(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getDesign_Allocation()
   * @model
   * @generated
   */
  String getAllocation();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Design#getAllocation <em>Allocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Allocation</em>' attribute.
   * @see #getAllocation()
   * @generated
   */
  void setAllocation(String value);

  /**
   * Returns the value of the '<em><b>Analysis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Analysis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Analysis</em>' attribute.
   * @see #setAnalysis(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getDesign_Analysis()
   * @model
   * @generated
   */
  String getAnalysis();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Design#getAnalysis <em>Analysis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Analysis</em>' attribute.
   * @see #getAnalysis()
   * @generated
   */
  void setAnalysis(String value);

  /**
   * Returns the value of the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rationale</em>' attribute.
   * @see #setRationale(String)
   * @see net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage#getDesign_Rationale()
   * @model
   * @generated
   */
  String getRationale();

  /**
   * Sets the value of the '{@link net.certware.hazard.stpa.hazardAnalysis.Design#getRationale <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale</em>' attribute.
   * @see #getRationale()
   * @generated
   */
  void setRationale(String value);

} // Design
