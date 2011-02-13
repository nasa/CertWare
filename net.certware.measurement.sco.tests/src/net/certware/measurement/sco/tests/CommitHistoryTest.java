/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.sco.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.sco.CommitHistory;
import net.certware.measurement.sco.ScoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Commit History</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommitHistoryTest extends TestCase {

	/**
	 * The fixture for this Commit History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitHistory fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CommitHistoryTest.class);
	}

	/**
	 * Constructs a new Commit History test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitHistoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Commit History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CommitHistory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Commit History test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitHistory getFixture() {
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
		setFixture(ScoFactory.eINSTANCE.createCommitHistory());
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

} //CommitHistoryTest
