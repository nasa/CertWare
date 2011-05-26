/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.argument.arm.impl;

import java.util.Collection;

import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.ModelElement;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.arm.impl.ArgumentLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.certware.argument.arm.impl.ArgumentLinkImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArgumentLinkImpl extends ModelElementImpl implements ArgumentLink {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved. (generated models) "; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArmPackage.Literals.ARGUMENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, ArmPackage.ARGUMENT_LINK__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, ArmPackage.ARGUMENT_LINK__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArmPackage.ARGUMENT_LINK__TARGET:
				return getTarget();
			case ArmPackage.ARGUMENT_LINK__SOURCE:
				return getSource();
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
			case ArmPackage.ARGUMENT_LINK__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case ArmPackage.ARGUMENT_LINK__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ModelElement>)newValue);
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
			case ArmPackage.ARGUMENT_LINK__TARGET:
				getTarget().clear();
				return;
			case ArmPackage.ARGUMENT_LINK__SOURCE:
				getSource().clear();
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
			case ArmPackage.ARGUMENT_LINK__TARGET:
				return target != null && !target.isEmpty();
			case ArmPackage.ARGUMENT_LINK__SOURCE:
				return source != null && !source.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentLinkImpl
