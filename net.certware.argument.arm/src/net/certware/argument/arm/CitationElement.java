/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */
package net.certware.argument.arm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.arm.CitationElement#getRefersToArgumentElement <em>Refers To Argument Element</em>}</li>
 *   <li>{@link net.certware.argument.arm.CitationElement#getRefersToArgument <em>Refers To Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.arm.ArmPackage#getCitationElement()
 * @model
 * @generated
 */
public interface CitationElement extends ArgumentElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) "; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Refers To Argument Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To Argument Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Argument Element</em>' reference.
	 * @see #setRefersToArgumentElement(ArgumentElement)
	 * @see net.certware.argument.arm.ArmPackage#getCitationElement_RefersToArgumentElement()
	 * @model
	 * @generated
	 */
	ArgumentElement getRefersToArgumentElement();

	/**
	 * Sets the value of the '{@link net.certware.argument.arm.CitationElement#getRefersToArgumentElement <em>Refers To Argument Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Argument Element</em>' reference.
	 * @see #getRefersToArgumentElement()
	 * @generated
	 */
	void setRefersToArgumentElement(ArgumentElement value);

	/**
	 * Returns the value of the '<em><b>Refers To Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To Argument</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Argument</em>' reference.
	 * @see #setRefersToArgument(Argument)
	 * @see net.certware.argument.arm.ArmPackage#getCitationElement_RefersToArgument()
	 * @model
	 * @generated
	 */
	Argument getRefersToArgument();

	/**
	 * Sets the value of the '{@link net.certware.argument.arm.CitationElement#getRefersToArgument <em>Refers To Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Argument</em>' reference.
	 * @see #getRefersToArgument()
	 * @generated
	 */
	void setRefersToArgument(Argument value);

} // CitationElement
