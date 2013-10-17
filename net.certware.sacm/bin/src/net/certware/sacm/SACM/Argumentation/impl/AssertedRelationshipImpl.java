/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.ArgumentElement;
import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.AssertedRelationship;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asserted Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.AssertedRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.AssertedRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AssertedRelationshipImpl extends AssertionImpl implements AssertedRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ASSERTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentElement> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<ArgumentElement>(ArgumentElement.class, this, ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentElement> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<ArgumentElement>(ArgumentElement.class, this, ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TAGGED_VALUE:
				return getTaggedValue();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__ANNOTATION:
				return getAnnotation();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__ID:
				return getId();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__CONTENT:
				return getContent();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE:
				return getSource();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET:
				return getTarget();
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
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__ID:
				setId((String)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__CONTENT:
				setContent((String)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends ArgumentElement>)newValue);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends ArgumentElement>)newValue);
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
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__ANNOTATION:
				getAnnotation().clear();
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__ID:
				setId(ID_EDEFAULT);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE:
				getSource().clear();
				return;
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET:
				getTarget().clear();
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
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__SOURCE:
				return source != null && !source.isEmpty();
			case ArgumentationPackage.ASSERTED_RELATIONSHIP__TARGET:
				return target != null && !target.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //AssertedRelationshipImpl
