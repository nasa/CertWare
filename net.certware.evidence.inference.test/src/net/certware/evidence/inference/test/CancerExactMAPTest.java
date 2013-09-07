package net.certware.evidence.inference.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import il2.inf.map.MapSearch;

import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.VariableImpl;
import edu.ucla.belief.inference.map.ExactMap;
import edu.ucla.belief.io.NetworkIO;
import edu.ucla.util.AbstractStringifier;

/**
 * Tests network loading using CB synthesis.
 */
public class CancerExactMAPTest {

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

	    Map<?, ?> evidence = Collections.EMPTY_MAP;

	    Set<FiniteVariable> setMAPVariables = new HashSet<FiniteVariable>();
	    setMAPVariables.add(varA);

	    BeliefNetwork bn = beliefNetwork;
	    /* Calculate MAP exactly. */

	    /* Define a time limit in seconds (default 60). 0 means no limit. */
	    int timeoutsecs = 60;

	    /* Define a width barrier (default 0). 0 means no limit. */
	    int widthbarrier = 0;

	    /* Call static ExactMap method (unsloppy version). */
	    MapSearch.MapInfo mapinfo = ExactMap.computeMap( bn, setMAPVariables, evidence, timeoutsecs, widthbarrier );
	    MapSearch.MapResult exactmapresult = (MapSearch.MapResult) mapinfo.results.iterator().next();
	    Map<?, ?> instantiation = exactmapresult.getConvertedInstatiation();
	    double score = exactmapresult.score;
	    boolean flagExact = mapinfo.finished;

	    VariableImpl.setStringifier( AbstractStringifier.VARIABLE_ID );

	    // check results
	    assertEquals(0.5,score,epsilon); // p(MAP,e)
	    assertEquals("{A=Present}",instantiation.toString());
	    assertTrue(flagExact);

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
