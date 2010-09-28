/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur;

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
 *   <li>{@link net.certware.argument.eur.Strategy#getArgument <em>Argument</em>}</li>
 *   <li>{@link net.certware.argument.eur.Strategy#getJustification <em>Justification</em>}</li>
 *   <li>{@link net.certware.argument.eur.Strategy#getSolution <em>Solution</em>}</li>
 *   <li>{@link net.certware.argument.eur.Strategy#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link net.certware.argument.eur.Strategy#getAssumption <em>Assumption</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.eur.EurPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends ReasoningElement {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.eur.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see net.certware.argument.eur.EurPackage#getStrategy_Argument()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getArgument();

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.eur.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Justification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Justification</em>' containment reference list.
	 * @see net.certware.argument.eur.EurPackage#getStrategy_Justification()
	 * @model containment="true"
	 * @generated
	 */
	EList<Justification> getJustification();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.eur.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' reference list.
	 * @see net.certware.argument.eur.EurPackage#getStrategy_Solution()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Solution> getSolution();

	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.eur.Criteria}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' reference list.
	 * @see net.certware.argument.eur.EurPackage#getStrategy_Criteria()
	 * @model
	 * @generated
	 */
	EList<Criteria> getCriteria();

	/**
	 * Returns the value of the '<em><b>Assumption</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.eur.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption</em>' reference list.
	 * @see net.certware.argument.eur.EurPackage#getStrategy_Assumption()
	 * @model
	 * @generated
	 */
	EList<Assumption> getAssumption();

} // Strategy
