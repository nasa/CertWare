/**
 */
package net.certware.argument.sfp.semiFormalProof.impl;

import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.Validation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.StatementImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.StatementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.StatementImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link net.certware.argument.sfp.semiFormalProof.impl.StatementImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected static final String STATEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected String statement = STATEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getJustification() <em>Justification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJustification()
   * @generated
   * @ordered
   */
  protected Justifications justification;

  /**
   * The cached value of the '{@link #getValidation() <em>Validation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidation()
   * @generated
   * @ordered
   */
  protected Validation validation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatementImpl()
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
    return SemiFormalProofPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.STATEMENT__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(String newStatement)
  {
    String oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.STATEMENT__STATEMENT, oldStatement, statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Justifications getJustification()
  {
    return justification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJustification(Justifications newJustification, NotificationChain msgs)
  {
    Justifications oldJustification = justification;
    justification = newJustification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.STATEMENT__JUSTIFICATION, oldJustification, newJustification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJustification(Justifications newJustification)
  {
    if (newJustification != justification)
    {
      NotificationChain msgs = null;
      if (justification != null)
        msgs = ((InternalEObject)justification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.STATEMENT__JUSTIFICATION, null, msgs);
      if (newJustification != null)
        msgs = ((InternalEObject)newJustification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.STATEMENT__JUSTIFICATION, null, msgs);
      msgs = basicSetJustification(newJustification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.STATEMENT__JUSTIFICATION, newJustification, newJustification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Validation getValidation()
  {
    return validation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValidation(Validation newValidation, NotificationChain msgs)
  {
    Validation oldValidation = validation;
    validation = newValidation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.STATEMENT__VALIDATION, oldValidation, newValidation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidation(Validation newValidation)
  {
    if (newValidation != validation)
    {
      NotificationChain msgs = null;
      if (validation != null)
        msgs = ((InternalEObject)validation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.STATEMENT__VALIDATION, null, msgs);
      if (newValidation != null)
        msgs = ((InternalEObject)newValidation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SemiFormalProofPackage.STATEMENT__VALIDATION, null, msgs);
      msgs = basicSetValidation(newValidation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SemiFormalProofPackage.STATEMENT__VALIDATION, newValidation, newValidation));
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
      case SemiFormalProofPackage.STATEMENT__JUSTIFICATION:
        return basicSetJustification(null, msgs);
      case SemiFormalProofPackage.STATEMENT__VALIDATION:
        return basicSetValidation(null, msgs);
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
      case SemiFormalProofPackage.STATEMENT__ID:
        return getId();
      case SemiFormalProofPackage.STATEMENT__STATEMENT:
        return getStatement();
      case SemiFormalProofPackage.STATEMENT__JUSTIFICATION:
        return getJustification();
      case SemiFormalProofPackage.STATEMENT__VALIDATION:
        return getValidation();
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
      case SemiFormalProofPackage.STATEMENT__ID:
        setId((String)newValue);
        return;
      case SemiFormalProofPackage.STATEMENT__STATEMENT:
        setStatement((String)newValue);
        return;
      case SemiFormalProofPackage.STATEMENT__JUSTIFICATION:
        setJustification((Justifications)newValue);
        return;
      case SemiFormalProofPackage.STATEMENT__VALIDATION:
        setValidation((Validation)newValue);
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
      case SemiFormalProofPackage.STATEMENT__ID:
        setId(ID_EDEFAULT);
        return;
      case SemiFormalProofPackage.STATEMENT__STATEMENT:
        setStatement(STATEMENT_EDEFAULT);
        return;
      case SemiFormalProofPackage.STATEMENT__JUSTIFICATION:
        setJustification((Justifications)null);
        return;
      case SemiFormalProofPackage.STATEMENT__VALIDATION:
        setValidation((Validation)null);
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
      case SemiFormalProofPackage.STATEMENT__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case SemiFormalProofPackage.STATEMENT__STATEMENT:
        return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
      case SemiFormalProofPackage.STATEMENT__JUSTIFICATION:
        return justification != null;
      case SemiFormalProofPackage.STATEMENT__VALIDATION:
        return validation != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", statement: ");
    result.append(statement);
    result.append(')');
    return result.toString();
  }

} //StatementImpl
