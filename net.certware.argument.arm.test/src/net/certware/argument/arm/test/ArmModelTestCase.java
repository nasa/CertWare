package net.certware.argument.arm.test;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import junit.framework.TestCase;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArmFactory;

import static org.easymock.EasyMock.*;

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
