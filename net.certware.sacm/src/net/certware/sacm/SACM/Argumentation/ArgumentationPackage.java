/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation;

import net.certware.sacm.SACM.SACMPackage;

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
 * @see net.certware.sacm.SACM.Argumentation.ArgumentationFactory
 * @model kind="package"
 * @generated
 */
public interface ArgumentationPackage extends EPackage {
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
	String eNAME = "Argumentation"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schema.omg.org/SACM/1.0/Argumentation"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ARM"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArgumentationPackage eINSTANCE = net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentationElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationElementImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getArgumentationElement()
	 * @generated
	 */
	int ARGUMENTATION_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__TAGGED_VALUE = SACMPackage.MODEL_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__ANNOTATION = SACMPackage.MODEL_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__ID = SACMPackage.MODEL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__DESCRIPTION = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT__CONTENT = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_ELEMENT_FEATURE_COUNT = SACMPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentationImpl <em>Argumentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getArgumentation()
	 * @generated
	 */
	int ARGUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION__TAGGED_VALUE = ARGUMENTATION_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION__ANNOTATION = ARGUMENTATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION__ID = ARGUMENTATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION__DESCRIPTION = ARGUMENTATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION__CONTENT = ARGUMENTATION_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Argumentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION__ARGUMENTATION = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION__ARGUMENT_ELEMENT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Argumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENTATION_FEATURE_COUNT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentElementImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getArgumentElement()
	 * @generated
	 */
	int ARGUMENT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__TAGGED_VALUE = ARGUMENTATION_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__ANNOTATION = ARGUMENTATION_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__ID = ARGUMENTATION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__DESCRIPTION = ARGUMENTATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__CONTENT = ARGUMENTATION_ELEMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Argument Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_FEATURE_COUNT = ARGUMENTATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.CitationElementImpl <em>Citation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.CitationElementImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getCitationElement()
	 * @generated
	 */
	int CITATION_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_ELEMENT__TAGGED_VALUE = ARGUMENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_ELEMENT__ANNOTATION = ARGUMENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_ELEMENT__ID = ARGUMENT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_ELEMENT__CONTENT = ARGUMENT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Argument Element Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_ELEMENT__ARGUMENT_ELEMENT_REFERENCE = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argumentation Reference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_ELEMENT__ARGUMENTATION_REFERENCE = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Citation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITATION_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.InformationElementImpl <em>Information Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.InformationElementImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getInformationElement()
	 * @generated
	 */
	int INFORMATION_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__TAGGED_VALUE = ARGUMENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__ANNOTATION = ARGUMENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__ID = ARGUMENT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__CONTENT = ARGUMENT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__EVIDENCE = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__URL = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Information Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.ReasoningElementImpl <em>Reasoning Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.ReasoningElementImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getReasoningElement()
	 * @generated
	 */
	int REASONING_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__TAGGED_VALUE = ARGUMENT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__ANNOTATION = ARGUMENT_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__ID = ARGUMENT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__CONTENT = ARGUMENT_ELEMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Reasoning Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.AssertionImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 5;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__TAGGED_VALUE = REASONING_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ANNOTATION = REASONING_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ID = REASONING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DESCRIPTION = REASONING_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CONTENT = REASONING_ELEMENT__CONTENT;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = REASONING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentReasoningImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getArgumentReasoning()
	 * @generated
	 */
	int ARGUMENT_REASONING = 6;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__TAGGED_VALUE = REASONING_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__ANNOTATION = REASONING_ELEMENT__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__ID = REASONING_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__DESCRIPTION = REASONING_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__CONTENT = REASONING_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__STRUCTURE = REASONING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Described Inference</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__DESCRIBED_INFERENCE = REASONING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Described Challenge</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__DESCRIBED_CHALLENGE = REASONING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Argument Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING_FEATURE_COUNT = REASONING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedRelationshipImpl <em>Asserted Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedRelationshipImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedRelationship()
	 * @generated
	 */
	int ASSERTED_RELATIONSHIP = 7;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__TAGGED_VALUE = ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__ANNOTATION = ASSERTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__DESCRIPTION = ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__CONTENT = ASSERTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__SOURCE = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP__TARGET = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Asserted Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_RELATIONSHIP_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.ClaimImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 8;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__TAGGED_VALUE = ASSERTION__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__ANNOTATION = ASSERTION__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__ID = ASSERTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__DESCRIPTION = ASSERTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CONTENT = ASSERTION__CONTENT;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__ASSUMED = ASSERTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__TO_BE_SUPPORTED = ASSERTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedInferenceImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedInference()
	 * @generated
	 */
	int ASSERTED_INFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__ANNOTATION = ASSERTED_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__ID = ASSERTED_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Inference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedEvidenceImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedEvidence()
	 * @generated
	 */
	int ASSERTED_EVIDENCE = 10;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__ANNOTATION = ASSERTED_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__ID = ASSERTED_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedContextImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedContext()
	 * @generated
	 */
	int ASSERTED_CONTEXT = 11;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__ANNOTATION = ASSERTED_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__ID = ASSERTED_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedChallengeImpl <em>Asserted Challenge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedChallengeImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedChallenge()
	 * @generated
	 */
	int ASSERTED_CHALLENGE = 12;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__ANNOTATION = ASSERTED_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__ID = ASSERTED_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Challenge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedCounterEvidenceImpl <em>Asserted Counter Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedCounterEvidenceImpl
	 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedCounterEvidence()
	 * @generated
	 */
	int ASSERTED_COUNTER_EVIDENCE = 13;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__TAGGED_VALUE = ASSERTED_RELATIONSHIP__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__ANNOTATION = ASSERTED_RELATIONSHIP__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__ID = ASSERTED_RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__DESCRIPTION = ASSERTED_RELATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__CONTENT = ASSERTED_RELATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__SOURCE = ASSERTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__TARGET = ASSERTED_RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Counter Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE_FEATURE_COUNT = ASSERTED_RELATIONSHIP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.Argumentation <em>Argumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argumentation</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.Argumentation
	 * @generated
	 */
	EClass getArgumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Argumentation.Argumentation#getArgumentation <em>Argumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argumentation</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.Argumentation#getArgumentation()
	 * @see #getArgumentation()
	 * @generated
	 */
	EReference getArgumentation_Argumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.sacm.SACM.Argumentation.Argumentation#getArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument Element</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.Argumentation#getArgumentElement()
	 * @see #getArgumentation()
	 * @generated
	 */
	EReference getArgumentation_ArgumentElement();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.ArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Element</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentElement
	 * @generated
	 */
	EClass getArgumentElement();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.CitationElement <em>Citation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citation Element</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.CitationElement
	 * @generated
	 */
	EClass getCitationElement();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Argumentation.CitationElement#getArgumentElementReference <em>Argument Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Element Reference</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.CitationElement#getArgumentElementReference()
	 * @see #getCitationElement()
	 * @generated
	 */
	EReference getCitationElement_ArgumentElementReference();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Argumentation.CitationElement#getArgumentationReference <em>Argumentation Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argumentation Reference</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.CitationElement#getArgumentationReference()
	 * @see #getCitationElement()
	 * @generated
	 */
	EReference getCitationElement_ArgumentationReference();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.InformationElement <em>Information Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Element</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.InformationElement
	 * @generated
	 */
	EClass getInformationElement();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Argumentation.InformationElement#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.InformationElement#getEvidence()
	 * @see #getInformationElement()
	 * @generated
	 */
	EReference getInformationElement_Evidence();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Argumentation.InformationElement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.InformationElement#getUrl()
	 * @see #getInformationElement()
	 * @generated
	 */
	EAttribute getInformationElement_Url();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.ReasoningElement <em>Reasoning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoning Element</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ReasoningElement
	 * @generated
	 */
	EClass getReasoningElement();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Reasoning</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentReasoning
	 * @generated
	 */
	EClass getArgumentReasoning();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Structure</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getStructure()
	 * @see #getArgumentReasoning()
	 * @generated
	 */
	EReference getArgumentReasoning_Structure();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getDescribedInference <em>Described Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Described Inference</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getDescribedInference()
	 * @see #getArgumentReasoning()
	 * @generated
	 */
	EReference getArgumentReasoning_DescribedInference();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getDescribedChallenge <em>Described Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Described Challenge</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentReasoning#getDescribedChallenge()
	 * @see #getArgumentReasoning()
	 * @generated
	 */
	EReference getArgumentReasoning_DescribedChallenge();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.AssertedRelationship <em>Asserted Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Relationship</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.AssertedRelationship
	 * @generated
	 */
	EClass getAssertedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Argumentation.AssertedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.AssertedRelationship#getSource()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.sacm.SACM.Argumentation.AssertedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.AssertedRelationship#getTarget()
	 * @see #getAssertedRelationship()
	 * @generated
	 */
	EReference getAssertedRelationship_Target();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Argumentation.Claim#getAssumed <em>Assumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumed</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.Claim#getAssumed()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_Assumed();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Argumentation.Claim#getToBeSupported <em>To Be Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Supported</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.Claim#getToBeSupported()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_ToBeSupported();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Inference</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.AssertedInference
	 * @generated
	 */
	EClass getAssertedInference();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Evidence</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.AssertedEvidence
	 * @generated
	 */
	EClass getAssertedEvidence();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Context</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.AssertedContext
	 * @generated
	 */
	EClass getAssertedContext();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.AssertedChallenge <em>Asserted Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Challenge</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.AssertedChallenge
	 * @generated
	 */
	EClass getAssertedChallenge();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.AssertedCounterEvidence <em>Asserted Counter Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Counter Evidence</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.AssertedCounterEvidence
	 * @generated
	 */
	EClass getAssertedCounterEvidence();

