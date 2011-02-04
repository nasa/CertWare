/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.certware.measurement.smm.SmmFactory
 * @model kind="package"
 * @generated
 */
public interface SmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "smm"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/MoDisco/smm"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "smm"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SmmPackage eINSTANCE = net.certware.measurement.smm.impl.SmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.SmmElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.SmmElementImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getSmmElement()
	 * @generated
	 */
	int SMM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT__ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.SmmModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.SmmModelImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getSmmModel()
	 * @generated
	 */
	int SMM_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL__MODEL_ELEMENT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_MODEL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.SmmRelationship <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.SmmRelationship
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getSmmRelationship()
	 * @generated
	 */
	int SMM_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMM_RELATIONSHIP_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.CategoryRelationshipImpl <em>Category Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.CategoryRelationshipImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCategoryRelationship()
	 * @generated
	 */
	int CATEGORY_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__MODEL = SMM_RELATIONSHIP__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__ATTRIBUTE = SMM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__ANNOTATION = SMM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__NAME = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__FROM = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP__TO = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Category Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.CategoryImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_ELEMENT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__OUT_CATEGORY = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IN_CATEGORY = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_MEASURE = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.MeasureImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__CATEGORY = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__LIBRARY = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__NAME = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__EQUIVALENT_FROM = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__EQUIVALENT_TO = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REFINEMENT = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__MEASUREMENT = SMM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__OUT_MEASURE = SMM_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__IN_MEASURE = SMM_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TRAIT = SMM_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SCOPE = SMM_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.MeasurementImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 6;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__MEASURE = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__OBSERVATION = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__ERROR = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__OUT_MEASUREMENT = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__IN_MEASUREMENT = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.ObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.ObservationImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getObservation()
	 * @generated
	 */
	int OBSERVATION = 7;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Observer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__OBSERVER = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__TOOL = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>When Observed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION__WHEN_OBSERVED = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVATION_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.MeasureRelationshipImpl <em>Measure Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.MeasureRelationshipImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getMeasureRelationship()
	 * @generated
	 */
	int MEASURE_RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__MODEL = SMM_RELATIONSHIP__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__ATTRIBUTE = SMM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__ANNOTATION = SMM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__FROM = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP__TO = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measure Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.DimensionalMeasureImpl <em>Dimensional Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.DimensionalMeasureImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDimensionalMeasure()
	 * @generated
	 */
	int DIMENSIONAL_MEASURE = 9;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__MODEL = MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__ATTRIBUTE = MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__ANNOTATION = MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__CATEGORY = MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__LIBRARY = MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__EQUIVALENT_FROM = MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__EQUIVALENT_TO = MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__REFINEMENT = MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__MEASUREMENT = MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__OUT_MEASURE = MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__IN_MEASURE = MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__TRAIT = MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__SCOPE = MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE__UNIT = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimensional Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASURE_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.RankingImpl <em>Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.RankingImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getRanking()
	 * @generated
	 */
	int RANKING = 10;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__MODEL = MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__ATTRIBUTE = MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__ANNOTATION = MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__CATEGORY = MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__LIBRARY = MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__NAME = MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__EQUIVALENT_FROM = MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__EQUIVALENT_TO = MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__REFINEMENT = MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__MEASUREMENT = MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__OUT_MEASURE = MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__IN_MEASURE = MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__TRAIT = MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__SCOPE = MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__INTERVAL = MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FEATURE_COUNT = MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.RankingIntervalImpl <em>Ranking Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.RankingIntervalImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getRankingInterval()
	 * @generated
	 */
	int RANKING_INTERVAL = 11;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__RANK = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MAXIMUM_ENDPOINT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MAXIMUM_OPEN = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum Endpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MINIMUM_ENDPOINT = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minimum Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__MINIMUM_OPEN = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL__SYMBOL = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ranking Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_INTERVAL_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.CharacteristicImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 12;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__NAME = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__PARENT = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Characteristics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__CHARACTERISTICS = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.ScopeImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 13;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__CLASS = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enumerated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__ENUMERATED = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__NAME = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__MEASURES = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recognizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__RECOGNIZER = SMM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.BinaryMeasureImpl <em>Binary Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.BinaryMeasureImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getBinaryMeasure()
	 * @generated
	 */
	int BINARY_MEASURE = 14;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__MODEL = DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__OUT_MEASURE = DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__IN_MEASURE = DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__FUNCTOR = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE1 = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE__BASE_MEASURE2 = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.DirectMeasureImpl <em>Direct Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.DirectMeasureImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDirectMeasure()
	 * @generated
	 */
	int DIRECT_MEASURE = 15;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__MODEL = DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__OUT_MEASURE = DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__IN_MEASURE = DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE__OPERATION = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Direct Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.CollectiveMeasureImpl <em>Collective Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.CollectiveMeasureImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCollectiveMeasure()
	 * @generated
	 */
	int COLLECTIVE_MEASURE = 16;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__MODEL = DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__OUT_MEASURE = DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__IN_MEASURE = DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Base Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__BASE_MEASURE = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE__ACCUMULATOR = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collective Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.NamedMeasureImpl <em>Named Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.NamedMeasureImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getNamedMeasure()
	 * @generated
	 */
	int NAMED_MEASURE = 17;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__MODEL = DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__OUT_MEASURE = DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__IN_MEASURE = DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The number of structural features of the '<em>Named Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.RescaledMeasureImpl <em>Rescaled Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.RescaledMeasureImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getRescaledMeasure()
	 * @generated
	 */
	int RESCALED_MEASURE = 18;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__MODEL = DIMENSIONAL_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__ATTRIBUTE = DIMENSIONAL_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__ANNOTATION = DIMENSIONAL_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__CATEGORY = DIMENSIONAL_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__LIBRARY = DIMENSIONAL_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__NAME = DIMENSIONAL_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__EQUIVALENT_FROM = DIMENSIONAL_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__EQUIVALENT_TO = DIMENSIONAL_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__REFINEMENT = DIMENSIONAL_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__MEASUREMENT = DIMENSIONAL_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__OUT_MEASURE = DIMENSIONAL_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__IN_MEASURE = DIMENSIONAL_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__TRAIT = DIMENSIONAL_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__SCOPE = DIMENSIONAL_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__UNIT = DIMENSIONAL_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE__FORMULA = DIMENSIONAL_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rescaled Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESCALED_MEASURE_FEATURE_COUNT = DIMENSIONAL_MEASURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.RatioMeasureImpl <em>Ratio Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.RatioMeasureImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getRatioMeasure()
	 * @generated
	 */
	int RATIO_MEASURE = 19;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__MODEL = BINARY_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__ATTRIBUTE = BINARY_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__ANNOTATION = BINARY_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__CATEGORY = BINARY_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__LIBRARY = BINARY_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__NAME = BINARY_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__EQUIVALENT_FROM = BINARY_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__EQUIVALENT_TO = BINARY_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__REFINEMENT = BINARY_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__MEASUREMENT = BINARY_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__OUT_MEASURE = BINARY_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__IN_MEASURE = BINARY_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__TRAIT = BINARY_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__SCOPE = BINARY_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__UNIT = BINARY_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Functor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__FUNCTOR = BINARY_MEASURE__FUNCTOR;

	/**
	 * The feature id for the '<em><b>Base Measure1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE1 = BINARY_MEASURE__BASE_MEASURE1;

	/**
	 * The feature id for the '<em><b>Base Measure2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE__BASE_MEASURE2 = BINARY_MEASURE__BASE_MEASURE2;

	/**
	 * The number of structural features of the '<em>Ratio Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIO_MEASURE_FEATURE_COUNT = BINARY_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.CountingImpl <em>Counting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.CountingImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCounting()
	 * @generated
	 */
	int COUNTING = 20;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__MODEL = DIRECT_MEASURE__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__ATTRIBUTE = DIRECT_MEASURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__ANNOTATION = DIRECT_MEASURE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__CATEGORY = DIRECT_MEASURE__CATEGORY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__LIBRARY = DIRECT_MEASURE__LIBRARY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__NAME = DIRECT_MEASURE__NAME;

	/**
	 * The feature id for the '<em><b>Equivalent From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__EQUIVALENT_FROM = DIRECT_MEASURE__EQUIVALENT_FROM;

	/**
	 * The feature id for the '<em><b>Equivalent To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__EQUIVALENT_TO = DIRECT_MEASURE__EQUIVALENT_TO;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__REFINEMENT = DIRECT_MEASURE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>Measurement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__MEASUREMENT = DIRECT_MEASURE__MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Out Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__OUT_MEASURE = DIRECT_MEASURE__OUT_MEASURE;

	/**
	 * The feature id for the '<em><b>In Measure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__IN_MEASURE = DIRECT_MEASURE__IN_MEASURE;

	/**
	 * The feature id for the '<em><b>Trait</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__TRAIT = DIRECT_MEASURE__TRAIT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__SCOPE = DIRECT_MEASURE__SCOPE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__UNIT = DIRECT_MEASURE__UNIT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING__OPERATION = DIRECT_MEASURE__OPERATION;

	/**
	 * The number of structural features of the '<em>Counting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTING_FEATURE_COUNT = DIRECT_MEASURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.DimensionalMeasurementImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDimensionalMeasurement()
	 * @generated
	 */
	int DIMENSIONAL_MEASUREMENT = 21;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MODEL = MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ATTRIBUTE = MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ANNOTATION = MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__MEASURE = MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__OBSERVATION = MEASUREMENT__OBSERVATION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__ERROR = MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__OUT_MEASUREMENT = MEASUREMENT__OUT_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__IN_MEASUREMENT = MEASUREMENT__IN_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT__VALUE = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dimensional Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONAL_MEASUREMENT_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.GradeImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 22;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MODEL = MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ATTRIBUTE = MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ANNOTATION = MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MEASURE = MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__OBSERVATION = MEASUREMENT__OBSERVATION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ERROR = MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__OUT_MEASUREMENT = MEASUREMENT__OUT_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__IN_MEASUREMENT = MEASUREMENT__IN_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Base Measurement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__BASE_MEASUREMENT = MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__IS_BASE_SUPPLIED = MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__VALUE = MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.MeasurementRelationshipImpl <em>Measurement Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.MeasurementRelationshipImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getMeasurementRelationship()
	 * @generated
	 */
	int MEASUREMENT_RELATIONSHIP = 23;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__MODEL = SMM_RELATIONSHIP__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__ATTRIBUTE = SMM_RELATIONSHIP__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__ANNOTATION = SMM_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__NAME = SMM_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__FROM = SMM_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP__TO = SMM_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Measurement Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_RELATIONSHIP_FEATURE_COUNT = SMM_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.DirectMeasurementImpl <em>Direct Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.DirectMeasurementImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDirectMeasurement()
	 * @generated
	 */
	int DIRECT_MEASUREMENT = 24;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__MODEL = DIMENSIONAL_MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__OUT_MEASUREMENT = DIMENSIONAL_MEASUREMENT__OUT_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__IN_MEASUREMENT = DIMENSIONAL_MEASUREMENT__IN_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Direct Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.CountImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 25;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__MODEL = DIRECT_MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ATTRIBUTE = DIRECT_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ANNOTATION = DIRECT_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__MEASURE = DIRECT_MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__OBSERVATION = DIRECT_MEASUREMENT__OBSERVATION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__ERROR = DIRECT_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__OUT_MEASUREMENT = DIRECT_MEASUREMENT__OUT_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__IN_MEASUREMENT = DIRECT_MEASUREMENT__IN_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__VALUE = DIRECT_MEASUREMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = DIRECT_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.CollectiveMeasurementImpl <em>Collective Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.CollectiveMeasurementImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCollectiveMeasurement()
	 * @generated
	 */
	int COLLECTIVE_MEASUREMENT = 26;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__MODEL = DIMENSIONAL_MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__OUT_MEASUREMENT = DIMENSIONAL_MEASUREMENT__OUT_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__IN_MEASUREMENT = DIMENSIONAL_MEASUREMENT__IN_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Accumulator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__ACCUMULATOR = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Collective Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTIVE_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.AggregatedMeasurementImpl <em>Aggregated Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.AggregatedMeasurementImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getAggregatedMeasurement()
	 * @generated
	 */
	int AGGREGATED_MEASUREMENT = 27;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__MODEL = DIMENSIONAL_MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__OUT_MEASUREMENT = DIMENSIONAL_MEASUREMENT__OUT_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__IN_MEASUREMENT = DIMENSIONAL_MEASUREMENT__IN_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Is Base Suppled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT__BASE_MEASUREMENT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Aggregated Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.NamedMeasurementImpl <em>Named Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.NamedMeasurementImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getNamedMeasurement()
	 * @generated
	 */
	int NAMED_MEASUREMENT = 28;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__MODEL = DIMENSIONAL_MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__OUT_MEASUREMENT = DIMENSIONAL_MEASUREMENT__OUT_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__IN_MEASUREMENT = DIMENSIONAL_MEASUREMENT__IN_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The number of structural features of the '<em>Named Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.ReScaledMeasurementImpl <em>Re Scaled Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.ReScaledMeasurementImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getReScaledMeasurement()
	 * @generated
	 */
	int RE_SCALED_MEASUREMENT = 29;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__MODEL = DIMENSIONAL_MEASUREMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__ATTRIBUTE = DIMENSIONAL_MEASUREMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__ANNOTATION = DIMENSIONAL_MEASUREMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__MEASURE = DIMENSIONAL_MEASUREMENT__MEASURE;

	/**
	 * The feature id for the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__OBSERVATION = DIMENSIONAL_MEASUREMENT__OBSERVATION;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__ERROR = DIMENSIONAL_MEASUREMENT__ERROR;

	/**
	 * The feature id for the '<em><b>Out Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__OUT_MEASUREMENT = DIMENSIONAL_MEASUREMENT__OUT_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>In Measurement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__IN_MEASUREMENT = DIMENSIONAL_MEASUREMENT__IN_MEASUREMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__VALUE = DIMENSIONAL_MEASUREMENT__VALUE;

	/**
	 * The feature id for the '<em><b>Is Base Supplied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT__IS_BASE_SUPPLIED = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Re Scaled Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RE_SCALED_MEASUREMENT_FEATURE_COUNT = DIMENSIONAL_MEASUREMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.AttributeImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 30;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TAG = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.impl.AnnotationImpl
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 31;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__MODEL = SMM_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ATTRIBUTE = SMM_ELEMENT__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION = SMM_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TEXT = SMM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__OWNER = SMM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = SMM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.measurement.smm.Accumulator <em>Accumulator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.smm.Accumulator
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getAccumulator()
	 * @generated
	 */
	int ACCUMULATOR = 32;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 33;

	/**
	 * The meta object id for the '<em>Timestamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.sql.Timestamp
	 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getTimestamp()
	 * @generated
	 */
	int TIMESTAMP = 34;


	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.SmmElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.certware.measurement.smm.SmmElement
	 * @generated
	 */
	EClass getSmmElement();

	/**
	 * Returns the meta object for the container reference '{@link net.certware.measurement.smm.SmmElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see net.certware.measurement.smm.SmmElement#getModel()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.smm.SmmElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see net.certware.measurement.smm.SmmElement#getAttribute()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.smm.SmmElement#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.measurement.smm.SmmElement#getAnnotation()
	 * @see #getSmmElement()
	 * @generated
	 */
	EReference getSmmElement_Annotation();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.SmmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see net.certware.measurement.smm.SmmModel
	 * @generated
	 */
	EClass getSmmModel();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.smm.SmmModel#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Element</em>'.
	 * @see net.certware.measurement.smm.SmmModel#getModelElement()
	 * @see #getSmmModel()
	 * @generated
	 */
	EReference getSmmModel_ModelElement();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.SmmRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see net.certware.measurement.smm.SmmRelationship
	 * @generated
	 */
	EClass getSmmRelationship();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.CategoryRelationship <em>Category Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Relationship</em>'.
	 * @see net.certware.measurement.smm.CategoryRelationship
	 * @generated
	 */
	EClass getCategoryRelationship();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.CategoryRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.measurement.smm.CategoryRelationship#getName()
	 * @see #getCategoryRelationship()
	 * @generated
	 */
	EAttribute getCategoryRelationship_Name();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.CategoryRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see net.certware.measurement.smm.CategoryRelationship#getFrom()
	 * @see #getCategoryRelationship()
	 * @generated
	 */
	EReference getCategoryRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.CategoryRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see net.certware.measurement.smm.CategoryRelationship#getTo()
	 * @see #getCategoryRelationship()
	 * @generated
	 */
	EReference getCategoryRelationship_To();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see net.certware.measurement.smm.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.measurement.smm.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Category#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see net.certware.measurement.smm.Category#getCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Category();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Category#getCategoryElement <em>Category Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category Element</em>'.
	 * @see net.certware.measurement.smm.Category#getCategoryElement()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_CategoryElement();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Category#getOutCategory <em>Out Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Category</em>'.
	 * @see net.certware.measurement.smm.Category#getOutCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_OutCategory();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Category#getInCategory <em>In Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Category</em>'.
	 * @see net.certware.measurement.smm.Category#getInCategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_InCategory();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Category#getCategoryMeasure <em>Category Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category Measure</em>'.
	 * @see net.certware.measurement.smm.Category#getCategoryMeasure()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_CategoryMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see net.certware.measurement.smm.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Measure#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see net.certware.measurement.smm.Measure#getCategory()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Category();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Measure#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see net.certware.measurement.smm.Measure#getLibrary()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Library();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Measure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.measurement.smm.Measure#getName()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Measure#getEquivalentFrom <em>Equivalent From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent From</em>'.
	 * @see net.certware.measurement.smm.Measure#getEquivalentFrom()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_EquivalentFrom();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Measure#getEquivalentTo <em>Equivalent To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Equivalent To</em>'.
	 * @see net.certware.measurement.smm.Measure#getEquivalentTo()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_EquivalentTo();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Measure#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Refinement</em>'.
	 * @see net.certware.measurement.smm.Measure#getRefinement()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Refinement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.smm.Measure#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement</em>'.
	 * @see net.certware.measurement.smm.Measure#getMeasurement()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Measurement();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Measure#getOutMeasure <em>Out Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Measure</em>'.
	 * @see net.certware.measurement.smm.Measure#getOutMeasure()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_OutMeasure();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.smm.Measure#getInMeasure <em>In Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Measure</em>'.
	 * @see net.certware.measurement.smm.Measure#getInMeasure()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_InMeasure();

	/**
	 * Returns the meta object for the container reference '{@link net.certware.measurement.smm.Measure#getTrait <em>Trait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Trait</em>'.
	 * @see net.certware.measurement.smm.Measure#getTrait()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Trait();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.Measure#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see net.certware.measurement.smm.Measure#getScope()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Scope();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see net.certware.measurement.smm.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the container reference '{@link net.certware.measurement.smm.Measurement#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Measure</em>'.
	 * @see net.certware.measurement.smm.Measurement#getMeasure()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Measure();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.measurement.smm.Measurement#getObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Observation</em>'.
	 * @see net.certware.measurement.smm.Measurement#getObservation()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_Observation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Measurement#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see net.certware.measurement.smm.Measurement#getError()
	 * @see #getMeasurement()
	 * @generated
	 */
	EAttribute getMeasurement_Error();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Measurement#getOutMeasurement <em>Out Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Out Measurement</em>'.
	 * @see net.certware.measurement.smm.Measurement#getOutMeasurement()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_OutMeasurement();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Measurement#getInMeasurement <em>In Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Measurement</em>'.
	 * @see net.certware.measurement.smm.Measurement#getInMeasurement()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_InMeasurement();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see net.certware.measurement.smm.Observation
	 * @generated
	 */
	EClass getObservation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Observation#getObserver <em>Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observer</em>'.
	 * @see net.certware.measurement.smm.Observation#getObserver()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Observer();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Observation#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see net.certware.measurement.smm.Observation#getTool()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_Tool();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Observation#getWhenObserved <em>When Observed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When Observed</em>'.
	 * @see net.certware.measurement.smm.Observation#getWhenObserved()
	 * @see #getObservation()
	 * @generated
	 */
	EAttribute getObservation_WhenObserved();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.MeasureRelationship <em>Measure Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Relationship</em>'.
	 * @see net.certware.measurement.smm.MeasureRelationship
	 * @generated
	 */
	EClass getMeasureRelationship();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.MeasureRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see net.certware.measurement.smm.MeasureRelationship#getFrom()
	 * @see #getMeasureRelationship()
	 * @generated
	 */
	EReference getMeasureRelationship_From();

	/**
	 * Returns the meta object for the container reference '{@link net.certware.measurement.smm.MeasureRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>To</em>'.
	 * @see net.certware.measurement.smm.MeasureRelationship#getTo()
	 * @see #getMeasureRelationship()
	 * @generated
	 */
	EReference getMeasureRelationship_To();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.DimensionalMeasure <em>Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional Measure</em>'.
	 * @see net.certware.measurement.smm.DimensionalMeasure
	 * @generated
	 */
	EClass getDimensionalMeasure();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.DimensionalMeasure#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.certware.measurement.smm.DimensionalMeasure#getUnit()
	 * @see #getDimensionalMeasure()
	 * @generated
	 */
	EAttribute getDimensionalMeasure_Unit();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking</em>'.
	 * @see net.certware.measurement.smm.Ranking
	 * @generated
	 */
	EClass getRanking();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.smm.Ranking#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interval</em>'.
	 * @see net.certware.measurement.smm.Ranking#getInterval()
	 * @see #getRanking()
	 * @generated
	 */
	EReference getRanking_Interval();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.RankingInterval <em>Ranking Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking Interval</em>'.
	 * @see net.certware.measurement.smm.RankingInterval
	 * @generated
	 */
	EClass getRankingInterval();

	/**
	 * Returns the meta object for the container reference '{@link net.certware.measurement.smm.RankingInterval#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rank</em>'.
	 * @see net.certware.measurement.smm.RankingInterval#getRank()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EReference getRankingInterval_Rank();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.RankingInterval#getMaximumEndpoint <em>Maximum Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Endpoint</em>'.
	 * @see net.certware.measurement.smm.RankingInterval#getMaximumEndpoint()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MaximumEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.RankingInterval#isMaximumOpen <em>Maximum Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Open</em>'.
	 * @see net.certware.measurement.smm.RankingInterval#isMaximumOpen()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MaximumOpen();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.RankingInterval#getMinimumEndpoint <em>Minimum Endpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Endpoint</em>'.
	 * @see net.certware.measurement.smm.RankingInterval#getMinimumEndpoint()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MinimumEndpoint();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.RankingInterval#isMinimumOpen <em>Minimum Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Open</em>'.
	 * @see net.certware.measurement.smm.RankingInterval#isMinimumOpen()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_MinimumOpen();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.RankingInterval#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see net.certware.measurement.smm.RankingInterval#getSymbol()
	 * @see #getRankingInterval()
	 * @generated
	 */
	EAttribute getRankingInterval_Symbol();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see net.certware.measurement.smm.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Characteristic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.measurement.smm.Characteristic#getName()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Name();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.Characteristic#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see net.certware.measurement.smm.Characteristic#getParent()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.measurement.smm.Characteristic#getCharacteristics <em>Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristics</em>'.
	 * @see net.certware.measurement.smm.Characteristic#getCharacteristics()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EReference getCharacteristic_Characteristics();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see net.certware.measurement.smm.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Scope#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.certware.measurement.smm.Scope#getClass_()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Class();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Scope#isEnumerated <em>Enumerated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enumerated</em>'.
	 * @see net.certware.measurement.smm.Scope#isEnumerated()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Enumerated();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Scope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.measurement.smm.Scope#getName()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.Scope#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measures</em>'.
	 * @see net.certware.measurement.smm.Scope#getMeasures()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Measures();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Scope#getRecognizer <em>Recognizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recognizer</em>'.
	 * @see net.certware.measurement.smm.Scope#getRecognizer()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_Recognizer();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.BinaryMeasure <em>Binary Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Measure</em>'.
	 * @see net.certware.measurement.smm.BinaryMeasure
	 * @generated
	 */
	EClass getBinaryMeasure();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.BinaryMeasure#getFunctor <em>Functor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functor</em>'.
	 * @see net.certware.measurement.smm.BinaryMeasure#getFunctor()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EAttribute getBinaryMeasure_Functor();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.BinaryMeasure#getBaseMeasure1 <em>Base Measure1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measure1</em>'.
	 * @see net.certware.measurement.smm.BinaryMeasure#getBaseMeasure1()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EReference getBinaryMeasure_BaseMeasure1();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.BinaryMeasure#getBaseMeasure2 <em>Base Measure2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measure2</em>'.
	 * @see net.certware.measurement.smm.BinaryMeasure#getBaseMeasure2()
	 * @see #getBinaryMeasure()
	 * @generated
	 */
	EReference getBinaryMeasure_BaseMeasure2();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.DirectMeasure <em>Direct Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Measure</em>'.
	 * @see net.certware.measurement.smm.DirectMeasure
	 * @generated
	 */
	EClass getDirectMeasure();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.DirectMeasure#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see net.certware.measurement.smm.DirectMeasure#getOperation()
	 * @see #getDirectMeasure()
	 * @generated
	 */
	EAttribute getDirectMeasure_Operation();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.CollectiveMeasure <em>Collective Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective Measure</em>'.
	 * @see net.certware.measurement.smm.CollectiveMeasure
	 * @generated
	 */
	EClass getCollectiveMeasure();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.CollectiveMeasure#getBaseMeasure <em>Base Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measure</em>'.
	 * @see net.certware.measurement.smm.CollectiveMeasure#getBaseMeasure()
	 * @see #getCollectiveMeasure()
	 * @generated
	 */
	EReference getCollectiveMeasure_BaseMeasure();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.CollectiveMeasure#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulator</em>'.
	 * @see net.certware.measurement.smm.CollectiveMeasure#getAccumulator()
	 * @see #getCollectiveMeasure()
	 * @generated
	 */
	EAttribute getCollectiveMeasure_Accumulator();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.NamedMeasure <em>Named Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Measure</em>'.
	 * @see net.certware.measurement.smm.NamedMeasure
	 * @generated
	 */
	EClass getNamedMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.RescaledMeasure <em>Rescaled Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rescaled Measure</em>'.
	 * @see net.certware.measurement.smm.RescaledMeasure
	 * @generated
	 */
	EClass getRescaledMeasure();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.RescaledMeasure#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formula</em>'.
	 * @see net.certware.measurement.smm.RescaledMeasure#getFormula()
	 * @see #getRescaledMeasure()
	 * @generated
	 */
	EAttribute getRescaledMeasure_Formula();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.RatioMeasure <em>Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ratio Measure</em>'.
	 * @see net.certware.measurement.smm.RatioMeasure
	 * @generated
	 */
	EClass getRatioMeasure();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Counting <em>Counting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counting</em>'.
	 * @see net.certware.measurement.smm.Counting
	 * @generated
	 */
	EClass getCounting();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.DimensionalMeasurement <em>Dimensional Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensional Measurement</em>'.
	 * @see net.certware.measurement.smm.DimensionalMeasurement
	 * @generated
	 */
	EClass getDimensionalMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.DimensionalMeasurement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.measurement.smm.DimensionalMeasurement#getValue()
	 * @see #getDimensionalMeasurement()
	 * @generated
	 */
	EAttribute getDimensionalMeasurement_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see net.certware.measurement.smm.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.Grade#getBaseMeasurement <em>Base Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Measurement</em>'.
	 * @see net.certware.measurement.smm.Grade#getBaseMeasurement()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_BaseMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Grade#isIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see net.certware.measurement.smm.Grade#isIsBaseSupplied()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_IsBaseSupplied();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Grade#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.measurement.smm.Grade#getValue()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.MeasurementRelationship <em>Measurement Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement Relationship</em>'.
	 * @see net.certware.measurement.smm.MeasurementRelationship
	 * @generated
	 */
	EClass getMeasurementRelationship();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.MeasurementRelationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.measurement.smm.MeasurementRelationship#getName()
	 * @see #getMeasurementRelationship()
	 * @generated
	 */
	EAttribute getMeasurementRelationship_Name();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.MeasurementRelationship#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see net.certware.measurement.smm.MeasurementRelationship#getFrom()
	 * @see #getMeasurementRelationship()
	 * @generated
	 */
	EReference getMeasurementRelationship_From();

	/**
	 * Returns the meta object for the reference '{@link net.certware.measurement.smm.MeasurementRelationship#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see net.certware.measurement.smm.MeasurementRelationship#getTo()
	 * @see #getMeasurementRelationship()
	 * @generated
	 */
	EReference getMeasurementRelationship_To();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.DirectMeasurement <em>Direct Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Measurement</em>'.
	 * @see net.certware.measurement.smm.DirectMeasurement
	 * @generated
	 */
	EClass getDirectMeasurement();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see net.certware.measurement.smm.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.CollectiveMeasurement <em>Collective Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collective Measurement</em>'.
	 * @see net.certware.measurement.smm.CollectiveMeasurement
	 * @generated
	 */
	EClass getCollectiveMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.CollectiveMeasurement#getAccumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accumulator</em>'.
	 * @see net.certware.measurement.smm.CollectiveMeasurement#getAccumulator()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EAttribute getCollectiveMeasurement_Accumulator();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.CollectiveMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see net.certware.measurement.smm.CollectiveMeasurement#isIsBaseSupplied()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EAttribute getCollectiveMeasurement_IsBaseSupplied();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.CollectiveMeasurement#getBaseMeasurement <em>Base Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement</em>'.
	 * @see net.certware.measurement.smm.CollectiveMeasurement#getBaseMeasurement()
	 * @see #getCollectiveMeasurement()
	 * @generated
	 */
	EReference getCollectiveMeasurement_BaseMeasurement();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.AggregatedMeasurement <em>Aggregated Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Measurement</em>'.
	 * @see net.certware.measurement.smm.AggregatedMeasurement
	 * @generated
	 */
	EClass getAggregatedMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.AggregatedMeasurement#isIsBaseSuppled <em>Is Base Suppled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Suppled</em>'.
	 * @see net.certware.measurement.smm.AggregatedMeasurement#isIsBaseSuppled()
	 * @see #getAggregatedMeasurement()
	 * @generated
	 */
	EAttribute getAggregatedMeasurement_IsBaseSuppled();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.measurement.smm.AggregatedMeasurement#getBaseMeasurement <em>Base Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Measurement</em>'.
	 * @see net.certware.measurement.smm.AggregatedMeasurement#getBaseMeasurement()
	 * @see #getAggregatedMeasurement()
	 * @generated
	 */
	EReference getAggregatedMeasurement_BaseMeasurement();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.NamedMeasurement <em>Named Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Measurement</em>'.
	 * @see net.certware.measurement.smm.NamedMeasurement
	 * @generated
	 */
	EClass getNamedMeasurement();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.ReScaledMeasurement <em>Re Scaled Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Re Scaled Measurement</em>'.
	 * @see net.certware.measurement.smm.ReScaledMeasurement
	 * @generated
	 */
	EClass getReScaledMeasurement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.ReScaledMeasurement#isIsBaseSupplied <em>Is Base Supplied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Base Supplied</em>'.
	 * @see net.certware.measurement.smm.ReScaledMeasurement#isIsBaseSupplied()
	 * @see #getReScaledMeasurement()
	 * @generated
	 */
	EAttribute getReScaledMeasurement_IsBaseSupplied();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see net.certware.measurement.smm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Attribute#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see net.certware.measurement.smm.Attribute#getTag()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Tag();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.measurement.smm.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the container reference '{@link net.certware.measurement.smm.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see net.certware.measurement.smm.Attribute#getOwner()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Owner();

	/**
	 * Returns the meta object for class '{@link net.certware.measurement.smm.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see net.certware.measurement.smm.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.measurement.smm.Annotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.certware.measurement.smm.Annotation#getText()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Text();

	/**
	 * Returns the meta object for the container reference '{@link net.certware.measurement.smm.Annotation#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see net.certware.measurement.smm.Annotation#getOwner()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Owner();

	/**
	 * Returns the meta object for enum '{@link net.certware.measurement.smm.Accumulator <em>Accumulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accumulator</em>'.
	 * @see net.certware.measurement.smm.Accumulator
	 * @generated
	 */
	EEnum getAccumulator();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.sql.Timestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timestamp</em>'.
	 * @see java.sql.Timestamp
	 * @model instanceClass="java.sql.Timestamp"
	 * @generated
	 */
	EDataType getTimestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SmmFactory getSmmFactory();

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
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.SmmElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.SmmElementImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getSmmElement()
		 * @generated
		 */
		EClass SMM_ELEMENT = eINSTANCE.getSmmElement();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__MODEL = eINSTANCE.getSmmElement_Model();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__ATTRIBUTE = eINSTANCE.getSmmElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_ELEMENT__ANNOTATION = eINSTANCE.getSmmElement_Annotation();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.SmmModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.SmmModelImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getSmmModel()
		 * @generated
		 */
		EClass SMM_MODEL = eINSTANCE.getSmmModel();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SMM_MODEL__MODEL_ELEMENT = eINSTANCE.getSmmModel_ModelElement();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.SmmRelationship <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.SmmRelationship
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getSmmRelationship()
		 * @generated
		 */
		EClass SMM_RELATIONSHIP = eINSTANCE.getSmmRelationship();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.CategoryRelationshipImpl <em>Category Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.CategoryRelationshipImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCategoryRelationship()
		 * @generated
		 */
		EClass CATEGORY_RELATIONSHIP = eINSTANCE.getCategoryRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_RELATIONSHIP__NAME = eINSTANCE.getCategoryRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_RELATIONSHIP__FROM = eINSTANCE.getCategoryRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY_RELATIONSHIP__TO = eINSTANCE.getCategoryRelationship_To();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.CategoryImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORY = eINSTANCE.getCategory_Category();

		/**
		 * The meta object literal for the '<em><b>Category Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORY_ELEMENT = eINSTANCE.getCategory_CategoryElement();

		/**
		 * The meta object literal for the '<em><b>Out Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__OUT_CATEGORY = eINSTANCE.getCategory_OutCategory();

		/**
		 * The meta object literal for the '<em><b>In Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__IN_CATEGORY = eINSTANCE.getCategory_InCategory();

		/**
		 * The meta object literal for the '<em><b>Category Measure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CATEGORY_MEASURE = eINSTANCE.getCategory_CategoryMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.MeasureImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__CATEGORY = eINSTANCE.getMeasure_Category();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__LIBRARY = eINSTANCE.getMeasure_Library();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__NAME = eINSTANCE.getMeasure_Name();

		/**
		 * The meta object literal for the '<em><b>Equivalent From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__EQUIVALENT_FROM = eINSTANCE.getMeasure_EquivalentFrom();

		/**
		 * The meta object literal for the '<em><b>Equivalent To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__EQUIVALENT_TO = eINSTANCE.getMeasure_EquivalentTo();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__REFINEMENT = eINSTANCE.getMeasure_Refinement();

		/**
		 * The meta object literal for the '<em><b>Measurement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__MEASUREMENT = eINSTANCE.getMeasure_Measurement();

		/**
		 * The meta object literal for the '<em><b>Out Measure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__OUT_MEASURE = eINSTANCE.getMeasure_OutMeasure();

		/**
		 * The meta object literal for the '<em><b>In Measure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__IN_MEASURE = eINSTANCE.getMeasure_InMeasure();

		/**
		 * The meta object literal for the '<em><b>Trait</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__TRAIT = eINSTANCE.getMeasure_Trait();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__SCOPE = eINSTANCE.getMeasure_Scope();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.MeasurementImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__MEASURE = eINSTANCE.getMeasurement_Measure();

		/**
		 * The meta object literal for the '<em><b>Observation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__OBSERVATION = eINSTANCE.getMeasurement_Observation();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT__ERROR = eINSTANCE.getMeasurement_Error();

		/**
		 * The meta object literal for the '<em><b>Out Measurement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__OUT_MEASUREMENT = eINSTANCE.getMeasurement_OutMeasurement();

		/**
		 * The meta object literal for the '<em><b>In Measurement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__IN_MEASUREMENT = eINSTANCE.getMeasurement_InMeasurement();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.ObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.ObservationImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getObservation()
		 * @generated
		 */
		EClass OBSERVATION = eINSTANCE.getObservation();

		/**
		 * The meta object literal for the '<em><b>Observer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__OBSERVER = eINSTANCE.getObservation_Observer();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__TOOL = eINSTANCE.getObservation_Tool();

		/**
		 * The meta object literal for the '<em><b>When Observed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSERVATION__WHEN_OBSERVED = eINSTANCE.getObservation_WhenObserved();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.MeasureRelationshipImpl <em>Measure Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.MeasureRelationshipImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getMeasureRelationship()
		 * @generated
		 */
		EClass MEASURE_RELATIONSHIP = eINSTANCE.getMeasureRelationship();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_RELATIONSHIP__FROM = eINSTANCE.getMeasureRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_RELATIONSHIP__TO = eINSTANCE.getMeasureRelationship_To();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.DimensionalMeasureImpl <em>Dimensional Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.DimensionalMeasureImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDimensionalMeasure()
		 * @generated
		 */
		EClass DIMENSIONAL_MEASURE = eINSTANCE.getDimensionalMeasure();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONAL_MEASURE__UNIT = eINSTANCE.getDimensionalMeasure_Unit();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.RankingImpl <em>Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.RankingImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getRanking()
		 * @generated
		 */
		EClass RANKING = eINSTANCE.getRanking();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING__INTERVAL = eINSTANCE.getRanking_Interval();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.RankingIntervalImpl <em>Ranking Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.RankingIntervalImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getRankingInterval()
		 * @generated
		 */
		EClass RANKING_INTERVAL = eINSTANCE.getRankingInterval();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANKING_INTERVAL__RANK = eINSTANCE.getRankingInterval_Rank();

		/**
		 * The meta object literal for the '<em><b>Maximum Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MAXIMUM_ENDPOINT = eINSTANCE.getRankingInterval_MaximumEndpoint();

		/**
		 * The meta object literal for the '<em><b>Maximum Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MAXIMUM_OPEN = eINSTANCE.getRankingInterval_MaximumOpen();

		/**
		 * The meta object literal for the '<em><b>Minimum Endpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MINIMUM_ENDPOINT = eINSTANCE.getRankingInterval_MinimumEndpoint();

		/**
		 * The meta object literal for the '<em><b>Minimum Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__MINIMUM_OPEN = eINSTANCE.getRankingInterval_MinimumOpen();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANKING_INTERVAL__SYMBOL = eINSTANCE.getRankingInterval_Symbol();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.CharacteristicImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__NAME = eINSTANCE.getCharacteristic_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__PARENT = eINSTANCE.getCharacteristic_Parent();

		/**
		 * The meta object literal for the '<em><b>Characteristics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHARACTERISTIC__CHARACTERISTICS = eINSTANCE.getCharacteristic_Characteristics();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.ScopeImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__CLASS = eINSTANCE.getScope_Class();

		/**
		 * The meta object literal for the '<em><b>Enumerated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__ENUMERATED = eINSTANCE.getScope_Enumerated();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__NAME = eINSTANCE.getScope_Name();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__MEASURES = eINSTANCE.getScope_Measures();

		/**
		 * The meta object literal for the '<em><b>Recognizer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__RECOGNIZER = eINSTANCE.getScope_Recognizer();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.BinaryMeasureImpl <em>Binary Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.BinaryMeasureImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getBinaryMeasure()
		 * @generated
		 */
		EClass BINARY_MEASURE = eINSTANCE.getBinaryMeasure();

		/**
		 * The meta object literal for the '<em><b>Functor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_MEASURE__FUNCTOR = eINSTANCE.getBinaryMeasure_Functor();

		/**
		 * The meta object literal for the '<em><b>Base Measure1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASURE__BASE_MEASURE1 = eINSTANCE.getBinaryMeasure_BaseMeasure1();

		/**
		 * The meta object literal for the '<em><b>Base Measure2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_MEASURE__BASE_MEASURE2 = eINSTANCE.getBinaryMeasure_BaseMeasure2();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.DirectMeasureImpl <em>Direct Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.DirectMeasureImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDirectMeasure()
		 * @generated
		 */
		EClass DIRECT_MEASURE = eINSTANCE.getDirectMeasure();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT_MEASURE__OPERATION = eINSTANCE.getDirectMeasure_Operation();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.CollectiveMeasureImpl <em>Collective Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.CollectiveMeasureImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCollectiveMeasure()
		 * @generated
		 */
		EClass COLLECTIVE_MEASURE = eINSTANCE.getCollectiveMeasure();

		/**
		 * The meta object literal for the '<em><b>Base Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_MEASURE__BASE_MEASURE = eINSTANCE.getCollectiveMeasure_BaseMeasure();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASURE__ACCUMULATOR = eINSTANCE.getCollectiveMeasure_Accumulator();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.NamedMeasureImpl <em>Named Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.NamedMeasureImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getNamedMeasure()
		 * @generated
		 */
		EClass NAMED_MEASURE = eINSTANCE.getNamedMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.RescaledMeasureImpl <em>Rescaled Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.RescaledMeasureImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getRescaledMeasure()
		 * @generated
		 */
		EClass RESCALED_MEASURE = eINSTANCE.getRescaledMeasure();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESCALED_MEASURE__FORMULA = eINSTANCE.getRescaledMeasure_Formula();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.RatioMeasureImpl <em>Ratio Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.RatioMeasureImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getRatioMeasure()
		 * @generated
		 */
		EClass RATIO_MEASURE = eINSTANCE.getRatioMeasure();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.CountingImpl <em>Counting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.CountingImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCounting()
		 * @generated
		 */
		EClass COUNTING = eINSTANCE.getCounting();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.DimensionalMeasurementImpl <em>Dimensional Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.DimensionalMeasurementImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDimensionalMeasurement()
		 * @generated
		 */
		EClass DIMENSIONAL_MEASUREMENT = eINSTANCE.getDimensionalMeasurement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONAL_MEASUREMENT__VALUE = eINSTANCE.getDimensionalMeasurement_Value();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.GradeImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Base Measurement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__BASE_MEASUREMENT = eINSTANCE.getGrade_BaseMeasurement();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__IS_BASE_SUPPLIED = eINSTANCE.getGrade_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__VALUE = eINSTANCE.getGrade_Value();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.MeasurementRelationshipImpl <em>Measurement Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.MeasurementRelationshipImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getMeasurementRelationship()
		 * @generated
		 */
		EClass MEASUREMENT_RELATIONSHIP = eINSTANCE.getMeasurementRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASUREMENT_RELATIONSHIP__NAME = eINSTANCE.getMeasurementRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_RELATIONSHIP__FROM = eINSTANCE.getMeasurementRelationship_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT_RELATIONSHIP__TO = eINSTANCE.getMeasurementRelationship_To();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.DirectMeasurementImpl <em>Direct Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.DirectMeasurementImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDirectMeasurement()
		 * @generated
		 */
		EClass DIRECT_MEASUREMENT = eINSTANCE.getDirectMeasurement();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.CountImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.CollectiveMeasurementImpl <em>Collective Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.CollectiveMeasurementImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getCollectiveMeasurement()
		 * @generated
		 */
		EClass COLLECTIVE_MEASUREMENT = eINSTANCE.getCollectiveMeasurement();

		/**
		 * The meta object literal for the '<em><b>Accumulator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASUREMENT__ACCUMULATOR = eINSTANCE.getCollectiveMeasurement_Accumulator();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTIVE_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getCollectiveMeasurement_IsBaseSupplied();

		/**
		 * The meta object literal for the '<em><b>Base Measurement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTIVE_MEASUREMENT__BASE_MEASUREMENT = eINSTANCE.getCollectiveMeasurement_BaseMeasurement();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.AggregatedMeasurementImpl <em>Aggregated Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.AggregatedMeasurementImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getAggregatedMeasurement()
		 * @generated
		 */
		EClass AGGREGATED_MEASUREMENT = eINSTANCE.getAggregatedMeasurement();

		/**
		 * The meta object literal for the '<em><b>Is Base Suppled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATED_MEASUREMENT__IS_BASE_SUPPLED = eINSTANCE.getAggregatedMeasurement_IsBaseSuppled();

		/**
		 * The meta object literal for the '<em><b>Base Measurement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_MEASUREMENT__BASE_MEASUREMENT = eINSTANCE.getAggregatedMeasurement_BaseMeasurement();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.NamedMeasurementImpl <em>Named Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.NamedMeasurementImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getNamedMeasurement()
		 * @generated
		 */
		EClass NAMED_MEASUREMENT = eINSTANCE.getNamedMeasurement();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.ReScaledMeasurementImpl <em>Re Scaled Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.ReScaledMeasurementImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getReScaledMeasurement()
		 * @generated
		 */
		EClass RE_SCALED_MEASUREMENT = eINSTANCE.getReScaledMeasurement();

		/**
		 * The meta object literal for the '<em><b>Is Base Supplied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RE_SCALED_MEASUREMENT__IS_BASE_SUPPLIED = eINSTANCE.getReScaledMeasurement_IsBaseSupplied();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.AttributeImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TAG = eINSTANCE.getAttribute_Tag();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNER = eINSTANCE.getAttribute_Owner();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.impl.AnnotationImpl
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__TEXT = eINSTANCE.getAnnotation_Text();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__OWNER = eINSTANCE.getAnnotation_Owner();

		/**
		 * The meta object literal for the '{@link net.certware.measurement.smm.Accumulator <em>Accumulator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.measurement.smm.Accumulator
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getAccumulator()
		 * @generated
		 */
		EEnum ACCUMULATOR = eINSTANCE.getAccumulator();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Timestamp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.sql.Timestamp
		 * @see net.certware.measurement.smm.impl.SmmPackageImpl#getTimestamp()
		 * @generated
		 */
		EDataType TIMESTAMP = eINSTANCE.getTimestamp();

	}

} //SmmPackage
