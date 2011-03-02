/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approved By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.ApprovedBy#getSupervisor <em>Supervisor</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getApprovedBy()
 * @model
 * @generated
 */
public interface ApprovedBy extends Provenance {
	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' reference.
	 * @see #setSupervisor(Originator)
	 * @see net.certware.evidence.evidence.EvidencePackage#getApprovedBy_Supervisor()
	 * @model required="true"
	 * @generated
	 */
	Originator getSupervisor();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.ApprovedBy#getSupervisor <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' reference.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(Originator value);

} // ApprovedBy
