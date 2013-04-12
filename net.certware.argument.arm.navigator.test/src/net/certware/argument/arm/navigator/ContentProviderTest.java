/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.navigator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.internal.events.ResourceChangeEvent;
import org.eclipse.core.internal.resources.mapping.ProposedResourceDelta;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ContentProviderTest</code> contains tests for the class <code>{@link ContentProvider}</code>.
 *
 * @generatedBy CodePro at 9/17/10 12:24 PM
 * @author mrb
 * @version $Revision: 1.0 $
 */
@SuppressWarnings("restriction")
public class ContentProviderTest {
	/**
	 * Run the ContentProvider() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testContentProvider_1()
		throws Exception {

		ContentProvider result = new ContentProvider();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testDispose_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());

		fixture.dispose();

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
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetChildren_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		// fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		fixture.inputChanged(new ComboViewer(new Composite(new Composite(Display.getDefault().getActiveShell(), 0), 1)), new Object(), new Object());
		Object parentElement = null;

		Object[] result = fixture.getChildren(parentElement);

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
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetChildren_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object parentElement = null;

		Object[] result = fixture.getChildren(parentElement);

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
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetChildren_3()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object parentElement = null;

		Object[] result = fixture.getChildren(parentElement);

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
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetChildren_4()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object parentElement = null;

		Object[] result = fixture.getChildren(parentElement);

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
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetChildren_5()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object parentElement = new Object();

		Object[] result = fixture.getChildren(parentElement);

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
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetChildren_6()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object parentElement = new Object();

		Object[] result = fixture.getChildren(parentElement);

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
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getElements(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetElements_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object inputElement = new Object();

		Object[] result = fixture.getElements(inputElement);

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
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetParent_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object element = new TreeData((IFile) null, "", 1, 1);

		Object result = fixture.getParent(element);

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
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testGetParent_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object element = new Object();

		Object result = fixture.getParent(element);

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
		assertNotNull(result);
	}

	/**
	 * Run the boolean hasChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testHasChildren_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object element = new Object();

		boolean result = fixture.hasChildren(element);

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
	 * Run the boolean hasChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testHasChildren_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object element = null;

		boolean result = fixture.hasChildren(element);

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
	 * Run the boolean hasChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testHasChildren_3()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object element = null;

		boolean result = fixture.hasChildren(element);

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
	 * Run the boolean hasChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testHasChildren_4()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Object element = new Object();

		boolean result = fixture.hasChildren(element);

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
	 * Run the void inputChanged(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testInputChanged_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Viewer aViewer = new ComboViewer(new Composite(new Composite((Composite) null, 0), 1));
		Object oldInput = new Object();
		Object newInput = new Object();

		fixture.inputChanged(aViewer, oldInput, newInput);

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
	}

	/**
	 * Run the void inputChanged(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testInputChanged_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Viewer aViewer = new ComboViewer(new Composite(new Composite((Composite) null, 0), 1));
		Object oldInput = null;
		Object newInput = new Object();

		fixture.inputChanged(aViewer, oldInput, newInput);

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
	}

	/**
	 * Run the void inputChanged(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testInputChanged_3()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		Viewer aViewer = new ComboViewer(new Composite(new Composite((Composite) null, 0), 1));
		Object oldInput = new Object();
		Object newInput = new Object();

		fixture.inputChanged(aViewer, oldInput, newInput);

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
	}

	/**
	 * Run the void resourceChanged(IResourceChangeEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testResourceChanged_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		IResourceChangeEvent event = new ResourceChangeEvent(new Object(), 1, 1, new ProposedResourceDelta((IResource) null));

		fixture.resourceChanged(event);

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
	}

	/**
	 * Run the void resourceChanged(IResourceChangeEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testResourceChanged_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		IResourceChangeEvent event = new ResourceChangeEvent(new Object(), 1, 1, new ProposedResourceDelta((IResource) null));

		fixture.resourceChanged(event);

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
	}

	/**
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testVisit_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		IResourceDelta delta = new ProposedResourceDelta((IResource) null);

		boolean result = fixture.visit(delta);

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
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testVisit_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		IResourceDelta delta = new ProposedResourceDelta((IResource) null);

		boolean result = fixture.visit(delta);

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
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testVisit_3()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		IResourceDelta delta = new ProposedResourceDelta((IResource) null);

		boolean result = fixture.visit(delta);

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
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testVisit_4()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		IResourceDelta delta = new ProposedResourceDelta((IResource) null);

		boolean result = fixture.visit(delta);

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
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testVisit_5()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		IResourceDelta delta = new ProposedResourceDelta((IResource) null);

		boolean result = fixture.visit(delta);

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
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 9/17/10 12:24 PM
	 */
	@Test
	public void testVisit_6()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.inputChanged(new ComboViewer(new Composite(new Composite((Composite) null, 0), 1)), new Object(), new Object());
		IResourceDelta delta = new ProposedResourceDelta((IResource) null);

		boolean result = fixture.visit(delta);

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
		new org.junit.runner.JUnitCore().run(ContentProviderTest.class);
	}
}