/**
 */
package net.certware.hazard.stpa.hazardAnalysis.impl;

import java.util.Collection;

import net.certware.hazard.stpa.hazardAnalysis.Hazard;
import net.certware.hazard.stpa.hazardAnalysis.HazardAnalysisPackage;
import net.certware.hazard.stpa.hazardAnalysis.Incident;
import net.certware.hazard.stpa.hazardAnalysis.Note;

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
 * An implementation of the model object '<em><b>Incident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.IncidentImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.IncidentImpl#getRanking <em>Ranking</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.IncidentImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link net.certware.hazard.stpa.hazardAnalysis.impl.IncidentImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncidentImpl extends MinimalEObjectImpl.Container implements Incident
{
  /**
   * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected static final String DESC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesc()
   * @generated
   * @ordered
   */
  protected String desc = DESC_EDEFAULT;

  /**
   * The default value of the '{@link #getRanking() <em>Ranking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRanking()
   * @generated
   * @ordered
   */
  protected static final String RANKING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRanking() <em>Ranking</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRanking()
   * @generated
   * @ordered
   */
  protected String ranking = RANKING_EDEFAULT;

  /**
   * The cached value of the '{@link #getHazards() <em>Hazards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHazards()
   * @generated
   * @ordered
   */
  protected EList<Hazard> hazards;

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
  protected IncidentImpl()
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
    return HazardAnalysisPackage.Literals.INCIDENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDesc()
  {
    return desc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesc(String newDesc)
  {
    String oldDesc = desc;
    desc = newDesc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.INCIDENT__DESC, oldDesc, desc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRanking()
  {
    return ranking;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRanking(String newRanking)
  {
    String oldRanking = ranking;
    ranking = newRanking;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HazardAnalysisPackage.INCIDENT__RANKING, oldRanking, ranking));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Hazard> getHazards()
  {
    if (hazards == null)
    {
      hazards = new EObjectContainmentEList<Hazard>(Hazard.class, this, HazardAnalysisPackage.INCIDENT__HAZARDS);
    }
    return hazards;
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
      notes = new EObjectContainmentEList<Note>(Note.class, this, HazardAnalysisPackage.INCIDENT__NOTES);
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
      case HazardAnalysisPackage.INCIDENT__HAZARDS:
        return ((InternalEList<?>)getHazards()).basicRemove(otherEnd, msgs);
      case HazardAnalysisPackage.INCIDENT__NOTES:
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
      case HazardAnalysisPackage.INCIDENT__DESC:
        return getDesc();
      case HazardAnalysisPackage.INCIDENT__RANKING:
        return getRanking();
      case HazardAnalysisPackage.INCIDENT__HAZARDS:
        return getHazards();
      case HazardAnalysisPackage.INCIDENT__NOTES:
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
      case HazardAnalysisPackage.INCIDENT__DESC:
        setDesc((String)newValue);
        return;
      case HazardAnalysisPackage.INCIDENT__RANKING:
        setRanking((String)newValue);
        return;
      case HazardAnalysisPackage.INCIDENT__HAZARDS:
        getHazards().clear();
        getHazards().addAll((Collection<? extends Hazard>)newValue);
        return;
      case HazardAnalysisPackage.INCIDENT__NOTES:
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
      case HazardAnalysisPackage.INCIDENT__DESC:
        setDesc(DESC_EDEFAULT);
        return;
      case HazardAnalysisPackage.INCIDENT__RANKING:
        setRanking(RANKING_EDEFAULT);
        return;
      case HazardAnalysisPackage.INCIDENT__HAZARDS:
        getHazards().clear();
        return;
      case HazardAnalysisPackage.INCIDENT__NOTES:
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
      case HazardAnalysisPackage.INCIDENT__DESC:
        return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
      case HazardAnalysisPackage.INCIDENT__RANKING:
        return RANKING_EDEFAULT == null ? ranking != null : !RANKING_EDEFAULT.equals(ranking);
      case HazardAnalysisPackage.INCIDENT__HAZARDS:
        return hazards != null && !hazards.isEmpty();
      case HazardAnalysisPackage.INCIDENT__NOTES:
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
    result.append(" (desc: ");
    result.append(desc);
    result.append(", ranking: ");
    result.append(ranking);
    result.append(')');
    return result.toString();
  }

} //IncidentImpl
