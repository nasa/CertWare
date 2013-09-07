/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Electronic Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getSource <em>Source</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getFormat <em>Format</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getFileSize <em>File Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getHasElectronicSource()
 * @model
 * @generated
 */
public interface HasElectronicSource extends ExhibitProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getHasElectronicSource_Source()
	 * @model dataType="net.certware.sacm.SACM.String" required="true" ordered="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getHasElectronicSource_Format()
	 * @model dataType="net.certware.sacm.SACM.String" required="true" ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(Integer)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getHasElectronicSource_FileSize()
	 * @model dataType="net.certware.sacm.SACM.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getFileSize();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.HasElectronicSource#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(Integer value);

} // HasElectronicSource
