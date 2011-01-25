/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.impl;

import net.certware.measurement.spm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpmFactoryImpl extends EFactoryImpl implements SpmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpmFactory init() {
		try {
			SpmFactory theSpmFactory = (SpmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.certware.net/spm"); //$NON-NLS-1$ 
			if (theSpmFactory != null) {
				return theSpmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpmPackage.PROJECT_MODEL: return createProjectModel();
			case SpmPackage.PROJECT_HISTORY: return createProjectHistory();
			case SpmPackage.PROJECT_COMMIT: return createProjectCommit();
			case SpmPackage.END_PRODUCT_QUALITY: return createEndProductQuality();
			case SpmPackage.MAINTAINABILITY: return createMaintainability();
			case SpmPackage.IN_PROGRESS_INDICATOR: return createInProgressIndicator();
			case SpmPackage.PROJECT_SIZE: return createProjectSize();
			case SpmPackage.CASE_DIMENSIONAL_MEASURE: return createCaseDimensionalMeasure();
			case SpmPackage.CHANGE_ORDER_DIMENSIONAL_MEASURE: return createChangeOrderDimensionalMeasure();
			case SpmPackage.TIME_DIMENSIONAL_MEASURE: return createTimeDimensionalMeasure();
			case SpmPackage.ADDITIVE_MEASURE: return createAdditiveMeasure();
			case SpmPackage.CASE_SCOPE: return createCaseScope();
			case SpmPackage.PROJECT_SCOPE: return createProjectScope();
			case SpmPackage.CHANGE_SCOPE: return createChangeScope();
			case SpmPackage.CRITICAL_DEFECT_CHANGE_ORDER_COUNT: return createCriticalDefectChangeOrderCount();
			case SpmPackage.NORMAL_DEFECT_CHANGE_ORDER_COUNT: return createNormalDefectChangeOrderCount();
			case SpmPackage.IMPROVEMENT_CHANGE_ORDER_COUNT: return createImprovementChangeOrderCount();
			case SpmPackage.NEW_FEATURE_CHANGE_ORDER_COUNT: return createNewFeatureChangeOrderCount();
			case SpmPackage.TREND_MEASURE: return createTrendMeasure();
			case SpmPackage.SCRAP_RATIO_MEASURE: return createScrapRatioMeasure();
			case SpmPackage.MODULARITY_MEASURE: return createModularityMeasure();
			case SpmPackage.REWORK_RATIO_MEASURE: return createReworkRatioMeasure();
			case SpmPackage.ADAPTABILITY_RATIO_MEASURE: return createAdaptabilityRatioMeasure();
			case SpmPackage.MAINTAINABILITY_MEASURE: return createMaintainabilityMeasure();
			case SpmPackage.BROKEN_CASE_SIZE_MEASURE: return createBrokenCaseSizeMeasure();
			case SpmPackage.FIXED_CASE_SIZE_MEASURE: return createFixedCaseSizeMeasure();
			case SpmPackage.TOTAL_CASE_SIZE_MEASURE: return createTotalCaseSizeMeasure();
			case SpmPackage.BASELINE_CASE_SIZE_MEASURE: return createBaselineCaseSizeMeasure();
			case SpmPackage.REPAIR_EFFORT_MEASURE: return createRepairEffortMeasure();
			case SpmPackage.DEVELOPMENT_EFFORT_MEASURE: return createDevelopmentEffortMeasure();
			case SpmPackage.TOTAL_CHANGE_ORDER_COUNT: return createTotalChangeOrderCount();
			case SpmPackage.CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT: return createCriticalAndNormalChangeOrderCount();
			case SpmPackage.REWORK_STABILITY_MEASURE: return createReworkStabilityMeasure();
			case SpmPackage.REWORK_BACKLOG_MEASURE: return createReworkBacklogMeasure();
			case SpmPackage.MODULARITY_TREND: return createModularityTrend();
			case SpmPackage.ADAPTABILITY_TREND: return createAdaptabilityTrend();
			case SpmPackage.MATURITY_TREND: return createMaturityTrend();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectModel createProjectModel() {
		ProjectModelImpl projectModel = new ProjectModelImpl();
		return projectModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectHistory createProjectHistory() {
		ProjectHistoryImpl projectHistory = new ProjectHistoryImpl();
		return projectHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectCommit createProjectCommit() {
		ProjectCommitImpl projectCommit = new ProjectCommitImpl();
		return projectCommit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndProductQuality createEndProductQuality() {
		EndProductQualityImpl endProductQuality = new EndProductQualityImpl();
		return endProductQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Maintainability createMaintainability() {
		MaintainabilityImpl maintainability = new MaintainabilityImpl();
		return maintainability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InProgressIndicator createInProgressIndicator() {
		InProgressIndicatorImpl inProgressIndicator = new InProgressIndicatorImpl();
		return inProgressIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectSize createProjectSize() {
		ProjectSizeImpl projectSize = new ProjectSizeImpl();
		return projectSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseDimensionalMeasure createCaseDimensionalMeasure() {
		CaseDimensionalMeasureImpl caseDimensionalMeasure = new CaseDimensionalMeasureImpl();
		return caseDimensionalMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeOrderDimensionalMeasure createChangeOrderDimensionalMeasure() {
		ChangeOrderDimensionalMeasureImpl changeOrderDimensionalMeasure = new ChangeOrderDimensionalMeasureImpl();
		return changeOrderDimensionalMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDimensionalMeasure createTimeDimensionalMeasure() {
		TimeDimensionalMeasureImpl timeDimensionalMeasure = new TimeDimensionalMeasureImpl();
		return timeDimensionalMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveMeasure createAdditiveMeasure() {
		AdditiveMeasureImpl additiveMeasure = new AdditiveMeasureImpl();
		return additiveMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseScope createCaseScope() {
		CaseScopeImpl caseScope = new CaseScopeImpl();
		return caseScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectScope createProjectScope() {
		ProjectScopeImpl projectScope = new ProjectScopeImpl();
		return projectScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeScope createChangeScope() {
		ChangeScopeImpl changeScope = new ChangeScopeImpl();
		return changeScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalDefectChangeOrderCount createCriticalDefectChangeOrderCount() {
		CriticalDefectChangeOrderCountImpl criticalDefectChangeOrderCount = new CriticalDefectChangeOrderCountImpl();
		return criticalDefectChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDefectChangeOrderCount createNormalDefectChangeOrderCount() {
		NormalDefectChangeOrderCountImpl normalDefectChangeOrderCount = new NormalDefectChangeOrderCountImpl();
		return normalDefectChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImprovementChangeOrderCount createImprovementChangeOrderCount() {
		ImprovementChangeOrderCountImpl improvementChangeOrderCount = new ImprovementChangeOrderCountImpl();
		return improvementChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFeatureChangeOrderCount createNewFeatureChangeOrderCount() {
		NewFeatureChangeOrderCountImpl newFeatureChangeOrderCount = new NewFeatureChangeOrderCountImpl();
		return newFeatureChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrendMeasure createTrendMeasure() {
		TrendMeasureImpl trendMeasure = new TrendMeasureImpl();
		return trendMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrapRatioMeasure createScrapRatioMeasure() {
		ScrapRatioMeasureImpl scrapRatioMeasure = new ScrapRatioMeasureImpl();
		return scrapRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularityMeasure createModularityMeasure() {
		ModularityMeasureImpl modularityMeasure = new ModularityMeasureImpl();
		return modularityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReworkRatioMeasure createReworkRatioMeasure() {
		ReworkRatioMeasureImpl reworkRatioMeasure = new ReworkRatioMeasureImpl();
		return reworkRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptabilityRatioMeasure createAdaptabilityRatioMeasure() {
		AdaptabilityRatioMeasureImpl adaptabilityRatioMeasure = new AdaptabilityRatioMeasureImpl();
		return adaptabilityRatioMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintainabilityMeasure createMaintainabilityMeasure() {
		MaintainabilityMeasureImpl maintainabilityMeasure = new MaintainabilityMeasureImpl();
		return maintainabilityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrokenCaseSizeMeasure createBrokenCaseSizeMeasure() {
		BrokenCaseSizeMeasureImpl brokenCaseSizeMeasure = new BrokenCaseSizeMeasureImpl();
		return brokenCaseSizeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCaseSizeMeasure createFixedCaseSizeMeasure() {
		FixedCaseSizeMeasureImpl fixedCaseSizeMeasure = new FixedCaseSizeMeasureImpl();
		return fixedCaseSizeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalCaseSizeMeasure createTotalCaseSizeMeasure() {
		TotalCaseSizeMeasureImpl totalCaseSizeMeasure = new TotalCaseSizeMeasureImpl();
		return totalCaseSizeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineCaseSizeMeasure createBaselineCaseSizeMeasure() {
		BaselineCaseSizeMeasureImpl baselineCaseSizeMeasure = new BaselineCaseSizeMeasureImpl();
		return baselineCaseSizeMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepairEffortMeasure createRepairEffortMeasure() {
		RepairEffortMeasureImpl repairEffortMeasure = new RepairEffortMeasureImpl();
		return repairEffortMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEffortMeasure createDevelopmentEffortMeasure() {
		DevelopmentEffortMeasureImpl developmentEffortMeasure = new DevelopmentEffortMeasureImpl();
		return developmentEffortMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalChangeOrderCount createTotalChangeOrderCount() {
		TotalChangeOrderCountImpl totalChangeOrderCount = new TotalChangeOrderCountImpl();
		return totalChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalAndNormalChangeOrderCount createCriticalAndNormalChangeOrderCount() {
		CriticalAndNormalChangeOrderCountImpl criticalAndNormalChangeOrderCount = new CriticalAndNormalChangeOrderCountImpl();
		return criticalAndNormalChangeOrderCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReworkStabilityMeasure createReworkStabilityMeasure() {
		ReworkStabilityMeasureImpl reworkStabilityMeasure = new ReworkStabilityMeasureImpl();
		return reworkStabilityMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReworkBacklogMeasure createReworkBacklogMeasure() {
		ReworkBacklogMeasureImpl reworkBacklogMeasure = new ReworkBacklogMeasureImpl();
		return reworkBacklogMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModularityTrend createModularityTrend() {
		ModularityTrendImpl modularityTrend = new ModularityTrendImpl();
		return modularityTrend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptabilityTrend createAdaptabilityTrend() {
		AdaptabilityTrendImpl adaptabilityTrend = new AdaptabilityTrendImpl();
		return adaptabilityTrend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaturityTrend createMaturityTrend() {
		MaturityTrendImpl maturityTrend = new MaturityTrendImpl();
		return maturityTrend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmPackage getSpmPackage() {
		return (SpmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpmPackage getPackage() {
		return SpmPackage.eINSTANCE;
	}

} //SpmFactoryImpl
