/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getBaselinedLineCount <em>Baselined Line Count</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getCurrentLineCount <em>Current Line Count</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getCriticalDefectChangeOrders <em>Critical Defect Change Orders</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getNormalDefectChangeOrders <em>Normal Defect Change Orders</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getImprovementChangeOrders <em>Improvement Change Orders</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getNewFeatureChangeOrders <em>New Feature Change Orders</em>}</li>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getTotalChangeOrders <em>Total Change Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier()
 * @model
 * @generated
 */
public interface ArtifactIdentifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Name</em>' attribute.
	 * @see #setResourceName(String)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier_ResourceName()
	 * @model required="true"
	 * @generated
	 */
	String getResourceName();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactIdentifier#getResourceName <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Name</em>' attribute.
	 * @see #getResourceName()
	 * @generated
	 */
	void setResourceName(String value);

	/**
	 * Returns the value of the '<em><b>Baselined Line Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Baselined Line Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baselined Line Count</em>' attribute.
	 * @see #setBaselinedLineCount(int)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier_BaselinedLineCount()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getBaselinedLineCount();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactIdentifier#getBaselinedLineCount <em>Baselined Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baselined Line Count</em>' attribute.
	 * @see #getBaselinedLineCount()
	 * @generated
	 */
	void setBaselinedLineCount(int value);

	/**
	 * Returns the value of the '<em><b>Current Line Count</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Line Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Line Count</em>' attribute.
	 * @see #setCurrentLineCount(int)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier_CurrentLineCount()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getCurrentLineCount();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactIdentifier#getCurrentLineCount <em>Current Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Line Count</em>' attribute.
	 * @see #getCurrentLineCount()
	 * @generated
	 */
	void setCurrentLineCount(int value);

	/**
	 * Returns the value of the '<em><b>Critical Defect Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Critical Defect Change Orders</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Critical Defect Change Orders</em>' containment reference.
	 * @see #setCriticalDefectChangeOrders(CriticalDefectChangeOrders)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier_CriticalDefectChangeOrders()
	 * @model containment="true"
	 * @generated
	 */
	CriticalDefectChangeOrders getCriticalDefectChangeOrders();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactIdentifier#getCriticalDefectChangeOrders <em>Critical Defect Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Critical Defect Change Orders</em>' containment reference.
	 * @see #getCriticalDefectChangeOrders()
	 * @generated
	 */
	void setCriticalDefectChangeOrders(CriticalDefectChangeOrders value);

	/**
	 * Returns the value of the '<em><b>Normal Defect Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normal Defect Change Orders</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normal Defect Change Orders</em>' containment reference.
	 * @see #setNormalDefectChangeOrders(NormalDefectChangeOrders)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier_NormalDefectChangeOrders()
	 * @model containment="true"
	 * @generated
	 */
	NormalDefectChangeOrders getNormalDefectChangeOrders();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactIdentifier#getNormalDefectChangeOrders <em>Normal Defect Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normal Defect Change Orders</em>' containment reference.
	 * @see #getNormalDefectChangeOrders()
	 * @generated
	 */
	void setNormalDefectChangeOrders(NormalDefectChangeOrders value);

	/**
	 * Returns the value of the '<em><b>Improvement Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Improvement Change Orders</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Improvement Change Orders</em>' containment reference.
	 * @see #setImprovementChangeOrders(ImprovementChangeOrders)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier_ImprovementChangeOrders()
	 * @model containment="true"
	 * @generated
	 */
	ImprovementChangeOrders getImprovementChangeOrders();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactIdentifier#getImprovementChangeOrders <em>Improvement Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Improvement Change Orders</em>' containment reference.
	 * @see #getImprovementChangeOrders()
	 * @generated
	 */
	void setImprovementChangeOrders(ImprovementChangeOrders value);

	/**
	 * Returns the value of the '<em><b>New Feature Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Feature Change Orders</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Feature Change Orders</em>' containment reference.
	 * @see #setNewFeatureChangeOrders(NewFeatureChangeOrders)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier_NewFeatureChangeOrders()
	 * @model containment="true"
	 * @generated
	 */
	NewFeatureChangeOrders getNewFeatureChangeOrders();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactIdentifier#getNewFeatureChangeOrders <em>New Feature Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Feature Change Orders</em>' containment reference.
	 * @see #getNewFeatureChangeOrders()
	 * @generated
	 */
	void setNewFeatureChangeOrders(NewFeatureChangeOrders value);

	/**
	 * Returns the value of the '<em><b>Total Change Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Change Orders</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Change Orders</em>' containment reference.
	 * @see #setTotalChangeOrders(TotalChangeOrders)
	 * @see net.certware.measurement.sco.ScoPackage#getArtifactIdentifier_TotalChangeOrders()
	 * @model containment="true" required="true" volatile="true" derived="true"
	 * @generated
	 */
	TotalChangeOrders getTotalChangeOrders();

	/**
	 * Sets the value of the '{@link net.certware.measurement.sco.ArtifactIdentifier#getTotalChangeOrders <em>Total Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Change Orders</em>' containment reference.
	 * @see #getTotalChangeOrders()
	 * @generated
	 */
	void setTotalChangeOrders(TotalChangeOrders value);

} // ArtifactIdentifier
