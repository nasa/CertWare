/**
 * Copyright (c) 2010 Object Management Group (SMM metamodel)
 * Copyright (c) 2010 Castor Technology (ecore from schema, Eclipse GMT MODISCO)
 * Kestrel Technology LLC (modified generated models) 
 */
package net.certware.measurement.smm.impl;

import java.util.Collection;

import net.certware.measurement.smm.Category;
import net.certware.measurement.smm.CategoryRelationship;
import net.certware.measurement.smm.Measure;
import net.certware.measurement.smm.SmmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.measurement.smm.impl.CategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.CategoryImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.CategoryImpl#getCategoryElement <em>Category Element</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.CategoryImpl#getOutCategory <em>Out Category</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.CategoryImpl#getInCategory <em>In Category</em>}</li>
 *   <li>{@link net.certware.measurement.smm.impl.CategoryImpl#getCategoryMeasure <em>Category Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CategoryImpl extends SmmElementImpl implements Category {
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
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getCategoryElement() <em>Category Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categoryElement;

	/**
	 * The cached value of the '{@link #getOutCategory() <em>Out Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRelationship> outCategory;

	/**
	 * The cached value of the '{@link #getInCategory() <em>In Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRelationship> inCategory;

	/**
	 * The cached value of the '{@link #getCategoryMeasure() <em>Category Measure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> categoryMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SmmPackage.Literals.CATEGORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SmmPackage.CATEGORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, SmmPackage.CATEGORY__CATEGORY, SmmPackage.CATEGORY__CATEGORY_ELEMENT);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategoryElement() {
		if (categoryElement == null) {
			categoryElement = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, SmmPackage.CATEGORY__CATEGORY_ELEMENT, SmmPackage.CATEGORY__CATEGORY);
		}
		return categoryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryRelationship> getOutCategory() {
		if (outCategory == null) {
			outCategory = new EObjectWithInverseResolvingEList<CategoryRelationship>(CategoryRelationship.class, this, SmmPackage.CATEGORY__OUT_CATEGORY, SmmPackage.CATEGORY_RELATIONSHIP__FROM);
		}
		return outCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CategoryRelationship> getInCategory() {
		if (inCategory == null) {
			inCategory = new EObjectWithInverseResolvingEList<CategoryRelationship>(CategoryRelationship.class, this, SmmPackage.CATEGORY__IN_CATEGORY, SmmPackage.CATEGORY_RELATIONSHIP__TO);
		}
		return inCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Measure> getCategoryMeasure() {
		if (categoryMeasure == null) {
			categoryMeasure = new EObjectWithInverseResolvingEList.ManyInverse<Measure>(Measure.class, this, SmmPackage.CATEGORY__CATEGORY_MEASURE, SmmPackage.MEASURE__CATEGORY);
		}
		return categoryMeasure;
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
			case SmmPackage.CATEGORY__CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategory()).basicAdd(otherEnd, msgs);
			case SmmPackage.CATEGORY__CATEGORY_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryElement()).basicAdd(otherEnd, msgs);
			case SmmPackage.CATEGORY__OUT_CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutCategory()).basicAdd(otherEnd, msgs);
			case SmmPackage.CATEGORY__IN_CATEGORY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInCategory()).basicAdd(otherEnd, msgs);
			case SmmPackage.CATEGORY__CATEGORY_MEASURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategoryMeasure()).basicAdd(otherEnd, msgs);
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
			case SmmPackage.CATEGORY__CATEGORY:
				return ((InternalEList<?>)getCategory()).basicRemove(otherEnd, msgs);
			case SmmPackage.CATEGORY__CATEGORY_ELEMENT:
				return ((InternalEList<?>)getCategoryElement()).basicRemove(otherEnd, msgs);
			case SmmPackage.CATEGORY__OUT_CATEGORY:
				return ((InternalEList<?>)getOutCategory()).basicRemove(otherEnd, msgs);
			case SmmPackage.CATEGORY__IN_CATEGORY:
				return ((InternalEList<?>)getInCategory()).basicRemove(otherEnd, msgs);
			case SmmPackage.CATEGORY__CATEGORY_MEASURE:
				return ((InternalEList<?>)getCategoryMeasure()).basicRemove(otherEnd, msgs);
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
			case SmmPackage.CATEGORY__NAME:
				return getName();
			case SmmPackage.CATEGORY__CATEGORY:
				return getCategory();
			case SmmPackage.CATEGORY__CATEGORY_ELEMENT:
				return getCategoryElement();
			case SmmPackage.CATEGORY__OUT_CATEGORY:
				return getOutCategory();
			case SmmPackage.CATEGORY__IN_CATEGORY:
				return getInCategory();
			case SmmPackage.CATEGORY__CATEGORY_MEASURE:
				return getCategoryMeasure();
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
			case SmmPackage.CATEGORY__NAME:
				setName((String)newValue);
				return;
			case SmmPackage.CATEGORY__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case SmmPackage.CATEGORY__CATEGORY_ELEMENT:
				getCategoryElement().clear();
				getCategoryElement().addAll((Collection<? extends Category>)newValue);
				return;
			case SmmPackage.CATEGORY__OUT_CATEGORY:
				getOutCategory().clear();
				getOutCategory().addAll((Collection<? extends CategoryRelationship>)newValue);
				return;
			case SmmPackage.CATEGORY__IN_CATEGORY:
				getInCategory().clear();
				getInCategory().addAll((Collection<? extends CategoryRelationship>)newValue);
				return;
			case SmmPackage.CATEGORY__CATEGORY_MEASURE:
				getCategoryMeasure().clear();
				getCategoryMeasure().addAll((Collection<? extends Measure>)newValue);
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
			case SmmPackage.CATEGORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SmmPackage.CATEGORY__CATEGORY:
				getCategory().clear();
				return;
			case SmmPackage.CATEGORY__CATEGORY_ELEMENT:
				getCategoryElement().clear();
				return;
			case SmmPackage.CATEGORY__OUT_CATEGORY:
				getOutCategory().clear();
				return;
			case SmmPackage.CATEGORY__IN_CATEGORY:
				getInCategory().clear();
				return;
			case SmmPackage.CATEGORY__CATEGORY_MEASURE:
				getCategoryMeasure().clear();
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
			case SmmPackage.CATEGORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SmmPackage.CATEGORY__CATEGORY:
				return category != null && !category.isEmpty();
			case SmmPackage.CATEGORY__CATEGORY_ELEMENT:
				return categoryElement != null && !categoryElement.isEmpty();
			case SmmPackage.CATEGORY__OUT_CATEGORY:
				return outCategory != null && !outCategory.isEmpty();
			case SmmPackage.CATEGORY__IN_CATEGORY:
				return inCategory != null && !inCategory.isEmpty();
			case SmmPackage.CATEGORY__CATEGORY_MEASURE:
				return categoryMeasure != null && !categoryMeasure.isEmpty();
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
