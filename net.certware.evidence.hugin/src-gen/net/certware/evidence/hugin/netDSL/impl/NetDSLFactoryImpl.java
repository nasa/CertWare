/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import net.certware.evidence.hugin.netDSL.AdditiveExp;
import net.certware.evidence.hugin.netDSL.AndExp;
import net.certware.evidence.hugin.netDSL.ApplicationAttribute;
import net.certware.evidence.hugin.netDSL.Assignment;
import net.certware.evidence.hugin.netDSL.AssignmentOp;
import net.certware.evidence.hugin.netDSL.Attribute;
import net.certware.evidence.hugin.netDSL.BasicNode;
import net.certware.evidence.hugin.netDSL.BooleanLiteral;
import net.certware.evidence.hugin.netDSL.ClassDefinition;
import net.certware.evidence.hugin.netDSL.ClassElement;
import net.certware.evidence.hugin.netDSL.ClassInstance;
import net.certware.evidence.hugin.netDSL.DomainDefinition;
import net.certware.evidence.hugin.netDSL.DomainElement;
import net.certware.evidence.hugin.netDSL.DomainHeader;
import net.certware.evidence.hugin.netDSL.DoubleLiteral;
import net.certware.evidence.hugin.netDSL.Expression;
import net.certware.evidence.hugin.netDSL.ExpressionSequence;
import net.certware.evidence.hugin.netDSL.InputBinding;
import net.certware.evidence.hugin.netDSL.InputBindings;
import net.certware.evidence.hugin.netDSL.IntegerLiteral;
import net.certware.evidence.hugin.netDSL.LabelAttribute;
import net.certware.evidence.hugin.netDSL.List1;
import net.certware.evidence.hugin.netDSL.List2;
import net.certware.evidence.hugin.netDSL.List3;
import net.certware.evidence.hugin.netDSL.List4;
import net.certware.evidence.hugin.netDSL.List5;
import net.certware.evidence.hugin.netDSL.MatrixRow;
import net.certware.evidence.hugin.netDSL.Model;
import net.certware.evidence.hugin.netDSL.ModelDataAttribute;
import net.certware.evidence.hugin.netDSL.ModelNodesAttribute;
import net.certware.evidence.hugin.netDSL.MultiplicativeExp;
import net.certware.evidence.hugin.netDSL.NetDSLFactory;
import net.certware.evidence.hugin.netDSL.NetDSLPackage;
import net.certware.evidence.hugin.netDSL.NodeAttributes;
import net.certware.evidence.hugin.netDSL.NodeSizeAttribute;
import net.certware.evidence.hugin.netDSL.Operator;
import net.certware.evidence.hugin.netDSL.OrExp;
import net.certware.evidence.hugin.netDSL.OutputBinding;
import net.certware.evidence.hugin.netDSL.OutputBindings;
import net.certware.evidence.hugin.netDSL.PositionAttribute;
import net.certware.evidence.hugin.netDSL.Potential;
import net.certware.evidence.hugin.netDSL.PotentialAttribute;
import net.certware.evidence.hugin.netDSL.PotentialDataAttribute;
import net.certware.evidence.hugin.netDSL.PotentialGraph;
import net.certware.evidence.hugin.netDSL.PotentialModel;
import net.certware.evidence.hugin.netDSL.PotentialTableAttribute;
import net.certware.evidence.hugin.netDSL.RelationalExp;
import net.certware.evidence.hugin.netDSL.SamplesAttribute;
import net.certware.evidence.hugin.netDSL.StateValuesAttribute;
import net.certware.evidence.hugin.netDSL.StatesAttribute;
import net.certware.evidence.hugin.netDSL.StringLiteral;
import net.certware.evidence.hugin.netDSL.SubtypeAttribute;
import net.certware.evidence.hugin.netDSL.TermExpression;
import net.certware.evidence.hugin.netDSL.TermLiteral;
import net.certware.evidence.hugin.netDSL.VarRef;
import net.certware.evidence.hugin.netDSL.additiveExpression;
import net.certware.evidence.hugin.netDSL.andExpression;
import net.certware.evidence.hugin.netDSL.assignmentOpExpression;
import net.certware.evidence.hugin.netDSL.multiplicativeExpression;
import net.certware.evidence.hugin.netDSL.orExpression;
import net.certware.evidence.hugin.netDSL.relationalExpression;
import net.certware.evidence.hugin.netDSL.unaryExpression;

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
      case NetDSLPackage.INTEGER: return createInteger();
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
      case NetDSLPackage.MATRIX_ROW: return createMatrixRow();
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
      case NetDSLPackage.EXPRESSION_SEQUENCE: return createExpressionSequence();
      case NetDSLPackage.EXPRESSION: return createExpression();
      case NetDSLPackage.ASSIGNMENT_OP_EXPRESSION: return createassignmentOpExpression();
      case NetDSLPackage.OR_EXPRESSION: return createorExpression();
      case NetDSLPackage.AND_EXPRESSION: return createandExpression();
      case NetDSLPackage.RELATIONAL_EXPRESSION: return createrelationalExpression();
      case NetDSLPackage.ADDITIVE_EXPRESSION: return createadditiveExpression();
      case NetDSLPackage.MULTIPLICATIVE_EXPRESSION: return createmultiplicativeExpression();
      case NetDSLPackage.UNARY_EXPRESSION: return createunaryExpression();
      case NetDSLPackage.OPERATOR: return createOperator();
      case NetDSLPackage.TERM_EXPRESSION: return createTermExpression();
      case NetDSLPackage.TERM_LITERAL: return createTermLiteral();
      case NetDSLPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case NetDSLPackage.LIST5: return createList5();
      case NetDSLPackage.LIST4: return createList4();
      case NetDSLPackage.LIST3: return createList3();
      case NetDSLPackage.LIST2: return createList2();
      case NetDSLPackage.LIST1: return createList1();
      case NetDSLPackage.ASSIGNMENT: return createAssignment();
      case NetDSLPackage.ASSIGNMENT_OP: return createAssignmentOp();
      case NetDSLPackage.OR_EXP: return createOrExp();
      case NetDSLPackage.AND_EXP: return createAndExp();
      case NetDSLPackage.RELATIONAL_EXP: return createRelationalExp();
      case NetDSLPackage.ADDITIVE_EXP: return createAdditiveExp();
      case NetDSLPackage.MULTIPLICATIVE_EXP: return createMultiplicativeExp();
      case NetDSLPackage.VAR_REF: return createVarRef();
      case NetDSLPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case NetDSLPackage.STRING_LITERAL: return createStringLiteral();
      case NetDSLPackage.DOUBLE_LITERAL: return createDoubleLiteral();
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
  public net.certware.evidence.hugin.netDSL.Integer createInteger()
  {
    IntegerImpl integer = new IntegerImpl();
    return integer;
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
  public MatrixRow createMatrixRow()
  {
    MatrixRowImpl matrixRow = new MatrixRowImpl();
    return matrixRow;
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
  public assignmentOpExpression createassignmentOpExpression()
  {
    assignmentOpExpressionImpl assignmentOpExpression = new assignmentOpExpressionImpl();
    return assignmentOpExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public orExpression createorExpression()
  {
    orExpressionImpl orExpression = new orExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public andExpression createandExpression()
  {
    andExpressionImpl andExpression = new andExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relationalExpression createrelationalExpression()
  {
    relationalExpressionImpl relationalExpression = new relationalExpressionImpl();
    return relationalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public additiveExpression createadditiveExpression()
  {
    additiveExpressionImpl additiveExpression = new additiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public multiplicativeExpression createmultiplicativeExpression()
  {
    multiplicativeExpressionImpl multiplicativeExpression = new multiplicativeExpressionImpl();
    return multiplicativeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpression createunaryExpression()
  {
    unaryExpressionImpl unaryExpression = new unaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operator createOperator()
  {
    OperatorImpl operator = new OperatorImpl();
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermExpression createTermExpression()
  {
    TermExpressionImpl termExpression = new TermExpressionImpl();
    return termExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TermLiteral createTermLiteral()
  {
    TermLiteralImpl termLiteral = new TermLiteralImpl();
    return termLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List5 createList5()
  {
    List5Impl list5 = new List5Impl();
    return list5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List4 createList4()
  {
    List4Impl list4 = new List4Impl();
    return list4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List3 createList3()
  {
    List3Impl list3 = new List3Impl();
    return list3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List2 createList2()
  {
    List2Impl list2 = new List2Impl();
    return list2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List1 createList1()
  {
    List1Impl list1 = new List1Impl();
    return list1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentOp createAssignmentOp()
  {
    AssignmentOpImpl assignmentOp = new AssignmentOpImpl();
    return assignmentOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExp createOrExp()
  {
    OrExpImpl orExp = new OrExpImpl();
    return orExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExp createAndExp()
  {
    AndExpImpl andExp = new AndExpImpl();
    return andExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationalExp createRelationalExp()
  {
    RelationalExpImpl relationalExp = new RelationalExpImpl();
    return relationalExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExp createAdditiveExp()
  {
    AdditiveExpImpl additiveExp = new AdditiveExpImpl();
    return additiveExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiplicativeExp createMultiplicativeExp()
  {
    MultiplicativeExpImpl multiplicativeExp = new MultiplicativeExpImpl();
    return multiplicativeExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarRef createVarRef()
  {
    VarRefImpl varRef = new VarRefImpl();
    return varRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleLiteral createDoubleLiteral()
  {
    DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
    return doubleLiteral;
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
