/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.spm.ReworkBacklogMeasure;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rework Backlog Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReworkBacklogMeasureTest extends TestCase {

	/**
	 * The fixture for this Rework Backlog Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReworkBacklogMeasure fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReworkBacklogMeasureTest.class);
	}

	/**
	 * Constructs a new Rework Backlog Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReworkBacklogMeasureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rework Backlog Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReworkBacklogMeasure fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rework Backlog Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReworkBacklogMeasure getFixture() {
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
		setFixture(SpmFactory.eINSTANCE.createReworkBacklogMeasure());
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

} //ReworkBacklogMeasureTest
