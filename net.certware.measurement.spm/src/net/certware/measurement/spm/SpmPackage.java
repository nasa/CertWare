/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm;

import net.certware.measurement.smm.SmmPackage;

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
 * @see net.certware.measurement.spm.SpmFactory
 * @model kind="package"
 * @generated
 */
public interface SpmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spm"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/spm"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spm"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpmPackage eINSTANCE = net.certware.measurement.spm.impl.SpmPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ProjectModelImpl <em>Project Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ProjectModelImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getProjectModel()
	 * @generated
	 */
	int PROJECT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MODEL__MODEL = SmmPackage.SMM_MODEL__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MODEL__ATTRIBUTE = SmmPackage.SMM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MODEL__ANNOTATION = SmmPackage.SMM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MODEL__MODEL_ELEMENT = SmmPackage.SMM_MODEL__MODEL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MODEL__COMMITS = SmmPackage.SMM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MODEL_FEATURE_COUNT = SmmPackage.SMM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ProjectCommitImpl <em>Project Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ProjectCommitImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getProjectCommit()
	 * @generated
	 */
	int PROJECT_COMMIT = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_COMMIT__MODEL = SmmPackage.SMM_MODEL__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_COMMIT__ATTRIBUTE = SmmPackage.SMM_MODEL__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_COMMIT__ANNOTATION = SmmPackage.SMM_MODEL__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_COMMIT__MODEL_ELEMENT = SmmPackage.SMM_MODEL__MODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Project Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_COMMIT_FEATURE_COUNT = SmmPackage.SMM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.CommitRelationshipImpl <em>Commit Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.CommitRelationshipImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCommitRelationship()
	 * @generated
	 */
	int COMMIT_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_RELATIONSHIP__MODEL = SmmPackage.SMM_RELATIONSHIP__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_RELATIONSHIP__ATTRIBUTE = SmmPackage.SMM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_RELATIONSHIP__ANNOTATION = SmmPackage.SMM_RELATIONSHIP__ANNOTATION;

	/**
	 * The number of structural features of the '<em>Commit Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_RELATIONSHIP_FEATURE_COUNT = SmmPackage.SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.EndProductQualityCategoryImpl <em>End Product Quality Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.EndProductQualityCategoryImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getEndProductQualityCategory()
	 * @generated
	 */
	int END_PRODUCT_QUALITY_CATEGORY = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__MODEL = SmmPackage.CATEGORY__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__ATTRIBUTE = SmmPackage.CATEGORY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__ANNOTATION = SmmPackage.CATEGORY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__NAME = SmmPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__CATEGORY = SmmPackage.CATEGORY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Category Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__CATEGORY_ELEMENT = SmmPackage.CATEGORY__CATEGORY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Out Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__OUT_CATEGORY = SmmPackage.CATEGORY__OUT_CATEGORY;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__IN_CATEGORY = SmmPackage.CATEGORY__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY__CATEGORY_MEASURE = SmmPackage.CATEGORY__CATEGORY_MEASURE;

	/**
	 * The number of structural features of the '<em>End Product Quality Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_CATEGORY_FEATURE_COUNT = SmmPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.InProgressQualityCategoryImpl <em>In Progress Quality Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.InProgressQualityCategoryImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getInProgressQualityCategory()
	 * @generated
	 */
	int IN_PROGRESS_QUALITY_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__MODEL = SmmPackage.CATEGORY__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__ATTRIBUTE = SmmPackage.CATEGORY__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__ANNOTATION = SmmPackage.CATEGORY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__NAME = SmmPackage.CATEGORY__NAME;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__CATEGORY = SmmPackage.CATEGORY__CATEGORY;

	/**
	 * The feature id for the '<em><b>Category Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__CATEGORY_ELEMENT = SmmPackage.CATEGORY__CATEGORY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Out Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__OUT_CATEGORY = SmmPackage.CATEGORY__OUT_CATEGORY;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__IN_CATEGORY = SmmPackage.CATEGORY__IN_CATEGORY;

	/**
	 * The feature id for the '<em><b>Category Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY__CATEGORY_MEASURE = SmmPackage.CATEGORY__CATEGORY_MEASURE;

	/**
	 * The number of structural features of the '<em>In Progress Quality Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_QUALITY_CATEGORY_FEATURE_COUNT = SmmPackage.CATEGORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.EndProductQualityImpl <em>End Product Quality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.EndProductQualityImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getEndProductQuality()
	 * @generated
	 */
	int END_PRODUCT_QUALITY = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY__MODEL = SmmPackage.CHARACTERISTIC__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY__ATTRIBUTE = SmmPackage.CHARACTERISTIC__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY__ANNOTATION = SmmPackage.CHARACTERISTIC__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY__NAME = SmmPackage.CHARACTERISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY__PARENT = SmmPackage.CHARACTERISTIC__PARENT;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY__CHARACTERISTICS = SmmPackage.CHARACTERISTIC__CHARACTERISTICS;

	/**
	 * The number of structural features of the '<em>End Product Quality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PRODUCT_QUALITY_FEATURE_COUNT = SmmPackage.CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.MaintainabilityImpl <em>Maintainability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.MaintainabilityImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getMaintainability()
	 * @generated
	 */
	int MAINTAINABILITY = 6;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__MODEL = SmmPackage.CHARACTERISTIC__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__ATTRIBUTE = SmmPackage.CHARACTERISTIC__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__ANNOTATION = SmmPackage.CHARACTERISTIC__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__NAME = SmmPackage.CHARACTERISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__PARENT = SmmPackage.CHARACTERISTIC__PARENT;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY__CHARACTERISTICS = SmmPackage.CHARACTERISTIC__CHARACTERISTICS;

	/**
	 * The number of structural features of the '<em>Maintainability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_FEATURE_COUNT = SmmPackage.CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.InProgressIndicatorImpl <em>In Progress Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.InProgressIndicatorImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getInProgressIndicator()
	 * @generated
	 */
	int IN_PROGRESS_INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_INDICATOR__MODEL = SmmPackage.CHARACTERISTIC__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_INDICATOR__ATTRIBUTE = SmmPackage.CHARACTERISTIC__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_INDICATOR__ANNOTATION = SmmPackage.CHARACTERISTIC__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_INDICATOR__NAME = SmmPackage.CHARACTERISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_INDICATOR__PARENT = SmmPackage.CHARACTERISTIC__PARENT;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_INDICATOR__CHARACTERISTICS = SmmPackage.CHARACTERISTIC__CHARACTERISTICS;

	/**
	 * The number of structural features of the '<em>In Progress Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PROGRESS_INDICATOR_FEATURE_COUNT = SmmPackage.CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ProjectSizeImpl <em>Project Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ProjectSizeImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getProjectSize()
	 * @generated
	 */
	int PROJECT_SIZE = 8;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SIZE__MODEL = SmmPackage.CHARACTERISTIC__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SIZE__ATTRIBUTE = SmmPackage.CHARACTERISTIC__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SIZE__ANNOTATION = SmmPackage.CHARACTERISTIC__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SIZE__NAME = SmmPackage.CHARACTERISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SIZE__PARENT = SmmPackage.CHARACTERISTIC__PARENT;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SIZE__CHARACTERISTICS = SmmPackage.CHARACTERISTIC__CHARACTERISTICS;

	/**
	 * The number of structural features of the '<em>Project Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SIZE_FEATURE_COUNT = SmmPackage.CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.CaseDimensionalMeasureImpl <em>Case Dimensional Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.CaseDimensionalMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCaseDimensionalMeasure()
	 * @generated
	 */
	int CASE_DIMENSIONAL_MEASURE = 9;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__MODEL = SmmPackage.DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__ATTRIBUTE = SmmPackage.DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__ANNOTATION = SmmPackage.DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__CATEGORY = SmmPackage.DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__LIBRARY = SmmPackage.DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__NAME = SmmPackage.DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__EQUIVALENT_FROM = SmmPackage.DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__EQUIVALENT_TO = SmmPackage.DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__REFINEMENT = SmmPackage.DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__MEASUREMENT = SmmPackage.DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__OUT_MEASURE = SmmPackage.DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__IN_MEASURE = SmmPackage.DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__TRAIT = SmmPackage.DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__SCOPE = SmmPackage.DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE__UNIT = SmmPackage.DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The number of structural features of the '<em>Case Dimensional Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_DIMENSIONAL_MEASURE_FEATURE_COUNT = SmmPackage.DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ChangeOrderDimensionalMeasureImpl <em>Change Order Dimensional Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ChangeOrderDimensionalMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getChangeOrderDimensionalMeasure()
	 * @generated
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE = 10;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__MODEL = SmmPackage.DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__ATTRIBUTE = SmmPackage.DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__ANNOTATION = SmmPackage.DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__CATEGORY = SmmPackage.DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__LIBRARY = SmmPackage.DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__NAME = SmmPackage.DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__EQUIVALENT_FROM = SmmPackage.DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__EQUIVALENT_TO = SmmPackage.DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__REFINEMENT = SmmPackage.DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__MEASUREMENT = SmmPackage.DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__OUT_MEASURE = SmmPackage.DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__IN_MEASURE = SmmPackage.DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__TRAIT = SmmPackage.DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__SCOPE = SmmPackage.DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE__UNIT = SmmPackage.DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The number of structural features of the '<em>Change Order Dimensional Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ORDER_DIMENSIONAL_MEASURE_FEATURE_COUNT = SmmPackage.DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.TimeDimensionalMeasureImpl <em>Time Dimensional Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.TimeDimensionalMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getTimeDimensionalMeasure()
	 * @generated
	 */
	int TIME_DIMENSIONAL_MEASURE = 11;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__MODEL = SmmPackage.DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__ATTRIBUTE = SmmPackage.DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__ANNOTATION = SmmPackage.DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__CATEGORY = SmmPackage.DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__LIBRARY = SmmPackage.DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__NAME = SmmPackage.DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__EQUIVALENT_FROM = SmmPackage.DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__EQUIVALENT_TO = SmmPackage.DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__REFINEMENT = SmmPackage.DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__MEASUREMENT = SmmPackage.DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__OUT_MEASURE = SmmPackage.DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__IN_MEASURE = SmmPackage.DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__TRAIT = SmmPackage.DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__SCOPE = SmmPackage.DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE__UNIT = SmmPackage.DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The number of structural features of the '<em>Time Dimensional Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DIMENSIONAL_MEASURE_FEATURE_COUNT = SmmPackage.DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.AdditiveMeasureImpl <em>Additive Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.AdditiveMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getAdditiveMeasure()
	 * @generated
	 */
	int ADDITIVE_MEASURE = 12;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__MODEL = SmmPackage.COLLECTIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__ATTRIBUTE = SmmPackage.COLLECTIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__ANNOTATION = SmmPackage.COLLECTIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__CATEGORY = SmmPackage.COLLECTIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__LIBRARY = SmmPackage.COLLECTIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__NAME = SmmPackage.COLLECTIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__EQUIVALENT_FROM = SmmPackage.COLLECTIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__EQUIVALENT_TO = SmmPackage.COLLECTIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__REFINEMENT = SmmPackage.COLLECTIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__MEASUREMENT = SmmPackage.COLLECTIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__OUT_MEASURE = SmmPackage.COLLECTIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__IN_MEASURE = SmmPackage.COLLECTIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__TRAIT = SmmPackage.COLLECTIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__SCOPE = SmmPackage.COLLECTIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__UNIT = SmmPackage.COLLECTIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__BASE_MEASURE = SmmPackage.COLLECTIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE__ACCUMULATOR = SmmPackage.COLLECTIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Additive Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_MEASURE_FEATURE_COUNT = SmmPackage.COLLECTIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.CaseScopeImpl <em>Case Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.CaseScopeImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCaseScope()
	 * @generated
	 */
	int CASE_SCOPE = 13;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE__MODEL = SmmPackage.SCOPE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE__ATTRIBUTE = SmmPackage.SCOPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE__ANNOTATION = SmmPackage.SCOPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE__CLASS = SmmPackage.SCOPE__CLASS;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE__ENUMERATED = SmmPackage.SCOPE__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE__NAME = SmmPackage.SCOPE__NAME;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE__MEASURES = SmmPackage.SCOPE__MEASURES;

	/**
	 * The feature id for the '<em><b>Recognizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE__RECOGNIZER = SmmPackage.SCOPE__RECOGNIZER;

	/**
	 * The number of structural features of the '<em>Case Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_SCOPE_FEATURE_COUNT = SmmPackage.SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ProjectScopeImpl <em>Project Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ProjectScopeImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getProjectScope()
	 * @generated
	 */
	int PROJECT_SCOPE = 14;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE__MODEL = SmmPackage.SCOPE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE__ATTRIBUTE = SmmPackage.SCOPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE__ANNOTATION = SmmPackage.SCOPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE__CLASS = SmmPackage.SCOPE__CLASS;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE__ENUMERATED = SmmPackage.SCOPE__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE__NAME = SmmPackage.SCOPE__NAME;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE__MEASURES = SmmPackage.SCOPE__MEASURES;

	/**
	 * The feature id for the '<em><b>Recognizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE__RECOGNIZER = SmmPackage.SCOPE__RECOGNIZER;

	/**
	 * The number of structural features of the '<em>Project Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SCOPE_FEATURE_COUNT = SmmPackage.SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ChangeScopeImpl <em>Change Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ChangeScopeImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getChangeScope()
	 * @generated
	 */
	int CHANGE_SCOPE = 15;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE__MODEL = SmmPackage.SCOPE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE__ATTRIBUTE = SmmPackage.SCOPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE__ANNOTATION = SmmPackage.SCOPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE__CLASS = SmmPackage.SCOPE__CLASS;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE__ENUMERATED = SmmPackage.SCOPE__ENUMERATED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE__NAME = SmmPackage.SCOPE__NAME;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE__MEASURES = SmmPackage.SCOPE__MEASURES;

	/**
	 * The feature id for the '<em><b>Recognizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE__RECOGNIZER = SmmPackage.SCOPE__RECOGNIZER;

	/**
	 * The number of structural features of the '<em>Change Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_SCOPE_FEATURE_COUNT = SmmPackage.SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.CriticalDefectChangeOrderCountImpl <em>Critical Defect Change Order Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.CriticalDefectChangeOrderCountImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCriticalDefectChangeOrderCount()
	 * @generated
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT = 16;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Critical Defect Change Order Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_DEFECT_CHANGE_ORDER_COUNT_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.NormalDefectChangeOrderCountImpl <em>Normal Defect Change Order Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.NormalDefectChangeOrderCountImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getNormalDefectChangeOrderCount()
	 * @generated
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT = 17;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Normal Defect Change Order Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_DEFECT_CHANGE_ORDER_COUNT_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ImprovementChangeOrderCountImpl <em>Improvement Change Order Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ImprovementChangeOrderCountImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getImprovementChangeOrderCount()
	 * @generated
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT = 18;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Improvement Change Order Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPROVEMENT_CHANGE_ORDER_COUNT_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.NewFeatureChangeOrderCountImpl <em>New Feature Change Order Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.NewFeatureChangeOrderCountImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getNewFeatureChangeOrderCount()
	 * @generated
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT = 19;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>New Feature Change Order Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_FEATURE_CHANGE_ORDER_COUNT_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.TrendMeasureImpl <em>Trend Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.TrendMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getTrendMeasure()
	 * @generated
	 */
	int TREND_MEASURE = 20;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__MODEL = SmmPackage.COLLECTIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__ATTRIBUTE = SmmPackage.COLLECTIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__ANNOTATION = SmmPackage.COLLECTIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__CATEGORY = SmmPackage.COLLECTIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__LIBRARY = SmmPackage.COLLECTIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__NAME = SmmPackage.COLLECTIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__EQUIVALENT_FROM = SmmPackage.COLLECTIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__EQUIVALENT_TO = SmmPackage.COLLECTIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__REFINEMENT = SmmPackage.COLLECTIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__MEASUREMENT = SmmPackage.COLLECTIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__OUT_MEASURE = SmmPackage.COLLECTIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__IN_MEASURE = SmmPackage.COLLECTIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__TRAIT = SmmPackage.COLLECTIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__SCOPE = SmmPackage.COLLECTIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__UNIT = SmmPackage.COLLECTIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__BASE_MEASURE = SmmPackage.COLLECTIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE__ACCUMULATOR = SmmPackage.COLLECTIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Trend Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREND_MEASURE_FEATURE_COUNT = SmmPackage.COLLECTIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ScrapRatioMeasureImpl <em>Scrap Ratio Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ScrapRatioMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getScrapRatioMeasure()
	 * @generated
	 */
	int SCRAP_RATIO_MEASURE = 21;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__MODEL = SmmPackage.RATIO_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__ATTRIBUTE = SmmPackage.RATIO_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__ANNOTATION = SmmPackage.RATIO_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__CATEGORY = SmmPackage.RATIO_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__LIBRARY = SmmPackage.RATIO_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__NAME = SmmPackage.RATIO_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__EQUIVALENT_FROM = SmmPackage.RATIO_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__EQUIVALENT_TO = SmmPackage.RATIO_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__REFINEMENT = SmmPackage.RATIO_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__MEASUREMENT = SmmPackage.RATIO_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__OUT_MEASURE = SmmPackage.RATIO_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__IN_MEASURE = SmmPackage.RATIO_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__TRAIT = SmmPackage.RATIO_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__SCOPE = SmmPackage.RATIO_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__UNIT = SmmPackage.RATIO_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__FUNCTOR = SmmPackage.RATIO_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__BASE_MEASURE1 = SmmPackage.RATIO_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE__BASE_MEASURE2 = SmmPackage.RATIO_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Scrap Ratio Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRAP_RATIO_MEASURE_FEATURE_COUNT = SmmPackage.RATIO_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ModularityMeasureImpl <em>Modularity Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ModularityMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getModularityMeasure()
	 * @generated
	 */
	int MODULARITY_MEASURE = 22;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__MODEL = SmmPackage.RATIO_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__ATTRIBUTE = SmmPackage.RATIO_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__ANNOTATION = SmmPackage.RATIO_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__CATEGORY = SmmPackage.RATIO_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__LIBRARY = SmmPackage.RATIO_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__NAME = SmmPackage.RATIO_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__EQUIVALENT_FROM = SmmPackage.RATIO_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__EQUIVALENT_TO = SmmPackage.RATIO_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__REFINEMENT = SmmPackage.RATIO_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__MEASUREMENT = SmmPackage.RATIO_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__OUT_MEASURE = SmmPackage.RATIO_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__IN_MEASURE = SmmPackage.RATIO_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__TRAIT = SmmPackage.RATIO_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__SCOPE = SmmPackage.RATIO_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__UNIT = SmmPackage.RATIO_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__FUNCTOR = SmmPackage.RATIO_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__BASE_MEASURE1 = SmmPackage.RATIO_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE__BASE_MEASURE2 = SmmPackage.RATIO_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Modularity Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_MEASURE_FEATURE_COUNT = SmmPackage.RATIO_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ReworkRatioMeasureImpl <em>Rework Ratio Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ReworkRatioMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getReworkRatioMeasure()
	 * @generated
	 */
	int REWORK_RATIO_MEASURE = 23;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__MODEL = SmmPackage.RATIO_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__ATTRIBUTE = SmmPackage.RATIO_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__ANNOTATION = SmmPackage.RATIO_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__CATEGORY = SmmPackage.RATIO_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__LIBRARY = SmmPackage.RATIO_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__NAME = SmmPackage.RATIO_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__EQUIVALENT_FROM = SmmPackage.RATIO_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__EQUIVALENT_TO = SmmPackage.RATIO_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__REFINEMENT = SmmPackage.RATIO_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__MEASUREMENT = SmmPackage.RATIO_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__OUT_MEASURE = SmmPackage.RATIO_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__IN_MEASURE = SmmPackage.RATIO_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__TRAIT = SmmPackage.RATIO_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__SCOPE = SmmPackage.RATIO_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__UNIT = SmmPackage.RATIO_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__FUNCTOR = SmmPackage.RATIO_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__BASE_MEASURE1 = SmmPackage.RATIO_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE__BASE_MEASURE2 = SmmPackage.RATIO_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Rework Ratio Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_RATIO_MEASURE_FEATURE_COUNT = SmmPackage.RATIO_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.AdaptabilityRatioMeasureImpl <em>Adaptability Ratio Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.AdaptabilityRatioMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getAdaptabilityRatioMeasure()
	 * @generated
	 */
	int ADAPTABILITY_RATIO_MEASURE = 24;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__MODEL = SmmPackage.RATIO_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__ATTRIBUTE = SmmPackage.RATIO_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__ANNOTATION = SmmPackage.RATIO_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__CATEGORY = SmmPackage.RATIO_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__LIBRARY = SmmPackage.RATIO_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__NAME = SmmPackage.RATIO_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__EQUIVALENT_FROM = SmmPackage.RATIO_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__EQUIVALENT_TO = SmmPackage.RATIO_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__REFINEMENT = SmmPackage.RATIO_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__MEASUREMENT = SmmPackage.RATIO_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__OUT_MEASURE = SmmPackage.RATIO_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__IN_MEASURE = SmmPackage.RATIO_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__TRAIT = SmmPackage.RATIO_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__SCOPE = SmmPackage.RATIO_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__UNIT = SmmPackage.RATIO_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__FUNCTOR = SmmPackage.RATIO_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__BASE_MEASURE1 = SmmPackage.RATIO_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE__BASE_MEASURE2 = SmmPackage.RATIO_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Adaptability Ratio Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_RATIO_MEASURE_FEATURE_COUNT = SmmPackage.RATIO_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.MaturityRatioMeasureImpl <em>Maturity Ratio Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.MaturityRatioMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getMaturityRatioMeasure()
	 * @generated
	 */
	int MATURITY_RATIO_MEASURE = 25;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__MODEL = SmmPackage.RATIO_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__ATTRIBUTE = SmmPackage.RATIO_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__ANNOTATION = SmmPackage.RATIO_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__CATEGORY = SmmPackage.RATIO_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__LIBRARY = SmmPackage.RATIO_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__NAME = SmmPackage.RATIO_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__EQUIVALENT_FROM = SmmPackage.RATIO_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__EQUIVALENT_TO = SmmPackage.RATIO_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__REFINEMENT = SmmPackage.RATIO_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__MEASUREMENT = SmmPackage.RATIO_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__OUT_MEASURE = SmmPackage.RATIO_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__IN_MEASURE = SmmPackage.RATIO_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__TRAIT = SmmPackage.RATIO_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__SCOPE = SmmPackage.RATIO_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__UNIT = SmmPackage.RATIO_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__FUNCTOR = SmmPackage.RATIO_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__BASE_MEASURE1 = SmmPackage.RATIO_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE__BASE_MEASURE2 = SmmPackage.RATIO_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Maturity Ratio Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_RATIO_MEASURE_FEATURE_COUNT = SmmPackage.RATIO_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.MaintainabilityMeasureImpl <em>Maintainability Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.MaintainabilityMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getMaintainabilityMeasure()
	 * @generated
	 */
	int MAINTAINABILITY_MEASURE = 26;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__MODEL = SmmPackage.RATIO_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__ATTRIBUTE = SmmPackage.RATIO_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__ANNOTATION = SmmPackage.RATIO_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__CATEGORY = SmmPackage.RATIO_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__LIBRARY = SmmPackage.RATIO_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__NAME = SmmPackage.RATIO_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__EQUIVALENT_FROM = SmmPackage.RATIO_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__EQUIVALENT_TO = SmmPackage.RATIO_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__REFINEMENT = SmmPackage.RATIO_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__MEASUREMENT = SmmPackage.RATIO_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__OUT_MEASURE = SmmPackage.RATIO_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__IN_MEASURE = SmmPackage.RATIO_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__TRAIT = SmmPackage.RATIO_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__SCOPE = SmmPackage.RATIO_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__UNIT = SmmPackage.RATIO_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__FUNCTOR = SmmPackage.RATIO_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__BASE_MEASURE1 = SmmPackage.RATIO_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE__BASE_MEASURE2 = SmmPackage.RATIO_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Maintainability Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAINTAINABILITY_MEASURE_FEATURE_COUNT = SmmPackage.RATIO_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.BrokenCaseSizeMeasureImpl <em>Broken Case Size Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.BrokenCaseSizeMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getBrokenCaseSizeMeasure()
	 * @generated
	 */
	int BROKEN_CASE_SIZE_MEASURE = 27;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Broken Case Size Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROKEN_CASE_SIZE_MEASURE_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.FixedCaseSizeMeasureImpl <em>Fixed Case Size Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.FixedCaseSizeMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getFixedCaseSizeMeasure()
	 * @generated
	 */
	int FIXED_CASE_SIZE_MEASURE = 28;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Fixed Case Size Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_CASE_SIZE_MEASURE_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.TotalCaseSizeMeasureImpl <em>Total Case Size Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.TotalCaseSizeMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getTotalCaseSizeMeasure()
	 * @generated
	 */
	int TOTAL_CASE_SIZE_MEASURE = 29;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Total Case Size Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CASE_SIZE_MEASURE_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.BaselineCaseSizeMeasureImpl <em>Baseline Case Size Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.BaselineCaseSizeMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getBaselineCaseSizeMeasure()
	 * @generated
	 */
	int BASELINE_CASE_SIZE_MEASURE = 30;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Baseline Case Size Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASELINE_CASE_SIZE_MEASURE_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.UsageTimeMeasureImpl <em>Usage Time Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.UsageTimeMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getUsageTimeMeasure()
	 * @generated
	 */
	int USAGE_TIME_MEASURE = 31;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__MODEL = TIME_DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__ATTRIBUTE = TIME_DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__ANNOTATION = TIME_DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__CATEGORY = TIME_DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__LIBRARY = TIME_DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__NAME = TIME_DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__EQUIVALENT_FROM = TIME_DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__EQUIVALENT_TO = TIME_DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__REFINEMENT = TIME_DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__MEASUREMENT = TIME_DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__OUT_MEASURE = TIME_DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__IN_MEASURE = TIME_DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__TRAIT = TIME_DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__SCOPE = TIME_DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE__UNIT = TIME_DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The number of structural features of the '<em>Usage Time Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_TIME_MEASURE_FEATURE_COUNT = TIME_DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.RepairEffortMeasureImpl <em>Repair Effort Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.RepairEffortMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getRepairEffortMeasure()
	 * @generated
	 */
	int REPAIR_EFFORT_MEASURE = 32;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Repair Effort Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPAIR_EFFORT_MEASURE_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.DevelopmentEffortMeasureImpl <em>Development Effort Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.DevelopmentEffortMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getDevelopmentEffortMeasure()
	 * @generated
	 */
	int DEVELOPMENT_EFFORT_MEASURE = 33;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Development Effort Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPMENT_EFFORT_MEASURE_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.TotalChangeOrderCountImpl <em>Total Change Order Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.TotalChangeOrderCountImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getTotalChangeOrderCount()
	 * @generated
	 */
	int TOTAL_CHANGE_ORDER_COUNT = 34;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__MODEL = ADDITIVE_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__ATTRIBUTE = ADDITIVE_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__ANNOTATION = ADDITIVE_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__CATEGORY = ADDITIVE_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__LIBRARY = ADDITIVE_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__NAME = ADDITIVE_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__EQUIVALENT_FROM = ADDITIVE_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__EQUIVALENT_TO = ADDITIVE_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__REFINEMENT = ADDITIVE_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__MEASUREMENT = ADDITIVE_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__OUT_MEASURE = ADDITIVE_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__IN_MEASURE = ADDITIVE_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__TRAIT = ADDITIVE_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__SCOPE = ADDITIVE_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__UNIT = ADDITIVE_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__BASE_MEASURE = ADDITIVE_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT__ACCUMULATOR = ADDITIVE_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Total Change Order Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOTAL_CHANGE_ORDER_COUNT_FEATURE_COUNT = ADDITIVE_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.CriticalAndNormalChangeOrderCountImpl <em>Critical And Normal Change Order Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.CriticalAndNormalChangeOrderCountImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCriticalAndNormalChangeOrderCount()
	 * @generated
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT = 35;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__MODEL = SmmPackage.BINARY_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__ATTRIBUTE = SmmPackage.BINARY_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__ANNOTATION = SmmPackage.BINARY_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__CATEGORY = SmmPackage.BINARY_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__LIBRARY = SmmPackage.BINARY_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__NAME = SmmPackage.BINARY_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__EQUIVALENT_FROM = SmmPackage.BINARY_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__EQUIVALENT_TO = SmmPackage.BINARY_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__REFINEMENT = SmmPackage.BINARY_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__MEASUREMENT = SmmPackage.BINARY_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__OUT_MEASURE = SmmPackage.BINARY_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__IN_MEASURE = SmmPackage.BINARY_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__TRAIT = SmmPackage.BINARY_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__SCOPE = SmmPackage.BINARY_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__UNIT = SmmPackage.BINARY_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__FUNCTOR = SmmPackage.BINARY_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__BASE_MEASURE1 = SmmPackage.BINARY_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT__BASE_MEASURE2 = SmmPackage.BINARY_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Critical And Normal Change Order Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT_FEATURE_COUNT = SmmPackage.BINARY_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ReworkStabilityMeasureImpl <em>Rework Stability Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ReworkStabilityMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getReworkStabilityMeasure()
	 * @generated
	 */
	int REWORK_STABILITY_MEASURE = 36;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__MODEL = SmmPackage.BINARY_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__ATTRIBUTE = SmmPackage.BINARY_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__ANNOTATION = SmmPackage.BINARY_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__CATEGORY = SmmPackage.BINARY_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__LIBRARY = SmmPackage.BINARY_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__NAME = SmmPackage.BINARY_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__EQUIVALENT_FROM = SmmPackage.BINARY_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__EQUIVALENT_TO = SmmPackage.BINARY_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__REFINEMENT = SmmPackage.BINARY_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__MEASUREMENT = SmmPackage.BINARY_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__OUT_MEASURE = SmmPackage.BINARY_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__IN_MEASURE = SmmPackage.BINARY_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__TRAIT = SmmPackage.BINARY_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__SCOPE = SmmPackage.BINARY_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__UNIT = SmmPackage.BINARY_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__FUNCTOR = SmmPackage.BINARY_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__BASE_MEASURE1 = SmmPackage.BINARY_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE__BASE_MEASURE2 = SmmPackage.BINARY_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Rework Stability Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_STABILITY_MEASURE_FEATURE_COUNT = SmmPackage.BINARY_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ReworkBacklogMeasureImpl <em>Rework Backlog Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ReworkBacklogMeasureImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getReworkBacklogMeasure()
	 * @generated
	 */
	int REWORK_BACKLOG_MEASURE = 37;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__MODEL = SmmPackage.RATIO_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__ATTRIBUTE = SmmPackage.RATIO_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__ANNOTATION = SmmPackage.RATIO_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__CATEGORY = SmmPackage.RATIO_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__LIBRARY = SmmPackage.RATIO_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__NAME = SmmPackage.RATIO_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__EQUIVALENT_FROM = SmmPackage.RATIO_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__EQUIVALENT_TO = SmmPackage.RATIO_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__REFINEMENT = SmmPackage.RATIO_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__MEASUREMENT = SmmPackage.RATIO_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__OUT_MEASURE = SmmPackage.RATIO_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__IN_MEASURE = SmmPackage.RATIO_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__TRAIT = SmmPackage.RATIO_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__SCOPE = SmmPackage.RATIO_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__UNIT = SmmPackage.RATIO_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__FUNCTOR = SmmPackage.RATIO_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__BASE_MEASURE1 = SmmPackage.RATIO_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE__BASE_MEASURE2 = SmmPackage.RATIO_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Rework Backlog Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWORK_BACKLOG_MEASURE_FEATURE_COUNT = SmmPackage.RATIO_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.ModularityTrendImpl <em>Modularity Trend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.ModularityTrendImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getModularityTrend()
	 * @generated
	 */
	int MODULARITY_TREND = 38;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__MODEL = TREND_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__ATTRIBUTE = TREND_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__ANNOTATION = TREND_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__CATEGORY = TREND_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__LIBRARY = TREND_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__NAME = TREND_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__EQUIVALENT_FROM = TREND_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__EQUIVALENT_TO = TREND_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__REFINEMENT = TREND_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__MEASUREMENT = TREND_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__OUT_MEASURE = TREND_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__IN_MEASURE = TREND_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__TRAIT = TREND_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__SCOPE = TREND_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__UNIT = TREND_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__BASE_MEASURE = TREND_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND__ACCUMULATOR = TREND_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Modularity Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARITY_TREND_FEATURE_COUNT = TREND_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.AdaptabilityTrendImpl <em>Adaptability Trend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.AdaptabilityTrendImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getAdaptabilityTrend()
	 * @generated
	 */
	int ADAPTABILITY_TREND = 39;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__MODEL = TREND_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__ATTRIBUTE = TREND_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__ANNOTATION = TREND_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__CATEGORY = TREND_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__LIBRARY = TREND_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__NAME = TREND_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__EQUIVALENT_FROM = TREND_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__EQUIVALENT_TO = TREND_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__REFINEMENT = TREND_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__MEASUREMENT = TREND_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__OUT_MEASURE = TREND_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__IN_MEASURE = TREND_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__TRAIT = TREND_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__SCOPE = TREND_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__UNIT = TREND_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__BASE_MEASURE = TREND_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND__ACCUMULATOR = TREND_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Adaptability Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTABILITY_TREND_FEATURE_COUNT = TREND_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.spm.impl.MaturityTrendImpl <em>Maturity Trend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.spm.impl.MaturityTrendImpl
	 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getMaturityTrend()
	 * @generated
	 */
	int MATURITY_TREND = 40;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__MODEL = TREND_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__ATTRIBUTE = TREND_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__ANNOTATION = TREND_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__CATEGORY = TREND_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__LIBRARY = TREND_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__NAME = TREND_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__EQUIVALENT_FROM = TREND_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__EQUIVALENT_TO = TREND_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__REFINEMENT = TREND_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__MEASUREMENT = TREND_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__OUT_MEASURE = TREND_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__IN_MEASURE = TREND_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__TRAIT = TREND_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__SCOPE = TREND_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__UNIT = TREND_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__BASE_MEASURE = TREND_MEASURE__BASE_MEASURE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND__ACCUMULATOR = TREND_MEASURE__ACCUMULATOR;

	/**
	 * The number of structural features of the '<em>Maturity Trend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATURITY_TREND_FEATURE_COUNT = TREND_MEASURE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ProjectModel <em>Project Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Model</em>'.
	 * @see net.certware.measurement.spm.ProjectModel
	 * @generated
	 */
	EClass getProjectModel();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.spm.ProjectModel#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commits</em>'.
	 * @see net.certware.measurement.spm.ProjectModel#getCommits()
	 * @see #getProjectModel()
	 * @generated
	 */
	EReference getProjectModel_Commits();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ProjectCommit <em>Project Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Commit</em>'.
	 * @see net.certware.measurement.spm.ProjectCommit
	 * @generated
	 */
	EClass getProjectCommit();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.CommitRelationship <em>Commit Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit Relationship</em>'.
	 * @see net.certware.measurement.spm.CommitRelationship
	 * @generated
	 */
	EClass getCommitRelationship();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.EndProductQualityCategory <em>End Product Quality Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Product Quality Category</em>'.
	 * @see net.certware.measurement.spm.EndProductQualityCategory
	 * @generated
	 */
	EClass getEndProductQualityCategory();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.InProgressQualityCategory <em>In Progress Quality Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Progress Quality Category</em>'.
	 * @see net.certware.measurement.spm.InProgressQualityCategory
	 * @generated
	 */
	EClass getInProgressQualityCategory();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.EndProductQuality <em>End Product Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Product Quality</em>'.
	 * @see net.certware.measurement.spm.EndProductQuality
	 * @generated
	 */
	EClass getEndProductQuality();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.Maintainability <em>Maintainability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintainability</em>'.
	 * @see net.certware.measurement.spm.Maintainability
	 * @generated
	 */
	EClass getMaintainability();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.InProgressIndicator <em>In Progress Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Progress Indicator</em>'.
	 * @see net.certware.measurement.spm.InProgressIndicator
	 * @generated
	 */
	EClass getInProgressIndicator();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ProjectSize <em>Project Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Size</em>'.
	 * @see net.certware.measurement.spm.ProjectSize
	 * @generated
	 */
	EClass getProjectSize();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.CaseDimensionalMeasure <em>Case Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Dimensional Measure</em>'.
	 * @see net.certware.measurement.spm.CaseDimensionalMeasure
	 * @generated
	 */
	EClass getCaseDimensionalMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ChangeOrderDimensionalMeasure <em>Change Order Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Order Dimensional Measure</em>'.
	 * @see net.certware.measurement.spm.ChangeOrderDimensionalMeasure
	 * @generated
	 */
	EClass getChangeOrderDimensionalMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.TimeDimensionalMeasure <em>Time Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Dimensional Measure</em>'.
	 * @see net.certware.measurement.spm.TimeDimensionalMeasure
	 * @generated
	 */
	EClass getTimeDimensionalMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.AdditiveMeasure <em>Additive Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Measure</em>'.
	 * @see net.certware.measurement.spm.AdditiveMeasure
	 * @generated
	 */
	EClass getAdditiveMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.CaseScope <em>Case Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Scope</em>'.
	 * @see net.certware.measurement.spm.CaseScope
	 * @generated
	 */
	EClass getCaseScope();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ProjectScope <em>Project Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Scope</em>'.
	 * @see net.certware.measurement.spm.ProjectScope
	 * @generated
	 */
	EClass getProjectScope();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ChangeScope <em>Change Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Scope</em>'.
	 * @see net.certware.measurement.spm.ChangeScope
	 * @generated
	 */
	EClass getChangeScope();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.CriticalDefectChangeOrderCount <em>Critical Defect Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critical Defect Change Order Count</em>'.
	 * @see net.certware.measurement.spm.CriticalDefectChangeOrderCount
	 * @generated
	 */
	EClass getCriticalDefectChangeOrderCount();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.NormalDefectChangeOrderCount <em>Normal Defect Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Defect Change Order Count</em>'.
	 * @see net.certware.measurement.spm.NormalDefectChangeOrderCount
	 * @generated
	 */
	EClass getNormalDefectChangeOrderCount();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ImprovementChangeOrderCount <em>Improvement Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Improvement Change Order Count</em>'.
	 * @see net.certware.measurement.spm.ImprovementChangeOrderCount
	 * @generated
	 */
	EClass getImprovementChangeOrderCount();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.NewFeatureChangeOrderCount <em>New Feature Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Feature Change Order Count</em>'.
	 * @see net.certware.measurement.spm.NewFeatureChangeOrderCount
	 * @generated
	 */
	EClass getNewFeatureChangeOrderCount();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.TrendMeasure <em>Trend Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trend Measure</em>'.
	 * @see net.certware.measurement.spm.TrendMeasure
	 * @generated
	 */
	EClass getTrendMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ScrapRatioMeasure <em>Scrap Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scrap Ratio Measure</em>'.
	 * @see net.certware.measurement.spm.ScrapRatioMeasure
	 * @generated
	 */
	EClass getScrapRatioMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ModularityMeasure <em>Modularity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modularity Measure</em>'.
	 * @see net.certware.measurement.spm.ModularityMeasure
	 * @generated
	 */
	EClass getModularityMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ReworkRatioMeasure <em>Rework Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rework Ratio Measure</em>'.
	 * @see net.certware.measurement.spm.ReworkRatioMeasure
	 * @generated
	 */
	EClass getReworkRatioMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.AdaptabilityRatioMeasure <em>Adaptability Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptability Ratio Measure</em>'.
	 * @see net.certware.measurement.spm.AdaptabilityRatioMeasure
	 * @generated
	 */
	EClass getAdaptabilityRatioMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.MaturityRatioMeasure <em>Maturity Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maturity Ratio Measure</em>'.
	 * @see net.certware.measurement.spm.MaturityRatioMeasure
	 * @generated
	 */
	EClass getMaturityRatioMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.MaintainabilityMeasure <em>Maintainability Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maintainability Measure</em>'.
	 * @see net.certware.measurement.spm.MaintainabilityMeasure
	 * @generated
	 */
	EClass getMaintainabilityMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.BrokenCaseSizeMeasure <em>Broken Case Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Broken Case Size Measure</em>'.
	 * @see net.certware.measurement.spm.BrokenCaseSizeMeasure
	 * @generated
	 */
	EClass getBrokenCaseSizeMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.FixedCaseSizeMeasure <em>Fixed Case Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Case Size Measure</em>'.
	 * @see net.certware.measurement.spm.FixedCaseSizeMeasure
	 * @generated
	 */
	EClass getFixedCaseSizeMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.TotalCaseSizeMeasure <em>Total Case Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Case Size Measure</em>'.
	 * @see net.certware.measurement.spm.TotalCaseSizeMeasure
	 * @generated
	 */
	EClass getTotalCaseSizeMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.BaselineCaseSizeMeasure <em>Baseline Case Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Baseline Case Size Measure</em>'.
	 * @see net.certware.measurement.spm.BaselineCaseSizeMeasure
	 * @generated
	 */
	EClass getBaselineCaseSizeMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.UsageTimeMeasure <em>Usage Time Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Time Measure</em>'.
	 * @see net.certware.measurement.spm.UsageTimeMeasure
	 * @generated
	 */
	EClass getUsageTimeMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.RepairEffortMeasure <em>Repair Effort Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repair Effort Measure</em>'.
	 * @see net.certware.measurement.spm.RepairEffortMeasure
	 * @generated
	 */
	EClass getRepairEffortMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.DevelopmentEffortMeasure <em>Development Effort Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Development Effort Measure</em>'.
	 * @see net.certware.measurement.spm.DevelopmentEffortMeasure
	 * @generated
	 */
	EClass getDevelopmentEffortMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.TotalChangeOrderCount <em>Total Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Total Change Order Count</em>'.
	 * @see net.certware.measurement.spm.TotalChangeOrderCount
	 * @generated
	 */
	EClass getTotalChangeOrderCount();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.CriticalAndNormalChangeOrderCount <em>Critical And Normal Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Critical And Normal Change Order Count</em>'.
	 * @see net.certware.measurement.spm.CriticalAndNormalChangeOrderCount
	 * @generated
	 */
	EClass getCriticalAndNormalChangeOrderCount();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ReworkStabilityMeasure <em>Rework Stability Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rework Stability Measure</em>'.
	 * @see net.certware.measurement.spm.ReworkStabilityMeasure
	 * @generated
	 */
	EClass getReworkStabilityMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ReworkBacklogMeasure <em>Rework Backlog Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rework Backlog Measure</em>'.
	 * @see net.certware.measurement.spm.ReworkBacklogMeasure
	 * @generated
	 */
	EClass getReworkBacklogMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.ModularityTrend <em>Modularity Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modularity Trend</em>'.
	 * @see net.certware.measurement.spm.ModularityTrend
	 * @generated
	 */
	EClass getModularityTrend();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.AdaptabilityTrend <em>Adaptability Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptability Trend</em>'.
	 * @see net.certware.measurement.spm.AdaptabilityTrend
	 * @generated
	 */
	EClass getAdaptabilityTrend();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.spm.MaturityTrend <em>Maturity Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Maturity Trend</em>'.
	 * @see net.certware.measurement.spm.MaturityTrend
	 * @generated
	 */
	EClass getMaturityTrend();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpmFactory getSpmFactory();

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
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ProjectModelImpl <em>Project Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ProjectModelImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getProjectModel()
		 * @generated
		 */
		EClass PROJECT_MODEL = eINSTANCE.getProjectModel();

		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_MODEL__COMMITS = eINSTANCE.getProjectModel_Commits();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ProjectCommitImpl <em>Project Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ProjectCommitImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getProjectCommit()
		 * @generated
		 */
		EClass PROJECT_COMMIT = eINSTANCE.getProjectCommit();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.CommitRelationshipImpl <em>Commit Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.CommitRelationshipImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCommitRelationship()
		 * @generated
		 */
		EClass COMMIT_RELATIONSHIP = eINSTANCE.getCommitRelationship();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.EndProductQualityCategoryImpl <em>End Product Quality Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.EndProductQualityCategoryImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getEndProductQualityCategory()
		 * @generated
		 */
		EClass END_PRODUCT_QUALITY_CATEGORY = eINSTANCE.getEndProductQualityCategory();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.InProgressQualityCategoryImpl <em>In Progress Quality Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.InProgressQualityCategoryImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getInProgressQualityCategory()
		 * @generated
		 */
		EClass IN_PROGRESS_QUALITY_CATEGORY = eINSTANCE.getInProgressQualityCategory();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.EndProductQualityImpl <em>End Product Quality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.EndProductQualityImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getEndProductQuality()
		 * @generated
		 */
		EClass END_PRODUCT_QUALITY = eINSTANCE.getEndProductQuality();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.MaintainabilityImpl <em>Maintainability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.MaintainabilityImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getMaintainability()
		 * @generated
		 */
		EClass MAINTAINABILITY = eINSTANCE.getMaintainability();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.InProgressIndicatorImpl <em>In Progress Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.InProgressIndicatorImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getInProgressIndicator()
		 * @generated
		 */
		EClass IN_PROGRESS_INDICATOR = eINSTANCE.getInProgressIndicator();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ProjectSizeImpl <em>Project Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ProjectSizeImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getProjectSize()
		 * @generated
		 */
		EClass PROJECT_SIZE = eINSTANCE.getProjectSize();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.CaseDimensionalMeasureImpl <em>Case Dimensional Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.CaseDimensionalMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCaseDimensionalMeasure()
		 * @generated
		 */
		EClass CASE_DIMENSIONAL_MEASURE = eINSTANCE.getCaseDimensionalMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ChangeOrderDimensionalMeasureImpl <em>Change Order Dimensional Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ChangeOrderDimensionalMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getChangeOrderDimensionalMeasure()
		 * @generated
		 */
		EClass CHANGE_ORDER_DIMENSIONAL_MEASURE = eINSTANCE.getChangeOrderDimensionalMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.TimeDimensionalMeasureImpl <em>Time Dimensional Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.TimeDimensionalMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getTimeDimensionalMeasure()
		 * @generated
		 */
		EClass TIME_DIMENSIONAL_MEASURE = eINSTANCE.getTimeDimensionalMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.AdditiveMeasureImpl <em>Additive Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.AdditiveMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getAdditiveMeasure()
		 * @generated
		 */
		EClass ADDITIVE_MEASURE = eINSTANCE.getAdditiveMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.CaseScopeImpl <em>Case Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.CaseScopeImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCaseScope()
		 * @generated
		 */
		EClass CASE_SCOPE = eINSTANCE.getCaseScope();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ProjectScopeImpl <em>Project Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ProjectScopeImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getProjectScope()
		 * @generated
		 */
		EClass PROJECT_SCOPE = eINSTANCE.getProjectScope();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ChangeScopeImpl <em>Change Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ChangeScopeImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getChangeScope()
		 * @generated
		 */
		EClass CHANGE_SCOPE = eINSTANCE.getChangeScope();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.CriticalDefectChangeOrderCountImpl <em>Critical Defect Change Order Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.CriticalDefectChangeOrderCountImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCriticalDefectChangeOrderCount()
		 * @generated
		 */
		EClass CRITICAL_DEFECT_CHANGE_ORDER_COUNT = eINSTANCE.getCriticalDefectChangeOrderCount();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.NormalDefectChangeOrderCountImpl <em>Normal Defect Change Order Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.NormalDefectChangeOrderCountImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getNormalDefectChangeOrderCount()
		 * @generated
		 */
		EClass NORMAL_DEFECT_CHANGE_ORDER_COUNT = eINSTANCE.getNormalDefectChangeOrderCount();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ImprovementChangeOrderCountImpl <em>Improvement Change Order Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ImprovementChangeOrderCountImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getImprovementChangeOrderCount()
		 * @generated
		 */
		EClass IMPROVEMENT_CHANGE_ORDER_COUNT = eINSTANCE.getImprovementChangeOrderCount();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.NewFeatureChangeOrderCountImpl <em>New Feature Change Order Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.NewFeatureChangeOrderCountImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getNewFeatureChangeOrderCount()
		 * @generated
		 */
		EClass NEW_FEATURE_CHANGE_ORDER_COUNT = eINSTANCE.getNewFeatureChangeOrderCount();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.TrendMeasureImpl <em>Trend Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.TrendMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getTrendMeasure()
		 * @generated
		 */
		EClass TREND_MEASURE = eINSTANCE.getTrendMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ScrapRatioMeasureImpl <em>Scrap Ratio Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ScrapRatioMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getScrapRatioMeasure()
		 * @generated
		 */
		EClass SCRAP_RATIO_MEASURE = eINSTANCE.getScrapRatioMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ModularityMeasureImpl <em>Modularity Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ModularityMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getModularityMeasure()
		 * @generated
		 */
		EClass MODULARITY_MEASURE = eINSTANCE.getModularityMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ReworkRatioMeasureImpl <em>Rework Ratio Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ReworkRatioMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getReworkRatioMeasure()
		 * @generated
		 */
		EClass REWORK_RATIO_MEASURE = eINSTANCE.getReworkRatioMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.AdaptabilityRatioMeasureImpl <em>Adaptability Ratio Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.AdaptabilityRatioMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getAdaptabilityRatioMeasure()
		 * @generated
		 */
		EClass ADAPTABILITY_RATIO_MEASURE = eINSTANCE.getAdaptabilityRatioMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.MaturityRatioMeasureImpl <em>Maturity Ratio Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.MaturityRatioMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getMaturityRatioMeasure()
		 * @generated
		 */
		EClass MATURITY_RATIO_MEASURE = eINSTANCE.getMaturityRatioMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.MaintainabilityMeasureImpl <em>Maintainability Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.MaintainabilityMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getMaintainabilityMeasure()
		 * @generated
		 */
		EClass MAINTAINABILITY_MEASURE = eINSTANCE.getMaintainabilityMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.BrokenCaseSizeMeasureImpl <em>Broken Case Size Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.BrokenCaseSizeMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getBrokenCaseSizeMeasure()
		 * @generated
		 */
		EClass BROKEN_CASE_SIZE_MEASURE = eINSTANCE.getBrokenCaseSizeMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.FixedCaseSizeMeasureImpl <em>Fixed Case Size Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.FixedCaseSizeMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getFixedCaseSizeMeasure()
		 * @generated
		 */
		EClass FIXED_CASE_SIZE_MEASURE = eINSTANCE.getFixedCaseSizeMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.TotalCaseSizeMeasureImpl <em>Total Case Size Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.TotalCaseSizeMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getTotalCaseSizeMeasure()
		 * @generated
		 */
		EClass TOTAL_CASE_SIZE_MEASURE = eINSTANCE.getTotalCaseSizeMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.BaselineCaseSizeMeasureImpl <em>Baseline Case Size Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.BaselineCaseSizeMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getBaselineCaseSizeMeasure()
		 * @generated
		 */
		EClass BASELINE_CASE_SIZE_MEASURE = eINSTANCE.getBaselineCaseSizeMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.UsageTimeMeasureImpl <em>Usage Time Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.UsageTimeMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getUsageTimeMeasure()
		 * @generated
		 */
		EClass USAGE_TIME_MEASURE = eINSTANCE.getUsageTimeMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.RepairEffortMeasureImpl <em>Repair Effort Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.RepairEffortMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getRepairEffortMeasure()
		 * @generated
		 */
		EClass REPAIR_EFFORT_MEASURE = eINSTANCE.getRepairEffortMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.DevelopmentEffortMeasureImpl <em>Development Effort Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.DevelopmentEffortMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getDevelopmentEffortMeasure()
		 * @generated
		 */
		EClass DEVELOPMENT_EFFORT_MEASURE = eINSTANCE.getDevelopmentEffortMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.TotalChangeOrderCountImpl <em>Total Change Order Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.TotalChangeOrderCountImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getTotalChangeOrderCount()
		 * @generated
		 */
		EClass TOTAL_CHANGE_ORDER_COUNT = eINSTANCE.getTotalChangeOrderCount();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.CriticalAndNormalChangeOrderCountImpl <em>Critical And Normal Change Order Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.CriticalAndNormalChangeOrderCountImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getCriticalAndNormalChangeOrderCount()
		 * @generated
		 */
		EClass CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT = eINSTANCE.getCriticalAndNormalChangeOrderCount();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ReworkStabilityMeasureImpl <em>Rework Stability Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ReworkStabilityMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getReworkStabilityMeasure()
		 * @generated
		 */
		EClass REWORK_STABILITY_MEASURE = eINSTANCE.getReworkStabilityMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ReworkBacklogMeasureImpl <em>Rework Backlog Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ReworkBacklogMeasureImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getReworkBacklogMeasure()
		 * @generated
		 */
		EClass REWORK_BACKLOG_MEASURE = eINSTANCE.getReworkBacklogMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.ModularityTrendImpl <em>Modularity Trend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.ModularityTrendImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getModularityTrend()
		 * @generated
		 */
		EClass MODULARITY_TREND = eINSTANCE.getModularityTrend();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.AdaptabilityTrendImpl <em>Adaptability Trend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.AdaptabilityTrendImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getAdaptabilityTrend()
		 * @generated
		 */
		EClass ADAPTABILITY_TREND = eINSTANCE.getAdaptabilityTrend();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.spm.impl.MaturityTrendImpl <em>Maturity Trend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.spm.impl.MaturityTrendImpl
		 * @see net.certware.measurement.spm.impl.SpmPackageImpl#getMaturityTrend()
		 * @generated
		 */
		EClass MATURITY_TREND = eINSTANCE.getMaturityTrend();

	}

} //SpmPackage
