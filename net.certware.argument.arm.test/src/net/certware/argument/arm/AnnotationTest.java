package net.certware.argument.arm;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>AnnotationTest</code> contains tests for the class <code>{@link Annotation}</code>.
 * <p>
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved..  All rights reserved.
 *
 * @generatedBy CodePro at 10/12/10 1:18 PM
 * @author mrb
 */
public class AnnotationTest {
	
	/**
	 * Confirms empty lists on construction.
	 */
	@Test
	public void testAnnotation1() {
		Annotation a = ArmFactory.eINSTANCE.createAnnotation();
		assertTrue(a.getIsTagged().isEmpty());
		assertTrue(a.getSource().isEmpty());
		assertTrue(a.getTarget().isEmpty());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@Before
	public void setUp()
		throws Exception {
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/12/10 1:33 PM
	 */
	@After
	public void tearDown()
		throws Exception {
	}
}