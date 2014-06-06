/**
 */
package stateAnalysis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateAnalysis.StateAnalysisPackage;
import stateAnalysis.StateConstraint;
import stateAnalysis.StateUpdate;
import stateAnalysis.StateVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link stateAnalysis.impl.StateVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link stateAnalysis.impl.StateVariableImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link stateAnalysis.impl.StateVariableImpl#getRepresentationType <em>Representation Type</em>}</li>
 *   <li>{@link stateAnalysis.impl.StateVariableImpl#getInStateConstraints <em>In State Constraints</em>}</li>
 *   <li>{@link stateAnalysis.impl.StateVariableImpl#getOutStateConstraints <em>Out State Constraints</em>}</li>
 *   <li>{@link stateAnalysis.impl.StateVariableImpl#getStateUpdates <em>State Updates</em>}</li>
 *   <li>{@link stateAnalysis.impl.StateVariableImpl#getInfluencedBy <em>Influenced By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateVariableImpl extends EObjectImpl implements StateVariable
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
   * The default value of the '{@link #getRepresentationType() <em>Representation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresentationType()
   * @generated
   * @ordered
   */
  protected static final String REPRESENTATION_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRepresentationType() <em>Representation Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepresentationType()
   * @generated
   * @ordered
   */
  protected String representationType = REPRESENTATION_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getInStateConstraints() <em>In State Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInStateConstraints()
   * @generated
   * @ordered
   */
  protected EList<StateConstraint> inStateConstraints;

  /**
   * The cached value of the '{@link #getOutStateConstraints() <em>Out State Constraints</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutStateConstraints()
   * @generated
   * @ordered
   */
  protected EList<StateConstraint> outStateConstraints;

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
   * The cached value of the '{@link #getInfluencedBy() <em>Influenced By</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfluencedBy()
   * @generated
   * @ordered
   */
  protected EList<StateVariable> influencedBy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateVariableImpl()
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
    return StateAnalysisPackage.Literals.STATE_VARIABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.STATE_VARIABLE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.STATE_VARIABLE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRepresentationType()
  {
    return representationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepresentationType(String newRepresentationType)
  {
    String oldRepresentationType = representationType;
    representationType = newRepresentationType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.STATE_VARIABLE__REPRESENTATION_TYPE, oldRepresentationType, representationType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateConstraint> getInStateConstraints()
  {
    if (inStateConstraints == null)
    {
      inStateConstraints = new EObjectContainmentEList<StateConstraint>(StateConstraint.class, this, StateAnalysisPackage.STATE_VARIABLE__IN_STATE_CONSTRAINTS);
    }
    return inStateConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateConstraint> getOutStateConstraints()
  {
    if (outStateConstraints == null)
    {
      outStateConstraints = new EObjectContainmentEList<StateConstraint>(StateConstraint.class, this, StateAnalysisPackage.STATE_VARIABLE__OUT_STATE_CONSTRAINTS);
    }
    return outStateConstraints;
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
      stateUpdates = new EObjectContainmentEList<StateUpdate>(StateUpdate.class, this, StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES);
    }
    return stateUpdates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateVariable> getInfluencedBy()
  {
    if (influencedBy == null)
    {
      influencedBy = new EObjectContainmentEList<StateVariable>(StateVariable.class, this, StateAnalysisPackage.STATE_VARIABLE__INFLUENCED_BY);
    }
    return influencedBy;
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
      case StateAnalysisPackage.STATE_VARIABLE__IN_STATE_CONSTRAINTS:
        return ((InternalEList<?>)getInStateConstraints()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.STATE_VARIABLE__OUT_STATE_CONSTRAINTS:
        return ((InternalEList<?>)getOutStateConstraints()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        return ((InternalEList<?>)getStateUpdates()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.STATE_VARIABLE__INFLUENCED_BY:
        return ((InternalEList<?>)getInfluencedBy()).basicRemove(otherEnd, msgs);
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
      case StateAnalysisPackage.STATE_VARIABLE__NAME:
        return getName();
      case StateAnalysisPackage.STATE_VARIABLE__DESCRIPTION:
        return getDescription();
      case StateAnalysisPackage.STATE_VARIABLE__REPRESENTATION_TYPE:
        return getRepresentationType();
      case StateAnalysisPackage.STATE_VARIABLE__IN_STATE_CONSTRAINTS:
        return getInStateConstraints();
      case StateAnalysisPackage.STATE_VARIABLE__OUT_STATE_CONSTRAINTS:
        return getOutStateConstraints();
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        return getStateUpdates();
      case StateAnalysisPackage.STATE_VARIABLE__INFLUENCED_BY:
        return getInfluencedBy();
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
      case StateAnalysisPackage.STATE_VARIABLE__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__REPRESENTATION_TYPE:
        setRepresentationType((String)newValue);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__IN_STATE_CONSTRAINTS:
        getInStateConstraints().clear();
        getInStateConstraints().addAll((Collection<? extends StateConstraint>)newValue);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__OUT_STATE_CONSTRAINTS:
        getOutStateConstraints().clear();
        getOutStateConstraints().addAll((Collection<? extends StateConstraint>)newValue);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        getStateUpdates().clear();
        getStateUpdates().addAll((Collection<? extends StateUpdate>)newValue);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__INFLUENCED_BY:
        getInfluencedBy().clear();
        getInfluencedBy().addAll((Collection<? extends StateVariable>)newValue);
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
      case StateAnalysisPackage.STATE_VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__REPRESENTATION_TYPE:
        setRepresentationType(REPRESENTATION_TYPE_EDEFAULT);
        return;
      case StateAnalysisPackage.STATE_VARIABLE__IN_STATE_CONSTRAINTS:
        getInStateConstraints().clear();
        return;
      case StateAnalysisPackage.STATE_VARIABLE__OUT_STATE_CONSTRAINTS:
        getOutStateConstraints().clear();
        return;
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        getStateUpdates().clear();
        return;
      case StateAnalysisPackage.STATE_VARIABLE__INFLUENCED_BY:
        getInfluencedBy().clear();
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
      case StateAnalysisPackage.STATE_VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.STATE_VARIABLE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case StateAnalysisPackage.STATE_VARIABLE__REPRESENTATION_TYPE:
        return REPRESENTATION_TYPE_EDEFAULT == null ? representationType != null : !REPRESENTATION_TYPE_EDEFAULT.equals(representationType);
      case StateAnalysisPackage.STATE_VARIABLE__IN_STATE_CONSTRAINTS:
        return inStateConstraints != null && !inStateConstraints.isEmpty();
      case StateAnalysisPackage.STATE_VARIABLE__OUT_STATE_CONSTRAINTS:
        return outStateConstraints != null && !outStateConstraints.isEmpty();
      case StateAnalysisPackage.STATE_VARIABLE__STATE_UPDATES:
        return stateUpdates != null && !stateUpdates.isEmpty();
      case StateAnalysisPackage.STATE_VARIABLE__INFLUENCED_BY:
        return influencedBy != null && !influencedBy.isEmpty();
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
    result.append(", representationType: ");
    result.append(representationType);
    result.append(')');
    return result.toString();
  }

} //StateVariableImpl
