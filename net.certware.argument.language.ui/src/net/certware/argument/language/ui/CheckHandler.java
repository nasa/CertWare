
package net.certware.argument.language.ui;

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;


public class CheckHandler extends AbstractHandler {
	
	
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
	   
    
	    // figure out input file 
	    IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
	    IFile inputFile = input.getFile();
	    
	    // create output file handle
	    String nameWithoutExtension = CommandUtils.getFileNameWithoutExtension(inputFile);
	    IProject project = inputFile.getProject();
	    IFile outputFile = project.getFile(nameWithoutExtension + ".q"); 
	    IFile sparcOutputFile = project.getFile(nameWithoutExtension + ".sp");
	    	    
	    // call the solver
	    CommandUtils.callSolver(inputFile,outputFile, sparcOutputFile, SolverMode.CHECK_SAFETY);
	    
   	     // read output file and produce message box:
     	 Scanner in=null;
		try {
			in = new Scanner(outputFile.getRawLocation().makeAbsolute().toFile());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
   	     String reply = in.nextLine();
   	     if(reply.equals("yes")) {
   		     JOptionPane.showMessageDialog(null, "System safety requirements are met.");    					 
   	     } else {
   		     JOptionPane.showMessageDialog(null, "System Safety requirements are NOT met");
   	     }
   	     in.close();
   	 
   	     // remove auxiliary files
     	 try {
		 	outputFile.delete(true, false, null);
	   	    sparcOutputFile.delete(true, false, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
  }
}
  
    
  




