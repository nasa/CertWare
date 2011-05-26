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
 * The class <code>AssertedRelationshipImplTest</code> contains tests for the class <code>{@link AssertedRelationshipImpl}</code>.
 * <p>
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved..  All rights reserved.
 *
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class AssertedRelationshipImplTest {
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
		AssertedChallengeImpl fixture = new AssertedChallengeImpl();
		fixture.identifier = "";
		fixture.content = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);

		EClass result = fixture.eStaticClass();

		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(6, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.arm.AssertedChallenge", result.getInstanceClassName());
		assertEquals(11, result.getClassifierID());
		assertEquals("net.certware.argument.arm.AssertedChallenge", result.getInstanceTypeName());
		assertEquals("AssertedChallenge", result.getName());
		assertEquals(false, result.eIsProxy());
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