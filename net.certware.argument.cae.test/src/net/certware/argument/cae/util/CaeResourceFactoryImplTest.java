package net.certware.argument.cae.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CaeResourceFactoryImplTest</code> contains tests for the class <code>{@link CaeResourceFactoryImpl}</code>.
 * <p>
 * Copyright (c) 2010 Kestrel Technology LLC.  All rights reserved.
 *
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
public class CaeResourceFactoryImplTest {
	/**
	 * Run the CaeResourceFactoryImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaeResourceFactoryImpl_1()
		throws Exception {

		CaeResourceFactoryImpl result = new CaeResourceFactoryImpl();

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Resource createResource(URI) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateResource_1()
		throws Exception {
		CaeResourceFactoryImpl fixture = new CaeResourceFactoryImpl();
		URI uri = URI.createDeviceURI("");

		Resource result = fixture.createResource(uri);

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isLoaded());
		assertEquals(0L, result.getTimeStamp());
		assertEquals(false, result.isModified());
		assertEquals(null, result.getResourceSet());
		assertEquals(false, result.isTrackingModification());
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