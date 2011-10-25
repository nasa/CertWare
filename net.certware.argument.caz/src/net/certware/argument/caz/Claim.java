/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.argument.caz;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.caz.Claim#getClaimStrategies <em>Claim Strategies</em>}</li>
 *   <li>{@link net.certware.argument.caz.Claim#getClaimAssumptions <em>Claim Assumptions</em>}</li>
 *   <li>{@link net.certware.argument.caz.Claim#getClaimContexts <em>Claim Contexts</em>}</li>
 *   <li>{@link net.certware.argument.caz.Claim#getClaimSolutions <em>Claim Solutions</em>}</li>
 *   <li>{@link net.certware.argument.caz.Claim#getSubClaims <em>Sub Claims</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.caz.CazPackage#getClaim()
 * @model annotation="gmf.node label='identifier' label.pattern='Claim {0}' label.icon='true' label.placement='internal' label.readonly='false' figure='ellipse' border.style='solid' size='100,60' color='152,251,152' tool.name='Claim Node' tool.description='Creates a claim node on the diagram canvas' tool.small.path='icons/obj16/circle.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/circle.png' tool.large.bundle='net.certware.core.ui'"
 * @generated
 */
public interface Claim extends net.certware.argument.arm.Claim {
	/**
	 * Returns the value of the '<em><b>Claim Strategies</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Strategies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Strategies</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getClaim_ClaimStrategies()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Claim with Strategy' tool.description='Links a claim with its strategy' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Argument> getClaimStrategies();

	/**
	 * Returns the value of the '<em><b>Claim Assumptions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Assumptions</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getClaim_ClaimAssumptions()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Claim with Assumption' tool.description='Links a claim with its assumption' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Assumption> getClaimAssumptions();

	/**
	 * Returns the value of the '<em><b>Claim Contexts</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Contexts</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getClaim_ClaimContexts()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Claim with Context' tool.description='Links a claim with its context' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Context> getClaimContexts();

	/**
	 * Returns the value of the '<em><b>Claim Solutions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Solutions</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getClaim_ClaimSolutions()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Claim with Evidence' tool.description='Links a claim with its evidence' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Evidence> getClaimSolutions();

	/**
	 * Returns the value of the '<em><b>Sub Claims</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Claim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Claims</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Claims</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getClaim_SubClaims()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Claim with Sub-Claim' tool.description='Links a claim with its sub-claim' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Claim> getSubClaims();

} // Claim
