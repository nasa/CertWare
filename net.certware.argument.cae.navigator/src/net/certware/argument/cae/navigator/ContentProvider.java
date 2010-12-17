package net.certware.argument.cae.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.cae.Argument;
import net.certware.argument.cae.Assumption;
import net.certware.argument.cae.CaePackage;
import net.certware.argument.cae.Claim;
import net.certware.argument.cae.Context;
import net.certware.argument.cae.Evidence;
import net.certware.argument.cae.Justification;
import net.certware.argument.cae.util.CaeSwitch;
import net.certware.core.ICertWareConstants;

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

	/** Field NO_CHILDREN */
	private static final Object[] NO_CHILDREN = new Object[0];
	/** cached model map for quick restore */
	private final Map<IFile, TreeData[]> cachedModelMap = new HashMap<IFile, TreeData[]>();
	/** structured viewer */
	private StructuredViewer viewer;
	/** claim count */
	protected int claimCount = 0;
	/** argument count */
	protected int argumentCount = 0;
	/** evidence count */
	protected int evidenceCount = 0;
	/** to be supported */
	protected int toBeSupported = 0;

	/**
	 * Constructor adds post change listener to workspace resource change events.
	 */
	public ContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	/**
	 * Dispose of the cached model map and remove the resource change listener.
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
		cachedModelMap.clear();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this); 
	}

	/**
	 * Handles input changed events.
	 * Clears the cached model map if necessary.
	 * @param aViewer structured viewer
	 * @param oldInput old input
	 * @param newInput new input
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(Viewer, Object, Object)
	 */
	@Override
	public void inputChanged(Viewer aViewer, Object oldInput, Object newInput) {
		if (oldInput != null && !oldInput.equals(newInput))
			cachedModelMap.clear();
		viewer = (StructuredViewer) aViewer;
	}

	/**
	 * A visitor for resource change delta traversal.
	 * @param delta resource change delta
	 * @return true if ROOT, PROJECT, or FOLDER, or false if FILE or unknown
	 * @throws CoreException for job problems refreshing the UI thread
	 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(IResourceDelta)
	 */
	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		IResource source = delta.getResource();
		switch (source.getType()) {
		case IResource.ROOT:
		case IResource.PROJECT:
		case IResource.FOLDER:
			return true;
		case IResource.FILE:
			final IFile file = (IFile) source;
			if ( ICertWareConstants.CAE_EXTENSION.equals(file.getFileExtension())) {
				updateModel(file);
				new UIJob(Messages.ContentProvider_0) {
					public IStatus runInUIThread(IProgressMonitor monitor) {
						if (viewer != null ) // && ! viewer.getControl().isDisposed())
							viewer.refresh(file);
						return Status.OK_STATUS;                        
					}
				}.schedule();
			}
			return false;
		}
		return false;
	}

	/**
	 * Handles resource change events.  Runs the delta accept to invoke visitor.
	 * Catches core exceptions and prints stack trace.
	 * @param event resource change event
	 * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(IResourceChangeEvent)
	 */
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		IResourceDelta delta = event.getDelta();
		try {
			delta.accept(this);
		} catch (CoreException e) { 
			e.printStackTrace();
		} 	
	}

	/**
	 * Gets the elements of the model.
	 * @param inputElement input element
	 * @return result of calling getChildren() on the input element
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * Gets the children of the given element.
	 * @param parentElement parent element
	 * @return children of the given parent, or NO_CHILDREN
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
		if ( parentElement instanceof TreeData ) {
			children = NO_CHILDREN;
		} else if (parentElement instanceof IFile) {
			IFile modelFile = (IFile)parentElement;
			if ( ICertWareConstants.CAE_EXTENSION.equals( modelFile.getFileExtension() ) ) {
				children = cachedModelMap.get(modelFile);
				if ( children == null && updateModel(modelFile) != null ) {
					children = cachedModelMap.get(modelFile);
				}
			}
		}
		return children != null ? children : NO_CHILDREN;
	}

	/**
	 * Gets the parent of the model element.
	 * @param element model element, expecting a TreeData object
	 * @return parent file of the tree data object, or null
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(Object)
	 */
	@Override
	public Object getParent(Object element) {
		if ( element instanceof TreeData ) {
			TreeData td = (TreeData)element;
			return td.getIfile();
		}
		return null;
	}

	/**
	 * Whether the element has children.
	 * @param element model element, expecting a TreeData or IFile object
	 * @return false for TreeData or unknown objects; true if the IFile extension matches the CAE extension
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(Object)
	 */
	@Override
	public boolean hasChildren(Object element) {
		if ( element instanceof TreeData )
			return false;
		else if ( element instanceof IFile )
			return ICertWareConstants.CAE_EXTENSION.equals(((IFile)element).getFileExtension());

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized Resource updateModel(IFile modelFile) {
		if ( ICertWareConstants.CAE_EXTENSION.equals(modelFile.getFileExtension())) {

			if (modelFile.exists()) {
				@SuppressWarnings("unused") // uses side effect
				CaePackage caePackage = CaePackage.eINSTANCE; 
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( resource != null ) {

					setClaimCount(0);
					setArgumentCount(0);
					setEvidenceCount(0);
					setToBeSupported(0);

					// visit the model, collect statistics
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) {
						EObject eo = i.next();
						visitor.doSwitch(eo);
					} // iterator

					TreeData td;
					List<TreeData> treeNodes = new ArrayList<TreeData>();

					td = new TreeData(modelFile,Messages.ContentProvider_1,getClaimCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,Messages.ContentProvider_2,getArgumentCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,Messages.ContentProvider_3,getEvidenceCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);

					if ( getToBeSupported() > 0 )
						td = new TreeData(modelFile,Messages.ContentProvider_4,getToBeSupported(),TreeData.COUNT_TYPE_OPEN);
					else
						td = new TreeData(modelFile,Messages.ContentProvider_5,-1,TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);

					// populate array and model map
					TreeData[] treeDataArray = treeNodes.toArray(new TreeData[treeNodes.size()]);
					cachedModelMap.put(modelFile, treeDataArray);
					return resource;
				} // model not null
			} // model file exists
		} // file extension matches
		cachedModelMap.remove(modelFile);
		return null; 
	} // method

	/**
	 * Gets the argument count.
	 * @return the argumentCount
	 */
	public int getArgumentCount() {
		return argumentCount;
	}

	/**
	 * Sets the argument count.
	 * @param argumentCount the argument count to set
	 */
	public void setArgumentCount(int argumentCount) {
		this.argumentCount = argumentCount;
	}

	/**
	 * Increments the argument count by one.
	 */
	public void incrementArgumentCount() {
		this.argumentCount += 1;
	}

	/**
	 * Gets the claim count.
	 * @return the claim count 
	 */
	public int getClaimCount() {
		return claimCount;
	}

	/**
	 * Sets the claim count.
	 * @param claimCount the claim count
	 */
	public void setClaimCount(int claimCount) {
		this.claimCount = claimCount;
	}

	/**
	 * Increments the claim count by one.
	 */
	public void incrementClaimCount() {
		this.claimCount += 1;
	}

	/**
	 * Gets the evidence count.
	 * @return the evidence count
	 */
	public int getEvidenceCount() {
		return evidenceCount;
	}

	/**
	 * Sets the evidence count.
	 * @param evidenceCount the evidence count
	 */
	public void setEvidenceCount(int evidenceCount) {
		this.evidenceCount = evidenceCount;
	}

	/**
	 * Increment the evidence count by one.
	 */
	public void incrementEvidenceCount() {
		this.evidenceCount += 1;
	}

	/**
	 * Gets the to be supported count.
	 * @return the to be supported count 
	 */
	public int getToBeSupported() {
		return toBeSupported;
	}

	/**
	 * Sets the to be supported count.
	 * @param toBeSupported the count value
	 */
	public void setToBeSupported(int toBeSupported) {
		this.toBeSupported = toBeSupported;
	}

	/**
	 * Increments the to be supported count by one.
	 */
	public void incrementToBeSupported() {
		this.toBeSupported += 1;
	}
	
	/**
	 * Visitor for iterating over the resource content.
	 */
	public CaeSwitch<Boolean> visitor = new CaeSwitch<Boolean> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * <!-- begin-user-doc -->
		 * Increments the claim node count.
		 * Increments the to-be-supported count if field is true
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseClaim(Claim object) {
			incrementClaimCount();
			if ( object.isToBeSupported() )
				incrementToBeSupported();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * <!-- begin-user-doc -->
		 * Increments the argument node count.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseArgument(Argument object) {
			incrementArgumentCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Evidence</em>'.
		 * <!-- begin-user-doc -->
		 * Increments the evidence node count.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Evidence</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 */
		public Boolean caseEvidence(Evidence object) {
			incrementEvidenceCount();
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
		 * returning a non-null result will terminate the switch.
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

		 * returning a non-null result will terminate the switch.
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
		public Boolean caseArm_Claim(net.certware.argument.arm.Claim object) {
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
		 * returning a non-null result will terminate the switch.
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
		 * returning a non-null result will terminate the switch.
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
		 * returning a non-null result will terminate the switch.
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
