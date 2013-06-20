/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.CitationElement#getArgumentElementReference <em>Argument Element Reference</em>}</li>
 *   <li>{@link net.certware.sacm.SACM.Argumentation.CitationElement#getArgumentationReference <em>Argumentation Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getCitationElement()
 * @model
 * @generated
 */
public interface CitationElement extends ArgumentElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Argument Element Reference</b></em>' reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.ArgumentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Element Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Element Reference</em>' reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getCitationElement_ArgumentElementReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ArgumentElement> getArgumentElementReference();

	/**
	 * Returns the value of the '<em><b>Argumentation Reference</b></em>' reference list.
	 * The list contents are of type {@link net.certware.sacm.SACM.Argumentation.Argumentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argumentation Reference</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentation Reference</em>' reference list.
	 * @see net.certware.sacm.SACM.Argumentation.ArgumentationPackage#getCitationElement_ArgumentationReference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Argumentation> getArgumentationReference();

} // CitationElement
