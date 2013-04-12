/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.navigator.filters;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NavigatorFilterTest</code> contains tests for the class <code>{@link NavigatorFilter}</code>.
 *
 * @generatedBy CodePro at 9/17/10 12:23 PM
 * @author mrb
 * @version $Revision: 1.0 $
 */
public class NavigatorFilterTest {
	/**
	 * Run the boolean select(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:23 PM
	 */
	@Test
	public void testSelect_1()
		throws Exception {
		NavigatorFilter fixture = new NavigatorFilter();
		Viewer viewer = new ComboViewer(new Composite(new Composite((Composite) null, 0), 1));
		Object parentElement = new Object();
		Object element = null;

		boolean result = fixture.select(viewer, parentElement, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4064)
		//       at org.eclipse.swt.SWT.error(SWT.java:3998)
		//       at org.eclipse.swt.SWT.error(SWT.java:3969)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:715)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:468)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:131)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:115)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:73)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:91)
		assertTrue(result);
	}

	/**
	 * Run the boolean select(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:23 PM
	 */
	@Test
	public void testSelect_2()
		throws Exception {
		NavigatorFilter fixture = new NavigatorFilter();
		Viewer viewer = new ComboViewer(new Composite(new Composite((Composite) null, 0), 1));
		Object parentElement = new Object();
		Object element = null;

		boolean result = fixture.select(viewer, parentElement, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4064)
		//       at org.eclipse.swt.SWT.error(SWT.java:3998)
		//       at org.eclipse.swt.SWT.error(SWT.java:3969)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:715)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:468)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:131)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:115)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:73)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:91)
		assertTrue(result);
	}

	/**
	 * Run the boolean select(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:23 PM
	 */
	@Test
	public void testSelect_3()
		throws Exception {
		NavigatorFilter fixture = new NavigatorFilter();
		Viewer viewer = new ComboViewer(new Composite(new Composite((Composite) null, 0), 1));
		Object parentElement = new Object();
		Object element = new Object();

		boolean result = fixture.select(viewer, parentElement, element);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Argument cannot be null
		//       at org.eclipse.swt.SWT.error(SWT.java:4064)
		//       at org.eclipse.swt.SWT.error(SWT.java:3998)
		//       at org.eclipse.swt.SWT.error(SWT.java:3969)
		//       at org.eclipse.swt.widgets.Widget.error(Widget.java:715)
		//       at org.eclipse.swt.widgets.Widget.checkParent(Widget.java:468)
		//       at org.eclipse.swt.widgets.Widget.<init>(Widget.java:131)
		//       at org.eclipse.swt.widgets.Control.<init>(Control.java:115)
		//       at org.eclipse.swt.widgets.Scrollable.<init>(Scrollable.java:73)
		//       at org.eclipse.swt.widgets.Composite.<init>(Composite.java:91)
		assertTrue(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 9/17/10 12:23 PM
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
	 * @generatedBy CodePro at 9/17/10 12:23 PM
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
	 * @generatedBy CodePro at 9/17/10 12:23 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NavigatorFilterTest.class);
	}
}