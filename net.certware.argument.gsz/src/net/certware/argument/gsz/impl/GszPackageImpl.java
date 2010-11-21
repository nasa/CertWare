/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.gsz.impl;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.gsz.ArgumentDiagram;
import net.certware.argument.gsz.Assumption;
import net.certware.argument.gsz.Context;
import net.certware.argument.gsz.Evidence;
import net.certware.argument.gsz.Goal;
import net.certware.argument.gsz.GszFactory;
import net.certware.argument.gsz.GszPackage;
import net.certware.argument.gsz.Justification;
import net.certware.argument.gsz.Solution;
import net.certware.argument.gsz.Strategy;

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
public class GszPackageImpl extends EPackageImpl implements GszPackage {
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
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

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
	private EClass contextEClass = null;

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
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceEClass = null;

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
	 * @see net.certware.argument.gsz.GszPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GszPackageImpl() {
		super(eNS_URI, GszFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GszPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GszPackage init() {
		if (isInited) return (GszPackage)EPackage.Registry.INSTANCE.getEPackage(GszPackage.eNS_URI);

		// Obtain or create and register package
		GszPackageImpl theGszPackage = (GszPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GszPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GszPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGszPackage.createPackageContents();

		// Initialize created meta-data
		theGszPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGszPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GszPackage.eNS_URI, theGszPackage);
		return theGszPackage;
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
	public EReference getArgumentDiagram_Goals() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Strategies() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Justifications() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Contexts() {
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
	public EReference getArgumentDiagram_Solutions() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Evidence() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentDiagram_Version() {
		return (EAttribute)argumentDiagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_SubGoals() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Strategies() {
		return (EReference)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_GoalContexts() {
		return (EReference)goalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_Assumptions() {
		return (EReference)goalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_GoalSolutions() {
		return (EReference)goalEClass.getEStructuralFeatures().get(4);
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
	public EReference getStrategy_Goals() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_Justifications() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategyContexts() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStrategy_StrategySolutions() {
		return (EReference)strategyEClass.getEStructuralFeatures().get(3);
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
	public EClass getContext() {
		return contextEClass;
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
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_SolutionEvidence() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_SolutionContexts() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(1);
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
	public GszFactory getGszFactory() {
		return (GszFactory)getEFactoryInstance();
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
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__GOALS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__STRATEGIES);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__JUSTIFICATIONS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__CONTEXTS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__ASSUMPTIONS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__SOLUTIONS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__EVIDENCE);
		createEAttribute(argumentDiagramEClass, ARGUMENT_DIAGRAM__VERSION);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__SUB_GOALS);
		createEReference(goalEClass, GOAL__STRATEGIES);
		createEReference(goalEClass, GOAL__GOAL_CONTEXTS);
		createEReference(goalEClass, GOAL__ASSUMPTIONS);
		createEReference(goalEClass, GOAL__GOAL_SOLUTIONS);

		strategyEClass = createEClass(STRATEGY);
		createEReference(strategyEClass, STRATEGY__GOALS);
		createEReference(strategyEClass, STRATEGY__JUSTIFICATIONS);
		createEReference(strategyEClass, STRATEGY__STRATEGY_CONTEXTS);
		createEReference(strategyEClass, STRATEGY__STRATEGY_SOLUTIONS);

		justificationEClass = createEClass(JUSTIFICATION);

		contextEClass = createEClass(CONTEXT);

		assumptionEClass = createEClass(ASSUMPTION);

		solutionEClass = createEClass(SOLUTION);
		createEReference(solutionEClass, SOLUTION__SOLUTION_EVIDENCE);
		createEReference(solutionEClass, SOLUTION__SOLUTION_CONTEXTS);

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
		goalEClass.getESuperTypes().add(theArmPackage.getClaim());
		strategyEClass.getESuperTypes().add(theArmPackage.getReasoningElement());
		justificationEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		contextEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		assumptionEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		solutionEClass.getESuperTypes().add(theArmPackage.getAssertedEvidence());
		evidenceEClass.getESuperTypes().add(theArmPackage.getAssertedEvidence());

		// Initialize classes and features; add operations and parameters
		initEClass(argumentDiagramEClass, ArgumentDiagram.class, "ArgumentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Goals(), this.getGoal(), null, "goals", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Strategies(), this.getStrategy(), null, "strategies", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Justifications(), this.getJustification(), null, "justifications", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Contexts(), this.getContext(), null, "contexts", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Assumptions(), this.getAssumption(), null, "assumptions", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Solutions(), this.getSolution(), null, "solutions", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getArgumentDiagram_Version(), ecorePackage.getEString(), "version", null, 0, 1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGoal_SubGoals(), this.getGoal(), null, "subGoals", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGoal_Strategies(), this.getStrategy(), null, "strategies", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGoal_GoalContexts(), this.getContext(), null, "goalContexts", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGoal_Assumptions(), this.getAssumption(), null, "assumptions", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGoal_GoalSolutions(), this.getSolution(), null, "goalSolutions", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getStrategy_Goals(), this.getGoal(), null, "goals", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStrategy_Justifications(), this.getJustification(), null, "justifications", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStrategy_StrategyContexts(), this.getContext(), null, "strategyContexts", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getStrategy_StrategySolutions(), this.getSolution(), null, "strategySolutions", null, 0, -1, Strategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getSolution_SolutionEvidence(), this.getEvidence(), null, "solutionEvidence", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getSolution_SolutionContexts(), this.getContext(), null, "solutionContexts", null, 0, -1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

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
			 "foo", "gsz" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "model.extension", "gsz", //$NON-NLS-1$ //$NON-NLS-2$
			 "diagram.extension", "gszd" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (goalEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Goal {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.width", "2", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (strategyEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Strategy {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "rectangle", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.width", "2", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (justificationEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Justification {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.width", "2", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (contextEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Context {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "rounded", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.width", "2", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (assumptionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Assumption {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.width", "2", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (solutionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Solution {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.width", "2", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,100" //$NON-NLS-1$ //$NON-NLS-2$
		   });				
		addAnnotation
		  (evidenceEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Evidence {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,100" //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getGoal_SubGoals(), 
		   source, 
		   new String[] {
			 "label", "sub-goal", //$NON-NLS-1$ //$NON-NLS-2$
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGoal_Strategies(), 
		   source, 
		   new String[] {
			 "label", "is solved by", //$NON-NLS-1$ //$NON-NLS-2$
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGoal_GoalContexts(), 
		   source, 
		   new String[] {
			 "label", "in context", //$NON-NLS-1$ //$NON-NLS-2$
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "closedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGoal_Assumptions(), 
		   source, 
		   new String[] {
			 "label", "assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "closedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getGoal_GoalSolutions(), 
		   source, 
		   new String[] {
			 "label", "is solved by", //$NON-NLS-1$ //$NON-NLS-2$
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getStrategy_Goals(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "label", "is solved by", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStrategy_Justifications(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "label", "justification", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "closedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStrategy_StrategyContexts(), 
		   source, 
		   new String[] {
			 "label", "in context", //$NON-NLS-1$ //$NON-NLS-2$
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "closedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getStrategy_StrategySolutions(), 
		   source, 
		   new String[] {
			 "label", "is solved by", //$NON-NLS-1$ //$NON-NLS-2$
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });						
		addAnnotation
		  (getSolution_SolutionEvidence(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "label", "evidence", //$NON-NLS-1$ //$NON-NLS-2$
			 "source.decoration", "filledrhomb", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getSolution_SolutionContexts(), 
		   source, 
		   new String[] {
			 "label", "in context", //$NON-NLS-1$ //$NON-NLS-2$
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "closedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid" //$NON-NLS-1$ //$NON-NLS-2$
		   });	
	}

} //GszPackageImpl
