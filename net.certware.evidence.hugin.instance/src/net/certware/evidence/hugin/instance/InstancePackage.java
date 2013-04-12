/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.hugin.instance;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.certware.evidence.hugin.instance.InstanceFactory
 * @model kind="package"
 * @generated
 */
public interface InstancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instance"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/hugin/instance"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instance"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancePackage eINSTANCE = net.certware.evidence.hugin.instance.impl.InstancePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.evidence.hugin.instance.impl.InstanceVariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.hugin.instance.impl.InstanceVariableImpl
	 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getInstanceVariable()
	 * @generated
	 */
	int INSTANCE_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VARIABLE__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VARIABLE__STATES = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.hugin.instance.impl.InstanceStateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.hugin.instance.impl.InstanceStateImpl
	 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getInstanceState()
	 * @generated
	 */
	int INSTANCE_STATE = 1;

	/**
	 * The feature id for the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE__STATE_NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_STATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.hugin.instance.impl.InstanceNetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.hugin.instance.impl.InstanceNetworkImpl
	 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getInstanceNetwork()
	 * @generated
	 */
	int INSTANCE_NETWORK = 2;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NETWORK__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_NETWORK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.hugin.instance.impl.EngineSettingsImpl <em>Engine Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.hugin.instance.impl.EngineSettingsImpl
	 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getEngineSettings()
	 * @generated
	 */
	int ENGINE_SETTINGS = 3;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_SETTINGS__SETTINGS = 0;

	/**
	 * The number of structural features of the '<em>Engine Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENGINE_SETTINGS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.hugin.instance.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.hugin.instance.impl.StringToStringMapImpl
	 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getStringToStringMap()
	 * @generated
	 */
	int STRING_TO_STRING_MAP = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To String Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_STRING_MAP_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link net.certware.evidence.hugin.instance.InstanceVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see net.certware.evidence.hugin.instance.InstanceVariable
	 * @generated
	 */
	EClass getInstanceVariable();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.instance.InstanceVariable#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see net.certware.evidence.hugin.instance.InstanceVariable#getVariableName()
	 * @see #getInstanceVariable()
	 * @generated
	 */
	EAttribute getInstanceVariable_VariableName();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.instance.InstanceVariable#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see net.certware.evidence.hugin.instance.InstanceVariable#getStates()
	 * @see #getInstanceVariable()
	 * @generated
	 */
	EReference getInstanceVariable_States();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.hugin.instance.InstanceState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see net.certware.evidence.hugin.instance.InstanceState
	 * @generated
	 */
	EClass getInstanceState();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.instance.InstanceState#getStateName <em>State Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Name</em>'.
	 * @see net.certware.evidence.hugin.instance.InstanceState#getStateName()
	 * @see #getInstanceState()
	 * @generated
	 */
	EAttribute getInstanceState_StateName();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.hugin.instance.InstanceNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see net.certware.evidence.hugin.instance.InstanceNetwork
	 * @generated
	 */
	EClass getInstanceNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.instance.InstanceNetwork#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see net.certware.evidence.hugin.instance.InstanceNetwork#getVariables()
	 * @see #getInstanceNetwork()
	 * @generated
	 */
	EReference getInstanceNetwork_Variables();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.hugin.instance.EngineSettings <em>Engine Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Engine Settings</em>'.
	 * @see net.certware.evidence.hugin.instance.EngineSettings
	 * @generated
	 */
	EClass getEngineSettings();

	/**
	 * Returns the meta object for the map '{@link net.certware.evidence.hugin.instance.EngineSettings#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Settings</em>'.
	 * @see net.certware.evidence.hugin.instance.EngineSettings#getSettings()
	 * @see #getEngineSettings()
	 * @generated
	 */
	EReference getEngineSettings_Settings();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To String Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringToStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToStringMap()
	 * @generated
	 */
	EAttribute getStringToStringMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstanceFactory getInstanceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.certware.evidence.hugin.instance.impl.InstanceVariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.hugin.instance.impl.InstanceVariableImpl
		 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getInstanceVariable()
		 * @generated
		 */
		EClass INSTANCE_VARIABLE = eINSTANCE.getInstanceVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_VARIABLE__VARIABLE_NAME = eINSTANCE.getInstanceVariable_VariableName();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_VARIABLE__STATES = eINSTANCE.getInstanceVariable_States();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.hugin.instance.impl.InstanceStateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.hugin.instance.impl.InstanceStateImpl
		 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getInstanceState()
		 * @generated
		 */
		EClass INSTANCE_STATE = eINSTANCE.getInstanceState();

		/**
		 * The meta object literal for the '<em><b>State Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE_STATE__STATE_NAME = eINSTANCE.getInstanceState_StateName();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.hugin.instance.impl.InstanceNetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.hugin.instance.impl.InstanceNetworkImpl
		 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getInstanceNetwork()
		 * @generated
		 */
		EClass INSTANCE_NETWORK = eINSTANCE.getInstanceNetwork();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_NETWORK__VARIABLES = eINSTANCE.getInstanceNetwork_Variables();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.hugin.instance.impl.EngineSettingsImpl <em>Engine Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.hugin.instance.impl.EngineSettingsImpl
		 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getEngineSettings()
		 * @generated
		 */
		EClass ENGINE_SETTINGS = eINSTANCE.getEngineSettings();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENGINE_SETTINGS__SETTINGS = eINSTANCE.getEngineSettings_Settings();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.hugin.instance.impl.StringToStringMapImpl <em>String To String Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.hugin.instance.impl.StringToStringMapImpl
		 * @see net.certware.evidence.hugin.instance.impl.InstancePackageImpl#getStringToStringMap()
		 * @generated
		 */
		EClass STRING_TO_STRING_MAP = eINSTANCE.getStringToStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__KEY = eINSTANCE.getStringToStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_STRING_MAP__VALUE = eINSTANCE.getStringToStringMap_Value();

	}

} //InstancePackage
