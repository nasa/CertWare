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
public class BarleyReadTest {

	/** model */
	private BeliefNetwork beliefNetwork;
	/** test accuracy */
	static final double epsilon = 0.001;
	/** variables */
	FiniteVariable varA;
	FiniteVariable protein, nprot;

	@Before
	public void setup() {
		beliefNetwork = createBeliefNetwork();
		assertTrue("network",beliefNetwork != null);
		
	    varA = (FiniteVariable) beliefNetwork.forID("A");
	    assertTrue("var A null",varA == null);
	    protein = (FiniteVariable)beliefNetwork.forID("protein");
	    assertTrue("protein",protein!=null);
	    nprot = (FiniteVariable)beliefNetwork.forID("nprot");
	    assertTrue("nprot",nprot!=null);
	}

	@Test
	public void testSizes() {
		assertTrue( beliefNetwork.checkValidProbabilities() );
		assertEquals( 67, beliefNetwork.getMaxDomainCardinality() );
		assertEquals( 40320, beliefNetwork.getMaxTheoreticalCPTSize() );
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
	    String path = "resources/barley.net";
	    
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
