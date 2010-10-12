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
	public static final String ARM_EXTENSION = "arm"; //$NON-NLS-1$
	/** file extension for the GSN model */
	public static final String GSN_EXTENSION = "gsn"; //$NON-NLS-1$
	/** file extension for the CAE model */
	public static final String CAE_EXTENSION = "cae"; //$NON-NLS-1$
	/** file extension for the EUROCONTROL model */
	public static final String EUR_EXTENSION = "eur"; //$NON-NLS-1$
	/** file extension for the verification checklist model */
	public static final String VCL_EXTENSION = "vcl"; //$NON-NLS-1$

	/** a list of all application file extensions */
	public static final List<String> FILE_EXTENSIONS = 
		Collections.unmodifiableList(Arrays.asList(ARM_EXTENSION,GSN_EXTENSION,CAE_EXTENSION,EUR_EXTENSION,VCL_EXTENSION));
	
	public static final String CONFIG_PARAMETER = "config";	//$NON-NLS-1$
	public static final String ID_PARAMETER = "id";	 //$NON-NLS-1$
	public static final String CONTENT_TYPE_PLAIN = "text/plain"; //$NON-NLS-1$
	public static final String CONTENT_TYPE_HTML = "text/html"; //$NON-NLS-1$
	public static final String MISSING_PARAMETER = "Missing parameter: ";
	public static final String ID_PROPERTY = "certware.id"; //$NON-NLS-1$
	public static final String ID_DEFAULT = "ABC123";
	public static final String BACK_END_URL_PROPERTY = "certware.backend.url";
	public static final String BACK_END_URL_DEFAULT = "http://localhost:8080/certware";
	public static final String BACKEND_SERVLET_CONTAINER_DEFAULT = "";
	public static final String BACKEND_SERVLET_CONTAINER_PROPERTY = "certware.backend.servlet.container";

}
