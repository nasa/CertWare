/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.textui.TestRunner;

import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.TotalCaseSizeMeasure;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Total Case Size Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TotalCaseSizeMeasureTest extends AdditiveMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TotalCaseSizeMeasureTest.class);
	}

	/**
	 * Constructs a new Total Case Size Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalCaseSizeMeasureTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Total Case Size Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TotalCaseSizeMeasure getFixture() {
		return (TotalCaseSizeMeasure)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createTotalCaseSizeMeasure());
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

} //TotalCaseSizeMeasureTest
