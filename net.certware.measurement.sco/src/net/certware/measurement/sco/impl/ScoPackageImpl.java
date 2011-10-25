/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.impl;

import java.io.IOException;

import java.net.URL;

import net.certware.measurement.sco.ScoFactory;
import net.certware.measurement.sco.ScoPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScoPackageImpl extends EPackageImpl implements ScoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "sco.ecore"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOrderCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalChangeOrdersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criticalDefectChangeOrdersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalDefectChangeOrdersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass improvementChangeOrdersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newFeatureChangeOrdersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactCommitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitHistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeOrderTypeEEnum = null;

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
	 * @see net.certware.measurement.sco.ScoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScoPackageImpl() {
		super(eNS_URI, ScoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ScoPackage init() {
		if (isInited) return (ScoPackage)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI);

		// Obtain or create and register package
		ScoPackageImpl theScoPackage = (ScoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScoPackageImpl());

		isInited = true;

		// Load packages
		theScoPackage.loadPackage();

		// Fix loaded packages
		theScoPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theScoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScoPackage.eNS_URI, theScoPackage);
		return theScoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeOrderCount() {
		if (changeOrderCountEClass == null) {
			changeOrderCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(1);
		}
		return changeOrderCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOrderCount_Name() {
        return (EAttribute)getChangeOrderCount().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOrderCount_Value() {
        return (EAttribute)getChangeOrderCount().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOrderCount_Type() {
        return (EAttribute)getChangeOrderCount().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOrderCount_BrokenLines() {
        return (EAttribute)getChangeOrderCount().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOrderCount_FixedLines() {
        return (EAttribute)getChangeOrderCount().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOrderCount_RepairEffort() {
        return (EAttribute)getChangeOrderCount().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalChangeOrders() {
		if (totalChangeOrdersEClass == null) {
			totalChangeOrdersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(2);
		}
		return totalChangeOrdersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriticalDefectChangeOrders() {
		if (criticalDefectChangeOrdersEClass == null) {
			criticalDefectChangeOrdersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(3);
		}
		return criticalDefectChangeOrdersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalDefectChangeOrders() {
		if (normalDefectChangeOrdersEClass == null) {
			normalDefectChangeOrdersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(4);
		}
		return normalDefectChangeOrdersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImprovementChangeOrders() {
		if (improvementChangeOrdersEClass == null) {
			improvementChangeOrdersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(5);
		}
		return improvementChangeOrdersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewFeatureChangeOrders() {
		if (newFeatureChangeOrdersEClass == null) {
			newFeatureChangeOrdersEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(6);
		}
		return newFeatureChangeOrdersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactIdentifier() {
		if (artifactIdentifierEClass == null) {
			artifactIdentifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(7);
		}
		return artifactIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactIdentifier_ResourceName() {
        return (EAttribute)getArtifactIdentifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactIdentifier_BaselinedLineCount() {
        return (EAttribute)getArtifactIdentifier().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactIdentifier_CurrentLineCount() {
        return (EAttribute)getArtifactIdentifier().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactIdentifier_CriticalDefectChangeOrders() {
        return (EReference)getArtifactIdentifier().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactIdentifier_NormalDefectChangeOrders() {
        return (EReference)getArtifactIdentifier().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactIdentifier_ImprovementChangeOrders() {
        return (EReference)getArtifactIdentifier().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactIdentifier_NewFeatureChangeOrders() {
        return (EReference)getArtifactIdentifier().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactIdentifier_TotalChangeOrders() {
        return (EReference)getArtifactIdentifier().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifactCommit() {
		if (artifactCommitEClass == null) {
			artifactCommitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(8);
		}
		return artifactCommitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifactCommit_ArtifactIdentifiers() {
        return (EReference)getArtifactCommit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactCommit_CommitIdentifier() {
        return (EAttribute)getArtifactCommit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifactCommit_UsageTime() {
        return (EAttribute)getArtifactCommit().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommitHistory() {
		if (commitHistoryEClass == null) {
			commitHistoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(9);
		}
		return commitHistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommitHistory_CommitRecord() {
        return (EReference)getCommitHistory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeOrderType() {
		if (changeOrderTypeEEnum == null) {
			changeOrderTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ScoPackage.eNS_URI).getEClassifiers().get(0);
		}
		return changeOrderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoFactory getScoFactory() {
		return (ScoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename); //$NON-NLS-1$
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("net.certware.measurement.sco." + eClassifier.getName()); //$NON-NLS-1$
			setGeneratedClassName(eClassifier);
		}
	}

} //ScoPackageImpl
