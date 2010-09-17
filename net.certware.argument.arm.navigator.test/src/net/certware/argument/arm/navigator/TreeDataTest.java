package net.certware.argument.arm.navigator;

import org.eclipse.core.resources.IFile;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TreeDataTest</code> contains tests for the class <code>{@link TreeData}</code>.
 *
 * @generatedBy CodePro at 9/17/10 12:24 PM
 * @author mrb
 * @version $Revision: 1.0 $
 */
public class TreeDataTest {
	/**
	 * Run the TreeData() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testTreeData_1()
		throws Exception {

		TreeData result = new TreeData();

		// add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getType());
		assertEquals(null, result.getDescription());
		assertEquals(0, result.getCount());
		assertEquals(null, result.getIfile());
	}

	/**
	 * Run the TreeData(IFile,String,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testTreeData_2()
		throws Exception {
		IFile ifile = null;
		String description = "";
		int count = 1;
		int type = 1;

		TreeData result = new TreeData(ifile, description, count, type);

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.getType());
		assertEquals("", result.getDescription());
		assertEquals(1, result.getCount());
		assertEquals(null, result.getIfile());
	}

	/**
	 * Run the int getCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetCount_1()
		throws Exception {
		TreeData fixture = new TreeData((IFile) null, "", 1, 1);

		int result = fixture.getCount();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		TreeData fixture = new TreeData((IFile) null, "", 1, 1);

		String result = fixture.getDescription();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the IFile getIfile() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetIfile_1()
		throws Exception {
		TreeData fixture = new TreeData((IFile) null, "", 1, 1);

		IFile result = fixture.getIfile();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetType_1()
		throws Exception {
		TreeData fixture = new TreeData((IFile) null, "", 1, 1);

		int result = fixture.getType();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TreeDataTest.class);
	}
}