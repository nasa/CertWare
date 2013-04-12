/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import net.certware.argument.arm.ModelElement;

import org.easymock.EasyMock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ArgumentLinkImplTest</code> contains tests for the class <code>{@link ArgumentLinkImpl}</code>.
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class ArgumentLinkImplTest {
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
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
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
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
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
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
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
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = null;
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
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
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
	public void testEIsSet_4()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
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
	public void testEIsSet_5()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = null;
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
		int featureID = 5;

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
	public void testEIsSet_6()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		
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
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testESet_2()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
		int featureID = 5;
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEUnset_1()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
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
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);
		int featureID = 5;

		fixture.eUnset(featureID);

		
	}

	/**
	 * Run the EList<ModelElement> getSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetSource_1()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = null;
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);

		EList<ModelElement> result = fixture.getSource();

		assertNotNull(result);
		assertEquals(0, result.size());
		
	}

	/**
	 * Run the EList<ModelElement> getSource() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetSource_2()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);

		EList<ModelElement> result = fixture.getSource();

		assertNotNull(result);
		assertEquals(0, result.size());
		
	}

	/**
	 * Run the EList<ModelElement> getTarget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetTarget_1()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = null;

		EList<ModelElement> result = fixture.getTarget();

		assertNotNull(result);
		assertEquals(0, result.size());
		
	}

	/**
	 * Run the EList<ModelElement> getTarget() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetTarget_2()
		throws Exception {
		AnnotationImpl fixture = new AnnotationImpl();
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.identifier = "";
		fixture.source = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		fixture.description = "";
		fixture.target = EasyMock.createNiceMock(EList.class);

		EList<ModelElement> result = fixture.getTarget();

		assertNotNull(result);
		assertEquals(0, result.size());
		
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