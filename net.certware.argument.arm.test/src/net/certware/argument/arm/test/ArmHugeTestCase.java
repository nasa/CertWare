/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.test;

import junit.framework.TestCase;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.Claim;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit testing huge model file, thousands of elements.
 * @author mrb
 * @since 1.2
 */
public class ArmHugeTestCase extends TestCase {

	Argument argument;
	static final int ELEMENT_LIMIT = 10000; // adjust to change test case

	/**
	 * Dispose of the argument.
	 */
	@After
	public void tearDown() {
		argument = null;
	}
	
	/**
	 * Populate the argument model.
	 */
	@Before
	public void setUp() {
		argument = ArmFactory.eINSTANCE.createArgument();
		argument.setIdentifier("Huge10K");
		
		for ( int i = 0; i < ELEMENT_LIMIT; i++ ) {
			Claim c1 = ArmFactory.eINSTANCE.createClaim();
			c1.setIdentifier("Claim" + i);
			c1.setContent("Claim element content");
			argument.getContainsArgumentElement().add(c1);
		}
	}
	
	@Test
	public void testArgumentLists() throws Exception {
		assertEquals(ELEMENT_LIMIT, argument.getContainsArgumentElement().size());
		assertTrue(argument.getContainsArgument().isEmpty());
	}

	@Test
	public void testWrite() throws Exception {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("armh", new XMIResourceFactoryImpl());
		URI uri = URI.createURI("file:../resources/huge.armh");
		Resource resource = rs.createResource(uri);
		resource.getContents().add(argument);
		resource.save(null);
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
