/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.util.Collection;

import net.certware.planning.mspdi.AvailabilityPeriodType;
import net.certware.planning.mspdi.AvailabilityPeriodsType;
import net.certware.planning.mspdi.MspdiPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability Periods Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.AvailabilityPeriodsTypeImpl#getAvailabilityPeriod <em>Availability Period</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AvailabilityPeriodsTypeImpl extends EObjectImpl implements AvailabilityPeriodsType {
	/**
	 * The cached value of the '{@link #getAvailabilityPeriod() <em>Availability Period</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityPeriod()
	 * @generated
	 * @ordered
	 */
	protected EList<AvailabilityPeriodType> availabilityPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityPeriodsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.AVAILABILITY_PERIODS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AvailabilityPeriodType> getAvailabilityPeriod() {
		if (availabilityPeriod == null) {
			availabilityPeriod = new EObjectContainmentEList<AvailabilityPeriodType>(AvailabilityPeriodType.class, this, MspdiPackage.AVAILABILITY_PERIODS_TYPE__AVAILABILITY_PERIOD);
		}
		return availabilityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.AVAILABILITY_PERIODS_TYPE__AVAILABILITY_PERIOD:
				return ((InternalEList<?>)getAvailabilityPeriod()).basicRemove(otherEnd, msgs);
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
			case MspdiPackage.AVAILABILITY_PERIODS_TYPE__AVAILABILITY_PERIOD:
				return getAvailabilityPeriod();
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
			case MspdiPackage.AVAILABILITY_PERIODS_TYPE__AVAILABILITY_PERIOD:
				getAvailabilityPeriod().clear();
				getAvailabilityPeriod().addAll((Collection<? extends AvailabilityPeriodType>)newValue);
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
			case MspdiPackage.AVAILABILITY_PERIODS_TYPE__AVAILABILITY_PERIOD:
				getAvailabilityPeriod().clear();
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
			case MspdiPackage.AVAILABILITY_PERIODS_TYPE__AVAILABILITY_PERIOD:
				return availabilityPeriod != null && !availabilityPeriod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AvailabilityPeriodsTypeImpl
