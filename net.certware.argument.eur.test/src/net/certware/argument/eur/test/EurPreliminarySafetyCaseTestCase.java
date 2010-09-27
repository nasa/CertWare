package net.certware.argument.eur.test;


import net.certware.argument.eur.Argument;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurFactory;
import net.certware.argument.eur.Justification;
import junit.framework.TestCase;


/**
 * Unit testing preliminary safety case example from EUROCONTROL PSC ADS-B-NRA document.
 * @author mrb
 * @since 0.1
 */
public class EurPreliminarySafetyCaseTestCase extends TestCase {

	Argument argument0;
	Argument argument1;
	Argument argument2;
	Argument argument3;
	Argument argument4;
	Argument argument5;

	/**
	 * Dispose of the claim.
	 */
	public void tearDown() {
		argument0 = null;
		argument1 = null;
		argument2 = null;
		argument3 = null;
		argument4 = null;
		argument5 = null;
	}
	
	/**
	 * Populate the argument model.
	 */
	public void setUp() {

		// figure 2
		argument0 = EurFactory.eINSTANCE.createArgument();
		argument0.setIdentifier("Arg 0");
		argument0.setContent("Use of ADS-B surveillance in Non-Radar Areas for Air Traffic Services is acceptably safe");
		argument0.setAssumed(false);
		argument0.setToBeSupported(false);
		
		Criteria criteria0 = EurFactory.eINSTANCE.createCriteria();
		criteria0.setIdentifier("Cr000");
		criteria0.setContent("Acceptably safe is defined as a combination of the following elements, concerning the risk of an accident or incident");
		argument0.getCriteria().add(criteria0);

		Criteria criteria1 = EurFactory.eINSTANCE.createCriteria();
		criteria1.setIdentifier("Cr001");
		criteria1.setContent("No greater than for the Reference Service");
		argument0.getCriteria().add(criteria1);
		
		Criteria criteria2 = EurFactory.eINSTANCE.createCriteria();
		criteria2.setIdentifier("Cr002");
		criteria2.setContent("Within an appropriate portion of the relevant target levels of safety");
		argument0.getCriteria().add(criteria2);
		
		Criteria criteria3 = EurFactory.eINSTANCE.createCriteria();
		criteria3.setIdentifier("Cr003");
		criteria3.setContent("Further reduced as far a reasonably practicable");
		argument0.getCriteria().add(criteria3);
		
		Context context1 = EurFactory.eINSTANCE.createContext();
		context1.setIdentifier("C001");
		context1.setContent("Reference service is radar-based surveillance, including separation service applying 5NM for en-route and 3NM for TMA in the operating environment");
		criteria1.getContext().add(context1);
		
		Assumption assumption1 = EurFactory.eINSTANCE.createAssumption();
		assumption1.setIdentifier("A001");
		assumption1.setContent("Reference service is tolerably safe");
		context1.getAssumption().add(assumption1);
		
		Justification justification1 = EurFactory.eINSTANCE.createJustification();
		justification1.setIdentifier("J001");
		justification1.setContent("Introduction of ADS-B in current NRAs (operating environment) provides enhancement to ATS in a way similar to the introduction of secondary surveillance radar in terms of capacity, efficiency and safety aspects");
		argument0.getJustification().add(justification1);
			
		argument1 = EurFactory.eINSTANCE.createArgument();
		argument1.setIdentifier("Arg 1");
		argument1.setDescription("Section 3.4");
		argument1.setContent("ADS-B surveillance in NRAs for ATSs has been specified to be acceptably safe");
		argument0.getArgument().add(argument1);
		
		argument2 = EurFactory.eINSTANCE.createArgument();
		argument2.setIdentifier("Arg 2");
		argument2.setContent("ADS-B surveillance in NRAs for ATSs has been implemented in accordance with the specification");
		argument0.getArgument().add(argument2);
		
		argument3 = EurFactory.eINSTANCE.createArgument();
		argument3.setIdentifier("Arg 3");
		argument3.setContent("The transition to operational service of ADS-B surveillance in NRAs for ATSs will be acceptably safe");
		argument0.getArgument().add(argument3);
		
		argument4 = EurFactory.eINSTANCE.createArgument();
		argument4.setIdentifier("Arg 4");
		argument4.setContent("The safety of ADS-B surveillance in NRAs for ATSs will continue to be demonstrated in operational service");
		argument0.getArgument().add(argument4);
		
		// figure 3
		Argument argument11 = EurFactory.eINSTANCE.createArgument();
		argument11.setIdentifier("Arg 1.1");
		argument11.setDescription("Section 3.4.1");
		argument11.setContent("ADS-B surveillance in NRAs for ATSs have been generically specified to be acceptably safe");
		argument1.getArgument().add(argument11);

		Argument argument12 = EurFactory.eINSTANCE.createArgument();
		argument12.setIdentifier("Arg 1.2");
		argument12.setContent("Sufficient guidance exists to enable complete, correct and consistent consideration of the local specification aspects");
		argument1.getArgument().add(argument12);

		Argument argument13 = EurFactory.eINSTANCE.createArgument();
		argument13.setIdentifier("Arg 1.3");
		argument13.setContent("ADS-B surveillance in NRAs for ATSs have been locally specified to be acceptably safe");
		argument1.getArgument().add(argument13);

		// figure 4
		Assumption assumption2 = EurFactory.eINSTANCE.createAssumption();
		assumption2.setIdentifier("A002");
		assumption2.setContent("100% of aircraft are equipped and certified for ADS-B-NRA");
		argument11.getAssumption().add(assumption2);
		
		Context context3 = EurFactory.eINSTANCE.createContext();
		context3.setIdentifier("C003");
		context3.setContent("ADS-B-NRA application includes separation service applying 5NM for en-route and 3NM for TMA as outlined in section 2 herein");

		argument11.getCriteria().add(criteria1);
		argument11.getCriteria().add(criteria2);
		argument11.getCriteria().add(criteria3);
		argument11.getContext().add(context1);
		argument11.getContext().add(context3);

		Argument argument111 = EurFactory.eINSTANCE.createArgument();
		argument111.setIdentifier("Arg 1.1.1");
		argument111.setDescription("section 4");
		argument111.setContent("ADS-B surveillance in NRAs for ATSs is intrinsically safe");
		
		Argument argument112 = EurFactory.eINSTANCE.createArgument();
		argument112.setIdentifier("Arg 1.1.2");
		argument112.setDescription("section 5");
		argument112.setContent("The corresponding System Design is complete");
		
		Argument argument113 = EurFactory.eINSTANCE.createArgument();
		argument113.setIdentifier("Arg 1.1.3");
		argument113.setDescription("section 6");
		argument113.setContent("The System Design functions correctly and coherently under all expected environment conditions");
		
		Argument argument114 = EurFactory.eINSTANCE.createArgument();
		argument114.setIdentifier("Arg 1.1.4");
		argument114.setDescription("section 7");
		argument114.setContent("The System Design is robust against external abnormalities");
		
		Argument argument115 = EurFactory.eINSTANCE.createArgument();
		argument115.setIdentifier("Arg 1.1.5");
		argument115.setDescription("section 8");
		argument115.setContent("All risks from internal system failure have been mitigated sufficiently");
		
		Argument argument116 = EurFactory.eINSTANCE.createArgument();
		argument116.setIdentifier("Arg 1.1.6");
		argument116.setDescription("section 9");
		argument116.setContent("All requirements are realistic - i.e. are capable of being satisfied in a typical implementation of equipment, people and procedures");
		
		Argument argument117 = EurFactory.eINSTANCE.createArgument();
		argument117.setIdentifier("Arg 1.1.7");
		argument117.setDescription("section 10");
		argument117.setContent("Approach and Methods used to obtain requirements allow to demonstrate that the application is acceptably safe");

		argument11.getArgument().add(argument111);
		argument11.getArgument().add(argument112);
		argument11.getArgument().add(argument113);
		argument11.getArgument().add(argument114);
		argument11.getArgument().add(argument115);
		argument11.getArgument().add(argument116);
		argument11.getArgument().add(argument117);

		// figure 5
		Justification justification2 = EurFactory.eINSTANCE.createJustification();
		justification2.setIdentifier("J002");
		justification2.setContent("When working normally (success case) ABS-B-NRA does not introduction additional risk");
		
		Argument argument1111 = EurFactory.eINSTANCE.createArgument();
		argument1111.setIdentifier("Arg 1.1.1.1");
		argument1111.setContent("The key surveillance data items of the reference radar-based service and ADS-B-NRA have been identified");

		Argument argument1112 = EurFactory.eINSTANCE.createArgument();
		argument1112.setIdentifier("Arg 1.1.1.2");
		argument1112.setContent("The differences between the reference radar-based service and ADS-B-NRA have been identified, understaood and recondiled to satisfy the safety criteria");

		Argument argument1113 = EurFactory.eINSTANCE.createArgument();
		argument1113.setIdentifier("Arg 1.1.1.3");
		argument1113.setContent("Performance for both the reference radar-based ATS and ADS-B-NRA have been described, understood and reconciled with the safety criteria");

		Argument argument1114 = EurFactory.eINSTANCE.createArgument();
		argument1114.setIdentifier("Arg 1.1.1.4");
		argument1114.setContent("The operational impact of ADS-B surveillance on adjacent sectors has been assessed and shown to be consistent with the safety criteria");

		argument111.getCriteria().add(criteria1);
		argument111.getCriteria().add(criteria3);
		argument111.getContext().add(context3);
		argument111.getJustification().add(justification2);
		argument111.getArgument().add(argument1111);
		argument111.getArgument().add(argument1112);
		argument111.getArgument().add(argument1113);
		argument111.getArgument().add(argument1114);

		// figure 6
		// TODO continue here
		
	}
	

	public void testArgumentLists() throws Exception {
		//assertEquals(1, toplevelClaim.getStrategy().size());
		//assertEquals(2, toplevelClaim.getContext().size());
		//assertTrue(toplevelClaim.getAssumption().isEmpty());
		//assertTrue(toplevelClaim.getIsTagged().isEmpty());
	}

	public void testArgument() throws Exception {
		//assertNull(toplevelClaim.getDescription());
		//assertNull(toplevelClaim.getContent());
		//assertEquals("Top-Level Claim",toplevelClaim.getIdentifier());
	}

	public void testSubclaims() throws Exception {
		//Argument a = toplevelClaim.getStrategy().get(0);
		//assertEquals(4,a.getClaims().size());
		
		/*
		for ( Claim c : a.getClaims() ){
			assertEquals(1,c.getContext().size());
			assertNull(c.getDescription());
			assertEquals(0,c.getAssumption().size());
		}
		*/
	}
	
}
