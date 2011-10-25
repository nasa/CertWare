/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.util;

import java.util.List;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.certware.measurement.spm.SpmPackage
 * @generated
 */
public class SpmSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmSwitch() {
		if (modelPackage == null) {
			modelPackage = SpmPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SpmPackage.PROJECT_MODEL: {
				ProjectModel projectModel = (ProjectModel)theEObject;
				T result = caseProjectModel(projectModel);
				if (result == null) result = caseSmmModel(projectModel);
				if (result == null) result = caseSmmElement(projectModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.PROJECT_COMMIT: {
				ProjectCommit projectCommit = (ProjectCommit)theEObject;
				T result = caseProjectCommit(projectCommit);
				if (result == null) result = caseSmmModel(projectCommit);
				if (result == null) result = caseSmmElement(projectCommit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.COMMIT_RELATIONSHIP: {
				CommitRelationship commitRelationship = (CommitRelationship)theEObject;
				T result = caseCommitRelationship(commitRelationship);
				if (result == null) result = caseSmmRelationship(commitRelationship);
				if (result == null) result = caseSmmElement(commitRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.END_PRODUCT_QUALITY_CATEGORY: {
				EndProductQualityCategory endProductQualityCategory = (EndProductQualityCategory)theEObject;
				T result = caseEndProductQualityCategory(endProductQualityCategory);
				if (result == null) result = caseCategory(endProductQualityCategory);
				if (result == null) result = caseSmmElement(endProductQualityCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.IN_PROGRESS_QUALITY_CATEGORY: {
				InProgressQualityCategory inProgressQualityCategory = (InProgressQualityCategory)theEObject;
				T result = caseInProgressQualityCategory(inProgressQualityCategory);
				if (result == null) result = caseCategory(inProgressQualityCategory);
				if (result == null) result = caseSmmElement(inProgressQualityCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.END_PRODUCT_QUALITY: {
				EndProductQuality endProductQuality = (EndProductQuality)theEObject;
				T result = caseEndProductQuality(endProductQuality);
				if (result == null) result = caseCharacteristic(endProductQuality);
				if (result == null) result = caseSmmElement(endProductQuality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.MAINTAINABILITY: {
				Maintainability maintainability = (Maintainability)theEObject;
				T result = caseMaintainability(maintainability);
				if (result == null) result = caseCharacteristic(maintainability);
				if (result == null) result = caseSmmElement(maintainability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.IN_PROGRESS_INDICATOR: {
				InProgressIndicator inProgressIndicator = (InProgressIndicator)theEObject;
				T result = caseInProgressIndicator(inProgressIndicator);
				if (result == null) result = caseCharacteristic(inProgressIndicator);
				if (result == null) result = caseSmmElement(inProgressIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.PROJECT_SIZE: {
				ProjectSize projectSize = (ProjectSize)theEObject;
				T result = caseProjectSize(projectSize);
				if (result == null) result = caseCharacteristic(projectSize);
				if (result == null) result = caseSmmElement(projectSize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.CASE_DIMENSIONAL_MEASURE: {
				CaseDimensionalMeasure caseDimensionalMeasure = (CaseDimensionalMeasure)theEObject;
				T result = caseCaseDimensionalMeasure(caseDimensionalMeasure);
				if (result == null) result = caseDimensionalMeasure(caseDimensionalMeasure);
				if (result == null) result = caseMeasure(caseDimensionalMeasure);
				if (result == null) result = caseSmmElement(caseDimensionalMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.CHANGE_ORDER_DIMENSIONAL_MEASURE: {
				ChangeOrderDimensionalMeasure changeOrderDimensionalMeasure = (ChangeOrderDimensionalMeasure)theEObject;
				T result = caseChangeOrderDimensionalMeasure(changeOrderDimensionalMeasure);
				if (result == null) result = caseDimensionalMeasure(changeOrderDimensionalMeasure);
				if (result == null) result = caseMeasure(changeOrderDimensionalMeasure);
				if (result == null) result = caseSmmElement(changeOrderDimensionalMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.TIME_DIMENSIONAL_MEASURE: {
				TimeDimensionalMeasure timeDimensionalMeasure = (TimeDimensionalMeasure)theEObject;
				T result = caseTimeDimensionalMeasure(timeDimensionalMeasure);
				if (result == null) result = caseDimensionalMeasure(timeDimensionalMeasure);
				if (result == null) result = caseMeasure(timeDimensionalMeasure);
				if (result == null) result = caseSmmElement(timeDimensionalMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.ADDITIVE_MEASURE: {
				AdditiveMeasure additiveMeasure = (AdditiveMeasure)theEObject;
				T result = caseAdditiveMeasure(additiveMeasure);
				if (result == null) result = caseCollectiveMeasure(additiveMeasure);
				if (result == null) result = caseDimensionalMeasure(additiveMeasure);
				if (result == null) result = caseMeasure(additiveMeasure);
				if (result == null) result = caseSmmElement(additiveMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.CASE_SCOPE: {
				CaseScope caseScope = (CaseScope)theEObject;
				T result = caseCaseScope(caseScope);
				if (result == null) result = caseScope(caseScope);
				if (result == null) result = caseSmmElement(caseScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.PROJECT_SCOPE: {
				ProjectScope projectScope = (ProjectScope)theEObject;
				T result = caseProjectScope(projectScope);
				if (result == null) result = caseScope(projectScope);
				if (result == null) result = caseSmmElement(projectScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.CHANGE_SCOPE: {
				ChangeScope changeScope = (ChangeScope)theEObject;
				T result = caseChangeScope(changeScope);
				if (result == null) result = caseScope(changeScope);
				if (result == null) result = caseSmmElement(changeScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.CRITICAL_DEFECT_CHANGE_ORDER_COUNT: {
				CriticalDefectChangeOrderCount criticalDefectChangeOrderCount = (CriticalDefectChangeOrderCount)theEObject;
				T result = caseCriticalDefectChangeOrderCount(criticalDefectChangeOrderCount);
				if (result == null) result = caseAdditiveMeasure(criticalDefectChangeOrderCount);
				if (result == null) result = caseCollectiveMeasure(criticalDefectChangeOrderCount);
				if (result == null) result = caseDimensionalMeasure(criticalDefectChangeOrderCount);
				if (result == null) result = caseMeasure(criticalDefectChangeOrderCount);
				if (result == null) result = caseSmmElement(criticalDefectChangeOrderCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.NORMAL_DEFECT_CHANGE_ORDER_COUNT: {
				NormalDefectChangeOrderCount normalDefectChangeOrderCount = (NormalDefectChangeOrderCount)theEObject;
				T result = caseNormalDefectChangeOrderCount(normalDefectChangeOrderCount);
				if (result == null) result = caseAdditiveMeasure(normalDefectChangeOrderCount);
				if (result == null) result = caseCollectiveMeasure(normalDefectChangeOrderCount);
				if (result == null) result = caseDimensionalMeasure(normalDefectChangeOrderCount);
				if (result == null) result = caseMeasure(normalDefectChangeOrderCount);
				if (result == null) result = caseSmmElement(normalDefectChangeOrderCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.IMPROVEMENT_CHANGE_ORDER_COUNT: {
				ImprovementChangeOrderCount improvementChangeOrderCount = (ImprovementChangeOrderCount)theEObject;
				T result = caseImprovementChangeOrderCount(improvementChangeOrderCount);
				if (result == null) result = caseAdditiveMeasure(improvementChangeOrderCount);
				if (result == null) result = caseCollectiveMeasure(improvementChangeOrderCount);
				if (result == null) result = caseDimensionalMeasure(improvementChangeOrderCount);
				if (result == null) result = caseMeasure(improvementChangeOrderCount);
				if (result == null) result = caseSmmElement(improvementChangeOrderCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.NEW_FEATURE_CHANGE_ORDER_COUNT: {
				NewFeatureChangeOrderCount newFeatureChangeOrderCount = (NewFeatureChangeOrderCount)theEObject;
				T result = caseNewFeatureChangeOrderCount(newFeatureChangeOrderCount);
				if (result == null) result = caseAdditiveMeasure(newFeatureChangeOrderCount);
				if (result == null) result = caseCollectiveMeasure(newFeatureChangeOrderCount);
				if (result == null) result = caseDimensionalMeasure(newFeatureChangeOrderCount);
				if (result == null) result = caseMeasure(newFeatureChangeOrderCount);
				if (result == null) result = caseSmmElement(newFeatureChangeOrderCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.TREND_MEASURE: {
				TrendMeasure trendMeasure = (TrendMeasure)theEObject;
				T result = caseTrendMeasure(trendMeasure);
				if (result == null) result = caseCollectiveMeasure(trendMeasure);
				if (result == null) result = caseDimensionalMeasure(trendMeasure);
				if (result == null) result = caseMeasure(trendMeasure);
				if (result == null) result = caseSmmElement(trendMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.SCRAP_RATIO_MEASURE: {
				ScrapRatioMeasure scrapRatioMeasure = (ScrapRatioMeasure)theEObject;
				T result = caseScrapRatioMeasure(scrapRatioMeasure);
				if (result == null) result = caseRatioMeasure(scrapRatioMeasure);
				if (result == null) result = caseBinaryMeasure(scrapRatioMeasure);
				if (result == null) result = caseDimensionalMeasure(scrapRatioMeasure);
				if (result == null) result = caseMeasure(scrapRatioMeasure);
				if (result == null) result = caseSmmElement(scrapRatioMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.MODULARITY_MEASURE: {
				ModularityMeasure modularityMeasure = (ModularityMeasure)theEObject;
				T result = caseModularityMeasure(modularityMeasure);
				if (result == null) result = caseRatioMeasure(modularityMeasure);
				if (result == null) result = caseBinaryMeasure(modularityMeasure);
				if (result == null) result = caseDimensionalMeasure(modularityMeasure);
				if (result == null) result = caseMeasure(modularityMeasure);
				if (result == null) result = caseSmmElement(modularityMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.REWORK_RATIO_MEASURE: {
				ReworkRatioMeasure reworkRatioMeasure = (ReworkRatioMeasure)theEObject;
				T result = caseReworkRatioMeasure(reworkRatioMeasure);
				if (result == null) result = caseRatioMeasure(reworkRatioMeasure);
				if (result == null) result = caseBinaryMeasure(reworkRatioMeasure);
				if (result == null) result = caseDimensionalMeasure(reworkRatioMeasure);
				if (result == null) result = caseMeasure(reworkRatioMeasure);
				if (result == null) result = caseSmmElement(reworkRatioMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.ADAPTABILITY_RATIO_MEASURE: {
				AdaptabilityRatioMeasure adaptabilityRatioMeasure = (AdaptabilityRatioMeasure)theEObject;
				T result = caseAdaptabilityRatioMeasure(adaptabilityRatioMeasure);
				if (result == null) result = caseRatioMeasure(adaptabilityRatioMeasure);
				if (result == null) result = caseBinaryMeasure(adaptabilityRatioMeasure);
				if (result == null) result = caseDimensionalMeasure(adaptabilityRatioMeasure);
				if (result == null) result = caseMeasure(adaptabilityRatioMeasure);
				if (result == null) result = caseSmmElement(adaptabilityRatioMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.MATURITY_RATIO_MEASURE: {
				MaturityRatioMeasure maturityRatioMeasure = (MaturityRatioMeasure)theEObject;
				T result = caseMaturityRatioMeasure(maturityRatioMeasure);
				if (result == null) result = caseRatioMeasure(maturityRatioMeasure);
				if (result == null) result = caseBinaryMeasure(maturityRatioMeasure);
				if (result == null) result = caseDimensionalMeasure(maturityRatioMeasure);
				if (result == null) result = caseMeasure(maturityRatioMeasure);
				if (result == null) result = caseSmmElement(maturityRatioMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.MAINTAINABILITY_MEASURE: {
				MaintainabilityMeasure maintainabilityMeasure = (MaintainabilityMeasure)theEObject;
				T result = caseMaintainabilityMeasure(maintainabilityMeasure);
				if (result == null) result = caseRatioMeasure(maintainabilityMeasure);
				if (result == null) result = caseBinaryMeasure(maintainabilityMeasure);
				if (result == null) result = caseDimensionalMeasure(maintainabilityMeasure);
				if (result == null) result = caseMeasure(maintainabilityMeasure);
				if (result == null) result = caseSmmElement(maintainabilityMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.BROKEN_CASE_SIZE_MEASURE: {
				BrokenCaseSizeMeasure brokenCaseSizeMeasure = (BrokenCaseSizeMeasure)theEObject;
				T result = caseBrokenCaseSizeMeasure(brokenCaseSizeMeasure);
				if (result == null) result = caseAdditiveMeasure(brokenCaseSizeMeasure);
				if (result == null) result = caseCollectiveMeasure(brokenCaseSizeMeasure);
				if (result == null) result = caseDimensionalMeasure(brokenCaseSizeMeasure);
				if (result == null) result = caseMeasure(brokenCaseSizeMeasure);
				if (result == null) result = caseSmmElement(brokenCaseSizeMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.FIXED_CASE_SIZE_MEASURE: {
				FixedCaseSizeMeasure fixedCaseSizeMeasure = (FixedCaseSizeMeasure)theEObject;
				T result = caseFixedCaseSizeMeasure(fixedCaseSizeMeasure);
				if (result == null) result = caseAdditiveMeasure(fixedCaseSizeMeasure);
				if (result == null) result = caseCollectiveMeasure(fixedCaseSizeMeasure);
				if (result == null) result = caseDimensionalMeasure(fixedCaseSizeMeasure);
				if (result == null) result = caseMeasure(fixedCaseSizeMeasure);
				if (result == null) result = caseSmmElement(fixedCaseSizeMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.TOTAL_CASE_SIZE_MEASURE: {
				TotalCaseSizeMeasure totalCaseSizeMeasure = (TotalCaseSizeMeasure)theEObject;
				T result = caseTotalCaseSizeMeasure(totalCaseSizeMeasure);
				if (result == null) result = caseAdditiveMeasure(totalCaseSizeMeasure);
				if (result == null) result = caseCollectiveMeasure(totalCaseSizeMeasure);
				if (result == null) result = caseDimensionalMeasure(totalCaseSizeMeasure);
				if (result == null) result = caseMeasure(totalCaseSizeMeasure);
				if (result == null) result = caseSmmElement(totalCaseSizeMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.BASELINE_CASE_SIZE_MEASURE: {
				BaselineCaseSizeMeasure baselineCaseSizeMeasure = (BaselineCaseSizeMeasure)theEObject;
				T result = caseBaselineCaseSizeMeasure(baselineCaseSizeMeasure);
				if (result == null) result = caseAdditiveMeasure(baselineCaseSizeMeasure);
				if (result == null) result = caseCollectiveMeasure(baselineCaseSizeMeasure);
				if (result == null) result = caseDimensionalMeasure(baselineCaseSizeMeasure);
				if (result == null) result = caseMeasure(baselineCaseSizeMeasure);
				if (result == null) result = caseSmmElement(baselineCaseSizeMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.USAGE_TIME_MEASURE: {
				UsageTimeMeasure usageTimeMeasure = (UsageTimeMeasure)theEObject;
				T result = caseUsageTimeMeasure(usageTimeMeasure);
				if (result == null) result = caseTimeDimensionalMeasure(usageTimeMeasure);
				if (result == null) result = caseDimensionalMeasure(usageTimeMeasure);
				if (result == null) result = caseMeasure(usageTimeMeasure);
				if (result == null) result = caseSmmElement(usageTimeMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.REPAIR_EFFORT_MEASURE: {
				RepairEffortMeasure repairEffortMeasure = (RepairEffortMeasure)theEObject;
				T result = caseRepairEffortMeasure(repairEffortMeasure);
				if (result == null) result = caseAdditiveMeasure(repairEffortMeasure);
				if (result == null) result = caseCollectiveMeasure(repairEffortMeasure);
				if (result == null) result = caseDimensionalMeasure(repairEffortMeasure);
				if (result == null) result = caseMeasure(repairEffortMeasure);
				if (result == null) result = caseSmmElement(repairEffortMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.DEVELOPMENT_EFFORT_MEASURE: {
				DevelopmentEffortMeasure developmentEffortMeasure = (DevelopmentEffortMeasure)theEObject;
				T result = caseDevelopmentEffortMeasure(developmentEffortMeasure);
				if (result == null) result = caseAdditiveMeasure(developmentEffortMeasure);
				if (result == null) result = caseCollectiveMeasure(developmentEffortMeasure);
				if (result == null) result = caseDimensionalMeasure(developmentEffortMeasure);
				if (result == null) result = caseMeasure(developmentEffortMeasure);
				if (result == null) result = caseSmmElement(developmentEffortMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.TOTAL_CHANGE_ORDER_COUNT: {
				TotalChangeOrderCount totalChangeOrderCount = (TotalChangeOrderCount)theEObject;
				T result = caseTotalChangeOrderCount(totalChangeOrderCount);
				if (result == null) result = caseAdditiveMeasure(totalChangeOrderCount);
				if (result == null) result = caseCollectiveMeasure(totalChangeOrderCount);
				if (result == null) result = caseDimensionalMeasure(totalChangeOrderCount);
				if (result == null) result = caseMeasure(totalChangeOrderCount);
				if (result == null) result = caseSmmElement(totalChangeOrderCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.CRITICAL_AND_NORMAL_CHANGE_ORDER_COUNT: {
				CriticalAndNormalChangeOrderCount criticalAndNormalChangeOrderCount = (CriticalAndNormalChangeOrderCount)theEObject;
				T result = caseCriticalAndNormalChangeOrderCount(criticalAndNormalChangeOrderCount);
				if (result == null) result = caseBinaryMeasure(criticalAndNormalChangeOrderCount);
				if (result == null) result = caseDimensionalMeasure(criticalAndNormalChangeOrderCount);
				if (result == null) result = caseMeasure(criticalAndNormalChangeOrderCount);
				if (result == null) result = caseSmmElement(criticalAndNormalChangeOrderCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.REWORK_STABILITY_MEASURE: {
				ReworkStabilityMeasure reworkStabilityMeasure = (ReworkStabilityMeasure)theEObject;
				T result = caseReworkStabilityMeasure(reworkStabilityMeasure);
				if (result == null) result = caseBinaryMeasure(reworkStabilityMeasure);
				if (result == null) result = caseDimensionalMeasure(reworkStabilityMeasure);
				if (result == null) result = caseMeasure(reworkStabilityMeasure);
				if (result == null) result = caseSmmElement(reworkStabilityMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.REWORK_BACKLOG_MEASURE: {
				ReworkBacklogMeasure reworkBacklogMeasure = (ReworkBacklogMeasure)theEObject;
				T result = caseReworkBacklogMeasure(reworkBacklogMeasure);
				if (result == null) result = caseRatioMeasure(reworkBacklogMeasure);
				if (result == null) result = caseBinaryMeasure(reworkBacklogMeasure);
				if (result == null) result = caseDimensionalMeasure(reworkBacklogMeasure);
				if (result == null) result = caseMeasure(reworkBacklogMeasure);
				if (result == null) result = caseSmmElement(reworkBacklogMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.MODULARITY_TREND: {
				ModularityTrend modularityTrend = (ModularityTrend)theEObject;
				T result = caseModularityTrend(modularityTrend);
				if (result == null) result = caseTrendMeasure(modularityTrend);
				if (result == null) result = caseCollectiveMeasure(modularityTrend);
				if (result == null) result = caseDimensionalMeasure(modularityTrend);
				if (result == null) result = caseMeasure(modularityTrend);
				if (result == null) result = caseSmmElement(modularityTrend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.ADAPTABILITY_TREND: {
				AdaptabilityTrend adaptabilityTrend = (AdaptabilityTrend)theEObject;
				T result = caseAdaptabilityTrend(adaptabilityTrend);
				if (result == null) result = caseTrendMeasure(adaptabilityTrend);
				if (result == null) result = caseCollectiveMeasure(adaptabilityTrend);
				if (result == null) result = caseDimensionalMeasure(adaptabilityTrend);
				if (result == null) result = caseMeasure(adaptabilityTrend);
				if (result == null) result = caseSmmElement(adaptabilityTrend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpmPackage.MATURITY_TREND: {
				MaturityTrend maturityTrend = (MaturityTrend)theEObject;
				T result = caseMaturityTrend(maturityTrend);
				if (result == null) result = caseTrendMeasure(maturityTrend);
				if (result == null) result = caseCollectiveMeasure(maturityTrend);
				if (result == null) result = caseDimensionalMeasure(maturityTrend);
				if (result == null) result = caseMeasure(maturityTrend);
				if (result == null) result = caseSmmElement(maturityTrend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectModel(ProjectModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Commit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Commit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectCommit(ProjectCommit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commit Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commit Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitRelationship(CommitRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Product Quality Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Product Quality Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndProductQualityCategory(EndProductQualityCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Progress Quality Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Progress Quality Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInProgressQualityCategory(InProgressQualityCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Product Quality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Product Quality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndProductQuality(EndProductQuality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintainability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintainability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintainability(Maintainability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Progress Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Progress Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInProgressIndicator(InProgressIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectSize(ProjectSize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Dimensional Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseDimensionalMeasure(CaseDimensionalMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Order Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Order Dimensional Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeOrderDimensionalMeasure(ChangeOrderDimensionalMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Dimensional Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeDimensionalMeasure(TimeDimensionalMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditiveMeasure(AdditiveMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseScope(CaseScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectScope(ProjectScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeScope(ChangeScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Critical Defect Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Critical Defect Change Order Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriticalDefectChangeOrderCount(CriticalDefectChangeOrderCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Defect Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Defect Change Order Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalDefectChangeOrderCount(NormalDefectChangeOrderCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Improvement Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Improvement Change Order Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImprovementChangeOrderCount(ImprovementChangeOrderCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Feature Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Feature Change Order Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewFeatureChangeOrderCount(NewFeatureChangeOrderCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trend Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trend Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrendMeasure(TrendMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scrap Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scrap Ratio Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScrapRatioMeasure(ScrapRatioMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modularity Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modularity Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModularityMeasure(ModularityMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rework Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rework Ratio Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReworkRatioMeasure(ReworkRatioMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptability Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptability Ratio Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptabilityRatioMeasure(AdaptabilityRatioMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maturity Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maturity Ratio Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaturityRatioMeasure(MaturityRatioMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maintainability Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maintainability Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaintainabilityMeasure(MaintainabilityMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Broken Case Size Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Broken Case Size Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrokenCaseSizeMeasure(BrokenCaseSizeMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Case Size Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Case Size Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedCaseSizeMeasure(FixedCaseSizeMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Case Size Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Case Size Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalCaseSizeMeasure(TotalCaseSizeMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Baseline Case Size Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Baseline Case Size Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaselineCaseSizeMeasure(BaselineCaseSizeMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Time Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Time Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageTimeMeasure(UsageTimeMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repair Effort Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repair Effort Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepairEffortMeasure(RepairEffortMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Development Effort Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Development Effort Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevelopmentEffortMeasure(DevelopmentEffortMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Total Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Total Change Order Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTotalChangeOrderCount(TotalChangeOrderCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Critical And Normal Change Order Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Critical And Normal Change Order Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCriticalAndNormalChangeOrderCount(CriticalAndNormalChangeOrderCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rework Stability Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rework Stability Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReworkStabilityMeasure(ReworkStabilityMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rework Backlog Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rework Backlog Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReworkBacklogMeasure(ReworkBacklogMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modularity Trend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modularity Trend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModularityTrend(ModularityTrend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptability Trend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptability Trend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdaptabilityTrend(AdaptabilityTrend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maturity Trend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maturity Trend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaturityTrend(MaturityTrend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmmElement(SmmElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmmModel(SmmModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmmRelationship(SmmRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Characteristic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacteristic(Characteristic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasure(Measure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimensional Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimensional Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionalMeasure(DimensionalMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collective Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collective Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectiveMeasure(CollectiveMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryMeasure(BinaryMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratio Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratio Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatioMeasure(RatioMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //SpmSwitch
