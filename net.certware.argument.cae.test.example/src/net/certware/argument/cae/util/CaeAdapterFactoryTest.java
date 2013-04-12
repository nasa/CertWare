/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */

package net.certware.argument.cae.util;

import org.easymock.EasyMock;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import net.certware.argument.cae.CaePackage;
import org.eclipse.emf.ecore.EObject;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CaeAdapterFactoryTest</code> contains tests for the class <code>{@link CaeAdapterFactory}</code>.
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
public class CaeAdapterFactoryTest {
	/**
	 * Run the CaeAdapterFactory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaeAdapterFactory_1()
		throws Exception {

		CaeAdapterFactory result = new CaeAdapterFactory();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.createClaimAdapter());
		assertEquals(null, result.createArgumentAdapter());
		assertEquals(null, result.createEvidenceAdapter());
		assertEquals(null, result.createAssumptionAdapter());
		assertEquals(null, result.createContextAdapter());
		assertEquals(null, result.createJustificationAdapter());
		assertEquals(null, result.createModelElementAdapter());
		assertEquals(null, result.createArgumentElementAdapter());
		assertEquals(null, result.createReasoningElementAdapter());
		assertEquals(null, result.createArm_ClaimAdapter());
		assertEquals(null, result.createArgumentLinkAdapter());
		assertEquals(null, result.createAssertedRelationshipAdapter());
		assertEquals(null, result.createAssertedEvidenceAdapter());
		assertEquals(null, result.createInformationElementAdapter());
		assertEquals(null, result.createEObjectAdapter());
	}

	/**
	 * Run the CaeAdapterFactory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaeAdapterFactory_2()
		throws Exception {

		CaeAdapterFactory result = new CaeAdapterFactory();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.createClaimAdapter());
		assertEquals(null, result.createArgumentAdapter());
		assertEquals(null, result.createEvidenceAdapter());
		assertEquals(null, result.createAssumptionAdapter());
		assertEquals(null, result.createContextAdapter());
		assertEquals(null, result.createJustificationAdapter());
		assertEquals(null, result.createModelElementAdapter());
		assertEquals(null, result.createArgumentElementAdapter());
		assertEquals(null, result.createReasoningElementAdapter());
		assertEquals(null, result.createArm_ClaimAdapter());
		assertEquals(null, result.createArgumentLinkAdapter());
		assertEquals(null, result.createAssertedRelationshipAdapter());
		assertEquals(null, result.createAssertedEvidenceAdapter());
		assertEquals(null, result.createInformationElementAdapter());
		assertEquals(null, result.createEObjectAdapter());
	}

	/**
	 * Run the Adapter createAdapter(Notifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCreateAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();
		Notifier target = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(target);

		Adapter result = fixture.createAdapter(target);

		// TODO: add additional test code here
		EasyMock.verify(target);
		assertNotNull(result);
	}

	/**
	 * Run the Adapter createArgumentAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateArgumentAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createArgumentAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createArgumentElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateArgumentElementAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createArgumentElementAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createArgumentLinkAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateArgumentLinkAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createArgumentLinkAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createArm_ClaimAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateArm_ClaimAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createArm_ClaimAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createAssertedEvidenceAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateAssertedEvidenceAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createAssertedEvidenceAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createAssertedRelationshipAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateAssertedRelationshipAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createAssertedRelationshipAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createAssumptionAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateAssumptionAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createAssumptionAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createClaimAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateClaimAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createClaimAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createContextAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateContextAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createContextAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createEObjectAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateEObjectAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createEObjectAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createEvidenceAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateEvidenceAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createEvidenceAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createInformationElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateInformationElementAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createInformationElementAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createJustificationAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateJustificationAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createJustificationAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createModelElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateModelElementAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createModelElementAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the Adapter createReasoningElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateReasoningElementAdapter_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();

		Adapter result = fixture.createReasoningElementAdapter();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the boolean isFactoryForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testIsFactoryForType_1()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();
		Object object = new Object();

		boolean result = fixture.isFactoryForType(object);

		// TODO: add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFactoryForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFactoryForType_2()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();
		Object object = EasyMock.createMock(CaePackage.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		boolean result = fixture.isFactoryForType(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertTrue(result);
	}

	/**
	 * Run the boolean isFactoryForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFactoryForType_3()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();
		Object object = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		boolean result = fixture.isFactoryForType(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertTrue(result);
	}

	/**
	 * Run the boolean isFactoryForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFactoryForType_4()
		throws Exception {
		CaeAdapterFactory fixture = new CaeAdapterFactory();
		fixture.modelSwitch = new CaeSwitch();
		Object object = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		boolean result = fixture.isFactoryForType(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertTrue(result);
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