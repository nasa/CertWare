
package net.certware.argument.aml.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * @author mrb
 * 
 */
public class AmlPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public AmlPackagePropertiesEditionProvider() {
		super();
		append(createAggregationRulePropertiesEditionProvider());
		append(createAmlDocumentPropertiesEditionProvider());
		append(createAnnotationPropertiesEditionProvider());
		append(createAnswerPropertiesEditionProvider());
		append(createArgumentTemplatePropertiesEditionProvider());
		append(createArgumentPropertiesEditionProvider());
		append(createBeliefPropertiesEditionProvider());
		append(createChoicePropertiesEditionProvider());
		append(createCollectionItemPropertiesEditionProvider());
		append(createCollectionPropertiesEditionProvider());
		append(createCoveragePropertiesEditionProvider());
		append(createCreatingToolPropertiesEditionProvider());
		append(createCreatorPropertiesEditionProvider());
		append(createDependentPropertiesEditionProvider());
		append(createDiscoveryMethodPropertiesEditionProvider());
		append(createDocumentRootPropertiesEditionProvider());
		append(createEndPropertiesEditionProvider());
		append(createEvidenceExhibitPropertiesEditionProvider());
		append(createEvidencePropertiesEditionProvider());
		append(createExhibitPropertiesEditionProvider());
		append(createFlagPropertiesEditionProvider());
		append(createIntervalPropertiesEditionProvider());
		append(createListPropertiesEditionProvider());
		append(createMemoPropertiesEditionProvider());
		append(createMetaDataPropertiesEditionProvider());
		append(createNationStatePropertiesEditionProvider());
		append(createParameterPropertiesEditionProvider());
		append(createPeriodPropertiesEditionProvider());
		append(createPersonPropertiesEditionProvider());
		append(createPublisherPropertiesEditionProvider());
		append(createQuestionRelationshipsPropertiesEditionProvider());
		append(createQuestionPropertiesEditionProvider());
		append(createReaderPropertiesEditionProvider());
		append(createRelevancePropertiesEditionProvider());
		append(createReliabilityPropertiesEditionProvider());
		append(createStartPropertiesEditionProvider());
		append(createTemplatePropertiesEditionProvider());
		append(createValuePropertiesEditionProvider());
		append(createWitnessPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * AggregationRule instances.
	 * 
	 */
	protected AggregationRulePropertiesEditionProvider aggregationRulePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a AggregationRule
	 * 
	 */
	public AggregationRulePropertiesEditionProvider createAggregationRulePropertiesEditionProvider() {
		if (aggregationRulePropertiesEditionProvider == null)
			aggregationRulePropertiesEditionProvider = new AggregationRulePropertiesEditionProvider();
		return aggregationRulePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * AmlDocument instances.
	 * 
	 */
	protected AmlDocumentPropertiesEditionProvider amlDocumentPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a AmlDocument
	 * 
	 */
	public AmlDocumentPropertiesEditionProvider createAmlDocumentPropertiesEditionProvider() {
		if (amlDocumentPropertiesEditionProvider == null)
			amlDocumentPropertiesEditionProvider = new AmlDocumentPropertiesEditionProvider();
		return amlDocumentPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Annotation instances.
	 * 
	 */
	protected AnnotationPropertiesEditionProvider annotationPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Annotation
	 * 
	 */
	public AnnotationPropertiesEditionProvider createAnnotationPropertiesEditionProvider() {
		if (annotationPropertiesEditionProvider == null)
			annotationPropertiesEditionProvider = new AnnotationPropertiesEditionProvider();
		return annotationPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Answer instances.
	 * 
	 */
	protected AnswerPropertiesEditionProvider answerPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Answer
	 * 
	 */
	public AnswerPropertiesEditionProvider createAnswerPropertiesEditionProvider() {
		if (answerPropertiesEditionProvider == null)
			answerPropertiesEditionProvider = new AnswerPropertiesEditionProvider();
		return answerPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * ArgumentTemplate instances.
	 * 
	 */
	protected ArgumentTemplatePropertiesEditionProvider argumentTemplatePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a ArgumentTemplate
	 * 
	 */
	public ArgumentTemplatePropertiesEditionProvider createArgumentTemplatePropertiesEditionProvider() {
		if (argumentTemplatePropertiesEditionProvider == null)
			argumentTemplatePropertiesEditionProvider = new ArgumentTemplatePropertiesEditionProvider();
		return argumentTemplatePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Argument instances.
	 * 
	 */
	protected ArgumentPropertiesEditionProvider argumentPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Argument
	 * 
	 */
	public ArgumentPropertiesEditionProvider createArgumentPropertiesEditionProvider() {
		if (argumentPropertiesEditionProvider == null)
			argumentPropertiesEditionProvider = new ArgumentPropertiesEditionProvider();
		return argumentPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Belief instances.
	 * 
	 */
	protected BeliefPropertiesEditionProvider beliefPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Belief
	 * 
	 */
	public BeliefPropertiesEditionProvider createBeliefPropertiesEditionProvider() {
		if (beliefPropertiesEditionProvider == null)
			beliefPropertiesEditionProvider = new BeliefPropertiesEditionProvider();
		return beliefPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Choice instances.
	 * 
	 */
	protected ChoicePropertiesEditionProvider choicePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Choice
	 * 
	 */
	public ChoicePropertiesEditionProvider createChoicePropertiesEditionProvider() {
		if (choicePropertiesEditionProvider == null)
			choicePropertiesEditionProvider = new ChoicePropertiesEditionProvider();
		return choicePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * CollectionItem instances.
	 * 
	 */
	protected CollectionItemPropertiesEditionProvider collectionItemPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a CollectionItem
	 * 
	 */
	public CollectionItemPropertiesEditionProvider createCollectionItemPropertiesEditionProvider() {
		if (collectionItemPropertiesEditionProvider == null)
			collectionItemPropertiesEditionProvider = new CollectionItemPropertiesEditionProvider();
		return collectionItemPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Collection instances.
	 * 
	 */
	protected CollectionPropertiesEditionProvider collectionPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Collection
	 * 
	 */
	public CollectionPropertiesEditionProvider createCollectionPropertiesEditionProvider() {
		if (collectionPropertiesEditionProvider == null)
			collectionPropertiesEditionProvider = new CollectionPropertiesEditionProvider();
		return collectionPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Coverage instances.
	 * 
	 */
	protected CoveragePropertiesEditionProvider coveragePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Coverage
	 * 
	 */
	public CoveragePropertiesEditionProvider createCoveragePropertiesEditionProvider() {
		if (coveragePropertiesEditionProvider == null)
			coveragePropertiesEditionProvider = new CoveragePropertiesEditionProvider();
		return coveragePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * CreatingTool instances.
	 * 
	 */
	protected CreatingToolPropertiesEditionProvider creatingToolPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a CreatingTool
	 * 
	 */
	public CreatingToolPropertiesEditionProvider createCreatingToolPropertiesEditionProvider() {
		if (creatingToolPropertiesEditionProvider == null)
			creatingToolPropertiesEditionProvider = new CreatingToolPropertiesEditionProvider();
		return creatingToolPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Creator instances.
	 * 
	 */
	protected CreatorPropertiesEditionProvider creatorPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Creator
	 * 
	 */
	public CreatorPropertiesEditionProvider createCreatorPropertiesEditionProvider() {
		if (creatorPropertiesEditionProvider == null)
			creatorPropertiesEditionProvider = new CreatorPropertiesEditionProvider();
		return creatorPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Dependent instances.
	 * 
	 */
	protected DependentPropertiesEditionProvider dependentPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Dependent
	 * 
	 */
	public DependentPropertiesEditionProvider createDependentPropertiesEditionProvider() {
		if (dependentPropertiesEditionProvider == null)
			dependentPropertiesEditionProvider = new DependentPropertiesEditionProvider();
		return dependentPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * DiscoveryMethod instances.
	 * 
	 */
	protected DiscoveryMethodPropertiesEditionProvider discoveryMethodPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a DiscoveryMethod
	 * 
	 */
	public DiscoveryMethodPropertiesEditionProvider createDiscoveryMethodPropertiesEditionProvider() {
		if (discoveryMethodPropertiesEditionProvider == null)
			discoveryMethodPropertiesEditionProvider = new DiscoveryMethodPropertiesEditionProvider();
		return discoveryMethodPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * DocumentRoot instances.
	 * 
	 */
	protected DocumentRootPropertiesEditionProvider documentRootPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a DocumentRoot
	 * 
	 */
	public DocumentRootPropertiesEditionProvider createDocumentRootPropertiesEditionProvider() {
		if (documentRootPropertiesEditionProvider == null)
			documentRootPropertiesEditionProvider = new DocumentRootPropertiesEditionProvider();
		return documentRootPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * End instances.
	 * 
	 */
	protected EndPropertiesEditionProvider endPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a End
	 * 
	 */
	public EndPropertiesEditionProvider createEndPropertiesEditionProvider() {
		if (endPropertiesEditionProvider == null)
			endPropertiesEditionProvider = new EndPropertiesEditionProvider();
		return endPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * EvidenceExhibit instances.
	 * 
	 */
	protected EvidenceExhibitPropertiesEditionProvider evidenceExhibitPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a EvidenceExhibit
	 * 
	 */
	public EvidenceExhibitPropertiesEditionProvider createEvidenceExhibitPropertiesEditionProvider() {
		if (evidenceExhibitPropertiesEditionProvider == null)
			evidenceExhibitPropertiesEditionProvider = new EvidenceExhibitPropertiesEditionProvider();
		return evidenceExhibitPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Evidence instances.
	 * 
	 */
	protected EvidencePropertiesEditionProvider evidencePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Evidence
	 * 
	 */
	public EvidencePropertiesEditionProvider createEvidencePropertiesEditionProvider() {
		if (evidencePropertiesEditionProvider == null)
			evidencePropertiesEditionProvider = new EvidencePropertiesEditionProvider();
		return evidencePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Exhibit instances.
	 * 
	 */
	protected ExhibitPropertiesEditionProvider exhibitPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Exhibit
	 * 
	 */
	public ExhibitPropertiesEditionProvider createExhibitPropertiesEditionProvider() {
		if (exhibitPropertiesEditionProvider == null)
			exhibitPropertiesEditionProvider = new ExhibitPropertiesEditionProvider();
		return exhibitPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Flag instances.
	 * 
	 */
	protected FlagPropertiesEditionProvider flagPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Flag
	 * 
	 */
	public FlagPropertiesEditionProvider createFlagPropertiesEditionProvider() {
		if (flagPropertiesEditionProvider == null)
			flagPropertiesEditionProvider = new FlagPropertiesEditionProvider();
		return flagPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Interval instances.
	 * 
	 */
	protected IntervalPropertiesEditionProvider intervalPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Interval
	 * 
	 */
	public IntervalPropertiesEditionProvider createIntervalPropertiesEditionProvider() {
		if (intervalPropertiesEditionProvider == null)
			intervalPropertiesEditionProvider = new IntervalPropertiesEditionProvider();
		return intervalPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * List instances.
	 * 
	 */
	protected ListPropertiesEditionProvider listPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a List
	 * 
	 */
	public ListPropertiesEditionProvider createListPropertiesEditionProvider() {
		if (listPropertiesEditionProvider == null)
			listPropertiesEditionProvider = new ListPropertiesEditionProvider();
		return listPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Memo instances.
	 * 
	 */
	protected MemoPropertiesEditionProvider memoPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Memo
	 * 
	 */
	public MemoPropertiesEditionProvider createMemoPropertiesEditionProvider() {
		if (memoPropertiesEditionProvider == null)
			memoPropertiesEditionProvider = new MemoPropertiesEditionProvider();
		return memoPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * MetaData instances.
	 * 
	 */
	protected MetaDataPropertiesEditionProvider metaDataPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a MetaData
	 * 
	 */
	public MetaDataPropertiesEditionProvider createMetaDataPropertiesEditionProvider() {
		if (metaDataPropertiesEditionProvider == null)
			metaDataPropertiesEditionProvider = new MetaDataPropertiesEditionProvider();
		return metaDataPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * NationState instances.
	 * 
	 */
	protected NationStatePropertiesEditionProvider nationStatePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a NationState
	 * 
	 */
	public NationStatePropertiesEditionProvider createNationStatePropertiesEditionProvider() {
		if (nationStatePropertiesEditionProvider == null)
			nationStatePropertiesEditionProvider = new NationStatePropertiesEditionProvider();
		return nationStatePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Parameter instances.
	 * 
	 */
	protected ParameterPropertiesEditionProvider parameterPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Parameter
	 * 
	 */
	public ParameterPropertiesEditionProvider createParameterPropertiesEditionProvider() {
		if (parameterPropertiesEditionProvider == null)
			parameterPropertiesEditionProvider = new ParameterPropertiesEditionProvider();
		return parameterPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Period instances.
	 * 
	 */
	protected PeriodPropertiesEditionProvider periodPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Period
	 * 
	 */
	public PeriodPropertiesEditionProvider createPeriodPropertiesEditionProvider() {
		if (periodPropertiesEditionProvider == null)
			periodPropertiesEditionProvider = new PeriodPropertiesEditionProvider();
		return periodPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Person instances.
	 * 
	 */
	protected PersonPropertiesEditionProvider personPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Person
	 * 
	 */
	public PersonPropertiesEditionProvider createPersonPropertiesEditionProvider() {
		if (personPropertiesEditionProvider == null)
			personPropertiesEditionProvider = new PersonPropertiesEditionProvider();
		return personPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Publisher instances.
	 * 
	 */
	protected PublisherPropertiesEditionProvider publisherPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Publisher
	 * 
	 */
	public PublisherPropertiesEditionProvider createPublisherPropertiesEditionProvider() {
		if (publisherPropertiesEditionProvider == null)
			publisherPropertiesEditionProvider = new PublisherPropertiesEditionProvider();
		return publisherPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * QuestionRelationships instances.
	 * 
	 */
	protected QuestionRelationshipsPropertiesEditionProvider questionRelationshipsPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a QuestionRelationships
	 * 
	 */
	public QuestionRelationshipsPropertiesEditionProvider createQuestionRelationshipsPropertiesEditionProvider() {
		if (questionRelationshipsPropertiesEditionProvider == null)
			questionRelationshipsPropertiesEditionProvider = new QuestionRelationshipsPropertiesEditionProvider();
		return questionRelationshipsPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Question instances.
	 * 
	 */
	protected QuestionPropertiesEditionProvider questionPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Question
	 * 
	 */
	public QuestionPropertiesEditionProvider createQuestionPropertiesEditionProvider() {
		if (questionPropertiesEditionProvider == null)
			questionPropertiesEditionProvider = new QuestionPropertiesEditionProvider();
		return questionPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Reader instances.
	 * 
	 */
	protected ReaderPropertiesEditionProvider readerPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Reader
	 * 
	 */
	public ReaderPropertiesEditionProvider createReaderPropertiesEditionProvider() {
		if (readerPropertiesEditionProvider == null)
			readerPropertiesEditionProvider = new ReaderPropertiesEditionProvider();
		return readerPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Relevance instances.
	 * 
	 */
	protected RelevancePropertiesEditionProvider relevancePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Relevance
	 * 
	 */
	public RelevancePropertiesEditionProvider createRelevancePropertiesEditionProvider() {
		if (relevancePropertiesEditionProvider == null)
			relevancePropertiesEditionProvider = new RelevancePropertiesEditionProvider();
		return relevancePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Reliability instances.
	 * 
	 */
	protected ReliabilityPropertiesEditionProvider reliabilityPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Reliability
	 * 
	 */
	public ReliabilityPropertiesEditionProvider createReliabilityPropertiesEditionProvider() {
		if (reliabilityPropertiesEditionProvider == null)
			reliabilityPropertiesEditionProvider = new ReliabilityPropertiesEditionProvider();
		return reliabilityPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Start instances.
	 * 
	 */
	protected StartPropertiesEditionProvider startPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Start
	 * 
	 */
	public StartPropertiesEditionProvider createStartPropertiesEditionProvider() {
		if (startPropertiesEditionProvider == null)
			startPropertiesEditionProvider = new StartPropertiesEditionProvider();
		return startPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Template instances.
	 * 
	 */
	protected TemplatePropertiesEditionProvider templatePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Template
	 * 
	 */
	public TemplatePropertiesEditionProvider createTemplatePropertiesEditionProvider() {
		if (templatePropertiesEditionProvider == null)
			templatePropertiesEditionProvider = new TemplatePropertiesEditionProvider();
		return templatePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Value instances.
	 * 
	 */
	protected ValuePropertiesEditionProvider valuePropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Value
	 * 
	 */
	public ValuePropertiesEditionProvider createValuePropertiesEditionProvider() {
		if (valuePropertiesEditionProvider == null)
			valuePropertiesEditionProvider = new ValuePropertiesEditionProvider();
		return valuePropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Witness instances.
	 * 
	 */
	protected WitnessPropertiesEditionProvider witnessPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Witness
	 * 
	 */
	public WitnessPropertiesEditionProvider createWitnessPropertiesEditionProvider() {
		if (witnessPropertiesEditionProvider == null)
			witnessPropertiesEditionProvider = new WitnessPropertiesEditionProvider();
		return witnessPropertiesEditionProvider;
	}

}
