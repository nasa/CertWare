/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.spm.ProjectHistory;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Project History</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectHistoryTest extends TestCase {

	/**
	 * The fixture for this Project History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectHistory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectHistoryTest.class);
	}

	/**
	 * Constructs a new Project History test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectHistoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Project History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProjectHistory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Project History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectHistory getFixture() {
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
		setFixture(SpmFactory.eINSTANCE.createProjectHistory());
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

} //ProjectHistoryTest
