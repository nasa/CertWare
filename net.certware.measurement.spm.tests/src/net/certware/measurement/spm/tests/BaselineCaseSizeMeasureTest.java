/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.tests;

import junit.textui.TestRunner;
import net.certware.measurement.spm.BaselineCaseSizeMeasure;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Baseline Case Size Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BaselineCaseSizeMeasureTest extends AdditiveMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BaselineCaseSizeMeasureTest.class);
	}

	/**
	 * Constructs a new Baseline Case Size Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineCaseSizeMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Baseline Case Size Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BaselineCaseSizeMeasure getFixture() {
		return (BaselineCaseSizeMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createBaselineCaseSizeMeasure());
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

} //BaselineCaseSizeMeasureTest
