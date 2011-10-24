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
 * The class <code>AnnotationImplTest</code> contains tests for the class <code>{@link AnnotationImpl}</code>.
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class AnnotationImplTest {
	/**
	 * Run the AnnotationImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testAnnotationImpl_1()
		throws Exception {

		AnnotationImpl result = new AnnotationImpl();

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
		// fail("unverified");
	}

	/**
	 * Run the EClass eStaticClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.target = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.content = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);

		EClass result = fixture.eStaticClass();

		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(6, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.arm.Annotation", result.getInstanceClassName());
		assertEquals(6, result.getClassifierID());
		assertEquals("net.certware.argument.arm.Annotation", result.getInstanceTypeName());
		assertEquals("Annotation", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		// fail("unverified");
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