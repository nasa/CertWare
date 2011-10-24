/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>EvidenceAssertionImplTest</code> contains tests for the class <code>{@link EvidenceAssertionImpl}</code>.
 * @generatedBy CodePro at 10/12/10 1:33 PM
 * @author mrb
 */
public class EvidenceAssertionImplTest {
	/**
	 * Run the EvidenceAssertionImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEvidenceAssertionImpl_1()
		throws Exception {

		EvidenceAssertionImpl result = new EvidenceAssertionImpl();

		assertNotNull(result);
		assertEquals(false, result.isAssumed());
		assertEquals(false, result.isToBeSupported());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifier());
		assertEquals(null, result.getDescription());
		assertEquals(true, result.eDeliver());
		assertEquals(false, result.eIsProxy());
		assertEquals(0, result.eContainerFeatureID());
		assertEquals(null, result.eInternalContainer());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(null, result.eDirectResource());
		assertEquals(null, result.eProxyURI());
		assertEquals(null, result.eInternalResource());
		assertEquals(null, result.eStore());
		assertEquals(false, result.eNotificationRequired());
		
	}

	/**
	 * Run the EClass eStaticClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		EvidenceAssertionImpl fixture = new EvidenceAssertionImpl();
		fixture.toBeSupported = true;
		fixture.identifier = "";
		fixture.content = "";
		fixture.description = "";
		fixture.assumed = true;
		fixture.isTagged = EasyMock.createNiceMock(EList.class);

		EClass result = fixture.eStaticClass();

		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(6, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.arm.EvidenceAssertion", result.getInstanceClassName());
		assertEquals(14, result.getClassifierID());
		assertEquals("net.certware.argument.arm.EvidenceAssertion", result.getInstanceTypeName());
		assertEquals("EvidenceAssertion", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Before
	public void setUp()
		throws Exception {
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@After
	public void tearDown()
		throws Exception {
	}
}