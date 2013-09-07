/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see net.certware.sacm.SACM.SACMFactory
 * @model kind="package"
 * @generated
 */
public interface SACMPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SACM"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/SACM/1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SACM"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SACMPackage eINSTANCE = net.certware.sacm.SACM.impl.SACMPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.impl.SACMElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.impl.SACMElementImpl
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getSACMElement()
	 * @generated
	 */
	int SACM_ELEMENT = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.impl.UtilityElementImpl <em>Utility Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.impl.UtilityElementImpl
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getUtilityElement()
	 * @generated
	 */
	int UTILITY_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Utility Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILITY_ELEMENT_FEATURE_COUNT = SACM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.impl.AnnotationImpl
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONTENT = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.impl.ModelElementImpl
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TAGGED_VALUE = SACM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ANNOTATION = SACM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__ID = SACM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = SACM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.impl.AssuranceCaseImpl <em>Assurance Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.impl.AssuranceCaseImpl
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getAssuranceCase()
	 * @generated
	 */
	int ASSURANCE_CASE = 1;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE__TAGGED_VALUE = MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE__ANNOTATION = MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE__ID = MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE__GID = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE__ARGUMENT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE__EVIDENCE = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Assurance Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSURANCE_CASE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.impl.DatetimeImpl <em>Datetime</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.impl.DatetimeImpl
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getDatetime()
	 * @generated
	 */
	int DATETIME = 2;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME__DATETIME = 0;

	/**
	 * The number of structural features of the '<em>Datetime</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATETIME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.impl.TaggedValueImpl
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__KEY = UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__VALUE = UTILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = UTILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 7;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 8;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getString()
	 * @generated
	 */
	int STRING = 9;


	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see net.certware.sacm.SACM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Annotation#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see net.certware.sacm.SACM.Annotation#getContent()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Content();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.AssuranceCase <em>Assurance Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assurance Case</em>'.
	 * @see net.certware.sacm.SACM.AssuranceCase
	 * @generated
	 */
	EClass getAssuranceCase();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.AssuranceCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.sacm.SACM.AssuranceCase#getName()
	 * @see #getAssuranceCase()
	 * @generated
	 */
	EAttribute getAssuranceCase_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.AssuranceCase#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see net.certware.sacm.SACM.AssuranceCase#getGid()
	 * @see #getAssuranceCase()
	 * @generated
	 */
	EAttribute getAssuranceCase_Gid();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.AssuranceCase#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see net.certware.sacm.SACM.AssuranceCase#getArgument()
	 * @see #getAssuranceCase()
	 * @generated
	 */
	EReference getAssuranceCase_Argument();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.AssuranceCase#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see net.certware.sacm.SACM.AssuranceCase#getEvidence()
	 * @see #getAssuranceCase()
	 * @generated
	 */
	EReference getAssuranceCase_Evidence();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Datetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datetime</em>'.
	 * @see net.certware.sacm.SACM.Datetime
	 * @generated
	 */
	EClass getDatetime();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Datetime#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see net.certware.sacm.SACM.Datetime#getDatetime()
	 * @see #getDatetime()
	 * @generated
	 */
	EAttribute getDatetime_Datetime();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see net.certware.sacm.SACM.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.ModelElement#getTaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tagged Value</em>'.
	 * @see net.certware.sacm.SACM.ModelElement#getTaggedValue()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_TaggedValue();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.ModelElement#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.sacm.SACM.ModelElement#getAnnotation()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.ModelElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.sacm.SACM.ModelElement#getId()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Id();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.SACMElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.SACMElement
	 * @generated
	 */
	EClass getSACMElement();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see net.certware.sacm.SACM.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.TaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.certware.sacm.SACM.TaggedValue#getKey()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.TaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.TaggedValue#getValue()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.UtilityElement <em>Utility Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utility Element</em>'.
	 * @see net.certware.sacm.SACM.UtilityElement
	 * @generated
	 */
	EClass getUtilityElement();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SACMFactory getSACMFactory();

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
		 * The meta object literal for the '{@link net.certware.sacm.SACM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.impl.AnnotationImpl
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__CONTENT = eINSTANCE.getAnnotation_Content();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.impl.AssuranceCaseImpl <em>Assurance Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.impl.AssuranceCaseImpl
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getAssuranceCase()
		 * @generated
		 */
		EClass ASSURANCE_CASE = eINSTANCE.getAssuranceCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSURANCE_CASE__NAME = eINSTANCE.getAssuranceCase_Name();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSURANCE_CASE__GID = eINSTANCE.getAssuranceCase_Gid();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE__ARGUMENT = eINSTANCE.getAssuranceCase_Argument();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSURANCE_CASE__EVIDENCE = eINSTANCE.getAssuranceCase_Evidence();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.impl.DatetimeImpl <em>Datetime</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.impl.DatetimeImpl
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getDatetime()
		 * @generated
		 */
		EClass DATETIME = eINSTANCE.getDatetime();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATETIME__DATETIME = eINSTANCE.getDatetime_Datetime();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.impl.ModelElementImpl
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Tagged Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__TAGGED_VALUE = eINSTANCE.getModelElement_TaggedValue();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__ANNOTATION = eINSTANCE.getModelElement_Annotation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__ID = eINSTANCE.getModelElement_Id();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.impl.SACMElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.impl.SACMElementImpl
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getSACMElement()
		 * @generated
		 */
		EClass SACM_ELEMENT = eINSTANCE.getSACMElement();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.impl.TaggedValueImpl
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__KEY = eINSTANCE.getTaggedValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__VALUE = eINSTANCE.getTaggedValue_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.impl.UtilityElementImpl <em>Utility Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.impl.UtilityElementImpl
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getUtilityElement()
		 * @generated
		 */
		EClass UTILITY_ELEMENT = eINSTANCE.getUtilityElement();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see net.certware.sacm.SACM.impl.SACMPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //SACMPackage
