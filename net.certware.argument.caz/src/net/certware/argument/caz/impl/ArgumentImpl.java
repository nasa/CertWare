/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.caz.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ReasoningElementImpl;
import net.certware.argument.caz.Argument;
import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.Claim;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.Justification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentImpl#getArgumentJustification <em>Argument Justification</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentImpl#getArgumentEvidence <em>Argument Evidence</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentImpl#getArgumentClaims <em>Argument Claims</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends ReasoningElementImpl implements Argument {
	/**
	 * The cached value of the '{@link #getArgumentJustification() <em>Argument Justification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentJustification()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> argumentJustification;

	/**
	 * The cached value of the '{@link #getArgumentEvidence() <em>Argument Evidence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentEvidence()
	 * @generated
	 * @ordered
	 */
	protected EList<Evidence> argumentEvidence;

	/**
	 * The cached value of the '{@link #getArgumentClaims() <em>Argument Claims</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentClaims()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> argumentClaims;

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
		return CazPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getArgumentJustification() {
		if (argumentJustification == null) {
			argumentJustification = new EObjectResolvingEList<Justification>(Justification.class, this, CazPackage.ARGUMENT__ARGUMENT_JUSTIFICATION);
		}
		return argumentJustification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getArgumentEvidence() {
		if (argumentEvidence == null) {
			argumentEvidence = new EObjectResolvingEList<Evidence>(Evidence.class, this, CazPackage.ARGUMENT__ARGUMENT_EVIDENCE);
		}
		return argumentEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getArgumentClaims() {
		if (argumentClaims == null) {
			argumentClaims = new EObjectResolvingEList<Claim>(Claim.class, this, CazPackage.ARGUMENT__ARGUMENT_CLAIMS);
		}
		return argumentClaims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CazPackage.ARGUMENT__ARGUMENT_JUSTIFICATION:
				return getArgumentJustification();
			case CazPackage.ARGUMENT__ARGUMENT_EVIDENCE:
				return getArgumentEvidence();
			case CazPackage.ARGUMENT__ARGUMENT_CLAIMS:
				return getArgumentClaims();
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
			case CazPackage.ARGUMENT__ARGUMENT_JUSTIFICATION:
				getArgumentJustification().clear();
				getArgumentJustification().addAll((Collection<? extends Justification>)newValue);
				return;
			case CazPackage.ARGUMENT__ARGUMENT_EVIDENCE:
				getArgumentEvidence().clear();
				getArgumentEvidence().addAll((Collection<? extends Evidence>)newValue);
				return;
			case CazPackage.ARGUMENT__ARGUMENT_CLAIMS:
				getArgumentClaims().clear();
				getArgumentClaims().addAll((Collection<? extends Claim>)newValue);
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
			case CazPackage.ARGUMENT__ARGUMENT_JUSTIFICATION:
				getArgumentJustification().clear();
				return;
			case CazPackage.ARGUMENT__ARGUMENT_EVIDENCE:
				getArgumentEvidence().clear();
				return;
			case CazPackage.ARGUMENT__ARGUMENT_CLAIMS:
				getArgumentClaims().clear();
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
			case CazPackage.ARGUMENT__ARGUMENT_JUSTIFICATION:
				return argumentJustification != null && !argumentJustification.isEmpty();
			case CazPackage.ARGUMENT__ARGUMENT_EVIDENCE:
				return argumentEvidence != null && !argumentEvidence.isEmpty();
			case CazPackage.ARGUMENT__ARGUMENT_CLAIMS:
				return argumentClaims != null && !argumentClaims.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentImpl
