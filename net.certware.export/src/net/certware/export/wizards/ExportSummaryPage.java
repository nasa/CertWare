/**
 * CertWare Project
 * Copyright (c) 2010 National Aeronautics and Space Administration.  All rights reserved.
 * Original source from IBM data transfer internal package
 */
package net.certware.export.wizards;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import net.certware.core.ui.log.CertWareLog;
import net.certware.export.jobs.ExportResourceOperation;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.dialogs.WizardExportResourcesPage;

/**
 * Wizard page for selecting source files for export to destination file.
 * This class differs from its original data transfer internal class by the operation applied to the selections.
 * @author mrb
 */
public class ExportSummaryPage extends  WizardExportResourcesPage implements Listener { // $codepro.audit.disable declareDefaultConstructors

	/** destination name field widget */
    private Combo destinationNameField;
    /** destination browse button widget */
    private Button destinationBrowseButton;
    /** overwrite existing files check box widget */
    protected Button overwriteExistingFilesCheckbox;
    /** create directory structure button widget */
    protected Button createDirectoryStructureButton;
    /** create selection only button widget */
    protected Button createSelectionOnlyButton;
    /** store key for destination names */
    private static final String STORE_DESTINATION_NAMES_ID = "ExportSummaryPage.STORE_DESTINATION_NAMES_ID"; //$NON-NLS-1$
    /** store key for overwrite exiting files */
    private static final String STORE_OVERWRITE_EXISTING_FILES_ID = "ExportSummaryPage.STORE_OVERWRITE_EXISTING_FILES_ID"; //$NON-NLS-1$
    /** store key for create structure */
    private static final String STORE_CREATE_STRUCTURE_ID = "ExportSummaryPage.STORE_CREATE_STRUCTURE_ID"; //$NON-NLS-1$
    /** select destination message */
    private static final String SELECT_DESTINATION_MESSAGE = "Select destination";
    /** dialog title for destination message */
    private static final String SELECT_DESTINATION_TITLE = "Select Destination";
    /** empty directory names list */
    private static final String[] EMPTY_DIRECTORY_NAMES = new String[0];
    
    /**
     *  Create an instance of this class.
     *  @param name wizard name
     *  @param selection selection for wizard reference
     */
    protected ExportSummaryPage(String name, IStructuredSelection selection) {
        super(name, selection);
    }

    /**
     * Create an instance of this class.
     * @param selection selection for wizard reference
     */
    public ExportSummaryPage(IStructuredSelection selection) {
        this("fileSystemExportPage1", selection); //$NON-NLS-1$
        setTitle("Export to Document");
        setDescription("Translates the results file to a document file in the local file system.");
    }

    /**
     *  Add the passed value to self's destination widget's history
     *  @param value destination name
     */
    protected void addDestinationItem(String value) {
        destinationNameField.add(value);
    }

    /** 
     * Create the control for the page.
     * Calls super class then gives focus to the destination.
     * Method declared on IDialogPage.
     * @param parent control parent
    
     * @see org.eclipse.jface.dialogs.IDialogPage#createControl(Composite) */
    public void createControl(Composite parent) {
        super.createControl(parent);

        giveFocusToDestination();
        /*
        PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(),
                IDataTransferHelpContextIds.FILE_SYSTEM_EXPORT_WIZARD_PAGE);
        */
    }

