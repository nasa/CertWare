/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import java.util.Collection;

import net.certware.hazard.stpa.hazardAnalysis.Design;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.Note;
import net.certware.hazard.stpa.hazardAnalysis.Requirement;

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
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.RequirementImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.RequirementImpl#getDesigns <em>Designs</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.RequirementImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement
{
  /**
   * The default value of the '{@link #getRequirement() <em>Requirement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected static final String REQUIREMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected String requirement = REQUIREMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDesigns() <em>Designs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesigns()
   * @generated
   * @ordered
   */
  protected EList<Design> designs;

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
  protected RequirementImpl()
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
    return HazardAnalysisPackage.Literals.REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRequirement()
  {
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequirement(String newRequirement)
  {
    String oldRequirement = requirement;
    requirement = newRequirement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.REQUIREMENT__REQUIREMENT, oldRequirement, requirement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Design> getDesigns()
  {
    if (designs == null)
    {
      designs = new EObjectContainmentEList<Design>(Design.class, this, HazardAnalysisPackage.REQUIREMENT__DESIGNS);
    }
    return designs;
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
      notes = new EObjectContainmentEList<Note>(Note.class, this, HazardAnalysisPackage.REQUIREMENT__NOTES);
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
      case HazardAnalysisPackage.REQUIREMENT__DESIGNS:
        return ((InternalEList<?>)getDesigns()).basicRemove(otherEnd, msgs);
      case HazardAnalysisPackage.REQUIREMENT__NOTES:
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
      case HazardAnalysisPackage.REQUIREMENT__REQUIREMENT:
        return getRequirement();
      case HazardAnalysisPackage.REQUIREMENT__DESIGNS:
        return getDesigns();
      case HazardAnalysisPackage.REQUIREMENT__NOTES:
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
      case HazardAnalysisPackage.REQUIREMENT__REQUIREMENT:
        setRequirement((String)newValue);
        return;
      case HazardAnalysisPackage.REQUIREMENT__DESIGNS:
        getDesigns().clear();
        getDesigns().addAll((Collection<? extends Design>)newValue);
        return;
      case HazardAnalysisPackage.REQUIREMENT__NOTES:
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
      case HazardAnalysisPackage.REQUIREMENT__REQUIREMENT:
        setRequirement(REQUIREMENT_EDEFAULT);
        return;
      case HazardAnalysisPackage.REQUIREMENT__DESIGNS:
        getDesigns().clear();
        return;
      case HazardAnalysisPackage.REQUIREMENT__NOTES:
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
      case HazardAnalysisPackage.REQUIREMENT__REQUIREMENT:
        return REQUIREMENT_EDEFAULT == null ? requirement != null : !REQUIREMENT_EDEFAULT.equals(requirement);
      case HazardAnalysisPackage.REQUIREMENT__DESIGNS:
        return designs != null && !designs.isEmpty();
      case HazardAnalysisPackage.REQUIREMENT__NOTES:
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
    result.append(" (requirement: ");
    result.append(requirement);
    result.append(')');
    return result.toString();
  }

} //RequirementImpl
