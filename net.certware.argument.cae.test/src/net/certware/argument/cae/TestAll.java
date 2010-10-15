package net.certware.argument.cae;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 * <p>
 * Copyright (c) 2010 Kestrel Technology LLC.  All rights reserved.
 *
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	CaePackageTest.class,
	ArgumentTest.class,
	AssumptionTest.class,
	EvidenceTest.class,
	JustificationTest.class,
	CaeFactoryTest.class,
	ContextTest.class,
	ClaimTest.class,
	net.certware.argument.cae.impl.TestAll.class,
	net.certware.argument.cae.util.TestAll.class,
})
public class TestAll {
}
