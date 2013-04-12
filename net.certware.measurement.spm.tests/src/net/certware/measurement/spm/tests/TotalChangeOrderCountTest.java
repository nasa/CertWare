/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.tests;

import junit.textui.TestRunner;
import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.TotalChangeOrderCount;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Total Change Order Count</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TotalChangeOrderCountTest extends AdditiveMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TotalChangeOrderCountTest.class);
	}

	/**
	 * Constructs a new Total Change Order Count test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalChangeOrderCountTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Total Change Order Count test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TotalChangeOrderCount getFixture() {
		return (TotalChangeOrderCount)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createTotalChangeOrderCount());
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

} //TotalChangeOrderCountTest
