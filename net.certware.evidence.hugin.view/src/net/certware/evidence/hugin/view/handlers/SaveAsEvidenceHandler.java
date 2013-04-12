package net.certware.evidence.hugin.view.handlers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.evidence.hugin.instance.InstanceFactory;
import net.certware.evidence.hugin.instance.InstanceNetwork;
import net.certware.evidence.hugin.instance.InstanceState;
import net.certware.evidence.hugin.instance.InstanceVariable;
import net.certware.evidence.hugin.view.ViewTree;
import net.certware.evidence.hugin.view.tree.VariableNode;
import net.certware.evidence.hugin.view.tree.VariableNodeState;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command handler for serializing a map of node names and evidence settings.
 * @author mrb
 * @since 1.2.1
 */
public class SaveAsEvidenceHandler extends AbstractHandler
{
	/**
	 * Handles the save evidence command request.  Runs a new file wizard to handle the request.
	 * Presumes the command came from the network view.
	 * @param event used only for checking active part
	 * @return always returns null  
	 * @see org.eclipse.core.commands.IHandler#execute(ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		// get context information
		final Shell shell = HandlerUtil.getActiveShellChecked(event);
		final ViewTree view = (ViewTree)HandlerUtil.getActivePartChecked(event);
		final IWorkbench workbench = HandlerUtil.getActiveWorkbenchWindowChecked(event).getWorkbench();
		IStructuredSelection iss = new StructuredSelection( view.getSelectedFile() );

		// select each node and state not selected, refresh tree parts
		if ( view != null ) {

			// create evidence to store
			InstanceNetwork instanceNetwork = InstanceFactory.eINSTANCE.createInstanceNetwork();
			
			for ( VariableNode vn : view.getVariableNodes() ) {
				for ( VariableNodeState vns : vn.states ) {
					if ( vns.isSelected() ) {
						// one variable and state per evidence selection, expecting only one selection per variable
						// the model provides a list of states per variable only for some other use of the model
						InstanceVariable instanceVariable = InstanceFactory.eINSTANCE.createInstanceVariable();
						instanceVariable.setVariableName(vn.getNode().getID());
						InstanceState instanceState = InstanceFactory.eINSTANCE.createInstanceState();
						instanceState.setStateName(vns.getStateName());
						instanceVariable.getStates().add(instanceState);
						instanceNetwork.getVariables().add(instanceVariable);
					} // selected evidence
				} // states
			} // nodes

			// skip if empty
			if ( instanceNetwork.getVariables().isEmpty() ) { 
				CertWareLog.logWarning("No evidence selections found");
				return null;
			}

			// launch the wizard
			NewEvidenceFileWizard wizard = new NewEvidenceFileWizard(instanceNetwork);
			wizard.init(workbench, iss);
			WizardDialog dialog = new WizardDialog(shell, wizard);
			dialog.create();
			dialog.open();

		} // view

		return null;
	}  

	public class NewEvidenceFileWizard extends Wizard implements INewWizard {

		private NewEvidenceFileWizardPage newFileWizardPage;
		private InstanceNetwork instanceNetwork;
		@SuppressWarnings("unused")
		private IWorkbench workbench;
		private IStructuredSelection selection;

		public NewEvidenceFileWizard(InstanceNetwork in) {
			setWindowTitle("New Evidence Instance File");
			this.instanceNetwork = in;
		} 

		@Override
		public void addPages() {
			newFileWizardPage = new NewEvidenceFileWizardPage(selection);
			addPage(newFileWizardPage);
		}

		@Override
		public boolean performFinish() {

			final IFile ifile = newFileWizardPage.createNewFile();
			if ( ifile != null ) {
				try {
					getContainer().run(false, false, new IRunnableWithProgress() {
						public void run(IProgressMonitor monitor) {
							monitor.beginTask("Saving file",1);
							try {
								// file was created above
								// get the URI of the model file
								// create a resource for this file
								// add the initial model object to the contents.
								ResourceSet resourceSet = new ResourceSetImpl();
								URI fileURI = URI.createPlatformResourceURI(ifile.getFullPath().toString(), true);
								Resource resource = resourceSet.createResource(fileURI);
								resource.getContents().add(instanceNetwork);

								// save the contents of the resource to the file system.
								//
								Map<Object, Object> options = new HashMap<Object, Object>();
								options.put(XMLResource.OPTION_ENCODING, "UTF-8");
								resource.save(options);								
								CertWareLog.logInfo(String.format("%s %s","Writing evidence file", ifile.getName()));
							} catch( Exception e ) {
								CertWareLog.logError(String.format("%s %s","Writing evidence file", ifile.getName()), e);
							}
							monitor.done();
						}});
					return true;
				} catch (Exception e) {
					CertWareLog.logError(String.format("%s %s","Creating evidence file", ifile.getName()), e);
				}
			}

			CertWareLog.logWarning("Did not write evidence file");
			return false;
		}

		@Override
		public void init(IWorkbench workbench, IStructuredSelection selection) {
			this.workbench = workbench;
			this.selection = selection;
		}
	}

	public class NewEvidenceFileWizardPage extends WizardNewFileCreationPage {

		public NewEvidenceFileWizardPage(IStructuredSelection selection) {
			super("NewEvidenceFileWizardPage", selection);
			setTitle("Evidence Instance File");
			setDescription("Creates a new evidence instance file");
			setFileExtension( ICertWareConstants.HEV_EXTENSION );
			setFileName("evidence" + '.' + ICertWareConstants.HEV_EXTENSION);
		}
	}

	/**
	 * Serializable hash map.
	 * @author mrb
	 */
	@SuppressWarnings("rawtypes")
	class SerializableMap extends HashMap implements Serializable {

		/** serial id */
		private static final long serialVersionUID = 1683045743052873361L;

		/**
		 * Serialize the map.
		 * @param ifile destination file
		 * @throws IOException
		 * @throws CoreException 
		 */
		public void serialize(final IFile ifile, IProgressMonitor monitor) throws IOException, CoreException {
			assert(ifile != null);

			ByteArrayInputStream bis = new ByteArrayInputStream(this.toString().getBytes());
			ifile.create(bis, true, monitor);

			return;
		}

	}
}


