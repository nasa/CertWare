/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.sco.tests;

import junit.textui.TestRunner;

import net.certware.measurement.sco.ScoFactory;
import net.certware.measurement.sco.TotalChangeOrders;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Total Change Orders</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TotalChangeOrdersTest extends ChangeOrderCountTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TotalChangeOrdersTest.class);
	}

	/**
	 * Constructs a new Total Change Orders test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TotalChangeOrdersTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Total Change Orders test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TotalChangeOrders getFixture() {
		return (TotalChangeOrders)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScoFactory.eINSTANCE.createTotalChangeOrders());
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

} //TotalChangeOrdersTest
