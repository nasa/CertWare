/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import net.certware.measurement.spm.ReworkRatioMeasure;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rework Ratio Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReworkRatioMeasureTest extends TestCase {

	/**
	 * The fixture for this Rework Ratio Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReworkRatioMeasure fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReworkRatioMeasureTest.class);
	}

	/**
	 * Constructs a new Rework Ratio Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReworkRatioMeasureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rework Ratio Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReworkRatioMeasure fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rework Ratio Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReworkRatioMeasure getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createReworkRatioMeasure());
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

} //ReworkRatioMeasureTest
