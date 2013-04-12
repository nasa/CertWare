/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.test;

import junit.framework.TestCase;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.AssertedContext;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedInference;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.EvidenceAssertion;
import net.certware.argument.arm.InformationElement;

/**
 * Unit testing Industrial Press safety case example from OMG document.
 * @author mrb
 * @since 0.1
 */
public class ArmIndustrialPressTestCase extends TestCase {

	Argument argument;

	/**
	 * Dispose of the argument.
	 */
	public void tearDown() {
		argument = null;
	}
	
	/**
	 * Populate the argument model.
	 */
	public void setUp() {
		argument = ArmFactory.eINSTANCE.createArgument();

		// elements
		Claim c1 = ArmFactory.eINSTANCE.createClaim();
		c1.setIdentifier("C1");
		c1.setDescription("");
		c1.setContent("C/S logic is fault free");
		argument.getContainsArgumentElement().add(c1);
		
		ArgumentReasoning rc11 = ArmFactory.eINSTANCE.createArgumentReasoning();
		rc11.setIdentifier("RC1.1");
		rc11.setDescription("");
		rc11.setContent("Argument by omission of all identified software hazards");
		argument.getContainsArgumentElement().add(rc11);
		
		ArgumentReasoning rc12 = ArmFactory.eINSTANCE.createArgumentReasoning();
		rc12.setIdentifier("RC1.2");
		rc12.setDescription("");
		rc12.setContent("Argument by satisfaction of all C/S safety requirements");
		argument.getContainsArgumentElement().add(rc12);
		
		InformationElement irc11 = ArmFactory.eINSTANCE.createInformationElement();
		irc11.setIdentifier("IRC1.1");
		irc11.setDescription("Identified software hazards");
		irc11.setContent("");
		argument.getContainsArgumentElement().add(irc11);
		
		Claim c11 = ArmFactory.eINSTANCE.createClaim();
		c11.setIdentifier("C1.1");
		c11.setDescription("");
		c11.setContent("Unintended opening of press (after PoNR) can only occur as a result of component failure");
		argument.getContainsArgumentElement().add(c11);

		Claim c12 = ArmFactory.eINSTANCE.createClaim();
		c12.setIdentifier("C1.2");
		c12.setDescription("");
		c12.setContent("Unintended closing of press can only occur as a result of component failure");
		argument.getContainsArgumentElement().add(c12);

		Claim c21 = ArmFactory.eINSTANCE.createClaim();
		c21.setIdentifier("C2.1");
		c21.setDescription("");
		c21.setContent("Press controls being 'jammed on' will cause press to halt");
		argument.getContainsArgumentElement().add(c21);

		Claim c22 = ArmFactory.eINSTANCE.createClaim();
		c22.setIdentifier("C2.2");
		c22.setDescription("");
		c22.setContent("Release of controls prior to press passing physical PoNR will cause press operation to abort");
		argument.getContainsArgumentElement().add(c22);

		Claim c23 = ArmFactory.eINSTANCE.createClaim();
		c23.setIdentifier("C2.3");
		c23.setDescription("");
		c23.setContent("C/S fails safe (halts on) and annunciates (by sounding Klaxon) all component failures");
		argument.getContainsArgumentElement().add(c23);
		
		InformationElement s11 = ArmFactory.eINSTANCE.createInformationElement();
		s11.setIdentifier("S1.1");
		s11.setDescription("");
		s11.setContent("Fault tree analysis cutsets for event 'Hand trapped in press due to command error'");
		argument.getContainsArgumentElement().add(s11);
		
		InformationElement s12 = ArmFactory.eINSTANCE.createInformationElement();
		s12.setIdentifier("S1.2");
		s12.setDescription("");
		s12.setContent("Hazard directed test results");
		argument.getContainsArgumentElement().add(s12);
		
		EvidenceAssertion c211 = ArmFactory.eINSTANCE.createEvidenceAssertion();
		c211.setIdentifier("C2.1.1");
		c211.setDescription("");
		c211.setContent("Failure 1 of PLC state machine includes BUTTON_IN remaining true");
		argument.getContainsArgumentElement().add(c211);

		EvidenceAssertion c221 = ArmFactory.eINSTANCE.createEvidenceAssertion();
		c221.setIdentifier("C2.2.1");
		c221.setDescription("");
		c221.setContent("Abort transition of PLC state machine includes BUTTON_IN going false");
		argument.getContainsArgumentElement().add(c221);
		
		InformationElement s21 = ArmFactory.eINSTANCE.createInformationElement();
		s21.setIdentifier("S2.1");
		s21.setDescription("");
		s21.setContent("black box testing");
		argument.getContainsArgumentElement().add(s21);
		
		InformationElement s221 = ArmFactory.eINSTANCE.createInformationElement();
		s221.setIdentifier("S2.2.1");
		s221.setDescription("");
		s221.setContent("C/S state machine");
		argument.getContainsArgumentElement().add(s221);

		// links
		AssertedInference c111 = ArmFactory.eINSTANCE.createAssertedInference();
		c111.setIdentifier("C1.1.1");
		c111.setDescription("");
		c111.setContent("");
		c111.getTarget().add(c11);
		c111.getSource().add(c1);
		argument.getContainsArgumentLink().add(c111);

		AssertedInference c112 = ArmFactory.eINSTANCE.createAssertedInference();
		c112.setIdentifier("C1.1.2");
		c112.setDescription("");
		c112.setContent("");
		c112.getTarget().add(c12);
		c112.getSource().add(c1);
		argument.getContainsArgumentLink().add(c112);

		AssertedInference c121 = ArmFactory.eINSTANCE.createAssertedInference();
		c121.setIdentifier("C1.2.1");
		c121.setDescription("");
		c121.setContent("");
		c121.getTarget().add(c21);
		c121.getSource().add(c1);
		argument.getContainsArgumentLink().add(c121);

		AssertedInference c122 = ArmFactory.eINSTANCE.createAssertedInference();
		c122.setIdentifier("C1.2.2");
		c122.setDescription("");
		c122.setContent("");
		c122.getTarget().add(c22);
		c122.getSource().add(c1);
		argument.getContainsArgumentLink().add(c122);

		AssertedInference c123 = ArmFactory.eINSTANCE.createAssertedInference();
		c123.setIdentifier("C1.2.3");
		c123.setDescription("");
		c123.setContent("");
		c123.getTarget().add(c23);
		c123.getSource().add(c1);
		argument.getContainsArgumentLink().add(c123);

		AssertedContext circ11 = ArmFactory.eINSTANCE.createAssertedContext();
		circ11.setIdentifier("CIRC1.1");
		circ11.setDescription("");
		circ11.setContent("");
		circ11.getTarget().add(irc11);
		circ11.getSource().add(rc11);
		argument.getContainsArgumentLink().add(circ11);
		
		AssertedEvidence s11ae = ArmFactory.eINSTANCE.createAssertedEvidence();
		s11ae.setIdentifier("S1.1");
		s11ae.setDescription("");
		s11ae.setContent("");
		s11ae.getTarget().add(s11);
		s11ae.getSource().add(c11);
		s11ae.getSource().add(c12);
		argument.getContainsArgumentLink().add(s11ae);
		
		AssertedEvidence s12ae = ArmFactory.eINSTANCE.createAssertedEvidence();
		s12ae.setIdentifier("S1.2");
		s12ae.setDescription("");
		s12ae.setContent("");
		s12ae.getTarget().add(s12);
		s12ae.getSource().add(c11);
		s12ae.getSource().add(c12);
		argument.getContainsArgumentLink().add(s12ae);

		AssertedEvidence sc21ae = ArmFactory.eINSTANCE.createAssertedEvidence();
		sc21ae.setIdentifier("SC2.1");
		sc21ae.setDescription("");
		sc21ae.setContent("");
		sc21ae.getTarget().add(s21);
		sc21ae.getSource().add(c21);
		argument.getContainsArgumentLink().add(sc21ae);

		AssertedEvidence sc211ae = ArmFactory.eINSTANCE.createAssertedEvidence();
		sc211ae.setIdentifier("SC2.1.1");
		sc211ae.setDescription("");
		sc211ae.setContent("");
		sc211ae.getTarget().add(s221);
		sc211ae.getSource().add(c211);
		argument.getContainsArgumentLink().add(sc211ae);

		AssertedEvidence sc221ae = ArmFactory.eINSTANCE.createAssertedEvidence();
		sc221ae.setIdentifier("SC2.2.1");
		sc221ae.setDescription("");
		sc221ae.setContent("");
		sc221ae.getTarget().add(s221);
		sc221ae.getSource().add(c221);
		argument.getContainsArgumentLink().add(sc221ae);
		
		AssertedInference dic21 = ArmFactory.eINSTANCE.createAssertedInference();
		dic21.setIdentifier("DI C2.1");
		dic21.setDescription("");
		dic21.setContent("");
		dic21.getTarget().add(c211);
		dic21.getSource().add(c21);
		argument.getContainsArgumentLink().add(dic21);

		AssertedInference dic22 = ArmFactory.eINSTANCE.createAssertedInference();
		dic22.setIdentifier("DI C2.2");
		dic22.setDescription("");
		dic22.setContent("");
		dic22.getTarget().add(c221);
		dic22.getSource().add(c22);
		argument.getContainsArgumentLink().add(dic22);

}
	

