/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import net.certware.planning.mspdi.DurationFormatType2;
import net.certware.planning.mspdi.ExtendedAttributeType;
import net.certware.planning.mspdi.MspdiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeTypeImpl#getFieldID <em>Field ID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeTypeImpl#getValueGUID <em>Value GUID</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.ExtendedAttributeTypeImpl#getDurationFormat <em>Duration Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedAttributeTypeImpl extends EObjectImpl implements ExtendedAttributeType {
	/**
	 * The default value of the '{@link #getFieldID() <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldID()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldID() <em>Field ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldID()
	 * @generated
	 * @ordered
	 */
	protected String fieldID = FIELD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueGUID() <em>Value GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGUID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger VALUE_GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueGUID() <em>Value GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGUID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger valueGUID = VALUE_GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationFormat() <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DurationFormatType2 DURATION_FORMAT_EDEFAULT = DurationFormatType2._3;

	/**
	 * The cached value of the '{@link #getDurationFormat() <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationFormat()
	 * @generated
	 * @ordered
	 */
	protected DurationFormatType2 durationFormat = DURATION_FORMAT_EDEFAULT;

	/**
	 * This is true if the Duration Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationFormatESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedAttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.EXTENDED_ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldID() {
		return fieldID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldID(String newFieldID) {
		String oldFieldID = fieldID;
		fieldID = newFieldID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__FIELD_ID, oldFieldID, fieldID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getValueGUID() {
		return valueGUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueGUID(BigInteger newValueGUID) {
		BigInteger oldValueGUID = valueGUID;
		valueGUID = newValueGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE_GUID, oldValueGUID, valueGUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType2 getDurationFormat() {
		return durationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationFormat(DurationFormatType2 newDurationFormat) {
		DurationFormatType2 oldDurationFormat = durationFormat;
		durationFormat = newDurationFormat == null ? DURATION_FORMAT_EDEFAULT : newDurationFormat;
		boolean oldDurationFormatESet = durationFormatESet;
		durationFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__DURATION_FORMAT, oldDurationFormat, durationFormat, !oldDurationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDurationFormat() {
		DurationFormatType2 oldDurationFormat = durationFormat;
		boolean oldDurationFormatESet = durationFormatESet;
		durationFormat = DURATION_FORMAT_EDEFAULT;
		durationFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__DURATION_FORMAT, oldDurationFormat, DURATION_FORMAT_EDEFAULT, oldDurationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDurationFormat() {
		return durationFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__FIELD_ID:
				return getFieldID();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE:
				return getValue();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE_GUID:
				return getValueGUID();
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__DURATION_FORMAT:
				return getDurationFormat();
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
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__FIELD_ID:
				setFieldID((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE_GUID:
				setValueGUID((BigInteger)newValue);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__DURATION_FORMAT:
				setDurationFormat((DurationFormatType2)newValue);
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
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__FIELD_ID:
				setFieldID(FIELD_ID_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE_GUID:
				setValueGUID(VALUE_GUID_EDEFAULT);
				return;
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__DURATION_FORMAT:
				unsetDurationFormat();
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
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__FIELD_ID:
				return FIELD_ID_EDEFAULT == null ? fieldID != null : !FIELD_ID_EDEFAULT.equals(fieldID);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__VALUE_GUID:
				return VALUE_GUID_EDEFAULT == null ? valueGUID != null : !VALUE_GUID_EDEFAULT.equals(valueGUID);
			case MspdiPackage.EXTENDED_ATTRIBUTE_TYPE__DURATION_FORMAT:
				return isSetDurationFormat();
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
		result.append(" (fieldID: ");
		result.append(fieldID);
		result.append(", value: ");
		result.append(value);
		result.append(", valueGUID: ");
		result.append(valueGUID);
		result.append(", durationFormat: ");
		if (durationFormatESet) result.append(durationFormat); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ExtendedAttributeTypeImpl
