/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import java.util.Collection;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.NationState;
import net.certware.argument.aml.Period;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nation State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.NationStateImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.NationStateImpl#getPerspective <em>Perspective</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.NationStateImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.NationStateImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.NationStateImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.NationStateImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NationStateImpl extends EObjectImpl implements NationState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NationStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.NATION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AmlPackage.NATION_STATE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPerspective() {
		return getGroup().list(AmlPackage.Literals.NATION_STATE__PERSPECTIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Period> getPeriod() {
		return getGroup().list(AmlPackage.Literals.NATION_STATE__PERIOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getActor() {
		return getGroup().list(AmlPackage.Literals.NATION_STATE__ACTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRegion() {
		return getGroup().list(AmlPackage.Literals.NATION_STATE__REGION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEvent() {
		return getGroup().list(AmlPackage.Literals.NATION_STATE__EVENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.NATION_STATE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AmlPackage.NATION_STATE__PERIOD:
				return ((InternalEList<?>)getPeriod()).basicRemove(otherEnd, msgs);
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
			case AmlPackage.NATION_STATE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AmlPackage.NATION_STATE__PERSPECTIVE:
				return getPerspective();
			case AmlPackage.NATION_STATE__PERIOD:
				return getPeriod();
			case AmlPackage.NATION_STATE__ACTOR:
				return getActor();
			case AmlPackage.NATION_STATE__REGION:
				return getRegion();
			case AmlPackage.NATION_STATE__EVENT:
				return getEvent();
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
			case AmlPackage.NATION_STATE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AmlPackage.NATION_STATE__PERSPECTIVE:
				getPerspective().clear();
				getPerspective().addAll((Collection<? extends String>)newValue);
				return;
			case AmlPackage.NATION_STATE__PERIOD:
				getPeriod().clear();
				getPeriod().addAll((Collection<? extends Period>)newValue);
				return;
			case AmlPackage.NATION_STATE__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends String>)newValue);
				return;
			case AmlPackage.NATION_STATE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends String>)newValue);
				return;
			case AmlPackage.NATION_STATE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends String>)newValue);
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
			case AmlPackage.NATION_STATE__GROUP:
				getGroup().clear();
				return;
			case AmlPackage.NATION_STATE__PERSPECTIVE:
				getPerspective().clear();
				return;
			case AmlPackage.NATION_STATE__PERIOD:
				getPeriod().clear();
				return;
			case AmlPackage.NATION_STATE__ACTOR:
				getActor().clear();
				return;
			case AmlPackage.NATION_STATE__REGION:
				getRegion().clear();
				return;
			case AmlPackage.NATION_STATE__EVENT:
				getEvent().clear();
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
			case AmlPackage.NATION_STATE__GROUP:
				return group != null && !group.isEmpty();
			case AmlPackage.NATION_STATE__PERSPECTIVE:
				return !getPerspective().isEmpty();
			case AmlPackage.NATION_STATE__PERIOD:
				return !getPeriod().isEmpty();
			case AmlPackage.NATION_STATE__ACTOR:
				return !getActor().isEmpty();
			case AmlPackage.NATION_STATE__REGION:
				return !getRegion().isEmpty();
			case AmlPackage.NATION_STATE__EVENT:
				return !getEvent().isEmpty();
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
		result.append(" (group: "); //$NON-NLS-1$
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //NationStateImpl
