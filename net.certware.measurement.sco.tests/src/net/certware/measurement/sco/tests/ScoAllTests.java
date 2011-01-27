/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.sco.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Sco</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScoAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ScoAllTests("SCO Tests"); //$NON-NLS-1$
		suite.addTest(ScoTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoAllTests(String name) {
		super(name);
	}

} //ScoAllTests
