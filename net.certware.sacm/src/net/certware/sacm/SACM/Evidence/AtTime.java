/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import net.certware.sacm.SACM.Datetime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>At Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.AtTime#getDateTtime <em>Date Ttime</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getAtTime()
 * @model
 * @generated
 */
public interface AtTime extends TimingProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Date Ttime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Ttime</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Ttime</em>' reference.
	 * @see #setDateTtime(Datetime)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getAtTime_DateTtime()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Datetime getDateTtime();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.AtTime#getDateTtime <em>Date Ttime</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Ttime</em>' reference.
	 * @see #getDateTtime()
	 * @generated
	 */
	void setDateTtime(Datetime value);

} // AtTime
