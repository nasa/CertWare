/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */

package net.certware.argument.cae;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 * @generatedBy CodePro at 10/13/10 4:49 PM
 * @author mrb
 */
@SuppressWarnings("unused")
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
	net.certware.argument.cae.util.TestAll.class})
public class TestAll {
}
