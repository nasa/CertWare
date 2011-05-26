/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.evidence.evidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Package#getConsistency <em>Consistency</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getVersion <em>Version</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getCompleteness <em>Completeness</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getMethod <em>Method</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getOriginator <em>Originator</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getRequest <em>Request</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getObjective <em>Objective</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getActivity <em>Activity</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getItem <em>Item</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getRequiresPackage <em>Requires Package</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.Package#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends AdministrativeElement {
	/**
	 * Returns the value of the '<em><b>Consistency</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.evidence.evidence.ConsistencyLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consistency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consistency</em>' attribute.
	 * @see net.certware.evidence.evidence.ConsistencyLevel
	 * @see #setConsistency(ConsistencyLevel)
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Consistency()
	 * @model
	 * @generated
	 */
	ConsistencyLevel getConsistency();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Package#getConsistency <em>Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency</em>' attribute.
	 * @see net.certware.evidence.evidence.ConsistencyLevel
	 * @see #getConsistency()
	 * @generated
	 */
	void setConsistency(ConsistencyLevel value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Package#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.evidence.evidence.StandardOfProof}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' attribute.
	 * @see net.certware.evidence.evidence.StandardOfProof
	 * @see #setCriteria(StandardOfProof)
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Criteria()
	 * @model
	 * @generated
	 */
	StandardOfProof getCriteria();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Package#getCriteria <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' attribute.
	 * @see net.certware.evidence.evidence.StandardOfProof
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(StandardOfProof value);

	/**
	 * Returns the value of the '<em><b>Completeness</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.evidence.evidence.CompletenessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completeness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completeness</em>' attribute.
	 * @see net.certware.evidence.evidence.CompletenessLevel
	 * @see #setCompleteness(CompletenessLevel)
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Completeness()
	 * @model
	 * @generated
	 */
	CompletenessLevel getCompleteness();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Package#getCompleteness <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completeness</em>' attribute.
	 * @see net.certware.evidence.evidence.CompletenessLevel
	 * @see #getCompleteness()
	 * @generated
	 */
	void setCompleteness(CompletenessLevel value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.CollectionMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Method()
	 * @model containment="true"
	 * @generated
	 */
	EList<CollectionMethod> getMethod();

	/**
	 * Returns the value of the '<em><b>Originator</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.Originator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originator</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Originator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Originator> getOriginator();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.EvidenceRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Request()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvidenceRequest> getRequest();

	/**
	 * Returns the value of the '<em><b>Objective</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.ProjectObjective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objective</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objective</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Objective()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectObjective> getObjective();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivity();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.EvidenceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvidenceItem> getItem();

	/**
	 * Returns the value of the '<em><b>Requires Package</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.RequiresPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Package</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_RequiresPackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiresPackage> getRequiresPackage();

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.evidence.EvidenceEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference list.
	 * @see net.certware.evidence.evidence.EvidencePackage#getPackage_Evaluation()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvidenceEvaluation> getEvaluation();

} // Package
