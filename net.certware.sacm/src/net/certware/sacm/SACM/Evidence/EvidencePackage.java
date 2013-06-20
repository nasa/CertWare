/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;

import net.certware.sacm.SACM.SACMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.certware.sacm.SACM.Evidence.EvidenceFactory
 * @model kind="package"
 * @generated
 */
public interface EvidencePackage extends EPackage {
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
	String eNAME = "Evidence"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/SACM/1.0/Evidence"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EM"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvidencePackage eINSTANCE = net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceElementImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceElement()
	 * @generated
	 */
	int EVIDENCE_ELEMENT = 71;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__TAGGED_VALUE = SACMPackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__ANNOTATION = SACMPackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__ID = SACMPackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__TIMING = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__CUSTODY = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__PROVENANCE = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__EVENT = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT_FEATURE_COUNT = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceAssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceAssertionImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceAssertion()
	 * @generated
	 */
	int EVIDENCE_ASSERTION = 91;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTION__TAGGED_VALUE = EVIDENCE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTION__ANNOTATION = EVIDENCE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTION__ID = EVIDENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTION__TIMING = EVIDENCE_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTION__CUSTODY = EVIDENCE_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTION__PROVENANCE = EVIDENCE_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTION__EVENT = EVIDENCE_ELEMENT__EVENT;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTION_FEATURE_COUNT = EVIDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceAttributeImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceAttribute()
	 * @generated
	 */
	int EVIDENCE_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__TAGGED_VALUE = EVIDENCE_ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__ANNOTATION = EVIDENCE_ASSERTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__ID = EVIDENCE_ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__TIMING = EVIDENCE_ASSERTION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__CUSTODY = EVIDENCE_ASSERTION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__PROVENANCE = EVIDENCE_ASSERTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__EVENT = EVIDENCE_ASSERTION__EVENT;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE_FEATURE_COUNT = EVIDENCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidencePropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePropertyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceProperty()
	 * @generated
	 */
	int EVIDENCE_PROPERTY = 92;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY__TAGGED_VALUE = EVIDENCE_ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY__ANNOTATION = EVIDENCE_ASSERTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY__ID = EVIDENCE_ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY__TIMING = EVIDENCE_ASSERTION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY__CUSTODY = EVIDENCE_ASSERTION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY__PROVENANCE = EVIDENCE_ASSERTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY__EVENT = EVIDENCE_ASSERTION__EVENT;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY_FEATURE_COUNT = EVIDENCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ExhibitPropertyImpl <em>Exhibit Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ExhibitPropertyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExhibitProperty()
	 * @generated
	 */
	int EXHIBIT_PROPERTY = 89;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY__TAGGED_VALUE = EVIDENCE_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY__ANNOTATION = EVIDENCE_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY__ID = EVIDENCE_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY__TIMING = EVIDENCE_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY__CUSTODY = EVIDENCE_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY__PROVENANCE = EVIDENCE_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY__EVENT = EVIDENCE_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Exhibit Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.DocumentPropertyImpl <em>Document Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.DocumentPropertyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getDocumentProperty()
	 * @generated
	 */
	int DOCUMENT_PROPERTY = 61;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY__TAGGED_VALUE = EXHIBIT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY__ANNOTATION = EXHIBIT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY__ID = EXHIBIT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY__TIMING = EXHIBIT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY__CUSTODY = EXHIBIT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY__PROVENANCE = EXHIBIT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY__EVENT = EXHIBIT_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Document Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY_FEATURE_COUNT = EXHIBIT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ConsistencyImpl <em>Consistency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ConsistencyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConsistency()
	 * @generated
	 */
	int CONSISTENCY = 1;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__VALUE = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.CompletenessImpl <em>Completeness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.CompletenessImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCompleteness()
	 * @generated
	 */
	int COMPLETENESS = 2;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__STATUS = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Completeness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceItemImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceItem()
	 * @generated
	 */
	int EVIDENCE_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__TAGGED_VALUE = EVIDENCE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__ANNOTATION = EVIDENCE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__ID = EVIDENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__TIMING = EVIDENCE_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__CUSTODY = EVIDENCE_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__PROVENANCE = EVIDENCE_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__EVENT = EVIDENCE_ELEMENT__EVENT;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM_FEATURE_COUNT = EVIDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ExhibitImpl <em>Exhibit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ExhibitImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExhibit()
	 * @generated
	 */
	int EXHIBIT = 87;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__TAGGED_VALUE = EVIDENCE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__ANNOTATION = EVIDENCE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__ID = EVIDENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__TIMING = EVIDENCE_ITEM__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__CUSTODY = EVIDENCE_ITEM__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__PROVENANCE = EVIDENCE_ITEM__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__EVENT = EVIDENCE_ITEM__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__NAME = EVIDENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__URL = EVIDENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__PROPERTY = EVIDENCE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exhibit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_FEATURE_COUNT = EVIDENCE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.DocumentImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TAGGED_VALUE = EXHIBIT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ANNOTATION = EXHIBIT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = EXHIBIT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TIMING = EXHIBIT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CUSTODY = EXHIBIT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PROVENANCE = EXHIBIT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EVENT = EXHIBIT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = EXHIBIT__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__URL = EXHIBIT__URL;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PROPERTY = EXHIBIT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = EXHIBIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CITATION = EXHIBIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = EXHIBIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ConfidenceImpl <em>Confidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ConfidenceImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConfidence()
	 * @generated
	 */
	int CONFIDENCE = 4;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__TAGGED_VALUE = EVIDENCE_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__ANNOTATION = EVIDENCE_ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__ID = EVIDENCE_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__CUSTODY = EVIDENCE_ATTRIBUTE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__EVENT = EVIDENCE_ATTRIBUTE__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__VALUE = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Confidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE_FEATURE_COUNT = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ProvenanceImpl <em>Provenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ProvenanceImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProvenance()
	 * @generated
	 */
	int PROVENANCE = 64;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE__TAGGED_VALUE = EVIDENCE_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE__ANNOTATION = EVIDENCE_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE__ID = EVIDENCE_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE__TIMING = EVIDENCE_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE__CUSTODY = EVIDENCE_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE__PROVENANCE = EVIDENCE_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE__EVENT = EVIDENCE_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Provenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ApprovedByImpl <em>Approved By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ApprovedByImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getApprovedBy()
	 * @generated
	 */
	int APPROVED_BY = 5;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY__TAGGED_VALUE = PROVENANCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY__ANNOTATION = PROVENANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY__ID = PROVENANCE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY__TIMING = PROVENANCE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY__CUSTODY = PROVENANCE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY__PROVENANCE = PROVENANCE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY__EVENT = PROVENANCE__EVENT;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY__SUPERVISOR = PROVENANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Approved By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_BY_FEATURE_COUNT = PROVENANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.CreatedByImpl <em>Created By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.CreatedByImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCreatedBy()
	 * @generated
	 */
	int CREATED_BY = 6;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY__TAGGED_VALUE = PROVENANCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY__ANNOTATION = PROVENANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY__ID = PROVENANCE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY__TIMING = PROVENANCE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY__CUSTODY = PROVENANCE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY__PROVENANCE = PROVENANCE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY__EVENT = PROVENANCE__EVENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY__SOURCE = PROVENANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Created By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATED_BY_FEATURE_COUNT = PROVENANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ProjectElementImpl <em>Project Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ProjectElementImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProjectElement()
	 * @generated
	 */
	int PROJECT_ELEMENT = 50;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__TAGGED_VALUE = EVIDENCE_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__ANNOTATION = EVIDENCE_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__ID = EVIDENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__TIMING = EVIDENCE_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__CUSTODY = EVIDENCE_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__PROVENANCE = EVIDENCE_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__EVENT = EVIDENCE_ELEMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__NAME = EVIDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__CONTENT = EVIDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT__PROPERTY = EVIDENCE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Project Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ELEMENT_FEATURE_COUNT = EVIDENCE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.CollectionMethodImpl <em>Collection Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.CollectionMethodImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCollectionMethod()
	 * @generated
	 */
	int COLLECTION_METHOD = 35;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__TAGGED_VALUE = PROJECT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__ANNOTATION = PROJECT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__ID = PROJECT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__TIMING = PROJECT_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__CUSTODY = PROJECT_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__PROVENANCE = PROJECT_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__EVENT = PROJECT_ELEMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__NAME = PROJECT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__CONTENT = PROJECT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__PROPERTY = PROJECT_ELEMENT__PROPERTY;

	/**
	 * The number of structural features of the '<em>Collection Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_FEATURE_COUNT = PROJECT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ToolImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 7;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TAGGED_VALUE = COLLECTION_METHOD__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ANNOTATION = COLLECTION_METHOD__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = COLLECTION_METHOD__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TIMING = COLLECTION_METHOD__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CUSTODY = COLLECTION_METHOD__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PROVENANCE = COLLECTION_METHOD__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__EVENT = COLLECTION_METHOD__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__NAME = COLLECTION_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CONTENT = COLLECTION_METHOD__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PROPERTY = COLLECTION_METHOD__PROPERTY;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__VERSION = COLLECTION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_FEATURE_COUNT = COLLECTION_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.MethodImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 8;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TAGGED_VALUE = COLLECTION_METHOD__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ANNOTATION = COLLECTION_METHOD__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ID = COLLECTION_METHOD__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TIMING = COLLECTION_METHOD__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CUSTODY = COLLECTION_METHOD__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PROVENANCE = COLLECTION_METHOD__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__EVENT = COLLECTION_METHOD__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = COLLECTION_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONTENT = COLLECTION_METHOD__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PROPERTY = COLLECTION_METHOD__PROPERTY;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = COLLECTION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsBasedOnImpl <em>Is Based On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsBasedOnImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsBasedOn()
	 * @generated
	 */
	int IS_BASED_ON = 10;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__TAGGED_VALUE = EXHIBIT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__ANNOTATION = EXHIBIT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__ID = EXHIBIT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__TIMING = EXHIBIT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__CUSTODY = EXHIBIT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__PROVENANCE = EXHIBIT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__EVENT = EXHIBIT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__SOURCE = EXHIBIT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Based On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON_FEATURE_COUNT = EXHIBIT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.FormalElementImpl <em>Formal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.FormalElementImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getFormalElement()
	 * @generated
	 */
	int FORMAL_ELEMENT = 88;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT__TAGGED_VALUE = EVIDENCE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT__ANNOTATION = EVIDENCE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT__ID = EVIDENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT__TIMING = EVIDENCE_ITEM__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT__CUSTODY = EVIDENCE_ITEM__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT__PROVENANCE = EVIDENCE_ITEM__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT__EVENT = EVIDENCE_ITEM__EVENT;

