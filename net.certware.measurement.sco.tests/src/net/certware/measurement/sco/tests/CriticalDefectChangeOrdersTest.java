/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.sco.tests;

import junit.textui.TestRunner;

import net.certware.measurement.sco.CriticalDefectChangeOrders;
import net.certware.measurement.sco.ScoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Critical Defect Change Orders</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CriticalDefectChangeOrdersTest extends ChangeOrderCountTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CriticalDefectChangeOrdersTest.class);
	}

	/**
	 * Constructs a new Critical Defect Change Orders test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CriticalDefectChangeOrdersTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Critical Defect Change Orders test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CriticalDefectChangeOrders getFixture() {
		return (CriticalDefectChangeOrders)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScoFactory.eINSTANCE.createCriticalDefectChangeOrders());
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

} //CriticalDefectChangeOrdersTest
