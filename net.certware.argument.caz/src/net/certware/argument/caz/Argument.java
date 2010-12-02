/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.caz;

import net.certware.argument.arm.ReasoningElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.caz.Argument#getArgumentJustification <em>Argument Justification</em>}</li>
 *   <li>{@link net.certware.argument.caz.Argument#getArgumentEvidence <em>Argument Evidence</em>}</li>
 *   <li>{@link net.certware.argument.caz.Argument#getArgumentClaims <em>Argument Claims</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.caz.CazPackage#getArgument()
 * @model annotation="gmf.node label='identifier' label.pattern='Argument {0}' label.icon='true' label.placement='internal' label.readonly='false' figure='rounded' border.style='solid' size='100,60' color='135,206,250' tool.name='Argument Node' tool.description='Creates an argument node on the diagram canvas' tool.small.path='icons/obj16/rounded-rectangle.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/rounded-rectangle.png' tool.large.bundle='net.certware.core.ui'"
 * @generated
 */
public interface Argument extends ReasoningElement {
	/**
	 * Returns the value of the '<em><b>Argument Justification</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Justification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Justification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Justification</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgument_ArgumentJustification()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Argument with Justification' tool.description='Links an argument with its justification' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Justification> getArgumentJustification();

	/**
	 * Returns the value of the '<em><b>Argument Evidence</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Evidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Evidence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Evidence</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgument_ArgumentEvidence()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Argument with Evidence' tool.description='Links an argument with its evidence' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Evidence> getArgumentEvidence();

	/**
	 * Returns the value of the '<em><b>Argument Claims</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Claim}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Claims</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Claims</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getArgument_ArgumentClaims()
	 * @model annotation="gmf.link width='1' color='0,0,0' target.decoration='filledclosedarrow' style='solid' tool.name='Argument with Claim' tool.description='Links an argument with its claim' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Claim> getArgumentClaims();

} // Argument
