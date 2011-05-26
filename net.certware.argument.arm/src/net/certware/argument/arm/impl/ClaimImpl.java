/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.argument.arm.impl;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.Claim;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.arm.impl.ClaimImpl#isAssumed <em>Assumed</em>}</li>
 *   <li>{@link net.certware.argument.arm.impl.ClaimImpl#isToBeSupported <em>To Be Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimImpl extends ReasoningElementImpl implements Claim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved. (generated models) "; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #isAssumed() <em>Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssumed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSUMED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssumed() <em>Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssumed()
	 * @generated
	 * @ordered
	 */
	protected boolean assumed = ASSUMED_EDEFAULT;

	/**
	 * The default value of the '{@link #isToBeSupported() <em>To Be Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeSupported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TO_BE_SUPPORTED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isToBeSupported() <em>To Be Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isToBeSupported()
	 * @generated
	 * @ordered
	 */
	protected boolean toBeSupported = TO_BE_SUPPORTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArmPackage.Literals.CLAIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssumed() {
		return assumed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssumed(boolean newAssumed) {
		boolean oldAssumed = assumed;
		assumed = newAssumed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArmPackage.CLAIM__ASSUMED, oldAssumed, assumed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToBeSupported() {
		return toBeSupported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeSupported(boolean newToBeSupported) {
		boolean oldToBeSupported = toBeSupported;
		toBeSupported = newToBeSupported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArmPackage.CLAIM__TO_BE_SUPPORTED, oldToBeSupported, toBeSupported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArmPackage.CLAIM__ASSUMED:
				return isAssumed();
			case ArmPackage.CLAIM__TO_BE_SUPPORTED:
				return isToBeSupported();
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
			case ArmPackage.CLAIM__ASSUMED:
				setAssumed((Boolean)newValue);
				return;
			case ArmPackage.CLAIM__TO_BE_SUPPORTED:
				setToBeSupported((Boolean)newValue);
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
			case ArmPackage.CLAIM__ASSUMED:
				setAssumed(ASSUMED_EDEFAULT);
				return;
			case ArmPackage.CLAIM__TO_BE_SUPPORTED:
				setToBeSupported(TO_BE_SUPPORTED_EDEFAULT);
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
			case ArmPackage.CLAIM__ASSUMED:
				return assumed != ASSUMED_EDEFAULT;
			case ArmPackage.CLAIM__TO_BE_SUPPORTED:
				return toBeSupported != TO_BE_SUPPORTED_EDEFAULT;
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
		result.append(" (assumed: "); //$NON-NLS-1$
		result.append(assumed);
		result.append(", toBeSupported: "); //$NON-NLS-1$
		result.append(toBeSupported);
		result.append(')');
		return result.toString();
	}

} //ClaimImpl
