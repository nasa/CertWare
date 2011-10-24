/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;

import org.easymock.EasyMock;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>CitationElementImplTest</code> contains tests for the class <code>{@link CitationElementImpl}</code>.
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class CitationElementImplTest {
	/**
	 * Run the CitationElementImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCitationElementImpl_1()
		throws Exception {

		CitationElementImpl result = new CitationElementImpl();

		assertNotNull(result);
		assertEquals(null, result.getRefersToArgumentElement());
		assertEquals(null, result.getRefersToArgument());
		assertEquals(null, result.basicGetRefersToArgumentElement());
		assertEquals(null, result.basicGetRefersToArgument());
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
	 * Run the Argument basicGetRefersToArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testBasicGetRefersToArgument_1()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		Argument result = fixture.basicGetRefersToArgument();

		assertNotNull(result);
		assertEquals(null, result.getContainsArgumentElement());
		
	}

	/**
	 * Run the ArgumentElement basicGetRefersToArgumentElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testBasicGetRefersToArgumentElement_1()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		ArgumentElement result = fixture.basicGetRefersToArgumentElement();

		assertNotNull(result);
		assertEquals(null, result.getContent());
		
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 4;
		boolean resolve = false;
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEIsSet_1()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement((ArgumentElement) null);
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument((Argument) null);
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 4;
		Object newValue = EasyMock.createMock(ArgumentElement.class);
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
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
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EClass result = fixture.eStaticClass();

		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(6, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.arm.CitationElement", result.getInstanceClassName());
		assertEquals(17, result.getClassifierID());
		assertEquals("net.certware.argument.arm.CitationElement", result.getInstanceTypeName());
		assertEquals("CitationElement", result.getName());
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
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
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 5;

		fixture.eUnset(featureID);

		
	}

	/**
	 * Run the Argument getRefersToArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgument_1()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		Argument result = fixture.getRefersToArgument();

		assertNotNull(result);
		
	}

	/**
	 * Run the Argument getRefersToArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgument_2()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		Argument result = fixture.getRefersToArgument();

		assertNotNull(result);
		
	}

	/**
	 * Run the Argument getRefersToArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgument_3()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		Argument result = fixture.getRefersToArgument();

		assertNotNull(result);
		
	}

	/**
	 * Run the Argument getRefersToArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgument_4()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument((Argument) null);
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		Argument result = fixture.getRefersToArgument();

		assertEquals(null, result);
		
	}

	/**
	 * Run the Argument getRefersToArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgument_5()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		Argument result = fixture.getRefersToArgument();

		assertNotNull(result);
		
	}

	/**
	 * Run the ArgumentElement getRefersToArgumentElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgumentElement_1()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		ArgumentElement result = fixture.getRefersToArgumentElement();

		assertNotNull(result);
		
	}

	/**
	 * Run the ArgumentElement getRefersToArgumentElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgumentElement_2()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		ArgumentElement result = fixture.getRefersToArgumentElement();

		assertNotNull(result);
		
	}

	/**
	 * Run the ArgumentElement getRefersToArgumentElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgumentElement_3()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		ArgumentElement result = fixture.getRefersToArgumentElement();

		assertNotNull(result);
		
	}

	/**
	 * Run the ArgumentElement getRefersToArgumentElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgumentElement_4()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement((ArgumentElement) null);
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		ArgumentElement result = fixture.getRefersToArgumentElement();

		assertEquals(null, result);
		
	}

	/**
	 * Run the ArgumentElement getRefersToArgumentElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetRefersToArgumentElement_5()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		ArgumentElement result = fixture.getRefersToArgumentElement();

		assertNotNull(result);
		
	}

	/**
	 * Run the void setRefersToArgument(Argument) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testSetRefersToArgument_1()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		Argument newRefersToArgument = EasyMock.createMock(Argument.class);
		// add mock object expectations here

		EasyMock.replay(newRefersToArgument);

		fixture.setRefersToArgument(newRefersToArgument);

		EasyMock.verify(newRefersToArgument);
		
	}

	/**
	 * Run the void setRefersToArgument(Argument) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testSetRefersToArgument_2()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		Argument newRefersToArgument = EasyMock.createMock(Argument.class);
		// add mock object expectations here

		EasyMock.replay(newRefersToArgument);

		fixture.setRefersToArgument(newRefersToArgument);

		EasyMock.verify(newRefersToArgument);
		
	}

	/**
	 * Run the void setRefersToArgumentElement(ArgumentElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testSetRefersToArgumentElement_1()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		ArgumentElement newRefersToArgumentElement = EasyMock.createMock(ArgumentElement.class);
		// add mock object expectations here

		EasyMock.replay(newRefersToArgumentElement);

		fixture.setRefersToArgumentElement(newRefersToArgumentElement);

		EasyMock.verify(newRefersToArgumentElement);
		
	}

	/**
	 * Run the void setRefersToArgumentElement(ArgumentElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testSetRefersToArgumentElement_2()
		throws Exception {
		CitationElementImpl fixture = new CitationElementImpl();
		fixture.setRefersToArgumentElement(EasyMock.createNiceMock(ArgumentElement.class));
		fixture.setRefersToArgument(EasyMock.createNiceMock(Argument.class));
		fixture.description = "";
		fixture.identifier = "";
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		ArgumentElement newRefersToArgumentElement = EasyMock.createMock(ArgumentElement.class);
		// add mock object expectations here

		EasyMock.replay(newRefersToArgumentElement);

		fixture.setRefersToArgumentElement(newRefersToArgumentElement);

		EasyMock.verify(newRefersToArgumentElement);
		
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