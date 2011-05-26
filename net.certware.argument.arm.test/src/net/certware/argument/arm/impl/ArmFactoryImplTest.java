package net.certware.argument.arm.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import net.certware.argument.arm.Annotation;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.AssertedChallenge;
import net.certware.argument.arm.AssertedContext;
import net.certware.argument.arm.AssertedCounterEvidence;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedInference;
import net.certware.argument.arm.CitationElement;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.EvidenceAssertion;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.TaggedValue;

import org.easymock.EasyMock;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ArmFactoryImplTest</code> contains tests for the class <code>{@link ArmFactoryImpl}</code>.
 * <p>
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved..  All rights reserved.
 *
 * @generatedBy CodePro at 10/12/10 1:33 PM
 * @author mrb
 */
public class ArmFactoryImplTest {
	/**
	 * Run the ArmFactoryImpl() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testArmFactoryImpl_1()
		throws Exception {

		ArmFactoryImpl result = new ArmFactoryImpl();

		assertNotNull(result);
		assertEquals(null, result.getArmPackage());
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
	 * Run the String convertBooleanToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testConvertBooleanToString_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		Object instanceValue = new Object();
		// add mock object expectations here

		EasyMock.replay(eDataType);

		String result = fixture.convertBooleanToString(eDataType, instanceValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the String convertIntegerToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testConvertIntegerToString_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		Object instanceValue = new Object();
		// add mock object expectations here

		EasyMock.replay(eDataType);

		String result = fixture.convertIntegerToString(eDataType, instanceValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the String convertStringToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testConvertStringToString_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		Object instanceValue = new Object();
		// add mock object expectations here

		EasyMock.replay(eDataType);

		String result = fixture.convertStringToString(eDataType, instanceValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the String convertToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testConvertToString_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		Object instanceValue = new Object();
		// add mock object expectations here

		EasyMock.replay(eDataType);

		String result = fixture.convertToString(eDataType, instanceValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the String convertToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testConvertToString_2()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		Object instanceValue = new Object();
		// add mock object expectations here

		EasyMock.replay(eDataType);

		String result = fixture.convertToString(eDataType, instanceValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the String convertToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testConvertToString_3()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		Object instanceValue = new Object();
		// add mock object expectations here

		EasyMock.replay(eDataType);

		String result = fixture.convertToString(eDataType, instanceValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the String convertToString(EDataType,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testConvertToString_4()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		Object instanceValue = new Object();
		// add mock object expectations here

		EasyMock.replay(eDataType);

		String result = fixture.convertToString(eDataType, instanceValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_2()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_3()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_4()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_5()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_6()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_7()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_8()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_9()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_10()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_11()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_12()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_13()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the EObject create(EClass) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreate_14()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EClass eClass = EasyMock.createMock(EClass.class);
		// add mock object expectations here

		EasyMock.replay(eClass);

		EObject result = fixture.create(eClass);

		EasyMock.verify(eClass);
		assertNotNull(result);
		
	}

	/**
	 * Run the Annotation createAnnotation() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateAnnotation_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		Annotation result = fixture.createAnnotation();

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
	 * Run the Argument createArgument() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateArgument_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		Argument result = fixture.createArgument();

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
	 * Run the ArgumentReasoning createArgumentReasoning() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateArgumentReasoning_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		ArgumentReasoning result = fixture.createArgumentReasoning();

		assertNotNull(result);
		assertEquals(null, result.getHasStructure());
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
	 * Run the AssertedChallenge createAssertedChallenge() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateAssertedChallenge_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		AssertedChallenge result = fixture.createAssertedChallenge();

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
	 * Run the AssertedContext createAssertedContext() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateAssertedContext_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		AssertedContext result = fixture.createAssertedContext();

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
	 * Run the AssertedCounterEvidence createAssertedCounterEvidence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateAssertedCounterEvidence_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		AssertedCounterEvidence result = fixture.createAssertedCounterEvidence();

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
	 * Run the AssertedEvidence createAssertedEvidence() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateAssertedEvidence_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		AssertedEvidence result = fixture.createAssertedEvidence();

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
	 * Run the AssertedInference createAssertedInference() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateAssertedInference_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		AssertedInference result = fixture.createAssertedInference();

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
	 * Run the Boolean createBooleanFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testCreateBooleanFromString_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		String initialValue = "";
		// add mock object expectations here

		EasyMock.replay(eDataType);

		Boolean result = fixture.createBooleanFromString(eDataType, initialValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the CitationElement createCitationElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateCitationElement_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		CitationElement result = fixture.createCitationElement();

		assertNotNull(result);
		assertEquals(null, result.getRefersToArgumentElement());
		assertEquals(null, result.getRefersToArgument());
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
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateClaim_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		Claim result = fixture.createClaim();

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
	 * Run the EvidenceAssertion createEvidenceAssertion() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateEvidenceAssertion_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		EvidenceAssertion result = fixture.createEvidenceAssertion();

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
	 * Run the Object createFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateFromString_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		String initialValue = "";
		// add mock object expectations here

		EasyMock.replay(eDataType);

		Object result = fixture.createFromString(eDataType, initialValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the Object createFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateFromString_2()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		String initialValue = "";
		// add mock object expectations here

		EasyMock.replay(eDataType);

		Object result = fixture.createFromString(eDataType, initialValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the Object createFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateFromString_3()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		String initialValue = "";
		// add mock object expectations here

		EasyMock.replay(eDataType);

		Object result = fixture.createFromString(eDataType, initialValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the Object createFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testCreateFromString_4()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		String initialValue = "";
		// add mock object expectations here

		EasyMock.replay(eDataType);

		Object result = fixture.createFromString(eDataType, initialValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the InformationElement createInformationElement() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateInformationElement_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		InformationElement result = fixture.createInformationElement();

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
	 * Run the Integer createIntegerFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testCreateIntegerFromString_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		String initialValue = "";
		// add mock object expectations here

		EasyMock.replay(eDataType);

		Integer result = fixture.createIntegerFromString(eDataType, initialValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the String createStringFromString(EDataType,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test(expected = java.lang.ClassCastException.class)
	public void testCreateStringFromString_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();
		EDataType eDataType = EasyMock.createMock(EDataType.class);
		String initialValue = "";
		// add mock object expectations here

		EasyMock.replay(eDataType);

		String result = fixture.createStringFromString(eDataType, initialValue);

		EasyMock.verify(eDataType);
		assertNotNull(result);
		
	}

	/**
	 * Run the TaggedValue createTaggedValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testCreateTaggedValue_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		TaggedValue result = fixture.createTaggedValue();

		assertNotNull(result);
		assertEquals(null, result.getValue());
		assertEquals(null, result.getKey());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		
	}

	/**
	 * Run the ArmPackage getArmPackage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetArmPackage_1()
		throws Exception {
		ArmFactoryImpl fixture = new ArmFactoryImpl();

		ArmPackage result = fixture.getArmPackage();

		assertEquals(null, result);
		
	}

	/**
	 * Run the ArmPackage getPackage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testGetPackage_1()
		throws Exception {

		ArmPackage result = ArmPackage.eINSTANCE;

		assertNotNull(result);
		assertEquals("http://www.omg.org/ARM", result.getNsURI());
		assertEquals(null, result.getESuperPackage());
		assertEquals("arm", result.getNsPrefix());
		assertEquals("arm", result.getName());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		
	}

	/**
	 * Run the ArmFactory init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testInit_1()
		throws Exception {

		ArmFactory result = ArmFactoryImpl.init();

		assertNotNull(result);
		assertEquals(null, result.getArmPackage());
		assertEquals(null, result.getEPackage());
		assertEquals(null, result.eResource());
		assertEquals(null, result.eContainer());
		assertEquals(null, result.eContainingFeature());
		assertEquals(null, result.eContainmentFeature());
		assertEquals(false, result.eIsProxy());
		assertEquals(true, result.eDeliver());
		
	}

	/**
	 * Run the ArmFactory init() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Test
	public void testInit_2()
		throws Exception {

		ArmFactory result = ArmFactoryImpl.init();

		assertNotNull(result);
		assertEquals(null, result.getArmPackage());
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