	/**
	 * The number of structural features of the '<em>Formal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ELEMENT_FEATURE_COUNT = EVIDENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.FormalAssertionImpl <em>Formal Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.FormalAssertionImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getFormalAssertion()
	 * @generated
	 */
	int FORMAL_ASSERTION = 11;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION__TAGGED_VALUE = FORMAL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION__ANNOTATION = FORMAL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION__ID = FORMAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION__TIMING = FORMAL_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION__CUSTODY = FORMAL_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION__PROVENANCE = FORMAL_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION__EVENT = FORMAL_ELEMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION__CONTENT = FORMAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formal Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ASSERTION_FEATURE_COUNT = FORMAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceEvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceEvaluationImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceEvaluation()
	 * @generated
	 */
	int EVIDENCE_EVALUATION = 42;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__TAGGED_VALUE = EVIDENCE_ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__ANNOTATION = EVIDENCE_ASSERTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__ID = EVIDENCE_ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__TIMING = EVIDENCE_ASSERTION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__CUSTODY = EVIDENCE_ASSERTION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__PROVENANCE = EVIDENCE_ASSERTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__EVENT = EVIDENCE_ASSERTION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__ATTRIBUTE = EVIDENCE_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION_FEATURE_COUNT = EVIDENCE_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceInterpretationImpl <em>Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceInterpretationImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceInterpretation()
	 * @generated
	 */
	int EVIDENCE_INTERPRETATION = 90;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__TAGGED_VALUE = EVIDENCE_EVALUATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__ANNOTATION = EVIDENCE_EVALUATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__CUSTODY = EVIDENCE_EVALUATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__EVENT = EVIDENCE_EVALUATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__SUBJECT = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsAImpl <em>Is A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsAImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsA()
	 * @generated
	 */
	int IS_A = 12;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__TAGGED_VALUE = EVIDENCE_INTERPRETATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__ANNOTATION = EVIDENCE_INTERPRETATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__CUSTODY = EVIDENCE_INTERPRETATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__EVENT = EVIDENCE_INTERPRETATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__SUBJECT = EVIDENCE_INTERPRETATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__DEFINITION = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A_FEATURE_COUNT = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsCharacterizedByImpl <em>Is Characterized By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsCharacterizedByImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsCharacterizedBy()
	 * @generated
	 */
	int IS_CHARACTERIZED_BY = 13;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__TAGGED_VALUE = EVIDENCE_INTERPRETATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__ANNOTATION = EVIDENCE_INTERPRETATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__CUSTODY = EVIDENCE_INTERPRETATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__EVENT = EVIDENCE_INTERPRETATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__SUBJECT = EVIDENCE_INTERPRETATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__ASSERTION = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Characterized By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY_FEATURE_COUNT = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.StakeholderImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 44;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__TAGGED_VALUE = PROJECT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__ANNOTATION = PROJECT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__ID = PROJECT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__TIMING = PROJECT_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CUSTODY = PROJECT_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__PROVENANCE = PROJECT_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__EVENT = PROJECT_ELEMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__NAME = PROJECT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CONTENT = PROJECT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__PROPERTY = PROJECT_ELEMENT__PROPERTY;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = PROJECT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.PersonImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 14;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TAGGED_VALUE = STAKEHOLDER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ANNOTATION = STAKEHOLDER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = STAKEHOLDER__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TIMING = STAKEHOLDER__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CUSTODY = STAKEHOLDER__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PROVENANCE = STAKEHOLDER__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EVENT = STAKEHOLDER__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = STAKEHOLDER__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONTENT = STAKEHOLDER__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PROPERTY = STAKEHOLDER__PROPERTY;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = STAKEHOLDER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.OrganizationImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 15;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TAGGED_VALUE = STAKEHOLDER__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ANNOTATION = STAKEHOLDER__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = STAKEHOLDER__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TIMING = STAKEHOLDER__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CUSTODY = STAKEHOLDER__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PROVENANCE = STAKEHOLDER__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EVENT = STAKEHOLDER__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = STAKEHOLDER__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CONTENT = STAKEHOLDER__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PROPERTY = STAKEHOLDER__PROPERTY;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ADDRESS = STAKEHOLDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = STAKEHOLDER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceContainer()
	 * @generated
	 */
	int EVIDENCE_CONTAINER = 16;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__TAGGED_VALUE = SACMPackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__ANNOTATION = SACMPackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__ID = SACMPackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__NAME = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__EVALUATION = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__ITEM = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__GID = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__PROPERTY = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__VERSION = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER__ELEMENT = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_CONTAINER_FEATURE_COUNT = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.TimingPropertyImpl <em>Timing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.TimingPropertyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getTimingProperty()
	 * @generated
	 */
	int TIMING_PROPERTY = 65;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY__TAGGED_VALUE = EVIDENCE_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY__ANNOTATION = EVIDENCE_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY__ID = EVIDENCE_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY__TIMING = EVIDENCE_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY__CUSTODY = EVIDENCE_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY__PROVENANCE = EVIDENCE_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY__EVENT = EVIDENCE_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Timing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EffectiveTimeImpl <em>Effective Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EffectiveTimeImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEffectiveTime()
	 * @generated
	 */
	int EFFECTIVE_TIME = 28;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME__TAGGED_VALUE = TIMING_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME__ANNOTATION = TIMING_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME__ID = TIMING_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME__TIMING = TIMING_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME__CUSTODY = TIMING_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME__PROVENANCE = TIMING_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME__EVENT = TIMING_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Effective Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME_FEATURE_COUNT = TIMING_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EndTimeImpl <em>End Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EndTimeImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEndTime()
	 * @generated
	 */
	int END_TIME = 17;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME__TAGGED_VALUE = EFFECTIVE_TIME__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME__ANNOTATION = EFFECTIVE_TIME__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME__ID = EFFECTIVE_TIME__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME__TIMING = EFFECTIVE_TIME__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME__CUSTODY = EFFECTIVE_TIME__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME__PROVENANCE = EFFECTIVE_TIME__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME__EVENT = EFFECTIVE_TIME__EVENT;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME__DATETIME = EFFECTIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TIME_FEATURE_COUNT = EFFECTIVE_TIME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.AssertionImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 18;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__TAGGED_VALUE = FORMAL_ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ANNOTATION = FORMAL_ASSERTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ID = FORMAL_ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__TIMING = FORMAL_ASSERTION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CUSTODY = FORMAL_ASSERTION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__PROVENANCE = FORMAL_ASSERTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__EVENT = FORMAL_ASSERTION__EVENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CONTENT = FORMAL_ASSERTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Facttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__FACTTYPE = FORMAL_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ROLE = FORMAL_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DEFINITION = FORMAL_ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = FORMAL_ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.FormalObjectImpl <em>Formal Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.FormalObjectImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getFormalObject()
	 * @generated
	 */
	int FORMAL_OBJECT = 69;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__TAGGED_VALUE = FORMAL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__ANNOTATION = FORMAL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__ID = FORMAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__TIMING = FORMAL_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__CUSTODY = FORMAL_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__PROVENANCE = FORMAL_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__EVENT = FORMAL_ELEMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__NAME = FORMAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formal Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT_FEATURE_COUNT = FORMAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ObjectImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 19;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TAGGED_VALUE = FORMAL_OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ANNOTATION = FORMAL_OBJECT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID = FORMAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TIMING = FORMAL_OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CUSTODY = FORMAL_OBJECT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PROVENANCE = FORMAL_OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__EVENT = FORMAL_OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = FORMAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__CONCEPT = FORMAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DEFINITION = FORMAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = FORMAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.CompositeObjectImpl <em>Composite Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.CompositeObjectImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCompositeObject()
	 * @generated
	 */
	int COMPOSITE_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__TAGGED_VALUE = FORMAL_OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__ANNOTATION = FORMAL_OBJECT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__ID = FORMAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__TIMING = FORMAL_OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__CUSTODY = FORMAL_OBJECT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__PROVENANCE = FORMAL_OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__EVENT = FORMAL_OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__NAME = FORMAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT__ELEMENT = FORMAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_OBJECT_FEATURE_COUNT = FORMAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.RoleBindingImpl <em>Role Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.RoleBindingImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRoleBinding()
	 * @generated
	 */
	int ROLE_BINDING = 21;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__ROLE = SACMPackage.UTILITY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__SUBJECT = SACMPackage.UTILITY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_FEATURE_COUNT = SACMPackage.UTILITY_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.StartTimeImpl <em>Start Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.StartTimeImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getStartTime()
	 * @generated
	 */
	int START_TIME = 22;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__TAGGED_VALUE = EFFECTIVE_TIME__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__ANNOTATION = EFFECTIVE_TIME__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__ID = EFFECTIVE_TIME__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__TIMING = EFFECTIVE_TIME__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__CUSTODY = EFFECTIVE_TIME__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__PROVENANCE = EFFECTIVE_TIME__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__EVENT = EFFECTIVE_TIME__EVENT;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME__DATETIME = EFFECTIVE_TIME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIME_FEATURE_COUNT = EFFECTIVE_TIME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.RelevanceImpl <em>Relevance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.RelevanceImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRelevance()
	 * @generated
	 */
	int RELEVANCE = 23;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__TAGGED_VALUE = EVIDENCE_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__ANNOTATION = EVIDENCE_ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__ID = EVIDENCE_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__CUSTODY = EVIDENCE_ATTRIBUTE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__EVENT = EVIDENCE_ATTRIBUTE__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__VALUE = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relevance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE_FEATURE_COUNT = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.SignificanceImpl <em>Significance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.SignificanceImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSignificance()
	 * @generated
	 */
	int SIGNIFICANCE = 24;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__TAGGED_VALUE = EVIDENCE_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__ANNOTATION = EVIDENCE_ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__ID = EVIDENCE_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__CUSTODY = EVIDENCE_ATTRIBUTE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__EVENT = EVIDENCE_ATTRIBUTE__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__VALUE = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Significance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE_FEATURE_COUNT = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.AccuracyImpl <em>Accuracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.AccuracyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAccuracy()
	 * @generated
	 */
	int ACCURACY = 25;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__TAGGED_VALUE = EVIDENCE_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__ANNOTATION = EVIDENCE_ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__ID = EVIDENCE_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__CUSTODY = EVIDENCE_ATTRIBUTE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__EVENT = EVIDENCE_ATTRIBUTE__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__VALUE = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Accuracy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY_FEATURE_COUNT = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ProjectPropertyImpl <em>Project Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ProjectPropertyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProjectProperty()
	 * @generated
	 */
	int PROJECT_PROPERTY = 77;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTY__TAGGED_VALUE = EVIDENCE_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTY__ANNOTATION = EVIDENCE_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTY__ID = EVIDENCE_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTY__TIMING = EVIDENCE_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTY__CUSTODY = EVIDENCE_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTY__PROVENANCE = EVIDENCE_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTY__EVENT = EVIDENCE_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Project Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTY_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.HasRoleInImpl <em>Has Role In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.HasRoleInImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasRoleIn()
	 * @generated
	 */
	int HAS_ROLE_IN = 26;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__TAGGED_VALUE = PROJECT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__ANNOTATION = PROJECT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__ID = PROJECT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__TIMING = PROJECT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__CUSTODY = PROJECT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__PROVENANCE = PROJECT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__EVENT = PROJECT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__ROLE = PROJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__ORGANIZATION = PROJECT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Role In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN_FEATURE_COUNT = PROJECT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsScopedByImpl <em>Is Scoped By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsScopedByImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsScopedBy()
	 * @generated
	 */
	int IS_SCOPED_BY = 27;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__TAGGED_VALUE = EVIDENCE_INTERPRETATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__ANNOTATION = EVIDENCE_INTERPRETATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__CUSTODY = EVIDENCE_INTERPRETATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__EVENT = EVIDENCE_INTERPRETATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__SUBJECT = EVIDENCE_INTERPRETATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__SCOPE = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Scoped By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY_FEATURE_COUNT = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.AtTimeImpl <em>At Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.AtTimeImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAtTime()
	 * @generated
	 */
	int AT_TIME = 29;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME__TAGGED_VALUE = TIMING_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME__ANNOTATION = TIMING_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME__ID = TIMING_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME__TIMING = TIMING_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME__CUSTODY = TIMING_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME__PROVENANCE = TIMING_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME__EVENT = TIMING_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Date Ttime</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME__DATE_TTIME = TIMING_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>At Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_TIME_FEATURE_COUNT = TIMING_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.OriginalityImpl <em>Originality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.OriginalityImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getOriginality()
	 * @generated
	 */
	int ORIGINALITY = 30;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__VALUE = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Originality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ReportingImpl <em>Reporting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ReportingImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReporting()
	 * @generated
	 */
	int REPORTING = 31;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__TAGGED_VALUE = EVIDENCE_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__ANNOTATION = EVIDENCE_ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__ID = EVIDENCE_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__CUSTODY = EVIDENCE_ATTRIBUTE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__EVENT = EVIDENCE_ATTRIBUTE__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__VALUE = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reporting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING_FEATURE_COUNT = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ReliabilityImpl <em>Reliability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ReliabilityImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReliability()
	 * @generated
	 */
	int RELIABILITY = 32;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__VALUE = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceRelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceRelationImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceRelation()
	 * @generated
	 */
	int EVIDENCE_RELATION = 36;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__TAGGED_VALUE = EVIDENCE_EVALUATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__ANNOTATION = EVIDENCE_EVALUATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__CUSTODY = EVIDENCE_EVALUATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__EVENT = EVIDENCE_EVALUATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__ASSERTION = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__SUBJECT = EVIDENCE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.SupportsImpl <em>Supports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.SupportsImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSupports()
	 * @generated
	 */
	int SUPPORTS = 33;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__TAGGED_VALUE = EVIDENCE_RELATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ANNOTATION = EVIDENCE_RELATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ID = EVIDENCE_RELATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__TIMING = EVIDENCE_RELATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__CUSTODY = EVIDENCE_RELATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__PROVENANCE = EVIDENCE_RELATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__EVENT = EVIDENCE_RELATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ATTRIBUTE = EVIDENCE_RELATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ASSERTION = EVIDENCE_RELATION__ASSERTION;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__SUBJECT = EVIDENCE_RELATION__SUBJECT;

	/**
	 * The number of structural features of the '<em>Supports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_FEATURE_COUNT = EVIDENCE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceEventImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceEvent()
	 * @generated
	 */
	int EVIDENCE_EVENT = 62;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__TAGGED_VALUE = EVIDENCE_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__ANNOTATION = EVIDENCE_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__ID = EVIDENCE_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__TIMING = EVIDENCE_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__CUSTODY = EVIDENCE_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__PROVENANCE = EVIDENCE_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__EVENT = EVIDENCE_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsGeneratedAtImpl <em>Is Generated At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsGeneratedAtImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsGeneratedAt()
	 * @generated
	 */
	int IS_GENERATED_AT = 34;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__TAGGED_VALUE = EVIDENCE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__ANNOTATION = EVIDENCE_EVENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__TIMING = EVIDENCE_EVENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__CUSTODY = EVIDENCE_EVENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__EVENT = EVIDENCE_EVENT__EVENT;

