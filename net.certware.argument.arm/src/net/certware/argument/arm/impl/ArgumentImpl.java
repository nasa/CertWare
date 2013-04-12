/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */
package net.certware.argument.arm.impl;

import java.util.Collection;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ArmPackage;

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
 *   <li>{@link net.certware.argument.arm.impl.ArgumentImpl#getContainsArgumentElement <em>Contains Argument Element</em>}</li>
 *   <li>{@link net.certware.argument.arm.impl.ArgumentImpl#getContainsArgumentLink <em>Contains Argument Link</em>}</li>
 *   <li>{@link net.certware.argument.arm.impl.ArgumentImpl#getContainsArgument <em>Contains Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends ModelElementImpl implements Argument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) "; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getContainsArgumentElement() <em>Contains Argument Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsArgumentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> containsArgumentElement;

	/**
	 * The cached value of the '{@link #getContainsArgumentLink() <em>Contains Argument Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsArgumentLink()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentLink> containsArgumentLink;

	/**
	 * The cached value of the '{@link #getContainsArgument() <em>Contains Argument</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> containsArgument;

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
		return ArmPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentElement> getContainsArgumentElement() {
		if (containsArgumentElement == null) {
			containsArgumentElement = new EObjectContainmentEList<ArgumentElement>(ArgumentElement.class, this, ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT);
		}
		return containsArgumentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentLink> getContainsArgumentLink() {
		if (containsArgumentLink == null) {
			containsArgumentLink = new EObjectContainmentEList<ArgumentLink>(ArgumentLink.class, this, ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK);
		}
		return containsArgumentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getContainsArgument() {
		if (containsArgument == null) {
			containsArgument = new EObjectContainmentEList<Argument>(Argument.class, this, ArmPackage.ARGUMENT__CONTAINS_ARGUMENT);
		}
		return containsArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				return ((InternalEList<?>)getContainsArgumentElement()).basicRemove(otherEnd, msgs);
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				return ((InternalEList<?>)getContainsArgumentLink()).basicRemove(otherEnd, msgs);
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				return ((InternalEList<?>)getContainsArgument()).basicRemove(otherEnd, msgs);
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
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				return getContainsArgumentElement();
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				return getContainsArgumentLink();
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				return getContainsArgument();
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
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				getContainsArgumentElement().clear();
				getContainsArgumentElement().addAll((Collection<? extends ArgumentElement>)newValue);
				return;
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				getContainsArgumentLink().clear();
				getContainsArgumentLink().addAll((Collection<? extends ArgumentLink>)newValue);
				return;
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				getContainsArgument().clear();
				getContainsArgument().addAll((Collection<? extends Argument>)newValue);
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
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				getContainsArgumentElement().clear();
				return;
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				getContainsArgumentLink().clear();
				return;
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				getContainsArgument().clear();
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
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				return containsArgumentElement != null && !containsArgumentElement.isEmpty();
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				return containsArgumentLink != null && !containsArgumentLink.isEmpty();
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				return containsArgument != null && !containsArgument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentImpl
