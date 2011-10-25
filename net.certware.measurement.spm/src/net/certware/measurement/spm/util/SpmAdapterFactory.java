/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.util;

import net.certware.measurement.smm.BinaryMeasure;
import net.certware.measurement.smm.Category;
import net.certware.measurement.smm.Characteristic;
import net.certware.measurement.smm.CollectiveMeasure;
import net.certware.measurement.smm.DimensionalMeasure;
import net.certware.measurement.smm.Measure;
import net.certware.measurement.smm.RatioMeasure;
import net.certware.measurement.smm.Scope;
import net.certware.measurement.smm.SmmElement;
import net.certware.measurement.smm.SmmModel;
import net.certware.measurement.smm.SmmRelationship;
import net.certware.measurement.spm.AdaptabilityRatioMeasure;
import net.certware.measurement.spm.AdaptabilityTrend;
import net.certware.measurement.spm.AdditiveMeasure;
import net.certware.measurement.spm.BaselineCaseSizeMeasure;
import net.certware.measurement.spm.BrokenCaseSizeMeasure;
import net.certware.measurement.spm.CaseDimensionalMeasure;
import net.certware.measurement.spm.CaseScope;
import net.certware.measurement.spm.ChangeOrderDimensionalMeasure;
import net.certware.measurement.spm.ChangeScope;
import net.certware.measurement.spm.CommitRelationship;
import net.certware.measurement.spm.CriticalAndNormalChangeOrderCount;
import net.certware.measurement.spm.CriticalDefectChangeOrderCount;
import net.certware.measurement.spm.DevelopmentEffortMeasure;
import net.certware.measurement.spm.EndProductQuality;
import net.certware.measurement.spm.EndProductQualityCategory;
import net.certware.measurement.spm.FixedCaseSizeMeasure;
import net.certware.measurement.spm.ImprovementChangeOrderCount;
import net.certware.measurement.spm.InProgressIndicator;
import net.certware.measurement.spm.InProgressQualityCategory;
import net.certware.measurement.spm.Maintainability;
import net.certware.measurement.spm.MaintainabilityMeasure;
import net.certware.measurement.spm.MaturityRatioMeasure;
import net.certware.measurement.spm.MaturityTrend;
import net.certware.measurement.spm.ModularityMeasure;
import net.certware.measurement.spm.ModularityTrend;
import net.certware.measurement.spm.NewFeatureChangeOrderCount;
import net.certware.measurement.spm.NormalDefectChangeOrderCount;
import net.certware.measurement.spm.ProjectCommit;
import net.certware.measurement.spm.ProjectModel;
import net.certware.measurement.spm.ProjectScope;
import net.certware.measurement.spm.ProjectSize;
import net.certware.measurement.spm.RepairEffortMeasure;
import net.certware.measurement.spm.ReworkBacklogMeasure;
import net.certware.measurement.spm.ReworkRatioMeasure;
import net.certware.measurement.spm.ReworkStabilityMeasure;
import net.certware.measurement.spm.ScrapRatioMeasure;
import net.certware.measurement.spm.SpmPackage;
import net.certware.measurement.spm.TimeDimensionalMeasure;
import net.certware.measurement.spm.TotalCaseSizeMeasure;
import net.certware.measurement.spm.TotalChangeOrderCount;
import net.certware.measurement.spm.TrendMeasure;
import net.certware.measurement.spm.UsageTimeMeasure;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.measurement.spm.SpmPackage
 * @generated
 */
