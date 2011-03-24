/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2011 Kestrel Technology LLC (generated models) 
 */
package net.certware.evidence.evidence.impl;

import java.util.Date;

import net.certware.evidence.evidence.AtTime;
import net.certware.evidence.evidence.EvidencePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>At Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.AtTimeImpl#getDateTtime <em>Date Ttime</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtTimeImpl extends TimingPropertyImpl implements AtTime {
	/**
	 * The default value of the '{@link #getDateTtime() <em>Date Ttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTtime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTtime() <em>Date Ttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTtime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTtime = DATE_TTIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.AT_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTtime() {
		return dateTtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTtime(Date newDateTtime) {
		Date oldDateTtime = dateTtime;
		dateTtime = newDateTtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.AT_TIME__DATE_TTIME, oldDateTtime, dateTtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.AT_TIME__DATE_TTIME:
				return getDateTtime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EvidencePackage.AT_TIME__DATE_TTIME:
				setDateTtime((Date)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EvidencePackage.AT_TIME__DATE_TTIME:
				setDateTtime(DATE_TTIME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EvidencePackage.AT_TIME__DATE_TTIME:
				return DATE_TTIME_EDEFAULT == null ? dateTtime != null : !DATE_TTIME_EDEFAULT.equals(dateTtime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dateTtime: "); //$NON-NLS-1$
		result.append(dateTtime);
		result.append(')');
		return result.toString();
	}

} //AtTimeImpl
