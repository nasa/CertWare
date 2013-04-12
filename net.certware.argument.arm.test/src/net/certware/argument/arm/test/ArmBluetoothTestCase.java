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
import net.certware.argument.arm.AssertedInference;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.InformationElement;

/**
 * Unit testing Bluetooth security case example from OMG document.
 * @author mrb
 * @since 0.1
 */
public class ArmBluetoothTestCase extends TestCase {

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
		argument.setIdentifier("BSC11");
		
		Claim c1 = ArmFactory.eINSTANCE.createClaim();
		c1.setIdentifier("Bluetooth secure");
		c1.setContent("A bluetooth enabled network provides adequate security");
		argument.getContainsArgumentElement().add(c1);
		
		Claim c2 = ArmFactory.eINSTANCE.createClaim();
		c2.setIdentifier("Availability");
		c2.setContent("A bluetooth enabled network is adequately available [1] Section 1 para 3");
		argument.getContainsArgumentElement().add(c2);
		
		Claim c3 = ArmFactory.eINSTANCE.createClaim();
		c3.setIdentifier("Access");
		c3.setContent("A bluetooth enabled network provides adequate control for access to services and data [1] Section 1 para 3");
		argument.getContainsArgumentElement().add(c3);
		
		Claim c4 = ArmFactory.eINSTANCE.createClaim();
		c4.setIdentifier("Confidentiality");
		c4.setContent("A bluetooth enabled network provides adequate levels of confidentiality [1] Section 1 para 3");
		argument.getContainsArgumentElement().add(c4);

		Claim c5 = ArmFactory.eINSTANCE.createClaim();
		c5.setIdentifier("Integrity");
		c5.setContent("A bluetooth enabled network provides adequate levels of integrity [1] Section 1 para 3");
		argument.getContainsArgumentElement().add(c5);
		
		InformationElement i1 = ArmFactory.eINSTANCE.createInformationElement();
		i1.setIdentifier("Context: security policy and scenario for use");
		i1.setContent("Definitions are required of the intended security policy and the scenario of use for the system, including what is regarded as 'adequate'");
		i1.setDescription("");
		argument.getContainsArgumentElement().add(i1);
		
		InformationElement i2 = ArmFactory.eINSTANCE.createInformationElement();
		i2.setIdentifier("References");
		i2.setContent("[1] Bluetooth security white paper 19/4/02");
		i2.setDescription("");
		argument.getContainsArgumentElement().add(i2);

		InformationElement i3 = ArmFactory.eINSTANCE.createInformationElement();
		i3.setIdentifier("Definition: Availability");
		i3.setContent("The system is capable of providing requested services to authorized users, in an acceptable/defined time");
		i3.setDescription("");
		argument.getContainsArgumentElement().add(i3);

		InformationElement i4 = ArmFactory.eINSTANCE.createInformationElement();
		i4.setIdentifier("Definition: Access");
		i4.setContent("Only users permitted by the defined security policy have access to services and data");
		i4.setDescription("");
		argument.getContainsArgumentElement().add(i4);

		InformationElement i5 = ArmFactory.eINSTANCE.createInformationElement();
		i5.setIdentifier("Definition: Confidentiality");
		i5.setContent("Unauthorized persons cannot intercept and understand information to which they are not entitled");
		i5.setDescription("");
		argument.getContainsArgumentElement().add(i5);
		
		InformationElement i6 = ArmFactory.eINSTANCE.createInformationElement();
		i6.setIdentifier("Definition: Integrity");
		i6.setContent("Services and data are provided to authorized users as intended and without corruption");
		i6.setDescription("");
		argument.getContainsArgumentElement().add(i6);

		ArgumentReasoning r1 = ArmFactory.eINSTANCE.createArgumentReasoning();
		r1.setIdentifier("Argue over vulnerabilities");
		r1.setDescription("Argue for each security requirement identified in the security white paper");
		argument.getContainsArgumentElement().add(r1);

		AssertedContext ac1 = ArmFactory.eINSTANCE.createAssertedContext();
		ac1.setIdentifier("AC1");
		ac1.getTarget().add(i2);
		ac1.getSource().add(c1);
		argument.getContainsArgumentLink().add(ac1);

		AssertedContext ac2 = ArmFactory.eINSTANCE.createAssertedContext();
		ac2.setIdentifier("AC2");
		ac2.getTarget().add(i1);
		ac2.getSource().add(c1);
		argument.getContainsArgumentLink().add(ac2);

