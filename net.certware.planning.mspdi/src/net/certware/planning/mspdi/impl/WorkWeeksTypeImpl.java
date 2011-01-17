/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.util.Collection;

import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.WorkWeekType;
import net.certware.planning.mspdi.WorkWeeksType;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Weeks Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.WorkWeeksTypeImpl#getWorkWeek <em>Work Week</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkWeeksTypeImpl extends EObjectImpl implements WorkWeeksType {
	/**
	 * The cached value of the '{@link #getWorkWeek() <em>Work Week</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkWeek()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkWeekType> workWeek;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkWeeksTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.WORK_WEEKS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkWeekType> getWorkWeek() {
		if (workWeek == null) {
			workWeek = new EObjectContainmentEList<WorkWeekType>(WorkWeekType.class, this, MspdiPackage.WORK_WEEKS_TYPE__WORK_WEEK);
		}
		return workWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.WORK_WEEKS_TYPE__WORK_WEEK:
				return ((InternalEList<?>)getWorkWeek()).basicRemove(otherEnd, msgs);
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
			case MspdiPackage.WORK_WEEKS_TYPE__WORK_WEEK:
				return getWorkWeek();
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
			case MspdiPackage.WORK_WEEKS_TYPE__WORK_WEEK:
				getWorkWeek().clear();
				getWorkWeek().addAll((Collection<? extends WorkWeekType>)newValue);
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
			case MspdiPackage.WORK_WEEKS_TYPE__WORK_WEEK:
				getWorkWeek().clear();
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
			case MspdiPackage.WORK_WEEKS_TYPE__WORK_WEEK:
				return workWeek != null && !workWeek.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkWeeksTypeImpl
