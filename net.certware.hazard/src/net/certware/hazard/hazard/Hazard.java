/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.Hazard#getNumber <em>Number</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.Hazard#getHazardCondition <em>Hazard Condition</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.Hazard#getRiskAssessmentCode <em>Risk Assessment Code</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.Hazard#getHazardClassificationRationale <em>Hazard Classification Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.hazard.HazardPackage#getHazard()
 * @model
 * @generated
 */
public interface Hazard extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see net.certware.hazard.hazard.HazardPackage#getHazard_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.Hazard#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Hazard Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Condition</em>' attribute.
	 * @see #setHazardCondition(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getHazard_HazardCondition()
	 * @model
	 * @generated
	 */
	String getHazardCondition();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.Hazard#getHazardCondition <em>Hazard Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Condition</em>' attribute.
	 * @see #getHazardCondition()
	 * @generated
	 */
	void setHazardCondition(String value);

	/**
	 * Returns the value of the '<em><b>Risk Assessment Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Assessment Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Assessment Code</em>' containment reference.
	 * @see #setRiskAssessmentCode(RiskAssessmentCode)
	 * @see net.certware.hazard.hazard.HazardPackage#getHazard_RiskAssessmentCode()
	 * @model containment="true"
	 * @generated
	 */
	RiskAssessmentCode getRiskAssessmentCode();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.Hazard#getRiskAssessmentCode <em>Risk Assessment Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessment Code</em>' containment reference.
	 * @see #getRiskAssessmentCode()
	 * @generated
	 */
	void setRiskAssessmentCode(RiskAssessmentCode value);

	/**
	 * Returns the value of the '<em><b>Hazard Classification Rationale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Classification Rationale</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Classification Rationale</em>' reference.
	 * @see #setHazardClassificationRationale(HazardClassificationRationale)
	 * @see net.certware.hazard.hazard.HazardPackage#getHazard_HazardClassificationRationale()
	 * @model
	 * @generated
	 */
	HazardClassificationRationale getHazardClassificationRationale();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.Hazard#getHazardClassificationRationale <em>Hazard Classification Rationale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Classification Rationale</em>' reference.
	 * @see #getHazardClassificationRationale()
	 * @generated
	 */
	void setHazardClassificationRationale(HazardClassificationRationale value);

} // Hazard
