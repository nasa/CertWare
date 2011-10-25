/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.impl;

import java.util.Collection;

import net.certware.measurement.sco.ArtifactCommit;
import net.certware.measurement.sco.CommitHistory;
import net.certware.measurement.sco.ScoPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.impl.CommitHistoryImpl#getCommitRecord <em>Commit Record</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommitHistoryImpl extends EObjectImpl implements CommitHistory {
	/**
	 * The cached value of the '{@link #getCommitRecord() <em>Commit Record</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitRecord()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactCommit> commitRecord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScoPackage.Literals.COMMIT_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactCommit> getCommitRecord() {
		if (commitRecord == null) {
			commitRecord = new EObjectContainmentEList<ArtifactCommit>(ArtifactCommit.class, this, ScoPackage.COMMIT_HISTORY__COMMIT_RECORD);
		}
		return commitRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScoPackage.COMMIT_HISTORY__COMMIT_RECORD:
				return ((InternalEList<?>)getCommitRecord()).basicRemove(otherEnd, msgs);
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
			case ScoPackage.COMMIT_HISTORY__COMMIT_RECORD:
				return getCommitRecord();
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
			case ScoPackage.COMMIT_HISTORY__COMMIT_RECORD:
				getCommitRecord().clear();
				getCommitRecord().addAll((Collection<? extends ArtifactCommit>)newValue);
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
			case ScoPackage.COMMIT_HISTORY__COMMIT_RECORD:
				getCommitRecord().clear();
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
			case ScoPackage.COMMIT_HISTORY__COMMIT_RECORD:
				return commitRecord != null && !commitRecord.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommitHistoryImpl
