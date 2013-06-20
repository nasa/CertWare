/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import net.certware.sacm.SACM.ModelElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getItem <em>Item</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getGid <em>Gid</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getProperty <em>Property</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getVersion <em>Version</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceContainer()
 * @model
 * @generated
 */
public interface EvidenceContainer extends ModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceContainer_Name()
	 * @model dataType="net.certware.sacm.SACM.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.EvidenceEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceContainer_Evaluation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EvidenceEvaluation> getEvaluation();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.EvidenceItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceContainer_Item()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EvidenceItem> getItem();

	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(String)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceContainer_Gid()
	 * @model dataType="net.certware.sacm.SACM.String" required="true" ordered="false"
	 * @generated
	 */
	String getGid();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(String value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.ProjectProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceContainer_Property()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ProjectProperty> getProperty();

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
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceContainer_Version()
	 * @model dataType="net.certware.sacm.SACM.String" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Evidence.ProjectElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getEvidenceContainer_Element()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ProjectElement> getElement();

} // EvidenceContainer
