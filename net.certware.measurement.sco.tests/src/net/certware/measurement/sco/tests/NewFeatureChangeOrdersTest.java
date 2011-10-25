/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.sco.tests;

import junit.textui.TestRunner;

import net.certware.measurement.sco.NewFeatureChangeOrders;
import net.certware.measurement.sco.ScoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>New Feature Change Orders</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NewFeatureChangeOrdersTest extends ChangeOrderCountTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NewFeatureChangeOrdersTest.class);
	}

	/**
	 * Constructs a new New Feature Change Orders test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFeatureChangeOrdersTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this New Feature Change Orders test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NewFeatureChangeOrders getFixture() {
		return (NewFeatureChangeOrders)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ScoFactory.eINSTANCE.createNewFeatureChangeOrders());
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

} //NewFeatureChangeOrdersTest
