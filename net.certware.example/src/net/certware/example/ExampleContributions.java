package net.certware.example;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

/**
 * Example artifact contributions.  
 * Meant to support the examples extension point and wizard. 
 * @author mrb
 * @since 1.0
 */
public class ExampleContributions implements IExampleContribution {

	/** all of the categories of examples, defined by the extension schema */
	List<ExampleCategory> categories = new ArrayList<ExampleCategory>();

	/**
	 * Initialize the categories and list given the extension point contributions.
	 */
	public void initialize() {

		IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(EXAMPLE_EXTENSION);
		
		// create the categories supported by the extension point schema
		ExampleCategory patternCategory = new ExampleCategory(PATTERN_CATEGORY);
		ExampleCategory documentCategory = new ExampleCategory(DOCUMENT_CATEGORY);
		ExampleCategory checklistCategory = new ExampleCategory(CHECKLIST_CATEGORY);
		categories.add(patternCategory);
		categories.add(documentCategory);
		categories.add(checklistCategory);

		// given the contributions, allocate them to the categories
		for ( IConfigurationElement ce : config ) {

			if ( EXAMPLE_ELEMENT_PATTERN.equals(ce.getName())) {
				ExamplePattern ep = new ExamplePattern(ce);
				patternCategory.add( ep );
			}

			if ( EXAMPLE_ELEMENT_DOCUMENT.equals(ce.getName())) {
				ExampleDocument ed = new ExampleDocument(ce);
				documentCategory.add( ed );
			}
			
			if ( EXAMPLE_ELEMENT_CHECKLIST.equals(ce.getName())) {
				ExampleChecklist ec = new ExampleChecklist(ce);
				checklistCategory.add( ec );
			}
			
		}
	}

	/**
	 * Returns the categories as a list.
	 * @return category list
	 */
	public List<ExampleCategory> getCategories() {
		return categories;
	}
	
	/**
	 * Returns the categories as an array.
	 * @return category array
	 */
	public Object[] getCategoriesArray() {
		return categories.toArray();
	}
	
}
