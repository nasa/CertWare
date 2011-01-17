/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigInteger;

import javax.xml.datatype.Duration;

import net.certware.planning.mspdi.BaselineType1;
import net.certware.planning.mspdi.MspdiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Baseline Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType1Impl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType1Impl#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType1Impl#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType1Impl#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType1Impl#getBCWP <em>BCWP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaselineType1Impl extends EObjectImpl implements BaselineType1 {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected BigInteger number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWork() <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected static final Duration WORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWork() <em>Work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWork()
	 * @generated
	 * @ordered
	 */
	protected Duration work = WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final float COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected float cost = COST_EDEFAULT;

	/**
	 * This is true if the Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costESet;

	/**
	 * The default value of the '{@link #getBCWS() <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWS()
	 * @generated
	 * @ordered
	 */
	protected static final float BCWS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBCWS() <em>BCWS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWS()
	 * @generated
	 * @ordered
	 */
	protected float bCWS = BCWS_EDEFAULT;

	/**
	 * This is true if the BCWS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bCWSESet;

	/**
	 * The default value of the '{@link #getBCWP() <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWP()
	 * @generated
	 * @ordered
	 */
	protected static final float BCWP_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBCWP() <em>BCWP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBCWP()
	 * @generated
	 * @ordered
	 */
	protected float bCWP = BCWP_EDEFAULT;

	/**
	 * This is true if the BCWP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bCWPESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaselineType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.BASELINE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(BigInteger newNumber) {
		BigInteger oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE1__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getWork() {
		return work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWork(Duration newWork) {
		Duration oldWork = work;
		work = newWork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE1__WORK, oldWork, work));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(float newCost) {
		float oldCost = cost;
		cost = newCost;
		boolean oldCostESet = costESet;
		costESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE1__COST, oldCost, cost, !oldCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCost() {
		float oldCost = cost;
		boolean oldCostESet = costESet;
		cost = COST_EDEFAULT;
		costESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE1__COST, oldCost, COST_EDEFAULT, oldCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCost() {
		return costESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBCWS() {
		return bCWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBCWS(float newBCWS) {
		float oldBCWS = bCWS;
		bCWS = newBCWS;
		boolean oldBCWSESet = bCWSESet;
		bCWSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE1__BCWS, oldBCWS, bCWS, !oldBCWSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBCWS() {
		float oldBCWS = bCWS;
		boolean oldBCWSESet = bCWSESet;
		bCWS = BCWS_EDEFAULT;
		bCWSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE1__BCWS, oldBCWS, BCWS_EDEFAULT, oldBCWSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBCWS() {
		return bCWSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBCWP() {
		return bCWP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBCWP(float newBCWP) {
		float oldBCWP = bCWP;
		bCWP = newBCWP;
		boolean oldBCWPESet = bCWPESet;
		bCWPESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE1__BCWP, oldBCWP, bCWP, !oldBCWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBCWP() {
		float oldBCWP = bCWP;
		boolean oldBCWPESet = bCWPESet;
		bCWP = BCWP_EDEFAULT;
		bCWPESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE1__BCWP, oldBCWP, BCWP_EDEFAULT, oldBCWPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBCWP() {
		return bCWPESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MspdiPackage.BASELINE_TYPE1__NUMBER:
				return getNumber();
			case MspdiPackage.BASELINE_TYPE1__WORK:
				return getWork();
			case MspdiPackage.BASELINE_TYPE1__COST:
				return getCost();
			case MspdiPackage.BASELINE_TYPE1__BCWS:
				return getBCWS();
			case MspdiPackage.BASELINE_TYPE1__BCWP:
				return getBCWP();
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
			case MspdiPackage.BASELINE_TYPE1__NUMBER:
				setNumber((BigInteger)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE1__WORK:
				setWork((Duration)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE1__COST:
				setCost((Float)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE1__BCWS:
				setBCWS((Float)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE1__BCWP:
				setBCWP((Float)newValue);
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
			case MspdiPackage.BASELINE_TYPE1__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case MspdiPackage.BASELINE_TYPE1__WORK:
				setWork(WORK_EDEFAULT);
				return;
			case MspdiPackage.BASELINE_TYPE1__COST:
				unsetCost();
				return;
			case MspdiPackage.BASELINE_TYPE1__BCWS:
				unsetBCWS();
				return;
			case MspdiPackage.BASELINE_TYPE1__BCWP:
				unsetBCWP();
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
			case MspdiPackage.BASELINE_TYPE1__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case MspdiPackage.BASELINE_TYPE1__WORK:
				return WORK_EDEFAULT == null ? work != null : !WORK_EDEFAULT.equals(work);
			case MspdiPackage.BASELINE_TYPE1__COST:
				return isSetCost();
			case MspdiPackage.BASELINE_TYPE1__BCWS:
				return isSetBCWS();
			case MspdiPackage.BASELINE_TYPE1__BCWP:
				return isSetBCWP();
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
		result.append(" (number: ");
		result.append(number);
		result.append(", work: ");
		result.append(work);
		result.append(", cost: ");
		if (costESet) result.append(cost); else result.append("<unset>");
		result.append(", bCWS: ");
		if (bCWSESet) result.append(bCWS); else result.append("<unset>");
		result.append(", bCWP: ");
		if (bCWPESet) result.append(bCWP); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BaselineType1Impl
