package net.certware.argument.gsn.test;

import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnFactory;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import junit.framework.TestCase;

/**
 * Unit testing Bluetooth security case example from OMG document.
 * @author mrb
 * @since 0.1
 */
public class GsnIndustrialPressTestCase extends TestCase {

	Goal g1;

	/**
	 * Dispose of the argument.
	 */
	public void tearDown() {
		g1 = null;
	}
	
	/**
	 * Populate the argument model.
	 */
	public void setUp() {
		g1 = GsnFactory.eINSTANCE.createGoal();
		g1.setIdentifier("G1");
		
		Goal g2 = GsnFactory.eINSTANCE.createGoal();
		g2.setIdentifier("G2");
		Goal g3 = GsnFactory.eINSTANCE.createGoal();
		g3.setIdentifier("G3");
		Goal g4 = GsnFactory.eINSTANCE.createGoal();
		g4.setIdentifier("G4");
		g4.setToBeSupported(true);
		Goal g5 = GsnFactory.eINSTANCE.createGoal();
		g5.setIdentifier("G5");
		Goal g7 = GsnFactory.eINSTANCE.createGoal();
		g7.setIdentifier("G7");
		Goal g8 = GsnFactory.eINSTANCE.createGoal();
		g8.setIdentifier("G8");
		Goal g9 = GsnFactory.eINSTANCE.createGoal();
		g9.setIdentifier("G9");
		
		Strategy s1 = GsnFactory.eINSTANCE.createStrategy();
		s1.setIdentifier("S1");
		Strategy s2 = GsnFactory.eINSTANCE.createStrategy();
		s2.setIdentifier("S2");
		
		Justification c1 = GsnFactory.eINSTANCE.createJustification();
		c1.setIdentifier("C1");
		
		Solution sn1 = GsnFactory.eINSTANCE.createSolution();
		sn1.setIdentifier("Sn1");
		Solution sn2 = GsnFactory.eINSTANCE.createSolution();
		sn2.setIdentifier("Sn2");
		Solution sn3 = GsnFactory.eINSTANCE.createSolution();
		sn3.setIdentifier("Sn3");
		Solution sn4 = GsnFactory.eINSTANCE.createSolution();
		sn4.setIdentifier("Sn4");

		// assemble
		g1.getStrategies().add(s1);
		g1.getStrategies().add(s2);
		
		s2.getJustifications().add(c1);

		s1.getGoals().add(g2);
		s1.getGoals().add(g3);
		s1.getGoals().add(g4);
		
		s2.getGoals().add(g8);
		s2.getGoals().add(g9);
		
		g2.getSubGoals().add(g5);
		
		g3.getSubGoals().add(g7);
		
		g2.getGoalSolutions().add(sn1);
		
		g5.getGoalSolutions().add(sn2);
		g7.getGoalSolutions().add(sn2);
		
		g8.getGoalSolutions().add(sn3);
		g9.getGoalSolutions().add(sn3);

		g8.getGoalSolutions().add(sn4);
		g9.getGoalSolutions().add(sn4);
		
	}
	

	/**
	 * @throws Exception
	 */
	public void testToplevelLists() throws Exception {
		assertEquals(2, g1.getStrategies().size());
		assertEquals(0, g1.getAssumptions().size());
		assertEquals(0, g1.getGoalContexts().size());
		assertEquals(0, g1.getIsTagged().size());
		assertEquals(0, g1.getGoalSolutions().size());
	}

	/**
	 * @throws Exception
	 */
	public void testStrategyLists() throws Exception {
		Strategy s = g1.getStrategies().get(0);
		assertEquals(3, s.getGoals().size() );
		
		s = g1.getStrategies().get(1);
		assertEquals(2, s.getGoals().size() );
	}
	
	/**
	 * @throws Exception
	 */
	public void testSupported() throws Exception { 
		Goal g = g1.getStrategies().get(0).getGoals().get(0);
		assertFalse(g.isToBeSupported());
		
		g = g1.getStrategies().get(0).getGoals().get(1);
		assertFalse(g.isToBeSupported());
		
		g = g1.getStrategies().get(0).getGoals().get(2);
		assertTrue(g.isToBeSupported());
	}
	
	/**
	 * @throws Exception
	 */
	public void testArgument() throws Exception {
		assertNull(g1.getContent());
		assertNull(g1.getDescription());
		assertEquals("G1",g1.getIdentifier());
	}
}