	/**
	 * The number of structural features of the '<em>Is Generated At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.SupportImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 37;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__TAGGED_VALUE = EVIDENCE_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__ANNOTATION = EVIDENCE_ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__ID = EVIDENCE_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__CUSTODY = EVIDENCE_ATTRIBUTE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__EVENT = EVIDENCE_ATTRIBUTE__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__VALUE = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Support</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT_FEATURE_COUNT = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceObservationImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceObservation()
	 * @generated
	 */
	int EVIDENCE_OBSERVATION = 52;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__TAGGED_VALUE = EVIDENCE_EVALUATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__ANNOTATION = EVIDENCE_EVALUATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__CUSTODY = EVIDENCE_EVALUATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__EVENT = EVIDENCE_EVALUATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Observation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ConflictsImpl <em>Conflicts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ConflictsImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConflicts()
	 * @generated
	 */
	int CONFLICTS = 38;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__TAGGED_VALUE = EVIDENCE_OBSERVATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__ANNOTATION = EVIDENCE_OBSERVATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__ID = EVIDENCE_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__TIMING = EVIDENCE_OBSERVATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__CUSTODY = EVIDENCE_OBSERVATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__PROVENANCE = EVIDENCE_OBSERVATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__EVENT = EVIDENCE_OBSERVATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__ATTRIBUTE = EVIDENCE_OBSERVATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__ASSERTION = EVIDENCE_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__SUBJECT = EVIDENCE_OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conflicts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS_FEATURE_COUNT = EVIDENCE_OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceResolutionImpl <em>Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceResolutionImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceResolution()
	 * @generated
	 */
	int EVIDENCE_RESOLUTION = 53;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__TAGGED_VALUE = EVIDENCE_EVALUATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__ANNOTATION = EVIDENCE_EVALUATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__CUSTODY = EVIDENCE_EVALUATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__EVENT = EVIDENCE_EVALUATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__SUBJECT = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.RefutesImpl <em>Refutes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.RefutesImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRefutes()
	 * @generated
	 */
	int REFUTES = 39;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__TAGGED_VALUE = EVIDENCE_RESOLUTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__ANNOTATION = EVIDENCE_RESOLUTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__ID = EVIDENCE_RESOLUTION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__TIMING = EVIDENCE_RESOLUTION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__CUSTODY = EVIDENCE_RESOLUTION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__PROVENANCE = EVIDENCE_RESOLUTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__EVENT = EVIDENCE_RESOLUTION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__ATTRIBUTE = EVIDENCE_RESOLUTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__SUBJECT = EVIDENCE_RESOLUTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__ELEMENT = EVIDENCE_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refutes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES_FEATURE_COUNT = EVIDENCE_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.NegatesImpl <em>Negates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.NegatesImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getNegates()
	 * @generated
	 */
	int NEGATES = 40;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__TAGGED_VALUE = EVIDENCE_RESOLUTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__ANNOTATION = EVIDENCE_RESOLUTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__ID = EVIDENCE_RESOLUTION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__TIMING = EVIDENCE_RESOLUTION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__CUSTODY = EVIDENCE_RESOLUTION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__PROVENANCE = EVIDENCE_RESOLUTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__EVENT = EVIDENCE_RESOLUTION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__ATTRIBUTE = EVIDENCE_RESOLUTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__SUBJECT = EVIDENCE_RESOLUTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__ELEMENT = EVIDENCE_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES_FEATURE_COUNT = EVIDENCE_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.UnknownObjectImpl <em>Unknown Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.UnknownObjectImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getUnknownObject()
	 * @generated
	 */
	int UNKNOWN_OBJECT = 41;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__TAGGED_VALUE = FORMAL_OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__ANNOTATION = FORMAL_OBJECT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__ID = FORMAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__TIMING = FORMAL_OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__CUSTODY = FORMAL_OBJECT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__PROVENANCE = FORMAL_OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__EVENT = FORMAL_OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT__NAME = FORMAL_OBJECT__NAME;

	/**
	 * The number of structural features of the '<em>Unknown Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_OBJECT_FEATURE_COUNT = FORMAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ResolvesImpl <em>Resolves</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ResolvesImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getResolves()
	 * @generated
	 */
	int RESOLVES = 43;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__TAGGED_VALUE = EVIDENCE_RESOLUTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__ANNOTATION = EVIDENCE_RESOLUTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__ID = EVIDENCE_RESOLUTION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__TIMING = EVIDENCE_RESOLUTION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__CUSTODY = EVIDENCE_RESOLUTION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__PROVENANCE = EVIDENCE_RESOLUTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__EVENT = EVIDENCE_RESOLUTION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__ATTRIBUTE = EVIDENCE_RESOLUTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__SUBJECT = EVIDENCE_RESOLUTION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__ELEMENT = EVIDENCE_RESOLUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolves</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES_FEATURE_COUNT = EVIDENCE_RESOLUTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceRequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceRequestImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceRequest()
	 * @generated
	 */
	int EVIDENCE_REQUEST = 45;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__TAGGED_VALUE = PROJECT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__ANNOTATION = PROJECT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__ID = PROJECT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__TIMING = PROJECT_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__CUSTODY = PROJECT_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__PROVENANCE = PROJECT_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__EVENT = PROJECT_ELEMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__NAME = PROJECT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__CONTENT = PROJECT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__PROPERTY = PROJECT_ELEMENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__ITEM = PROJECT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST_FEATURE_COUNT = PROJECT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ProjectObjectiveImpl <em>Project Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ProjectObjectiveImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProjectObjective()
	 * @generated
	 */
	int PROJECT_OBJECTIVE = 46;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__TAGGED_VALUE = PROJECT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__ANNOTATION = PROJECT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__ID = PROJECT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__TIMING = PROJECT_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__CUSTODY = PROJECT_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__PROVENANCE = PROJECT_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__EVENT = PROJECT_ELEMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__NAME = PROJECT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__CONTENT = PROJECT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__PROPERTY = PROJECT_ELEMENT__PROPERTY;

	/**
	 * The number of structural features of the '<em>Project Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE_FEATURE_COUNT = PROJECT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ActivityImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 47;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TAGGED_VALUE = PROJECT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ANNOTATION = PROJECT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = PROJECT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TIMING = PROJECT_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CUSTODY = PROJECT_ELEMENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROVENANCE = PROJECT_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__EVENT = PROJECT_ELEMENT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = PROJECT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__CONTENT = PROJECT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROPERTY = PROJECT_ELEMENT__PROPERTY;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = PROJECT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.DependsOnImpl <em>Depends On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.DependsOnImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getDependsOn()
	 * @generated
	 */
	int DEPENDS_ON = 48;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__TAGGED_VALUE = PROJECT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__ANNOTATION = PROJECT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__ID = PROJECT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__TIMING = PROJECT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__CUSTODY = PROJECT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__PROVENANCE = PROJECT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__EVENT = PROJECT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__ELEMENT = PROJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Depends On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_FEATURE_COUNT = PROJECT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.SatisfiesImpl <em>Satisfies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.SatisfiesImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSatisfies()
	 * @generated
	 */
	int SATISFIES = 49;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__TAGGED_VALUE = PROJECT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__ANNOTATION = PROJECT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__ID = PROJECT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__TIMING = PROJECT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__CUSTODY = PROJECT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__PROVENANCE = PROJECT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__EVENT = PROJECT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__ELEMENT = PROJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Satisfies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES_FEATURE_COUNT = PROJECT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ReferencedClaimImpl <em>Referenced Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ReferencedClaimImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReferencedClaim()
	 * @generated
	 */
	int REFERENCED_CLAIM = 51;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__TAGGED_VALUE = FORMAL_ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__ANNOTATION = FORMAL_ASSERTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__ID = FORMAL_ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__TIMING = FORMAL_ASSERTION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__CUSTODY = FORMAL_ASSERTION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__PROVENANCE = FORMAL_ASSERTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__EVENT = FORMAL_ASSERTION__EVENT;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__CONTENT = FORMAL_ASSERTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Claim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM__CLAIM = FORMAL_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Referenced Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_CLAIM_FEATURE_COUNT = FORMAL_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ContributesImpl <em>Contributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ContributesImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getContributes()
	 * @generated
	 */
	int CONTRIBUTES = 56;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__TAGGED_VALUE = EVIDENCE_OBSERVATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__ANNOTATION = EVIDENCE_OBSERVATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__ID = EVIDENCE_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__TIMING = EVIDENCE_OBSERVATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__CUSTODY = EVIDENCE_OBSERVATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__PROVENANCE = EVIDENCE_OBSERVATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__EVENT = EVIDENCE_OBSERVATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__ATTRIBUTE = EVIDENCE_OBSERVATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__SUBJECT = EVIDENCE_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__RELATION = EVIDENCE_OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES_FEATURE_COUNT = EVIDENCE_OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.WeakensImpl <em>Weakens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.WeakensImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getWeakens()
	 * @generated
	 */
	int WEAKENS = 54;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__TAGGED_VALUE = CONTRIBUTES__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__ANNOTATION = CONTRIBUTES__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__ID = CONTRIBUTES__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__TIMING = CONTRIBUTES__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__CUSTODY = CONTRIBUTES__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__PROVENANCE = CONTRIBUTES__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__EVENT = CONTRIBUTES__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__ATTRIBUTE = CONTRIBUTES__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__SUBJECT = CONTRIBUTES__SUBJECT;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__RELATION = CONTRIBUTES__RELATION;

	/**
	 * The number of structural features of the '<em>Weakens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS_FEATURE_COUNT = CONTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.AmplifiesImpl <em>Amplifies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.AmplifiesImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAmplifies()
	 * @generated
	 */
	int AMPLIFIES = 55;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__TAGGED_VALUE = CONTRIBUTES__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__ANNOTATION = CONTRIBUTES__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__ID = CONTRIBUTES__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__TIMING = CONTRIBUTES__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__CUSTODY = CONTRIBUTES__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__PROVENANCE = CONTRIBUTES__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__EVENT = CONTRIBUTES__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__ATTRIBUTE = CONTRIBUTES__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__SUBJECT = CONTRIBUTES__SUBJECT;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__RELATION = CONTRIBUTES__RELATION;

	/**
	 * The number of structural features of the '<em>Amplifies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES_FEATURE_COUNT = CONTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ChallengesImpl <em>Challenges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ChallengesImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getChallenges()
	 * @generated
	 */
	int CHALLENGES = 57;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__TAGGED_VALUE = EVIDENCE_RELATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__ANNOTATION = EVIDENCE_RELATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__ID = EVIDENCE_RELATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__TIMING = EVIDENCE_RELATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__CUSTODY = EVIDENCE_RELATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__PROVENANCE = EVIDENCE_RELATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__EVENT = EVIDENCE_RELATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__ATTRIBUTE = EVIDENCE_RELATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__ASSERTION = EVIDENCE_RELATION__ASSERTION;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__SUBJECT = EVIDENCE_RELATION__SUBJECT;

	/**
	 * The number of structural features of the '<em>Challenges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES_FEATURE_COUNT = EVIDENCE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.StrengthImpl <em>Strength</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.StrengthImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getStrength()
	 * @generated
	 */
	int STRENGTH = 58;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__TAGGED_VALUE = EVIDENCE_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__ANNOTATION = EVIDENCE_ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__ID = EVIDENCE_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__CUSTODY = EVIDENCE_ATTRIBUTE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__EVENT = EVIDENCE_ATTRIBUTE__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__VALUE = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Strength</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH_FEATURE_COUNT = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsAcquiredAtImpl <em>Is Acquired At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsAcquiredAtImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsAcquiredAt()
	 * @generated
	 */
	int IS_ACQUIRED_AT = 59;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__TAGGED_VALUE = EVIDENCE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__ANNOTATION = EVIDENCE_EVENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__TIMING = EVIDENCE_EVENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__CUSTODY = EVIDENCE_EVENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__EVENT = EVIDENCE_EVENT__EVENT;

	/**
	 * The number of structural features of the '<em>Is Acquired At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsTransferredToImpl <em>Is Transferred To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsTransferredToImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsTransferredTo()
	 * @generated
	 */
	int IS_TRANSFERRED_TO = 60;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__TAGGED_VALUE = EVIDENCE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__ANNOTATION = EVIDENCE_EVENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__TIMING = EVIDENCE_EVENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__CUSTODY = EVIDENCE_EVENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__EVENT = EVIDENCE_EVENT__EVENT;

	/**
	 * The number of structural features of the '<em>Is Transferred To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.OwnedByImpl <em>Owned By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.OwnedByImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getOwnedBy()
	 * @generated
	 */
	int OWNED_BY = 63;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY__TAGGED_VALUE = PROVENANCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY__ANNOTATION = PROVENANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY__ID = PROVENANCE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY__TIMING = PROVENANCE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY__CUSTODY = PROVENANCE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY__PROVENANCE = PROVENANCE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY__EVENT = PROVENANCE__EVENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY__OWNER = PROVENANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Owned By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNED_BY_FEATURE_COUNT = PROVENANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsPartOfImpl <em>Is Part Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsPartOfImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsPartOf()
	 * @generated
	 */
	int IS_PART_OF = 66;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF__TAGGED_VALUE = EXHIBIT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF__ANNOTATION = EXHIBIT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF__ID = EXHIBIT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF__TIMING = EXHIBIT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF__CUSTODY = EXHIBIT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF__PROVENANCE = EXHIBIT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF__EVENT = EXHIBIT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Whole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF__WHOLE = EXHIBIT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Part Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PART_OF_FEATURE_COUNT = EXHIBIT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsRevokedAtImpl <em>Is Revoked At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsRevokedAtImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsRevokedAt()
	 * @generated
	 */
	int IS_REVOKED_AT = 67;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__TAGGED_VALUE = EVIDENCE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__ANNOTATION = EVIDENCE_EVENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__TIMING = EVIDENCE_EVENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__CUSTODY = EVIDENCE_EVENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__EVENT = EVIDENCE_EVENT__EVENT;

