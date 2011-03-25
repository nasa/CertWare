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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetDSLPackageImpl extends EPackageImpl implements NetDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicNodeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statesAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subtypeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateValuesAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass applicationAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeSizeAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass potentialEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass potentialGraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass potentialModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass potentialAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass potentialDataAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass matrixRowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass potentialTableAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelNodesAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass samplesAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelDataAttributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classInstanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputBindingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputBindingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeAttributesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentOpExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass list5EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass list4EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass list3EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass list2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass list1EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentOpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationalExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicativeExpEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass doubleLiteralEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.certware.evidence.hugin.netDSL.NetDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private NetDSLPackageImpl()
  {
    super(eNS_URI, NetDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link NetDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static NetDSLPackage init()
  {
    if (isInited) return (NetDSLPackage)EPackage.Registry.INSTANCE.getEPackage(NetDSLPackage.eNS_URI);

    // Obtain or create and register package
    NetDSLPackageImpl theNetDSLPackage = (NetDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NetDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NetDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theNetDSLPackage.createPackageContents();

    // Initialize created meta-data
    theNetDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNetDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(NetDSLPackage.eNS_URI, theNetDSLPackage);
    return theNetDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Domain()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteger()
  {
    return integerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteger_I()
  {
    return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainDefinition()
  {
    return domainDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainDefinition_Header()
  {
    return (EReference)domainDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainDefinition_Elements()
  {
    return (EReference)domainDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainHeader()
  {
    return domainHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainHeader_Attributes()
  {
    return (EReference)domainHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainElement()
  {
    return domainElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicNode()
  {
    return basicNodeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicNode_Keyword()
  {
    return (EAttribute)basicNodeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicNode_Id()
  {
    return (EAttribute)basicNodeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicNode_Attributes()
  {
    return (EReference)basicNodeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatesAttribute()
  {
    return statesAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatesAttribute_States()
  {
    return (EAttribute)statesAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelAttribute()
  {
    return labelAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelAttribute_Value()
  {
    return (EAttribute)labelAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositionAttribute()
  {
    return positionAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubtypeAttribute()
  {
    return subtypeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubtypeAttribute_Subtype()
  {
    return (EAttribute)subtypeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateValuesAttribute()
  {
    return stateValuesAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateValuesAttribute_Numbers()
  {
    return (EAttribute)stateValuesAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getApplicationAttribute()
  {
    return applicationAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationAttribute_Key()
  {
    return (EAttribute)applicationAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getApplicationAttribute_Value()
  {
    return (EAttribute)applicationAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeSizeAttribute()
  {
    return nodeSizeAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeSizeAttribute_Width()
  {
    return (EAttribute)nodeSizeAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNodeSizeAttribute_Height()
  {
    return (EAttribute)nodeSizeAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPotential()
  {
    return potentialEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPotential_Graph()
  {
    return (EReference)potentialEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPotential_Model()
  {
    return (EReference)potentialEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPotentialGraph()
  {
    return potentialGraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPotentialGraph_Children()
  {
    return (EAttribute)potentialGraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPotentialGraph_Parents()
  {
    return (EAttribute)potentialGraphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPotentialModel()
  {
    return potentialModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPotentialModel_Attributes()
  {
    return (EReference)potentialModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPotentialAttribute()
  {
    return potentialAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPotentialDataAttribute()
  {
    return potentialDataAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPotentialDataAttribute_Data()
  {
    return (EReference)potentialDataAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMatrixRow()
  {
    return matrixRowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatrixRow_R5()
  {
    return (EReference)matrixRowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatrixRow_R4()
  {
    return (EReference)matrixRowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatrixRow_R3()
  {
    return (EReference)matrixRowEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatrixRow_R2()
  {
    return (EReference)matrixRowEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMatrixRow_R1()
  {
    return (EReference)matrixRowEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPotentialTableAttribute()
  {
    return potentialTableAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPotentialTableAttribute_Nodes()
  {
    return (EReference)potentialTableAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPotentialTableAttribute_Samples()
  {
    return (EReference)potentialTableAttributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPotentialTableAttribute_Data()
  {
    return (EReference)potentialTableAttributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelNodesAttribute()
  {
    return modelNodesAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelNodesAttribute_Configurations()
  {
    return (EAttribute)modelNodesAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSamplesAttribute()
  {
    return samplesAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSamplesAttribute_Value()
  {
    return (EAttribute)samplesAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelDataAttribute()
  {
    return modelDataAttributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelDataAttribute_Sequence()
  {
    return (EReference)modelDataAttributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDefinition()
  {
    return classDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassDefinition_Name()
  {
    return (EAttribute)classDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassDefinition_Elements()
  {
    return (EReference)classDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassElement()
  {
    return classElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassInstance()
  {
    return classInstanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassInstance_InstanceName()
  {
    return (EAttribute)classInstanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassInstance_ClassName()
  {
    return (EAttribute)classInstanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstance_Input()
  {
    return (EReference)classInstanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstance_Output()
  {
    return (EReference)classInstanceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassInstance_Attributes()
  {
    return (EReference)classInstanceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputBindings()
  {
    return inputBindingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputBindings_Lhs()
  {
    return (EReference)inputBindingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputBindings_Rhs()
  {
    return (EReference)inputBindingsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputBinding()
  {
    return inputBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputBinding_Formal()
  {
    return (EAttribute)inputBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputBinding_Actual()
  {
    return (EAttribute)inputBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputBindings()
  {
    return outputBindingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputBindings_Lhs()
  {
    return (EReference)outputBindingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputBindings_Rhs()
  {
    return (EReference)outputBindingsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputBinding()
  {
    return outputBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputBinding_Actual()
  {
    return (EAttribute)outputBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputBinding_Formal()
  {
    return (EAttribute)outputBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeAttributes()
  {
    return nodeAttributesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionSequence()
  {
    return expressionSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionSequence_Expressions()
  {
    return (EReference)expressionSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Op()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getassignmentOpExpression()
  {
    return assignmentOpExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getorExpression()
  {
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getandExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrelationalExpression()
  {
    return relationalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getadditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmultiplicativeExpression()
  {
    return multiplicativeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getunaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getunaryExpression_Expr()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperator_Sequence()
  {
    return (EReference)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermExpression()
  {
    return termExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTermLiteral()
  {
    return termLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerLiteral()
  {
    return integerLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerLiteral_X()
  {
    return (EReference)integerLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntegerLiteral_Y()
  {
    return (EReference)integerLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteral_Value()
  {
    return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList5()
  {
    return list5EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList5_List()
  {
    return (EReference)list5EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList4()
  {
    return list4EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList4_List()
  {
    return (EReference)list4EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList3()
  {
    return list3EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList3_List()
  {
    return (EReference)list3EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList2()
  {
    return list2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList2_List()
  {
    return (EReference)list2EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList1()
  {
    return list1EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList1_Items()
  {
    return (EReference)list1EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Left()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Right()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentOp()
  {
    return assignmentOpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentOp_Left()
  {
    return (EReference)assignmentOpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentOp_Right()
  {
    return (EReference)assignmentOpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExp()
  {
    return orExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExp_Left()
  {
    return (EReference)orExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExp_Right()
  {
    return (EReference)orExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExp()
  {
    return andExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExp_Left()
  {
    return (EReference)andExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExp_Right()
  {
    return (EReference)andExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationalExp()
  {
    return relationalExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationalExp_Left()
  {
    return (EReference)relationalExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationalExp_Right()
  {
    return (EReference)relationalExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExp()
  {
    return additiveExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExp_Left()
  {
    return (EReference)additiveExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExp_Right()
  {
    return (EReference)additiveExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplicativeExp()
  {
    return multiplicativeExpEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExp_Left()
  {
    return (EReference)multiplicativeExpEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplicativeExp_Right()
  {
    return (EReference)multiplicativeExpEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarRef()
  {
    return varRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarRef_Value()
  {
    return (EAttribute)varRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_Value()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDoubleLiteral()
  {
    return doubleLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDoubleLiteral_Value()
  {
    return (EAttribute)doubleLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDSLFactory getNetDSLFactory()
  {
    return (NetDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__DOMAIN);

    integerEClass = createEClass(INTEGER);
    createEAttribute(integerEClass, INTEGER__I);

    domainDefinitionEClass = createEClass(DOMAIN_DEFINITION);
    createEReference(domainDefinitionEClass, DOMAIN_DEFINITION__HEADER);
    createEReference(domainDefinitionEClass, DOMAIN_DEFINITION__ELEMENTS);

    domainHeaderEClass = createEClass(DOMAIN_HEADER);
    createEReference(domainHeaderEClass, DOMAIN_HEADER__ATTRIBUTES);

    domainElementEClass = createEClass(DOMAIN_ELEMENT);

    attributeEClass = createEClass(ATTRIBUTE);

    basicNodeEClass = createEClass(BASIC_NODE);
    createEAttribute(basicNodeEClass, BASIC_NODE__KEYWORD);
    createEAttribute(basicNodeEClass, BASIC_NODE__ID);
    createEReference(basicNodeEClass, BASIC_NODE__ATTRIBUTES);

    statesAttributeEClass = createEClass(STATES_ATTRIBUTE);
    createEAttribute(statesAttributeEClass, STATES_ATTRIBUTE__STATES);

    labelAttributeEClass = createEClass(LABEL_ATTRIBUTE);
    createEAttribute(labelAttributeEClass, LABEL_ATTRIBUTE__VALUE);

    positionAttributeEClass = createEClass(POSITION_ATTRIBUTE);

    subtypeAttributeEClass = createEClass(SUBTYPE_ATTRIBUTE);
    createEAttribute(subtypeAttributeEClass, SUBTYPE_ATTRIBUTE__SUBTYPE);

    stateValuesAttributeEClass = createEClass(STATE_VALUES_ATTRIBUTE);
    createEAttribute(stateValuesAttributeEClass, STATE_VALUES_ATTRIBUTE__NUMBERS);

    applicationAttributeEClass = createEClass(APPLICATION_ATTRIBUTE);
    createEAttribute(applicationAttributeEClass, APPLICATION_ATTRIBUTE__KEY);
    createEAttribute(applicationAttributeEClass, APPLICATION_ATTRIBUTE__VALUE);

    nodeSizeAttributeEClass = createEClass(NODE_SIZE_ATTRIBUTE);
    createEAttribute(nodeSizeAttributeEClass, NODE_SIZE_ATTRIBUTE__WIDTH);
    createEAttribute(nodeSizeAttributeEClass, NODE_SIZE_ATTRIBUTE__HEIGHT);

    potentialEClass = createEClass(POTENTIAL);
    createEReference(potentialEClass, POTENTIAL__GRAPH);
    createEReference(potentialEClass, POTENTIAL__MODEL);

    potentialGraphEClass = createEClass(POTENTIAL_GRAPH);
    createEAttribute(potentialGraphEClass, POTENTIAL_GRAPH__CHILDREN);
    createEAttribute(potentialGraphEClass, POTENTIAL_GRAPH__PARENTS);

    potentialModelEClass = createEClass(POTENTIAL_MODEL);
    createEReference(potentialModelEClass, POTENTIAL_MODEL__ATTRIBUTES);

    potentialAttributeEClass = createEClass(POTENTIAL_ATTRIBUTE);

    potentialDataAttributeEClass = createEClass(POTENTIAL_DATA_ATTRIBUTE);
    createEReference(potentialDataAttributeEClass, POTENTIAL_DATA_ATTRIBUTE__DATA);

    matrixRowEClass = createEClass(MATRIX_ROW);
    createEReference(matrixRowEClass, MATRIX_ROW__R5);
    createEReference(matrixRowEClass, MATRIX_ROW__R4);
    createEReference(matrixRowEClass, MATRIX_ROW__R3);
    createEReference(matrixRowEClass, MATRIX_ROW__R2);
    createEReference(matrixRowEClass, MATRIX_ROW__R1);

    potentialTableAttributeEClass = createEClass(POTENTIAL_TABLE_ATTRIBUTE);
    createEReference(potentialTableAttributeEClass, POTENTIAL_TABLE_ATTRIBUTE__NODES);
    createEReference(potentialTableAttributeEClass, POTENTIAL_TABLE_ATTRIBUTE__SAMPLES);
    createEReference(potentialTableAttributeEClass, POTENTIAL_TABLE_ATTRIBUTE__DATA);

    modelNodesAttributeEClass = createEClass(MODEL_NODES_ATTRIBUTE);
    createEAttribute(modelNodesAttributeEClass, MODEL_NODES_ATTRIBUTE__CONFIGURATIONS);

    samplesAttributeEClass = createEClass(SAMPLES_ATTRIBUTE);
    createEAttribute(samplesAttributeEClass, SAMPLES_ATTRIBUTE__VALUE);

    modelDataAttributeEClass = createEClass(MODEL_DATA_ATTRIBUTE);
    createEReference(modelDataAttributeEClass, MODEL_DATA_ATTRIBUTE__SEQUENCE);

    classDefinitionEClass = createEClass(CLASS_DEFINITION);
    createEAttribute(classDefinitionEClass, CLASS_DEFINITION__NAME);
    createEReference(classDefinitionEClass, CLASS_DEFINITION__ELEMENTS);

    classElementEClass = createEClass(CLASS_ELEMENT);

    classInstanceEClass = createEClass(CLASS_INSTANCE);
    createEAttribute(classInstanceEClass, CLASS_INSTANCE__INSTANCE_NAME);
    createEAttribute(classInstanceEClass, CLASS_INSTANCE__CLASS_NAME);
    createEReference(classInstanceEClass, CLASS_INSTANCE__INPUT);
    createEReference(classInstanceEClass, CLASS_INSTANCE__OUTPUT);
    createEReference(classInstanceEClass, CLASS_INSTANCE__ATTRIBUTES);

    inputBindingsEClass = createEClass(INPUT_BINDINGS);
    createEReference(inputBindingsEClass, INPUT_BINDINGS__LHS);
    createEReference(inputBindingsEClass, INPUT_BINDINGS__RHS);

    inputBindingEClass = createEClass(INPUT_BINDING);
    createEAttribute(inputBindingEClass, INPUT_BINDING__FORMAL);
    createEAttribute(inputBindingEClass, INPUT_BINDING__ACTUAL);

    outputBindingsEClass = createEClass(OUTPUT_BINDINGS);
    createEReference(outputBindingsEClass, OUTPUT_BINDINGS__LHS);
    createEReference(outputBindingsEClass, OUTPUT_BINDINGS__RHS);

    outputBindingEClass = createEClass(OUTPUT_BINDING);
    createEAttribute(outputBindingEClass, OUTPUT_BINDING__ACTUAL);
    createEAttribute(outputBindingEClass, OUTPUT_BINDING__FORMAL);

    nodeAttributesEClass = createEClass(NODE_ATTRIBUTES);

    expressionSequenceEClass = createEClass(EXPRESSION_SEQUENCE);
    createEReference(expressionSequenceEClass, EXPRESSION_SEQUENCE__EXPRESSIONS);

    expressionEClass = createEClass(EXPRESSION);
    createEAttribute(expressionEClass, EXPRESSION__OP);

    assignmentOpExpressionEClass = createEClass(ASSIGNMENT_OP_EXPRESSION);

    orExpressionEClass = createEClass(OR_EXPRESSION);

    andExpressionEClass = createEClass(AND_EXPRESSION);

    relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);

    multiplicativeExpressionEClass = createEClass(MULTIPLICATIVE_EXPRESSION);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPR);

    operatorEClass = createEClass(OPERATOR);
    createEReference(operatorEClass, OPERATOR__SEQUENCE);

    termExpressionEClass = createEClass(TERM_EXPRESSION);

    termLiteralEClass = createEClass(TERM_LITERAL);

    integerLiteralEClass = createEClass(INTEGER_LITERAL);
    createEReference(integerLiteralEClass, INTEGER_LITERAL__X);
    createEReference(integerLiteralEClass, INTEGER_LITERAL__Y);
    createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

    list5EClass = createEClass(LIST5);
    createEReference(list5EClass, LIST5__LIST);

    list4EClass = createEClass(LIST4);
    createEReference(list4EClass, LIST4__LIST);

    list3EClass = createEClass(LIST3);
    createEReference(list3EClass, LIST3__LIST);

    list2EClass = createEClass(LIST2);
    createEReference(list2EClass, LIST2__LIST);

    list1EClass = createEClass(LIST1);
    createEReference(list1EClass, LIST1__ITEMS);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__LEFT);
    createEReference(assignmentEClass, ASSIGNMENT__RIGHT);

    assignmentOpEClass = createEClass(ASSIGNMENT_OP);
    createEReference(assignmentOpEClass, ASSIGNMENT_OP__LEFT);
    createEReference(assignmentOpEClass, ASSIGNMENT_OP__RIGHT);

    orExpEClass = createEClass(OR_EXP);
    createEReference(orExpEClass, OR_EXP__LEFT);
    createEReference(orExpEClass, OR_EXP__RIGHT);

    andExpEClass = createEClass(AND_EXP);
    createEReference(andExpEClass, AND_EXP__LEFT);
    createEReference(andExpEClass, AND_EXP__RIGHT);

    relationalExpEClass = createEClass(RELATIONAL_EXP);
    createEReference(relationalExpEClass, RELATIONAL_EXP__LEFT);
    createEReference(relationalExpEClass, RELATIONAL_EXP__RIGHT);

    additiveExpEClass = createEClass(ADDITIVE_EXP);
    createEReference(additiveExpEClass, ADDITIVE_EXP__LEFT);
    createEReference(additiveExpEClass, ADDITIVE_EXP__RIGHT);

    multiplicativeExpEClass = createEClass(MULTIPLICATIVE_EXP);
    createEReference(multiplicativeExpEClass, MULTIPLICATIVE_EXP__LEFT);
    createEReference(multiplicativeExpEClass, MULTIPLICATIVE_EXP__RIGHT);

    varRefEClass = createEClass(VAR_REF);
    createEAttribute(varRefEClass, VAR_REF__VALUE);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    doubleLiteralEClass = createEClass(DOUBLE_LITERAL);
    createEAttribute(doubleLiteralEClass, DOUBLE_LITERAL__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    domainElementEClass.getESuperTypes().add(this.getClassElement());
    attributeEClass.getESuperTypes().add(this.getClassElement());
    basicNodeEClass.getESuperTypes().add(this.getDomainElement());
    statesAttributeEClass.getESuperTypes().add(this.getAttribute());
    labelAttributeEClass.getESuperTypes().add(this.getAttribute());
    labelAttributeEClass.getESuperTypes().add(this.getNodeAttributes());
    positionAttributeEClass.getESuperTypes().add(this.getAttribute());
    positionAttributeEClass.getESuperTypes().add(this.getNodeAttributes());
    subtypeAttributeEClass.getESuperTypes().add(this.getAttribute());
    stateValuesAttributeEClass.getESuperTypes().add(this.getAttribute());
    applicationAttributeEClass.getESuperTypes().add(this.getAttribute());
    applicationAttributeEClass.getESuperTypes().add(this.getNodeAttributes());
    nodeSizeAttributeEClass.getESuperTypes().add(this.getAttribute());
    potentialEClass.getESuperTypes().add(this.getDomainElement());
    potentialDataAttributeEClass.getESuperTypes().add(this.getPotentialAttribute());
    potentialTableAttributeEClass.getESuperTypes().add(this.getPotentialAttribute());
    classDefinitionEClass.getESuperTypes().add(this.getDomainElement());
    classInstanceEClass.getESuperTypes().add(this.getClassElement());
    assignmentOpExpressionEClass.getESuperTypes().add(this.getExpression());
    orExpressionEClass.getESuperTypes().add(this.getassignmentOpExpression());
    andExpressionEClass.getESuperTypes().add(this.getorExpression());
    relationalExpressionEClass.getESuperTypes().add(this.getandExpression());
    additiveExpressionEClass.getESuperTypes().add(this.getrelationalExpression());
    multiplicativeExpressionEClass.getESuperTypes().add(this.getadditiveExpression());
    unaryExpressionEClass.getESuperTypes().add(this.getmultiplicativeExpression());
    operatorEClass.getESuperTypes().add(this.getTermExpression());
    termExpressionEClass.getESuperTypes().add(this.getunaryExpression());
    termLiteralEClass.getESuperTypes().add(this.getTermExpression());
    integerLiteralEClass.getESuperTypes().add(this.getPositionAttribute());
    integerLiteralEClass.getESuperTypes().add(this.getTermLiteral());
    list5EClass.getESuperTypes().add(this.getMatrixRow());
    list4EClass.getESuperTypes().add(this.getMatrixRow());
    list3EClass.getESuperTypes().add(this.getMatrixRow());
    list2EClass.getESuperTypes().add(this.getMatrixRow());
    list1EClass.getESuperTypes().add(this.getMatrixRow());
    assignmentEClass.getESuperTypes().add(this.getExpression());
    assignmentOpEClass.getESuperTypes().add(this.getassignmentOpExpression());
    orExpEClass.getESuperTypes().add(this.getorExpression());
    andExpEClass.getESuperTypes().add(this.getandExpression());
    relationalExpEClass.getESuperTypes().add(this.getrelationalExpression());
    additiveExpEClass.getESuperTypes().add(this.getadditiveExpression());
    multiplicativeExpEClass.getESuperTypes().add(this.getmultiplicativeExpression());
    varRefEClass.getESuperTypes().add(this.getTermLiteral());
    booleanLiteralEClass.getESuperTypes().add(this.getTermLiteral());
    stringLiteralEClass.getESuperTypes().add(this.getTermLiteral());
    doubleLiteralEClass.getESuperTypes().add(this.getTermLiteral());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Domain(), this.getDomainDefinition(), null, "domain", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerEClass, net.certware.evidence.hugin.netDSL.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteger_I(), ecorePackage.getEInt(), "i", null, 0, 1, net.certware.evidence.hugin.netDSL.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainDefinitionEClass, DomainDefinition.class, "DomainDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainDefinition_Header(), this.getDomainHeader(), null, "header", null, 0, 1, DomainDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainDefinition_Elements(), this.getDomainElement(), null, "elements", null, 0, -1, DomainDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainHeaderEClass, DomainHeader.class, "DomainHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDomainHeader_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, DomainHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainElementEClass, DomainElement.class, "DomainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(basicNodeEClass, BasicNode.class, "BasicNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicNode_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, BasicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBasicNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, BasicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicNode_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, BasicNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statesAttributeEClass, StatesAttribute.class, "StatesAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatesAttribute_States(), ecorePackage.getEString(), "states", null, 0, -1, StatesAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelAttributeEClass, LabelAttribute.class, "LabelAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabelAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, LabelAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(positionAttributeEClass, PositionAttribute.class, "PositionAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subtypeAttributeEClass, SubtypeAttribute.class, "SubtypeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubtypeAttribute_Subtype(), ecorePackage.getEString(), "subtype", null, 0, 1, SubtypeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateValuesAttributeEClass, StateValuesAttribute.class, "StateValuesAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateValuesAttribute_Numbers(), ecorePackage.getEInt(), "numbers", null, 0, -1, StateValuesAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(applicationAttributeEClass, ApplicationAttribute.class, "ApplicationAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getApplicationAttribute_Key(), ecorePackage.getEString(), "key", null, 0, 1, ApplicationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getApplicationAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, ApplicationAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeSizeAttributeEClass, NodeSizeAttribute.class, "NodeSizeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeSizeAttribute_Width(), ecorePackage.getEInt(), "width", null, 0, 1, NodeSizeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNodeSizeAttribute_Height(), ecorePackage.getEInt(), "height", null, 0, 1, NodeSizeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(potentialEClass, Potential.class, "Potential", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPotential_Graph(), this.getPotentialGraph(), null, "graph", null, 0, 1, Potential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPotential_Model(), this.getPotentialModel(), null, "model", null, 0, 1, Potential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(potentialGraphEClass, PotentialGraph.class, "PotentialGraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPotentialGraph_Children(), ecorePackage.getEString(), "children", null, 0, -1, PotentialGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPotentialGraph_Parents(), ecorePackage.getEString(), "parents", null, 0, -1, PotentialGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(potentialModelEClass, PotentialModel.class, "PotentialModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPotentialModel_Attributes(), this.getPotentialAttribute(), null, "attributes", null, 0, -1, PotentialModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(potentialAttributeEClass, PotentialAttribute.class, "PotentialAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(potentialDataAttributeEClass, PotentialDataAttribute.class, "PotentialDataAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPotentialDataAttribute_Data(), this.getMatrixRow(), null, "data", null, 0, 1, PotentialDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(matrixRowEClass, MatrixRow.class, "MatrixRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMatrixRow_R5(), this.getMatrixRow(), null, "r5", null, 0, -1, MatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatrixRow_R4(), this.getMatrixRow(), null, "r4", null, 0, -1, MatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatrixRow_R3(), this.getMatrixRow(), null, "r3", null, 0, -1, MatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatrixRow_R2(), this.getMatrixRow(), null, "r2", null, 0, -1, MatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMatrixRow_R1(), this.getMatrixRow(), null, "r1", null, 0, 1, MatrixRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(potentialTableAttributeEClass, PotentialTableAttribute.class, "PotentialTableAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPotentialTableAttribute_Nodes(), this.getModelNodesAttribute(), null, "nodes", null, 0, 1, PotentialTableAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPotentialTableAttribute_Samples(), this.getSamplesAttribute(), null, "samples", null, 0, 1, PotentialTableAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPotentialTableAttribute_Data(), this.getModelDataAttribute(), null, "data", null, 0, 1, PotentialTableAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelNodesAttributeEClass, ModelNodesAttribute.class, "ModelNodesAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelNodesAttribute_Configurations(), ecorePackage.getEString(), "configurations", null, 0, -1, ModelNodesAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(samplesAttributeEClass, SamplesAttribute.class, "SamplesAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSamplesAttribute_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SamplesAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelDataAttributeEClass, ModelDataAttribute.class, "ModelDataAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelDataAttribute_Sequence(), this.getExpressionSequence(), null, "sequence", null, 0, 1, ModelDataAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDefinitionEClass, ClassDefinition.class, "ClassDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassDefinition_Elements(), this.getClassElement(), null, "elements", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classElementEClass, ClassElement.class, "ClassElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classInstanceEClass, ClassInstance.class, "ClassInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassInstance_InstanceName(), ecorePackage.getEString(), "instanceName", null, 0, 1, ClassInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClassInstance_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, ClassInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassInstance_Input(), this.getInputBindings(), null, "input", null, 0, 1, ClassInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassInstance_Output(), this.getOutputBindings(), null, "output", null, 0, 1, ClassInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassInstance_Attributes(), this.getNodeAttributes(), null, "attributes", null, 0, 1, ClassInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputBindingsEClass, InputBindings.class, "InputBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInputBindings_Lhs(), this.getInputBinding(), null, "lhs", null, 0, 1, InputBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInputBindings_Rhs(), this.getInputBindings(), null, "rhs", null, 0, 1, InputBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inputBindingEClass, InputBinding.class, "InputBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputBinding_Formal(), ecorePackage.getEString(), "formal", null, 0, 1, InputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInputBinding_Actual(), ecorePackage.getEString(), "actual", null, 0, 1, InputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputBindingsEClass, OutputBindings.class, "OutputBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOutputBindings_Lhs(), this.getOutputBinding(), null, "lhs", null, 0, 1, OutputBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOutputBindings_Rhs(), this.getOutputBindings(), null, "rhs", null, 0, 1, OutputBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputBindingEClass, OutputBinding.class, "OutputBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutputBinding_Actual(), ecorePackage.getEString(), "actual", null, 0, 1, OutputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputBinding_Formal(), ecorePackage.getEString(), "formal", null, 0, 1, OutputBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeAttributesEClass, NodeAttributes.class, "NodeAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionSequenceEClass, ExpressionSequence.class, "ExpressionSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionSequence_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, ExpressionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentOpExpressionEClass, assignmentOpExpression.class, "assignmentOpExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(orExpressionEClass, orExpression.class, "orExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(andExpressionEClass, andExpression.class, "andExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(relationalExpressionEClass, relationalExpression.class, "relationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(additiveExpressionEClass, additiveExpression.class, "additiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplicativeExpressionEClass, multiplicativeExpression.class, "multiplicativeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unaryExpressionEClass, unaryExpression.class, "unaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getunaryExpression_Expr(), this.getTermExpression(), null, "expr", null, 0, 1, unaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperator_Sequence(), this.getExpressionSequence(), null, "sequence", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termExpressionEClass, TermExpression.class, "TermExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(termLiteralEClass, TermLiteral.class, "TermLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntegerLiteral_X(), this.getInteger(), null, "x", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntegerLiteral_Y(), this.getInteger(), null, "y", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntegerLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(list5EClass, List5.class, "List5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList5_List(), this.getMatrixRow(), null, "list", null, 0, -1, List5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(list4EClass, List4.class, "List4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList4_List(), this.getMatrixRow(), null, "list", null, 0, -1, List4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(list3EClass, List3.class, "List3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList3_List(), this.getMatrixRow(), null, "list", null, 0, -1, List3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(list2EClass, List2.class, "List2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList2_List(), this.getMatrixRow(), null, "list", null, 0, -1, List2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(list1EClass, List1.class, "List1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList1_Items(), this.getunaryExpression(), null, "items", null, 0, -1, List1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Left(), this.getassignmentOpExpression(), null, "left", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Right(), this.getorExpression(), null, "right", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentOpEClass, AssignmentOp.class, "AssignmentOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentOp_Left(), this.getorExpression(), null, "left", null, 0, 1, AssignmentOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignmentOp_Right(), this.getorExpression(), null, "right", null, 0, 1, AssignmentOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orExpEClass, OrExp.class, "OrExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExp_Left(), this.getandExpression(), null, "left", null, 0, 1, OrExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrExp_Right(), this.getorExpression(), null, "right", null, 0, 1, OrExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExpEClass, AndExp.class, "AndExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExp_Left(), this.getrelationalExpression(), null, "left", null, 0, 1, AndExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndExp_Right(), this.getandExpression(), null, "right", null, 0, 1, AndExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationalExpEClass, RelationalExp.class, "RelationalExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationalExp_Left(), this.getadditiveExpression(), null, "left", null, 0, 1, RelationalExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelationalExp_Right(), this.getrelationalExpression(), null, "right", null, 0, 1, RelationalExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpEClass, AdditiveExp.class, "AdditiveExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveExp_Left(), this.getmultiplicativeExpression(), null, "left", null, 0, 1, AdditiveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdditiveExp_Right(), this.getadditiveExpression(), null, "right", null, 0, 1, AdditiveExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExpEClass, MultiplicativeExp.class, "MultiplicativeExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicativeExp_Left(), this.getunaryExpression(), null, "left", null, 0, 1, MultiplicativeExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplicativeExp_Right(), this.getmultiplicativeExpression(), null, "right", null, 0, 1, MultiplicativeExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varRefEClass, VarRef.class, "VarRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVarRef_Value(), ecorePackage.getEString(), "value", null, 0, 1, VarRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(doubleLiteralEClass, DoubleLiteral.class, "DoubleLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDoubleLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DoubleLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //NetDSLPackageImpl
