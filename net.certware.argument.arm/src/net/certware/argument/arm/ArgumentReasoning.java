/**
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */
package net.certware.argument.arm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.arm.ArgumentReasoning#getDescribes <em>Describes</em>}</li>
 *   <li>{@link net.certware.argument.arm.ArgumentReasoning#getHasStructure <em>Has Structure</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.arm.ArmPackage#getArgumentReasoning()
 * @model
 * @generated
 */
public interface ArgumentReasoning extends ReasoningElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 Object Management Group (ARM metamodel)\nCopyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) "; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Describes</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.arm.AssertedInference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' reference list.
	 * @see net.certware.argument.arm.ArmPackage#getArgumentReasoning_Describes()
	 * @model
	 * @generated
	 */
	EList<AssertedInference> getDescribes();

	/**
	 * Returns the value of the '<em><b>Has Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Structure</em>' reference.
	 * @see #setHasStructure(Argument)
	 * @see net.certware.argument.arm.ArmPackage#getArgumentReasoning_HasStructure()
	 * @model
	 * @generated
	 */
	Argument getHasStructure();

	/**
	 * Sets the value of the '{@link net.certware.argument.arm.ArgumentReasoning#getHasStructure <em>Has Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Structure</em>' reference.
	 * @see #getHasStructure()
	 * @generated
	 */
	void setHasStructure(Argument value);

} // ArgumentReasoning
