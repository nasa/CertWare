package net.certware.argument.transform.gsn2arm;

import java.net.URL;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.core.service.CoreService;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;

public class TransformAction implements IObjectActionDelegate {

	/** bundle location of ASM file */
	private static URL asmURL;
	/** injector for input model */
	private static IInjector injector;
	/** extractor for output model */
	private static IExtractor extractor;
	/** current selection identified by action contribution */
	private ISelection currentSelection;
	private IReferenceModel gsnMetamodel;
	private IReferenceModel armMetamodel;

	static {
		// ATL gsn2arm transformation
		Bundle bundle = Platform.getBundle("net.certware.argument.transform.gsn2arm"); //$NON-NLS-1$
		asmURL = bundle.getEntry("model/gsn2arm.asm"); //$NON-NLS-1$
		try {
			injector = CoreService.getInjector("EMF"); //$NON-NLS-1$
			extractor = CoreService.getExtractor("EMF"); //$NON-NLS-1$                      
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}


	public TransformAction() {
		super();
	}

	@Override
	public void run(IAction action) {
		// process the selection
		IStructuredSelection iss = (IStructuredSelection)currentSelection;
		for (Iterator<?> iterator = iss.iterator(); iterator.hasNext();) {
			try {
				transform((IFile)iterator.next());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.currentSelection = selection;

	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// no action
	}

	protected void transform(IFile file) throws Exception {

		ModelFactory factory = CoreService.getModelFactory("EMF"); //$NON-NLS-1$

		// metamodels
		gsnMetamodel = factory.newReferenceModel();
		injector.inject(gsnMetamodel, "http://www.certware.net/gsn"); //$NON-NLS-1$
		// armMetamodel = factory.getBuiltInResource("arm.ecore"); //$NON-NLS-1$ // TODO this line is broken
		armMetamodel = factory.newReferenceModel();
		injector.inject(armMetamodel, "http://www.omg.org/ARM"); //$NON-NLS-1$

		// launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher("EMF-specific VM"); //$NON-NLS-1$
		launcher.initialize(Collections.<String, Object> emptyMap());

		// create the models
		IModel armModel = factory.newModel(armMetamodel);
		IModel gsnModel = factory.newModel(gsnMetamodel);

		// load existing model
		injector.inject(gsnModel, file.getFullPath().toString());

		// launching
		launcher.addOutModel(armModel, "OUT", "ARM"); //$NON-NLS-1$ //$NON-NLS-2$
		launcher.addInOutModel(gsnModel, "IN", "GSN"); //$NON-NLS-1$ //$NON-NLS-2$

		launcher.launch(ILauncher.RUN_MODE, 
				new NullProgressMonitor(), 
				Collections.<String, Object> emptyMap(), 
				asmURL.openStream());

		// save model
		extractor.extract(gsnModel, file.getFullPath().toString() + ".arm"); //$NON-NLS-1$

		// refresh workspace
		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
	}
}
