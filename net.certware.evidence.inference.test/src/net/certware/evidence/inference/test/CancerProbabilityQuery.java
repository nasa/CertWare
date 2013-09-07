package net.certware.evidence.inference.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.EliminationHeuristic;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.InferenceEngine;
import edu.ucla.belief.StateNotFoundException;
import edu.ucla.belief.Table;
import edu.ucla.belief.Variable;
import edu.ucla.belief.inference.RCEngineGenerator;
import edu.ucla.belief.inference.RCInfo;
import edu.ucla.belief.io.NetworkIO;
import edu.ucla.belief.io.PropertySuperintendent;

/**
 * Tests network loading using CB synthesis.
 */
public class CancerProbabilityQuery {

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
	public void testComputeA() {

	    Map<FiniteVariable, Object> evidence = new HashMap<FiniteVariable, Object>(2);
	    FiniteVariable var = null;
	    var = (FiniteVariable) beliefNetwork.forID( "C" );
	    evidence.put( var, var.instance( "Present" ) );
	    var = (FiniteVariable) beliefNetwork.forID( "B" );
	    evidence.put( var, var.instance( "Increased" ) );

	    edu.ucla.belief.inference.RCEngineGenerator dynamator = new edu.ucla.belief.inference.RCEngineGenerator();

	    edu.ucla.belief.inference.RCSettings settings = RCEngineGenerator.getSettings( (PropertySuperintendent)beliefNetwork );
	    settings.setEliminationHeuristic( EliminationHeuristic.MIN_FILL );
	    settings.setPrEOnly(              false );
	    settings.setUserMemoryProportion( (double)1.0 );
	    try{
	      settings.validateAllocation( beliefNetwork );
	    }catch( Throwable throwable ){
	       System.err.println( "Error, failed to validate cache allocation: " + throwable );
	       return;
	    }

	    double     actualProportion          = settings.getActualMemoryProportion();
	    RCInfo     info                      = settings.getInfo();

	    //BigInteger cacheEntriesFullCaching   = info.cacheEntriesFullCaching();
	    //BigInteger allocatedCacheEntries     = info.allocatedCacheEntries();
	    //double     recursiveCallsFullCaching = info.recursiveCallsFullCaching();
	    //double     recursiveCalls            = info.recursiveCalls();

	    InferenceEngine engine = dynamator.manufactureInferenceEngine( beliefNetwork );

	    try{
	      beliefNetwork.getEvidenceController().setObservations( evidence );
	    }catch( StateNotFoundException e ){
	      System.err.println( "Error, failed to set evidence: " + e );
	      return;
	    };
	    
	    assertEquals(1.0,actualProportion,epsilon);
	    // assertEquals(64,cacheEntriesFullCaching);
	    // assertEquals(48,allocatedCacheEntries);
	    // assertEquals(308.0,recursiveCallsFullCaching,epsilon);
	    // assertEquals(284.0,recursiveCalls,epsilon);
	    assertEquals(2,info.maxClusterSize());
	    assertEquals(2,info.maxContextSize());
	    assertEquals(2,info.maxCutsetSize());
	    assertEquals(4.27246E-4,info.getMemoryRequirements(),epsilon);

	    double pE = engine.probability();
	    
	    assertEquals(0.25,pE,epsilon);
	    
	    Set<Variable> setMarginalVariables = new HashSet<Variable>();
	    String[] arrayMarginalVariableIDs = new String[] { "A", "C", "B", "E", "D" };
	    for( int i=0; i<arrayMarginalVariableIDs.length; i++ ){
	      setMarginalVariables.add( beliefNetwork.forID( arrayMarginalVariableIDs[i] ) );
	    }

	    
	    
	    Table answer = null;
	    answer = engine.conditional(varA);
	    assertEquals(0.5,answer.getCP(0),epsilon);
	    assertEquals(0.5,answer.getCP(1),epsilon);

	    answer = engine.conditional(varB);
	    assertEquals(1.0,answer.getCP(0),epsilon);
	    assertEquals(0.0,answer.getCP(1),epsilon);

	    answer = engine.conditional(varC);
	    assertEquals(1.0,answer.getCP(0),epsilon);
	    assertEquals(0.0,answer.getCP(1),epsilon);

	    answer = engine.conditional(varD);
	    assertEquals(0.5,answer.getCP(0),epsilon);
	    assertEquals(0.5,answer.getCP(1),epsilon);

	    answer = engine.conditional(varE);
	    assertEquals(0.5,answer.getCP(0),epsilon);
	    assertEquals(0.5,answer.getCP(1),epsilon);

	    //Iterator iterator = setMarginalVariables.iterator();
	    //varMarginal = (FiniteVariable)iterator.next();
	    //answer = engine.conditional( varMarginal );
	    //System.out.println( answer.tableString() );

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
