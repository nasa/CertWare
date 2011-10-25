/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  
 */

package net.certware.argument.caz;

import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.InformationElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.caz.Evidence#getEvidenceContexts <em>Evidence Contexts</em>}</li>
 *   <li>{@link net.certware.argument.caz.Evidence#getEvidence <em>Evidence</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.caz.CazPackage#getEvidence()
 * @model annotation="gmf.node label='identifier' label.pattern='Evidence {0}' label.icon='true' label.placement='internal' label.readonly='false' figure='rectangle' border.style='solid' size='100,60' color='135,206,250' tool.name='Evidence Node' tool.description='Creates an evidence node on the diagram canvas' tool.small.path='icons/obj16/rectangle.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/rectangle.png' tool.large.bundle='net.certware.core.ui'"
 * @generated
 */
public interface Evidence extends AssertedEvidence {

	/**
	 * Returns the value of the '<em><b>Evidence Contexts</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.caz.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence Contexts</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getEvidence_EvidenceContexts()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Argument with Context' tool.description='Links an argument with its context' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Context> getEvidenceContexts();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.arm.InformationElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' reference list.
	 * @see net.certware.argument.caz.CazPackage#getEvidence_Evidence()
	 * @model required="true"
	 *        annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Argument with Context' tool.description='Links an argument with its context' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<InformationElement> getEvidence();
} // Evidence
