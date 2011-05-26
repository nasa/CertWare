package net.certware.argument.arm.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ArmResourceImplTest</code> contains tests for the class <code>{@link ArmResourceImpl}</code>.
 * <p>
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved..  All rights reserved.
 *
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class ArmResourceImplTest {
	/**
	 * Run the ArmResourceImpl(URI) constructor test.
	 *
	 * @throws Exception
	 */
	@Test
	public void testArmResourceImpl_1()
		throws Exception {
//		URI uri = URI.createDeviceURI("");
		String modelPath = System.getProperty("user.home",".") + File.separatorChar + "ti1.arm"; //$NON-NLS-1$ //$NON-NLS-2$
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("arm", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		
		URI uri = URI.createFileURI(modelPath);
		// Resource resource = resourceSet.createResource(fileURI);


		ArmResourceImpl result = new ArmResourceImpl(uri);

		assertNotNull(result);
		assertEquals("http://www.omg.org/XMI", result.getXMINamespace());
		assertEquals("2.0", result.getXMIVersion());
		assertEquals("ASCII", result.getEncoding());
		assertEquals(null, result.getPublicId());
		assertEquals(null, result.getSystemId());
		assertEquals("1.0", result.getXMLVersion());
		assertEquals(false, result.useZip());
		assertEquals("Key type: class net.certware.argument.arm.util.ArmResourceImpl", result.toKeyString());
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@After
	public void tearDown()
		throws Exception {
	}
}