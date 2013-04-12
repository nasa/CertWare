/**
 * AML metamodel copyright © 2000-2005 SRI International.
 * Implementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   
 * 
 */
package net.certware.argument.aml.impl;

import java.util.Collection;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.Evidence;
import net.certware.argument.aml.EvidenceExhibit;
import net.certware.argument.aml.Relevance;
import net.certware.argument.aml.Reliability;
import net.certware.argument.aml.Witness;

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
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.EvidenceImpl#getEvidenceExhibit <em>Evidence Exhibit</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.EvidenceImpl#getRelevance <em>Relevance</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.EvidenceImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.EvidenceImpl#getWitness <em>Witness</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.EvidenceImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.EvidenceImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.EvidenceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.EvidenceImpl#getOrdinal <em>Ordinal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvidenceImpl extends EObjectImpl implements Evidence {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "AML metamodel copyright © 2000-2005 SRI International.\nImplementation into plugin copyright © 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.   \n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getEvidenceExhibit() <em>Evidence Exhibit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidenceExhibit()
	 * @generated
	 * @ordered
	 */
	protected EvidenceExhibit evidenceExhibit;

	/**
	 * The cached value of the '{@link #getRelevance() <em>Relevance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevance()
	 * @generated
	 * @ordered
	 */
	protected Relevance relevance;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected Reliability reliability;

	/**
	 * The cached value of the '{@link #getWitness() <em>Witness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWitness()
	 * @generated
	 * @ordered
	 */
	protected Witness witness;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdinal() <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdinal()
	 * @generated
	 * @ordered
	 */
	protected String ordinal = ORDINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceExhibit getEvidenceExhibit() {
		return evidenceExhibit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvidenceExhibit(EvidenceExhibit newEvidenceExhibit, NotificationChain msgs) {
		EvidenceExhibit oldEvidenceExhibit = evidenceExhibit;
		evidenceExhibit = newEvidenceExhibit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT, oldEvidenceExhibit, newEvidenceExhibit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvidenceExhibit(EvidenceExhibit newEvidenceExhibit) {
		if (newEvidenceExhibit != evidenceExhibit) {
			NotificationChain msgs = null;
			if (evidenceExhibit != null)
				msgs = ((InternalEObject)evidenceExhibit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT, null, msgs);
			if (newEvidenceExhibit != null)
				msgs = ((InternalEObject)newEvidenceExhibit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT, null, msgs);
			msgs = basicSetEvidenceExhibit(newEvidenceExhibit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT, newEvidenceExhibit, newEvidenceExhibit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relevance getRelevance() {
		return relevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelevance(Relevance newRelevance, NotificationChain msgs) {
		Relevance oldRelevance = relevance;
		relevance = newRelevance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__RELEVANCE, oldRelevance, newRelevance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelevance(Relevance newRelevance) {
		if (newRelevance != relevance) {
			NotificationChain msgs = null;
			if (relevance != null)
				msgs = ((InternalEObject)relevance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EVIDENCE__RELEVANCE, null, msgs);
			if (newRelevance != null)
				msgs = ((InternalEObject)newRelevance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EVIDENCE__RELEVANCE, null, msgs);
			msgs = basicSetRelevance(newRelevance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__RELEVANCE, newRelevance, newRelevance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliability getReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReliability(Reliability newReliability, NotificationChain msgs) {
		Reliability oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__RELIABILITY, oldReliability, newReliability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(Reliability newReliability) {
		if (newReliability != reliability) {
			NotificationChain msgs = null;
			if (reliability != null)
				msgs = ((InternalEObject)reliability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EVIDENCE__RELIABILITY, null, msgs);
			if (newReliability != null)
				msgs = ((InternalEObject)newReliability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EVIDENCE__RELIABILITY, null, msgs);
			msgs = basicSetReliability(newReliability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__RELIABILITY, newReliability, newReliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Witness getWitness() {
		return witness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWitness(Witness newWitness, NotificationChain msgs) {
		Witness oldWitness = witness;
		witness = newWitness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__WITNESS, oldWitness, newWitness);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWitness(Witness newWitness) {
		if (newWitness != witness) {
			NotificationChain msgs = null;
			if (witness != null)
				msgs = ((InternalEObject)witness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EVIDENCE__WITNESS, null, msgs);
			if (newWitness != null)
				msgs = ((InternalEObject)newWitness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EVIDENCE__WITNESS, null, msgs);
			msgs = basicSetWitness(newWitness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__WITNESS, newWitness, newWitness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, AmlPackage.EVIDENCE__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrdinal() {
		return ordinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdinal(String newOrdinal) {
		String oldOrdinal = ordinal;
		ordinal = newOrdinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EVIDENCE__ORDINAL, oldOrdinal, ordinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT:
				return basicSetEvidenceExhibit(null, msgs);
			case AmlPackage.EVIDENCE__RELEVANCE:
				return basicSetRelevance(null, msgs);
			case AmlPackage.EVIDENCE__RELIABILITY:
				return basicSetReliability(null, msgs);
			case AmlPackage.EVIDENCE__WITNESS:
				return basicSetWitness(null, msgs);
			case AmlPackage.EVIDENCE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT:
				return getEvidenceExhibit();
			case AmlPackage.EVIDENCE__RELEVANCE:
				return getRelevance();
			case AmlPackage.EVIDENCE__RELIABILITY:
				return getReliability();
			case AmlPackage.EVIDENCE__WITNESS:
				return getWitness();
			case AmlPackage.EVIDENCE__ANNOTATION:
				return getAnnotation();
			case AmlPackage.EVIDENCE__ID:
				return getId();
			case AmlPackage.EVIDENCE__LABEL:
				return getLabel();
			case AmlPackage.EVIDENCE__ORDINAL:
				return getOrdinal();
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
			case AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT:
				setEvidenceExhibit((EvidenceExhibit)newValue);
				return;
			case AmlPackage.EVIDENCE__RELEVANCE:
				setRelevance((Relevance)newValue);
				return;
			case AmlPackage.EVIDENCE__RELIABILITY:
				setReliability((Reliability)newValue);
				return;
			case AmlPackage.EVIDENCE__WITNESS:
				setWitness((Witness)newValue);
				return;
			case AmlPackage.EVIDENCE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AmlPackage.EVIDENCE__ID:
				setId((String)newValue);
				return;
			case AmlPackage.EVIDENCE__LABEL:
				setLabel((String)newValue);
				return;
			case AmlPackage.EVIDENCE__ORDINAL:
				setOrdinal((String)newValue);
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
			case AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT:
				setEvidenceExhibit((EvidenceExhibit)null);
				return;
			case AmlPackage.EVIDENCE__RELEVANCE:
				setRelevance((Relevance)null);
				return;
			case AmlPackage.EVIDENCE__RELIABILITY:
				setReliability((Reliability)null);
				return;
			case AmlPackage.EVIDENCE__WITNESS:
				setWitness((Witness)null);
				return;
			case AmlPackage.EVIDENCE__ANNOTATION:
				getAnnotation().clear();
				return;
			case AmlPackage.EVIDENCE__ID:
				setId(ID_EDEFAULT);
				return;
			case AmlPackage.EVIDENCE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case AmlPackage.EVIDENCE__ORDINAL:
				setOrdinal(ORDINAL_EDEFAULT);
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
			case AmlPackage.EVIDENCE__EVIDENCE_EXHIBIT:
				return evidenceExhibit != null;
			case AmlPackage.EVIDENCE__RELEVANCE:
				return relevance != null;
			case AmlPackage.EVIDENCE__RELIABILITY:
				return reliability != null;
			case AmlPackage.EVIDENCE__WITNESS:
				return witness != null;
			case AmlPackage.EVIDENCE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case AmlPackage.EVIDENCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case AmlPackage.EVIDENCE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case AmlPackage.EVIDENCE__ORDINAL:
				return ORDINAL_EDEFAULT == null ? ordinal != null : !ORDINAL_EDEFAULT.equals(ordinal);
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(", label: "); //$NON-NLS-1$
		result.append(label);
		result.append(", ordinal: "); //$NON-NLS-1$
		result.append(ordinal);
		result.append(')');
		return result.toString();
	}

} //EvidenceImpl
