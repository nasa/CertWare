/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import net.certware.measurement.smm.Ranking;
import net.certware.measurement.smm.RankingInterval;
import net.certware.measurement.smm.SmmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ranking Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.impl.RankingIntervalImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.RankingIntervalImpl#getMaximumEndpoint <em>Maximum Endpoint</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.RankingIntervalImpl#isMaximumOpen <em>Maximum Open</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.RankingIntervalImpl#getMinimumEndpoint <em>Minimum Endpoint</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.RankingIntervalImpl#isMinimumOpen <em>Minimum Open</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.RankingIntervalImpl#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RankingIntervalImpl extends SmmElementImpl implements RankingInterval {
	/**
	 * The default value of the '{@link #getMaximumEndpoint() <em>Maximum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ENDPOINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumEndpoint() <em>Maximum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumEndpoint()
	 * @generated
	 * @ordered
	 */
	protected double maximumEndpoint = MAXIMUM_ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaximumOpen() <em>Maximum Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaximumOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAXIMUM_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaximumOpen() <em>Maximum Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaximumOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean maximumOpen = MAXIMUM_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumEndpoint() <em>Minimum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumEndpoint()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_ENDPOINT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumEndpoint() <em>Minimum Endpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumEndpoint()
	 * @generated
	 * @ordered
	 */
	protected double minimumEndpoint = MINIMUM_ENDPOINT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMinimumOpen() <em>Minimum Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinimumOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MINIMUM_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinimumOpen() <em>Minimum Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinimumOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean minimumOpen = MINIMUM_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RankingIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.RANKING_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ranking getRank() {
		if (eContainerFeatureID() != SmmPackage.RANKING_INTERVAL__RANK) return null;
		return (Ranking)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRank(Ranking newRank, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRank, SmmPackage.RANKING_INTERVAL__RANK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(Ranking newRank) {
		if (newRank != eInternalContainer() || (eContainerFeatureID() != SmmPackage.RANKING_INTERVAL__RANK && newRank != null)) {
			if (EcoreUtil.isAncestor(this, newRank))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRank != null)
				msgs = ((InternalEObject)newRank).eInverseAdd(this, SmmPackage.RANKING__INTERVAL, Ranking.class, msgs);
			msgs = basicSetRank(newRank, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__RANK, newRank, newRank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumEndpoint() {
		return maximumEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumEndpoint(double newMaximumEndpoint) {
		double oldMaximumEndpoint = maximumEndpoint;
		maximumEndpoint = newMaximumEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT, oldMaximumEndpoint, maximumEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaximumOpen() {
		return maximumOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumOpen(boolean newMaximumOpen) {
		boolean oldMaximumOpen = maximumOpen;
		maximumOpen = newMaximumOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN, oldMaximumOpen, maximumOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumEndpoint() {
		return minimumEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumEndpoint(double newMinimumEndpoint) {
		double oldMinimumEndpoint = minimumEndpoint;
		minimumEndpoint = newMinimumEndpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT, oldMinimumEndpoint, minimumEndpoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinimumOpen() {
		return minimumOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumOpen(boolean newMinimumOpen) {
		boolean oldMinimumOpen = minimumOpen;
		minimumOpen = newMinimumOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN, oldMinimumOpen, minimumOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.RANKING_INTERVAL__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.RANKING_INTERVAL__RANK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRank((Ranking)otherEnd, msgs);
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
			case SmmPackage.RANKING_INTERVAL__RANK:
				return basicSetRank(null, msgs);
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
			case SmmPackage.RANKING_INTERVAL__RANK:
				return eInternalContainer().eInverseRemove(this, SmmPackage.RANKING__INTERVAL, Ranking.class, msgs);
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
			case SmmPackage.RANKING_INTERVAL__RANK:
				return getRank();
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
				return getMaximumEndpoint();
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN:
				return isMaximumOpen();
			case SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT:
				return getMinimumEndpoint();
			case SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN:
				return isMinimumOpen();
			case SmmPackage.RANKING_INTERVAL__SYMBOL:
				return getSymbol();
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
			case SmmPackage.RANKING_INTERVAL__RANK:
				setRank((Ranking)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
				setMaximumEndpoint((Double)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN:
				setMaximumOpen((Boolean)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT:
				setMinimumEndpoint((Double)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN:
				setMinimumOpen((Boolean)newValue);
				return;
			case SmmPackage.RANKING_INTERVAL__SYMBOL:
				setSymbol((String)newValue);
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
			case SmmPackage.RANKING_INTERVAL__RANK:
				setRank((Ranking)null);
				return;
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
				setMaximumEndpoint(MAXIMUM_ENDPOINT_EDEFAULT);
				return;
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN:
				setMaximumOpen(MAXIMUM_OPEN_EDEFAULT);
				return;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT:
				setMinimumEndpoint(MINIMUM_ENDPOINT_EDEFAULT);
				return;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN:
				setMinimumOpen(MINIMUM_OPEN_EDEFAULT);
				return;
			case SmmPackage.RANKING_INTERVAL__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
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
			case SmmPackage.RANKING_INTERVAL__RANK:
				return getRank() != null;
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_ENDPOINT:
				return maximumEndpoint != MAXIMUM_ENDPOINT_EDEFAULT;
			case SmmPackage.RANKING_INTERVAL__MAXIMUM_OPEN:
				return maximumOpen != MAXIMUM_OPEN_EDEFAULT;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_ENDPOINT:
				return minimumEndpoint != MINIMUM_ENDPOINT_EDEFAULT;
			case SmmPackage.RANKING_INTERVAL__MINIMUM_OPEN:
				return minimumOpen != MINIMUM_OPEN_EDEFAULT;
			case SmmPackage.RANKING_INTERVAL__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
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
		result.append(" (maximumEndpoint: "); //$NON-NLS-1$
		result.append(maximumEndpoint);
		result.append(", maximumOpen: "); //$NON-NLS-1$
		result.append(maximumOpen);
		result.append(", minimumEndpoint: "); //$NON-NLS-1$
		result.append(minimumEndpoint);
		result.append(", minimumOpen: "); //$NON-NLS-1$
		result.append(minimumOpen);
		result.append(", symbol: "); //$NON-NLS-1$
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //RankingIntervalImpl
