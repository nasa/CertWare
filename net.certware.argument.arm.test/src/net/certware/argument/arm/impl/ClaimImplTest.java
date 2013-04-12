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
 * The class <code>ClaimImplTest</code> contains tests for the class <code>{@link ClaimImpl}</code>.
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class ClaimImplTest {
	/**
	 * Run the ClaimImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testClaimImpl_1()
		throws Exception {

		ClaimImpl result = new ClaimImpl();

		assertNotNull(result);
		assertEquals(false, result.isAssumed());
		assertEquals(false, result.isToBeSupported());
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
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEGet_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(false);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEGet_3()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEGet_4()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(false);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 5;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertNotNull(result);
		
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEIsSet_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEIsSet_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(false);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(false, result);
		
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEIsSet_3()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEIsSet_4()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(false);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(false, result);
		
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testESet_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 4;
		Object newValue = new Boolean(true);

		fixture.eSet(featureID, newValue);

		
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testESet_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 5;
		Object newValue = new Boolean(true);

		fixture.eSet(featureID, newValue);

		
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
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";

		EClass result = fixture.eStaticClass();

		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(6, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.arm.Claim", result.getInstanceClassName());
		assertEquals(13, result.getClassifierID());
		assertEquals("net.certware.argument.arm.Claim", result.getInstanceTypeName());
		assertEquals("Claim", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEUnset_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 4;

		fixture.eUnset(featureID);

		
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEUnset_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		int featureID = 5;

		fixture.eUnset(featureID);

		
	}

	/**
	 * Run the boolean isAssumed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testIsAssumed_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";

		boolean result = fixture.isAssumed();

		assertEquals(true, result);
		
	}

	/**
	 * Run the boolean isAssumed() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testIsAssumed_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(false);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";

		boolean result = fixture.isAssumed();

		assertEquals(false, result);
		
	}

	/**
	 * Run the boolean isToBeSupported() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testIsToBeSupported_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";

		boolean result = fixture.isToBeSupported();

		assertEquals(true, result);
		
	}

	/**
	 * Run the boolean isToBeSupported() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testIsToBeSupported_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(false);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";

		boolean result = fixture.isToBeSupported();

		assertEquals(false, result);
		
	}

	/**
	 * Run the void setAssumed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testSetAssumed_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		boolean newAssumed = true;

		fixture.setAssumed(newAssumed);

		
	}

	/**
	 * Run the void setAssumed(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testSetAssumed_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		boolean newAssumed = true;

		fixture.setAssumed(newAssumed);

		
	}

	/**
	 * Run the void setToBeSupported(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testSetToBeSupported_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		boolean newToBeSupported = true;

		fixture.setToBeSupported(newToBeSupported);

		
	}

	/**
	 * Run the void setToBeSupported(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testSetToBeSupported_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";
		boolean newToBeSupported = true;

		fixture.setToBeSupported(newToBeSupported);

		
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";

		String result = fixture.toString();

		assertEquals("net.certware.argument.arm.impl.ClaimImpl@39288139 (identifier: , description: , content: ) (assumed: true, toBeSupported: true)", result);
		
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.setAssumed(true);
		fixture.setToBeSupported(true);
		fixture.description = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.content = "";

		String result = fixture.toString();

		assertEquals("net.certware.argument.arm.impl.ClaimImpl@b3d637f (identifier: , description: , content: ) (assumed: true, toBeSupported: true)", result);
		
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