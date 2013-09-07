/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.Argumentation;

import net.certware.sacm.SACM.AssuranceCase;

import net.certware.sacm.SACM.Evidence.EvidenceContainer;

import net.certware.sacm.SACM.SACMPackage;
import net.certware.sacm.SACM.TaggedValue;

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
 * An implementation of the model object '<em><b>Assurance Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.impl.AssuranceCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.impl.AssuranceCaseImpl#getGid <em>Gid</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.impl.AssuranceCaseImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.impl.AssuranceCaseImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssuranceCaseImpl extends ModelElementImpl implements AssuranceCase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected static final String GID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGid() <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGid()
	 * @generated
	 * @ordered
	 */
	protected String gid = GID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argumentation> argument;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<EvidenceContainer> evidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssuranceCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SACMPackage.Literals.ASSURANCE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SACMPackage.ASSURANCE_CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGid() {
		return gid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGid(String newGid) {
		String oldGid = gid;
		gid = newGid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SACMPackage.ASSURANCE_CASE__GID, oldGid, gid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argumentation> getArgument() {
		if (argument == null) {
			argument = new EObjectContainmentEList<Argumentation>(Argumentation.class, this, SACMPackage.ASSURANCE_CASE__ARGUMENT);
		}
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EvidenceContainer> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<EvidenceContainer>(EvidenceContainer.class, this, SACMPackage.ASSURANCE_CASE__EVIDENCE);
		}
		return evidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SACMPackage.ASSURANCE_CASE__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case SACMPackage.ASSURANCE_CASE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case SACMPackage.ASSURANCE_CASE__ARGUMENT:
				return ((InternalEList<?>)getArgument()).basicRemove(otherEnd, msgs);
			case SACMPackage.ASSURANCE_CASE__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
		}
		return eDynamicInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SACMPackage.ASSURANCE_CASE__TAGGED_VALUE:
				return getTaggedValue();
			case SACMPackage.ASSURANCE_CASE__ANNOTATION:
				return getAnnotation();
			case SACMPackage.ASSURANCE_CASE__ID:
				return getId();
			case SACMPackage.ASSURANCE_CASE__NAME:
				return getName();
			case SACMPackage.ASSURANCE_CASE__GID:
				return getGid();
			case SACMPackage.ASSURANCE_CASE__ARGUMENT:
				return getArgument();
			case SACMPackage.ASSURANCE_CASE__EVIDENCE:
				return getEvidence();
		}
		return eDynamicGet(featureID, resolve, coreType);
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
			case SACMPackage.ASSURANCE_CASE__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case SACMPackage.ASSURANCE_CASE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SACMPackage.ASSURANCE_CASE__ID:
				setId((String)newValue);
				return;
			case SACMPackage.ASSURANCE_CASE__NAME:
				setName((String)newValue);
				return;
			case SACMPackage.ASSURANCE_CASE__GID:
				setGid((String)newValue);
				return;
			case SACMPackage.ASSURANCE_CASE__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Argumentation>)newValue);
				return;
			case SACMPackage.ASSURANCE_CASE__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends EvidenceContainer>)newValue);
				return;
		}
		eDynamicSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SACMPackage.ASSURANCE_CASE__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case SACMPackage.ASSURANCE_CASE__ANNOTATION:
				getAnnotation().clear();
				return;
			case SACMPackage.ASSURANCE_CASE__ID:
				setId(ID_EDEFAULT);
				return;
			case SACMPackage.ASSURANCE_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SACMPackage.ASSURANCE_CASE__GID:
				setGid(GID_EDEFAULT);
				return;
			case SACMPackage.ASSURANCE_CASE__ARGUMENT:
				getArgument().clear();
				return;
			case SACMPackage.ASSURANCE_CASE__EVIDENCE:
				getEvidence().clear();
				return;
		}
		eDynamicUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SACMPackage.ASSURANCE_CASE__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case SACMPackage.ASSURANCE_CASE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case SACMPackage.ASSURANCE_CASE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SACMPackage.ASSURANCE_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SACMPackage.ASSURANCE_CASE__GID:
				return GID_EDEFAULT == null ? gid != null : !GID_EDEFAULT.equals(gid);
			case SACMPackage.ASSURANCE_CASE__ARGUMENT:
				return argument != null && !argument.isEmpty();
			case SACMPackage.ASSURANCE_CASE__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", gid: "); //$NON-NLS-1$
		result.append(gid);
		result.append(')');
		return result.toString();
	}

} //AssuranceCaseImpl
