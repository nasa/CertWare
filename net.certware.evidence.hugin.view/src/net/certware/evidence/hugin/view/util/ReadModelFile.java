package net.certware.evidence.hugin.view.util;

import net.certware.core.ui.log.CertWareLog;

import org.eclipse.core.resources.IFile;

import edu.ucla.belief.BeliefNetwork;
import edu.ucla.belief.io.NetworkIO;


/**
 * Reads the network file into an object.
 * @author mrb
 * @since 1.2.1
 */
public class ReadModelFile
{
	/**
	 * Reads network model content from given resource file.  Uses inference library reader.
	 * @param ifile file to read
	 * @return results object from document root  
	 */
	static public BeliefNetwork readNetwork(final IFile ifile) {

		// load the XML file through the EMF resource set implementation
		try {
			// BeliefNetwork network = NetworkIO.readHuginNet(ifile.getContents());
			BeliefNetwork network = NetworkIO.read(ifile.getLocation().toPortableString());
			return network;
		} catch( Exception e ) {
			CertWareLog.logWarning(String.format("%s %s","Loading network resource",ifile.getName()));
			return null;
		}
	}

}
