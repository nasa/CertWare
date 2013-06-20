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
import net.certware.sacm.SACM.Argumentation.CitationElement;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.CitationElementImpl#getArgumentElementReference <em>Argument Element Reference</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.CitationElementImpl#getArgumentationReference <em>Argumentation Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CitationElementImpl extends ArgumentElementImpl implements CitationElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getArgumentElementReference() <em>Argument Element Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentElementReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> argumentElementReference;

	/**
	 * The cached value of the '{@link #getArgumentationReference() <em>Argumentation Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentationReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Argumentation> argumentationReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.CITATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentElement> getArgumentElementReference() {
		if (argumentElementReference == null) {
			argumentElementReference = new EObjectResolvingEList<ArgumentElement>(ArgumentElement.class, this, ArgumentationPackage.CITATION_ELEMENT__ARGUMENT_ELEMENT_REFERENCE);
		}
		return argumentElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argumentation> getArgumentationReference() {
		if (argumentationReference == null) {
			argumentationReference = new EObjectResolvingEList<Argumentation>(Argumentation.class, this, ArgumentationPackage.CITATION_ELEMENT__ARGUMENTATION_REFERENCE);
		}
		return argumentationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.CITATION_ELEMENT__TAGGED_VALUE:
				return getTaggedValue();
			case ArgumentationPackage.CITATION_ELEMENT__ANNOTATION:
				return getAnnotation();
			case ArgumentationPackage.CITATION_ELEMENT__ID:
				return getId();
			case ArgumentationPackage.CITATION_ELEMENT__DESCRIPTION:
				return getDescription();
			case ArgumentationPackage.CITATION_ELEMENT__CONTENT:
				return getContent();
			case ArgumentationPackage.CITATION_ELEMENT__ARGUMENT_ELEMENT_REFERENCE:
				return getArgumentElementReference();
			case ArgumentationPackage.CITATION_ELEMENT__ARGUMENTATION_REFERENCE:
				return getArgumentationReference();
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
			case ArgumentationPackage.CITATION_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__ID:
				setId((String)newValue);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__CONTENT:
				setContent((String)newValue);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__ARGUMENT_ELEMENT_REFERENCE:
				getArgumentElementReference().clear();
				getArgumentElementReference().addAll((Collection<? extends ArgumentElement>)newValue);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__ARGUMENTATION_REFERENCE:
				getArgumentationReference().clear();
				getArgumentationReference().addAll((Collection<? extends Argumentation>)newValue);
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
			case ArgumentationPackage.CITATION_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ArgumentationPackage.CITATION_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				return;
			case ArgumentationPackage.CITATION_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ArgumentationPackage.CITATION_ELEMENT__ARGUMENT_ELEMENT_REFERENCE:
				getArgumentElementReference().clear();
				return;
			case ArgumentationPackage.CITATION_ELEMENT__ARGUMENTATION_REFERENCE:
				getArgumentationReference().clear();
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
			case ArgumentationPackage.CITATION_ELEMENT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ArgumentationPackage.CITATION_ELEMENT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case ArgumentationPackage.CITATION_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ArgumentationPackage.CITATION_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArgumentationPackage.CITATION_ELEMENT__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case ArgumentationPackage.CITATION_ELEMENT__ARGUMENT_ELEMENT_REFERENCE:
				return argumentElementReference != null && !argumentElementReference.isEmpty();
			case ArgumentationPackage.CITATION_ELEMENT__ARGUMENTATION_REFERENCE:
				return argumentationReference != null && !argumentationReference.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //CitationElementImpl
