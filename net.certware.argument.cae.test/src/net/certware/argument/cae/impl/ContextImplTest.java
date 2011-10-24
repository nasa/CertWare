/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */

package net.certware.argument.cae.impl;

import org.eclipse.emf.ecore.EClass;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ContextImplTest</code> contains tests for the class <code>{@link ContextImpl}</code>.
 * @generatedBy CodePro at 10/13/10 4:48 PM
 * @author mrb
 */
public class ContextImplTest {
	/**
	 * Run the ContextImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testContextImpl_1()
		throws Exception {

		ContextImpl result = new ContextImpl();

		// TODO: add additional test code here
		assertNotNull(result);
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
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		ContextImpl fixture = new ContextImpl();

		EClass result = fixture.eStaticClass();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(4, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.cae.Context", result.getInstanceClassName());
		assertEquals(4, result.getClassifierID());
		assertEquals("net.certware.argument.cae.Context", result.getInstanceTypeName());
		assertEquals("Context", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// TODO: add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// TODO: add additional tear down code here
	}
}