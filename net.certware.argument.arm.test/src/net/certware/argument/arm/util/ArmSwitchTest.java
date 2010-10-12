package net.certware.argument.arm.util;

import org.easymock.EasyMock;
import org.eclipse.emf.ecore.EClass;
import net.certware.argument.arm.EvidenceAssertion;
import net.certware.argument.arm.AssertedContext;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.CitationElement;
import net.certware.argument.arm.AssertedChallenge;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.AssertedEvidence;
import org.eclipse.emf.ecore.EObject;
import net.certware.argument.arm.AssertedInference;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.AssertedCounterEvidence;
import org.junit.*;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.Annotation;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ReasoningElement;
import static org.junit.Assert.*;

/**
 * The class <code>ArmSwitchTest</code> contains tests for the class <code>{@link ArmSwitch}</code>.
 * <p>
 * CertWare Project
 * Copyright (c) 2010 Kestrel Technology LLC.  All rights reserved.
 *
 * @generatedBy CodePro at 10/12/10 1:34 PM
 * @author mrb
 */
public class ArmSwitchTest {
	/**
	 * Run the ArmSwitch() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testArmSwitch_1()
		throws Exception {

		ArmSwitch result = new ArmSwitch();

		assertNotNull(result);
		
	}

	/**
	 * Run the ArmSwitch() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testArmSwitch_2()
		throws Exception {

		ArmSwitch result = new ArmSwitch();

		assertNotNull(result);
		
	}

	/**
	 * Run the Object caseAnnotation(Annotation) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseAnnotation_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		Annotation object = EasyMock.createMock(Annotation.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAnnotation(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseArgument(Argument) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseArgument_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		Argument object = EasyMock.createMock(Argument.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseArgument(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseArgumentElement(ArgumentElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseArgumentElement_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		ArgumentElement object = EasyMock.createMock(ArgumentElement.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseArgumentElement(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseArgumentLink(ArgumentLink) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseArgumentLink_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		ArgumentLink object = EasyMock.createMock(ArgumentLink.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseArgumentLink(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseArgumentReasoning(ArgumentReasoning) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseArgumentReasoning_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		ArgumentReasoning object = EasyMock.createMock(ArgumentReasoning.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseArgumentReasoning(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseAssertedChallenge(AssertedChallenge) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseAssertedChallenge_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		AssertedChallenge object = EasyMock.createMock(AssertedChallenge.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssertedChallenge(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseAssertedContext(AssertedContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseAssertedContext_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		AssertedContext object = EasyMock.createMock(AssertedContext.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssertedContext(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseAssertedCounterEvidence(AssertedCounterEvidence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseAssertedCounterEvidence_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		AssertedCounterEvidence object = EasyMock.createMock(AssertedCounterEvidence.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssertedCounterEvidence(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseAssertedEvidence(AssertedEvidence) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseAssertedEvidence_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		AssertedEvidence object = EasyMock.createMock(AssertedEvidence.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssertedEvidence(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseAssertedInference(AssertedInference) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseAssertedInference_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		AssertedInference object = EasyMock.createMock(AssertedInference.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssertedInference(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseAssertedRelationship(AssertedRelationship) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseAssertedRelationship_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		AssertedRelationship object = EasyMock.createMock(AssertedRelationship.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseAssertedRelationship(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseCitationElement(CitationElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseCitationElement_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		CitationElement object = EasyMock.createMock(CitationElement.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseCitationElement(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseClaim(Claim) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseClaim_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		Claim object = EasyMock.createMock(Claim.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseClaim(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseEvidenceAssertion(EvidenceAssertion) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseEvidenceAssertion_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		EvidenceAssertion object = EasyMock.createMock(EvidenceAssertion.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseEvidenceAssertion(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseInformationElement(InformationElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseInformationElement_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		InformationElement object = EasyMock.createMock(InformationElement.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseInformationElement(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseModelElement(ModelElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseModelElement_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		ModelElement object = EasyMock.createMock(ModelElement.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseModelElement(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseReasoningElement(ReasoningElement) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseReasoningElement_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		ReasoningElement object = EasyMock.createMock(ReasoningElement.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseReasoningElement(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object caseTaggedValue(TaggedValue) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testCaseTaggedValue_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		TaggedValue object = EasyMock.createMock(TaggedValue.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.caseTaggedValue(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object defaultCase(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDefaultCase_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		EObject object = EasyMock.createMock(EObject.class);
		// add mock object expectations here

		EasyMock.replay(object);

		Object result = fixture.defaultCase(object);

		EasyMock.verify(object);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDoSwitch_1()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		EObject theEObject = EasyMock.createMock(EObject.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(theEObject);

		EasyMock.verify(theEObject);
		assertNotNull(result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_2()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 5;
		EObject theEObject = EasyMock.createMock(AssertedRelationship.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_3()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 6;
		EObject theEObject = EasyMock.createMock(Annotation.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_4()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 7;
		EObject theEObject = EasyMock.createMock(AssertedInference.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_5()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 7;
		EObject theEObject = EasyMock.createMock(AssertedInference.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_6()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 8;
		EObject theEObject = EasyMock.createMock(AssertedEvidence.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_7()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 8;
		EObject theEObject = EasyMock.createMock(AssertedEvidence.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_8()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 9;
		EObject theEObject = EasyMock.createMock(AssertedContext.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_9()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 10;
		EObject theEObject = EasyMock.createMock(AssertedCounterEvidence.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_10()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 11;
		EObject theEObject = EasyMock.createMock(AssertedChallenge.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_11()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 12;
		EObject theEObject = EasyMock.createMock(ReasoningElement.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_12()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 13;
		EObject theEObject = EasyMock.createMock(Claim.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_13()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 14;
		EObject theEObject = EasyMock.createMock(EvidenceAssertion.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_14()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 14;
		EObject theEObject = EasyMock.createMock(EvidenceAssertion.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_15()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 15;
		EObject theEObject = EasyMock.createMock(InformationElement.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_16()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 16;
		EObject theEObject = EasyMock.createMock(ArgumentReasoning.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(int,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test
	public void testDoSwitch_17()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		int classifierID = 17;
		EObject theEObject = EasyMock.createMock(CitationElement.class);
		// add mock object expectations here

		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(classifierID, theEObject);

		EasyMock.verify(theEObject);
		assertEquals(null, result);
		
	}

	/**
	 * Run the Object doSwitch(EClass,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoSwitch_18()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		EClass theEClass = EasyMock.createMock(EClass.class);
		EObject theEObject = EasyMock.createMock(EObject.class);
		// add mock object expectations here

		EasyMock.replay(theEClass);
		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(theEClass, theEObject);

		EasyMock.verify(theEClass);
		EasyMock.verify(theEObject);
		assertNotNull(result);
		
	}

	/**
	 * Run the Object doSwitch(EClass,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoSwitch_19()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		EClass theEClass = EasyMock.createMock(EClass.class);
		EObject theEObject = EasyMock.createMock(EObject.class);
		// add mock object expectations here

		EasyMock.replay(theEClass);
		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(theEClass, theEObject);

		EasyMock.verify(theEClass);
		EasyMock.verify(theEObject);
		assertNotNull(result);
		
	}

	/**
	 * Run the Object doSwitch(EClass,EObject) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/12/10 1:34 PM
	 */
	@Test(expected = java.lang.IllegalStateException.class)
	public void testDoSwitch_20()
		throws Exception {
		ArmSwitch fixture = new ArmSwitch();
		EClass theEClass = EasyMock.createMock(EClass.class);
		EObject theEObject = EasyMock.createMock(EObject.class);
		// add mock object expectations here

		EasyMock.replay(theEClass);
		EasyMock.replay(theEObject);

		Object result = fixture.doSwitch(theEClass, theEObject);

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