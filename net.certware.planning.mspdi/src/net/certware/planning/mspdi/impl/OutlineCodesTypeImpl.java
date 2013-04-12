/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.util.Collection;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.OutlineCodeType2;
import net.certware.planning.mspdi.OutlineCodesType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outline Codes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.OutlineCodesTypeImpl#getOutlineCode <em>Outline Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutlineCodesTypeImpl extends EObjectImpl implements OutlineCodesType {
	/**
	 * The cached value of the '{@link #getOutlineCode() <em>Outline Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutlineCode()
	 * @generated
	 * @ordered
	 */
	protected EList<OutlineCodeType2> outlineCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutlineCodesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.OUTLINE_CODES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutlineCodeType2> getOutlineCode() {
		if (outlineCode == null) {
			outlineCode = new EObjectContainmentEList<OutlineCodeType2>(OutlineCodeType2.class, this, MspdiPackage.OUTLINE_CODES_TYPE__OUTLINE_CODE);
		}
		return outlineCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.OUTLINE_CODES_TYPE__OUTLINE_CODE:
				return ((InternalEList<?>)getOutlineCode()).basicRemove(otherEnd, msgs);
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
			case MspdiPackage.OUTLINE_CODES_TYPE__OUTLINE_CODE:
				return getOutlineCode();
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
			case MspdiPackage.OUTLINE_CODES_TYPE__OUTLINE_CODE:
				getOutlineCode().clear();
				getOutlineCode().addAll((Collection<? extends OutlineCodeType2>)newValue);
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
			case MspdiPackage.OUTLINE_CODES_TYPE__OUTLINE_CODE:
				getOutlineCode().clear();
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
			case MspdiPackage.OUTLINE_CODES_TYPE__OUTLINE_CODE:
				return outlineCode != null && !outlineCode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutlineCodesTypeImpl
