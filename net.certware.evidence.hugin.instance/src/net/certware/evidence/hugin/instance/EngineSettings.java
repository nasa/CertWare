/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.hugin.instance;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.instance.EngineSettings#getSettings <em>Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.evidence.hugin.instance.InstancePackage#getEngineSettings()
 * @model
 * @generated
 */
public interface EngineSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Settings</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settings</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' map.
	 * @see net.certware.evidence.hugin.instance.InstancePackage#getEngineSettings_Settings()
	 * @model mapType="net.certware.evidence.hugin.instance.StringToStringMap<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getSettings();

} // EngineSettings
