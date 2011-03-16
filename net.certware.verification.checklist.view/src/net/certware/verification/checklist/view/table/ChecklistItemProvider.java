package net.certware.verification.checklist.view.table;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * An item provider for the buffer overflow results table.
 * Provides labels and icons based on the line value row model.
 * @author mrb
 * @version $Revision: 1.0 $
 */
public class ChecklistItemProvider implements ITableLabelProvider
{
	/** generic file image from platform */ 
	// final Image fileImage = PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE);
	//final Image fileImage = PlatformUI.getWorkbench().getEditorRegistry().getImageDescriptor("*.c").createImage(); //$NON-NLS-1$

	/** image for warning decision results */
	//final Image warningImage = Activator.getImageDescriptor("icons/obj16/warning.gif").createImage();
	/** image for error decision results */
	//final Image errorImage = Activator.getImageDescriptor("icons/obj16/error.gif").createImage();

	/**
	 * Returns a column image given the column number. 
	 * @param object object should be an instance of <code>ChecklistModel</code>
	 * @param columnIndex column number consistent with <code>ChecklistTableViewer</code>
	 * @return image from plugin registry  
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(Object, int) 
	 */
	@SuppressWarnings("unused")
	public Image getColumnImage(Object object, int columnIndex)
	{
		if ( ! (object instanceof ChecklistModel) )
			return null;

		ChecklistModel cm = (ChecklistModel)object;
		switch(columnIndex) {

		case 0: // category
			break;

		case 1: // id
			break;

		case 2: // description
			break;

		case 3: // reference
			break;

		case 4: // comment
			break;

		case 5: // result
			break;

			/*
      case 7: // decision value
        if ( cm.getDecisionValue().equalsIgnoreCase("yes")) //$NON-NLS-1$
          return safeImage;
        else if ( cm.getDecisionValue().equalsIgnoreCase("no")) //$NON-NLS-1$
          return errorImage;
        else if ( cm.getDecisionValue().equalsIgnoreCase("maybe")) //$NON-NLS-1$
          return warningImage;
        break;
			 */

		}

		return null;
	}

	/**
	 * Returns the column text for a model object and column number.
	 * @param object checklist model
	 * @param columnIndex column index number
	 * @return header string
	 */
	public String getColumnText(Object object, int columnIndex)
	{
		if ( ! (object instanceof ChecklistModel) )
			return ""; //$NON-NLS-1$

		ChecklistModel cm = (ChecklistModel)object;
		switch(columnIndex) {
		case 0: return cm.getCategory();
		case 1: return cm.getId();
		case 2: return cm.getDescription();
		case 3: return cm.getReference();
		case 4: return cm.getComment();
		case 5: return cm.getResult().toString();
		}

		return ""; //$NON-NLS-1$
	}

	/**
	 * Method addListener unused.
	 * @param listener ILabelProviderListener
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(ILabelProviderListener) 
	 */
	public void addListener(ILabelProviderListener listener) {
	}

	/**
	 * Disposes of images.
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	public void dispose() {
		//if ( warningImage != null ) warningImage.dispose();
		//if ( errorImage != null ) errorImage.dispose();
	}

	/**
	 * Whether this is a label property.
	 * @param element unused
	 * @param property unused
	 * @return boolean always returns false 
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(Object, String) 
	 */
	public boolean isLabelProperty(Object element, String property)  {
		return false;
	}

	/**
	 * Removes listeners.  Unused.
	 * @param listener unused
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(ILabelProviderListener) 
	 */
	public void removeListener(ILabelProviderListener listener) {
	}

}
