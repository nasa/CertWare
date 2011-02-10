/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.eur;

import net.certware.argument.arm.ArmPackage;

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
 * @see net.certware.argument.eur.EurFactory
 * @model kind="package"
 * @generated
 */
public interface EurPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eur";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/eur";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eur";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EurPackage eINSTANCE = net.certware.argument.eur.impl.EurPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.argument.eur.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.eur.impl.ArgumentImpl
	 * @see net.certware.argument.eur.impl.EurPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IDENTIFIER = ArmPackage.CLAIM__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = ArmPackage.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONTENT = ArmPackage.CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IS_TAGGED = ArmPackage.CLAIM__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ASSUMED = ArmPackage.CLAIM__ASSUMED;

	/**
	 * The feature id for the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TO_BE_SUPPORTED = ArmPackage.CLAIM__TO_BE_SUPPORTED;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__STRATEGY = ArmPackage.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assumption</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ASSUMPTION = ArmPackage.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONTEXT = ArmPackage.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SOLUTION = ArmPackage.CLAIM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT = ArmPackage.CLAIM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CRITERIA = ArmPackage.CLAIM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__JUSTIFICATION = ArmPackage.CLAIM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = ArmPackage.CLAIM_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.certware.argument.eur.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.eur.impl.StrategyImpl
	 * @see net.certware.argument.eur.impl.EurPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IDENTIFIER = ArmPackage.REASONING_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = ArmPackage.REASONING_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONTENT = ArmPackage.REASONING_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IS_TAGGED = ArmPackage.REASONING_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ARGUMENT = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__JUSTIFICATION = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__SOLUTION = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CRITERIA = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assumption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__ASSUMPTION = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONTEXTS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGIES = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.certware.argument.eur.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.eur.impl.SolutionImpl
	 * @see net.certware.argument.eur.impl.EurPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IDENTIFIER = ArmPackage.ASSERTED_EVIDENCE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = ArmPackage.ASSERTED_EVIDENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONTENT = ArmPackage.ASSERTED_EVIDENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_TAGGED = ArmPackage.ASSERTED_EVIDENCE__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__TARGET = ArmPackage.ASSERTED_EVIDENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOURCE = ArmPackage.ASSERTED_EVIDENCE__SOURCE;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONTEXT = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__EVIDENCE = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CRITERIA = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.eur.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.eur.impl.AssumptionImpl
	 * @see net.certware.argument.eur.impl.EurPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IDENTIFIER = ArmPackage.INFORMATION_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = ArmPackage.INFORMATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTENT = ArmPackage.INFORMATION_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_TAGGED = ArmPackage.INFORMATION_ELEMENT__IS_TAGGED;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.argument.eur.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.eur.impl.ContextImpl
	 * @see net.certware.argument.eur.impl.EurPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IDENTIFIER = ArmPackage.INFORMATION_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = ArmPackage.INFORMATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTENT = ArmPackage.INFORMATION_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_TAGGED = ArmPackage.INFORMATION_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Assumption</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ASSUMPTION = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.argument.eur.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.eur.impl.JustificationImpl
	 * @see net.certware.argument.eur.impl.EurPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IDENTIFIER = ArmPackage.INFORMATION_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = ArmPackage.INFORMATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CONTENT = ArmPackage.INFORMATION_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_TAGGED = ArmPackage.INFORMATION_ELEMENT__IS_TAGGED;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.argument.eur.impl.CriteriaImpl <em>Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.eur.impl.CriteriaImpl
	 * @see net.certware.argument.eur.impl.EurPackageImpl#getCriteria()
	 * @generated
	 */
	int CRITERIA = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__IDENTIFIER = ArmPackage.INFORMATION_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__DESCRIPTION = ArmPackage.INFORMATION_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__CONTENT = ArmPackage.INFORMATION_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__IS_TAGGED = ArmPackage.INFORMATION_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__CONTEXT = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assumption</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__ASSUMPTION = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_FEATURE_COUNT = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link net.certware.argument.eur.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see net.certware.argument.eur.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Argument#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategy</em>'.
	 * @see net.certware.argument.eur.Argument#getStrategy()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Strategy();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Argument#getAssumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assumption</em>'.
	 * @see net.certware.argument.eur.Argument#getAssumption()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Assumption();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Argument#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see net.certware.argument.eur.Argument#getContext()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Argument#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solution</em>'.
	 * @see net.certware.argument.eur.Argument#getSolution()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Solution();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Argument#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see net.certware.argument.eur.Argument#getArgument()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Argument();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Argument#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria</em>'.
	 * @see net.certware.argument.eur.Argument#getCriteria()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Criteria();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Argument#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justification</em>'.
	 * @see net.certware.argument.eur.Argument#getJustification()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_Justification();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.eur.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see net.certware.argument.eur.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Strategy#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see net.certware.argument.eur.Strategy#getArgument()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Argument();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Strategy#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justification</em>'.
	 * @see net.certware.argument.eur.Strategy#getJustification()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Justification();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Strategy#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution</em>'.
	 * @see net.certware.argument.eur.Strategy#getSolution()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Solution();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Strategy#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria</em>'.
	 * @see net.certware.argument.eur.Strategy#getCriteria()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Criteria();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Strategy#getAssumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumption</em>'.
	 * @see net.certware.argument.eur.Strategy#getAssumption()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Assumption();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Strategy#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see net.certware.argument.eur.Strategy#getContexts()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.eur.Strategy#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see net.certware.argument.eur.Strategy#getStrategies()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Strategies();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.eur.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see net.certware.argument.eur.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Solution#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see net.certware.argument.eur.Solution#getContext()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Context();

	/**
	 * Returns the meta object for the reference '{@link net.certware.argument.eur.Solution#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evidence</em>'.
	 * @see net.certware.argument.eur.Solution#getEvidence()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Evidence();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Solution#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria</em>'.
	 * @see net.certware.argument.eur.Solution#getCriteria()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Criteria();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.eur.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see net.certware.argument.eur.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.eur.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see net.certware.argument.eur.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Context#getAssumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assumption</em>'.
	 * @see net.certware.argument.eur.Context#getAssumption()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Assumption();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.eur.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see net.certware.argument.eur.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.eur.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria</em>'.
	 * @see net.certware.argument.eur.Criteria
	 * @generated
	 */
	EClass getCriteria();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Criteria#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context</em>'.
	 * @see net.certware.argument.eur.Criteria#getContext()
	 * @see #getCriteria()
	 * @generated
	 */
	EReference getCriteria_Context();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.eur.Criteria#getAssumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assumption</em>'.
	 * @see net.certware.argument.eur.Criteria#getAssumption()
	 * @see #getCriteria()
	 * @generated
	 */
	EReference getCriteria_Assumption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EurFactory getEurFactory();

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
		 * The meta object literal for the '{@link net.certware.argument.eur.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.eur.impl.ArgumentImpl
		 * @see net.certware.argument.eur.impl.EurPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__STRATEGY = eINSTANCE.getArgument_Strategy();

		/**
		 * The meta object literal for the '<em><b>Assumption</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ASSUMPTION = eINSTANCE.getArgument_Assumption();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONTEXT = eINSTANCE.getArgument_Context();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__SOLUTION = eINSTANCE.getArgument_Solution();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT = eINSTANCE.getArgument_Argument();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CRITERIA = eINSTANCE.getArgument_Criteria();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__JUSTIFICATION = eINSTANCE.getArgument_Justification();

		/**
		 * The meta object literal for the '{@link net.certware.argument.eur.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.eur.impl.StrategyImpl
		 * @see net.certware.argument.eur.impl.EurPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__ARGUMENT = eINSTANCE.getStrategy_Argument();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__JUSTIFICATION = eINSTANCE.getStrategy_Justification();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__SOLUTION = eINSTANCE.getStrategy_Solution();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__CRITERIA = eINSTANCE.getStrategy_Criteria();

		/**
		 * The meta object literal for the '<em><b>Assumption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__ASSUMPTION = eINSTANCE.getStrategy_Assumption();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__CONTEXTS = eINSTANCE.getStrategy_Contexts();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGIES = eINSTANCE.getStrategy_Strategies();

		/**
		 * The meta object literal for the '{@link net.certware.argument.eur.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.eur.impl.SolutionImpl
		 * @see net.certware.argument.eur.impl.EurPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__CONTEXT = eINSTANCE.getSolution_Context();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__EVIDENCE = eINSTANCE.getSolution_Evidence();

		/**
		 * The meta object literal for the '<em><b>Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__CRITERIA = eINSTANCE.getSolution_Criteria();

		/**
		 * The meta object literal for the '{@link net.certware.argument.eur.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.eur.impl.AssumptionImpl
		 * @see net.certware.argument.eur.impl.EurPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link net.certware.argument.eur.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.eur.impl.ContextImpl
		 * @see net.certware.argument.eur.impl.EurPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Assumption</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__ASSUMPTION = eINSTANCE.getContext_Assumption();

		/**
		 * The meta object literal for the '{@link net.certware.argument.eur.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.eur.impl.JustificationImpl
		 * @see net.certware.argument.eur.impl.EurPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link net.certware.argument.eur.impl.CriteriaImpl <em>Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.eur.impl.CriteriaImpl
		 * @see net.certware.argument.eur.impl.EurPackageImpl#getCriteria()
		 * @generated
		 */
		EClass CRITERIA = eINSTANCE.getCriteria();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA__CONTEXT = eINSTANCE.getCriteria_Context();

		/**
		 * The meta object literal for the '<em><b>Assumption</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA__ASSUMPTION = eINSTANCE.getCriteria_Assumption();

	}

} //EurPackage
