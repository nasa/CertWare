/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification Rationale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.HazardClassificationRationale#getHazardId <em>Hazard Id</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.HazardClassificationRationale#getSummary <em>Summary</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.HazardClassificationRationale#getOption <em>Option</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.HazardClassificationRationale#getRiskAssessment <em>Risk Assessment</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.hazard.HazardPackage#getHazardClassificationRationale()
 * @model
 * @generated
 */
public interface HazardClassificationRationale extends EObject {
	/**
	 * Returns the value of the '<em><b>Hazard Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Id</em>' attribute.
	 * @see #setHazardId(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getHazardClassificationRationale_HazardId()
	 * @model
	 * @generated
	 */
	String getHazardId();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.HazardClassificationRationale#getHazardId <em>Hazard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Id</em>' attribute.
	 * @see #getHazardId()
	 * @generated
	 */
	void setHazardId(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getHazardClassificationRationale_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.HazardClassificationRationale#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' attribute.
	 * @see #setOption(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getHazardClassificationRationale_Option()
	 * @model
	 * @generated
	 */
	String getOption();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.HazardClassificationRationale#getOption <em>Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' attribute.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(String value);

	/**
	 * Returns the value of the '<em><b>Risk Assessment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Assessment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Assessment</em>' reference.
	 * @see #setRiskAssessment(RiskAssessment)
	 * @see net.certware.hazard.hazard.HazardPackage#getHazardClassificationRationale_RiskAssessment()
	 * @model
	 * @generated
	 */
	RiskAssessment getRiskAssessment();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.HazardClassificationRationale#getRiskAssessment <em>Risk Assessment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessment</em>' reference.
	 * @see #getRiskAssessment()
	 * @generated
	 */
	void setRiskAssessment(RiskAssessment value);

} // HazardClassificationRationale
