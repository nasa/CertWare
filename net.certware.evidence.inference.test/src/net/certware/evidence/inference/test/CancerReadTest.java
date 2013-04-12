package net.certware.evidence.inference.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.FiniteVariable;
import edu.ucla.belief.io.NetworkIO;

/**
 * Tests network loading using network from resource file.
 */
public class CancerReadTest {

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
