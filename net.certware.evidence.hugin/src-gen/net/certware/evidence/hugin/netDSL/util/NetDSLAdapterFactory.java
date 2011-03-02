/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.util;

import net.certware.evidence.hugin.netDSL.*;

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
      public Adapter caseUnstructuredDataList(UnstructuredDataList object)
      {
        return createUnstructuredDataListAdapter();
      }
      @Override
      public Adapter caseStructuredDataList(StructuredDataList object)
      {
        return createStructuredDataListAdapter();
      }
      @Override
      public Adapter caseFloatDataList(FloatDataList object)
      {
        return createFloatDataListAdapter();
      }
      @Override
      public Adapter caseNormalDistribution(NormalDistribution object)
      {
        return createNormalDistributionAdapter();
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
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseSimpleExpression(SimpleExpression object)
      {
        return createSimpleExpressionAdapter();
      }
      @Override
      public Adapter caseTerm(Term object)
      {
        return createTermAdapter();
      }
      @Override
      public Adapter caseExpFactor(ExpFactor object)
      {
        return createExpFactorAdapter();
      }
      @Override
      public Adapter caseFactor(Factor object)
      {
        return createFactorAdapter();
      }
      @Override
      public Adapter caseExpressionSequence(ExpressionSequence object)
      {
        return createExpressionSequenceAdapter();
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
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.UnstructuredDataList <em>Unstructured Data List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.UnstructuredDataList
   * @generated
   */
  public Adapter createUnstructuredDataListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.StructuredDataList <em>Structured Data List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.StructuredDataList
   * @generated
   */
  public Adapter createStructuredDataListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.FloatDataList <em>Float Data List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.FloatDataList
   * @generated
   */
  public Adapter createFloatDataListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.NormalDistribution <em>Normal Distribution</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.NormalDistribution
   * @generated
   */
  public Adapter createNormalDistributionAdapter()
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
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.SimpleExpression
   * @generated
   */
  public Adapter createSimpleExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Term
   * @generated
   */
  public Adapter createTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.ExpFactor <em>Exp Factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.ExpFactor
   * @generated
   */
  public Adapter createExpFactorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.evidence.hugin.netDSL.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.evidence.hugin.netDSL.Factor
   * @generated
   */
  public Adapter createFactorAdapter()
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
