package net.certware.argument.gsz.diagram.handlers;

import net.certware.argument.gsz.diagram.edit.parts.ArgumentDiagramEditPart;
import net.certware.argument.gsz.diagram.part.GszDiagramEditorPlugin;
import net.certware.argument.gsz.diagram.part.GszDiagramEditorUtil;
import net.certware.argument.gsz.diagram.part.GszNewDiagramFileWizard;
import net.certware.argument.gsz.diagram.part.Messages;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

public class InitializeDiagramHandler extends AbstractHandler {

	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
	
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		EObject diagramRoot = null;
		URI domainModelURI = null;
		try {
			ISelection iss = window.getSelectionService().getSelection();
			IFile file = (IFile) iss;
			domainModelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = resourceSet.getResource(domainModelURI, true);
			diagramRoot = (EObject) resource.getContents().get(0);
		} catch (WrappedException ex) {
			GszDiagramEditorPlugin.getInstance().logError("Unable to load resource:" + ' ' + domainModelURI, ex);
		}
		if (diagramRoot == null) {
			MessageDialog.openError(window.getShell(),
					Messages.InitDiagramFile_ResourceErrorDialogTitle,
					Messages.InitDiagramFile_ResourceErrorDialogMessage);
			return null;
		}
		Wizard wizard = new GszNewDiagramFileWizard(domainModelURI,
				diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle,
				ArgumentDiagramEditPart.MODEL_ID));
		GszDiagramEditorUtil.runWizard(window.getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
		
		return null;
	}

}
