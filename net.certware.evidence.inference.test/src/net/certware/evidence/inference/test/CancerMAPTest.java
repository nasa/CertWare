package net.certware.evidence.inference.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.Prune;
import edu.ucla.belief.StateNotFoundException;
import edu.ucla.belief.VariableImpl;
import edu.ucla.belief.inference.JEngineGenerator;
import edu.ucla.belief.inference.JoinTreeInferenceEngineImpl;
import edu.ucla.belief.inference.JoinTreeSettings;
import edu.ucla.belief.inference.map.InitializationMethod;
import edu.ucla.belief.inference.map.MapRunner;
import edu.ucla.belief.inference.map.SearchMethod;
import edu.ucla.belief.io.NetworkIO;
import edu.ucla.util.AbstractStringifier;

/**
 * Tests network loading using CB synthesis.
 */
public class CancerMAPTest {

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
	public void testSizes() {
		assertTrue( beliefNetwork.checkValidProbabilities() );
		assertEquals( 2, beliefNetwork.getMaxDomainCardinality() );
		assertEquals( 8, beliefNetwork.getMaxTheoreticalCPTSize() );
		assertEquals( 2, beliefNetwork.getMinDomainCardinality() );
		assertEquals( 2, beliefNetwork.getMinTheoreticalCPTSize() );
		assertTrue( beliefNetwork.checkValidProbabilities() );
		assertTrue( beliefNetwork.isAcyclic() );
		assertTrue( ! beliefNetwork.isEmpty() );
	}

	@Test
	public void testComputeA() {

	    Map<?, ?> evidence = Collections.EMPTY_MAP;

	    Set<FiniteVariable> setMAPVariables = new HashSet<FiniteVariable>();
	    setMAPVariables.add(varA);

	    /* prune first */
	    BeliefNetwork networkUnpruned = beliefNetwork;
	    Set<FiniteVariable> varsUnpruned = setMAPVariables;
	    Map<?, ?> evidenceUnpruned = evidence;

	    Map<?, ?> oldToNew = new HashMap<Object, Object>( networkUnpruned.size() );
	    Map<?, ?> newToOld = new HashMap<Object, Object>( networkUnpruned.size() );
	    Set<FiniteVariable> queryVarsPruned = new HashSet<FiniteVariable>( varsUnpruned.size() );
	    Map<?, ?> evidencePruned = new HashMap<Object, Object>( evidenceUnpruned.size() );
	    BeliefNetwork networkPruned = Prune.prune( networkUnpruned, varsUnpruned, evidenceUnpruned, oldToNew, newToOld, queryVarsPruned, evidencePruned );

	    beliefNetwork = networkPruned;
	    setMAPVariables = queryVarsPruned;
	    evidence = evidencePruned;

	    /* construct the right kind of inference engine. */
	    JEngineGenerator generator = new JEngineGenerator();
	    JoinTreeInferenceEngineImpl engine = 
	    	generator.makeJoinTreeInferenceEngineImpl( 
	    			beliefNetwork, 
	    			new JoinTreeSettings() );

	    /* set evidence */
	    try{
	      beliefNetwork.getEvidenceController().setObservations( evidencePruned );
	    }catch( StateNotFoundException e ){
	    	fail("setting evidence");
	    };

	    SearchMethod searchmethod = SearchMethod.TABOO;

	    /*
	      Define the initialization method, one of:
	        RANDOM (Random), MPE (MPE), ML (Maximum Likelihoods), SEQ (Sequential)
	    */
	    InitializationMethod initializationmethod = InitializationMethod.ML;

	    /* Define a limit on the number of search steps (default 25). */
	    int steps = 25;

	    /* Construct a MapRunner and run the query. */
	    MapRunner maprunner = new MapRunner();
	    MapRunner.MapResult mapresult = maprunner.approximateMap( beliefNetwork, engine, setMAPVariables, evidence, searchmethod, initializationmethod, steps );
	    Map<?, ?> instantiation = mapresult.instantiation;
	    double score = mapresult.score;

	    
	    /* check results */
	    VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );
	    assertEquals(0.5,score,epsilon);
	    assertEquals(0.5,(score/engine.probability()),epsilon);
	    assertEquals("{A=Present}",instantiation.toString());
	    
	    engine.die();
	}
	
	@Test
	public void testComputeB() {

	    Map<?, ?> evidence = Collections.EMPTY_MAP;

	    Set<FiniteVariable> setMAPVariables = new HashSet<FiniteVariable>();
	    setMAPVariables.add(varB);

	    /* prune first */
	    BeliefNetwork networkUnpruned = beliefNetwork;
	    Set<FiniteVariable> varsUnpruned = setMAPVariables;
	    Map<?, ?> evidenceUnpruned = evidence;

	    Map<?, ?> oldToNew = new HashMap<Object, Object>( networkUnpruned.size() );
	    Map<?, ?> newToOld = new HashMap<Object, Object>( networkUnpruned.size() );
	    Set<FiniteVariable> queryVarsPruned = new HashSet<FiniteVariable>( varsUnpruned.size() );
	    Map<?, ?> evidencePruned = new HashMap<Object, Object>( evidenceUnpruned.size() );
	    BeliefNetwork networkPruned = Prune.prune( networkUnpruned, varsUnpruned, evidenceUnpruned, oldToNew, newToOld, queryVarsPruned, evidencePruned );

	    beliefNetwork = networkPruned;
	    setMAPVariables = queryVarsPruned;
	    evidence = evidencePruned;

	    /* construct the right kind of inference engine. */
	    JEngineGenerator generator = new JEngineGenerator();
	    JoinTreeInferenceEngineImpl engine = 
	    	generator.makeJoinTreeInferenceEngineImpl( 
	    			beliefNetwork, 
	    			new JoinTreeSettings() );

	    /* set evidence */
	    try{
	      beliefNetwork.getEvidenceController().setObservations( evidencePruned );
	    }catch( StateNotFoundException e ){
	    	fail("setting evidence");
	    };

	    SearchMethod searchmethod = SearchMethod.TABOO;

	    /*
	      Define the initialization method, one of:
	        RANDOM (Random), MPE (MPE), ML (Maximum Likelihoods), SEQ (Sequential)
	    */
	    InitializationMethod initializationmethod = InitializationMethod.SEQ;

	    /* Define a limit on the number of search steps (default 25). */
	    int steps = 25;

	    /* Construct a MapRunner and run the query. */
	    MapRunner maprunner = new MapRunner();
	    MapRunner.MapResult mapresult = maprunner.approximateMap( beliefNetwork, engine, setMAPVariables, evidence, searchmethod, initializationmethod, steps );
	    Map<?, ?> instantiation = mapresult.instantiation;
	    double score = mapresult.score;

	    
	    /* check results */
	    VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );
	    assertEquals(0.5,score,epsilon);
	    assertEquals(0.5,(score/engine.probability()),epsilon);
	    assertEquals("{B=Increased}",instantiation.toString());
	    
	    engine.die();
	}
	
	/**
	 * Read the network from a resource file.
	 */
	public BeliefNetwork createBeliefNetwork()
	{
	    String path = "resources/cancer_for_EM.net";
	    
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
