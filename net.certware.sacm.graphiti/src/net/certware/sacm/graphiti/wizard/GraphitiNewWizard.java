package net.certware.sacm.graphiti.wizard;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * A generic wizard for creation of new Graphiti diagrams.
 * 
 * @author msp
 */
public abstract class GraphitiNewWizard extends Wizard implements INewWizard {

    /** the workbench. */
    private IWorkbench workbench;
    /** the current selection. */
    private IStructuredSelection selection;
    /** the diagram model wizard page. */
    private CreationWizardPage diagramModelFilePage;
    /** the domain model wizard page. */
    private CreationWizardPage domainModelFilePage;
    /** the name of the wizard. */
    private String wizardName;
    /** the diagram file extension. */
    private String diagramFileExtension;
    /** the domain model file extension. */
    private String domainFileExtension;
    /** the diagram type name of the graphiti diagram. */
    private String diagramTypeName;
    /** the identifier of the diagram editor. */
    private String editorId;
    /** the grid size (0 means no grid). */
    private int gridSize = 0;
    /** the setting for snapping to grid. */
    private boolean snapToGrid = false;

    /**
     * Creates a new-wizard for Graphiti, with no grid.
     * 
     * @param name
     *            the name of the wizard
     * @param diagExt
     *            the diagram file extension
     * @param domainExt
     *            the domain model file extension
     * @param thediagramTypeName
     *            the diagram type name of the graphiti diagram
     */
    public GraphitiNewWizard(final String name, final String diagExt, final String domainExt,
            final String thediagramTypeName) {
        this.wizardName = name;
        this.diagramFileExtension = diagExt;
        this.domainFileExtension = domainExt;
        this.diagramTypeName = thediagramTypeName;
    }

    /**
     * Creates a new-wizard for Graphiti, with no grid.
     * 
     * @param name
     *            the name of the wizard
     * @param diagExt
     *            the diagram file extension
     * @param domainExt
     *            the domain model file extension
     * @param thediagramTypeName
     *            the diagram type of the graphiti diagram
     * @param theeditorId
     *            identifier of the diagram editor, or {@code null} if no editor shall be opened
     *            after model creation
     */
    public GraphitiNewWizard(final String name, final String diagExt, final String domainExt,
            final String thediagramTypeName, final String theeditorId) {
        this(name, diagExt, domainExt, thediagramTypeName);
        this.editorId = theeditorId;
    }

    /**
     * Creates a new-wizard for Graphiti, with customizable grid.
     * 
     * @param name
     *            the name of the wizard
     * @param diagExt
     *            the diagram file extension
     * @param domainExt
     *            the domain model file extension
     * @param thediagramTypeName
     *            the diagram type name of the graphiti diagram
     * @param theeditorId
     *            identifier of the diagram editor, or {@code null} if no editor shall be opened
     *            after model creation
     * @param thegridSize
     *            the grid size (0 means no grid)
     * @param thesnapToGrid
     *            the setting for snapping to grid
     */
    public GraphitiNewWizard(final String name, final String diagExt, final String domainExt,
            final String thediagramTypeName, final String theeditorId, final int thegridSize,
            final boolean thesnapToGrid) {
        this(name, diagExt, domainExt, thediagramTypeName, theeditorId);
        this.gridSize = thegridSize;
        this.snapToGrid = thesnapToGrid;
    }

