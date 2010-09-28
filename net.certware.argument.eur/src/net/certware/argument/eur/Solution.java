/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur;

import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.InformationElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.eur.Solution#getContext <em>Context</em>}</li>
 *   <li>{@link net.certware.argument.eur.Solution#getEvidence <em>Evidence</em>}</li>
 *   <li>{@link net.certware.argument.eur.Solution#getCriteria <em>Criteria</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.eur.EurPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends AssertedEvidence {
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
	 * @see net.certware.argument.eur.EurPackage#getSolution_Context()
	 * @model
	 * @generated
	 */
	EList<Context> getContext();

	/**
	 * Returns the value of the '<em><b>Evidence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evidence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evidence</em>' reference.
	 * @see #setEvidence(InformationElement)
	 * @see net.certware.argument.eur.EurPackage#getSolution_Evidence()
	 * @model required="true"
	 * @generated
	 */
	InformationElement getEvidence();

	/**
	 * Sets the value of the '{@link net.certware.argument.eur.Solution#getEvidence <em>Evidence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evidence</em>' reference.
	 * @see #getEvidence()
	 * @generated
	 */
	void setEvidence(InformationElement value);

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
	 * @see net.certware.argument.eur.EurPackage#getSolution_Criteria()
	 * @model
	 * @generated
	 */
	EList<Criteria> getCriteria();

} // Solution
