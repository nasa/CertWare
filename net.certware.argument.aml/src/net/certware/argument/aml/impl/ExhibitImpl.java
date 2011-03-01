/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml.impl;

import java.util.Collection;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.Exhibit;
import net.certware.argument.aml.MetaData;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exhibit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.argument.aml.impl.ExhibitImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.ExhibitImpl#getMetaData <em>Meta Data</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.ExhibitImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link net.certware.argument.aml.impl.ExhibitImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExhibitImpl extends EObjectImpl implements Exhibit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getArchive() <em>Archive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected EObject archive;

	/**
	 * The cached value of the '{@link #getMetaData() <em>Meta Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaData()
	 * @generated
	 * @ordered
	 */
	protected MetaData metaData;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExhibitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AmlPackage.Literals.EXHIBIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getArchive() {
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchive(EObject newArchive, NotificationChain msgs) {
		EObject oldArchive = archive;
		archive = newArchive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.EXHIBIT__ARCHIVE, oldArchive, newArchive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchive(EObject newArchive) {
		if (newArchive != archive) {
			NotificationChain msgs = null;
			if (archive != null)
				msgs = ((InternalEObject)archive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EXHIBIT__ARCHIVE, null, msgs);
			if (newArchive != null)
				msgs = ((InternalEObject)newArchive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EXHIBIT__ARCHIVE, null, msgs);
			msgs = basicSetArchive(newArchive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EXHIBIT__ARCHIVE, newArchive, newArchive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaData getMetaData() {
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaData(MetaData newMetaData, NotificationChain msgs) {
		MetaData oldMetaData = metaData;
		metaData = newMetaData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AmlPackage.EXHIBIT__META_DATA, oldMetaData, newMetaData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaData(MetaData newMetaData) {
		if (newMetaData != metaData) {
			NotificationChain msgs = null;
			if (metaData != null)
				msgs = ((InternalEObject)metaData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EXHIBIT__META_DATA, null, msgs);
			if (newMetaData != null)
				msgs = ((InternalEObject)newMetaData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AmlPackage.EXHIBIT__META_DATA, null, msgs);
			msgs = basicSetMetaData(newMetaData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EXHIBIT__META_DATA, newMetaData, newMetaData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, AmlPackage.EXHIBIT__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AmlPackage.EXHIBIT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AmlPackage.EXHIBIT__ARCHIVE:
				return basicSetArchive(null, msgs);
			case AmlPackage.EXHIBIT__META_DATA:
				return basicSetMetaData(null, msgs);
			case AmlPackage.EXHIBIT__ANNOTATION:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AmlPackage.EXHIBIT__ARCHIVE:
				return getArchive();
			case AmlPackage.EXHIBIT__META_DATA:
				return getMetaData();
			case AmlPackage.EXHIBIT__ANNOTATION:
				return getAnnotation();
			case AmlPackage.EXHIBIT__ID:
				return getId();
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
			case AmlPackage.EXHIBIT__ARCHIVE:
				setArchive((EObject)newValue);
				return;
			case AmlPackage.EXHIBIT__META_DATA:
				setMetaData((MetaData)newValue);
				return;
			case AmlPackage.EXHIBIT__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AmlPackage.EXHIBIT__ID:
				setId((String)newValue);
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
			case AmlPackage.EXHIBIT__ARCHIVE:
				setArchive((EObject)null);
				return;
			case AmlPackage.EXHIBIT__META_DATA:
				setMetaData((MetaData)null);
				return;
			case AmlPackage.EXHIBIT__ANNOTATION:
				getAnnotation().clear();
				return;
			case AmlPackage.EXHIBIT__ID:
				setId(ID_EDEFAULT);
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
			case AmlPackage.EXHIBIT__ARCHIVE:
				return archive != null;
			case AmlPackage.EXHIBIT__META_DATA:
				return metaData != null;
			case AmlPackage.EXHIBIT__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case AmlPackage.EXHIBIT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: "); //$NON-NLS-1$
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ExhibitImpl
