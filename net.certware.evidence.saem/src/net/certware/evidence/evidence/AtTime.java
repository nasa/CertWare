/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>At Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.AtTime#getDateTtime <em>Date Ttime</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getAtTime()
 * @model
 * @generated
 */
public interface AtTime extends TimingProperty {
	/**
	 * Returns the value of the '<em><b>Date Ttime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Ttime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Ttime</em>' attribute.
	 * @see #setDateTtime(Date)
	 * @see net.certware.evidence.evidence.EvidencePackage#getAtTime_DateTtime()
	 * @model
	 * @generated
	 */
	Date getDateTtime();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.AtTime#getDateTtime <em>Date Ttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Ttime</em>' attribute.
	 * @see #getDateTtime()
	 * @generated
	 */
	void setDateTtime(Date value);

} // AtTime
