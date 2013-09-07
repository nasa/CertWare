package net.certware.evidence.inference.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.CPTParameter;
import edu.ucla.belief.CPTShell;
import edu.ucla.belief.EliminationHeuristic;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.InferenceEngine;
import edu.ucla.belief.PartialDerivativeEngine;
import edu.ucla.belief.StateNotFoundException;
import edu.ucla.belief.TableIndex;
import edu.ucla.belief.inference.RCEngineGenerator;
import edu.ucla.belief.inference.RCSettings;
import edu.ucla.belief.io.NetworkIO;
import edu.ucla.belief.io.PropertySuperintendent;
import edu.ucla.belief.sensitivity.SensitivityEngine;
import edu.ucla.belief.sensitivity.SensitivityReport;
import edu.ucla.belief.sensitivity.SingleCPTSuggestion;
import edu.ucla.belief.sensitivity.SingleParamSuggestion;
import edu.ucla.util.ProbabilityInterval;

/**
 * Tests network loading using network from resource file.
 */
public class CancerSensitivity {

	/** model */
	private BeliefNetwork beliefNetwork;
	/** test accuracy */
	static final double epsilon = 0.001;
	/** variables */
	FiniteVariable varA, varB, varC, varD, varE;

	@Before
	public void setup() {
		beliefNetwork = createBeliefNetwork();
		varA = (FiniteVariable) beliefNetwork.forID("A");
		varB = (FiniteVariable) beliefNetwork.forID("B");
		varC = (FiniteVariable) beliefNetwork.forID("C");
		varD = (FiniteVariable) beliefNetwork.forID("D");
		varE = (FiniteVariable) beliefNetwork.forID("E");
	}

