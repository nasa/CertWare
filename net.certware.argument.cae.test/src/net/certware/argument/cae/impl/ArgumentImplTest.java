package net.certware.argument.cae.impl;

import java.util.Collection;
import org.easymock.EasyMock;
import org.eclipse.emf.common.notify.NotificationChain;
import net.certware.argument.cae.Justification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import net.certware.argument.cae.Evidence;
import net.certware.argument.cae.Claim;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ArgumentImplTest</code> contains tests for the class <code>{@link ArgumentImpl}</code>.
 * <p>
 * Copyright (c) 2010 Kestrel Technology LLC.  All rights reserved.
 *
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
public class ArgumentImplTest {
	/**
	 * Run the ArgumentImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testArgumentImpl_1()
		throws Exception {

		ArgumentImpl result = new ArgumentImpl();

		// TODO: add additional test code here
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
	}

	/**
	 * Run the Object eGet(int,boolean,boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEGet_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 4;
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEGet_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 5;
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEGet_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 6;
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEInverseRemove_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(InternalEList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 4;
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEInverseRemove_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(InternalEList.class);
		InternalEObject otherEnd = EasyMock.createMock(InternalEObject.class);
		int featureID = 5;
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEInverseRemove_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(InternalEList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
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
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = null;
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 4;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_4()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_5()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = null;
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_6()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 5;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean eIsSet(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_7()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_8()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = null;
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEIsSet_9()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 6;

		boolean result = fixture.eIsSet(featureID);

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the void eSet(int,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testESet_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 4;
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testESet_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 5;
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testESet_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 6;
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
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEStaticClass_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);

		EClass result = fixture.eStaticClass();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isInterface());
		assertEquals(false, result.isAbstract());
		assertEquals(7, result.getFeatureCount());
		assertEquals(0, result.getOperationCount());
		assertEquals(null, result.getEIDAttribute());
		assertEquals(null, result.getDefaultValue());
		assertEquals("net.certware.argument.cae.Argument", result.getInstanceClassName());
		assertEquals(1, result.getClassifierID());
		assertEquals("net.certware.argument.cae.Argument", result.getInstanceTypeName());
		assertEquals("Argument", result.getName());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEUnset_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 4;

		fixture.eUnset(featureID);

		// TODO: add additional test code here
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEUnset_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 5;

		fixture.eUnset(featureID);

		// TODO: add additional test code here
	}

	/**
	 * Run the void eUnset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testEUnset_3()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);
		int featureID = 6;

		fixture.eUnset(featureID);

		// TODO: add additional test code here
	}

	/**
	 * Run the EList<Claim> getClaims() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testGetClaims_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = null;
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);

		EList<Claim> result = fixture.getClaims();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Claim> getClaims() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testGetClaims_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);

		EList<Claim> result = fixture.getClaims();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Evidence> getEvidence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testGetEvidence_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = null;

		EList<Evidence> result = fixture.getEvidence();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Evidence> getEvidence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testGetEvidence_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);

		EList<Evidence> result = fixture.getEvidence();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Justification> getJustification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testGetJustification_1()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = null;
		fixture.evidence = EasyMock.createNiceMock(EList.class);

		EList<Justification> result = fixture.getJustification();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Run the EList<Justification> getJustification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testGetJustification_2()
		throws Exception {
		ArgumentImpl fixture = new ArgumentImpl();
		fixture.claims = EasyMock.createNiceMock(EList.class);
		fixture.justification = EasyMock.createNiceMock(EList.class);
		fixture.evidence = EasyMock.createNiceMock(EList.class);

		EList<Justification> result = fixture.getJustification();

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