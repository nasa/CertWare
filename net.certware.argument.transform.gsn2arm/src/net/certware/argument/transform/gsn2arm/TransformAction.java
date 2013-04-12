package net.certware.argument.transform.gsn2arm;

import java.net.URL;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
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

/**
 * Sets up and launches the ATL VM to perform a transformation.
 * @author mrb
 * @since 1.0.3
 */
public class TransformAction implements IObjectActionDelegate {
	/** launcher VM, tied to the run configuration used to test the ATL model */
	protected static final String LAUNCHER_VM = "EMF-specific VM"; //$NON-NLS-1$
	/** output file extension appended to file name */
	protected static final String FILE_EXTENSION_OUT = "arm"; //$NON-NLS-1$
	/** ATL input model identifier */
	protected static final String TRANSFORM_IN = "IN"; //$NON-NLS-1$
	/** ATL output model identifier */
	protected static final String TRANSFORM_OUT = "OUT"; //$NON-NLS-1$
	/** input model type identifier */
	protected static final String MODEL_IN_TYPE = "GSN"; //$NON-NLS-1$
	/** output model type identifier */
	protected static final String MODEL_OUT_TYPE = "ARM"; //$NON-NLS-1$
	/** name space identifier for the input model */
	protected static final String NS_GSN_MODEL = "http://www.certware.net/gsn"; //$NON-NLS-1$
	/** name space identifier for the output model */
	protected static final String NS_ARM_MODEL = "http://www.omg.org/ARM"; //$NON-NLS-1$
	/** bundle name containing the VM code ASM file */
	protected static final String BUNDLE_NAME = "net.certware.argument.transform.gsn2arm"; //$NON-NLS-1$
	/** factory to use for transformation */
	protected static final String MODEL_FACTORY_TYPE = "EMF"; //$NON-NLS-1$
	/** bundle location of ASM file */
	private static URL asmURL;
	/** injector for input model */
	private static IInjector injector;
	/** extractor for output model */
	private static IExtractor extractor;
	/** current selection identified by action contribution */
	private ISelection currentSelection;
	/** source metamodel */
	private IReferenceModel gsnMetamodel;
	/** target metamodel */
	private IReferenceModel armMetamodel;
	/** bundle content load for VM translator code */
	static {
		// ATL gsn2arm transformation
		Bundle bundle = Platform.getBundle(BUNDLE_NAME);
		asmURL = bundle.getEntry("model/gsn2arm.asm"); //$NON-NLS-1$
		try {
			injector = CoreService.getInjector(MODEL_FACTORY_TYPE); 
			extractor = CoreService.getExtractor(MODEL_FACTORY_TYPE); 
		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Constructor simply calls super.
	 */
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

	/**
	 * Configures and launches the EMF virtual machine using the core service factory.
	 * @param file selected file as source for transformation; result written to same location with appended extension.
	 * @throws Exception on transformation exceptions
	 */
	protected void transform(IFile file) throws Exception {

		ModelFactory factory = CoreService.getModelFactory(MODEL_FACTORY_TYPE);

		// metamodels
		gsnMetamodel = factory.newReferenceModel();
		injector.inject(gsnMetamodel, NS_GSN_MODEL); 
		armMetamodel = factory.newReferenceModel();
		injector.inject(armMetamodel, NS_ARM_MODEL); 

		// launcher
		ILauncher launcher = null;
		launcher = CoreService.getLauncher(LAUNCHER_VM);
		launcher.initialize(Collections.<String, Object> emptyMap());

		// create the models
		IModel armModel = factory.newModel(armMetamodel);
		IModel gsnModel = factory.newModel(gsnMetamodel);

		// load existing model
		injector.inject(gsnModel, file.getFullPath().toString());

		// launching
		launcher.addOutModel(armModel, TRANSFORM_OUT, MODEL_OUT_TYPE);
		launcher.addInOutModel(gsnModel, TRANSFORM_IN, MODEL_IN_TYPE);

		launcher.launch(ILauncher.RUN_MODE, 
				new NullProgressMonitor(), 
				Collections.<String, Object> emptyMap(), 
				asmURL.openStream());

		// save model
		extractor.extract(gsnModel, file.getFullPath().toString() + '.' + FILE_EXTENSION_OUT);

		// refresh workspace
		file.getParent().refreshLocal(IProject.DEPTH_INFINITE, null);
	}
}
