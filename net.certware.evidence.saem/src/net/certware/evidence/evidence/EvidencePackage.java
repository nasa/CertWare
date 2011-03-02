/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence;

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
 * @see net.certware.evidence.evidence.EvidenceFactory
 * @model kind="package"
 * @generated
 */
public interface EvidencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evidence"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///evidence.ecore"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "evidence"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvidencePackage eINSTANCE = net.certware.evidence.evidence.impl.EvidencePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ElementImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvaluationAttributeImpl <em>Evaluation Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvaluationAttributeImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvaluationAttribute()
	 * @generated
	 */
	int EVALUATION_ATTRIBUTE = 96;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ATTRIBUTE__PROVENANCE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ATTRIBUTE__TIMING = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluation Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATION_ATTRIBUTE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceAttributeImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceAttribute()
	 * @generated
	 */
	int EVIDENCE_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__PROVENANCE = EVALUATION_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE__TIMING = EVALUATION_ATTRIBUTE__TIMING;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ATTRIBUTE_FEATURE_COUNT = EVALUATION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.DocumentAttributeImpl <em>Document Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.DocumentAttributeImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDocumentAttribute()
	 * @generated
	 */
	int DOCUMENT_ATTRIBUTE = 68;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATTRIBUTE__PROVENANCE = EVALUATION_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATTRIBUTE__TIMING = EVALUATION_ATTRIBUTE__TIMING;

	/**
	 * The number of structural features of the '<em>Document Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ATTRIBUTE_FEATURE_COUNT = EVALUATION_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ConsistencyImpl <em>Consistency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ConsistencyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConsistency()
	 * @generated
	 */
	int CONSISTENCY = 1;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__PROVENANCE = DOCUMENT_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__TIMING = DOCUMENT_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY__VALUE = DOCUMENT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Consistency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSISTENCY_FEATURE_COUNT = DOCUMENT_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.CompletenessImpl <em>Completeness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.CompletenessImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCompleteness()
	 * @generated
	 */
	int COMPLETENESS = 2;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__PROVENANCE = DOCUMENT_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__TIMING = DOCUMENT_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS__STATUS = DOCUMENT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Completeness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLETENESS_FEATURE_COUNT = DOCUMENT_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceElementImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceElement()
	 * @generated
	 */
	int EVIDENCE_ELEMENT = 78;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__ID = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__DESCRIPTION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__PROVENANCE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT__TIMING = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceItemImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceItem()
	 * @generated
	 */
	int EVIDENCE_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__ID = EVIDENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__DESCRIPTION = EVIDENCE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__PROVENANCE = EVIDENCE_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__TIMING = EVIDENCE_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM__EVENT = EVIDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ITEM_FEATURE_COUNT = EVIDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ExhibitImpl <em>Exhibit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ExhibitImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getExhibit()
	 * @generated
	 */
	int EXHIBIT = 99;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__ID = EVIDENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__DESCRIPTION = EVIDENCE_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__PROVENANCE = EVIDENCE_ITEM__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__TIMING = EVIDENCE_ITEM__TIMING;

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
	 * The feature id for the '<em><b>Exhibit Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__EXHIBIT_PROPERTY = EVIDENCE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Exhibit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_FEATURE_COUNT = EVIDENCE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.DocumentImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = EXHIBIT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DESCRIPTION = EXHIBIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PROVENANCE = EXHIBIT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TIMING = EXHIBIT__TIMING;

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
	 * The feature id for the '<em><b>Exhibit Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__EXHIBIT_PROPERTY = EXHIBIT__EXHIBIT_PROPERTY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TITLE = EXHIBIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PROPERTY = EXHIBIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ATTRIBUTE = EXHIBIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = EXHIBIT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ConfidenceImpl <em>Confidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ConfidenceImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConfidence()
	 * @generated
	 */
	int CONFIDENCE = 5;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIDENCE__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidencePropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidencePropertyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceProperty()
	 * @generated
	 */
	int EVIDENCE_PROPERTY = 85;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_PROPERTY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ProvenanceImpl <em>Provenance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ProvenanceImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getProvenance()
	 * @generated
	 */
	int PROVENANCE = 71;

	/**
	 * The number of structural features of the '<em>Provenance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVENANCE_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ApprovedByImpl <em>Approved By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ApprovedByImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getApprovedBy()
	 * @generated
	 */
	int APPROVED_BY = 6;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.DescriptionImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__TEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.CreatedByImpl <em>Created By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.CreatedByImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCreatedBy()
	 * @generated
	 */
	int CREATED_BY = 8;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.MeaningImpl <em>Meaning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.MeaningImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getMeaning()
	 * @generated
	 */
	int MEANING = 100;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__ID = EVIDENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__DESCRIPTION = EVIDENCE_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__PROVENANCE = EVIDENCE_ITEM__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__TIMING = EVIDENCE_ITEM__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING__EVENT = EVIDENCE_ITEM__EVENT;

	/**
	 * The number of structural features of the '<em>Meaning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANING_FEATURE_COUNT = EVIDENCE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.DomainObjectImpl <em>Domain Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.DomainObjectImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDomainObject()
	 * @generated
	 */
	int DOMAIN_OBJECT = 76;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__ID = MEANING__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__DESCRIPTION = MEANING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__PROVENANCE = MEANING__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__TIMING = MEANING__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__EVENT = MEANING__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT__NAME = MEANING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OBJECT_FEATURE_COUNT = MEANING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.FormalObjectImpl <em>Formal Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.FormalObjectImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getFormalObject()
	 * @generated
	 */
	int FORMAL_OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__ID = DOMAIN_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__DESCRIPTION = DOMAIN_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__PROVENANCE = DOMAIN_OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__TIMING = DOMAIN_OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__EVENT = DOMAIN_OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__CONCEPT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT__URL = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formal Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_OBJECT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ObjectImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID = FORMAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DESCRIPTION = FORMAL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__PROVENANCE = FORMAL_OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__TIMING = FORMAL_OBJECT__TIMING;

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
	int OBJECT__CONCEPT = FORMAL_OBJECT__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__URL = FORMAL_OBJECT__URL;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = FORMAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.CollectionMethodImpl <em>Collection Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.CollectionMethodImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCollectionMethod()
	 * @generated
	 */
	int COLLECTION_METHOD = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__DESCRIPTION = OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__PROVENANCE = OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__TIMING = OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__EVENT = OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__CONCEPT = OBJECT__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD__URL = OBJECT__URL;

	/**
	 * The number of structural features of the '<em>Collection Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_METHOD_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ToolImpl <em>Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ToolImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getTool()
	 * @generated
	 */
	int TOOL = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__ID = COLLECTION_METHOD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__DESCRIPTION = COLLECTION_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__PROVENANCE = COLLECTION_METHOD__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__TIMING = COLLECTION_METHOD__TIMING;

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
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__CONCEPT = COLLECTION_METHOD__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL__URL = COLLECTION_METHOD__URL;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.MethodImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ID = COLLECTION_METHOD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__DESCRIPTION = COLLECTION_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PROVENANCE = COLLECTION_METHOD__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TIMING = COLLECTION_METHOD__TIMING;

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
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__CONCEPT = COLLECTION_METHOD__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__URL = COLLECTION_METHOD__URL;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TOOL = COLLECTION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = COLLECTION_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.RequiresToolImpl <em>Requires Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.RequiresToolImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRequiresTool()
	 * @generated
	 */
	int REQUIRES_TOOL = 11;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TOOL__TOOL = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requires Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_TOOL_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.DocumentPropertyImpl <em>Document Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.DocumentPropertyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDocumentProperty()
	 * @generated
	 */
	int DOCUMENT_PROPERTY = 88;

	/**
	 * The number of structural features of the '<em>Document Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_PROPERTY_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsBasedOnImpl <em>Is Based On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsBasedOnImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsBasedOn()
	 * @generated
	 */
	int IS_BASED_ON = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON__SOURCE = DOCUMENT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Based On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_BASED_ON_FEATURE_COUNT = DOCUMENT_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.DomainAssertionImpl <em>Domain Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.DomainAssertionImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDomainAssertion()
	 * @generated
	 */
	int DOMAIN_ASSERTION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSERTION__ID = MEANING__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSERTION__DESCRIPTION = MEANING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSERTION__PROVENANCE = MEANING__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSERTION__TIMING = MEANING__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSERTION__EVENT = MEANING__EVENT;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSERTION__STMT = MEANING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ASSERTION_FEATURE_COUNT = MEANING_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceEvaluationImpl <em>Evaluation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceEvaluationImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceEvaluation()
	 * @generated
	 */
	int EVIDENCE_EVALUATION = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__ID = EVIDENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__DESCRIPTION = EVIDENCE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__PROVENANCE = EVIDENCE_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__TIMING = EVIDENCE_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION__ATTRIBUTE = EVIDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVALUATION_FEATURE_COUNT = EVIDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceInterpretationImpl <em>Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceInterpretationImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceInterpretation()
	 * @generated
	 */
	int EVIDENCE_INTERPRETATION = 102;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__DESCRIPTION = EVIDENCE_EVALUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION__ELEMENT = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_INTERPRETATION_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsAImpl <em>Is A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsAImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsA()
	 * @generated
	 */
	int IS_A = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__DESCRIPTION = EVIDENCE_INTERPRETATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_A__ELEMENT = EVIDENCE_INTERPRETATION__ELEMENT;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsCharacterizedByImpl <em>Is Characterized By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsCharacterizedByImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsCharacterizedBy()
	 * @generated
	 */
	int IS_CHARACTERIZED_BY = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__DESCRIPTION = EVIDENCE_INTERPRETATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__ELEMENT = EVIDENCE_INTERPRETATION__ELEMENT;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY__PROPERTY = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Characterized By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CHARACTERIZED_BY_FEATURE_COUNT = EVIDENCE_INTERPRETATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.OriginatorImpl <em>Originator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.OriginatorImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOriginator()
	 * @generated
	 */
	int ORIGINATOR = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__ID = OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__DESCRIPTION = OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__PROVENANCE = OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__TIMING = OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__EVENT = OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__NAME = OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__CONCEPT = OBJECT__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR__URL = OBJECT__URL;

	/**
	 * The number of structural features of the '<em>Originator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINATOR_FEATURE_COUNT = OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.PersonImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = ORIGINATOR__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = ORIGINATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PROVENANCE = ORIGINATOR__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TIMING = ORIGINATOR__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EVENT = ORIGINATOR__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = ORIGINATOR__NAME;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CONCEPT = ORIGINATOR__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__URL = ORIGINATOR__URL;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__AFFILIATION = ORIGINATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = ORIGINATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.OrganizationImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = ORIGINATOR__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = ORIGINATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PROVENANCE = ORIGINATOR__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TIMING = ORIGINATOR__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EVENT = ORIGINATOR__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = ORIGINATOR__NAME;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CONCEPT = ORIGINATOR__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__URL = ORIGINATOR__URL;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ADDRESS = ORIGINATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Affiliation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__AFFILIATION = ORIGINATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = ORIGINATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.AdministrativeElementImpl <em>Administrative Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.AdministrativeElementImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAdministrativeElement()
	 * @generated
	 */
	int ADMINISTRATIVE_ELEMENT = 57;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_ELEMENT__ID = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_ELEMENT__DESCRIPTION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Administrative Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.PackageImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ID = ADMINISTRATIVE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = ADMINISTRATIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = ADMINISTRATIVE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Consistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CONSISTENCY = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__VERSION = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CRITERIA = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Completeness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__COMPLETENESS = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__METHOD = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Originator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ORIGINATOR = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REQUEST = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OBJECTIVE = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ACTIVITY = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ITEM = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Requires Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__REQUIRES_PACKAGE = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EVALUATION = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.TimingPropertyImpl <em>Timing Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.TimingPropertyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getTimingProperty()
	 * @generated
	 */
	int TIMING_PROPERTY = 72;

	/**
	 * The number of structural features of the '<em>Timing Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PROPERTY_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EffectiveTimeImpl <em>Effective Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EffectiveTimeImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEffectiveTime()
	 * @generated
	 */
	int EFFECTIVE_TIME = 32;

	/**
	 * The number of structural features of the '<em>Effective Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECTIVE_TIME_FEATURE_COUNT = TIMING_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EndTimeImpl <em>End Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EndTimeImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEndTime()
	 * @generated
	 */
	int END_TIME = 20;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.AssertionImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ID = DOMAIN_ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DESCRIPTION = DOMAIN_ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__PROVENANCE = DOMAIN_ASSERTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__TIMING = DOMAIN_ASSERTION__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__EVENT = DOMAIN_ASSERTION__EVENT;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__STMT = DOMAIN_ASSERTION__STMT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__URL = DOMAIN_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__FACTTYPE = DOMAIN_ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ROLE = DOMAIN_ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = DOMAIN_ASSERTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.CompositeSubjectImpl <em>Composite Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.CompositeSubjectImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCompositeSubject()
	 * @generated
	 */
	int COMPOSITE_SUBJECT = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBJECT__ID = DOMAIN_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBJECT__DESCRIPTION = DOMAIN_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBJECT__PROVENANCE = DOMAIN_OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBJECT__TIMING = DOMAIN_OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBJECT__EVENT = DOMAIN_OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBJECT__NAME = DOMAIN_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBJECT__ELEMENT = DOMAIN_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUBJECT_FEATURE_COUNT = DOMAIN_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.RoleBindingImpl <em>Role Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.RoleBindingImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRoleBinding()
	 * @generated
	 */
	int ROLE_BINDING = 25;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__ROLE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING__SUBJECT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Role Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.StartTimeImpl <em>Start Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.StartTimeImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getStartTime()
	 * @generated
	 */
	int START_TIME = 26;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.RelevanceImpl <em>Relevance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.RelevanceImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRelevance()
	 * @generated
	 */
	int RELEVANCE = 27;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.SignificanceImpl <em>Significance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.SignificanceImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSignificance()
	 * @generated
	 */
	int SIGNIFICANCE = 28;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNIFICANCE__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.AccuracyImpl <em>Accuracy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.AccuracyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAccuracy()
	 * @generated
	 */
	int ACCURACY = 29;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCURACY__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.HasRoleInImpl <em>Has Role In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.HasRoleInImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasRoleIn()
	 * @generated
	 */
	int HAS_ROLE_IN = 30;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__ROLE = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN__ORGANIZATION = EVIDENCE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Has Role In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_ROLE_IN_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsScopedByImpl <em>Is Scoped By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsScopedByImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsScopedBy()
	 * @generated
	 */
	int IS_SCOPED_BY = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__DESCRIPTION = EVIDENCE_INTERPRETATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SCOPED_BY__ELEMENT = EVIDENCE_INTERPRETATION__ELEMENT;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.AtTimeImpl <em>At Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.AtTimeImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAtTime()
	 * @generated
	 */
	int AT_TIME = 33;

	/**
	 * The feature id for the '<em><b>Date Ttime</b></em>' attribute.
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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.OriginalityImpl <em>Originality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.OriginalityImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOriginality()
	 * @generated
	 */
	int ORIGINALITY = 34;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__PROVENANCE = DOCUMENT_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__TIMING = DOCUMENT_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY__VALUE = DOCUMENT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Originality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIGINALITY_FEATURE_COUNT = DOCUMENT_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ReportingImpl <em>Reporting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ReportingImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getReporting()
	 * @generated
	 */
	int REPORTING = 35;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORTING__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ReliabilityImpl <em>Reliability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ReliabilityImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getReliability()
	 * @generated
	 */
	int RELIABILITY = 36;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__PROVENANCE = DOCUMENT_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__TIMING = DOCUMENT_ATTRIBUTE__TIMING;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__VALUE = DOCUMENT_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_FEATURE_COUNT = DOCUMENT_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceRelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceRelationImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceRelation()
	 * @generated
	 */
	int EVIDENCE_RELATION = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__DESCRIPTION = EVIDENCE_EVALUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__ITEM = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION__ASSERTION = EVIDENCE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RELATION_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.SupportsImpl <em>Supports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.SupportsImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSupports()
	 * @generated
	 */
	int SUPPORTS = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ID = EVIDENCE_RELATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__DESCRIPTION = EVIDENCE_RELATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__PROVENANCE = EVIDENCE_RELATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__TIMING = EVIDENCE_RELATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ATTRIBUTE = EVIDENCE_RELATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ITEM = EVIDENCE_RELATION__ITEM;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS__ASSERTION = EVIDENCE_RELATION__ASSERTION;

	/**
	 * The number of structural features of the '<em>Supports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTS_FEATURE_COUNT = EVIDENCE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceEventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceEventImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceEvent()
	 * @generated
	 */
	int EVIDENCE_EVENT = 69;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__ID = EVIDENCE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__DESCRIPTION = EVIDENCE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__PROVENANCE = EVIDENCE_ELEMENT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__TIMING = EVIDENCE_ELEMENT__TIMING;

	/**
	 * The feature id for the '<em><b>Custody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT__CUSTODY = EVIDENCE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EVENT_FEATURE_COUNT = EVIDENCE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsGeneratedAtImpl <em>Is Generated At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsGeneratedAtImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsGeneratedAt()
	 * @generated
	 */
	int IS_GENERATED_AT = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__DESCRIPTION = EVIDENCE_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

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
	 * The number of structural features of the '<em>Is Generated At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERATED_AT_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.SupportImpl <em>Support</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.SupportImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSupport()
	 * @generated
	 */
	int SUPPORT = 41;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORT__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceObservationImpl <em>Observation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceObservationImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceObservation()
	 * @generated
	 */
	int EVIDENCE_OBSERVATION = 59;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__DESCRIPTION = EVIDENCE_EVALUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_OBSERVATION__TIMING = EVIDENCE_EVALUATION__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ConflictsImpl <em>Conflicts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ConflictsImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConflicts()
	 * @generated
	 */
	int CONFLICTS = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__ID = EVIDENCE_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__DESCRIPTION = EVIDENCE_OBSERVATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__PROVENANCE = EVIDENCE_OBSERVATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__TIMING = EVIDENCE_OBSERVATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__ATTRIBUTE = EVIDENCE_OBSERVATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Assertion1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__ASSERTION1 = EVIDENCE_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assertion2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS__ASSERTION2 = EVIDENCE_OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conflicts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICTS_FEATURE_COUNT = EVIDENCE_OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.RationaleImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 43;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__TEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceResolutionImpl <em>Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceResolutionImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceResolution()
	 * @generated
	 */
	int EVIDENCE_RESOLUTION = 60;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__DESCRIPTION = EVIDENCE_EVALUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__RATIONALE = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION__CONTEXT = EVIDENCE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_RESOLUTION_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.RefutesImpl <em>Refutes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.RefutesImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRefutes()
	 * @generated
	 */
	int REFUTES = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__ID = EVIDENCE_RESOLUTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__DESCRIPTION = EVIDENCE_RESOLUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__PROVENANCE = EVIDENCE_RESOLUTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__TIMING = EVIDENCE_RESOLUTION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__ATTRIBUTE = EVIDENCE_RESOLUTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__RATIONALE = EVIDENCE_RESOLUTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFUTES__CONTEXT = EVIDENCE_RESOLUTION__CONTEXT;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.NegatesImpl <em>Negates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.NegatesImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getNegates()
	 * @generated
	 */
	int NEGATES = 45;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__ID = EVIDENCE_RESOLUTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__DESCRIPTION = EVIDENCE_RESOLUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__PROVENANCE = EVIDENCE_RESOLUTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__TIMING = EVIDENCE_RESOLUTION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__ATTRIBUTE = EVIDENCE_RESOLUTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__RATIONALE = EVIDENCE_RESOLUTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATES__CONTEXT = EVIDENCE_RESOLUTION__CONTEXT;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.UnknownSubjectImpl <em>Unknown Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.UnknownSubjectImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getUnknownSubject()
	 * @generated
	 */
	int UNKNOWN_SUBJECT = 46;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT__ID = FORMAL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT__DESCRIPTION = FORMAL_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT__PROVENANCE = FORMAL_OBJECT__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT__TIMING = FORMAL_OBJECT__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT__EVENT = FORMAL_OBJECT__EVENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT__NAME = FORMAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT__CONCEPT = FORMAL_OBJECT__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT__URL = FORMAL_OBJECT__URL;

	/**
	 * The number of structural features of the '<em>Unknown Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_SUBJECT_FEATURE_COUNT = FORMAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ResolvesImpl <em>Resolves</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ResolvesImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getResolves()
	 * @generated
	 */
	int RESOLVES = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__ID = EVIDENCE_RESOLUTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__DESCRIPTION = EVIDENCE_RESOLUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__PROVENANCE = EVIDENCE_RESOLUTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__TIMING = EVIDENCE_RESOLUTION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__ATTRIBUTE = EVIDENCE_RESOLUTION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__RATIONALE = EVIDENCE_RESOLUTION__RATIONALE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVES__CONTEXT = EVIDENCE_RESOLUTION__CONTEXT;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceRequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceRequestImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceRequest()
	 * @generated
	 */
	int EVIDENCE_REQUEST = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__ID = ADMINISTRATIVE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__NAME = ADMINISTRATIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__DESCRIPTION = ADMINISTRATIVE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__ITEM = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST__PROVENANCE = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_REQUEST_FEATURE_COUNT = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ProjectObjectiveImpl <em>Project Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ProjectObjectiveImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getProjectObjective()
	 * @generated
	 */
	int PROJECT_OBJECTIVE = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__ID = ADMINISTRATIVE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__NAME = ADMINISTRATIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__DESCRIPTION = ADMINISTRATIVE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE__TEXT = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OBJECTIVE_FEATURE_COUNT = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ActivityImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ID = ADMINISTRATIVE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = ADMINISTRATIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = ADMINISTRATIVE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROPERTY = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__TIMING = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PROVENANCE = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = ADMINISTRATIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.AdministrativePropertyImpl <em>Administrative Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.AdministrativePropertyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAdministrativeProperty()
	 * @generated
	 */
	int ADMINISTRATIVE_PROPERTY = 86;

	/**
	 * The number of structural features of the '<em>Administrative Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATIVE_PROPERTY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ActivityPropertyImpl <em>Activity Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ActivityPropertyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getActivityProperty()
	 * @generated
	 */
	int ACTIVITY_PROPERTY = 84;

	/**
	 * The number of structural features of the '<em>Activity Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_PROPERTY_FEATURE_COUNT = ADMINISTRATIVE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.DependsOnImpl <em>Depends On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.DependsOnImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDependsOn()
	 * @generated
	 */
	int DEPENDS_ON = 53;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON__ACTIVITY = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Depends On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsAssociatedWithImpl <em>Is Associated With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsAssociatedWithImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsAssociatedWith()
	 * @generated
	 */
	int IS_ASSOCIATED_WITH = 54;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ASSOCIATED_WITH__REQUEST = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Associated With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ASSOCIATED_WITH_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.RequiresMethodImpl <em>Requires Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.RequiresMethodImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRequiresMethod()
	 * @generated
	 */
	int REQUIRES_METHOD = 55;

	/**
	 * The feature id for the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_METHOD__METHOD = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requires Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_METHOD_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.SatisfiesImpl <em>Satisfies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.SatisfiesImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSatisfies()
	 * @generated
	 */
	int SATISFIES = 56;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES__OBJECTIVE = ACTIVITY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Satisfies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIES_FEATURE_COUNT = ACTIVITY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.DomainClaimImpl <em>Domain Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.DomainClaimImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDomainClaim()
	 * @generated
	 */
	int DOMAIN_CLAIM = 58;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLAIM__ID = DOMAIN_ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLAIM__DESCRIPTION = DOMAIN_ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLAIM__PROVENANCE = DOMAIN_ASSERTION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLAIM__TIMING = DOMAIN_ASSERTION__TIMING;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLAIM__EVENT = DOMAIN_ASSERTION__EVENT;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLAIM__STMT = DOMAIN_ASSERTION__STMT;

	/**
	 * The number of structural features of the '<em>Domain Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_CLAIM_FEATURE_COUNT = DOMAIN_ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ContributesImpl <em>Contributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ContributesImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getContributes()
	 * @generated
	 */
	int CONTRIBUTES = 63;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__ID = EVIDENCE_OBSERVATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__DESCRIPTION = EVIDENCE_OBSERVATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__PROVENANCE = EVIDENCE_OBSERVATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__TIMING = EVIDENCE_OBSERVATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__ATTRIBUTE = EVIDENCE_OBSERVATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Relation1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__RELATION1 = EVIDENCE_OBSERVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES__RELATION2 = EVIDENCE_OBSERVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTES_FEATURE_COUNT = EVIDENCE_OBSERVATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.WeakensImpl <em>Weakens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.WeakensImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getWeakens()
	 * @generated
	 */
	int WEAKENS = 61;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__ID = CONTRIBUTES__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__DESCRIPTION = CONTRIBUTES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__PROVENANCE = CONTRIBUTES__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__TIMING = CONTRIBUTES__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__ATTRIBUTE = CONTRIBUTES__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Relation1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__RELATION1 = CONTRIBUTES__RELATION1;

	/**
	 * The feature id for the '<em><b>Relation2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS__RELATION2 = CONTRIBUTES__RELATION2;

	/**
	 * The number of structural features of the '<em>Weakens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAKENS_FEATURE_COUNT = CONTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.AmplifiesImpl <em>Amplifies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.AmplifiesImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAmplifies()
	 * @generated
	 */
	int AMPLIFIES = 62;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__ID = CONTRIBUTES__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__DESCRIPTION = CONTRIBUTES__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__PROVENANCE = CONTRIBUTES__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__TIMING = CONTRIBUTES__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__ATTRIBUTE = CONTRIBUTES__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Relation1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__RELATION1 = CONTRIBUTES__RELATION1;

	/**
	 * The feature id for the '<em><b>Relation2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES__RELATION2 = CONTRIBUTES__RELATION2;

	/**
	 * The number of structural features of the '<em>Amplifies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMPLIFIES_FEATURE_COUNT = CONTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ChallengesImpl <em>Challenges</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ChallengesImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getChallenges()
	 * @generated
	 */
	int CHALLENGES = 64;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__ID = EVIDENCE_RELATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__DESCRIPTION = EVIDENCE_RELATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__PROVENANCE = EVIDENCE_RELATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__TIMING = EVIDENCE_RELATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__ATTRIBUTE = EVIDENCE_RELATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__ITEM = EVIDENCE_RELATION__ITEM;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES__ASSERTION = EVIDENCE_RELATION__ASSERTION;

	/**
	 * The number of structural features of the '<em>Challenges</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHALLENGES_FEATURE_COUNT = EVIDENCE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.StrengthImpl <em>Strength</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.StrengthImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getStrength()
	 * @generated
	 */
	int STRENGTH = 65;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__PROVENANCE = EVIDENCE_ATTRIBUTE__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRENGTH__TIMING = EVIDENCE_ATTRIBUTE__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsAcquiredAtImpl <em>Is Acquired At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsAcquiredAtImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsAcquiredAt()
	 * @generated
	 */
	int IS_ACQUIRED_AT = 66;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__DESCRIPTION = EVIDENCE_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

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
	 * The number of structural features of the '<em>Is Acquired At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_ACQUIRED_AT_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsTransferredToImpl <em>Is Transferred To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsTransferredToImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsTransferredTo()
	 * @generated
	 */
	int IS_TRANSFERRED_TO = 67;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__DESCRIPTION = EVIDENCE_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

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
	 * The number of structural features of the '<em>Is Transferred To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_TRANSFERRED_TO_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.OwnedByImpl <em>Owned By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.OwnedByImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOwnedBy()
	 * @generated
	 */
	int OWNED_BY = 70;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ExhibitPropertyImpl <em>Exhibit Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ExhibitPropertyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getExhibitProperty()
	 * @generated
	 */
	int EXHIBIT_PROPERTY = 101;

	/**
	 * The number of structural features of the '<em>Exhibit Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_PROPERTY_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsPartOfImpl <em>Is Part Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsPartOfImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsPartOf()
	 * @generated
	 */
	int IS_PART_OF = 73;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsRevokedAtImpl <em>Is Revoked At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsRevokedAtImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsRevokedAt()
	 * @generated
	 */
	int IS_REVOKED_AT = 74;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__DESCRIPTION = EVIDENCE_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

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
	 * The number of structural features of the '<em>Is Revoked At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_REVOKED_AT_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ProvidesContextImpl <em>Provides Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ProvidesContextImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getProvidesContext()
	 * @generated
	 */
	int PROVIDES_CONTEXT = 75;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__DESCRIPTION = EVIDENCE_EVALUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__ELEMENT = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT__CONTEXT = EVIDENCE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Provides Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDES_CONTEXT_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.MeansThatImpl <em>Means That</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.MeansThatImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getMeansThat()
	 * @generated
	 */
	int MEANS_THAT = 77;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__ID = EVIDENCE_INTERPRETATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__DESCRIPTION = EVIDENCE_INTERPRETATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__PROVENANCE = EVIDENCE_INTERPRETATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__TIMING = EVIDENCE_INTERPRETATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__ATTRIBUTE = EVIDENCE_INTERPRETATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_THAT__ELEMENT = EVIDENCE_INTERPRETATION__ELEMENT;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.CustodyPropertyImpl <em>Custody Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.CustodyPropertyImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCustodyProperty()
	 * @generated
	 */
	int CUSTODY_PROPERTY = 80;

	/**
	 * The number of structural features of the '<em>Custody Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTODY_PROPERTY_FEATURE_COUNT = EVIDENCE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.CareOfImpl <em>Care Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.CareOfImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCareOf()
	 * @generated
	 */
	int CARE_OF = 79;

	/**
	 * The feature id for the '<em><b>Curator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF__CURATOR = CUSTODY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Care Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARE_OF_FEATURE_COUNT = CUSTODY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.AtLocationImpl <em>At Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.AtLocationImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAtLocation()
	 * @generated
	 */
	int AT_LOCATION = 81;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsCreatedAtImpl <em>Is Created At</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsCreatedAtImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsCreatedAt()
	 * @generated
	 */
	int IS_CREATED_AT = 82;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__ID = EVIDENCE_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__DESCRIPTION = EVIDENCE_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT__PROVENANCE = EVIDENCE_EVENT__PROVENANCE;

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
	 * The number of structural features of the '<em>Is Created At</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_CREATED_AT_FEATURE_COUNT = EVIDENCE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.RequiresPackageImpl <em>Requires Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.RequiresPackageImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRequiresPackage()
	 * @generated
	 */
	int REQUIRES_PACKAGE = 83;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_PACKAGE__PACKAGE = ADMINISTRATIVE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requires Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_PACKAGE_FEATURE_COUNT = ADMINISTRATIVE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.ServiceImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 87;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = COLLECTION_METHOD__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DESCRIPTION = COLLECTION_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROVENANCE = COLLECTION_METHOD__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TIMING = COLLECTION_METHOD__TIMING;

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
	 * The feature id for the '<em><b>Concept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONCEPT = COLLECTION_METHOD__CONCEPT;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__URL = COLLECTION_METHOD__URL;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TOOL = COLLECTION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = COLLECTION_METHOD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.HasElectronicSourceImpl <em>Has Electronic Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.HasElectronicSourceImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasElectronicSource()
	 * @generated
	 */
	int HAS_ELECTRONIC_SOURCE = 89;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsExpressedInLanguageImpl <em>Is Expressed In Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsExpressedInLanguageImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsExpressedInLanguage()
	 * @generated
	 */
	int IS_EXPRESSED_IN_LANGUAGE = 90;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.UsingProcessImpl <em>Using Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.UsingProcessImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getUsingProcess()
	 * @generated
	 */
	int USING_PROCESS = 91;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.HasSecurityClassificationImpl <em>Has Security Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.HasSecurityClassificationImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasSecurityClassification()
	 * @generated
	 */
	int HAS_SECURITY_CLASSIFICATION = 92;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.IsReleaseableToImpl <em>Is Releaseable To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.IsReleaseableToImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsReleaseableTo()
	 * @generated
	 */
	int IS_RELEASEABLE_TO = 93;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.EvidenceGroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.EvidenceGroupImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceGroup()
	 * @generated
	 */
	int EVIDENCE_GROUP = 94;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__ID = EVIDENCE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__DESCRIPTION = EVIDENCE_ITEM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__PROVENANCE = EVIDENCE_ITEM__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_GROUP__TIMING = EVIDENCE_ITEM__TIMING;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.HasVersionImpl <em>Has Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.HasVersionImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasVersion()
	 * @generated
	 */
	int HAS_VERSION = 95;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.SupercedesImpl <em>Supercedes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.SupercedesImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSupercedes()
	 * @generated
	 */
	int SUPERCEDES = 97;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCEDES__ID = EVIDENCE_EVALUATION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCEDES__DESCRIPTION = EVIDENCE_EVALUATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Provenance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCEDES__PROVENANCE = EVIDENCE_EVALUATION__PROVENANCE;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCEDES__TIMING = EVIDENCE_EVALUATION__TIMING;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCEDES__ATTRIBUTE = EVIDENCE_EVALUATION__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>New Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCEDES__NEW_ATTRIBUTE = EVIDENCE_EVALUATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Old Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCEDES__OLD_ATTRIBUTE = EVIDENCE_EVALUATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supercedes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERCEDES_FEATURE_COUNT = EVIDENCE_EVALUATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.impl.HasMediaImpl <em>Has Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.impl.HasMediaImpl
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasMedia()
	 * @generated
	 */
	int HAS_MEDIA = 98;

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
	 * The meta object id for the '{@link net.certware.evidence.evidence.ConsistencyLevel <em>Consistency Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.ConsistencyLevel
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConsistencyLevel()
	 * @generated
	 */
	int CONSISTENCY_LEVEL = 103;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.Level <em>Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.Level
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getLevel()
	 * @generated
	 */
	int LEVEL = 104;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.OriginalityLevel <em>Originality Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.OriginalityLevel
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOriginalityLevel()
	 * @generated
	 */
	int ORIGINALITY_LEVEL = 105;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.ReportingLevel <em>Reporting Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.ReportingLevel
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getReportingLevel()
	 * @generated
	 */
	int REPORTING_LEVEL = 106;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.StandardOfProof <em>Standard Of Proof</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.StandardOfProof
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getStandardOfProof()
	 * @generated
	 */
	int STANDARD_OF_PROOF = 107;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.SupportLevel <em>Support Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.SupportLevel
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSupportLevel()
	 * @generated
	 */
	int SUPPORT_LEVEL = 108;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.CompletenessLevel <em>Completeness Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.CompletenessLevel
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCompletenessLevel()
	 * @generated
	 */
	int COMPLETENESS_LEVEL = 109;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.ReliabilityLevel <em>Reliability Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.ReliabilityLevel
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getReliabilityLevel()
	 * @generated
	 */
	int RELIABILITY_LEVEL = 110;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.AccuracyLevel <em>Accuracy Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.AccuracyLevel
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAccuracyLevel()
	 * @generated
	 */
	int ACCURACY_LEVEL = 111;

	/**
	 * The meta object id for the '{@link net.certware.evidence.evidence.ConfidenceLevel <em>Confidence Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.evidence.evidence.ConfidenceLevel
	 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConfidenceLevel()
	 * @generated
	 */
	int CONFIDENCE_LEVEL = 112;


	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see net.certware.evidence.evidence.EvidenceAttribute
	 * @generated
	 */
	EClass getEvidenceAttribute();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Consistency <em>Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consistency</em>'.
	 * @see net.certware.evidence.evidence.Consistency
	 * @generated
	 */
	EClass getConsistency();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Consistency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Consistency#getValue()
	 * @see #getConsistency()
	 * @generated
	 */
	EAttribute getConsistency_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Completeness <em>Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Completeness</em>'.
	 * @see net.certware.evidence.evidence.Completeness
	 * @generated
	 */
	EClass getCompleteness();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Completeness#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.certware.evidence.evidence.Completeness#getStatus()
	 * @see #getCompleteness()
	 * @generated
	 */
	EAttribute getCompleteness_Status();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see net.certware.evidence.evidence.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Document#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.certware.evidence.evidence.Document#getTitle()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Document#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see net.certware.evidence.evidence.Document#getProperty()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Document#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see net.certware.evidence.evidence.Document#getAttribute()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Attribute();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Confidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confidence</em>'.
	 * @see net.certware.evidence.evidence.Confidence
	 * @generated
	 */
	EClass getConfidence();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Confidence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Confidence#getValue()
	 * @see #getConfidence()
	 * @generated
	 */
	EAttribute getConfidence_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.ApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approved By</em>'.
	 * @see net.certware.evidence.evidence.ApprovedBy
	 * @generated
	 */
	EClass getApprovedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.ApprovedBy#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supervisor</em>'.
	 * @see net.certware.evidence.evidence.ApprovedBy#getSupervisor()
	 * @see #getApprovedBy()
	 * @generated
	 */
	EReference getApprovedBy_Supervisor();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see net.certware.evidence.evidence.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Description#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.certware.evidence.evidence.Description#getText()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Text();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.CreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Created By</em>'.
	 * @see net.certware.evidence.evidence.CreatedBy
	 * @generated
	 */
	EClass getCreatedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.CreatedBy#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.certware.evidence.evidence.CreatedBy#getSource()
	 * @see #getCreatedBy()
	 * @generated
	 */
	EReference getCreatedBy_Source();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Tool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool</em>'.
	 * @see net.certware.evidence.evidence.Tool
	 * @generated
	 */
	EClass getTool();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Tool#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.evidence.evidence.Tool#getVersion()
	 * @see #getTool()
	 * @generated
	 */
	EAttribute getTool_Version();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see net.certware.evidence.evidence.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Method#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see net.certware.evidence.evidence.Method#getTool()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Tool();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.RequiresTool <em>Requires Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires Tool</em>'.
	 * @see net.certware.evidence.evidence.RequiresTool
	 * @generated
	 */
	EClass getRequiresTool();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.RequiresTool#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see net.certware.evidence.evidence.RequiresTool#getTool()
	 * @see #getRequiresTool()
	 * @generated
	 */
	EReference getRequiresTool_Tool();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see net.certware.evidence.evidence.EvidenceItem
	 * @generated
	 */
	EClass getEvidenceItem();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvidenceItem#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event</em>'.
	 * @see net.certware.evidence.evidence.EvidenceItem#getEvent()
	 * @see #getEvidenceItem()
	 * @generated
	 */
	EReference getEvidenceItem_Event();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsBasedOn <em>Is Based On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Based On</em>'.
	 * @see net.certware.evidence.evidence.IsBasedOn
	 * @generated
	 */
	EClass getIsBasedOn();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.IsBasedOn#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see net.certware.evidence.evidence.IsBasedOn#getSource()
	 * @see #getIsBasedOn()
	 * @generated
	 */
	EReference getIsBasedOn_Source();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.DomainAssertion <em>Domain Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Assertion</em>'.
	 * @see net.certware.evidence.evidence.DomainAssertion
	 * @generated
	 */
	EClass getDomainAssertion();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.DomainAssertion#getStmt <em>Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stmt</em>'.
	 * @see net.certware.evidence.evidence.DomainAssertion#getStmt()
	 * @see #getDomainAssertion()
	 * @generated
	 */
	EAttribute getDomainAssertion_Stmt();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsA <em>Is A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is A</em>'.
	 * @see net.certware.evidence.evidence.IsA
	 * @generated
	 */
	EClass getIsA();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.IsA#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see net.certware.evidence.evidence.IsA#getDefinition()
	 * @see #getIsA()
	 * @generated
	 */
	EReference getIsA_Definition();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsCharacterizedBy <em>Is Characterized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Characterized By</em>'.
	 * @see net.certware.evidence.evidence.IsCharacterizedBy
	 * @generated
	 */
	EClass getIsCharacterizedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.IsCharacterizedBy#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see net.certware.evidence.evidence.IsCharacterizedBy#getProperty()
	 * @see #getIsCharacterizedBy()
	 * @generated
	 */
	EReference getIsCharacterizedBy_Property();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see net.certware.evidence.evidence.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Person#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affiliation</em>'.
	 * @see net.certware.evidence.evidence.Person#getAffiliation()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Affiliation();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see net.certware.evidence.evidence.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Organization#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see net.certware.evidence.evidence.Organization#getAddress()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Organization#getAffiliation <em>Affiliation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Affiliation</em>'.
	 * @see net.certware.evidence.evidence.Organization#getAffiliation()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Affiliation();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see net.certware.evidence.evidence.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Package#getConsistency <em>Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consistency</em>'.
	 * @see net.certware.evidence.evidence.Package#getConsistency()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Consistency();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Package#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.evidence.evidence.Package#getVersion()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Version();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Package#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Criteria</em>'.
	 * @see net.certware.evidence.evidence.Package#getCriteria()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Criteria();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Package#getCompleteness <em>Completeness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completeness</em>'.
	 * @see net.certware.evidence.evidence.Package#getCompleteness()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Completeness();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Package#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see net.certware.evidence.evidence.Package#getMethod()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Package#getOriginator <em>Originator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Originator</em>'.
	 * @see net.certware.evidence.evidence.Package#getOriginator()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Originator();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Package#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request</em>'.
	 * @see net.certware.evidence.evidence.Package#getRequest()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Request();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Package#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objective</em>'.
	 * @see net.certware.evidence.evidence.Package#getObjective()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Objective();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Package#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activity</em>'.
	 * @see net.certware.evidence.evidence.Package#getActivity()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Activity();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Package#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see net.certware.evidence.evidence.Package#getItem()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Package#getRequiresPackage <em>Requires Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires Package</em>'.
	 * @see net.certware.evidence.evidence.Package#getRequiresPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_RequiresPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Package#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evaluation</em>'.
	 * @see net.certware.evidence.evidence.Package#getEvaluation()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Evaluation();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Time</em>'.
	 * @see net.certware.evidence.evidence.EndTime
	 * @generated
	 */
	EClass getEndTime();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.EndTime#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see net.certware.evidence.evidence.EndTime#getDatetime()
	 * @see #getEndTime()
	 * @generated
	 */
	EAttribute getEndTime_Datetime();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see net.certware.evidence.evidence.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Assertion#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.certware.evidence.evidence.Assertion#getUrl()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Url();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Assertion#getFacttype <em>Facttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Facttype</em>'.
	 * @see net.certware.evidence.evidence.Assertion#getFacttype()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Facttype();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Assertion#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see net.certware.evidence.evidence.Assertion#getRole()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Role();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.FormalObject <em>Formal Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Object</em>'.
	 * @see net.certware.evidence.evidence.FormalObject
	 * @generated
	 */
	EClass getFormalObject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.FormalObject#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concept</em>'.
	 * @see net.certware.evidence.evidence.FormalObject#getConcept()
	 * @see #getFormalObject()
	 * @generated
	 */
	EAttribute getFormalObject_Concept();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.FormalObject#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.certware.evidence.evidence.FormalObject#getUrl()
	 * @see #getFormalObject()
	 * @generated
	 */
	EAttribute getFormalObject_Url();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see net.certware.evidence.evidence.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.CompositeSubject <em>Composite Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Subject</em>'.
	 * @see net.certware.evidence.evidence.CompositeSubject
	 * @generated
	 */
	EClass getCompositeSubject();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.CompositeSubject#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.CompositeSubject#getElement()
	 * @see #getCompositeSubject()
	 * @generated
	 */
	EReference getCompositeSubject_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.RoleBinding <em>Role Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Binding</em>'.
	 * @see net.certware.evidence.evidence.RoleBinding
	 * @generated
	 */
	EClass getRoleBinding();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.RoleBinding#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.certware.evidence.evidence.RoleBinding#getRole()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EAttribute getRoleBinding_Role();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.RoleBinding#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subject</em>'.
	 * @see net.certware.evidence.evidence.RoleBinding#getSubject()
	 * @see #getRoleBinding()
	 * @generated
	 */
	EReference getRoleBinding_Subject();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.StartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Time</em>'.
	 * @see net.certware.evidence.evidence.StartTime
	 * @generated
	 */
	EClass getStartTime();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.StartTime#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see net.certware.evidence.evidence.StartTime#getDatetime()
	 * @see #getStartTime()
	 * @generated
	 */
	EAttribute getStartTime_Datetime();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Relevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relevance</em>'.
	 * @see net.certware.evidence.evidence.Relevance
	 * @generated
	 */
	EClass getRelevance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Relevance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Relevance#getValue()
	 * @see #getRelevance()
	 * @generated
	 */
	EAttribute getRelevance_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Significance <em>Significance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Significance</em>'.
	 * @see net.certware.evidence.evidence.Significance
	 * @generated
	 */
	EClass getSignificance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Significance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Significance#getValue()
	 * @see #getSignificance()
	 * @generated
	 */
	EAttribute getSignificance_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Accuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accuracy</em>'.
	 * @see net.certware.evidence.evidence.Accuracy
	 * @generated
	 */
	EClass getAccuracy();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Accuracy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Accuracy#getValue()
	 * @see #getAccuracy()
	 * @generated
	 */
	EAttribute getAccuracy_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.HasRoleIn <em>Has Role In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Role In</em>'.
	 * @see net.certware.evidence.evidence.HasRoleIn
	 * @generated
	 */
	EClass getHasRoleIn();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.HasRoleIn#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see net.certware.evidence.evidence.HasRoleIn#getRole()
	 * @see #getHasRoleIn()
	 * @generated
	 */
	EAttribute getHasRoleIn_Role();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.HasRoleIn#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization</em>'.
	 * @see net.certware.evidence.evidence.HasRoleIn#getOrganization()
	 * @see #getHasRoleIn()
	 * @generated
	 */
	EReference getHasRoleIn_Organization();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsScopedBy <em>Is Scoped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Scoped By</em>'.
	 * @see net.certware.evidence.evidence.IsScopedBy
	 * @generated
	 */
	EClass getIsScopedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.IsScopedBy#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see net.certware.evidence.evidence.IsScopedBy#getScope()
	 * @see #getIsScopedBy()
	 * @generated
	 */
	EReference getIsScopedBy_Scope();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EffectiveTime <em>Effective Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effective Time</em>'.
	 * @see net.certware.evidence.evidence.EffectiveTime
	 * @generated
	 */
	EClass getEffectiveTime();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.AtTime <em>At Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Time</em>'.
	 * @see net.certware.evidence.evidence.AtTime
	 * @generated
	 */
	EClass getAtTime();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.AtTime#getDateTtime <em>Date Ttime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Ttime</em>'.
	 * @see net.certware.evidence.evidence.AtTime#getDateTtime()
	 * @see #getAtTime()
	 * @generated
	 */
	EAttribute getAtTime_DateTtime();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Originality <em>Originality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Originality</em>'.
	 * @see net.certware.evidence.evidence.Originality
	 * @generated
	 */
	EClass getOriginality();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Originality#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Originality#getValue()
	 * @see #getOriginality()
	 * @generated
	 */
	EAttribute getOriginality_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Reporting <em>Reporting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reporting</em>'.
	 * @see net.certware.evidence.evidence.Reporting
	 * @generated
	 */
	EClass getReporting();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Reporting#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Reporting#getValue()
	 * @see #getReporting()
	 * @generated
	 */
	EAttribute getReporting_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability</em>'.
	 * @see net.certware.evidence.evidence.Reliability
	 * @generated
	 */
	EClass getReliability();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Reliability#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Reliability#getValue()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Supports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supports</em>'.
	 * @see net.certware.evidence.evidence.Supports
	 * @generated
	 */
	EClass getSupports();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsGeneratedAt <em>Is Generated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Generated At</em>'.
	 * @see net.certware.evidence.evidence.IsGeneratedAt
	 * @generated
	 */
	EClass getIsGeneratedAt();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.CollectionMethod <em>Collection Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Method</em>'.
	 * @see net.certware.evidence.evidence.CollectionMethod
	 * @generated
	 */
	EClass getCollectionMethod();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see net.certware.evidence.evidence.EvidenceRelation
	 * @generated
	 */
	EClass getEvidenceRelation();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.EvidenceRelation#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see net.certware.evidence.evidence.EvidenceRelation#getItem()
	 * @see #getEvidenceRelation()
	 * @generated
	 */
	EReference getEvidenceRelation_Item();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.EvidenceRelation#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion</em>'.
	 * @see net.certware.evidence.evidence.EvidenceRelation#getAssertion()
	 * @see #getEvidenceRelation()
	 * @generated
	 */
	EReference getEvidenceRelation_Assertion();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Support <em>Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Support</em>'.
	 * @see net.certware.evidence.evidence.Support
	 * @generated
	 */
	EClass getSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Support#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Support#getValue()
	 * @see #getSupport()
	 * @generated
	 */
	EAttribute getSupport_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Conflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflicts</em>'.
	 * @see net.certware.evidence.evidence.Conflicts
	 * @generated
	 */
	EClass getConflicts();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Conflicts#getAssertion1 <em>Assertion1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion1</em>'.
	 * @see net.certware.evidence.evidence.Conflicts#getAssertion1()
	 * @see #getConflicts()
	 * @generated
	 */
	EReference getConflicts_Assertion1();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Conflicts#getAssertion2 <em>Assertion2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assertion2</em>'.
	 * @see net.certware.evidence.evidence.Conflicts#getAssertion2()
	 * @see #getConflicts()
	 * @generated
	 */
	EReference getConflicts_Assertion2();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see net.certware.evidence.evidence.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Rationale#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.certware.evidence.evidence.Rationale#getText()
	 * @see #getRationale()
	 * @generated
	 */
	EAttribute getRationale_Text();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Refutes <em>Refutes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refutes</em>'.
	 * @see net.certware.evidence.evidence.Refutes
	 * @generated
	 */
	EClass getRefutes();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Refutes#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.Refutes#getElement()
	 * @see #getRefutes()
	 * @generated
	 */
	EReference getRefutes_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Negates <em>Negates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negates</em>'.
	 * @see net.certware.evidence.evidence.Negates
	 * @generated
	 */
	EClass getNegates();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Negates#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.Negates#getElement()
	 * @see #getNegates()
	 * @generated
	 */
	EReference getNegates_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.UnknownSubject <em>Unknown Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Subject</em>'.
	 * @see net.certware.evidence.evidence.UnknownSubject
	 * @generated
	 */
	EClass getUnknownSubject();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation</em>'.
	 * @see net.certware.evidence.evidence.EvidenceEvaluation
	 * @generated
	 */
	EClass getEvidenceEvaluation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvidenceEvaluation#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see net.certware.evidence.evidence.EvidenceEvaluation#getAttribute()
	 * @see #getEvidenceEvaluation()
	 * @generated
	 */
	EReference getEvidenceEvaluation_Attribute();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Resolves <em>Resolves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolves</em>'.
	 * @see net.certware.evidence.evidence.Resolves
	 * @generated
	 */
	EClass getResolves();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Resolves#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.Resolves#getElement()
	 * @see #getResolves()
	 * @generated
	 */
	EReference getResolves_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Originator <em>Originator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Originator</em>'.
	 * @see net.certware.evidence.evidence.Originator
	 * @generated
	 */
	EClass getOriginator();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request</em>'.
	 * @see net.certware.evidence.evidence.EvidenceRequest
	 * @generated
	 */
	EClass getEvidenceRequest();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.evidence.evidence.EvidenceRequest#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Item</em>'.
	 * @see net.certware.evidence.evidence.EvidenceRequest#getItem()
	 * @see #getEvidenceRequest()
	 * @generated
	 */
	EReference getEvidenceRequest_Item();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvidenceRequest#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provenance</em>'.
	 * @see net.certware.evidence.evidence.EvidenceRequest#getProvenance()
	 * @see #getEvidenceRequest()
	 * @generated
	 */
	EReference getEvidenceRequest_Provenance();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.ProjectObjective <em>Project Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Objective</em>'.
	 * @see net.certware.evidence.evidence.ProjectObjective
	 * @generated
	 */
	EClass getProjectObjective();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.ProjectObjective#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.certware.evidence.evidence.ProjectObjective#getText()
	 * @see #getProjectObjective()
	 * @generated
	 */
	EAttribute getProjectObjective_Text();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see net.certware.evidence.evidence.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Activity#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see net.certware.evidence.evidence.Activity#getProperty()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Activity#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing</em>'.
	 * @see net.certware.evidence.evidence.Activity#getTiming()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Timing();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Activity#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provenance</em>'.
	 * @see net.certware.evidence.evidence.Activity#getProvenance()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Provenance();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.DependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depends On</em>'.
	 * @see net.certware.evidence.evidence.DependsOn
	 * @generated
	 */
	EClass getDependsOn();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.DependsOn#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see net.certware.evidence.evidence.DependsOn#getActivity()
	 * @see #getDependsOn()
	 * @generated
	 */
	EReference getDependsOn_Activity();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsAssociatedWith <em>Is Associated With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Associated With</em>'.
	 * @see net.certware.evidence.evidence.IsAssociatedWith
	 * @generated
	 */
	EClass getIsAssociatedWith();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.IsAssociatedWith#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Request</em>'.
	 * @see net.certware.evidence.evidence.IsAssociatedWith#getRequest()
	 * @see #getIsAssociatedWith()
	 * @generated
	 */
	EReference getIsAssociatedWith_Request();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.RequiresMethod <em>Requires Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires Method</em>'.
	 * @see net.certware.evidence.evidence.RequiresMethod
	 * @generated
	 */
	EClass getRequiresMethod();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.RequiresMethod#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see net.certware.evidence.evidence.RequiresMethod#getMethod()
	 * @see #getRequiresMethod()
	 * @generated
	 */
	EReference getRequiresMethod_Method();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Satisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfies</em>'.
	 * @see net.certware.evidence.evidence.Satisfies
	 * @generated
	 */
	EClass getSatisfies();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Satisfies#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objective</em>'.
	 * @see net.certware.evidence.evidence.Satisfies#getObjective()
	 * @see #getSatisfies()
	 * @generated
	 */
	EReference getSatisfies_Objective();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.AdministrativeElement <em>Administrative Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Element</em>'.
	 * @see net.certware.evidence.evidence.AdministrativeElement
	 * @generated
	 */
	EClass getAdministrativeElement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.AdministrativeElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.evidence.evidence.AdministrativeElement#getId()
	 * @see #getAdministrativeElement()
	 * @generated
	 */
	EAttribute getAdministrativeElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.AdministrativeElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.evidence.evidence.AdministrativeElement#getName()
	 * @see #getAdministrativeElement()
	 * @generated
	 */
	EAttribute getAdministrativeElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.AdministrativeElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see net.certware.evidence.evidence.AdministrativeElement#getDescription()
	 * @see #getAdministrativeElement()
	 * @generated
	 */
	EReference getAdministrativeElement_Description();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.DomainClaim <em>Domain Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Claim</em>'.
	 * @see net.certware.evidence.evidence.DomainClaim
	 * @generated
	 */
	EClass getDomainClaim();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceObservation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observation</em>'.
	 * @see net.certware.evidence.evidence.EvidenceObservation
	 * @generated
	 */
	EClass getEvidenceObservation();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution</em>'.
	 * @see net.certware.evidence.evidence.EvidenceResolution
	 * @generated
	 */
	EClass getEvidenceResolution();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.evidence.evidence.EvidenceResolution#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rationale</em>'.
	 * @see net.certware.evidence.evidence.EvidenceResolution#getRationale()
	 * @see #getEvidenceResolution()
	 * @generated
	 */
	EReference getEvidenceResolution_Rationale();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.evidence.evidence.EvidenceResolution#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see net.certware.evidence.evidence.EvidenceResolution#getContext()
	 * @see #getEvidenceResolution()
	 * @generated
	 */
	EReference getEvidenceResolution_Context();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Weakens <em>Weakens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weakens</em>'.
	 * @see net.certware.evidence.evidence.Weakens
	 * @generated
	 */
	EClass getWeakens();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Amplifies <em>Amplifies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Amplifies</em>'.
	 * @see net.certware.evidence.evidence.Amplifies
	 * @generated
	 */
	EClass getAmplifies();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Contributes <em>Contributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributes</em>'.
	 * @see net.certware.evidence.evidence.Contributes
	 * @generated
	 */
	EClass getContributes();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Contributes#getRelation1 <em>Relation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation1</em>'.
	 * @see net.certware.evidence.evidence.Contributes#getRelation1()
	 * @see #getContributes()
	 * @generated
	 */
	EReference getContributes_Relation1();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Contributes#getRelation2 <em>Relation2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation2</em>'.
	 * @see net.certware.evidence.evidence.Contributes#getRelation2()
	 * @see #getContributes()
	 * @generated
	 */
	EReference getContributes_Relation2();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Challenges <em>Challenges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Challenges</em>'.
	 * @see net.certware.evidence.evidence.Challenges
	 * @generated
	 */
	EClass getChallenges();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Strength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strength</em>'.
	 * @see net.certware.evidence.evidence.Strength
	 * @generated
	 */
	EClass getStrength();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Strength#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.evidence.evidence.Strength#getValue()
	 * @see #getStrength()
	 * @generated
	 */
	EAttribute getStrength_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsAcquiredAt <em>Is Acquired At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Acquired At</em>'.
	 * @see net.certware.evidence.evidence.IsAcquiredAt
	 * @generated
	 */
	EClass getIsAcquiredAt();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsTransferredTo <em>Is Transferred To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Transferred To</em>'.
	 * @see net.certware.evidence.evidence.IsTransferredTo
	 * @generated
	 */
	EClass getIsTransferredTo();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.DocumentAttribute <em>Document Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Attribute</em>'.
	 * @see net.certware.evidence.evidence.DocumentAttribute
	 * @generated
	 */
	EClass getDocumentAttribute();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see net.certware.evidence.evidence.EvidenceEvent
	 * @generated
	 */
	EClass getEvidenceEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvidenceEvent#getCustody <em>Custody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custody</em>'.
	 * @see net.certware.evidence.evidence.EvidenceEvent#getCustody()
	 * @see #getEvidenceEvent()
	 * @generated
	 */
	EReference getEvidenceEvent_Custody();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.OwnedBy <em>Owned By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owned By</em>'.
	 * @see net.certware.evidence.evidence.OwnedBy
	 * @generated
	 */
	EClass getOwnedBy();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.OwnedBy#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see net.certware.evidence.evidence.OwnedBy#getOwner()
	 * @see #getOwnedBy()
	 * @generated
	 */
	EReference getOwnedBy_Owner();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Provenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provenance</em>'.
	 * @see net.certware.evidence.evidence.Provenance
	 * @generated
	 */
	EClass getProvenance();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.TimingProperty <em>Timing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Property</em>'.
	 * @see net.certware.evidence.evidence.TimingProperty
	 * @generated
	 */
	EClass getTimingProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Part Of</em>'.
	 * @see net.certware.evidence.evidence.IsPartOf
	 * @generated
	 */
	EClass getIsPartOf();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.IsPartOf#getWhole <em>Whole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Whole</em>'.
	 * @see net.certware.evidence.evidence.IsPartOf#getWhole()
	 * @see #getIsPartOf()
	 * @generated
	 */
	EReference getIsPartOf_Whole();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsRevokedAt <em>Is Revoked At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Revoked At</em>'.
	 * @see net.certware.evidence.evidence.IsRevokedAt
	 * @generated
	 */
	EClass getIsRevokedAt();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.ProvidesContext <em>Provides Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provides Context</em>'.
	 * @see net.certware.evidence.evidence.ProvidesContext
	 * @generated
	 */
	EClass getProvidesContext();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.ProvidesContext#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.ProvidesContext#getElement()
	 * @see #getProvidesContext()
	 * @generated
	 */
	EReference getProvidesContext_Element();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.ProvidesContext#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see net.certware.evidence.evidence.ProvidesContext#getContext()
	 * @see #getProvidesContext()
	 * @generated
	 */
	EReference getProvidesContext_Context();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.DomainObject <em>Domain Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Object</em>'.
	 * @see net.certware.evidence.evidence.DomainObject
	 * @generated
	 */
	EClass getDomainObject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.DomainObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.evidence.evidence.DomainObject#getName()
	 * @see #getDomainObject()
	 * @generated
	 */
	EAttribute getDomainObject_Name();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.MeansThat <em>Means That</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Means That</em>'.
	 * @see net.certware.evidence.evidence.MeansThat
	 * @generated
	 */
	EClass getMeansThat();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.MeansThat#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meaning</em>'.
	 * @see net.certware.evidence.evidence.MeansThat#getMeaning()
	 * @see #getMeansThat()
	 * @generated
	 */
	EReference getMeansThat_Meaning();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.EvidenceElement
	 * @generated
	 */
	EClass getEvidenceElement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.EvidenceElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.evidence.evidence.EvidenceElement#getId()
	 * @see #getEvidenceElement()
	 * @generated
	 */
	EAttribute getEvidenceElement_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvidenceElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Description</em>'.
	 * @see net.certware.evidence.evidence.EvidenceElement#getDescription()
	 * @see #getEvidenceElement()
	 * @generated
	 */
	EReference getEvidenceElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvidenceElement#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provenance</em>'.
	 * @see net.certware.evidence.evidence.EvidenceElement#getProvenance()
	 * @see #getEvidenceElement()
	 * @generated
	 */
	EReference getEvidenceElement_Provenance();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvidenceElement#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing</em>'.
	 * @see net.certware.evidence.evidence.EvidenceElement#getTiming()
	 * @see #getEvidenceElement()
	 * @generated
	 */
	EReference getEvidenceElement_Timing();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.CareOf <em>Care Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Care Of</em>'.
	 * @see net.certware.evidence.evidence.CareOf
	 * @generated
	 */
	EClass getCareOf();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.CareOf#getCurator <em>Curator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Curator</em>'.
	 * @see net.certware.evidence.evidence.CareOf#getCurator()
	 * @see #getCareOf()
	 * @generated
	 */
	EReference getCareOf_Curator();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.CustodyProperty <em>Custody Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custody Property</em>'.
	 * @see net.certware.evidence.evidence.CustodyProperty
	 * @generated
	 */
	EClass getCustodyProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.AtLocation <em>At Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Location</em>'.
	 * @see net.certware.evidence.evidence.AtLocation
	 * @generated
	 */
	EClass getAtLocation();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.AtLocation#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see net.certware.evidence.evidence.AtLocation#getLocation()
	 * @see #getAtLocation()
	 * @generated
	 */
	EReference getAtLocation_Location();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsCreatedAt <em>Is Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Created At</em>'.
	 * @see net.certware.evidence.evidence.IsCreatedAt
	 * @generated
	 */
	EClass getIsCreatedAt();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.RequiresPackage <em>Requires Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires Package</em>'.
	 * @see net.certware.evidence.evidence.RequiresPackage
	 * @generated
	 */
	EClass getRequiresPackage();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.RequiresPackage#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see net.certware.evidence.evidence.RequiresPackage#getPackage()
	 * @see #getRequiresPackage()
	 * @generated
	 */
	EReference getRequiresPackage_Package();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.ActivityProperty <em>Activity Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Property</em>'.
	 * @see net.certware.evidence.evidence.ActivityProperty
	 * @generated
	 */
	EClass getActivityProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see net.certware.evidence.evidence.EvidenceProperty
	 * @generated
	 */
	EClass getEvidenceProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.AdministrativeProperty <em>Administrative Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrative Property</em>'.
	 * @see net.certware.evidence.evidence.AdministrativeProperty
	 * @generated
	 */
	EClass getAdministrativeProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see net.certware.evidence.evidence.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Service#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool</em>'.
	 * @see net.certware.evidence.evidence.Service#getTool()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Tool();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.DocumentProperty <em>Document Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Property</em>'.
	 * @see net.certware.evidence.evidence.DocumentProperty
	 * @generated
	 */
	EClass getDocumentProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.HasElectronicSource <em>Has Electronic Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Electronic Source</em>'.
	 * @see net.certware.evidence.evidence.HasElectronicSource
	 * @generated
	 */
	EClass getHasElectronicSource();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.HasElectronicSource#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see net.certware.evidence.evidence.HasElectronicSource#getSource()
	 * @see #getHasElectronicSource()
	 * @generated
	 */
	EAttribute getHasElectronicSource_Source();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.HasElectronicSource#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.certware.evidence.evidence.HasElectronicSource#getFormat()
	 * @see #getHasElectronicSource()
	 * @generated
	 */
	EAttribute getHasElectronicSource_Format();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.HasElectronicSource#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see net.certware.evidence.evidence.HasElectronicSource#getFileSize()
	 * @see #getHasElectronicSource()
	 * @generated
	 */
	EAttribute getHasElectronicSource_FileSize();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsExpressedInLanguage <em>Is Expressed In Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Expressed In Language</em>'.
	 * @see net.certware.evidence.evidence.IsExpressedInLanguage
	 * @generated
	 */
	EClass getIsExpressedInLanguage();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.IsExpressedInLanguage#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see net.certware.evidence.evidence.IsExpressedInLanguage#getLanguage()
	 * @see #getIsExpressedInLanguage()
	 * @generated
	 */
	EAttribute getIsExpressedInLanguage_Language();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.IsExpressedInLanguage#getIsPrimary <em>Is Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Primary</em>'.
	 * @see net.certware.evidence.evidence.IsExpressedInLanguage#getIsPrimary()
	 * @see #getIsExpressedInLanguage()
	 * @generated
	 */
	EAttribute getIsExpressedInLanguage_IsPrimary();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.UsingProcess <em>Using Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Using Process</em>'.
	 * @see net.certware.evidence.evidence.UsingProcess
	 * @generated
	 */
	EClass getUsingProcess();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.UsingProcess#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Method</em>'.
	 * @see net.certware.evidence.evidence.UsingProcess#getMethod()
	 * @see #getUsingProcess()
	 * @generated
	 */
	EReference getUsingProcess_Method();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.HasSecurityClassification <em>Has Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Security Classification</em>'.
	 * @see net.certware.evidence.evidence.HasSecurityClassification
	 * @generated
	 */
	EClass getHasSecurityClassification();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.HasSecurityClassification#getSecurityClassification <em>Security Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Classification</em>'.
	 * @see net.certware.evidence.evidence.HasSecurityClassification#getSecurityClassification()
	 * @see #getHasSecurityClassification()
	 * @generated
	 */
	EAttribute getHasSecurityClassification_SecurityClassification();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.IsReleaseableTo <em>Is Releaseable To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Releaseable To</em>'.
	 * @see net.certware.evidence.evidence.IsReleaseableTo
	 * @generated
	 */
	EClass getIsReleaseableTo();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.IsReleaseableTo#getReleasability <em>Releasability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Releasability</em>'.
	 * @see net.certware.evidence.evidence.IsReleaseableTo#getReleasability()
	 * @see #getIsReleaseableTo()
	 * @generated
	 */
	EAttribute getIsReleaseableTo_Releasability();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see net.certware.evidence.evidence.EvidenceGroup
	 * @generated
	 */
	EClass getEvidenceGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.EvidenceGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.evidence.evidence.EvidenceGroup#getName()
	 * @see #getEvidenceGroup()
	 * @generated
	 */
	EAttribute getEvidenceGroup_Name();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.evidence.evidence.EvidenceGroup#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.EvidenceGroup#getElement()
	 * @see #getEvidenceGroup()
	 * @generated
	 */
	EReference getEvidenceGroup_Element();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.HasVersion <em>Has Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Version</em>'.
	 * @see net.certware.evidence.evidence.HasVersion
	 * @generated
	 */
	EClass getHasVersion();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.HasVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.evidence.evidence.HasVersion#getVersion()
	 * @see #getHasVersion()
	 * @generated
	 */
	EAttribute getHasVersion_Version();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvaluationAttribute <em>Evaluation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluation Attribute</em>'.
	 * @see net.certware.evidence.evidence.EvaluationAttribute
	 * @generated
	 */
	EClass getEvaluationAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvaluationAttribute#getProvenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provenance</em>'.
	 * @see net.certware.evidence.evidence.EvaluationAttribute#getProvenance()
	 * @see #getEvaluationAttribute()
	 * @generated
	 */
	EReference getEvaluationAttribute_Provenance();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.EvaluationAttribute#getTiming <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timing</em>'.
	 * @see net.certware.evidence.evidence.EvaluationAttribute#getTiming()
	 * @see #getEvaluationAttribute()
	 * @generated
	 */
	EReference getEvaluationAttribute_Timing();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Supercedes <em>Supercedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supercedes</em>'.
	 * @see net.certware.evidence.evidence.Supercedes
	 * @generated
	 */
	EClass getSupercedes();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Supercedes#getNewAttribute <em>New Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>New Attribute</em>'.
	 * @see net.certware.evidence.evidence.Supercedes#getNewAttribute()
	 * @see #getSupercedes()
	 * @generated
	 */
	EReference getSupercedes_NewAttribute();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.Supercedes#getOldAttribute <em>Old Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Old Attribute</em>'.
	 * @see net.certware.evidence.evidence.Supercedes#getOldAttribute()
	 * @see #getSupercedes()
	 * @generated
	 */
	EReference getSupercedes_OldAttribute();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.HasMedia <em>Has Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Has Media</em>'.
	 * @see net.certware.evidence.evidence.HasMedia
	 * @generated
	 */
	EClass getHasMedia();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.HasMedia#getMedia <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Media</em>'.
	 * @see net.certware.evidence.evidence.HasMedia#getMedia()
	 * @see #getHasMedia()
	 * @generated
	 */
	EAttribute getHasMedia_Media();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Exhibit <em>Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exhibit</em>'.
	 * @see net.certware.evidence.evidence.Exhibit
	 * @generated
	 */
	EClass getExhibit();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Exhibit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.evidence.evidence.Exhibit#getName()
	 * @see #getExhibit()
	 * @generated
	 */
	EAttribute getExhibit_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.evidence.evidence.Exhibit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.certware.evidence.evidence.Exhibit#getUrl()
	 * @see #getExhibit()
	 * @generated
	 */
	EAttribute getExhibit_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.evidence.evidence.Exhibit#getExhibitProperty <em>Exhibit Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exhibit Property</em>'.
	 * @see net.certware.evidence.evidence.Exhibit#getExhibitProperty()
	 * @see #getExhibit()
	 * @generated
	 */
	EReference getExhibit_ExhibitProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.Meaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meaning</em>'.
	 * @see net.certware.evidence.evidence.Meaning
	 * @generated
	 */
	EClass getMeaning();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.ExhibitProperty <em>Exhibit Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exhibit Property</em>'.
	 * @see net.certware.evidence.evidence.ExhibitProperty
	 * @generated
	 */
	EClass getExhibitProperty();

	/**
	 * Returns the meta object for class '{@link net.certware.evidence.evidence.EvidenceInterpretation <em>Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpretation</em>'.
	 * @see net.certware.evidence.evidence.EvidenceInterpretation
	 * @generated
	 */
	EClass getEvidenceInterpretation();

	/**
	 * Returns the meta object for the reference '{@link net.certware.evidence.evidence.EvidenceInterpretation#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element</em>'.
	 * @see net.certware.evidence.evidence.EvidenceInterpretation#getElement()
	 * @see #getEvidenceInterpretation()
	 * @generated
	 */
	EReference getEvidenceInterpretation_Element();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.ConsistencyLevel <em>Consistency Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Consistency Level</em>'.
	 * @see net.certware.evidence.evidence.ConsistencyLevel
	 * @generated
	 */
	EEnum getConsistencyLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.Level <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Level</em>'.
	 * @see net.certware.evidence.evidence.Level
	 * @generated
	 */
	EEnum getLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.OriginalityLevel <em>Originality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Originality Level</em>'.
	 * @see net.certware.evidence.evidence.OriginalityLevel
	 * @generated
	 */
	EEnum getOriginalityLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.ReportingLevel <em>Reporting Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reporting Level</em>'.
	 * @see net.certware.evidence.evidence.ReportingLevel
	 * @generated
	 */
	EEnum getReportingLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.StandardOfProof <em>Standard Of Proof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Standard Of Proof</em>'.
	 * @see net.certware.evidence.evidence.StandardOfProof
	 * @generated
	 */
	EEnum getStandardOfProof();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.SupportLevel <em>Support Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Support Level</em>'.
	 * @see net.certware.evidence.evidence.SupportLevel
	 * @generated
	 */
	EEnum getSupportLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.CompletenessLevel <em>Completeness Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Completeness Level</em>'.
	 * @see net.certware.evidence.evidence.CompletenessLevel
	 * @generated
	 */
	EEnum getCompletenessLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.ReliabilityLevel <em>Reliability Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Reliability Level</em>'.
	 * @see net.certware.evidence.evidence.ReliabilityLevel
	 * @generated
	 */
	EEnum getReliabilityLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.AccuracyLevel <em>Accuracy Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Accuracy Level</em>'.
	 * @see net.certware.evidence.evidence.AccuracyLevel
	 * @generated
	 */
	EEnum getAccuracyLevel();

	/**
	 * Returns the meta object for enum '{@link net.certware.evidence.evidence.ConfidenceLevel <em>Confidence Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Confidence Level</em>'.
	 * @see net.certware.evidence.evidence.ConfidenceLevel
	 * @generated
	 */
	EEnum getConfidenceLevel();

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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceAttributeImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceAttribute()
		 * @generated
		 */
		EClass EVIDENCE_ATTRIBUTE = eINSTANCE.getEvidenceAttribute();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ConsistencyImpl <em>Consistency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ConsistencyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConsistency()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.CompletenessImpl <em>Completeness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.CompletenessImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCompleteness()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ElementImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.DocumentImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDocument()
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
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__PROPERTY = eINSTANCE.getDocument_Property();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__ATTRIBUTE = eINSTANCE.getDocument_Attribute();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ConfidenceImpl <em>Confidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ConfidenceImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConfidence()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ApprovedByImpl <em>Approved By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ApprovedByImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getApprovedBy()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.DescriptionImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__TEXT = eINSTANCE.getDescription_Text();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.CreatedByImpl <em>Created By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.CreatedByImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCreatedBy()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ToolImpl <em>Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ToolImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getTool()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.MethodImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__TOOL = eINSTANCE.getMethod_Tool();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.RequiresToolImpl <em>Requires Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.RequiresToolImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRequiresTool()
		 * @generated
		 */
		EClass REQUIRES_TOOL = eINSTANCE.getRequiresTool();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES_TOOL__TOOL = eINSTANCE.getRequiresTool_Tool();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceItemImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceItem()
		 * @generated
		 */
		EClass EVIDENCE_ITEM = eINSTANCE.getEvidenceItem();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_ITEM__EVENT = eINSTANCE.getEvidenceItem_Event();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsBasedOnImpl <em>Is Based On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsBasedOnImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsBasedOn()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.DomainAssertionImpl <em>Domain Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.DomainAssertionImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDomainAssertion()
		 * @generated
		 */
		EClass DOMAIN_ASSERTION = eINSTANCE.getDomainAssertion();

		/**
		 * The meta object literal for the '<em><b>Stmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_ASSERTION__STMT = eINSTANCE.getDomainAssertion_Stmt();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsAImpl <em>Is A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsAImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsA()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsCharacterizedByImpl <em>Is Characterized By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsCharacterizedByImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsCharacterizedBy()
		 * @generated
		 */
		EClass IS_CHARACTERIZED_BY = eINSTANCE.getIsCharacterizedBy();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_CHARACTERIZED_BY__PROPERTY = eINSTANCE.getIsCharacterizedBy_Property();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.PersonImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Affiliation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__AFFILIATION = eINSTANCE.getPerson_Affiliation();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.OrganizationImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOrganization()
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
		 * The meta object literal for the '<em><b>Affiliation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__AFFILIATION = eINSTANCE.getOrganization_Affiliation();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.PackageImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Consistency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CONSISTENCY = eINSTANCE.getPackage_Consistency();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__VERSION = eINSTANCE.getPackage_Version();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__CRITERIA = eINSTANCE.getPackage_Criteria();

		/**
		 * The meta object literal for the '<em><b>Completeness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__COMPLETENESS = eINSTANCE.getPackage_Completeness();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__METHOD = eINSTANCE.getPackage_Method();

		/**
		 * The meta object literal for the '<em><b>Originator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ORIGINATOR = eINSTANCE.getPackage_Originator();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__REQUEST = eINSTANCE.getPackage_Request();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__OBJECTIVE = eINSTANCE.getPackage_Objective();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ACTIVITY = eINSTANCE.getPackage_Activity();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ITEM = eINSTANCE.getPackage_Item();

		/**
		 * The meta object literal for the '<em><b>Requires Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__REQUIRES_PACKAGE = eINSTANCE.getPackage_RequiresPackage();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__EVALUATION = eINSTANCE.getPackage_Evaluation();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EndTimeImpl <em>End Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EndTimeImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEndTime()
		 * @generated
		 */
		EClass END_TIME = eINSTANCE.getEndTime();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TIME__DATETIME = eINSTANCE.getEndTime_Datetime();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.AssertionImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__URL = eINSTANCE.getAssertion_Url();

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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.FormalObjectImpl <em>Formal Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.FormalObjectImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getFormalObject()
		 * @generated
		 */
		EClass FORMAL_OBJECT = eINSTANCE.getFormalObject();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_OBJECT__CONCEPT = eINSTANCE.getFormalObject_Concept();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_OBJECT__URL = eINSTANCE.getFormalObject_Url();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ObjectImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.CompositeSubjectImpl <em>Composite Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.CompositeSubjectImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCompositeSubject()
		 * @generated
		 */
		EClass COMPOSITE_SUBJECT = eINSTANCE.getCompositeSubject();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_SUBJECT__ELEMENT = eINSTANCE.getCompositeSubject_Element();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.RoleBindingImpl <em>Role Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.RoleBindingImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRoleBinding()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.StartTimeImpl <em>Start Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.StartTimeImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getStartTime()
		 * @generated
		 */
		EClass START_TIME = eINSTANCE.getStartTime();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TIME__DATETIME = eINSTANCE.getStartTime_Datetime();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.RelevanceImpl <em>Relevance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.RelevanceImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRelevance()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.SignificanceImpl <em>Significance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.SignificanceImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSignificance()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.AccuracyImpl <em>Accuracy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.AccuracyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAccuracy()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.HasRoleInImpl <em>Has Role In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.HasRoleInImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasRoleIn()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsScopedByImpl <em>Is Scoped By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsScopedByImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsScopedBy()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EffectiveTimeImpl <em>Effective Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EffectiveTimeImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEffectiveTime()
		 * @generated
		 */
		EClass EFFECTIVE_TIME = eINSTANCE.getEffectiveTime();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.AtTimeImpl <em>At Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.AtTimeImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAtTime()
		 * @generated
		 */
		EClass AT_TIME = eINSTANCE.getAtTime();

		/**
		 * The meta object literal for the '<em><b>Date Ttime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_TIME__DATE_TTIME = eINSTANCE.getAtTime_DateTtime();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.OriginalityImpl <em>Originality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.OriginalityImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOriginality()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ReportingImpl <em>Reporting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ReportingImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getReporting()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ReliabilityImpl <em>Reliability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ReliabilityImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getReliability()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.SupportsImpl <em>Supports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.SupportsImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSupports()
		 * @generated
		 */
		EClass SUPPORTS = eINSTANCE.getSupports();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsGeneratedAtImpl <em>Is Generated At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsGeneratedAtImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsGeneratedAt()
		 * @generated
		 */
		EClass IS_GENERATED_AT = eINSTANCE.getIsGeneratedAt();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.CollectionMethodImpl <em>Collection Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.CollectionMethodImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCollectionMethod()
		 * @generated
		 */
		EClass COLLECTION_METHOD = eINSTANCE.getCollectionMethod();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceRelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceRelationImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceRelation()
		 * @generated
		 */
		EClass EVIDENCE_RELATION = eINSTANCE.getEvidenceRelation();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_RELATION__ITEM = eINSTANCE.getEvidenceRelation_Item();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_RELATION__ASSERTION = eINSTANCE.getEvidenceRelation_Assertion();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.SupportImpl <em>Support</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.SupportImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSupport()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ConflictsImpl <em>Conflicts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ConflictsImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConflicts()
		 * @generated
		 */
		EClass CONFLICTS = eINSTANCE.getConflicts();

		/**
		 * The meta object literal for the '<em><b>Assertion1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICTS__ASSERTION1 = eINSTANCE.getConflicts_Assertion1();

		/**
		 * The meta object literal for the '<em><b>Assertion2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICTS__ASSERTION2 = eINSTANCE.getConflicts_Assertion2();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.RationaleImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATIONALE__TEXT = eINSTANCE.getRationale_Text();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.RefutesImpl <em>Refutes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.RefutesImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRefutes()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.NegatesImpl <em>Negates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.NegatesImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getNegates()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.UnknownSubjectImpl <em>Unknown Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.UnknownSubjectImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getUnknownSubject()
		 * @generated
		 */
		EClass UNKNOWN_SUBJECT = eINSTANCE.getUnknownSubject();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceEvaluationImpl <em>Evaluation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceEvaluationImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceEvaluation()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ResolvesImpl <em>Resolves</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ResolvesImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getResolves()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.OriginatorImpl <em>Originator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.OriginatorImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOriginator()
		 * @generated
		 */
		EClass ORIGINATOR = eINSTANCE.getOriginator();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceRequestImpl <em>Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceRequestImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceRequest()
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
		 * The meta object literal for the '<em><b>Provenance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_REQUEST__PROVENANCE = eINSTANCE.getEvidenceRequest_Provenance();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ProjectObjectiveImpl <em>Project Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ProjectObjectiveImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getProjectObjective()
		 * @generated
		 */
		EClass PROJECT_OBJECTIVE = eINSTANCE.getProjectObjective();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_OBJECTIVE__TEXT = eINSTANCE.getProjectObjective_Text();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ActivityImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PROPERTY = eINSTANCE.getActivity_Property();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__TIMING = eINSTANCE.getActivity_Timing();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PROVENANCE = eINSTANCE.getActivity_Provenance();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.DependsOnImpl <em>Depends On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.DependsOnImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDependsOn()
		 * @generated
		 */
		EClass DEPENDS_ON = eINSTANCE.getDependsOn();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDS_ON__ACTIVITY = eINSTANCE.getDependsOn_Activity();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsAssociatedWithImpl <em>Is Associated With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsAssociatedWithImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsAssociatedWith()
		 * @generated
		 */
		EClass IS_ASSOCIATED_WITH = eINSTANCE.getIsAssociatedWith();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_ASSOCIATED_WITH__REQUEST = eINSTANCE.getIsAssociatedWith_Request();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.RequiresMethodImpl <em>Requires Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.RequiresMethodImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRequiresMethod()
		 * @generated
		 */
		EClass REQUIRES_METHOD = eINSTANCE.getRequiresMethod();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES_METHOD__METHOD = eINSTANCE.getRequiresMethod_Method();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.SatisfiesImpl <em>Satisfies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.SatisfiesImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSatisfies()
		 * @generated
		 */
		EClass SATISFIES = eINSTANCE.getSatisfies();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATISFIES__OBJECTIVE = eINSTANCE.getSatisfies_Objective();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.AdministrativeElementImpl <em>Administrative Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.AdministrativeElementImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAdministrativeElement()
		 * @generated
		 */
		EClass ADMINISTRATIVE_ELEMENT = eINSTANCE.getAdministrativeElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_ELEMENT__ID = eINSTANCE.getAdministrativeElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATIVE_ELEMENT__NAME = eINSTANCE.getAdministrativeElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATIVE_ELEMENT__DESCRIPTION = eINSTANCE.getAdministrativeElement_Description();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.DomainClaimImpl <em>Domain Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.DomainClaimImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDomainClaim()
		 * @generated
		 */
		EClass DOMAIN_CLAIM = eINSTANCE.getDomainClaim();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceObservationImpl <em>Observation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceObservationImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceObservation()
		 * @generated
		 */
		EClass EVIDENCE_OBSERVATION = eINSTANCE.getEvidenceObservation();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceResolutionImpl <em>Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceResolutionImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceResolution()
		 * @generated
		 */
		EClass EVIDENCE_RESOLUTION = eINSTANCE.getEvidenceResolution();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_RESOLUTION__RATIONALE = eINSTANCE.getEvidenceResolution_Rationale();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_RESOLUTION__CONTEXT = eINSTANCE.getEvidenceResolution_Context();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.WeakensImpl <em>Weakens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.WeakensImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getWeakens()
		 * @generated
		 */
		EClass WEAKENS = eINSTANCE.getWeakens();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.AmplifiesImpl <em>Amplifies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.AmplifiesImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAmplifies()
		 * @generated
		 */
		EClass AMPLIFIES = eINSTANCE.getAmplifies();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ContributesImpl <em>Contributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ContributesImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getContributes()
		 * @generated
		 */
		EClass CONTRIBUTES = eINSTANCE.getContributes();

		/**
		 * The meta object literal for the '<em><b>Relation1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTES__RELATION1 = eINSTANCE.getContributes_Relation1();

		/**
		 * The meta object literal for the '<em><b>Relation2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTES__RELATION2 = eINSTANCE.getContributes_Relation2();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ChallengesImpl <em>Challenges</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ChallengesImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getChallenges()
		 * @generated
		 */
		EClass CHALLENGES = eINSTANCE.getChallenges();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.StrengthImpl <em>Strength</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.StrengthImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getStrength()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsAcquiredAtImpl <em>Is Acquired At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsAcquiredAtImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsAcquiredAt()
		 * @generated
		 */
		EClass IS_ACQUIRED_AT = eINSTANCE.getIsAcquiredAt();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsTransferredToImpl <em>Is Transferred To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsTransferredToImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsTransferredTo()
		 * @generated
		 */
		EClass IS_TRANSFERRED_TO = eINSTANCE.getIsTransferredTo();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.DocumentAttributeImpl <em>Document Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.DocumentAttributeImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDocumentAttribute()
		 * @generated
		 */
		EClass DOCUMENT_ATTRIBUTE = eINSTANCE.getDocumentAttribute();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceEventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceEventImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceEvent()
		 * @generated
		 */
		EClass EVIDENCE_EVENT = eINSTANCE.getEvidenceEvent();

		/**
		 * The meta object literal for the '<em><b>Custody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_EVENT__CUSTODY = eINSTANCE.getEvidenceEvent_Custody();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.OwnedByImpl <em>Owned By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.OwnedByImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOwnedBy()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ProvenanceImpl <em>Provenance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ProvenanceImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getProvenance()
		 * @generated
		 */
		EClass PROVENANCE = eINSTANCE.getProvenance();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.TimingPropertyImpl <em>Timing Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.TimingPropertyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getTimingProperty()
		 * @generated
		 */
		EClass TIMING_PROPERTY = eINSTANCE.getTimingProperty();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsPartOfImpl <em>Is Part Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsPartOfImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsPartOf()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsRevokedAtImpl <em>Is Revoked At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsRevokedAtImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsRevokedAt()
		 * @generated
		 */
		EClass IS_REVOKED_AT = eINSTANCE.getIsRevokedAt();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ProvidesContextImpl <em>Provides Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ProvidesContextImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getProvidesContext()
		 * @generated
		 */
		EClass PROVIDES_CONTEXT = eINSTANCE.getProvidesContext();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_CONTEXT__ELEMENT = eINSTANCE.getProvidesContext_Element();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDES_CONTEXT__CONTEXT = eINSTANCE.getProvidesContext_Context();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.DomainObjectImpl <em>Domain Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.DomainObjectImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDomainObject()
		 * @generated
		 */
		EClass DOMAIN_OBJECT = eINSTANCE.getDomainObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_OBJECT__NAME = eINSTANCE.getDomainObject_Name();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.MeansThatImpl <em>Means That</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.MeansThatImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getMeansThat()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceElementImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceElement()
		 * @generated
		 */
		EClass EVIDENCE_ELEMENT = eINSTANCE.getEvidenceElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE_ELEMENT__ID = eINSTANCE.getEvidenceElement_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_ELEMENT__DESCRIPTION = eINSTANCE.getEvidenceElement_Description();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_ELEMENT__PROVENANCE = eINSTANCE.getEvidenceElement_Provenance();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_ELEMENT__TIMING = eINSTANCE.getEvidenceElement_Timing();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.CareOfImpl <em>Care Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.CareOfImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCareOf()
		 * @generated
		 */
		EClass CARE_OF = eINSTANCE.getCareOf();

		/**
		 * The meta object literal for the '<em><b>Curator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARE_OF__CURATOR = eINSTANCE.getCareOf_Curator();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.CustodyPropertyImpl <em>Custody Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.CustodyPropertyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCustodyProperty()
		 * @generated
		 */
		EClass CUSTODY_PROPERTY = eINSTANCE.getCustodyProperty();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.AtLocationImpl <em>At Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.AtLocationImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAtLocation()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsCreatedAtImpl <em>Is Created At</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsCreatedAtImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsCreatedAt()
		 * @generated
		 */
		EClass IS_CREATED_AT = eINSTANCE.getIsCreatedAt();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.RequiresPackageImpl <em>Requires Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.RequiresPackageImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getRequiresPackage()
		 * @generated
		 */
		EClass REQUIRES_PACKAGE = eINSTANCE.getRequiresPackage();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES_PACKAGE__PACKAGE = eINSTANCE.getRequiresPackage_Package();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ActivityPropertyImpl <em>Activity Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ActivityPropertyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getActivityProperty()
		 * @generated
		 */
		EClass ACTIVITY_PROPERTY = eINSTANCE.getActivityProperty();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidencePropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidencePropertyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceProperty()
		 * @generated
		 */
		EClass EVIDENCE_PROPERTY = eINSTANCE.getEvidenceProperty();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.AdministrativePropertyImpl <em>Administrative Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.AdministrativePropertyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAdministrativeProperty()
		 * @generated
		 */
		EClass ADMINISTRATIVE_PROPERTY = eINSTANCE.getAdministrativeProperty();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ServiceImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__TOOL = eINSTANCE.getService_Tool();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.DocumentPropertyImpl <em>Document Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.DocumentPropertyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getDocumentProperty()
		 * @generated
		 */
		EClass DOCUMENT_PROPERTY = eINSTANCE.getDocumentProperty();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.HasElectronicSourceImpl <em>Has Electronic Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.HasElectronicSourceImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasElectronicSource()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsExpressedInLanguageImpl <em>Is Expressed In Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsExpressedInLanguageImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsExpressedInLanguage()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.UsingProcessImpl <em>Using Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.UsingProcessImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getUsingProcess()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.HasSecurityClassificationImpl <em>Has Security Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.HasSecurityClassificationImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasSecurityClassification()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.IsReleaseableToImpl <em>Is Releaseable To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.IsReleaseableToImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getIsReleaseableTo()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceGroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceGroupImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceGroup()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.HasVersionImpl <em>Has Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.HasVersionImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasVersion()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvaluationAttributeImpl <em>Evaluation Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvaluationAttributeImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvaluationAttribute()
		 * @generated
		 */
		EClass EVALUATION_ATTRIBUTE = eINSTANCE.getEvaluationAttribute();

		/**
		 * The meta object literal for the '<em><b>Provenance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_ATTRIBUTE__PROVENANCE = eINSTANCE.getEvaluationAttribute_Provenance();

		/**
		 * The meta object literal for the '<em><b>Timing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATION_ATTRIBUTE__TIMING = eINSTANCE.getEvaluationAttribute_Timing();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.SupercedesImpl <em>Supercedes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.SupercedesImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSupercedes()
		 * @generated
		 */
		EClass SUPERCEDES = eINSTANCE.getSupercedes();

		/**
		 * The meta object literal for the '<em><b>New Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERCEDES__NEW_ATTRIBUTE = eINSTANCE.getSupercedes_NewAttribute();

		/**
		 * The meta object literal for the '<em><b>Old Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPERCEDES__OLD_ATTRIBUTE = eINSTANCE.getSupercedes_OldAttribute();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.HasMediaImpl <em>Has Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.HasMediaImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getHasMedia()
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
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ExhibitImpl <em>Exhibit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ExhibitImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getExhibit()
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
		 * The meta object literal for the '<em><b>Exhibit Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXHIBIT__EXHIBIT_PROPERTY = eINSTANCE.getExhibit_ExhibitProperty();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.MeaningImpl <em>Meaning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.MeaningImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getMeaning()
		 * @generated
		 */
		EClass MEANING = eINSTANCE.getMeaning();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.ExhibitPropertyImpl <em>Exhibit Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.ExhibitPropertyImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getExhibitProperty()
		 * @generated
		 */
		EClass EXHIBIT_PROPERTY = eINSTANCE.getExhibitProperty();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.impl.EvidenceInterpretationImpl <em>Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.impl.EvidenceInterpretationImpl
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getEvidenceInterpretation()
		 * @generated
		 */
		EClass EVIDENCE_INTERPRETATION = eINSTANCE.getEvidenceInterpretation();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE_INTERPRETATION__ELEMENT = eINSTANCE.getEvidenceInterpretation_Element();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.ConsistencyLevel <em>Consistency Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.ConsistencyLevel
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConsistencyLevel()
		 * @generated
		 */
		EEnum CONSISTENCY_LEVEL = eINSTANCE.getConsistencyLevel();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.Level <em>Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.Level
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getLevel()
		 * @generated
		 */
		EEnum LEVEL = eINSTANCE.getLevel();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.OriginalityLevel <em>Originality Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.OriginalityLevel
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getOriginalityLevel()
		 * @generated
		 */
		EEnum ORIGINALITY_LEVEL = eINSTANCE.getOriginalityLevel();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.ReportingLevel <em>Reporting Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.ReportingLevel
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getReportingLevel()
		 * @generated
		 */
		EEnum REPORTING_LEVEL = eINSTANCE.getReportingLevel();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.StandardOfProof <em>Standard Of Proof</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.StandardOfProof
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getStandardOfProof()
		 * @generated
		 */
		EEnum STANDARD_OF_PROOF = eINSTANCE.getStandardOfProof();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.SupportLevel <em>Support Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.SupportLevel
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getSupportLevel()
		 * @generated
		 */
		EEnum SUPPORT_LEVEL = eINSTANCE.getSupportLevel();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.CompletenessLevel <em>Completeness Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.CompletenessLevel
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getCompletenessLevel()
		 * @generated
		 */
		EEnum COMPLETENESS_LEVEL = eINSTANCE.getCompletenessLevel();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.ReliabilityLevel <em>Reliability Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.ReliabilityLevel
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getReliabilityLevel()
		 * @generated
		 */
		EEnum RELIABILITY_LEVEL = eINSTANCE.getReliabilityLevel();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.AccuracyLevel <em>Accuracy Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.AccuracyLevel
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getAccuracyLevel()
		 * @generated
		 */
		EEnum ACCURACY_LEVEL = eINSTANCE.getAccuracyLevel();

		/**
		 * The meta object literal for the '{@link net.certware.evidence.evidence.ConfidenceLevel <em>Confidence Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.evidence.evidence.ConfidenceLevel
		 * @see net.certware.evidence.evidence.impl.EvidencePackageImpl#getConfidenceLevel()
		 * @generated
		 */
		EEnum CONFIDENCE_LEVEL = eINSTANCE.getConfidenceLevel();

	}

} //EvidencePackage