	/**
	 * The number of structural features of the '<em>Is Revoked At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ProvidesContextImpl <em>Provides Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ProvidesContextImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProvidesContext()
	 * @generated
	 */
	int PROVIDES_CONTEXT = 68;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__TAGGED_VALUE = EVIDENCE_INTERPRETATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__ANNOTATION = EVIDENCE_INTERPRETATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__CUSTODY = EVIDENCE_INTERPRETATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__EVENT = EVIDENCE_INTERPRETATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__SUBJECT = EVIDENCE_INTERPRETATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__CONTEXT = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provides Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT_FEATURE_COUNT = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.MeansThatImpl <em>Means That</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.MeansThatImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getMeansThat()
	 * @generated
	 */
	int MEANS_THAT = 70;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__TAGGED_VALUE = EVIDENCE_INTERPRETATION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__ANNOTATION = EVIDENCE_INTERPRETATION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__CUSTODY = EVIDENCE_INTERPRETATION__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__EVENT = EVIDENCE_INTERPRETATION__EVENT;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__SUBJECT = EVIDENCE_INTERPRETATION__SUBJECT;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__MEANING = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Means That</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT_FEATURE_COUNT = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.CustodyPropertyImpl <em>Custody Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.CustodyPropertyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCustodyProperty()
	 * @generated
	 */
	int CUSTODY_PROPERTY = 73;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY__TAGGED_VALUE = EVIDENCE_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY__ANNOTATION = EVIDENCE_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY__ID = EVIDENCE_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY__TIMING = EVIDENCE_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY__CUSTODY = EVIDENCE_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY__PROVENANCE = EVIDENCE_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY__EVENT = EVIDENCE_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Custody Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.CareOfImpl <em>Care Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.CareOfImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCareOf()
	 * @generated
	 */
	int CARE_OF = 72;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__TAGGED_VALUE = CUSTODY_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__ANNOTATION = CUSTODY_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__ID = CUSTODY_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__TIMING = CUSTODY_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__CUSTODY = CUSTODY_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__PROVENANCE = CUSTODY_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__EVENT = CUSTODY_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Custodian</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__CUSTODIAN = CUSTODY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Care Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF_FEATURE_COUNT = CUSTODY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.AtLocationImpl <em>At Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.AtLocationImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAtLocation()
	 * @generated
	 */
	int AT_LOCATION = 74;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION__TAGGED_VALUE = CUSTODY_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION__ANNOTATION = CUSTODY_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION__ID = CUSTODY_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION__TIMING = CUSTODY_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION__CUSTODY = CUSTODY_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION__PROVENANCE = CUSTODY_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION__EVENT = CUSTODY_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION__LOCATION = CUSTODY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>At Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_LOCATION_FEATURE_COUNT = CUSTODY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsCreatedAtImpl <em>Is Created At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsCreatedAtImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsCreatedAt()
	 * @generated
	 */
	int IS_CREATED_AT = 75;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__TAGGED_VALUE = EVIDENCE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__ANNOTATION = EVIDENCE_EVENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__TIMING = EVIDENCE_EVENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__CUSTODY = EVIDENCE_EVENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__EVENT = EVIDENCE_EVENT__EVENT;

	/**
	 * The number of structural features of the '<em>Is Created At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.RequiresContainerImpl <em>Requires Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.RequiresContainerImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRequiresContainer()
	 * @generated
	 */
	int REQUIRES_CONTAINER = 76;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER__TAGGED_VALUE = PROJECT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER__ANNOTATION = PROJECT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER__ID = PROJECT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER__TIMING = PROJECT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER__CUSTODY = PROJECT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER__PROVENANCE = PROJECT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER__EVENT = PROJECT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER__CONTAINER = PROJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requires Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONTAINER_FEATURE_COUNT = PROJECT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ServiceImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 78;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TAGGED_VALUE = COLLECTION_METHOD__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ANNOTATION = COLLECTION_METHOD__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = COLLECTION_METHOD__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TIMING = COLLECTION_METHOD__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CUSTODY = COLLECTION_METHOD__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROVENANCE = COLLECTION_METHOD__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EVENT = COLLECTION_METHOD__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = COLLECTION_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONTENT = COLLECTION_METHOD__CONTENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROPERTY = COLLECTION_METHOD__PROPERTY;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = COLLECTION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.HasElectronicSourceImpl <em>Has Electronic Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.HasElectronicSourceImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasElectronicSource()
	 * @generated
	 */
	int HAS_ELECTRONIC_SOURCE = 79;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__TAGGED_VALUE = EXHIBIT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__ANNOTATION = EXHIBIT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__ID = EXHIBIT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__TIMING = EXHIBIT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__CUSTODY = EXHIBIT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__PROVENANCE = EXHIBIT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__EVENT = EXHIBIT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__SOURCE = EXHIBIT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__FORMAT = EXHIBIT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE__FILE_SIZE = EXHIBIT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Has Electronic Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ELECTRONIC_SOURCE_FEATURE_COUNT = EXHIBIT_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsExpressedInLanguageImpl <em>Is Expressed In Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsExpressedInLanguageImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsExpressedInLanguage()
	 * @generated
	 */
	int IS_EXPRESSED_IN_LANGUAGE = 80;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__LANGUAGE = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Is Expressed In Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXPRESSED_IN_LANGUAGE_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.UsingProcessImpl <em>Using Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.UsingProcessImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getUsingProcess()
	 * @generated
	 */
	int USING_PROCESS = 81;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS__TAGGED_VALUE = CUSTODY_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS__ANNOTATION = CUSTODY_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS__ID = CUSTODY_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS__TIMING = CUSTODY_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS__CUSTODY = CUSTODY_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS__PROVENANCE = CUSTODY_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS__EVENT = CUSTODY_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS__METHOD = CUSTODY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Using Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USING_PROCESS_FEATURE_COUNT = CUSTODY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.HasSecurityClassificationImpl <em>Has Security Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.HasSecurityClassificationImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasSecurityClassification()
	 * @generated
	 */
	int HAS_SECURITY_CLASSIFICATION = 82;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Security Classification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION__SECURITY_CLASSIFICATION = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Security Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_SECURITY_CLASSIFICATION_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsReleaseableToImpl <em>Is Releaseable To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsReleaseableToImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsReleaseableTo()
	 * @generated
	 */
	int IS_RELEASEABLE_TO = 83;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Releasability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO__RELEASABILITY = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Releaseable To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_RELEASEABLE_TO_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceGroupImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceGroup()
	 * @generated
	 */
	int EVIDENCE_GROUP = 84;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__TAGGED_VALUE = EVIDENCE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__ANNOTATION = EVIDENCE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__ID = EVIDENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__TIMING = EVIDENCE_ITEM__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__CUSTODY = EVIDENCE_ITEM__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__PROVENANCE = EVIDENCE_ITEM__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__EVENT = EVIDENCE_ITEM__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__NAME = EVIDENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__ELEMENT = EVIDENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP_FEATURE_COUNT = EVIDENCE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.HasVersionImpl <em>Has Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.HasVersionImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasVersion()
	 * @generated
	 */
	int HAS_VERSION = 85;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION__VERSION = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_VERSION_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.HasMediaImpl <em>Has Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.HasMediaImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasMedia()
	 * @generated
	 */
	int HAS_MEDIA = 86;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA__TAGGED_VALUE = EXHIBIT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA__ANNOTATION = EXHIBIT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA__ID = EXHIBIT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA__TIMING = EXHIBIT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA__CUSTODY = EXHIBIT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA__PROVENANCE = EXHIBIT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA__EVENT = EXHIBIT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Media</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA__MEDIA = EXHIBIT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Has Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_MEDIA_FEATURE_COUNT = EXHIBIT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ExtendedEvidenceAttributeImpl <em>Extended Evidence Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ExtendedEvidenceAttributeImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExtendedEvidenceAttribute()
	 * @generated
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE = 93;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE__TAGGED_VALUE = EVIDENCE_ATTRIBUTE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE__ANNOTATION = EVIDENCE_ATTRIBUTE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE__ID = EVIDENCE_ATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE__CUSTODY = EVIDENCE_ATTRIBUTE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE__EVENT = EVIDENCE_ATTRIBUTE__EVENT;

	/**
	 * The number of structural features of the '<em>Extended Evidence Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_EVIDENCE_ATTRIBUTE_FEATURE_COUNT = EVIDENCE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ExtendedDocumentPropertyImpl <em>Extended Document Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ExtendedDocumentPropertyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExtendedDocumentProperty()
	 * @generated
	 */
	int EXTENDED_DOCUMENT_PROPERTY = 94;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DOCUMENT_PROPERTY__TAGGED_VALUE = DOCUMENT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DOCUMENT_PROPERTY__ANNOTATION = DOCUMENT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DOCUMENT_PROPERTY__ID = DOCUMENT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DOCUMENT_PROPERTY__TIMING = DOCUMENT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DOCUMENT_PROPERTY__CUSTODY = DOCUMENT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DOCUMENT_PROPERTY__PROVENANCE = DOCUMENT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DOCUMENT_PROPERTY__EVENT = DOCUMENT_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Extended Document Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DOCUMENT_PROPERTY_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.RecordImpl <em>Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.RecordImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRecord()
	 * @generated
	 */
	int RECORD = 95;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__TAGGED_VALUE = EVIDENCE_ITEM__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ANNOTATION = EVIDENCE_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__ID = EVIDENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__TIMING = EVIDENCE_ITEM__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CUSTODY = EVIDENCE_ITEM__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__PROVENANCE = EVIDENCE_ITEM__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__EVENT = EVIDENCE_ITEM__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__NAME = EVIDENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD__CONTENT = EVIDENCE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_FEATURE_COUNT = EVIDENCE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ObjectifiedAssertionImpl <em>Objectified Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ObjectifiedAssertionImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getObjectifiedAssertion()
	 * @generated
	 */
	int OBJECTIFIED_ASSERTION = 96;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__TAGGED_VALUE = FORMAL_OBJECT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__ANNOTATION = FORMAL_OBJECT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__ID = FORMAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__TIMING = FORMAL_OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__CUSTODY = FORMAL_OBJECT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__PROVENANCE = FORMAL_OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__EVENT = FORMAL_OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__NAME = FORMAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION__ASSERTION = FORMAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Objectified Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECTIFIED_ASSERTION_FEATURE_COUNT = FORMAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.IsModifiedByImpl <em>Is Modified By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.IsModifiedByImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsModifiedBy()
	 * @generated
	 */
	int IS_MODIFIED_BY = 97;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFIED_BY__TAGGED_VALUE = EVIDENCE_EVENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFIED_BY__ANNOTATION = EVIDENCE_EVENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFIED_BY__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFIED_BY__TIMING = EVIDENCE_EVENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFIED_BY__CUSTODY = EVIDENCE_EVENT__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFIED_BY__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFIED_BY__EVENT = EVIDENCE_EVENT__EVENT;

	/**
	 * The number of structural features of the '<em>Is Modified By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_MODIFIED_BY_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.PerformedByImpl <em>Performed By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.PerformedByImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getPerformedBy()
	 * @generated
	 */
	int PERFORMED_BY = 98;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY__TAGGED_VALUE = PROVENANCE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY__ANNOTATION = PROVENANCE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY__ID = PROVENANCE__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY__TIMING = PROVENANCE__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY__CUSTODY = PROVENANCE__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY__PROVENANCE = PROVENANCE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY__EVENT = PROVENANCE__EVENT;

	/**
	 * The feature id for the '<em><b>Executor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY__EXECUTOR = PROVENANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Performed By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMED_BY_FEATURE_COUNT = PROVENANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ContainerConsistencyImpl <em>Container Consistency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ContainerConsistencyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getContainerConsistency()
	 * @generated
	 */
	int CONTAINER_CONSISTENCY = 99;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY__TAGGED_VALUE = PROJECT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY__ANNOTATION = PROJECT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY__ID = PROJECT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY__TIMING = PROJECT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY__CUSTODY = PROJECT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY__PROVENANCE = PROJECT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY__EVENT = PROJECT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY__VALUE = PROJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Consistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CONSISTENCY_FEATURE_COUNT = PROJECT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ContainerCompletenessImpl <em>Container Completeness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ContainerCompletenessImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getContainerCompleteness()
	 * @generated
	 */
	int CONTAINER_COMPLETENESS = 100;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS__TAGGED_VALUE = PROJECT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS__ANNOTATION = PROJECT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS__ID = PROJECT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS__TIMING = PROJECT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS__CUSTODY = PROJECT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS__PROVENANCE = PROJECT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS__EVENT = PROJECT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS__VALUE = PROJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Completeness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_COMPLETENESS_FEATURE_COUNT = PROJECT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.CompliesToImpl <em>Complies To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.CompliesToImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCompliesTo()
	 * @generated
	 */
	int COMPLIES_TO = 101;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__TAGGED_VALUE = PROJECT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__ANNOTATION = PROJECT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__ID = PROJECT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__TIMING = PROJECT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__CUSTODY = PROJECT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__PROVENANCE = PROJECT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__EVENT = PROJECT_PROPERTY__EVENT;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO__CRITERIA = PROJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complies To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIES_TO_FEATURE_COUNT = PROJECT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.impl.ExtendedProjectPropertyImpl <em>Extended Project Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.impl.ExtendedProjectPropertyImpl
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExtendedProjectProperty()
	 * @generated
	 */
	int EXTENDED_PROJECT_PROPERTY = 102;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROJECT_PROPERTY__TAGGED_VALUE = PROJECT_PROPERTY__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROJECT_PROPERTY__ANNOTATION = PROJECT_PROPERTY__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROJECT_PROPERTY__ID = PROJECT_PROPERTY__ID;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROJECT_PROPERTY__TIMING = PROJECT_PROPERTY__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROJECT_PROPERTY__CUSTODY = PROJECT_PROPERTY__CUSTODY;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROJECT_PROPERTY__PROVENANCE = PROJECT_PROPERTY__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROJECT_PROPERTY__EVENT = PROJECT_PROPERTY__EVENT;

