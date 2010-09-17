package net.certware.argument.arm.navigator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.internal.navigator.NavigatorContentService;
import org.eclipse.ui.internal.navigator.NavigatorContentServiceLabelProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>LabelProviderTest</code> contains tests for the class <code>{@link LabelProvider}</code>.
 *
 * @generatedBy CodePro at 9/17/10 12:26 PM
 * @author mrb
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("restriction")
public class LabelProviderTest {
	/**
	 * Run the LabelProvider() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testLabelProvider_1()
		throws Exception {

		LabelProvider result = new LabelProvider();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void addListener(ILabelProviderListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testAddListener_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		ILabelProviderListener listener = new NavigatorContentServiceLabelProvider(new NavigatorContentService(""));

		fixture.addListener(listener);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);

		fixture.dispose();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
	}

	/**
	 * Run the String getDescription(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetDescription_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object anElement = new TreeData();

		String result = fixture.getDescription(anElement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the String getDescription(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetDescription_2()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object anElement = new Object();

		String result = fixture.getDescription(anElement);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetImage_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData((IFile) null, "", 1, 2);

		Image result = fixture.getImage(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetImage_2()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData((IFile) null, "", 1, 1);

		Image result = fixture.getImage(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetImage_3()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData((IFile) null, "", 1, 0);

		Image result = fixture.getImage(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetImage_4()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData((IFile) null, "", 1, 3);

		Image result = fixture.getImage(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the Image getImage(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetImage_5()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new Object();

		Image result = fixture.getImage(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetText_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData((IFile) null, "", -1, 1);

		String result = fixture.getText(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetText_2()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new TreeData((IFile) null, "", 1, 1);

		String result = fixture.getText(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the String getText(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testGetText_3()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new Object();

		String result = fixture.getText(element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertNotNull(result);
	}

	/**
	 * Run the boolean isLabelProperty(Object,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testIsLabelProperty_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		Object element = new Object();
		String property = "";

		boolean result = fixture.isLabelProperty(element, property);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
		assertTrue(result);
	}

	/**
	 * Run the void removeListener(ILabelProviderListener) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	@Test
	public void testRemoveListener_1()
		throws Exception {
		LabelProvider fixture = new LabelProvider();
		fixture.errorImage = new Image(new Display(), 1, 1);
		fixture.closedImage = new Image(new Display(), 1, 1);
		fixture.openImage = new Image(new Display(), 1, 1);
		ILabelProviderListener listener = new NavigatorContentServiceLabelProvider(new NavigatorContentService(""));

		fixture.removeListener(listener);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    org.eclipse.swt.SWTError: Not implemented [multiple displays]
		//       at org.eclipse.swt.SWT.error(SWT.java:4109)
		//       at org.eclipse.swt.widgets.Display.checkDisplay(Display.java:675)
		//       at org.eclipse.swt.widgets.Display.create(Display.java:776)
		//       at org.eclipse.swt.graphics.Device.<init>(Device.java:130)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:668)
		//       at org.eclipse.swt.widgets.Display.<init>(Display.java:659)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/17/10 12:26 PM
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
	 * @generatedBy CodePro at 9/17/10 12:26 PM
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
	 * @generatedBy CodePro at 9/17/10 12:26 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LabelProviderTest.class);
	}
}