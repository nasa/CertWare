/**
 */
package stateAnalysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateAnalysis.Estimator;
import stateAnalysis.HardwareMeasurement;
import stateAnalysis.StateAnalysisPackage;
import stateAnalysis.StateConstraint;
import stateAnalysis.StateUpdate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Estimator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link stateAnalysis.impl.EstimatorImpl#getDistilledMeasurements <em>Distilled Measurements</em>}</li>
 *   <li>{@link stateAnalysis.impl.EstimatorImpl#getStateConstraints <em>State Constraints</em>}</li>
 *   <li>{@link stateAnalysis.impl.EstimatorImpl#getStateUpdates <em>State Updates</em>}</li>
 *   <li>{@link stateAnalysis.impl.EstimatorImpl#getHardwareMeasurement <em>Hardware Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EstimatorImpl extends ComponentImpl implements Estimator
{
  /**
   * The cached value of the '{@link #getDistilledMeasurements() <em>Distilled Measurements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDistilledMeasurements()
   * @generated
   * @ordered
   */
  protected EList<Estimator> distilledMeasurements;

  /**
   * The cached value of the '{@link #getStateConstraints() <em>State Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateConstraints()
   * @generated
   * @ordered
   */
  protected EList<StateConstraint> stateConstraints;

  /**
   * The cached value of the '{@link #getStateUpdates() <em>State Updates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateUpdates()
   * @generated
   * @ordered
   */
  protected EList<StateUpdate> stateUpdates;

  /**
   * The cached value of the '{@link #getHardwareMeasurement() <em>Hardware Measurement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardwareMeasurement()
   * @generated
   * @ordered
   */
  protected EList<HardwareMeasurement> hardwareMeasurement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EstimatorImpl()
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
    return StateAnalysisPackage.Literals.ESTIMATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Estimator> getDistilledMeasurements()
  {
    if (distilledMeasurements == null)
    {
      distilledMeasurements = new EObjectResolvingEList<Estimator>(Estimator.class, this, StateAnalysisPackage.ESTIMATOR__DISTILLED_MEASUREMENTS);
    }
    return distilledMeasurements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateConstraint> getStateConstraints()
  {
    if (stateConstraints == null)
    {
      stateConstraints = new EObjectContainmentEList<StateConstraint>(StateConstraint.class, this, StateAnalysisPackage.ESTIMATOR__STATE_CONSTRAINTS);
    }
    return stateConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateUpdate> getStateUpdates()
  {
    if (stateUpdates == null)
    {
      stateUpdates = new EObjectContainmentEList<StateUpdate>(StateUpdate.class, this, StateAnalysisPackage.ESTIMATOR__STATE_UPDATES);
    }
    return stateUpdates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HardwareMeasurement> getHardwareMeasurement()
  {
    if (hardwareMeasurement == null)
    {
      hardwareMeasurement = new EObjectContainmentEList<HardwareMeasurement>(HardwareMeasurement.class, this, StateAnalysisPackage.ESTIMATOR__HARDWARE_MEASUREMENT);
    }
    return hardwareMeasurement;
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
      case StateAnalysisPackage.ESTIMATOR__STATE_CONSTRAINTS:
        return ((InternalEList<?>)getStateConstraints()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.ESTIMATOR__STATE_UPDATES:
        return ((InternalEList<?>)getStateUpdates()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.ESTIMATOR__HARDWARE_MEASUREMENT:
        return ((InternalEList<?>)getHardwareMeasurement()).basicRemove(otherEnd, msgs);
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
      case StateAnalysisPackage.ESTIMATOR__DISTILLED_MEASUREMENTS:
        return getDistilledMeasurements();
      case StateAnalysisPackage.ESTIMATOR__STATE_CONSTRAINTS:
        return getStateConstraints();
      case StateAnalysisPackage.ESTIMATOR__STATE_UPDATES:
        return getStateUpdates();
      case StateAnalysisPackage.ESTIMATOR__HARDWARE_MEASUREMENT:
        return getHardwareMeasurement();
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
      case StateAnalysisPackage.ESTIMATOR__DISTILLED_MEASUREMENTS:
        getDistilledMeasurements().clear();
        getDistilledMeasurements().addAll((Collection<? extends Estimator>)newValue);
        return;
      case StateAnalysisPackage.ESTIMATOR__STATE_CONSTRAINTS:
        getStateConstraints().clear();
        getStateConstraints().addAll((Collection<? extends StateConstraint>)newValue);
        return;
      case StateAnalysisPackage.ESTIMATOR__STATE_UPDATES:
        getStateUpdates().clear();
        getStateUpdates().addAll((Collection<? extends StateUpdate>)newValue);
        return;
      case StateAnalysisPackage.ESTIMATOR__HARDWARE_MEASUREMENT:
        getHardwareMeasurement().clear();
        getHardwareMeasurement().addAll((Collection<? extends HardwareMeasurement>)newValue);
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
      case StateAnalysisPackage.ESTIMATOR__DISTILLED_MEASUREMENTS:
        getDistilledMeasurements().clear();
        return;
      case StateAnalysisPackage.ESTIMATOR__STATE_CONSTRAINTS:
        getStateConstraints().clear();
        return;
      case StateAnalysisPackage.ESTIMATOR__STATE_UPDATES:
        getStateUpdates().clear();
        return;
      case StateAnalysisPackage.ESTIMATOR__HARDWARE_MEASUREMENT:
        getHardwareMeasurement().clear();
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
      case StateAnalysisPackage.ESTIMATOR__DISTILLED_MEASUREMENTS:
        return distilledMeasurements != null && !distilledMeasurements.isEmpty();
      case StateAnalysisPackage.ESTIMATOR__STATE_CONSTRAINTS:
        return stateConstraints != null && !stateConstraints.isEmpty();
      case StateAnalysisPackage.ESTIMATOR__STATE_UPDATES:
        return stateUpdates != null && !stateUpdates.isEmpty();
      case StateAnalysisPackage.ESTIMATOR__HARDWARE_MEASUREMENT:
        return hardwareMeasurement != null && !hardwareMeasurement.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EstimatorImpl
