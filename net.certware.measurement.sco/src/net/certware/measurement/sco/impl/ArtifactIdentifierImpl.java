/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.impl;

import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ChangeOrderCount;
import net.certware.measurement.sco.CriticalDefectChangeOrders;
import net.certware.measurement.sco.ImprovementChangeOrders;
import net.certware.measurement.sco.NewFeatureChangeOrders;
import net.certware.measurement.sco.NormalDefectChangeOrders;
import net.certware.measurement.sco.ScoFactory;
import net.certware.measurement.sco.ScoPackage;
import net.certware.measurement.sco.TotalChangeOrders;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl#getBaselinedLineCount <em>Baselined Line Count</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl#getCurrentLineCount <em>Current Line Count</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl#getCriticalDefectChangeOrders <em>Critical Defect Change Orders</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl#getNormalDefectChangeOrders <em>Normal Defect Change Orders</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl#getImprovementChangeOrders <em>Improvement Change Orders</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl#getNewFeatureChangeOrders <em>New Feature Change Orders</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactIdentifierImpl#getTotalChangeOrders <em>Total Change Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactIdentifierImpl extends EObjectImpl implements ArtifactIdentifier {
	/**
	 * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaselinedLineCount() <em>Baselined Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselinedLineCount()
	 * @generated
	 * @ordered
	 */
	protected static final int BASELINED_LINE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBaselinedLineCount() <em>Baselined Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselinedLineCount()
	 * @generated
	 * @ordered
	 */
	protected int baselinedLineCount = BASELINED_LINE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentLineCount() <em>Current Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLineCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_LINE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentLineCount() <em>Current Line Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentLineCount()
	 * @generated
	 * @ordered
	 */
	protected int currentLineCount = CURRENT_LINE_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCriticalDefectChangeOrders() <em>Critical Defect Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriticalDefectChangeOrders()
	 * @generated
	 * @ordered
	 */
	protected CriticalDefectChangeOrders criticalDefectChangeOrders;

	/**
	 * The cached value of the '{@link #getNormalDefectChangeOrders() <em>Normal Defect Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalDefectChangeOrders()
	 * @generated
	 * @ordered
	 */
	protected NormalDefectChangeOrders normalDefectChangeOrders;

	/**
	 * The cached value of the '{@link #getImprovementChangeOrders() <em>Improvement Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImprovementChangeOrders()
	 * @generated
	 * @ordered
	 */
	protected ImprovementChangeOrders improvementChangeOrders;

	/**
	 * The cached value of the '{@link #getNewFeatureChangeOrders() <em>New Feature Change Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewFeatureChangeOrders()
	 * @generated
	 * @ordered
	 */
	protected NewFeatureChangeOrders newFeatureChangeOrders;

	/** total change orders reference, volatile */
	protected TotalChangeOrders totalChangeOrders = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * Creates the artifact identifier and creates its change order references.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScoPackage.Literals.ARTIFACT_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceName(String newResourceName) {
		String oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__RESOURCE_NAME, oldResourceName, resourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBaselinedLineCount() {
		return baselinedLineCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaselinedLineCount(int newBaselinedLineCount) {
		int oldBaselinedLineCount = baselinedLineCount;
		baselinedLineCount = newBaselinedLineCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT, oldBaselinedLineCount, baselinedLineCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentLineCount() {
		return currentLineCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentLineCount(int newCurrentLineCount) {
		int oldCurrentLineCount = currentLineCount;
		currentLineCount = newCurrentLineCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT, oldCurrentLineCount, currentLineCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalDefectChangeOrders getCriticalDefectChangeOrders() {
		return criticalDefectChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCriticalDefectChangeOrders(CriticalDefectChangeOrders newCriticalDefectChangeOrders, NotificationChain msgs) {
		CriticalDefectChangeOrders oldCriticalDefectChangeOrders = criticalDefectChangeOrders;
		criticalDefectChangeOrders = newCriticalDefectChangeOrders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS, oldCriticalDefectChangeOrders, newCriticalDefectChangeOrders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriticalDefectChangeOrders(CriticalDefectChangeOrders newCriticalDefectChangeOrders) {
		if (newCriticalDefectChangeOrders != criticalDefectChangeOrders) {
			NotificationChain msgs = null;
			if (criticalDefectChangeOrders != null)
				msgs = ((InternalEObject)criticalDefectChangeOrders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS, null, msgs);
			if (newCriticalDefectChangeOrders != null)
				msgs = ((InternalEObject)newCriticalDefectChangeOrders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS, null, msgs);
			msgs = basicSetCriticalDefectChangeOrders(newCriticalDefectChangeOrders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS, newCriticalDefectChangeOrders, newCriticalDefectChangeOrders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDefectChangeOrders getNormalDefectChangeOrders() {
		return normalDefectChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalDefectChangeOrders(NormalDefectChangeOrders newNormalDefectChangeOrders, NotificationChain msgs) {
		NormalDefectChangeOrders oldNormalDefectChangeOrders = normalDefectChangeOrders;
		normalDefectChangeOrders = newNormalDefectChangeOrders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS, oldNormalDefectChangeOrders, newNormalDefectChangeOrders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalDefectChangeOrders(NormalDefectChangeOrders newNormalDefectChangeOrders) {
		if (newNormalDefectChangeOrders != normalDefectChangeOrders) {
			NotificationChain msgs = null;
			if (normalDefectChangeOrders != null)
				msgs = ((InternalEObject)normalDefectChangeOrders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS, null, msgs);
			if (newNormalDefectChangeOrders != null)
				msgs = ((InternalEObject)newNormalDefectChangeOrders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS, null, msgs);
			msgs = basicSetNormalDefectChangeOrders(newNormalDefectChangeOrders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS, newNormalDefectChangeOrders, newNormalDefectChangeOrders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImprovementChangeOrders getImprovementChangeOrders() {
		return improvementChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImprovementChangeOrders(ImprovementChangeOrders newImprovementChangeOrders, NotificationChain msgs) {
		ImprovementChangeOrders oldImprovementChangeOrders = improvementChangeOrders;
		improvementChangeOrders = newImprovementChangeOrders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS, oldImprovementChangeOrders, newImprovementChangeOrders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImprovementChangeOrders(ImprovementChangeOrders newImprovementChangeOrders) {
		if (newImprovementChangeOrders != improvementChangeOrders) {
			NotificationChain msgs = null;
			if (improvementChangeOrders != null)
				msgs = ((InternalEObject)improvementChangeOrders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS, null, msgs);
			if (newImprovementChangeOrders != null)
				msgs = ((InternalEObject)newImprovementChangeOrders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS, null, msgs);
			msgs = basicSetImprovementChangeOrders(newImprovementChangeOrders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS, newImprovementChangeOrders, newImprovementChangeOrders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFeatureChangeOrders getNewFeatureChangeOrders() {
		return newFeatureChangeOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewFeatureChangeOrders(NewFeatureChangeOrders newNewFeatureChangeOrders, NotificationChain msgs) {
		NewFeatureChangeOrders oldNewFeatureChangeOrders = newFeatureChangeOrders;
		newFeatureChangeOrders = newNewFeatureChangeOrders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS, oldNewFeatureChangeOrders, newNewFeatureChangeOrders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewFeatureChangeOrders(NewFeatureChangeOrders newNewFeatureChangeOrders) {
		if (newNewFeatureChangeOrders != newFeatureChangeOrders) {
			NotificationChain msgs = null;
			if (newFeatureChangeOrders != null)
				msgs = ((InternalEObject)newFeatureChangeOrders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS, null, msgs);
			if (newNewFeatureChangeOrders != null)
				msgs = ((InternalEObject)newNewFeatureChangeOrders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS, null, msgs);
			msgs = basicSetNewFeatureChangeOrders(newNewFeatureChangeOrders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS, newNewFeatureChangeOrders, newNewFeatureChangeOrders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TotalChangeOrders getTotalChangeOrders() {
		return basicGetTotalChangeOrders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetTotalChangeOrders(TotalChangeOrders newTotalChangeOrders, NotificationChain msgs) {
		// Ensure that you remove @generated or mark it @generated NOT
		TotalChangeOrders oldTotalChangeOrders = totalChangeOrders;
		totalChangeOrders = newTotalChangeOrders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS, oldTotalChangeOrders, newTotalChangeOrders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TotalChangeOrders basicGetTotalChangeOrders() {
		// -> do not perform proxy resolution
		if ( totalChangeOrders == null ) 
			totalChangeOrders = ScoFactory.eINSTANCE.createTotalChangeOrders();
		totalChangeOrders.setBrokenLines(0);
		totalChangeOrders.setFixedLines(0);
		totalChangeOrders.setRepairEffort(0.0);
		totalChangeOrders.setValue(0);
		
		addToTotalChangeOrder(totalChangeOrders,getCriticalDefectChangeOrders());
		addToTotalChangeOrder(totalChangeOrders,getNormalDefectChangeOrders());
		addToTotalChangeOrder(totalChangeOrders,getImprovementChangeOrders());
		addToTotalChangeOrder(totalChangeOrders,getNewFeatureChangeOrders());
		
		return totalChangeOrders;
	}

	/**
	 * Adds the change order count fields to the current total change order count fields.
	 * Serves as the accumulator for the total of all change orders in an artifact identifier.
	 * @param tco total change order, fields incremented by change order values 
	 * @param coc change order count to add to total
	 */
	private void addToTotalChangeOrder(TotalChangeOrders tco, ChangeOrderCount coc) {
		if ( coc == null ) return;
		tco.setBrokenLines( tco.getBrokenLines() + coc.getBrokenLines() );
		tco.setFixedLines( tco.getFixedLines() + coc.getFixedLines() );
		tco.setRepairEffort( tco.getRepairEffort() + coc.getRepairEffort() );
		tco.setValue( tco.getValue() + coc.getValue() );
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Sets the volatile total change order record
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setTotalChangeOrders(TotalChangeOrders newTotalChangeOrders) {
		if ( newTotalChangeOrders != null ) {
			totalChangeOrders = newTotalChangeOrders;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS:
				return basicSetCriticalDefectChangeOrders(null, msgs);
			case ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS:
				return basicSetNormalDefectChangeOrders(null, msgs);
			case ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS:
				return basicSetImprovementChangeOrders(null, msgs);
			case ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS:
				return basicSetNewFeatureChangeOrders(null, msgs);
			case ScoPackage.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS:
				return basicSetTotalChangeOrders(null, msgs);
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
			case ScoPackage.ARTIFACT_IDENTIFIER__RESOURCE_NAME:
				return getResourceName();
			case ScoPackage.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT:
				return getBaselinedLineCount();
			case ScoPackage.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT:
				return getCurrentLineCount();
			case ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS:
				return getCriticalDefectChangeOrders();
			case ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS:
				return getNormalDefectChangeOrders();
			case ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS:
				return getImprovementChangeOrders();
			case ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS:
				return getNewFeatureChangeOrders();
			case ScoPackage.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS:
				return getTotalChangeOrders();
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
			case ScoPackage.ARTIFACT_IDENTIFIER__RESOURCE_NAME:
				setResourceName((String)newValue);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT:
				setBaselinedLineCount((Integer)newValue);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT:
				setCurrentLineCount((Integer)newValue);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS:
				setCriticalDefectChangeOrders((CriticalDefectChangeOrders)newValue);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS:
				setNormalDefectChangeOrders((NormalDefectChangeOrders)newValue);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS:
				setImprovementChangeOrders((ImprovementChangeOrders)newValue);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS:
				setNewFeatureChangeOrders((NewFeatureChangeOrders)newValue);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS:
				setTotalChangeOrders((TotalChangeOrders)newValue);
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
			case ScoPackage.ARTIFACT_IDENTIFIER__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT:
				setBaselinedLineCount(BASELINED_LINE_COUNT_EDEFAULT);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT:
				setCurrentLineCount(CURRENT_LINE_COUNT_EDEFAULT);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS:
				setCriticalDefectChangeOrders((CriticalDefectChangeOrders)null);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS:
				setNormalDefectChangeOrders((NormalDefectChangeOrders)null);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS:
				setImprovementChangeOrders((ImprovementChangeOrders)null);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS:
				setNewFeatureChangeOrders((NewFeatureChangeOrders)null);
				return;
			case ScoPackage.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS:
				setTotalChangeOrders((TotalChangeOrders)null);
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
			case ScoPackage.ARTIFACT_IDENTIFIER__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
			case ScoPackage.ARTIFACT_IDENTIFIER__BASELINED_LINE_COUNT:
				return baselinedLineCount != BASELINED_LINE_COUNT_EDEFAULT;
			case ScoPackage.ARTIFACT_IDENTIFIER__CURRENT_LINE_COUNT:
				return currentLineCount != CURRENT_LINE_COUNT_EDEFAULT;
			case ScoPackage.ARTIFACT_IDENTIFIER__CRITICAL_DEFECT_CHANGE_ORDERS:
				return criticalDefectChangeOrders != null;
			case ScoPackage.ARTIFACT_IDENTIFIER__NORMAL_DEFECT_CHANGE_ORDERS:
				return normalDefectChangeOrders != null;
			case ScoPackage.ARTIFACT_IDENTIFIER__IMPROVEMENT_CHANGE_ORDERS:
				return improvementChangeOrders != null;
			case ScoPackage.ARTIFACT_IDENTIFIER__NEW_FEATURE_CHANGE_ORDERS:
				return newFeatureChangeOrders != null;
			case ScoPackage.ARTIFACT_IDENTIFIER__TOTAL_CHANGE_ORDERS:
				return getTotalChangeOrders() != null;
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
		result.append(" (resourceName: "); //$NON-NLS-1$
		result.append(resourceName);
		result.append(", baselinedLineCount: "); //$NON-NLS-1$
		result.append(baselinedLineCount);
		result.append(", currentLineCount: "); //$NON-NLS-1$
		result.append(currentLineCount);
		result.append(')');
		return result.toString();
	}

} //ArtifactIdentifierImpl
