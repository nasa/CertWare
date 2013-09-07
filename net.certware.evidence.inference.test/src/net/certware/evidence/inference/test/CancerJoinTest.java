package net.certware.evidence.inference.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.BeliefNetworkImpl;
import edu.ucla.belief.EliminationHeuristic;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.FiniteVariableImpl;
import edu.ucla.belief.InferenceEngine;
import edu.ucla.belief.StateNotFoundException;
import edu.ucla.belief.Table;
import edu.ucla.belief.TableShell;
import edu.ucla.belief.inference.JEngineGenerator;
import edu.ucla.belief.inference.JoinTreeSettings;
import edu.ucla.belief.io.PropertySuperintendent;
import edu.ucla.belief.io.dsl.DSLNodeType;

/*
@Test public void method()	 Annotation @Test identifies that this method is a test method.
@Before public void method()	 Will perform the method() before each test. This method can prepare the test environment, e.g. read input data, initialize the class)
@After public void method()	 Test method must start with test
@BeforeClass public void method()	 Will perform the method before the start of all tests. This can be used to perform time intensive activities for example be used to connect to a database
@AfterClass public void method()	 Will perform the method after all tests have finished. This can be used to perform clean-up activities for example be used to disconnect to a database
@Ignore	 Will ignore the test method, e.g. useful if the underlying code has been changed and the test has not yet been adapted or if the runtime of this test is just to long to be included.
@Test(expected=IllegalArgumentException.class)	 Tests if the method throws the named exception
@Test(timeout=100)
 */

/**
 * Tests network loading using CB synthesis.
 */
public class CancerJoinTest {

	private BeliefNetwork beliefNetwork;
	static final double epsilon = 0.001;
	FiniteVariable varA, varB, varC, varD, varE;

	@Before
	public void setup() {
		beliefNetwork = createBeliefNetwork();
	}

	@After
	public void tearDown() {
	}


	@Test
	public void testEvidence() {
		Map<FiniteVariable, Object> evidence = new HashMap<FiniteVariable, Object>(2);
		FiniteVariable var = null;
		var = (FiniteVariable) beliefNetwork.forID( "C" );
		evidence.put( var, var.instance( "Present" ) );
		var = (FiniteVariable) beliefNetwork.forID( "B" );
		evidence.put( var, var.instance( "Increased" ) );

	    /* Create the Dynamator(edu.ucla.belief.inference.SynchronizedInferenceEngine$SynchronizedPartialDerivativeEngine). */
	    JEngineGenerator dynamator = new JEngineGenerator();

	    /* Edit settings. */
	    JoinTreeSettings settings = dynamator.getSettings( (PropertySuperintendent)beliefNetwork, true );
	    /*
	      Define the elimination order heuristic used to create the join tree, one of:
	        MIN_FILL (Min Fill), MIN_SIZE (Min Size)
	    */
	    settings.setEliminationHeuristic( EliminationHeuristic.MIN_FILL );

	    /* Create the InferenceEngine. */
	    InferenceEngine engine = dynamator.manufactureInferenceEngine( beliefNetwork );

	    /* Set evidence. */
	    try{
	      beliefNetwork.getEvidenceController().setObservations( evidence );
	    }catch( StateNotFoundException e ){
	    	fail("Error, failed to set evidence: " + e);
	      return;
	    };

	    /* Calculate Pr(e). */
	    double pE = engine.probability();
	    assertEquals(0.04,pE,epsilon); // Pr(e)

	    /* Define the set of 5 variables for which we want marginal probabilities, by id. */
	    /*
	    Set setMarginalVariables = new HashSet();
	    String[] arrayMarginalVariableIDs = new String[] { "E", "C", "B", "A", "D" };
	    for( int i=0; i<arrayMarginalVariableIDs.length; i++ ){
	      setMarginalVariables.add( beliefNetwork.forID( arrayMarginalVariableIDs[i] ) );
	    }
	    */

		// marginals
		Table answerA = engine.conditional(varA);
		assertEquals(1,answerA.variables().size());
		assertEquals(2,answerA.getCPLength());
		assertEquals(0.8,answerA.getCP(0),epsilon);
		assertEquals(0.2,answerA.getCP(1),epsilon);
		assertEquals(0.7219,answerA.entropy(),epsilon);

		Table answerB = engine.conditional(varB);
		assertEquals(1,answerB.variables().size());
		assertEquals(2,answerB.getCPLength());
		assertEquals(1.0,answerB.getCP(0),epsilon);
		assertEquals(0.0,answerB.getCP(1),epsilon);
		assertEquals(0.0,answerB.entropy(),epsilon);

		Table answerC = engine.conditional(varC);
		assertEquals(1,answerC.variables().size());
		assertEquals(2,answerC.getCPLength());
		assertEquals(1.0,answerC.getCP(0),epsilon);
		assertEquals(0.0,answerC.getCP(1),epsilon);
		assertEquals(0.0,answerC.entropy(),epsilon);

		Table answerD = engine.conditional(varD);
		assertEquals(1,answerD.variables().size());
		assertEquals(2,answerD.getCPLength());
		assertEquals(0.8,answerD.getCP(0),epsilon);
		assertEquals(0.2,answerD.getCP(1),epsilon);
		assertEquals(0.7219,answerD.entropy(),epsilon);

		Table answerE = engine.conditional(varE);
		assertEquals(1,answerE.variables().size());
		assertEquals(2,answerE.getCPLength());
		assertEquals(0.8,answerE.getCP(0),epsilon);
		assertEquals(0.2,answerE.getCP(1),epsilon);
		assertEquals(0.7219,answerE.entropy(),epsilon);

		engine.die();
	}




