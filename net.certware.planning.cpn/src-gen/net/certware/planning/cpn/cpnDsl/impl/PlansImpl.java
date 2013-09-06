/**
 */
package net.certware.planning.cpn.cpnDsl.impl;

import java.util.Collection;

import net.certware.planning.cpn.cpnDsl.ArgumentModels;
import net.certware.planning.cpn.cpnDsl.CpnDslPackage;
import net.certware.planning.cpn.cpnDsl.Plan;
import net.certware.planning.cpn.cpnDsl.Plans;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plans</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.PlansImpl#getArgumentmodels <em>Argumentmodels</em>}</li>
 *   <li>{@link net.certware.planning.cpn.cpnDsl.impl.PlansImpl#getPlans <em>Plans</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlansImpl extends MinimalEObjectImpl.Container implements Plans
{
  /**
   * The cached value of the '{@link #getArgumentmodels() <em>Argumentmodels</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentmodels()
   * @generated
   * @ordered
   */
  protected EList<ArgumentModels> argumentmodels;

  /**
   * The cached value of the '{@link #getPlans() <em>Plans</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlans()
   * @generated
   * @ordered
   */
  protected EList<Plan> plans;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlansImpl()
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
    return CpnDslPackage.Literals.PLANS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArgumentModels> getArgumentmodels()
  {
    if (argumentmodels == null)
    {
      argumentmodels = new EObjectContainmentEList<ArgumentModels>(ArgumentModels.class, this, CpnDslPackage.PLANS__ARGUMENTMODELS);
    }
    return argumentmodels;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Plan> getPlans()
  {
    if (plans == null)
    {
      plans = new EObjectContainmentEList<Plan>(Plan.class, this, CpnDslPackage.PLANS__PLANS);
    }
    return plans;
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
      case CpnDslPackage.PLANS__ARGUMENTMODELS:
        return ((InternalEList<?>)getArgumentmodels()).basicRemove(otherEnd, msgs);
      case CpnDslPackage.PLANS__PLANS:
        return ((InternalEList<?>)getPlans()).basicRemove(otherEnd, msgs);
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
      case CpnDslPackage.PLANS__ARGUMENTMODELS:
        return getArgumentmodels();
      case CpnDslPackage.PLANS__PLANS:
        return getPlans();
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
      case CpnDslPackage.PLANS__ARGUMENTMODELS:
        getArgumentmodels().clear();
        getArgumentmodels().addAll((Collection<? extends ArgumentModels>)newValue);
        return;
      case CpnDslPackage.PLANS__PLANS:
        getPlans().clear();
        getPlans().addAll((Collection<? extends Plan>)newValue);
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
      case CpnDslPackage.PLANS__ARGUMENTMODELS:
        getArgumentmodels().clear();
        return;
      case CpnDslPackage.PLANS__PLANS:
        getPlans().clear();
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
      case CpnDslPackage.PLANS__ARGUMENTMODELS:
        return argumentmodels != null && !argumentmodels.isEmpty();
      case CpnDslPackage.PLANS__PLANS:
        return plans != null && !plans.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PlansImpl
