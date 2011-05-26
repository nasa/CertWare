/**
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.caz.impl;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.caz.Argument;
import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Criteria;
import net.certware.argument.caz.EuzFactory;
import net.certware.argument.caz.EuzPackage;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.Justification;
import net.certware.argument.caz.Solution;
import net.certware.argument.caz.Strategy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EuzPackageImpl extends EPackageImpl implements EuzPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criteriaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.certware.argument.caz.EuzPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EuzPackageImpl() {
		super(eNS_URI, EuzFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EuzPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EuzPackage init() {
		if (isInited) return (EuzPackage)EPackage.Registry.INSTANCE.getEPackage(EuzPackage.eNS_URI);

		// Obtain or create and register package
		EuzPackageImpl theEuzPackage = (EuzPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EuzPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EuzPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEuzPackage.createPackageContents();

		// Initialize created meta-data
		theEuzPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEuzPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EuzPackage.eNS_URI, theEuzPackage);
		return theEuzPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentDiagram() {
		return argumentDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentDiagram_Version() {
		return (EAttribute)argumentDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Arguments() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Strategies() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Solutions() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Assumptions() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Justifications() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Contexts() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Criteria() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Evidence() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArgumentStrategies() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArgumentAssumptions() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArgumentContexts() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArgumentSolutions() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArgumentCriteria() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArgumentJustifications() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_SubArguments() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJustification() {
		return justificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidence() {
		return evidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContext_ContextAssumptions() {
		return (EReference)contextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriteria() {
		return criteriaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteria_CriteriaContexts() {
		return (EReference)criteriaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCriteria_CriteriaAssumptions() {
		return (EReference)criteriaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_SolutionContexts() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_SolutionEvidence() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_SolutionCriteria() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategyArguments() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategyJustifications() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategyCriteria() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategyAssumptions() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EuzFactory getEuzFactory() {
		return (EuzFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		argumentDiagramEClass = createEClass(ARGUMENT_DIAGRAM);
		createEAttribute(argumentDiagramEClass, ARGUMENT_DIAGRAM__VERSION);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__ARGUMENTS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__STRATEGIES);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__SOLUTIONS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__ASSUMPTIONS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__JUSTIFICATIONS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__CONTEXTS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__CRITERIA);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__EVIDENCE);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_STRATEGIES);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_ASSUMPTIONS);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_CONTEXTS);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_SOLUTIONS);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_CRITERIA);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_JUSTIFICATIONS);
		createEReference(argumentEClass, ARGUMENT__SUB_ARGUMENTS);

		contextEClass = createEClass(CONTEXT);
		createEReference(contextEClass, CONTEXT__CONTEXT_ASSUMPTIONS);

		criteriaEClass = createEClass(CRITERIA);
		createEReference(criteriaEClass, CRITERIA__CRITERIA_CONTEXTS);
		createEReference(criteriaEClass, CRITERIA__CRITERIA_ASSUMPTIONS);

		strategyEClass = createEClass(STRATEGY);
		createEReference(strategyEClass, STRATEGY__STRATEGY_ARGUMENTS);
		createEReference(strategyEClass, STRATEGY__STRATEGY_JUSTIFICATIONS);
		createEReference(strategyEClass, STRATEGY__STRATEGY_CRITERIA);
		createEReference(strategyEClass, STRATEGY__STRATEGY_ASSUMPTIONS);

		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__SOLUTION_CONTEXTS);
		createEReference(solutionEClass, SOLUTION__SOLUTION_EVIDENCE);
		createEReference(solutionEClass, SOLUTION__SOLUTION_CRITERIA);

		assumptionEClass = createEClass(ASSUMPTION);

		justificationEClass = createEClass(JUSTIFICATION);

		evidenceEClass = createEClass(EVIDENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArmPackage theArmPackage = (ArmPackage)EPackage.Registry.INSTANCE.getEPackage(ArmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		argumentEClass.getESuperTypes().add(theArmPackage.getClaim());
		contextEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		criteriaEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		strategyEClass.getESuperTypes().add(theArmPackage.getReasoningElement());
		solutionEClass.getESuperTypes().add(theArmPackage.getAssertedEvidence());
		assumptionEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		justificationEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		evidenceEClass.getESuperTypes().add(theArmPackage.getAssertedEvidence());

		// Initialize classes and features; add operations and parameters
		initEClass(argumentDiagramEClass, ArgumentDiagram.class, "ArgumentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArgumentDiagram_Version(), ecorePackage.getEString(), "version", null, 0, 1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Strategies(), this.getStrategy(), null, "strategies", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Solutions(), this.getSolution(), null, "solutions", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Assumptions(), this.getAssumption(), null, "assumptions", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Justifications(), this.getJustification(), null, "justifications", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Contexts(), this.getContext(), null, "contexts", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Criteria(), this.getCriteria(), null, "criteria", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArgument_ArgumentStrategies(), this.getStrategy(), null, "argumentStrategies", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgument_ArgumentAssumptions(), this.getAssumption(), null, "argumentAssumptions", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgument_ArgumentContexts(), this.getContext(), null, "argumentContexts", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgument_ArgumentSolutions(), this.getSolution(), null, "argumentSolutions", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgument_ArgumentCriteria(), this.getCriteria(), null, "argumentCriteria", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgument_ArgumentJustifications(), this.getJustification(), null, "argumentJustifications", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgument_SubArguments(), this.getArgument(), null, "subArguments", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getContext_ContextAssumptions(), this.getAssumption(), null, "contextAssumptions", null, 0, -1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(criteriaEClass, Criteria.class, "Criteria", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getCriteria_CriteriaContexts(), this.getContext(), null, "criteriaContexts", null, 0, -1, Criteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getCriteria_CriteriaAssumptions(), this.getAssumption(), null, "criteriaAssumptions", null, 0, -1, Criteria.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStrategy_StrategyArguments(), this.getArgument(), null, "strategyArguments", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStrategy_StrategyJustifications(), this.getJustification(), null, "strategyJustifications", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStrategy_StrategyCriteria(), this.getCriteria(), null, "strategyCriteria", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStrategy_StrategyAssumptions(), this.getAssumption(), null, "strategyAssumptions", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSolution_SolutionContexts(), this.getContext(), null, "solutionContexts", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSolution_SolutionEvidence(), this.getEvidence(), null, "solutionEvidence", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSolution_SolutionCriteria(), this.getCriteria(), null, "solutionCriteria", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.link
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf"; //$NON-NLS-1$		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "euz" //$NON-NLS-1$ //$NON-NLS-2$
		   });																										
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram"; //$NON-NLS-1$			
		addAnnotation
		  (argumentDiagramEClass, 
		   source, 
		   new String[] {
			 "model.extension", "euz", //$NON-NLS-1$ //$NON-NLS-2$
			 "diagram.extension", "euzd", //$NON-NLS-1$ //$NON-NLS-2$
			 "onefile", "false" //$NON-NLS-1$ //$NON-NLS-2$
		   });																									
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node"; //$NON-NLS-1$				
		addAnnotation
		  (argumentEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Argument {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "rectangle", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "152,251,152", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates an argument node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });									
		addAnnotation
		  (contextEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Context {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "rounded", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "250,250,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Context Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates a context node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/rounded-rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/rounded-rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (criteriaEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Criteria {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "rounded", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "250,250,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Criteria Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates a criteria node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/rounded-rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/rounded-rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (strategyEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Strategy {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "net.certware.argument.diagram.figures.ParallelogramFigure", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "250,250,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Strategy Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates a strategy node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/parallelogram.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/parallelogram.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (solutionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Solution {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "250,250,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Solution Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates a solution node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });					
		addAnnotation
		  (assumptionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Assumption {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "rounded", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,240,240", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Assumption Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates an assumption node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/rounded-rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/rounded-rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (justificationEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Justification {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "rounded", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "250,250,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Justification Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates a justification node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/rounded-rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/rounded-rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (evidenceEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Evidence {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "135,206,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Evidence Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates an evidence node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.link"; //$NON-NLS-1$					
		addAnnotation
		  (getArgument_ArgumentStrategies(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Strategy", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its strategy", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArgument_ArgumentAssumptions(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArgument_ArgumentContexts(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArgument_ArgumentSolutions(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Solution", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its solution", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArgument_ArgumentCriteria(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Criteria", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its criteria", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArgument_ArgumentJustifications(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Justification", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its justification", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArgument_SubArguments(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Sub-Argument", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its sub-argument", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getContext_ContextAssumptions(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Context with Assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a context with its assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getCriteria_CriteriaContexts(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Criteria with Context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links criteria with its context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getCriteria_CriteriaAssumptions(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Criteria with Assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links criteria with is assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getStrategy_StrategyArguments(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Strategy with Argument", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a strategy with its argument", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStrategy_StrategyJustifications(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Strategy with Justification", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links and argument with its strategy", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStrategy_StrategyCriteria(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Strategy with Criteria", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a strategy with its criteria", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStrategy_StrategyAssumptions(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Strategy with Assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a strategy with its assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getSolution_SolutionContexts(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Solution with Context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a solution with its context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSolution_SolutionEvidence(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Solution with Evidence", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a solution with its evidence", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSolution_SolutionCriteria(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Solution with Criteria", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a solution with its context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
	}

} //EuzPackageImpl
