/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import net.certware.evidence.hugin.netDSL.*;

import org.eclipse.emf.ecore.EClass;
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
public class NetDSLFactoryImpl extends EFactoryImpl implements NetDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NetDSLFactory init()
  {
    try
    {
      NetDSLFactory theNetDSLFactory = (NetDSLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/evidence/hugin/NetDSL"); 
      if (theNetDSLFactory != null)
      {
        return theNetDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NetDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NetDSLPackage.MODEL: return createModel();
      case NetDSLPackage.DOMAIN_DEFINITION: return createDomainDefinition();
      case NetDSLPackage.DOMAIN_HEADER: return createDomainHeader();
      case NetDSLPackage.DOMAIN_ELEMENT: return createDomainElement();
      case NetDSLPackage.ATTRIBUTE: return createAttribute();
      case NetDSLPackage.BASIC_NODE: return createBasicNode();
      case NetDSLPackage.STATES_ATTRIBUTE: return createStatesAttribute();
      case NetDSLPackage.LABEL_ATTRIBUTE: return createLabelAttribute();
      case NetDSLPackage.POSITION_ATTRIBUTE: return createPositionAttribute();
      case NetDSLPackage.SUBTYPE_ATTRIBUTE: return createSubtypeAttribute();
      case NetDSLPackage.STATE_VALUES_ATTRIBUTE: return createStateValuesAttribute();
      case NetDSLPackage.APPLICATION_ATTRIBUTE: return createApplicationAttribute();
      case NetDSLPackage.NODE_SIZE_ATTRIBUTE: return createNodeSizeAttribute();
      case NetDSLPackage.POTENTIAL: return createPotential();
      case NetDSLPackage.POTENTIAL_GRAPH: return createPotentialGraph();
      case NetDSLPackage.POTENTIAL_MODEL: return createPotentialModel();
      case NetDSLPackage.POTENTIAL_ATTRIBUTE: return createPotentialAttribute();
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE: return createPotentialDataAttribute();
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST: return createUnstructuredDataList();
      case NetDSLPackage.STRUCTURED_DATA_LIST: return createStructuredDataList();
      case NetDSLPackage.FLOAT_DATA_LIST: return createFloatDataList();
      case NetDSLPackage.NORMAL_DISTRIBUTION: return createNormalDistribution();
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE: return createPotentialTableAttribute();
      case NetDSLPackage.MODEL_NODES_ATTRIBUTE: return createModelNodesAttribute();
      case NetDSLPackage.SAMPLES_ATTRIBUTE: return createSamplesAttribute();
      case NetDSLPackage.MODEL_DATA_ATTRIBUTE: return createModelDataAttribute();
      case NetDSLPackage.CLASS_DEFINITION: return createClassDefinition();
      case NetDSLPackage.CLASS_ELEMENT: return createClassElement();
      case NetDSLPackage.CLASS_INSTANCE: return createClassInstance();
      case NetDSLPackage.INPUT_BINDINGS: return createInputBindings();
      case NetDSLPackage.INPUT_BINDING: return createInputBinding();
      case NetDSLPackage.OUTPUT_BINDINGS: return createOutputBindings();
      case NetDSLPackage.OUTPUT_BINDING: return createOutputBinding();
      case NetDSLPackage.NODE_ATTRIBUTES: return createNodeAttributes();
      case NetDSLPackage.EXPRESSION: return createExpression();
      case NetDSLPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case NetDSLPackage.TERM: return createTerm();
      case NetDSLPackage.EXP_FACTOR: return createExpFactor();
      case NetDSLPackage.FACTOR: return createFactor();
      case NetDSLPackage.EXPRESSION_SEQUENCE: return createExpressionSequence();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainDefinition createDomainDefinition()
  {
    DomainDefinitionImpl domainDefinition = new DomainDefinitionImpl();
    return domainDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainHeader createDomainHeader()
  {
    DomainHeaderImpl domainHeader = new DomainHeaderImpl();
    return domainHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainElement createDomainElement()
  {
    DomainElementImpl domainElement = new DomainElementImpl();
    return domainElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicNode createBasicNode()
  {
    BasicNodeImpl basicNode = new BasicNodeImpl();
    return basicNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatesAttribute createStatesAttribute()
  {
    StatesAttributeImpl statesAttribute = new StatesAttributeImpl();
    return statesAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelAttribute createLabelAttribute()
  {
    LabelAttributeImpl labelAttribute = new LabelAttributeImpl();
    return labelAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositionAttribute createPositionAttribute()
  {
    PositionAttributeImpl positionAttribute = new PositionAttributeImpl();
    return positionAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubtypeAttribute createSubtypeAttribute()
  {
    SubtypeAttributeImpl subtypeAttribute = new SubtypeAttributeImpl();
    return subtypeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateValuesAttribute createStateValuesAttribute()
  {
    StateValuesAttributeImpl stateValuesAttribute = new StateValuesAttributeImpl();
    return stateValuesAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ApplicationAttribute createApplicationAttribute()
  {
    ApplicationAttributeImpl applicationAttribute = new ApplicationAttributeImpl();
    return applicationAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeSizeAttribute createNodeSizeAttribute()
  {
    NodeSizeAttributeImpl nodeSizeAttribute = new NodeSizeAttributeImpl();
    return nodeSizeAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Potential createPotential()
  {
    PotentialImpl potential = new PotentialImpl();
    return potential;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PotentialGraph createPotentialGraph()
  {
    PotentialGraphImpl potentialGraph = new PotentialGraphImpl();
    return potentialGraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PotentialModel createPotentialModel()
  {
    PotentialModelImpl potentialModel = new PotentialModelImpl();
    return potentialModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PotentialAttribute createPotentialAttribute()
  {
    PotentialAttributeImpl potentialAttribute = new PotentialAttributeImpl();
    return potentialAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PotentialDataAttribute createPotentialDataAttribute()
  {
    PotentialDataAttributeImpl potentialDataAttribute = new PotentialDataAttributeImpl();
    return potentialDataAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnstructuredDataList createUnstructuredDataList()
  {
    UnstructuredDataListImpl unstructuredDataList = new UnstructuredDataListImpl();
    return unstructuredDataList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuredDataList createStructuredDataList()
  {
    StructuredDataListImpl structuredDataList = new StructuredDataListImpl();
    return structuredDataList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatDataList createFloatDataList()
  {
    FloatDataListImpl floatDataList = new FloatDataListImpl();
    return floatDataList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalDistribution createNormalDistribution()
  {
    NormalDistributionImpl normalDistribution = new NormalDistributionImpl();
    return normalDistribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PotentialTableAttribute createPotentialTableAttribute()
  {
    PotentialTableAttributeImpl potentialTableAttribute = new PotentialTableAttributeImpl();
    return potentialTableAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelNodesAttribute createModelNodesAttribute()
  {
    ModelNodesAttributeImpl modelNodesAttribute = new ModelNodesAttributeImpl();
    return modelNodesAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SamplesAttribute createSamplesAttribute()
  {
    SamplesAttributeImpl samplesAttribute = new SamplesAttributeImpl();
    return samplesAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDataAttribute createModelDataAttribute()
  {
    ModelDataAttributeImpl modelDataAttribute = new ModelDataAttributeImpl();
    return modelDataAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDefinition createClassDefinition()
  {
    ClassDefinitionImpl classDefinition = new ClassDefinitionImpl();
    return classDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassElement createClassElement()
  {
    ClassElementImpl classElement = new ClassElementImpl();
    return classElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassInstance createClassInstance()
  {
    ClassInstanceImpl classInstance = new ClassInstanceImpl();
    return classInstance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputBindings createInputBindings()
  {
    InputBindingsImpl inputBindings = new InputBindingsImpl();
    return inputBindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputBinding createInputBinding()
  {
    InputBindingImpl inputBinding = new InputBindingImpl();
    return inputBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputBindings createOutputBindings()
  {
    OutputBindingsImpl outputBindings = new OutputBindingsImpl();
    return outputBindings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputBinding createOutputBinding()
  {
    OutputBindingImpl outputBinding = new OutputBindingImpl();
    return outputBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeAttributes createNodeAttributes()
  {
    NodeAttributesImpl nodeAttributes = new NodeAttributesImpl();
    return nodeAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpFactor createExpFactor()
  {
    ExpFactorImpl expFactor = new ExpFactorImpl();
    return expFactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Factor createFactor()
  {
    FactorImpl factor = new FactorImpl();
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionSequence createExpressionSequence()
  {
    ExpressionSequenceImpl expressionSequence = new ExpressionSequenceImpl();
    return expressionSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDSLPackage getNetDSLPackage()
  {
    return (NetDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NetDSLPackage getPackage()
  {
    return NetDSLPackage.eINSTANCE;
  }

} //NetDSLFactoryImpl
