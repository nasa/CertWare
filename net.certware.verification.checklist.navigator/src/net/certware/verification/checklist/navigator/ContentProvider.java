/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.verification.checklist.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.verification.checklist.Category;
import net.certware.verification.checklist.Checklist;
import net.certware.verification.checklist.Choices;
import net.certware.verification.checklist.Item;
import net.certware.verification.checklist.util.ChecklistSwitch;

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
	/** item node count */
	protected int itemCount = 0;
	/** yes result count */
	protected int yesResultCount = 0;
	/** no result count */
	protected int noResultCount = 0;
	/** N/A result count */
	protected int naResultCount = 0;
	/** unknown result count */
	protected int unknownResultCount = 0;


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
			if ( ICertWareConstants.VCL_EXTENSION.equals(file.getFileExtension())) {
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
			if ( ICertWareConstants.VCL_EXTENSION.equals( modelFile.getFileExtension() ) ) {
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
			return ICertWareConstants.VCL_EXTENSION.equals(((IFile)element).getFileExtension());
		}

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized Resource updateModel(IFile modelFile) { // $codepro.audit.disable synchronizedMethod
		if ( ICertWareConstants.VCL_EXTENSION.equals(modelFile.getFileExtension())) {

			if (modelFile.exists()) {
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( null != resource ) {

					setItemCount(0);
					setYesResultCount(0);
					setNoResultCount(0);
					setNaResultCount(0);
					setUnknownResultCount(0);

					// visit the model, collect statistics
					for ( final Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) {
						EObject eo = i.next(); // $codepro.audit.disable variableDeclaredInLoop
						visitor.doSwitch(eo);
					} // iterator

					TreeData td = null; // $codepro.audit.disable localDeclaration
					final List<TreeData> treeNodes = new ArrayList<TreeData>(); // $codepro.audit.disable localDeclaration

					// always add the item count, even if zero because this is informative
					td = new TreeData(modelFile,Messages.ContentProvider_2,getItemCount(),TreeData.COUNT_TYPE_ITEM);
					treeNodes.add(td);

					// add choice results if non-zero
					if ( getYesResultCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_3,getYesResultCount(),TreeData.COUNT_TYPE_YES_RESULT);
						treeNodes.add(td);
					}
					if ( getNoResultCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_4,getNoResultCount(),TreeData.COUNT_TYPE_NO_RESULT);
						treeNodes.add(td);
					}
					if ( getNaResultCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_5,getNaResultCount(),TreeData.COUNT_TYPE_NA_RESULT);
						treeNodes.add(td);
					}
					if ( getUnknownResultCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_6,getUnknownResultCount(),TreeData.COUNT_TYPE_UNKNOWN_RESULT);
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
	 * Visitor for iterating over the resource content.
	 */
	public ChecklistSwitch<Boolean> visitor = new ChecklistSwitch<Boolean> () {

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseCategory(Category object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Checklist</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseChecklist(Checklist object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
		 * Increments the item count.
		 * Increments the count of the applicable choice result on the item.
		 * @param item the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseItem(Item item) {
			incrementItemCount();
			Choices choices = item.getResult();
			
			if ( choices.getValue() == Choices.NO_VALUE ) {
				incrementNoResultCount();
			} else if ( choices.getValue() == Choices.NOT_APPLICABLE_VALUE ) {
				incrementNaResultCount();
			} else if ( choices.getValue() == Choices.YES_VALUE ) {
				incrementYesResultCount();	
			} else if ( choices.getValue() == Choices.UNKNOWN_VALUE ) {
				incrementUnknownResultCount();
			}
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @param object the target of the switch.
		 * @return always returns true
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		public Boolean defaultCase(EObject object) {
			return Boolean.TRUE;
		}

	};


	/**
	 * @return the itemCount
	 */
	public int getItemCount() {
		return itemCount;
	}

	/**
	 * @param itemCount the itemCount to set
	 */
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	/**
	 * Increments the checklist item count by one.
	 */
	public void incrementItemCount() {
		itemCount += 1;
	}
	
	/**
	 * @return the yesResultCount
	 */
	public int getYesResultCount() {
		return yesResultCount;
	}

	/**
	 * @param yesResultCount the yesResultCount to set
	 */
	public void setYesResultCount(int yesResultCount) {
		this.yesResultCount = yesResultCount;
	}
	
	/**
	 * Increments the yes choice result by one.
	 */
	public void incrementYesResultCount() {
		yesResultCount += 1;
	}

	/**
	 * @return the noResultCount
	 */
	public int getNoResultCount() {
		return noResultCount;
	}

	/**
	 * @param noResultCount the noResultCount to set
	 */
	public void setNoResultCount(int noResultCount) {
		this.noResultCount = noResultCount;
	}

	/**
	 * Increments the no choice result by one.
	 */
	public void incrementNoResultCount() {
		noResultCount += 1;
	}
	
	/**
	 * @return the naResultCount
	 */
	public int getNaResultCount() {
		return naResultCount;
	}

	/**
	 * @param naResultCount the naResultCount to set
	 */
	public void setNaResultCount(int naResultCount) {
		this.naResultCount = naResultCount;
	}

	/**
	 * Increments the N/A choice result by one.
	 */
	public void incrementNaResultCount() {
		naResultCount += 1;
	}

	/**
	 * @return the unknownResultCount
	 */
	public int getUnknownResultCount() {
		return unknownResultCount;
	}

	/**
	 * @param unknownResultCount the unknownResultCount to set
	 */
	public void setUnknownResultCount(int unknownResultCount) {
		this.unknownResultCount = unknownResultCount;
	}
	
	/**
	 * Increments the N/A choice unknown result by one.
	 */
	public void incrementUnknownResultCount() {
		this.unknownResultCount += 1;
	}
}
