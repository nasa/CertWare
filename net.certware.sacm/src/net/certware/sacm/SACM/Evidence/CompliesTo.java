/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complies To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.CompliesTo#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getCompliesTo()
 * @model
 * @generated
 */
public interface CompliesTo extends ProjectProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.sacm.SACM.Evidence.StandardOfProof}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' attribute.
	 * @see net.certware.sacm.SACM.Evidence.StandardOfProof
	 * @see #setCriteria(StandardOfProof)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getCompliesTo_Criteria()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StandardOfProof getCriteria();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.CompliesTo#getCriteria <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' attribute.
	 * @see net.certware.sacm.SACM.Evidence.StandardOfProof
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(StandardOfProof value);

} // CompliesTo
