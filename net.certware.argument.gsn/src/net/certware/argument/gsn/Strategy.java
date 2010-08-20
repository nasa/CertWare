/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn;

import net.certware.argument.arm.ReasoningElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.gsn.Strategy#getJustification <em>Justification</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Strategy#getSolution <em>Solution</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsn.GsnPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends ReasoningElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 Kestrel Technology LLC"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getStrategy_Justification()
	 * @model containment="true"
	 * @generated
	 */
	EList<Justification> getJustification();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getStrategy_Solution()
	 * @model containment="true"
	 * @generated
	 */
	EList<Solution> getSolution();

} // Strategy
