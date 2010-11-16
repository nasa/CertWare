/**
 * Copyright (c) Kestrel Technology LLC
 */
package net.certware.argument.gsn;

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
 * @see net.certware.argument.gsn.GsnFactory
 * @model kind="package"
 *        annotation="gmf foo='gsn'"
 * @generated
 */
public interface GsnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gsn"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/gsn"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gsn"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GsnPackage eINSTANCE = net.certware.argument.gsn.impl.GsnPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.argument.gsn.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsn.impl.GoalImpl
	 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 0;

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
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__STRATEGY = ArmPackage.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assumption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__ASSUMPTION = ArmPackage.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTEXT = ArmPackage.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Solution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SOLUTION = ArmPackage.CLAIM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subgoal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__SUBGOAL = ArmPackage.CLAIM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = ArmPackage.CLAIM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsn.impl.ArgumentDiagramImpl <em>Argument Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsn.impl.ArgumentDiagramImpl
	 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getArgumentDiagram()
	 * @generated
	 */
	int ARGUMENT_DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__GOALS = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Argument Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsn.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsn.impl.StrategyImpl
	 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getStrategy()
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
	 * The feature id for the '<em><b>Goal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__GOAL = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONTEXT = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsn.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsn.impl.SolutionImpl
	 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 3;

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
	 * The feature id for the '<em><b>Context</b></em>' containment reference list.
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
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsn.impl.AssumptionImpl
	 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 4;

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
	 * The meta object id for the '{@link net.certware.argument.gsn.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsn.impl.ContextImpl
	 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 5;

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
	 * The meta object id for the '{@link net.certware.argument.gsn.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.gsn.impl.JustificationImpl
	 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 6;

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
	 * Returns the meta object for class '{@link net.certware.argument.gsn.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see net.certware.argument.gsn.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Goal#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategy</em>'.
	 * @see net.certware.argument.gsn.Goal#getStrategy()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Strategy();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Goal#getAssumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumption</em>'.
	 * @see net.certware.argument.gsn.Goal#getAssumption()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Assumption();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Goal#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see net.certware.argument.gsn.Goal#getContext()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Context();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Goal#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solution</em>'.
	 * @see net.certware.argument.gsn.Goal#getSolution()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Solution();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Goal#getSubgoal <em>Subgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgoal</em>'.
	 * @see net.certware.argument.gsn.Goal#getSubgoal()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_Subgoal();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsn.ArgumentDiagram <em>Argument Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Diagram</em>'.
	 * @see net.certware.argument.gsn.ArgumentDiagram
	 * @generated
	 */
	EClass getArgumentDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.ArgumentDiagram#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see net.certware.argument.gsn.ArgumentDiagram#getGoals()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Goals();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.gsn.ArgumentDiagram#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.argument.gsn.ArgumentDiagram#getVersion()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EAttribute getArgumentDiagram_Version();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsn.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see net.certware.argument.gsn.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Strategy#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goal</em>'.
	 * @see net.certware.argument.gsn.Strategy#getGoal()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Strategy#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justification</em>'.
	 * @see net.certware.argument.gsn.Strategy#getJustification()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Justification();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.gsn.Strategy#getSolution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution</em>'.
	 * @see net.certware.argument.gsn.Strategy#getSolution()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Solution();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Strategy#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see net.certware.argument.gsn.Strategy#getContext()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Context();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsn.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see net.certware.argument.gsn.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.gsn.Solution#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context</em>'.
	 * @see net.certware.argument.gsn.Solution#getContext()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Context();

	/**
	 * Returns the meta object for the reference '{@link net.certware.argument.gsn.Solution#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evidence</em>'.
	 * @see net.certware.argument.gsn.Solution#getEvidence()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Evidence();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsn.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see net.certware.argument.gsn.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsn.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see net.certware.argument.gsn.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.gsn.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see net.certware.argument.gsn.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GsnFactory getGsnFactory();

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
		 * The meta object literal for the '{@link net.certware.argument.gsn.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsn.impl.GoalImpl
		 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__STRATEGY = eINSTANCE.getGoal_Strategy();

		/**
		 * The meta object literal for the '<em><b>Assumption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__ASSUMPTION = eINSTANCE.getGoal_Assumption();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__CONTEXT = eINSTANCE.getGoal_Context();

		/**
		 * The meta object literal for the '<em><b>Solution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__SOLUTION = eINSTANCE.getGoal_Solution();

		/**
		 * The meta object literal for the '<em><b>Subgoal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__SUBGOAL = eINSTANCE.getGoal_Subgoal();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsn.impl.ArgumentDiagramImpl <em>Argument Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsn.impl.ArgumentDiagramImpl
		 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getArgumentDiagram()
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
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_DIAGRAM__VERSION = eINSTANCE.getArgumentDiagram_Version();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsn.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsn.impl.StrategyImpl
		 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__GOAL = eINSTANCE.getStrategy_Goal();

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
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__CONTEXT = eINSTANCE.getStrategy_Context();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsn.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsn.impl.SolutionImpl
		 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link net.certware.argument.gsn.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsn.impl.AssumptionImpl
		 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsn.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsn.impl.ContextImpl
		 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link net.certware.argument.gsn.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.gsn.impl.JustificationImpl
		 * @see net.certware.argument.gsn.impl.GsnPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

	}

} //GsnPackage
