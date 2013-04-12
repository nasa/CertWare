package net.certware.evidence.inference.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite for inference using samiam.
 * @author mrb
 * @since 1.2.1
 */
@RunWith(Suite.class)
@Suite.SuiteClasses( { 
	CancerManualTest.class, 
	CancerReadTest.class,
	CancerMAPTest.class,
	CancerJoinTest.class,
	CancerExactMAPTest.class,
	CancerSensitivity.class,
	CancerProbabilityQuery.class,
	BarleyReadTest.class
	})
public class AllTests {
}