/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur;

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
 *   <li>{@link net.certware.argument.eur.Criteria#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.eur.Criteria#getAssumption <em>Assumption</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.eur.EurPackage#getCriteria()
 * @model
 * @generated
 */
public interface Criteria extends InformationElement {

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference list.
	 * The list contents are of type {@link net.certware.argument.eur.Context}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference list.
	 * @see net.certware.argument.eur.EurPackage#getCriteria_Context()
	 * @model
	 * @generated
	 */
	EList<Context> getContext();

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
	 * @see net.certware.argument.eur.EurPackage#getCriteria_Assumption()
	 * @model
	 * @generated
	 */
	EList<Assumption> getAssumption();
} // Criteria
