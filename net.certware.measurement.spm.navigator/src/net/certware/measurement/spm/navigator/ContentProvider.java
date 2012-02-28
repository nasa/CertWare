/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.spm.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.spm.AdaptabilityRatioMeasure;
import net.certware.measurement.spm.AdaptabilityTrend;
import net.certware.measurement.spm.MaintainabilityMeasure;
import net.certware.measurement.spm.MaturityRatioMeasure;
import net.certware.measurement.spm.MaturityTrend;
import net.certware.measurement.spm.ModularityMeasure;
import net.certware.measurement.spm.ModularityTrend;
import net.certware.measurement.spm.ProjectCommit;
import net.certware.measurement.spm.ProjectModel;
import net.certware.measurement.spm.ReworkBacklogMeasure;
import net.certware.measurement.spm.ReworkRatioMeasure;
import net.certware.measurement.spm.ReworkStabilityMeasure;
import net.certware.measurement.spm.ScrapRatioMeasure;

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
 * Provides project metrics as navigator content.
 * @author mrb
 * @since 1.1
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
			if ( ICertWareConstants.SPM_EXTENSION.equals(file.getFileExtension())) {
				updateModel(file);
				new UIJob(Messages.Job) {
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
			if ( ICertWareConstants.SPM_EXTENSION.equals( modelFile.getFileExtension() ) ) {
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
			return td.getIFile();
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
			return ICertWareConstants.SPM_EXTENSION.equals(((IFile)element).getFileExtension());
		}

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized Resource updateModel(IFile modelFile) { // $codepro.audit.disable synchronizedMethod
		if ( ICertWareConstants.SPM_EXTENSION.equals(modelFile.getFileExtension())) {

			if (modelFile.exists()) {
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( null != resource ) {

					final List<TreeData> treeNodes = new ArrayList<TreeData>(); 

					// visit the model, collect statistics
					// these are all direct measurement measures, so the tree data content expects only these types
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) { 

						EObject eop = i.next(); 

						if ( eop instanceof ProjectModel ) {
							// get the last commit
							ProjectModel pm = (ProjectModel)eop;

							if ( pm.getCommits() == null || pm.getCommits().size() < 1) {
								continue;
							}

							ProjectCommit pc = pm.getCommits().get( pm.getCommits().size() - 1 );

							// find the measures in the single commit
							for ( Iterator<EObject> ic = pc.eAllContents(); ic.hasNext(); ) {

								EObject eo = ic.next();

								if ( eo instanceof ScrapRatioMeasure ) {
									treeNodes.add(new TreeData((ScrapRatioMeasure)eo,Activator.NODE_SCRAP_RATIO,modelFile));
								}
								if ( eo instanceof MaturityRatioMeasure ) {
									treeNodes.add(new TreeData((MaturityRatioMeasure)eo,Activator.NODE_MATURITY,modelFile));
								}
								if ( eo instanceof MaturityTrend ) {
									treeNodes.add(new TreeData((MaturityTrend)eo,Activator.NODE_MATURITY_TREND,modelFile));
								}
								if ( eo instanceof MaintainabilityMeasure ) {
									treeNodes.add(new TreeData((MaintainabilityMeasure)eo,Activator.NODE_MAINTAINABILITY,modelFile));
								}
								if ( eo instanceof ReworkStabilityMeasure ) {
									treeNodes.add(new TreeData((ReworkStabilityMeasure)eo,Activator.NODE_REWORK_STABILITY,modelFile));
								}
								if ( eo instanceof ReworkRatioMeasure ) {
									treeNodes.add(new TreeData((ReworkRatioMeasure)eo,Activator.NODE_REWORK_RATIO,modelFile));
								}
								if ( eo instanceof ReworkBacklogMeasure ) {
									treeNodes.add(new TreeData((ReworkBacklogMeasure)eo,Activator.NODE_REWORK_BACKLOG,modelFile));
								}
								if ( eo instanceof ModularityMeasure ) {
									treeNodes.add(new TreeData((ModularityMeasure)eo,Activator.NODE_MODULARITY,modelFile));
								}
								if ( eo instanceof AdaptabilityRatioMeasure) {
									treeNodes.add(new TreeData((AdaptabilityRatioMeasure)eo,Activator.NODE_ADAPTABILITY,modelFile));
								}
								if ( eo instanceof AdaptabilityTrend) {
									treeNodes.add(new TreeData((AdaptabilityTrend)eo,Activator.NODE_ADAPTABILITY_TREND,modelFile));
								}
								if ( eo instanceof ModularityTrend) {
									treeNodes.add(new TreeData((ModularityTrend)eo,Activator.NODE_MODULARITY_TREND,modelFile));
								}
							} // commit contents
						} // instance of pm
					} // model iterator

					// populate array and model map
					final TreeData[] treeDataArray = treeNodes.toArray(new TreeData[treeNodes.size()]); // $codepro.audit.disable localDeclaration
					cachedModelMap.put(modelFile, treeDataArray);

				} // resource not null

				return resource;
			} // model exists
		} // file extension matches
		cachedModelMap.remove(modelFile);
		return null; 
	} // method


}
