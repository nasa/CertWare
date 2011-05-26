/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.caz;

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
 * @see net.certware.argument.caz.CazFactory
 * @model kind="package"
 *        annotation="gmf foo='caz'"
 * @generated
 */
public interface CazPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "caz"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.certware.net/caz"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "caz"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CazPackage eINSTANCE = net.certware.argument.caz.impl.CazPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.certware.argument.caz.impl.ArgumentDiagramImpl <em>Argument Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.caz.impl.ArgumentDiagramImpl
	 * @see net.certware.argument.caz.impl.CazPackageImpl#getArgumentDiagram()
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
	 * The feature id for the '<em><b>Claims</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__CLAIMS = 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__ARGUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Assumptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__ASSUMPTIONS = 3;

	/**
	 * The feature id for the '<em><b>Justifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__JUSTIFICATIONS = 4;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__CONTEXTS = 5;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM__EVIDENCE = 6;

	/**
	 * The number of structural features of the '<em>Argument Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DIAGRAM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.certware.argument.caz.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.caz.impl.ClaimImpl
	 * @see net.certware.argument.caz.impl.CazPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__IDENTIFIER = ArmPackage.CLAIM__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__DESCRIPTION = ArmPackage.CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CONTENT = ArmPackage.CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__IS_TAGGED = ArmPackage.CLAIM__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__ASSUMED = ArmPackage.CLAIM__ASSUMED;

	/**
	 * The feature id for the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__TO_BE_SUPPORTED = ArmPackage.CLAIM__TO_BE_SUPPORTED;

	/**
	 * The feature id for the '<em><b>Claim Strategies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_STRATEGIES = ArmPackage.CLAIM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Claim Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_ASSUMPTIONS = ArmPackage.CLAIM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Claim Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_CONTEXTS = ArmPackage.CLAIM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Claim Solutions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CLAIM_SOLUTIONS = ArmPackage.CLAIM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub Claims</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__SUB_CLAIMS = ArmPackage.CLAIM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = ArmPackage.CLAIM_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.certware.argument.caz.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.caz.impl.ArgumentImpl
	 * @see net.certware.argument.caz.impl.CazPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IDENTIFIER = ArmPackage.REASONING_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = ArmPackage.REASONING_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONTENT = ArmPackage.REASONING_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IS_TAGGED = ArmPackage.REASONING_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Argument Justification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_JUSTIFICATION = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_EVIDENCE = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument Claims</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ARGUMENT_CLAIMS = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = ArmPackage.REASONING_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.certware.argument.caz.impl.EvidenceImpl <em>Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.caz.impl.EvidenceImpl
	 * @see net.certware.argument.caz.impl.CazPackageImpl#getEvidence()
	 * @generated
	 */
	int EVIDENCE = 3;

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
	 * The feature id for the '<em><b>Evidence Contexts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__EVIDENCE_CONTEXTS = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE__EVIDENCE = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_FEATURE_COUNT = ArmPackage.ASSERTED_EVIDENCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.certware.argument.caz.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.caz.impl.AssumptionImpl
	 * @see net.certware.argument.caz.impl.CazPackageImpl#getAssumption()
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
	 * The meta object id for the '{@link net.certware.argument.caz.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.caz.impl.ContextImpl
	 * @see net.certware.argument.caz.impl.CazPackageImpl#getContext()
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
	 * The meta object id for the '{@link net.certware.argument.caz.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.argument.caz.impl.JustificationImpl
	 * @see net.certware.argument.caz.impl.CazPackageImpl#getJustification()
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
	 * Returns the meta object for class '{@link net.certware.argument.caz.ArgumentDiagram <em>Argument Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Diagram</em>'.
	 * @see net.certware.argument.caz.ArgumentDiagram
	 * @generated
	 */
	EClass getArgumentDiagram();

	/**
	 * Returns the meta object for the attribute '{@link net.certware.argument.caz.ArgumentDiagram#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.certware.argument.caz.ArgumentDiagram#getVersion()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EAttribute getArgumentDiagram_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.caz.ArgumentDiagram#getClaims <em>Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claims</em>'.
	 * @see net.certware.argument.caz.ArgumentDiagram#getClaims()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Claims();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.caz.ArgumentDiagram#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see net.certware.argument.caz.ArgumentDiagram#getArguments()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.caz.ArgumentDiagram#getAssumptions <em>Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assumptions</em>'.
	 * @see net.certware.argument.caz.ArgumentDiagram#getAssumptions()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Assumptions();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.caz.ArgumentDiagram#getJustifications <em>Justifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Justifications</em>'.
	 * @see net.certware.argument.caz.ArgumentDiagram#getJustifications()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Justifications();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.caz.ArgumentDiagram#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see net.certware.argument.caz.ArgumentDiagram#getContexts()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link net.certware.argument.caz.ArgumentDiagram#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see net.certware.argument.caz.ArgumentDiagram#getEvidence()
	 * @see #getArgumentDiagram()
	 * @generated
	 */
	EReference getArgumentDiagram_Evidence();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.caz.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see net.certware.argument.caz.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Claim#getClaimStrategies <em>Claim Strategies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Claim Strategies</em>'.
	 * @see net.certware.argument.caz.Claim#getClaimStrategies()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_ClaimStrategies();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Claim#getClaimAssumptions <em>Claim Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Claim Assumptions</em>'.
	 * @see net.certware.argument.caz.Claim#getClaimAssumptions()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_ClaimAssumptions();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Claim#getClaimContexts <em>Claim Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Claim Contexts</em>'.
	 * @see net.certware.argument.caz.Claim#getClaimContexts()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_ClaimContexts();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Claim#getClaimSolutions <em>Claim Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Claim Solutions</em>'.
	 * @see net.certware.argument.caz.Claim#getClaimSolutions()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_ClaimSolutions();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Claim#getSubClaims <em>Sub Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Claims</em>'.
	 * @see net.certware.argument.caz.Claim#getSubClaims()
	 * @see #getClaim()
	 * @generated
	 */
	EReference getClaim_SubClaims();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.caz.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see net.certware.argument.caz.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Argument#getArgumentJustification <em>Argument Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Justification</em>'.
	 * @see net.certware.argument.caz.Argument#getArgumentJustification()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentJustification();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Argument#getArgumentEvidence <em>Argument Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Evidence</em>'.
	 * @see net.certware.argument.caz.Argument#getArgumentEvidence()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentEvidence();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Argument#getArgumentClaims <em>Argument Claims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Argument Claims</em>'.
	 * @see net.certware.argument.caz.Argument#getArgumentClaims()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ArgumentClaims();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.caz.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence</em>'.
	 * @see net.certware.argument.caz.Evidence
	 * @generated
	 */
	EClass getEvidence();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Evidence#getEvidenceContexts <em>Evidence Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence Contexts</em>'.
	 * @see net.certware.argument.caz.Evidence#getEvidenceContexts()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_EvidenceContexts();

	/**
	 * Returns the meta object for the reference list '{@link net.certware.argument.caz.Evidence#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evidence</em>'.
	 * @see net.certware.argument.caz.Evidence#getEvidence()
	 * @see #getEvidence()
	 * @generated
	 */
	EReference getEvidence_Evidence();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.caz.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see net.certware.argument.caz.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.caz.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see net.certware.argument.caz.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link net.certware.argument.caz.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see net.certware.argument.caz.Justification
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
	CazFactory getCazFactory();

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
		 * The meta object literal for the '{@link net.certware.argument.caz.impl.ArgumentDiagramImpl <em>Argument Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.caz.impl.ArgumentDiagramImpl
		 * @see net.certware.argument.caz.impl.CazPackageImpl#getArgumentDiagram()
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
		 * The meta object literal for the '<em><b>Claims</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__CLAIMS = eINSTANCE.getArgumentDiagram_Claims();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__ARGUMENTS = eINSTANCE.getArgumentDiagram_Arguments();

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
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_DIAGRAM__EVIDENCE = eINSTANCE.getArgumentDiagram_Evidence();

		/**
		 * The meta object literal for the '{@link net.certware.argument.caz.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.caz.impl.ClaimImpl
		 * @see net.certware.argument.caz.impl.CazPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Claim Strategies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_STRATEGIES = eINSTANCE.getClaim_ClaimStrategies();

		/**
		 * The meta object literal for the '<em><b>Claim Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_ASSUMPTIONS = eINSTANCE.getClaim_ClaimAssumptions();

		/**
		 * The meta object literal for the '<em><b>Claim Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_CONTEXTS = eINSTANCE.getClaim_ClaimContexts();

		/**
		 * The meta object literal for the '<em><b>Claim Solutions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__CLAIM_SOLUTIONS = eINSTANCE.getClaim_ClaimSolutions();

		/**
		 * The meta object literal for the '<em><b>Sub Claims</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM__SUB_CLAIMS = eINSTANCE.getClaim_SubClaims();

		/**
		 * The meta object literal for the '{@link net.certware.argument.caz.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.caz.impl.ArgumentImpl
		 * @see net.certware.argument.caz.impl.CazPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Argument Justification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_JUSTIFICATION = eINSTANCE.getArgument_ArgumentJustification();

		/**
		 * The meta object literal for the '<em><b>Argument Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_EVIDENCE = eINSTANCE.getArgument_ArgumentEvidence();

		/**
		 * The meta object literal for the '<em><b>Argument Claims</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__ARGUMENT_CLAIMS = eINSTANCE.getArgument_ArgumentClaims();

		/**
		 * The meta object literal for the '{@link net.certware.argument.caz.impl.EvidenceImpl <em>Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.caz.impl.EvidenceImpl
		 * @see net.certware.argument.caz.impl.CazPackageImpl#getEvidence()
		 * @generated
		 */
		EClass EVIDENCE = eINSTANCE.getEvidence();

		/**
		 * The meta object literal for the '<em><b>Evidence Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__EVIDENCE_CONTEXTS = eINSTANCE.getEvidence_EvidenceContexts();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVIDENCE__EVIDENCE = eINSTANCE.getEvidence_Evidence();

		/**
		 * The meta object literal for the '{@link net.certware.argument.caz.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.caz.impl.AssumptionImpl
		 * @see net.certware.argument.caz.impl.CazPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link net.certware.argument.caz.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.caz.impl.ContextImpl
		 * @see net.certware.argument.caz.impl.CazPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link net.certware.argument.caz.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.certware.argument.caz.impl.JustificationImpl
		 * @see net.certware.argument.caz.impl.CazPackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

	}

} //CazPackage
