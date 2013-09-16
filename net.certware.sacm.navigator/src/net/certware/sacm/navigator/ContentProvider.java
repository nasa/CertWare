/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.sacm.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.sacm.SACM.Annotation;
import net.certware.sacm.SACM.AssuranceCase;
import net.certware.sacm.SACM.Datetime;
import net.certware.sacm.SACM.ModelElement;
import net.certware.sacm.SACM.SACMElement;
import net.certware.sacm.SACM.TaggedValue;
import net.certware.sacm.SACM.UtilityElement;
import net.certware.sacm.SACM.util.SACMSwitch;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.progress.UIJob;


/**
 * Provides model elements as navigator content.  
 * Uses a visitor to read the model and accumulate counter values.
 * @author mrb
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
	/** model utility elements */
	private int utilityElementCount;
	/** model annotations */
	private int annotationCount;
	/** model assurance cases */
	private int assuranceCaseCount;
	/** model date time elements */
	private int dateTimeCount;
	/** model elements */
	private int modelElementCount;
	/** model SACM elements */
	private int sacmElementCount;
	/** model tagged values */
	private int taggedValueCount;

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
			final IFile file = (IFile) source;
			if ( isSacm(file) ) {
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
			if ( isSacm(modelFile) ) {
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
	 * @return TreeData object IFile, otherwise TRUE if element is not a tree data object
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(Object)
	 */
	@Override
	public Object getParent(Object element) {
		if ( element instanceof TreeData ) {
			final TreeData td = (TreeData)element;
			return td.getIfile();
		}
		return Boolean.TRUE;
	}

	/**
	 * Whether a given file has an extension matching the SACM models.
	 * @param f file to text extension
	 * @return true if extension matches one of several SACM extensions
	 */
	private boolean isSacm(IFile f) {
		String ext = f.getFileExtension();
		return ICertWareConstants.SACM_EXTENSION.equals(ext) ||
				ICertWareConstants.SACM_ARG_EXTENSION.equals(ext) ||
				ICertWareConstants.SACM_EVIDENCE_EXTENSION.equals(ext);
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
		else 
			if ( element instanceof IFile ) {
				return isSacm((IFile)element);
		}
		
		return false;
	}

	/**
	 * Updates the navigator model from the element statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized Resource updateModel(IFile modelFile) { 
		if ( isSacm(modelFile) ) {

			if (modelFile.exists()) {
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( null != resource ) {

					setAnnotationCount(0);
					setAssuranceCaseCount(0);
					setDateTimeCount(0);
					setModelElementCount(0);
					setSacmElementCount(0);
					setTaggedValueCount(0);
					setUtilityElementCount(0);

					// visit the model, collect statistics
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) {
						EObject eo = i.next();
						visitor.doSwitch(eo);
					}

					final List<TreeData> treeNodes = new ArrayList<TreeData>();

					treeNodes.add(new TreeData(modelFile,Messages.ContentProvider_0,getAnnotationCount(),TreeData.COUNT_TYPE_ANNOTATIONS));
					treeNodes.add(new TreeData(modelFile,Messages.ContentProvider_1,getAssuranceCaseCount(),TreeData.COUNT_TYPE_ASSURANCE_CASES));
					treeNodes.add(new TreeData(modelFile,Messages.ContentProvider_2,getDateTimeCount(),TreeData.COUNT_TYPE_DATE_TIMES));
					treeNodes.add(new TreeData(modelFile,Messages.ContentProvider_3,getModelElementCount(),TreeData.COUNT_TYPE_MODEL_ELEMENTS));
					treeNodes.add(new TreeData(modelFile,Messages.ContentProvider_4,getSacmElementCount(),TreeData.COUNT_TYPE_SACM_ELEMENTS));
					treeNodes.add(new TreeData(modelFile,Messages.ContentProvider_5,getTaggedValueCount(),TreeData.COUNT_TYPE_TAGGED_VALUES));
					treeNodes.add(new TreeData(modelFile,Messages.ContentProvider_6,getTaggedValueCount(),TreeData.COUNT_TYPE_UTILITY_ELEMENTS));

					// populate array and model map
					final TreeData[] treeDataArray = treeNodes.toArray(new TreeData[treeNodes.size()]);
					cachedModelMap.put(modelFile, treeDataArray);
					return resource;
				} // model not null
			} // model file exists
		} // file extension matches

		cachedModelMap.remove(modelFile);
		return null; 
	} // method


	public void setUtilityElementCount(int elementCount) {
		this.utilityElementCount = elementCount;
	}

	public int getUtilityElementCount() {
		return utilityElementCount;
	}
	
	public void incrementUtilityElement() {
		utilityElementCount += 1;
	}

	public void incrementAnnotationCount() {
		annotationCount += 1;
	}
	
	public void setAnnotationCount(int count) {
		annotationCount = count;
	}
	
	public int getAnnotationCount() {
		return annotationCount;
	}
	
	public void incrementAssuranceCaseCount() {
		assuranceCaseCount += 1;
	}
	
	public void setAssuranceCaseCount(int count) {
		assuranceCaseCount = count;
	}
	
	public int getAssuranceCaseCount() {
		return assuranceCaseCount;
	}
	
	public void incrementDateTimeCount() {
		dateTimeCount += 1;
	}
	
	public void setDateTimeCount(int count) {
		dateTimeCount = count;
	}
	
	public int getDateTimeCount() {
		return dateTimeCount;
	}
	
	public void incrementModelElementCount() {
		modelElementCount += 1;
	}
	
	public void setModelElementCount(int count) {
		modelElementCount = count;
	}
	
	public int getModelElementCount() {
		return modelElementCount;
	}
	
	public void incrementSacmElementCount() {
		sacmElementCount += 1;
	}
	
	public void setSacmElementCount(int count) {
		sacmElementCount = count;
	}
	
	public int getSacmElementCount() {
		return sacmElementCount;
	}
	
	public void incrementTaggedValueCount() {
		taggedValueCount += 1;
	}
	
	public void setTaggedValueCount(int count) {
		taggedValueCount = count;
	}
	
	public int getTaggedValueCount() {
		return taggedValueCount;
	}
	
	public void incrementUtilityElementCount() {
		utilityElementCount += 1;
	}
	

	
	/**
	 * Visitor to pass over model elements and links.
	 */
	public SACMSwitch<Boolean> visitor = new SACMSwitch<Boolean>() {
		
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAnnotation(Annotation object) {
			incrementAnnotationCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assurance Case</em>'.
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Assurance Case</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseAssuranceCase(AssuranceCase object) {
			incrementAssuranceCaseCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Datetime</em>'.
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Datetime</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseDatetime(Datetime object) {
			incrementDateTimeCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseModelElement(ModelElement object) {
			incrementModelElementCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseSACMElement(SACMElement object) {
			incrementSacmElementCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseTaggedValue(TaggedValue object) {
			incrementTaggedValueCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Utility Element</em>'.
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Utility Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseUtilityElement(UtilityElement object) {
			incrementUtilityElement();
			return Boolean.TRUE;
		}


		/**
		 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch, but this is the last case anyway.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
		 */
		@Override
		public Boolean defaultCase(EObject object) {
			return Boolean.TRUE;
		}
	};
}
