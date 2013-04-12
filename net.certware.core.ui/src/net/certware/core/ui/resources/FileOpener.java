package net.certware.core.ui.resources;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;


/**
 * File opener utility.
 * @author mrb
 * @since 1.0.3
 */
public class FileOpener
{
	/**
	 * Finds an editor for a file and opens the file.
	 * @param ifile file to open
	 * @return editor or null
	 */
	public static IEditorPart findResourceEditor(IFile ifile) {
		if ( ifile != null ) {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorDescriptor desc = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(ifile.getName());
			try {
				return page.openEditor(new FileEditorInput(ifile), desc.getId());
			}
			catch (PartInitException e)	{
				CertWareLog.logError(String.format("%s %s","Opening editor for",ifile),e);
			}
		}
		return null;
	}

	/**
	 * Finds a resource by name, finds its editor, opens its editor, and positions the document at the given line number.
	 * @param fileName file name to find using <code>FileFinder</code>
	 * @param lineNumber line number in document, where bad locations are caught and written to given log
	 */
	public static void editAtLineNumber(String fileName, int lineNumber) {
		IFile myFile = FileFinder.findResourceByName(fileName);
		IEditorPart iep = FileOpener.findResourceEditor(myFile);
		if ( iep != null ) {
			if (iep instanceof ITextEditor) {
				ITextEditor textEditor = (ITextEditor) iep ;
				IDocumentProvider idp = textEditor.getDocumentProvider();
				IDocument document = idp.getDocument(textEditor.getEditorInput());
				try {
					textEditor.selectAndReveal(document.getLineOffset(lineNumber - 1), document.getLineLength(lineNumber - 1));
				} catch (BadLocationException ble) { // $codepro.audit.disable logExceptions
					CertWareLog.logWarning(String.format("%s %s:%d","Opening line number for",fileName,lineNumber));
				}
			}
		}
	}

}
