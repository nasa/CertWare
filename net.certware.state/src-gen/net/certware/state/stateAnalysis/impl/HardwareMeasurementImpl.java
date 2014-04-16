/**
 */
package net.certware.state.stateAnalysis.impl;

import net.certware.state.stateAnalysis.Estimator;
import net.certware.state.stateAnalysis.HardwareAdapter;
import net.certware.state.stateAnalysis.HardwareMeasurement;
import net.certware.state.stateAnalysis.StateAnalysisPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hardware Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl#getAdapter <em>Adapter</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.HardwareMeasurementImpl#getEstimator <em>Estimator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HardwareMeasurementImpl extends MinimalEObjectImpl.Container implements HardwareMeasurement
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
   * The cached value of the '{@link #getAdapter() <em>Adapter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdapter()
   * @generated
   * @ordered
   */
  protected HardwareAdapter adapter;

  /**
   * The cached value of the '{@link #getEstimator() <em>Estimator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstimator()
   * @generated
   * @ordered
   */
  protected Estimator estimator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HardwareMeasurementImpl()
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
    return StateAnalysisPackage.Literals.HARDWARE_MEASUREMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.HARDWARE_MEASUREMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardwareAdapter getAdapter()
  {
    if (adapter != null && adapter.eIsProxy())
    {
      InternalEObject oldAdapter = (InternalEObject)adapter;
      adapter = (HardwareAdapter)eResolveProxy(oldAdapter);
      if (adapter != oldAdapter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateAnalysisPackage.HARDWARE_MEASUREMENT__ADAPTER, oldAdapter, adapter));
      }
    }
    return adapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HardwareAdapter basicGetAdapter()
  {
    return adapter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdapter(HardwareAdapter newAdapter)
  {
    HardwareAdapter oldAdapter = adapter;
    adapter = newAdapter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.HARDWARE_MEASUREMENT__ADAPTER, oldAdapter, adapter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estimator getEstimator()
  {
    if (estimator != null && estimator.eIsProxy())
    {
      InternalEObject oldEstimator = (InternalEObject)estimator;
      estimator = (Estimator)eResolveProxy(oldEstimator);
      if (estimator != oldEstimator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateAnalysisPackage.HARDWARE_MEASUREMENT__ESTIMATOR, oldEstimator, estimator));
      }
    }
    return estimator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Estimator basicGetEstimator()
  {
    return estimator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEstimator(Estimator newEstimator)
  {
    Estimator oldEstimator = estimator;
    estimator = newEstimator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.HARDWARE_MEASUREMENT__ESTIMATOR, oldEstimator, estimator));
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
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__NAME:
        return getName();
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__ADAPTER:
        if (resolve) return getAdapter();
        return basicGetAdapter();
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__ESTIMATOR:
        if (resolve) return getEstimator();
        return basicGetEstimator();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__ADAPTER:
        setAdapter((HardwareAdapter)newValue);
        return;
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__ESTIMATOR:
        setEstimator((Estimator)newValue);
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
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__ADAPTER:
        setAdapter((HardwareAdapter)null);
        return;
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__ESTIMATOR:
        setEstimator((Estimator)null);
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
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__ADAPTER:
        return adapter != null;
      case StateAnalysisPackage.HARDWARE_MEASUREMENT__ESTIMATOR:
        return estimator != null;
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
    result.append(')');
    return result.toString();
  }

} //HardwareMeasurementImpl
