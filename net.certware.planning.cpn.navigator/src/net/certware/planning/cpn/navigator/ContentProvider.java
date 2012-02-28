/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.planning.cpn.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.planning.cpn.cpnDsl.Allocation;
import net.certware.planning.cpn.cpnDsl.ArgumentModels;
import net.certware.planning.cpn.cpnDsl.Plan;
import net.certware.planning.cpn.cpnDsl.Plans;
import net.certware.planning.cpn.cpnDsl.util.CpnDslSwitch;

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
	/** plan item count */
	protected int planCount = 0;
	/** import item count */
	protected int importCount = 0;


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
			if ( ICertWareConstants.CPN_EXTENSION.equals(file.getFileExtension())) {
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
			if ( ICertWareConstants.CPN_EXTENSION.equals( modelFile.getFileExtension() ) ) {
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
			return ICertWareConstants.CPN_EXTENSION.equals(((IFile)element).getFileExtension());
		}

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized Resource updateModel(IFile modelFile) { // $codepro.audit.disable synchronizedMethod
		if ( ICertWareConstants.CPN_EXTENSION.equals(modelFile.getFileExtension())) {

			if (modelFile.exists()) {
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( null != resource ) {

					setPlanCount(0);
					setImportCount(0);

					// visit the model, collect statistics
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) { // $codepro.audit.disable variableShouldBeFinal
						EObject eo = i.next(); // $codepro.audit.disable variableDeclaredInLoop
						visitor.doSwitch(eo);
					} // iterator

					TreeData td = null; // $codepro.audit.disable localDeclaration
					final List<TreeData> treeNodes = new ArrayList<TreeData>(); // $codepro.audit.disable localDeclaration

					if ( getPlanCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_2,getPlanCount(),TreeData.COUNT_TYPE_PLAN);
						treeNodes.add(td);
					}
					if ( getImportCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_3,getImportCount(),TreeData.COUNT_TYPE_IMPORT);
						treeNodes.add(td);
					}

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
	 * Get the accumulated plan line count.
	 * @return the plan line count 
	 */
	public int getPlanCount() {
		return planCount;
	}

	/**
	 * Sets the plan line count value.
	 * @param count the plan count
	 */
	public void setPlanCount(int count) {
		this.planCount = count;
	}

	/**
	 * Increments the plan count by one.
	 */
	public void incrementPlanCount() {
		planCount += 1;
	}

	/**
	 * Get the accumulated valid statement count.
	 * @return the valid statement count
	 */ 
	public int getImportCount() {
		return importCount;
	}

	/**
	 * Sets the import statement count.
	 * @param count new import statement count
	 */
	public void setImportCount(int count) {
		this.importCount = count;
	}

	/**
	 * Increments the import statement count by one.
	 */
	public void incrementImportCount() {
		importCount += 1;
	}

	
	/**
	 * Visitor for iterating over the resource content.
	 */
	public CpnDslSwitch<Boolean> visitor = new CpnDslSwitch<Boolean> () {

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Plans</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Plans</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean casePlans(Plans object)
		  {
		    return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Argument Models</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Argument Models</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseArgumentModels(ArgumentModels object)
		  {
			  incrementImportCount();
		    return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Allocation</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Allocation</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseAllocation(Allocation object)
		  {
		    return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Plan</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Plan</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean casePlan(Plan object)
		  {
			  incrementPlanCount();
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
