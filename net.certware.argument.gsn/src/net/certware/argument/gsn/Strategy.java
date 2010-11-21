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
 *   <li>{@link net.certware.argument.gsn.Strategy#getGoal <em>Goal</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Strategy#getJustification <em>Justification</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Strategy#getSolution <em>Solution</em>}</li>
 *   <li>{@link net.certware.argument.gsn.Strategy#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.gsn.GsnPackage#getStrategy()
 * @model annotation="gmf.node label='identifier' label.pattern='Strategy {0}' figure='rounded' color='155,155,155' phantom='true'"
 * @generated
 */
public interface Strategy extends ReasoningElement {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Goal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getStrategy_Goal()
	 * @model containment="true"
	 * @generated
	 */
	EList<Goal> getGoal();

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

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.gsn.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see net.certware.argument.gsn.GsnPackage#getStrategy_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContext();

} // Strategy
