/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparative Risk Assessment Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSecTrackingNumber <em>Sec Tracking Number</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getCraTitle <em>Cra Title</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSystem <em>System</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getReferences <em>References</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSummary <em>Summary</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getProposedChange <em>Proposed Change</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getHazardList <em>Hazard List</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getAssessmentSummary <em>Assessment Summary</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm()
 * @model
 * @generated
 */
public interface ComparativeRiskAssessmentForm extends EObject {
	/**
	 * Returns the value of the '<em><b>Sec Tracking Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sec Tracking Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sec Tracking Number</em>' attribute.
	 * @see #setSecTrackingNumber(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_SecTrackingNumber()
	 * @model
	 * @generated
	 */
	String getSecTrackingNumber();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSecTrackingNumber <em>Sec Tracking Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec Tracking Number</em>' attribute.
	 * @see #getSecTrackingNumber()
	 * @generated
	 */
	void setSecTrackingNumber(String value);

	/**
	 * Returns the value of the '<em><b>Cra Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cra Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cra Title</em>' attribute.
	 * @see #setCraTitle(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_CraTitle()
	 * @model
	 * @generated
	 */
	String getCraTitle();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getCraTitle <em>Cra Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cra Title</em>' attribute.
	 * @see #getCraTitle()
	 * @generated
	 */
	void setCraTitle(String value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_System()
	 * @model
	 * @generated
	 */
	String getSystem();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.hazard.hazard.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_References()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Reference> getReferences();

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
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baseline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseline</em>' attribute.
	 * @see #setBaseline(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_Baseline()
	 * @model
	 * @generated
	 */
	String getBaseline();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getBaseline <em>Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline</em>' attribute.
	 * @see #getBaseline()
	 * @generated
	 */
	void setBaseline(String value);

	/**
	 * Returns the value of the '<em><b>Proposed Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposed Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposed Change</em>' attribute.
	 * @see #setProposedChange(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_ProposedChange()
	 * @model
	 * @generated
	 */
	String getProposedChange();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getProposedChange <em>Proposed Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposed Change</em>' attribute.
	 * @see #getProposedChange()
	 * @generated
	 */
	void setProposedChange(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Risk Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Assessment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #setRiskAssessment(RiskAssessment)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_RiskAssessment()
	 * @model containment="true"
	 * @generated
	 */
	RiskAssessment getRiskAssessment();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getRiskAssessment <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #getRiskAssessment()
	 * @generated
	 */
	void setRiskAssessment(RiskAssessment value);

	/**
	 * Returns the value of the '<em><b>Hazard List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard List</em>' containment reference.
	 * @see #setHazardList(HazardList)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_HazardList()
	 * @model containment="true"
	 * @generated
	 */
	HazardList getHazardList();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getHazardList <em>Hazard List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard List</em>' containment reference.
	 * @see #getHazardList()
	 * @generated
	 */
	void setHazardList(HazardList value);

	/**
	 * Returns the value of the '<em><b>Assessment Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment Summary</em>' attribute.
	 * @see #setAssessmentSummary(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getComparativeRiskAssessmentForm_AssessmentSummary()
	 * @model
	 * @generated
	 */
	String getAssessmentSummary();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.ComparativeRiskAssessmentForm#getAssessmentSummary <em>Assessment Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment Summary</em>' attribute.
	 * @see #getAssessmentSummary()
	 * @generated
	 */
	void setAssessmentSummary(String value);

} // ComparativeRiskAssessmentForm
