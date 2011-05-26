package net.certware.argument.cae.impl;

import org.easymock.EasyMock;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import net.certware.argument.cae.Justification;
import net.certware.argument.cae.Argument;
import net.certware.argument.cae.CaePackage;
import net.certware.argument.cae.CaeFactory;
import net.certware.argument.cae.Assumption;
import net.certware.argument.cae.Context;
import net.certware.argument.cae.Evidence;
import net.certware.argument.cae.Claim;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CaeFactoryImplTest</code> contains tests for the class <code>{@link CaeFactoryImpl}</code>.
 * <p>
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved..  All rights reserved.
 *
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
public class CaeFactoryImplTest {
	/**
	 * Run the CaeFactoryImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaeFactoryImpl_1()
		throws Exception {

		CaeFactoryImpl result = new CaeFactoryImpl();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCaePackage());
		assertEquals(null, result.getEPackage());
		assertEquals(null, result.eInternalContainer());
		assertEquals(true, result.eDeliver());
		assertEquals(false, result.eIsProxy());
		assertEquals(0, result.eContainerFeatureID());
		assertEquals(null, result.eDirectResource());
		assertEquals(null, result.eProxyURI());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(null, result.eInternalResource());
		assertEquals(null, result.eStore());
		assertEquals(false, result.eNotificationRequired());
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreate_1()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// TODO: add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		// TODO: add additional test code here
		EasyMock.verify(eClass);
		assertNotNull(result);
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreate_2()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// TODO: add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		// TODO: add additional test code here
		EasyMock.verify(eClass);
		assertNotNull(result);
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreate_3()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// TODO: add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		// TODO: add additional test code here
		EasyMock.verify(eClass);
		assertNotNull(result);
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreate_4()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// TODO: add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		// TODO: add additional test code here
		EasyMock.verify(eClass);
		assertNotNull(result);
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreate_5()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// TODO: add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		// TODO: add additional test code here
		EasyMock.verify(eClass);
		assertNotNull(result);
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreate_6()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// TODO: add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		// TODO: add additional test code here
		EasyMock.verify(eClass);
		assertNotNull(result);
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreate_7()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// TODO: add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		// TODO: add additional test code here
		EasyMock.verify(eClass);
		assertNotNull(result);
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Argument createArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateArgument_1()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();

		Argument result = fixture.createArgument();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifier());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Assumption createAssumption() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateAssumption_1()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();

		Assumption result = fixture.createAssumption();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifier());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Claim createClaim() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateClaim_1()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();

		Claim result = fixture.createClaim();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isAssumed());
		assertEquals(false, result.isToBeSupported());
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifier());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Context createContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateContext_1()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();

		Context result = fixture.createContext();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifier());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Evidence createEvidence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateEvidence_1()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();

		Evidence result = fixture.createEvidence();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifier());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the Justification createJustification() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCreateJustification_1()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();

		Justification result = fixture.createJustification();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getContent());
		assertEquals(null, result.getIdentifier());
		assertEquals(null, result.getDescription());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the CaePackage getCaePackage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testGetCaePackage_1()
		throws Exception {
		CaeFactoryImpl fixture = new CaeFactoryImpl();

		CaePackage result = fixture.getCaePackage();

		// TODO: add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the CaePackage getPackage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testGetPackage_1()
		throws Exception {

		@SuppressWarnings("deprecation")
		CaePackage result = CaeFactoryImpl.getPackage();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals("http://www.certware.net/cae", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("cae", result.getNsPrefix());
		assertEquals("cae", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the CaeFactory init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {

		CaeFactory result = CaeFactoryImpl.init();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCaePackage());
		assertEquals(null, result.getEPackage());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
	}

	/**
	 * Run the CaeFactory init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {

		CaeFactory result = CaeFactoryImpl.init();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCaePackage());
		assertEquals(null, result.getEPackage());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
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