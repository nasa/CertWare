/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.spm.ProjectCommit;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Project Commit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectCommitTest extends TestCase {

	/**
	 * The fixture for this Project Commit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectCommit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProjectCommitTest.class);
	}

	/**
	 * Constructs a new Project Commit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectCommitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Project Commit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProjectCommit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Project Commit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectCommit getFixture() {
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
		setFixture(SpmFactory.eINSTANCE.createProjectCommit());
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

} //ProjectCommitTest
