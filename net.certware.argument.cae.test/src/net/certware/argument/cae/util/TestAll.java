package net.certware.argument.cae.util;

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
	CaeResourceFactoryImplTest.class,
	CaeResourceImplTest.class,
	CaeAdapterFactoryTest.class,
	CaeSwitchTest.class,
})
public class TestAll {
}
