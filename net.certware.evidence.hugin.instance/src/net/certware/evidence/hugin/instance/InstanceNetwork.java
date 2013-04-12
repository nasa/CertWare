/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.hugin.instance;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.instance.InstanceNetwork#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.instance.InstancePackage#getInstanceNetwork()
 * @model
 * @generated
 */
public interface InstanceNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.evidence.hugin.instance.InstanceVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see net.certware.evidence.hugin.instance.InstancePackage#getInstanceNetwork_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<InstanceVariable> getVariables();

} // InstanceNetwork