	/**
	 * The number of structural features of the '<em>Extended Project Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_PROJECT_PROPERTY_FEATURE_COUNT = PROJECT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.ReliabilityLevel <em>Reliability Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.ReliabilityLevel
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReliabilityLevel()
	 * @generated
	 */
	int RELIABILITY_LEVEL = 103;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.CompletenessLevel <em>Completeness Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.CompletenessLevel
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCompletenessLevel()
	 * @generated
	 */
	int COMPLETENESS_LEVEL = 104;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.OriginalityLevel <em>Originality Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.OriginalityLevel
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getOriginalityLevel()
	 * @generated
	 */
	int ORIGINALITY_LEVEL = 105;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.ConsistencyLevel <em>Consistency Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.ConsistencyLevel
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConsistencyLevel()
	 * @generated
	 */
	int CONSISTENCY_LEVEL = 106;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.Level
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 107;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.SupportLevel <em>Support Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.SupportLevel
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSupportLevel()
	 * @generated
	 */
	int SUPPORT_LEVEL = 108;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.ReportingLevel <em>Reporting Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.ReportingLevel
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReportingLevel()
	 * @generated
	 */
	int REPORTING_LEVEL = 109;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.ConfidenceLevel <em>Confidence Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.ConfidenceLevel
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConfidenceLevel()
	 * @generated
	 */
	int CONFIDENCE_LEVEL = 110;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.AccuracyLevel <em>Accuracy Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.AccuracyLevel
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAccuracyLevel()
	 * @generated
	 */
	int ACCURACY_LEVEL = 111;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Evidence.StandardOfProof <em>Standard Of Proof</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Evidence.StandardOfProof
	 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getStandardOfProof()
	 * @generated
	 */
	int STANDARD_OF_PROOF = 112;


	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceAttribute
	 * @generated
	 */
	EClass getEvidenceAttribute();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Consistency <em>Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consistency</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Consistency
	 * @generated
	 */
	EClass getConsistency();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Consistency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Consistency#getValue()
	 * @see #getConsistency()
	 * @generated
	 */
	EAttribute getConsistency_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Completeness <em>Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completeness</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Completeness
	 * @generated
	 */
	EClass getCompleteness();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Completeness#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Completeness#getStatus()
	 * @see #getCompleteness()
	 * @generated
	 */
	EAttribute getCompleteness_Status();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Document#getCitation <em>Citation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Citation</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Document#getCitation()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Citation();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Confidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidence</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Confidence
	 * @generated
	 */
	EClass getConfidence();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Confidence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Confidence#getValue()
	 * @see #getConfidence()
	 * @generated
	 */
	EAttribute getConfidence_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approved By</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ApprovedBy
	 * @generated
	 */
	EClass getApprovedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.ApprovedBy#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supervisor</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ApprovedBy#getSupervisor()
	 * @see #getApprovedBy()
	 * @generated
	 */
	EReference getApprovedBy_Supervisor();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.CreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Created By</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CreatedBy
	 * @generated
	 */
	EClass getCreatedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.CreatedBy#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CreatedBy#getSource()
	 * @see #getCreatedBy()
	 * @generated
	 */
	EReference getCreatedBy_Source();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Tool#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Tool#getVersion()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Version();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceItem
	 * @generated
	 */
	EClass getEvidenceItem();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsBasedOn <em>Is Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Based On</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsBasedOn
	 * @generated
	 */
	EClass getIsBasedOn();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.IsBasedOn#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsBasedOn#getSource()
	 * @see #getIsBasedOn()
	 * @generated
	 */
	EReference getIsBasedOn_Source();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.FormalAssertion <em>Formal Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Assertion</em>'.
	 * @see net.certware.sacm.SACM.Evidence.FormalAssertion
	 * @generated
	 */
	EClass getFormalAssertion();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.FormalAssertion#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see net.certware.sacm.SACM.Evidence.FormalAssertion#getContent()
	 * @see #getFormalAssertion()
	 * @generated
	 */
	EAttribute getFormalAssertion_Content();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is A</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsA
	 * @generated
	 */
	EClass getIsA();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.IsA#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsA#getDefinition()
	 * @see #getIsA()
	 * @generated
	 */
	EReference getIsA_Definition();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsCharacterizedBy <em>Is Characterized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Characterized By</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsCharacterizedBy
	 * @generated
	 */
	EClass getIsCharacterizedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.IsCharacterizedBy#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsCharacterizedBy#getAssertion()
	 * @see #getIsCharacterizedBy()
	 * @generated
	 */
	EReference getIsCharacterizedBy_Assertion();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Organization#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Organization#getAddress()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Address();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer
	 * @generated
	 */
	EClass getEvidenceContainer();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer#getName()
	 * @see #getEvidenceContainer()
	 * @generated
	 */
	EAttribute getEvidenceContainer_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer#getEvaluation()
	 * @see #getEvidenceContainer()
	 * @generated
	 */
	EReference getEvidenceContainer_Evaluation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer#getItem()
	 * @see #getEvidenceContainer()
	 * @generated
	 */
	EReference getEvidenceContainer_Item();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer#getGid()
	 * @see #getEvidenceContainer()
	 * @generated
	 */
	EAttribute getEvidenceContainer_Gid();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer#getProperty()
	 * @see #getEvidenceContainer()
	 * @generated
	 */
	EReference getEvidenceContainer_Property();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer#getVersion()
	 * @see #getEvidenceContainer()
	 * @generated
	 */
	EAttribute getEvidenceContainer_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceContainer#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceContainer#getElement()
	 * @see #getEvidenceContainer()
	 * @generated
	 */
	EReference getEvidenceContainer_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Time</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EndTime
	 * @generated
	 */
	EClass getEndTime();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.EndTime#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datetime</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EndTime#getDatetime()
	 * @see #getEndTime()
	 * @generated
	 */
	EReference getEndTime_Datetime();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Assertion#getFacttype <em>Facttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facttype</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Assertion#getFacttype()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Facttype();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.Assertion#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Assertion#getRole()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Role();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Assertion#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Assertion#getDefinition()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Definition();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Object#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Object#getConcept()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Concept();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Object#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Object#getDefinition()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Definition();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.CompositeObject <em>Composite Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Object</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CompositeObject
	 * @generated
	 */
	EClass getCompositeObject();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.CompositeObject#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CompositeObject#getElement()
	 * @see #getCompositeObject()
	 * @generated
	 */
	EReference getCompositeObject_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.RoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Binding</em>'.
	 * @see net.certware.sacm.SACM.Evidence.RoleBinding
	 * @generated
	 */
	EClass getRoleBinding();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.RoleBinding#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.certware.sacm.SACM.Evidence.RoleBinding#getRole()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EAttribute getRoleBinding_Role();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.RoleBinding#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see net.certware.sacm.SACM.Evidence.RoleBinding#getSubject()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EReference getRoleBinding_Subject();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.StartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Time</em>'.
	 * @see net.certware.sacm.SACM.Evidence.StartTime
	 * @generated
	 */
	EClass getStartTime();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.StartTime#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datetime</em>'.
	 * @see net.certware.sacm.SACM.Evidence.StartTime#getDatetime()
	 * @see #getStartTime()
	 * @generated
	 */
	EReference getStartTime_Datetime();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Relevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relevance</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Relevance
	 * @generated
	 */
	EClass getRelevance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Relevance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Relevance#getValue()
	 * @see #getRelevance()
	 * @generated
	 */
	EAttribute getRelevance_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Significance <em>Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Significance</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Significance
	 * @generated
	 */
	EClass getSignificance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Significance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Significance#getValue()
	 * @see #getSignificance()
	 * @generated
	 */
	EAttribute getSignificance_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Accuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accuracy</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Accuracy
	 * @generated
	 */
	EClass getAccuracy();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Accuracy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Accuracy#getValue()
	 * @see #getAccuracy()
	 * @generated
	 */
	EAttribute getAccuracy_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.HasRoleIn <em>Has Role In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Role In</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasRoleIn
	 * @generated
	 */
	EClass getHasRoleIn();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.HasRoleIn#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasRoleIn#getRole()
	 * @see #getHasRoleIn()
	 * @generated
	 */
	EAttribute getHasRoleIn_Role();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.HasRoleIn#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasRoleIn#getOrganization()
	 * @see #getHasRoleIn()
	 * @generated
	 */
	EReference getHasRoleIn_Organization();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsScopedBy <em>Is Scoped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Scoped By</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsScopedBy
	 * @generated
	 */
	EClass getIsScopedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.IsScopedBy#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsScopedBy#getScope()
	 * @see #getIsScopedBy()
	 * @generated
	 */
	EReference getIsScopedBy_Scope();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effective Time</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EffectiveTime
	 * @generated
	 */
	EClass getEffectiveTime();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.AtTime <em>At Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Time</em>'.
	 * @see net.certware.sacm.SACM.Evidence.AtTime
	 * @generated
	 */
	EClass getAtTime();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.AtTime#getDateTtime <em>Date Ttime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Date Ttime</em>'.
	 * @see net.certware.sacm.SACM.Evidence.AtTime#getDateTtime()
	 * @see #getAtTime()
	 * @generated
	 */
	EReference getAtTime_DateTtime();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Originality <em>Originality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Originality</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Originality
	 * @generated
	 */
	EClass getOriginality();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Originality#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Originality#getValue()
	 * @see #getOriginality()
	 * @generated
	 */
	EAttribute getOriginality_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Reporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Reporting
	 * @generated
	 */
	EClass getReporting();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Reporting#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Reporting#getValue()
	 * @see #getReporting()
	 * @generated
	 */
	EAttribute getReporting_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Reliability
	 * @generated
	 */
	EClass getReliability();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Reliability#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Reliability#getValue()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Supports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supports</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Supports
	 * @generated
	 */
	EClass getSupports();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsGeneratedAt <em>Is Generated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Generated At</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsGeneratedAt
	 * @generated
	 */
	EClass getIsGeneratedAt();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.CollectionMethod <em>Collection Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Method</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CollectionMethod
	 * @generated
	 */
	EClass getCollectionMethod();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceRelation
	 * @generated
	 */
	EClass getEvidenceRelation();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.EvidenceRelation#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceRelation#getAssertion()
	 * @see #getEvidenceRelation()
	 * @generated
	 */
	EReference getEvidenceRelation_Assertion();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.EvidenceRelation#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceRelation#getSubject()
	 * @see #getEvidenceRelation()
	 * @generated
	 */
	EReference getEvidenceRelation_Subject();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Support
	 * @generated
	 */
	EClass getSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Support#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Support#getValue()
	 * @see #getSupport()
	 * @generated
	 */
	EAttribute getSupport_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Conflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflicts</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Conflicts
	 * @generated
	 */
	EClass getConflicts();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Conflicts#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Conflicts#getAssertion()
	 * @see #getConflicts()
	 * @generated
	 */
	EReference getConflicts_Assertion();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Conflicts#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Conflicts#getSubject()
	 * @see #getConflicts()
	 * @generated
	 */
	EReference getConflicts_Subject();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Refutes <em>Refutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refutes</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Refutes
	 * @generated
	 */
	EClass getRefutes();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Refutes#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Refutes#getElement()
	 * @see #getRefutes()
	 * @generated
	 */
	EReference getRefutes_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Negates <em>Negates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negates</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Negates
	 * @generated
	 */
	EClass getNegates();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Negates#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Negates#getElement()
	 * @see #getNegates()
	 * @generated
	 */
	EReference getNegates_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.UnknownObject <em>Unknown Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Object</em>'.
	 * @see net.certware.sacm.SACM.Evidence.UnknownObject
	 * @generated
	 */
	EClass getUnknownObject();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceEvaluation
	 * @generated
	 */
	EClass getEvidenceEvaluation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceEvaluation#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceEvaluation#getAttribute()
	 * @see #getEvidenceEvaluation()
	 * @generated
	 */
	EReference getEvidenceEvaluation_Attribute();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Resolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolves</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Resolves
	 * @generated
	 */
	EClass getResolves();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Resolves#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Resolves#getElement()
	 * @see #getResolves()
	 * @generated
	 */
	EReference getResolves_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceRequest
	 * @generated
	 */
	EClass getEvidenceRequest();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceRequest#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceRequest#getItem()
	 * @see #getEvidenceRequest()
	 * @generated
	 */
	EReference getEvidenceRequest_Item();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ProjectObjective <em>Project Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Objective</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ProjectObjective
	 * @generated
	 */
	EClass getProjectObjective();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.DependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depends On</em>'.
	 * @see net.certware.sacm.SACM.Evidence.DependsOn
	 * @generated
	 */
	EClass getDependsOn();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.DependsOn#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.DependsOn#getElement()
	 * @see #getDependsOn()
	 * @generated
	 */
	EReference getDependsOn_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Satisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfies</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Satisfies
	 * @generated
	 */
	EClass getSatisfies();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Satisfies#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Satisfies#getElement()
	 * @see #getSatisfies()
	 * @generated
	 */
	EReference getSatisfies_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ProjectElement <em>Project Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ProjectElement
	 * @generated
	 */
	EClass getProjectElement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.ProjectElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ProjectElement#getName()
	 * @see #getProjectElement()
	 * @generated
	 */
	EAttribute getProjectElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.ProjectElement#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ProjectElement#getContent()
	 * @see #getProjectElement()
	 * @generated
	 */
	EAttribute getProjectElement_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.ProjectElement#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ProjectElement#getProperty()
	 * @see #getProjectElement()
	 * @generated
	 */
	EReference getProjectElement_Property();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ReferencedClaim <em>Referenced Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Claim</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ReferencedClaim
	 * @generated
	 */
	EClass getReferencedClaim();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.ReferencedClaim#getClaim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Claim</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ReferencedClaim#getClaim()
	 * @see #getReferencedClaim()
	 * @generated
	 */
	EReference getReferencedClaim_Claim();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceObservation
	 * @generated
	 */
	EClass getEvidenceObservation();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceResolution
	 * @generated
	 */
	EClass getEvidenceResolution();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.sacm.SACM.Evidence.EvidenceResolution#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceResolution#getSubject()
	 * @see #getEvidenceResolution()
	 * @generated
	 */
	EReference getEvidenceResolution_Subject();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Weakens <em>Weakens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weakens</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Weakens
	 * @generated
	 */
	EClass getWeakens();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Amplifies <em>Amplifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amplifies</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Amplifies
	 * @generated
	 */
	EClass getAmplifies();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Contributes <em>Contributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributes</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Contributes
	 * @generated
	 */
	EClass getContributes();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Contributes#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Contributes#getSubject()
	 * @see #getContributes()
	 * @generated
	 */
	EReference getContributes_Subject();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.Contributes#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Contributes#getRelation()
	 * @see #getContributes()
	 * @generated
	 */
	EReference getContributes_Relation();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Challenges <em>Challenges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Challenges</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Challenges
	 * @generated
	 */
	EClass getChallenges();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Strength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strength</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Strength
	 * @generated
	 */
	EClass getStrength();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Strength#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Strength#getValue()
	 * @see #getStrength()
	 * @generated
	 */
	EAttribute getStrength_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsAcquiredAt <em>Is Acquired At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Acquired At</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsAcquiredAt
	 * @generated
	 */
	EClass getIsAcquiredAt();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsTransferredTo <em>Is Transferred To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Transferred To</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsTransferredTo
	 * @generated
	 */
	EClass getIsTransferredTo();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.DocumentProperty <em>Document Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.DocumentProperty
	 * @generated
	 */
	EClass getDocumentProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceEvent
	 * @generated
	 */
	EClass getEvidenceEvent();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.OwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owned By</em>'.
	 * @see net.certware.sacm.SACM.Evidence.OwnedBy
	 * @generated
	 */
	EClass getOwnedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.OwnedBy#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see net.certware.sacm.SACM.Evidence.OwnedBy#getOwner()
	 * @see #getOwnedBy()
	 * @generated
	 */
	EReference getOwnedBy_Owner();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Provenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provenance</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Provenance
	 * @generated
	 */
	EClass getProvenance();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.TimingProperty <em>Timing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.TimingProperty
	 * @generated
	 */
	EClass getTimingProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Part Of</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsPartOf
	 * @generated
	 */
	EClass getIsPartOf();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.IsPartOf#getWhole <em>Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whole</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsPartOf#getWhole()
	 * @see #getIsPartOf()
	 * @generated
	 */
	EReference getIsPartOf_Whole();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsRevokedAt <em>Is Revoked At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Revoked At</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsRevokedAt
	 * @generated
	 */
	EClass getIsRevokedAt();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ProvidesContext <em>Provides Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Context</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ProvidesContext
	 * @generated
	 */
	EClass getProvidesContext();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.ProvidesContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ProvidesContext#getContext()
	 * @see #getProvidesContext()
	 * @generated
	 */
	EReference getProvidesContext_Context();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.FormalObject <em>Formal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Object</em>'.
	 * @see net.certware.sacm.SACM.Evidence.FormalObject
	 * @generated
	 */
	EClass getFormalObject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.FormalObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.sacm.SACM.Evidence.FormalObject#getName()
	 * @see #getFormalObject()
	 * @generated
	 */
	EAttribute getFormalObject_Name();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.MeansThat <em>Means That</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Means That</em>'.
	 * @see net.certware.sacm.SACM.Evidence.MeansThat
	 * @generated
	 */
	EClass getMeansThat();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.MeansThat#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meaning</em>'.
	 * @see net.certware.sacm.SACM.Evidence.MeansThat#getMeaning()
	 * @see #getMeansThat()
	 * @generated
	 */
	EReference getMeansThat_Meaning();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceElement
	 * @generated
	 */
	EClass getEvidenceElement();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceElement#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceElement#getTiming()
	 * @see #getEvidenceElement()
	 * @generated
	 */
	EReference getEvidenceElement_Timing();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceElement#getCustody <em>Custody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custody</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceElement#getCustody()
	 * @see #getEvidenceElement()
	 * @generated
	 */
	EReference getEvidenceElement_Custody();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceElement#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provenance</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceElement#getProvenance()
	 * @see #getEvidenceElement()
	 * @generated
	 */
	EReference getEvidenceElement_Provenance();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceElement#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceElement#getEvent()
	 * @see #getEvidenceElement()
	 * @generated
	 */
	EReference getEvidenceElement_Event();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.CareOf <em>Care Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Care Of</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CareOf
	 * @generated
	 */
	EClass getCareOf();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.CareOf#getCustodian <em>Custodian</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Custodian</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CareOf#getCustodian()
	 * @see #getCareOf()
	 * @generated
	 */
	EReference getCareOf_Custodian();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.CustodyProperty <em>Custody Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custody Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CustodyProperty
	 * @generated
	 */
	EClass getCustodyProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.AtLocation <em>At Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Location</em>'.
	 * @see net.certware.sacm.SACM.Evidence.AtLocation
	 * @generated
	 */
	EClass getAtLocation();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.AtLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see net.certware.sacm.SACM.Evidence.AtLocation#getLocation()
	 * @see #getAtLocation()
	 * @generated
	 */
	EReference getAtLocation_Location();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsCreatedAt <em>Is Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Created At</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsCreatedAt
	 * @generated
	 */
	EClass getIsCreatedAt();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.RequiresContainer <em>Requires Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires Container</em>'.
	 * @see net.certware.sacm.SACM.Evidence.RequiresContainer
	 * @generated
	 */
	EClass getRequiresContainer();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.RequiresContainer#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see net.certware.sacm.SACM.Evidence.RequiresContainer#getContainer()
	 * @see #getRequiresContainer()
	 * @generated
	 */
	EReference getRequiresContainer_Container();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ProjectProperty <em>Project Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ProjectProperty
	 * @generated
	 */
	EClass getProjectProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.HasElectronicSource <em>Has Electronic Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Electronic Source</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasElectronicSource
	 * @generated
	 */
	EClass getHasElectronicSource();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasElectronicSource#getSource()
	 * @see #getHasElectronicSource()
	 * @generated
	 */
	EAttribute getHasElectronicSource_Source();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasElectronicSource#getFormat()
	 * @see #getHasElectronicSource()
	 * @generated
	 */
	EAttribute getHasElectronicSource_Format();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasElectronicSource#getFileSize()
	 * @see #getHasElectronicSource()
	 * @generated
	 */
	EAttribute getHasElectronicSource_FileSize();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsExpressedInLanguage <em>Is Expressed In Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Expressed In Language</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsExpressedInLanguage
	 * @generated
	 */
	EClass getIsExpressedInLanguage();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.IsExpressedInLanguage#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsExpressedInLanguage#getLanguage()
	 * @see #getIsExpressedInLanguage()
	 * @generated
	 */
	EAttribute getIsExpressedInLanguage_Language();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.IsExpressedInLanguage#getIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsExpressedInLanguage#getIsPrimary()
	 * @see #getIsExpressedInLanguage()
	 * @generated
	 */
	EAttribute getIsExpressedInLanguage_IsPrimary();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.UsingProcess <em>Using Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using Process</em>'.
	 * @see net.certware.sacm.SACM.Evidence.UsingProcess
	 * @generated
	 */
	EClass getUsingProcess();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.UsingProcess#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see net.certware.sacm.SACM.Evidence.UsingProcess#getMethod()
	 * @see #getUsingProcess()
	 * @generated
	 */
	EReference getUsingProcess_Method();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.HasSecurityClassification <em>Has Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Security Classification</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasSecurityClassification
	 * @generated
	 */
	EClass getHasSecurityClassification();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.HasSecurityClassification#getSecurityClassification <em>Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Classification</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasSecurityClassification#getSecurityClassification()
	 * @see #getHasSecurityClassification()
	 * @generated
	 */
	EAttribute getHasSecurityClassification_SecurityClassification();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsReleaseableTo <em>Is Releaseable To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Releaseable To</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsReleaseableTo
	 * @generated
	 */
	EClass getIsReleaseableTo();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.IsReleaseableTo#getReleasability <em>Releasability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Releasability</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsReleaseableTo#getReleasability()
	 * @see #getIsReleaseableTo()
	 * @generated
	 */
	EAttribute getIsReleaseableTo_Releasability();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceGroup
	 * @generated
	 */
	EClass getEvidenceGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.EvidenceGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceGroup#getName()
	 * @see #getEvidenceGroup()
	 * @generated
	 */
	EAttribute getEvidenceGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Evidence.EvidenceGroup#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceGroup#getElement()
	 * @see #getEvidenceGroup()
	 * @generated
	 */
	EReference getEvidenceGroup_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.HasVersion <em>Has Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Version</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasVersion
	 * @generated
	 */
	EClass getHasVersion();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.HasVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasVersion#getVersion()
	 * @see #getHasVersion()
	 * @generated
	 */
	EAttribute getHasVersion_Version();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.HasMedia <em>Has Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Media</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasMedia
	 * @generated
	 */
	EClass getHasMedia();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.HasMedia#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media</em>'.
	 * @see net.certware.sacm.SACM.Evidence.HasMedia#getMedia()
	 * @see #getHasMedia()
	 * @generated
	 */
	EAttribute getHasMedia_Media();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Exhibit <em>Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exhibit</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Exhibit
	 * @generated
	 */
	EClass getExhibit();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Exhibit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Exhibit#getName()
	 * @see #getExhibit()
	 * @generated
	 */
	EAttribute getExhibit_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Exhibit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Exhibit#getUrl()
	 * @see #getExhibit()
	 * @generated
	 */
	EAttribute getExhibit_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Evidence.Exhibit#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Exhibit#getProperty()
	 * @see #getExhibit()
	 * @generated
	 */
	EReference getExhibit_Property();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.FormalElement <em>Formal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Element</em>'.
	 * @see net.certware.sacm.SACM.Evidence.FormalElement
	 * @generated
	 */
	EClass getFormalElement();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ExhibitProperty <em>Exhibit Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exhibit Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ExhibitProperty
	 * @generated
	 */
	EClass getExhibitProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpretation</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceInterpretation
	 * @generated
	 */
	EClass getEvidenceInterpretation();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.EvidenceInterpretation#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceInterpretation#getSubject()
	 * @see #getEvidenceInterpretation()
	 * @generated
	 */
	EReference getEvidenceInterpretation_Subject();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceAssertion
	 * @generated
	 */
	EClass getEvidenceAssertion();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.EvidenceProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.EvidenceProperty
	 * @generated
	 */
	EClass getEvidenceProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ExtendedEvidenceAttribute <em>Extended Evidence Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Evidence Attribute</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ExtendedEvidenceAttribute
	 * @generated
	 */
	EClass getExtendedEvidenceAttribute();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ExtendedDocumentProperty <em>Extended Document Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Document Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ExtendedDocumentProperty
	 * @generated
	 */
	EClass getExtendedDocumentProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.Record <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Record
	 * @generated
	 */
	EClass getRecord();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Record#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Record#getName()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.Record#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Record#getContent()
	 * @see #getRecord()
	 * @generated
	 */
	EAttribute getRecord_Content();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ObjectifiedAssertion <em>Objectified Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Objectified Assertion</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ObjectifiedAssertion
	 * @generated
	 */
	EClass getObjectifiedAssertion();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.ObjectifiedAssertion#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ObjectifiedAssertion#getAssertion()
	 * @see #getObjectifiedAssertion()
	 * @generated
	 */
	EReference getObjectifiedAssertion_Assertion();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.IsModifiedBy <em>Is Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Modified By</em>'.
	 * @see net.certware.sacm.SACM.Evidence.IsModifiedBy
	 * @generated
	 */
	EClass getIsModifiedBy();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.PerformedBy <em>Performed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performed By</em>'.
	 * @see net.certware.sacm.SACM.Evidence.PerformedBy
	 * @generated
	 */
	EClass getPerformedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.sacm.SACM.Evidence.PerformedBy#getExecutor <em>Executor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Executor</em>'.
	 * @see net.certware.sacm.SACM.Evidence.PerformedBy#getExecutor()
	 * @see #getPerformedBy()
	 * @generated
	 */
	EReference getPerformedBy_Executor();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ContainerConsistency <em>Container Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Consistency</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ContainerConsistency
	 * @generated
	 */
	EClass getContainerConsistency();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.ContainerConsistency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ContainerConsistency#getValue()
	 * @see #getContainerConsistency()
	 * @generated
	 */
	EAttribute getContainerConsistency_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ContainerCompleteness <em>Container Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Completeness</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ContainerCompleteness
	 * @generated
	 */
	EClass getContainerCompleteness();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.ContainerCompleteness#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ContainerCompleteness#getValue()
	 * @see #getContainerCompleteness()
	 * @generated
	 */
	EAttribute getContainerCompleteness_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.CompliesTo <em>Complies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complies To</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CompliesTo
	 * @generated
	 */
	EClass getCompliesTo();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Evidence.CompliesTo#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CompliesTo#getCriteria()
	 * @see #getCompliesTo()
	 * @generated
	 */
	EAttribute getCompliesTo_Criteria();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Evidence.ExtendedProjectProperty <em>Extended Project Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Project Property</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ExtendedProjectProperty
	 * @generated
	 */
	EClass getExtendedProjectProperty();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.ReliabilityLevel <em>Reliability Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ReliabilityLevel
	 * @generated
	 */
	EEnum getReliabilityLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.CompletenessLevel <em>Completeness Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Completeness Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.CompletenessLevel
	 * @generated
	 */
	EEnum getCompletenessLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.OriginalityLevel <em>Originality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Originality Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.OriginalityLevel
	 * @generated
	 */
	EEnum getOriginalityLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.ConsistencyLevel <em>Consistency Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consistency Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ConsistencyLevel
	 * @generated
	 */
	EEnum getConsistencyLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.SupportLevel <em>Support Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Support Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.SupportLevel
	 * @generated
	 */
	EEnum getSupportLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.ReportingLevel <em>Reporting Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reporting Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ReportingLevel
	 * @generated
	 */
	EEnum getReportingLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.ConfidenceLevel <em>Confidence Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidence Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.ConfidenceLevel
	 * @generated
	 */
	EEnum getConfidenceLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.AccuracyLevel <em>Accuracy Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accuracy Level</em>'.
	 * @see net.certware.sacm.SACM.Evidence.AccuracyLevel
	 * @generated
	 */
	EEnum getAccuracyLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.sacm.SACM.Evidence.StandardOfProof <em>Standard Of Proof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Of Proof</em>'.
	 * @see net.certware.sacm.SACM.Evidence.StandardOfProof
	 * @generated
	 */
	EEnum getStandardOfProof();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvidenceFactory getEvidenceFactory();

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
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceAttributeImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceAttribute()
		 * @generated
		 */
		EClass EVIDENCE_ATTRIBUTE = eINSTANCE.getEvidenceAttribute();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ConsistencyImpl <em>Consistency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ConsistencyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConsistency()
		 * @generated
		 */
		EClass CONSISTENCY = eINSTANCE.getConsistency();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSISTENCY__VALUE = eINSTANCE.getConsistency_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.CompletenessImpl <em>Completeness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.CompletenessImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCompleteness()
		 * @generated
		 */
		EClass COMPLETENESS = eINSTANCE.getCompleteness();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLETENESS__STATUS = eINSTANCE.getCompleteness_Status();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.DocumentImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__TITLE = eINSTANCE.getDocument_Title();

