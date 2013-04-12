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
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.IntegerImpl <em>Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.IntegerImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getInteger()
   * @generated
   */
  int INTEGER = 1;

  /**
   * The feature id for the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__I = 0;

  /**
   * The number of structural features of the '<em>Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.DomainDefinitionImpl <em>Domain Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.DomainDefinitionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDomainDefinition()
   * @generated
   */
  int DOMAIN_DEFINITION = 2;

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
  int DOMAIN_HEADER = 3;

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
  int CLASS_ELEMENT = 25;

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
  int DOMAIN_ELEMENT = 4;

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
  int ATTRIBUTE = 5;

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
  int BASIC_NODE = 6;

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
  int STATES_ATTRIBUTE = 7;

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
  int LABEL_ATTRIBUTE = 8;

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
  int POSITION_ATTRIBUTE = 9;

  /**
   * The number of structural features of the '<em>Position Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.SubtypeAttributeImpl <em>Subtype Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.SubtypeAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getSubtypeAttribute()
   * @generated
   */
  int SUBTYPE_ATTRIBUTE = 10;

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
  int STATE_VALUES_ATTRIBUTE = 11;

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
  int APPLICATION_ATTRIBUTE = 12;

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
  int NODE_SIZE_ATTRIBUTE = 13;

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
  int POTENTIAL = 14;

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
  int POTENTIAL_GRAPH = 15;

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
  int POTENTIAL_MODEL = 16;

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
  int POTENTIAL_ATTRIBUTE = 17;

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
  int POTENTIAL_DATA_ATTRIBUTE = 18;

  /**
   * The feature id for the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_DATA_ATTRIBUTE__DATA = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Potential Data Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POTENTIAL_DATA_ATTRIBUTE_FEATURE_COUNT = POTENTIAL_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl <em>Matrix Row</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getMatrixRow()
   * @generated
   */
  int MATRIX_ROW = 19;

  /**
   * The feature id for the '<em><b>R5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_ROW__R5 = 0;

  /**
   * The feature id for the '<em><b>R4</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_ROW__R4 = 1;

  /**
   * The feature id for the '<em><b>R3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_ROW__R3 = 2;

  /**
   * The feature id for the '<em><b>R2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_ROW__R2 = 3;

  /**
   * The feature id for the '<em><b>R1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_ROW__R1 = 4;

  /**
   * The number of structural features of the '<em>Matrix Row</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATRIX_ROW_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl <em>Potential Table Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.PotentialTableAttributeImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getPotentialTableAttribute()
   * @generated
   */
  int POTENTIAL_TABLE_ATTRIBUTE = 20;

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
  int MODEL_NODES_ATTRIBUTE = 21;

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
  int SAMPLES_ATTRIBUTE = 22;

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
  int MODEL_DATA_ATTRIBUTE = 23;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DATA_ATTRIBUTE__SEQUENCE = 0;

  /**
   * The number of structural features of the '<em>Model Data Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DATA_ATTRIBUTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ClassDefinitionImpl <em>Class Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ClassDefinitionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getClassDefinition()
   * @generated
   */
  int CLASS_DEFINITION = 24;

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
  int CLASS_INSTANCE = 26;

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
  int INPUT_BINDINGS = 27;

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
  int INPUT_BINDING = 28;

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
  int OUTPUT_BINDINGS = 29;

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
  int OUTPUT_BINDING = 30;

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
  int NODE_ATTRIBUTES = 31;

  /**
   * The number of structural features of the '<em>Node Attributes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ATTRIBUTES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ExpressionSequenceImpl <em>Expression Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ExpressionSequenceImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getExpressionSequence()
   * @generated
   */
  int EXPRESSION_SEQUENCE = 32;

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
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.ExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OP = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.assignmentOpExpressionImpl <em>assignment Op Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.assignmentOpExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getassignmentOpExpression()
   * @generated
   */
  int ASSIGNMENT_OP_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OP_EXPRESSION__OP = EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>assignment Op Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OP_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.orExpressionImpl <em>or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.orExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getorExpression()
   * @generated
   */
  int OR_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__OP = ASSIGNMENT_OP_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = ASSIGNMENT_OP_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.andExpressionImpl <em>and Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.andExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getandExpression()
   * @generated
   */
  int AND_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__OP = OR_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>and Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = OR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.relationalExpressionImpl <em>relational Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.relationalExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getrelationalExpression()
   * @generated
   */
  int RELATIONAL_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION__OP = AND_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>relational Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXPRESSION_FEATURE_COUNT = AND_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.additiveExpressionImpl <em>additive Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.additiveExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getadditiveExpression()
   * @generated
   */
  int ADDITIVE_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION__OP = RELATIONAL_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>additive Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXPRESSION_FEATURE_COUNT = RELATIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.multiplicativeExpressionImpl <em>multiplicative Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.multiplicativeExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getmultiplicativeExpression()
   * @generated
   */
  int MULTIPLICATIVE_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION__OP = ADDITIVE_EXPRESSION__OP;

  /**
   * The number of structural features of the '<em>multiplicative Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT = ADDITIVE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.unaryExpressionImpl <em>unary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.unaryExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getunaryExpression()
   * @generated
   */
  int UNARY_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__OP = MULTIPLICATIVE_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION__EXPR = MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>unary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_EXPRESSION_FEATURE_COUNT = MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.TermExpressionImpl <em>Term Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.TermExpressionImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getTermExpression()
   * @generated
   */
  int TERM_EXPRESSION = 42;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_EXPRESSION__OP = UNARY_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_EXPRESSION__EXPR = UNARY_EXPRESSION__EXPR;

  /**
   * The number of structural features of the '<em>Term Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.OperatorImpl <em>Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.OperatorImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 41;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__OP = TERM_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__EXPR = TERM_EXPRESSION__EXPR;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR__SEQUENCE = TERM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATOR_FEATURE_COUNT = TERM_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.TermLiteralImpl <em>Term Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.TermLiteralImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getTermLiteral()
   * @generated
   */
  int TERM_LITERAL = 43;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_LITERAL__OP = TERM_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_LITERAL__EXPR = TERM_EXPRESSION__EXPR;

  /**
   * The number of structural features of the '<em>Term Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_LITERAL_FEATURE_COUNT = TERM_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.IntegerLiteralImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 44;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__OP = POSITION_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__EXPR = POSITION_ATTRIBUTE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>X</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__X = POSITION_ATTRIBUTE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__Y = POSITION_ATTRIBUTE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = POSITION_ATTRIBUTE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = POSITION_ATTRIBUTE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.List5Impl <em>List5</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.List5Impl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList5()
   * @generated
   */
  int LIST5 = 45;

  /**
   * The feature id for the '<em><b>R5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST5__R5 = MATRIX_ROW__R5;

  /**
   * The feature id for the '<em><b>R4</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST5__R4 = MATRIX_ROW__R4;

  /**
   * The feature id for the '<em><b>R3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST5__R3 = MATRIX_ROW__R3;

  /**
   * The feature id for the '<em><b>R2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST5__R2 = MATRIX_ROW__R2;

  /**
   * The feature id for the '<em><b>R1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST5__R1 = MATRIX_ROW__R1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST5__LIST = MATRIX_ROW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List5</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST5_FEATURE_COUNT = MATRIX_ROW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.List4Impl <em>List4</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.List4Impl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList4()
   * @generated
   */
  int LIST4 = 46;

  /**
   * The feature id for the '<em><b>R5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST4__R5 = MATRIX_ROW__R5;

  /**
   * The feature id for the '<em><b>R4</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST4__R4 = MATRIX_ROW__R4;

  /**
   * The feature id for the '<em><b>R3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST4__R3 = MATRIX_ROW__R3;

  /**
   * The feature id for the '<em><b>R2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST4__R2 = MATRIX_ROW__R2;

  /**
   * The feature id for the '<em><b>R1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST4__R1 = MATRIX_ROW__R1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST4__LIST = MATRIX_ROW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List4</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST4_FEATURE_COUNT = MATRIX_ROW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.List3Impl <em>List3</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.List3Impl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList3()
   * @generated
   */
  int LIST3 = 47;

  /**
   * The feature id for the '<em><b>R5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST3__R5 = MATRIX_ROW__R5;

  /**
   * The feature id for the '<em><b>R4</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST3__R4 = MATRIX_ROW__R4;

  /**
   * The feature id for the '<em><b>R3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST3__R3 = MATRIX_ROW__R3;

  /**
   * The feature id for the '<em><b>R2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST3__R2 = MATRIX_ROW__R2;

  /**
   * The feature id for the '<em><b>R1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST3__R1 = MATRIX_ROW__R1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST3__LIST = MATRIX_ROW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List3</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST3_FEATURE_COUNT = MATRIX_ROW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.List2Impl <em>List2</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.List2Impl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList2()
   * @generated
   */
  int LIST2 = 48;

  /**
   * The feature id for the '<em><b>R5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST2__R5 = MATRIX_ROW__R5;

  /**
   * The feature id for the '<em><b>R4</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST2__R4 = MATRIX_ROW__R4;

  /**
   * The feature id for the '<em><b>R3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST2__R3 = MATRIX_ROW__R3;

  /**
   * The feature id for the '<em><b>R2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST2__R2 = MATRIX_ROW__R2;

  /**
   * The feature id for the '<em><b>R1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST2__R1 = MATRIX_ROW__R1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST2__LIST = MATRIX_ROW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List2</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST2_FEATURE_COUNT = MATRIX_ROW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.List1Impl <em>List1</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.List1Impl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList1()
   * @generated
   */
  int LIST1 = 49;

  /**
   * The feature id for the '<em><b>R5</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST1__R5 = MATRIX_ROW__R5;

  /**
   * The feature id for the '<em><b>R4</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST1__R4 = MATRIX_ROW__R4;

  /**
   * The feature id for the '<em><b>R3</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST1__R3 = MATRIX_ROW__R3;

  /**
   * The feature id for the '<em><b>R2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST1__R2 = MATRIX_ROW__R2;

  /**
   * The feature id for the '<em><b>R1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST1__R1 = MATRIX_ROW__R1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST1__ITEMS = MATRIX_ROW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List1</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST1_FEATURE_COUNT = MATRIX_ROW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.AssignmentImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 50;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__OP = EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.AssignmentOpImpl <em>Assignment Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.AssignmentOpImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAssignmentOp()
   * @generated
   */
  int ASSIGNMENT_OP = 51;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OP__OP = ASSIGNMENT_OP_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OP__LEFT = ASSIGNMENT_OP_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OP__RIGHT = ASSIGNMENT_OP_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assignment Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_OP_FEATURE_COUNT = ASSIGNMENT_OP_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.OrExpImpl <em>Or Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.OrExpImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getOrExp()
   * @generated
   */
  int OR_EXP = 52;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__OP = OR_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__LEFT = OR_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP__RIGHT = OR_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXP_FEATURE_COUNT = OR_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.AndExpImpl <em>And Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.AndExpImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAndExp()
   * @generated
   */
  int AND_EXP = 53;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__OP = AND_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__LEFT = AND_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP__RIGHT = AND_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXP_FEATURE_COUNT = AND_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.RelationalExpImpl <em>Relational Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.RelationalExpImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getRelationalExp()
   * @generated
   */
  int RELATIONAL_EXP = 54;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXP__OP = RELATIONAL_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXP__LEFT = RELATIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXP__RIGHT = RELATIONAL_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Relational Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONAL_EXP_FEATURE_COUNT = RELATIONAL_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.AdditiveExpImpl <em>Additive Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.AdditiveExpImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAdditiveExp()
   * @generated
   */
  int ADDITIVE_EXP = 55;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXP__OP = ADDITIVE_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXP__LEFT = ADDITIVE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXP__RIGHT = ADDITIVE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Additive Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDITIVE_EXP_FEATURE_COUNT = ADDITIVE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.MultiplicativeExpImpl <em>Multiplicative Exp</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.MultiplicativeExpImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getMultiplicativeExp()
   * @generated
   */
  int MULTIPLICATIVE_EXP = 56;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXP__OP = MULTIPLICATIVE_EXPRESSION__OP;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXP__LEFT = MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXP__RIGHT = MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multiplicative Exp</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATIVE_EXP_FEATURE_COUNT = MULTIPLICATIVE_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.VarRefImpl <em>Var Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.VarRefImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getVarRef()
   * @generated
   */
  int VAR_REF = 57;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF__OP = TERM_LITERAL__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF__EXPR = TERM_LITERAL__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF__VALUE = TERM_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Var Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_REF_FEATURE_COUNT = TERM_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.BooleanLiteralImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 58;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__OP = TERM_LITERAL__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__EXPR = TERM_LITERAL__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = TERM_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = TERM_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.StringLiteralImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 59;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__OP = TERM_LITERAL__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__EXPR = TERM_LITERAL__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = TERM_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = TERM_LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.certware.evidence.hugin.netDSL.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.evidence.hugin.netDSL.impl.DoubleLiteralImpl
   * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDoubleLiteral()
   * @generated
   */
  int DOUBLE_LITERAL = 60;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__OP = TERM_LITERAL__OP;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__EXPR = TERM_LITERAL__EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__VALUE = TERM_LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL_FEATURE_COUNT = TERM_LITERAL_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Integer <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer</em>'.
   * @see net.certware.evidence.hugin.netDSL.Integer
   * @generated
   */
  EClass getInteger();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.Integer#getI <em>I</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>I</em>'.
   * @see net.certware.evidence.hugin.netDSL.Integer#getI()
   * @see #getInteger()
   * @generated
   */
  EAttribute getInteger_I();

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
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getData <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data</em>'.
   * @see net.certware.evidence.hugin.netDSL.PotentialDataAttribute#getData()
   * @see #getPotentialDataAttribute()
   * @generated
   */
  EReference getPotentialDataAttribute_Data();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.MatrixRow <em>Matrix Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Matrix Row</em>'.
   * @see net.certware.evidence.hugin.netDSL.MatrixRow
   * @generated
   */
  EClass getMatrixRow();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR5 <em>R5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>R5</em>'.
   * @see net.certware.evidence.hugin.netDSL.MatrixRow#getR5()
   * @see #getMatrixRow()
   * @generated
   */
  EReference getMatrixRow_R5();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR4 <em>R4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>R4</em>'.
   * @see net.certware.evidence.hugin.netDSL.MatrixRow#getR4()
   * @see #getMatrixRow()
   * @generated
   */
  EReference getMatrixRow_R4();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR3 <em>R3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>R3</em>'.
   * @see net.certware.evidence.hugin.netDSL.MatrixRow#getR3()
   * @see #getMatrixRow()
   * @generated
   */
  EReference getMatrixRow_R3();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR2 <em>R2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>R2</em>'.
   * @see net.certware.evidence.hugin.netDSL.MatrixRow#getR2()
   * @see #getMatrixRow()
   * @generated
   */
  EReference getMatrixRow_R2();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.MatrixRow#getR1 <em>R1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>R1</em>'.
   * @see net.certware.evidence.hugin.netDSL.MatrixRow#getR1()
   * @see #getMatrixRow()
   * @generated
   */
  EReference getMatrixRow_R1();

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
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.ModelDataAttribute#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see net.certware.evidence.hugin.netDSL.ModelDataAttribute#getSequence()
   * @see #getModelDataAttribute()
   * @generated
   */
  EReference getModelDataAttribute_Sequence();

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
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.Expression#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see net.certware.evidence.hugin.netDSL.Expression#getOp()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Op();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.assignmentOpExpression <em>assignment Op Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assignment Op Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.assignmentOpExpression
   * @generated
   */
  EClass getassignmentOpExpression();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.orExpression <em>or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>or Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.orExpression
   * @generated
   */
  EClass getorExpression();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.andExpression <em>and Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>and Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.andExpression
   * @generated
   */
  EClass getandExpression();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.relationalExpression <em>relational Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>relational Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.relationalExpression
   * @generated
   */
  EClass getrelationalExpression();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.additiveExpression <em>additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>additive Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.additiveExpression
   * @generated
   */
  EClass getadditiveExpression();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.multiplicativeExpression <em>multiplicative Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>multiplicative Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.multiplicativeExpression
   * @generated
   */
  EClass getmultiplicativeExpression();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.unaryExpression <em>unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>unary Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.unaryExpression
   * @generated
   */
  EClass getunaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.unaryExpression#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.certware.evidence.hugin.netDSL.unaryExpression#getExpr()
   * @see #getunaryExpression()
   * @generated
   */
  EReference getunaryExpression_Expr();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operator</em>'.
   * @see net.certware.evidence.hugin.netDSL.Operator
   * @generated
   */
  EClass getOperator();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Operator#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence</em>'.
   * @see net.certware.evidence.hugin.netDSL.Operator#getSequence()
   * @see #getOperator()
   * @generated
   */
  EReference getOperator_Sequence();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.TermExpression <em>Term Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Expression</em>'.
   * @see net.certware.evidence.hugin.netDSL.TermExpression
   * @generated
   */
  EClass getTermExpression();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.TermLiteral <em>Term Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Literal</em>'.
   * @see net.certware.evidence.hugin.netDSL.TermLiteral
   * @generated
   */
  EClass getTermLiteral();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see net.certware.evidence.hugin.netDSL.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>X</em>'.
   * @see net.certware.evidence.hugin.netDSL.IntegerLiteral#getX()
   * @see #getIntegerLiteral()
   * @generated
   */
  EReference getIntegerLiteral_X();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Y</em>'.
   * @see net.certware.evidence.hugin.netDSL.IntegerLiteral#getY()
   * @see #getIntegerLiteral()
   * @generated
   */
  EReference getIntegerLiteral_Y();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.List5 <em>List5</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List5</em>'.
   * @see net.certware.evidence.hugin.netDSL.List5
   * @generated
   */
  EClass getList5();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.List5#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see net.certware.evidence.hugin.netDSL.List5#getList()
   * @see #getList5()
   * @generated
   */
  EReference getList5_List();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.List4 <em>List4</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List4</em>'.
   * @see net.certware.evidence.hugin.netDSL.List4
   * @generated
   */
  EClass getList4();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.List4#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see net.certware.evidence.hugin.netDSL.List4#getList()
   * @see #getList4()
   * @generated
   */
  EReference getList4_List();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.List3 <em>List3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List3</em>'.
   * @see net.certware.evidence.hugin.netDSL.List3
   * @generated
   */
  EClass getList3();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.List3#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see net.certware.evidence.hugin.netDSL.List3#getList()
   * @see #getList3()
   * @generated
   */
  EReference getList3_List();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.List2 <em>List2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List2</em>'.
   * @see net.certware.evidence.hugin.netDSL.List2
   * @generated
   */
  EClass getList2();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.List2#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see net.certware.evidence.hugin.netDSL.List2#getList()
   * @see #getList2()
   * @generated
   */
  EReference getList2_List();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.List1 <em>List1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List1</em>'.
   * @see net.certware.evidence.hugin.netDSL.List1
   * @generated
   */
  EClass getList1();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.evidence.hugin.netDSL.List1#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see net.certware.evidence.hugin.netDSL.List1#getItems()
   * @see #getList1()
   * @generated
   */
  EReference getList1_Items();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see net.certware.evidence.hugin.netDSL.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Assignment#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.evidence.hugin.netDSL.Assignment#getLeft()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.Assignment#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.evidence.hugin.netDSL.Assignment#getRight()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Right();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.AssignmentOp <em>Assignment Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Op</em>'.
   * @see net.certware.evidence.hugin.netDSL.AssignmentOp
   * @generated
   */
  EClass getAssignmentOp();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.AssignmentOp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.evidence.hugin.netDSL.AssignmentOp#getLeft()
   * @see #getAssignmentOp()
   * @generated
   */
  EReference getAssignmentOp_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.AssignmentOp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.evidence.hugin.netDSL.AssignmentOp#getRight()
   * @see #getAssignmentOp()
   * @generated
   */
  EReference getAssignmentOp_Right();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.OrExp <em>Or Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Exp</em>'.
   * @see net.certware.evidence.hugin.netDSL.OrExp
   * @generated
   */
  EClass getOrExp();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.OrExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.evidence.hugin.netDSL.OrExp#getLeft()
   * @see #getOrExp()
   * @generated
   */
  EReference getOrExp_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.OrExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.evidence.hugin.netDSL.OrExp#getRight()
   * @see #getOrExp()
   * @generated
   */
  EReference getOrExp_Right();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.AndExp <em>And Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Exp</em>'.
   * @see net.certware.evidence.hugin.netDSL.AndExp
   * @generated
   */
  EClass getAndExp();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.AndExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.evidence.hugin.netDSL.AndExp#getLeft()
   * @see #getAndExp()
   * @generated
   */
  EReference getAndExp_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.AndExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.evidence.hugin.netDSL.AndExp#getRight()
   * @see #getAndExp()
   * @generated
   */
  EReference getAndExp_Right();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.RelationalExp <em>Relational Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relational Exp</em>'.
   * @see net.certware.evidence.hugin.netDSL.RelationalExp
   * @generated
   */
  EClass getRelationalExp();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.RelationalExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.evidence.hugin.netDSL.RelationalExp#getLeft()
   * @see #getRelationalExp()
   * @generated
   */
  EReference getRelationalExp_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.RelationalExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.evidence.hugin.netDSL.RelationalExp#getRight()
   * @see #getRelationalExp()
   * @generated
   */
  EReference getRelationalExp_Right();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.AdditiveExp <em>Additive Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Exp</em>'.
   * @see net.certware.evidence.hugin.netDSL.AdditiveExp
   * @generated
   */
  EClass getAdditiveExp();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.AdditiveExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.evidence.hugin.netDSL.AdditiveExp#getLeft()
   * @see #getAdditiveExp()
   * @generated
   */
  EReference getAdditiveExp_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.AdditiveExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.evidence.hugin.netDSL.AdditiveExp#getRight()
   * @see #getAdditiveExp()
   * @generated
   */
  EReference getAdditiveExp_Right();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.MultiplicativeExp <em>Multiplicative Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Exp</em>'.
   * @see net.certware.evidence.hugin.netDSL.MultiplicativeExp
   * @generated
   */
  EClass getMultiplicativeExp();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.MultiplicativeExp#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.certware.evidence.hugin.netDSL.MultiplicativeExp#getLeft()
   * @see #getMultiplicativeExp()
   * @generated
   */
  EReference getMultiplicativeExp_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.evidence.hugin.netDSL.MultiplicativeExp#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.certware.evidence.hugin.netDSL.MultiplicativeExp#getRight()
   * @see #getMultiplicativeExp()
   * @generated
   */
  EReference getMultiplicativeExp_Right();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.VarRef <em>Var Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Ref</em>'.
   * @see net.certware.evidence.hugin.netDSL.VarRef
   * @generated
   */
  EClass getVarRef();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.VarRef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.VarRef#getValue()
   * @see #getVarRef()
   * @generated
   */
  EAttribute getVarRef_Value();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see net.certware.evidence.hugin.netDSL.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.BooleanLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.BooleanLiteral#isValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see net.certware.evidence.hugin.netDSL.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link net.certware.evidence.hugin.netDSL.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Literal</em>'.
   * @see net.certware.evidence.hugin.netDSL.DoubleLiteral
   * @generated
   */
  EClass getDoubleLiteral();

  /**
   * Returns the meta object for the attribute '{@link net.certware.evidence.hugin.netDSL.DoubleLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.certware.evidence.hugin.netDSL.DoubleLiteral#getValue()
   * @see #getDoubleLiteral()
   * @generated
   */
  EAttribute getDoubleLiteral_Value();

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
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.IntegerImpl <em>Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.IntegerImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getInteger()
     * @generated
     */
    EClass INTEGER = eINSTANCE.getInteger();

    /**
     * The meta object literal for the '<em><b>I</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER__I = eINSTANCE.getInteger_I();

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
     * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POTENTIAL_DATA_ATTRIBUTE__DATA = eINSTANCE.getPotentialDataAttribute_Data();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl <em>Matrix Row</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getMatrixRow()
     * @generated
     */
    EClass MATRIX_ROW = eINSTANCE.getMatrixRow();

    /**
     * The meta object literal for the '<em><b>R5</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX_ROW__R5 = eINSTANCE.getMatrixRow_R5();

    /**
     * The meta object literal for the '<em><b>R4</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX_ROW__R4 = eINSTANCE.getMatrixRow_R4();

    /**
     * The meta object literal for the '<em><b>R3</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX_ROW__R3 = eINSTANCE.getMatrixRow_R3();

    /**
     * The meta object literal for the '<em><b>R2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX_ROW__R2 = eINSTANCE.getMatrixRow_R2();

    /**
     * The meta object literal for the '<em><b>R1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATRIX_ROW__R1 = eINSTANCE.getMatrixRow_R1();

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
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_DATA_ATTRIBUTE__SEQUENCE = eINSTANCE.getModelDataAttribute_Sequence();

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
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OP = eINSTANCE.getExpression_Op();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.assignmentOpExpressionImpl <em>assignment Op Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.assignmentOpExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getassignmentOpExpression()
     * @generated
     */
    EClass ASSIGNMENT_OP_EXPRESSION = eINSTANCE.getassignmentOpExpression();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.orExpressionImpl <em>or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.orExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getorExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getorExpression();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.andExpressionImpl <em>and Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.andExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getandExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getandExpression();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.relationalExpressionImpl <em>relational Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.relationalExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getrelationalExpression()
     * @generated
     */
    EClass RELATIONAL_EXPRESSION = eINSTANCE.getrelationalExpression();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.additiveExpressionImpl <em>additive Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.additiveExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getadditiveExpression()
     * @generated
     */
    EClass ADDITIVE_EXPRESSION = eINSTANCE.getadditiveExpression();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.multiplicativeExpressionImpl <em>multiplicative Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.multiplicativeExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getmultiplicativeExpression()
     * @generated
     */
    EClass MULTIPLICATIVE_EXPRESSION = eINSTANCE.getmultiplicativeExpression();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.unaryExpressionImpl <em>unary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.unaryExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getunaryExpression()
     * @generated
     */
    EClass UNARY_EXPRESSION = eINSTANCE.getunaryExpression();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_EXPRESSION__EXPR = eINSTANCE.getunaryExpression_Expr();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.OperatorImpl <em>Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.OperatorImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getOperator()
     * @generated
     */
    EClass OPERATOR = eINSTANCE.getOperator();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATOR__SEQUENCE = eINSTANCE.getOperator_Sequence();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.TermExpressionImpl <em>Term Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.TermExpressionImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getTermExpression()
     * @generated
     */
    EClass TERM_EXPRESSION = eINSTANCE.getTermExpression();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.TermLiteralImpl <em>Term Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.TermLiteralImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getTermLiteral()
     * @generated
     */
    EClass TERM_LITERAL = eINSTANCE.getTermLiteral();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.IntegerLiteralImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>X</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_LITERAL__X = eINSTANCE.getIntegerLiteral_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTEGER_LITERAL__Y = eINSTANCE.getIntegerLiteral_Y();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.List5Impl <em>List5</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.List5Impl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList5()
     * @generated
     */
    EClass LIST5 = eINSTANCE.getList5();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST5__LIST = eINSTANCE.getList5_List();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.List4Impl <em>List4</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.List4Impl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList4()
     * @generated
     */
    EClass LIST4 = eINSTANCE.getList4();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST4__LIST = eINSTANCE.getList4_List();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.List3Impl <em>List3</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.List3Impl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList3()
     * @generated
     */
    EClass LIST3 = eINSTANCE.getList3();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST3__LIST = eINSTANCE.getList3_List();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.List2Impl <em>List2</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.List2Impl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList2()
     * @generated
     */
    EClass LIST2 = eINSTANCE.getList2();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST2__LIST = eINSTANCE.getList2_List();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.List1Impl <em>List1</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.List1Impl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getList1()
     * @generated
     */
    EClass LIST1 = eINSTANCE.getList1();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST1__ITEMS = eINSTANCE.getList1_Items();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.AssignmentImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__LEFT = eINSTANCE.getAssignment_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT__RIGHT = eINSTANCE.getAssignment_Right();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.AssignmentOpImpl <em>Assignment Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.AssignmentOpImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAssignmentOp()
     * @generated
     */
    EClass ASSIGNMENT_OP = eINSTANCE.getAssignmentOp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_OP__LEFT = eINSTANCE.getAssignmentOp_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_OP__RIGHT = eINSTANCE.getAssignmentOp_Right();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.OrExpImpl <em>Or Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.OrExpImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getOrExp()
     * @generated
     */
    EClass OR_EXP = eINSTANCE.getOrExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXP__LEFT = eINSTANCE.getOrExp_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXP__RIGHT = eINSTANCE.getOrExp_Right();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.AndExpImpl <em>And Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.AndExpImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAndExp()
     * @generated
     */
    EClass AND_EXP = eINSTANCE.getAndExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXP__LEFT = eINSTANCE.getAndExp_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXP__RIGHT = eINSTANCE.getAndExp_Right();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.RelationalExpImpl <em>Relational Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.RelationalExpImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getRelationalExp()
     * @generated
     */
    EClass RELATIONAL_EXP = eINSTANCE.getRelationalExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXP__LEFT = eINSTANCE.getRelationalExp_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONAL_EXP__RIGHT = eINSTANCE.getRelationalExp_Right();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.AdditiveExpImpl <em>Additive Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.AdditiveExpImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getAdditiveExp()
     * @generated
     */
    EClass ADDITIVE_EXP = eINSTANCE.getAdditiveExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXP__LEFT = eINSTANCE.getAdditiveExp_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADDITIVE_EXP__RIGHT = eINSTANCE.getAdditiveExp_Right();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.MultiplicativeExpImpl <em>Multiplicative Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.MultiplicativeExpImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getMultiplicativeExp()
     * @generated
     */
    EClass MULTIPLICATIVE_EXP = eINSTANCE.getMultiplicativeExp();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXP__LEFT = eINSTANCE.getMultiplicativeExp_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATIVE_EXP__RIGHT = eINSTANCE.getMultiplicativeExp_Right();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.VarRefImpl <em>Var Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.VarRefImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getVarRef()
     * @generated
     */
    EClass VAR_REF = eINSTANCE.getVarRef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_REF__VALUE = eINSTANCE.getVarRef_Value();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.BooleanLiteralImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.StringLiteralImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link net.certware.evidence.hugin.netDSL.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.evidence.hugin.netDSL.impl.DoubleLiteralImpl
     * @see net.certware.evidence.hugin.netDSL.impl.NetDSLPackageImpl#getDoubleLiteral()
     * @generated
     */
    EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_LITERAL__VALUE = eINSTANCE.getDoubleLiteral_Value();

  }

} //NetDSLPackage
