package net.certware.argument.gsn.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArgumentLink;
import net.certware.argument.arm.AssertedEvidence;
import net.certware.argument.arm.AssertedRelationship;
import net.certware.argument.arm.Claim;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.ReasoningElement;
import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.util.GsnSwitch;
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
			if ( ICertWareConstants.GSN_EXTENSION.equals(file.getFileExtension())) {
				updateModel(file);
				new UIJob("Update GSN resource content model in project explorer") {
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
			if ( ICertWareConstants.GSN_EXTENSION.equals( modelFile.getFileExtension() ) ) {
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
			return ICertWareConstants.GSN_EXTENSION.equals(((IFile)element).getFileExtension());

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return model resource processed from file
	 */
	private synchronized Resource updateModel(IFile modelFile) {
		if ( ICertWareConstants.GSN_EXTENSION.equals(modelFile.getFileExtension())) {

			if (modelFile.exists()) {
				@SuppressWarnings("unused") // uses side effect
				GsnPackage gsnPackage = GsnPackage.eINSTANCE; 
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);

				if ( resource != null ) {

					setGoalCount(0);
					setStrategyCount(0);
					setSolutionCount(0);
					setToBeSupported(0);

					// visit the model, collect statistics
					for ( Iterator<EObject> i = resource.getAllContents(); i.hasNext(); ) {
						EObject eo = i.next();
						visitor.doSwitch(eo);
					} // iterator

					TreeData td;
					List<TreeData> treeNodes = new ArrayList<TreeData>();

					td = new TreeData(modelFile,"Goals",getGoalCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,"Strategies",getStrategyCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,"Solutions",getSolutionCount(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);

					/*
					if ( getToBeSupported() > 0 )
						td = new TreeData(modelFile,"Claims to be supported",getToBeSupported(),TreeData.COUNT_TYPE_OPEN);
					else
						td = new TreeData(modelFile,"All claims supported",-1,TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					*/

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

	protected int goalCount = 0;
	protected int strategyCount = 0;
	protected int solutionCount = 0;
	protected int toBeSupported = 0;


	/**
	 * @return the goal count
	 */
	public int getGoalCount() {
		return goalCount;
	}

	/**
	 * @param goalCount the goal count
	 */
	public void setGoalCount(int goalCount) {
		this.goalCount = goalCount;
	}

	public void incrementGoalCount() {
		this.goalCount += 1;
	}

	/**
	 * @return the strategy count
	 */
	public int getStrategyCount() {
		return strategyCount;
	}

	/**
	 * @param strategyCount new strategy count
	 */
	public void setStrategyCount(int strategyCount) {
		this.strategyCount = strategyCount;
	}

	public void incrementStrategyCount() {
		this.strategyCount += 1;
	}

	/**
	 * @return the solution count
	 */
	public int getSolutionCount() {
		return solutionCount;
	}

	/**
	 * @param solutionCount new solution count
	 */
	public void setSolutionCount(int solutionCount) {
		this.solutionCount = solutionCount;
	}

	public void incrementSolutionCount() {
		this.solutionCount += 1;
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
	public GsnSwitch<Boolean> visitor = new GsnSwitch<Boolean> () {
		/**
		 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseGoal(Goal object) {
			incrementGoalCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseStrategy(Strategy object) {
			incrementStrategyCount();
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseSolution(Solution object) {
			incrementSolutionCount();
			@SuppressWarnings("unused")
			InformationElement e = object.getEvidence();
			// TODO whether to count to-be-supported somehow
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseAssumption(Assumption object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseContext(Context object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseJustification(Justification object) {
			return Boolean.TRUE;
		}

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
		 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseArgumentElement(ArgumentElement object) {
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
		 * @generated
		 */
		public Boolean caseReasoningElement(ReasoningElement object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseClaim(Claim object) {
			return Boolean.TRUE;
		}

		/**
		 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * <!-- begin-user-doc -->
		 * This implementation returns null;
		 * returning a non-null result will terminate the switch.
		 * <!-- end-user-doc -->
		 * @param object the target of the switch.
		 * @return the result of interpreting the object as an instance of '<em>Argument Link</em>'.
		 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
		 * @generated
		 */
		public Boolean caseArgumentLink(ArgumentLink object) {
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
		 * @generated
		 */
		public Boolean caseAssertedRelationship(AssertedRelationship object) {
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
		 * @generated
		 */
		public Boolean caseAssertedEvidence(AssertedEvidence object) {
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
		 * @generated
		 */
		public Boolean caseInformationElement(InformationElement object) {
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
