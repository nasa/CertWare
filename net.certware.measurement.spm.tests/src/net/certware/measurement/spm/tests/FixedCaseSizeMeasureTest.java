/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.tests;

import junit.textui.TestRunner;
import net.certware.measurement.spm.FixedCaseSizeMeasure;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fixed Case Size Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FixedCaseSizeMeasureTest extends AdditiveMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FixedCaseSizeMeasureTest.class);
	}

	/**
	 * Constructs a new Fixed Case Size Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedCaseSizeMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fixed Case Size Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FixedCaseSizeMeasure getFixture() {
		return (FixedCaseSizeMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createFixedCaseSizeMeasure());
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

} //FixedCaseSizeMeasureTest
