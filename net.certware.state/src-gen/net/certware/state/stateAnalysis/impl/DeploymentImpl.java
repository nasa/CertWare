/**
 */
package net.certware.state.stateAnalysis.impl;

import java.util.Collection;

import net.certware.state.stateAnalysis.Component;
import net.certware.state.stateAnalysis.DataCollection;
import net.certware.state.stateAnalysis.Deployment;
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
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DeploymentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DeploymentImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link net.certware.state.stateAnalysis.impl.DeploymentImpl#getCatalogs <em>Catalogs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment
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
   * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponents()
   * @generated
   * @ordered
   */
  protected EList<Component> components;

  /**
   * The cached value of the '{@link #getCatalogs() <em>Catalogs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCatalogs()
   * @generated
   * @ordered
   */
  protected EList<DataCollection> catalogs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeploymentImpl()
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
    return StateAnalysisPackage.Literals.DEPLOYMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DEPLOYMENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, StateAnalysisPackage.DEPLOYMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Component> getComponents()
  {
    if (components == null)
    {
      components = new EObjectContainmentEList<Component>(Component.class, this, StateAnalysisPackage.DEPLOYMENT__COMPONENTS);
    }
    return components;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataCollection> getCatalogs()
  {
    if (catalogs == null)
    {
      catalogs = new EObjectContainmentEList<DataCollection>(DataCollection.class, this, StateAnalysisPackage.DEPLOYMENT__CATALOGS);
    }
    return catalogs;
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
      case StateAnalysisPackage.DEPLOYMENT__COMPONENTS:
        return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
      case StateAnalysisPackage.DEPLOYMENT__CATALOGS:
        return ((InternalEList<?>)getCatalogs()).basicRemove(otherEnd, msgs);
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
      case StateAnalysisPackage.DEPLOYMENT__NAME:
        return getName();
      case StateAnalysisPackage.DEPLOYMENT__DESCRIPTION:
        return getDescription();
      case StateAnalysisPackage.DEPLOYMENT__COMPONENTS:
        return getComponents();
      case StateAnalysisPackage.DEPLOYMENT__CATALOGS:
        return getCatalogs();
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
      case StateAnalysisPackage.DEPLOYMENT__NAME:
        setName((String)newValue);
        return;
      case StateAnalysisPackage.DEPLOYMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case StateAnalysisPackage.DEPLOYMENT__COMPONENTS:
        getComponents().clear();
        getComponents().addAll((Collection<? extends Component>)newValue);
        return;
      case StateAnalysisPackage.DEPLOYMENT__CATALOGS:
        getCatalogs().clear();
        getCatalogs().addAll((Collection<? extends DataCollection>)newValue);
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
      case StateAnalysisPackage.DEPLOYMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case StateAnalysisPackage.DEPLOYMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case StateAnalysisPackage.DEPLOYMENT__COMPONENTS:
        getComponents().clear();
        return;
      case StateAnalysisPackage.DEPLOYMENT__CATALOGS:
        getCatalogs().clear();
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
      case StateAnalysisPackage.DEPLOYMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case StateAnalysisPackage.DEPLOYMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case StateAnalysisPackage.DEPLOYMENT__COMPONENTS:
        return components != null && !components.isEmpty();
      case StateAnalysisPackage.DEPLOYMENT__CATALOGS:
        return catalogs != null && !catalogs.isEmpty();
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

} //DeploymentImpl
