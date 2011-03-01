/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Flag;
import net.certware.argument.aml.Witness;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.FlagImpl#getWitness <em>Witness</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.FlagImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.FlagImpl#getFlagType <em>Flag Type</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.FlagImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlagImpl extends EObjectImpl implements Flag {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlagType() <em>Flag Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagType()
	 * @generated
	 * @ordered
	 */
	protected static final String FLAG_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlagType() <em>Flag Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlagType()
	 * @generated
	 * @ordered
	 */
	protected String flagType = FLAG_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.FLAG;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.FLAG__WITNESS, oldWitness, newWitness);
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
				msgs = ((InternalEObject)witness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.FLAG__WITNESS, null, msgs);
			if (newWitness != null)
				msgs = ((InternalEObject)newWitness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.FLAG__WITNESS, null, msgs);
			msgs = basicSetWitness(newWitness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.FLAG__WITNESS, newWitness, newWitness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.FLAG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlagType() {
		return flagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlagType(String newFlagType) {
		String oldFlagType = flagType;
		flagType = newFlagType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.FLAG__FLAG_TYPE, oldFlagType, flagType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.FLAG__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.FLAG__WITNESS:
				return basicSetWitness(null, msgs);
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
			case AmlPackage.FLAG__WITNESS:
				return getWitness();
			case AmlPackage.FLAG__DESCRIPTION:
				return getDescription();
			case AmlPackage.FLAG__FLAG_TYPE:
				return getFlagType();
			case AmlPackage.FLAG__LABEL:
				return getLabel();
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
			case AmlPackage.FLAG__WITNESS:
				setWitness((Witness)newValue);
				return;
			case AmlPackage.FLAG__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case AmlPackage.FLAG__FLAG_TYPE:
				setFlagType((String)newValue);
				return;
			case AmlPackage.FLAG__LABEL:
				setLabel((String)newValue);
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
			case AmlPackage.FLAG__WITNESS:
				setWitness((Witness)null);
				return;
			case AmlPackage.FLAG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case AmlPackage.FLAG__FLAG_TYPE:
				setFlagType(FLAG_TYPE_EDEFAULT);
				return;
			case AmlPackage.FLAG__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case AmlPackage.FLAG__WITNESS:
				return witness != null;
			case AmlPackage.FLAG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case AmlPackage.FLAG__FLAG_TYPE:
				return FLAG_TYPE_EDEFAULT == null ? flagType != null : !FLAG_TYPE_EDEFAULT.equals(flagType);
			case AmlPackage.FLAG__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (description: "); //$NON-NLS-1$
		result.append(description);
		result.append(", flagType: "); //$NON-NLS-1$
		result.append(flagType);
		result.append(", label: "); //$NON-NLS-1$
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //FlagImpl
