/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.evidence.hugin.netDSL.NetDSLPackage
 * @generated
 */
public interface NetDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NetDSLFactory eINSTANCE = net.certware.evidence.hugin.netDSL.impl.NetDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Domain Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Definition</em>'.
   * @generated
   */
  DomainDefinition createDomainDefinition();

  /**
   * Returns a new object of class '<em>Domain Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Header</em>'.
   * @generated
   */
  DomainHeader createDomainHeader();

  /**
   * Returns a new object of class '<em>Domain Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain Element</em>'.
   * @generated
   */
  DomainElement createDomainElement();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Basic Node</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Node</em>'.
   * @generated
   */
  BasicNode createBasicNode();

  /**
   * Returns a new object of class '<em>States Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>States Attribute</em>'.
   * @generated
   */
  StatesAttribute createStatesAttribute();

  /**
   * Returns a new object of class '<em>Label Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Attribute</em>'.
   * @generated
   */
  LabelAttribute createLabelAttribute();

  /**
   * Returns a new object of class '<em>Position Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Position Attribute</em>'.
   * @generated
   */
  PositionAttribute createPositionAttribute();

  /**
   * Returns a new object of class '<em>Subtype Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subtype Attribute</em>'.
   * @generated
   */
  SubtypeAttribute createSubtypeAttribute();

  /**
   * Returns a new object of class '<em>State Values Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Values Attribute</em>'.
   * @generated
   */
  StateValuesAttribute createStateValuesAttribute();

  /**
   * Returns a new object of class '<em>Application Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Application Attribute</em>'.
   * @generated
   */
  ApplicationAttribute createApplicationAttribute();

  /**
   * Returns a new object of class '<em>Node Size Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Size Attribute</em>'.
   * @generated
   */
  NodeSizeAttribute createNodeSizeAttribute();

  /**
   * Returns a new object of class '<em>Potential</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Potential</em>'.
   * @generated
   */
  Potential createPotential();

  /**
   * Returns a new object of class '<em>Potential Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Potential Graph</em>'.
   * @generated
   */
  PotentialGraph createPotentialGraph();

  /**
   * Returns a new object of class '<em>Potential Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Potential Model</em>'.
   * @generated
   */
  PotentialModel createPotentialModel();

  /**
   * Returns a new object of class '<em>Potential Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Potential Attribute</em>'.
   * @generated
   */
  PotentialAttribute createPotentialAttribute();

  /**
   * Returns a new object of class '<em>Potential Data Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Potential Data Attribute</em>'.
   * @generated
   */
  PotentialDataAttribute createPotentialDataAttribute();

  /**
   * Returns a new object of class '<em>Unstructured Data List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unstructured Data List</em>'.
   * @generated
   */
  UnstructuredDataList createUnstructuredDataList();

  /**
   * Returns a new object of class '<em>Structured Data List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structured Data List</em>'.
   * @generated
   */
  StructuredDataList createStructuredDataList();

  /**
   * Returns a new object of class '<em>Float Data List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Data List</em>'.
   * @generated
   */
  FloatDataList createFloatDataList();

  /**
   * Returns a new object of class '<em>Normal Distribution</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Normal Distribution</em>'.
   * @generated
   */
  NormalDistribution createNormalDistribution();

  /**
   * Returns a new object of class '<em>Potential Table Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Potential Table Attribute</em>'.
   * @generated
   */
  PotentialTableAttribute createPotentialTableAttribute();

  /**
   * Returns a new object of class '<em>Model Nodes Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Nodes Attribute</em>'.
   * @generated
   */
  ModelNodesAttribute createModelNodesAttribute();

  /**
   * Returns a new object of class '<em>Samples Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Samples Attribute</em>'.
   * @generated
   */
  SamplesAttribute createSamplesAttribute();

  /**
   * Returns a new object of class '<em>Model Data Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Data Attribute</em>'.
   * @generated
   */
  ModelDataAttribute createModelDataAttribute();

  /**
   * Returns a new object of class '<em>Class Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Definition</em>'.
   * @generated
   */
  ClassDefinition createClassDefinition();

  /**
   * Returns a new object of class '<em>Class Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Element</em>'.
   * @generated
   */
  ClassElement createClassElement();

  /**
   * Returns a new object of class '<em>Class Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class Instance</em>'.
   * @generated
   */
  ClassInstance createClassInstance();

  /**
   * Returns a new object of class '<em>Input Bindings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Bindings</em>'.
   * @generated
   */
  InputBindings createInputBindings();

  /**
   * Returns a new object of class '<em>Input Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Binding</em>'.
   * @generated
   */
  InputBinding createInputBinding();

  /**
   * Returns a new object of class '<em>Output Bindings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Bindings</em>'.
   * @generated
   */
  OutputBindings createOutputBindings();

  /**
   * Returns a new object of class '<em>Output Binding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Binding</em>'.
   * @generated
   */
  OutputBinding createOutputBinding();

  /**
   * Returns a new object of class '<em>Node Attributes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Attributes</em>'.
   * @generated
   */
  NodeAttributes createNodeAttributes();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Simple Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Expression</em>'.
   * @generated
   */
  SimpleExpression createSimpleExpression();

  /**
   * Returns a new object of class '<em>Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term</em>'.
   * @generated
   */
  Term createTerm();

  /**
   * Returns a new object of class '<em>Exp Factor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exp Factor</em>'.
   * @generated
   */
  ExpFactor createExpFactor();

  /**
   * Returns a new object of class '<em>Factor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Factor</em>'.
   * @generated
   */
  Factor createFactor();

  /**
   * Returns a new object of class '<em>Expression Sequence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Sequence</em>'.
   * @generated
   */
  ExpressionSequence createExpressionSequence();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NetDSLPackage getNetDSLPackage();

} //NetDSLFactory
