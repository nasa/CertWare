/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.tests;

import junit.textui.TestRunner;
import net.certware.measurement.spm.ImprovementChangeOrderCount;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Improvement Change Order Count</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImprovementChangeOrderCountTest extends AdditiveMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImprovementChangeOrderCountTest.class);
	}

	/**
	 * Constructs a new Improvement Change Order Count test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImprovementChangeOrderCountTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Improvement Change Order Count test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImprovementChangeOrderCount getFixture() {
		return (ImprovementChangeOrderCount)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createImprovementChangeOrderCount());
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

} //ImprovementChangeOrderCountTest
