/**
 */
package net.certware.intent.intentSpecification;

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
 * @see net.certware.intent.intentSpecification.IntentSpecificationFactory
 * @model kind="package"
 * @generated
 */
public interface IntentSpecificationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "intentSpecification";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.certware.net/intent/IntentSpecification";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "intentSpecification";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IntentSpecificationPackage eINSTANCE = net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl.init();

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.SpecificationImpl <em>Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.SpecificationImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getSpecification()
   * @generated
   */
  int SPECIFICATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Refinements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION__REFINEMENTS = 1;

  /**
   * The number of structural features of the '<em>Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFICATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.RefinementImpl <em>Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.RefinementImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getRefinement()
   * @generated
   */
  int REFINEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT__DESC = 1;

  /**
   * The feature id for the '<em><b>Intents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT__INTENTS = 2;

  /**
   * The number of structural features of the '<em>Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.IntentImpl <em>Intent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.IntentImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getIntent()
   * @generated
   */
  int INTENT = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__DESC = 2;

  /**
   * The feature id for the '<em><b>Decompositions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__DECOMPOSITIONS = 3;

  /**
   * The number of structural features of the '<em>Intent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.IntentTypeImpl <em>Intent Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.IntentTypeImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getIntentType()
   * @generated
   */
  int INTENT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT_TYPE__TYPE_NAME = 0;

  /**
   * The number of structural features of the '<em>Intent Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.DecompositionImpl <em>Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.DecompositionImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDecomposition()
   * @generated
   */
  int DECOMPOSITION = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__NAME = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__DESC = 2;

  /**
   * The feature id for the '<em><b>Documents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__DOCUMENTS = 3;

  /**
   * The feature id for the '<em><b>Models</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__MODELS = 4;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION__ITEMS = 5;

  /**
   * The number of structural features of the '<em>Decomposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.DecompositionTypeImpl <em>Decomposition Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.DecompositionTypeImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDecompositionType()
   * @generated
   */
  int DECOMPOSITION_TYPE = 5;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_TYPE__TYPE_NAME = 0;

  /**
   * The number of structural features of the '<em>Decomposition Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECOMPOSITION_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.DocumentImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 6;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.DocItemTypeImpl <em>Doc Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.DocItemTypeImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDocItemType()
   * @generated
   */
  int DOC_ITEM_TYPE = 7;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_ITEM_TYPE__TYPE_NAME = 0;

  /**
   * The number of structural features of the '<em>Doc Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_ITEM_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.DocItemImpl <em>Doc Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.DocItemImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDocItem()
   * @generated
   */
  int DOC_ITEM = 8;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_ITEM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_ITEM__NAME = 1;

  /**
   * The feature id for the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_ITEM__REF = 2;

  /**
   * The number of structural features of the '<em>Doc Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOC_ITEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.ModelTypeImpl <em>Model Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.ModelTypeImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getModelType()
   * @generated
   */
  int MODEL_TYPE = 9;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE__TYPE_NAME = 0;

  /**
   * The number of structural features of the '<em>Model Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.ModelItemImpl <em>Model Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.ModelItemImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getModelItem()
   * @generated
   */
  int MODEL_ITEM = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ITEM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ITEM__NAME = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ITEM__DESC = 2;

  /**
   * The number of structural features of the '<em>Model Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_ITEM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.ListItemTypeImpl <em>List Item Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.ListItemTypeImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getListItemType()
   * @generated
   */
  int LIST_ITEM_TYPE = 11;

  /**
   * The feature id for the '<em><b>Type Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM_TYPE__TYPE_NAME = 0;

  /**
   * The number of structural features of the '<em>List Item Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.certware.intent.intentSpecification.impl.ListItemImpl <em>List Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.certware.intent.intentSpecification.impl.ListItemImpl
   * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getListItem()
   * @generated
   */
  int LIST_ITEM = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM__NAME = 1;

  /**
   * The feature id for the '<em><b>Desc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM__DESC = 2;

  /**
   * The feature id for the '<em><b>Doc References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM__DOC_REFERENCES = 3;

  /**
   * The feature id for the '<em><b>Item References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM__ITEM_REFERENCES = 4;

  /**
   * The feature id for the '<em><b>Model References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM__MODEL_REFERENCES = 5;

  /**
   * The number of structural features of the '<em>List Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ITEM_FEATURE_COUNT = 6;


  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specification</em>'.
   * @see net.certware.intent.intentSpecification.Specification
   * @generated
   */
  EClass getSpecification();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.Specification#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.intentSpecification.Specification#getName()
   * @see #getSpecification()
   * @generated
   */
  EAttribute getSpecification_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.intentSpecification.Specification#getRefinements <em>Refinements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refinements</em>'.
   * @see net.certware.intent.intentSpecification.Specification#getRefinements()
   * @see #getSpecification()
   * @generated
   */
  EReference getSpecification_Refinements();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.Refinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refinement</em>'.
   * @see net.certware.intent.intentSpecification.Refinement
   * @generated
   */
  EClass getRefinement();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.Refinement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.intentSpecification.Refinement#getName()
   * @see #getRefinement()
   * @generated
   */
  EAttribute getRefinement_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.Refinement#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.intent.intentSpecification.Refinement#getDesc()
   * @see #getRefinement()
   * @generated
   */
  EAttribute getRefinement_Desc();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.intentSpecification.Refinement#getIntents <em>Intents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Intents</em>'.
   * @see net.certware.intent.intentSpecification.Refinement#getIntents()
   * @see #getRefinement()
   * @generated
   */
  EReference getRefinement_Intents();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.Intent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intent</em>'.
   * @see net.certware.intent.intentSpecification.Intent
   * @generated
   */
  EClass getIntent();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.intentSpecification.Intent#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.certware.intent.intentSpecification.Intent#getType()
   * @see #getIntent()
   * @generated
   */
  EReference getIntent_Type();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.Intent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.intentSpecification.Intent#getName()
   * @see #getIntent()
   * @generated
   */
  EAttribute getIntent_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.Intent#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.intent.intentSpecification.Intent#getDesc()
   * @see #getIntent()
   * @generated
   */
  EAttribute getIntent_Desc();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.intentSpecification.Intent#getDecompositions <em>Decompositions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decompositions</em>'.
   * @see net.certware.intent.intentSpecification.Intent#getDecompositions()
   * @see #getIntent()
   * @generated
   */
  EReference getIntent_Decompositions();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.IntentType <em>Intent Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intent Type</em>'.
   * @see net.certware.intent.intentSpecification.IntentType
   * @generated
   */
  EClass getIntentType();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.IntentType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see net.certware.intent.intentSpecification.IntentType#getTypeName()
   * @see #getIntentType()
   * @generated
   */
  EAttribute getIntentType_TypeName();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.Decomposition <em>Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposition</em>'.
   * @see net.certware.intent.intentSpecification.Decomposition
   * @generated
   */
  EClass getDecomposition();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.intentSpecification.Decomposition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.certware.intent.intentSpecification.Decomposition#getType()
   * @see #getDecomposition()
   * @generated
   */
  EReference getDecomposition_Type();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.Decomposition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.intentSpecification.Decomposition#getName()
   * @see #getDecomposition()
   * @generated
   */
  EAttribute getDecomposition_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.Decomposition#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.intent.intentSpecification.Decomposition#getDesc()
   * @see #getDecomposition()
   * @generated
   */
  EAttribute getDecomposition_Desc();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.intentSpecification.Decomposition#getDocuments <em>Documents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Documents</em>'.
   * @see net.certware.intent.intentSpecification.Decomposition#getDocuments()
   * @see #getDecomposition()
   * @generated
   */
  EReference getDecomposition_Documents();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.intentSpecification.Decomposition#getModels <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Models</em>'.
   * @see net.certware.intent.intentSpecification.Decomposition#getModels()
   * @see #getDecomposition()
   * @generated
   */
  EReference getDecomposition_Models();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.intentSpecification.Decomposition#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see net.certware.intent.intentSpecification.Decomposition#getItems()
   * @see #getDecomposition()
   * @generated
   */
  EReference getDecomposition_Items();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.DecompositionType <em>Decomposition Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decomposition Type</em>'.
   * @see net.certware.intent.intentSpecification.DecompositionType
   * @generated
   */
  EClass getDecompositionType();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.DecompositionType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see net.certware.intent.intentSpecification.DecompositionType#getTypeName()
   * @see #getDecompositionType()
   * @generated
   */
  EAttribute getDecompositionType_TypeName();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see net.certware.intent.intentSpecification.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the containment reference list '{@link net.certware.intent.intentSpecification.Document#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see net.certware.intent.intentSpecification.Document#getEntries()
   * @see #getDocument()
   * @generated
   */
  EReference getDocument_Entries();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.DocItemType <em>Doc Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doc Item Type</em>'.
   * @see net.certware.intent.intentSpecification.DocItemType
   * @generated
   */
  EClass getDocItemType();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.DocItemType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see net.certware.intent.intentSpecification.DocItemType#getTypeName()
   * @see #getDocItemType()
   * @generated
   */
  EAttribute getDocItemType_TypeName();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.DocItem <em>Doc Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Doc Item</em>'.
   * @see net.certware.intent.intentSpecification.DocItem
   * @generated
   */
  EClass getDocItem();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.intentSpecification.DocItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.certware.intent.intentSpecification.DocItem#getType()
   * @see #getDocItem()
   * @generated
   */
  EReference getDocItem_Type();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.DocItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.intentSpecification.DocItem#getName()
   * @see #getDocItem()
   * @generated
   */
  EAttribute getDocItem_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.DocItem#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ref</em>'.
   * @see net.certware.intent.intentSpecification.DocItem#getRef()
   * @see #getDocItem()
   * @generated
   */
  EAttribute getDocItem_Ref();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.ModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Type</em>'.
   * @see net.certware.intent.intentSpecification.ModelType
   * @generated
   */
  EClass getModelType();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.ModelType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see net.certware.intent.intentSpecification.ModelType#getTypeName()
   * @see #getModelType()
   * @generated
   */
  EAttribute getModelType_TypeName();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.ModelItem <em>Model Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Item</em>'.
   * @see net.certware.intent.intentSpecification.ModelItem
   * @generated
   */
  EClass getModelItem();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.intentSpecification.ModelItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.certware.intent.intentSpecification.ModelItem#getType()
   * @see #getModelItem()
   * @generated
   */
  EReference getModelItem_Type();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.ModelItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.intentSpecification.ModelItem#getName()
   * @see #getModelItem()
   * @generated
   */
  EAttribute getModelItem_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.ModelItem#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.intent.intentSpecification.ModelItem#getDesc()
   * @see #getModelItem()
   * @generated
   */
  EAttribute getModelItem_Desc();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.ListItemType <em>List Item Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Item Type</em>'.
   * @see net.certware.intent.intentSpecification.ListItemType
   * @generated
   */
  EClass getListItemType();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.ListItemType#getTypeName <em>Type Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type Name</em>'.
   * @see net.certware.intent.intentSpecification.ListItemType#getTypeName()
   * @see #getListItemType()
   * @generated
   */
  EAttribute getListItemType_TypeName();

  /**
   * Returns the meta object for class '{@link net.certware.intent.intentSpecification.ListItem <em>List Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Item</em>'.
   * @see net.certware.intent.intentSpecification.ListItem
   * @generated
   */
  EClass getListItem();

  /**
   * Returns the meta object for the containment reference '{@link net.certware.intent.intentSpecification.ListItem#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.certware.intent.intentSpecification.ListItem#getType()
   * @see #getListItem()
   * @generated
   */
  EReference getListItem_Type();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.ListItem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.certware.intent.intentSpecification.ListItem#getName()
   * @see #getListItem()
   * @generated
   */
  EAttribute getListItem_Name();

  /**
   * Returns the meta object for the attribute '{@link net.certware.intent.intentSpecification.ListItem#getDesc <em>Desc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Desc</em>'.
   * @see net.certware.intent.intentSpecification.ListItem#getDesc()
   * @see #getListItem()
   * @generated
   */
  EAttribute getListItem_Desc();

  /**
   * Returns the meta object for the reference list '{@link net.certware.intent.intentSpecification.ListItem#getDocReferences <em>Doc References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Doc References</em>'.
   * @see net.certware.intent.intentSpecification.ListItem#getDocReferences()
   * @see #getListItem()
   * @generated
   */
  EReference getListItem_DocReferences();

  /**
   * Returns the meta object for the reference list '{@link net.certware.intent.intentSpecification.ListItem#getItemReferences <em>Item References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Item References</em>'.
   * @see net.certware.intent.intentSpecification.ListItem#getItemReferences()
   * @see #getListItem()
   * @generated
   */
  EReference getListItem_ItemReferences();

  /**
   * Returns the meta object for the reference list '{@link net.certware.intent.intentSpecification.ListItem#getModelReferences <em>Model References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Model References</em>'.
   * @see net.certware.intent.intentSpecification.ListItem#getModelReferences()
   * @see #getListItem()
   * @generated
   */
  EReference getListItem_ModelReferences();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IntentSpecificationFactory getIntentSpecificationFactory();

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
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.SpecificationImpl <em>Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.SpecificationImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getSpecification()
     * @generated
     */
    EClass SPECIFICATION = eINSTANCE.getSpecification();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

    /**
     * The meta object literal for the '<em><b>Refinements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFICATION__REFINEMENTS = eINSTANCE.getSpecification_Refinements();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.RefinementImpl <em>Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.RefinementImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getRefinement()
     * @generated
     */
    EClass REFINEMENT = eINSTANCE.getRefinement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFINEMENT__NAME = eINSTANCE.getRefinement_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFINEMENT__DESC = eINSTANCE.getRefinement_Desc();

    /**
     * The meta object literal for the '<em><b>Intents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINEMENT__INTENTS = eINSTANCE.getRefinement_Intents();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.IntentImpl <em>Intent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.IntentImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getIntent()
     * @generated
     */
    EClass INTENT = eINSTANCE.getIntent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENT__TYPE = eINSTANCE.getIntent_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENT__NAME = eINSTANCE.getIntent_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENT__DESC = eINSTANCE.getIntent_Desc();

    /**
     * The meta object literal for the '<em><b>Decompositions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENT__DECOMPOSITIONS = eINSTANCE.getIntent_Decompositions();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.IntentTypeImpl <em>Intent Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.IntentTypeImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getIntentType()
     * @generated
     */
    EClass INTENT_TYPE = eINSTANCE.getIntentType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTENT_TYPE__TYPE_NAME = eINSTANCE.getIntentType_TypeName();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.DecompositionImpl <em>Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.DecompositionImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDecomposition()
     * @generated
     */
    EClass DECOMPOSITION = eINSTANCE.getDecomposition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSITION__TYPE = eINSTANCE.getDecomposition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECOMPOSITION__NAME = eINSTANCE.getDecomposition_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECOMPOSITION__DESC = eINSTANCE.getDecomposition_Desc();

    /**
     * The meta object literal for the '<em><b>Documents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSITION__DOCUMENTS = eINSTANCE.getDecomposition_Documents();

    /**
     * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSITION__MODELS = eINSTANCE.getDecomposition_Models();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECOMPOSITION__ITEMS = eINSTANCE.getDecomposition_Items();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.DecompositionTypeImpl <em>Decomposition Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.DecompositionTypeImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDecompositionType()
     * @generated
     */
    EClass DECOMPOSITION_TYPE = eINSTANCE.getDecompositionType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECOMPOSITION_TYPE__TYPE_NAME = eINSTANCE.getDecompositionType_TypeName();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.DocumentImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT__ENTRIES = eINSTANCE.getDocument_Entries();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.DocItemTypeImpl <em>Doc Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.DocItemTypeImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDocItemType()
     * @generated
     */
    EClass DOC_ITEM_TYPE = eINSTANCE.getDocItemType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_ITEM_TYPE__TYPE_NAME = eINSTANCE.getDocItemType_TypeName();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.DocItemImpl <em>Doc Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.DocItemImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getDocItem()
     * @generated
     */
    EClass DOC_ITEM = eINSTANCE.getDocItem();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOC_ITEM__TYPE = eINSTANCE.getDocItem_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_ITEM__NAME = eINSTANCE.getDocItem_Name();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOC_ITEM__REF = eINSTANCE.getDocItem_Ref();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.ModelTypeImpl <em>Model Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.ModelTypeImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getModelType()
     * @generated
     */
    EClass MODEL_TYPE = eINSTANCE.getModelType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_TYPE__TYPE_NAME = eINSTANCE.getModelType_TypeName();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.ModelItemImpl <em>Model Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.ModelItemImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getModelItem()
     * @generated
     */
    EClass MODEL_ITEM = eINSTANCE.getModelItem();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_ITEM__TYPE = eINSTANCE.getModelItem_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ITEM__NAME = eINSTANCE.getModelItem_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_ITEM__DESC = eINSTANCE.getModelItem_Desc();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.ListItemTypeImpl <em>List Item Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.ListItemTypeImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getListItemType()
     * @generated
     */
    EClass LIST_ITEM_TYPE = eINSTANCE.getListItemType();

    /**
     * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_ITEM_TYPE__TYPE_NAME = eINSTANCE.getListItemType_TypeName();

    /**
     * The meta object literal for the '{@link net.certware.intent.intentSpecification.impl.ListItemImpl <em>List Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.certware.intent.intentSpecification.impl.ListItemImpl
     * @see net.certware.intent.intentSpecification.impl.IntentSpecificationPackageImpl#getListItem()
     * @generated
     */
    EClass LIST_ITEM = eINSTANCE.getListItem();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ITEM__TYPE = eINSTANCE.getListItem_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_ITEM__NAME = eINSTANCE.getListItem_Name();

    /**
     * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_ITEM__DESC = eINSTANCE.getListItem_Desc();

    /**
     * The meta object literal for the '<em><b>Doc References</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ITEM__DOC_REFERENCES = eINSTANCE.getListItem_DocReferences();

    /**
     * The meta object literal for the '<em><b>Item References</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ITEM__ITEM_REFERENCES = eINSTANCE.getListItem_ItemReferences();

    /**
     * The meta object literal for the '<em><b>Model References</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ITEM__MODEL_REFERENCES = eINSTANCE.getListItem_ModelReferences();

  }

} //IntentSpecificationPackage