	/**
	 * Returns the meta object for class '{@link net.certware.sacm.SACM.Argumentation.ArgumentationElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationElement
	 * @generated
	 */
	EClass getArgumentationElement();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Argumentation.ArgumentationElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationElement#getDescription()
	 * @see #getArgumentationElement()
	 * @generated
	 */
	EAttribute getArgumentationElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.sacm.SACM.Argumentation.ArgumentationElement#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationElement#getContent()
	 * @see #getArgumentationElement()
	 * @generated
	 */
	EAttribute getArgumentationElement_Content();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArgumentationFactory getArgumentationFactory();

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
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentationImpl <em>Argumentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getArgumentation()
		 * @generated
		 */
		EClass ARGUMENTATION = eINSTANCE.getArgumentation();

		/**
		 * The meta object literal for the '<em><b>Argumentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTATION__ARGUMENTATION = eINSTANCE.getArgumentation_Argumentation();

		/**
		 * The meta object literal for the '<em><b>Argument Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENTATION__ARGUMENT_ELEMENT = eINSTANCE.getArgumentation_ArgumentElement();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentElementImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getArgumentElement()
		 * @generated
		 */
		EClass ARGUMENT_ELEMENT = eINSTANCE.getArgumentElement();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.CitationElementImpl <em>Citation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.CitationElementImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getCitationElement()
		 * @generated
		 */
		EClass CITATION_ELEMENT = eINSTANCE.getCitationElement();

