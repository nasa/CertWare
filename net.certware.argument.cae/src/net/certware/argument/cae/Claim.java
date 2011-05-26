/**
 * Copyright (c) 2010 National Aeronautics and Space Administration
 */
package net.certware.argument.cae;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.cae.Claim#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link net.certware.argument.cae.Claim#getAssumption <em>Assumption</em>}</li>
 *   <li>{@link net.certware.argument.cae.Claim#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.cae.Claim#getSolution <em>Solution</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.cae.CaePackage#getClaim()
 * @model
 * @generated
 */
public interface Claim extends net.certware.argument.arm.Claim {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2010 National Aeronautics and Space Administration"; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.cae.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' containment reference list.
	 * @see net.certware.argument.cae.CaePackage#getClaim_Strategy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Argument> getStrategy();

	/**
	 * Returns the value of the '<em><b>Assumption</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.cae.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumption</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumption</em>' containment reference list.
	 * @see net.certware.argument.cae.CaePackage#getClaim_Assumption()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assumption> getAssumption();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.cae.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference list.
	 * @see net.certware.argument.cae.CaePackage#getClaim_Context()
	 * @model containment="true"
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Solution</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.cae.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution</em>' containment reference list.
	 * @see net.certware.argument.cae.CaePackage#getClaim_Solution()
	 * @model containment="true"
	 * @generated
	 */
	EList<Evidence> getSolution();

} // Claim
