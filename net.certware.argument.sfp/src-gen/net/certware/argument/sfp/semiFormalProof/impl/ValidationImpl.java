/**
 */
package net.certware.argument.sfp.semiFormalProof.impl;

import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;
import net.certware.argument.sfp.semiFormalProof.Validation;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.ValidationImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.ValidationImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.ValidationImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidationImpl extends MinimalEObjectImpl.Container implements Validation
{
  /**
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected static final String AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected String author = AUTHOR_EDEFAULT;

  /**
   * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeStamp()
   * @generated
   * @ordered
   */
  protected static final String TIME_STAMP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeStamp()
   * @generated
   * @ordered
   */
  protected String timeStamp = TIME_STAMP_EDEFAULT;

  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final ValidationKind STATE_EDEFAULT = ValidationKind.UNKNOWN;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected ValidationKind state = STATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValidationImpl()
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
    return SemiFormalProofPackage.Literals.VALIDATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(String newAuthor)
  {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.VALIDATION__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimeStamp()
  {
    return timeStamp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeStamp(String newTimeStamp)
  {
    String oldTimeStamp = timeStamp;
    timeStamp = newTimeStamp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.VALIDATION__TIME_STAMP, oldTimeStamp, timeStamp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidationKind getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(ValidationKind newState)
  {
    ValidationKind oldState = state;
    state = newState == null ? STATE_EDEFAULT : newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.VALIDATION__STATE, oldState, state));
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
      case SemiFormalProofPackage.VALIDATION__AUTHOR:
        return getAuthor();
      case SemiFormalProofPackage.VALIDATION__TIME_STAMP:
        return getTimeStamp();
      case SemiFormalProofPackage.VALIDATION__STATE:
        return getState();
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
      case SemiFormalProofPackage.VALIDATION__AUTHOR:
        setAuthor((String)newValue);
        return;
      case SemiFormalProofPackage.VALIDATION__TIME_STAMP:
        setTimeStamp((String)newValue);
        return;
      case SemiFormalProofPackage.VALIDATION__STATE:
        setState((ValidationKind)newValue);
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
      case SemiFormalProofPackage.VALIDATION__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case SemiFormalProofPackage.VALIDATION__TIME_STAMP:
        setTimeStamp(TIME_STAMP_EDEFAULT);
        return;
      case SemiFormalProofPackage.VALIDATION__STATE:
        setState(STATE_EDEFAULT);
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
      case SemiFormalProofPackage.VALIDATION__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case SemiFormalProofPackage.VALIDATION__TIME_STAMP:
        return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
      case SemiFormalProofPackage.VALIDATION__STATE:
        return state != STATE_EDEFAULT;
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
    result.append(" (author: ");
    result.append(author);
    result.append(", timeStamp: ");
    result.append(timeStamp);
    result.append(", state: ");
    result.append(state);
    result.append(')');
    return result.toString();
  }

} //ValidationImpl
