/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.navigator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.osgi.framework.BundleContext;

/**
 * The class <code>ActivatorTest</code> contains tests for the class <code>{@link CertWareUIPlugin}</code>.
 *
 * @generatedBy CodePro at 9/17/10 12:24 PM
 * @author mrb
 * @version $Revision: 1.0 $
 */
public class ActivatorTest {
	/**
	 * Run the BundleContext getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetContext_1()
		throws Exception {

		BundleContext result = Activator.getContext();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the void start(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testStart_1()
		throws Exception {
		Activator fixture = new Activator();
		BundleContext bundleContext = null;

		fixture.start(bundleContext);

		// add additional test code here
	}

	/**
	 * Run the void stop(BundleContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testStop_1()
		throws Exception {
		Activator fixture = new Activator();
		BundleContext bundleContext = null;

		fixture.stop(bundleContext);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ActivatorTest.class);
	}
}