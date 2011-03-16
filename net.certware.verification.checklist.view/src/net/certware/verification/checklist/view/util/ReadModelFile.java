package net.certware.verification.checklist.view.util;

import net.certware.core.ui.log.CertWareLog;
import net.certware.verification.checklist.Checklist;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;


/**
 * Reads the results file using the model package loader. 
 * @author mrb
 * @since 1.2.1
 */
public class ReadModelFile
{

	/**
	 * Reads checklist content from given resource file.  Uses EMF resource loaders.
	 * @param ifile file to read
	 * @return results object from document root  
	 */
	static public Checklist readChecklist(final IFile ifile) {

		// load the XML file through the EMF resource set implementation
		try {
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(ifile.getFullPath().toString(), true), true);
			Checklist checklist = (Checklist)resource.getContents().get(0);
			return checklist;
		} catch( Exception e ) {
			CertWareLog.logWarning(String.format("%s %s","Loading checklist resource",ifile.getName()));
			return null;
		}
	}
}
