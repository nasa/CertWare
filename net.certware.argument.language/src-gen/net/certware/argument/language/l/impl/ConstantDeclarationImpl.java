/**
 */
package net.certware.argument.language.l.impl;

import net.certware.argument.language.l.ConstantDeclaration;
import net.certware.argument.language.l.GroundArithmeticTerm;
import net.certware.argument.language.l.LPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.certware.argument.language.l.impl.ConstantDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.argument.language.l.impl.ConstantDeclarationImpl#getCv <em>Cv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantDeclarationImpl extends StatementImpl implements ConstantDeclaration
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
   * The cached value of the '{@link #getCv() <em>Cv</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCv()
   * @generated
   * @ordered
   */
  protected GroundArithmeticTerm cv;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantDeclarationImpl()
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
    return LPackage.Literals.CONSTANT_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.CONSTANT_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroundArithmeticTerm getCv()
  {
    return cv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCv(GroundArithmeticTerm newCv, NotificationChain msgs)
  {
    GroundArithmeticTerm oldCv = cv;
    cv = newCv;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LPackage.CONSTANT_DECLARATION__CV, oldCv, newCv);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCv(GroundArithmeticTerm newCv)
  {
    if (newCv != cv)
    {
      NotificationChain msgs = null;
      if (cv != null)
        msgs = ((InternalEObject)cv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LPackage.CONSTANT_DECLARATION__CV, null, msgs);
      if (newCv != null)
        msgs = ((InternalEObject)newCv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LPackage.CONSTANT_DECLARATION__CV, null, msgs);
      msgs = basicSetCv(newCv, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LPackage.CONSTANT_DECLARATION__CV, newCv, newCv));
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
      case LPackage.CONSTANT_DECLARATION__CV:
        return basicSetCv(null, msgs);
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
      case LPackage.CONSTANT_DECLARATION__NAME:
        return getName();
      case LPackage.CONSTANT_DECLARATION__CV:
        return getCv();
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
      case LPackage.CONSTANT_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case LPackage.CONSTANT_DECLARATION__CV:
        setCv((GroundArithmeticTerm)newValue);
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
      case LPackage.CONSTANT_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LPackage.CONSTANT_DECLARATION__CV:
        setCv((GroundArithmeticTerm)null);
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
      case LPackage.CONSTANT_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LPackage.CONSTANT_DECLARATION__CV:
        return cv != null;
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

} //ConstantDeclarationImpl
