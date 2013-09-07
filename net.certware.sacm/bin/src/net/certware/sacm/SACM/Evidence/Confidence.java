/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Evidence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Evidence.Confidence#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getConfidence()
 * @model
 * @generated
 */
public interface Confidence extends EvidenceAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link net.certware.sacm.SACM.Evidence.ConfidenceLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see net.certware.sacm.SACM.Evidence.ConfidenceLevel
	 * @see #setValue(ConfidenceLevel)
	 * @see net.certware.sacm.SACM.Evidence.EvidencePackage#getConfidence_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ConfidenceLevel getValue();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Evidence.Confidence#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see net.certware.sacm.SACM.Evidence.ConfidenceLevel
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ConfidenceLevel value);

} // Confidence
