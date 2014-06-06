/*
 * 
 */
package stateAnalysis.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class StateAnalysisCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected stateAnalysis.diagram.part.StateAnalysisCreationWizardPage diagramModelFilePage;

	/**
	 * @generated
	 */
	protected stateAnalysis.diagram.part.StateAnalysisCreationWizardPage domainModelFilePage;

	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(stateAnalysis.diagram.part.Messages.StateAnalysisCreationWizardTitle);
		setDefaultPageImageDescriptor(stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewStateAnalysisWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		diagramModelFilePage = new stateAnalysis.diagram.part.StateAnalysisCreationWizardPage(
				"DiagramModelFile", getSelection(), "sad"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(stateAnalysis.diagram.part.Messages.StateAnalysisCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(stateAnalysis.diagram.part.Messages.StateAnalysisCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new stateAnalysis.diagram.part.StateAnalysisCreationWizardPage(
				"DomainModelFile", getSelection(), "stateanalysis") { //$NON-NLS-1$ //$NON-NLS-2$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0,
							fileName.length() - ".sad".length()); //$NON-NLS-1$
					setFileName(stateAnalysis.diagram.part.StateAnalysisDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(),
									fileName, "stateanalysis")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(stateAnalysis.diagram.part.Messages.StateAnalysisCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(stateAnalysis.diagram.part.Messages.StateAnalysisCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	 * @generated
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = stateAnalysis.diagram.part.StateAnalysisDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(),
								domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						stateAnalysis.diagram.part.StateAnalysisDiagramEditorUtil
								.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										stateAnalysis.diagram.part.Messages.StateAnalysisCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog
						.openError(
								getContainer().getShell(),
								stateAnalysis.diagram.part.Messages.StateAnalysisCreationWizardCreationError,
								null, ((CoreException) e.getTargetException())
										.getStatus());
			} else {
				stateAnalysis.diagram.part.StateAnalysisDiagramEditorPlugin
						.getInstance()
						.logError(
								"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