    /**
     * {@inheritDoc}
     */
    public final void init(final IWorkbench theworkbench, final IStructuredSelection theselection) {
        this.workbench = theworkbench;
        this.selection = theselection;
        setWindowTitle("New " + wizardName + " Diagram");
        setNeedsProgressMonitor(true);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final void addPages() {
        diagramModelFilePage = new CreationWizardPage("DiagramModelFile", selection,
                diagramFileExtension);
        diagramModelFilePage.setTitle("Create " + wizardName + " Diagram");
        diagramModelFilePage.setDescription("Select file that will contain diagram model.");
        addPage(diagramModelFilePage);

        domainModelFilePage = new CreationWizardPage("DomainModelFile", selection,
                domainFileExtension);
        domainModelFilePage.setTitle("Create " + wizardName + " Domain Model");
        domainModelFilePage.setDescription("Select file that will contain domain model.");
        addPage(domainModelFilePage);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final boolean performFinish() {
        IRunnableWithProgress op = new WorkspaceModifyOperation(null) {
            @Override
            protected void execute(final IProgressMonitor monitor) throws CoreException,
                    InterruptedException {
                Resource diagramResource = createDiagram(diagramModelFilePage.getURI(),
                        domainModelFilePage.getURI(), monitor);
                if (diagramResource != null && editorId != null) {
                    try {
                        openDiagram(diagramResource);
                    } catch (PartInitException exception) {
                        throw new CoreException(new Status(IStatus.ERROR,
                                "de.cau.cs.rtprak.turing.graphiti",
                                "Error opening diagram", exception));
                    }
                }
            }
        };
        try {
            getContainer().run(false, true, op);
        } catch (InterruptedException exception) {
            return false;
        } catch (InvocationTargetException exception) {
            if (exception.getTargetException() instanceof CoreException) {
                StatusManager.getManager().handle(((CoreException) exception.getTargetException()),
                        "de.cau.cs.rtprak.turing.graphiti");
            } else {
                IStatus status = new Status(IStatus.ERROR, "de.cau.cs.rtprak.turing.graphiti",
                        "Error creating diagram", exception.getTargetException());
                StatusManager.getManager().handle(status, StatusManager.LOG);
            }
            return false;
        }
        return true;
    }

    /**
     * Create a diagram with given URIs.
     * 
     * @param diagramURI
     *            URI for the diagram file
     * @param modelURI
     *            URI for the model file
     * @param progressMonitor
     *            progress monitor
     * @return a resource for the new diagram file
     */
    private Resource createDiagram(final URI diagramURI, final URI modelURI,
            final IProgressMonitor progressMonitor) {
        progressMonitor.beginTask("Creating diagram and model files", 2);
        // create a resource set and editing domain
        TransactionalEditingDomain editingDomain = GraphitiUi.getEmfService()
                .createResourceSetAndEditingDomain();
        ResourceSet resourceSet = editingDomain.getResourceSet();
        CommandStack commandStack = editingDomain.getCommandStack();
        // create resources for the diagram and domain model files
        final Resource diagramResource = resourceSet.createResource(diagramURI);
        final Resource modelResource = resourceSet.createResource(modelURI);
        if (diagramResource != null && modelResource != null) {
            commandStack.execute(new RecordingCommand(editingDomain) {
                @Override
                protected void doExecute() {
                    createModel(diagramResource, diagramURI.lastSegment(), modelResource,
                            modelURI.lastSegment());
                }
            });
            progressMonitor.worked(1);

            try {
                modelResource.save(createSaveOptions());
                diagramResource.save(createSaveOptions());
            } catch (IOException exception) {
                IStatus status = new Status(IStatus.ERROR, "de.cau.cs.rtprak.turing.graphiti",
                        "Unable to store model and diagram resources", exception);
                StatusManager.getManager().handle(status);
            }
            setCharset(WorkspaceSynchronizer.getFile(modelResource));
            setCharset(WorkspaceSynchronizer.getFile(diagramResource));
        }
        progressMonitor.done();
        return diagramResource;
    }

    /**
     * Creates save options for the resources.
     * 
     * @return new save options
     */
    public static Map<?, ?> createSaveOptions() {
        HashMap<String, Object> saveOptions = new HashMap<String, Object>();
        saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
        saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
                Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
        return saveOptions;
    }

    /**
     * Set the character set for the given file to UTF-8.
     * 
     * @param file
     *            a file
     */
    public static void setCharset(final IFile file) {
        try {
            if (file != null) {
                file.setCharset("UTF-8", new NullProgressMonitor());
            }
        } catch (CoreException e) {
            StatusManager.getManager().handle(e, "de.cau.cs.rtprak.turing.graphiti");
        }
    }

    /**
     * Open the diagram from the given resource.
     * 
     * @param diagramResource
     *            a resource for a diagram file
     * @throws PartInitException
     *             if the diagram could not be opened
     */
    private void openDiagram(final Resource diagramResource) throws PartInitException {
        String path = diagramResource.getURI().toPlatformString(true);
        IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot()
                .findMember(new Path(path));
        if (workspaceResource instanceof IFile) {
            IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
            page.openEditor(new FileEditorInput((IFile) workspaceResource), editorId);
        }
    }

    /**
     * Create a model in the given resources.
     * 
     * @param diagramResource
     *            resource for the diagram model
     * @param diagramName
     *            name of the diagram model
     * @param modelResource
     *            resource for the domain model
     * @param modelName
     *            name of the domain model
     */
    private void createModel(final Resource diagramResource, final String diagramName,
            final Resource modelResource, final String modelName) {
        modelResource.setTrackingModification(true);
        EObject domainModel = createModel(modelName);
        modelResource.getContents().add(domainModel);
        diagramResource.setTrackingModification(true);
        Diagram diagram = Graphiti.getPeCreateService().createDiagram(diagramTypeName, diagramName,
                gridSize, snapToGrid);
        PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
        link.setPictogramElement(diagram);
        link.getBusinessObjects().add(domainModel);
        configureDiagram(diagram);
        diagramResource.getContents().add(diagram);
    }

    /**
     * Configure the diagram. May be overridden by subclasses.
     * 
     * @param diagram
     *            the top-level element of the pictogram model
     */
    protected void configureDiagram(final Diagram diagram) {
        // the default implementation does nothing
    }

    /**
     * Create an instance of the top-level object for the domain model.
     * 
     * @param name
     *            name of the model
     * @return an instance of the domain model object
     */
    protected abstract EObject createModel(final String name);

}