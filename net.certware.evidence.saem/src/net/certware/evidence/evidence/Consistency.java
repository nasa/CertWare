/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consistency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.Consistency#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.evidence.EvidencePackage#getConsistency()
 * @model
 * @generated
 */
public interface Consistency extends DocumentAttribute {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.evidence.evidence.ConsistencyLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see net.certware.evidence.evidence.ConsistencyLevel
	 * @see #setValue(ConsistencyLevel)
	 * @see net.certware.evidence.evidence.EvidencePackage#getConsistency_Value()
	 * @model
	 * @generated
	 */
	ConsistencyLevel getValue();

	/**
	 * Sets the value of the '{@link net.certware.evidence.evidence.Consistency#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see net.certware.evidence.evidence.ConsistencyLevel
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ConsistencyLevel value);

} // Consistency
