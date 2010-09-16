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

	private static final Object[] NO_CHILDREN = new Object[0];
	private final Map<IFile, TreeData[]> cachedModelMap = new HashMap<IFile, TreeData[]>();
	private StructuredViewer viewer;


	public ContentProvider() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}

	@Override
	public void dispose() {
		cachedModelMap.clear();
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this); 
	}

	@Override
	public void inputChanged(Viewer aViewer, Object oldInput, Object newInput) {
		if (oldInput != null && !oldInput.equals(newInput))
			cachedModelMap.clear();
		viewer = (StructuredViewer) aViewer;
	}

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
				new UIJob("Update CAE resource content model in project explorer") {
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

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		IResourceDelta delta = event.getDelta();
		try {
			delta.accept(this);
		} catch (CoreException e) { 
			e.printStackTrace();
		} 	
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;
		if ( parentElement instanceof TreeData ) {
			children = NO_CHILDREN;
		} else if (parentElement instanceof IFile) {
			IFile modelFile = (IFile)parentElement;
			if ( ICertWareConstants.CAE_EXTENSION.equals( modelFile.getFileExtension() ) ) {
				children = (TreeData[])cachedModelMap.get(modelFile);
				if ( children == null && updateModel(modelFile) != null ) {
					children = (TreeData[])cachedModelMap.get(modelFile);
				}
			}
		}
		return children != null ? children : NO_CHILDREN;
	}

	@Override
	public Object getParent(Object element) {
		if ( element instanceof TreeData ) {
			TreeData td = (TreeData)element;
			return td.getIfile();
		}
		return null;
	}

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

					td = new TreeData(modelFile,"Claims",getClaimCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,"Arguments",getArgumentCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,"Evidence",getEvidenceCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);

					if ( getToBeSupported() > 0 )
						td = new TreeData(modelFile,"Claims to be supported",getToBeSupported(),TreeData.COUNT_TYPE_OPEN);
					else
						td = new TreeData(modelFile,"All claims supported",-1,TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);

					// populate array and model map
					TreeData[] treeDataArray = (TreeData[])treeNodes.toArray(new TreeData[treeNodes.size()]);
					cachedModelMap.put(modelFile, treeDataArray);
					return resource;
				} // model not null
			} // model file exists
		} // file extension matches
		cachedModelMap.remove(modelFile);
		return null; 
	} // method

	protected int claimCount = 0;
	protected int argumentCount = 0;
	protected int evidenceCount = 0;
	protected int toBeSupported = 0;


	/**
	 * @return the argumentCount
	 */
	public int getArgumentCount() {
		return argumentCount;
	}

	/**
	 * @param argumentCount the argumentCount to set
	 */
	public void setArgumentCount(int argumentCount) {
		this.argumentCount = argumentCount;
	}

	public void incrementArgumentCount() {
		this.argumentCount += 1;
	}

	/**
	 * @return the claimCount
	 */
	public int getClaimCount() {
		return claimCount;
	}

	/**
	 * @param claimCount the claimCount to set
	 */
	public void setClaimCount(int claimCount) {
		this.claimCount = claimCount;
	}

	public void incrementClaimCount() {
		this.claimCount += 1;
	}

	/**
	 * @return the evidenceCount
	 */
	public int getEvidenceCount() {
		return evidenceCount;
	}

	/**
	 * @param evidenceCount the evidenceCount to set
	 */
	public void setEvidenceCount(int evidenceCount) {
		this.evidenceCount = evidenceCount;
	}

	public void incrementEvidenceCount() {
		this.evidenceCount += 1;
	}

	/**
	 * @return the toBeSupported
	 */
	public int getToBeSupported() {
		return toBeSupported;
	}

	/**
	 * @param toBeSupported the toBeSupported to set
	 */
	public void setToBeSupported(int toBeSupported) {
		this.toBeSupported = toBeSupported;
	}

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
