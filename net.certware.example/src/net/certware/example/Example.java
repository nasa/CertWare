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
	String applicability;
	/** author of the pattern or document */
	String author;
	/** consequences of applying the pattern or document */
	String consequences;
	/** identifier of the pattern or document, not a generic attribute */
	String id;
	/** implementation hints for the pattern or document */
	String implementation;
	/** intention behind the pattern or document */
	String intent;
	/** motivation for developing the pattern or document */
	String motivation;
	/** name of the pattern or document */
	String name;
	/** version of the pattern or document */
	String version;
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
		
		// generic example fields
		applicability = ce.getAttribute(EXAMPLE_ATTR_APPLICABILITY);
		author = ce.getAttribute(EXAMPLE_ATTR_AUTHOR);
		consequences = ce.getAttribute(EXAMPLE_ATTR_CONSEQUENCES);
		implementation = ce.getAttribute(EXAMPLE_ATTR_IMPLEMENTATION);
		intent = ce.getAttribute(EXAMPLE_ATTR_INTENT);
		motivation = ce.getAttribute(EXAMPLE_ATTR_MOTIVATION);
		name = ce.getAttribute(EXAMPLE_ATTR_NAME);
		version = ce.getAttribute(EXAMPLE_ATTR_VERSION);

		// related patterns
		IConfigurationElement[] patternChildren = ce.getChildren(EXAMPLE_ELEMENT_RELATED_PATTERN);
		if ( patternChildren != null ) {
			for ( IConfigurationElement pc : patternChildren ) {
				relatedPatterns.add( new String(pc.getAttribute(EXAMPLE_ATTR_PATTERN_ID)));
			}
		}

		// related documents
		patternChildren = ce.getChildren(EXAMPLE_ELEMENT_RELATED_DOCUMENT);
		if ( patternChildren != null ) {
			for ( IConfigurationElement pc : patternChildren ) {
				relatedDocuments.add( new String( pc.getAttribute(EXAMPLE_ATTR_DOCUMENT_ID) ));
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

	public String getApplicability() {
		return applicability;
	}

	public String getMotivation() {
		return motivation;
	}

	public String getIntent() {
		return intent;
	}
	
	public String getConsequences() {
		return consequences;
	}
	
	public String getImplementation() {
		return implementation;
	}
	
	public IContributor getContributor() {
		return contributor;
	}
	
	public List<String> getRelatedPatterns() {
		return relatedPatterns;
	}
	
	public List<String> getRelatedDocuments() {
		return relatedDocuments;
	}
	
	public List<ExampleResource> getRelatedResources() {
		return relatedResources;
	}
	
}
