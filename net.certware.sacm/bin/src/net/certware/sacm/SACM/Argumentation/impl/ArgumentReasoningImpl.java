/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Argumentation.ArgumentReasoning;
import net.certware.sacm.SACM.Argumentation.Argumentation;
import net.certware.sacm.SACM.Argumentation.ArgumentationPackage;
import net.certware.sacm.SACM.Argumentation.AssertedChallenge;
import net.certware.sacm.SACM.Argumentation.AssertedInference;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentReasoningImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentReasoningImpl#getDescribedInference <em>Described Inference</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.impl.ArgumentReasoningImpl#getDescribedChallenge <em>Described Challenge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentReasoningImpl extends ReasoningElementImpl implements ArgumentReasoning {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected EList<Argumentation> structure;

	/**
	 * The cached value of the '{@link #getDescribedInference() <em>Described Inference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedInference()
	 * @generated
	 * @ordered
	 */
	protected EList<AssertedInference> describedInference;

	/**
	 * The cached value of the '{@link #getDescribedChallenge() <em>Described Challenge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribedChallenge()
	 * @generated
	 * @ordered
	 */
	protected EList<AssertedChallenge> describedChallenge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentReasoningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ARGUMENT_REASONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argumentation> getStructure() {
		if (structure == null) {
			structure = new EObjectResolvingEList<Argumentation>(Argumentation.class, this, ArgumentationPackage.ARGUMENT_REASONING__STRUCTURE);
		}
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssertedInference> getDescribedInference() {
		if (describedInference == null) {
			describedInference = new EObjectResolvingEList<AssertedInference>(AssertedInference.class, this, ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_INFERENCE);
		}
		return describedInference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssertedChallenge> getDescribedChallenge() {
		if (describedChallenge == null) {
			describedChallenge = new EObjectResolvingEList<AssertedChallenge>(AssertedChallenge.class, this, ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_CHALLENGE);
		}
		return describedChallenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ARGUMENT_REASONING__TAGGED_VALUE:
				return getTaggedValue();
			case ArgumentationPackage.ARGUMENT_REASONING__ANNOTATION:
				return getAnnotation();
			case ArgumentationPackage.ARGUMENT_REASONING__ID:
				return getId();
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIPTION:
				return getDescription();
			case ArgumentationPackage.ARGUMENT_REASONING__CONTENT:
				return getContent();
			case ArgumentationPackage.ARGUMENT_REASONING__STRUCTURE:
				return getStructure();
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_INFERENCE:
				return getDescribedInference();
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_CHALLENGE:
				return getDescribedChallenge();
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
			case ArgumentationPackage.ARGUMENT_REASONING__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__ID:
				setId((String)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__CONTENT:
				setContent((String)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__STRUCTURE:
				getStructure().clear();
				getStructure().addAll((Collection<? extends Argumentation>)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_INFERENCE:
				getDescribedInference().clear();
				getDescribedInference().addAll((Collection<? extends AssertedInference>)newValue);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_CHALLENGE:
				getDescribedChallenge().clear();
				getDescribedChallenge().addAll((Collection<? extends AssertedChallenge>)newValue);
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
			case ArgumentationPackage.ARGUMENT_REASONING__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__ANNOTATION:
				getAnnotation().clear();
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__ID:
				setId(ID_EDEFAULT);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__STRUCTURE:
				getStructure().clear();
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_INFERENCE:
				getDescribedInference().clear();
				return;
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_CHALLENGE:
				getDescribedChallenge().clear();
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
			case ArgumentationPackage.ARGUMENT_REASONING__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case ArgumentationPackage.ARGUMENT_REASONING__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case ArgumentationPackage.ARGUMENT_REASONING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ArgumentationPackage.ARGUMENT_REASONING__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case ArgumentationPackage.ARGUMENT_REASONING__STRUCTURE:
				return structure != null && !structure.isEmpty();
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_INFERENCE:
				return describedInference != null && !describedInference.isEmpty();
			case ArgumentationPackage.ARGUMENT_REASONING__DESCRIBED_CHALLENGE:
				return describedChallenge != null && !describedChallenge.isEmpty();
		}
		return eDynamicIsSet(featureID);
	}

} //ArgumentReasoningImpl
