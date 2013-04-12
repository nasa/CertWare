/**
 * MSPDI is copyright Microsoft, Inc.
 * Implementation wrapper in ecore done by Kestrel Technology LLC
 */
package net.certware.planning.mspdi.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import net.certware.planning.mspdi.BaselineType2;
import net.certware.planning.mspdi.DurationFormatType3;
import net.certware.planning.mspdi.MspdiPackage;
import net.certware.planning.mspdi.TimephasedDataType;

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
 * An implementation of the model object '<em><b>Baseline Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getTimephasedData <em>Timephased Data</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#isInterim <em>Interim</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getStart <em>Start</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getDurationFormat <em>Duration Format</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#isEstimatedDuration <em>Estimated Duration</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getWork <em>Work</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getCost <em>Cost</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getBCWS <em>BCWS</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getBCWP <em>BCWP</em>}</li>
 *   <li>{@link net.certware.planning.mspdi.impl.BaselineType2Impl#getFixedCost <em>Fixed Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaselineType2Impl extends EObjectImpl implements BaselineType2 {
	/**
	 * The cached value of the '{@link #getTimephasedData() <em>Timephased Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimephasedData()
	 * @generated
	 * @ordered
	 */
	protected EList<TimephasedDataType> timephasedData;

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
	 * The default value of the '{@link #isInterim() <em>Interim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterim()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERIM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterim() <em>Interim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterim()
	 * @generated
	 * @ordered
	 */
	protected boolean interim = INTERIM_EDEFAULT;

	/**
	 * This is true if the Interim attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interimESet;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinish() <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FINISH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finish = FINISH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Duration DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDurationFormat() <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DurationFormatType3 DURATION_FORMAT_EDEFAULT = DurationFormatType3._3;

	/**
	 * The cached value of the '{@link #getDurationFormat() <em>Duration Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationFormat()
	 * @generated
	 * @ordered
	 */
	protected DurationFormatType3 durationFormat = DURATION_FORMAT_EDEFAULT;

	/**
	 * This is true if the Duration Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean durationFormatESet;

	/**
	 * The default value of the '{@link #isEstimatedDuration() <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstimatedDuration()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ESTIMATED_DURATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstimatedDuration() <em>Estimated Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstimatedDuration()
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedDuration = ESTIMATED_DURATION_EDEFAULT;

	/**
	 * This is true if the Estimated Duration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean estimatedDurationESet;

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
	protected static final BigDecimal COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal cost = COST_EDEFAULT;

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
	 * The default value of the '{@link #getFixedCost() <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCost()
	 * @generated
	 * @ordered
	 */
	protected static final float FIXED_COST_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFixedCost() <em>Fixed Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedCost()
	 * @generated
	 * @ordered
	 */
	protected float fixedCost = FIXED_COST_EDEFAULT;

	/**
	 * This is true if the Fixed Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fixedCostESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaselineType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MspdiPackage.Literals.BASELINE_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimephasedDataType> getTimephasedData() {
		if (timephasedData == null) {
			timephasedData = new EObjectContainmentEList<TimephasedDataType>(TimephasedDataType.class, this, MspdiPackage.BASELINE_TYPE2__TIMEPHASED_DATA);
		}
		return timephasedData;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterim() {
		return interim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterim(boolean newInterim) {
		boolean oldInterim = interim;
		interim = newInterim;
		boolean oldInterimESet = interimESet;
		interimESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__INTERIM, oldInterim, interim, !oldInterimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInterim() {
		boolean oldInterim = interim;
		boolean oldInterimESet = interimESet;
		interim = INTERIM_EDEFAULT;
		interimESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE2__INTERIM, oldInterim, INTERIM_EDEFAULT, oldInterimESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterim() {
		return interimESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(XMLGregorianCalendar newStart) {
		XMLGregorianCalendar oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(XMLGregorianCalendar newFinish) {
		XMLGregorianCalendar oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationFormatType3 getDurationFormat() {
		return durationFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationFormat(DurationFormatType3 newDurationFormat) {
		DurationFormatType3 oldDurationFormat = durationFormat;
		durationFormat = newDurationFormat == null ? DURATION_FORMAT_EDEFAULT : newDurationFormat;
		boolean oldDurationFormatESet = durationFormatESet;
		durationFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__DURATION_FORMAT, oldDurationFormat, durationFormat, !oldDurationFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDurationFormat() {
		DurationFormatType3 oldDurationFormat = durationFormat;
		boolean oldDurationFormatESet = durationFormatESet;
		durationFormat = DURATION_FORMAT_EDEFAULT;
		durationFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE2__DURATION_FORMAT, oldDurationFormat, DURATION_FORMAT_EDEFAULT, oldDurationFormatESet));
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
	public boolean isEstimatedDuration() {
		return estimatedDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedDuration(boolean newEstimatedDuration) {
		boolean oldEstimatedDuration = estimatedDuration;
		estimatedDuration = newEstimatedDuration;
		boolean oldEstimatedDurationESet = estimatedDurationESet;
		estimatedDurationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__ESTIMATED_DURATION, oldEstimatedDuration, estimatedDuration, !oldEstimatedDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEstimatedDuration() {
		boolean oldEstimatedDuration = estimatedDuration;
		boolean oldEstimatedDurationESet = estimatedDurationESet;
		estimatedDuration = ESTIMATED_DURATION_EDEFAULT;
		estimatedDurationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE2__ESTIMATED_DURATION, oldEstimatedDuration, ESTIMATED_DURATION_EDEFAULT, oldEstimatedDurationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEstimatedDuration() {
		return estimatedDurationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__WORK, oldWork, work));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(BigDecimal newCost) {
		BigDecimal oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__COST, oldCost, cost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__BCWS, oldBCWS, bCWS, !oldBCWSESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE2__BCWS, oldBCWS, BCWS_EDEFAULT, oldBCWSESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__BCWP, oldBCWP, bCWP, !oldBCWPESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE2__BCWP, oldBCWP, BCWP_EDEFAULT, oldBCWPESet));
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
	public float getFixedCost() {
		return fixedCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedCost(float newFixedCost) {
		float oldFixedCost = fixedCost;
		fixedCost = newFixedCost;
		boolean oldFixedCostESet = fixedCostESet;
		fixedCostESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MspdiPackage.BASELINE_TYPE2__FIXED_COST, oldFixedCost, fixedCost, !oldFixedCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFixedCost() {
		float oldFixedCost = fixedCost;
		boolean oldFixedCostESet = fixedCostESet;
		fixedCost = FIXED_COST_EDEFAULT;
		fixedCostESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MspdiPackage.BASELINE_TYPE2__FIXED_COST, oldFixedCost, FIXED_COST_EDEFAULT, oldFixedCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFixedCost() {
		return fixedCostESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MspdiPackage.BASELINE_TYPE2__TIMEPHASED_DATA:
				return ((InternalEList<?>)getTimephasedData()).basicRemove(otherEnd, msgs);
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
			case MspdiPackage.BASELINE_TYPE2__TIMEPHASED_DATA:
				return getTimephasedData();
			case MspdiPackage.BASELINE_TYPE2__NUMBER:
				return getNumber();
			case MspdiPackage.BASELINE_TYPE2__INTERIM:
				return isInterim();
			case MspdiPackage.BASELINE_TYPE2__START:
				return getStart();
			case MspdiPackage.BASELINE_TYPE2__FINISH:
				return getFinish();
			case MspdiPackage.BASELINE_TYPE2__DURATION:
				return getDuration();
			case MspdiPackage.BASELINE_TYPE2__DURATION_FORMAT:
				return getDurationFormat();
			case MspdiPackage.BASELINE_TYPE2__ESTIMATED_DURATION:
				return isEstimatedDuration();
			case MspdiPackage.BASELINE_TYPE2__WORK:
				return getWork();
			case MspdiPackage.BASELINE_TYPE2__COST:
				return getCost();
			case MspdiPackage.BASELINE_TYPE2__BCWS:
				return getBCWS();
			case MspdiPackage.BASELINE_TYPE2__BCWP:
				return getBCWP();
			case MspdiPackage.BASELINE_TYPE2__FIXED_COST:
				return getFixedCost();
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
			case MspdiPackage.BASELINE_TYPE2__TIMEPHASED_DATA:
				getTimephasedData().clear();
				getTimephasedData().addAll((Collection<? extends TimephasedDataType>)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__NUMBER:
				setNumber((BigInteger)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__INTERIM:
				setInterim((Boolean)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__START:
				setStart((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__FINISH:
				setFinish((XMLGregorianCalendar)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__DURATION:
				setDuration((Duration)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__DURATION_FORMAT:
				setDurationFormat((DurationFormatType3)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__ESTIMATED_DURATION:
				setEstimatedDuration((Boolean)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__WORK:
				setWork((Duration)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__COST:
				setCost((BigDecimal)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__BCWS:
				setBCWS((Float)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__BCWP:
				setBCWP((Float)newValue);
				return;
			case MspdiPackage.BASELINE_TYPE2__FIXED_COST:
				setFixedCost((Float)newValue);
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
			case MspdiPackage.BASELINE_TYPE2__TIMEPHASED_DATA:
				getTimephasedData().clear();
				return;
			case MspdiPackage.BASELINE_TYPE2__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case MspdiPackage.BASELINE_TYPE2__INTERIM:
				unsetInterim();
				return;
			case MspdiPackage.BASELINE_TYPE2__START:
				setStart(START_EDEFAULT);
				return;
			case MspdiPackage.BASELINE_TYPE2__FINISH:
				setFinish(FINISH_EDEFAULT);
				return;
			case MspdiPackage.BASELINE_TYPE2__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case MspdiPackage.BASELINE_TYPE2__DURATION_FORMAT:
				unsetDurationFormat();
				return;
			case MspdiPackage.BASELINE_TYPE2__ESTIMATED_DURATION:
				unsetEstimatedDuration();
				return;
			case MspdiPackage.BASELINE_TYPE2__WORK:
				setWork(WORK_EDEFAULT);
				return;
			case MspdiPackage.BASELINE_TYPE2__COST:
				setCost(COST_EDEFAULT);
				return;
			case MspdiPackage.BASELINE_TYPE2__BCWS:
				unsetBCWS();
				return;
			case MspdiPackage.BASELINE_TYPE2__BCWP:
				unsetBCWP();
				return;
			case MspdiPackage.BASELINE_TYPE2__FIXED_COST:
				unsetFixedCost();
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
			case MspdiPackage.BASELINE_TYPE2__TIMEPHASED_DATA:
				return timephasedData != null && !timephasedData.isEmpty();
			case MspdiPackage.BASELINE_TYPE2__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case MspdiPackage.BASELINE_TYPE2__INTERIM:
				return isSetInterim();
			case MspdiPackage.BASELINE_TYPE2__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case MspdiPackage.BASELINE_TYPE2__FINISH:
				return FINISH_EDEFAULT == null ? finish != null : !FINISH_EDEFAULT.equals(finish);
			case MspdiPackage.BASELINE_TYPE2__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case MspdiPackage.BASELINE_TYPE2__DURATION_FORMAT:
				return isSetDurationFormat();
			case MspdiPackage.BASELINE_TYPE2__ESTIMATED_DURATION:
				return isSetEstimatedDuration();
			case MspdiPackage.BASELINE_TYPE2__WORK:
				return WORK_EDEFAULT == null ? work != null : !WORK_EDEFAULT.equals(work);
			case MspdiPackage.BASELINE_TYPE2__COST:
				return COST_EDEFAULT == null ? cost != null : !COST_EDEFAULT.equals(cost);
			case MspdiPackage.BASELINE_TYPE2__BCWS:
				return isSetBCWS();
			case MspdiPackage.BASELINE_TYPE2__BCWP:
				return isSetBCWP();
			case MspdiPackage.BASELINE_TYPE2__FIXED_COST:
				return isSetFixedCost();
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
		result.append(", interim: ");
		if (interimESet) result.append(interim); else result.append("<unset>");
		result.append(", start: ");
		result.append(start);
		result.append(", finish: ");
		result.append(finish);
		result.append(", duration: ");
		result.append(duration);
		result.append(", durationFormat: ");
		if (durationFormatESet) result.append(durationFormat); else result.append("<unset>");
		result.append(", estimatedDuration: ");
		if (estimatedDurationESet) result.append(estimatedDuration); else result.append("<unset>");
		result.append(", work: ");
		result.append(work);
		result.append(", cost: ");
		result.append(cost);
		result.append(", bCWS: ");
		if (bCWSESet) result.append(bCWS); else result.append("<unset>");
		result.append(", bCWP: ");
		if (bCWPESet) result.append(bCWP); else result.append("<unset>");
		result.append(", fixedCost: ");
		if (fixedCostESet) result.append(fixedCost); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BaselineType2Impl
