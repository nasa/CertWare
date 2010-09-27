/**
 * 
 */
package net.certware.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Miscellaneous application-wide constants.
 * Intended to minimize the number of imported plugins.
 * @author mrb
 */
public interface ICertWareConstants {

	/** file extension for the ARM model */
	static final String ARM_EXTENSION = "arm"; //$NON-NLS-1$
	/** file extension for the GSN model */
	static final String GSN_EXTENSION = "gsn"; //$NON-NLS-1$
	/** file extension for the CAE model */
	static final String CAE_EXTENSION = "cae"; //$NON-NLS-1$
	/** file extension for the EUROCONTROL model */
	static final String EUR_EXTENSION = "eur"; //$NON-NLS-1$
	/** file extension for the verification checklist model */
	static final String VCL_EXTENSION = "vcl"; //$NON-NLS-1$

	/** a list of all application file extensions */
	static final List<String> FILE_EXTENSIONS = 
		Collections.unmodifiableList(Arrays.asList(ARM_EXTENSION,GSN_EXTENSION,CAE_EXTENSION,EUR_EXTENSION,VCL_EXTENSION));

}
