/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.spm.ScrapRatioMeasure;
import net.certware.measurement.spm.SpmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scrap Ratio Measure</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScrapRatioMeasureTest extends TestCase {

	/**
	 * The fixture for this Scrap Ratio Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrapRatioMeasure fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScrapRatioMeasureTest.class);
	}

	/**
	 * Constructs a new Scrap Ratio Measure test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScrapRatioMeasureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Scrap Ratio Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ScrapRatioMeasure fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Scrap Ratio Measure test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrapRatioMeasure getFixture() {
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
		setFixture(SpmFactory.eINSTANCE.createScrapRatioMeasure());
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

} //ScrapRatioMeasureTest
