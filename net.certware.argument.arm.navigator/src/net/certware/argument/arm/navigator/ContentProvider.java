package net.certware.argument.arm.navigator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.Claim;
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
			if ( ICertWareConstants.ARM_EXTENSION.equals(file.getFileExtension())) {
				updateModel(file);
				new UIJob("Update ARM resource content model in project explorer") {
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
			if ( ICertWareConstants.ARM_EXTENSION.equals( modelFile.getFileExtension() ) ) {
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
			return ICertWareConstants.ARM_EXTENSION.equals(((IFile)element).getFileExtension());

		return false;
	}

	/**
	 * Updates the navigator model from the project statistics in the resource model file.
	 * @param modelFile input file
	 * @return project data from the document
	 */
	private synchronized Argument updateModel(IFile modelFile) {
		if ( ICertWareConstants.ARM_EXTENSION.equals(modelFile.getFileExtension())) {
			Argument model = ArmFactory.eINSTANCE.createArgument();
			if (modelFile.exists()) {
				@SuppressWarnings("unused") // uses side effect
				ArmPackage armPackage = ArmPackage.eINSTANCE; 
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource( 
						URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true), 
						true);
				Argument argumentRoot = (Argument)resource.getContents().get(0);
				
				model = argumentRoot; // flip flop

				if ( model != null ) {
					List<TreeData> treeNodes = new ArrayList<TreeData>();

					TreeData td;
					td = new TreeData(modelFile,"Elements",argumentRoot.getContainsArgumentElement().size(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					td = new TreeData(modelFile,"Links",argumentRoot.getContainsArgumentLink().size(),TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					
					int toBeSupported = 0;
					for ( Iterator<EObject> i = argumentRoot.eAllContents(); i.hasNext(); ) {
						EObject eo = i.next();
						if ( eo instanceof Claim ) {
							Claim c = (Claim)eo;
							if ( c.isToBeSupported() )
								toBeSupported++;
						}
					} // for model objects

					if ( toBeSupported > 0 )
						td = new TreeData(modelFile,"Claims to be supported",toBeSupported,TreeData.COUNT_TYPE_OPEN);
					else
						td = new TreeData(modelFile,"All claims supported",-1,TreeData.COUNT_TYPE_CLOSED);
					treeNodes.add(td);
					
					TreeData[] treeDataArray = (TreeData[])treeNodes.toArray(new TreeData[treeNodes.size()]);
		            cachedModelMap.put(modelFile, treeDataArray);
		            
		            return model;
				} // model not null
			} // model file exists
		} // file extension matches
		cachedModelMap.remove(modelFile);
		return null; 
	} // method
}