public class SpmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpmSwitch<Adapter> modelSwitch =
		new SpmSwitch<Adapter>() {
			@Override
			public Adapter caseProjectModel(ProjectModel object) {
				return createProjectModelAdapter();
			}
			@Override
			public Adapter caseProjectCommit(ProjectCommit object) {
				return createProjectCommitAdapter();
			}
			@Override
			public Adapter caseCommitRelationship(CommitRelationship object) {
				return createCommitRelationshipAdapter();
			}
			@Override
			public Adapter caseEndProductQualityCategory(EndProductQualityCategory object) {
				return createEndProductQualityCategoryAdapter();
			}
			@Override
			public Adapter caseInProgressQualityCategory(InProgressQualityCategory object) {
				return createInProgressQualityCategoryAdapter();
			}
			@Override
			public Adapter caseEndProductQuality(EndProductQuality object) {
				return createEndProductQualityAdapter();
			}
			@Override
			public Adapter caseMaintainability(Maintainability object) {
				return createMaintainabilityAdapter();
			}
			@Override
			public Adapter caseInProgressIndicator(InProgressIndicator object) {
				return createInProgressIndicatorAdapter();
			}
			@Override
			public Adapter caseProjectSize(ProjectSize object) {
				return createProjectSizeAdapter();
			}
			@Override
			public Adapter caseCaseDimensionalMeasure(CaseDimensionalMeasure object) {
				return createCaseDimensionalMeasureAdapter();
			}
			@Override
			public Adapter caseChangeOrderDimensionalMeasure(ChangeOrderDimensionalMeasure object) {
				return createChangeOrderDimensionalMeasureAdapter();
			}
			@Override
			public Adapter caseTimeDimensionalMeasure(TimeDimensionalMeasure object) {
				return createTimeDimensionalMeasureAdapter();
			}
			@Override
			public Adapter caseAdditiveMeasure(AdditiveMeasure object) {
				return createAdditiveMeasureAdapter();
			}
			@Override
			public Adapter caseCaseScope(CaseScope object) {
				return createCaseScopeAdapter();
			}
			@Override
			public Adapter caseProjectScope(ProjectScope object) {
				return createProjectScopeAdapter();
			}
			@Override
			public Adapter caseChangeScope(ChangeScope object) {
				return createChangeScopeAdapter();
			}
			@Override
			public Adapter caseCriticalDefectChangeOrderCount(CriticalDefectChangeOrderCount object) {
				return createCriticalDefectChangeOrderCountAdapter();
			}
			@Override
			public Adapter caseNormalDefectChangeOrderCount(NormalDefectChangeOrderCount object) {
				return createNormalDefectChangeOrderCountAdapter();
			}
			@Override
			public Adapter caseImprovementChangeOrderCount(ImprovementChangeOrderCount object) {
				return createImprovementChangeOrderCountAdapter();
			}
			@Override
			public Adapter caseNewFeatureChangeOrderCount(NewFeatureChangeOrderCount object) {
				return createNewFeatureChangeOrderCountAdapter();
			}
			@Override
			public Adapter caseTrendMeasure(TrendMeasure object) {
				return createTrendMeasureAdapter();
			}
			@Override
			public Adapter caseScrapRatioMeasure(ScrapRatioMeasure object) {
				return createScrapRatioMeasureAdapter();
			}
			@Override
			public Adapter caseModularityMeasure(ModularityMeasure object) {
				return createModularityMeasureAdapter();
			}
			@Override
			public Adapter caseReworkRatioMeasure(ReworkRatioMeasure object) {
				return createReworkRatioMeasureAdapter();
			}
			@Override
			public Adapter caseAdaptabilityRatioMeasure(AdaptabilityRatioMeasure object) {
				return createAdaptabilityRatioMeasureAdapter();
			}
			@Override
			public Adapter caseMaturityRatioMeasure(MaturityRatioMeasure object) {
				return createMaturityRatioMeasureAdapter();
			}
			@Override
			public Adapter caseMaintainabilityMeasure(MaintainabilityMeasure object) {
				return createMaintainabilityMeasureAdapter();
			}
			@Override
			public Adapter caseBrokenCaseSizeMeasure(BrokenCaseSizeMeasure object) {
				return createBrokenCaseSizeMeasureAdapter();
			}
			@Override
			public Adapter caseFixedCaseSizeMeasure(FixedCaseSizeMeasure object) {
				return createFixedCaseSizeMeasureAdapter();
			}
			@Override
			public Adapter caseTotalCaseSizeMeasure(TotalCaseSizeMeasure object) {
				return createTotalCaseSizeMeasureAdapter();
			}
			@Override
			public Adapter caseBaselineCaseSizeMeasure(BaselineCaseSizeMeasure object) {
				return createBaselineCaseSizeMeasureAdapter();
			}
			@Override
			public Adapter caseUsageTimeMeasure(UsageTimeMeasure object) {
				return createUsageTimeMeasureAdapter();
			}
			@Override
			public Adapter caseRepairEffortMeasure(RepairEffortMeasure object) {
				return createRepairEffortMeasureAdapter();
			}
			@Override
			public Adapter caseDevelopmentEffortMeasure(DevelopmentEffortMeasure object) {
				return createDevelopmentEffortMeasureAdapter();
			}
			@Override
			public Adapter caseTotalChangeOrderCount(TotalChangeOrderCount object) {
				return createTotalChangeOrderCountAdapter();
			}
			@Override
			public Adapter caseCriticalAndNormalChangeOrderCount(CriticalAndNormalChangeOrderCount object) {
				return createCriticalAndNormalChangeOrderCountAdapter();
			}
			@Override
			public Adapter caseReworkStabilityMeasure(ReworkStabilityMeasure object) {
				return createReworkStabilityMeasureAdapter();
			}
			@Override
			public Adapter caseReworkBacklogMeasure(ReworkBacklogMeasure object) {
				return createReworkBacklogMeasureAdapter();
			}
			@Override
			public Adapter caseModularityTrend(ModularityTrend object) {
				return createModularityTrendAdapter();
			}
			@Override
			public Adapter caseAdaptabilityTrend(AdaptabilityTrend object) {
				return createAdaptabilityTrendAdapter();
			}
			@Override
			public Adapter caseMaturityTrend(MaturityTrend object) {
				return createMaturityTrendAdapter();
			}
			@Override
			public Adapter caseSmmElement(SmmElement object) {
				return createSmmElementAdapter();
			}
			@Override
			public Adapter caseSmmModel(SmmModel object) {
				return createSmmModelAdapter();
			}
			@Override
			public Adapter caseSmmRelationship(SmmRelationship object) {
				return createSmmRelationshipAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseCharacteristic(Characteristic object) {
				return createCharacteristicAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseDimensionalMeasure(DimensionalMeasure object) {
				return createDimensionalMeasureAdapter();
			}
			@Override
			public Adapter caseCollectiveMeasure(CollectiveMeasure object) {
				return createCollectiveMeasureAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseBinaryMeasure(BinaryMeasure object) {
				return createBinaryMeasureAdapter();
			}
			@Override
			public Adapter caseRatioMeasure(RatioMeasure object) {
				return createRatioMeasureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ProjectModel <em>Project Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ProjectModel
	 * @generated
	 */
	public Adapter createProjectModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ProjectCommit <em>Project Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ProjectCommit
	 * @generated
	 */
	public Adapter createProjectCommitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.CommitRelationship <em>Commit Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.CommitRelationship
	 * @generated
	 */
	public Adapter createCommitRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.EndProductQualityCategory <em>End Product Quality Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.EndProductQualityCategory
	 * @generated
	 */
	public Adapter createEndProductQualityCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.InProgressQualityCategory <em>In Progress Quality Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.InProgressQualityCategory
	 * @generated
	 */
	public Adapter createInProgressQualityCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.EndProductQuality <em>End Product Quality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.EndProductQuality
	 * @generated
	 */
	public Adapter createEndProductQualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.Maintainability <em>Maintainability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.Maintainability
	 * @generated
	 */
	public Adapter createMaintainabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.InProgressIndicator <em>In Progress Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.InProgressIndicator
	 * @generated
	 */
	public Adapter createInProgressIndicatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ProjectSize <em>Project Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ProjectSize
	 * @generated
	 */
	public Adapter createProjectSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.CaseDimensionalMeasure <em>Case Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.CaseDimensionalMeasure
	 * @generated
	 */
	public Adapter createCaseDimensionalMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ChangeOrderDimensionalMeasure <em>Change Order Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ChangeOrderDimensionalMeasure
	 * @generated
	 */
	public Adapter createChangeOrderDimensionalMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.TimeDimensionalMeasure <em>Time Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.TimeDimensionalMeasure
	 * @generated
	 */
	public Adapter createTimeDimensionalMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.AdditiveMeasure <em>Additive Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.AdditiveMeasure
	 * @generated
	 */
	public Adapter createAdditiveMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.CaseScope <em>Case Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.CaseScope
	 * @generated
	 */
	public Adapter createCaseScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ProjectScope <em>Project Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ProjectScope
	 * @generated
	 */
	public Adapter createProjectScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ChangeScope <em>Change Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ChangeScope
	 * @generated
	 */
	public Adapter createChangeScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.CriticalDefectChangeOrderCount <em>Critical Defect Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.CriticalDefectChangeOrderCount
	 * @generated
	 */
	public Adapter createCriticalDefectChangeOrderCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.NormalDefectChangeOrderCount <em>Normal Defect Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.NormalDefectChangeOrderCount
	 * @generated
	 */
	public Adapter createNormalDefectChangeOrderCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ImprovementChangeOrderCount <em>Improvement Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ImprovementChangeOrderCount
	 * @generated
	 */
	public Adapter createImprovementChangeOrderCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.NewFeatureChangeOrderCount <em>New Feature Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.NewFeatureChangeOrderCount
	 * @generated
	 */
	public Adapter createNewFeatureChangeOrderCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.TrendMeasure <em>Trend Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.TrendMeasure
	 * @generated
	 */
	public Adapter createTrendMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ScrapRatioMeasure <em>Scrap Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ScrapRatioMeasure
	 * @generated
	 */
	public Adapter createScrapRatioMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ModularityMeasure <em>Modularity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ModularityMeasure
	 * @generated
	 */
	public Adapter createModularityMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ReworkRatioMeasure <em>Rework Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ReworkRatioMeasure
	 * @generated
	 */
	public Adapter createReworkRatioMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.AdaptabilityRatioMeasure <em>Adaptability Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.AdaptabilityRatioMeasure
	 * @generated
	 */
	public Adapter createAdaptabilityRatioMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.MaturityRatioMeasure <em>Maturity Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.MaturityRatioMeasure
	 * @generated
	 */
	public Adapter createMaturityRatioMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.MaintainabilityMeasure <em>Maintainability Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.MaintainabilityMeasure
	 * @generated
	 */
	public Adapter createMaintainabilityMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.BrokenCaseSizeMeasure <em>Broken Case Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.BrokenCaseSizeMeasure
	 * @generated
	 */
	public Adapter createBrokenCaseSizeMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.FixedCaseSizeMeasure <em>Fixed Case Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.FixedCaseSizeMeasure
	 * @generated
	 */
	public Adapter createFixedCaseSizeMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.TotalCaseSizeMeasure <em>Total Case Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.TotalCaseSizeMeasure
	 * @generated
	 */
	public Adapter createTotalCaseSizeMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.BaselineCaseSizeMeasure <em>Baseline Case Size Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.BaselineCaseSizeMeasure
	 * @generated
	 */
	public Adapter createBaselineCaseSizeMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.UsageTimeMeasure <em>Usage Time Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.UsageTimeMeasure
	 * @generated
	 */
	public Adapter createUsageTimeMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.RepairEffortMeasure <em>Repair Effort Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.RepairEffortMeasure
	 * @generated
	 */
	public Adapter createRepairEffortMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.DevelopmentEffortMeasure <em>Development Effort Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.DevelopmentEffortMeasure
	 * @generated
	 */
	public Adapter createDevelopmentEffortMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.TotalChangeOrderCount <em>Total Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.TotalChangeOrderCount
	 * @generated
	 */
	public Adapter createTotalChangeOrderCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.CriticalAndNormalChangeOrderCount <em>Critical And Normal Change Order Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.CriticalAndNormalChangeOrderCount
	 * @generated
	 */
	public Adapter createCriticalAndNormalChangeOrderCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ReworkStabilityMeasure <em>Rework Stability Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ReworkStabilityMeasure
	 * @generated
	 */
	public Adapter createReworkStabilityMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ReworkBacklogMeasure <em>Rework Backlog Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ReworkBacklogMeasure
	 * @generated
	 */
	public Adapter createReworkBacklogMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.ModularityTrend <em>Modularity Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.ModularityTrend
	 * @generated
	 */
	public Adapter createModularityTrendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.AdaptabilityTrend <em>Adaptability Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.AdaptabilityTrend
	 * @generated
	 */
	public Adapter createAdaptabilityTrendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.spm.MaturityTrend <em>Maturity Trend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.spm.MaturityTrend
	 * @generated
	 */
	public Adapter createMaturityTrendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.SmmElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.SmmElement
	 * @generated
	 */
	public Adapter createSmmElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.SmmModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.SmmModel
	 * @generated
	 */
	public Adapter createSmmModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.SmmRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.SmmRelationship
	 * @generated
	 */
	public Adapter createSmmRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Characteristic
	 * @generated
	 */
	public Adapter createCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.DimensionalMeasure <em>Dimensional Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.DimensionalMeasure
	 * @generated
	 */
	public Adapter createDimensionalMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.CollectiveMeasure <em>Collective Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.CollectiveMeasure
	 * @generated
	 */
	public Adapter createCollectiveMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.BinaryMeasure <em>Binary Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.BinaryMeasure
	 * @generated
	 */
	public Adapter createBinaryMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.certware.measurement.smm.RatioMeasure <em>Ratio Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.certware.measurement.smm.RatioMeasure
	 * @generated
	 */
	public Adapter createRatioMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpmAdapterFactory
