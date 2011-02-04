/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import java.util.Collection;

import net.certware.measurement.smm.Measure;
import net.certware.measurement.smm.Measurement;
import net.certware.measurement.smm.MeasurementRelationship;
import net.certware.measurement.smm.Observation;
import net.certware.measurement.smm.SmmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.impl.MeasurementImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasurementImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasurementImpl#getError <em>Error</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasurementImpl#getOutMeasurement <em>Out Measurement</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasurementImpl#getInMeasurement <em>In Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasurementImpl extends SmmElementImpl implements Measurement {
	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected Observation observation;

	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected String error = ERROR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutMeasurement() <em>Out Measurement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementRelationship> outMeasurement;

	/**
	 * The cached value of the '{@link #getInMeasurement() <em>In Measurement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementRelationship> inMeasurement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measure getMeasure() {
		if (eContainerFeatureID() != SmmPackage.MEASUREMENT__MEASURE) return null;
		return (Measure)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasure(Measure newMeasure, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMeasure, SmmPackage.MEASUREMENT__MEASURE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasure(Measure newMeasure) {
		if (newMeasure != eInternalContainer() || (eContainerFeatureID() != SmmPackage.MEASUREMENT__MEASURE && newMeasure != null)) {
			if (EcoreUtil.isAncestor(this, newMeasure))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMeasure != null)
				msgs = ((InternalEObject)newMeasure).eInverseAdd(this, SmmPackage.MEASURE__MEASUREMENT, Measure.class, msgs);
			msgs = basicSetMeasure(newMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__MEASURE, newMeasure, newMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(Observation newObservation, NotificationChain msgs) {
		Observation oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__OBSERVATION, oldObservation, newObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(Observation newObservation) {
		if (newObservation != observation) {
			NotificationChain msgs = null;
			if (observation != null)
				msgs = ((InternalEObject)observation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmmPackage.MEASUREMENT__OBSERVATION, null, msgs);
			if (newObservation != null)
				msgs = ((InternalEObject)newObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmmPackage.MEASUREMENT__OBSERVATION, null, msgs);
			msgs = basicSetObservation(newObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__OBSERVATION, newObservation, newObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getError() {
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setError(String newError) {
		String oldError = error;
		error = newError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASUREMENT__ERROR, oldError, error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementRelationship> getOutMeasurement() {
		if (outMeasurement == null) {
			outMeasurement = new EObjectWithInverseResolvingEList<MeasurementRelationship>(MeasurementRelationship.class, this, SmmPackage.MEASUREMENT__OUT_MEASUREMENT, SmmPackage.MEASUREMENT_RELATIONSHIP__FROM);
		}
		return outMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementRelationship> getInMeasurement() {
		if (inMeasurement == null) {
			inMeasurement = new EObjectWithInverseResolvingEList<MeasurementRelationship>(MeasurementRelationship.class, this, SmmPackage.MEASUREMENT__IN_MEASUREMENT, SmmPackage.MEASUREMENT_RELATIONSHIP__TO);
		}
		return inMeasurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.MEASUREMENT__MEASURE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMeasure((Measure)otherEnd, msgs);
			case SmmPackage.MEASUREMENT__OUT_MEASUREMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutMeasurement()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__IN_MEASUREMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInMeasurement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.MEASUREMENT__MEASURE:
				return basicSetMeasure(null, msgs);
			case SmmPackage.MEASUREMENT__OBSERVATION:
				return basicSetObservation(null, msgs);
			case SmmPackage.MEASUREMENT__OUT_MEASUREMENT:
				return ((InternalEList<?>)getOutMeasurement()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASUREMENT__IN_MEASUREMENT:
				return ((InternalEList<?>)getInMeasurement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SmmPackage.MEASUREMENT__MEASURE:
				return eInternalContainer().eInverseRemove(this, SmmPackage.MEASURE__MEASUREMENT, Measure.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.MEASUREMENT__MEASURE:
				return getMeasure();
			case SmmPackage.MEASUREMENT__OBSERVATION:
				return getObservation();
			case SmmPackage.MEASUREMENT__ERROR:
				return getError();
			case SmmPackage.MEASUREMENT__OUT_MEASUREMENT:
				return getOutMeasurement();
			case SmmPackage.MEASUREMENT__IN_MEASUREMENT:
				return getInMeasurement();
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
			case SmmPackage.MEASUREMENT__MEASURE:
				setMeasure((Measure)newValue);
				return;
			case SmmPackage.MEASUREMENT__OBSERVATION:
				setObservation((Observation)newValue);
				return;
			case SmmPackage.MEASUREMENT__ERROR:
				setError((String)newValue);
				return;
			case SmmPackage.MEASUREMENT__OUT_MEASUREMENT:
				getOutMeasurement().clear();
				getOutMeasurement().addAll((Collection<? extends MeasurementRelationship>)newValue);
				return;
			case SmmPackage.MEASUREMENT__IN_MEASUREMENT:
				getInMeasurement().clear();
				getInMeasurement().addAll((Collection<? extends MeasurementRelationship>)newValue);
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
			case SmmPackage.MEASUREMENT__MEASURE:
				setMeasure((Measure)null);
				return;
			case SmmPackage.MEASUREMENT__OBSERVATION:
				setObservation((Observation)null);
				return;
			case SmmPackage.MEASUREMENT__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case SmmPackage.MEASUREMENT__OUT_MEASUREMENT:
				getOutMeasurement().clear();
				return;
			case SmmPackage.MEASUREMENT__IN_MEASUREMENT:
				getInMeasurement().clear();
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
			case SmmPackage.MEASUREMENT__MEASURE:
				return getMeasure() != null;
			case SmmPackage.MEASUREMENT__OBSERVATION:
				return observation != null;
			case SmmPackage.MEASUREMENT__ERROR:
				return ERROR_EDEFAULT == null ? error != null : !ERROR_EDEFAULT.equals(error);
			case SmmPackage.MEASUREMENT__OUT_MEASUREMENT:
				return outMeasurement != null && !outMeasurement.isEmpty();
			case SmmPackage.MEASUREMENT__IN_MEASUREMENT:
				return inMeasurement != null && !inMeasurement.isEmpty();
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
		result.append(" (error: "); //$NON-NLS-1$
		result.append(error);
		result.append(')');
		return result.toString();
	}

} //MeasurementImpl