	public void testArgumentLists() throws Exception {
		assertEquals(15, argument.getContainsArgumentElement().size());
		assertEquals(13, argument.getContainsArgumentLink().size());
		assertTrue(argument.getContainsArgument().isEmpty());
	}

	public void testArgument() throws Exception {
		assertNull(argument.getDescription());
		assertNull(argument.getContent());
		assertNull(argument.getIdentifier());
	}


	
	
	/*
	Should be:
	
<?xml version="1.0" encoding="UTF-8"?>
<arm:Argument xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:arm="http://www.omg.org/ARM">
0 c1  <containsArgumentElement xsi:type="arm:Claim" identifier="C1" description="" content="C/S logic is fault free"/>
1 rc11  <containsArgumentElement xsi:type="arm:ArgumentReasoning" identifier="RC1.1" description="" content="Argument by omission of all identified software hazards"/>
2 rc12  <containsArgumentElement xsi:type="arm:ArgumentReasoning" identifier="RC1.2" description="" content="Argument by satisfaction of all C/S safety requirements"/>

3 irc11 <containsArgumentElement xsi:type="arm:InformationElement" identifier="IRC1.1" description="Identified software hazards" content=""/>

4 c11  <containsArgumentElement xsi:type="arm:Claim" identifier="C1.1" description="" content="Unintended opening of press (after PoNR) can only occur as a result of component failure"/>
5 c12  <containsArgumentElement xsi:type="arm:Claim" identifier="C1.2" description="" content="Unintended closing of press can only occur as a result of component failure"/>
6 c21  <containsArgumentElement xsi:type="arm:Claim" identifier="C2.1" description="" content="Press controls being 'jammed on' will cause press to halt"/>
7 c22  <containsArgumentElement xsi:type="arm:Claim" identifier="C2.2" description="" content="Release of controls prior to press passing physical PoNR will cause press operation to abort"/>
8 c23  <containsArgumentElement xsi:type="arm:Claim" identifier="C2.3" description="" content="C/S fails safe (halts on) and annunciates (by sounding Klaxon) all component failures"/>

9 s11  <containsArgumentElement xsi:type="arm:InformationElement" identifier="S1.1" description="" content="Fault tree analysis cutsets for event 'Hand trapped in press due to command error'"/>
10 s12  <containsArgumentElement xsi:type="arm:InformationElement" identifier="S1.2" description="" content="Hazard directed test results"/>

11 c211  <containsArgumentElement xsi:type="arm:EvidenceAssertion" identifier="C2.1.1" description="" content="Failure 1 of PLC state machine includes BUTTON_IN remaining true"/>
12 c221  <containsArgumentElement xsi:type="arm:EvidenceAssertion" identifier="C2.2.1" description="" content="Abort transition of PLC state machine includes BUTTON_IN going false"/>

13 s21  <containsArgumentElement xsi:type="arm:InformationElement" identifier="S2.1" description="" content="black box testing"/>
14 s221  <containsArgumentElement xsi:type="arm:InformationElement" identifier="S2.2.1" description="" content="C/S state machine"/>

0 c111  <containsArgumentLink xsi:type="arm:AssertedInference" identifier="C1.1.1" description="" target="//@containsArgumentElement.4" source="//@containsArgumentElement.0"/>
1 c112  <containsArgumentLink xsi:type="arm:AssertedInference" identifier="C1.1.2" description="" content="" target="//@containsArgumentElement.5" source="//@containsArgumentElement.0"/>
2 c121  <containsArgumentLink xsi:type="arm:AssertedInference" identifier="C1.2.1" description="" content="" target="//@containsArgumentElement.6" source="//@containsArgumentElement.0"/>
3 c122  <containsArgumentLink xsi:type="arm:AssertedInference" identifier="C1.2.2" description="" content="" target="//@containsArgumentElement.7" source="//@containsArgumentElement.0"/>
4 c123  <containsArgumentLink xsi:type="arm:AssertedInference" identifier="C1.2.3" description="" target="//@containsArgumentElement.8" source="//@containsArgumentElement.0"/>

5 circ11  <containsArgumentLink xsi:type="arm:AssertedContext" identifier="CIRC1.1" description="" content="" target="//@containsArgumentElement.3" source="//@containsArgumentElement.1"/>

6 s11ae  <containsArgumentLink xsi:type="arm:AssertedEvidence" identifier="S1.1" description="" content="" target="//@containsArgumentElement.9" source="//@containsArgumentElement.4 //@containsArgumentElement.5"/>
7 s12ae  <containsArgumentLink xsi:type="arm:AssertedEvidence" identifier="S1.2" description="" content="" target="//@containsArgumentElement.10" source="//@containsArgumentElement.4 //@containsArgumentElement.5"/>
8 sc21ae  <containsArgumentLink xsi:type="arm:AssertedEvidence" identifier="SC2.1" description="" content="" target="//@containsArgumentElement.13" source="//@containsArgumentElement.6"/>
9 sc211ae  <containsArgumentLink xsi:type="arm:AssertedEvidence" identifier="SC2.1.1" description="" content="" target="//@containsArgumentElement.14" source="//@containsArgumentElement.11"/>
10 sc221ae  <containsArgumentLink xsi:type="arm:AssertedEvidence" identifier="SC2.2.1" description="" content="" target="//@containsArgumentElement.14" source="//@containsArgumentElement.12"/>

11 dic21  <containsArgumentLink xsi:type="arm:AssertedInference" identifier="DI C2.1" description="" content="" target="//@containsArgumentElement.11" source="//@containsArgumentElement.6"/>
12 dic22  <containsArgumentLink xsi:type="arm:AssertedInference" identifier="DI C2.2" description="" content="" target="//@containsArgumentElement.12" source="//@containsArgumentElement.7"/>

</arm:Argument>

	*/
	
