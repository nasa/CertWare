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
	public static final String ARM_EXTENSION = "arm";
	/** file extension for the GSN model */
	public static final String GSN_EXTENSION = "gsn";
	/** file extension for the CAE model */
	public static final String CAE_EXTENSION = "cae";

	/** a list of all application file extensions */
	public static final List<String> FILE_EXTENSIONS = 
		Collections.unmodifiableList(Arrays.asList(ARM_EXTENSION,GSN_EXTENSION,CAE_EXTENSION));

}
