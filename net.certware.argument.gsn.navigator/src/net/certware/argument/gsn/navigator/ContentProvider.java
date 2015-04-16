/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.gsn.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.util.GsnSwitch;
import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.progress.UIJob;

/**
 * Provides model statistics as navigator content.
 * @author mrb
 * @since 1.0
 * @version $Revision: 1.0 $
 */
public class ContentProvider 
implements ITreeContentProvider, IResourceChangeListener, IResourceDeltaVisitor, ICertWareConstants {
	/** initial capacity of tree map */
	private static final int INITIAL_CAPACITY = 3;
	/** load factor for tree map */
	private static final float LOAD_FACTOR = 0.75f;
	/** no children tree */
	private static final Object[] NO_CHILDREN = new Object[0];
	/** cached model for refresh */
	private final Map<IFile, TreeData[]> cachedModelMap = new HashMap<IFile, TreeData[]>(INITIAL_CAPACITY,LOAD_FACTOR);
	/** tree viewer to update */
	private StructuredViewer viewer;
	/** goal node count */
	protected int goalCount = 0;
	/** strategy node count */
	protected int strategyCount = 0;
	/** solution node count */
	protected int solutionCount = 0;
	/** to-be-supported node count */
	protected int toBeSupported = 0;


	/**
	 * Constructor adds resource change listener for post change events.
	 */
	public ContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * Disposes of content provider, clears map, and removes resource change listener.
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		cachedModelMap.clear();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this); 
	}

	/**
	 * Responds to content input change for the provider.
	 * @param aViewer structured content viewer
	 * @param oldInput previous input model
	 * @param newInput new input model
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(Viewer, Object, Object)
	 */
	@Override
	public void inputChanged(Viewer aViewer, Object oldInput, Object newInput) {
		if (null != oldInput && !oldInput.equals(newInput)) {
			cachedModelMap.clear();
		}
		viewer = (StructuredViewer) aViewer;
	}

	/**
	 * Visitor for resource change deltas.
	 * @param delta resource change delta
	 * @return false for file type resource processing, true otherwise 
	 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(IResourceDelta)
	 */
	@Override
	public boolean visit(IResourceDelta delta) {
		final IResource source = delta.getResource();
		switch (source.getType()) {
		case IResource.ROOT:
		case IResource.PROJECT:
		case IResource.FOLDER:
			return true;
		case IResource.FILE:
			final IFile file = (IFile) source; // $codepro.audit.disable localDeclaration
			if ( ICertWareConstants.GSN_EXTENSION.equals(file.getFileExtension())) {
				updateModel(file);
				new UIJob(Messages.ContentProvider_0) {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						if (null != viewer ) { // && ! viewer.getControl().isDisposed())
							viewer.refresh(file);
						}
						return Status.OK_STATUS;                        
					}
				}.schedule();
			}
			return false;
		default:
			break;
		}
		return false;
	}

	/**
	 * Method resourceChanged.
	 * @param event IResourceChangeEvent
	 * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(IResourceChangeEvent)
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		final IResourceDelta delta = event.getDelta();
		try {
			delta.accept(this);
		} catch (CoreException e) { 
			CertWareLog.logError(Messages.ContentProvider_1,e);
		} 	
	}

	/**
	 * Gets the input model children as elements.
	 * @param inputElement input model whose children are returned
	 * @return Object[] children
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * Gets the children of the given parent element.
	 * @param parentElement parent element
	 * @return Object[] of NO_CHILDREN if parent is a TreeData object, otherwise cached values if IFile object
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
		if ( parentElement instanceof TreeData ) {
			children = NO_CHILDREN;
		} else if (parentElement instanceof IFile) {
			final IFile modelFile = (IFile)parentElement;
			if ( ICertWareConstants.GSN_EXTENSION.equals( modelFile.getFileExtension() ) ) {
				children = cachedModelMap.get(modelFile);
				if ( null == children && null != updateModel(modelFile) ) {
					children = cachedModelMap.get(modelFile);
				}
			}
		}
		return (null != children) ? children : NO_CHILDREN;
	}

	/**
	 * Gets the parent TreeData object if element is TreeData, otherwise null.
	 * @param element TreeData element to find IFile
	 * @return TreeData object IFile, otherwise null
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(Object)
	 */
	@Override
	public Object getParent(Object element) {
		if ( element instanceof TreeData ) {
			final TreeData td = (TreeData)element;
			return td.getIfile();
		}
		return null;
	}

	/**
	 * Method hasChildren.
	 * @param element Object
	 * @return boolean
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		if ( element instanceof TreeData ) {
			return false;
		}
		else if ( element instanceof IFile ) {
			return ICertWareConstants.GSN_EXTENSION.equals(((IFile)element).getFileExtension());
		}

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized Resource updateModel(IFile modelFile) { // $codepro.audit.disable synchronizedMethod
		if ( ICertWareConstants.GSN_EXTENSION.equals(modelFile.getFileExtension())) {

			if (modelFile.exists()) {
				// @SuppressWarnings("unused") // uses side effect
				// final GsnPackage gsnPackage = GsnPackage.eINSTANCE; 
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( null != resource ) {

					setGoalCount(0);
					setStrategyCount(0);
					setSolutionCount(0);
					setToBeSupported(0);

					// visit the model, collect statistics
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) { // $codepro.audit.disable variableShouldBeFinal
						EObject eo = i.next(); // $codepro.audit.disable variableDeclaredInLoop
						visitor.doSwitch(eo);
					} // iterator

					TreeData td = null; // $codepro.audit.disable localDeclaration
					final List<TreeData> treeNodes = new ArrayList<TreeData>(); // $codepro.audit.disable localDeclaration

					td = new TreeData(modelFile,Messages.ContentProvider_2,getGoalCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,Messages.ContentProvider_3,getStrategyCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,Messages.ContentProvider_4,getSolutionCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);

					/*
					if ( getToBeSupported() > 0 )
						td = new TreeData(modelFile,"Claims to be supported",getToBeSupported(),TreeData.COUNT_TYPE_OPEN);
					else
						td = new TreeData(modelFile,"All claims supported",-1,TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					*/

					// populate array and model map
					final TreeData[] treeDataArray = treeNodes.toArray(new TreeData[treeNodes.size()]); // $codepro.audit.disable localDeclaration
					cachedModelMap.put(modelFile, treeDataArray);
					return resource;
				} // model not null
			} // model file exists
		} // file extension matches
		cachedModelMap.remove(modelFile);
		return null; 
	} // method


	/**
	 * Get the accumulated goal node count.
	 * @return the goal count 
	 */
	public int getGoalCount() {
		return goalCount;
	}

	/**
	 * Sets the goal count value.
	 * @param goalCount the goal count
	 */
	public void setGoalCount(int goalCount) {
		this.goalCount = goalCount;
	}

	/**
	 * Increments the goal node count by one.
	 */
	public void incrementGoalCount() {
		goalCount += 1;
	}

	/**
	 * Get the accumulated strategy node count.
	 * @return the strategy count
	 */ 
	public int getStrategyCount() {
		return strategyCount;
	}

	/**
	 * Sets the strategy node count.
	 * @param strategyCount new strategy count
	 */
	public void setStrategyCount(int strategyCount) {
		this.strategyCount = strategyCount;
	}

	/**
	 * Increments the strategy node count by one.
	 */
	public void incrementStrategyCount() {
		strategyCount += 1;
	}

	/**
	 * Get the solution node count.
	 * @return the solution count 
	 */
	public int getSolutionCount() {
		return solutionCount;
	}

	/**
	 * Sets the solution node count.
	 * @param solutionCount new solution count
	 */
	public void setSolutionCount(int solutionCount) {
		this.solutionCount = solutionCount;
	}

	/**
	 * Increments the solution node count by one.
	 */
	public void incrementSolutionCount() {
		solutionCount += 1;
	}

	/**
	 * Get the number of nodes with to-be-supported flag set.
	 * @return to-be-supported node count
	 */
	public int getToBeSupported() {
		return toBeSupported;
	}

	/**
	 * Sets the count of to-be-supported nodes.
	 * @param toBeSupported the new node count
	 */
	public void setToBeSupported(int toBeSupported) {
		this.toBeSupported = toBeSupported;
	}

	/**
	 * Increments the to-be-supported node count by one.
	 */
	public void incrementToBeSupported() {
		toBeSupported += 1;
	}
	
	/**
	 * Visitor for iterating over the resource content.
	 */
	public GsnSwitch<Boolean> visitor = new GsnSwitch<Boolean> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseGoal(Goal object) {
			incrementGoalCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseStrategy(Strategy object) {
			incrementStrategyCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseSolution(Solution object) {
			incrementSolutionCount();
			/*
			InformationElement e = object.getEvidence();
			// TODO whether to count to-be-supported somehow
			 * */
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssumption(Assumption object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseContext(Context object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseJustification(Justification object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseModelElement(ModelElement object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentElement(ArgumentElement object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseReasoningElement(ReasoningElement object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseClaim(Claim object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgumentLink(ArgumentLink object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedRelationship(AssertedRelationship object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssertedEvidence(AssertedEvidence object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseInformationElement(InformationElement object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public Boolean defaultCase(EObject object) {
			return Boolean.TRUE;
		}

	};
}