		/**
		 * The meta object literal for the '<em><b>Citation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__CITATION = eINSTANCE.getDocument_Citation();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ConfidenceImpl <em>Confidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ConfidenceImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConfidence()
		 * @generated
		 */
		EClass CONFIDENCE = eINSTANCE.getConfidence();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIDENCE__VALUE = eINSTANCE.getConfidence_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ApprovedByImpl <em>Approved By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ApprovedByImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getApprovedBy()
		 * @generated
		 */
		EClass APPROVED_BY = eINSTANCE.getApprovedBy();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVED_BY__SUPERVISOR = eINSTANCE.getApprovedBy_Supervisor();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.CreatedByImpl <em>Created By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.CreatedByImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCreatedBy()
		 * @generated
		 */
		EClass CREATED_BY = eINSTANCE.getCreatedBy();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATED_BY__SOURCE = eINSTANCE.getCreatedBy_Source();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ToolImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getTool()
		 * @generated
		 */
		EClass TOOL = eINSTANCE.getTool();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOL__VERSION = eINSTANCE.getTool_Version();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.MethodImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceItemImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceItem()
		 * @generated
		 */
		EClass EVIDENCE_ITEM = eINSTANCE.getEvidenceItem();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsBasedOnImpl <em>Is Based On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsBasedOnImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsBasedOn()
		 * @generated
		 */
		EClass IS_BASED_ON = eINSTANCE.getIsBasedOn();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_BASED_ON__SOURCE = eINSTANCE.getIsBasedOn_Source();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.FormalAssertionImpl <em>Formal Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.FormalAssertionImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getFormalAssertion()
		 * @generated
		 */
		EClass FORMAL_ASSERTION = eINSTANCE.getFormalAssertion();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_ASSERTION__CONTENT = eINSTANCE.getFormalAssertion_Content();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsAImpl <em>Is A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsAImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsA()
		 * @generated
		 */
		EClass IS_A = eINSTANCE.getIsA();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_A__DEFINITION = eINSTANCE.getIsA_Definition();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsCharacterizedByImpl <em>Is Characterized By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsCharacterizedByImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsCharacterizedBy()
		 * @generated
		 */
		EClass IS_CHARACTERIZED_BY = eINSTANCE.getIsCharacterizedBy();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_CHARACTERIZED_BY__ASSERTION = eINSTANCE.getIsCharacterizedBy_Assertion();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.PersonImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.OrganizationImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__ADDRESS = eINSTANCE.getOrganization_Address();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceContainerImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceContainer()
		 * @generated
		 */
		EClass EVIDENCE_CONTAINER = eINSTANCE.getEvidenceContainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE_CONTAINER__NAME = eINSTANCE.getEvidenceContainer_Name();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_CONTAINER__EVALUATION = eINSTANCE.getEvidenceContainer_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_CONTAINER__ITEM = eINSTANCE.getEvidenceContainer_Item();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE_CONTAINER__GID = eINSTANCE.getEvidenceContainer_Gid();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_CONTAINER__PROPERTY = eINSTANCE.getEvidenceContainer_Property();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE_CONTAINER__VERSION = eINSTANCE.getEvidenceContainer_Version();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_CONTAINER__ELEMENT = eINSTANCE.getEvidenceContainer_Element();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EndTimeImpl <em>End Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EndTimeImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEndTime()
		 * @generated
		 */
		EClass END_TIME = eINSTANCE.getEndTime();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TIME__DATETIME = eINSTANCE.getEndTime_Datetime();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.AssertionImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Facttype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__FACTTYPE = eINSTANCE.getAssertion_Facttype();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__ROLE = eINSTANCE.getAssertion_Role();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__DEFINITION = eINSTANCE.getAssertion_Definition();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ObjectImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__CONCEPT = eINSTANCE.getObject_Concept();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__DEFINITION = eINSTANCE.getObject_Definition();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.CompositeObjectImpl <em>Composite Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.CompositeObjectImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCompositeObject()
		 * @generated
		 */
		EClass COMPOSITE_OBJECT = eINSTANCE.getCompositeObject();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_OBJECT__ELEMENT = eINSTANCE.getCompositeObject_Element();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.RoleBindingImpl <em>Role Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.RoleBindingImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRoleBinding()
		 * @generated
		 */
		EClass ROLE_BINDING = eINSTANCE.getRoleBinding();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BINDING__ROLE = eINSTANCE.getRoleBinding_Role();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING__SUBJECT = eINSTANCE.getRoleBinding_Subject();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.StartTimeImpl <em>Start Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.StartTimeImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getStartTime()
		 * @generated
		 */
		EClass START_TIME = eINSTANCE.getStartTime();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_TIME__DATETIME = eINSTANCE.getStartTime_Datetime();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.RelevanceImpl <em>Relevance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.RelevanceImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRelevance()
		 * @generated
		 */
		EClass RELEVANCE = eINSTANCE.getRelevance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEVANCE__VALUE = eINSTANCE.getRelevance_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.SignificanceImpl <em>Significance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.SignificanceImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSignificance()
		 * @generated
		 */
		EClass SIGNIFICANCE = eINSTANCE.getSignificance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNIFICANCE__VALUE = eINSTANCE.getSignificance_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.AccuracyImpl <em>Accuracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.AccuracyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAccuracy()
		 * @generated
		 */
		EClass ACCURACY = eINSTANCE.getAccuracy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCURACY__VALUE = eINSTANCE.getAccuracy_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.HasRoleInImpl <em>Has Role In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.HasRoleInImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasRoleIn()
		 * @generated
		 */
		EClass HAS_ROLE_IN = eINSTANCE.getHasRoleIn();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_ROLE_IN__ROLE = eINSTANCE.getHasRoleIn_Role();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_ROLE_IN__ORGANIZATION = eINSTANCE.getHasRoleIn_Organization();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsScopedByImpl <em>Is Scoped By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsScopedByImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsScopedBy()
		 * @generated
		 */
		EClass IS_SCOPED_BY = eINSTANCE.getIsScopedBy();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SCOPED_BY__SCOPE = eINSTANCE.getIsScopedBy_Scope();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EffectiveTimeImpl <em>Effective Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EffectiveTimeImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEffectiveTime()
		 * @generated
		 */
		EClass EFFECTIVE_TIME = eINSTANCE.getEffectiveTime();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.AtTimeImpl <em>At Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.AtTimeImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAtTime()
		 * @generated
		 */
		EClass AT_TIME = eINSTANCE.getAtTime();

