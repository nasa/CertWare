/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.util.Collection;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.WBSMaskType;
import net.certware.planning.mspdi.WBSMasksType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WBS Masks Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.WBSMasksTypeImpl#isVerifyUniqueCodes <em>Verify Unique Codes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WBSMasksTypeImpl#isGenerateCodes <em>Generate Codes</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WBSMasksTypeImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.WBSMasksTypeImpl#getWBSMask <em>WBS Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WBSMasksTypeImpl extends EObjectImpl implements WBSMasksType {
	/**
	 * The default value of the '{@link #isVerifyUniqueCodes() <em>Verify Unique Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerifyUniqueCodes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERIFY_UNIQUE_CODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerifyUniqueCodes() <em>Verify Unique Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerifyUniqueCodes()
	 * @generated
	 * @ordered
	 */
	protected boolean verifyUniqueCodes = VERIFY_UNIQUE_CODES_EDEFAULT;

	/**
	 * This is true if the Verify Unique Codes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verifyUniqueCodesESet;

	/**
	 * The default value of the '{@link #isGenerateCodes() <em>Generate Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateCodes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_CODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateCodes() <em>Generate Codes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateCodes()
	 * @generated
	 * @ordered
	 */
	protected boolean generateCodes = GENERATE_CODES_EDEFAULT;

	/**
	 * This is true if the Generate Codes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean generateCodesESet;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWBSMask() <em>WBS Mask</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWBSMask()
	 * @generated
	 * @ordered
	 */
	protected EList<WBSMaskType> wBSMask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WBSMasksTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.WBS_MASKS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerifyUniqueCodes() {
		return verifyUniqueCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerifyUniqueCodes(boolean newVerifyUniqueCodes) {
		boolean oldVerifyUniqueCodes = verifyUniqueCodes;
		verifyUniqueCodes = newVerifyUniqueCodes;
		boolean oldVerifyUniqueCodesESet = verifyUniqueCodesESet;
		verifyUniqueCodesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WBS_MASKS_TYPE__VERIFY_UNIQUE_CODES, oldVerifyUniqueCodes, verifyUniqueCodes, !oldVerifyUniqueCodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerifyUniqueCodes() {
		boolean oldVerifyUniqueCodes = verifyUniqueCodes;
		boolean oldVerifyUniqueCodesESet = verifyUniqueCodesESet;
		verifyUniqueCodes = VERIFY_UNIQUE_CODES_EDEFAULT;
		verifyUniqueCodesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.WBS_MASKS_TYPE__VERIFY_UNIQUE_CODES, oldVerifyUniqueCodes, VERIFY_UNIQUE_CODES_EDEFAULT, oldVerifyUniqueCodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerifyUniqueCodes() {
		return verifyUniqueCodesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateCodes() {
		return generateCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateCodes(boolean newGenerateCodes) {
		boolean oldGenerateCodes = generateCodes;
		generateCodes = newGenerateCodes;
		boolean oldGenerateCodesESet = generateCodesESet;
		generateCodesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WBS_MASKS_TYPE__GENERATE_CODES, oldGenerateCodes, generateCodes, !oldGenerateCodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGenerateCodes() {
		boolean oldGenerateCodes = generateCodes;
		boolean oldGenerateCodesESet = generateCodesESet;
		generateCodes = GENERATE_CODES_EDEFAULT;
		generateCodesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.WBS_MASKS_TYPE__GENERATE_CODES, oldGenerateCodes, GENERATE_CODES_EDEFAULT, oldGenerateCodesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGenerateCodes() {
		return generateCodesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.WBS_MASKS_TYPE__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WBSMaskType> getWBSMask() {
		if (wBSMask == null) {
			wBSMask = new EObjectContainmentEList<WBSMaskType>(WBSMaskType.class, this, MspdiPackage.WBS_MASKS_TYPE__WBS_MASK);
		}
		return wBSMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.WBS_MASKS_TYPE__WBS_MASK:
				return ((InternalEList<?>)getWBSMask()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.WBS_MASKS_TYPE__VERIFY_UNIQUE_CODES:
				return isVerifyUniqueCodes();
			case MspdiPackage.WBS_MASKS_TYPE__GENERATE_CODES:
				return isGenerateCodes();
			case MspdiPackage.WBS_MASKS_TYPE__PREFIX:
				return getPrefix();
			case MspdiPackage.WBS_MASKS_TYPE__WBS_MASK:
				return getWBSMask();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MspdiPackage.WBS_MASKS_TYPE__VERIFY_UNIQUE_CODES:
				setVerifyUniqueCodes((Boolean)newValue);
				return;
			case MspdiPackage.WBS_MASKS_TYPE__GENERATE_CODES:
				setGenerateCodes((Boolean)newValue);
				return;
			case MspdiPackage.WBS_MASKS_TYPE__PREFIX:
				setPrefix((String)newValue);
				return;
			case MspdiPackage.WBS_MASKS_TYPE__WBS_MASK:
				getWBSMask().clear();
				getWBSMask().addAll((Collection<? extends WBSMaskType>)newValue);
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
			case MspdiPackage.WBS_MASKS_TYPE__VERIFY_UNIQUE_CODES:
				unsetVerifyUniqueCodes();
				return;
			case MspdiPackage.WBS_MASKS_TYPE__GENERATE_CODES:
				unsetGenerateCodes();
				return;
			case MspdiPackage.WBS_MASKS_TYPE__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case MspdiPackage.WBS_MASKS_TYPE__WBS_MASK:
				getWBSMask().clear();
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
			case MspdiPackage.WBS_MASKS_TYPE__VERIFY_UNIQUE_CODES:
				return isSetVerifyUniqueCodes();
			case MspdiPackage.WBS_MASKS_TYPE__GENERATE_CODES:
				return isSetGenerateCodes();
			case MspdiPackage.WBS_MASKS_TYPE__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case MspdiPackage.WBS_MASKS_TYPE__WBS_MASK:
				return wBSMask != null && !wBSMask.isEmpty();
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
		result.append(" (verifyUniqueCodes: ");
		if (verifyUniqueCodesESet) result.append(verifyUniqueCodes); else result.append("<unset>");
		result.append(", generateCodes: ");
		if (generateCodesESet) result.append(generateCodes); else result.append("<unset>");
		result.append(", prefix: ");
		result.append(prefix);
		result.append(')');
		return result.toString();
	}

} //WBSMasksTypeImpl
