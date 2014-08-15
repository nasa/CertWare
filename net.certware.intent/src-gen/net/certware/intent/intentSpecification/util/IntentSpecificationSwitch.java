/**
 */
package net.certware.intent.intentSpecification.util;

import net.certware.intent.intentSpecification.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage
 * @generated
 */
public class IntentSpecificationSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IntentSpecificationPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentSpecificationSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = IntentSpecificationPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case IntentSpecificationPackage.SPECIFICATION:
      {
        Specification specification = (Specification)theEObject;
        T result = caseSpecification(specification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.REFINEMENT:
      {
        Refinement refinement = (Refinement)theEObject;
        T result = caseRefinement(refinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.INTENT:
      {
        Intent intent = (Intent)theEObject;
        T result = caseIntent(intent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.INTENT_TYPE:
      {
        IntentType intentType = (IntentType)theEObject;
        T result = caseIntentType(intentType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.DECOMPOSITION:
      {
        Decomposition decomposition = (Decomposition)theEObject;
        T result = caseDecomposition(decomposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.DECOMPOSITION_TYPE:
      {
        DecompositionType decompositionType = (DecompositionType)theEObject;
        T result = caseDecompositionType(decompositionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.DOCUMENT:
      {
        Document document = (Document)theEObject;
        T result = caseDocument(document);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.DOC_ITEM_TYPE:
      {
        DocItemType docItemType = (DocItemType)theEObject;
        T result = caseDocItemType(docItemType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.DOC_ITEM:
      {
        DocItem docItem = (DocItem)theEObject;
        T result = caseDocItem(docItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.MODEL_TYPE:
      {
        ModelType modelType = (ModelType)theEObject;
        T result = caseModelType(modelType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.MODEL_ITEM:
      {
        ModelItem modelItem = (ModelItem)theEObject;
        T result = caseModelItem(modelItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.LIST_ITEM_TYPE:
      {
        ListItemType listItemType = (ListItemType)theEObject;
        T result = caseListItemType(listItemType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IntentSpecificationPackage.LIST_ITEM:
      {
        ListItem listItem = (ListItem)theEObject;
        T result = caseListItem(listItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecification(Specification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefinement(Refinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntent(Intent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intent Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intent Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntentType(IntentType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecomposition(Decomposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decomposition Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decomposition Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecompositionType(DecompositionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocument(Document object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Doc Item Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Doc Item Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocItemType(DocItemType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Doc Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Doc Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocItem(DocItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelType(ModelType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelItem(ModelItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Item Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Item Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListItemType(ListItemType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListItem(ListItem object)
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
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //IntentSpecificationSwitch