		/**
		 * The meta object literal for the '<em><b>Argument Element Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITATION_ELEMENT__ARGUMENT_ELEMENT_REFERENCE = eINSTANCE.getCitationElement_ArgumentElementReference();

		/**
		 * The meta object literal for the '<em><b>Argumentation Reference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITATION_ELEMENT__ARGUMENTATION_REFERENCE = eINSTANCE.getCitationElement_ArgumentationReference();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.InformationElementImpl <em>Information Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.InformationElementImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getInformationElement()
		 * @generated
		 */
		EClass INFORMATION_ELEMENT = eINSTANCE.getInformationElement();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_ELEMENT__EVIDENCE = eINSTANCE.getInformationElement_Evidence();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFORMATION_ELEMENT__URL = eINSTANCE.getInformationElement_Url();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.ReasoningElementImpl <em>Reasoning Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.ReasoningElementImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getReasoningElement()
		 * @generated
		 */
		EClass REASONING_ELEMENT = eINSTANCE.getReasoningElement();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.AssertionImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentReasoningImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getArgumentReasoning()
		 * @generated
		 */
		EClass ARGUMENT_REASONING = eINSTANCE.getArgumentReasoning();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_REASONING__STRUCTURE = eINSTANCE.getArgumentReasoning_Structure();

		/**
		 * The meta object literal for the '<em><b>Described Inference</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_REASONING__DESCRIBED_INFERENCE = eINSTANCE.getArgumentReasoning_DescribedInference();

		/**
		 * The meta object literal for the '<em><b>Described Challenge</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_REASONING__DESCRIBED_CHALLENGE = eINSTANCE.getArgumentReasoning_DescribedChallenge();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedRelationshipImpl <em>Asserted Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedRelationshipImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedRelationship()
		 * @generated
		 */
		EClass ASSERTED_RELATIONSHIP = eINSTANCE.getAssertedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTED_RELATIONSHIP__SOURCE = eINSTANCE.getAssertedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTED_RELATIONSHIP__TARGET = eINSTANCE.getAssertedRelationship_Target();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.ClaimImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Assumed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__ASSUMED = eINSTANCE.getClaim_Assumed();

		/**
		 * The meta object literal for the '<em><b>To Be Supported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__TO_BE_SUPPORTED = eINSTANCE.getClaim_ToBeSupported();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedInferenceImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedInference()
		 * @generated
		 */
		EClass ASSERTED_INFERENCE = eINSTANCE.getAssertedInference();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedEvidenceImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedEvidence()
		 * @generated
		 */
		EClass ASSERTED_EVIDENCE = eINSTANCE.getAssertedEvidence();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedContextImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedContext()
		 * @generated
		 */
		EClass ASSERTED_CONTEXT = eINSTANCE.getAssertedContext();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedChallengeImpl <em>Asserted Challenge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedChallengeImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedChallenge()
		 * @generated
		 */
		EClass ASSERTED_CHALLENGE = eINSTANCE.getAssertedChallenge();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.AssertedCounterEvidenceImpl <em>Asserted Counter Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.AssertedCounterEvidenceImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getAssertedCounterEvidence()
		 * @generated
		 */
		EClass ASSERTED_COUNTER_EVIDENCE = eINSTANCE.getAssertedCounterEvidence();

		/**
		 * The meta object literal for the '{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentationElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationElementImpl
		 * @see net.certware.sacm.SACM.Argumentation.impl.ArgumentationPackageImpl#getArgumentationElement()
		 * @generated
		 */
		EClass ARGUMENTATION_ELEMENT = eINSTANCE.getArgumentationElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENTATION_ELEMENT__DESCRIPTION = eINSTANCE.getArgumentationElement_Description();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENTATION_ELEMENT__CONTENT = eINSTANCE.getArgumentationElement_Content();

	}

} //ArgumentationPackage
