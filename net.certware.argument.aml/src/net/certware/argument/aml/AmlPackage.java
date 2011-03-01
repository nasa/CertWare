/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

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
 * @see net.certware.argument.aml.AmlFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface AmlPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "aml"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ai.sri.com/AML"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "aml"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AmlPackage eINSTANCE = net.certware.argument.aml.impl.AmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.AggregationRuleImpl <em>Aggregation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.AggregationRuleImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getAggregationRule()
	 * @generated
	 */
	int AGGREGATION_RULE = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RULE__METHOD = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RULE__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Aggregation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.AmlDocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.AmlDocumentImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getAmlDocument()
	 * @generated
	 */
	int AML_DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Exhibit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__EXHIBIT = 3;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__COLLECTION = 4;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__PERSON = 5;

	/**
	 * The feature id for the '<em><b>Memo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__MEMO = 6;

	/**
	 * The feature id for the '<em><b>Discovery Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__DISCOVERY_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT__VERSION = 8;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AML_DOCUMENT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.AnnotationImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Memo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__MEMO = 2;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__FLAG = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ID = 4;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.AnswerImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Belief</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__BELIEF = 1;

	/**
	 * The feature id for the '<em><b>Witness</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__WITNESS = 2;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__RATIONALE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Aggregation Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__AGGREGATION_RULE = 5;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__EVIDENCE = 6;

	/**
	 * The feature id for the '<em><b>Discovery Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__DISCOVERY_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__QUESTION_ID = 8;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ArgumentTemplateImpl <em>Argument Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ArgumentTemplateImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getArgumentTemplate()
	 * @generated
	 */
	int ARGUMENT_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TEMPLATE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TEMPLATE__ID_REF = 1;

	/**
	 * The number of structural features of the '<em>Argument Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_TEMPLATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ArgumentImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 5;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__META_DATA = 0;

	/**
	 * The feature id for the '<em><b>Creating Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CREATING_TOOL = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Argument Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_TEMPLATE = 3;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ANSWER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ID = 5;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.BeliefImpl <em>Belief</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.BeliefImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getBelief()
	 * @generated
	 */
	int BELIEF = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__ORDINAL = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF__SYMBOL = 3;

	/**
	 * The number of structural features of the '<em>Belief</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BELIEF_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ChoiceImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ORDINAL = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SYMBOL = 3;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.CollectionItemImpl <em>Collection Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.CollectionItemImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCollectionItem()
	 * @generated
	 */
	int COLLECTION_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__ID_REF = 0;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__OBJECT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM__ORDINAL = 2;

	/**
	 * The number of structural features of the '<em>Collection Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_ITEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.CollectionImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 9;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__META_DATA = 0;

	/**
	 * The feature id for the '<em><b>Creating Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CREATING_TOOL = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Argument Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ARGUMENT_TEMPLATE = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__GROUP = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__LABEL = 6;

	/**
	 * The feature id for the '<em><b>Collection Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__COLLECTION_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ID = 8;

	/**
	 * The feature id for the '<em><b>Label1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__LABEL1 = 9;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__OBJECT_TYPE = 10;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.CoverageImpl <em>Coverage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.CoverageImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCoverage()
	 * @generated
	 */
	int COVERAGE = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Nation State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE__NATION_STATE = 2;

	/**
	 * The number of structural features of the '<em>Coverage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.CreatingToolImpl <em>Creating Tool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.CreatingToolImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCreatingTool()
	 * @generated
	 */
	int CREATING_TOOL = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING_TOOL__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Tool Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING_TOOL__TOOL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING_TOOL__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Creating Tool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATING_TOOL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.CreatorImpl <em>Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.CreatorImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCreator()
	 * @generated
	 */
	int CREATOR = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__ID_REF = 1;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__OBJECT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.DependentImpl <em>Dependent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.DependentImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getDependent()
	 * @generated
	 */
	int DEPENDENT = 13;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__ID_REF = 0;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__ORDINAL = 1;

	/**
	 * The number of structural features of the '<em>Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.DiscoveryMethodImpl <em>Discovery Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.DiscoveryMethodImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getDiscoveryMethod()
	 * @generated
	 */
	int DISCOVERY_METHOD = 14;

	/**
	 * The feature id for the '<em><b>Argument Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__ARGUMENT_TEMPLATE = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__URL = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Auto Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__AUTO_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__ID = 5;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__IMPORT_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__LABEL = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Discovery Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCOVERY_METHOD_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.DocumentRootImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Aggregation Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AGGREGATION_RULE = 4;

	/**
	 * The feature id for the '<em><b>Aml Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AML_DOCUMENT = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANNOTATION = 6;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANSWER = 7;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARCHIVE = 8;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARGUMENT = 9;

	/**
	 * The feature id for the '<em><b>Argument Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ARGUMENT_TEMPLATE = 10;

	/**
	 * The feature id for the '<em><b>Belief</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BELIEF = 11;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BODY = 12;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHOICE = 13;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLECTION = 14;

	/**
	 * The feature id for the '<em><b>Collection Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLLECTION_ITEM = 15;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTRIBUTOR = 16;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COVERAGE = 17;

	/**
	 * The feature id for the '<em><b>Creating Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATING_TOOL = 18;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATOR = 19;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE = 20;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPARTMENT = 21;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEPENDENT = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 23;

	/**
	 * The feature id for the '<em><b>Discovery Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISCOVERY_METHOD = 24;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMAIL = 25;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END = 26;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVENT = 27;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVIDENCE = 28;

	/**
	 * The feature id for the '<em><b>Evidence Exhibit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EVIDENCE_EXHIBIT = 29;

	/**
	 * The feature id for the '<em><b>Exhibit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXHIBIT = 30;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRST_NAME = 31;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLAG = 32;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FORMAT = 33;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIER = 34;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE = 35;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERVAL = 36;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL = 37;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANGUAGE = 38;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAST_NAME = 39;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST = 40;

	/**
	 * The feature id for the '<em><b>Memo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMO = 41;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__META_DATA = 42;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METHOD = 43;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIDDLE_NAME = 44;

	/**
	 * The feature id for the '<em><b>Nation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NATION_STATE = 45;

	/**
	 * The feature id for the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NICK_NAME = 46;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORGANIZATION = 47;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAMETER = 48;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERIOD = 49;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSON = 50;

	/**
	 * The feature id for the '<em><b>Perspective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSPECTIVE = 51;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER = 52;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUESTION = 53;

	/**
	 * The feature id for the '<em><b>Question Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUESTION_RELATIONSHIPS = 54;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RATIONALE = 55;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__READER = 56;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION = 57;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELATION = 58;

	/**
	 * The feature id for the '<em><b>Relevance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELEVANCE = 59;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RELIABILITY = 60;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RIGHTS = 61;

	/**
	 * The feature id for the '<em><b>Security Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECURITY_MARKING = 62;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE = 63;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__START = 64;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBJECT = 65;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SYMBOL = 66;

	/**
	 * The feature id for the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPLATE = 67;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 68;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE = 69;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URL = 70;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 71;

	/**
	 * The feature id for the '<em><b>Witness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WITNESS = 72;

	/**
	 * The feature id for the '<em><b>Description1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION1 = 73;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 74;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID_REF = 75;

	/**
	 * The feature id for the '<em><b>Label1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL1 = 76;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 77;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.EndImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getEnd()
	 * @generated
	 */
	int END = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__SCHEME = 1;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.EvidenceExhibitImpl <em>Evidence Exhibit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.EvidenceExhibitImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getEvidenceExhibit()
	 * @generated
	 */
	int EVIDENCE_EXHIBIT = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EXHIBIT__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EXHIBIT__ID_REF = 1;

	/**
	 * The feature id for the '<em><b>Question Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EXHIBIT__QUESTION_ID = 2;

	/**
	 * The number of structural features of the '<em>Evidence Exhibit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_EXHIBIT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.EvidenceImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 18;

	/**
	 * The feature id for the '<em><b>Evidence Exhibit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__EVIDENCE_EXHIBIT = 0;

	/**
	 * The feature id for the '<em><b>Relevance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__RELEVANCE = 1;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__RELIABILITY = 2;

	/**
	 * The feature id for the '<em><b>Witness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__WITNESS = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ID = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__LABEL = 6;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__ORDINAL = 7;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ExhibitImpl <em>Exhibit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ExhibitImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getExhibit()
	 * @generated
	 */
	int EXHIBIT = 19;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__ARCHIVE = 0;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__META_DATA = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT__ID = 3;

	/**
	 * The number of structural features of the '<em>Exhibit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXHIBIT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.FlagImpl <em>Flag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.FlagImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getFlag()
	 * @generated
	 */
	int FLAG = 20;

	/**
	 * The feature id for the '<em><b>Witness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__WITNESS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Flag Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__FLAG_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Flag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.IntervalImpl <em>Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.IntervalImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getInterval()
	 * @generated
	 */
	int INTERVAL = 21;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__MAX = 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL__MIN = 1;

	/**
	 * The number of structural features of the '<em>Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ListImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getList()
	 * @generated
	 */
	int LIST = 22;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LI = 1;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.MemoImpl <em>Memo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.MemoImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getMemo()
	 * @generated
	 */
	int MEMO = 23;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO__CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO__READER = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO__SUBJECT = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO__BODY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO__ID = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Memo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMO_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.MetaDataImpl <em>Meta Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.MetaDataImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getMetaData()
	 * @generated
	 */
	int META_DATA = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Security Marking</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__SECURITY_MARKING = 2;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__CREATOR = 3;

	/**
	 * The feature id for the '<em><b>Reader</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__READER = 4;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__SUBJECT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__PUBLISHER = 7;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__CONTRIBUTOR = 8;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__DATE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__IDENTIFIER = 12;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__SOURCE = 13;

	/**
	 * The feature id for the '<em><b>Language</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__LANGUAGE = 14;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__RELATION = 15;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__COVERAGE = 16;

	/**
	 * The feature id for the '<em><b>Rights</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__RIGHTS = 17;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA__IMAGE = 18;

	/**
	 * The number of structural features of the '<em>Meta Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_DATA_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.NationStateImpl <em>Nation State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.NationStateImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getNationState()
	 * @generated
	 */
	int NATION_STATE = 25;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_STATE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Perspective</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_STATE__PERSPECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_STATE__PERIOD = 2;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_STATE__ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_STATE__REGION = 4;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_STATE__EVENT = 5;

	/**
	 * The number of structural features of the '<em>Nation State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATION_STATE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ParameterImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 26;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SYMBOL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.PeriodImpl <em>Period</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.PeriodImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getPeriod()
	 * @generated
	 */
	int PERIOD = 27;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__END = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Period</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIOD_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.PersonImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 28;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 0;

	/**
	 * The feature id for the '<em><b>Middle Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__MIDDLE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NICK_NAME = 3;

	/**
	 * The feature id for the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DEPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ID = 8;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.PublisherImpl <em>Publisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.PublisherImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getPublisher()
	 * @generated
	 */
	int PUBLISHER = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__ID_REF = 1;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER__OBJECT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Publisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.QuestionRelationshipsImpl <em>Question Relationships</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.QuestionRelationshipsImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getQuestionRelationships()
	 * @generated
	 */
	int QUESTION_RELATIONSHIPS = 30;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_RELATIONSHIPS__DEPENDENT = 0;

	/**
	 * The number of structural features of the '<em>Question Relationships</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_RELATIONSHIPS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.QuestionImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 31;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CHOICE = 2;

	/**
	 * The feature id for the '<em><b>Question Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION_RELATIONSHIPS = 3;

	/**
	 * The feature id for the '<em><b>Aggregation Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__AGGREGATION_RULE = 4;

	/**
	 * The feature id for the '<em><b>Discovery Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DISCOVERY_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANNOTATION = 6;

	/**
	 * The feature id for the '<em><b>Amplification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__AMPLIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__LABEL = 10;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ReaderImpl <em>Reader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ReaderImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getReader()
	 * @generated
	 */
	int READER = 32;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READER__ID_REF = 1;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READER__OBJECT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Reader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.RelevanceImpl <em>Relevance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.RelevanceImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getRelevance()
	 * @generated
	 */
	int RELEVANCE = 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__ORDINAL = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE__SYMBOL = 3;

	/**
	 * The number of structural features of the '<em>Relevance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEVANCE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ReliabilityImpl <em>Reliability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ReliabilityImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getReliability()
	 * @generated
	 */
	int RELIABILITY = 34;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__ORDINAL = 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY__SYMBOL = 3;

	/**
	 * The number of structural features of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.StartImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getStart()
	 * @generated
	 */
	int START = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__SCHEME = 1;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.TemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.TemplateImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 36;

	/**
	 * The feature id for the '<em><b>Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__META_DATA = 0;

	/**
	 * The feature id for the '<em><b>Creating Tool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CREATING_TOOL = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__QUESTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__ID = 4;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.ValueImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 37;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__LIST = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__UNIT = 5;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.impl.WitnessImpl <em>Witness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.impl.WitnessImpl
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getWitness()
	 * @generated
	 */
	int WITNESS = 38;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITNESS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITNESS__ID_REF = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITNESS__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Witness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITNESS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.ObjectType <em>Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.ObjectType
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 39;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.ObjectType1 <em>Object Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.ObjectType1
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectType1()
	 * @generated
	 */
	int OBJECT_TYPE1 = 40;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.ObjectType2 <em>Object Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.ObjectType2
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectType2()
	 * @generated
	 */
	int OBJECT_TYPE2 = 41;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.ObjectType3 <em>Object Type3</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.ObjectType3
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectType3()
	 * @generated
	 */
	int OBJECT_TYPE3 = 42;

	/**
	 * The meta object id for the '{@link net.certware.argument.aml.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.Type
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 43;

	/**
	 * The meta object id for the '<em>Object Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.ObjectType1
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectTypeObject()
	 * @generated
	 */
	int OBJECT_TYPE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Object Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.ObjectType
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectTypeObject1()
	 * @generated
	 */
	int OBJECT_TYPE_OBJECT1 = 45;

	/**
	 * The meta object id for the '<em>Object Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.ObjectType2
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectTypeObject2()
	 * @generated
	 */
	int OBJECT_TYPE_OBJECT2 = 46;

	/**
	 * The meta object id for the '<em>Object Type Object3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.ObjectType3
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectTypeObject3()
	 * @generated
	 */
	int OBJECT_TYPE_OBJECT3 = 47;

	/**
	 * The meta object id for the '<em>Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.aml.Type
	 * @see net.certware.argument.aml.impl.AmlPackageImpl#getTypeObject()
	 * @generated
	 */
	int TYPE_OBJECT = 48;


	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.AggregationRule <em>Aggregation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Rule</em>'.
	 * @see net.certware.argument.aml.AggregationRule
	 * @generated
	 */
	EClass getAggregationRule();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.AggregationRule#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see net.certware.argument.aml.AggregationRule#getMethod()
	 * @see #getAggregationRule()
	 * @generated
	 */
	EReference getAggregationRule_Method();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.AggregationRule#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see net.certware.argument.aml.AggregationRule#getParameter()
	 * @see #getAggregationRule()
	 * @generated
	 */
	EReference getAggregationRule_Parameter();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.AmlDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see net.certware.argument.aml.AmlDocument
	 * @generated
	 */
	EClass getAmlDocument();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.AmlDocument#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getGroup()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EAttribute getAmlDocument_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.AmlDocument#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getTemplate()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EReference getAmlDocument_Template();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.AmlDocument#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getArgument()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EReference getAmlDocument_Argument();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.AmlDocument#getExhibit <em>Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exhibit</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getExhibit()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EReference getAmlDocument_Exhibit();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.AmlDocument#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getCollection()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EReference getAmlDocument_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.AmlDocument#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getPerson()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EReference getAmlDocument_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.AmlDocument#getMemo <em>Memo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memo</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getMemo()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EReference getAmlDocument_Memo();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.AmlDocument#getDiscoveryMethod <em>Discovery Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discovery Method</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getDiscoveryMethod()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EReference getAmlDocument_DiscoveryMethod();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.AmlDocument#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.argument.aml.AmlDocument#getVersion()
	 * @see #getAmlDocument()
	 * @generated
	 */
	EAttribute getAmlDocument_Version();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Annotation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.certware.argument.aml.Annotation#getMixed()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Annotation#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.Annotation#getGroup()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Annotation#getMemo <em>Memo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memo</em>'.
	 * @see net.certware.argument.aml.Annotation#getMemo()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Memo();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Annotation#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flag</em>'.
	 * @see net.certware.argument.aml.Annotation#getFlag()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Flag();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Annotation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Annotation#getId()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Id();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see net.certware.argument.aml.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Answer#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.Answer#getGroup()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Answer#getBelief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Belief</em>'.
	 * @see net.certware.argument.aml.Answer#getBelief()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Belief();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Answer#getWitness <em>Witness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Witness</em>'.
	 * @see net.certware.argument.aml.Answer#getWitness()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Witness();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Answer#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rationale</em>'.
	 * @see net.certware.argument.aml.Answer#getRationale()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Rationale();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Answer#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.Answer#getAnnotation()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Answer#getAggregationRule <em>Aggregation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregation Rule</em>'.
	 * @see net.certware.argument.aml.Answer#getAggregationRule()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_AggregationRule();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Answer#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see net.certware.argument.aml.Answer#getEvidence()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Evidence();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Answer#getDiscoveryMethod <em>Discovery Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discovery Method</em>'.
	 * @see net.certware.argument.aml.Answer#getDiscoveryMethod()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_DiscoveryMethod();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Answer#getQuestionId <em>Question Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Id</em>'.
	 * @see net.certware.argument.aml.Answer#getQuestionId()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_QuestionId();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.ArgumentTemplate <em>Argument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Template</em>'.
	 * @see net.certware.argument.aml.ArgumentTemplate
	 * @generated
	 */
	EClass getArgumentTemplate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.ArgumentTemplate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.argument.aml.ArgumentTemplate#getValue()
	 * @see #getArgumentTemplate()
	 * @generated
	 */
	EAttribute getArgumentTemplate_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.ArgumentTemplate#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.ArgumentTemplate#getIdRef()
	 * @see #getArgumentTemplate()
	 * @generated
	 */
	EAttribute getArgumentTemplate_IdRef();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see net.certware.argument.aml.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Argument#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see net.certware.argument.aml.Argument#getMetaData()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_MetaData();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Argument#getCreatingTool <em>Creating Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creating Tool</em>'.
	 * @see net.certware.argument.aml.Argument#getCreatingTool()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_CreatingTool();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Argument#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.Argument#getAnnotation()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Argument#getArgumentTemplate <em>Argument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument Template</em>'.
	 * @see net.certware.argument.aml.Argument#getArgumentTemplate()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Argument#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answer</em>'.
	 * @see net.certware.argument.aml.Argument#getAnswer()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Answer();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Argument#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Argument#getId()
	 * @see #getArgument()
	 * @generated
	 */
	EAttribute getArgument_Id();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Belief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Belief</em>'.
	 * @see net.certware.argument.aml.Belief
	 * @generated
	 */
	EClass getBelief();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Belief#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Belief#getDescription()
	 * @see #getBelief()
	 * @generated
	 */
	EAttribute getBelief_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Belief#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.Belief#getLabel()
	 * @see #getBelief()
	 * @generated
	 */
	EAttribute getBelief_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Belief#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see net.certware.argument.aml.Belief#getOrdinal()
	 * @see #getBelief()
	 * @generated
	 */
	EAttribute getBelief_Ordinal();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Belief#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see net.certware.argument.aml.Belief#getSymbol()
	 * @see #getBelief()
	 * @generated
	 */
	EAttribute getBelief_Symbol();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see net.certware.argument.aml.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Choice#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Choice#getDescription()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Choice#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.Choice#getLabel()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Choice#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see net.certware.argument.aml.Choice#getOrdinal()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Ordinal();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Choice#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see net.certware.argument.aml.Choice#getSymbol()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Symbol();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Item</em>'.
	 * @see net.certware.argument.aml.CollectionItem
	 * @generated
	 */
	EClass getCollectionItem();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.CollectionItem#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.CollectionItem#getIdRef()
	 * @see #getCollectionItem()
	 * @generated
	 */
	EAttribute getCollectionItem_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.CollectionItem#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see net.certware.argument.aml.CollectionItem#getObjectType()
	 * @see #getCollectionItem()
	 * @generated
	 */
	EAttribute getCollectionItem_ObjectType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.CollectionItem#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see net.certware.argument.aml.CollectionItem#getOrdinal()
	 * @see #getCollectionItem()
	 * @generated
	 */
	EAttribute getCollectionItem_Ordinal();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see net.certware.argument.aml.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Collection#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see net.certware.argument.aml.Collection#getMetaData()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_MetaData();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Collection#getCreatingTool <em>Creating Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creating Tool</em>'.
	 * @see net.certware.argument.aml.Collection#getCreatingTool()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_CreatingTool();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Collection#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.Collection#getAnnotation()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Collection#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Question</em>'.
	 * @see net.certware.argument.aml.Collection#getQuestion()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_Question();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Collection#getArgumentTemplate <em>Argument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument Template</em>'.
	 * @see net.certware.argument.aml.Collection#getArgumentTemplate()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_ArgumentTemplate();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Collection#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.Collection#getGroup()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Collection#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Label</em>'.
	 * @see net.certware.argument.aml.Collection#getLabel()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Collection#getCollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection Item</em>'.
	 * @see net.certware.argument.aml.Collection#getCollectionItem()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_CollectionItem();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Collection#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Collection#getId()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Collection#getLabel1 <em>Label1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label1</em>'.
	 * @see net.certware.argument.aml.Collection#getLabel1()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Label1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Collection#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see net.certware.argument.aml.Collection#getObjectType()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_ObjectType();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Coverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage</em>'.
	 * @see net.certware.argument.aml.Coverage
	 * @generated
	 */
	EClass getCoverage();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Coverage#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.certware.argument.aml.Coverage#getMixed()
	 * @see #getCoverage()
	 * @generated
	 */
	EAttribute getCoverage_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Coverage#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.Coverage#getGroup()
	 * @see #getCoverage()
	 * @generated
	 */
	EAttribute getCoverage_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Coverage#getNationState <em>Nation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nation State</em>'.
	 * @see net.certware.argument.aml.Coverage#getNationState()
	 * @see #getCoverage()
	 * @generated
	 */
	EReference getCoverage_NationState();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.CreatingTool <em>Creating Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creating Tool</em>'.
	 * @see net.certware.argument.aml.CreatingTool
	 * @generated
	 */
	EClass getCreatingTool();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.CreatingTool#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.CreatingTool#getLabel()
	 * @see #getCreatingTool()
	 * @generated
	 */
	EAttribute getCreatingTool_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.CreatingTool#getToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool Type</em>'.
	 * @see net.certware.argument.aml.CreatingTool#getToolType()
	 * @see #getCreatingTool()
	 * @generated
	 */
	EAttribute getCreatingTool_ToolType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.CreatingTool#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.argument.aml.CreatingTool#getVersion()
	 * @see #getCreatingTool()
	 * @generated
	 */
	EAttribute getCreatingTool_Version();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Creator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creator</em>'.
	 * @see net.certware.argument.aml.Creator
	 * @generated
	 */
	EClass getCreator();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Creator#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Creator#getDescription()
	 * @see #getCreator()
	 * @generated
	 */
	EAttribute getCreator_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Creator#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.Creator#getIdRef()
	 * @see #getCreator()
	 * @generated
	 */
	EAttribute getCreator_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Creator#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see net.certware.argument.aml.Creator#getObjectType()
	 * @see #getCreator()
	 * @generated
	 */
	EAttribute getCreator_ObjectType();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Dependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent</em>'.
	 * @see net.certware.argument.aml.Dependent
	 * @generated
	 */
	EClass getDependent();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Dependent#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.Dependent#getIdRef()
	 * @see #getDependent()
	 * @generated
	 */
	EAttribute getDependent_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Dependent#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see net.certware.argument.aml.Dependent#getOrdinal()
	 * @see #getDependent()
	 * @generated
	 */
	EAttribute getDependent_Ordinal();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.DiscoveryMethod <em>Discovery Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discovery Method</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod
	 * @generated
	 */
	EClass getDiscoveryMethod();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DiscoveryMethod#getArgumentTemplate <em>Argument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument Template</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getArgumentTemplate()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EReference getDiscoveryMethod_ArgumentTemplate();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DiscoveryMethod#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getUrl()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EAttribute getDiscoveryMethod_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.DiscoveryMethod#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getAnnotation()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EReference getDiscoveryMethod_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DiscoveryMethod#getAutoTrigger <em>Auto Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Trigger</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getAutoTrigger()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EAttribute getDiscoveryMethod_AutoTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DiscoveryMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getDescription()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EAttribute getDiscoveryMethod_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DiscoveryMethod#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getId()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EAttribute getDiscoveryMethod_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DiscoveryMethod#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getImportType()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EAttribute getDiscoveryMethod_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DiscoveryMethod#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getLabel()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EAttribute getDiscoveryMethod_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DiscoveryMethod#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.argument.aml.DiscoveryMethod#getType()
	 * @see #getDiscoveryMethod()
	 * @generated
	 */
	EAttribute getDiscoveryMethod_Type();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.certware.argument.aml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.certware.argument.aml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.certware.argument.aml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getActor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Actor();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getAggregationRule <em>Aggregation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregation Rule</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getAggregationRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AggregationRule();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getAmlDocument <em>Aml Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aml Document</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getAmlDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AmlDocument();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getAnnotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answer</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getAnswer()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Answer();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getArchive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Archive();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getArgument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Argument();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getArgumentTemplate <em>Argument Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument Template</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getArgumentTemplate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ArgumentTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getBelief <em>Belief</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Belief</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getBelief()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Belief();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Body();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getChoice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getCollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Item</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getCollectionItem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CollectionItem();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contributor</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getContributor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Contributor();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getCoverage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Coverage();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getCreatingTool <em>Creating Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creating Tool</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getCreatingTool()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CreatingTool();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getCreator()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Creator();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Date();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getDepartment()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Department();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependent</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getDependent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dependent();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getDiscoveryMethod <em>Discovery Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discovery Method</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getDiscoveryMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DiscoveryMethod();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getEmail()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Email();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_End();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Event();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evidence</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getEvidence()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Evidence();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getEvidenceExhibit <em>Evidence Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evidence Exhibit</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getEvidenceExhibit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EvidenceExhibit();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getExhibit <em>Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exhibit</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getExhibit()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Exhibit();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getFirstName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FirstName();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flag</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getFlag()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Flag();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Format</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Format();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getImage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Image();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interval</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getInterval()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Interval();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getLabel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Label();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Language</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getLanguage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Language();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getLastName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LastName();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_List();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getMemo <em>Memo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memo</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getMemo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Memo();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getMetaData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MetaData();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getMethod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Method();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getMiddleName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MiddleName();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getNationState <em>Nation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nation State</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getNationState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NationState();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getNickName <em>Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nick Name</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getNickName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NickName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getOrganization()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Organization();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getParameter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Period</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getPeriod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Period();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getPerson()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Person();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getPerspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perspective</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getPerspective()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Perspective();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getPublisher()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Question</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getQuestion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Question();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getQuestionRelationships <em>Question Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Question Relationships</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getQuestionRelationships()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_QuestionRelationships();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getRationale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Rationale();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reader</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getReader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reader();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Region();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getRelation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getRelevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relevance</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getRelevance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Relevance();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliability</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getReliability()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Reliability();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rights</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getRights()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rights();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getSecurityMarking <em>Security Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Marking</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getSecurityMarking()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SecurityMarking();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getSource()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Source();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getStart()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getSubject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Subject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getSymbol()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Symbol();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getTemplate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Template();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getUrl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Url();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Value();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.DocumentRoot#getWitness <em>Witness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Witness</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getWitness()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Witness();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getDescription1 <em>Description1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description1</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getDescription1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description1();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getIdRef()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.DocumentRoot#getLabel1 <em>Label1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label1</em>'.
	 * @see net.certware.argument.aml.DocumentRoot#getLabel1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Label1();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see net.certware.argument.aml.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.End#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.argument.aml.End#getValue()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.End#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see net.certware.argument.aml.End#getScheme()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Scheme();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.EvidenceExhibit <em>Evidence Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence Exhibit</em>'.
	 * @see net.certware.argument.aml.EvidenceExhibit
	 * @generated
	 */
	EClass getEvidenceExhibit();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.EvidenceExhibit#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.argument.aml.EvidenceExhibit#getValue()
	 * @see #getEvidenceExhibit()
	 * @generated
	 */
	EAttribute getEvidenceExhibit_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.EvidenceExhibit#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.EvidenceExhibit#getIdRef()
	 * @see #getEvidenceExhibit()
	 * @generated
	 */
	EAttribute getEvidenceExhibit_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.EvidenceExhibit#getQuestionId <em>Question Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Id</em>'.
	 * @see net.certware.argument.aml.EvidenceExhibit#getQuestionId()
	 * @see #getEvidenceExhibit()
	 * @generated
	 */
	EAttribute getEvidenceExhibit_QuestionId();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see net.certware.argument.aml.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Evidence#getEvidenceExhibit <em>Evidence Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Evidence Exhibit</em>'.
	 * @see net.certware.argument.aml.Evidence#getEvidenceExhibit()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_EvidenceExhibit();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Evidence#getRelevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relevance</em>'.
	 * @see net.certware.argument.aml.Evidence#getRelevance()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_Relevance();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Evidence#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reliability</em>'.
	 * @see net.certware.argument.aml.Evidence#getReliability()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_Reliability();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Evidence#getWitness <em>Witness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Witness</em>'.
	 * @see net.certware.argument.aml.Evidence#getWitness()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_Witness();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Evidence#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.Evidence#getAnnotation()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Evidence#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Evidence#getId()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Evidence#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.Evidence#getLabel()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Evidence#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see net.certware.argument.aml.Evidence#getOrdinal()
	 * @see #getEvidence()
	 * @generated
	 */
	EAttribute getEvidence_Ordinal();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Exhibit <em>Exhibit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exhibit</em>'.
	 * @see net.certware.argument.aml.Exhibit
	 * @generated
	 */
	EClass getExhibit();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Exhibit#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Archive</em>'.
	 * @see net.certware.argument.aml.Exhibit#getArchive()
	 * @see #getExhibit()
	 * @generated
	 */
	EReference getExhibit_Archive();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Exhibit#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see net.certware.argument.aml.Exhibit#getMetaData()
	 * @see #getExhibit()
	 * @generated
	 */
	EReference getExhibit_MetaData();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Exhibit#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.Exhibit#getAnnotation()
	 * @see #getExhibit()
	 * @generated
	 */
	EReference getExhibit_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Exhibit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Exhibit#getId()
	 * @see #getExhibit()
	 * @generated
	 */
	EAttribute getExhibit_Id();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Flag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flag</em>'.
	 * @see net.certware.argument.aml.Flag
	 * @generated
	 */
	EClass getFlag();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Flag#getWitness <em>Witness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Witness</em>'.
	 * @see net.certware.argument.aml.Flag#getWitness()
	 * @see #getFlag()
	 * @generated
	 */
	EReference getFlag_Witness();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Flag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Flag#getDescription()
	 * @see #getFlag()
	 * @generated
	 */
	EAttribute getFlag_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Flag#getFlagType <em>Flag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag Type</em>'.
	 * @see net.certware.argument.aml.Flag#getFlagType()
	 * @see #getFlag()
	 * @generated
	 */
	EAttribute getFlag_FlagType();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Flag#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.Flag#getLabel()
	 * @see #getFlag()
	 * @generated
	 */
	EAttribute getFlag_Label();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval</em>'.
	 * @see net.certware.argument.aml.Interval
	 * @generated
	 */
	EClass getInterval();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Interval#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see net.certware.argument.aml.Interval#getMax()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Max();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Interval#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see net.certware.argument.aml.Interval#getMin()
	 * @see #getInterval()
	 * @generated
	 */
	EAttribute getInterval_Min();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see net.certware.argument.aml.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.List#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.List#getGroup()
	 * @see #getList()
	 * @generated
	 */
	EAttribute getList_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.List#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li</em>'.
	 * @see net.certware.argument.aml.List#getLi()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_Li();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Memo <em>Memo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memo</em>'.
	 * @see net.certware.argument.aml.Memo
	 * @generated
	 */
	EClass getMemo();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Memo#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creator</em>'.
	 * @see net.certware.argument.aml.Memo#getCreator()
	 * @see #getMemo()
	 * @generated
	 */
	EReference getMemo_Creator();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Memo#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reader</em>'.
	 * @see net.certware.argument.aml.Memo#getReader()
	 * @see #getMemo()
	 * @generated
	 */
	EReference getMemo_Reader();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Memo#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see net.certware.argument.aml.Memo#getSubject()
	 * @see #getMemo()
	 * @generated
	 */
	EAttribute getMemo_Subject();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Memo#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see net.certware.argument.aml.Memo#getBody()
	 * @see #getMemo()
	 * @generated
	 */
	EAttribute getMemo_Body();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Memo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Memo#getId()
	 * @see #getMemo()
	 * @generated
	 */
	EAttribute getMemo_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Memo#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.argument.aml.Memo#getType()
	 * @see #getMemo()
	 * @generated
	 */
	EAttribute getMemo_Type();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.MetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Data</em>'.
	 * @see net.certware.argument.aml.MetaData
	 * @generated
	 */
	EClass getMetaData();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.MetaData#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.MetaData#getGroup()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.MetaData#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Title</em>'.
	 * @see net.certware.argument.aml.MetaData#getTitle()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Title();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.MetaData#getSecurityMarking <em>Security Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Security Marking</em>'.
	 * @see net.certware.argument.aml.MetaData#getSecurityMarking()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_SecurityMarking();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Creator</em>'.
	 * @see net.certware.argument.aml.MetaData#getCreator()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Creator();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getReader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reader</em>'.
	 * @see net.certware.argument.aml.MetaData#getReader()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Reader();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.MetaData#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Subject</em>'.
	 * @see net.certware.argument.aml.MetaData#getSubject()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Subject();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.MetaData#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see net.certware.argument.aml.MetaData#getDescription()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Publisher</em>'.
	 * @see net.certware.argument.aml.MetaData#getPublisher()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributor</em>'.
	 * @see net.certware.argument.aml.MetaData#getContributor()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Contributor();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.MetaData#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Date</em>'.
	 * @see net.certware.argument.aml.MetaData#getDate()
	 * @see #getMetaData()
	 * @generated
	 */
	EAttribute getMetaData_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see net.certware.argument.aml.MetaData#getType()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Format</em>'.
	 * @see net.certware.argument.aml.MetaData#getFormat()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Format();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Identifier</em>'.
	 * @see net.certware.argument.aml.MetaData#getIdentifier()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source</em>'.
	 * @see net.certware.argument.aml.MetaData#getSource()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Language</em>'.
	 * @see net.certware.argument.aml.MetaData#getLanguage()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Language();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see net.certware.argument.aml.MetaData#getRelation()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Relation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage</em>'.
	 * @see net.certware.argument.aml.MetaData#getCoverage()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Coverage();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getRights <em>Rights</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rights</em>'.
	 * @see net.certware.argument.aml.MetaData#getRights()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Rights();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.MetaData#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image</em>'.
	 * @see net.certware.argument.aml.MetaData#getImage()
	 * @see #getMetaData()
	 * @generated
	 */
	EReference getMetaData_Image();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.NationState <em>Nation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nation State</em>'.
	 * @see net.certware.argument.aml.NationState
	 * @generated
	 */
	EClass getNationState();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.NationState#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.NationState#getGroup()
	 * @see #getNationState()
	 * @generated
	 */
	EAttribute getNationState_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.NationState#getPerspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Perspective</em>'.
	 * @see net.certware.argument.aml.NationState#getPerspective()
	 * @see #getNationState()
	 * @generated
	 */
	EAttribute getNationState_Perspective();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.NationState#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Period</em>'.
	 * @see net.certware.argument.aml.NationState#getPeriod()
	 * @see #getNationState()
	 * @generated
	 */
	EReference getNationState_Period();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.NationState#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actor</em>'.
	 * @see net.certware.argument.aml.NationState#getActor()
	 * @see #getNationState()
	 * @generated
	 */
	EAttribute getNationState_Actor();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.NationState#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Region</em>'.
	 * @see net.certware.argument.aml.NationState#getRegion()
	 * @see #getNationState()
	 * @generated
	 */
	EAttribute getNationState_Region();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.NationState#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event</em>'.
	 * @see net.certware.argument.aml.NationState#getEvent()
	 * @see #getNationState()
	 * @generated
	 */
	EAttribute getNationState_Event();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see net.certware.argument.aml.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Parameter#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see net.certware.argument.aml.Parameter#getSymbol()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Symbol();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see net.certware.argument.aml.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Value();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Period</em>'.
	 * @see net.certware.argument.aml.Period
	 * @generated
	 */
	EClass getPeriod();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Period#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.Period#getGroup()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Period#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start</em>'.
	 * @see net.certware.argument.aml.Period#getStart()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_Start();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Period#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End</em>'.
	 * @see net.certware.argument.aml.Period#getEnd()
	 * @see #getPeriod()
	 * @generated
	 */
	EReference getPeriod_End();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Period#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.Period#getLabel()
	 * @see #getPeriod()
	 * @generated
	 */
	EAttribute getPeriod_Label();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see net.certware.argument.aml.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see net.certware.argument.aml.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getMiddleName <em>Middle Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Middle Name</em>'.
	 * @see net.certware.argument.aml.Person#getMiddleName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_MiddleName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see net.certware.argument.aml.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getNickName <em>Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nick Name</em>'.
	 * @see net.certware.argument.aml.Person#getNickName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_NickName();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organization</em>'.
	 * @see net.certware.argument.aml.Person#getOrganization()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Organization();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see net.certware.argument.aml.Person#getDepartment()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Department();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see net.certware.argument.aml.Person#getEmail()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Email();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Person#getDescription()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Person#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Person#getId()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Id();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher</em>'.
	 * @see net.certware.argument.aml.Publisher
	 * @generated
	 */
	EClass getPublisher();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Publisher#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Publisher#getDescription()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Publisher#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.Publisher#getIdRef()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Publisher#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see net.certware.argument.aml.Publisher#getObjectType()
	 * @see #getPublisher()
	 * @generated
	 */
	EAttribute getPublisher_ObjectType();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.QuestionRelationships <em>Question Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Relationships</em>'.
	 * @see net.certware.argument.aml.QuestionRelationships
	 * @generated
	 */
	EClass getQuestionRelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.QuestionRelationships#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependent</em>'.
	 * @see net.certware.argument.aml.QuestionRelationships#getDependent()
	 * @see #getQuestionRelationships()
	 * @generated
	 */
	EReference getQuestionRelationships_Dependent();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see net.certware.argument.aml.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Question#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.Question#getGroup()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see net.certware.argument.aml.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Question#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see net.certware.argument.aml.Question#getChoice()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Choice();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Question#getQuestionRelationships <em>Question Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Relationships</em>'.
	 * @see net.certware.argument.aml.Question#getQuestionRelationships()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_QuestionRelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Question#getAggregationRule <em>Aggregation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aggregation Rule</em>'.
	 * @see net.certware.argument.aml.Question#getAggregationRule()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_AggregationRule();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Question#getDiscoveryMethod <em>Discovery Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discovery Method</em>'.
	 * @see net.certware.argument.aml.Question#getDiscoveryMethod()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_DiscoveryMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Question#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.Question#getAnnotation()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Question#getAmplification <em>Amplification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amplification</em>'.
	 * @see net.certware.argument.aml.Question#getAmplification()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Amplification();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Question#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Question#getDescription()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Question#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Question#getId()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Question#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.Question#getLabel()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Label();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Reader <em>Reader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reader</em>'.
	 * @see net.certware.argument.aml.Reader
	 * @generated
	 */
	EClass getReader();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Reader#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Reader#getDescription()
	 * @see #getReader()
	 * @generated
	 */
	EAttribute getReader_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Reader#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.Reader#getIdRef()
	 * @see #getReader()
	 * @generated
	 */
	EAttribute getReader_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Reader#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see net.certware.argument.aml.Reader#getObjectType()
	 * @see #getReader()
	 * @generated
	 */
	EAttribute getReader_ObjectType();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Relevance <em>Relevance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relevance</em>'.
	 * @see net.certware.argument.aml.Relevance
	 * @generated
	 */
	EClass getRelevance();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Relevance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Relevance#getDescription()
	 * @see #getRelevance()
	 * @generated
	 */
	EAttribute getRelevance_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Relevance#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.Relevance#getLabel()
	 * @see #getRelevance()
	 * @generated
	 */
	EAttribute getRelevance_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Relevance#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see net.certware.argument.aml.Relevance#getOrdinal()
	 * @see #getRelevance()
	 * @generated
	 */
	EAttribute getRelevance_Ordinal();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Relevance#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see net.certware.argument.aml.Relevance#getSymbol()
	 * @see #getRelevance()
	 * @generated
	 */
	EAttribute getRelevance_Symbol();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability</em>'.
	 * @see net.certware.argument.aml.Reliability
	 * @generated
	 */
	EClass getReliability();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Reliability#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Reliability#getDescription()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Reliability#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.certware.argument.aml.Reliability#getLabel()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Reliability#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see net.certware.argument.aml.Reliability#getOrdinal()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Ordinal();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Reliability#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see net.certware.argument.aml.Reliability#getSymbol()
	 * @see #getReliability()
	 * @generated
	 */
	EAttribute getReliability_Symbol();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see net.certware.argument.aml.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Start#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.certware.argument.aml.Start#getValue()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Start#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see net.certware.argument.aml.Start#getScheme()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Scheme();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see net.certware.argument.aml.Template
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Template#getMetaData <em>Meta Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Data</em>'.
	 * @see net.certware.argument.aml.Template#getMetaData()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_MetaData();

	/**
	 * Returns the meta object for the containment reference '{@link net.certware.argument.aml.Template#getCreatingTool <em>Creating Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creating Tool</em>'.
	 * @see net.certware.argument.aml.Template#getCreatingTool()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_CreatingTool();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Template#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see net.certware.argument.aml.Template#getAnnotation()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Template#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see net.certware.argument.aml.Template#getQuestion()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Question();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Template#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.certware.argument.aml.Template#getId()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Id();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see net.certware.argument.aml.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Value#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.certware.argument.aml.Value#getMixed()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.certware.argument.aml.Value#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.certware.argument.aml.Value#getGroup()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Value#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interval</em>'.
	 * @see net.certware.argument.aml.Value#getInterval()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Interval();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.aml.Value#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List</em>'.
	 * @see net.certware.argument.aml.Value#getList()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_List();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Value#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.certware.argument.aml.Value#getType()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Value#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see net.certware.argument.aml.Value#getUnit()
	 * @see #getValue()
	 * @generated
	 */
	EAttribute getValue_Unit();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.aml.Witness <em>Witness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Witness</em>'.
	 * @see net.certware.argument.aml.Witness
	 * @generated
	 */
	EClass getWitness();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Witness#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.certware.argument.aml.Witness#getDescription()
	 * @see #getWitness()
	 * @generated
	 */
	EAttribute getWitness_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Witness#getIdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Ref</em>'.
	 * @see net.certware.argument.aml.Witness#getIdRef()
	 * @see #getWitness()
	 * @generated
	 */
	EAttribute getWitness_IdRef();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.aml.Witness#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see net.certware.argument.aml.Witness#getTimestamp()
	 * @see #getWitness()
	 * @generated
	 */
	EAttribute getWitness_Timestamp();

	/**
	 * Returns the meta object for enum '{@link net.certware.argument.aml.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Type</em>'.
	 * @see net.certware.argument.aml.ObjectType
	 * @generated
	 */
	EEnum getObjectType();

	/**
	 * Returns the meta object for enum '{@link net.certware.argument.aml.ObjectType1 <em>Object Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Type1</em>'.
	 * @see net.certware.argument.aml.ObjectType1
	 * @generated
	 */
	EEnum getObjectType1();

	/**
	 * Returns the meta object for enum '{@link net.certware.argument.aml.ObjectType2 <em>Object Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Type2</em>'.
	 * @see net.certware.argument.aml.ObjectType2
	 * @generated
	 */
	EEnum getObjectType2();

	/**
	 * Returns the meta object for enum '{@link net.certware.argument.aml.ObjectType3 <em>Object Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Object Type3</em>'.
	 * @see net.certware.argument.aml.ObjectType3
	 * @generated
	 */
	EEnum getObjectType3();

	/**
	 * Returns the meta object for enum '{@link net.certware.argument.aml.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see net.certware.argument.aml.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for data type '{@link net.certware.argument.aml.ObjectType1 <em>Object Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Type Object</em>'.
	 * @see net.certware.argument.aml.ObjectType1
	 * @model instanceClass="net.certware.argument.aml.ObjectType1"
	 *        extendedMetaData="name='object-type_._1_._type:Object' baseType='object-type_._1_._type'"
	 * @generated
	 */
	EDataType getObjectTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.certware.argument.aml.ObjectType <em>Object Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Type Object1</em>'.
	 * @see net.certware.argument.aml.ObjectType
	 * @model instanceClass="net.certware.argument.aml.ObjectType"
	 *        extendedMetaData="name='object-type_._type:Object' baseType='object-type_._type'"
	 * @generated
	 */
	EDataType getObjectTypeObject1();

	/**
	 * Returns the meta object for data type '{@link net.certware.argument.aml.ObjectType2 <em>Object Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Type Object2</em>'.
	 * @see net.certware.argument.aml.ObjectType2
	 * @model instanceClass="net.certware.argument.aml.ObjectType2"
	 *        extendedMetaData="name='object-type_._2_._type:Object' baseType='object-type_._2_._type'"
	 * @generated
	 */
	EDataType getObjectTypeObject2();

	/**
	 * Returns the meta object for data type '{@link net.certware.argument.aml.ObjectType3 <em>Object Type Object3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Type Object3</em>'.
	 * @see net.certware.argument.aml.ObjectType3
	 * @model instanceClass="net.certware.argument.aml.ObjectType3"
	 *        extendedMetaData="name='object-type_._3_._type:Object' baseType='object-type_._3_._type'"
	 * @generated
	 */
	EDataType getObjectTypeObject3();

	/**
	 * Returns the meta object for data type '{@link net.certware.argument.aml.Type <em>Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Object</em>'.
	 * @see net.certware.argument.aml.Type
	 * @model instanceClass="net.certware.argument.aml.Type"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AmlFactory getAmlFactory();

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
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.AggregationRuleImpl <em>Aggregation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.AggregationRuleImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getAggregationRule()
		 * @generated
		 */
		EClass AGGREGATION_RULE = eINSTANCE.getAggregationRule();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_RULE__METHOD = eINSTANCE.getAggregationRule_Method();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_RULE__PARAMETER = eINSTANCE.getAggregationRule_Parameter();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.AmlDocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.AmlDocumentImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getAmlDocument()
		 * @generated
		 */
		EClass AML_DOCUMENT = eINSTANCE.getAmlDocument();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AML_DOCUMENT__GROUP = eINSTANCE.getAmlDocument_Group();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_DOCUMENT__TEMPLATE = eINSTANCE.getAmlDocument_Template();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_DOCUMENT__ARGUMENT = eINSTANCE.getAmlDocument_Argument();

		/**
		 * The meta object literal for the '<em><b>Exhibit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_DOCUMENT__EXHIBIT = eINSTANCE.getAmlDocument_Exhibit();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_DOCUMENT__COLLECTION = eINSTANCE.getAmlDocument_Collection();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_DOCUMENT__PERSON = eINSTANCE.getAmlDocument_Person();

		/**
		 * The meta object literal for the '<em><b>Memo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_DOCUMENT__MEMO = eINSTANCE.getAmlDocument_Memo();

		/**
		 * The meta object literal for the '<em><b>Discovery Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AML_DOCUMENT__DISCOVERY_METHOD = eINSTANCE.getAmlDocument_DiscoveryMethod();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AML_DOCUMENT__VERSION = eINSTANCE.getAmlDocument_Version();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.AnnotationImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__MIXED = eINSTANCE.getAnnotation_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__GROUP = eINSTANCE.getAnnotation_Group();

		/**
		 * The meta object literal for the '<em><b>Memo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__MEMO = eINSTANCE.getAnnotation_Memo();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__FLAG = eINSTANCE.getAnnotation_Flag();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__ID = eINSTANCE.getAnnotation_Id();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.AnswerImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__GROUP = eINSTANCE.getAnswer_Group();

		/**
		 * The meta object literal for the '<em><b>Belief</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__BELIEF = eINSTANCE.getAnswer_Belief();

		/**
		 * The meta object literal for the '<em><b>Witness</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__WITNESS = eINSTANCE.getAnswer_Witness();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__RATIONALE = eINSTANCE.getAnswer_Rationale();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__ANNOTATION = eINSTANCE.getAnswer_Annotation();

		/**
		 * The meta object literal for the '<em><b>Aggregation Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__AGGREGATION_RULE = eINSTANCE.getAnswer_AggregationRule();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__EVIDENCE = eINSTANCE.getAnswer_Evidence();

		/**
		 * The meta object literal for the '<em><b>Discovery Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__DISCOVERY_METHOD = eINSTANCE.getAnswer_DiscoveryMethod();

		/**
		 * The meta object literal for the '<em><b>Question Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__QUESTION_ID = eINSTANCE.getAnswer_QuestionId();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ArgumentTemplateImpl <em>Argument Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ArgumentTemplateImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getArgumentTemplate()
		 * @generated
		 */
		EClass ARGUMENT_TEMPLATE = eINSTANCE.getArgumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_TEMPLATE__VALUE = eINSTANCE.getArgumentTemplate_Value();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_TEMPLATE__ID_REF = eINSTANCE.getArgumentTemplate_IdRef();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ArgumentImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__META_DATA = eINSTANCE.getArgument_MetaData();

		/**
		 * The meta object literal for the '<em><b>Creating Tool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CREATING_TOOL = eINSTANCE.getArgument_CreatingTool();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ANNOTATION = eINSTANCE.getArgument_Annotation();

		/**
		 * The meta object literal for the '<em><b>Argument Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_TEMPLATE = eINSTANCE.getArgument_ArgumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ANSWER = eINSTANCE.getArgument_Answer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT__ID = eINSTANCE.getArgument_Id();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.BeliefImpl <em>Belief</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.BeliefImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getBelief()
		 * @generated
		 */
		EClass BELIEF = eINSTANCE.getBelief();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BELIEF__DESCRIPTION = eINSTANCE.getBelief_Description();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BELIEF__LABEL = eINSTANCE.getBelief_Label();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BELIEF__ORDINAL = eINSTANCE.getBelief_Ordinal();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BELIEF__SYMBOL = eINSTANCE.getBelief_Symbol();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ChoiceImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__DESCRIPTION = eINSTANCE.getChoice_Description();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__LABEL = eINSTANCE.getChoice_Label();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__ORDINAL = eINSTANCE.getChoice_Ordinal();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__SYMBOL = eINSTANCE.getChoice_Symbol();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.CollectionItemImpl <em>Collection Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.CollectionItemImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCollectionItem()
		 * @generated
		 */
		EClass COLLECTION_ITEM = eINSTANCE.getCollectionItem();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_ITEM__ID_REF = eINSTANCE.getCollectionItem_IdRef();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_ITEM__OBJECT_TYPE = eINSTANCE.getCollectionItem_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION_ITEM__ORDINAL = eINSTANCE.getCollectionItem_Ordinal();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.CollectionImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__META_DATA = eINSTANCE.getCollection_MetaData();

		/**
		 * The meta object literal for the '<em><b>Creating Tool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__CREATING_TOOL = eINSTANCE.getCollection_CreatingTool();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__ANNOTATION = eINSTANCE.getCollection_Annotation();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__QUESTION = eINSTANCE.getCollection_Question();

		/**
		 * The meta object literal for the '<em><b>Argument Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__ARGUMENT_TEMPLATE = eINSTANCE.getCollection_ArgumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__GROUP = eINSTANCE.getCollection_Group();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__LABEL = eINSTANCE.getCollection_Label();

		/**
		 * The meta object literal for the '<em><b>Collection Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__COLLECTION_ITEM = eINSTANCE.getCollection_CollectionItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__ID = eINSTANCE.getCollection_Id();

		/**
		 * The meta object literal for the '<em><b>Label1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__LABEL1 = eINSTANCE.getCollection_Label1();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__OBJECT_TYPE = eINSTANCE.getCollection_ObjectType();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.CoverageImpl <em>Coverage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.CoverageImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCoverage()
		 * @generated
		 */
		EClass COVERAGE = eINSTANCE.getCoverage();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE__MIXED = eINSTANCE.getCoverage_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE__GROUP = eINSTANCE.getCoverage_Group();

		/**
		 * The meta object literal for the '<em><b>Nation State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE__NATION_STATE = eINSTANCE.getCoverage_NationState();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.CreatingToolImpl <em>Creating Tool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.CreatingToolImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCreatingTool()
		 * @generated
		 */
		EClass CREATING_TOOL = eINSTANCE.getCreatingTool();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATING_TOOL__LABEL = eINSTANCE.getCreatingTool_Label();

		/**
		 * The meta object literal for the '<em><b>Tool Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATING_TOOL__TOOL_TYPE = eINSTANCE.getCreatingTool_ToolType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATING_TOOL__VERSION = eINSTANCE.getCreatingTool_Version();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.CreatorImpl <em>Creator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.CreatorImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getCreator()
		 * @generated
		 */
		EClass CREATOR = eINSTANCE.getCreator();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATOR__DESCRIPTION = eINSTANCE.getCreator_Description();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATOR__ID_REF = eINSTANCE.getCreator_IdRef();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATOR__OBJECT_TYPE = eINSTANCE.getCreator_ObjectType();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.DependentImpl <em>Dependent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.DependentImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getDependent()
		 * @generated
		 */
		EClass DEPENDENT = eINSTANCE.getDependent();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT__ID_REF = eINSTANCE.getDependent_IdRef();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT__ORDINAL = eINSTANCE.getDependent_Ordinal();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.DiscoveryMethodImpl <em>Discovery Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.DiscoveryMethodImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getDiscoveryMethod()
		 * @generated
		 */
		EClass DISCOVERY_METHOD = eINSTANCE.getDiscoveryMethod();

		/**
		 * The meta object literal for the '<em><b>Argument Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY_METHOD__ARGUMENT_TEMPLATE = eINSTANCE.getDiscoveryMethod_ArgumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_METHOD__URL = eINSTANCE.getDiscoveryMethod_Url();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCOVERY_METHOD__ANNOTATION = eINSTANCE.getDiscoveryMethod_Annotation();

		/**
		 * The meta object literal for the '<em><b>Auto Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_METHOD__AUTO_TRIGGER = eINSTANCE.getDiscoveryMethod_AutoTrigger();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_METHOD__DESCRIPTION = eINSTANCE.getDiscoveryMethod_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_METHOD__ID = eINSTANCE.getDiscoveryMethod_Id();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_METHOD__IMPORT_TYPE = eINSTANCE.getDiscoveryMethod_ImportType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_METHOD__LABEL = eINSTANCE.getDiscoveryMethod_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCOVERY_METHOD__TYPE = eINSTANCE.getDiscoveryMethod_Type();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.DocumentRootImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACTOR = eINSTANCE.getDocumentRoot_Actor();

		/**
		 * The meta object literal for the '<em><b>Aggregation Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AGGREGATION_RULE = eINSTANCE.getDocumentRoot_AggregationRule();

		/**
		 * The meta object literal for the '<em><b>Aml Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AML_DOCUMENT = eINSTANCE.getDocumentRoot_AmlDocument();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANNOTATION = eINSTANCE.getDocumentRoot_Annotation();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANSWER = eINSTANCE.getDocumentRoot_Answer();

		/**
		 * The meta object literal for the '<em><b>Archive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ARCHIVE = eINSTANCE.getDocumentRoot_Archive();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ARGUMENT = eINSTANCE.getDocumentRoot_Argument();

		/**
		 * The meta object literal for the '<em><b>Argument Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ARGUMENT_TEMPLATE = eINSTANCE.getDocumentRoot_ArgumentTemplate();

		/**
		 * The meta object literal for the '<em><b>Belief</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BELIEF = eINSTANCE.getDocumentRoot_Belief();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BODY = eINSTANCE.getDocumentRoot_Body();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHOICE = eINSTANCE.getDocumentRoot_Choice();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLLECTION = eINSTANCE.getDocumentRoot_Collection();

		/**
		 * The meta object literal for the '<em><b>Collection Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLLECTION_ITEM = eINSTANCE.getDocumentRoot_CollectionItem();

		/**
		 * The meta object literal for the '<em><b>Contributor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTRIBUTOR = eINSTANCE.getDocumentRoot_Contributor();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COVERAGE = eINSTANCE.getDocumentRoot_Coverage();

		/**
		 * The meta object literal for the '<em><b>Creating Tool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATING_TOOL = eINSTANCE.getDocumentRoot_CreatingTool();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CREATOR = eINSTANCE.getDocumentRoot_Creator();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATE = eINSTANCE.getDocumentRoot_Date();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DEPARTMENT = eINSTANCE.getDocumentRoot_Department();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEPENDENT = eINSTANCE.getDocumentRoot_Dependent();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DESCRIPTION = eINSTANCE.getDocumentRoot_Description();

		/**
		 * The meta object literal for the '<em><b>Discovery Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DISCOVERY_METHOD = eINSTANCE.getDocumentRoot_DiscoveryMethod();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EMAIL = eINSTANCE.getDocumentRoot_Email();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__END = eINSTANCE.getDocumentRoot_End();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__EVENT = eINSTANCE.getDocumentRoot_Event();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVIDENCE = eINSTANCE.getDocumentRoot_Evidence();

		/**
		 * The meta object literal for the '<em><b>Evidence Exhibit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EVIDENCE_EXHIBIT = eINSTANCE.getDocumentRoot_EvidenceExhibit();

		/**
		 * The meta object literal for the '<em><b>Exhibit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXHIBIT = eINSTANCE.getDocumentRoot_Exhibit();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FIRST_NAME = eINSTANCE.getDocumentRoot_FirstName();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FLAG = eINSTANCE.getDocumentRoot_Flag();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FORMAT = eINSTANCE.getDocumentRoot_Format();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IDENTIFIER = eINSTANCE.getDocumentRoot_Identifier();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMAGE = eINSTANCE.getDocumentRoot_Image();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERVAL = eINSTANCE.getDocumentRoot_Interval();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LABEL = eINSTANCE.getDocumentRoot_Label();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LANGUAGE = eINSTANCE.getDocumentRoot_Language();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LAST_NAME = eINSTANCE.getDocumentRoot_LastName();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIST = eINSTANCE.getDocumentRoot_List();

		/**
		 * The meta object literal for the '<em><b>Memo</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEMO = eINSTANCE.getDocumentRoot_Memo();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__META_DATA = eINSTANCE.getDocumentRoot_MetaData();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__METHOD = eINSTANCE.getDocumentRoot_Method();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIDDLE_NAME = eINSTANCE.getDocumentRoot_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Nation State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NATION_STATE = eINSTANCE.getDocumentRoot_NationState();

		/**
		 * The meta object literal for the '<em><b>Nick Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NICK_NAME = eINSTANCE.getDocumentRoot_NickName();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ORGANIZATION = eINSTANCE.getDocumentRoot_Organization();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAMETER = eINSTANCE.getDocumentRoot_Parameter();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERIOD = eINSTANCE.getDocumentRoot_Period();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PERSON = eINSTANCE.getDocumentRoot_Person();

		/**
		 * The meta object literal for the '<em><b>Perspective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PERSPECTIVE = eINSTANCE.getDocumentRoot_Perspective();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PUBLISHER = eINSTANCE.getDocumentRoot_Publisher();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUESTION = eINSTANCE.getDocumentRoot_Question();

		/**
		 * The meta object literal for the '<em><b>Question Relationships</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUESTION_RELATIONSHIPS = eINSTANCE.getDocumentRoot_QuestionRelationships();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__RATIONALE = eINSTANCE.getDocumentRoot_Rationale();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__READER = eINSTANCE.getDocumentRoot_Reader();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REGION = eINSTANCE.getDocumentRoot_Region();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELATION = eINSTANCE.getDocumentRoot_Relation();

		/**
		 * The meta object literal for the '<em><b>Relevance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELEVANCE = eINSTANCE.getDocumentRoot_Relevance();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RELIABILITY = eINSTANCE.getDocumentRoot_Reliability();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RIGHTS = eINSTANCE.getDocumentRoot_Rights();

		/**
		 * The meta object literal for the '<em><b>Security Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SECURITY_MARKING = eINSTANCE.getDocumentRoot_SecurityMarking();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SOURCE = eINSTANCE.getDocumentRoot_Source();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__START = eINSTANCE.getDocumentRoot_Start();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SUBJECT = eINSTANCE.getDocumentRoot_Subject();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SYMBOL = eINSTANCE.getDocumentRoot_Symbol();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPLATE = eINSTANCE.getDocumentRoot_Template();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE = eINSTANCE.getDocumentRoot_Type();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__URL = eINSTANCE.getDocumentRoot_Url();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VALUE = eINSTANCE.getDocumentRoot_Value();

		/**
		 * The meta object literal for the '<em><b>Witness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WITNESS = eINSTANCE.getDocumentRoot_Witness();

		/**
		 * The meta object literal for the '<em><b>Description1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DESCRIPTION1 = eINSTANCE.getDocumentRoot_Description1();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ID_REF = eINSTANCE.getDocumentRoot_IdRef();

		/**
		 * The meta object literal for the '<em><b>Label1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LABEL1 = eINSTANCE.getDocumentRoot_Label1();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.EndImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__VALUE = eINSTANCE.getEnd_Value();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__SCHEME = eINSTANCE.getEnd_Scheme();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.EvidenceExhibitImpl <em>Evidence Exhibit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.EvidenceExhibitImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getEvidenceExhibit()
		 * @generated
		 */
		EClass EVIDENCE_EXHIBIT = eINSTANCE.getEvidenceExhibit();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE_EXHIBIT__VALUE = eINSTANCE.getEvidenceExhibit_Value();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE_EXHIBIT__ID_REF = eINSTANCE.getEvidenceExhibit_IdRef();

		/**
		 * The meta object literal for the '<em><b>Question Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE_EXHIBIT__QUESTION_ID = eINSTANCE.getEvidenceExhibit_QuestionId();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.EvidenceImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '<em><b>Evidence Exhibit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__EVIDENCE_EXHIBIT = eINSTANCE.getEvidence_EvidenceExhibit();

		/**
		 * The meta object literal for the '<em><b>Relevance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__RELEVANCE = eINSTANCE.getEvidence_Relevance();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__RELIABILITY = eINSTANCE.getEvidence_Reliability();

		/**
		 * The meta object literal for the '<em><b>Witness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__WITNESS = eINSTANCE.getEvidence_Witness();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__ANNOTATION = eINSTANCE.getEvidence_Annotation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__ID = eINSTANCE.getEvidence_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__LABEL = eINSTANCE.getEvidence_Label();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVIDENCE__ORDINAL = eINSTANCE.getEvidence_Ordinal();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ExhibitImpl <em>Exhibit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ExhibitImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getExhibit()
		 * @generated
		 */
		EClass EXHIBIT = eINSTANCE.getExhibit();

		/**
		 * The meta object literal for the '<em><b>Archive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXHIBIT__ARCHIVE = eINSTANCE.getExhibit_Archive();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXHIBIT__META_DATA = eINSTANCE.getExhibit_MetaData();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXHIBIT__ANNOTATION = eINSTANCE.getExhibit_Annotation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXHIBIT__ID = eINSTANCE.getExhibit_Id();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.FlagImpl <em>Flag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.FlagImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getFlag()
		 * @generated
		 */
		EClass FLAG = eINSTANCE.getFlag();

		/**
		 * The meta object literal for the '<em><b>Witness</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLAG__WITNESS = eINSTANCE.getFlag_Witness();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG__DESCRIPTION = eINSTANCE.getFlag_Description();

		/**
		 * The meta object literal for the '<em><b>Flag Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG__FLAG_TYPE = eINSTANCE.getFlag_FlagType();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLAG__LABEL = eINSTANCE.getFlag_Label();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.IntervalImpl <em>Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.IntervalImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getInterval()
		 * @generated
		 */
		EClass INTERVAL = eINSTANCE.getInterval();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__MAX = eINSTANCE.getInterval_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL__MIN = eINSTANCE.getInterval_Min();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ListImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST__GROUP = eINSTANCE.getList_Group();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__LI = eINSTANCE.getList_Li();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.MemoImpl <em>Memo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.MemoImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getMemo()
		 * @generated
		 */
		EClass MEMO = eINSTANCE.getMemo();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMO__CREATOR = eINSTANCE.getMemo_Creator();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMO__READER = eINSTANCE.getMemo_Reader();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMO__SUBJECT = eINSTANCE.getMemo_Subject();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMO__BODY = eINSTANCE.getMemo_Body();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMO__ID = eINSTANCE.getMemo_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMO__TYPE = eINSTANCE.getMemo_Type();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.MetaDataImpl <em>Meta Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.MetaDataImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getMetaData()
		 * @generated
		 */
		EClass META_DATA = eINSTANCE.getMetaData();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__GROUP = eINSTANCE.getMetaData_Group();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__TITLE = eINSTANCE.getMetaData_Title();

		/**
		 * The meta object literal for the '<em><b>Security Marking</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__SECURITY_MARKING = eINSTANCE.getMetaData_SecurityMarking();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__CREATOR = eINSTANCE.getMetaData_Creator();

		/**
		 * The meta object literal for the '<em><b>Reader</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__READER = eINSTANCE.getMetaData_Reader();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__SUBJECT = eINSTANCE.getMetaData_Subject();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__DESCRIPTION = eINSTANCE.getMetaData_Description();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__PUBLISHER = eINSTANCE.getMetaData_Publisher();

		/**
		 * The meta object literal for the '<em><b>Contributor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__CONTRIBUTOR = eINSTANCE.getMetaData_Contributor();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_DATA__DATE = eINSTANCE.getMetaData_Date();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__TYPE = eINSTANCE.getMetaData_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__FORMAT = eINSTANCE.getMetaData_Format();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__IDENTIFIER = eINSTANCE.getMetaData_Identifier();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__SOURCE = eINSTANCE.getMetaData_Source();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__LANGUAGE = eINSTANCE.getMetaData_Language();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__RELATION = eINSTANCE.getMetaData_Relation();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__COVERAGE = eINSTANCE.getMetaData_Coverage();

		/**
		 * The meta object literal for the '<em><b>Rights</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__RIGHTS = eINSTANCE.getMetaData_Rights();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_DATA__IMAGE = eINSTANCE.getMetaData_Image();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.NationStateImpl <em>Nation State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.NationStateImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getNationState()
		 * @generated
		 */
		EClass NATION_STATE = eINSTANCE.getNationState();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION_STATE__GROUP = eINSTANCE.getNationState_Group();

		/**
		 * The meta object literal for the '<em><b>Perspective</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION_STATE__PERSPECTIVE = eINSTANCE.getNationState_Perspective();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATION_STATE__PERIOD = eINSTANCE.getNationState_Period();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION_STATE__ACTOR = eINSTANCE.getNationState_Actor();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION_STATE__REGION = eINSTANCE.getNationState_Region();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATION_STATE__EVENT = eINSTANCE.getNationState_Event();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ParameterImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__SYMBOL = eINSTANCE.getParameter_Symbol();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.PeriodImpl <em>Period</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.PeriodImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getPeriod()
		 * @generated
		 */
		EClass PERIOD = eINSTANCE.getPeriod();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__GROUP = eINSTANCE.getPeriod_Group();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__START = eINSTANCE.getPeriod_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERIOD__END = eINSTANCE.getPeriod_End();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIOD__LABEL = eINSTANCE.getPeriod_Label();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.PersonImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__MIDDLE_NAME = eINSTANCE.getPerson_MiddleName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>Nick Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NICK_NAME = eINSTANCE.getPerson_NickName();

		/**
		 * The meta object literal for the '<em><b>Organization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ORGANIZATION = eINSTANCE.getPerson_Organization();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DEPARTMENT = eINSTANCE.getPerson_Department();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__EMAIL = eINSTANCE.getPerson_Email();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__DESCRIPTION = eINSTANCE.getPerson_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.PublisherImpl <em>Publisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.PublisherImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getPublisher()
		 * @generated
		 */
		EClass PUBLISHER = eINSTANCE.getPublisher();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__DESCRIPTION = eINSTANCE.getPublisher_Description();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__ID_REF = eINSTANCE.getPublisher_IdRef();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER__OBJECT_TYPE = eINSTANCE.getPublisher_ObjectType();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.QuestionRelationshipsImpl <em>Question Relationships</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.QuestionRelationshipsImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getQuestionRelationships()
		 * @generated
		 */
		EClass QUESTION_RELATIONSHIPS = eINSTANCE.getQuestionRelationships();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_RELATIONSHIPS__DEPENDENT = eINSTANCE.getQuestionRelationships_Dependent();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.QuestionImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__GROUP = eINSTANCE.getQuestion_Group();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__TYPE = eINSTANCE.getQuestion_Type();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__CHOICE = eINSTANCE.getQuestion_Choice();

		/**
		 * The meta object literal for the '<em><b>Question Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__QUESTION_RELATIONSHIPS = eINSTANCE.getQuestion_QuestionRelationships();

		/**
		 * The meta object literal for the '<em><b>Aggregation Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__AGGREGATION_RULE = eINSTANCE.getQuestion_AggregationRule();

		/**
		 * The meta object literal for the '<em><b>Discovery Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__DISCOVERY_METHOD = eINSTANCE.getQuestion_DiscoveryMethod();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ANNOTATION = eINSTANCE.getQuestion_Annotation();

		/**
		 * The meta object literal for the '<em><b>Amplification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__AMPLIFICATION = eINSTANCE.getQuestion_Amplification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__DESCRIPTION = eINSTANCE.getQuestion_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ID = eINSTANCE.getQuestion_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__LABEL = eINSTANCE.getQuestion_Label();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ReaderImpl <em>Reader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ReaderImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getReader()
		 * @generated
		 */
		EClass READER = eINSTANCE.getReader();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READER__DESCRIPTION = eINSTANCE.getReader_Description();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READER__ID_REF = eINSTANCE.getReader_IdRef();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute READER__OBJECT_TYPE = eINSTANCE.getReader_ObjectType();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.RelevanceImpl <em>Relevance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.RelevanceImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getRelevance()
		 * @generated
		 */
		EClass RELEVANCE = eINSTANCE.getRelevance();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEVANCE__DESCRIPTION = eINSTANCE.getRelevance_Description();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEVANCE__LABEL = eINSTANCE.getRelevance_Label();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEVANCE__ORDINAL = eINSTANCE.getRelevance_Ordinal();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEVANCE__SYMBOL = eINSTANCE.getRelevance_Symbol();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ReliabilityImpl <em>Reliability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ReliabilityImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getReliability()
		 * @generated
		 */
		EClass RELIABILITY = eINSTANCE.getReliability();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__DESCRIPTION = eINSTANCE.getReliability_Description();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__LABEL = eINSTANCE.getReliability_Label();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__ORDINAL = eINSTANCE.getReliability_Ordinal();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIABILITY__SYMBOL = eINSTANCE.getReliability_Symbol();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.StartImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__VALUE = eINSTANCE.getStart_Value();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__SCHEME = eINSTANCE.getStart_Scheme();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.TemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.TemplateImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Meta Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__META_DATA = eINSTANCE.getTemplate_MetaData();

		/**
		 * The meta object literal for the '<em><b>Creating Tool</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__CREATING_TOOL = eINSTANCE.getTemplate_CreatingTool();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__ANNOTATION = eINSTANCE.getTemplate_Annotation();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__QUESTION = eINSTANCE.getTemplate_Question();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__ID = eINSTANCE.getTemplate_Id();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.ValueImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__MIXED = eINSTANCE.getValue_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__GROUP = eINSTANCE.getValue_Group();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__INTERVAL = eINSTANCE.getValue_Interval();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__LIST = eINSTANCE.getValue_List();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__TYPE = eINSTANCE.getValue_Type();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE__UNIT = eINSTANCE.getValue_Unit();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.impl.WitnessImpl <em>Witness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.impl.WitnessImpl
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getWitness()
		 * @generated
		 */
		EClass WITNESS = eINSTANCE.getWitness();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITNESS__DESCRIPTION = eINSTANCE.getWitness_Description();

		/**
		 * The meta object literal for the '<em><b>Id Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITNESS__ID_REF = eINSTANCE.getWitness_IdRef();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITNESS__TIMESTAMP = eINSTANCE.getWitness_Timestamp();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.ObjectType <em>Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.ObjectType
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectType()
		 * @generated
		 */
		EEnum OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.ObjectType1 <em>Object Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.ObjectType1
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectType1()
		 * @generated
		 */
		EEnum OBJECT_TYPE1 = eINSTANCE.getObjectType1();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.ObjectType2 <em>Object Type2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.ObjectType2
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectType2()
		 * @generated
		 */
		EEnum OBJECT_TYPE2 = eINSTANCE.getObjectType2();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.ObjectType3 <em>Object Type3</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.ObjectType3
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectType3()
		 * @generated
		 */
		EEnum OBJECT_TYPE3 = eINSTANCE.getObjectType3();

		/**
		 * The meta object literal for the '{@link net.certware.argument.aml.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.Type
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em>Object Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.ObjectType1
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectTypeObject()
		 * @generated
		 */
		EDataType OBJECT_TYPE_OBJECT = eINSTANCE.getObjectTypeObject();

		/**
		 * The meta object literal for the '<em>Object Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.ObjectType
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectTypeObject1()
		 * @generated
		 */
		EDataType OBJECT_TYPE_OBJECT1 = eINSTANCE.getObjectTypeObject1();

		/**
		 * The meta object literal for the '<em>Object Type Object2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.ObjectType2
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectTypeObject2()
		 * @generated
		 */
		EDataType OBJECT_TYPE_OBJECT2 = eINSTANCE.getObjectTypeObject2();

		/**
		 * The meta object literal for the '<em>Object Type Object3</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.ObjectType3
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getObjectTypeObject3()
		 * @generated
		 */
		EDataType OBJECT_TYPE_OBJECT3 = eINSTANCE.getObjectTypeObject3();

		/**
		 * The meta object literal for the '<em>Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.aml.Type
		 * @see net.certware.argument.aml.impl.AmlPackageImpl#getTypeObject()
		 * @generated
		 */
		EDataType TYPE_OBJECT = eINSTANCE.getTypeObject();

	}

} //AmlPackage