	/**
     * Builds a new model from scratch, as simply as possible, 
     * using classes in package edu.ucla.belief (il1).
	 */
	public BeliefNetwork createBeliefNetwork()
	{
		beliefNetwork = new BeliefNetworkImpl();
		/* Setup a discrete variable called "A",
       with states "Present", "Absent". */
		String              id0 = "A";
		String[]        values0 = new String[]{ "Present", "Absent" };
		varA = new FiniteVariableImpl( id0, values0 );
		beliefNetwork.addVariable( varA, true );//pass second argument true, to construct a default CPTShell (TableShell) for var0

		/* Setup a discrete variable called "B",
       with states "Increased", "Not increased". */
		String              id1 = "B";
		String[]        values1 = new String[]{ "Increased", "Not increased" };
		varB = new FiniteVariableImpl( id1, values1 );
		beliefNetwork.addVariable( varB, true );//pass second argument true, to construct a default CPTShell (TableShell) for var1

		/* Setup a discrete variable called "C",
       with states "Present", "Absent". */
		String              id2 = "C";
		String[]        values2 = new String[]{ "Present", "Absent" };
		varC = new FiniteVariableImpl( id2, values2 );
		beliefNetwork.addVariable( varC, true );//pass second argument true, to construct a default CPTShell (TableShell) for var2

		/* Setup a discrete variable called "D",
       with states "Present", "Absent". */
		String              id3 = "D";
		String[]        values3 = new String[]{ "Present", "Absent" };
		varD = new FiniteVariableImpl( id3, values3 );
		beliefNetwork.addVariable( varD, true );//pass second argument true, to construct a default CPTShell (TableShell) for var3

		/* Setup a discrete variable called "E",
       with states "Present", "Absent". */
		String              id4 = "E";
		String[]        values4 = new String[]{ "Present", "Absent" };
		varE = new FiniteVariableImpl( id4, values4 );
		beliefNetwork.addVariable( varE, true );//pass second argument true, to construct a default CPTShell (TableShell) for var4

		/* Add edges stopping at var1 ("B") */
		beliefNetwork.addEdge( varA, varB );

		/* Add edges stopping at var2 ("C") */
		beliefNetwork.addEdge( varA, varC );

		/* Add edges stopping at var3 ("D") */
		beliefNetwork.addEdge( varC, varD );
		beliefNetwork.addEdge( varB, varD );

		/* Add edges stopping at var4 ("E") */
		beliefNetwork.addEdge( varC, varE );

		/* For the cpts, create arrays of double-precision floating point values. */
		//A       Value
		//Present 0.2
		//Absent  0.8
		double[] cpt0 = new double[]{ 0.2, 0.8 };
		//A       B             Value
		//Present Increased     0.8
		//Present Not increased 0.2
		//Absent  Increased     0.2
		//Absent  Not increased 0.8
		double[] cpt1 = new double[]{ 0.8, 0.2, 0.2, 0.8 };
		//A       C       Value
		//Present Present 0.2
		//Present Absent  0.8
		//Absent  Present 0.05
		//Absent  Absent  0.95
		double[] cpt2 = new double[]{ 0.2, 0.8, 0.05, 0.95 };
		//C       B             D       Value
		//Present Increased     Present 0.8
		//Present Increased     Absent  0.2
		//Present Not increased Present 0.8
		//Present Not increased Absent  0.2
		//Absent  Increased     Present 0.8
		//Absent  Increased     Absent  0.2
		//Absent  Not increased Present 0.05
		//Absent  Not increased Absent  0.95
		double[] cpt3 = new double[]{ 0.8, 0.2, 0.8, 0.2, 0.8, 0.2, 0.05, 0.95 };
		//C       E       Value
		//Present Present 0.8
		//Present Absent  0.2
		//Absent  Present 0.6
		//Absent  Absent  0.4
		double[] cpt4 = new double[]{ 0.8, 0.2, 0.6, 0.4 };

		/* Specify parameters as full conditional probability tables. */
		DSLNodeType cpt_type = DSLNodeType.CPT;

		/* Set the cpt data for each variable. */
		TableShell      tShell0 = (TableShell) varA.getCPTShell( cpt_type );
		tShell0.setValues( cpt0 );
		TableShell      tShell1 = (TableShell) varB.getCPTShell( cpt_type );
		tShell1.setValues( cpt1 );
		TableShell      tShell2 = (TableShell) varC.getCPTShell( cpt_type );
		tShell2.setValues( cpt2 );
		TableShell      tShell3 = (TableShell) varD.getCPTShell( cpt_type );
		tShell3.setValues( cpt3 );
		TableShell      tShell4 = (TableShell) varE.getCPTShell( cpt_type );
		tShell4.setValues( cpt4 );

		/* Done. */
		return beliefNetwork;
	}
}