    /**
     *  Create the export destination specification widgets
     *  @param parent destination parent
     */
    protected void createDestinationGroup(Composite parent) {

        final Font font = parent.getFont();
        // destination specification group
        final Composite destinationSelectionGroup = new Composite(parent, SWT.NONE);
        final GridLayout layout = new GridLayout();
        layout.numColumns = 3; // $codepro.audit.disable numericLiterals
        destinationSelectionGroup.setLayout(layout);
        destinationSelectionGroup.setLayoutData(new GridData(
                GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL));
        destinationSelectionGroup.setFont(font);

        final Label destinationLabel = new Label(destinationSelectionGroup, SWT.NONE);
        destinationLabel.setText(getDestinationLabel());
        destinationLabel.setFont(font);

        // destination name entry field
        destinationNameField = new Combo(destinationSelectionGroup, SWT.SINGLE | SWT.BORDER);
        destinationNameField.addListener(SWT.Modify, this);
        destinationNameField.addListener(SWT.Selection, this);
        final GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        destinationNameField.setLayoutData(data);
        destinationNameField.setFont(font);

        // destination browse button
        destinationBrowseButton = new Button(destinationSelectionGroup, SWT.PUSH);
        destinationBrowseButton.setText("Browse...");
        destinationBrowseButton.addListener(SWT.Selection, this);
        destinationBrowseButton.setFont(font);
        setButtonLayoutData(destinationBrowseButton);

        new Label(parent, SWT.NONE); // vertical spacer
    }

    /**
     * Create the buttons in the options group.
     * @param optionsGroup Group
     */
    protected void createOptionsGroupButtons(Group optionsGroup) {

        final Font font = optionsGroup.getFont();
        createOverwriteExisting(optionsGroup, font);

        createDirectoryStructureOptions(optionsGroup, font);
    }

    /**
     * Create the buttons for the group that determine if the entire or
     * selected directory structure should be created.
     * @param optionsGroup group for related options
     * @param font text font for buttons
     */
    protected void createDirectoryStructureOptions(Composite optionsGroup, Font font) {
        // create directory structure radios
        createDirectoryStructureButton = new Button(optionsGroup, SWT.RADIO | SWT.LEFT);
        createDirectoryStructureButton.setText("Create directory structure");
        createDirectoryStructureButton.setSelection(false);
        createDirectoryStructureButton.setFont(font);

        // create directory structure radios
        createSelectionOnlyButton = new Button(optionsGroup, SWT.RADIO | SWT.LEFT);
        createSelectionOnlyButton.setText("Create selected directories");
        createSelectionOnlyButton.setSelection(true);
        createSelectionOnlyButton.setFont(font);
    }

    /**
     * Create the button for checking if we should ask if we are going to
     * overwrite existing files.
     * @param optionsGroup group for related options
     * @param font buttons text font
     */
    protected void createOverwriteExisting(Group optionsGroup, Font font) {
        // overwrite... check box
        overwriteExistingFilesCheckbox = new Button(optionsGroup, SWT.CHECK | SWT.LEFT);
        overwriteExistingFilesCheckbox.setText("Overwrite existing files");
        overwriteExistingFilesCheckbox.setFont(font);
    }

    /**
     * Attempts to ensure that the specified directory exists on the local file system.
     * Answers a boolean indicating success.
     * @param directory directory to confirm
    
     * @return true if directory exists, or does not exist and user chooses to create it  */
    protected boolean isExistingDirectory(File directory) {
        if (!directory.exists()) {
            if (!queryYesNoQuestion("Create target directory?")) {
                return false;
            }

            if (!directory.mkdirs()) {
                displayErrorDialog("Error creating directory");
                giveFocusToDestination();
                return false;
            }
        }

        return true;
    }

    /**
     *  If the target for export does not exist then attempt to create it.
     *  Answer a boolean indicating whether the target exists (i.e.- if it either already exists
     *  or this method was able to create it).
     *  
     * @param targetDirectory File
    @return false if target is invalid or does not exist, true otherwise */
    protected boolean isValidTarget(File targetDirectory) {
        if (targetDirectory.exists() && !targetDirectory.isDirectory()) {
            displayErrorDialog("Target is invalid");
            giveFocusToDestination();
            return false;
        }

        return isExistingDirectory(targetDirectory);
    }

    /**
     *  Set up and execute the passed Operation.  Answer a boolean indicating success.
     *  @param op operation to perform for export
     *  
    @return true if successful */
    protected boolean canExportOperation(ExportResourceOperation op) {
        op.setCreateLeadupStructure(createDirectoryStructureButton.getSelection());
        op.setOverwriteFiles(overwriteExistingFilesCheckbox.getSelection());

        try {
            getContainer().run(true, true, op);
        } catch (InterruptedException e) { // $codepro.audit.disable logExceptions
            return false;
        } catch (InvocationTargetException e) {
            displayErrorDialog(e.getTargetException());
            return false;
        }

        final IStatus status = op.getStatus();
        if (!status.isOK()) {
            ErrorDialog.openError(getContainer().getShell(),
              "Problems during export",
                    null, // no special message
                    status);
            return false;
        }

        return true;
    }
    
