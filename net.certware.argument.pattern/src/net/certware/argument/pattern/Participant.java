/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.pattern;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.pattern.Participant#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Participant#getExplanation <em>Explanation</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.pattern.PatternPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see net.certware.argument.pattern.PatternPackage#getParticipant_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Participant#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explanation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explanation</em>' attribute.
	 * @see #setExplanation(String)
	 * @see net.certware.argument.pattern.PatternPackage#getParticipant_Explanation()
	 * @model
	 * @generated
	 */
	String getExplanation();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Participant#getExplanation <em>Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation</em>' attribute.
	 * @see #getExplanation()
	 * @generated
	 */
	void setExplanation(String value);

} // Participant
