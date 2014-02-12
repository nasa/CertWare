/**
 */
package net.certware.intent.intentSpecification.impl;

import net.certware.intent.intentSpecification.Decomposition;
import net.certware.intent.intentSpecification.DecompositionType;
import net.certware.intent.intentSpecification.DocItem;
import net.certware.intent.intentSpecification.DocItemType;
import net.certware.intent.intentSpecification.Document;
import net.certware.intent.intentSpecification.Intent;
import net.certware.intent.intentSpecification.IntentSpecificationFactory;
import net.certware.intent.intentSpecification.IntentSpecificationPackage;
import net.certware.intent.intentSpecification.IntentType;
import net.certware.intent.intentSpecification.ListItem;
import net.certware.intent.intentSpecification.ListItemType;
import net.certware.intent.intentSpecification.ModelItem;
import net.certware.intent.intentSpecification.ModelType;
import net.certware.intent.intentSpecification.Refinement;
import net.certware.intent.intentSpecification.Specification;

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
public class IntentSpecificationPackageImpl extends EPackageImpl implements IntentSpecificationPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass specificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intentTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decompositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decompositionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass docItemTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass docItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listItemTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listItemEClass = null;

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
   * @see net.certware.intent.intentSpecification.IntentSpecificationPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private IntentSpecificationPackageImpl()
  {
    super(eNS_URI, IntentSpecificationFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link IntentSpecificationPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static IntentSpecificationPackage init()
  {
    if (isInited) return (IntentSpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(IntentSpecificationPackage.eNS_URI);

    // Obtain or create and register package
    IntentSpecificationPackageImpl theIntentSpecificationPackage = (IntentSpecificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntentSpecificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntentSpecificationPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theIntentSpecificationPackage.createPackageContents();

    // Initialize created meta-data
    theIntentSpecificationPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theIntentSpecificationPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(IntentSpecificationPackage.eNS_URI, theIntentSpecificationPackage);
    return theIntentSpecificationPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpecification()
  {
    return specificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpecification_Name()
  {
    return (EAttribute)specificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpecification_Refinements()
  {
    return (EReference)specificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefinement()
  {
    return refinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefinement_Name()
  {
    return (EAttribute)refinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefinement_Desc()
  {
    return (EAttribute)refinementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefinement_Intents()
  {
    return (EReference)refinementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntent()
  {
    return intentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntent_Type()
  {
    return (EReference)intentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntent_Name()
  {
    return (EAttribute)intentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntent_Desc()
  {
    return (EAttribute)intentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIntent_Decompositions()
  {
    return (EReference)intentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntentType()
  {
    return intentTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntentType_TypeName()
  {
    return (EAttribute)intentTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecomposition()
  {
    return decompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecomposition_Type()
  {
    return (EReference)decompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecomposition_Name()
  {
    return (EAttribute)decompositionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecomposition_Desc()
  {
    return (EAttribute)decompositionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecomposition_Documents()
  {
    return (EReference)decompositionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecomposition_Models()
  {
    return (EReference)decompositionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDecomposition_Items()
  {
    return (EReference)decompositionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDecompositionType()
  {
    return decompositionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDecompositionType_TypeName()
  {
    return (EAttribute)decompositionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocument()
  {
    return documentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocument_Entries()
  {
    return (EReference)documentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocItemType()
  {
    return docItemTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocItemType_TypeName()
  {
    return (EAttribute)docItemTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocItem()
  {
    return docItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocItem_Type()
  {
    return (EReference)docItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocItem_Name()
  {
    return (EAttribute)docItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocItem_Ref()
  {
    return (EAttribute)docItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelType()
  {
    return modelTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelType_TypeName()
  {
    return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelItem()
  {
    return modelItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelItem_Type()
  {
    return (EReference)modelItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelItem_Name()
  {
    return (EAttribute)modelItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelItem_Desc()
  {
    return (EAttribute)modelItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListItemType()
  {
    return listItemTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListItemType_TypeName()
  {
    return (EAttribute)listItemTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListItem()
  {
    return listItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListItem_Type()
  {
    return (EReference)listItemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListItem_Name()
  {
    return (EAttribute)listItemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListItem_Desc()
  {
    return (EAttribute)listItemEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListItem_DocReferences()
  {
    return (EReference)listItemEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListItem_ItemReferences()
  {
    return (EReference)listItemEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListItem_ModelReferences()
  {
    return (EReference)listItemEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentSpecificationFactory getIntentSpecificationFactory()
  {
    return (IntentSpecificationFactory)getEFactoryInstance();
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
    specificationEClass = createEClass(SPECIFICATION);
    createEAttribute(specificationEClass, SPECIFICATION__NAME);
    createEReference(specificationEClass, SPECIFICATION__REFINEMENTS);

    refinementEClass = createEClass(REFINEMENT);
    createEAttribute(refinementEClass, REFINEMENT__NAME);
    createEAttribute(refinementEClass, REFINEMENT__DESC);
    createEReference(refinementEClass, REFINEMENT__INTENTS);

    intentEClass = createEClass(INTENT);
    createEReference(intentEClass, INTENT__TYPE);
    createEAttribute(intentEClass, INTENT__NAME);
    createEAttribute(intentEClass, INTENT__DESC);
    createEReference(intentEClass, INTENT__DECOMPOSITIONS);

    intentTypeEClass = createEClass(INTENT_TYPE);
    createEAttribute(intentTypeEClass, INTENT_TYPE__TYPE_NAME);

    decompositionEClass = createEClass(DECOMPOSITION);
    createEReference(decompositionEClass, DECOMPOSITION__TYPE);
    createEAttribute(decompositionEClass, DECOMPOSITION__NAME);
    createEAttribute(decompositionEClass, DECOMPOSITION__DESC);
    createEReference(decompositionEClass, DECOMPOSITION__DOCUMENTS);
    createEReference(decompositionEClass, DECOMPOSITION__MODELS);
    createEReference(decompositionEClass, DECOMPOSITION__ITEMS);

    decompositionTypeEClass = createEClass(DECOMPOSITION_TYPE);
    createEAttribute(decompositionTypeEClass, DECOMPOSITION_TYPE__TYPE_NAME);

    documentEClass = createEClass(DOCUMENT);
    createEReference(documentEClass, DOCUMENT__ENTRIES);

    docItemTypeEClass = createEClass(DOC_ITEM_TYPE);
    createEAttribute(docItemTypeEClass, DOC_ITEM_TYPE__TYPE_NAME);

    docItemEClass = createEClass(DOC_ITEM);
    createEReference(docItemEClass, DOC_ITEM__TYPE);
    createEAttribute(docItemEClass, DOC_ITEM__NAME);
    createEAttribute(docItemEClass, DOC_ITEM__REF);

    modelTypeEClass = createEClass(MODEL_TYPE);
    createEAttribute(modelTypeEClass, MODEL_TYPE__TYPE_NAME);

    modelItemEClass = createEClass(MODEL_ITEM);
    createEReference(modelItemEClass, MODEL_ITEM__TYPE);
    createEAttribute(modelItemEClass, MODEL_ITEM__NAME);
    createEAttribute(modelItemEClass, MODEL_ITEM__DESC);

    listItemTypeEClass = createEClass(LIST_ITEM_TYPE);
    createEAttribute(listItemTypeEClass, LIST_ITEM_TYPE__TYPE_NAME);

    listItemEClass = createEClass(LIST_ITEM);
    createEReference(listItemEClass, LIST_ITEM__TYPE);
    createEAttribute(listItemEClass, LIST_ITEM__NAME);
    createEAttribute(listItemEClass, LIST_ITEM__DESC);
    createEReference(listItemEClass, LIST_ITEM__DOC_REFERENCES);
    createEReference(listItemEClass, LIST_ITEM__ITEM_REFERENCES);
    createEReference(listItemEClass, LIST_ITEM__MODEL_REFERENCES);
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

    // Initialize classes and features; add operations and parameters
    initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpecification_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSpecification_Refinements(), this.getRefinement(), null, "refinements", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refinementEClass, Refinement.class, "Refinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRefinement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRefinement_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRefinement_Intents(), this.getIntent(), null, "intents", null, 0, -1, Refinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentEClass, Intent.class, "Intent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntent_Type(), this.getIntentType(), null, "type", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIntent_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntent_Decompositions(), this.getDecomposition(), null, "decompositions", null, 0, -1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentTypeEClass, IntentType.class, "IntentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntentType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, IntentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decompositionEClass, Decomposition.class, "Decomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDecomposition_Type(), this.getDecompositionType(), null, "type", null, 0, 1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecomposition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDecomposition_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecomposition_Documents(), this.getDocument(), null, "documents", null, 0, -1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecomposition_Models(), this.getModelItem(), null, "models", null, 0, -1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDecomposition_Items(), this.getListItem(), null, "items", null, 0, -1, Decomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decompositionTypeEClass, DecompositionType.class, "DecompositionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecompositionType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, DecompositionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocument_Entries(), this.getDocItem(), null, "entries", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(docItemTypeEClass, DocItemType.class, "DocItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocItemType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, DocItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(docItemEClass, DocItem.class, "DocItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDocItem_Type(), this.getDocItemType(), null, "type", null, 0, 1, DocItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, DocItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDocItem_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, DocItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelItemEClass, ModelItem.class, "ModelItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelItem_Type(), this.getModelType(), null, "type", null, 0, 1, ModelItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModelItem_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, ModelItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listItemTypeEClass, ListItemType.class, "ListItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getListItemType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, ListItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListItem_Type(), this.getListItemType(), null, "type", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getListItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getListItem_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListItem_DocReferences(), this.getDocItem(), null, "docReferences", null, 0, -1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListItem_ItemReferences(), this.getListItem(), null, "itemReferences", null, 0, -1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListItem_ModelReferences(), this.getModelItem(), null, "modelReferences", null, 0, -1, ListItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //IntentSpecificationPackageImpl
