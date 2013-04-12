package net.certware.example;

/**
 * CertWare examples contribution interface.
 * @author mrb
 * @since 1.0
 */
public interface IExampleContribution {
	/** extension point name space */
	final String EXAMPLE_EXTENSION = "net.certware.example"; //$NON-NLS-1$
	/** extension point element key for patterns */
	final String EXAMPLE_ELEMENT_PATTERN = "pattern"; //$NON-NLS-1$
	/** extension point element key for documents */
	final String EXAMPLE_ELEMENT_DOCUMENT = "document"; //$NON-NLS-1$
	/** extension point element key for check lists */
	final String EXAMPLE_ELEMENT_CHECKLIST = "checklist"; //$NON-NLS-1$

	/** extension point attribute key for applicability */
	final String EXAMPLE_ATTR_APPLICABILITY = "applicability"; //$NON-NLS-1$
	/** extension point attribute key for author */
	final String EXAMPLE_ATTR_AUTHOR = "author"; //$NON-NLS-1$
	/** extension point attribute key for consequences */
	final String EXAMPLE_ATTR_CONSEQUENCES = "consequences"; //$NON-NLS-1$
	/** extension point attribute key for implementation */
	final String EXAMPLE_ATTR_IMPLEMENTATION = "implementation"; //$NON-NLS-1$
	/** extension point attribute key for intent */
	final String EXAMPLE_ATTR_INTENT = "intent"; //$NON-NLS-1$
	/** extension point attribute key for motivation */
	final String EXAMPLE_ATTR_MOTIVATION = "motivation"; //$NON-NLS-1$
	/** extension point attribute key for name */
	final String EXAMPLE_ATTR_NAME = "name"; //$NON-NLS-1$
	/** extension point attribute key for version */
	final String EXAMPLE_ATTR_VERSION = "version"; //$NON-NLS-1$

	/** extension point attribute key for pattern id */
	final String EXAMPLE_ATTR_IDP = "idp"; //$NON-NLS-1$
	/** extension point attribute key for document id */
	final String EXAMPLE_ATTR_IDD = "idd"; //$NON-NLS-1$
	/** extension point attribute key for checklist id */
	final String EXAMPLE_ATTR_IDC = "idc"; //$NON-NLS-1$

	/** extension point element key for related patterns */
	final String EXAMPLE_ELEMENT_RELATED_PATTERN = "related_pattern"; //$NON-NLS-1$
	/** extension point attribute key for related pattern id */
	final String EXAMPLE_ATTR_PATTERN_ID = "pattern_id"; //$NON-NLS-1$
	
	/** extension point element key for related documents */
	final String EXAMPLE_ELEMENT_RELATED_DOCUMENT = "related_document"; //$NON-NLS-1$
	/** extension point attribute key for related document id */
	final String EXAMPLE_ATTR_DOCUMENT_ID = "document_id"; //$NON-NLS-1$
	
	/** extension point element key for resources */
	final String EXAMPLE_ELEMENT_RESOURCE = "resource"; //$NON-NLS-1$
	/** extension point attribute key for resource description */
	final String EXAMPLE_ATTR_DESCRIPTION = "description"; //$NON-NLS-1$
	/** extension point attribute key for resource structure */
	final String EXAMPLE_ATTR_STRUCTURE = "structure"; //$NON-NLS-1$

	/** category name substitution for patterns */
	final String PATTERN_CATEGORY = "Pattern"; //$NON-NLS-1$
	/** category name substitution for documents */
	final String DOCUMENT_CATEGORY = "Document"; //$NON-NLS-1$
	/** category name substitution for check lists */
	final String CHECKLIST_CATEGORY = "Checklist"; //$NON-NLS-1$
	

}
