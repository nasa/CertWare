/**
 * Copyright © 2000-2005 SRI International.
 */
package net.certware.argument.aml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Relationships</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.aml.QuestionRelationships#getDependent <em>Dependent</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.aml.AmlPackage#getQuestionRelationships()
 * @model extendedMetaData="name='questionRelationships_._type' kind='elementOnly'"
 * @generated
 */
public interface QuestionRelationships extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright © 2000-2005 SRI International."; //$NON-NLS-1$

	/**
	 * Returns the value of the '<em><b>Dependent</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.aml.Dependent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent</em>' containment reference list.
	 * @see net.certware.argument.aml.AmlPackage#getQuestionRelationships_Dependent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dependent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Dependent> getDependent();

} // QuestionRelationships
