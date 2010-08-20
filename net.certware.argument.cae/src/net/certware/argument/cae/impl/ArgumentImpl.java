/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.cae.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ReasoningElementImpl;

import net.certware.argument.cae.Argument;
import net.certware.argument.cae.CaePackage;
import net.certware.argument.cae.Evidence;
import net.certware.argument.cae.Justification;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.cae.impl.ArgumentImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link net.certware.argument.cae.impl.ArgumentImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends ReasoningElementImpl implements Argument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Kestrel Technology LLC"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> justification;

	/**
	 * The cached value of the '{@link #getEvidence() <em>Evidence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> evidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaePackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getJustification() {
		if (justification == null) {
			justification = new EObjectContainmentEList<Justification>(Justification.class, this, CaePackage.ARGUMENT__JUSTIFICATION);
		}
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<Evidence>(Evidence.class, this, CaePackage.ARGUMENT__EVIDENCE);
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
			case CaePackage.ARGUMENT__JUSTIFICATION:
				return ((InternalEList<?>)getJustification()).basicRemove(otherEnd, msgs);
			case CaePackage.ARGUMENT__EVIDENCE:
				return ((InternalEList<?>)getEvidence()).basicRemove(otherEnd, msgs);
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
			case CaePackage.ARGUMENT__JUSTIFICATION:
				return getJustification();
			case CaePackage.ARGUMENT__EVIDENCE:
				return getEvidence();
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
			case CaePackage.ARGUMENT__JUSTIFICATION:
				getJustification().clear();
				getJustification().addAll((Collection<? extends Justification>)newValue);
				return;
			case CaePackage.ARGUMENT__EVIDENCE:
				getEvidence().clear();
				getEvidence().addAll((Collection<? extends Evidence>)newValue);
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
			case CaePackage.ARGUMENT__JUSTIFICATION:
				getJustification().clear();
				return;
			case CaePackage.ARGUMENT__EVIDENCE:
				getEvidence().clear();
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
			case CaePackage.ARGUMENT__JUSTIFICATION:
				return justification != null && !justification.isEmpty();
			case CaePackage.ARGUMENT__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentImpl
