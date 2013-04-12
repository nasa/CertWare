/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import net.certware.argument.arm.TaggedValue;

import org.easymock.EasyMock;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ModelElementImplTest</code> contains tests for the class <code>{@link ModelElementImpl}</code>.
 * @generatedBy CodePro at 10/12/10 1:33 PM
 * @author mrb
 */
public class ModelElementImplTest {
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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl10();
		int featureID = 0;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertEquals(null, result);
		
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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl11();
		int featureID = 1;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertEquals(null, result);
		
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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl12();
		int featureID = 2;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertEquals(null, result);
		
	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEGet_4()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl2();
		int featureID = 3;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertNotNull(result);
		
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testEInverseRemove_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl();
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 3;
		NotificationChain msgs = EasyMock.createMock(NotificationChain.class);
		// add mock object expectations here

		EasyMock.replay(otherEnd);
		EasyMock.replay(msgs);

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

		EasyMock.verify(otherEnd);
		EasyMock.verify(msgs);
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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl10();
		int featureID = 0;

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
	public void testEIsSet_2()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl11();
		int featureID = 0;

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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl12();
		int featureID = 0;

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
	public void testEIsSet_4()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl2();
		int featureID = 1;

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
	public void testEIsSet_5()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl3();
		int featureID = 1;

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
	public void testEIsSet_6()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl4();
		int featureID = 1;

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
	public void testEIsSet_7()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl5();
		int featureID = 2;

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
	public void testEIsSet_8()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl6();
		int featureID = 2;

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
	public void testEIsSet_9()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl7();
		int featureID = 2;

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
	public void testEIsSet_10()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl8();
		int featureID = 3;

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
	public void testEIsSet_11()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl9();
		int featureID = 3;

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
	public void testEIsSet_12()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl();
		int featureID = 3;

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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl3();
		int featureID = 0;
		Object newValue = "";

		fixture.eSet(featureID, newValue);

		
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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl4();
		int featureID = 1;
		Object newValue = "";

		fixture.eSet(featureID, newValue);

		
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testESet_3()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl5();
		int featureID = 2;
		Object newValue = "";

		fixture.eSet(featureID, newValue);

		
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testESet_4()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl6();
		int featureID = 3;
		Object newValue = EasyMock.createMock(Collection.class);
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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl();

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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl7();
		int featureID = 0;

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
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl8();
		int featureID = 1;

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
	public void testEUnset_3()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl9();
		int featureID = 2;

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
	public void testEUnset_4()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl();
		int featureID = 3;

		fixture.eUnset(featureID);

		
	}

	/**
	 * Run the String getContent() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetContent_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl5();

		String result = fixture.getContent();

		assertEquals(null, result);
		
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl2();

		String result = fixture.getDescription();

		assertEquals(null, result);
		
	}

	/**
	 * Run the String getIdentifier() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetIdentifier_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl10();

		String result = fixture.getIdentifier();

		assertEquals(null, result);
		
	}

	/**
	 * Run the EList<TaggedValue> getIsTagged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetIsTagged_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl8();

		EList<TaggedValue> result = fixture.getIsTagged();

		assertNotNull(result);
		assertEquals(0, result.size());
		
	}

	/**
	 * Run the EList<TaggedValue> getIsTagged() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetIsTagged_2()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl9();

		EList<TaggedValue> result = fixture.getIsTagged();

		assertNotNull(result);
		assertEquals(0, result.size());
		
	}

	/**
	 * Run the void setContent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testSetContent_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl6();
		String newContent = "";

		fixture.setContent(newContent);

		
	}

	/**
	 * Run the void setContent(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testSetContent_2()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl7();
		String newContent = "";

		fixture.setContent(newContent);

		
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testSetDescription_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl3();
		String newDescription = "";

		fixture.setDescription(newDescription);

		
	}

	/**
	 * Run the void setDescription(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testSetDescription_2()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl4();
		String newDescription = "";

		fixture.setDescription(newDescription);

		
	}

	/**
	 * Run the void setIdentifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testSetIdentifier_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl11();
		String newIdentifier = "";

		fixture.setIdentifier(newIdentifier);

		
	}

	/**
	 * Run the void setIdentifier(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testSetIdentifier_2()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl12();
		String newIdentifier = "";

		fixture.setIdentifier(newIdentifier);

		
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl10();

		String result = fixture.toString();

		assertEquals("net.certware.argument.arm.impl.ClaimImpl@20222906 (identifier: null, description: null, content: null) (assumed: false, toBeSupported: false)", result);
		
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testToString_2()
		throws Exception {
		ModelElementImpl fixture = ModelElementImplFactory.createModelElementImpl11();

		String result = fixture.toString();

		assertEquals("net.certware.argument.arm.impl.EvidenceAssertionImpl@2cb207af (identifier: null, description: null, content: null) (assumed: false, toBeSupported: false)", result);
		
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