/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.spm.SpmFactory;
import net.certware.measurement.spm.TimeDimensionalMeasure;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Dimensional Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeDimensionalMeasureTest extends TestCase {

	/**
	 * The fixture for this Time Dimensional Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDimensionalMeasure fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeDimensionalMeasureTest.class);
	}

	/**
	 * Constructs a new Time Dimensional Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDimensionalMeasureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time Dimensional Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimeDimensionalMeasure fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time Dimensional Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDimensionalMeasure getFixture() {
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
		setFixture(SpmFactory.eINSTANCE.createTimeDimensionalMeasure());
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

} //TimeDimensionalMeasureTest
