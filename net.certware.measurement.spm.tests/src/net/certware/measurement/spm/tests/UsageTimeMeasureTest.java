/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.textui.TestRunner;
import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.UsageTimeMeasure;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Usage Time Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsageTimeMeasureTest extends TimeDimensionalMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UsageTimeMeasureTest.class);
	}

	/**
	 * Constructs a new Usage Time Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageTimeMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Usage Time Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UsageTimeMeasure getFixture() {
		return (UsageTimeMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createUsageTimeMeasure());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UsageTimeMeasureTest
