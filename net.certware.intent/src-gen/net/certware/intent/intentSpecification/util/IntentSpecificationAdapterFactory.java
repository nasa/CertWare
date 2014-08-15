/**
 */
package net.certware.intent.intentSpecification.util;

import net.certware.intent.intentSpecification.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage
 * @generated
 */
public class IntentSpecificationAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IntentSpecificationPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentSpecificationAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = IntentSpecificationPackage.eINSTANCE;
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
  protected IntentSpecificationSwitch<Adapter> modelSwitch =
    new IntentSpecificationSwitch<Adapter>()
    {
      @Override
      public Adapter caseSpecification(Specification object)
      {
        return createSpecificationAdapter();
      }
      @Override
      public Adapter caseRefinement(Refinement object)
      {
        return createRefinementAdapter();
      }
      @Override
      public Adapter caseIntent(Intent object)
      {
        return createIntentAdapter();
      }
      @Override
      public Adapter caseIntentType(IntentType object)
      {
        return createIntentTypeAdapter();
      }
      @Override
      public Adapter caseDecomposition(Decomposition object)
      {
        return createDecompositionAdapter();
      }
      @Override
      public Adapter caseDecompositionType(DecompositionType object)
      {
        return createDecompositionTypeAdapter();
      }
      @Override
      public Adapter caseDocument(Document object)
      {
        return createDocumentAdapter();
      }
      @Override
      public Adapter caseDocItemType(DocItemType object)
      {
        return createDocItemTypeAdapter();
      }
      @Override
      public Adapter caseDocItem(DocItem object)
      {
        return createDocItemAdapter();
      }
      @Override
      public Adapter caseModelType(ModelType object)
      {
        return createModelTypeAdapter();
      }
      @Override
      public Adapter caseModelItem(ModelItem object)
      {
        return createModelItemAdapter();
      }
      @Override
      public Adapter caseListItemType(ListItemType object)
      {
        return createListItemTypeAdapter();
      }
      @Override
      public Adapter caseListItem(ListItem object)
      {
        return createListItemAdapter();
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
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.Specification <em>Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.Specification
   * @generated
   */
  public Adapter createSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.Refinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.Refinement
   * @generated
   */
  public Adapter createRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.Intent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.Intent
   * @generated
   */
  public Adapter createIntentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.IntentType <em>Intent Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.IntentType
   * @generated
   */
  public Adapter createIntentTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.Decomposition <em>Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.Decomposition
   * @generated
   */
  public Adapter createDecompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.DecompositionType <em>Decomposition Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.DecompositionType
   * @generated
   */
  public Adapter createDecompositionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.Document
   * @generated
   */
  public Adapter createDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.DocItemType <em>Doc Item Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.DocItemType
   * @generated
   */
  public Adapter createDocItemTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.DocItem <em>Doc Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.DocItem
   * @generated
   */
  public Adapter createDocItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.ModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.ModelType
   * @generated
   */
  public Adapter createModelTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.ModelItem <em>Model Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.ModelItem
   * @generated
   */
  public Adapter createModelItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.ListItemType <em>List Item Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.ListItemType
   * @generated
   */
  public Adapter createListItemTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.certware.intent.intentSpecification.ListItem <em>List Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.certware.intent.intentSpecification.ListItem
   * @generated
   */
  public Adapter createListItemAdapter()
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

} //IntentSpecificationAdapterFactory
