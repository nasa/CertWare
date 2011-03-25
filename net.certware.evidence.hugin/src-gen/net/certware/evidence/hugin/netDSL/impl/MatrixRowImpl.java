/**
 * <copyright>
 * </copyright>
 *
 */
package net.certware.evidence.hugin.netDSL.impl;

import java.util.Collection;

import net.certware.evidence.hugin.netDSL.MatrixRow;
import net.certware.evidence.hugin.netDSL.NetDSLPackage;

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
 * An implementation of the model object '<em><b>Matrix Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl#getR5 <em>R5</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl#getR4 <em>R4</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl#getR3 <em>R3</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl#getR2 <em>R2</em>}</li>
 *   <li>{@link net.certware.evidence.hugin.netDSL.impl.MatrixRowImpl#getR1 <em>R1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixRowImpl extends MinimalEObjectImpl.Container implements MatrixRow
{
  /**
   * The cached value of the '{@link #getR5() <em>R5</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR5()
   * @generated
   * @ordered
   */
  protected EList<MatrixRow> r5;

  /**
   * The cached value of the '{@link #getR4() <em>R4</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR4()
   * @generated
   * @ordered
   */
  protected EList<MatrixRow> r4;

  /**
   * The cached value of the '{@link #getR3() <em>R3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR3()
   * @generated
   * @ordered
   */
  protected EList<MatrixRow> r3;

  /**
   * The cached value of the '{@link #getR2() <em>R2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR2()
   * @generated
   * @ordered
   */
  protected EList<MatrixRow> r2;

  /**
   * The cached value of the '{@link #getR1() <em>R1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR1()
   * @generated
   * @ordered
   */
  protected MatrixRow r1;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MatrixRowImpl()
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
    return NetDSLPackage.Literals.MATRIX_ROW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatrixRow> getR5()
  {
    if (r5 == null)
    {
      r5 = new EObjectContainmentEList<MatrixRow>(MatrixRow.class, this, NetDSLPackage.MATRIX_ROW__R5);
    }
    return r5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatrixRow> getR4()
  {
    if (r4 == null)
    {
      r4 = new EObjectContainmentEList<MatrixRow>(MatrixRow.class, this, NetDSLPackage.MATRIX_ROW__R4);
    }
    return r4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatrixRow> getR3()
  {
    if (r3 == null)
    {
      r3 = new EObjectContainmentEList<MatrixRow>(MatrixRow.class, this, NetDSLPackage.MATRIX_ROW__R3);
    }
    return r3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MatrixRow> getR2()
  {
    if (r2 == null)
    {
      r2 = new EObjectContainmentEList<MatrixRow>(MatrixRow.class, this, NetDSLPackage.MATRIX_ROW__R2);
    }
    return r2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MatrixRow getR1()
  {
    return r1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR1(MatrixRow newR1, NotificationChain msgs)
  {
    MatrixRow oldR1 = r1;
    r1 = newR1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NetDSLPackage.MATRIX_ROW__R1, oldR1, newR1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setR1(MatrixRow newR1)
  {
    if (newR1 != r1)
    {
      NotificationChain msgs = null;
      if (r1 != null)
        msgs = ((InternalEObject)r1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.MATRIX_ROW__R1, null, msgs);
      if (newR1 != null)
        msgs = ((InternalEObject)newR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NetDSLPackage.MATRIX_ROW__R1, null, msgs);
      msgs = basicSetR1(newR1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetDSLPackage.MATRIX_ROW__R1, newR1, newR1));
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
      case NetDSLPackage.MATRIX_ROW__R5:
        return ((InternalEList<?>)getR5()).basicRemove(otherEnd, msgs);
      case NetDSLPackage.MATRIX_ROW__R4:
        return ((InternalEList<?>)getR4()).basicRemove(otherEnd, msgs);
      case NetDSLPackage.MATRIX_ROW__R3:
        return ((InternalEList<?>)getR3()).basicRemove(otherEnd, msgs);
      case NetDSLPackage.MATRIX_ROW__R2:
        return ((InternalEList<?>)getR2()).basicRemove(otherEnd, msgs);
      case NetDSLPackage.MATRIX_ROW__R1:
        return basicSetR1(null, msgs);
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
      case NetDSLPackage.MATRIX_ROW__R5:
        return getR5();
      case NetDSLPackage.MATRIX_ROW__R4:
        return getR4();
      case NetDSLPackage.MATRIX_ROW__R3:
        return getR3();
      case NetDSLPackage.MATRIX_ROW__R2:
        return getR2();
      case NetDSLPackage.MATRIX_ROW__R1:
        return getR1();
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
      case NetDSLPackage.MATRIX_ROW__R5:
        getR5().clear();
        getR5().addAll((Collection<? extends MatrixRow>)newValue);
        return;
      case NetDSLPackage.MATRIX_ROW__R4:
        getR4().clear();
        getR4().addAll((Collection<? extends MatrixRow>)newValue);
        return;
      case NetDSLPackage.MATRIX_ROW__R3:
        getR3().clear();
        getR3().addAll((Collection<? extends MatrixRow>)newValue);
        return;
      case NetDSLPackage.MATRIX_ROW__R2:
        getR2().clear();
        getR2().addAll((Collection<? extends MatrixRow>)newValue);
        return;
      case NetDSLPackage.MATRIX_ROW__R1:
        setR1((MatrixRow)newValue);
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
      case NetDSLPackage.MATRIX_ROW__R5:
        getR5().clear();
        return;
      case NetDSLPackage.MATRIX_ROW__R4:
        getR4().clear();
        return;
      case NetDSLPackage.MATRIX_ROW__R3:
        getR3().clear();
        return;
      case NetDSLPackage.MATRIX_ROW__R2:
        getR2().clear();
        return;
      case NetDSLPackage.MATRIX_ROW__R1:
        setR1((MatrixRow)null);
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
      case NetDSLPackage.MATRIX_ROW__R5:
        return r5 != null && !r5.isEmpty();
      case NetDSLPackage.MATRIX_ROW__R4:
        return r4 != null && !r4.isEmpty();
      case NetDSLPackage.MATRIX_ROW__R3:
        return r3 != null && !r3.isEmpty();
      case NetDSLPackage.MATRIX_ROW__R2:
        return r2 != null && !r2.isEmpty();
      case NetDSLPackage.MATRIX_ROW__R1:
        return r1 != null;
    }
    return super.eIsSet(featureID);
  }

} //MatrixRowImpl
