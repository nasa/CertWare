/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.test;

import junit.framework.TestCase;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArmFactory;

/**
 * Unit testing various combinations of model elements.
 * @author mrb
 * @since 0.1
 */
public class ArmModelTestCase extends TestCase {

	/**
	 * Tests argument object initialization.
	 * @throws Exception
	 */
	public void testArgumentInitialization() throws Exception {
		Argument argument = ArmFactory.eINSTANCE.createArgument();
		assertTrue(argument.getContainsArgument().isEmpty());
		assertTrue(argument.getContainsArgumentElement().isEmpty());
		assertTrue(argument.getContainsArgumentLink().isEmpty());
		assertTrue(argument.getIsTagged().isEmpty());
		assertNull(argument.getContent());
		assertNull(argument.getDescription());
		assertNull(argument.getIdentifier());
	}

	public void testArgumentCalls() throws Exception {
		
		/*
		 * 20100824 MRB 
		 * This code fails with a dependency on objenesis and cglib.
		 * These should not be needed and are caused by a bug in EasyMock.
		 * A new version of EasyMock will eliminate the dependency.
		 */
		/*
		String description = "test argument";
		Argument a = ArmFactory.eINSTANCE.createArgument();
		a.setDescription(description);

		EList<Argument> alist = new BasicEList<Argument>();
		alist.add( a );
		
		Argument argument = createMock(Argument.class);
		expect(argument.getContainsArgument()).andReturn(alist).once();
		expect(argument.getContent()).andReturn("").once();
		expect(argument.getDescription()).andReturn("").once();
		
		replay(argument);
		EList<Argument> rv = argument.getContainsArgument();
		assertTrue(rv.get(0).equals(description));
		verify(argument);
		
		*/
	}
	
}
