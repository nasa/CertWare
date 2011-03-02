/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.util;

import java.util.List;

import net.certware.evidence.hugin.netDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage
 * @generated
 */
public class NetDSLSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NetDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = NetDSLPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case NetDSLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.DOMAIN_DEFINITION:
      {
        DomainDefinition domainDefinition = (DomainDefinition)theEObject;
        T result = caseDomainDefinition(domainDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.DOMAIN_HEADER:
      {
        DomainHeader domainHeader = (DomainHeader)theEObject;
        T result = caseDomainHeader(domainHeader);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.DOMAIN_ELEMENT:
      {
        DomainElement domainElement = (DomainElement)theEObject;
        T result = caseDomainElement(domainElement);
        if (result == null) result = caseClassElement(domainElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseClassElement(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.BASIC_NODE:
      {
        BasicNode basicNode = (BasicNode)theEObject;
        T result = caseBasicNode(basicNode);
        if (result == null) result = caseDomainElement(basicNode);
        if (result == null) result = caseClassElement(basicNode);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.STATES_ATTRIBUTE:
      {
        StatesAttribute statesAttribute = (StatesAttribute)theEObject;
        T result = caseStatesAttribute(statesAttribute);
        if (result == null) result = caseAttribute(statesAttribute);
        if (result == null) result = caseClassElement(statesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.LABEL_ATTRIBUTE:
      {
        LabelAttribute labelAttribute = (LabelAttribute)theEObject;
        T result = caseLabelAttribute(labelAttribute);
        if (result == null) result = caseAttribute(labelAttribute);
        if (result == null) result = caseNodeAttributes(labelAttribute);
        if (result == null) result = caseClassElement(labelAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POSITION_ATTRIBUTE:
      {
        PositionAttribute positionAttribute = (PositionAttribute)theEObject;
        T result = casePositionAttribute(positionAttribute);
        if (result == null) result = caseAttribute(positionAttribute);
        if (result == null) result = caseNodeAttributes(positionAttribute);
        if (result == null) result = caseClassElement(positionAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.SUBTYPE_ATTRIBUTE:
      {
        SubtypeAttribute subtypeAttribute = (SubtypeAttribute)theEObject;
        T result = caseSubtypeAttribute(subtypeAttribute);
        if (result == null) result = caseAttribute(subtypeAttribute);
        if (result == null) result = caseClassElement(subtypeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.STATE_VALUES_ATTRIBUTE:
      {
        StateValuesAttribute stateValuesAttribute = (StateValuesAttribute)theEObject;
        T result = caseStateValuesAttribute(stateValuesAttribute);
        if (result == null) result = caseAttribute(stateValuesAttribute);
        if (result == null) result = caseClassElement(stateValuesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.APPLICATION_ATTRIBUTE:
      {
        ApplicationAttribute applicationAttribute = (ApplicationAttribute)theEObject;
        T result = caseApplicationAttribute(applicationAttribute);
        if (result == null) result = caseAttribute(applicationAttribute);
        if (result == null) result = caseNodeAttributes(applicationAttribute);
        if (result == null) result = caseClassElement(applicationAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.NODE_SIZE_ATTRIBUTE:
      {
        NodeSizeAttribute nodeSizeAttribute = (NodeSizeAttribute)theEObject;
        T result = caseNodeSizeAttribute(nodeSizeAttribute);
        if (result == null) result = caseAttribute(nodeSizeAttribute);
        if (result == null) result = caseClassElement(nodeSizeAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL:
      {
        Potential potential = (Potential)theEObject;
        T result = casePotential(potential);
        if (result == null) result = caseDomainElement(potential);
        if (result == null) result = caseClassElement(potential);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_GRAPH:
      {
        PotentialGraph potentialGraph = (PotentialGraph)theEObject;
        T result = casePotentialGraph(potentialGraph);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_MODEL:
      {
        PotentialModel potentialModel = (PotentialModel)theEObject;
        T result = casePotentialModel(potentialModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_ATTRIBUTE:
      {
        PotentialAttribute potentialAttribute = (PotentialAttribute)theEObject;
        T result = casePotentialAttribute(potentialAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_DATA_ATTRIBUTE:
      {
        PotentialDataAttribute potentialDataAttribute = (PotentialDataAttribute)theEObject;
        T result = casePotentialDataAttribute(potentialDataAttribute);
        if (result == null) result = casePotentialAttribute(potentialDataAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.UNSTRUCTURED_DATA_LIST:
      {
        UnstructuredDataList unstructuredDataList = (UnstructuredDataList)theEObject;
        T result = caseUnstructuredDataList(unstructuredDataList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.STRUCTURED_DATA_LIST:
      {
        StructuredDataList structuredDataList = (StructuredDataList)theEObject;
        T result = caseStructuredDataList(structuredDataList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.FLOAT_DATA_LIST:
      {
        FloatDataList floatDataList = (FloatDataList)theEObject;
        T result = caseFloatDataList(floatDataList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.NORMAL_DISTRIBUTION:
      {
        NormalDistribution normalDistribution = (NormalDistribution)theEObject;
        T result = caseNormalDistribution(normalDistribution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.POTENTIAL_TABLE_ATTRIBUTE:
      {
        PotentialTableAttribute potentialTableAttribute = (PotentialTableAttribute)theEObject;
        T result = casePotentialTableAttribute(potentialTableAttribute);
        if (result == null) result = casePotentialAttribute(potentialTableAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.MODEL_NODES_ATTRIBUTE:
      {
        ModelNodesAttribute modelNodesAttribute = (ModelNodesAttribute)theEObject;
        T result = caseModelNodesAttribute(modelNodesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.SAMPLES_ATTRIBUTE:
      {
        SamplesAttribute samplesAttribute = (SamplesAttribute)theEObject;
        T result = caseSamplesAttribute(samplesAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.MODEL_DATA_ATTRIBUTE:
      {
        ModelDataAttribute modelDataAttribute = (ModelDataAttribute)theEObject;
        T result = caseModelDataAttribute(modelDataAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.CLASS_DEFINITION:
      {
        ClassDefinition classDefinition = (ClassDefinition)theEObject;
        T result = caseClassDefinition(classDefinition);
        if (result == null) result = caseDomainElement(classDefinition);
        if (result == null) result = caseClassElement(classDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.CLASS_ELEMENT:
      {
        ClassElement classElement = (ClassElement)theEObject;
        T result = caseClassElement(classElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.CLASS_INSTANCE:
      {
        ClassInstance classInstance = (ClassInstance)theEObject;
        T result = caseClassInstance(classInstance);
        if (result == null) result = caseClassElement(classInstance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.INPUT_BINDINGS:
      {
        InputBindings inputBindings = (InputBindings)theEObject;
        T result = caseInputBindings(inputBindings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.INPUT_BINDING:
      {
        InputBinding inputBinding = (InputBinding)theEObject;
        T result = caseInputBinding(inputBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.OUTPUT_BINDINGS:
      {
        OutputBindings outputBindings = (OutputBindings)theEObject;
        T result = caseOutputBindings(outputBindings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.OUTPUT_BINDING:
      {
        OutputBinding outputBinding = (OutputBinding)theEObject;
        T result = caseOutputBinding(outputBinding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.NODE_ATTRIBUTES:
      {
        NodeAttributes nodeAttributes = (NodeAttributes)theEObject;
        T result = caseNodeAttributes(nodeAttributes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.SIMPLE_EXPRESSION:
      {
        SimpleExpression simpleExpression = (SimpleExpression)theEObject;
        T result = caseSimpleExpression(simpleExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.TERM:
      {
        Term term = (Term)theEObject;
        T result = caseTerm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.EXP_FACTOR:
      {
        ExpFactor expFactor = (ExpFactor)theEObject;
        T result = caseExpFactor(expFactor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.FACTOR:
      {
        Factor factor = (Factor)theEObject;
        T result = caseFactor(factor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case NetDSLPackage.EXPRESSION_SEQUENCE:
      {
        ExpressionSequence expressionSequence = (ExpressionSequence)theEObject;
        T result = caseExpressionSequence(expressionSequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainDefinition(DomainDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Header</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Header</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainHeader(DomainHeader object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomainElement(DomainElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Node</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Node</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicNode(BasicNode object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>States Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>States Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatesAttribute(StatesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabelAttribute(LabelAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositionAttribute(PositionAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subtype Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subtype Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubtypeAttribute(SubtypeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Values Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Values Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateValuesAttribute(StateValuesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Application Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseApplicationAttribute(ApplicationAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Size Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Size Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeSizeAttribute(NodeSizeAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotential(Potential object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Graph</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Graph</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialGraph(PotentialGraph object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialModel(PotentialModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialAttribute(PotentialAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Data Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Data Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialDataAttribute(PotentialDataAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unstructured Data List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unstructured Data List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnstructuredDataList(UnstructuredDataList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structured Data List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structured Data List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructuredDataList(StructuredDataList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Data List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Data List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatDataList(FloatDataList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Normal Distribution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Normal Distribution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNormalDistribution(NormalDistribution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Potential Table Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Potential Table Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePotentialTableAttribute(PotentialTableAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Nodes Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Nodes Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelNodesAttribute(ModelNodesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Samples Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Samples Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSamplesAttribute(SamplesAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Data Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Data Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelDataAttribute(ModelDataAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassDefinition(ClassDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassElement(ClassElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassInstance(ClassInstance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Bindings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Bindings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputBindings(InputBindings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputBinding(InputBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Bindings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Bindings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputBindings(OutputBindings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputBinding(OutputBinding object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Node Attributes</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Node Attributes</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNodeAttributes(NodeAttributes object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleExpression(SimpleExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerm(Term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp Factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpFactor(ExpFactor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFactor(Factor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionSequence(ExpressionSequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //NetDSLSwitch
