/**
 * Copyright © 2013 National Aeronautics and Space Administration.
 */
package net.certware.hazard.hazard;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.hazard.hazard.RiskAssessment#getSeverity <em>Severity</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.RiskAssessment#getProbability <em>Probability</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.RiskAssessment#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.RiskAssessment#getSeverityRationale <em>Severity Rationale</em>}</li>
 *   <li>{@link net.certware.hazard.hazard.RiskAssessment#getProbabilityRationale <em>Probability Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.hazard.hazard.HazardPackage#getRiskAssessment()
 * @model
 * @generated
 */
public interface RiskAssessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.hazard.hazard.Severity_FAA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see net.certware.hazard.hazard.Severity_FAA
	 * @see #setSeverity(Severity_FAA)
	 * @see net.certware.hazard.hazard.HazardPackage#getRiskAssessment_Severity()
	 * @model
	 * @generated
	 */
	Severity_FAA getSeverity();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.RiskAssessment#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see net.certware.hazard.hazard.Severity_FAA
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity_FAA value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.hazard.hazard.Likelihood_FAA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see net.certware.hazard.hazard.Likelihood_FAA
	 * @see #setProbability(Likelihood_FAA)
	 * @see net.certware.hazard.hazard.HazardPackage#getRiskAssessment_Probability()
	 * @model
	 * @generated
	 */
	Likelihood_FAA getProbability();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.RiskAssessment#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see net.certware.hazard.hazard.Likelihood_FAA
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(Likelihood_FAA value);

	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' attribute.
	 * @see #setAssessment(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getRiskAssessment_Assessment()
	 * @model
	 * @generated
	 */
	String getAssessment();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.RiskAssessment#getAssessment <em>Assessment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessment</em>' attribute.
	 * @see #getAssessment()
	 * @generated
	 */
	void setAssessment(String value);

	/**
	 * Returns the value of the '<em><b>Severity Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity Rationale</em>' attribute.
	 * @see #setSeverityRationale(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getRiskAssessment_SeverityRationale()
	 * @model
	 * @generated
	 */
	String getSeverityRationale();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.RiskAssessment#getSeverityRationale <em>Severity Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity Rationale</em>' attribute.
	 * @see #getSeverityRationale()
	 * @generated
	 */
	void setSeverityRationale(String value);

	/**
	 * Returns the value of the '<em><b>Probability Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability Rationale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability Rationale</em>' attribute.
	 * @see #setProbabilityRationale(String)
	 * @see net.certware.hazard.hazard.HazardPackage#getRiskAssessment_ProbabilityRationale()
	 * @model
	 * @generated
	 */
	String getProbabilityRationale();

	/**
	 * Sets the value of the '{@link net.certware.hazard.hazard.RiskAssessment#getProbabilityRationale <em>Probability Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability Rationale</em>' attribute.
	 * @see #getProbabilityRationale()
	 * @generated
	 */
	void setProbabilityRationale(String value);

} // RiskAssessment
