package net.certware.argument.cae.util;

import org.eclipse.emf.common.util.URI;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CaeResourceImplTest</code> contains tests for the class <code>{@link CaeResourceImpl}</code>.
 * <p>
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved..  All rights reserved.
 *
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
public class CaeResourceImplTest {
	/**
	 * Run the CaeResourceImpl(URI) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaeResourceImpl_1()
		throws Exception {
		@SuppressWarnings("deprecation")
		URI uri = URI.createDeviceURI("");

		CaeResourceImpl result = new CaeResourceImpl(uri);

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals("http://www.omg.org/XMI", result.getXMINamespace());
		assertEquals("2.0", result.getXMIVersion());
		assertEquals("ASCII", result.getEncoding());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals("1.0", result.getXMLVersion());
		assertEquals(false, result.useZip());
		assertEquals("Key type: class net.certware.argument.cae.util.CaeResourceImpl", result.toKeyString());
		assertEquals(false, result.isLoaded());
		assertEquals(false, result.isLoading());
		assertEquals(0L, result.getTimeStamp());
		assertEquals(false, result.isModified());
		assertEquals(null, result.getResourceSet());
		assertEquals(false, result.isTrackingModification());
		assertEquals(null, result.getIntrinsicIDToEObjectMap());
		assertEquals(true, result.eDeliver());
		assertEquals(false, result.eNotificationRequired());
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