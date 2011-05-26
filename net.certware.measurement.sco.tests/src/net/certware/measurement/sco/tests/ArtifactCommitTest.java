/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.sco.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.sco.ArtifactCommit;
import net.certware.measurement.sco.ScoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Commit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactCommitTest extends TestCase {

	/**
	 * The fixture for this Artifact Commit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactCommit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactCommitTest.class);
	}

	/**
	 * Constructs a new Artifact Commit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactCommitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Artifact Commit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ArtifactCommit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Artifact Commit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactCommit getFixture() {
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
		setFixture(ScoFactory.eINSTANCE.createArtifactCommit());
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

} //ArtifactCommitTest
