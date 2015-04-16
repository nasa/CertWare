// $codepro.audit.disable importOrder, localDeclaration
/*
 * Copyright (c) 2010 Object Management Group (ARM metamodel)
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.  (generated models) 
 */

package net.certware.argument.arm.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.Annotation;
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.ArgumentReasoning;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.AssertedChallenge;
import net.certware.argument.arm.AssertedContext;
import net.certware.argument.arm.AssertedCounterEvidence;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedInference;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.CitationElement;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.EvidenceAssertion;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.util.ArmSwitch;
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
 */
public class ContentProvider 
implements ITreeContentProvider, IResourceChangeListener, IResourceDeltaVisitor, ICertWareConstants {

	/** no children array for tree */
	private static final Object[] NO_CHILDREN = new Object[0];
	/** initial map size */
	private static final int INITIAL_CAPACITY = 3;
	/** load factor for collection */
	private static final float LOAD_FACTOR = 0.75f;
	/** cache for resource revisits */
	private final Map<IFile, TreeData[]> cachedModelMap = new HashMap<IFile,TreeData[]>(INITIAL_CAPACITY, LOAD_FACTOR);
	/** input change viewer */
	private StructuredViewer viewer;
	/** element node count */
	protected int elementCount = 0;
	/** link node count */
	protected int linkCount = 0;
	/** to be supported node count */
	protected int toBeSupported = 0;

	/**
	 * Constructor adds resource change listener for post change events.
	 */
	public ContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * Dispose clears the model cache and removes the resource change listener.
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		cachedModelMap.clear();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this); 
	}

	/**
	 * Content provider input changed response.
	 * @param aViewer tree viewer
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
	 * Visitor for the resource change delta.
	 * @param delta resource change delta
	 * @return false for file processing, true for other resource types  
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
			if ( ICertWareConstants.ARM_EXTENSION.equals(file.getFileExtension())) {
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
	 * Resource change event handler.
	 * @param event resource change event for delta
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
	 * Return the children elements of the input model.
	 * @param inputElement input element
	 * @return children of the input element
     * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(Object) 
     */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * Gets the children of the parent if a TreeData object, otherwise caches model of IFile parent
	 * @param parentElement parent element
	 * @return children of cached IFile model, or NO_CHILDREN
     * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(Object) 
     */
	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
		if ( parentElement instanceof TreeData ) {
			children = NO_CHILDREN;
		} else if (parentElement instanceof IFile) {
			final IFile modelFile = (IFile)parentElement;
			if ( ICertWareConstants.ARM_EXTENSION.equals( modelFile.getFileExtension() ) ) {
				children = cachedModelMap.get(modelFile);
				if ( null == children && null != updateModel(modelFile) ) {
					children = cachedModelMap.get(modelFile);
				}
			}
		}
		return (null != children) ? children : NO_CHILDREN;
	}

	/**
	 * Gets the tree data element's parent resource file.
	 * @param element tree data element
	 * @return element's ifile, or TRUE if element is not a tree data object
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
	 * Whether the element has children.
	 * @param element object to test
	 * @return true if element is an IFile matching extension, false otherwise
     * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(Object)
     */
	@Override
	public boolean hasChildren(Object element) {
		if ( element instanceof TreeData ) {
			return false;
		}
		else if ( element instanceof IFile ) {
			return ICertWareConstants.ARM_EXTENSION.equals(((IFile)element).getFileExtension());
		}

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return project data from the document
     */
	private synchronized Argument updateModel(IFile modelFile) { // $codepro.audit.disable synchronizedMethod
		if ( ICertWareConstants.ARM_EXTENSION.equals(modelFile.getFileExtension())) {
			Argument model = ArmFactory.eINSTANCE.createArgument();
			if (modelFile.exists()) {
				//@SuppressWarnings("unused") // uses side effect
				//ArmPackage armPackage = ArmPackage.eINSTANCE; 
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);
				
				if ( null != resource ) {

					setElementCount(0);
					setLinkCount(0);
					setToBeSupported(0);

					// visit the model, collect statistics
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) { // $codepro.audit.disable variableShouldBeFinal
						EObject eo = i.next(); // $codepro.audit.disable variableDeclaredInLoop
						visitor.doSwitch(eo);
					} // iterator

					final List<TreeData> treeNodes = new ArrayList<TreeData>();

					TreeData td = null;
					td = new TreeData(modelFile,Messages.ContentProvider_2,getElementCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,Messages.ContentProvider_3,getLinkCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					
					if ( getToBeSupported() > 0 )
						td = new TreeData(modelFile,Messages.ContentProvider_6,getToBeSupported(),TreeData.COUNT_TYPE_OPEN);
					else
						td = new TreeData(modelFile,Messages.ContentProvider_7,-1,TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					
					final TreeData[] treeDataArray = treeNodes.toArray(new TreeData[treeNodes.size()]);
		            cachedModelMap.put(modelFile, treeDataArray);
		            return model;
				} // model not null
			} // model file exists
		} // file extension matches
		cachedModelMap.remove(modelFile);
		return null;
	} // method

	/**
	 * Gets the element count.
	 * @return the element count
     */
	public int getElementCount() {
		return elementCount;
	}

	/**
     * Sets the element count.
	 * @param elementCount the elementCount to set
	 */
	public void setElementCount(int elementCount) {
		this.elementCount = elementCount;
	}
	
	/**
	 * Increments the element node count by one.
	 */
	public void incrementElementCount() {
		elementCount += 1;
	}

	/**
	 * Gets the link count.
	 * @return the link count 
	 */
	public int getLinkCount() {
		return linkCount;
	}

	/**
	 * Sets the link count.
	 * @param linkCount the link count to set
	 */
	public void setLinkCount(int linkCount) {
		this.linkCount = linkCount;
	}
	
	/**
	 * Increments the link node count by one.
	 */
	public void incrementLinkCount() {
		linkCount += 1;
	}

	/**
	 * Gets the to be supported flag.
	 * @return the to be supported flag
	 */
	public int getToBeSupported() {
		return toBeSupported;
	}

	/**
	 * Sets the to be supported flag.
	 * @param toBeSupported the flag value
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
	public ArmSwitch<Boolean> visitor = new ArmSwitch<Boolean> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseModelElement(ModelElement object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseTaggedValue(TaggedValue object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseArgument(Argument object) {
			incrementElementCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * <!-- begin-user-doc -->
		 * Increments the element count.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseArgumentElement(ArgumentElement object) {
			incrementElementCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * <!-- begin-user-doc -->
		 * Increments the link count.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseArgumentLink(ArgumentLink object) {
			incrementLinkCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Relationship</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseAssertedRelationship(AssertedRelationship object) {
			incrementLinkCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseAnnotation(Annotation object) {
			incrementLinkCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseAssertedInference(AssertedInference object) {
			incrementLinkCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseAssertedEvidence(AssertedEvidence object) {
			incrementLinkCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseAssertedContext(AssertedContext object) {
			incrementLinkCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseAssertedCounterEvidence(AssertedCounterEvidence object) {
			incrementLinkCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseAssertedChallenge(AssertedChallenge object) {
			incrementLinkCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseReasoningElement(ReasoningElement object) {
			incrementElementCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * <!-- begin-user-doc -->
		 * Increments the to-be-supported count.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseClaim(Claim object) {
			incrementElementCount();
			if ( object.isToBeSupported() )
				incrementToBeSupported();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Evidence Assertion</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Evidence Assertion</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseEvidenceAssertion(EvidenceAssertion object) {
			incrementElementCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Information Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseInformationElement(InformationElement object) {
			incrementElementCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseArgumentReasoning(ArgumentReasoning object) {
			incrementElementCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Citation Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Citation Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated NOT
		 */
		public Boolean caseCitationElement(CitationElement object) {
			incrementElementCount();
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
		 * @generated
		 */
		public Boolean defaultCase(EObject object) {
			return Boolean.TRUE;
		}
	};
}