	@Test
	public void testSensitivity() {
		/* Define evidence, by id. */
		Map<?, ?> evidence = Collections.EMPTY_MAP;

		/* Define the constraint, by variable id. */

		/* Define event 1. */
		// FiniteVariable varEvent1 = (FiniteVariable) beliefNetwork.forID( "B" );
		Object valueEvent1 = varB.instance( "Increased" );

		/* Define the comparison operator, one of:
	       SensitivityEngine.OPERATOR_EQUALS (=), SensitivityEngine.OPERATOR_GTE (>=), SensitivityEngine.OPERATOR_LTE (<=)
		 */
		Object opComparison = SensitivityEngine.OPERATOR_GTE;

		/* Define the constraint constant. */
		double constant = (double)0.8;

		/* Create the Dynamator(edu.ucla.belief.inference.SynchronizedInferenceEngine$SynchronizedPartialDerivativeEngine). */
		RCEngineGenerator dynamator = new RCEngineGenerator();

		/* Edit settings. */
		RCSettings settings = RCEngineGenerator.getSettings( (PropertySuperintendent)beliefNetwork );
		/*
	      Define the elimination heuristic used to create the dtree, one of:
	        MIN_FILL (Min Fill), MIN_SIZE (Min Size)
		 */
		settings.setEliminationHeuristic( EliminationHeuristic.MIN_FILL );
		/* Do not create an InferenceEngine optimized for only Pr(e). */
		settings.setPrEOnly( false );

		/* Set the fraction of full memory to use. */
		settings.setUserMemoryProportion( (double)1.0 );

		/* Create the cache allocation (very important). */
		try{
			settings.validateAllocation( beliefNetwork );
		}catch( Throwable throwable ){
			fail("validing cache allocation");
		}

		/* Characterize the cache allocation and estimated run time. */
		//double     actualProportion          = settings.getActualMemoryProportion();
		//RCInfo     info                      = settings.getInfo();
		//BigInteger cacheEntriesFullCaching   = info.cacheEntriesFullCaching();
		//BigInteger allocatedCacheEntries     = info.allocatedCacheEntries();
		//double     recursiveCallsFullCaching = info.recursiveCallsFullCaching();
		//double     recursiveCalls            = info.recursiveCalls();

		/* Create the InferenceEngine. */
		InferenceEngine engine = dynamator.manufactureInferenceEngine( beliefNetwork );

		/* Set evidence. */
		try{
			beliefNetwork.getEvidenceController().setObservations( evidence );
		}catch( StateNotFoundException e ){
			fail("setting evidence");
		};

		/* Create the SensitivityEngine. */
		SensitivityEngine sensitivityengine = 
			new SensitivityEngine( 
					beliefNetwork, 
					engine, 
					(PartialDerivativeEngine)engine, 
					new PrintWriter( System.out ) );

		/* Get the results. */
		SensitivityReport report = 
			sensitivityengine.getResults( 
					varB, 
					valueEvent1, 
					(FiniteVariable)null, 
					(Object)null, 
					(Object)null, 
					opComparison, 
					constant, 
					/* flagSingleParameter */ true, 
					/* flagSingleCPT */ true );

		/* Print the results. */
		if( report == null ){
			fail("network already satisfies constraint");
		}

		List<?> singleParameterSuggestions = report.generateSingleParamSuggestions();
		Map<?, ?> mapFiniteVariablesToSingleCPTSuggestions = report.getSingleCPTMap();

		if( singleParameterSuggestions.isEmpty() && mapFiniteVariablesToSingleCPTSuggestions.isEmpty() ) {
			fail("constraint is unsatisfiable");
		}

		// single parameter suggestions
		assertEquals(2,singleParameterSuggestions.size());
		
		SingleParamSuggestion s1 = (SingleParamSuggestion) singleParameterSuggestions.toArray()[0];
		assertEquals("Pr( HuginNode A = Present )", s1.getCPTParameter().toString());
		assertSame(varA, s1.getCPTParameter().getVariable());
		assertEquals(0.2,(Double)s1.getCurrentValue(),epsilon);
		assertEquals(0.9999, s1.getSuggestedParameterValue(), epsilon);
		// assertTrue(Double.isInfinite( s1.getLogOddsChange()));
		
		SingleParamSuggestion s2 = (SingleParamSuggestion) singleParameterSuggestions.toArray()[1];
		assertSame(varB, s2.getCPTParameter().getVariable());
		assertEquals(0.2,(Double)s2.getCurrentValue(),epsilon);
		assertEquals(0.8, s2.getSuggestedParameterValue(), epsilon);
		assertEquals(2.7725, s2.getLogOddsChange(), epsilon );

		// multiple parameter suggestions
		System.out.println( "Single CPT (multiple parameter) suggestions:\n{" );
		FiniteVariable target = null;
		SingleCPTSuggestion suggestion = null;
		//ProbabilityInterval[] intervals = null;
		for( Iterator<?> iterator = mapFiniteVariablesToSingleCPTSuggestions.keySet().iterator(); iterator.hasNext(); ){
			target = (FiniteVariable)iterator.next();
			suggestion = (SingleCPTSuggestion) mapFiniteVariablesToSingleCPTSuggestions.get( target );
			//intervals = suggestion.probabilityIntervals();
			System.out.println( "Suggestion for " + target.getID() + "'s CPT, log odds change " + suggestion.getLogOddsChange() );
			System.out.print( suggestion.toString() );
			System.out.println();
		}
		System.out.println( "}" );

		
		assertEquals(2,mapFiniteVariablesToSingleCPTSuggestions.size());

		// single result
		System.out.println( "Single CPT (single parameter) suggestions:\n{" );
		SingleCPTSuggestion c1 = (SingleCPTSuggestion) mapFiniteVariablesToSingleCPTSuggestions.get(mapFiniteVariablesToSingleCPTSuggestions.keySet().toArray()[0]);
		ProbabilityInterval[] c1intervals = c1.probabilityIntervals();
		assertSame(varA,c1.getVariable());
		assertEquals(36.3313,c1.getLogOddsChange(),epsilon);
		FiniteVariable f1 = c1.getVariable();
		CPTShell shell1 = f1.getCPTShell();
		System.out.println("Suggested " + f1 + " log odds change " + c1.getLogOddsChange() );
		System.out.println("" + f1 + '\t' + "Current value" + '\t' + "Suggested value");
		int x = 0;
		for ( CPTParameter ptp : shell1.getCPTParameters() ) {
			System.out.println(
					"" + ptp.getJointInstance().getInstance() 
					+ '\t' + ptp.getValue() 
					+ '\t' + c1intervals[x++].toString());
		}
		System.out.println("}");

		// multiple result
		SingleCPTSuggestion c2 = (SingleCPTSuggestion) mapFiniteVariablesToSingleCPTSuggestions.get(mapFiniteVariablesToSingleCPTSuggestions.keySet().toArray()[1]);
		assertSame(varB,c2.getVariable());
		assertEquals(2.51159,c2.getLogOddsChange(),epsilon);

		// full table assertions
		CPTShell shell = c2.getCPTShell();
		TableIndex index = shell.index();
		List<?> variables = index.variables();
		assertEquals("HuginNode A",variables.get(0).toString());
		assertEquals("HuginNode B",variables.get(1).toString());
		TableIndex.Iterator iter = shell.index().iterator();

		// index 0
		int i = iter.next();
		int[] inds = iter.current();
		assertEquals("Present",((FiniteVariable)variables.get(0)).instance(inds[0]));
		assertEquals("Increased",((FiniteVariable)variables.get(1)).instance(inds[1]));
		assertEquals(0.8,c2.getProb(i),epsilon);
		assertEquals(0.980118,c2.probabilityInterval(i).closestToZero(),epsilon);
		
		// index 1
		i = iter.next();
		inds = iter.current();
		assertEquals("Present",((FiniteVariable)variables.get(0)).instance(inds[0]));
		assertEquals("Not increased",((FiniteVariable)variables.get(1)).instance(inds[1]));
		assertEquals(0.2,c2.getProb(i),epsilon);
		assertEquals(0.019881,c2.probabilityInterval(i).closestToZero(),epsilon);

		// index 2
		i = iter.next();
		inds = iter.current();
		assertEquals("Absent",((FiniteVariable)variables.get(0)).instance(inds[0]));
		assertEquals("Increased",((FiniteVariable)variables.get(1)).instance(inds[1]));
		assertEquals(0.2,c2.getProb(i),epsilon);
		assertEquals(0.75497,c2.probabilityInterval(i).closestToZero(),epsilon);

		// index 3
		i = iter.next();
		inds = iter.current();
		assertEquals("Absent",((FiniteVariable)variables.get(0)).instance(inds[0]));
		assertEquals("Not increased",((FiniteVariable)variables.get(1)).instance(inds[1]));
		assertEquals(0.8,c2.getProb(i),epsilon);
		assertEquals(0.245029,c2.probabilityInterval(i).closestToZero(),epsilon);

		engine.die();
	}
	
	
	/**
	 * Read the network from a resource file.
	 */
	public BeliefNetwork createBeliefNetwork()
	{
		String path = "resources/cancer.net";

		File f = new File(path);
		BeliefNetwork ret = null;
		try {
			ret = NetworkIO.read( f );
		} catch( Exception e ) {
			fail("reading network" + ' ' + e);
		}
		return ret;
	}
}
