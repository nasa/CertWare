/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.ArgumentElement;
import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argumentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentationImpl#getArgumentation <em>Argumentation</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentationImpl#getArgumentElement <em>Argument Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentationImpl extends ArgumentationElementImpl implements Argumentation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getArgumentation() <em>Argumentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Argumentation> argumentation;

	/**
	 * The cached value of the '{@link #getArgumentElement() <em>Argument Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> argumentElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ARGUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argumentation> getArgumentation() {
		if (argumentation == null) {
			argumentation = new EObjectContainmentEList<Argumentation>(Argumentation.class, this, ArgumentationPackage.ARGUMENTATION__ARGUMENTATION);
		}
		return argumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentElement> getArgumentElement() {
		if (argumentElement == null) {
			argumentElement = new EObjectContainmentEList<ArgumentElement>(ArgumentElement.class, this, ArgumentationPackage.ARGUMENTATION__ARGUMENT_ELEMENT);
		}
		return argumentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ArgumentationPackage.ARGUMENTATION__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case ArgumentationPackage.ARGUMENTATION__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case ArgumentationPackage.ARGUMENTATION__ARGUMENTATION:
				return ((InternalEList<?>)getArgumentation()).basicRemove(otherEnd, msgs);
			case ArgumentationPackage.ARGUMENTATION__ARGUMENT_ELEMENT:
				return ((InternalEList<?>)getArgumentElement()).basicRemove(otherEnd, msgs);
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
			case ArgumentationPackage.ARGUMENTATION__TAGGED_VALUE:
				return getTaggedValue();
			case ArgumentationPackage.ARGUMENTATION__ANNOTATION:
				return getAnnotation();
			case ArgumentationPackage.ARGUMENTATION__ID:
				return getId();
			case ArgumentationPackage.ARGUMENTATION__DESCRIPTION:
				return getDescription();
			case ArgumentationPackage.ARGUMENTATION__CONTENT:
				return getContent();
			case ArgumentationPackage.ARGUMENTATION__ARGUMENTATION:
				return getArgumentation();
			case ArgumentationPackage.ARGUMENTATION__ARGUMENT_ELEMENT:
				return getArgumentElement();
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
			case ArgumentationPackage.ARGUMENTATION__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION__ID:
				setId((String)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION__CONTENT:
				setContent((String)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION__ARGUMENTATION:
				getArgumentation().clear();
				getArgumentation().addAll((Collection<? extends Argumentation>)newValue);
				return;
			case ArgumentationPackage.ARGUMENTATION__ARGUMENT_ELEMENT:
				getArgumentElement().clear();
				getArgumentElement().addAll((Collection<? extends ArgumentElement>)newValue);
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
			case ArgumentationPackage.ARGUMENTATION__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ArgumentationPackage.ARGUMENTATION__ANNOTATION:
				getAnnotation().clear();
				return;
			case ArgumentationPackage.ARGUMENTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case ArgumentationPackage.ARGUMENTATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArgumentationPackage.ARGUMENTATION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ArgumentationPackage.ARGUMENTATION__ARGUMENTATION:
				getArgumentation().clear();
				return;
			case ArgumentationPackage.ARGUMENTATION__ARGUMENT_ELEMENT:
				getArgumentElement().clear();
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
			case ArgumentationPackage.ARGUMENTATION__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ArgumentationPackage.ARGUMENTATION__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case ArgumentationPackage.ARGUMENTATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ArgumentationPackage.ARGUMENTATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArgumentationPackage.ARGUMENTATION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case ArgumentationPackage.ARGUMENTATION__ARGUMENTATION:
				return argumentation != null && !argumentation.isEmpty();
			case ArgumentationPackage.ARGUMENTATION__ARGUMENT_ELEMENT:
				return argumentElement != null && !argumentElement.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //ArgumentationImpl
