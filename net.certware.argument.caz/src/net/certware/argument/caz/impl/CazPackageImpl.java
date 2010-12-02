/**
 * Copyright (c) 2010 Kestrel Technology LLC
 */
package net.certware.argument.caz.impl;

import net.certware.argument.arm.ArmPackage;
import net.certware.argument.caz.Argument;
import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.Assumption;
import net.certware.argument.caz.CazFactory;
import net.certware.argument.caz.CazPackage;
import net.certware.argument.caz.Claim;
import net.certware.argument.caz.Context;
import net.certware.argument.caz.Evidence;
import net.certware.argument.caz.Justification;

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
public class CazPackageImpl extends EPackageImpl implements CazPackage {
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
	private EClass claimEClass = null;

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
	private EClass evidenceEClass = null;

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
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationEClass = null;

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
	 * @see net.certware.argument.caz.CazPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CazPackageImpl() {
		super(eNS_URI, CazFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CazPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CazPackage init() {
		if (isInited) return (CazPackage)EPackage.Registry.INSTANCE.getEPackage(CazPackage.eNS_URI);

		// Obtain or create and register package
		CazPackageImpl theCazPackage = (CazPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CazPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CazPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCazPackage.createPackageContents();

		// Initialize created meta-data
		theCazPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCazPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CazPackage.eNS_URI, theCazPackage);
		return theCazPackage;
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
	public EReference getArgumentDiagram_Claims() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Arguments() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Assumptions() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Justifications() {
		return (EReference)argumentDiagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentDiagram_Contexts() {
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
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_ClaimStrategies() {
		return (EReference)claimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_ClaimAssumptions() {
		return (EReference)claimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_ClaimContexts() {
		return (EReference)claimEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_ClaimSolutions() {
		return (EReference)claimEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaim_SubClaims() {
		return (EReference)claimEClass.getEStructuralFeatures().get(4);
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
	public EReference getArgument_ArgumentJustification() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArgumentEvidence() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ArgumentClaims() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(2);
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
	public EReference getEvidence_EvidenceContexts() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvidence_Evidence() {
		return (EReference)evidenceEClass.getEStructuralFeatures().get(1);
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
	public EClass getContext() {
		return contextEClass;
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
	public CazFactory getCazFactory() {
		return (CazFactory)getEFactoryInstance();
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
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__CLAIMS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__ARGUMENTS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__ASSUMPTIONS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__JUSTIFICATIONS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__CONTEXTS);
		createEReference(argumentDiagramEClass, ARGUMENT_DIAGRAM__EVIDENCE);

		claimEClass = createEClass(CLAIM);
		createEReference(claimEClass, CLAIM__CLAIM_STRATEGIES);
		createEReference(claimEClass, CLAIM__CLAIM_ASSUMPTIONS);
		createEReference(claimEClass, CLAIM__CLAIM_CONTEXTS);
		createEReference(claimEClass, CLAIM__CLAIM_SOLUTIONS);
		createEReference(claimEClass, CLAIM__SUB_CLAIMS);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_JUSTIFICATION);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_EVIDENCE);
		createEReference(argumentEClass, ARGUMENT__ARGUMENT_CLAIMS);

		evidenceEClass = createEClass(EVIDENCE);
		createEReference(evidenceEClass, EVIDENCE__EVIDENCE_CONTEXTS);
		createEReference(evidenceEClass, EVIDENCE__EVIDENCE);

		assumptionEClass = createEClass(ASSUMPTION);

		contextEClass = createEClass(CONTEXT);

		justificationEClass = createEClass(JUSTIFICATION);
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
		claimEClass.getESuperTypes().add(theArmPackage.getClaim());
		argumentEClass.getESuperTypes().add(theArmPackage.getReasoningElement());
		evidenceEClass.getESuperTypes().add(theArmPackage.getAssertedEvidence());
		assumptionEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		contextEClass.getESuperTypes().add(theArmPackage.getInformationElement());
		justificationEClass.getESuperTypes().add(theArmPackage.getInformationElement());

		// Initialize classes and features; add operations and parameters
		initEClass(argumentDiagramEClass, ArgumentDiagram.class, "ArgumentDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArgumentDiagram_Version(), ecorePackage.getEString(), "version", null, 0, 1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Claims(), this.getClaim(), null, "claims", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Assumptions(), this.getAssumption(), null, "assumptions", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Justifications(), this.getJustification(), null, "justifications", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Contexts(), this.getContext(), null, "contexts", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgumentDiagram_Evidence(), this.getEvidence(), null, "evidence", null, 0, -1, ArgumentDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(claimEClass, Claim.class, "Claim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getClaim_ClaimStrategies(), this.getArgument(), null, "claimStrategies", null, 0, -1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClaim_ClaimAssumptions(), this.getAssumption(), null, "claimAssumptions", null, 0, -1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClaim_ClaimContexts(), this.getContext(), null, "claimContexts", null, 0, -1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClaim_ClaimSolutions(), this.getEvidence(), null, "claimSolutions", null, 0, -1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getClaim_SubClaims(), this.getClaim(), null, "subClaims", null, 0, -1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArgument_ArgumentJustification(), this.getJustification(), null, "argumentJustification", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgument_ArgumentEvidence(), this.getEvidence(), null, "argumentEvidence", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getArgument_ArgumentClaims(), this.getClaim(), null, "argumentClaims", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(evidenceEClass, Evidence.class, "Evidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getEvidence_EvidenceContexts(), this.getContext(), null, "evidenceContexts", null, 0, -1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getEvidence_Evidence(), theArmPackage.getInformationElement(), null, "evidence", null, 1, -1, Evidence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

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
			 "foo", "caz" //$NON-NLS-1$ //$NON-NLS-2$
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
			 "model.extension", "caz", //$NON-NLS-1$ //$NON-NLS-2$
			 "diagram.extension", "cazd", //$NON-NLS-1$ //$NON-NLS-2$
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
		  (claimEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Claim {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "152,251,152", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Claim Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates a claim node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });							
		addAnnotation
		  (argumentEClass, 
		   source, 
		   new String[] {
			 "label", "identifier", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.pattern", "Argument {0}", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.icon", "true", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.placement", "internal", //$NON-NLS-1$ //$NON-NLS-2$
			 "label.readonly", "false", //$NON-NLS-1$ //$NON-NLS-2$
			 "figure", "rounded", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "135,206,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates an argument node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
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
			 "figure", "rectangle", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "100,60", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "135,206,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Evidence Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates an evidence node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/rectangle.png", //$NON-NLS-1$ //$NON-NLS-2$
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
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "80,80", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,240,240", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Assumption Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates an assumption node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
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
			 "figure", "ellipse", //$NON-NLS-1$ //$NON-NLS-2$
			 "border.style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "size", "80,80", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "250,250,250", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Context Node", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Creates a context node on the diagram canvas", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/circle.png", //$NON-NLS-1$ //$NON-NLS-2$
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
		  (getClaim_ClaimStrategies(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Claim with Strategy", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a claim with its strategy", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClaim_ClaimAssumptions(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Claim with Assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a claim with its assumption", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClaim_ClaimContexts(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Claim with Context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a claim with its context", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClaim_ClaimSolutions(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Claim with Evidence", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a claim with its evidence", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getClaim_SubClaims(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Claim with Sub-Claim", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links a claim with its sub-claim", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getArgument_ArgumentJustification(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Justification", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its justification", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArgument_ArgumentEvidence(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Evidence", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its evidence", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArgument_ArgumentClaims(), 
		   source, 
		   new String[] {
			 "width", "1", //$NON-NLS-1$ //$NON-NLS-2$
			 "color", "0,0,0", //$NON-NLS-1$ //$NON-NLS-2$
			 "target.decoration", "filledclosedarrow", //$NON-NLS-1$ //$NON-NLS-2$
			 "style", "solid", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.name", "Argument with Claim", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.description", "Links an argument with its claim", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.small.bundle", "net.certware.core.ui", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.path", "icons/obj16/connector.png", //$NON-NLS-1$ //$NON-NLS-2$
			 "tool.large.bundle", "net.certware.core.ui" //$NON-NLS-1$ //$NON-NLS-2$
		   });			
		addAnnotation
		  (getEvidence_EvidenceContexts(), 
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
		  (getEvidence_Evidence(), 
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
	}

} //CazPackageImpl
