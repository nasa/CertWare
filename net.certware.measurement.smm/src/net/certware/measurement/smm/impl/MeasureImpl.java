/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import java.util.Collection;

import net.certware.measurement.smm.Category;
import net.certware.measurement.smm.Characteristic;
import net.certware.measurement.smm.Measure;
import net.certware.measurement.smm.MeasureRelationship;
import net.certware.measurement.smm.Measurement;
import net.certware.measurement.smm.Scope;
import net.certware.measurement.smm.SmmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getEquivalentFrom <em>Equivalent From</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getEquivalentTo <em>Equivalent To</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getMeasurement <em>Measurement</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getOutMeasure <em>Out Measure</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getInMeasure <em>In Measure</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getTrait <em>Trait</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.MeasureImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MeasureImpl extends SmmElementImpl implements Measure {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The default value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected String library = LIBRARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEquivalentFrom() <em>Equivalent From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> equivalentFrom;

	/**
	 * The cached value of the '{@link #getEquivalentTo() <em>Equivalent To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalentTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> equivalentTo;

	/**
	 * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinement()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> refinement;

	/**
	 * The cached value of the '{@link #getMeasurement() <em>Measurement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurement()
	 * @generated
	 * @ordered
	 */
	protected EList<Measurement> measurement;

	/**
	 * The cached value of the '{@link #getOutMeasure() <em>Out Measure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureRelationship> outMeasure;

	/**
	 * The cached value of the '{@link #getInMeasure() <em>In Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureRelationship> inMeasure;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, SmmPackage.MEASURE__CATEGORY, SmmPackage.CATEGORY__CATEGORY_MEASURE);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(String newLibrary) {
		String oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__LIBRARY, oldLibrary, library));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getEquivalentFrom() {
		if (equivalentFrom == null) {
			equivalentFrom = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this, SmmPackage.MEASURE__EQUIVALENT_FROM, SmmPackage.MEASURE__EQUIVALENT_TO);
		}
		return equivalentFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getEquivalentTo() {
		if (equivalentTo == null) {
			equivalentTo = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this, SmmPackage.MEASURE__EQUIVALENT_TO, SmmPackage.MEASURE__EQUIVALENT_FROM);
		}
		return equivalentTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getRefinement() {
		if (refinement == null) {
			refinement = new EObjectResolvingEList<Measure>(Measure.class, this, SmmPackage.MEASURE__REFINEMENT);
		}
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measurement> getMeasurement() {
		if (measurement == null) {
			measurement = new EObjectContainmentWithInverseEList<Measurement>(Measurement.class, this, SmmPackage.MEASURE__MEASUREMENT, SmmPackage.MEASUREMENT__MEASURE);
		}
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureRelationship> getOutMeasure() {
		if (outMeasure == null) {
			outMeasure = new EObjectWithInverseResolvingEList<MeasureRelationship>(MeasureRelationship.class, this, SmmPackage.MEASURE__OUT_MEASURE, SmmPackage.MEASURE_RELATIONSHIP__FROM);
		}
		return outMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureRelationship> getInMeasure() {
		if (inMeasure == null) {
			inMeasure = new EObjectContainmentWithInverseEList<MeasureRelationship>(MeasureRelationship.class, this, SmmPackage.MEASURE__IN_MEASURE, SmmPackage.MEASURE_RELATIONSHIP__TO);
		}
		return inMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Characteristic getTrait() {
		if (eContainerFeatureID() != SmmPackage.MEASURE__TRAIT) return null;
		return (Characteristic)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrait(Characteristic newTrait, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTrait, SmmPackage.MEASURE__TRAIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrait(Characteristic newTrait) {
		if (newTrait != eInternalContainer() || (eContainerFeatureID() != SmmPackage.MEASURE__TRAIT && newTrait != null)) {
			if (EcoreUtil.isAncestor(this, newTrait))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTrait != null)
				msgs = ((InternalEObject)newTrait).eInverseAdd(this, SmmPackage.CHARACTERISTIC__CHARACTERISTICS, Characteristic.class, msgs);
			msgs = basicSetTrait(newTrait, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__TRAIT, newTrait, newTrait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		if (scope != null && scope.eIsProxy()) {
			InternalEObject oldScope = (InternalEObject)scope;
			scope = (Scope)eResolveProxy(oldScope);
			if (scope != oldScope) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmmPackage.MEASURE__SCOPE, oldScope, scope));
			}
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope basicGetScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(Scope newScope, NotificationChain msgs) {
		Scope oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, SmmPackage.SCOPE__MEASURES, Scope.class, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, SmmPackage.SCOPE__MEASURES, Scope.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.MEASURE__SCOPE, newScope, newScope));
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
			case SmmPackage.MEASURE__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentFrom()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEquivalentTo()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__MEASUREMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurement()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__OUT_MEASURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutMeasure()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__IN_MEASURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInMeasure()).basicAdd(otherEnd, msgs);
			case SmmPackage.MEASURE__TRAIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTrait((Characteristic)otherEnd, msgs);
			case SmmPackage.MEASURE__SCOPE:
				if (scope != null)
					msgs = ((InternalEObject)scope).eInverseRemove(this, SmmPackage.SCOPE__MEASURES, Scope.class, msgs);
				return basicSetScope((Scope)otherEnd, msgs);
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
			case SmmPackage.MEASURE__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				return ((InternalEList<?>)getEquivalentFrom()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				return ((InternalEList<?>)getEquivalentTo()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__MEASUREMENT:
				return ((InternalEList<?>)getMeasurement()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__OUT_MEASURE:
				return ((InternalEList<?>)getOutMeasure()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__IN_MEASURE:
				return ((InternalEList<?>)getInMeasure()).basicRemove(otherEnd, msgs);
			case SmmPackage.MEASURE__TRAIT:
				return basicSetTrait(null, msgs);
			case SmmPackage.MEASURE__SCOPE:
				return basicSetScope(null, msgs);
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
			case SmmPackage.MEASURE__TRAIT:
				return eInternalContainer().eInverseRemove(this, SmmPackage.CHARACTERISTIC__CHARACTERISTICS, Characteristic.class, msgs);
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
			case SmmPackage.MEASURE__CATEGORY:
				return getCategory();
			case SmmPackage.MEASURE__LIBRARY:
				return getLibrary();
			case SmmPackage.MEASURE__NAME:
				return getName();
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				return getEquivalentFrom();
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				return getEquivalentTo();
			case SmmPackage.MEASURE__REFINEMENT:
				return getRefinement();
			case SmmPackage.MEASURE__MEASUREMENT:
				return getMeasurement();
			case SmmPackage.MEASURE__OUT_MEASURE:
				return getOutMeasure();
			case SmmPackage.MEASURE__IN_MEASURE:
				return getInMeasure();
			case SmmPackage.MEASURE__TRAIT:
				return getTrait();
			case SmmPackage.MEASURE__SCOPE:
				if (resolve) return getScope();
				return basicGetScope();
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
			case SmmPackage.MEASURE__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SmmPackage.MEASURE__LIBRARY:
				setLibrary((String)newValue);
				return;
			case SmmPackage.MEASURE__NAME:
				setName((String)newValue);
				return;
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				getEquivalentFrom().clear();
				getEquivalentFrom().addAll((Collection<? extends Measure>)newValue);
				return;
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				getEquivalentTo().clear();
				getEquivalentTo().addAll((Collection<? extends Measure>)newValue);
				return;
			case SmmPackage.MEASURE__REFINEMENT:
				getRefinement().clear();
				getRefinement().addAll((Collection<? extends Measure>)newValue);
				return;
			case SmmPackage.MEASURE__MEASUREMENT:
				getMeasurement().clear();
				getMeasurement().addAll((Collection<? extends Measurement>)newValue);
				return;
			case SmmPackage.MEASURE__OUT_MEASURE:
				getOutMeasure().clear();
				getOutMeasure().addAll((Collection<? extends MeasureRelationship>)newValue);
				return;
			case SmmPackage.MEASURE__IN_MEASURE:
				getInMeasure().clear();
				getInMeasure().addAll((Collection<? extends MeasureRelationship>)newValue);
				return;
			case SmmPackage.MEASURE__TRAIT:
				setTrait((Characteristic)newValue);
				return;
			case SmmPackage.MEASURE__SCOPE:
				setScope((Scope)newValue);
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
			case SmmPackage.MEASURE__CATEGORY:
				getCategory().clear();
				return;
			case SmmPackage.MEASURE__LIBRARY:
				setLibrary(LIBRARY_EDEFAULT);
				return;
			case SmmPackage.MEASURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				getEquivalentFrom().clear();
				return;
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				getEquivalentTo().clear();
				return;
			case SmmPackage.MEASURE__REFINEMENT:
				getRefinement().clear();
				return;
			case SmmPackage.MEASURE__MEASUREMENT:
				getMeasurement().clear();
				return;
			case SmmPackage.MEASURE__OUT_MEASURE:
				getOutMeasure().clear();
				return;
			case SmmPackage.MEASURE__IN_MEASURE:
				getInMeasure().clear();
				return;
			case SmmPackage.MEASURE__TRAIT:
				setTrait((Characteristic)null);
				return;
			case SmmPackage.MEASURE__SCOPE:
				setScope((Scope)null);
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
			case SmmPackage.MEASURE__CATEGORY:
				return category != null && !category.isEmpty();
			case SmmPackage.MEASURE__LIBRARY:
				return LIBRARY_EDEFAULT == null ? library != null : !LIBRARY_EDEFAULT.equals(library);
			case SmmPackage.MEASURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmmPackage.MEASURE__EQUIVALENT_FROM:
				return equivalentFrom != null && !equivalentFrom.isEmpty();
			case SmmPackage.MEASURE__EQUIVALENT_TO:
				return equivalentTo != null && !equivalentTo.isEmpty();
			case SmmPackage.MEASURE__REFINEMENT:
				return refinement != null && !refinement.isEmpty();
			case SmmPackage.MEASURE__MEASUREMENT:
				return measurement != null && !measurement.isEmpty();
			case SmmPackage.MEASURE__OUT_MEASURE:
				return outMeasure != null && !outMeasure.isEmpty();
			case SmmPackage.MEASURE__IN_MEASURE:
				return inMeasure != null && !inMeasure.isEmpty();
			case SmmPackage.MEASURE__TRAIT:
				return getTrait() != null;
			case SmmPackage.MEASURE__SCOPE:
				return scope != null;
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
		result.append(" (library: "); //$NON-NLS-1$
		result.append(library);
		result.append(", name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
