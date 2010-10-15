package net.certware.argument.cae.impl;

import java.util.Collection;
import org.easymock.EasyMock;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import net.certware.argument.cae.Assumption;
import org.eclipse.emf.ecore.EClass;
import net.certware.argument.cae.Argument;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import net.certware.argument.cae.Context;
import net.certware.argument.cae.Evidence;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClaimImplTest</code> contains tests for the class <code>{@link ClaimImpl}</code>.
 * <p>
 * Copyright (c) 2010 Kestrel Technology LLC.  All rights reserved.
 *
 * @generatedBy CodePro at 10/13/10 4:48 PM
 * @author mrb
 */
public class ClaimImplTest {
	/**
	 * Run the ClaimImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testClaimImpl_1()
		throws Exception {

		ClaimImpl result = new ClaimImpl();

		// TODO: add additional test code here
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
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 6;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEGet_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 7;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEGet_3()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 8;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEGet_4()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 9;
		boolean resolve = true;
		boolean coreType = true;

		Object result = fixture.eGet(featureID, resolve, coreType);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEInverseRemove_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(InternalEList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 6;
		NotificationChain msgs = EasyMock.createMock(NotificationChain.class);
		// TODO: add mock object expectations here

		EasyMock.replay(otherEnd);
		EasyMock.replay(msgs);

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

		// TODO: add additional test code here
		EasyMock.verify(otherEnd);
		EasyMock.verify(msgs);
		assertEquals(null, result);
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEInverseRemove_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(InternalEList.class);
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 7;
		NotificationChain msgs = EasyMock.createMock(NotificationChain.class);
		// TODO: add mock object expectations here

		EasyMock.replay(otherEnd);
		EasyMock.replay(msgs);

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

		// TODO: add additional test code here
		EasyMock.verify(otherEnd);
		EasyMock.verify(msgs);
		assertEquals(null, result);
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEInverseRemove_3()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(InternalEList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 8;
		NotificationChain msgs = EasyMock.createMock(NotificationChain.class);
		// TODO: add mock object expectations here

		EasyMock.replay(otherEnd);
		EasyMock.replay(msgs);

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

		// TODO: add additional test code here
		EasyMock.verify(otherEnd);
		EasyMock.verify(msgs);
		assertEquals(null, result);
	}

	/**
	 * Run the NotificationChain eInverseRemove(InternalEObject,int,NotificationChain) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEInverseRemove_4()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(InternalEList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 9;
		NotificationChain msgs = EasyMock.createMock(NotificationChain.class);
		// TODO: add mock object expectations here

		EasyMock.replay(otherEnd);
		EasyMock.replay(msgs);

		NotificationChain result = fixture.eInverseRemove(otherEnd, featureID, msgs);

		// TODO: add additional test code here
		EasyMock.verify(otherEnd);
		EasyMock.verify(msgs);
		assertEquals(null, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 6;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = null;
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 6;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_3()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 6;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_4()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 7;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_5()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = null;
		int featureID = 7;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_6()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 7;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_7()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 8;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_8()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = null;
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 8;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_9()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 8;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_10()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 9;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_11()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = null;
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 9;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEIsSet_12()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 9;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testESet_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 6;
		Object newValue = EasyMock.createMock(Collection.class);
		// TODO: add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		// TODO: add additional test code here
		EasyMock.verify(newValue);
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testESet_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 7;
		Object newValue = EasyMock.createMock(Collection.class);
		// TODO: add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		// TODO: add additional test code here
		EasyMock.verify(newValue);
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testESet_3()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 8;
		Object newValue = EasyMock.createMock(Collection.class);
		// TODO: add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		// TODO: add additional test code here
		EasyMock.verify(newValue);
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testESet_4()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 9;
		Object newValue = EasyMock.createMock(Collection.class);
		// TODO: add mock object expectations here

		EasyMock.replay(newValue);

		fixture.eSet(featureID, newValue);

		// TODO: add additional test code here
		EasyMock.verify(newValue);
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
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);

		EClass result = fixture.eStaticClass();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(10, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.cae.Claim", result.getInstanceClassName());
		assertEquals(0, result.getClassifierID());
		assertEquals("net.certware.argument.cae.Claim", result.getInstanceTypeName());
		assertEquals("Claim", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEUnset_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 6;

		fixture.eUnset(featureID);

		// TODO: add additional test code here
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEUnset_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 7;

		fixture.eUnset(featureID);

		// TODO: add additional test code here
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEUnset_3()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 8;

		fixture.eUnset(featureID);

		// TODO: add additional test code here
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testEUnset_4()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);
		int featureID = 9;

		fixture.eUnset(featureID);

		// TODO: add additional test code here
	}

	/**
	 * Run the EList<Assumption> getAssumption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testGetAssumption_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = null;

		EList<Assumption> result = fixture.getAssumption();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Assumption> getAssumption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testGetAssumption_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);

		EList<Assumption> result = fixture.getAssumption();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Context> getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testGetContext_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = null;
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);

		EList<Context> result = fixture.getContext();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Context> getContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testGetContext_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);

		EList<Context> result = fixture.getContext();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Evidence> getSolution() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testGetSolution_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = null;
		fixture.assumption = EasyMock.createNiceMock(EList.class);

		EList<Evidence> result = fixture.getSolution();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Evidence> getSolution() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testGetSolution_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);

		EList<Evidence> result = fixture.getSolution();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Argument> getStrategy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testGetStrategy_1()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = null;
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);

		EList<Argument> result = fixture.getStrategy();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Argument> getStrategy() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:48 PM
	 */
	@Test
	public void testGetStrategy_2()
		throws Exception {
		ClaimImpl fixture = new ClaimImpl();
		fixture.strategy = EasyMock.createNiceMock(EList.class);
		fixture.context = EasyMock.createNiceMock(EList.class);
		fixture.solution = EasyMock.createNiceMock(EList.class);
		fixture.assumption = EasyMock.createNiceMock(EList.class);

		EList<Argument> result = fixture.getStrategy();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
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