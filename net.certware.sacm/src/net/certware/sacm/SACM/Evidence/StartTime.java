/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import net.certware.sacm.SACM.Datetime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.StartTime#getDatetime <em>Datetime</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getStartTime()
 * @model
 * @generated
 */
public interface StartTime extends EffectiveTime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Datetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime</em>' reference.
	 * @see #setDatetime(Datetime)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getStartTime_Datetime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datetime getDatetime();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.StartTime#getDatetime <em>Datetime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime</em>' reference.
	 * @see #getDatetime()
	 * @generated
	 */
	void setDatetime(Datetime value);

} // StartTime