	public void testSourcesAndTargets() throws Exception {
		ArgumentLink c111 = argument.getContainsArgumentLink().get(0);
		ArgumentLink c112 = argument.getContainsArgumentLink().get(1);
		ArgumentLink c121 = argument.getContainsArgumentLink().get(2);
		ArgumentLink c122 = argument.getContainsArgumentLink().get(3);
		ArgumentLink c123 = argument.getContainsArgumentLink().get(4);
		ArgumentLink circ11 = argument.getContainsArgumentLink().get(5);
		ArgumentLink s11ae = argument.getContainsArgumentLink().get(6);
		ArgumentLink s12ae = argument.getContainsArgumentLink().get(7);
		ArgumentLink s21ae = argument.getContainsArgumentLink().get(8);
		ArgumentLink s211ae = argument.getContainsArgumentLink().get(9);
		ArgumentLink dic21 = argument.getContainsArgumentLink().get(10);
		ArgumentLink dic22 = argument.getContainsArgumentLink().get(11);

		assertEquals(1,c111.getSource().size());
		assertEquals(1,c112.getSource().size());
		assertEquals(1,c121.getSource().size());
		assertEquals(1,c122.getSource().size());
		assertEquals(1,c123.getSource().size());
		assertEquals(1,circ11.getSource().size());
		assertEquals(2,s11ae.getSource().size());
		assertEquals(2,s12ae.getSource().size());
		assertEquals(1,s21ae.getSource().size());
		assertEquals(1,s211ae.getSource().size());
		assertEquals(1,dic21.getSource().size());
		assertEquals(1,dic22.getSource().size());
		
		assertEquals(1,c111.getTarget().size());
		assertEquals(1,c112.getTarget().size());
		assertEquals(1,c121.getTarget().size());
		assertEquals(1,c122.getTarget().size());
		assertEquals(1,c123.getTarget().size());
		assertEquals(1,circ11.getTarget().size());
		assertEquals(1,s11ae.getTarget().size());
		assertEquals(1,s12ae.getTarget().size());
		assertEquals(1,s21ae.getTarget().size());
		assertEquals(1,s211ae.getTarget().size());
		assertEquals(1,dic21.getTarget().size());
		assertEquals(1,dic22.getTarget().size());
		
		assertEquals(s11ae.getSource().get(0), argument.getContainsArgumentElement().get(4));
		assertEquals(s11ae.getSource().get(1), argument.getContainsArgumentElement().get(5));

		assertEquals(s12ae.getSource().get(0), argument.getContainsArgumentElement().get(4));
		assertEquals(s12ae.getSource().get(1), argument.getContainsArgumentElement().get(5));
	}
}
