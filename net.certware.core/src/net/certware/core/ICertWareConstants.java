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

	/** file extension for the AML model */
	//public static final String AML_EXTENSION = "aml"; //$NON-NLS-1$
	/** file extension for the ARM model */
	//public static final String ARM_EXTENSION = "arm"; //$NON-NLS-1$
	/** file extension for the GSN model */
	//public static final String GSN_EXTENSION = "gsn"; //$NON-NLS-1$
	/** file extension for the GSN diagram models */
	//public static final String GSZ_EXTENSION = "gsz"; //$NON-NLS-1$
	/** file extension for the GSN diagrams */
	//public static final String GSZ_DIAGRAM_EXTENSION = "gsz_diagram"; //$NON-NLS-1$
	/** file extension for the CAE model */
	//public static final String CAE_EXTENSION = "cae"; //$NON-NLS-1$
	/** file extension for the CAE diagram models */
	//public static final String CAZ_EXTENSION = "caz"; //$NON-NLS-1$
	/** file extension for the CAE diagrams */
	//public static final String CAZ_DIAGRAM_EXTENSION = "caz_diagram"; //$NON-NLS-1$
	/** file extension for the EUROCONTROL model */
	//public static final String EUR_EXTENSION = "eur"; //$NON-NLS-1$
	/** file extension for the EUROCONTROL diagram models */
	//public static final String EUZ_EXTENSION = "euz"; //$NON-NLS-1$
	/** file extension for the EUROCONTROL diagrams */
	//public static final String EUZ_DIAGRAM_EXTENSION = "euz_diagram"; //$NON-NLS-1$
	/** file extension for the verification checklist model */
	public static final String VCL_EXTENSION = "vcl"; //$NON-NLS-1$
	/** file extension for the SACM models */
	public static final String SACM_EXTENSION = "sacm"; //$NON-NLS-1$
	/** file extension for the SACM argumentation models */
	public static final String SACM_ARG_EXTENSION = "argumentation"; //$NON-NLS-1$
	/** file extension for the SACM evidence models */
	public static final String SACM_EVIDENCE_EXTENSION = "evidence"; //$NON-NLS-1$
	/** file extension for the SACM DSL models */
	public static final String SACM_DSL_EXTENSION = "sacmdsl"; //$NON-NLS-1$
	/** file extension for the SACM Diagram models */
	public static final String SACM_DIAGRAM_EXTENSION = "sacmd"; //$NON-NLS-1$
	/** file extension for the semi-formal proof model */
	public static final String SFP_EXTENSION = "sfp"; //$NON-NLS-1$
	/** file extension for the software metrics metamodel */
	public static final String SMM_EXTENSION = "smm"; //$NON-NLS-1$
	/** file extension for the Microsoft XML project interface */
	public static final String MPX_EXTENSION = "mpx"; //$NON-NLS-1$
	/** file extension for the Microsoft MSPDI project interface */
	public static final String MSPDI_EXTENSION = "mspdi"; //$NON-NLS-1$
	/** file extension for CertWare planning notation model */
	public static final String CPN_EXTENSION = "cpn"; //$NON-NLS-1$
	/** file extension for the software change order model */
	public static final String SCO_EXTENSION = "sco"; //$NON-NLS-1$
	/** file extension for the software project management model */
	public static final String SPM_EXTENSION = "spm"; //$NON-NLS-1$
	/** file extension for the STPA model */
	public static final String STPA_EXTENSION = "stpa"; //$NON-NLS-1$
	/** file extension for the intent specification model */
	public static final String INTENT_EXTENSION = "intent"; //$NON-NLS-1$
	/** file extension for the state specification model */
	public static final String STATE_EXTENSION = "state"; //$NON-NLS-1$
	/** file extension for the basic hazard model */
	public static final String HAZ_EXTENSION = "haz"; //$NON-NLS-1$
	/** file extension for word exports */
	public static final String WORD_EXTENSION = "docx"; //$NON-NLS-1$
	/** file extension for PDF exports */
	public static final String PDF_EXTENSION = "pdf"; //$NON-NLS-1$
	/** file extension for Hugin NET files */
	public static final String NET_EXTENSION = "net"; //$NON-NLS-1$
	/** file extension for Hugin evidence files */
	public static final String HEV_EXTENSION = "hev"; //$NON-NLS-1$
	/** file extension for OMG SAEM files */
	// public static final String SAEM_EXTENSION = "evidence"; //$NON-NLS-1$

	/** a list of all application file extensions */
	/* the resource label contributor uses this to identify CertWare resources */
	public static final List<String> FILE_EXTENSIONS = 
		Collections.unmodifiableList(Arrays.asList(
		//		AML_EXTENSION,ARM_EXTENSION,
		//		GSN_EXTENSION,GSZ_EXTENSION,GSZ_DIAGRAM_EXTENSION,
		//		CAE_EXTENSION,CAZ_EXTENSION,CAZ_DIAGRAM_EXTENSION,
		//		EUR_EXTENSION,EUZ_EXTENSION,EUZ_DIAGRAM_EXTENSION,
		//		SAEM_EXTENSION, 
				SACM_EXTENSION, SACM_ARG_EXTENSION, SACM_EVIDENCE_EXTENSION, 
				SACM_DSL_EXTENSION, SACM_DIAGRAM_EXTENSION,
				VCL_EXTENSION, SFP_EXTENSION, SMM_EXTENSION, MPX_EXTENSION, MSPDI_EXTENSION,
				CPN_EXTENSION, SCO_EXTENSION, SPM_EXTENSION,
				SFP_EXTENSION,
				NET_EXTENSION, HEV_EXTENSION,
				INTENT_EXTENSION, STPA_EXTENSION, HAZ_EXTENSION, STATE_EXTENSION
				));
	
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
