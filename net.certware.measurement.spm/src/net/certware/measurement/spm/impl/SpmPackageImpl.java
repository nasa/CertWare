/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.impl;

import java.io.IOException;
import java.net.URL;

import net.certware.measurement.smm.SmmPackage;
import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.SpmPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
public class SpmPackageImpl extends EPackageImpl implements SpmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "spm.ecore"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectCommitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endProductQualityCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inProgressQualityCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endProductQualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintainabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inProgressIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectSizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseDimensionalMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOrderDimensionalMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeDimensionalMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additiveMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criticalDefectChangeOrderCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalDefectChangeOrderCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass improvementChangeOrderCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newFeatureChangeOrderCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trendMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scrapRatioMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modularityMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reworkRatioMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptabilityRatioMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maturityRatioMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maintainabilityMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brokenCaseSizeMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedCaseSizeMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalCaseSizeMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baselineCaseSizeMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageTimeMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repairEffortMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developmentEffortMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass totalChangeOrderCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass criticalAndNormalChangeOrderCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reworkStabilityMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reworkBacklogMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modularityTrendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adaptabilityTrendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maturityTrendEClass = null;

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
	 * @see net.certware.measurement.spm.SpmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpmPackageImpl() {
		super(eNS_URI, SpmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static SpmPackage init() {
		if (isInited) return (SpmPackage)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI);

		// Obtain or create and register package
		SpmPackageImpl theSpmPackage = (SpmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SmmPackage.eINSTANCE.eClass();

		// Load packages
		theSpmPackage.loadPackage();

		// Fix loaded packages
		theSpmPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpmPackage.eNS_URI, theSpmPackage);
		return theSpmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectModel() {
		if (projectModelEClass == null) {
			projectModelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(0);
		}
		return projectModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectModel_Commits() {
        return (EReference)getProjectModel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectCommit() {
		if (projectCommitEClass == null) {
			projectCommitEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(1);
		}
		return projectCommitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommitRelationship() {
		if (commitRelationshipEClass == null) {
			commitRelationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(2);
		}
		return commitRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndProductQualityCategory() {
		if (endProductQualityCategoryEClass == null) {
			endProductQualityCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(3);
		}
		return endProductQualityCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInProgressQualityCategory() {
		if (inProgressQualityCategoryEClass == null) {
			inProgressQualityCategoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(4);
		}
		return inProgressQualityCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndProductQuality() {
		if (endProductQualityEClass == null) {
			endProductQualityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(5);
		}
		return endProductQualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintainability() {
		if (maintainabilityEClass == null) {
			maintainabilityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(6);
		}
		return maintainabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInProgressIndicator() {
		if (inProgressIndicatorEClass == null) {
			inProgressIndicatorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(7);
		}
		return inProgressIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectSize() {
		if (projectSizeEClass == null) {
			projectSizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(8);
		}
		return projectSizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseDimensionalMeasure() {
		if (caseDimensionalMeasureEClass == null) {
			caseDimensionalMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(9);
		}
		return caseDimensionalMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeOrderDimensionalMeasure() {
		if (changeOrderDimensionalMeasureEClass == null) {
			changeOrderDimensionalMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(10);
		}
		return changeOrderDimensionalMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeDimensionalMeasure() {
		if (timeDimensionalMeasureEClass == null) {
			timeDimensionalMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(11);
		}
		return timeDimensionalMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditiveMeasure() {
		if (additiveMeasureEClass == null) {
			additiveMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(12);
		}
		return additiveMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaseScope() {
		if (caseScopeEClass == null) {
			caseScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(13);
		}
		return caseScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectScope() {
		if (projectScopeEClass == null) {
			projectScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(14);
		}
		return projectScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeScope() {
		if (changeScopeEClass == null) {
			changeScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(15);
		}
		return changeScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriticalDefectChangeOrderCount() {
		if (criticalDefectChangeOrderCountEClass == null) {
			criticalDefectChangeOrderCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(16);
		}
		return criticalDefectChangeOrderCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalDefectChangeOrderCount() {
		if (normalDefectChangeOrderCountEClass == null) {
			normalDefectChangeOrderCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(17);
		}
		return normalDefectChangeOrderCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImprovementChangeOrderCount() {
		if (improvementChangeOrderCountEClass == null) {
			improvementChangeOrderCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(18);
		}
		return improvementChangeOrderCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewFeatureChangeOrderCount() {
		if (newFeatureChangeOrderCountEClass == null) {
			newFeatureChangeOrderCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(19);
		}
		return newFeatureChangeOrderCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrendMeasure() {
		if (trendMeasureEClass == null) {
			trendMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(20);
		}
		return trendMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScrapRatioMeasure() {
		if (scrapRatioMeasureEClass == null) {
			scrapRatioMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(21);
		}
		return scrapRatioMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModularityMeasure() {
		if (modularityMeasureEClass == null) {
			modularityMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(22);
		}
		return modularityMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReworkRatioMeasure() {
		if (reworkRatioMeasureEClass == null) {
			reworkRatioMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(23);
		}
		return reworkRatioMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptabilityRatioMeasure() {
		if (adaptabilityRatioMeasureEClass == null) {
			adaptabilityRatioMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(24);
		}
		return adaptabilityRatioMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaturityRatioMeasure() {
		if (maturityRatioMeasureEClass == null) {
			maturityRatioMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(25);
		}
		return maturityRatioMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaintainabilityMeasure() {
		if (maintainabilityMeasureEClass == null) {
			maintainabilityMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(26);
		}
		return maintainabilityMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrokenCaseSizeMeasure() {
		if (brokenCaseSizeMeasureEClass == null) {
			brokenCaseSizeMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(27);
		}
		return brokenCaseSizeMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedCaseSizeMeasure() {
		if (fixedCaseSizeMeasureEClass == null) {
			fixedCaseSizeMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(28);
		}
		return fixedCaseSizeMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalCaseSizeMeasure() {
		if (totalCaseSizeMeasureEClass == null) {
			totalCaseSizeMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(29);
		}
		return totalCaseSizeMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaselineCaseSizeMeasure() {
		if (baselineCaseSizeMeasureEClass == null) {
			baselineCaseSizeMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(30);
		}
		return baselineCaseSizeMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsageTimeMeasure() {
		if (usageTimeMeasureEClass == null) {
			usageTimeMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(31);
		}
		return usageTimeMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepairEffortMeasure() {
		if (repairEffortMeasureEClass == null) {
			repairEffortMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(32);
		}
		return repairEffortMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevelopmentEffortMeasure() {
		if (developmentEffortMeasureEClass == null) {
			developmentEffortMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(33);
		}
		return developmentEffortMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTotalChangeOrderCount() {
		if (totalChangeOrderCountEClass == null) {
			totalChangeOrderCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(34);
		}
		return totalChangeOrderCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCriticalAndNormalChangeOrderCount() {
		if (criticalAndNormalChangeOrderCountEClass == null) {
			criticalAndNormalChangeOrderCountEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(35);
		}
		return criticalAndNormalChangeOrderCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReworkStabilityMeasure() {
		if (reworkStabilityMeasureEClass == null) {
			reworkStabilityMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(36);
		}
		return reworkStabilityMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReworkBacklogMeasure() {
		if (reworkBacklogMeasureEClass == null) {
			reworkBacklogMeasureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(37);
		}
		return reworkBacklogMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModularityTrend() {
		if (modularityTrendEClass == null) {
			modularityTrendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(38);
		}
		return modularityTrendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdaptabilityTrend() {
		if (adaptabilityTrendEClass == null) {
			adaptabilityTrendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(39);
		}
		return adaptabilityTrendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaturityTrend() {
		if (maturityTrendEClass == null) {
			maturityTrendEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(SpmPackage.eNS_URI).getEClassifiers().get(40);
		}
		return maturityTrendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmFactory getSpmFactory() {
		return (SpmFactory)getEFactoryInstance();
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
			eClassifier.setInstanceClassName("net.certware.measurement.spm." + eClassifier.getName()); //$NON-NLS-1$
			setGeneratedClassName(eClassifier);
		}
	}

} //SpmPackageImpl
