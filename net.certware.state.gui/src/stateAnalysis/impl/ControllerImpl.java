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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stateAnalysis.Controller;
import stateAnalysis.HardwareCommand;
import stateAnalysis.StateAnalysisPackage;
import stateAnalysis.StateConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link stateAnalysis.impl.ControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link stateAnalysis.impl.ControllerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link stateAnalysis.impl.ControllerImpl#getDelegates <em>Delegates</em>}</li>
 *   <li>{@link stateAnalysis.impl.ControllerImpl#getStateConstraint <em>State Constraint</em>}</li>
 *   <li>{@link stateAnalysis.impl.ControllerImpl#getHardwareCommand <em>Hardware Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerImpl extends EObjectImpl implements Controller
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
   * The cached value of the '{@link #getDelegates() <em>Delegates</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelegates()
   * @generated
   * @ordered
   */
  protected EList<Controller> delegates;

  /**
   * The cached value of the '{@link #getStateConstraint() <em>State Constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateConstraint()
   * @generated
   * @ordered
   */
  protected EList<StateConstraint> stateConstraint;

  /**
   * The cached value of the '{@link #getHardwareCommand() <em>Hardware Command</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHardwareCommand()
   * @generated
   * @ordered
   */
  protected EList<HardwareCommand> hardwareCommand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControllerImpl()
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
    return StateAnalysisPackage.Literals.CONTROLLER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.CONTROLLER__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.CONTROLLER__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Controller> getDelegates()
  {
    if (delegates == null)
    {
      delegates = new EObjectResolvingEList<Controller>(Controller.class, this, StateAnalysisPackage.CONTROLLER__DELEGATES);
    }
    return delegates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StateConstraint> getStateConstraint()
  {
    if (stateConstraint == null)
    {
      stateConstraint = new EObjectContainmentEList<StateConstraint>(StateConstraint.class, this, StateAnalysisPackage.CONTROLLER__STATE_CONSTRAINT);
    }
    return stateConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<HardwareCommand> getHardwareCommand()
  {
    if (hardwareCommand == null)
    {
      hardwareCommand = new EObjectContainmentEList<HardwareCommand>(HardwareCommand.class, this, StateAnalysisPackage.CONTROLLER__HARDWARE_COMMAND);
    }
    return hardwareCommand;
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
      case StateAnalysisPackage.CONTROLLER__STATE_CONSTRAINT:
        return ((InternalEList<?>)getStateConstraint()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.CONTROLLER__HARDWARE_COMMAND:
        return ((InternalEList<?>)getHardwareCommand()).basicRemove(otherEnd, msgs);
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
      case StateAnalysisPackage.CONTROLLER__NAME:
        return getName();
      case StateAnalysisPackage.CONTROLLER__DESCRIPTION:
        return getDescription();
      case StateAnalysisPackage.CONTROLLER__DELEGATES:
        return getDelegates();
      case StateAnalysisPackage.CONTROLLER__STATE_CONSTRAINT:
        return getStateConstraint();
      case StateAnalysisPackage.CONTROLLER__HARDWARE_COMMAND:
        return getHardwareCommand();
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
      case StateAnalysisPackage.CONTROLLER__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.CONTROLLER__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case StateAnalysisPackage.CONTROLLER__DELEGATES:
        getDelegates().clear();
        getDelegates().addAll((Collection<? extends Controller>)newValue);
        return;
      case StateAnalysisPackage.CONTROLLER__STATE_CONSTRAINT:
        getStateConstraint().clear();
        getStateConstraint().addAll((Collection<? extends StateConstraint>)newValue);
        return;
      case StateAnalysisPackage.CONTROLLER__HARDWARE_COMMAND:
        getHardwareCommand().clear();
        getHardwareCommand().addAll((Collection<? extends HardwareCommand>)newValue);
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
      case StateAnalysisPackage.CONTROLLER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.CONTROLLER__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case StateAnalysisPackage.CONTROLLER__DELEGATES:
        getDelegates().clear();
        return;
      case StateAnalysisPackage.CONTROLLER__STATE_CONSTRAINT:
        getStateConstraint().clear();
        return;
      case StateAnalysisPackage.CONTROLLER__HARDWARE_COMMAND:
        getHardwareCommand().clear();
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
      case StateAnalysisPackage.CONTROLLER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.CONTROLLER__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case StateAnalysisPackage.CONTROLLER__DELEGATES:
        return delegates != null && !delegates.isEmpty();
      case StateAnalysisPackage.CONTROLLER__STATE_CONSTRAINT:
        return stateConstraint != null && !stateConstraint.isEmpty();
      case StateAnalysisPackage.CONTROLLER__HARDWARE_COMMAND:
        return hardwareCommand != null && !hardwareCommand.isEmpty();
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

} //ControllerImpl
