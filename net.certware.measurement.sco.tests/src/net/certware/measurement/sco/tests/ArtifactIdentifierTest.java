/**
 * Copyright (c) 2011 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.sco.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.CriticalDefectChangeOrders;
import net.certware.measurement.sco.ImprovementChangeOrders;
import net.certware.measurement.sco.NewFeatureChangeOrders;
import net.certware.measurement.sco.NormalDefectChangeOrders;
import net.certware.measurement.sco.ScoFactory;
import net.certware.measurement.sco.TotalChangeOrders;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link net.certware.measurement.sco.ArtifactIdentifier#getTotalChangeOrders() <em>Total Change Orders</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ArtifactIdentifierTest extends TestCase {

	/**
	 * The fixture for this Artifact Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactIdentifier fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactIdentifierTest.class);
	}

	/**
	 * Constructs a new Artifact Identifier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactIdentifierTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Artifact Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ArtifactIdentifier fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Artifact Identifier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactIdentifier getFixture() {
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
		setFixture(ScoFactory.eINSTANCE.createArtifactIdentifier());
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

	/**
	 * Tests the '{@link net.certware.measurement.sco.ArtifactIdentifier#getTotalChangeOrders() <em>Total Change Orders</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.ArtifactIdentifier#getTotalChangeOrders()
	 * @generated NOT
	 */
	public void testGetTotalChangeOrders() {
		int baseline = 100;
		int current = 200;
		
		ArtifactIdentifier ai = getFixture();
		ai.setBaselinedLineCount(baseline);
		ai.setCurrentLineCount(current);
		TotalChangeOrders tco = ai.getTotalChangeOrders();
		assertNotNull(tco); // created by the get method
		assertNotNull(ai.getCriticalDefectChangeOrders()); // created by the constructor
		assertEquals(baseline,ai.getBaselinedLineCount()); // not affected
		assertEquals(current,ai.getCurrentLineCount()); // not affected
	}

	/**
	 * Ensure the accumulators are different.
	 */
	public void testSetTotalChangeOrdersDiff() {
		int broken = 1;
		int fixed = 2;
		double repair = 3;
		int value = 4;
		
		// setup an empty artifact identifier
		ArtifactIdentifier ai = getFixture();
		
		CriticalDefectChangeOrders cdco = ai.getCriticalDefectChangeOrders();
		NormalDefectChangeOrders ndco = ai.getNormalDefectChangeOrders();
		ImprovementChangeOrders ico = ai.getImprovementChangeOrders();
		NewFeatureChangeOrders nfco = ai.getNewFeatureChangeOrders();

		cdco.setBrokenLines(broken);
		cdco.setFixedLines(fixed);
		cdco.setRepairEffort(repair);
		cdco.setValue(value);

		// critical orders only
		TotalChangeOrders tco = ai.getTotalChangeOrders();
		assertEquals(broken,tco.getBrokenLines());
		assertEquals(fixed,tco.getFixedLines());
		assertEquals(repair,tco.getRepairEffort());
		assertEquals(value,tco.getValue());

		ndco.setBrokenLines(broken);
		ndco.setFixedLines(fixed);
		ndco.setRepairEffort(repair);
		ndco.setValue(value);

		// critical and normal orders only
		tco = ai.getTotalChangeOrders();
		assertEquals(broken*2,tco.getBrokenLines());
		assertEquals(fixed*2,tco.getFixedLines());
		assertEquals(repair*2,tco.getRepairEffort());
		assertEquals(value*2,tco.getValue());

		ico.setBrokenLines(broken);
		ico.setFixedLines(fixed);
		ico.setRepairEffort(repair);
		ico.setValue(value);

		// critical and normal and improvement orders only
		tco = ai.getTotalChangeOrders();
		assertEquals(broken*3,tco.getBrokenLines());
		assertEquals(fixed*3,tco.getFixedLines());
		assertEquals(repair*3,tco.getRepairEffort());
		assertEquals(value*3,tco.getValue());

		nfco.setBrokenLines(broken);
		nfco.setFixedLines(fixed);
		nfco.setRepairEffort(repair);
		nfco.setValue(value);

		// all order types
		tco = ai.getTotalChangeOrders();
		assertEquals(broken*4,tco.getBrokenLines());
		assertEquals(fixed*4,tco.getFixedLines());
		assertEquals(repair*4,tco.getRepairEffort());
		assertEquals(value*4,tco.getValue());
	}
	
	/**
	 * Tests the '{@link net.certware.measurement.sco.ArtifactIdentifier#setTotalChangeOrders(net.certware.measurement.sco.TotalChangeOrders) <em>Total Change Orders</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.certware.measurement.sco.ArtifactIdentifier#setTotalChangeOrders(net.certware.measurement.sco.TotalChangeOrders)
	 * @generated NOT
	 */
	public void testSetTotalChangeOrders() {
		int baseline = 100;
		int current = 200;
		int critical = 1;
		int normal = 2;
		int improvement = 3;
		int newfeature = 4;
		
		// setup an empty artifact identifier
		ArtifactIdentifier ai = getFixture();
		ai.setBaselinedLineCount(baseline);
		ai.setCurrentLineCount(current);
		
		CriticalDefectChangeOrders cdco = ai.getCriticalDefectChangeOrders();
		NormalDefectChangeOrders ndco = ai.getNormalDefectChangeOrders();
		ImprovementChangeOrders ico = ai.getImprovementChangeOrders();
		NewFeatureChangeOrders nfco = ai.getNewFeatureChangeOrders();

		cdco.setBrokenLines(critical);
		cdco.setFixedLines(critical);
		cdco.setRepairEffort(critical);
		cdco.setValue(critical);

		// critical orders only
		TotalChangeOrders tco = ai.getTotalChangeOrders();
		assertEquals(critical,tco.getBrokenLines());
		assertEquals(critical,tco.getFixedLines());
		assertEquals(critical*1d,tco.getRepairEffort());
		assertEquals(critical,tco.getValue());

		ndco.setBrokenLines(normal);
		ndco.setFixedLines(normal);
		ndco.setRepairEffort(normal);
		ndco.setValue(normal);

		// critical and normal orders only
		tco = ai.getTotalChangeOrders();
		assertEquals(critical+normal,tco.getBrokenLines());
		assertEquals(critical+normal,tco.getFixedLines());
		assertEquals(critical+normal*1d,tco.getRepairEffort());
		assertEquals(critical+normal,tco.getValue());

		ico.setBrokenLines(improvement);
		ico.setFixedLines(improvement);
		ico.setRepairEffort(improvement);
		ico.setValue(improvement);

		// critical and normal and improvement orders only
		tco = ai.getTotalChangeOrders();
		assertEquals(critical+normal+improvement,tco.getBrokenLines());
		assertEquals(critical+normal+improvement,tco.getFixedLines());
		assertEquals(critical+normal+improvement*1d,tco.getRepairEffort());
		assertEquals(critical+normal+improvement,tco.getValue());

		nfco.setBrokenLines(newfeature);
		nfco.setFixedLines(newfeature);
		nfco.setRepairEffort(newfeature);
		nfco.setValue(newfeature);

		// all order types
		tco = ai.getTotalChangeOrders();
		assertEquals(critical+normal+improvement+newfeature,tco.getBrokenLines());
		assertEquals(critical+normal+improvement+newfeature,tco.getFixedLines());
		assertEquals(critical+normal+improvement+newfeature*1d,tco.getRepairEffort());
		assertEquals(critical+normal+improvement+newfeature,tco.getValue());

		// clean up
		assertEquals(baseline,ai.getBaselinedLineCount()); // not affected
		assertEquals(current,ai.getCurrentLineCount()); // not affected
	}

} //ArtifactIdentifierTest
