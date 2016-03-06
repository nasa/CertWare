/**
 * Copyright (c) 2011 Object Management Group (SAEM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.evidence.evidence.impl;

import java.util.Collection;

import net.certware.evidence.evidence.Activity;
import net.certware.evidence.evidence.CollectionMethod;
import net.certware.evidence.evidence.CompletenessLevel;
import net.certware.evidence.evidence.ConsistencyLevel;
import net.certware.evidence.evidence.EvidenceEvaluation;
import net.certware.evidence.evidence.EvidenceItem;
import net.certware.evidence.evidence.EvidencePackage;
import net.certware.evidence.evidence.EvidenceRequest;
import net.certware.evidence.evidence.Originator;
import net.certware.evidence.evidence.ProjectObjective;
import net.certware.evidence.evidence.RequiresPackage;
import net.certware.evidence.evidence.StandardOfProof;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getConsistency <em>Consistency</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getCompleteness <em>Completeness</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getOriginator <em>Originator</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getItem <em>Item</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getRequiresPackage <em>Requires Package</em>}</li>
 *   <li>{@link net.certware.evidence.evidence.impl.PackageImpl#getEvaluation <em>Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends AdministrativeElementImpl implements net.certware.evidence.evidence.Package {
	/**
	 * The default value of the '{@link #getConsistency() <em>Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistency()
	 * @generated
	 * @ordered
	 */
	protected static final ConsistencyLevel CONSISTENCY_EDEFAULT = ConsistencyLevel.UNKNOWN;

	/**
	 * The cached value of the '{@link #getConsistency() <em>Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistency()
	 * @generated
	 * @ordered
	 */
	protected ConsistencyLevel consistency = CONSISTENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final StandardOfProof CRITERIA_EDEFAULT = StandardOfProof.UNKNOWN;

	/**
	 * The cached value of the '{@link #getCriteria() <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCriteria()
	 * @generated
	 * @ordered
	 */
	protected StandardOfProof criteria = CRITERIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteness() <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteness()
	 * @generated
	 * @ordered
	 */
	protected static final CompletenessLevel COMPLETENESS_EDEFAULT = CompletenessLevel.UNKNOWN;

	/**
	 * The cached value of the '{@link #getCompleteness() <em>Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteness()
	 * @generated
	 * @ordered
	 */
	protected CompletenessLevel completeness = COMPLETENESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<CollectionMethod> method;

	/**
	 * The cached value of the '{@link #getOriginator() <em>Originator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginator()
	 * @generated
	 * @ordered
	 */
	protected EList<Originator> originator;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceRequest> request;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectObjective> objective;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activity;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceItem> item;

	/**
	 * The cached value of the '{@link #getRequiresPackage() <em>Requires Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiresPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<RequiresPackage> requiresPackage;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceEvaluation> evaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsistencyLevel getConsistency() {
		return consistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsistency(ConsistencyLevel newConsistency) {
		ConsistencyLevel oldConsistency = consistency;
		consistency = newConsistency == null ? CONSISTENCY_EDEFAULT : newConsistency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.PACKAGE__CONSISTENCY, oldConsistency, consistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.PACKAGE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardOfProof getCriteria() {
		return criteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCriteria(StandardOfProof newCriteria) {
		StandardOfProof oldCriteria = criteria;
		criteria = newCriteria == null ? CRITERIA_EDEFAULT : newCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.PACKAGE__CRITERIA, oldCriteria, criteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletenessLevel getCompleteness() {
		return completeness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteness(CompletenessLevel newCompleteness) {
		CompletenessLevel oldCompleteness = completeness;
		completeness = newCompleteness == null ? COMPLETENESS_EDEFAULT : newCompleteness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.PACKAGE__COMPLETENESS, oldCompleteness, completeness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollectionMethod> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<CollectionMethod>(CollectionMethod.class, this, EvidencePackage.PACKAGE__METHOD);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Originator> getOriginator() {
		if (originator == null) {
			originator = new EObjectContainmentEList<Originator>(Originator.class, this, EvidencePackage.PACKAGE__ORIGINATOR);
		}
		return originator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceRequest> getRequest() {
		if (request == null) {
			request = new EObjectContainmentEList<EvidenceRequest>(EvidenceRequest.class, this, EvidencePackage.PACKAGE__REQUEST);
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectObjective> getObjective() {
		if (objective == null) {
			objective = new EObjectContainmentEList<ProjectObjective>(ProjectObjective.class, this, EvidencePackage.PACKAGE__OBJECTIVE);
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivity() {
		if (activity == null) {
			activity = new EObjectContainmentEList<Activity>(Activity.class, this, EvidencePackage.PACKAGE__ACTIVITY);
		}
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<EvidenceItem>(EvidenceItem.class, this, EvidencePackage.PACKAGE__ITEM);
		}
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequiresPackage> getRequiresPackage() {
		if (requiresPackage == null) {
			requiresPackage = new EObjectContainmentEList<RequiresPackage>(RequiresPackage.class, this, EvidencePackage.PACKAGE__REQUIRES_PACKAGE);
		}
		return requiresPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceEvaluation> getEvaluation() {
		if (evaluation == null) {
			evaluation = new EObjectContainmentEList<EvidenceEvaluation>(EvidenceEvaluation.class, this, EvidencePackage.PACKAGE__EVALUATION);
		}
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EvidencePackage.PACKAGE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PACKAGE__ORIGINATOR:
				return ((InternalEList<?>)getOriginator()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PACKAGE__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PACKAGE__OBJECTIVE:
				return ((InternalEList<?>)getObjective()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PACKAGE__ACTIVITY:
				return ((InternalEList<?>)getActivity()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PACKAGE__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PACKAGE__REQUIRES_PACKAGE:
				return ((InternalEList<?>)getRequiresPackage()).basicRemove(otherEnd, msgs);
			case EvidencePackage.PACKAGE__EVALUATION:
				return ((InternalEList<?>)getEvaluation()).basicRemove(otherEnd, msgs);
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
			case EvidencePackage.PACKAGE__CONSISTENCY:
				return getConsistency();
			case EvidencePackage.PACKAGE__VERSION:
				return getVersion();
			case EvidencePackage.PACKAGE__CRITERIA:
				return getCriteria();
			case EvidencePackage.PACKAGE__COMPLETENESS:
				return getCompleteness();
			case EvidencePackage.PACKAGE__METHOD:
				return getMethod();
			case EvidencePackage.PACKAGE__ORIGINATOR:
				return getOriginator();
			case EvidencePackage.PACKAGE__REQUEST:
				return getRequest();
			case EvidencePackage.PACKAGE__OBJECTIVE:
				return getObjective();
			case EvidencePackage.PACKAGE__ACTIVITY:
				return getActivity();
			case EvidencePackage.PACKAGE__ITEM:
				return getItem();
			case EvidencePackage.PACKAGE__REQUIRES_PACKAGE:
				return getRequiresPackage();
			case EvidencePackage.PACKAGE__EVALUATION:
				return getEvaluation();
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
			case EvidencePackage.PACKAGE__CONSISTENCY:
				setConsistency((ConsistencyLevel)newValue);
				return;
			case EvidencePackage.PACKAGE__VERSION:
				setVersion((String)newValue);
				return;
			case EvidencePackage.PACKAGE__CRITERIA:
				setCriteria((StandardOfProof)newValue);
				return;
			case EvidencePackage.PACKAGE__COMPLETENESS:
				setCompleteness((CompletenessLevel)newValue);
				return;
			case EvidencePackage.PACKAGE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends CollectionMethod>)newValue);
				return;
			case EvidencePackage.PACKAGE__ORIGINATOR:
				getOriginator().clear();
				getOriginator().addAll((Collection<? extends Originator>)newValue);
				return;
			case EvidencePackage.PACKAGE__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends EvidenceRequest>)newValue);
				return;
			case EvidencePackage.PACKAGE__OBJECTIVE:
				getObjective().clear();
				getObjective().addAll((Collection<? extends ProjectObjective>)newValue);
				return;
			case EvidencePackage.PACKAGE__ACTIVITY:
				getActivity().clear();
				getActivity().addAll((Collection<? extends Activity>)newValue);
				return;
			case EvidencePackage.PACKAGE__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends EvidenceItem>)newValue);
				return;
			case EvidencePackage.PACKAGE__REQUIRES_PACKAGE:
				getRequiresPackage().clear();
				getRequiresPackage().addAll((Collection<? extends RequiresPackage>)newValue);
				return;
			case EvidencePackage.PACKAGE__EVALUATION:
				getEvaluation().clear();
				getEvaluation().addAll((Collection<? extends EvidenceEvaluation>)newValue);
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
			case EvidencePackage.PACKAGE__CONSISTENCY:
				setConsistency(CONSISTENCY_EDEFAULT);
				return;
			case EvidencePackage.PACKAGE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case EvidencePackage.PACKAGE__CRITERIA:
				setCriteria(CRITERIA_EDEFAULT);
				return;
			case EvidencePackage.PACKAGE__COMPLETENESS:
				setCompleteness(COMPLETENESS_EDEFAULT);
				return;
			case EvidencePackage.PACKAGE__METHOD:
				getMethod().clear();
				return;
			case EvidencePackage.PACKAGE__ORIGINATOR:
				getOriginator().clear();
				return;
			case EvidencePackage.PACKAGE__REQUEST:
				getRequest().clear();
				return;
			case EvidencePackage.PACKAGE__OBJECTIVE:
				getObjective().clear();
				return;
			case EvidencePackage.PACKAGE__ACTIVITY:
				getActivity().clear();
				return;
			case EvidencePackage.PACKAGE__ITEM:
				getItem().clear();
				return;
			case EvidencePackage.PACKAGE__REQUIRES_PACKAGE:
				getRequiresPackage().clear();
				return;
			case EvidencePackage.PACKAGE__EVALUATION:
				getEvaluation().clear();
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
			case EvidencePackage.PACKAGE__CONSISTENCY:
				return consistency != CONSISTENCY_EDEFAULT;
			case EvidencePackage.PACKAGE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case EvidencePackage.PACKAGE__CRITERIA:
				return criteria != CRITERIA_EDEFAULT;
			case EvidencePackage.PACKAGE__COMPLETENESS:
				return completeness != COMPLETENESS_EDEFAULT;
			case EvidencePackage.PACKAGE__METHOD:
				return method != null && !method.isEmpty();
			case EvidencePackage.PACKAGE__ORIGINATOR:
				return originator != null && !originator.isEmpty();
			case EvidencePackage.PACKAGE__REQUEST:
				return request != null && !request.isEmpty();
			case EvidencePackage.PACKAGE__OBJECTIVE:
				return objective != null && !objective.isEmpty();
			case EvidencePackage.PACKAGE__ACTIVITY:
				return activity != null && !activity.isEmpty();
			case EvidencePackage.PACKAGE__ITEM:
				return item != null && !item.isEmpty();
			case EvidencePackage.PACKAGE__REQUIRES_PACKAGE:
				return requiresPackage != null && !requiresPackage.isEmpty();
			case EvidencePackage.PACKAGE__EVALUATION:
				return evaluation != null && !evaluation.isEmpty();
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
		result.append(" (consistency: "); //$NON-NLS-1$
		result.append(consistency);
		result.append(", version: "); //$NON-NLS-1$
		result.append(version);
		result.append(", criteria: "); //$NON-NLS-1$
		result.append(criteria);
		result.append(", completeness: "); //$NON-NLS-1$
		result.append(completeness);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
