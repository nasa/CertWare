/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.caz.impl;

import java.util.Collection;

import net.certware.argument.caz.Argument;
import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.Claim;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.Justification;

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
 * An implementation of the model object '<em><b>Argument Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentDiagramImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentDiagramImpl#getClaims <em>Claims</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentDiagramImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentDiagramImpl#getAssumptions <em>Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentDiagramImpl#getJustifications <em>Justifications</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentDiagramImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link net.certware.argument.caz.impl.ArgumentDiagramImpl#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentDiagramImpl extends EObjectImpl implements ArgumentDiagram {
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
	 * The cached value of the '{@link #getClaims() <em>Claims</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaims()
	 * @generated
	 * @ordered
	 */
	protected EList<Claim> claims;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getAssumptions() <em>Assumptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> assumptions;

	/**
	 * The cached value of the '{@link #getJustifications() <em>Justifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> justifications;

	/**
	 * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> contexts;

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
	protected ArgumentDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CazPackage.Literals.ARGUMENT_DIAGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CazPackage.ARGUMENT_DIAGRAM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Claim> getClaims() {
		if (claims == null) {
			claims = new EObjectContainmentEList<Claim>(Claim.class, this, CazPackage.ARGUMENT_DIAGRAM__CLAIMS);
		}
		return claims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, CazPackage.ARGUMENT_DIAGRAM__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getAssumptions() {
		if (assumptions == null) {
			assumptions = new EObjectContainmentEList<Assumption>(Assumption.class, this, CazPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS);
		}
		return assumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getJustifications() {
		if (justifications == null) {
			justifications = new EObjectContainmentEList<Justification>(Justification.class, this, CazPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS);
		}
		return justifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getContexts() {
		if (contexts == null) {
			contexts = new EObjectContainmentEList<Context>(Context.class, this, CazPackage.ARGUMENT_DIAGRAM__CONTEXTS);
		}
		return contexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Evidence> getEvidence() {
		if (evidence == null) {
			evidence = new EObjectContainmentEList<Evidence>(Evidence.class, this, CazPackage.ARGUMENT_DIAGRAM__EVIDENCE);
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
			case CazPackage.ARGUMENT_DIAGRAM__CLAIMS:
				return ((InternalEList<?>)getClaims()).basicRemove(otherEnd, msgs);
			case CazPackage.ARGUMENT_DIAGRAM__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case CazPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				return ((InternalEList<?>)getAssumptions()).basicRemove(otherEnd, msgs);
			case CazPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				return ((InternalEList<?>)getJustifications()).basicRemove(otherEnd, msgs);
			case CazPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
			case CazPackage.ARGUMENT_DIAGRAM__EVIDENCE:
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
			case CazPackage.ARGUMENT_DIAGRAM__VERSION:
				return getVersion();
			case CazPackage.ARGUMENT_DIAGRAM__CLAIMS:
				return getClaims();
			case CazPackage.ARGUMENT_DIAGRAM__ARGUMENTS:
				return getArguments();
			case CazPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				return getAssumptions();
			case CazPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				return getJustifications();
			case CazPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				return getContexts();
			case CazPackage.ARGUMENT_DIAGRAM__EVIDENCE:
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
			case CazPackage.ARGUMENT_DIAGRAM__VERSION:
				setVersion((String)newValue);
				return;
			case CazPackage.ARGUMENT_DIAGRAM__CLAIMS:
				getClaims().clear();
				getClaims().addAll((Collection<? extends Claim>)newValue);
				return;
			case CazPackage.ARGUMENT_DIAGRAM__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case CazPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				getAssumptions().clear();
				getAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case CazPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				getJustifications().clear();
				getJustifications().addAll((Collection<? extends Justification>)newValue);
				return;
			case CazPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				getContexts().clear();
				getContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case CazPackage.ARGUMENT_DIAGRAM__EVIDENCE:
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
			case CazPackage.ARGUMENT_DIAGRAM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CazPackage.ARGUMENT_DIAGRAM__CLAIMS:
				getClaims().clear();
				return;
			case CazPackage.ARGUMENT_DIAGRAM__ARGUMENTS:
				getArguments().clear();
				return;
			case CazPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				getAssumptions().clear();
				return;
			case CazPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				getJustifications().clear();
				return;
			case CazPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				getContexts().clear();
				return;
			case CazPackage.ARGUMENT_DIAGRAM__EVIDENCE:
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
			case CazPackage.ARGUMENT_DIAGRAM__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CazPackage.ARGUMENT_DIAGRAM__CLAIMS:
				return claims != null && !claims.isEmpty();
			case CazPackage.ARGUMENT_DIAGRAM__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case CazPackage.ARGUMENT_DIAGRAM__ASSUMPTIONS:
				return assumptions != null && !assumptions.isEmpty();
			case CazPackage.ARGUMENT_DIAGRAM__JUSTIFICATIONS:
				return justifications != null && !justifications.isEmpty();
			case CazPackage.ARGUMENT_DIAGRAM__CONTEXTS:
				return contexts != null && !contexts.isEmpty();
			case CazPackage.ARGUMENT_DIAGRAM__EVIDENCE:
				return evidence != null && !evidence.isEmpty();
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
		result.append(" (version: "); //$NON-NLS-1$
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ArgumentDiagramImpl
