/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.Claim#getAssumed <em>Assumed</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.Claim#getToBeSupported <em>To Be Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getClaim()
 * @model
 * @generated
 */
public interface Claim extends Assertion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumed</em>' attribute.
	 * @see #setAssumed(Boolean)
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getClaim_Assumed()
	 * @model dataType="net.certware.sacm.SACM.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getAssumed();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Argumentation.Claim#getAssumed <em>Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumed</em>' attribute.
	 * @see #getAssumed()
	 * @generated
	 */
	void setAssumed(Boolean value);

	/**
	 * Returns the value of the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Supported</em>' attribute.
	 * @see #setToBeSupported(Boolean)
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getClaim_ToBeSupported()
	 * @model dataType="net.certware.sacm.SACM.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getToBeSupported();

	/**
	 * Sets the value of the '{@link net.certware.sacm.SACM.Argumentation.Claim#getToBeSupported <em>To Be Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Supported</em>' attribute.
	 * @see #getToBeSupported()
	 * @generated
	 */
	void setToBeSupported(Boolean value);

} // Claim
