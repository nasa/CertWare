/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import net.certware.argument.arm.ArmPackage;

import org.easymock.EasyMock;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ArmAdapterFactoryTest</code> contains tests for the class <code>{@link ArmAdapterFactory}</code>.
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class ArmAdapterFactoryTest {
	/**
	 * Run the ArmAdapterFactory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testArmAdapterFactory_1()
		throws Exception {

		ArmAdapterFactory result = new ArmAdapterFactory();

		assertNotNull(result);
		assertEquals(null, result.createModelElementAdapter());
		assertEquals(null, result.createTaggedValueAdapter());
		assertEquals(null, result.createArgumentAdapter());
		assertEquals(null, result.createArgumentElementAdapter());
		assertEquals(null, result.createArgumentLinkAdapter());
		assertEquals(null, result.createAssertedRelationshipAdapter());
		assertEquals(null, result.createAnnotationAdapter());
		assertEquals(null, result.createAssertedInferenceAdapter());
		assertEquals(null, result.createAssertedEvidenceAdapter());
		assertEquals(null, result.createAssertedContextAdapter());
		assertEquals(null, result.createAssertedCounterEvidenceAdapter());
		assertEquals(null, result.createAssertedChallengeAdapter());
		assertEquals(null, result.createReasoningElementAdapter());
		assertEquals(null, result.createClaimAdapter());
		assertEquals(null, result.createEvidenceAssertionAdapter());
		assertEquals(null, result.createInformationElementAdapter());
		assertEquals(null, result.createArgumentReasoningAdapter());
		assertEquals(null, result.createCitationElementAdapter());
		assertEquals(null, result.createEObjectAdapter());
		
	}

	/**
	 * Run the ArmAdapterFactory() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testArmAdapterFactory_2()
		throws Exception {

		ArmAdapterFactory result = new ArmAdapterFactory();

		assertNotNull(result);
		assertEquals(null, result.createModelElementAdapter());
		assertEquals(null, result.createTaggedValueAdapter());
		assertEquals(null, result.createArgumentAdapter());
		assertEquals(null, result.createArgumentElementAdapter());
		assertEquals(null, result.createArgumentLinkAdapter());
		assertEquals(null, result.createAssertedRelationshipAdapter());
		assertEquals(null, result.createAnnotationAdapter());
		assertEquals(null, result.createAssertedInferenceAdapter());
		assertEquals(null, result.createAssertedEvidenceAdapter());
		assertEquals(null, result.createAssertedContextAdapter());
		assertEquals(null, result.createAssertedCounterEvidenceAdapter());
		assertEquals(null, result.createAssertedChallengeAdapter());
		assertEquals(null, result.createReasoningElementAdapter());
		assertEquals(null, result.createClaimAdapter());
		assertEquals(null, result.createEvidenceAssertionAdapter());
		assertEquals(null, result.createInformationElementAdapter());
		assertEquals(null, result.createArgumentReasoningAdapter());
		assertEquals(null, result.createCitationElementAdapter());
		assertEquals(null, result.createEObjectAdapter());
		
	}

	/**
	 * Run the Adapter createAdapter(Notifier) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testCreateAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();
		Notifier target = EasyMock.createMock(EObject.class);
		// add mock object expectations here

		EasyMock.replay(target);

		Adapter result = fixture.createAdapter(target);

		EasyMock.verify(target);
		assertNotNull(result);
		
	}

	/**
	 * Run the Adapter createAnnotationAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateAnnotationAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createAnnotationAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createArgumentAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateArgumentAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createArgumentAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createArgumentElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateArgumentElementAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createArgumentElementAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createArgumentLinkAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateArgumentLinkAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createArgumentLinkAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createArgumentReasoningAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateArgumentReasoningAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createArgumentReasoningAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createAssertedChallengeAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateAssertedChallengeAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createAssertedChallengeAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createAssertedContextAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateAssertedContextAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createAssertedContextAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createAssertedCounterEvidenceAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateAssertedCounterEvidenceAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createAssertedCounterEvidenceAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createAssertedEvidenceAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateAssertedEvidenceAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createAssertedEvidenceAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createAssertedInferenceAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateAssertedInferenceAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createAssertedInferenceAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createAssertedRelationshipAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateAssertedRelationshipAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createAssertedRelationshipAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createCitationElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateCitationElementAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createCitationElementAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createClaimAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateClaimAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createClaimAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createEObjectAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateEObjectAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createEObjectAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createEvidenceAssertionAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateEvidenceAssertionAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createEvidenceAssertionAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createInformationElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateInformationElementAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createInformationElementAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createModelElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateModelElementAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createModelElementAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createReasoningElementAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateReasoningElementAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createReasoningElementAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Adapter createTaggedValueAdapter() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCreateTaggedValueAdapter_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();

		Adapter result = fixture.createTaggedValueAdapter();

		assertEquals(null, result);
		
	}

	/**
	 * Run the boolean isFactoryForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testIsFactoryForType_1()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();
		Object object = new Object();

		boolean result = fixture.isFactoryForType(object);

		assertEquals(false, result);
		
	}

	/**
	 * Run the boolean isFactoryForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFactoryForType_2()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();
		Object object = EasyMock.createMock(ArmPackage.class);
		// add mock object expectations here

		EasyMock.replay(object);

		boolean result = fixture.isFactoryForType(object);

		EasyMock.verify(object);
		assertTrue(result);
		
	}

	/**
	 * Run the boolean isFactoryForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFactoryForType_3()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();
		Object object = EasyMock.createMock(EObject.class);
		// add mock object expectations here

		EasyMock.replay(object);

		boolean result = fixture.isFactoryForType(object);

		EasyMock.verify(object);
		assertTrue(result);
		
	}

	/**
	 * Run the boolean isFactoryForType(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testIsFactoryForType_4()
		throws Exception {
		ArmAdapterFactory fixture = new ArmAdapterFactory();
		fixture.modelSwitch = new ArmSwitch();
		Object object = EasyMock.createMock(EObject.class);
		// add mock object expectations here

		EasyMock.replay(object);

		boolean result = fixture.isFactoryForType(object);

		EasyMock.verify(object);
		assertTrue(result);
		
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