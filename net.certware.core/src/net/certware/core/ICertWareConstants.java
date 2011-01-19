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
	/** file extension for the semi-formal proof model */
	public static final String SFP_EXTENSION = "sfp"; //$NON-NLS-1$
	/** file extension for the software metrics metamodel */
	public static final String SMM_EXTENSION = "smm"; //$NON-NLS-1$
	/** file extension for the Microsoft project interface */
	public static final String MPX_EXTENSION = "mpx"; //$NON-NLS-1$
	/** file extension for CertWare planning notation model */
	public static final String CPN_EXTENSION = "cpn"; //$NON-NLS-1$

	/** a list of all application file extensions */
	public static final List<String> FILE_EXTENSIONS = 
		Collections.unmodifiableList(Arrays.asList(ARM_EXTENSION,GSN_EXTENSION,CAE_EXTENSION,EUR_EXTENSION,VCL_EXTENSION,
				SFP_EXTENSION,SMM_EXTENSION,MPX_EXTENSION,CPN_EXTENSION));
	
	/** backend configuration parameter tag */
	public static final String CONFIG_PARAMETER = "config";	//$NON-NLS-1$
	/** backend id parameter */
	public static final String ID_PARAMETER = "id";	 //$NON-NLS-1$
	/** backend content type  for plain */
	public static final String CONTENT_TYPE_PLAIN = "text/plain"; //$NON-NLS-1$
	/** backend content type for HTML */
	public static final String CONTENT_TYPE_HTML = "text/html"; //$NON-NLS-1$
	/** message for missing parameter */
	public static final String MISSING_PARAMETER = "Missing parameter: ";
	/** property ID tag */
	public static final String ID_PROPERTY = "certware.id"; //$NON-NLS-1$
	/** default ID tag */
	public static final String ID_DEFAULT = "ABC123";
	/** backend URL property */
	public static final String BACK_END_URL_PROPERTY = "certware.backend.url";
	/** backend URL default value */
	public static final String BACK_END_URL_DEFAULT = "http://localhost:8080/certware";
	/** backend servlet container default */
	public static final String BACKEND_SERVLET_CONTAINER_DEFAULT = "";
	/** backend servlet container property */
	public static final String BACKEND_SERVLET_CONTAINER_PROPERTY = "certware.backend.servlet.container";

}
