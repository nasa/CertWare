/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.impl;

import java.util.Collection;

import net.certware.measurement.sco.ArtifactCommit;
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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Commit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactCommitImpl#getArtifactIdentifiers <em>Artifact Identifiers</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactCommitImpl#getCommitIdentifier <em>Commit Identifier</em>}</li>
 *   <li>{@link net.certware.measurement.sco.impl.ArtifactCommitImpl#getUsageTime <em>Usage Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArtifactCommitImpl extends EObjectImpl implements ArtifactCommit {
	/**
	 * The cached value of the '{@link #getArtifactIdentifiers() <em>Artifact Identifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactIdentifier> artifactIdentifiers;

	/**
	 * The default value of the '{@link #getCommitIdentifier() <em>Commit Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMIT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommitIdentifier() <em>Commit Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String commitIdentifier = COMMIT_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageTime() <em>Usage Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageTime()
	 * @generated
	 * @ordered
	 */
	protected static final double USAGE_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getUsageTime() <em>Usage Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageTime()
	 * @generated
	 * @ordered
	 */
	protected double usageTime = USAGE_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactCommitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScoPackage.Literals.ARTIFACT_COMMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactIdentifier> getArtifactIdentifiers() {
		if (artifactIdentifiers == null) {
			artifactIdentifiers = new EObjectContainmentEList<ArtifactIdentifier>(ArtifactIdentifier.class, this, ScoPackage.ARTIFACT_COMMIT__ARTIFACT_IDENTIFIERS);
		}
		return artifactIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommitIdentifier() {
		return commitIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitIdentifier(String newCommitIdentifier) {
		String oldCommitIdentifier = commitIdentifier;
		commitIdentifier = newCommitIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_COMMIT__COMMIT_IDENTIFIER, oldCommitIdentifier, commitIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUsageTime() {
		return usageTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageTime(double newUsageTime) {
		double oldUsageTime = usageTime;
		usageTime = newUsageTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScoPackage.ARTIFACT_COMMIT__USAGE_TIME, oldUsageTime, usageTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ScoPackage.ARTIFACT_COMMIT__ARTIFACT_IDENTIFIERS:
			return ((InternalEList<?>)getArtifactIdentifiers()).basicRemove(otherEnd, msgs);
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
		case ScoPackage.ARTIFACT_COMMIT__ARTIFACT_IDENTIFIERS:
			return getArtifactIdentifiers();
		case ScoPackage.ARTIFACT_COMMIT__COMMIT_IDENTIFIER:
			return getCommitIdentifier();
		case ScoPackage.ARTIFACT_COMMIT__USAGE_TIME:
			return getUsageTime();
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
		case ScoPackage.ARTIFACT_COMMIT__ARTIFACT_IDENTIFIERS:
			getArtifactIdentifiers().clear();
			getArtifactIdentifiers().addAll((Collection<? extends ArtifactIdentifier>)newValue);
			return;
		case ScoPackage.ARTIFACT_COMMIT__COMMIT_IDENTIFIER:
			setCommitIdentifier((String)newValue);
			return;
		case ScoPackage.ARTIFACT_COMMIT__USAGE_TIME:
			setUsageTime((Double)newValue);
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
		case ScoPackage.ARTIFACT_COMMIT__ARTIFACT_IDENTIFIERS:
			getArtifactIdentifiers().clear();
			return;
		case ScoPackage.ARTIFACT_COMMIT__COMMIT_IDENTIFIER:
			setCommitIdentifier(COMMIT_IDENTIFIER_EDEFAULT);
			return;
		case ScoPackage.ARTIFACT_COMMIT__USAGE_TIME:
			setUsageTime(USAGE_TIME_EDEFAULT);
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
		case ScoPackage.ARTIFACT_COMMIT__ARTIFACT_IDENTIFIERS:
			return artifactIdentifiers != null && !artifactIdentifiers.isEmpty();
		case ScoPackage.ARTIFACT_COMMIT__COMMIT_IDENTIFIER:
			return COMMIT_IDENTIFIER_EDEFAULT == null ? commitIdentifier != null : !COMMIT_IDENTIFIER_EDEFAULT.equals(commitIdentifier);
		case ScoPackage.ARTIFACT_COMMIT__USAGE_TIME:
			return usageTime != USAGE_TIME_EDEFAULT;
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
		result.append(" (commitIdentifier: "); //$NON-NLS-1$
		result.append(commitIdentifier);
		result.append(", usageTime: "); //$NON-NLS-1$
		result.append(usageTime);
		result.append(')');
		return result.toString();
	}

	/**
	 * Accumulate the improvement change order count across all artifacts.
	 * @return new improvement change order object with sum of changes
	 */
	public ImprovementChangeOrders getAllImprovementChangeOrders() {
		ImprovementChangeOrders ico = ScoFactory.eINSTANCE.createImprovementChangeOrders();
		if ( artifactIdentifiers != null ) {
			for ( ArtifactIdentifier ai : this.artifactIdentifiers ) {
				addChangeOrders(ico,ai.getImprovementChangeOrders());
			}
		}
		return ico;
	}

	/**
	 * Accumulate the critical defect change order count across all artifacts.
	 * @return new critical defect change order object with sum of changes
	 */
	public CriticalDefectChangeOrders getAllCriticalDefectChangeOrders() {
		CriticalDefectChangeOrders cdco = ScoFactory.eINSTANCE.createCriticalDefectChangeOrders();
		if ( artifactIdentifiers != null ) {
			for ( ArtifactIdentifier ai : this.artifactIdentifiers ) {
				addChangeOrders(cdco,ai.getCriticalDefectChangeOrders());
			}
		}
		return cdco;
	}

	/**
	 * Accumulate the new feature change order count across all artifacts.
	 * @return new new-feature order object with sum of changes
	 */
	public NewFeatureChangeOrders getAllNewFeatureChangeOrders() {
		NewFeatureChangeOrders nfco = ScoFactory.eINSTANCE.createNewFeatureChangeOrders();
		if ( artifactIdentifiers != null ) {
			for ( ArtifactIdentifier ai : this.artifactIdentifiers ) {
				addChangeOrders(nfco,ai.getNewFeatureChangeOrders());
			}
		}
		return nfco;
	}


	/**
	 * Accumulate the normal defect change order count across all artifacts.
	 * @return new normal defect change order object with sum of changes
	 */
	public NormalDefectChangeOrders getAllNormalDefectChangeOrders() {
		NormalDefectChangeOrders ndco = ScoFactory.eINSTANCE.createNormalDefectChangeOrders();
		if ( artifactIdentifiers != null ) {
			for ( ArtifactIdentifier ai : this.artifactIdentifiers ) {
				addChangeOrders(ndco,ai.getNormalDefectChangeOrders());
			}
		}
		return ndco;

	}

	/**
	 * Accumulate the total change order count across all artifacts.
	 * @return new total order object with sum of changes
	 */
	public TotalChangeOrders getAllTotalChangeOrders() {
		TotalChangeOrders tco = ScoFactory.eINSTANCE.createTotalChangeOrders();
		if ( artifactIdentifiers != null ) {
			for ( ArtifactIdentifier ai : this.artifactIdentifiers ) {
				addChangeOrders(tco,ai.getTotalChangeOrders());
			}
		}
		return tco;
	}

	/**
	 * Accumulate and return the baselined line count across all artifacts.
	 * @return total baselined line count
	 */
	public int getAllBaselinedLineCount() {
		int count = 0;
		if ( artifactIdentifiers != null ) {

			for ( ArtifactIdentifier ai : this.artifactIdentifiers ) {
				count += ai.getBaselinedLineCount();
			}
		}
		return count;
	}

	/**
	 * Accumulate and return the current line count across all artifacts.
	 * @return total current line count
	 */
	public int getAllCurrentLineCount() {
		int count = 0;
		if ( artifactIdentifiers != null ) {
			for ( ArtifactIdentifier ai : this.artifactIdentifiers ) {
				count += ai.getCurrentLineCount();
			}
		}
		return count;
	}

	/**
	 * Adds the order fields from c2 to c1.
	 * @param c1 change count 1, updated
	 * @param c2 change count 2, not updated
	 */
	public void addChangeOrders(ChangeOrderCount c1, ChangeOrderCount c2) {
		if ( c1 == null || c2 == null )
			return;
		c1.setBrokenLines(c1.getBrokenLines() + c2.getBrokenLines());
		c1.setFixedLines( c1.getFixedLines() + c2.getFixedLines() );
		c1.setRepairEffort( c1.getRepairEffort() + c2.getRepairEffort() );
		c1.setValue( c1.getValue() + c2.getValue() );
	}


} //ArtifactCommitImpl
