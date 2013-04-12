/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.impl;

import net.certware.measurement.sco.ChangeOrderCount;
import net.certware.measurement.sco.ChangeOrderType;
import net.certware.measurement.sco.ScoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Order Count</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.impl.ChangeOrderCountImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ChangeOrderCountImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ChangeOrderCountImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ChangeOrderCountImpl#getBrokenLines <em>Broken Lines</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ChangeOrderCountImpl#getFixedLines <em>Fixed Lines</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ChangeOrderCountImpl#getRepairEffort <em>Repair Effort</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ChangeOrderCountImpl extends EObjectImpl implements ChangeOrderCount {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeOrderType TYPE_EDEFAULT = ChangeOrderType.NORMAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ChangeOrderType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBrokenLines() <em>Broken Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokenLines()
	 * @generated
	 * @ordered
	 */
	protected static final int BROKEN_LINES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBrokenLines() <em>Broken Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokenLines()
	 * @generated
	 * @ordered
	 */
	protected int brokenLines = BROKEN_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getFixedLines() <em>Fixed Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedLines()
	 * @generated
	 * @ordered
	 */
	protected static final int FIXED_LINES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFixedLines() <em>Fixed Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedLines()
	 * @generated
	 * @ordered
	 */
	protected int fixedLines = FIXED_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepairEffort() <em>Repair Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepairEffort()
	 * @generated
	 * @ordered
	 */
	protected static final double REPAIR_EFFORT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRepairEffort() <em>Repair Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepairEffort()
	 * @generated
	 * @ordered
	 */
	protected double repairEffort = REPAIR_EFFORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeOrderCountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScoPackage.Literals.CHANGE_ORDER_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.CHANGE_ORDER_COUNT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.CHANGE_ORDER_COUNT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeOrderType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ChangeOrderType newType) {
		ChangeOrderType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.CHANGE_ORDER_COUNT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBrokenLines() {
		return brokenLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokenLines(int newBrokenLines) {
		int oldBrokenLines = brokenLines;
		brokenLines = newBrokenLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.CHANGE_ORDER_COUNT__BROKEN_LINES, oldBrokenLines, brokenLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFixedLines() {
		return fixedLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedLines(int newFixedLines) {
		int oldFixedLines = fixedLines;
		fixedLines = newFixedLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.CHANGE_ORDER_COUNT__FIXED_LINES, oldFixedLines, fixedLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRepairEffort() {
		return repairEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepairEffort(double newRepairEffort) {
		double oldRepairEffort = repairEffort;
		repairEffort = newRepairEffort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.CHANGE_ORDER_COUNT__REPAIR_EFFORT, oldRepairEffort, repairEffort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScoPackage.CHANGE_ORDER_COUNT__NAME:
				return getName();
			case ScoPackage.CHANGE_ORDER_COUNT__VALUE:
				return getValue();
			case ScoPackage.CHANGE_ORDER_COUNT__TYPE:
				return getType();
			case ScoPackage.CHANGE_ORDER_COUNT__BROKEN_LINES:
				return getBrokenLines();
			case ScoPackage.CHANGE_ORDER_COUNT__FIXED_LINES:
				return getFixedLines();
			case ScoPackage.CHANGE_ORDER_COUNT__REPAIR_EFFORT:
				return getRepairEffort();
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
			case ScoPackage.CHANGE_ORDER_COUNT__NAME:
				setName((String)newValue);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__VALUE:
				setValue((Integer)newValue);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__TYPE:
				setType((ChangeOrderType)newValue);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__BROKEN_LINES:
				setBrokenLines((Integer)newValue);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__FIXED_LINES:
				setFixedLines((Integer)newValue);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__REPAIR_EFFORT:
				setRepairEffort((Double)newValue);
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
			case ScoPackage.CHANGE_ORDER_COUNT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__BROKEN_LINES:
				setBrokenLines(BROKEN_LINES_EDEFAULT);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__FIXED_LINES:
				setFixedLines(FIXED_LINES_EDEFAULT);
				return;
			case ScoPackage.CHANGE_ORDER_COUNT__REPAIR_EFFORT:
				setRepairEffort(REPAIR_EFFORT_EDEFAULT);
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
			case ScoPackage.CHANGE_ORDER_COUNT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ScoPackage.CHANGE_ORDER_COUNT__VALUE:
				return value != VALUE_EDEFAULT;
			case ScoPackage.CHANGE_ORDER_COUNT__TYPE:
				return type != TYPE_EDEFAULT;
			case ScoPackage.CHANGE_ORDER_COUNT__BROKEN_LINES:
				return brokenLines != BROKEN_LINES_EDEFAULT;
			case ScoPackage.CHANGE_ORDER_COUNT__FIXED_LINES:
				return fixedLines != FIXED_LINES_EDEFAULT;
			case ScoPackage.CHANGE_ORDER_COUNT__REPAIR_EFFORT:
				return repairEffort != REPAIR_EFFORT_EDEFAULT;
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", value: "); //$NON-NLS-1$
		result.append(value);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", brokenLines: "); //$NON-NLS-1$
		result.append(brokenLines);
		result.append(", fixedLines: "); //$NON-NLS-1$
		result.append(fixedLines);
		result.append(", repairEffort: "); //$NON-NLS-1$
		result.append(repairEffort);
		result.append(')');
		return result.toString();
	}

} //ChangeOrderCountImpl
