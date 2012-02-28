/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 */
package net.certware.argument.sfp.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Justification;
import net.certware.argument.sfp.semiFormalProof.Justifications;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.ProofSteps;
import net.certware.argument.sfp.semiFormalProof.QuotedAssertion;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.Validation;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;
import net.certware.argument.sfp.semiFormalProof.util.SemiFormalProofSwitch;
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
	/** statement count */
	protected int statementCount = 0;
	/** valid statement count */
	protected int validCount = 0;
	/** invalid statement count */
	protected int invalidCount = 0;
	/** unknown statement count */
	protected int unknownCount = 0;


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
			if ( ICertWareConstants.SFP_EXTENSION.equals(file.getFileExtension())) {
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
			if ( ICertWareConstants.SFP_EXTENSION.equals( modelFile.getFileExtension() ) ) {
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
			return ICertWareConstants.SFP_EXTENSION.equals(((IFile)element).getFileExtension());
		}

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file 
	 */
	private synchronized Resource updateModel(IFile modelFile) { // $codepro.audit.disable synchronizedMethod
		if ( ICertWareConstants.SFP_EXTENSION.equals(modelFile.getFileExtension())) {

			if (modelFile.exists()) {
				final ResourceSet resourceSet = new ResourceSetImpl();
				final Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( null != resource ) {

					setStatementCount(0);
					setValidCount(0);
					setInvalidCount(0);
					setUnknownCount(0);

					// visit the model, collect statistics
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) { // $codepro.audit.disable variableShouldBeFinal
						EObject eo = i.next(); // $codepro.audit.disable variableDeclaredInLoop
						visitor.doSwitch(eo);
					} // iterator

					TreeData td = null; // $codepro.audit.disable localDeclaration
					final List<TreeData> treeNodes = new ArrayList<TreeData>(); // $codepro.audit.disable localDeclaration

					if ( getStatementCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_2,getStatementCount(),TreeData.COUNT_TYPE_STATEMENT);
						treeNodes.add(td);
					}
					if ( getValidCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_3,getValidCount(),TreeData.COUNT_TYPE_VALID);
						treeNodes.add(td);
					}
					if ( getInvalidCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_4,getInvalidCount(),TreeData.COUNT_TYPE_INVALID);
						treeNodes.add(td);
					}
					if ( getUnknownCount() > 0 ) {
						td = new TreeData(modelFile,Messages.ContentProvider_5,getUnknownCount(),TreeData.COUNT_TYPE_UNKNOWN);
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
	 * Get the accumulated statement count.
	 * @return the statement count 
	 */
	public int getStatementCount() {
		return statementCount;
	}

	/**
	 * Sets the statement count value.
	 * @param statementCount the statement count
	 */
	public void setStatementCount(int statementCount) {
		this.statementCount = statementCount;
	}

	/**
	 * Increments the statement count by one.
	 */
	public void incrementStatementCount() {
		statementCount += 1;
	}

	/**
	 * Get the accumulated valid statement count.
	 * @return the valid statement count
	 */ 
	public int getValidCount() {
		return validCount;
	}

	/**
	 * Sets the valid statement count.
	 * @param validCount new valid statement count
	 */
	public void setValidCount(int validCount) {
		this.validCount = validCount;
	}

	/**
	 * Increments the valid statement count by one.
	 */
	public void incrementValidCount() {
		validCount += 1;
	}

	/**
	 * Get the solution node count.
	 * @return the solution count 
	 */
	public int getInvalidCount() {
		return invalidCount;
	}

	/**
	 * Sets the invalid statement count.
	 * @param invalidCount new invalid statement count
	 */
	public void setInvalidCount(int invalidCount) {
		this.invalidCount = invalidCount;
	}

	/**
	 * Increments the invalid statement count by one.
	 */
	public void incrementInvalidCount() {
		invalidCount += 1;
	}

	/**
	 * Get the number of unknown statements.
	 * @return unknown statement count
	 */
	public int getUnknownCount() {
		return unknownCount;
	}

	/**
	 * Sets the unknown statement count.
	 * @param unknownCount the new node count
	 */
	public void setUnknownCount(int unknownCount) {
		this.unknownCount = unknownCount;
	}

	/**
	 * Increments the unknown statement count.
	 */
	public void incrementUnknownCount() {
		unknownCount += 1;
	}
	
	/**
	 * Visitor for iterating over the resource content.
	 */
	public SemiFormalProofSwitch<Boolean> visitor = new SemiFormalProofSwitch<Boolean> () {
		
		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Proof</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Proof</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseProof(Proof object)
		  {
		    return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Justifications</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Justifications</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseJustifications(Justifications object)
		  {
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
		  public Boolean caseJustification(Justification object)
		  {
		    return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Quoted Assertion</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Quoted Assertion</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseQuotedAssertion(QuotedAssertion object)
		  {
		    return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Entailment</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Entailment</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseEntailment(Entailment object)
		  {
		    return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param object the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  //public Boolean caseConjunction(Conjunction object)
		  //{
		  //  return Boolean.TRUE;
		  //}

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Proof Steps</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param proofSteps the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Proof Steps</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseProofSteps(ProofSteps proofSteps)
		  {
		    return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param statement the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseStatement(Statement statement)
		  {
			  incrementStatementCount();
			  return Boolean.TRUE;
		  }

		  /**
		   * Returns the result of interpreting the object as an instance of '<em>Validation</em>'.
		   * <!-- begin-user-doc -->
		   * returning a non-null result will terminate the switch.
		   * <!-- end-user-doc -->
		   * @param validation the target of the switch.
		   * @return the result of interpreting the object as an instance of '<em>Validation</em>'.
		   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		   */
		  public Boolean caseValidation(Validation validation)
		  {
			  if ( validation.getState() == ValidationKind.INVALID ) {
				  incrementInvalidCount();
			  } else if ( validation.getState() == ValidationKind.VALID ) {
				  incrementValidCount();
			  } else if ( validation.getState() == ValidationKind.UNKNOWN ) {
				  incrementUnknownCount();
			  } else
				  System.err.println("Check validation kind " + validation.getState()); // TODO testing
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
