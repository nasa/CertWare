/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import java.util.Collection;

import net.certware.measurement.smm.Annotation;
import net.certware.measurement.smm.Attribute;
import net.certware.measurement.smm.SmmElement;
import net.certware.measurement.smm.SmmModel;
import net.certware.measurement.smm.SmmPackage;
import net.certware.measurement.smm.SmmRelationship;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.impl.SmmElementImpl#getModel <em>Model</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.SmmElementImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.SmmElementImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SmmElementImpl extends EObjectImpl implements SmmElement {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmmElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.SMM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmmModel getModel() {
		if (eContainerFeatureID() != SmmPackage.SMM_ELEMENT__MODEL) return null;
		return (SmmModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(SmmModel newModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModel, SmmPackage.SMM_ELEMENT__MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(SmmModel newModel) {
		if (newModel != eInternalContainer() || (eContainerFeatureID() != SmmPackage.SMM_ELEMENT__MODEL && newModel != null)) {
			if (EcoreUtil.isAncestor(this, newModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, SmmPackage.SMM_MODEL__MODEL_ELEMENT, SmmModel.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.SMM_ELEMENT__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, SmmPackage.SMM_ELEMENT__ATTRIBUTE, SmmPackage.ATTRIBUTE__OWNER);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this, SmmPackage.SMM_ELEMENT__ANNOTATION, SmmPackage.ANNOTATION__OWNER);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmmRelationship> getInbound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmmRelationship> getOutbound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.SMM_ELEMENT__MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModel((SmmModel)otherEnd, msgs);
			case SmmPackage.SMM_ELEMENT__ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttribute()).basicAdd(otherEnd, msgs);
			case SmmPackage.SMM_ELEMENT__ANNOTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmmPackage.SMM_ELEMENT__MODEL:
				return basicSetModel(null, msgs);
			case SmmPackage.SMM_ELEMENT__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case SmmPackage.SMM_ELEMENT__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SmmPackage.SMM_ELEMENT__MODEL:
				return eInternalContainer().eInverseRemove(this, SmmPackage.SMM_MODEL__MODEL_ELEMENT, SmmModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmmPackage.SMM_ELEMENT__MODEL:
				return getModel();
			case SmmPackage.SMM_ELEMENT__ATTRIBUTE:
				return getAttribute();
			case SmmPackage.SMM_ELEMENT__ANNOTATION:
				return getAnnotation();
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
			case SmmPackage.SMM_ELEMENT__MODEL:
				setModel((SmmModel)newValue);
				return;
			case SmmPackage.SMM_ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case SmmPackage.SMM_ELEMENT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
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
			case SmmPackage.SMM_ELEMENT__MODEL:
				setModel((SmmModel)null);
				return;
			case SmmPackage.SMM_ELEMENT__ATTRIBUTE:
				getAttribute().clear();
				return;
			case SmmPackage.SMM_ELEMENT__ANNOTATION:
				getAnnotation().clear();
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
			case SmmPackage.SMM_ELEMENT__MODEL:
				return getModel() != null;
			case SmmPackage.SMM_ELEMENT__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case SmmPackage.SMM_ELEMENT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SmmElementImpl