    /**
     * The Finish button was pressed.  Try to do the required work now and answer
     * a boolean indicating success.  If false is returned then the wizard will not close.
     * @return boolean false if target invalid or export operation fails  
     */
    @SuppressWarnings("unchecked")
    public boolean finish() { // $codepro.audit.disable booleanMethodNamingConvention
      
        final List<IResource> resourcesToExport = getWhiteCheckedResources();
        if (!isValidTarget(new File(getDestinationValue()))) {
            return false;
        }


        //Save dirty editors if possible but do not stop if not all are saved
        saveDirtyEditors();

        // about to invoke the operation so save our state
        saveWidgetValues();

        return canExportOperation(new ExportResourceOperation(null,
                resourcesToExport, getDestinationValue(), this));
    }

    /**
     *  Answer the string to display in self as the destination type
     *  
    @return java.lang.String */
    protected String getDestinationLabel() {
        return "Export to directory";
    }

    /**
     *  Answer the contents of self's destination specification widget
     *  
    @return java.lang.String */
    protected String getDestinationValue() {
        return destinationNameField.getText().trim();
    }

    /**
     *  Set the current input focus to self's destination entry field
     */
    protected void giveFocusToDestination() {
        destinationNameField.setFocus();
    }

    /**
     *  Open an appropriate destination browser so that the user can specify a source
     *  to import from
     */
    protected void handleDestinationBrowseButtonPressed() {
        final DirectoryDialog dialog = new DirectoryDialog(getContainer().getShell(), SWT.SAVE);
        dialog.setMessage(SELECT_DESTINATION_MESSAGE);
        dialog.setText(SELECT_DESTINATION_TITLE);
        dialog.setFilterPath(getDestinationValue());
        final String selectedDirectoryName = dialog.open();

        if (null != selectedDirectoryName) {
            setErrorMessage(null);
            setDestinationValue(selectedDirectoryName);
        }
    }

    /**
     * Handle all events and enablements for widgets in this page
     * @param e event to handle
    
     * @see org.eclipse.swt.widgets.Listener#handleEvent(Event) */
    public void handleEvent(Event e) {
        final Widget source = e.widget;

        if (destinationBrowseButton.equals(source)) {
            handleDestinationBrowseButtonPressed();
        }

        updatePageCompletion();
    }

    /**
     *  Hook method for saving widget values for restoration by the next instance
     *  of this class.
     */
    protected void internalSaveWidgetValues() {
        // update directory names history
        final IDialogSettings settings = getDialogSettings();
        if (null != settings) {
            String[] directoryNames = settings
                    .getArray(STORE_DESTINATION_NAMES_ID);
            if (null == directoryNames) {
                directoryNames = EMPTY_DIRECTORY_NAMES;
            }

            directoryNames = addToHistory(directoryNames, getDestinationValue());
            settings.put(STORE_DESTINATION_NAMES_ID, directoryNames);

            // options
            settings.put(STORE_OVERWRITE_EXISTING_FILES_ID,
                    overwriteExistingFilesCheckbox.getSelection());

            settings.put(STORE_CREATE_STRUCTURE_ID,
                    createDirectoryStructureButton.getSelection());

        }
    }

