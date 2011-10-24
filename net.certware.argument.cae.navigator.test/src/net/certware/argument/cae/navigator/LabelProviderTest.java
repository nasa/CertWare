/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */

package net.certware.argument.cae.navigator;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.eclipse.core.resources.IFile;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>LabelProviderTest</code> contains tests for the class <code>{@link LabelProvider}</code>.
 * @generatedBy CodePro at 10/13/10 5:00 PM
 * @author mrb
 */
public class LabelProviderTest {
	/**
	 * Run the LabelProvider() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test
	public void testLabelProvider_1()
		throws Exception {

		LabelProvider result = new LabelProvider();

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetDescription_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object anElement = new TreeData();

		String result = fixture.getDescription(anElement);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetDescription_2()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object anElement = new Object();

		String result = fixture.getDescription(anElement);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetImage_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData(EasyMock.createNiceMock(IFile.class), "", 1, 2);

		Image result = fixture.getImage(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetImage_2()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData(EasyMock.createNiceMock(IFile.class), "", 1, 1);

		Image result = fixture.getImage(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetImage_3()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData(EasyMock.createNiceMock(IFile.class), "", 1, 0);

		Image result = fixture.getImage(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetImage_4()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData(EasyMock.createNiceMock(IFile.class), "", 1, 3);

		Image result = fixture.getImage(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetImage_5()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new Object();

		Image result = fixture.getImage(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getText(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetText_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData(EasyMock.createNiceMock(IFile.class), "", -1, 1);

		String result = fixture.getText(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getText(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetText_2()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData(EasyMock.createNiceMock(IFile.class), "", 1, 1);

		String result = fixture.getText(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getText(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = org.eclipse.swt.SWTError.class)
	public void testGetText_3()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new Object();

		String result = fixture.getText(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// TODO: add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// TODO: add additional tear down code here
	}
}