		/**
		 * The meta object literal for the '<em><b>Date Ttime</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AT_TIME__DATE_TTIME = eINSTANCE.getAtTime_DateTtime();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.OriginalityImpl <em>Originality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.OriginalityImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getOriginality()
		 * @generated
		 */
		EClass ORIGINALITY = eINSTANCE.getOriginality();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIGINALITY__VALUE = eINSTANCE.getOriginality_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ReportingImpl <em>Reporting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ReportingImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReporting()
		 * @generated
		 */
		EClass REPORTING = eINSTANCE.getReporting();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORTING__VALUE = eINSTANCE.getReporting_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ReliabilityImpl <em>Reliability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ReliabilityImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReliability()
		 * @generated
		 */
		EClass RELIABILITY = eINSTANCE.getReliability();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__VALUE = eINSTANCE.getReliability_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.SupportsImpl <em>Supports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.SupportsImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSupports()
		 * @generated
		 */
		EClass SUPPORTS = eINSTANCE.getSupports();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsGeneratedAtImpl <em>Is Generated At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsGeneratedAtImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsGeneratedAt()
		 * @generated
		 */
		EClass IS_GENERATED_AT = eINSTANCE.getIsGeneratedAt();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.CollectionMethodImpl <em>Collection Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.CollectionMethodImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCollectionMethod()
		 * @generated
		 */
		EClass COLLECTION_METHOD = eINSTANCE.getCollectionMethod();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceRelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceRelationImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceRelation()
		 * @generated
		 */
		EClass EVIDENCE_RELATION = eINSTANCE.getEvidenceRelation();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_RELATION__ASSERTION = eINSTANCE.getEvidenceRelation_Assertion();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_RELATION__SUBJECT = eINSTANCE.getEvidenceRelation_Subject();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.SupportImpl <em>Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.SupportImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSupport()
		 * @generated
		 */
		EClass SUPPORT = eINSTANCE.getSupport();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORT__VALUE = eINSTANCE.getSupport_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ConflictsImpl <em>Conflicts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ConflictsImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConflicts()
		 * @generated
		 */
		EClass CONFLICTS = eINSTANCE.getConflicts();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICTS__ASSERTION = eINSTANCE.getConflicts_Assertion();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICTS__SUBJECT = eINSTANCE.getConflicts_Subject();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.RefutesImpl <em>Refutes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.RefutesImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRefutes()
		 * @generated
		 */
		EClass REFUTES = eINSTANCE.getRefutes();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFUTES__ELEMENT = eINSTANCE.getRefutes_Element();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.NegatesImpl <em>Negates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.NegatesImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getNegates()
		 * @generated
		 */
		EClass NEGATES = eINSTANCE.getNegates();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATES__ELEMENT = eINSTANCE.getNegates_Element();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.UnknownObjectImpl <em>Unknown Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.UnknownObjectImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getUnknownObject()
		 * @generated
		 */
		EClass UNKNOWN_OBJECT = eINSTANCE.getUnknownObject();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceEvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceEvaluationImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceEvaluation()
		 * @generated
		 */
		EClass EVIDENCE_EVALUATION = eINSTANCE.getEvidenceEvaluation();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_EVALUATION__ATTRIBUTE = eINSTANCE.getEvidenceEvaluation_Attribute();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ResolvesImpl <em>Resolves</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ResolvesImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getResolves()
		 * @generated
		 */
		EClass RESOLVES = eINSTANCE.getResolves();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOLVES__ELEMENT = eINSTANCE.getResolves_Element();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.StakeholderImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceRequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceRequestImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceRequest()
		 * @generated
		 */
		EClass EVIDENCE_REQUEST = eINSTANCE.getEvidenceRequest();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_REQUEST__ITEM = eINSTANCE.getEvidenceRequest_Item();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ProjectObjectiveImpl <em>Project Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ProjectObjectiveImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProjectObjective()
		 * @generated
		 */
		EClass PROJECT_OBJECTIVE = eINSTANCE.getProjectObjective();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ActivityImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.DependsOnImpl <em>Depends On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.DependsOnImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getDependsOn()
		 * @generated
		 */
		EClass DEPENDS_ON = eINSTANCE.getDependsOn();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDS_ON__ELEMENT = eINSTANCE.getDependsOn_Element();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.SatisfiesImpl <em>Satisfies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.SatisfiesImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSatisfies()
		 * @generated
		 */
		EClass SATISFIES = eINSTANCE.getSatisfies();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFIES__ELEMENT = eINSTANCE.getSatisfies_Element();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ProjectElementImpl <em>Project Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ProjectElementImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProjectElement()
		 * @generated
		 */
		EClass PROJECT_ELEMENT = eINSTANCE.getProjectElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_ELEMENT__NAME = eINSTANCE.getProjectElement_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_ELEMENT__CONTENT = eINSTANCE.getProjectElement_Content();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_ELEMENT__PROPERTY = eINSTANCE.getProjectElement_Property();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ReferencedClaimImpl <em>Referenced Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ReferencedClaimImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReferencedClaim()
		 * @generated
		 */
		EClass REFERENCED_CLAIM = eINSTANCE.getReferencedClaim();

		/**
		 * The meta object literal for the '<em><b>Claim</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_CLAIM__CLAIM = eINSTANCE.getReferencedClaim_Claim();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceObservationImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceObservation()
		 * @generated
		 */
		EClass EVIDENCE_OBSERVATION = eINSTANCE.getEvidenceObservation();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceResolutionImpl <em>Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceResolutionImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceResolution()
		 * @generated
		 */
		EClass EVIDENCE_RESOLUTION = eINSTANCE.getEvidenceResolution();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_RESOLUTION__SUBJECT = eINSTANCE.getEvidenceResolution_Subject();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.WeakensImpl <em>Weakens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.WeakensImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getWeakens()
		 * @generated
		 */
		EClass WEAKENS = eINSTANCE.getWeakens();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.AmplifiesImpl <em>Amplifies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.AmplifiesImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAmplifies()
		 * @generated
		 */
		EClass AMPLIFIES = eINSTANCE.getAmplifies();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ContributesImpl <em>Contributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ContributesImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getContributes()
		 * @generated
		 */
		EClass CONTRIBUTES = eINSTANCE.getContributes();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTES__SUBJECT = eINSTANCE.getContributes_Subject();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTES__RELATION = eINSTANCE.getContributes_Relation();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ChallengesImpl <em>Challenges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ChallengesImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getChallenges()
		 * @generated
		 */
		EClass CHALLENGES = eINSTANCE.getChallenges();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.StrengthImpl <em>Strength</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.StrengthImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getStrength()
		 * @generated
		 */
		EClass STRENGTH = eINSTANCE.getStrength();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRENGTH__VALUE = eINSTANCE.getStrength_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsAcquiredAtImpl <em>Is Acquired At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsAcquiredAtImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsAcquiredAt()
		 * @generated
		 */
		EClass IS_ACQUIRED_AT = eINSTANCE.getIsAcquiredAt();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsTransferredToImpl <em>Is Transferred To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsTransferredToImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsTransferredTo()
		 * @generated
		 */
		EClass IS_TRANSFERRED_TO = eINSTANCE.getIsTransferredTo();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.DocumentPropertyImpl <em>Document Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.DocumentPropertyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getDocumentProperty()
		 * @generated
		 */
		EClass DOCUMENT_PROPERTY = eINSTANCE.getDocumentProperty();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceEventImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceEvent()
		 * @generated
		 */
		EClass EVIDENCE_EVENT = eINSTANCE.getEvidenceEvent();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.OwnedByImpl <em>Owned By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.OwnedByImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getOwnedBy()
		 * @generated
		 */
		EClass OWNED_BY = eINSTANCE.getOwnedBy();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNED_BY__OWNER = eINSTANCE.getOwnedBy_Owner();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ProvenanceImpl <em>Provenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ProvenanceImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProvenance()
		 * @generated
		 */
		EClass PROVENANCE = eINSTANCE.getProvenance();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.TimingPropertyImpl <em>Timing Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.TimingPropertyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getTimingProperty()
		 * @generated
		 */
		EClass TIMING_PROPERTY = eINSTANCE.getTimingProperty();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsPartOfImpl <em>Is Part Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsPartOfImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsPartOf()
		 * @generated
		 */
		EClass IS_PART_OF = eINSTANCE.getIsPartOf();

