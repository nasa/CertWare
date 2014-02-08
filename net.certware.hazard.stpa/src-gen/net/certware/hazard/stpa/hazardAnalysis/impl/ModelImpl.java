/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import java.util.Collection;

import net.certware.hazard.stpa.hazardAnalysis.Accident;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.Incident;
import net.certware.hazard.stpa.hazardAnalysis.Model;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.ModelImpl#getAccidents <em>Accidents</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.ModelImpl#getIndicents <em>Indicents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getAccidents() <em>Accidents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAccidents()
   * @generated
   * @ordered
   */
  protected EList<Accident> accidents;

  /**
   * The cached value of the '{@link #getIndicents() <em>Indicents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndicents()
   * @generated
   * @ordered
   */
  protected EList<Incident> indicents;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return HazardAnalysisPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Accident> getAccidents()
  {
    if (accidents == null)
    {
      accidents = new EObjectContainmentEList<Accident>(Accident.class, this, HazardAnalysisPackage.MODEL__ACCIDENTS);
    }
    return accidents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Incident> getIndicents()
  {
    if (indicents == null)
    {
      indicents = new EObjectContainmentEList<Incident>(Incident.class, this, HazardAnalysisPackage.MODEL__INDICENTS);
    }
    return indicents;
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
      case HazardAnalysisPackage.MODEL__ACCIDENTS:
        return ((InternalEList<?>)getAccidents()).basicRemove(otherEnd, msgs);
      case HazardAnalysisPackage.MODEL__INDICENTS:
        return ((InternalEList<?>)getIndicents()).basicRemove(otherEnd, msgs);
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
      case HazardAnalysisPackage.MODEL__ACCIDENTS:
        return getAccidents();
      case HazardAnalysisPackage.MODEL__INDICENTS:
        return getIndicents();
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
      case HazardAnalysisPackage.MODEL__ACCIDENTS:
        getAccidents().clear();
        getAccidents().addAll((Collection<? extends Accident>)newValue);
        return;
      case HazardAnalysisPackage.MODEL__INDICENTS:
        getIndicents().clear();
        getIndicents().addAll((Collection<? extends Incident>)newValue);
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
      case HazardAnalysisPackage.MODEL__ACCIDENTS:
        getAccidents().clear();
        return;
      case HazardAnalysisPackage.MODEL__INDICENTS:
        getIndicents().clear();
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
      case HazardAnalysisPackage.MODEL__ACCIDENTS:
        return accidents != null && !accidents.isEmpty();
      case HazardAnalysisPackage.MODEL__INDICENTS:
        return indicents != null && !indicents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
