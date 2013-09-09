package net.certware.core.ui.dialog;

import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.dialogs.DialogTray;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.window.WindowManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

public class ResourceSelectionDialog2 implements ISelectionProvider {

	private ResourceSelectionDialog fDialog;
	private ISelectionValidator fValidator = null;
	private IContainer fRoot;

	public ResourceSelectionDialog2(Shell parentShell, IAdaptable rootElement, String message) {
		IAdaptable adaptable = ResourceDelegates.createAdaptable(rootElement, this);
		fDialog = new ResourceSelectionDialog(parentShell, adaptable, message);
		fRoot = (IContainer) adaptable ;
	}

	public void setValidator(ISelectionValidator validator) {
		this.fValidator  = validator;
	}
	
	public IContainer getRoot() {
		return fRoot;
	}

	public void checkStateChanged(CheckStateChangedEvent event) {
		fDialog.checkStateChanged(event);
	}

	public boolean close() {
		return fDialog.close();
	}

	public void closeTray() throws IllegalStateException {
		fDialog.closeTray();
	}

	public void create() {
		fDialog.create();
	}

	public boolean equals(Object obj) {
		if (obj instanceof ResourceSelectionDialog2)
			return fDialog.equals(((ResourceSelectionDialog2)obj).fDialog);
		else if (obj instanceof ResourceSelectionDialog)
			return fDialog.equals(obj);
		return fDialog.equals(obj);
	}

	public Button getOkButton() {
		return fDialog.getOkButton();
	}

	public Object[] getResult() {
		return fDialog.getResult();
	}

	public int getReturnCode() {
		return fDialog.getReturnCode();
	}

	public Shell getShell() {
		return fDialog.getShell();
	}

	public DialogTray getTray() {
		return fDialog.getTray();
	}

	public WindowManager getWindowManager() {
		return fDialog.getWindowManager();
	}

	public int hashCode() {
		return fDialog.hashCode();
	}

	public boolean isHelpAvailable() {
		return fDialog.isHelpAvailable();
	}

	public int open() {
		return fDialog.open();
	}

	public void openTray(DialogTray tray) throws IllegalStateException, UnsupportedOperationException {
		fDialog.openTray(tray);
	}

	public void setBlockOnOpen(boolean shouldBlock) {
		fDialog.setBlockOnOpen(shouldBlock);
	}

	public void setDialogBoundsSettings(IDialogSettings settings, int strategy) {
		fDialog.setDialogBoundsSettings(settings, strategy);
	}

	public void setHelpAvailable(boolean helpAvailable) {
		fDialog.setHelpAvailable(helpAvailable);
	}

	public void setInitialElementSelections(List<?> selectedElements) {
		fDialog.setInitialElementSelections(selectedElements);
	}

	public void setInitialSelections(Object[] selectedElements) {
		fDialog.setInitialSelections(selectedElements);
	}

	public void setMessage(String message) {
		fDialog.setMessage(message);
	}

	public void setTitle(String title) {
		fDialog.setTitle(title);
	}

	public void setWindowManager(WindowManager manager) {
		fDialog.setWindowManager(manager);
	}

	public String toString() {
		return fDialog.toString();
	}

	public boolean isValid(IResource resource) {
		if (fValidator == null)
			return true ;
		return fValidator.isValid(resource);
	}
}