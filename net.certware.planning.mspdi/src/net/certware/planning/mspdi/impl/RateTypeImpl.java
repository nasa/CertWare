/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.OvertimeRateFormatType;
import net.certware.planning.mspdi.RateTableType;
import net.certware.planning.mspdi.RateType;
import net.certware.planning.mspdi.StandardRateFormatType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.RateTypeImpl#getRatesFrom <em>Rates From</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.RateTypeImpl#getRatesTo <em>Rates To</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.RateTypeImpl#getRateTable <em>Rate Table</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.RateTypeImpl#getStandardRate <em>Standard Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.RateTypeImpl#getStandardRateFormat <em>Standard Rate Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.RateTypeImpl#getOvertimeRate <em>Overtime Rate</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.RateTypeImpl#getOvertimeRateFormat <em>Overtime Rate Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.RateTypeImpl#getCostPerUse <em>Cost Per Use</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RateTypeImpl extends EObjectImpl implements RateType {
	/**
	 * The default value of the '{@link #getRatesFrom() <em>Rates From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatesFrom()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RATES_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatesFrom() <em>Rates From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatesFrom()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar ratesFrom = RATES_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRatesTo() <em>Rates To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatesTo()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RATES_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRatesTo() <em>Rates To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatesTo()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar ratesTo = RATES_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRateTable() <em>Rate Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTable()
	 * @generated
	 * @ordered
	 */
	protected static final RateTableType RATE_TABLE_EDEFAULT = RateTableType._0;

	/**
	 * The cached value of the '{@link #getRateTable() <em>Rate Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateTable()
	 * @generated
	 * @ordered
	 */
	protected RateTableType rateTable = RATE_TABLE_EDEFAULT;

	/**
	 * This is true if the Rate Table attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rateTableESet;

	/**
	 * The default value of the '{@link #getStandardRate() <em>Standard Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal STANDARD_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardRate() <em>Standard Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRate()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal standardRate = STANDARD_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardRateFormat() <em>Standard Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final StandardRateFormatType STANDARD_RATE_FORMAT_EDEFAULT = StandardRateFormatType._1;

	/**
	 * The cached value of the '{@link #getStandardRateFormat() <em>Standard Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardRateFormat()
	 * @generated
	 * @ordered
	 */
	protected StandardRateFormatType standardRateFormat = STANDARD_RATE_FORMAT_EDEFAULT;

	/**
	 * This is true if the Standard Rate Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean standardRateFormatESet;

	/**
	 * The default value of the '{@link #getOvertimeRate() <em>Overtime Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeRate()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OVERTIME_RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvertimeRate() <em>Overtime Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeRate()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal overtimeRate = OVERTIME_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvertimeRateFormat() <em>Overtime Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeRateFormat()
	 * @generated
	 * @ordered
	 */
	protected static final OvertimeRateFormatType OVERTIME_RATE_FORMAT_EDEFAULT = OvertimeRateFormatType._1;

	/**
	 * The cached value of the '{@link #getOvertimeRateFormat() <em>Overtime Rate Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvertimeRateFormat()
	 * @generated
	 * @ordered
	 */
	protected OvertimeRateFormatType overtimeRateFormat = OVERTIME_RATE_FORMAT_EDEFAULT;

	/**
	 * This is true if the Overtime Rate Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overtimeRateFormatESet;

	/**
	 * The default value of the '{@link #getCostPerUse() <em>Cost Per Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUse()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal COST_PER_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostPerUse() <em>Cost Per Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostPerUse()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal costPerUse = COST_PER_USE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.RATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRatesFrom() {
		return ratesFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatesFrom(XMLGregorianCalendar newRatesFrom) {
		XMLGregorianCalendar oldRatesFrom = ratesFrom;
		ratesFrom = newRatesFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RATE_TYPE__RATES_FROM, oldRatesFrom, ratesFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRatesTo() {
		return ratesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRatesTo(XMLGregorianCalendar newRatesTo) {
		XMLGregorianCalendar oldRatesTo = ratesTo;
		ratesTo = newRatesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RATE_TYPE__RATES_TO, oldRatesTo, ratesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateTableType getRateTable() {
		return rateTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateTable(RateTableType newRateTable) {
		RateTableType oldRateTable = rateTable;
		rateTable = newRateTable == null ? RATE_TABLE_EDEFAULT : newRateTable;
		boolean oldRateTableESet = rateTableESet;
		rateTableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RATE_TYPE__RATE_TABLE, oldRateTable, rateTable, !oldRateTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRateTable() {
		RateTableType oldRateTable = rateTable;
		boolean oldRateTableESet = rateTableESet;
		rateTable = RATE_TABLE_EDEFAULT;
		rateTableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RATE_TYPE__RATE_TABLE, oldRateTable, RATE_TABLE_EDEFAULT, oldRateTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRateTable() {
		return rateTableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getStandardRate() {
		return standardRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRate(BigDecimal newStandardRate) {
		BigDecimal oldStandardRate = standardRate;
		standardRate = newStandardRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RATE_TYPE__STANDARD_RATE, oldStandardRate, standardRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardRateFormatType getStandardRateFormat() {
		return standardRateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardRateFormat(StandardRateFormatType newStandardRateFormat) {
		StandardRateFormatType oldStandardRateFormat = standardRateFormat;
		standardRateFormat = newStandardRateFormat == null ? STANDARD_RATE_FORMAT_EDEFAULT : newStandardRateFormat;
		boolean oldStandardRateFormatESet = standardRateFormatESet;
		standardRateFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RATE_TYPE__STANDARD_RATE_FORMAT, oldStandardRateFormat, standardRateFormat, !oldStandardRateFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStandardRateFormat() {
		StandardRateFormatType oldStandardRateFormat = standardRateFormat;
		boolean oldStandardRateFormatESet = standardRateFormatESet;
		standardRateFormat = STANDARD_RATE_FORMAT_EDEFAULT;
		standardRateFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RATE_TYPE__STANDARD_RATE_FORMAT, oldStandardRateFormat, STANDARD_RATE_FORMAT_EDEFAULT, oldStandardRateFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStandardRateFormat() {
		return standardRateFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getOvertimeRate() {
		return overtimeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvertimeRate(BigDecimal newOvertimeRate) {
		BigDecimal oldOvertimeRate = overtimeRate;
		overtimeRate = newOvertimeRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RATE_TYPE__OVERTIME_RATE, oldOvertimeRate, overtimeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OvertimeRateFormatType getOvertimeRateFormat() {
		return overtimeRateFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvertimeRateFormat(OvertimeRateFormatType newOvertimeRateFormat) {
		OvertimeRateFormatType oldOvertimeRateFormat = overtimeRateFormat;
		overtimeRateFormat = newOvertimeRateFormat == null ? OVERTIME_RATE_FORMAT_EDEFAULT : newOvertimeRateFormat;
		boolean oldOvertimeRateFormatESet = overtimeRateFormatESet;
		overtimeRateFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RATE_TYPE__OVERTIME_RATE_FORMAT, oldOvertimeRateFormat, overtimeRateFormat, !oldOvertimeRateFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOvertimeRateFormat() {
		OvertimeRateFormatType oldOvertimeRateFormat = overtimeRateFormat;
		boolean oldOvertimeRateFormatESet = overtimeRateFormatESet;
		overtimeRateFormat = OVERTIME_RATE_FORMAT_EDEFAULT;
		overtimeRateFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.RATE_TYPE__OVERTIME_RATE_FORMAT, oldOvertimeRateFormat, OVERTIME_RATE_FORMAT_EDEFAULT, oldOvertimeRateFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOvertimeRateFormat() {
		return overtimeRateFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCostPerUse() {
		return costPerUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostPerUse(BigDecimal newCostPerUse) {
		BigDecimal oldCostPerUse = costPerUse;
		costPerUse = newCostPerUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.RATE_TYPE__COST_PER_USE, oldCostPerUse, costPerUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.RATE_TYPE__RATES_FROM:
				return getRatesFrom();
			case MspdiPackage.RATE_TYPE__RATES_TO:
				return getRatesTo();
			case MspdiPackage.RATE_TYPE__RATE_TABLE:
				return getRateTable();
			case MspdiPackage.RATE_TYPE__STANDARD_RATE:
				return getStandardRate();
			case MspdiPackage.RATE_TYPE__STANDARD_RATE_FORMAT:
				return getStandardRateFormat();
			case MspdiPackage.RATE_TYPE__OVERTIME_RATE:
				return getOvertimeRate();
			case MspdiPackage.RATE_TYPE__OVERTIME_RATE_FORMAT:
				return getOvertimeRateFormat();
			case MspdiPackage.RATE_TYPE__COST_PER_USE:
				return getCostPerUse();
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
			case MspdiPackage.RATE_TYPE__RATES_FROM:
				setRatesFrom((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.RATE_TYPE__RATES_TO:
				setRatesTo((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.RATE_TYPE__RATE_TABLE:
				setRateTable((RateTableType)newValue);
				return;
			case MspdiPackage.RATE_TYPE__STANDARD_RATE:
				setStandardRate((BigDecimal)newValue);
				return;
			case MspdiPackage.RATE_TYPE__STANDARD_RATE_FORMAT:
				setStandardRateFormat((StandardRateFormatType)newValue);
				return;
			case MspdiPackage.RATE_TYPE__OVERTIME_RATE:
				setOvertimeRate((BigDecimal)newValue);
				return;
			case MspdiPackage.RATE_TYPE__OVERTIME_RATE_FORMAT:
				setOvertimeRateFormat((OvertimeRateFormatType)newValue);
				return;
			case MspdiPackage.RATE_TYPE__COST_PER_USE:
				setCostPerUse((BigDecimal)newValue);
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
			case MspdiPackage.RATE_TYPE__RATES_FROM:
				setRatesFrom(RATES_FROM_EDEFAULT);
				return;
			case MspdiPackage.RATE_TYPE__RATES_TO:
				setRatesTo(RATES_TO_EDEFAULT);
				return;
			case MspdiPackage.RATE_TYPE__RATE_TABLE:
				unsetRateTable();
				return;
			case MspdiPackage.RATE_TYPE__STANDARD_RATE:
				setStandardRate(STANDARD_RATE_EDEFAULT);
				return;
			case MspdiPackage.RATE_TYPE__STANDARD_RATE_FORMAT:
				unsetStandardRateFormat();
				return;
			case MspdiPackage.RATE_TYPE__OVERTIME_RATE:
				setOvertimeRate(OVERTIME_RATE_EDEFAULT);
				return;
			case MspdiPackage.RATE_TYPE__OVERTIME_RATE_FORMAT:
				unsetOvertimeRateFormat();
				return;
			case MspdiPackage.RATE_TYPE__COST_PER_USE:
				setCostPerUse(COST_PER_USE_EDEFAULT);
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
			case MspdiPackage.RATE_TYPE__RATES_FROM:
				return RATES_FROM_EDEFAULT == null ? ratesFrom != null : !RATES_FROM_EDEFAULT.equals(ratesFrom);
			case MspdiPackage.RATE_TYPE__RATES_TO:
				return RATES_TO_EDEFAULT == null ? ratesTo != null : !RATES_TO_EDEFAULT.equals(ratesTo);
			case MspdiPackage.RATE_TYPE__RATE_TABLE:
				return isSetRateTable();
			case MspdiPackage.RATE_TYPE__STANDARD_RATE:
				return STANDARD_RATE_EDEFAULT == null ? standardRate != null : !STANDARD_RATE_EDEFAULT.equals(standardRate);
			case MspdiPackage.RATE_TYPE__STANDARD_RATE_FORMAT:
				return isSetStandardRateFormat();
			case MspdiPackage.RATE_TYPE__OVERTIME_RATE:
				return OVERTIME_RATE_EDEFAULT == null ? overtimeRate != null : !OVERTIME_RATE_EDEFAULT.equals(overtimeRate);
			case MspdiPackage.RATE_TYPE__OVERTIME_RATE_FORMAT:
				return isSetOvertimeRateFormat();
			case MspdiPackage.RATE_TYPE__COST_PER_USE:
				return COST_PER_USE_EDEFAULT == null ? costPerUse != null : !COST_PER_USE_EDEFAULT.equals(costPerUse);
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
		result.append(" (ratesFrom: ");
		result.append(ratesFrom);
		result.append(", ratesTo: ");
		result.append(ratesTo);
		result.append(", rateTable: ");
		if (rateTableESet) result.append(rateTable); else result.append("<unset>");
		result.append(", standardRate: ");
		result.append(standardRate);
		result.append(", standardRateFormat: ");
		if (standardRateFormatESet) result.append(standardRateFormat); else result.append("<unset>");
		result.append(", overtimeRate: ");
		result.append(overtimeRate);
		result.append(", overtimeRateFormat: ");
		if (overtimeRateFormatESet) result.append(overtimeRateFormat); else result.append("<unset>");
		result.append(", costPerUse: ");
		result.append(costPerUse);
		result.append(')');
		return result.toString();
	}

} //RateTypeImpl
