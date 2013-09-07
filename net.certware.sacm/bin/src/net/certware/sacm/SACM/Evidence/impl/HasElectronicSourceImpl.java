/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence.impl;

import java.util.Collection;

import net.certware.sacm.SACM.Annotation;

import net.certware.sacm.SACM.Evidence.CustodyProperty;
import net.certware.sacm.SACM.Evidence.EvidenceEvent;
import net.certware.sacm.SACM.Evidence.EvidencePackage;
import net.certware.sacm.SACM.Evidence.HasElectronicSource;
import net.certware.sacm.SACM.Evidence.Provenance;
import net.certware.sacm.SACM.Evidence.TimingProperty;

import net.certware.sacm.SACM.TaggedValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Electronic Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.HasElectronicSourceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.HasElectronicSourceImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.impl.HasElectronicSourceImpl#getFileSize <em>File Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasElectronicSourceImpl extends ExhibitPropertyImpl implements HasElectronicSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FILE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected Integer fileSize = FILE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasElectronicSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EvidencePackage.Literals.HAS_ELECTRONIC_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.HAS_ELECTRONIC_SOURCE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.HAS_ELECTRONIC_SOURCE__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFileSize() {
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSize(Integer newFileSize) {
		Integer oldFileSize = fileSize;
		fileSize = newFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EvidencePackage.HAS_ELECTRONIC_SOURCE__FILE_SIZE, oldFileSize, fileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__TAGGED_VALUE:
				return getTaggedValue();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__ANNOTATION:
				return getAnnotation();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__ID:
				return getId();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__TIMING:
				return getTiming();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__CUSTODY:
				return getCustody();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__PROVENANCE:
				return getProvenance();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__EVENT:
				return getEvent();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__SOURCE:
				return getSource();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__FORMAT:
				return getFormat();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__FILE_SIZE:
				return getFileSize();
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
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__ID:
				setId((String)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends TimingProperty>)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__CUSTODY:
				getCustody().clear();
				getCustody().addAll((Collection<? extends CustodyProperty>)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__PROVENANCE:
				getProvenance().clear();
				getProvenance().addAll((Collection<? extends Provenance>)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EvidenceEvent>)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__SOURCE:
				setSource((String)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__FORMAT:
				setFormat((String)newValue);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__FILE_SIZE:
				setFileSize((Integer)newValue);
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
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__ANNOTATION:
				getAnnotation().clear();
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__ID:
				setId(ID_EDEFAULT);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__TIMING:
				getTiming().clear();
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__CUSTODY:
				getCustody().clear();
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__PROVENANCE:
				getProvenance().clear();
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__EVENT:
				getEvent().clear();
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__FILE_SIZE:
				setFileSize(FILE_SIZE_EDEFAULT);
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
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__TIMING:
				return timing != null && !timing.isEmpty();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__CUSTODY:
				return custody != null && !custody.isEmpty();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__PROVENANCE:
				return provenance != null && !provenance.isEmpty();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__EVENT:
				return event != null && !event.isEmpty();
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case EvidencePackage.HAS_ELECTRONIC_SOURCE__FILE_SIZE:
				return FILE_SIZE_EDEFAULT == null ? fileSize != null : !FILE_SIZE_EDEFAULT.equals(fileSize);
		}
		return eDynamicIsSet(featureID);
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
		result.append(" (source: "); //$NON-NLS-1$
		result.append(source);
		result.append(", format: "); //$NON-NLS-1$
		result.append(format);
		result.append(", fileSize: "); //$NON-NLS-1$
		result.append(fileSize);
		result.append(')');
		return result.toString();
	}

} //HasElectronicSourceImpl
