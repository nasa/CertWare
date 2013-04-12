package net.certware.example;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;

/**
 * Contains an example as contributed through the extension point.
 * @author mrb
 * @since 1.0
 */
public class Example implements IExampleContribution {

	/** applicability of the pattern or document */
	String applicability = "";
	/** author of the pattern or document */
	String author = "";
	/** consequences of applying the pattern or document */
	String consequences = "";
	/** implementation hints for the pattern or document */
	String implementation = "";
	/** intention behind the pattern or document */
	String intent = "";
	/** motivation for developing the pattern or document */
	String motivation = "";
	/** identifier */
	String id = "";
	/** name of the pattern or document */
	String name = "";
	/** version of the pattern or document */
	String version = "";
	/** contributor of the example, usually a plugin or fragment ID */
	IContributor contributor;
	/** related patterns, by pattern ID */
	List<String> relatedPatterns = new ArrayList<String>();
	/** related documents, by document ID */
	List<String> relatedDocuments = new ArrayList<String>();
	/** related resources to load when applying the pattern or document */
	List<ExampleResource> relatedResources = new ArrayList<ExampleResource>();

	/**
	 * Constructor assigned none of the fields.
	 */
	public Example() {
	}
	
	/**
	 * Constructor assigns as many of the fields as possible from the configuration element.
	 * @param ce configuration element from the contribution, skips all assignments if null
	 */
	public Example(IConfigurationElement ce) {
		this();
		
		if ( ce == null ) {
			return;
		}

		// extension contributor
		contributor = ce.getContributor();
		
		// generic example fields; ids assigned by subclasses
		applicability = safeAssignment(ce,EXAMPLE_ATTR_APPLICABILITY);
		author = safeAssignment(ce,EXAMPLE_ATTR_AUTHOR);
		consequences = safeAssignment(ce,EXAMPLE_ATTR_CONSEQUENCES);
		implementation = safeAssignment(ce,EXAMPLE_ATTR_IMPLEMENTATION);
		intent = safeAssignment(ce,EXAMPLE_ATTR_INTENT);
		motivation = safeAssignment(ce,EXAMPLE_ATTR_MOTIVATION);
		name = safeAssignment(ce,EXAMPLE_ATTR_NAME);
		version = safeAssignment(ce,EXAMPLE_ATTR_VERSION);

		// related patterns
		IConfigurationElement[] patternChildren = ce.getChildren(EXAMPLE_ELEMENT_RELATED_PATTERN);
		if ( patternChildren != null ) {
			for ( IConfigurationElement pc : patternChildren ) {
				relatedPatterns.add( pc.getAttribute(EXAMPLE_ATTR_PATTERN_ID));
			}
		}

		// related documents
		patternChildren = ce.getChildren(EXAMPLE_ELEMENT_RELATED_DOCUMENT);
		if ( patternChildren != null ) {
			for ( IConfigurationElement pc : patternChildren ) {
				relatedDocuments.add( pc.getAttribute(EXAMPLE_ATTR_DOCUMENT_ID) );
			}
		}
		
		// associated resources
		patternChildren = ce.getChildren(EXAMPLE_ELEMENT_RESOURCE);
		if ( patternChildren != null ) {
			for ( IConfigurationElement pc : patternChildren ) {
				relatedResources.add( new ExampleResource(pc.getAttribute(EXAMPLE_ATTR_DESCRIPTION),
														  pc.getAttribute(EXAMPLE_ATTR_STRUCTURE)));
			}
		}
	}

	/**
	 * Ensures the string assignment does not return null.
	 * @param ce configuration element
	 * @param key attribute key
	 * @return string from attribute or empty string
	 */
	private String safeAssignment(IConfigurationElement ce,String key) {
		String s = ce.getAttribute(key);
		if ( s == null ) s = "";
		return s;
	}
	
	/**
	 * Returns the example name.
	 * @return example name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the example author.
	 * @return example author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Returns the example version.
	 * @return example version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Returns the applicability field.
	 * @return applicability field
	 */
	public String getApplicability() {
		return applicability;
	}

	/**
	 * Returns the motivation field.
	 * @return motivation field
	 */
	public String getMotivation() {
		return motivation;
	}

	/**
	 * Returns the intent field.
	 * @return intent field
	 */
	public String getIntent() {
		return intent;
	}
	
	/**
	 * Returns the consequences field.
	 * @return consequences field
	 */
	public String getConsequences() {
		return consequences;
	}
	
	/**
	 * Returns the implementation field.
	 * @return implementation field
	 */
	public String getImplementation() {
		return implementation;
	}
	
	/**
	 * Returns the contributor field.
	 * @return contributor field
	 */
	public IContributor getContributor() {
		return contributor;
	}
	
	/**
	 * Returns the related patterns list.
	 * @return related patterns list
	 */
	public List<String> getRelatedPatterns() {
		return relatedPatterns;
	}
	
	/**
	 * Returns the related documents list.
	 * @return related documents list
	 */
	public List<String> getRelatedDocuments() {
		return relatedDocuments;
	}
	
	/**
	 * Returns the related resources list.
	 * @return related resources list
	 */
	public List<ExampleResource> getRelatedResources() {
		return relatedResources;
	}
	
	/**
	 * Returns the example ID;
	 * @return ID
	 */
	public String getId() {
		return id;
	}
}
