package net.certware.argument.cae.impl;

import org.eclipse.emf.ecore.EClass;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>JustificationImplTest</code> contains tests for the class <code>{@link JustificationImpl}</code>.
 * <p>
 * Copyright (c) 2010 Kestrel Technology LLC.  All rights reserved.
 *
 * @generatedBy CodePro at 10/13/10 4:48 PM
 * @author mrb
 */
public class JustificationImplTest {
	/**
	 * Run the JustificationImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testJustificationImpl_1()
		throws Exception {

		JustificationImpl result = new JustificationImpl();

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
		JustificationImpl fixture = new JustificationImpl();

		EClass result = fixture.eStaticClass();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(4, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.cae.Justification", result.getInstanceClassName());
		assertEquals(5, result.getClassifierID());
		assertEquals("net.certware.argument.cae.Justification", result.getInstanceTypeName());
		assertEquals("Justification", result.getName());
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