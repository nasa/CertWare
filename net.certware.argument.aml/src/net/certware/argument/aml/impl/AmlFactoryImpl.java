/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 * 
 */
package net.certware.argument.aml.impl;

import net.certware.argument.aml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmlFactoryImpl extends EFactoryImpl implements AmlFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmlFactory init() {
		try {
			AmlFactory theAmlFactory = (AmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ai.sri.com/AML"); //$NON-NLS-1$ 
			if (theAmlFactory != null) {
				return theAmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AmlPackage.AGGREGATION_RULE: return createAggregationRule();
			case AmlPackage.AML_DOCUMENT: return createAmlDocument();
			case AmlPackage.ANNOTATION: return createAnnotation();
			case AmlPackage.ANSWER: return createAnswer();
			case AmlPackage.ARGUMENT_TEMPLATE: return createArgumentTemplate();
			case AmlPackage.ARGUMENT: return createArgument();
			case AmlPackage.BELIEF: return createBelief();
			case AmlPackage.CHOICE: return createChoice();
			case AmlPackage.COLLECTION_ITEM: return createCollectionItem();
			case AmlPackage.COLLECTION: return createCollection();
			case AmlPackage.COVERAGE: return createCoverage();
			case AmlPackage.CREATING_TOOL: return createCreatingTool();
			case AmlPackage.CREATOR: return createCreator();
			case AmlPackage.DEPENDENT: return createDependent();
			case AmlPackage.DISCOVERY_METHOD: return createDiscoveryMethod();
			case AmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AmlPackage.END: return createEnd();
			case AmlPackage.EVIDENCE_EXHIBIT: return createEvidenceExhibit();
			case AmlPackage.EVIDENCE: return createEvidence();
			case AmlPackage.EXHIBIT: return createExhibit();
			case AmlPackage.FLAG: return createFlag();
			case AmlPackage.INTERVAL: return createInterval();
			case AmlPackage.LIST: return createList();
			case AmlPackage.MEMO: return createMemo();
			case AmlPackage.META_DATA: return createMetaData();
			case AmlPackage.NATION_STATE: return createNationState();
			case AmlPackage.PARAMETER: return createParameter();
			case AmlPackage.PERIOD: return createPeriod();
			case AmlPackage.PERSON: return createPerson();
			case AmlPackage.PUBLISHER: return createPublisher();
			case AmlPackage.QUESTION_RELATIONSHIPS: return createQuestionRelationships();
			case AmlPackage.QUESTION: return createQuestion();
			case AmlPackage.READER: return createReader();
			case AmlPackage.RELEVANCE: return createRelevance();
			case AmlPackage.RELIABILITY: return createReliability();
			case AmlPackage.START: return createStart();
			case AmlPackage.TEMPLATE: return createTemplate();
			case AmlPackage.VALUE: return createValue();
			case AmlPackage.WITNESS: return createWitness();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AmlPackage.OBJECT_TYPE:
				return createObjectTypeFromString(eDataType, initialValue);
			case AmlPackage.OBJECT_TYPE1:
				return createObjectType1FromString(eDataType, initialValue);
			case AmlPackage.OBJECT_TYPE2:
				return createObjectType2FromString(eDataType, initialValue);
			case AmlPackage.OBJECT_TYPE3:
				return createObjectType3FromString(eDataType, initialValue);
			case AmlPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			case AmlPackage.OBJECT_TYPE_OBJECT:
				return createObjectTypeObjectFromString(eDataType, initialValue);
			case AmlPackage.OBJECT_TYPE_OBJECT1:
				return createObjectTypeObject1FromString(eDataType, initialValue);
			case AmlPackage.OBJECT_TYPE_OBJECT2:
				return createObjectTypeObject2FromString(eDataType, initialValue);
			case AmlPackage.OBJECT_TYPE_OBJECT3:
				return createObjectTypeObject3FromString(eDataType, initialValue);
			case AmlPackage.TYPE_OBJECT:
				return createTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AmlPackage.OBJECT_TYPE:
				return convertObjectTypeToString(eDataType, instanceValue);
			case AmlPackage.OBJECT_TYPE1:
				return convertObjectType1ToString(eDataType, instanceValue);
			case AmlPackage.OBJECT_TYPE2:
				return convertObjectType2ToString(eDataType, instanceValue);
			case AmlPackage.OBJECT_TYPE3:
				return convertObjectType3ToString(eDataType, instanceValue);
			case AmlPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			case AmlPackage.OBJECT_TYPE_OBJECT:
				return convertObjectTypeObjectToString(eDataType, instanceValue);
			case AmlPackage.OBJECT_TYPE_OBJECT1:
				return convertObjectTypeObject1ToString(eDataType, instanceValue);
			case AmlPackage.OBJECT_TYPE_OBJECT2:
				return convertObjectTypeObject2ToString(eDataType, instanceValue);
			case AmlPackage.OBJECT_TYPE_OBJECT3:
				return convertObjectTypeObject3ToString(eDataType, instanceValue);
			case AmlPackage.TYPE_OBJECT:
				return convertTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationRule createAggregationRule() {
		AggregationRuleImpl aggregationRule = new AggregationRuleImpl();
		return aggregationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmlDocument createAmlDocument() {
		AmlDocumentImpl amlDocument = new AmlDocumentImpl();
		return amlDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer createAnswer() {
		AnswerImpl answer = new AnswerImpl();
		return answer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentTemplate createArgumentTemplate() {
		ArgumentTemplateImpl argumentTemplate = new ArgumentTemplateImpl();
		return argumentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Belief createBelief() {
		BeliefImpl belief = new BeliefImpl();
		return belief;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionItem createCollectionItem() {
		CollectionItemImpl collectionItem = new CollectionItemImpl();
		return collectionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage createCoverage() {
		CoverageImpl coverage = new CoverageImpl();
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreatingTool createCreatingTool() {
		CreatingToolImpl creatingTool = new CreatingToolImpl();
		return creatingTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator createCreator() {
		CreatorImpl creator = new CreatorImpl();
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependent createDependent() {
		DependentImpl dependent = new DependentImpl();
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoveryMethod createDiscoveryMethod() {
		DiscoveryMethodImpl discoveryMethod = new DiscoveryMethodImpl();
		return discoveryMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceExhibit createEvidenceExhibit() {
		EvidenceExhibitImpl evidenceExhibit = new EvidenceExhibitImpl();
		return evidenceExhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evidence createEvidence() {
		EvidenceImpl evidence = new EvidenceImpl();
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exhibit createExhibit() {
		ExhibitImpl exhibit = new ExhibitImpl();
		return exhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag createFlag() {
		FlagImpl flag = new FlagImpl();
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interval createInterval() {
		IntervalImpl interval = new IntervalImpl();
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List createList() {
		ListImpl list = new ListImpl();
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memo createMemo() {
		MemoImpl memo = new MemoImpl();
		return memo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationState createNationState() {
		NationStateImpl nationState = new NationStateImpl();
		return nationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher createPublisher() {
		PublisherImpl publisher = new PublisherImpl();
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionRelationships createQuestionRelationships() {
		QuestionRelationshipsImpl questionRelationships = new QuestionRelationshipsImpl();
		return questionRelationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reader createReader() {
		ReaderImpl reader = new ReaderImpl();
		return reader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relevance createRelevance() {
		RelevanceImpl relevance = new RelevanceImpl();
		return relevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliability createReliability() {
		ReliabilityImpl reliability = new ReliabilityImpl();
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Witness createWitness() {
		WitnessImpl witness = new WitnessImpl();
		return witness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectTypeFromString(EDataType eDataType, String initialValue) {
		ObjectType result = ObjectType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType1 createObjectType1FromString(EDataType eDataType, String initialValue) {
		ObjectType1 result = ObjectType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType2 createObjectType2FromString(EDataType eDataType, String initialValue) {
		ObjectType2 result = ObjectType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType3 createObjectType3FromString(EDataType eDataType, String initialValue) {
		ObjectType3 result = ObjectType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Type result = Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType1 createObjectTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createObjectType1FromString(AmlPackage.Literals.OBJECT_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertObjectType1ToString(AmlPackage.Literals.OBJECT_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createObjectTypeFromString(AmlPackage.Literals.OBJECT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertObjectTypeToString(AmlPackage.Literals.OBJECT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType2 createObjectTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createObjectType2FromString(AmlPackage.Literals.OBJECT_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertObjectType2ToString(AmlPackage.Literals.OBJECT_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType3 createObjectTypeObject3FromString(EDataType eDataType, String initialValue) {
		return createObjectType3FromString(AmlPackage.Literals.OBJECT_TYPE3, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectTypeObject3ToString(EDataType eDataType, Object instanceValue) {
		return convertObjectType3ToString(AmlPackage.Literals.OBJECT_TYPE3, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeFromString(AmlPackage.Literals.TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeToString(AmlPackage.Literals.TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmlPackage getAmlPackage() {
		return (AmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AmlPackage getPackage() {
		return AmlPackage.eINSTANCE;
	}

} //AmlFactoryImpl
