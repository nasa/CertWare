/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz.impl;

import java.util.Collection;

import net.certware.argument.arm.impl.ClaimImpl;

import net.certware.argument.euz.Argument;
import net.certware.argument.euz.Assumption;
import net.certware.argument.euz.Context;
import net.certware.argument.euz.Criteria;
import net.certware.argument.euz.EuzPackage;
import net.certware.argument.euz.Justification;
import net.certware.argument.euz.Solution;
import net.certware.argument.euz.Strategy;

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
 *   <li>{@link net.certware.argument.euz.impl.ArgumentImpl#getArgumentStrategies <em>Argument Strategies</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.ArgumentImpl#getArgumentAssumptions <em>Argument Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.ArgumentImpl#getArgumentContexts <em>Argument Contexts</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.ArgumentImpl#getArgumentSolutions <em>Argument Solutions</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.ArgumentImpl#getArgumentCriteria <em>Argument Criteria</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.ArgumentImpl#getArgumentJustifications <em>Argument Justifications</em>}</li>
 *   <li>{@link net.certware.argument.euz.impl.ArgumentImpl#getSubArguments <em>Sub Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends ClaimImpl implements Argument {
	/**
	 * The cached value of the '{@link #getArgumentStrategies() <em>Argument Strategies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentStrategies()
	 * @generated
	 * @ordered
	 */
	protected EList<Strategy> argumentStrategies;

	/**
	 * The cached value of the '{@link #getArgumentAssumptions() <em>Argument Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> argumentAssumptions;

	/**
	 * The cached value of the '{@link #getArgumentContexts() <em>Argument Contexts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<Context> argumentContexts;

	/**
	 * The cached value of the '{@link #getArgumentSolutions() <em>Argument Solutions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentSolutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Solution> argumentSolutions;

	/**
	 * The cached value of the '{@link #getArgumentCriteria() <em>Argument Criteria</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentCriteria()
	 * @generated
	 * @ordered
	 */
	protected EList<Criteria> argumentCriteria;

	/**
	 * The cached value of the '{@link #getArgumentJustifications() <em>Argument Justifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentJustifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Justification> argumentJustifications;

	/**
	 * The cached value of the '{@link #getSubArguments() <em>Sub Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> subArguments;

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
		return EuzPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Strategy> getArgumentStrategies() {
		if (argumentStrategies == null) {
			argumentStrategies = new EObjectResolvingEList<Strategy>(Strategy.class, this, EuzPackage.ARGUMENT__ARGUMENT_STRATEGIES);
		}
		return argumentStrategies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getArgumentAssumptions() {
		if (argumentAssumptions == null) {
			argumentAssumptions = new EObjectResolvingEList<Assumption>(Assumption.class, this, EuzPackage.ARGUMENT__ARGUMENT_ASSUMPTIONS);
		}
		return argumentAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Context> getArgumentContexts() {
		if (argumentContexts == null) {
			argumentContexts = new EObjectResolvingEList<Context>(Context.class, this, EuzPackage.ARGUMENT__ARGUMENT_CONTEXTS);
		}
		return argumentContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Solution> getArgumentSolutions() {
		if (argumentSolutions == null) {
			argumentSolutions = new EObjectResolvingEList<Solution>(Solution.class, this, EuzPackage.ARGUMENT__ARGUMENT_SOLUTIONS);
		}
		return argumentSolutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Criteria> getArgumentCriteria() {
		if (argumentCriteria == null) {
			argumentCriteria = new EObjectResolvingEList<Criteria>(Criteria.class, this, EuzPackage.ARGUMENT__ARGUMENT_CRITERIA);
		}
		return argumentCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Justification> getArgumentJustifications() {
		if (argumentJustifications == null) {
			argumentJustifications = new EObjectResolvingEList<Justification>(Justification.class, this, EuzPackage.ARGUMENT__ARGUMENT_JUSTIFICATIONS);
		}
		return argumentJustifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getSubArguments() {
		if (subArguments == null) {
			subArguments = new EObjectResolvingEList<Argument>(Argument.class, this, EuzPackage.ARGUMENT__SUB_ARGUMENTS);
		}
		return subArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EuzPackage.ARGUMENT__ARGUMENT_STRATEGIES:
				return getArgumentStrategies();
			case EuzPackage.ARGUMENT__ARGUMENT_ASSUMPTIONS:
				return getArgumentAssumptions();
			case EuzPackage.ARGUMENT__ARGUMENT_CONTEXTS:
				return getArgumentContexts();
			case EuzPackage.ARGUMENT__ARGUMENT_SOLUTIONS:
				return getArgumentSolutions();
			case EuzPackage.ARGUMENT__ARGUMENT_CRITERIA:
				return getArgumentCriteria();
			case EuzPackage.ARGUMENT__ARGUMENT_JUSTIFICATIONS:
				return getArgumentJustifications();
			case EuzPackage.ARGUMENT__SUB_ARGUMENTS:
				return getSubArguments();
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
			case EuzPackage.ARGUMENT__ARGUMENT_STRATEGIES:
				getArgumentStrategies().clear();
				getArgumentStrategies().addAll((Collection<? extends Strategy>)newValue);
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_ASSUMPTIONS:
				getArgumentAssumptions().clear();
				getArgumentAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_CONTEXTS:
				getArgumentContexts().clear();
				getArgumentContexts().addAll((Collection<? extends Context>)newValue);
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_SOLUTIONS:
				getArgumentSolutions().clear();
				getArgumentSolutions().addAll((Collection<? extends Solution>)newValue);
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_CRITERIA:
				getArgumentCriteria().clear();
				getArgumentCriteria().addAll((Collection<? extends Criteria>)newValue);
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_JUSTIFICATIONS:
				getArgumentJustifications().clear();
				getArgumentJustifications().addAll((Collection<? extends Justification>)newValue);
				return;
			case EuzPackage.ARGUMENT__SUB_ARGUMENTS:
				getSubArguments().clear();
				getSubArguments().addAll((Collection<? extends Argument>)newValue);
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
			case EuzPackage.ARGUMENT__ARGUMENT_STRATEGIES:
				getArgumentStrategies().clear();
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_ASSUMPTIONS:
				getArgumentAssumptions().clear();
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_CONTEXTS:
				getArgumentContexts().clear();
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_SOLUTIONS:
				getArgumentSolutions().clear();
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_CRITERIA:
				getArgumentCriteria().clear();
				return;
			case EuzPackage.ARGUMENT__ARGUMENT_JUSTIFICATIONS:
				getArgumentJustifications().clear();
				return;
			case EuzPackage.ARGUMENT__SUB_ARGUMENTS:
				getSubArguments().clear();
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
			case EuzPackage.ARGUMENT__ARGUMENT_STRATEGIES:
				return argumentStrategies != null && !argumentStrategies.isEmpty();
			case EuzPackage.ARGUMENT__ARGUMENT_ASSUMPTIONS:
				return argumentAssumptions != null && !argumentAssumptions.isEmpty();
			case EuzPackage.ARGUMENT__ARGUMENT_CONTEXTS:
				return argumentContexts != null && !argumentContexts.isEmpty();
			case EuzPackage.ARGUMENT__ARGUMENT_SOLUTIONS:
				return argumentSolutions != null && !argumentSolutions.isEmpty();
			case EuzPackage.ARGUMENT__ARGUMENT_CRITERIA:
				return argumentCriteria != null && !argumentCriteria.isEmpty();
			case EuzPackage.ARGUMENT__ARGUMENT_JUSTIFICATIONS:
				return argumentJustifications != null && !argumentJustifications.isEmpty();
			case EuzPackage.ARGUMENT__SUB_ARGUMENTS:
				return subArguments != null && !subArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentImpl
