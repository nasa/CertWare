/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.pattern;

import net.certware.argument.arm.Argument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.certware.argument.pattern.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getAuthor <em>Author</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getVersion <em>Version</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getIntent <em>Intent</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getMotivation <em>Motivation</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getStructure <em>Structure</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getParticipants <em>Participants</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getApplicability <em>Applicability</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link net.certware.argument.pattern.Pattern#getRelatedPatterns <em>Related Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.certware.argument.pattern.PatternPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' attribute.
	 * @see #setIntent(String)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Intent()
	 * @model
	 * @generated
	 */
	String getIntent();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getIntent <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' attribute.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(String value);

	/**
	 * Returns the value of the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motivation</em>' attribute.
	 * @see #setMotivation(String)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Motivation()
	 * @model
	 * @generated
	 */
	String getMotivation();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getMotivation <em>Motivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motivation</em>' attribute.
	 * @see #getMotivation()
	 * @generated
	 */
	void setMotivation(String value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' reference.
	 * @see #setStructure(Argument)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Structure()
	 * @model
	 * @generated
	 */
	Argument getStructure();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getStructure <em>Structure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Argument value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.pattern.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Participants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability</em>' attribute.
	 * @see #setApplicability(String)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Applicability()
	 * @model
	 * @generated
	 */
	String getApplicability();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getApplicability <em>Applicability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability</em>' attribute.
	 * @see #getApplicability()
	 * @generated
	 */
	void setApplicability(String value);

	/**
	 * Returns the value of the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequences</em>' attribute.
	 * @see #setConsequences(String)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Consequences()
	 * @model
	 * @generated
	 */
	String getConsequences();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getConsequences <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequences</em>' attribute.
	 * @see #getConsequences()
	 * @generated
	 */
	void setConsequences(String value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' attribute.
	 * @see #setImplementation(String)
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_Implementation()
	 * @model
	 * @generated
	 */
	String getImplementation();

	/**
	 * Sets the value of the '{@link net.certware.argument.pattern.Pattern#getImplementation <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' attribute.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Related Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link net.certware.argument.pattern.Pattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Patterns</em>' containment reference list.
	 * @see net.certware.argument.pattern.PatternPackage#getPattern_RelatedPatterns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pattern> getRelatedPatterns();

} // Pattern
