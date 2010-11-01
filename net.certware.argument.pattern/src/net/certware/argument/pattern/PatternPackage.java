/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.pattern;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.certware.argument.pattern.PatternFactory
 * @model kind="package"
 * @generated
 */
public interface PatternPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pattern"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "pattern"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pattern"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternPackage eINSTANCE = net.certware.argument.pattern.impl.PatternPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.argument.pattern.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.pattern.impl.PatternImpl
	 * @see net.certware.argument.pattern.impl.PatternPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__INTENT = 3;

	/**
	 * The feature id for the '<em><b>Motivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__MOTIVATION = 4;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__STRUCTURE = 5;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PARTICIPANTS = 6;

	/**
	 * The feature id for the '<em><b>Applicability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__APPLICABILITY = 7;

	/**
	 * The feature id for the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__CONSEQUENCES = 8;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__IMPLEMENTATION = 9;

	/**
	 * The feature id for the '<em><b>Related Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__RELATED_PATTERNS = 10;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link net.certware.argument.pattern.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.pattern.impl.ParticipantImpl
	 * @see net.certware.argument.pattern.impl.PatternPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__EXPLANATION = 1;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link net.certware.argument.pattern.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see net.certware.argument.pattern.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Pattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.certware.argument.pattern.Pattern#getName()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Pattern#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see net.certware.argument.pattern.Pattern#getAuthor()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Author();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Pattern#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.argument.pattern.Pattern#getVersion()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Version();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Pattern#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intent</em>'.
	 * @see net.certware.argument.pattern.Pattern#getIntent()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Intent();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Pattern#getMotivation <em>Motivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motivation</em>'.
	 * @see net.certware.argument.pattern.Pattern#getMotivation()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Motivation();

	/**
	 * Returns the meta object for the reference '{@link net.certware.argument.pattern.Pattern#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Structure</em>'.
	 * @see net.certware.argument.pattern.Pattern#getStructure()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Structure();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.pattern.Pattern#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see net.certware.argument.pattern.Pattern#getParticipants()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_Participants();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Pattern#getApplicability <em>Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability</em>'.
	 * @see net.certware.argument.pattern.Pattern#getApplicability()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Applicability();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Pattern#getConsequences <em>Consequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consequences</em>'.
	 * @see net.certware.argument.pattern.Pattern#getConsequences()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Consequences();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Pattern#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see net.certware.argument.pattern.Pattern#getImplementation()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_Implementation();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.pattern.Pattern#getRelatedPatterns <em>Related Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Related Patterns</em>'.
	 * @see net.certware.argument.pattern.Pattern#getRelatedPatterns()
	 * @see #getPattern()
	 * @generated
	 */
	EReference getPattern_RelatedPatterns();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.pattern.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see net.certware.argument.pattern.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Participant#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see net.certware.argument.pattern.Participant#getIdentifier()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.pattern.Participant#getExplanation <em>Explanation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Explanation</em>'.
	 * @see net.certware.argument.pattern.Participant#getExplanation()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Explanation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PatternFactory getPatternFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.certware.argument.pattern.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.pattern.impl.PatternImpl
		 * @see net.certware.argument.pattern.impl.PatternPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__AUTHOR = eINSTANCE.getPattern_Author();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__VERSION = eINSTANCE.getPattern_Version();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__INTENT = eINSTANCE.getPattern_Intent();

		/**
		 * The meta object literal for the '<em><b>Motivation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__MOTIVATION = eINSTANCE.getPattern_Motivation();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__STRUCTURE = eINSTANCE.getPattern_Structure();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__PARTICIPANTS = eINSTANCE.getPattern_Participants();

		/**
		 * The meta object literal for the '<em><b>Applicability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__APPLICABILITY = eINSTANCE.getPattern_Applicability();

		/**
		 * The meta object literal for the '<em><b>Consequences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__CONSEQUENCES = eINSTANCE.getPattern_Consequences();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__IMPLEMENTATION = eINSTANCE.getPattern_Implementation();

		/**
		 * The meta object literal for the '<em><b>Related Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATTERN__RELATED_PATTERNS = eINSTANCE.getPattern_RelatedPatterns();

		/**
		 * The meta object literal for the '{@link net.certware.argument.pattern.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.pattern.impl.ParticipantImpl
		 * @see net.certware.argument.pattern.impl.PatternPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__IDENTIFIER = eINSTANCE.getParticipant_Identifier();

		/**
		 * The meta object literal for the '<em><b>Explanation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__EXPLANATION = eINSTANCE.getParticipant_Explanation();

	}

} //PatternPackage
