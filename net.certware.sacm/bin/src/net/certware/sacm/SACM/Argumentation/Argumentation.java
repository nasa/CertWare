/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argumentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.Argumentation#getArgumentation <em>Argumentation</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.Argumentation#getArgumentElement <em>Argument Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getArgumentation()
 * @model
 * @generated
 */
public interface Argumentation extends ArgumentationElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Argumentation</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.Argumentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentation</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getArgumentation_Argumentation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Argumentation> getArgumentation();

	/**
	 * Returns the value of the '<em><b>Argument Element</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.ArgumentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Element</em>' containment reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getArgumentation_ArgumentElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ArgumentElement> getArgumentElement();

} // Argumentation
