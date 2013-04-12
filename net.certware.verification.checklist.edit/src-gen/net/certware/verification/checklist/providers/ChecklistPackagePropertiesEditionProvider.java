/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.providers;

import org.eclipse.emf.eef.runtime.impl.providers.ComposedPropertiesEditionProvider;

/**
 * 
 * 
 */
public class ChecklistPackagePropertiesEditionProvider extends ComposedPropertiesEditionProvider {

	/**
	 * Default Constructor
	 * 
	 */
	public ChecklistPackagePropertiesEditionProvider() {
		super();
		append(createCategoryPropertiesEditionProvider());
		append(createItemPropertiesEditionProvider());
		append(createChecklistPropertiesEditionProvider());
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Category instances.
	 * 
	 */
	protected CategoryPropertiesEditionProvider categoryPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Category
	 * 
	 */
	public CategoryPropertiesEditionProvider createCategoryPropertiesEditionProvider() {
		if (categoryPropertiesEditionProvider == null)
			categoryPropertiesEditionProvider = new CategoryPropertiesEditionProvider();
		return categoryPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Item instances.
	 * 
	 */
	protected ItemPropertiesEditionProvider itemPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Item
	 * 
	 */
	public ItemPropertiesEditionProvider createItemPropertiesEditionProvider() {
		if (itemPropertiesEditionProvider == null)
			itemPropertiesEditionProvider = new ItemPropertiesEditionProvider();
		return itemPropertiesEditionProvider;
	}

	/**
	 * This keeps track of the one PropertiesEditionProvider used for all
	 * Checklist instances.
	 * 
	 */
	protected ChecklistPropertiesEditionProvider checklistPropertiesEditionProvider;

	/**
	 * This creates an PropertiesEditionProvider for a Checklist
	 * 
	 */
	public ChecklistPropertiesEditionProvider createChecklistPropertiesEditionProvider() {
		if (checklistPropertiesEditionProvider == null)
			checklistPropertiesEditionProvider = new ChecklistPropertiesEditionProvider();
		return checklistPropertiesEditionProvider;
	}

}
