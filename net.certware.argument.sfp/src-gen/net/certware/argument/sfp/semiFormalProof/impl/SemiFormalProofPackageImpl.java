/**
 */
package net.certware.argument.sfp.semiFormalProof.impl;

import net.certware.argument.sfp.semiFormalProof.Conjunction;
import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.ProofSteps;
import net.certware.argument.sfp.semiFormalProof.QuotedAssertion;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofFactory;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.Validation;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemiFormalProofPackageImpl extends EPackageImpl implements SemiFormalProofPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass proofEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass justificationsEClass = null;

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
  private EClass quotedAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entailmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass proofStepsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass validationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum validationKindEEnum = null;

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
   * @see net.certware.argument.sfp.semiFormalProof.SemiFormalProofPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SemiFormalProofPackageImpl()
  {
    super(eNS_URI, SemiFormalProofFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SemiFormalProofPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SemiFormalProofPackage init()
  {
    if (isInited) return (SemiFormalProofPackage)EPackage.Registry.INSTANCE.getEPackage(SemiFormalProofPackage.eNS_URI);

    // Obtain or create and register package
    SemiFormalProofPackageImpl theSemiFormalProofPackage = (SemiFormalProofPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SemiFormalProofPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SemiFormalProofPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSemiFormalProofPackage.createPackageContents();

    // Initialize created meta-data
    theSemiFormalProofPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSemiFormalProofPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SemiFormalProofPackage.eNS_URI, theSemiFormalProofPackage);
    return theSemiFormalProofPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProof()
  {
    return proofEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProof_Title()
  {
    return (EAttribute)proofEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProof_Justifications()
  {
    return (EReference)proofEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProof_ProofSteps()
  {
    return (EReference)proofEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJustifications()
  {
    return justificationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJustifications_Justifications()
  {
    return (EReference)justificationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJustification()
  {
    return justificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJustification_Hypothesis()
  {
    return (EAttribute)justificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJustification_Epsilon()
  {
    return (EAttribute)justificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJustification_Numeral()
  {
    return (EAttribute)justificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJustification_Assertion()
  {
    return (EReference)justificationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJustification_Entailment()
  {
    return (EReference)justificationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuotedAssertion()
  {
    return quotedAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuotedAssertion_Text()
  {
    return (EAttribute)quotedAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntailment()
  {
    return entailmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntailment_Head()
  {
    return (EReference)entailmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntailment_Tail()
  {
    return (EAttribute)entailmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConjunction()
  {
    return conjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConjunction_Lhs()
  {
    return (EAttribute)conjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConjunction_Rhs()
  {
    return (EReference)conjunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProofSteps()
  {
    return proofStepsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProofSteps_Statements()
  {
    return (EReference)proofStepsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProofSteps_Epsilon()
  {
    return (EAttribute)proofStepsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Id()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Statement()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Justification()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Validation()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValidation()
  {
    return validationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidation_Author()
  {
    return (EAttribute)validationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidation_TimeStamp()
  {
    return (EAttribute)validationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValidation_State()
  {
    return (EAttribute)validationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getValidationKind()
  {
    return validationKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SemiFormalProofFactory getSemiFormalProofFactory()
  {
    return (SemiFormalProofFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    proofEClass = createEClass(PROOF);
    createEAttribute(proofEClass, PROOF__TITLE);
    createEReference(proofEClass, PROOF__JUSTIFICATIONS);
    createEReference(proofEClass, PROOF__PROOF_STEPS);

    justificationsEClass = createEClass(JUSTIFICATIONS);
    createEReference(justificationsEClass, JUSTIFICATIONS__JUSTIFICATIONS);

    justificationEClass = createEClass(JUSTIFICATION);
    createEAttribute(justificationEClass, JUSTIFICATION__HYPOTHESIS);
    createEAttribute(justificationEClass, JUSTIFICATION__EPSILON);
    createEAttribute(justificationEClass, JUSTIFICATION__NUMERAL);
    createEReference(justificationEClass, JUSTIFICATION__ASSERTION);
    createEReference(justificationEClass, JUSTIFICATION__ENTAILMENT);

    quotedAssertionEClass = createEClass(QUOTED_ASSERTION);
    createEAttribute(quotedAssertionEClass, QUOTED_ASSERTION__TEXT);

    entailmentEClass = createEClass(ENTAILMENT);
    createEReference(entailmentEClass, ENTAILMENT__HEAD);
    createEAttribute(entailmentEClass, ENTAILMENT__TAIL);

    conjunctionEClass = createEClass(CONJUNCTION);
    createEAttribute(conjunctionEClass, CONJUNCTION__LHS);
    createEReference(conjunctionEClass, CONJUNCTION__RHS);

    proofStepsEClass = createEClass(PROOF_STEPS);
    createEReference(proofStepsEClass, PROOF_STEPS__STATEMENTS);
    createEAttribute(proofStepsEClass, PROOF_STEPS__EPSILON);

    statementEClass = createEClass(STATEMENT);
    createEAttribute(statementEClass, STATEMENT__ID);
    createEAttribute(statementEClass, STATEMENT__STATEMENT);
    createEReference(statementEClass, STATEMENT__JUSTIFICATION);
    createEReference(statementEClass, STATEMENT__VALIDATION);

    validationEClass = createEClass(VALIDATION);
    createEAttribute(validationEClass, VALIDATION__AUTHOR);
    createEAttribute(validationEClass, VALIDATION__TIME_STAMP);
    createEAttribute(validationEClass, VALIDATION__STATE);

    // Create enums
    validationKindEEnum = createEEnum(VALIDATION_KIND);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(proofEClass, Proof.class, "Proof", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProof_Title(), ecorePackage.getEString(), "title", null, 0, 1, Proof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProof_Justifications(), this.getJustifications(), null, "justifications", null, 0, 1, Proof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProof_ProofSteps(), this.getProofSteps(), null, "proofSteps", null, 0, 1, Proof.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(justificationsEClass, Justifications.class, "Justifications", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJustifications_Justifications(), this.getJustification(), null, "justifications", null, 0, -1, Justifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJustification_Hypothesis(), ecorePackage.getEBoolean(), "hypothesis", null, 0, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJustification_Epsilon(), ecorePackage.getEBoolean(), "epsilon", null, 0, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJustification_Numeral(), ecorePackage.getEString(), "numeral", null, 0, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJustification_Assertion(), this.getQuotedAssertion(), null, "assertion", null, 0, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJustification_Entailment(), this.getEntailment(), null, "entailment", null, 0, 1, Justification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quotedAssertionEClass, QuotedAssertion.class, "QuotedAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuotedAssertion_Text(), ecorePackage.getEString(), "text", null, 0, 1, QuotedAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entailmentEClass, Entailment.class, "Entailment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntailment_Head(), this.getConjunction(), null, "head", null, 0, 1, Entailment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntailment_Tail(), ecorePackage.getEString(), "tail", null, 0, 1, Entailment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConjunction_Lhs(), ecorePackage.getEString(), "lhs", null, 0, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConjunction_Rhs(), this.getConjunction(), null, "rhs", null, 0, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(proofStepsEClass, ProofSteps.class, "ProofSteps", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProofSteps_Statements(), this.getStatement(), null, "statements", null, 0, -1, ProofSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProofSteps_Epsilon(), ecorePackage.getEBoolean(), "epsilon", null, 0, 1, ProofSteps.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatement_Id(), ecorePackage.getEString(), "id", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Justification(), this.getJustifications(), null, "justification", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Validation(), this.getValidation(), null, "validation", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(validationEClass, Validation.class, "Validation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValidation_Author(), ecorePackage.getEString(), "author", null, 0, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValidation_TimeStamp(), ecorePackage.getEString(), "timeStamp", null, 0, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValidation_State(), this.getValidationKind(), "state", null, 0, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(validationKindEEnum, ValidationKind.class, "ValidationKind");
    addEEnumLiteral(validationKindEEnum, ValidationKind.UNKNOWN);
    addEEnumLiteral(validationKindEEnum, ValidationKind.VALID);
    addEEnumLiteral(validationKindEEnum, ValidationKind.INVALID);

    // Create resource
    createResource(eNS_URI);
  }

} //SemiFormalProofPackageImpl
