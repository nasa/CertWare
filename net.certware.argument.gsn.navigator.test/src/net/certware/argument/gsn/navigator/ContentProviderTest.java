package net.certware.argument.gsn.navigator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import net.certware.argument.gsn.util.GsnSwitch;

import org.easymock.EasyMock;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ContentProviderTest</code> contains tests for the class <code>{@link ContentProvider}</code>.
 * <p>
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved..  All rights reserved.
 *
 * @generatedBy CodePro at 10/13/10 5:00 PM
 * @author mrb
 */
public class ContentProviderTest {
	/**
	 * Run the ContentProvider() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test
	public void testContentProvider_1()
		throws Exception {

		ContentProvider result = new ContentProvider();

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(0, result.getGoalCount());
		assertEquals(0, result.getStrategyCount());
		assertEquals(0, result.getSolutionCount());
		assertEquals(0, result.getToBeSupported());
	}

	/**
	 * Run the void dispose() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testDispose_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		fixture.dispose();

		// TODO: add additional test code here
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetChildren_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object parentElement = EasyMock.createMock(IFile.class);
		// TODO: add mock object expectations here

		EasyMock.replay(parentElement);

		Object[] result = fixture.getChildren(parentElement);

		// TODO: add additional test code here
		EasyMock.verify(parentElement);
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetChildren_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object parentElement = EasyMock.createMock(IFile.class);
		// TODO: add mock object expectations here

		EasyMock.replay(parentElement);

		Object[] result = fixture.getChildren(parentElement);

		// TODO: add additional test code here
		EasyMock.verify(parentElement);
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetChildren_3()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object parentElement = EasyMock.createMock(IFile.class);
		// TODO: add mock object expectations here

		EasyMock.replay(parentElement);

		Object[] result = fixture.getChildren(parentElement);

		// TODO: add additional test code here
		EasyMock.verify(parentElement);
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetChildren_4()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object parentElement = EasyMock.createMock(IFile.class);
		// TODO: add mock object expectations here

		EasyMock.replay(parentElement);

		Object[] result = fixture.getChildren(parentElement);

		// TODO: add additional test code here
		EasyMock.verify(parentElement);
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetChildren_5()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object parentElement = new Object();

		Object[] result = fixture.getChildren(parentElement);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetChildren_6()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object parentElement = new Object();

		Object[] result = fixture.getChildren(parentElement);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object[] getElements(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetElements_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object inputElement = new Object();

		Object[] result = fixture.getElements(inputElement);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getGoalCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetGoalCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		int result = fixture.getGoalCount();

		// TODO: add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the Object getParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetParent_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object element = new TreeData(EasyMock.createNiceMock(IFile.class), "", 1, 1);

		Object result = fixture.getParent(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Object getParent(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetParent_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object element = new Object();

		Object result = fixture.getParent(element);

		// TODO: add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the int getSolutionCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetSolutionCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		int result = fixture.getSolutionCount();

		// TODO: add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getStrategyCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetStrategyCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		int result = fixture.getStrategyCount();

		// TODO: add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getToBeSupported() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testGetToBeSupported_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		int result = fixture.getToBeSupported();

		// TODO: add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean hasChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHasChildren_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object element = new Object();

		boolean result = fixture.hasChildren(element);

		// TODO: add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean hasChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHasChildren_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object element = EasyMock.createMock(IFile.class);
		// TODO: add mock object expectations here

		EasyMock.replay(element);

		boolean result = fixture.hasChildren(element);

		// TODO: add additional test code here
		EasyMock.verify(element);
		assertTrue(result);
	}

	/**
	 * Run the boolean hasChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHasChildren_3()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object element = EasyMock.createMock(IFile.class);
		// TODO: add mock object expectations here

		EasyMock.replay(element);

		boolean result = fixture.hasChildren(element);

		// TODO: add additional test code here
		EasyMock.verify(element);
		assertTrue(result);
	}

	/**
	 * Run the boolean hasChildren(Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testHasChildren_4()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Object element = new Object();

		boolean result = fixture.hasChildren(element);

		// TODO: add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the void incrementGoalCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testIncrementGoalCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		fixture.incrementGoalCount();

		// TODO: add additional test code here
	}

	/**
	 * Run the void incrementSolutionCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testIncrementSolutionCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		fixture.incrementSolutionCount();

		// TODO: add additional test code here
	}

	/**
	 * Run the void incrementStrategyCount() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testIncrementStrategyCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		fixture.incrementStrategyCount();

		// TODO: add additional test code here
	}

	/**
	 * Run the void incrementToBeSupported() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testIncrementToBeSupported_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();

		fixture.incrementToBeSupported();

		// TODO: add additional test code here
	}

	/**
	 * Run the void inputChanged(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testInputChanged_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Viewer aViewer = new ComboViewer((Composite) null);
		Object oldInput = new Object();
		Object newInput = new Object();

		fixture.inputChanged(aViewer, oldInput, newInput);

		// TODO: add additional test code here
	}

	/**
	 * Run the void inputChanged(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testInputChanged_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Viewer aViewer = new ComboViewer((Composite) null);
		Object oldInput = null;
		Object newInput = new Object();

		fixture.inputChanged(aViewer, oldInput, newInput);

		// TODO: add additional test code here
	}

	/**
	 * Run the void inputChanged(Viewer,Object,Object) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testInputChanged_3()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		Viewer aViewer = new ComboViewer((Composite) null);
		Object oldInput = new Object();
		Object newInput = new Object();

		fixture.inputChanged(aViewer, oldInput, newInput);

		// TODO: add additional test code here
	}

	/**
	 * Run the void resourceChanged(IResourceChangeEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testResourceChanged_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		IResourceChangeEvent event = EasyMock.createMock(IResourceChangeEvent.class);
		// TODO: add mock object expectations here

		EasyMock.replay(event);

		fixture.resourceChanged(event);

		// TODO: add additional test code here
		EasyMock.verify(event);
	}

	/**
	 * Run the void resourceChanged(IResourceChangeEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testResourceChanged_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		IResourceChangeEvent event = EasyMock.createMock(IResourceChangeEvent.class);
		// TODO: add mock object expectations here

		EasyMock.replay(event);

		fixture.resourceChanged(event);

		// TODO: add additional test code here
		EasyMock.verify(event);
	}

	/**
	 * Run the void setGoalCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetGoalCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		int goalCount = 1;

		fixture.setGoalCount(goalCount);

		// TODO: add additional test code here
	}

	/**
	 * Run the void setSolutionCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetSolutionCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		int solutionCount = 1;

		fixture.setSolutionCount(solutionCount);

		// TODO: add additional test code here
	}

	/**
	 * Run the void setStrategyCount(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetStrategyCount_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		int strategyCount = 1;

		fixture.setStrategyCount(strategyCount);

		// TODO: add additional test code here
	}

	/**
	 * Run the void setToBeSupported(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetToBeSupported_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		int toBeSupported = 1;

		fixture.setToBeSupported(toBeSupported);

		// TODO: add additional test code here
	}

	/**
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testVisit_1()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		IResourceDelta delta = EasyMock.createMock(IResourceDelta.class);
		// TODO: add mock object expectations here

		EasyMock.replay(delta);

		boolean result = fixture.visit(delta);

		// TODO: add additional test code here
		EasyMock.verify(delta);
		assertTrue(result);
	}

	/**
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testVisit_2()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		IResourceDelta delta = EasyMock.createMock(IResourceDelta.class);
		// TODO: add mock object expectations here

		EasyMock.replay(delta);

		boolean result = fixture.visit(delta);

		// TODO: add additional test code here
		EasyMock.verify(delta);
		assertTrue(result);
	}

	/**
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testVisit_3()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		IResourceDelta delta = EasyMock.createMock(IResourceDelta.class);
		// TODO: add mock object expectations here

		EasyMock.replay(delta);

		boolean result = fixture.visit(delta);

		// TODO: add additional test code here
		EasyMock.verify(delta);
		assertTrue(result);
	}

	/**
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testVisit_4()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		IResourceDelta delta = EasyMock.createMock(IResourceDelta.class);
		// TODO: add mock object expectations here

		EasyMock.replay(delta);

		boolean result = fixture.visit(delta);

		// TODO: add additional test code here
		EasyMock.verify(delta);
		assertTrue(result);
	}

	/**
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testVisit_5()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		IResourceDelta delta = EasyMock.createMock(IResourceDelta.class);
		// TODO: add mock object expectations here

		EasyMock.replay(delta);

		boolean result = fixture.visit(delta);

		// TODO: add additional test code here
		EasyMock.verify(delta);
		assertTrue(result);
	}

	/**
	 * Run the boolean visit(IResourceDelta) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/13/10 5:00 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testVisit_6()
		throws Exception {
		ContentProvider fixture = new ContentProvider();
		fixture.setStrategyCount(1);
		fixture.inputChanged(new ComboViewer((Composite) null), new Object(), new Object());
		fixture.setToBeSupported(1);
		fixture.setGoalCount(1);
		fixture.setSolutionCount(1);
		fixture.visitor = new GsnSwitch();
		IResourceDelta delta = EasyMock.createMock(IResourceDelta.class);
		// TODO: add mock object expectations here

		EasyMock.replay(delta);

		boolean result = fixture.visit(delta);

		// TODO: add additional test code here
		EasyMock.verify(delta);
		assertTrue(result);
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