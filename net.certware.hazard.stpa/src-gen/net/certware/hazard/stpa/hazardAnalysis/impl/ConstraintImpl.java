/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import java.util.Collection;

import net.certware.hazard.stpa.hazardAnalysis.Constraint;
import net.certware.hazard.stpa.hazardAnalysis.Control;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.Note;
import net.certware.hazard.stpa.hazardAnalysis.Requirement;
import net.certware.hazard.stpa.hazardAnalysis.Scenario;

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
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl#getControls <em>Controls</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.ConstraintImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint
{
  /**
   * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected String constraint = CONSTRAINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirements()
   * @generated
   * @ordered
   */
  protected EList<Requirement> requirements;

  /**
   * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarios()
   * @generated
   * @ordered
   */
  protected EList<Scenario> scenarios;

  /**
   * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControls()
   * @generated
   * @ordered
   */
  protected EList<Control> controls;

  /**
   * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotes()
   * @generated
   * @ordered
   */
  protected EList<Note> notes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintImpl()
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
    return HazardAnalysisPackage.Literals.CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(String newConstraint)
  {
    String oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getRequirements()
  {
    if (requirements == null)
    {
      requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, HazardAnalysisPackage.CONSTRAINT__REQUIREMENTS);
    }
    return requirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scenario> getScenarios()
  {
    if (scenarios == null)
    {
      scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, HazardAnalysisPackage.CONSTRAINT__SCENARIOS);
    }
    return scenarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Control> getControls()
  {
    if (controls == null)
    {
      controls = new EObjectContainmentEList<Control>(Control.class, this, HazardAnalysisPackage.CONSTRAINT__CONTROLS);
    }
    return controls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Note> getNotes()
  {
    if (notes == null)
    {
      notes = new EObjectContainmentEList<Note>(Note.class, this, HazardAnalysisPackage.CONSTRAINT__NOTES);
    }
    return notes;
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
      case HazardAnalysisPackage.CONSTRAINT__REQUIREMENTS:
        return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
      case HazardAnalysisPackage.CONSTRAINT__SCENARIOS:
        return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
      case HazardAnalysisPackage.CONSTRAINT__CONTROLS:
        return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
      case HazardAnalysisPackage.CONSTRAINT__NOTES:
        return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
      case HazardAnalysisPackage.CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case HazardAnalysisPackage.CONSTRAINT__REQUIREMENTS:
        return getRequirements();
      case HazardAnalysisPackage.CONSTRAINT__SCENARIOS:
        return getScenarios();
      case HazardAnalysisPackage.CONSTRAINT__CONTROLS:
        return getControls();
      case HazardAnalysisPackage.CONSTRAINT__NOTES:
        return getNotes();
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
      case HazardAnalysisPackage.CONSTRAINT__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case HazardAnalysisPackage.CONSTRAINT__REQUIREMENTS:
        getRequirements().clear();
        getRequirements().addAll((Collection<? extends Requirement>)newValue);
        return;
      case HazardAnalysisPackage.CONSTRAINT__SCENARIOS:
        getScenarios().clear();
        getScenarios().addAll((Collection<? extends Scenario>)newValue);
        return;
      case HazardAnalysisPackage.CONSTRAINT__CONTROLS:
        getControls().clear();
        getControls().addAll((Collection<? extends Control>)newValue);
        return;
      case HazardAnalysisPackage.CONSTRAINT__NOTES:
        getNotes().clear();
        getNotes().addAll((Collection<? extends Note>)newValue);
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
      case HazardAnalysisPackage.CONSTRAINT__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case HazardAnalysisPackage.CONSTRAINT__REQUIREMENTS:
        getRequirements().clear();
        return;
      case HazardAnalysisPackage.CONSTRAINT__SCENARIOS:
        getScenarios().clear();
        return;
      case HazardAnalysisPackage.CONSTRAINT__CONTROLS:
        getControls().clear();
        return;
      case HazardAnalysisPackage.CONSTRAINT__NOTES:
        getNotes().clear();
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
      case HazardAnalysisPackage.CONSTRAINT__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case HazardAnalysisPackage.CONSTRAINT__REQUIREMENTS:
        return requirements != null && !requirements.isEmpty();
      case HazardAnalysisPackage.CONSTRAINT__SCENARIOS:
        return scenarios != null && !scenarios.isEmpty();
      case HazardAnalysisPackage.CONSTRAINT__CONTROLS:
        return controls != null && !controls.isEmpty();
      case HazardAnalysisPackage.CONSTRAINT__NOTES:
        return notes != null && !notes.isEmpty();
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
    result.append(" (constraint: ");
    result.append(constraint);
    result.append(')');
    return result.toString();
  }

} //ConstraintImpl
