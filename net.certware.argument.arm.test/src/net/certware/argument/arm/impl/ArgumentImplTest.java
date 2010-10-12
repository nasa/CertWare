package net.certware.argument.arm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Collection;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;

import org.easymock.EasyMock;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ArgumentImplTest</code> contains tests for the class <code>{@link ArgumentImpl}</code>.
 * <p>
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC.  All rights reserved.
 *
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class ArgumentImplTest {
	/**
	 * Run the ArgumentImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testArgumentImpl_1()
		throws Exception {

		ArgumentImpl result = new ArgumentImpl();

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
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 4;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertNotNull(result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 5;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertNotNull(result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 6;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		assertNotNull(result);
		// fail("unverified");
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEInverseRemove_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(InternalEList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 4;
		NotificationChain msgs = EasyMock.createMock(NotificationChain.class);
		// add mock object expectations here

		EasyMock.replay(otherEnd);
		EasyMock.replay(msgs);

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

		EasyMock.verify(otherEnd);
		EasyMock.verify(msgs);
		assertEquals(null, result);
		// fail("unverified");
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEInverseRemove_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(InternalEList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 5;
		NotificationChain msgs = EasyMock.createMock(NotificationChain.class);
		// add mock object expectations here

		EasyMock.replay(otherEnd);
		EasyMock.replay(msgs);

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

		EasyMock.verify(otherEnd);
		EasyMock.verify(msgs);
		assertEquals(null, result);
		// fail("unverified");
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEInverseRemove_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(InternalEList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 6;
		NotificationChain msgs = EasyMock.createMock(NotificationChain.class);
		// add mock object expectations here

		EasyMock.replay(otherEnd);
		EasyMock.replay(msgs);

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

		EasyMock.verify(otherEnd);
		EasyMock.verify(msgs);
		assertEquals(null, result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = null;
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(false, result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = null;
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(false, result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		// fail("unverified");
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEIsSet_7()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 6;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		// fail("unverified");
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEIsSet_8()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = null;
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 6;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(false, result);
		// fail("unverified");
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEIsSet_9()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 6;

		boolean result = fixture.eIsSet(featureID);

		assertEquals(true, result);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 4;
		Object newValue = EasyMock.createMock(Collection.class);
		// add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		EasyMock.verify(newValue);
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 5;
		Object newValue = EasyMock.createMock(Collection.class);
		// add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		EasyMock.verify(newValue);
		// fail("unverified");
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testESet_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 6;
		Object newValue = EasyMock.createMock(Collection.class);
		// add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		EasyMock.verify(newValue);
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EClass result = fixture.eStaticClass();

		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(7, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.arm.Argument", result.getInstanceClassName());
		assertEquals(2, result.getClassifierID());
		assertEquals("net.certware.argument.arm.Argument", result.getInstanceTypeName());
		assertEquals("Argument", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 4;

		fixture.eUnset(featureID);

		// fail("unverified");
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
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 5;

		fixture.eUnset(featureID);

		// fail("unverified");
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testEUnset_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";
		int featureID = 6;

		fixture.eUnset(featureID);

		// fail("unverified");
	}

	/**
	 * Run the EList<Argument> getContainsArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetContainsArgument_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = null;
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EList<Argument> result = fixture.getContainsArgument();

		assertNotNull(result);
		assertEquals(0, result.size());
		// fail("unverified");
	}

	/**
	 * Run the EList<Argument> getContainsArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetContainsArgument_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EList<Argument> result = fixture.getContainsArgument();

		assertNotNull(result);
		assertEquals(0, result.size());
		// fail("unverified");
	}

	/**
	 * Run the EList<ArgumentElement> getContainsArgumentElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetContainsArgumentElement_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = null;
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EList<ArgumentElement> result = fixture.getContainsArgumentElement();

		assertNotNull(result);
		assertEquals(0, result.size());
		// fail("unverified");
	}

	/**
	 * Run the EList<ArgumentElement> getContainsArgumentElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetContainsArgumentElement_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EList<ArgumentElement> result = fixture.getContainsArgumentElement();

		assertNotNull(result);
		assertEquals(0, result.size());
		// fail("unverified");
	}

	/**
	 * Run the EList<ArgumentLink> getContainsArgumentLink() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetContainsArgumentLink_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = null;
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EList<ArgumentLink> result = fixture.getContainsArgumentLink();

		assertNotNull(result);
		assertEquals(0, result.size());
		// fail("unverified");
	}

	/**
	 * Run the EList<ArgumentLink> getContainsArgumentLink() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testGetContainsArgumentLink_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.identifier = "";
		fixture.containsArgumentElement = EasyMock.createNiceMock(EList.class);
		fixture.description = "";
		fixture.containsArgument = EasyMock.createNiceMock(EList.class);
		fixture.containsArgumentLink = EasyMock.createNiceMock(EList.class);
		fixture.isTagged = EasyMock.createNiceMock(EList.class);
		fixture.content = "";

		EList<ArgumentLink> result = fixture.getContainsArgumentLink();

		assertNotNull(result);
		assertEquals(0, result.size());
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