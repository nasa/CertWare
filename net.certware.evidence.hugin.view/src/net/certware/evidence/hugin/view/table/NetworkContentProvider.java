package net.certware.evidence.hugin.view.table;


import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * Content provider for network table.
 * Uses the <code>NetworkModelList</code> as the content.
 * @author mrb
 * @since 1.2.1
 */
public class NetworkContentProvider implements IStructuredContentProvider
{
	/** the model content, which is a list of value tool structures */
	protected NetworkModelList itemList = new NetworkModelList();

	/**
	 * Return the model.  
	 * @return the item list model   
	 */
	public NetworkModelList getModel() {
		return itemList;
	}

	/**
	 * Returns the model expanded into an array of objects.
	 * @param inputElement unused
	 * @return an array of objects from the model list 
	 */
	public Object[] getElements(Object inputElement)
	{
		return itemList.getItemList().toArray();
	}

	/**
	 * Disposes the instance.
	 * Clears the item list.
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose()
	{
		itemList.getItemList().clear();
	}

	/**
	 * Responds to input change instructions from the viewer.
	 * Unused.
	 * @param viewer unused
	 * @param oldInput unused
	 * @param newInput unused

	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(Viewer, Object, Object) */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
	}
}
