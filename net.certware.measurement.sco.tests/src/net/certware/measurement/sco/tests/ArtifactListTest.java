/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.sco.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ArtifactList;
import net.certware.measurement.sco.ScoFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Artifact List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArtifactListTest extends TestCase {

	/**
	 * The fixture for this Artifact List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArtifactListTest.class);
	}

	/**
	 * Constructs a new Artifact List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Artifact List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ArtifactList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Artifact List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactList getFixture() {
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
		setFixture(ScoFactory.eINSTANCE.createArtifactList());
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

	protected void testListAdd() {
		ArtifactList al = getFixture();
		assertNotNull(al);
		assertEquals(0,al.getArtifactIdentifiers().size());
		ArtifactIdentifier id = ScoFactory.eINSTANCE.createArtifactIdentifier();
		al.getArtifactIdentifiers().add(id);
		assertEquals(1,al.getArtifactIdentifiers().size());
		assertEquals(id,al.getArtifactIdentifiers().get(0));
	}
	
	protected void testListRemoveObject() {
		ArtifactList al = getFixture();
		assertNotNull(al);
		ArtifactIdentifier id1 = ScoFactory.eINSTANCE.createArtifactIdentifier();

		al.getArtifactIdentifiers().add(id1);
		assertEquals(1,al.getArtifactIdentifiers().size());
		assertEquals(id1,al.getArtifactIdentifiers().get(0));
		al.getArtifactIdentifiers().remove(id1);
		assertEquals(0,al.getArtifactIdentifiers().size());
	}
	
	protected void testListRemoveIndex() {
		ArtifactList al = getFixture();
		assertNotNull(al);
		ArtifactIdentifier id1 = ScoFactory.eINSTANCE.createArtifactIdentifier();

		al.getArtifactIdentifiers().add(id1);
		assertEquals(1,al.getArtifactIdentifiers().size());
		assertEquals(id1,al.getArtifactIdentifiers().get(0));
		al.getArtifactIdentifiers().remove(0);
		assertEquals(0,al.getArtifactIdentifiers().size());
	}
	
	
} //ArtifactListTest
