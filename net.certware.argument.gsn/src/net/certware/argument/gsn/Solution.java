/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn;

import net.certware.argument.arm.AssertedEvidence;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.Solution#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Solution#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsn.GsnPackage#getSolution()
 * @model annotation="gmf.node label='identifier' phantom='true'"
 * @generated
 */
public interface Solution extends AssertedEvidence {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getSolution_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getSolution_Evidence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Evidence> getEvidence();

} // Solution
