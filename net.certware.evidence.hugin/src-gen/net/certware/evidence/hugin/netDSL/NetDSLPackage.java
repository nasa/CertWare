/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.certware.evidence.hugin.netDSL.NetDSLFactory
 * @model kind="package"
 * @generated
 */
public interface NetDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "netDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/evidence/hugin/NetDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "netDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NetDSLPackage eINSTANCE = net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ModelImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DOMAIN = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.DomainDefinitionImpl <em>Domain Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.DomainDefinitionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDomainDefinition()
   * @generated
   */
  int DOMAIN_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Header</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEFINITION__HEADER = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEFINITION__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Domain Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.DomainHeaderImpl <em>Domain Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.DomainHeaderImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDomainHeader()
   * @generated
   */
  int DOMAIN_HEADER = 2;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_HEADER__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Domain Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_HEADER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ClassElementImpl <em>Class Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ClassElementImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getClassElement()
   * @generated
   */
  int CLASS_ELEMENT = 27;

  /**
   * The number of structural features of the '<em>Class Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.DomainElementImpl <em>Domain Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.DomainElementImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDomainElement()
   * @generated
   */
  int DOMAIN_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Domain Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_ELEMENT_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.AttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 4;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.BasicNodeImpl <em>Basic Node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.BasicNodeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getBasicNode()
   * @generated
   */
  int BASIC_NODE = 5;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_NODE__KEYWORD = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_NODE__ID = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_NODE__ATTRIBUTES = DOMAIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Basic Node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_NODE_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.StatesAttributeImpl <em>States Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.StatesAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getStatesAttribute()
   * @generated
   */
  int STATES_ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>States</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_ATTRIBUTE__STATES = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>States Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.LabelAttributeImpl <em>Label Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.LabelAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getLabelAttribute()
   * @generated
   */
  int LABEL_ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.PositionAttributeImpl <em>Position Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.PositionAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPositionAttribute()
   * @generated
   */
  int POSITION_ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE__X = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE__Y = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Position Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.SubtypeAttributeImpl <em>Subtype Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.SubtypeAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getSubtypeAttribute()
   * @generated
   */
  int SUBTYPE_ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Subtype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_ATTRIBUTE__SUBTYPE = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Subtype Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBTYPE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.StateValuesAttributeImpl <em>State Values Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.StateValuesAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getStateValuesAttribute()
   * @generated
   */
  int STATE_VALUES_ATTRIBUTE = 10;

  /**
   * The feature id for the '<em><b>Numbers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VALUES_ATTRIBUTE__NUMBERS = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>State Values Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_VALUES_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ApplicationAttributeImpl <em>Application Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ApplicationAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getApplicationAttribute()
   * @generated
   */
  int APPLICATION_ATTRIBUTE = 11;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ATTRIBUTE__KEY = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Application Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPLICATION_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.NodeSizeAttributeImpl <em>Node Size Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.NodeSizeAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getNodeSizeAttribute()
   * @generated
   */
  int NODE_SIZE_ATTRIBUTE = 12;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SIZE_ATTRIBUTE__WIDTH = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SIZE_ATTRIBUTE__HEIGHT = ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node Size Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_SIZE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialImpl <em>Potential</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.PotentialImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotential()
   * @generated
   */
  int POTENTIAL = 13;

  /**
   * The feature id for the '<em><b>Graph</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL__GRAPH = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL__MODEL = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Potential</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialGraphImpl <em>Potential Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.PotentialGraphImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialGraph()
   * @generated
   */
  int POTENTIAL_GRAPH = 14;

  /**
   * The feature id for the '<em><b>Children</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_GRAPH__CHILDREN = 0;

  /**
   * The feature id for the '<em><b>Parents</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_GRAPH__PARENTS = 1;

  /**
   * The number of structural features of the '<em>Potential Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_GRAPH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialModelImpl <em>Potential Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.PotentialModelImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialModel()
   * @generated
   */
  int POTENTIAL_MODEL = 15;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_MODEL__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Potential Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialAttributeImpl <em>Potential Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.PotentialAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialAttribute()
   * @generated
   */
  int POTENTIAL_ATTRIBUTE = 16;

  /**
   * The number of structural features of the '<em>Potential Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialDataAttributeImpl <em>Potential Data Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.PotentialDataAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialDataAttribute()
   * @generated
   */
  int POTENTIAL_DATA_ATTRIBUTE = 17;

  /**
   * The feature id for the '<em><b>Unstructured</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structured</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_DATA_ATTRIBUTE__STRUCTURED = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Potential Data Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_DATA_ATTRIBUTE_FEATURE_COUNT = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.UnstructuredDataListImpl <em>Unstructured Data List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.UnstructuredDataListImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getUnstructuredDataList()
   * @generated
   */
  int UNSTRUCTURED_DATA_LIST = 18;

  /**
   * The feature id for the '<em><b>Items</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSTRUCTURED_DATA_LIST__ITEMS = 0;

  /**
   * The number of structural features of the '<em>Unstructured Data List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNSTRUCTURED_DATA_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.StructuredDataListImpl <em>Structured Data List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.StructuredDataListImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getStructuredDataList()
   * @generated
   */
  int STRUCTURED_DATA_LIST = 19;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_DATA_LIST__LIST = 0;

  /**
   * The number of structural features of the '<em>Structured Data List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURED_DATA_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.FloatDataListImpl <em>Float Data List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.FloatDataListImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getFloatDataList()
   * @generated
   */
  int FLOAT_DATA_LIST = 20;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_DATA_LIST__LIST = 0;

  /**
   * The number of structural features of the '<em>Float Data List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_DATA_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.NormalDistributionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getNormalDistribution()
   * @generated
   */
  int NORMAL_DISTRIBUTION = 21;

  /**
   * The feature id for the '<em><b>Items</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DISTRIBUTION__ITEMS = UNSTRUCTURED_DATA_LIST__ITEMS;

  /**
   * The feature id for the '<em><b>Mean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DISTRIBUTION__MEAN = UNSTRUCTURED_DATA_LIST_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DISTRIBUTION__VARIANCE = UNSTRUCTURED_DATA_LIST_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Normal Distribution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_DISTRIBUTION_FEATURE_COUNT = UNSTRUCTURED_DATA_LIST_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl <em>Potential Table Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialTableAttribute()
   * @generated
   */
  int POTENTIAL_TABLE_ATTRIBUTE = 22;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_TABLE_ATTRIBUTE__NODES = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Samples</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_TABLE_ATTRIBUTE__SAMPLES = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_TABLE_ATTRIBUTE__DATA = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Potential Table Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_TABLE_ATTRIBUTE_FEATURE_COUNT = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ModelNodesAttributeImpl <em>Model Nodes Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ModelNodesAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getModelNodesAttribute()
   * @generated
   */
  int MODEL_NODES_ATTRIBUTE = 23;

  /**
   * The feature id for the '<em><b>Configurations</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_NODES_ATTRIBUTE__CONFIGURATIONS = 0;

  /**
   * The number of structural features of the '<em>Model Nodes Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_NODES_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.SamplesAttributeImpl <em>Samples Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.SamplesAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getSamplesAttribute()
   * @generated
   */
  int SAMPLES_ATTRIBUTE = 24;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAMPLES_ATTRIBUTE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Samples Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SAMPLES_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ModelDataAttributeImpl <em>Model Data Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ModelDataAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getModelDataAttribute()
   * @generated
   */
  int MODEL_DATA_ATTRIBUTE = 25;

  /**
   * The number of structural features of the '<em>Model Data Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DATA_ATTRIBUTE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ClassDefinitionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getClassDefinition()
   * @generated
   */
  int CLASS_DEFINITION = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION__NAME = DOMAIN_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION__ELEMENTS = DOMAIN_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEFINITION_FEATURE_COUNT = DOMAIN_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ClassInstanceImpl <em>Class Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ClassInstanceImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getClassInstance()
   * @generated
   */
  int CLASS_INSTANCE = 28;

  /**
   * The feature id for the '<em><b>Instance Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__INSTANCE_NAME = CLASS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__CLASS_NAME = CLASS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__INPUT = CLASS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__OUTPUT = CLASS_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE__ATTRIBUTES = CLASS_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Class Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_INSTANCE_FEATURE_COUNT = CLASS_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.InputBindingsImpl <em>Input Bindings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.InputBindingsImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getInputBindings()
   * @generated
   */
  int INPUT_BINDINGS = 29;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_BINDINGS__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_BINDINGS__RHS = 1;

  /**
   * The number of structural features of the '<em>Input Bindings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_BINDINGS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.InputBindingImpl <em>Input Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.InputBindingImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getInputBinding()
   * @generated
   */
  int INPUT_BINDING = 30;

  /**
   * The feature id for the '<em><b>Formal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_BINDING__FORMAL = 0;

  /**
   * The feature id for the '<em><b>Actual</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_BINDING__ACTUAL = 1;

  /**
   * The number of structural features of the '<em>Input Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.OutputBindingsImpl <em>Output Bindings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.OutputBindingsImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getOutputBindings()
   * @generated
   */
  int OUTPUT_BINDINGS = 31;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_BINDINGS__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_BINDINGS__RHS = 1;

  /**
   * The number of structural features of the '<em>Output Bindings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_BINDINGS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.OutputBindingImpl <em>Output Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.OutputBindingImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getOutputBinding()
   * @generated
   */
  int OUTPUT_BINDING = 32;

  /**
   * The feature id for the '<em><b>Actual</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_BINDING__ACTUAL = 0;

  /**
   * The feature id for the '<em><b>Formal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_BINDING__FORMAL = 1;

  /**
   * The number of structural features of the '<em>Output Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.NodeAttributesImpl <em>Node Attributes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.NodeAttributesImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getNodeAttributes()
   * @generated
   */
  int NODE_ATTRIBUTES = 33;

  /**
   * The number of structural features of the '<em>Node Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ATTRIBUTES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RHS = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.SimpleExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getSimpleExpression()
   * @generated
   */
  int SIMPLE_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION__RHS = 1;

  /**
   * The number of structural features of the '<em>Simple Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.TermImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getTerm()
   * @generated
   */
  int TERM = 36;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__RHS = 1;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ExpFactorImpl <em>Exp Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ExpFactorImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getExpFactor()
   * @generated
   */
  int EXP_FACTOR = 37;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FACTOR__LHS = 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FACTOR__RHS = 1;

  /**
   * The number of structural features of the '<em>Exp Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FACTOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.FactorImpl <em>Factor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.FactorImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getFactor()
   * @generated
   */
  int FACTOR = 38;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__NUMBER = 0;

  /**
   * The feature id for the '<em><b>Node Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__NODE_NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__VALUE = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__OP = 4;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR__SEQUENCE = 5;

  /**
   * The number of structural features of the '<em>Factor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACTOR_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ExpressionSequenceImpl <em>Expression Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ExpressionSequenceImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getExpressionSequence()
   * @generated
   */
  int EXPRESSION_SEQUENCE = 39;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SEQUENCE__EXPRESSIONS = 0;

  /**
   * The number of structural features of the '<em>Expression Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_SEQUENCE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.certware.evidence.hugin.netDSL.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Model#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see net.certware.evidence.hugin.netDSL.Model#getDomain()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Domain();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.DomainDefinition <em>Domain Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Definition</em>'.
   * @see net.certware.evidence.hugin.netDSL.DomainDefinition
   * @generated
   */
  EClass getDomainDefinition();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.DomainDefinition#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Header</em>'.
   * @see net.certware.evidence.hugin.netDSL.DomainDefinition#getHeader()
   * @see #getDomainDefinition()
   * @generated
   */
  EReference getDomainDefinition_Header();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.DomainDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see net.certware.evidence.hugin.netDSL.DomainDefinition#getElements()
   * @see #getDomainDefinition()
   * @generated
   */
  EReference getDomainDefinition_Elements();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.DomainHeader <em>Domain Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Header</em>'.
   * @see net.certware.evidence.hugin.netDSL.DomainHeader
   * @generated
   */
  EClass getDomainHeader();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.DomainHeader#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see net.certware.evidence.hugin.netDSL.DomainHeader#getAttributes()
   * @see #getDomainHeader()
   * @generated
   */
  EReference getDomainHeader_Attributes();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.DomainElement <em>Domain Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain Element</em>'.
   * @see net.certware.evidence.hugin.netDSL.DomainElement
   * @generated
   */
  EClass getDomainElement();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.BasicNode <em>Basic Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Node</em>'.
   * @see net.certware.evidence.hugin.netDSL.BasicNode
   * @generated
   */
  EClass getBasicNode();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.BasicNode#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see net.certware.evidence.hugin.netDSL.BasicNode#getKeyword()
   * @see #getBasicNode()
   * @generated
   */
  EAttribute getBasicNode_Keyword();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.BasicNode#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see net.certware.evidence.hugin.netDSL.BasicNode#getId()
   * @see #getBasicNode()
   * @generated
   */
  EAttribute getBasicNode_Id();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.BasicNode#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see net.certware.evidence.hugin.netDSL.BasicNode#getAttributes()
   * @see #getBasicNode()
   * @generated
   */
  EReference getBasicNode_Attributes();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.StatesAttribute <em>States Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.StatesAttribute
   * @generated
   */
  EClass getStatesAttribute();

  /**
   * Returns the meta object for the attribute list '{@link net.certware.evidence.hugin.netDSL.StatesAttribute#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>States</em>'.
   * @see net.certware.evidence.hugin.netDSL.StatesAttribute#getStates()
   * @see #getStatesAttribute()
   * @generated
   */
  EAttribute getStatesAttribute_States();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.LabelAttribute <em>Label Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.LabelAttribute
   * @generated
   */
  EClass getLabelAttribute();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.LabelAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.LabelAttribute#getValue()
   * @see #getLabelAttribute()
   * @generated
   */
  EAttribute getLabelAttribute_Value();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.PositionAttribute <em>Position Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.PositionAttribute
   * @generated
   */
  EClass getPositionAttribute();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.PositionAttribute#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see net.certware.evidence.hugin.netDSL.PositionAttribute#getX()
   * @see #getPositionAttribute()
   * @generated
   */
  EAttribute getPositionAttribute_X();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.PositionAttribute#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see net.certware.evidence.hugin.netDSL.PositionAttribute#getY()
   * @see #getPositionAttribute()
   * @generated
   */
  EAttribute getPositionAttribute_Y();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.SubtypeAttribute <em>Subtype Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Subtype Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.SubtypeAttribute
   * @generated
   */
  EClass getSubtypeAttribute();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.SubtypeAttribute#getSubtype <em>Subtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Subtype</em>'.
   * @see net.certware.evidence.hugin.netDSL.SubtypeAttribute#getSubtype()
   * @see #getSubtypeAttribute()
   * @generated
   */
  EAttribute getSubtypeAttribute_Subtype();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.StateValuesAttribute <em>State Values Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Values Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.StateValuesAttribute
   * @generated
   */
  EClass getStateValuesAttribute();

  /**
   * Returns the meta object for the attribute list '{@link net.certware.evidence.hugin.netDSL.StateValuesAttribute#getNumbers <em>Numbers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Numbers</em>'.
   * @see net.certware.evidence.hugin.netDSL.StateValuesAttribute#getNumbers()
   * @see #getStateValuesAttribute()
   * @generated
   */
  EAttribute getStateValuesAttribute_Numbers();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.ApplicationAttribute <em>Application Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Application Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.ApplicationAttribute
   * @generated
   */
  EClass getApplicationAttribute();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.ApplicationAttribute#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see net.certware.evidence.hugin.netDSL.ApplicationAttribute#getKey()
   * @see #getApplicationAttribute()
   * @generated
   */
  EAttribute getApplicationAttribute_Key();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.ApplicationAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.ApplicationAttribute#getValue()
   * @see #getApplicationAttribute()
   * @generated
   */
  EAttribute getApplicationAttribute_Value();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.NodeSizeAttribute <em>Node Size Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Size Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.NodeSizeAttribute
   * @generated
   */
  EClass getNodeSizeAttribute();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.NodeSizeAttribute#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see net.certware.evidence.hugin.netDSL.NodeSizeAttribute#getWidth()
   * @see #getNodeSizeAttribute()
   * @generated
   */
  EAttribute getNodeSizeAttribute_Width();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.NodeSizeAttribute#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see net.certware.evidence.hugin.netDSL.NodeSizeAttribute#getHeight()
   * @see #getNodeSizeAttribute()
   * @generated
   */
  EAttribute getNodeSizeAttribute_Height();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Potential <em>Potential</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Potential</em>'.
   * @see net.certware.evidence.hugin.netDSL.Potential
   * @generated
   */
  EClass getPotential();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Potential#getGraph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Graph</em>'.
   * @see net.certware.evidence.hugin.netDSL.Potential#getGraph()
   * @see #getPotential()
   * @generated
   */
  EReference getPotential_Graph();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Potential#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model</em>'.
   * @see net.certware.evidence.hugin.netDSL.Potential#getModel()
   * @see #getPotential()
   * @generated
   */
  EReference getPotential_Model();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.PotentialGraph <em>Potential Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Potential Graph</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialGraph
   * @generated
   */
  EClass getPotentialGraph();

  /**
   * Returns the meta object for the attribute list '{@link net.certware.evidence.hugin.netDSL.PotentialGraph#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Children</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialGraph#getChildren()
   * @see #getPotentialGraph()
   * @generated
   */
  EAttribute getPotentialGraph_Children();

  /**
   * Returns the meta object for the attribute list '{@link net.certware.evidence.hugin.netDSL.PotentialGraph#getParents <em>Parents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parents</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialGraph#getParents()
   * @see #getPotentialGraph()
   * @generated
   */
  EAttribute getPotentialGraph_Parents();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.PotentialModel <em>Potential Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Potential Model</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialModel
   * @generated
   */
  EClass getPotentialModel();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.PotentialModel#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialModel#getAttributes()
   * @see #getPotentialModel()
   * @generated
   */
  EReference getPotentialModel_Attributes();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.PotentialAttribute <em>Potential Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Potential Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialAttribute
   * @generated
   */
  EClass getPotentialAttribute();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute <em>Potential Data Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Potential Data Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialDataAttribute
   * @generated
   */
  EClass getPotentialDataAttribute();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getUnstructured <em>Unstructured</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unstructured</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getUnstructured()
   * @see #getPotentialDataAttribute()
   * @generated
   */
  EReference getPotentialDataAttribute_Unstructured();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getStructured <em>Structured</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Structured</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getStructured()
   * @see #getPotentialDataAttribute()
   * @generated
   */
  EReference getPotentialDataAttribute_Structured();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.UnstructuredDataList <em>Unstructured Data List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unstructured Data List</em>'.
   * @see net.certware.evidence.hugin.netDSL.UnstructuredDataList
   * @generated
   */
  EClass getUnstructuredDataList();

  /**
   * Returns the meta object for the attribute list '{@link net.certware.evidence.hugin.netDSL.UnstructuredDataList#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Items</em>'.
   * @see net.certware.evidence.hugin.netDSL.UnstructuredDataList#getItems()
   * @see #getUnstructuredDataList()
   * @generated
   */
  EAttribute getUnstructuredDataList_Items();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.StructuredDataList <em>Structured Data List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structured Data List</em>'.
   * @see net.certware.evidence.hugin.netDSL.StructuredDataList
   * @generated
   */
  EClass getStructuredDataList();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.StructuredDataList#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see net.certware.evidence.hugin.netDSL.StructuredDataList#getList()
   * @see #getStructuredDataList()
   * @generated
   */
  EReference getStructuredDataList_List();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.FloatDataList <em>Float Data List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Data List</em>'.
   * @see net.certware.evidence.hugin.netDSL.FloatDataList
   * @generated
   */
  EClass getFloatDataList();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.FloatDataList#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see net.certware.evidence.hugin.netDSL.FloatDataList#getList()
   * @see #getFloatDataList()
   * @generated
   */
  EReference getFloatDataList_List();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.NormalDistribution <em>Normal Distribution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal Distribution</em>'.
   * @see net.certware.evidence.hugin.netDSL.NormalDistribution
   * @generated
   */
  EClass getNormalDistribution();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.NormalDistribution#getMean <em>Mean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mean</em>'.
   * @see net.certware.evidence.hugin.netDSL.NormalDistribution#getMean()
   * @see #getNormalDistribution()
   * @generated
   */
  EAttribute getNormalDistribution_Mean();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.NormalDistribution#getVariance <em>Variance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variance</em>'.
   * @see net.certware.evidence.hugin.netDSL.NormalDistribution#getVariance()
   * @see #getNormalDistribution()
   * @generated
   */
  EAttribute getNormalDistribution_Variance();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute <em>Potential Table Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Potential Table Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialTableAttribute
   * @generated
   */
  EClass getPotentialTableAttribute();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nodes</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getNodes()
   * @see #getPotentialTableAttribute()
   * @generated
   */
  EReference getPotentialTableAttribute_Nodes();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getSamples <em>Samples</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Samples</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getSamples()
   * @see #getPotentialTableAttribute()
   * @generated
   */
  EReference getPotentialTableAttribute_Samples();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialTableAttribute#getData()
   * @see #getPotentialTableAttribute()
   * @generated
   */
  EReference getPotentialTableAttribute_Data();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.ModelNodesAttribute <em>Model Nodes Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Nodes Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.ModelNodesAttribute
   * @generated
   */
  EClass getModelNodesAttribute();

  /**
   * Returns the meta object for the attribute list '{@link net.certware.evidence.hugin.netDSL.ModelNodesAttribute#getConfigurations <em>Configurations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Configurations</em>'.
   * @see net.certware.evidence.hugin.netDSL.ModelNodesAttribute#getConfigurations()
   * @see #getModelNodesAttribute()
   * @generated
   */
  EAttribute getModelNodesAttribute_Configurations();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.SamplesAttribute <em>Samples Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Samples Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.SamplesAttribute
   * @generated
   */
  EClass getSamplesAttribute();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.SamplesAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.SamplesAttribute#getValue()
   * @see #getSamplesAttribute()
   * @generated
   */
  EAttribute getSamplesAttribute_Value();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.ModelDataAttribute <em>Model Data Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Data Attribute</em>'.
   * @see net.certware.evidence.hugin.netDSL.ModelDataAttribute
   * @generated
   */
  EClass getModelDataAttribute();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.ClassDefinition <em>Class Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Definition</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassDefinition
   * @generated
   */
  EClass getClassDefinition();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.ClassDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassDefinition#getName()
   * @see #getClassDefinition()
   * @generated
   */
  EAttribute getClassDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.ClassDefinition#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassDefinition#getElements()
   * @see #getClassDefinition()
   * @generated
   */
  EReference getClassDefinition_Elements();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.ClassElement <em>Class Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Element</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassElement
   * @generated
   */
  EClass getClassElement();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.ClassInstance <em>Class Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Instance</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassInstance
   * @generated
   */
  EClass getClassInstance();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getInstanceName <em>Instance Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Instance Name</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassInstance#getInstanceName()
   * @see #getClassInstance()
   * @generated
   */
  EAttribute getClassInstance_InstanceName();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassInstance#getClassName()
   * @see #getClassInstance()
   * @generated
   */
  EAttribute getClassInstance_ClassName();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassInstance#getInput()
   * @see #getClassInstance()
   * @generated
   */
  EReference getClassInstance_Input();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassInstance#getOutput()
   * @see #getClassInstance()
   * @generated
   */
  EReference getClassInstance_Output();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.ClassInstance#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see net.certware.evidence.hugin.netDSL.ClassInstance#getAttributes()
   * @see #getClassInstance()
   * @generated
   */
  EReference getClassInstance_Attributes();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.InputBindings <em>Input Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Bindings</em>'.
   * @see net.certware.evidence.hugin.netDSL.InputBindings
   * @generated
   */
  EClass getInputBindings();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.InputBindings#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.InputBindings#getLhs()
   * @see #getInputBindings()
   * @generated
   */
  EReference getInputBindings_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.InputBindings#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.InputBindings#getRhs()
   * @see #getInputBindings()
   * @generated
   */
  EReference getInputBindings_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.InputBinding <em>Input Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Binding</em>'.
   * @see net.certware.evidence.hugin.netDSL.InputBinding
   * @generated
   */
  EClass getInputBinding();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.InputBinding#getFormal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Formal</em>'.
   * @see net.certware.evidence.hugin.netDSL.InputBinding#getFormal()
   * @see #getInputBinding()
   * @generated
   */
  EAttribute getInputBinding_Formal();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.InputBinding#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actual</em>'.
   * @see net.certware.evidence.hugin.netDSL.InputBinding#getActual()
   * @see #getInputBinding()
   * @generated
   */
  EAttribute getInputBinding_Actual();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.OutputBindings <em>Output Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Bindings</em>'.
   * @see net.certware.evidence.hugin.netDSL.OutputBindings
   * @generated
   */
  EClass getOutputBindings();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.OutputBindings#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.OutputBindings#getLhs()
   * @see #getOutputBindings()
   * @generated
   */
  EReference getOutputBindings_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.OutputBindings#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.OutputBindings#getRhs()
   * @see #getOutputBindings()
   * @generated
   */
  EReference getOutputBindings_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.OutputBinding <em>Output Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Binding</em>'.
   * @see net.certware.evidence.hugin.netDSL.OutputBinding
   * @generated
   */
  EClass getOutputBinding();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.OutputBinding#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actual</em>'.
   * @see net.certware.evidence.hugin.netDSL.OutputBinding#getActual()
   * @see #getOutputBinding()
   * @generated
   */
  EAttribute getOutputBinding_Actual();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.OutputBinding#getFormal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Formal</em>'.
   * @see net.certware.evidence.hugin.netDSL.OutputBinding#getFormal()
   * @see #getOutputBinding()
   * @generated
   */
  EAttribute getOutputBinding_Formal();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.NodeAttributes <em>Node Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Attributes</em>'.
   * @see net.certware.evidence.hugin.netDSL.NodeAttributes
   * @generated
   */
  EClass getNodeAttributes();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Expression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.Expression#getLhs()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Lhs();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.Expression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.Expression#getRhs()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.SimpleExpression <em>Simple Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.SimpleExpression
   * @generated
   */
  EClass getSimpleExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.SimpleExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.SimpleExpression#getLhs()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_Lhs();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.SimpleExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.SimpleExpression#getRhs()
   * @see #getSimpleExpression()
   * @generated
   */
  EReference getSimpleExpression_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see net.certware.evidence.hugin.netDSL.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Term#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.Term#getLhs()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Lhs();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.Term#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.Term#getRhs()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.ExpFactor <em>Exp Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Factor</em>'.
   * @see net.certware.evidence.hugin.netDSL.ExpFactor
   * @generated
   */
  EClass getExpFactor();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.ExpFactor#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.ExpFactor#getLhs()
   * @see #getExpFactor()
   * @generated
   */
  EReference getExpFactor_Lhs();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.ExpFactor#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rhs</em>'.
   * @see net.certware.evidence.hugin.netDSL.ExpFactor#getRhs()
   * @see #getExpFactor()
   * @generated
   */
  EReference getExpFactor_Rhs();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Factor <em>Factor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Factor</em>'.
   * @see net.certware.evidence.hugin.netDSL.Factor
   * @generated
   */
  EClass getFactor();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.Factor#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see net.certware.evidence.hugin.netDSL.Factor#getNumber()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Number();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.Factor#getNodeName <em>Node Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node Name</em>'.
   * @see net.certware.evidence.hugin.netDSL.Factor#getNodeName()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_NodeName();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.Factor#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.Factor#getValue()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Value();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Factor#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.Factor#getExpression()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Expression();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.Factor#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.certware.evidence.hugin.netDSL.Factor#getOp()
   * @see #getFactor()
   * @generated
   */
  EAttribute getFactor_Op();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Factor#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see net.certware.evidence.hugin.netDSL.Factor#getSequence()
   * @see #getFactor()
   * @generated
   */
  EReference getFactor_Sequence();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.ExpressionSequence <em>Expression Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Sequence</em>'.
   * @see net.certware.evidence.hugin.netDSL.ExpressionSequence
   * @generated
   */
  EClass getExpressionSequence();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.ExpressionSequence#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see net.certware.evidence.hugin.netDSL.ExpressionSequence#getExpressions()
   * @see #getExpressionSequence()
   * @generated
   */
  EReference getExpressionSequence_Expressions();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NetDSLFactory getNetDSLFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ModelImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DOMAIN = eINSTANCE.getModel_Domain();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.DomainDefinitionImpl <em>Domain Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.DomainDefinitionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDomainDefinition()
     * @generated
     */
    EClass DOMAIN_DEFINITION = eINSTANCE.getDomainDefinition();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_DEFINITION__HEADER = eINSTANCE.getDomainDefinition_Header();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_DEFINITION__ELEMENTS = eINSTANCE.getDomainDefinition_Elements();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.DomainHeaderImpl <em>Domain Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.DomainHeaderImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDomainHeader()
     * @generated
     */
    EClass DOMAIN_HEADER = eINSTANCE.getDomainHeader();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN_HEADER__ATTRIBUTES = eINSTANCE.getDomainHeader_Attributes();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.DomainElementImpl <em>Domain Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.DomainElementImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDomainElement()
     * @generated
     */
    EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.AttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.BasicNodeImpl <em>Basic Node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.BasicNodeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getBasicNode()
     * @generated
     */
    EClass BASIC_NODE = eINSTANCE.getBasicNode();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_NODE__KEYWORD = eINSTANCE.getBasicNode_Keyword();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASIC_NODE__ID = eINSTANCE.getBasicNode_Id();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_NODE__ATTRIBUTES = eINSTANCE.getBasicNode_Attributes();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.StatesAttributeImpl <em>States Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.StatesAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getStatesAttribute()
     * @generated
     */
    EClass STATES_ATTRIBUTE = eINSTANCE.getStatesAttribute();

    /**
     * The meta object literal for the '<em><b>States</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATES_ATTRIBUTE__STATES = eINSTANCE.getStatesAttribute_States();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.LabelAttributeImpl <em>Label Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.LabelAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getLabelAttribute()
     * @generated
     */
    EClass LABEL_ATTRIBUTE = eINSTANCE.getLabelAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_ATTRIBUTE__VALUE = eINSTANCE.getLabelAttribute_Value();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.PositionAttributeImpl <em>Position Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.PositionAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPositionAttribute()
     * @generated
     */
    EClass POSITION_ATTRIBUTE = eINSTANCE.getPositionAttribute();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION_ATTRIBUTE__X = eINSTANCE.getPositionAttribute_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION_ATTRIBUTE__Y = eINSTANCE.getPositionAttribute_Y();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.SubtypeAttributeImpl <em>Subtype Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.SubtypeAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getSubtypeAttribute()
     * @generated
     */
    EClass SUBTYPE_ATTRIBUTE = eINSTANCE.getSubtypeAttribute();

    /**
     * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUBTYPE_ATTRIBUTE__SUBTYPE = eINSTANCE.getSubtypeAttribute_Subtype();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.StateValuesAttributeImpl <em>State Values Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.StateValuesAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getStateValuesAttribute()
     * @generated
     */
    EClass STATE_VALUES_ATTRIBUTE = eINSTANCE.getStateValuesAttribute();

    /**
     * The meta object literal for the '<em><b>Numbers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_VALUES_ATTRIBUTE__NUMBERS = eINSTANCE.getStateValuesAttribute_Numbers();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ApplicationAttributeImpl <em>Application Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ApplicationAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getApplicationAttribute()
     * @generated
     */
    EClass APPLICATION_ATTRIBUTE = eINSTANCE.getApplicationAttribute();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ATTRIBUTE__KEY = eINSTANCE.getApplicationAttribute_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute APPLICATION_ATTRIBUTE__VALUE = eINSTANCE.getApplicationAttribute_Value();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.NodeSizeAttributeImpl <em>Node Size Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.NodeSizeAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getNodeSizeAttribute()
     * @generated
     */
    EClass NODE_SIZE_ATTRIBUTE = eINSTANCE.getNodeSizeAttribute();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_SIZE_ATTRIBUTE__WIDTH = eINSTANCE.getNodeSizeAttribute_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_SIZE_ATTRIBUTE__HEIGHT = eINSTANCE.getNodeSizeAttribute_Height();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialImpl <em>Potential</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.PotentialImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotential()
     * @generated
     */
    EClass POTENTIAL = eINSTANCE.getPotential();

    /**
     * The meta object literal for the '<em><b>Graph</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL__GRAPH = eINSTANCE.getPotential_Graph();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL__MODEL = eINSTANCE.getPotential_Model();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialGraphImpl <em>Potential Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.PotentialGraphImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialGraph()
     * @generated
     */
    EClass POTENTIAL_GRAPH = eINSTANCE.getPotentialGraph();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POTENTIAL_GRAPH__CHILDREN = eINSTANCE.getPotentialGraph_Children();

    /**
     * The meta object literal for the '<em><b>Parents</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POTENTIAL_GRAPH__PARENTS = eINSTANCE.getPotentialGraph_Parents();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialModelImpl <em>Potential Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.PotentialModelImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialModel()
     * @generated
     */
    EClass POTENTIAL_MODEL = eINSTANCE.getPotentialModel();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL_MODEL__ATTRIBUTES = eINSTANCE.getPotentialModel_Attributes();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialAttributeImpl <em>Potential Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.PotentialAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialAttribute()
     * @generated
     */
    EClass POTENTIAL_ATTRIBUTE = eINSTANCE.getPotentialAttribute();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialDataAttributeImpl <em>Potential Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.PotentialDataAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialDataAttribute()
     * @generated
     */
    EClass POTENTIAL_DATA_ATTRIBUTE = eINSTANCE.getPotentialDataAttribute();

    /**
     * The meta object literal for the '<em><b>Unstructured</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL_DATA_ATTRIBUTE__UNSTRUCTURED = eINSTANCE.getPotentialDataAttribute_Unstructured();

    /**
     * The meta object literal for the '<em><b>Structured</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL_DATA_ATTRIBUTE__STRUCTURED = eINSTANCE.getPotentialDataAttribute_Structured();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.UnstructuredDataListImpl <em>Unstructured Data List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.UnstructuredDataListImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getUnstructuredDataList()
     * @generated
     */
    EClass UNSTRUCTURED_DATA_LIST = eINSTANCE.getUnstructuredDataList();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNSTRUCTURED_DATA_LIST__ITEMS = eINSTANCE.getUnstructuredDataList_Items();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.StructuredDataListImpl <em>Structured Data List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.StructuredDataListImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getStructuredDataList()
     * @generated
     */
    EClass STRUCTURED_DATA_LIST = eINSTANCE.getStructuredDataList();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURED_DATA_LIST__LIST = eINSTANCE.getStructuredDataList_List();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.FloatDataListImpl <em>Float Data List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.FloatDataListImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getFloatDataList()
     * @generated
     */
    EClass FLOAT_DATA_LIST = eINSTANCE.getFloatDataList();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOAT_DATA_LIST__LIST = eINSTANCE.getFloatDataList_List();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.NormalDistributionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getNormalDistribution()
     * @generated
     */
    EClass NORMAL_DISTRIBUTION = eINSTANCE.getNormalDistribution();

    /**
     * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NORMAL_DISTRIBUTION__MEAN = eINSTANCE.getNormalDistribution_Mean();

    /**
     * The meta object literal for the '<em><b>Variance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NORMAL_DISTRIBUTION__VARIANCE = eINSTANCE.getNormalDistribution_Variance();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl <em>Potential Table Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialTableAttribute()
     * @generated
     */
    EClass POTENTIAL_TABLE_ATTRIBUTE = eINSTANCE.getPotentialTableAttribute();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL_TABLE_ATTRIBUTE__NODES = eINSTANCE.getPotentialTableAttribute_Nodes();

    /**
     * The meta object literal for the '<em><b>Samples</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL_TABLE_ATTRIBUTE__SAMPLES = eINSTANCE.getPotentialTableAttribute_Samples();

    /**
     * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL_TABLE_ATTRIBUTE__DATA = eINSTANCE.getPotentialTableAttribute_Data();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ModelNodesAttributeImpl <em>Model Nodes Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ModelNodesAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getModelNodesAttribute()
     * @generated
     */
    EClass MODEL_NODES_ATTRIBUTE = eINSTANCE.getModelNodesAttribute();

    /**
     * The meta object literal for the '<em><b>Configurations</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_NODES_ATTRIBUTE__CONFIGURATIONS = eINSTANCE.getModelNodesAttribute_Configurations();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.SamplesAttributeImpl <em>Samples Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.SamplesAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getSamplesAttribute()
     * @generated
     */
    EClass SAMPLES_ATTRIBUTE = eINSTANCE.getSamplesAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SAMPLES_ATTRIBUTE__VALUE = eINSTANCE.getSamplesAttribute_Value();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ModelDataAttributeImpl <em>Model Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ModelDataAttributeImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getModelDataAttribute()
     * @generated
     */
    EClass MODEL_DATA_ATTRIBUTE = eINSTANCE.getModelDataAttribute();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ClassDefinitionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getClassDefinition()
     * @generated
     */
    EClass CLASS_DEFINITION = eINSTANCE.getClassDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DEFINITION__NAME = eINSTANCE.getClassDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DEFINITION__ELEMENTS = eINSTANCE.getClassDefinition_Elements();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ClassElementImpl <em>Class Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ClassElementImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getClassElement()
     * @generated
     */
    EClass CLASS_ELEMENT = eINSTANCE.getClassElement();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ClassInstanceImpl <em>Class Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ClassInstanceImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getClassInstance()
     * @generated
     */
    EClass CLASS_INSTANCE = eINSTANCE.getClassInstance();

    /**
     * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_INSTANCE__INSTANCE_NAME = eINSTANCE.getClassInstance_InstanceName();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_INSTANCE__CLASS_NAME = eINSTANCE.getClassInstance_ClassName();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_INSTANCE__INPUT = eINSTANCE.getClassInstance_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_INSTANCE__OUTPUT = eINSTANCE.getClassInstance_Output();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_INSTANCE__ATTRIBUTES = eINSTANCE.getClassInstance_Attributes();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.InputBindingsImpl <em>Input Bindings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.InputBindingsImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getInputBindings()
     * @generated
     */
    EClass INPUT_BINDINGS = eINSTANCE.getInputBindings();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_BINDINGS__LHS = eINSTANCE.getInputBindings_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INPUT_BINDINGS__RHS = eINSTANCE.getInputBindings_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.InputBindingImpl <em>Input Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.InputBindingImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getInputBinding()
     * @generated
     */
    EClass INPUT_BINDING = eINSTANCE.getInputBinding();

    /**
     * The meta object literal for the '<em><b>Formal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_BINDING__FORMAL = eINSTANCE.getInputBinding_Formal();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_BINDING__ACTUAL = eINSTANCE.getInputBinding_Actual();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.OutputBindingsImpl <em>Output Bindings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.OutputBindingsImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getOutputBindings()
     * @generated
     */
    EClass OUTPUT_BINDINGS = eINSTANCE.getOutputBindings();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_BINDINGS__LHS = eINSTANCE.getOutputBindings_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OUTPUT_BINDINGS__RHS = eINSTANCE.getOutputBindings_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.OutputBindingImpl <em>Output Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.OutputBindingImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getOutputBinding()
     * @generated
     */
    EClass OUTPUT_BINDING = eINSTANCE.getOutputBinding();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_BINDING__ACTUAL = eINSTANCE.getOutputBinding_Actual();

    /**
     * The meta object literal for the '<em><b>Formal</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_BINDING__FORMAL = eINSTANCE.getOutputBinding_Formal();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.NodeAttributesImpl <em>Node Attributes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.NodeAttributesImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getNodeAttributes()
     * @generated
     */
    EClass NODE_ATTRIBUTES = eINSTANCE.getNodeAttributes();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LHS = eINSTANCE.getExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RHS = eINSTANCE.getExpression_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.SimpleExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getSimpleExpression()
     * @generated
     */
    EClass SIMPLE_EXPRESSION = eINSTANCE.getSimpleExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__LHS = eINSTANCE.getSimpleExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_EXPRESSION__RHS = eINSTANCE.getSimpleExpression_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.TermImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__LHS = eINSTANCE.getTerm_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__RHS = eINSTANCE.getTerm_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ExpFactorImpl <em>Exp Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ExpFactorImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getExpFactor()
     * @generated
     */
    EClass EXP_FACTOR = eINSTANCE.getExpFactor();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_FACTOR__LHS = eINSTANCE.getExpFactor_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_FACTOR__RHS = eINSTANCE.getExpFactor_Rhs();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.FactorImpl <em>Factor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.FactorImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getFactor()
     * @generated
     */
    EClass FACTOR = eINSTANCE.getFactor();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__NUMBER = eINSTANCE.getFactor_Number();

    /**
     * The meta object literal for the '<em><b>Node Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__NODE_NAME = eINSTANCE.getFactor_NodeName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__VALUE = eINSTANCE.getFactor_Value();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__EXPRESSION = eINSTANCE.getFactor_Expression();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACTOR__OP = eINSTANCE.getFactor_Op();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACTOR__SEQUENCE = eINSTANCE.getFactor_Sequence();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.ExpressionSequenceImpl <em>Expression Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.ExpressionSequenceImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getExpressionSequence()
     * @generated
     */
    EClass EXPRESSION_SEQUENCE = eINSTANCE.getExpressionSequence();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_SEQUENCE__EXPRESSIONS = eINSTANCE.getExpressionSequence_Expressions();

  }

} //NetDSLPackage
