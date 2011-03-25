/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage
 * @generated
 */
public class NetDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NetDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NetDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetDSLSwitch<Adapter> modelSwitch =
    new NetDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseInteger(net.certware.evidence.hugin.netDSL.Integer object)
      {
        return createIntegerAdapter();
      }
      @Override
      public Adapter caseDomainDefinition(DomainDefinition object)
      {
        return createDomainDefinitionAdapter();
      }
      @Override
      public Adapter caseDomainHeader(DomainHeader object)
      {
        return createDomainHeaderAdapter();
      }
      @Override
      public Adapter caseDomainElement(DomainElement object)
      {
        return createDomainElementAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseBasicNode(BasicNode object)
      {
        return createBasicNodeAdapter();
      }
      @Override
      public Adapter caseStatesAttribute(StatesAttribute object)
      {
        return createStatesAttributeAdapter();
      }
      @Override
      public Adapter caseLabelAttribute(LabelAttribute object)
      {
        return createLabelAttributeAdapter();
      }
      @Override
      public Adapter casePositionAttribute(PositionAttribute object)
      {
        return createPositionAttributeAdapter();
      }
      @Override
      public Adapter caseSubtypeAttribute(SubtypeAttribute object)
      {
        return createSubtypeAttributeAdapter();
      }
      @Override
      public Adapter caseStateValuesAttribute(StateValuesAttribute object)
      {
        return createStateValuesAttributeAdapter();
      }
      @Override
      public Adapter caseApplicationAttribute(ApplicationAttribute object)
      {
        return createApplicationAttributeAdapter();
      }
      @Override
      public Adapter caseNodeSizeAttribute(NodeSizeAttribute object)
      {
        return createNodeSizeAttributeAdapter();
      }
      @Override
      public Adapter casePotential(Potential object)
      {
        return createPotentialAdapter();
      }
      @Override
      public Adapter casePotentialGraph(PotentialGraph object)
      {
        return createPotentialGraphAdapter();
      }
      @Override
      public Adapter casePotentialModel(PotentialModel object)
      {
        return createPotentialModelAdapter();
      }
      @Override
      public Adapter casePotentialAttribute(PotentialAttribute object)
      {
        return createPotentialAttributeAdapter();
      }
      @Override
      public Adapter casePotentialDataAttribute(PotentialDataAttribute object)
      {
        return createPotentialDataAttributeAdapter();
      }
      @Override
      public Adapter caseMatrixRow(MatrixRow object)
      {
        return createMatrixRowAdapter();
      }
      @Override
      public Adapter casePotentialTableAttribute(PotentialTableAttribute object)
      {
        return createPotentialTableAttributeAdapter();
      }
      @Override
      public Adapter caseModelNodesAttribute(ModelNodesAttribute object)
      {
        return createModelNodesAttributeAdapter();
      }
      @Override
      public Adapter caseSamplesAttribute(SamplesAttribute object)
      {
        return createSamplesAttributeAdapter();
      }
      @Override
      public Adapter caseModelDataAttribute(ModelDataAttribute object)
      {
        return createModelDataAttributeAdapter();
      }
      @Override
      public Adapter caseClassDefinition(ClassDefinition object)
      {
        return createClassDefinitionAdapter();
      }
      @Override
      public Adapter caseClassElement(ClassElement object)
      {
        return createClassElementAdapter();
      }
      @Override
      public Adapter caseClassInstance(ClassInstance object)
      {
        return createClassInstanceAdapter();
      }
      @Override
      public Adapter caseInputBindings(InputBindings object)
      {
        return createInputBindingsAdapter();
      }
      @Override
      public Adapter caseInputBinding(InputBinding object)
      {
        return createInputBindingAdapter();
      }
      @Override
      public Adapter caseOutputBindings(OutputBindings object)
      {
        return createOutputBindingsAdapter();
      }
      @Override
      public Adapter caseOutputBinding(OutputBinding object)
      {
        return createOutputBindingAdapter();
      }
      @Override
      public Adapter caseNodeAttributes(NodeAttributes object)
      {
        return createNodeAttributesAdapter();
      }
      @Override
      public Adapter caseExpressionSequence(ExpressionSequence object)
      {
        return createExpressionSequenceAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseassignmentOpExpression(assignmentOpExpression object)
      {
        return createassignmentOpExpressionAdapter();
      }
      @Override
      public Adapter caseorExpression(orExpression object)
      {
        return createorExpressionAdapter();
      }
      @Override
      public Adapter caseandExpression(andExpression object)
      {
        return createandExpressionAdapter();
      }
      @Override
      public Adapter caserelationalExpression(relationalExpression object)
      {
        return createrelationalExpressionAdapter();
      }
      @Override
      public Adapter caseadditiveExpression(additiveExpression object)
      {
        return createadditiveExpressionAdapter();
      }
      @Override
      public Adapter casemultiplicativeExpression(multiplicativeExpression object)
      {
        return createmultiplicativeExpressionAdapter();
      }
      @Override
      public Adapter caseunaryExpression(unaryExpression object)
      {
        return createunaryExpressionAdapter();
      }
      @Override
      public Adapter caseOperator(Operator object)
      {
        return createOperatorAdapter();
      }
      @Override
      public Adapter caseTermExpression(TermExpression object)
      {
        return createTermExpressionAdapter();
      }
      @Override
      public Adapter caseTermLiteral(TermLiteral object)
      {
        return createTermLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseList5(List5 object)
      {
        return createList5Adapter();
      }
      @Override
      public Adapter caseList4(List4 object)
      {
        return createList4Adapter();
      }
      @Override
      public Adapter caseList3(List3 object)
      {
        return createList3Adapter();
      }
      @Override
      public Adapter caseList2(List2 object)
      {
        return createList2Adapter();
      }
      @Override
      public Adapter caseList1(List1 object)
      {
        return createList1Adapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter caseAssignmentOp(AssignmentOp object)
      {
        return createAssignmentOpAdapter();
      }
      @Override
      public Adapter caseOrExp(OrExp object)
      {
        return createOrExpAdapter();
      }
      @Override
      public Adapter caseAndExp(AndExp object)
      {
        return createAndExpAdapter();
      }
      @Override
      public Adapter caseRelationalExp(RelationalExp object)
      {
        return createRelationalExpAdapter();
      }
      @Override
      public Adapter caseAdditiveExp(AdditiveExp object)
      {
        return createAdditiveExpAdapter();
      }
      @Override
      public Adapter caseMultiplicativeExp(MultiplicativeExp object)
      {
        return createMultiplicativeExpAdapter();
      }
      @Override
      public Adapter caseVarRef(VarRef object)
      {
        return createVarRefAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseDoubleLiteral(DoubleLiteral object)
      {
        return createDoubleLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Integer <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Integer
   * @generated
   */
  public Adapter createIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.DomainDefinition <em>Domain Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.DomainDefinition
   * @generated
   */
  public Adapter createDomainDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.DomainHeader <em>Domain Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.DomainHeader
   * @generated
   */
  public Adapter createDomainHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.DomainElement <em>Domain Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.DomainElement
   * @generated
   */
  public Adapter createDomainElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.BasicNode <em>Basic Node</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.BasicNode
   * @generated
   */
  public Adapter createBasicNodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.StatesAttribute <em>States Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.StatesAttribute
   * @generated
   */
  public Adapter createStatesAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.LabelAttribute <em>Label Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.LabelAttribute
   * @generated
   */
  public Adapter createLabelAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.PositionAttribute <em>Position Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.PositionAttribute
   * @generated
   */
  public Adapter createPositionAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.SubtypeAttribute <em>Subtype Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.SubtypeAttribute
   * @generated
   */
  public Adapter createSubtypeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.StateValuesAttribute <em>State Values Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.StateValuesAttribute
   * @generated
   */
  public Adapter createStateValuesAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.ApplicationAttribute <em>Application Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.ApplicationAttribute
   * @generated
   */
  public Adapter createApplicationAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.NodeSizeAttribute <em>Node Size Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.NodeSizeAttribute
   * @generated
   */
  public Adapter createNodeSizeAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Potential <em>Potential</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Potential
   * @generated
   */
  public Adapter createPotentialAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.PotentialGraph <em>Potential Graph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.PotentialGraph
   * @generated
   */
  public Adapter createPotentialGraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.PotentialModel <em>Potential Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.PotentialModel
   * @generated
   */
  public Adapter createPotentialModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.PotentialAttribute <em>Potential Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.PotentialAttribute
   * @generated
   */
  public Adapter createPotentialAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute <em>Potential Data Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.PotentialDataAttribute
   * @generated
   */
  public Adapter createPotentialDataAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.MatrixRow <em>Matrix Row</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.MatrixRow
   * @generated
   */
  public Adapter createMatrixRowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute <em>Potential Table Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.PotentialTableAttribute
   * @generated
   */
  public Adapter createPotentialTableAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.ModelNodesAttribute <em>Model Nodes Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.ModelNodesAttribute
   * @generated
   */
  public Adapter createModelNodesAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.SamplesAttribute <em>Samples Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.SamplesAttribute
   * @generated
   */
  public Adapter createSamplesAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.ModelDataAttribute <em>Model Data Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.ModelDataAttribute
   * @generated
   */
  public Adapter createModelDataAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.ClassDefinition <em>Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.ClassDefinition
   * @generated
   */
  public Adapter createClassDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.ClassElement <em>Class Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.ClassElement
   * @generated
   */
  public Adapter createClassElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.ClassInstance <em>Class Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.ClassInstance
   * @generated
   */
  public Adapter createClassInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.InputBindings <em>Input Bindings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.InputBindings
   * @generated
   */
  public Adapter createInputBindingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.InputBinding <em>Input Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.InputBinding
   * @generated
   */
  public Adapter createInputBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.OutputBindings <em>Output Bindings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.OutputBindings
   * @generated
   */
  public Adapter createOutputBindingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.OutputBinding <em>Output Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.OutputBinding
   * @generated
   */
  public Adapter createOutputBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.NodeAttributes <em>Node Attributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.NodeAttributes
   * @generated
   */
  public Adapter createNodeAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.ExpressionSequence <em>Expression Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.ExpressionSequence
   * @generated
   */
  public Adapter createExpressionSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.assignmentOpExpression <em>assignment Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.assignmentOpExpression
   * @generated
   */
  public Adapter createassignmentOpExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.orExpression <em>or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.orExpression
   * @generated
   */
  public Adapter createorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.andExpression <em>and Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.andExpression
   * @generated
   */
  public Adapter createandExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.relationalExpression <em>relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.relationalExpression
   * @generated
   */
  public Adapter createrelationalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.additiveExpression <em>additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.additiveExpression
   * @generated
   */
  public Adapter createadditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.multiplicativeExpression <em>multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.multiplicativeExpression
   * @generated
   */
  public Adapter createmultiplicativeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.unaryExpression <em>unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.unaryExpression
   * @generated
   */
  public Adapter createunaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Operator
   * @generated
   */
  public Adapter createOperatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.TermExpression <em>Term Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.TermExpression
   * @generated
   */
  public Adapter createTermExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.TermLiteral <em>Term Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.TermLiteral
   * @generated
   */
  public Adapter createTermLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.List5 <em>List5</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.List5
   * @generated
   */
  public Adapter createList5Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.List4 <em>List4</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.List4
   * @generated
   */
  public Adapter createList4Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.List3 <em>List3</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.List3
   * @generated
   */
  public Adapter createList3Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.List2 <em>List2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.List2
   * @generated
   */
  public Adapter createList2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.List1 <em>List1</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.List1
   * @generated
   */
  public Adapter createList1Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.AssignmentOp <em>Assignment Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.AssignmentOp
   * @generated
   */
  public Adapter createAssignmentOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.OrExp <em>Or Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.OrExp
   * @generated
   */
  public Adapter createOrExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.AndExp <em>And Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.AndExp
   * @generated
   */
  public Adapter createAndExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.RelationalExp <em>Relational Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.RelationalExp
   * @generated
   */
  public Adapter createRelationalExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.AdditiveExp <em>Additive Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.AdditiveExp
   * @generated
   */
  public Adapter createAdditiveExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.MultiplicativeExp <em>Multiplicative Exp</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.MultiplicativeExp
   * @generated
   */
  public Adapter createMultiplicativeExpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.VarRef
   * @generated
   */
  public Adapter createVarRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.DoubleLiteral
   * @generated
   */
  public Adapter createDoubleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //NetDSLAdapterFactory
