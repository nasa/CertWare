/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ArmResourceFactoryImplTest</code> contains tests for the class <code>{@link ArmResourceFactoryImpl}</code>.
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class ArmResourceFactoryImplTest {
	/**
	 * Run the ArmResourceFactoryImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testArmResourceFactoryImpl_1()
		throws Exception {

		ArmResourceFactoryImpl result = new ArmResourceFactoryImpl();

		assertNotNull(result);
		
	}

	/**
	 * Run the Resource createResource(URI) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateResource_1()
		throws Exception {
		ArmResourceFactoryImpl fixture = new ArmResourceFactoryImpl();
		
//		URI uri = URI.createDeviceURI("");
		String modelPath = System.getProperty("user.home",".") + File.separatorChar + "ar2.arm"; //$NON-NLS-1$ //$NON-NLS-2$
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("arm", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		
		URI uri = URI.createFileURI(modelPath);
		// Resource resource = resourceSet.createResource(fileURI);


		Resource result = fixture.createResource(uri);

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