
package net.certware.argument.language.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;


public class SolveHandler extends AbstractHandler {

	
  /**
   * When a user clicks on the button from a context menu of a given input L file,
   * 1. call the solver on the file and store the output in the file with same name 
   *    and .result extension 
   * 2. open an editor on the resulting file   	
   */
  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
	   
		
	    IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
	    IWorkbenchPage activePage = window.getActivePage();
	    IEditorPart editor = activePage.getActiveEditor();
	    IWorkbench workbench= HandlerUtil.getActiveWorkbenchWindow(event).getWorkbench();
    
	    // figure out input file 
	    IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
	    IFile inputFile = input.getFile();
	    
	    // create output file handle
	    String nameWithoutExtension = CommandUtils.getFileNameWithoutExtension(inputFile);
	    IProject project = inputFile.getProject();
	    IFile outputFile = project.getFile(nameWithoutExtension + ".result"); 
	    IFile sparcOutputFile = project.getFile(nameWithoutExtension + ".sp");
	    
	    
	 	CommandUtils.callSolver(inputFile,outputFile, sparcOutputFile, SolverMode.COMPUTE_MODELS);
	    
	    // open the default editor on the resulting file
        try
        {
          activePage.openEditor
            (new FileEditorInput(outputFile),
             workbench.getEditorRegistry().getDefaultEditor(outputFile.getFullPath().toString()).getId());
        }
        catch (PartInitException exception)
        {
        	//TODO
        }
        // remove auxiliary files
    	 try {
		    sparcOutputFile.delete(true, false, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
}
  
    
  
}



