/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.measurement.sco.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.sco.CommitHistory;
import net.certware.measurement.sco.ArtifactCommit;

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
 * Provides change order statistics as navigator content.
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
			if ( ICertWareConstants.SCO_EXTENSION.equals(file.getFileExtension())) {
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
			if ( ICertWareConstants.SCO_EXTENSION.equals( modelFile.getFileExtension() ) ) {
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
			return ICertWareConstants.SCO_EXTENSION.equals(((IFile)element).getFileExtension());
		}

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized Resource updateModel(IFile modelFile) { // $codepro.audit.disable synchronizedMethod
		if ( ICertWareConstants.SCO_EXTENSION.equals(modelFile.getFileExtension())) {

			if (modelFile.exists()) {
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( null != resource ) {

					// visit the model, collect statistics
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) { // $codepro.audit.disable variableShouldBeFinal
						EObject eo = i.next(); // $codepro.audit.disable variableDeclaredInLoop
						if ( eo instanceof CommitHistory) {
							CommitHistory ch = (CommitHistory)eo;
							if ( ch.getCommitRecord() != null && ch.getCommitRecord().isEmpty() == false ) {
								// get the last commit in the list
								ArtifactCommit ac = 
									ch.getCommitRecord().get( ch.getCommitRecord().size() - 1);

								int artifactCount = ac.getArtifactIdentifiers().size();
								int baselinedLineCount = ac.getAllBaselinedLineCount();
								int currentLineCount = ac.getAllCurrentLineCount();
								int criticalDefectCount = ac.getAllCriticalDefectChangeOrders().getValue();
								int normalDefectCount = ac.getAllNormalDefectChangeOrders().getValue();
								int improvementCount = ac.getAllImprovementChangeOrders().getValue();
								int newFeatureCount = ac.getAllNewFeatureChangeOrders().getValue();
								int totalChangeCount = ac.getAllTotalChangeOrders().getValue();

								final List<TreeData> treeNodes = new ArrayList<TreeData>(); // $codepro.audit.disable localDeclaration

								treeNodes.add(new TreeData(modelFile,Messages.Node_Artifact,artifactCount,TreeData.ARTIFACT_COUNT));
								treeNodes.add(new TreeData(modelFile,Messages.Node_Baselined,baselinedLineCount,TreeData.BASELINED_COUNT));
								treeNodes.add(new TreeData(modelFile,Messages.Node_Current,currentLineCount,TreeData.CURRENT_COUNT));
								treeNodes.add(new TreeData(modelFile,Messages.Node_Critical,criticalDefectCount,TreeData.CRITICAL_COUNT));
								treeNodes.add(new TreeData(modelFile,Messages.Node_Normal,normalDefectCount,TreeData.NORMAL_COUNT));
								treeNodes.add(new TreeData(modelFile,Messages.Node_Improvement,improvementCount,TreeData.IMPROVEMENT_COUNT));
								treeNodes.add(new TreeData(modelFile,Messages.Node_NewFeature,newFeatureCount,TreeData.NEW_FEATURE_COUNT));
								treeNodes.add(new TreeData(modelFile,Messages.Node_Total,totalChangeCount,TreeData.TOTAL_COUNT));

								// populate array and model map
								final TreeData[] treeDataArray = treeNodes.toArray(new TreeData[treeNodes.size()]); // $codepro.audit.disable localDeclaration
								cachedModelMap.put(modelFile, treeDataArray);
								break;
							}
						}
					} // iterator

					return resource;
				} // model not null
			} // model file exists
		} // file extension matches
		cachedModelMap.remove(modelFile);
		return null; 
	} // method


}
