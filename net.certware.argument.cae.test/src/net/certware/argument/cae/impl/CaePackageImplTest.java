/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */

package net.certware.argument.cae.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.certware.argument.cae.CaePackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>CaePackageImplTest</code> contains tests for the class <code>{@link CaePackageImpl}</code>.
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
public class CaePackageImplTest {
	/**
	 * Run the CaePackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {

		CaePackage result = CaePackageImpl.init();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals("http://www.certware.net/cae", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("cae", result.getNsPrefix());
		assertEquals("cae", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the CaePackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {

		CaePackage result = CaePackageImpl.init();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals("http://www.certware.net/cae", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("cae", result.getNsPrefix());
		assertEquals("cae", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the CaePackage init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testInit_3()
		throws Exception {

		CaePackage result = CaePackageImpl.init();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals("http://www.certware.net/cae", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("cae", result.getNsPrefix());
		assertEquals("cae", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// TODO: add additional tear down code here
	}
}