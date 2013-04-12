package net.certware.evidence.hugin.view.handlers;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
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
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Command handler for restoring evidence settings.
 * @author mrb
 * @since 1.2.1
 */
public class RestoreEvidenceHandler extends AbstractHandler
{
	/**
	 * Handles the restore evidence command request.  Runs a dialog to handle the request.
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

		// select each node and state not selected, refresh tree parts
		if ( view != null ) {

			// variable node list destination not empty
			if ( view.getVariableNodes().isEmpty() ) {
				CertWareLog.logWarning("Cannot restore evidence to empty network");
				return null;
			}

			// prompt for file
			ResourceSelectionDialog dialog = new ResourceSelectionDialog(shell, 
					ResourcesPlugin.getWorkspace().getRoot(), 
					"Select evidence file");
			dialog.setBlockOnOpen(true);
			dialog.setHelpAvailable(false); // TODO add help
			dialog.setTitle("Evidence File Selection");
			int rv = dialog.open();
			if ( rv == Dialog.CANCEL )
				return null;

			// only use the first selection
			Object[] results = dialog.getResult();
			if ( results[0] instanceof IFile ) {
				
				// ensure valid selection
				IFile selectedFile = (IFile)results[0];
				if ( selectedFile.getFileExtension().equalsIgnoreCase(ICertWareConstants.HEV_EXTENSION) == false ) {
					String message = String.format("%s %s","Cannot restore from the selected file type",
							selectedFile.getFileExtension());
					CertWareLog.logWarning(message);
					view.setWarningMessage(message);
					return null;
				}

				String platformString = selectedFile.getFullPath().toPortableString();

				// read and process the network
				InstanceNetwork network = readNetwork(platformString);
				if ( network != null ) {
					// clear previous selections
					for ( VariableNode vn : view.getVariableNodes() ) {
						for ( VariableNodeState vns : vn.states ) {
							if ( vns.isSelected() ) {
								vns.setSelected(false);
								view.getTreeViewer().refresh(vns);
							}
						}
					}
					// instantiate new selections 
					for ( InstanceVariable v : network.getVariables() ) {
						for ( InstanceState s : v.getStates() ) {
							for ( VariableNode vn : view.getVariableNodes() ) {
								if ( vn.getNode().getID().equals(v.getVariableName() )) {
									// variables match
									// now set the evidence, clearing siblings if necessary
									for ( VariableNodeState vns : vn.states ) {
										if ( vns.getStateName().equals(s.getStateName())) {
											vns.setSelected(true);
											view.getTreeViewer().refresh(vns);
										}
									}
								} // node name matches
							} // tree nodes
						} // states
					} // variables

					String message = "Installed evidence into network";
					CertWareLog.logInfo(message);
					view.setInfoMessage(message);
				} else {
					String message = "Cannot read selected evidence";
					view.setWarningMessage(message);
				}
			}
		} // view

		return null;
	} 

	/**
	 * Read the selected resource into our object model.
	 * @param path full path from resource file path
	 * @return network or null
	 */
	private InstanceNetwork readNetwork(String path) {
		// load the XML file through the EMF resource set implementation
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(path, true), true);
			InstanceNetwork network = (InstanceNetwork)resource.getContents().get(0);
			return network;
		} catch( Exception e ) {
			CertWareLog.logWarning(String.format("%s %s","Loading evidence resource",path));
			return null;
		}
	}
}


