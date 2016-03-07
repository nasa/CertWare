package net.certware.argument.language.ui;

import java.io.File;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;



public class CommandUtils {

	public static final String EXTENSION_ID = "net.certware.argument.language.ui.solver";
	/** the plug-in extension point attribute for solver binary name*/
	public static final String SOLVER_ATTR_ID = "asp_solver";
	/** the plug-in extension point attribute for l to sparc translator binary name */
	public static final String L_TO_SPARC_TRANSLATOR_ATTR_ID = "l_to_sparc_translator";
	/** the plug-in extension point attribute for sparc to asp translator binary name */
	public static final String SPARC_ATTR_ID = "sparc_to_asp_translator";	

	/**the name of the current plug-in*/
	public static final String PLUGIN_ID = "net.certware.argument.language.ui";


	/**
	 * 
	 * @param IFile - a string representing file name 
	 * @return - if file name is of the form X.Y, where Y is string not containing dots, return X
	 *           otherwise return fileName
	 */
	public static String getFileNameWithoutExtension(IFile file) {
		String ext = file.getFileExtension();
	    String nameWithoutExtension = null;
	    if(ext==null) {
	    	nameWithoutExtension = file.getName();
	    } else {
	    	nameWithoutExtension = file.getName().substring(0, file.getName().length()-1-ext.length());  	
	    }
	    return nameWithoutExtension;	    
	}
	
	/**
	 * Returns the runtime program name contributed by the extension point.
	 * @return runtime name or null if no fragment contributes a runtime extension
	 */
	private static String getArtifact(String id) {
		String runtime = "";
		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EXTENSION_ID);
		for (IConfigurationElement e : config) {
			runtime = e.getAttribute(id);
		}
		return runtime;
	}


	/**
	 * Find absolute path to a given artifact
	 * @param artifactID - the id of the given artifact (declared above)
	 * @return absolute system path to the file represented by the artifact
	 */
	public static String getArtifactAbsolutePath(String artifactID) {

		try{
			URL artifactURL = new URL("platform:/plugin/" + PLUGIN_ID + "/" + getArtifact(artifactID));	
			@SuppressWarnings("deprecation")
			IPath path = new Path(Platform.asLocalURL(artifactURL).getPath());
			return  new File(path.toString()).getAbsolutePath();

		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	  
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 

	}

	/**
	 * 
	 * @param input - a file storing an L program, an input to the translator
	 * @param output - a file created to store the output of sparc solver
	 * @param sparcOutput - a file used to store the sparc program created by the translator during the process
	 */
	public static void callSolver(IFile input, IFile output, IFile sparcOutput, SolverMode mode)  {

		// 1. Find paths
		String inputFile = input.getLocation().toString();
		String outputFile = output.getLocation().toString();
		String sparcOutputFile = sparcOutput.getLocation().toString();

		String translatorPath = getArtifactAbsolutePath(L_TO_SPARC_TRANSLATOR_ATTR_ID);
		String sparcPath = getArtifactAbsolutePath(SPARC_ATTR_ID);

		// 2. we create an OS command using the paths found above and run it: 
		// path to the input file:

		try {
			// absolutePath[0] is the path to translator 	
			// absolutePath[1] is the path to sparc.jar
			ProcessBuilder trProcessBuild =  new ProcessBuilder(translatorPath, inputFile);

			File sparcOut = new File(sparcOutputFile);
			trProcessBuild.redirectOutput(sparcOut);
			Process trProcess = trProcessBuild.start();    
			trProcess.waitFor(); // wait until sparcProcess terminates
            
			ProcessBuilder spProcessBuild = null;
			if(mode == SolverMode.CHECK_SAFETY) {
			    spProcessBuild = new ProcessBuilder("java",  "-jar", sparcPath,sparcOutputFile,"-q",
					"safety_reqts_fully_realised","-solver","clingo");
			} else {
				spProcessBuild = new ProcessBuilder("java",  "-jar", sparcPath,sparcOutputFile,"-A",
		    	         "-loutput","-solver","clingo");	
			}
			File out = new File(outputFile);
			spProcessBuild.redirectOutput(out);
			String workingDirectory =sparcPath.substring(0, sparcPath.length() - getArtifact(SPARC_ATTR_ID).length());
			spProcessBuild.directory(new File(workingDirectory));
			Process spProcess = spProcessBuild.start();    	 
			spProcess.waitFor();			    	 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}


}
