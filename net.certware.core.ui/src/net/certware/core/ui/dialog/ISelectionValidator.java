package net.certware.core.ui.dialog;


import org.eclipse.core.resources.IResource;

public interface ISelectionValidator {
        public boolean isValid(IResource resource);
}