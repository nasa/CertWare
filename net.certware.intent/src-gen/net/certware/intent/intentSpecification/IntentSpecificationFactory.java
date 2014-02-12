/**
 */
package net.certware.intent.intentSpecification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.intent.intentSpecification.IntentSpecificationPackage
 * @generated
 */
public interface IntentSpecificationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IntentSpecificationFactory eINSTANCE = net.certware.intent.intentSpecification.impl.IntentSpecificationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specification</em>'.
   * @generated
   */
  Specification createSpecification();

  /**
   * Returns a new object of class '<em>Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refinement</em>'.
   * @generated
   */
  Refinement createRefinement();

  /**
   * Returns a new object of class '<em>Intent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intent</em>'.
   * @generated
   */
  Intent createIntent();

  /**
   * Returns a new object of class '<em>Intent Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intent Type</em>'.
   * @generated
   */
  IntentType createIntentType();

  /**
   * Returns a new object of class '<em>Decomposition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decomposition</em>'.
   * @generated
   */
  Decomposition createDecomposition();

  /**
   * Returns a new object of class '<em>Decomposition Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decomposition Type</em>'.
   * @generated
   */
  DecompositionType createDecompositionType();

  /**
   * Returns a new object of class '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document</em>'.
   * @generated
   */
  Document createDocument();

  /**
   * Returns a new object of class '<em>Doc Item Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Doc Item Type</em>'.
   * @generated
   */
  DocItemType createDocItemType();

  /**
   * Returns a new object of class '<em>Doc Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Doc Item</em>'.
   * @generated
   */
  DocItem createDocItem();

  /**
   * Returns a new object of class '<em>Model Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Type</em>'.
   * @generated
   */
  ModelType createModelType();

  /**
   * Returns a new object of class '<em>Model Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Item</em>'.
   * @generated
   */
  ModelItem createModelItem();

  /**
   * Returns a new object of class '<em>List Item Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Item Type</em>'.
   * @generated
   */
  ListItemType createListItemType();

  /**
   * Returns a new object of class '<em>List Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Item</em>'.
   * @generated
   */
  ListItem createListItem();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IntentSpecificationPackage getIntentSpecificationPackage();

} //IntentSpecificationFactory
