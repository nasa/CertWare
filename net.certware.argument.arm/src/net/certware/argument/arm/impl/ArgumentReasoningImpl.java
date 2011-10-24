/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */
package net.certware.argument.arm.impl;

import java.util.Collection;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.AssertedInference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.arm.impl.ArgumentReasoningImpl#getDescribes <em>Describes</em>}</li>
 *   <li>{@link net.certware.argument.arm.impl.ArgumentReasoningImpl#getHasStructure <em>Has Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentReasoningImpl extends ReasoningElementImpl implements ArgumentReasoning {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) "; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getDescribes() <em>Describes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribes()
	 * @generated
	 * @ordered
	 */
	protected EList<AssertedInference> describes;

	/**
	 * The cached value of the '{@link #getHasStructure() <em>Has Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStructure()
	 * @generated
	 * @ordered
	 */
	protected Argument hasStructure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentReasoningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArmPackage.Literals.ARGUMENT_REASONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssertedInference> getDescribes() {
		if (describes == null) {
			describes = new EObjectResolvingEList<AssertedInference>(AssertedInference.class, this, ArmPackage.ARGUMENT_REASONING__DESCRIBES);
		}
		return describes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getHasStructure() {
		if (hasStructure != null && hasStructure.eIsProxy()) {
			InternalEObject oldHasStructure = (InternalEObject)hasStructure;
			hasStructure = (Argument)eResolveProxy(oldHasStructure);
			if (hasStructure != oldHasStructure) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArmPackage.ARGUMENT_REASONING__HAS_STRUCTURE, oldHasStructure, hasStructure));
			}
		}
		return hasStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument basicGetHasStructure() {
		return hasStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasStructure(Argument newHasStructure) {
		Argument oldHasStructure = hasStructure;
		hasStructure = newHasStructure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArmPackage.ARGUMENT_REASONING__HAS_STRUCTURE, oldHasStructure, hasStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArmPackage.ARGUMENT_REASONING__DESCRIBES:
				return getDescribes();
			case ArmPackage.ARGUMENT_REASONING__HAS_STRUCTURE:
				if (resolve) return getHasStructure();
				return basicGetHasStructure();
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
			case ArmPackage.ARGUMENT_REASONING__DESCRIBES:
				getDescribes().clear();
				getDescribes().addAll((Collection<? extends AssertedInference>)newValue);
				return;
			case ArmPackage.ARGUMENT_REASONING__HAS_STRUCTURE:
				setHasStructure((Argument)newValue);
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
			case ArmPackage.ARGUMENT_REASONING__DESCRIBES:
				getDescribes().clear();
				return;
			case ArmPackage.ARGUMENT_REASONING__HAS_STRUCTURE:
				setHasStructure((Argument)null);
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
			case ArmPackage.ARGUMENT_REASONING__DESCRIBES:
				return describes != null && !describes.isEmpty();
			case ArmPackage.ARGUMENT_REASONING__HAS_STRUCTURE:
				return hasStructure != null;
		}
		return super.eIsSet(featureID);
	}

} //ArgumentReasoningImpl
