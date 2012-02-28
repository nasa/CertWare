/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.view;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.spm.ProjectCommit;
import net.certware.measurement.spm.ProjectModel;

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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.progress.UIJob;

/**
 * Provides project metrics as navigator content.
 * @author mrb
 * @since 1.1
 */
public class ContentProvider 
implements ITreeContentProvider, IResourceChangeListener, IResourceDeltaVisitor, ICertWareConstants {
	/** no children tree */
	private static final Object[] NO_CHILDREN = new Object[0];
	/** selected resource file, if any */
	private IFile selectedFile = null;
	/** tree viewer to update */
	private StructuredViewer viewer;

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
			// clear any cache...
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
			final IFile file = (IFile) source; 
			if ( ICertWareConstants.SPM_EXTENSION.equals(file.getFileExtension()) ) {
				updateModel(file);
				new UIJob(Messages.Job) {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						if (null != viewer ) { 
							viewer.refresh(file);
						}
						selectedFile = file;
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
			CertWareLog.logError(Messages.ResourceChanged,e);
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
	 * Returns all of the tree items in a project model as an object list.
	 * @param pm project model
	 * @return list of project commits
	 */
	public Object[] getChildrenForModel(ProjectModel pm) {
		return pm.getCommits().toArray();
		/*
		List<EObject> items = new ArrayList<EObject>();
		
		TreeIterator ti = pm.eAllContents();
		while( ti.hasNext() ) {
			items.add( (EObject)ti.next() );
		}

		return items.toArray();
		*/
	}
	
	/**
	 * Gets the children of the given parent element.
	 * @param parentElement parent element
	 * @return Object[] of NO_CHILDREN or project commits
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
		
		// project model selection has project commits as children
		// project commits may or may not have the metrics as immediate children
		if ( parentElement instanceof ProjectModel ) {
			children = getChildrenForModel((ProjectModel)parentElement);
		} else if (parentElement instanceof IFile) {
			final IFile modelFile = (IFile)parentElement;
			if ( ICertWareConstants.SPM_EXTENSION.equals( modelFile.getFileExtension() ) ) {
				ProjectModel pm = updateModel(modelFile);
				children = getChildrenForModel(pm);
			}
		}
		return (null != children) ? children : NO_CHILDREN;
	}

	/**
	 * Gets the parent object if project model or commit.
	 * @param element element to find parent
	 * @return project model from commit, file from project model, or null
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(Object)
	 */
	@Override
	public Object getParent(Object element) {
		if ( element instanceof ProjectModel ) {
			return selectedFile; // may not match model element selection from editor
		}
		if ( element instanceof ProjectCommit ) {
			ProjectCommit pc = (ProjectCommit)element;
			return (ProjectModel)pc.eContainer();
		}
		return null;
	}

	/**
	 * Whether the tree element has children.
	 * @param element tree element
	 * @return true if project model element or file with matching extension, false otherwise
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		if ( element instanceof ProjectModel ) {
			return true;
		}
		else if ( element instanceof IFile ) {
			return ICertWareConstants.SPM_EXTENSION.equals(((IFile)element).getFileExtension());
		}

		return false;
	}

	/**
	 * Updates the content model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized ProjectModel updateModel(IFile modelFile) {
		if ( ICertWareConstants.SPM_EXTENSION.equals(modelFile.getFileExtension())) {
			if (modelFile.exists()) {
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), true);
				if ( null != resource ) {
					ProjectModel pm = (ProjectModel)resource.getContents().get(0);
					return pm;
				} // resource not null
			} // model exists
		} // file extension matches

		System.err.println("returning null");
		return null; 
	} // method


}
