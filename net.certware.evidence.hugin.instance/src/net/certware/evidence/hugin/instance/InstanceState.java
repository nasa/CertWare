/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.hugin.instance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.instance.InstanceState#getStateName <em>State Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.instance.InstancePackage#getInstanceState()
 * @model
 * @generated
 */
public interface InstanceState extends EObject {
	/**
	 * Returns the value of the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Name</em>' attribute.
	 * @see #setStateName(String)
	 * @see net.certware.evidence.hugin.instance.InstancePackage#getInstanceState_StateName()
	 * @model
	 * @generated
	 */
	String getStateName();

	/**
	 * Sets the value of the '{@link net.certware.evidence.hugin.instance.InstanceState#getStateName <em>State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Name</em>' attribute.
	 * @see #getStateName()
	 * @generated
	 */
	void setStateName(String value);

} // InstanceState
