
package net.certware.sacm.graphiti.wizard;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * Wizard page to create diagram or model files.
 * 
 * @author msp
 */
public class CreationWizardPage extends WizardNewFileCreationPage {

    /** the file extension to use for this wizard page. */
    private String extension;
    
    /**
     * Creates a page with given settings.
     * 
     * @param pageName the name of the page
     * @param selection the current resource selection
     * @param theextension the file extension
     */
    public CreationWizardPage(final String pageName, final IStructuredSelection selection,
            final String theextension) {
        super(pageName, selection);
        this.extension = theextension;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void createControl(final Composite parent) {
        super.createControl(parent);
        setPageComplete(true);
    }

    /**
     * Creates a URI for the selected file path.
     * 
     * @return a URI for the file
     */
    public URI getURI() {
        IPath path = getContainerFullPath();
        if (path == null) {
            path = new Path("");
        }
        String fileName = getFileName();
        if (fileName == null || fileName.length() == 0) {
            fileName = copyFileName();
        }
        path = path.append(getUniqueFileName(path, fileName, extension));
        return URI.createPlatformResourceURI(path.toString(), false);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setVisible(final boolean visible) {
        if (visible && (getFileName() == null || getFileName().length() == 0)) {
            setFileName(getUniqueFileName(getContainerFullPath(), copyFileName(), extension));
        }
        super.setVisible(visible);
    }
    
    private String copyFileName() {
        String fileName = null;
        IWizardPage previousPage = getPreviousPage();
        if (previousPage instanceof CreationWizardPage) {
            CreationWizardPage copyPage = (CreationWizardPage) previousPage;
            fileName = copyPage.getFileName();
            if (fileName.endsWith(copyPage.extension)) {
                fileName = fileName.substring(0, fileName.length()
                        - (copyPage.extension.length() + 1));
            }
        }
        return fileName;
    }

    /**
     * Creates a unique file name.
     * 
     * @param containerFullPath the container full path, or {@code null}
     * @param fileName the initial file name, or {@code null}
     * @param extension the required file extension
     * @return a unique file name
     */
    private static String getUniqueFileName(final IPath containerFullPath, final String fileName,
            final String extension) {
        IPath contPath = containerFullPath == null ? new Path("") : containerFullPath;
        String name = (fileName == null || fileName.trim().length() == 0) ? "default" : fileName;
        IPath filePath = contPath.append(name);
        if (extension.equals(filePath.getFileExtension())) {
            name = name.substring(0, name.length() - (extension.length() + 1));
        } else {
            filePath = filePath.addFileExtension(extension);
        }
        IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        if (workspaceRoot.exists(filePath)) {
            int x = getNumber(name);
            if (x >= 0) {
                name = name.substring(0, name.length() - digits(x));
            } else {
                x = 0;
            }
            do {
                x++;
                String newName = name + x + "." + extension;
                filePath = filePath.append(newName);
            } while (workspaceRoot.exists(filePath));
        }
        return filePath.lastSegment();
    }
    
    /**
     * Returns the greatest number that is a suffix of the given string.
     * 
     * @param string a string
     * @return a suffix number, of -1 if the string has no such suffix
     */
    private static int getNumber(final String string) {
        int index = string.length();
        while (index > 0 && Character.isDigit(string.charAt(index - 1))) {
            index--;
        }
        if (index < string.length()) {
            try {
                return Integer.parseInt(string.substring(index));
            } catch (NumberFormatException exception) {
                // ignore exception and return 0
            }
        }
        return -1;
    }
    
    /** the base for integer numbers. */
    private static final int BASE = 10;
    
    /**
     * Returns the number of digits of a number.
     * 
     * @param x an integer number
     * @return the number of digits of x
     */
    private static int digits(final int x) {
        int digits = 1;
        int a = x;
        while (a >= BASE) {
            a /= BASE;
            digits++;
        }
        return digits;
    }
    
}