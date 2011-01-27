/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.textui.TestRunner;
import net.certware.measurement.spm.NewFeatureChangeOrderCount;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>New Feature Change Order Count</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NewFeatureChangeOrderCountTest extends AdditiveMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NewFeatureChangeOrderCountTest.class);
	}

	/**
	 * Constructs a new New Feature Change Order Count test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewFeatureChangeOrderCountTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this New Feature Change Order Count test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NewFeatureChangeOrderCount getFixture() {
		return (NewFeatureChangeOrderCount)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpmFactory.eINSTANCE.createNewFeatureChangeOrderCount());
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

} //NewFeatureChangeOrderCountTest
