/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>spm</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpmTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new SpmTests("spm Tests"); //$NON-NLS-1$
		suite.addTestSuite(ProjectModelTest.class);
		suite.addTestSuite(ProjectCommitTest.class);
		suite.addTestSuite(CommitRelationshipTest.class);
		suite.addTestSuite(EndProductQualityCategoryTest.class);
		suite.addTestSuite(InProgressQualityCategoryTest.class);
		suite.addTestSuite(EndProductQualityTest.class);
		suite.addTestSuite(MaintainabilityTest.class);
		suite.addTestSuite(InProgressIndicatorTest.class);
		suite.addTestSuite(ProjectSizeTest.class);
		suite.addTestSuite(CaseDimensionalMeasureTest.class);
		suite.addTestSuite(ChangeOrderDimensionalMeasureTest.class);
		suite.addTestSuite(TimeDimensionalMeasureTest.class);
		suite.addTestSuite(AdditiveMeasureTest.class);
		suite.addTestSuite(CaseScopeTest.class);
		suite.addTestSuite(ProjectScopeTest.class);
		suite.addTestSuite(ChangeScopeTest.class);
		suite.addTestSuite(CriticalDefectChangeOrderCountTest.class);
		suite.addTestSuite(NormalDefectChangeOrderCountTest.class);
		suite.addTestSuite(ImprovementChangeOrderCountTest.class);
		suite.addTestSuite(NewFeatureChangeOrderCountTest.class);
		suite.addTestSuite(TrendMeasureTest.class);
		suite.addTestSuite(ScrapRatioMeasureTest.class);
		suite.addTestSuite(ModularityMeasureTest.class);
		suite.addTestSuite(ReworkRatioMeasureTest.class);
		suite.addTestSuite(AdaptabilityRatioMeasureTest.class);
		suite.addTestSuite(MaturityRatioMeasureTest.class);
		suite.addTestSuite(MaintainabilityMeasureTest.class);
		suite.addTestSuite(BrokenCaseSizeMeasureTest.class);
		suite.addTestSuite(FixedCaseSizeMeasureTest.class);
		suite.addTestSuite(TotalCaseSizeMeasureTest.class);
		suite.addTestSuite(BaselineCaseSizeMeasureTest.class);
		suite.addTestSuite(UsageTimeMeasureTest.class);
		suite.addTestSuite(RepairEffortMeasureTest.class);
		suite.addTestSuite(DevelopmentEffortMeasureTest.class);
		suite.addTestSuite(TotalChangeOrderCountTest.class);
		suite.addTestSuite(CriticalAndNormalChangeOrderCountTest.class);
		suite.addTestSuite(ReworkStabilityMeasureTest.class);
		suite.addTestSuite(ReworkBacklogMeasureTest.class);
		suite.addTestSuite(ModularityTrendTest.class);
		suite.addTestSuite(AdaptabilityTrendTest.class);
		suite.addTestSuite(MaturityTrendTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpmTests(String name) {
		super(name);
	}

} //SpmTests