		AssertedInference ai1 = ArmFactory.eINSTANCE.createAssertedInference();
		ai1.setIdentifier("AI1");
		ai1.getTarget().add(i6);
		ai1.getTarget().add(i5);
		ai1.getTarget().add(i4);
		ai1.getTarget().add(i3);
		ai1.getSource().add(c1);
		argument.getContainsArgumentLink().add(ai1);
	}
	

	public void testArgumentLists() throws Exception {
		assertEquals(12, argument.getContainsArgumentElement().size());
		assertEquals(3, argument.getContainsArgumentLink().size());
		assertTrue(argument.getContainsArgument().isEmpty());
	}

	public void testArgument() throws Exception {
		assertNull(argument.getDescription());
		assertNull(argument.getContent());
		assertEquals("BSC11",argument.getIdentifier());
	}

	public void testSourcesAndTargets() throws Exception {
		ArgumentLink cal1 = argument.getContainsArgumentLink().get(0);
		assertEquals(1,cal1.getSource().size());
		assertEquals(1,cal1.getTarget().size());
		assertEquals(cal1.getSource().get(0),argument.getContainsArgumentElement().get(0));
		
		ArgumentLink cal2 = argument.getContainsArgumentLink().get(1);
		assertEquals(1,cal2.getSource().size());
		assertEquals(1,cal2.getTarget().size());

		ArgumentLink cal3 = argument.getContainsArgumentLink().get(2);
		assertEquals(1, cal3.getSource().size());
		assertEquals(4, cal3.getTarget().size());
	}
	
	
	/*
	Should be:
	
	<?xml version="1.0" encoding="UTF-8"?>
	<arm:Argument xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:arm="http://www.omg.org/ARM" identifier="BSC11" description="" content="">
0 c1	  <containsArgumentElement xsi:type="arm:Claim" identifier="Bluetooth secure" description="" content="A bluetooth enabled network provides adequate security"/>
1 c2	  <containsArgumentElement xsi:type="arm:Claim" identifier="Availability" description="" content="A bluetooth enabled network is adequately available [1] Section 1 para 3"/>
2 c3	  <containsArgumentElement xsi:type="arm:Claim" identifier="Access" description="" content="A bluetooth enabled network provides adequate control for access to services and data [1] Section 1 para 3"/>
3 c4	  <containsArgumentElement xsi:type="arm:Claim" identifier="Confidentiality" description="" content="A bluetooth enabled network provides adequate levels of confidentiality [1] Section 1 para 3"/>
4 c5	  <containsArgumentElement xsi:type="arm:Claim" identifier="Integrity" description="" content="A bluetooth enabled network provides adequate levels of integrity [1] Section 1 para 3"/>
5 i1	  <containsArgumentElement xsi:type="arm:InformationElement" identifier="Context: security policy and scenario for use" description="" content="Definitions are required of the intended security policy and the scenario of use for the system, including what is regarded as 'adequate'"/>
6 i2	  <containsArgumentElement xsi:type="arm:InformationElement" identifier="References" description="" content="[1] Bluetooth security white paper 19/4/02"/>
7 i3	  <containsArgumentElement xsi:type="arm:InformationElement" identifier="Definition: Availability" description="" content="The system is capable of providing requested services to authorized users, in an acceptable/defined time"/>
8 i4	  <containsArgumentElement xsi:type="arm:InformationElement" identifier="Definition: Access" description="" content="Only users permitted by the defined security policy have access to services and data"/>
9 i5	  <containsArgumentElement xsi:type="arm:InformationElement" identifier="Definition: Confidentiality" description="" content="Unauthorized persons cannot intercept and understand information to which they are not entitled"/>
10 i6	  <containsArgumentElement xsi:type="arm:InformationElement" identifier="Definition: Integrity" description="" content="Services and data are provided to authorized users as intended and without corruption"/>
11 r1	  <containsArgumentElement xsi:type="arm:ArgumentReasoning" identifier="Argue over vulnerabilities" description="" content="Argue for each security requirement identified in the security white paper"/>
ac1	  <containsArgumentLink xsi:type="arm:AssertedContext" identifier="AC1" description="" target="//@containsArgumentElement.6" source="//@containsArgumentElement.0"/>
ac2	  <containsArgumentLink xsi:type="arm:AssertedContext" identifier="AC2" description="" content="" target="//@containsArgumentElement.5" source="//@containsArgumentElement.0"/>
ai1	  <containsArgumentLink xsi:type="arm:AssertedInference" identifier="AI1" description="" content="" target="//@containsArgumentElement.10 //@containsArgumentElement.9 //@containsArgumentElement.8 //@containsArgumentElement.7" source="//@containsArgumentElement.0"/>
	</arm:Argument>
	
	*/
}
