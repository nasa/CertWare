/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.tests;

import junit.textui.TestRunner;
import net.certware.measurement.spm.DevelopmentEffortMeasure;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Development Effort Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DevelopmentEffortMeasureTest extends AdditiveMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DevelopmentEffortMeasureTest.class);
	}

	/**
	 * Constructs a new Development Effort Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevelopmentEffortMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Development Effort Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DevelopmentEffortMeasure getFixture() {
		return (DevelopmentEffortMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createDevelopmentEffortMeasure());
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

} //DevelopmentEffortMeasureTest
