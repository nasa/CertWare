/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.euz;

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
 * @see net.certware.argument.euz.EuzFactory
 * @model kind="package"
 *        annotation="gmf foo='euz'"
 * @generated
 */
public interface EuzPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "euz"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/euz"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "euz"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EuzPackage eINSTANCE = net.certware.argument.euz.impl.EuzPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.ArgumentDiagramImpl <em>Argument Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.ArgumentDiagramImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getArgumentDiagram()
	 * @generated
	 */
	int ARGUMENT_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__ARGUMENTS = 1;

	/**
	 * The feature id for the '<em><b>Strategies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__STRATEGIES = 2;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__SOLUTIONS = 3;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__ASSUMPTIONS = 4;

	/**
	 * The feature id for the '<em><b>Justifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__JUSTIFICATIONS = 5;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__CONTEXTS = 6;

	/**
	 * The feature id for the '<em><b>Criteria</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__CRITERIA = 7;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__EVIDENCE = 8;

	/**
	 * The number of structural features of the '<em>Argument Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.ArgumentImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 1;

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
	 * The feature id for the '<em><b>Argument Strategies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_STRATEGIES = ArmPackage.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_ASSUMPTIONS = ArmPackage.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_CONTEXTS = ArmPackage.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Argument Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_SOLUTIONS = ArmPackage.CLAIM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Argument Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_CRITERIA = ArmPackage.CLAIM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Argument Justifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_JUSTIFICATIONS = ArmPackage.CLAIM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sub Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__SUB_ARGUMENTS = ArmPackage.CLAIM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = ArmPackage.CLAIM_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.AssumptionImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 6;

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.JustificationImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 7;

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.EvidenceImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 8;

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.ContextImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 2;

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
	 * The feature id for the '<em><b>Context Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXT_ASSUMPTIONS = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.CriteriaImpl <em>Criteria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.CriteriaImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getCriteria()
	 * @generated
	 */
	int CRITERIA = 3;

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
	 * The feature id for the '<em><b>Criteria Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__CRITERIA_CONTEXTS = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Criteria Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA__CRITERIA_ASSUMPTIONS = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Criteria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRITERIA_FEATURE_COUNT = ArmPackage.INFORMATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.SolutionImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 5;

	/**
	 * The meta object id for the '{@link net.certware.argument.euz.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.euz.impl.StrategyImpl
	 * @see net.certware.argument.euz.impl.EuzPackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 4;

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
	 * The feature id for the '<em><b>Strategy Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_ARGUMENTS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strategy Justifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_JUSTIFICATIONS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Strategy Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_CRITERIA = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strategy Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_ASSUMPTIONS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strategy Strategies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_STRATEGIES = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Strategy Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__STRATEGY_CONTEXTS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Solution Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_CONTEXTS = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_EVIDENCE = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Solution Criteria</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_CRITERIA = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 3;

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
	 * Returns the meta object for class '{@link net.certware.argument.euz.ArgumentDiagram <em>Argument Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Diagram</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram
	 * @generated
	 */
	EClass getArgumentDiagram();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.euz.ArgumentDiagram#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getVersion()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EAttribute getArgumentDiagram_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.euz.ArgumentDiagram#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getArguments()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.euz.ArgumentDiagram#getStrategies <em>Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strategies</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getStrategies()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Strategies();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.euz.ArgumentDiagram#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getSolutions()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Solutions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.euz.ArgumentDiagram#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumptions</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getAssumptions()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Assumptions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.euz.ArgumentDiagram#getJustifications <em>Justifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justifications</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getJustifications()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Justifications();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.euz.ArgumentDiagram#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getContexts()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.euz.ArgumentDiagram#getCriteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criteria</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getCriteria()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Criteria();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.euz.ArgumentDiagram#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see net.certware.argument.euz.ArgumentDiagram#getEvidence()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Evidence();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.euz.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see net.certware.argument.euz.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Argument#getArgumentStrategies <em>Argument Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Strategies</em>'.
	 * @see net.certware.argument.euz.Argument#getArgumentStrategies()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentStrategies();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Argument#getArgumentAssumptions <em>Argument Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Assumptions</em>'.
	 * @see net.certware.argument.euz.Argument#getArgumentAssumptions()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentAssumptions();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Argument#getArgumentContexts <em>Argument Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Contexts</em>'.
	 * @see net.certware.argument.euz.Argument#getArgumentContexts()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentContexts();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Argument#getArgumentSolutions <em>Argument Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Solutions</em>'.
	 * @see net.certware.argument.euz.Argument#getArgumentSolutions()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentSolutions();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Argument#getArgumentCriteria <em>Argument Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Criteria</em>'.
	 * @see net.certware.argument.euz.Argument#getArgumentCriteria()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentCriteria();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Argument#getArgumentJustifications <em>Argument Justifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Justifications</em>'.
	 * @see net.certware.argument.euz.Argument#getArgumentJustifications()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentJustifications();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Argument#getSubArguments <em>Sub Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Arguments</em>'.
	 * @see net.certware.argument.euz.Argument#getSubArguments()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_SubArguments();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.euz.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see net.certware.argument.euz.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.euz.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see net.certware.argument.euz.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.euz.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see net.certware.argument.euz.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.euz.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see net.certware.argument.euz.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Context#getContextAssumptions <em>Context Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Context Assumptions</em>'.
	 * @see net.certware.argument.euz.Context#getContextAssumptions()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_ContextAssumptions();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.euz.Criteria <em>Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Criteria</em>'.
	 * @see net.certware.argument.euz.Criteria
	 * @generated
	 */
	EClass getCriteria();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Criteria#getCriteriaContexts <em>Criteria Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria Contexts</em>'.
	 * @see net.certware.argument.euz.Criteria#getCriteriaContexts()
	 * @see #getCriteria()
	 * @generated
	 */
	EReference getCriteria_CriteriaContexts();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Criteria#getCriteriaAssumptions <em>Criteria Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Criteria Assumptions</em>'.
	 * @see net.certware.argument.euz.Criteria#getCriteriaAssumptions()
	 * @see #getCriteria()
	 * @generated
	 */
	EReference getCriteria_CriteriaAssumptions();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.euz.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see net.certware.argument.euz.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Solution#getSolutionContexts <em>Solution Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Contexts</em>'.
	 * @see net.certware.argument.euz.Solution#getSolutionContexts()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_SolutionContexts();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Solution#getSolutionEvidence <em>Solution Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Evidence</em>'.
	 * @see net.certware.argument.euz.Solution#getSolutionEvidence()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_SolutionEvidence();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Solution#getSolutionCriteria <em>Solution Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Criteria</em>'.
	 * @see net.certware.argument.euz.Solution#getSolutionCriteria()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_SolutionCriteria();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.euz.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see net.certware.argument.euz.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Strategy#getStrategyArguments <em>Strategy Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Arguments</em>'.
	 * @see net.certware.argument.euz.Strategy#getStrategyArguments()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyArguments();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Strategy#getStrategyJustifications <em>Strategy Justifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Justifications</em>'.
	 * @see net.certware.argument.euz.Strategy#getStrategyJustifications()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyJustifications();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Strategy#getStrategyCriteria <em>Strategy Criteria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Criteria</em>'.
	 * @see net.certware.argument.euz.Strategy#getStrategyCriteria()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyCriteria();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Strategy#getStrategyAssumptions <em>Strategy Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Assumptions</em>'.
	 * @see net.certware.argument.euz.Strategy#getStrategyAssumptions()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyAssumptions();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Strategy#getStrategyStrategies <em>Strategy Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Strategies</em>'.
	 * @see net.certware.argument.euz.Strategy#getStrategyStrategies()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyStrategies();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.euz.Strategy#getStrategyContexts <em>Strategy Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Strategy Contexts</em>'.
	 * @see net.certware.argument.euz.Strategy#getStrategyContexts()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_StrategyContexts();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EuzFactory getEuzFactory();

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
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.ArgumentDiagramImpl <em>Argument Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.ArgumentDiagramImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getArgumentDiagram()
		 * @generated
		 */
		EClass ARGUMENT_DIAGRAM = eINSTANCE.getArgumentDiagram();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_DIAGRAM__VERSION = eINSTANCE.getArgumentDiagram_Version();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__ARGUMENTS = eINSTANCE.getArgumentDiagram_Arguments();

		/**
		 * The meta object literal for the '<em><b>Strategies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__STRATEGIES = eINSTANCE.getArgumentDiagram_Strategies();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__SOLUTIONS = eINSTANCE.getArgumentDiagram_Solutions();

		/**
		 * The meta object literal for the '<em><b>Assumptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__ASSUMPTIONS = eINSTANCE.getArgumentDiagram_Assumptions();

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
		 * The meta object literal for the '<em><b>Criteria</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__CRITERIA = eINSTANCE.getArgumentDiagram_Criteria();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__EVIDENCE = eINSTANCE.getArgumentDiagram_Evidence();

		/**
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.ArgumentImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Argument Strategies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_STRATEGIES = eINSTANCE.getArgument_ArgumentStrategies();

		/**
		 * The meta object literal for the '<em><b>Argument Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_ASSUMPTIONS = eINSTANCE.getArgument_ArgumentAssumptions();

		/**
		 * The meta object literal for the '<em><b>Argument Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_CONTEXTS = eINSTANCE.getArgument_ArgumentContexts();

		/**
		 * The meta object literal for the '<em><b>Argument Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_SOLUTIONS = eINSTANCE.getArgument_ArgumentSolutions();

		/**
		 * The meta object literal for the '<em><b>Argument Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_CRITERIA = eINSTANCE.getArgument_ArgumentCriteria();

		/**
		 * The meta object literal for the '<em><b>Argument Justifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_JUSTIFICATIONS = eINSTANCE.getArgument_ArgumentJustifications();

		/**
		 * The meta object literal for the '<em><b>Sub Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__SUB_ARGUMENTS = eINSTANCE.getArgument_SubArguments();

		/**
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.AssumptionImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.JustificationImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.EvidenceImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.ContextImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Context Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__CONTEXT_ASSUMPTIONS = eINSTANCE.getContext_ContextAssumptions();

		/**
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.CriteriaImpl <em>Criteria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.CriteriaImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getCriteria()
		 * @generated
		 */
		EClass CRITERIA = eINSTANCE.getCriteria();

		/**
		 * The meta object literal for the '<em><b>Criteria Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA__CRITERIA_CONTEXTS = eINSTANCE.getCriteria_CriteriaContexts();

		/**
		 * The meta object literal for the '<em><b>Criteria Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRITERIA__CRITERIA_ASSUMPTIONS = eINSTANCE.getCriteria_CriteriaAssumptions();

		/**
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.SolutionImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Solution Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SOLUTION_CONTEXTS = eINSTANCE.getSolution_SolutionContexts();

		/**
		 * The meta object literal for the '<em><b>Solution Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SOLUTION_EVIDENCE = eINSTANCE.getSolution_SolutionEvidence();

		/**
		 * The meta object literal for the '<em><b>Solution Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SOLUTION_CRITERIA = eINSTANCE.getSolution_SolutionCriteria();

		/**
		 * The meta object literal for the '{@link net.certware.argument.euz.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.euz.impl.StrategyImpl
		 * @see net.certware.argument.euz.impl.EuzPackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Strategy Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_ARGUMENTS = eINSTANCE.getStrategy_StrategyArguments();

		/**
		 * The meta object literal for the '<em><b>Strategy Justifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_JUSTIFICATIONS = eINSTANCE.getStrategy_StrategyJustifications();

		/**
		 * The meta object literal for the '<em><b>Strategy Criteria</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_CRITERIA = eINSTANCE.getStrategy_StrategyCriteria();

		/**
		 * The meta object literal for the '<em><b>Strategy Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_ASSUMPTIONS = eINSTANCE.getStrategy_StrategyAssumptions();

		/**
		 * The meta object literal for the '<em><b>Strategy Strategies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_STRATEGIES = eINSTANCE.getStrategy_StrategyStrategies();

		/**
		 * The meta object literal for the '<em><b>Strategy Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__STRATEGY_CONTEXTS = eINSTANCE.getStrategy_StrategyContexts();

	}

} //EuzPackage
