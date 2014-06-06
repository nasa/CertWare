/**
 */
package net.certware.state.stateAnalysis.impl;

import java.util.Collection;

import net.certware.state.stateAnalysis.DataCollection;
import net.certware.state.stateAnalysis.DataProduct;
import net.certware.state.stateAnalysis.QosPolicy;
import net.certware.state.stateAnalysis.StateAnalysisPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DataCollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DataCollectionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DataCollectionImpl#getPolicies <em>Policies</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DataCollectionImpl#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataCollectionImpl extends MinimalEObjectImpl.Container implements DataCollection
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicies()
   * @generated
   * @ordered
   */
  protected EList<QosPolicy> policies;

  /**
   * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProducts()
   * @generated
   * @ordered
   */
  protected EList<DataProduct> products;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataCollectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return StateAnalysisPackage.Literals.DATA_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DATA_COLLECTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DATA_COLLECTION__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<QosPolicy> getPolicies()
  {
    if (policies == null)
    {
      policies = new EObjectContainmentEList<QosPolicy>(QosPolicy.class, this, StateAnalysisPackage.DATA_COLLECTION__POLICIES);
    }
    return policies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataProduct> getProducts()
  {
    if (products == null)
    {
      products = new EObjectContainmentEList<DataProduct>(DataProduct.class, this, StateAnalysisPackage.DATA_COLLECTION__PRODUCTS);
    }
    return products;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DATA_COLLECTION__POLICIES:
        return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.DATA_COLLECTION__PRODUCTS:
        return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DATA_COLLECTION__NAME:
        return getName();
      case StateAnalysisPackage.DATA_COLLECTION__DESCRIPTION:
        return getDescription();
      case StateAnalysisPackage.DATA_COLLECTION__POLICIES:
        return getPolicies();
      case StateAnalysisPackage.DATA_COLLECTION__PRODUCTS:
        return getProducts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DATA_COLLECTION__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.DATA_COLLECTION__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case StateAnalysisPackage.DATA_COLLECTION__POLICIES:
        getPolicies().clear();
        getPolicies().addAll((Collection<? extends QosPolicy>)newValue);
        return;
      case StateAnalysisPackage.DATA_COLLECTION__PRODUCTS:
        getProducts().clear();
        getProducts().addAll((Collection<? extends DataProduct>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DATA_COLLECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.DATA_COLLECTION__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case StateAnalysisPackage.DATA_COLLECTION__POLICIES:
        getPolicies().clear();
        return;
      case StateAnalysisPackage.DATA_COLLECTION__PRODUCTS:
        getProducts().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.DATA_COLLECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.DATA_COLLECTION__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case StateAnalysisPackage.DATA_COLLECTION__POLICIES:
        return policies != null && !policies.isEmpty();
      case StateAnalysisPackage.DATA_COLLECTION__PRODUCTS:
        return products != null && !products.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //DataCollectionImpl
