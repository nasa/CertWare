/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import net.certware.measurement.spm.CaseScope;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Case Scope</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaseScopeTest extends TestCase {

	/**
	 * The fixture for this Case Scope test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseScope fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CaseScopeTest.class);
	}

	/**
	 * Constructs a new Case Scope test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseScopeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Case Scope test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CaseScope fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Case Scope test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseScope getFixture() {
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
		setFixture(SpmFactory.eINSTANCE.createCaseScope());
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

} //CaseScopeTest
