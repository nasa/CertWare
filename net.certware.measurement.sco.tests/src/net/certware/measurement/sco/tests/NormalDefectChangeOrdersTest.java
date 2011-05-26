/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.sco.tests;

import junit.textui.TestRunner;

import net.certware.measurement.sco.NormalDefectChangeOrders;
import net.certware.measurement.sco.ScoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Normal Defect Change Orders</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalDefectChangeOrdersTest extends ChangeOrderCountTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NormalDefectChangeOrdersTest.class);
	}

	/**
	 * Constructs a new Normal Defect Change Orders test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalDefectChangeOrdersTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Normal Defect Change Orders test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NormalDefectChangeOrders getFixture() {
		return (NormalDefectChangeOrders)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScoFactory.eINSTANCE.createNormalDefectChangeOrders());
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

} //NormalDefectChangeOrdersTest
