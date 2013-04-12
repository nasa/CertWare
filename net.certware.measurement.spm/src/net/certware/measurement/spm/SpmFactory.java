/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.certware.measurement.spm.SpmPackage
 * @generated
 */
public interface SpmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpmFactory eINSTANCE = net.certware.measurement.spm.impl.SpmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Project Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Model</em>'.
	 * @generated
	 */
	ProjectModel createProjectModel();

	/**
	 * Returns a new object of class '<em>Project Commit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Commit</em>'.
	 * @generated
	 */
	ProjectCommit createProjectCommit();

	/**
	 * Returns a new object of class '<em>Commit Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commit Relationship</em>'.
	 * @generated
	 */
	CommitRelationship createCommitRelationship();

	/**
	 * Returns a new object of class '<em>End Product Quality Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Product Quality Category</em>'.
	 * @generated
	 */
	EndProductQualityCategory createEndProductQualityCategory();

	/**
	 * Returns a new object of class '<em>In Progress Quality Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Progress Quality Category</em>'.
	 * @generated
	 */
	InProgressQualityCategory createInProgressQualityCategory();

	/**
	 * Returns a new object of class '<em>End Product Quality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Product Quality</em>'.
	 * @generated
	 */
	EndProductQuality createEndProductQuality();

	/**
	 * Returns a new object of class '<em>Maintainability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintainability</em>'.
	 * @generated
	 */
	Maintainability createMaintainability();

	/**
	 * Returns a new object of class '<em>In Progress Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Progress Indicator</em>'.
	 * @generated
	 */
	InProgressIndicator createInProgressIndicator();

	/**
	 * Returns a new object of class '<em>Project Size</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Size</em>'.
	 * @generated
	 */
	ProjectSize createProjectSize();

	/**
	 * Returns a new object of class '<em>Case Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Dimensional Measure</em>'.
	 * @generated
	 */
	CaseDimensionalMeasure createCaseDimensionalMeasure();

	/**
	 * Returns a new object of class '<em>Change Order Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Order Dimensional Measure</em>'.
	 * @generated
	 */
	ChangeOrderDimensionalMeasure createChangeOrderDimensionalMeasure();

	/**
	 * Returns a new object of class '<em>Time Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Dimensional Measure</em>'.
	 * @generated
	 */
	TimeDimensionalMeasure createTimeDimensionalMeasure();

	/**
	 * Returns a new object of class '<em>Additive Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additive Measure</em>'.
	 * @generated
	 */
	AdditiveMeasure createAdditiveMeasure();

	/**
	 * Returns a new object of class '<em>Case Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Case Scope</em>'.
	 * @generated
	 */
	CaseScope createCaseScope();

	/**
	 * Returns a new object of class '<em>Project Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Scope</em>'.
	 * @generated
	 */
	ProjectScope createProjectScope();

	/**
	 * Returns a new object of class '<em>Change Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Scope</em>'.
	 * @generated
	 */
	ChangeScope createChangeScope();

	/**
	 * Returns a new object of class '<em>Critical Defect Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Critical Defect Change Order Count</em>'.
	 * @generated
	 */
	CriticalDefectChangeOrderCount createCriticalDefectChangeOrderCount();

	/**
	 * Returns a new object of class '<em>Normal Defect Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Defect Change Order Count</em>'.
	 * @generated
	 */
	NormalDefectChangeOrderCount createNormalDefectChangeOrderCount();

	/**
	 * Returns a new object of class '<em>Improvement Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Improvement Change Order Count</em>'.
	 * @generated
	 */
	ImprovementChangeOrderCount createImprovementChangeOrderCount();

	/**
	 * Returns a new object of class '<em>New Feature Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Feature Change Order Count</em>'.
	 * @generated
	 */
	NewFeatureChangeOrderCount createNewFeatureChangeOrderCount();

	/**
	 * Returns a new object of class '<em>Trend Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trend Measure</em>'.
	 * @generated
	 */
	TrendMeasure createTrendMeasure();

	/**
	 * Returns a new object of class '<em>Scrap Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scrap Ratio Measure</em>'.
	 * @generated
	 */
	ScrapRatioMeasure createScrapRatioMeasure();

	/**
	 * Returns a new object of class '<em>Modularity Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modularity Measure</em>'.
	 * @generated
	 */
	ModularityMeasure createModularityMeasure();

	/**
	 * Returns a new object of class '<em>Rework Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rework Ratio Measure</em>'.
	 * @generated
	 */
	ReworkRatioMeasure createReworkRatioMeasure();

	/**
	 * Returns a new object of class '<em>Adaptability Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptability Ratio Measure</em>'.
	 * @generated
	 */
	AdaptabilityRatioMeasure createAdaptabilityRatioMeasure();

	/**
	 * Returns a new object of class '<em>Maturity Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maturity Ratio Measure</em>'.
	 * @generated
	 */
	MaturityRatioMeasure createMaturityRatioMeasure();

	/**
	 * Returns a new object of class '<em>Maintainability Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maintainability Measure</em>'.
	 * @generated
	 */
	MaintainabilityMeasure createMaintainabilityMeasure();

	/**
	 * Returns a new object of class '<em>Broken Case Size Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Broken Case Size Measure</em>'.
	 * @generated
	 */
	BrokenCaseSizeMeasure createBrokenCaseSizeMeasure();

	/**
	 * Returns a new object of class '<em>Fixed Case Size Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Case Size Measure</em>'.
	 * @generated
	 */
	FixedCaseSizeMeasure createFixedCaseSizeMeasure();

	/**
	 * Returns a new object of class '<em>Total Case Size Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Total Case Size Measure</em>'.
	 * @generated
	 */
	TotalCaseSizeMeasure createTotalCaseSizeMeasure();

	/**
	 * Returns a new object of class '<em>Baseline Case Size Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Baseline Case Size Measure</em>'.
	 * @generated
	 */
	BaselineCaseSizeMeasure createBaselineCaseSizeMeasure();

	/**
	 * Returns a new object of class '<em>Usage Time Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Time Measure</em>'.
	 * @generated
	 */
	UsageTimeMeasure createUsageTimeMeasure();

	/**
	 * Returns a new object of class '<em>Repair Effort Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repair Effort Measure</em>'.
	 * @generated
	 */
	RepairEffortMeasure createRepairEffortMeasure();

	/**
	 * Returns a new object of class '<em>Development Effort Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Development Effort Measure</em>'.
	 * @generated
	 */
	DevelopmentEffortMeasure createDevelopmentEffortMeasure();

	/**
	 * Returns a new object of class '<em>Total Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Total Change Order Count</em>'.
	 * @generated
	 */
	TotalChangeOrderCount createTotalChangeOrderCount();

	/**
	 * Returns a new object of class '<em>Critical And Normal Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Critical And Normal Change Order Count</em>'.
	 * @generated
	 */
	CriticalAndNormalChangeOrderCount createCriticalAndNormalChangeOrderCount();

	/**
	 * Returns a new object of class '<em>Rework Stability Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rework Stability Measure</em>'.
	 * @generated
	 */
	ReworkStabilityMeasure createReworkStabilityMeasure();

	/**
	 * Returns a new object of class '<em>Rework Backlog Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rework Backlog Measure</em>'.
	 * @generated
	 */
	ReworkBacklogMeasure createReworkBacklogMeasure();

	/**
	 * Returns a new object of class '<em>Modularity Trend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modularity Trend</em>'.
	 * @generated
	 */
	ModularityTrend createModularityTrend();

	/**
	 * Returns a new object of class '<em>Adaptability Trend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptability Trend</em>'.
	 * @generated
	 */
	AdaptabilityTrend createAdaptabilityTrend();

	/**
	 * Returns a new object of class '<em>Maturity Trend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maturity Trend</em>'.
	 * @generated
	 */
	MaturityTrend createMaturityTrend();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpmPackage getSpmPackage();

} //SpmFactory
