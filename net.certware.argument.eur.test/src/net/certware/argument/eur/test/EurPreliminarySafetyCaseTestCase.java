package net.certware.argument.eur.test;


import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import junit.framework.TestCase;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.eur.Argument;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurFactory;
import net.certware.argument.eur.Justification;
import net.certware.argument.eur.Solution;
import net.certware.argument.eur.Strategy;
import net.certware.argument.eur.util.EurSwitch;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


/**
 * Unit testing preliminary safety case example from EUROCONTROL PSC ADS-B-NRA document.
 * @author mrb
 * @since 0.1
 */
public class EurPreliminarySafetyCaseTestCase extends TestCase {

	/** top-level argument */
	Argument argument0;
	/** primary argument 1 */
	Argument argument1;
	/** primary argument 2 */
	Argument argument2;
	/** primary argument 3 */
	Argument argument3;
	/** primary argument 4 */
	Argument argument4;

	/**
	 * Dispose of the claim.
	 */
	public void tearDown() {
		argument0 = null;
		argument1 = null;
		argument2 = null;
		argument3 = null;
		argument4 = null;
	}
	
	Assumption assumption1;
	Assumption assumption2;
	Assumption assumption5;
	Context context1;
	Context context3;
	
	/**
	 * Populate the argument model.
	 * Follows the figures of the EUROCONTROL ADS-B-NRA preliminary safety case document.
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
		
		context1 = EurFactory.eINSTANCE.createContext();
		context1.setIdentifier("C001");
		context1.setContent("Reference service is radar-based surveillance, including separation service applying 5NM for en-route and 3NM for TMA in the operating environment");
		criteria1.getContext().add(context1);
		
		assumption1 = EurFactory.eINSTANCE.createAssumption();
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
		
		argument2 = EurFactory.eINSTANCE.createArgument();
		argument2.setIdentifier("Arg 2");
		argument2.setContent("ADS-B surveillance in NRAs for ATSs has been implemented in accordance with the specification");
		
		argument3 = EurFactory.eINSTANCE.createArgument();
		argument3.setIdentifier("Arg 3");
		argument3.setContent("The transition to operational service of ADS-B surveillance in NRAs for ATSs will be acceptably safe");
		
		argument4 = EurFactory.eINSTANCE.createArgument();
		argument4.setIdentifier("Arg 4");
		argument4.setContent("The safety of ADS-B surveillance in NRAs for ATSs will continue to be demonstrated in operational service");

		argument0.getArgument().add(argument1);
		argument0.getArgument().add(argument2);
		argument0.getArgument().add(argument3);
		argument0.getArgument().add(argument4);
		
		// figure 3
		Argument argument11 = EurFactory.eINSTANCE.createArgument();
		argument11.setIdentifier("Arg 1.1");
		argument11.setDescription("Section 3.4.1");
		argument11.setContent("ADS-B surveillance in NRAs for ATSs have been generically specified to be acceptably safe");

		Argument argument12 = EurFactory.eINSTANCE.createArgument();
		argument12.setIdentifier("Arg 1.2");
		argument12.setContent("Sufficient guidance exists to enable complete, correct and consistent consideration of the local specification aspects");
		Solution solution12 = EurFactory.eINSTANCE.createSolution();
		solution12.setIdentifier("S12");
		solution12.setContent("PSC NRA section 3.4.2");
		argument12.getSolution().add(solution12);
		
		Argument argument13 = EurFactory.eINSTANCE.createArgument();
		argument13.setIdentifier("Arg 1.3");
		argument13.setContent("ADS-B surveillance in NRAs for ATSs have been locally specified to be acceptably safe");

		argument1.getArgument().add(argument11);
		argument1.getArgument().add(argument12);
		argument1.getArgument().add(argument13);

		// figure 4
		assumption2 = EurFactory.eINSTANCE.createAssumption();
		assumption2.setIdentifier("A002");
		assumption2.setContent("100% of aircraft are equipped and certified for ADS-B-NRA");
		argument11.getAssumption().add(assumption2);
		
		context3 = EurFactory.eINSTANCE.createContext();
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
		Solution solution1111 = EurFactory.eINSTANCE.createSolution();
		solution1111.setIdentifier("S1111");
		solution1111.setContent("PSC-NRA section 4.3");
		argument1111.getSolution().add(solution1111);

		Argument argument1112 = EurFactory.eINSTANCE.createArgument();
		argument1112.setIdentifier("Arg 1.1.1.2");
		argument1112.setContent("The differences between the reference radar-based service and ADS-B-NRA have been identified, understaood and recondiled to satisfy the safety criteria");
		Solution solution1112 = EurFactory.eINSTANCE.createSolution();
		solution1112.setIdentifier("S1112");
		solution1112.setContent("PSC-NRA section 4.4");
		argument1112.getSolution().add(solution1112);

		Argument argument1113 = EurFactory.eINSTANCE.createArgument();
		argument1113.setIdentifier("Arg 1.1.1.3");
		argument1113.setContent("Performance for both the reference radar-based ATS and ADS-B-NRA have been described, understood and reconciled with the safety criteria");
		Solution solution1113 = EurFactory.eINSTANCE.createSolution();
		solution1113.setIdentifier("S1113");
		solution1113.setContent("PSC-NRA section 4.5");
		argument1113.getSolution().add(solution1113);

		Argument argument1114 = EurFactory.eINSTANCE.createArgument();
		argument1114.setIdentifier("Arg 1.1.1.4");
		argument1114.setContent("The operational impact of ADS-B surveillance on adjacent sectors has been assessed and shown to be consistent with the safety criteria");
		Solution solution1114 = EurFactory.eINSTANCE.createSolution();
		solution1114.setIdentifier("S1114");
		solution1114.setContent("PSC-NRA section 4.6");
		argument1114.getSolution().add(solution1114);

		argument111.getCriteria().add(criteria1);
		argument111.getCriteria().add(criteria3);
		argument111.getContext().add(context3);
		argument111.getJustification().add(justification2);
		argument111.getArgument().add(argument1111);
		argument111.getArgument().add(argument1112);
		argument111.getArgument().add(argument1113);
		argument111.getArgument().add(argument1114);

		// figure 6
		Argument argument1121 = EurFactory.eINSTANCE.createArgument();
		argument1121.setIdentifier("Arg 1.1.2.1");
		argument1121.setContent("The boundaries of the system are clearly defined");
		Solution solution1121 = EurFactory.eINSTANCE.createSolution();
		solution1121.setIdentifier("S1121");
		solution1121.setContent("PSC-NRA section 5.3");
		argument1121.getSolution().add(solution1121);

		Argument argument1122 = EurFactory.eINSTANCE.createArgument();
		argument1122.setIdentifier("Arg 1.1.2.2");
		argument1122.setContent("The Application fully describes how the system is intended to operate");
		Solution solution1122 = EurFactory.eINSTANCE.createSolution();
		solution1122.setIdentifier("S1122");
		solution1122.setContent("PSC-NRA section 5.4");
		argument1122.getSolution().add(solution1122);

		Argument argument1123 = EurFactory.eINSTANCE.createArgument();
		argument1123.setIdentifier("Arg 1.1.2.3");
		argument1123.setContent("Everything necessary to achieve a safe implementation of the Application, related to equipment, people, procedures, airspace design, etc., has been specified as safety requirements or assumptions");
		Solution solution1123 = EurFactory.eINSTANCE.createSolution();
		solution1123.setIdentifier("S1123");
		solution1123.setContent("PSC-NRA section 5.5");
		argument1123.getSolution().add(solution1123);

		Argument argument1124 = EurFactory.eINSTANCE.createArgument();
		argument1124.setIdentifier("Arg 1.1.2.4");
		argument1124.setContent("All safety requirements on, and assumptions about, external elements of the end-to-end system have been captured");
		Solution solution1124 = EurFactory.eINSTANCE.createSolution();
		solution1124.setIdentifier("S1124");
		solution1124.setContent("PSC-NRA section 5.6");
		argument1124.getSolution().add(solution1124);

		argument112.getCriteria().add(criteria1);
		argument112.getCriteria().add(criteria3);
		argument112.getArgument().add(argument1121);
		argument112.getArgument().add(argument1122);
		argument112.getArgument().add(argument1123);
		argument112.getArgument().add(argument1124);
		
		// figure 7
		Argument argument1131 = EurFactory.eINSTANCE.createArgument();
		argument1131.setIdentifier("Arg 1.1.3.1");
		argument1131.setContent("Coherency of the ADS-B-NRA procedures");
		Solution solution1131 = EurFactory.eINSTANCE.createSolution();
		solution1131.setIdentifier("S1131");
		solution1131.setContent("PSC-NRA section 6.3");
		argument1131.getSolution().add(solution1131);
		
		Argument argument1132 = EurFactory.eINSTANCE.createArgument();
		argument1132.setIdentifier("Arg 1.1.3.2");
		argument1132.setContent("Coherency of the ADS-B-NRA human actions");
		Solution solution1132 = EurFactory.eINSTANCE.createSolution();
		solution1132.setIdentifier("S1132");
		solution1132.setContent("PSC-NRA section 6.4");
		argument1132.getSolution().add(solution1132);
		
		Argument argument1133 = EurFactory.eINSTANCE.createArgument();
		argument1133.setIdentifier("Arg 1.1.3.3");
		argument1133.setContent("Coherency of the ADS-B-NRA data over the full range of conditions to which the system is expected to be subjected in its operational environment");
		Solution solution1133 = EurFactory.eINSTANCE.createSolution();
		solution1133.setIdentifier("S1133");
		solution1133.setContent("PSC-NRA section 6.5");
		argument1133.getSolution().add(solution1133);
		
		Argument argument1134 = EurFactory.eINSTANCE.createArgument();
		argument1134.setIdentifier("Arg 1.1.3.4");
		argument1134.setContent("Absence of undefined states in ADS-B-NRA");
		Solution solution1134 = EurFactory.eINSTANCE.createSolution();
		solution1134.setIdentifier("S1134");
		solution1134.setContent("PSC-NRA section 6.6");
		argument1134.getSolution().add(solution1134);
				
		argument113.getCriteria().add(criteria1);
		argument113.getCriteria().add(criteria3);
		argument113.getArgument().add(argument1131);
		argument113.getArgument().add(argument1132);
		argument113.getArgument().add(argument1133);
		argument113.getArgument().add(argument1134);

		// figure 8
		Argument argument1141 = EurFactory.eINSTANCE.createArgument();
		argument1141.setIdentifier("Arg 1.1.4.1");
		argument1141.setContent("The system can react safely to all reasonable foreseeable external failures - i.e. failures in its environment / adjacent systems");
		Solution solution1141 = EurFactory.eINSTANCE.createSolution();
		solution1141.setIdentifier("S1141");
		solution1141.setContent("PSC-NRA section 7.3");
		argument1141.getSolution().add(solution1141);
				
		Argument argument1142 = EurFactory.eINSTANCE.createArgument();
		argument1142.setIdentifier("Arg 1.1.4.2");
		argument1142.setContent("The system can react safely to all reasonably foreseeable abnormal conditions in its environment / adjacent systems");
		Solution solution1142 = EurFactory.eINSTANCE.createSolution();
		solution1142.setIdentifier("S1142");
		solution1142.setContent("PSC-NRA section 7.4");
		argument1142.getSolution().add(solution1142);
				
		argument114.getCriteria().add(criteria1); // different from figure, which seems inconsistent
		argument114.getCriteria().add(criteria3);
		argument114.getArgument().add(argument1141);
		argument114.getArgument().add(argument1142);

		// figure 9
		Strategy strategy1 = EurFactory.eINSTANCE.createStrategy();
		strategy1.setIdentifier("St001");
		strategy1.setContent("Internal failure assessment is focused on separation ATS service");
		
		assumption5 = EurFactory.eINSTANCE.createAssumption();
		assumption5.setIdentifier("A005");
		assumption5.setContent("Separation service provided by ADS-B-NRA is the most dimensioning one");
		strategy1.getAssumption().add(assumption5);
		
		argument115.getCriteria().add(criteria1); 
		argument115.getCriteria().add(criteria2); 
		argument115.getCriteria().add(criteria3);
		argument115.getStrategy().add(strategy1);
		
		Argument argument1151 = EurFactory.eINSTANCE.createArgument();
		argument1151.setIdentifier("Arg 1.1.5.1");
		argument1151.setContent("All reasonable foreseeable hazards have been identified");
		Solution solution1151 = EurFactory.eINSTANCE.createSolution();
		solution1151.setIdentifier("S1151");
		solution1151.setContent("PSC-NRA section 8.3");
		argument1151.getSolution().add(solution1151);
		
		Argument argument1152 = EurFactory.eINSTANCE.createArgument();
		argument1152.setIdentifier("Arg 1.1.5.2");
		argument1152.setContent("The severity of the effects of each hazard has been correctly assessed, taking account of any mitigations that may be available");
		Solution solution1152 = EurFactory.eINSTANCE.createSolution();
		solution1152.setIdentifier("S1152");
		solution1152.setContent("PSC-NRA section 8.4");
		argument1152.getSolution().add(solution1152);
		
		Argument argument1153 = EurFactory.eINSTANCE.createArgument();
		argument1153.setIdentifier("Arg 1.1.5.3");
		argument1153.setContent("Safety objectives have been determined for each identified hazard");
		Solution solution1153 = EurFactory.eINSTANCE.createSolution();
		solution1153.setIdentifier("S1153");
		solution1153.setContent("PSC-NRA section 8.5");
		argument1153.getSolution().add(solution1153);
		
		Argument argument1154 = EurFactory.eINSTANCE.createArgument();
		argument1154.setIdentifier("Arg 1.1.5.4");
		argument1154.setContent("All reasonably foreseeable causes of each hazard have been identified");
		Solution solution1154 = EurFactory.eINSTANCE.createSolution();
		solution1154.setIdentifier("S1154");
		solution1154.setContent("PSC-NRA section 8.6");
		argument1154.getSolution().add(solution1154);
		
		Argument argument1155 = EurFactory.eINSTANCE.createArgument();
		argument1155.setIdentifier("Arg 1.1.5.5");
		argument1155.setContent("Safety requirements have been specified (or assumptions stated) for causes of each hazard, and for any available mitigations internal or external to the system, such that the system criteria are satisfied");
		Solution solution1155 = EurFactory.eINSTANCE.createSolution();
		solution1155.setIdentifier("S1155");
		solution1155.setContent("PSC-NRA section 8.7");
		argument1155.getSolution().add(solution1155);

		strategy1.getArgument().add(argument1151);
		strategy1.getArgument().add(argument1152);
		strategy1.getArgument().add(argument1153);
		strategy1.getArgument().add(argument1154);
		strategy1.getArgument().add(argument1155);

		// figure 10 is a functional system description with no argument notation
		
		// figure 11
		Solution solution116 = EurFactory.eINSTANCE.createSolution();
		solution116.setIdentifier("S116");
		solution116.setContent("PSC ADS-B-NRA section 9.2");
		argument116.getSolution().add(solution116);

		// figure 12
		Solution solution117 = EurFactory.eINSTANCE.createSolution();
		solution117.setIdentifier("S117");
		solution117.setContent("PSC ADS-B-NRA section 10.2");
		argument117.getSolution().add(solution117);
		
		// done with example setup from figures
	}

	/**
	 * Write the file, for convenience.
	 * This method is here to produce an artifact to be used for other purposes.
	 * @throws Exception
	 */
	public void testWriteFile() throws Exception {
		String modelPath = System.getProperty("user.home",".") + File.separatorChar + "psc.eur"; //$NON-NLS-1$ //$NON-NLS-2$

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("eur", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		
		URI fileURI = URI.createFileURI(modelPath);
		Resource resource = resourceSet.createResource(fileURI);

		// add all of the non-contained elements
		resource.getContents().add(argument0);
		resource.getContents().addAll(argument0.getCriteria());
		resource.getContents().addAll(argument0.getAssumption());
		resource.getContents().add(assumption1);
		resource.getContents().add(assumption2);
		resource.getContents().add(assumption5);
		resource.getContents().add(context1);
		resource.getContents().add(context3);

		// save the contents of the resource to the file system.
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		resource.save(options);
	}

	
	/**
	 * Tests the primary argument list connections.
	 * @throws Exception
	 */
	public void testArgumentLists() throws Exception {
		assertEquals(4, argument0.getArgument().size());
		assertEquals(3, argument1.getArgument().size());
		assertEquals(0, argument2.getArgument().size());
		assertEquals(0, argument3.getArgument().size());
		assertEquals(0, argument4.getArgument().size());
		assertFalse(argument0.getArgument().isEmpty());
		assertFalse(argument1.getArgument().isEmpty());
		assertTrue(argument2.getArgument().isEmpty());
		assertTrue(argument3.getArgument().isEmpty());
		assertTrue(argument4.getArgument().isEmpty());
	}

	/**
	 * Tests the primary argument list context lists.
	 * @throws Exception
	 */
	public void testArgumentContextLists() throws Exception {
		assertEquals(0, argument0.getContext().size());
		assertEquals(0, argument1.getContext().size());
		assertEquals(0, argument2.getContext().size());
		assertEquals(0, argument3.getContext().size());
		assertEquals(0, argument4.getContext().size());
		assertTrue(argument0.getContext().isEmpty());
		assertTrue(argument1.getContext().isEmpty());
		assertTrue(argument2.getContext().isEmpty());
		assertTrue(argument3.getContext().isEmpty());
		assertTrue(argument4.getContext().isEmpty());
	}

	/**
	 * Tests the context lists associated with criteria.
	 * @throws Exception
	 */
	public void testCriteriaContextLists() throws Exception {
		assertEquals(4, argument0.getCriteria().size() );
		assertEquals(0, argument1.getCriteria().size() );
		assertEquals(0, argument2.getCriteria().size() );
		assertEquals(0, argument3.getCriteria().size() );
		assertEquals(0, argument4.getCriteria().size() );
		Criteria criteria0 = argument0.getCriteria().get(0);
		Criteria criteria1 = argument0.getCriteria().get(1);
		Criteria criteria2 = argument0.getCriteria().get(2);
		Criteria criteria3 = argument0.getCriteria().get(3);
		assertTrue(criteria0.getContext().isEmpty());
		assertEquals(1, criteria1.getContext().size());
		assertTrue(criteria2.getContext().isEmpty());
		assertTrue(criteria3.getContext().isEmpty());
	}
	
	/**
	 * Tests the assumption lists associated with arguments.
	 * @throws Exception
	 */
	public void testArgumentAssumptionLists() throws Exception {
		Criteria criteria1 = argument0.getCriteria().get(1);
		assertEquals(1,criteria1.getContext().size());
		Context context1 = criteria1.getContext().get(0);
		assertEquals(1,context1.getAssumption().size());
	}
		
	/**
	 * Tests some sub-argument lists.
	 * @throws Exception
	 */
	public void testArgument1Children() throws Exception {
		assertEquals(3,argument1.getArgument().size());
		Argument argument11 = argument1.getArgument().get(0);
		assertEquals(7,argument11.getArgument().size());
	}
	
	/**
	 * Tests the to-be-supported flags for all elements.
	 * Iterates over all members and checks the supported flags.
	 * @throws Exception
	 */
	public void testAllSupported() throws Exception {
		
		EurSwitch<Boolean> visitor = new EurSwitch<Boolean> () {
			public Boolean caseArgument(Argument argument) {
				assertFalse(argument.isToBeSupported());
				return Boolean.TRUE;
			}
			
			public Boolean defaultCase(EObject e) {
				return Boolean.TRUE;
			}
		};

		// visit the model, collect statistics
		for ( final Iterator<EObject> i = argument0.eAllContents(); i.hasNext(); ) { 
			EObject eo = i.next();
			visitor.doSwitch(eo);
		} 
	}
	
	/**
	 * Tests the tags for all elements.
	 * Iterates over all members and checks the model element tags.
	 * @throws Exception
	 */
	public void testAllTags() throws Exception {
		EurSwitch<Boolean> visitor = new EurSwitch<Boolean> () {
			public Boolean caseModelElement(ModelElement me) {
				assertTrue(me.getIsTagged().isEmpty());
				return Boolean.TRUE;
			}
			
			public Boolean defaultCase(EObject e) {
				return Boolean.TRUE;
			}
		};

		// visit the model, collect statistics
		for ( final Iterator<EObject> i = argument0.eAllContents(); i.hasNext(); ) { 
			EObject eo = i.next();
			visitor.doSwitch(eo);
		} 
		
	}
}
