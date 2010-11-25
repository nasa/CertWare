/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz;

import net.certware.argument.arm.InformationElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.euz.Context#getContextAssumptions <em>Context Assumptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.euz.EuzPackage#getContext()
 * @model annotation="gmf.node label='identifier' label.pattern='Context {0}' label.icon='true' label.placement='internal' label.readonly='false' figure='rounded' border.style='solid' size='100,60' color='250,250,250' tool.name='Context Node' tool.description='Creates a context node on the diagram canvas' tool.small.path='icons/obj16/rounded-rectangle.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/rounded-rectangle.png' tool.large.bundle='net.certware.core.ui'"
 * @generated
 */
public interface Context extends InformationElement {
	/**
	 * Returns the value of the '<em><b>Context Assumptions</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.euz.Assumption}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Assumptions</em>' reference list.
	 * @see net.certware.argument.euz.EuzPackage#getContext_ContextAssumptions()
	 * @model annotation="gmf.link width='1' color='0,0,0' style='solid' tool.name='Context with Assumption' tool.description='Links a context with its assumption' tool.small.path='icons/obj16/connector.png' tool.small.bundle='net.certware.core.ui' tool.large.path='icons/obj16/connector.png' tool.large.bundle='net.certware.core.ui'"
	 * @generated
	 */
	EList<Assumption> getContextAssumptions();

} // Context