		/**
		 * The meta object literal for the '<em><b>Whole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_PART_OF__WHOLE = eINSTANCE.getIsPartOf_Whole();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsRevokedAtImpl <em>Is Revoked At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsRevokedAtImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsRevokedAt()
		 * @generated
		 */
		EClass IS_REVOKED_AT = eINSTANCE.getIsRevokedAt();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ProvidesContextImpl <em>Provides Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ProvidesContextImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProvidesContext()
		 * @generated
		 */
		EClass PROVIDES_CONTEXT = eINSTANCE.getProvidesContext();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_CONTEXT__CONTEXT = eINSTANCE.getProvidesContext_Context();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.FormalObjectImpl <em>Formal Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.FormalObjectImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getFormalObject()
		 * @generated
		 */
		EClass FORMAL_OBJECT = eINSTANCE.getFormalObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_OBJECT__NAME = eINSTANCE.getFormalObject_Name();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.MeansThatImpl <em>Means That</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.MeansThatImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getMeansThat()
		 * @generated
		 */
		EClass MEANS_THAT = eINSTANCE.getMeansThat();

		/**
		 * The meta object literal for the '<em><b>Meaning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEANS_THAT__MEANING = eINSTANCE.getMeansThat_Meaning();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceElementImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceElement()
		 * @generated
		 */
		EClass EVIDENCE_ELEMENT = eINSTANCE.getEvidenceElement();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_ELEMENT__TIMING = eINSTANCE.getEvidenceElement_Timing();

		/**
		 * The meta object literal for the '<em><b>Custody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_ELEMENT__CUSTODY = eINSTANCE.getEvidenceElement_Custody();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_ELEMENT__PROVENANCE = eINSTANCE.getEvidenceElement_Provenance();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_ELEMENT__EVENT = eINSTANCE.getEvidenceElement_Event();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.CareOfImpl <em>Care Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.CareOfImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCareOf()
		 * @generated
		 */
		EClass CARE_OF = eINSTANCE.getCareOf();

		/**
		 * The meta object literal for the '<em><b>Custodian</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARE_OF__CUSTODIAN = eINSTANCE.getCareOf_Custodian();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.CustodyPropertyImpl <em>Custody Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.CustodyPropertyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCustodyProperty()
		 * @generated
		 */
		EClass CUSTODY_PROPERTY = eINSTANCE.getCustodyProperty();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.AtLocationImpl <em>At Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.AtLocationImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAtLocation()
		 * @generated
		 */
		EClass AT_LOCATION = eINSTANCE.getAtLocation();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AT_LOCATION__LOCATION = eINSTANCE.getAtLocation_Location();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsCreatedAtImpl <em>Is Created At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsCreatedAtImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsCreatedAt()
		 * @generated
		 */
		EClass IS_CREATED_AT = eINSTANCE.getIsCreatedAt();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.RequiresContainerImpl <em>Requires Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.RequiresContainerImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRequiresContainer()
		 * @generated
		 */
		EClass REQUIRES_CONTAINER = eINSTANCE.getRequiresContainer();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES_CONTAINER__CONTAINER = eINSTANCE.getRequiresContainer_Container();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ProjectPropertyImpl <em>Project Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ProjectPropertyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getProjectProperty()
		 * @generated
		 */
		EClass PROJECT_PROPERTY = eINSTANCE.getProjectProperty();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ServiceImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.HasElectronicSourceImpl <em>Has Electronic Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.HasElectronicSourceImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasElectronicSource()
		 * @generated
		 */
		EClass HAS_ELECTRONIC_SOURCE = eINSTANCE.getHasElectronicSource();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_ELECTRONIC_SOURCE__SOURCE = eINSTANCE.getHasElectronicSource_Source();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_ELECTRONIC_SOURCE__FORMAT = eINSTANCE.getHasElectronicSource_Format();

		/**
		 * The meta object literal for the '<em><b>File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_ELECTRONIC_SOURCE__FILE_SIZE = eINSTANCE.getHasElectronicSource_FileSize();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsExpressedInLanguageImpl <em>Is Expressed In Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsExpressedInLanguageImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsExpressedInLanguage()
		 * @generated
		 */
		EClass IS_EXPRESSED_IN_LANGUAGE = eINSTANCE.getIsExpressedInLanguage();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_EXPRESSED_IN_LANGUAGE__LANGUAGE = eINSTANCE.getIsExpressedInLanguage_Language();

		/**
		 * The meta object literal for the '<em><b>Is Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_EXPRESSED_IN_LANGUAGE__IS_PRIMARY = eINSTANCE.getIsExpressedInLanguage_IsPrimary();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.UsingProcessImpl <em>Using Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.UsingProcessImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getUsingProcess()
		 * @generated
		 */
		EClass USING_PROCESS = eINSTANCE.getUsingProcess();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USING_PROCESS__METHOD = eINSTANCE.getUsingProcess_Method();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.HasSecurityClassificationImpl <em>Has Security Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.HasSecurityClassificationImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasSecurityClassification()
		 * @generated
		 */
		EClass HAS_SECURITY_CLASSIFICATION = eINSTANCE.getHasSecurityClassification();

		/**
		 * The meta object literal for the '<em><b>Security Classification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_SECURITY_CLASSIFICATION__SECURITY_CLASSIFICATION = eINSTANCE.getHasSecurityClassification_SecurityClassification();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsReleaseableToImpl <em>Is Releaseable To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsReleaseableToImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsReleaseableTo()
		 * @generated
		 */
		EClass IS_RELEASEABLE_TO = eINSTANCE.getIsReleaseableTo();

		/**
		 * The meta object literal for the '<em><b>Releasability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IS_RELEASEABLE_TO__RELEASABILITY = eINSTANCE.getIsReleaseableTo_Releasability();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceGroupImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceGroup()
		 * @generated
		 */
		EClass EVIDENCE_GROUP = eINSTANCE.getEvidenceGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE_GROUP__NAME = eINSTANCE.getEvidenceGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_GROUP__ELEMENT = eINSTANCE.getEvidenceGroup_Element();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.HasVersionImpl <em>Has Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.HasVersionImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasVersion()
		 * @generated
		 */
		EClass HAS_VERSION = eINSTANCE.getHasVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_VERSION__VERSION = eINSTANCE.getHasVersion_Version();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.HasMediaImpl <em>Has Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.HasMediaImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getHasMedia()
		 * @generated
		 */
		EClass HAS_MEDIA = eINSTANCE.getHasMedia();

		/**
		 * The meta object literal for the '<em><b>Media</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_MEDIA__MEDIA = eINSTANCE.getHasMedia_Media();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ExhibitImpl <em>Exhibit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ExhibitImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExhibit()
		 * @generated
		 */
		EClass EXHIBIT = eINSTANCE.getExhibit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXHIBIT__NAME = eINSTANCE.getExhibit_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXHIBIT__URL = eINSTANCE.getExhibit_Url();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXHIBIT__PROPERTY = eINSTANCE.getExhibit_Property();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.FormalElementImpl <em>Formal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.FormalElementImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getFormalElement()
		 * @generated
		 */
		EClass FORMAL_ELEMENT = eINSTANCE.getFormalElement();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ExhibitPropertyImpl <em>Exhibit Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ExhibitPropertyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExhibitProperty()
		 * @generated
		 */
		EClass EXHIBIT_PROPERTY = eINSTANCE.getExhibitProperty();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceInterpretationImpl <em>Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceInterpretationImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceInterpretation()
		 * @generated
		 */
		EClass EVIDENCE_INTERPRETATION = eINSTANCE.getEvidenceInterpretation();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_INTERPRETATION__SUBJECT = eINSTANCE.getEvidenceInterpretation_Subject();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidenceAssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidenceAssertionImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceAssertion()
		 * @generated
		 */
		EClass EVIDENCE_ASSERTION = eINSTANCE.getEvidenceAssertion();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.EvidencePropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePropertyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getEvidenceProperty()
		 * @generated
		 */
		EClass EVIDENCE_PROPERTY = eINSTANCE.getEvidenceProperty();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ExtendedEvidenceAttributeImpl <em>Extended Evidence Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ExtendedEvidenceAttributeImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExtendedEvidenceAttribute()
		 * @generated
		 */
		EClass EXTENDED_EVIDENCE_ATTRIBUTE = eINSTANCE.getExtendedEvidenceAttribute();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ExtendedDocumentPropertyImpl <em>Extended Document Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ExtendedDocumentPropertyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExtendedDocumentProperty()
		 * @generated
		 */
		EClass EXTENDED_DOCUMENT_PROPERTY = eINSTANCE.getExtendedDocumentProperty();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.RecordImpl <em>Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.RecordImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getRecord()
		 * @generated
		 */
		EClass RECORD = eINSTANCE.getRecord();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__NAME = eINSTANCE.getRecord_Name();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD__CONTENT = eINSTANCE.getRecord_Content();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ObjectifiedAssertionImpl <em>Objectified Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ObjectifiedAssertionImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getObjectifiedAssertion()
		 * @generated
		 */
		EClass OBJECTIFIED_ASSERTION = eINSTANCE.getObjectifiedAssertion();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECTIFIED_ASSERTION__ASSERTION = eINSTANCE.getObjectifiedAssertion_Assertion();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.IsModifiedByImpl <em>Is Modified By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.IsModifiedByImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getIsModifiedBy()
		 * @generated
		 */
		EClass IS_MODIFIED_BY = eINSTANCE.getIsModifiedBy();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.PerformedByImpl <em>Performed By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.PerformedByImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getPerformedBy()
		 * @generated
		 */
		EClass PERFORMED_BY = eINSTANCE.getPerformedBy();

		/**
		 * The meta object literal for the '<em><b>Executor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORMED_BY__EXECUTOR = eINSTANCE.getPerformedBy_Executor();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ContainerConsistencyImpl <em>Container Consistency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ContainerConsistencyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getContainerConsistency()
		 * @generated
		 */
		EClass CONTAINER_CONSISTENCY = eINSTANCE.getContainerConsistency();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CONSISTENCY__VALUE = eINSTANCE.getContainerConsistency_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ContainerCompletenessImpl <em>Container Completeness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ContainerCompletenessImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getContainerCompleteness()
		 * @generated
		 */
		EClass CONTAINER_COMPLETENESS = eINSTANCE.getContainerCompleteness();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_COMPLETENESS__VALUE = eINSTANCE.getContainerCompleteness_Value();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.CompliesToImpl <em>Complies To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.CompliesToImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCompliesTo()
		 * @generated
		 */
		EClass COMPLIES_TO = eINSTANCE.getCompliesTo();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIES_TO__CRITERIA = eINSTANCE.getCompliesTo_Criteria();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.impl.ExtendedProjectPropertyImpl <em>Extended Project Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.impl.ExtendedProjectPropertyImpl
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getExtendedProjectProperty()
		 * @generated
		 */
		EClass EXTENDED_PROJECT_PROPERTY = eINSTANCE.getExtendedProjectProperty();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.ReliabilityLevel <em>Reliability Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.ReliabilityLevel
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReliabilityLevel()
		 * @generated
		 */
		EEnum RELIABILITY_LEVEL = eINSTANCE.getReliabilityLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.CompletenessLevel <em>Completeness Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.CompletenessLevel
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getCompletenessLevel()
		 * @generated
		 */
		EEnum COMPLETENESS_LEVEL = eINSTANCE.getCompletenessLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.OriginalityLevel <em>Originality Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.OriginalityLevel
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getOriginalityLevel()
		 * @generated
		 */
		EEnum ORIGINALITY_LEVEL = eINSTANCE.getOriginalityLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.ConsistencyLevel <em>Consistency Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.ConsistencyLevel
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConsistencyLevel()
		 * @generated
		 */
		EEnum CONSISTENCY_LEVEL = eINSTANCE.getConsistencyLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.Level
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.SupportLevel <em>Support Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.SupportLevel
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getSupportLevel()
		 * @generated
		 */
		EEnum SUPPORT_LEVEL = eINSTANCE.getSupportLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.ReportingLevel <em>Reporting Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.ReportingLevel
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getReportingLevel()
		 * @generated
		 */
		EEnum REPORTING_LEVEL = eINSTANCE.getReportingLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.ConfidenceLevel <em>Confidence Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.ConfidenceLevel
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getConfidenceLevel()
		 * @generated
		 */
		EEnum CONFIDENCE_LEVEL = eINSTANCE.getConfidenceLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.AccuracyLevel <em>Accuracy Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.AccuracyLevel
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getAccuracyLevel()
		 * @generated
		 */
		EEnum ACCURACY_LEVEL = eINSTANCE.getAccuracyLevel();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Evidence.StandardOfProof <em>Standard Of Proof</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Evidence.StandardOfProof
		 * @see net.certware.sacm.SACM.Evidence.impl.EvidencePackageImpl#getStandardOfProof()
		 * @generated
		 */
		EEnum STANDARD_OF_PROOF = eINSTANCE.getStandardOfProof();

	}

} //EvidencePackage
