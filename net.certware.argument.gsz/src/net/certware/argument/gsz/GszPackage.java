/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsz;

import net.certware.argument.arm.ArmPackage;

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
 * @see net.certware.argument.gsz.GszFactory
 * @model kind="package"
 *        annotation="gmf foo='gsz'"
 * @generated
 */
public interface GszPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gsz"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/gsz"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsz"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GszPackage eINSTANCE = net.certware.argument.gsz.impl.GszPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl <em>Argument Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsz.impl.ArgumentDiagramImpl
	 * @see net.certware.argument.gsz.impl.GszPackageImpl#getArgumentDiagram()
	 * @generated
	 */
	int ARGUMENT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__GOALS = 0;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__STRATEGIES = 1;

	/**
	 * The feature id for the '<em><b>Justifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__JUSTIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__CONTEXTS = 3;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__ASSUMPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__SOLUTIONS = 5;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__EVIDENCE = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Argument Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsz.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsz.impl.GoalImpl
	 * @see net.certware.argument.gsz.impl.GszPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IDENTIFIER = ArmPackage.CLAIM__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = ArmPackage.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTENT = ArmPackage.CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_TAGGED = ArmPackage.CLAIM__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSUMED = ArmPackage.CLAIM__ASSUMED;

	/**
	 * The feature id for the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__TO_BE_SUPPORTED = ArmPackage.CLAIM__TO_BE_SUPPORTED;

	/**
	 * The feature id for the '<em><b>Sub Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUB_GOALS = ArmPackage.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__STRATEGIES = ArmPackage.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Goal Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_CONTEXTS = ArmPackage.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSUMPTIONS = ArmPackage.CLAIM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Goal Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__GOAL_SOLUTIONS = ArmPackage.CLAIM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = ArmPackage.CLAIM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsz.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsz.impl.StrategyImpl
	 * @see net.certware.argument.gsz.impl.GszPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 2;

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
	 * The feature id for the '<em><b>Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__GOALS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Justifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__JUSTIFICATIONS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strategy Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_CONTEXTS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategy Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_SOLUTIONS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsz.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsz.impl.JustificationImpl
	 * @see net.certware.argument.gsz.impl.GszPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 3;

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
	 * The meta object id for the '{@link net.certware.argument.gsz.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsz.impl.ContextImpl
	 * @see net.certware.argument.gsz.impl.GszPackageImpl#getContext()
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
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsz.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsz.impl.AssumptionImpl
	 * @see net.certware.argument.gsz.impl.GszPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 5;

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
	 * The meta object id for the '{@link net.certware.argument.gsz.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsz.impl.SolutionImpl
	 * @see net.certware.argument.gsz.impl.GszPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 6;

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
	 * The feature id for the '<em><b>Solution Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_EVIDENCE = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_CONTEXTS = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsz.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsz.impl.EvidenceImpl
	 * @see net.certware.argument.gsz.impl.GszPackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__IDENTIFIER = ArmPackage.ASSERTED_EVIDENCE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__DESCRIPTION = ArmPackage.ASSERTED_EVIDENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__CONTENT = ArmPackage.ASSERTED_EVIDENCE__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__IS_TAGGED = ArmPackage.ASSERTED_EVIDENCE__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__TARGET = ArmPackage.ASSERTED_EVIDENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__SOURCE = ArmPackage.ASSERTED_EVIDENCE__SOURCE;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsz.ArgumentDiagram <em>Argument Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Diagram</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram
	 * @generated
	 */
	EClass getArgumentDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsz.ArgumentDiagram#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram#getGoals()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsz.ArgumentDiagram#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram#getStrategies()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Strategies();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsz.ArgumentDiagram#getJustifications <em>Justifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justifications</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram#getJustifications()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Justifications();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsz.ArgumentDiagram#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram#getContexts()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsz.ArgumentDiagram#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumptions</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram#getAssumptions()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Assumptions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsz.ArgumentDiagram#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram#getSolutions()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Solutions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsz.ArgumentDiagram#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram#getEvidence()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Evidence();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.gsz.ArgumentDiagram#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.argument.gsz.ArgumentDiagram#getVersion()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EAttribute getArgumentDiagram_Version();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsz.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see net.certware.argument.gsz.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Goal#getSubGoals <em>Sub Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Goals</em>'.
	 * @see net.certware.argument.gsz.Goal#getSubGoals()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_SubGoals();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Goal#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategies</em>'.
	 * @see net.certware.argument.gsz.Goal#getStrategies()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Strategies();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Goal#getGoalContexts <em>Goal Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal Contexts</em>'.
	 * @see net.certware.argument.gsz.Goal#getGoalContexts()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_GoalContexts();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Goal#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assumptions</em>'.
	 * @see net.certware.argument.gsz.Goal#getAssumptions()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Assumptions();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Goal#getGoalSolutions <em>Goal Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal Solutions</em>'.
	 * @see net.certware.argument.gsz.Goal#getGoalSolutions()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_GoalSolutions();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsz.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see net.certware.argument.gsz.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Strategy#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goals</em>'.
	 * @see net.certware.argument.gsz.Strategy#getGoals()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Goals();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Strategy#getJustifications <em>Justifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Justifications</em>'.
	 * @see net.certware.argument.gsz.Strategy#getJustifications()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Justifications();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Strategy#getStrategyContexts <em>Strategy Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Contexts</em>'.
	 * @see net.certware.argument.gsz.Strategy#getStrategyContexts()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyContexts();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Strategy#getStrategySolutions <em>Strategy Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Solutions</em>'.
	 * @see net.certware.argument.gsz.Strategy#getStrategySolutions()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategySolutions();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsz.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see net.certware.argument.gsz.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsz.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see net.certware.argument.gsz.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsz.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see net.certware.argument.gsz.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsz.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see net.certware.argument.gsz.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Solution#getSolutionEvidence <em>Solution Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Evidence</em>'.
	 * @see net.certware.argument.gsz.Solution#getSolutionEvidence()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_SolutionEvidence();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsz.Solution#getSolutionContexts <em>Solution Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Contexts</em>'.
	 * @see net.certware.argument.gsz.Solution#getSolutionContexts()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_SolutionContexts();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsz.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see net.certware.argument.gsz.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GszFactory getGszFactory();

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
		 * The meta object literal for the '{@link net.certware.argument.gsz.impl.ArgumentDiagramImpl <em>Argument Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsz.impl.ArgumentDiagramImpl
		 * @see net.certware.argument.gsz.impl.GszPackageImpl#getArgumentDiagram()
		 * @generated
		 */
		EClass ARGUMENT_DIAGRAM = eINSTANCE.getArgumentDiagram();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__GOALS = eINSTANCE.getArgumentDiagram_Goals();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__STRATEGIES = eINSTANCE.getArgumentDiagram_Strategies();

		/**
		 * The meta object literal for the '<em><b>Justifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__JUSTIFICATIONS = eINSTANCE.getArgumentDiagram_Justifications();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__CONTEXTS = eINSTANCE.getArgumentDiagram_Contexts();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__ASSUMPTIONS = eINSTANCE.getArgumentDiagram_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__SOLUTIONS = eINSTANCE.getArgumentDiagram_Solutions();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__EVIDENCE = eINSTANCE.getArgumentDiagram_Evidence();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_DIAGRAM__VERSION = eINSTANCE.getArgumentDiagram_Version();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsz.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsz.impl.GoalImpl
		 * @see net.certware.argument.gsz.impl.GszPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Sub Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__SUB_GOALS = eINSTANCE.getGoal_SubGoals();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__STRATEGIES = eINSTANCE.getGoal_Strategies();

		/**
		 * The meta object literal for the '<em><b>Goal Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_CONTEXTS = eINSTANCE.getGoal_GoalContexts();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ASSUMPTIONS = eINSTANCE.getGoal_Assumptions();

		/**
		 * The meta object literal for the '<em><b>Goal Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__GOAL_SOLUTIONS = eINSTANCE.getGoal_GoalSolutions();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsz.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsz.impl.StrategyImpl
		 * @see net.certware.argument.gsz.impl.GszPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__GOALS = eINSTANCE.getStrategy_Goals();

		/**
		 * The meta object literal for the '<em><b>Justifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__JUSTIFICATIONS = eINSTANCE.getStrategy_Justifications();

		/**
		 * The meta object literal for the '<em><b>Strategy Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_CONTEXTS = eINSTANCE.getStrategy_StrategyContexts();

		/**
		 * The meta object literal for the '<em><b>Strategy Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_SOLUTIONS = eINSTANCE.getStrategy_StrategySolutions();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsz.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsz.impl.JustificationImpl
		 * @see net.certware.argument.gsz.impl.GszPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsz.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsz.impl.ContextImpl
		 * @see net.certware.argument.gsz.impl.GszPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsz.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsz.impl.AssumptionImpl
		 * @see net.certware.argument.gsz.impl.GszPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsz.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsz.impl.SolutionImpl
		 * @see net.certware.argument.gsz.impl.GszPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Solution Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SOLUTION_EVIDENCE = eINSTANCE.getSolution_SolutionEvidence();

		/**
		 * The meta object literal for the '<em><b>Solution Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SOLUTION_CONTEXTS = eINSTANCE.getSolution_SolutionContexts();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsz.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsz.impl.EvidenceImpl
		 * @see net.certware.argument.gsz.impl.GszPackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

	}

} //GszPackage
