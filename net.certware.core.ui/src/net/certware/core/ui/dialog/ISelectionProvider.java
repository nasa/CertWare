package net.certware.core.ui.dialog;


import org.eclipse.core.resources.IContainer;

interface ISelectionProvider extends ISelectionValidator {
        public IContainer getRoot();
}