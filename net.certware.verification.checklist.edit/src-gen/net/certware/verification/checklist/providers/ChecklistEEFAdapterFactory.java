/**
 * Generated with Acceleo
 */
package net.certware.verification.checklist.providers;

import net.certware.verification.checklist.util.ChecklistAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class ChecklistEEFAdapterFactory extends ChecklistAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see net.certware.verification.checklist.util.ChecklistAdapterFactory#createCategoryAdapter()
	 * 
	 */
	public Adapter createCategoryAdapter() {
		return new CategoryPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.verification.checklist.util.ChecklistAdapterFactory#createItemAdapter()
	 * 
	 */
	public Adapter createItemAdapter() {
		return new ItemPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see net.certware.verification.checklist.util.ChecklistAdapterFactory#createChecklistAdapter()
	 * 
	 */
	public Adapter createChecklistAdapter() {
		return new ChecklistPropertiesEditionProvider();
	}

}
