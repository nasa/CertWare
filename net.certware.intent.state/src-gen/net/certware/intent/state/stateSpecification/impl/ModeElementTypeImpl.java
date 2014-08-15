/**
 */
package net.certware.intent.state.stateSpecification.impl;

import net.certware.intent.state.stateSpecification.ModeElementType;
import net.certware.intent.state.stateSpecification.StateSpecificationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.intent.state.stateSpecification.impl.ModeElementTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeElementTypeImpl extends MinimalEObjectImpl.Container implements ModeElementType
{
  /**
   * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected String elementType = ELEMENT_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModeElementTypeImpl()
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
    return StateSpecificationPackage.Literals.MODE_ELEMENT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(String newElementType)
  {
    String oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StateSpecificationPackage.MODE_ELEMENT_TYPE__ELEMENT_TYPE, oldElementType, elementType));
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
      case StateSpecificationPackage.MODE_ELEMENT_TYPE__ELEMENT_TYPE:
        return getElementType();
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
      case StateSpecificationPackage.MODE_ELEMENT_TYPE__ELEMENT_TYPE:
        setElementType((String)newValue);
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
      case StateSpecificationPackage.MODE_ELEMENT_TYPE__ELEMENT_TYPE:
        setElementType(ELEMENT_TYPE_EDEFAULT);
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
      case StateSpecificationPackage.MODE_ELEMENT_TYPE__ELEMENT_TYPE:
        return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
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
    result.append(" (elementType: ");
    result.append(elementType);
    result.append(')');
    return result.toString();
  }

} //ModeElementTypeImpl
