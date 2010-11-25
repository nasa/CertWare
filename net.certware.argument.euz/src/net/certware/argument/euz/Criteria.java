/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz;

import net.certware.argument.arm.InformationElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.euz.Criteria#getCriteriaContexts <em>Criteria Contexts</em>}</li>
 *   <li>{@link net.certware.argument.euz.Criteria#getCriteriaAssumptions <em>Criteria Assumptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.euz.EuzPackage#getCriteria()
 * @model annotation="gmf.node label='identifier' label.pattern='Criteria {0}' label.icon='true' label.placement='internal' label.readonly='false' figure='rounded' border.style='solid' size='100,60' color='250,250,250' tool.name='Criteria Node' tool.description='Creates a criteria node on the diagram canvas' tool.small.path='icons/obj16/rounded-rectangle.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/rounded-rectangle.png' tool.large.bundle='net.certware.core.ui'"
 * @generated
 */
public interface Criteria extends InformationElement {
	/**
	 * Returns the value of the '<em><b>Criteria Contexts</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Contexts</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getCriteria_CriteriaContexts()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Criteria with Context' tool.description='Links criteria with its context' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Context> getCriteriaContexts();

	/**
	 * Returns the value of the '<em><b>Criteria Assumptions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criteria Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria Assumptions</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getCriteria_CriteriaAssumptions()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Criteria with Assumption' tool.description='Links criteria with is assumption' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Assumption> getCriteriaAssumptions();

} // Criteria
