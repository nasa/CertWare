/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.spm.InProgressIndicator;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>In Progress Indicator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InProgressIndicatorTest extends TestCase {

	/**
	 * The fixture for this In Progress Indicator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InProgressIndicator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InProgressIndicatorTest.class);
	}

	/**
	 * Constructs a new In Progress Indicator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InProgressIndicatorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this In Progress Indicator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InProgressIndicator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this In Progress Indicator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InProgressIndicator getFixture() {
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
		setFixture(SpmFactory.eINSTANCE.createInProgressIndicator());
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

} //InProgressIndicatorTest
