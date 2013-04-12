/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */

package net.certware.argument.cae.util;

import org.easymock.EasyMock;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import net.certware.argument.cae.Justification;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.cae.Argument;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.cae.Assumption;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.cae.Context;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.AssertedEvidence;
import org.junit.*;
import net.certware.argument.cae.Evidence;
import static org.junit.Assert.*;

/**
 * The class <code>CaeSwitchTest</code> contains tests for the class <code>{@link CaeSwitch}</code>.
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
public class CaeSwitchTest {
	/**
	 * Run the CaeSwitch() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaeSwitch_1()
		throws Exception {

		CaeSwitch result = new CaeSwitch();

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CaeSwitch() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaeSwitch_2()
		throws Exception {

		CaeSwitch result = new CaeSwitch();

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object caseArgument(Argument) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseArgument_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		Argument object = EasyMock.createMock(Argument.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseArgument(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseArgumentElement(ArgumentElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseArgumentElement_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		ArgumentElement object = EasyMock.createMock(ArgumentElement.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseArgumentElement(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseArgumentLink(ArgumentLink) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseArgumentLink_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		ArgumentLink object = EasyMock.createMock(ArgumentLink.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseArgumentLink(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseArm_Claim(Claim) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseArm_Claim_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		Claim object = EasyMock.createMock(Claim.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseArm_Claim(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseAssertedEvidence(AssertedEvidence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseAssertedEvidence_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		AssertedEvidence object = EasyMock.createMock(AssertedEvidence.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssertedEvidence(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseAssertedRelationship(AssertedRelationship) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseAssertedRelationship_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		AssertedRelationship object = EasyMock.createMock(AssertedRelationship.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssertedRelationship(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseAssumption(Assumption) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseAssumption_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		Assumption object = EasyMock.createMock(Assumption.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssumption(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseClaim(Claim) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseClaim_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		net.certware.argument.cae.Claim object = EasyMock.createMock(net.certware.argument.cae.Claim.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseClaim(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseContext(Context) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseContext_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		Context object = EasyMock.createMock(Context.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseContext(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseEvidence(Evidence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseEvidence_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		Evidence object = EasyMock.createMock(Evidence.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseEvidence(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseInformationElement(InformationElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseInformationElement_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		InformationElement object = EasyMock.createMock(InformationElement.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseInformationElement(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseJustification(Justification) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseJustification_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		Justification object = EasyMock.createMock(Justification.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseJustification(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseModelElement(ModelElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseModelElement_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		ModelElement object = EasyMock.createMock(ModelElement.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseModelElement(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object caseReasoningElement(ReasoningElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testCaseReasoningElement_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		ReasoningElement object = EasyMock.createMock(ReasoningElement.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseReasoningElement(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object defaultCase(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDefaultCase_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		EObject object = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.defaultCase(object);

		// TODO: add additional test code here
		EasyMock.verify(object);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDoSwitch_1()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		EObject theEObject = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertNotNull(result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_2()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 0;
		EObject theEObject = EasyMock.createMock(net.certware.argument.cae.Claim.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_3()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 0;
		EObject theEObject = EasyMock.createMock(net.certware.argument.cae.Claim.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_4()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 1;
		EObject theEObject = EasyMock.createMock(Argument.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_5()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 1;
		EObject theEObject = EasyMock.createMock(Argument.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_6()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 2;
		EObject theEObject = EasyMock.createMock(Evidence.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_7()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 2;
		EObject theEObject = EasyMock.createMock(Evidence.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_8()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 3;
		EObject theEObject = EasyMock.createMock(Assumption.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_9()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 3;
		EObject theEObject = EasyMock.createMock(Assumption.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_10()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 4;
		EObject theEObject = EasyMock.createMock(Context.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_11()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 4;
		EObject theEObject = EasyMock.createMock(Context.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_12()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 5;
		EObject theEObject = EasyMock.createMock(Justification.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_13()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 5;
		EObject theEObject = EasyMock.createMock(Justification.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test
	public void testDoSwitch_14()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		int classifierID = 6;
		EObject theEObject = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEObject);
		assertEquals(null, result);
	}

	/**
	 * Run the Object doSwitch(EClass,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoSwitch_15()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		EClass theEClass = EasyMock.createMock(EClass.class);
		EObject theEObject = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEClass);
		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(theEClass, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEClass);
		EasyMock.verify(theEObject);
		assertNotNull(result);
	}

	/**
	 * Run the Object doSwitch(EClass,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoSwitch_16()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		EClass theEClass = EasyMock.createMock(EClass.class);
		EObject theEObject = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEClass);
		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(theEClass, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEClass);
		EasyMock.verify(theEObject);
		assertNotNull(result);
	}

	/**
	 * Run the Object doSwitch(EClass,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 4:49 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoSwitch_17()
		throws Exception {
		CaeSwitch fixture = new CaeSwitch();
		EClass theEClass = EasyMock.createMock(EClass.class);
		EObject theEObject = EasyMock.createMock(EObject.class);
		// TODO: add mock object expectations here

		EasyMock.replay(theEClass);
		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(theEClass, theEObject);

		// TODO: add additional test code here
		EasyMock.verify(theEClass);
		EasyMock.verify(theEObject);
		assertNotNull(result);
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