    /**
     *  Hook method for restoring widget values to the values that they held
     *  last time this wizard was used to completion.
     */
    protected void restoreWidgetValues() {
        final IDialogSettings settings = getDialogSettings();
        if (null != settings) {
            final String[] directoryNames = settings
                    .getArray(STORE_DESTINATION_NAMES_ID);
            if (null == directoryNames) {
                return; // ie.- no settings stored
            }

            // destination
            setDestinationValue(directoryNames[0]);
            for (int i = 0; i < directoryNames.length; i++) {
                addDestinationItem(directoryNames[i]);
            }

            // options
            overwriteExistingFilesCheckbox.setSelection(settings
                    .getBoolean(STORE_OVERWRITE_EXISTING_FILES_ID));

            boolean createDirectories = settings
                    .getBoolean(STORE_CREATE_STRUCTURE_ID);
            createDirectoryStructureButton.setSelection(createDirectories);
            createSelectionOnlyButton.setSelection(!createDirectories);
        }
    }

    /**
     *  Set the contents of the receivers destination specification widget to
     *  the passed value
     *
     * @param value String
     */
    protected void setDestinationValue(String value) {
        destinationNameField.setText(value);
    }

    /**
     *  Answer a boolean indicating whether the receivers destination specification
     *  widgets currently all contain valid values.
    
     * @return boolean */
    protected boolean validateDestinationGroup() {
        final String destinationValue = getDestinationValue();
        if (0 == destinationValue.length()) {
            setMessage(destinationEmptyMessage());
            return false;
        }

        final String conflictingContainer = getConflictingContainerNameFor(destinationValue);
        if (null == conflictingContainer) {
            // no error message, but warning may exists
            final String threatenedContainer = getOverlappingProjectName(destinationValue);
            if (null == threatenedContainer) {
                setMessage(null);
            }
            else {
                setMessage("Potential conflicting container",  WARNING);
            }
            
        } else {
            setErrorMessage("Conflicting container");
            giveFocusToDestination();
            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.dialogs.WizardDataTransferPage#validateSourceGroup()
     */
    /**
     * Method validateSourceGroup.
    
     * @return boolean */
    protected boolean validateSourceGroup() {
        // there must be some resources selected for Export
        boolean isValid = true;
        @SuppressWarnings("unchecked")
		final List<IResource> resourcesToExport = getWhiteCheckedResources();
        if (0 == resourcesToExport.size()){
            setErrorMessage("No files selected");
            isValid =  false;
        } else {
            setErrorMessage(null);
        }
        return super.validateSourceGroup() && isValid;
    }

    /**
     * Get the message used to denote an empty destination.
    
     * @return String */
    protected String destinationEmptyMessage() {
        return "Empty destination";
    }

    /**
     * Returns the name of a container with a location that encompasses targetDirectory.
     * Returns null if there is no conflict.
     * 
     * @param targetDirectory the path of the directory to check.
    
     * @return the conflicting container name or <code>null */
    protected String getConflictingContainerNameFor(String targetDirectory) {

        final IPath rootPath = ResourcesPlugin.getWorkspace().getRoot().getLocation();
        final IPath testPath = new Path(targetDirectory);
        // cannot export into workspace root
        if(testPath.equals(rootPath)) {
            return rootPath.lastSegment();
        }
        
        //Are they the same?
        if(testPath.matchingFirstSegments(rootPath) == rootPath.segmentCount()){
            final String firstSegment = testPath.removeFirstSegments(rootPath.segmentCount()).segment(0);
            if(!Character.isLetterOrDigit(firstSegment.charAt(0))) {
                return firstSegment;
            }
        }

        return null;

    }
    
    /**
     * Returns the name of a {@link IProject} with a location that includes
     * targetDirectory. Returns null if there is no such {@link IProject}.
     * @param targetDirectory the path of the directory to check.
    
     * @return the overlapping project name or <code>null */
    private String getOverlappingProjectName(String targetDirectory){
        final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//        IPath testPath = new Path(targetDirectory);
//        IContainer[] containers = root.findContainersForLocation(testPath);
        final IContainer[] containers;
        try {
          containers = root.findContainersForLocationURI(new URI(targetDirectory));
        }
        catch (URISyntaxException e) {
          CertWareLog.logError("Exporting resource", e);
          return null;
        }
        catch(IllegalArgumentException e) {
        	// not a workspace absolute location
        	return null;
        }
        
        if(containers.length > 0){
            return containers[0].getProject().getName();
        }
        
        return null;
    }
    

}