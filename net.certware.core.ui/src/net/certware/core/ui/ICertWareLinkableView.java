package net.certware.core.ui;

public interface ICertWareLinkableView {

	/**
	 * Sets whether the view is linked with the editor.
	 * See core commands and handlers for implementation.
	 * @param b true if view should be linking the editor
	 */
	void setLinkingEditor(boolean b);

}
