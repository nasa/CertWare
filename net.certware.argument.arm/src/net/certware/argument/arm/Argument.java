/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved. (generated models) 
 */
package net.certware.argument.arm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.arm.Argument#getContainsArgumentElement <em>Contains Argument Element</em>}</li>
 *   <li>{@link net.certware.argument.arm.Argument#getContainsArgumentLink <em>Contains Argument Link</em>}</li>
 *   <li>{@link net.certware.argument.arm.Argument#getContainsArgument <em>Contains Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.arm.ArmPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends ModelElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved. (generated models) "; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Contains Argument Element</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.arm.ArgumentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Argument Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Argument Element</em>' containment reference list.
	 * @see net.certware.argument.arm.ArmPackage#getArgument_ContainsArgumentElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentElement> getContainsArgumentElement();

	/**
	 * Returns the value of the '<em><b>Contains Argument Link</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.arm.ArgumentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Argument Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Argument Link</em>' containment reference list.
	 * @see net.certware.argument.arm.ArmPackage#getArgument_ContainsArgumentLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentLink> getContainsArgumentLink();

	/**
	 * Returns the value of the '<em><b>Contains Argument</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.arm.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Argument</em>' containment reference list.
	 * @see net.certware.argument.arm.ArmPackage#getArgument_ContainsArgument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getContainsArgument();

} // Argument
