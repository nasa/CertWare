/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.AssertedInference;

import org.easymock.EasyMock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ArgumentReasoningImplTest</code> contains tests for the class <code>{@link ArgumentReasoningImpl}</code>.
 * @generatedBy CodePro at 10/12/10 1:33 PM
 * @author mrb
 */
public class ArgumentReasoningImplTest {
	/**
	 * Run the ArgumentReasoningImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testArgumentReasoningImpl_1()
		throws Exception {

		ArgumentReasoningImpl result = new ArgumentReasoningImpl();

		assertNotNull(result);
		assertEquals(null, result.getHasStructure());
		assertEquals(null, result.basicGetHasStructure());
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
	 * Run the Argument basicGetHasStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testBasicGetHasStructure_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		Argument result = fixture.basicGetHasStructure();

		assertNotNull(result);
		assertEquals(null, result.getContainsArgumentElement());

	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 4;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertNotNull(result);

	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEGet_2()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 5;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertNotNull(result);

	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEGet_3()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 5;
		boolean resolve = false;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertNotNull(result);

	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEIsSet_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);

	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEIsSet_2()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = null;
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(false, result);

	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEIsSet_3()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);

	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEIsSet_4()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);

	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEIsSet_5()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure((Argument) null);
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(false, result);

	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testESet_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 4;
		Object newValue = EasyMock.createMock(Collection.class);
		// add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		EasyMock.verify(newValue);

	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testESet_2()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 5;
		Object newValue = EasyMock.createMock(Argument.class);
		// add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		EasyMock.verify(newValue);

	}

	/**
	 * Run the EClass eStaticClass() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		EClass result = fixture.eStaticClass();

		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(6, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.arm.ArgumentReasoning", result.getInstanceClassName());
		assertEquals(16, result.getClassifierID());
		assertEquals("net.certware.argument.arm.ArgumentReasoning", result.getInstanceTypeName());
		assertEquals("ArgumentReasoning", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());

	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEUnset_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 4;

		fixture.eUnset(featureID);


	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEUnset_2()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		int featureID = 5;

		fixture.eUnset(featureID);


	}

	/**
	 * Run the EList<AssertedInference> getDescribes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetDescribes_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = null;
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		EList<AssertedInference> result = fixture.getDescribes();

		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Run the EList<AssertedInference> getDescribes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetDescribes_2()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		EList<AssertedInference> result = fixture.getDescribes();

		assertNotNull(result);
		assertEquals(0, result.size());

	}

	/**
	 * Run the Argument getHasStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetHasStructure_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		Argument result = fixture.getHasStructure();

		assertNotNull(result);

	}

	/**
	 * Run the Argument getHasStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetHasStructure_2()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		Argument result = fixture.getHasStructure();

		assertNotNull(result);

	}

	/**
	 * Run the Argument getHasStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetHasStructure_3()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		Argument result = fixture.getHasStructure();

		assertNotNull(result);

	}

	/**
	 * Run the Argument getHasStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetHasStructure_4()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure((Argument) null);
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		Argument result = fixture.getHasStructure();

		assertEquals(null, result);

	}

	/**
	 * Run the Argument getHasStructure() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetHasStructure_5()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";

		Argument result = fixture.getHasStructure();

		assertNotNull(result);

	}

	/**
	 * Run the void setHasStructure(Argument) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testSetHasStructure_1()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		Argument newHasStructure = EasyMock.createMock(Argument.class);
		// add mock object expectations here

		EasyMock.replay(newHasStructure);

		fixture.setHasStructure(newHasStructure);

		EasyMock.verify(newHasStructure);

	}

	/**
	 * Run the void setHasStructure(Argument) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testSetHasStructure_2()
		throws Exception {
		ArgumentReasoningImpl fixture = new ArgumentReasoningImpl();
		fixture.setHasStructure(EasyMock.createNiceMock(Argument.class));
		fixture.describes = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.identifier = "";
		fixture.description = "";
		Argument newHasStructure = EasyMock.createMock(Argument.class);
		// add mock object expectations here

		EasyMock.replay(newHasStructure);

		fixture.setHasStructure(newHasStructure);

		EasyMock.verify(newHasStructure);

	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
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
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@After
	public void tearDown()
		throws Exception {
	}
}