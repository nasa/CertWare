/**
 */
package net.certware.intent.intentSpecification.impl;

import net.certware.intent.intentSpecification.*;

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
public class IntentSpecificationFactoryImpl extends EFactoryImpl implements IntentSpecificationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IntentSpecificationFactory init()
  {
    try
    {
      IntentSpecificationFactory theIntentSpecificationFactory = (IntentSpecificationFactory)EPackage.Registry.INSTANCE.getEFactory(IntentSpecificationPackage.eNS_URI);
      if (theIntentSpecificationFactory != null)
      {
        return theIntentSpecificationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IntentSpecificationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentSpecificationFactoryImpl()
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
      case IntentSpecificationPackage.SPECIFICATION: return createSpecification();
      case IntentSpecificationPackage.REFINEMENT: return createRefinement();
      case IntentSpecificationPackage.INTENT: return createIntent();
      case IntentSpecificationPackage.INTENT_TYPE: return createIntentType();
      case IntentSpecificationPackage.DECOMPOSITION: return createDecomposition();
      case IntentSpecificationPackage.DECOMPOSITION_TYPE: return createDecompositionType();
      case IntentSpecificationPackage.DOCUMENT: return createDocument();
      case IntentSpecificationPackage.DOC_ITEM_TYPE: return createDocItemType();
      case IntentSpecificationPackage.DOC_ITEM: return createDocItem();
      case IntentSpecificationPackage.MODEL_TYPE: return createModelType();
      case IntentSpecificationPackage.MODEL_ITEM: return createModelItem();
      case IntentSpecificationPackage.LIST_ITEM_TYPE: return createListItemType();
      case IntentSpecificationPackage.LIST_ITEM: return createListItem();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specification createSpecification()
  {
    SpecificationImpl specification = new SpecificationImpl();
    return specification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refinement createRefinement()
  {
    RefinementImpl refinement = new RefinementImpl();
    return refinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intent createIntent()
  {
    IntentImpl intent = new IntentImpl();
    return intent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentType createIntentType()
  {
    IntentTypeImpl intentType = new IntentTypeImpl();
    return intentType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Decomposition createDecomposition()
  {
    DecompositionImpl decomposition = new DecompositionImpl();
    return decomposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecompositionType createDecompositionType()
  {
    DecompositionTypeImpl decompositionType = new DecompositionTypeImpl();
    return decompositionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocItemType createDocItemType()
  {
    DocItemTypeImpl docItemType = new DocItemTypeImpl();
    return docItemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocItem createDocItem()
  {
    DocItemImpl docItem = new DocItemImpl();
    return docItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelType createModelType()
  {
    ModelTypeImpl modelType = new ModelTypeImpl();
    return modelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelItem createModelItem()
  {
    ModelItemImpl modelItem = new ModelItemImpl();
    return modelItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListItemType createListItemType()
  {
    ListItemTypeImpl listItemType = new ListItemTypeImpl();
    return listItemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListItem createListItem()
  {
    ListItemImpl listItem = new ListItemImpl();
    return listItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentSpecificationPackage getIntentSpecificationPackage()
  {
    return (IntentSpecificationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IntentSpecificationPackage getPackage()
  {
    return IntentSpecificationPackage.eINSTANCE;
  }

} //IntentSpecificationFactoryImpl
