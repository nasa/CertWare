package net.certware.verification.checklist.view.table;

import net.certware.verification.checklist.Checklist;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Table;

/**
 * Table viewer for checklist models.
 * @author mrb
 * @since 1.2.1
 */
public class ChecklistTableViewer extends TableViewer
{
	public String category; 	// column 0
	public String id; 			// column 1
	public String description; 	// column 2
	public String reference;	// column 3
	public String comment;		// column 4
	public String choices;		// column 5

	public static final String COLUMN_CATEGORY = "Category";
	public static final String COLUMN_ID = "ID";
	public static final String COLUMN_DESCRIPTION = "Description";
	public static final String COLUMN_REFERENCE = "Reference";
	public static final String COLUMN_COMMENT = "Comment";
	public static final String COLUMN_CHOICES = "Choices";

	/** original column order */
	public String[] columnNames = {
			COLUMN_CATEGORY,
			COLUMN_ID,
			COLUMN_DESCRIPTION,
			COLUMN_REFERENCE,
			COLUMN_COMMENT,
			COLUMN_CHOICES
	};

	/** viewer content provider */
	protected ChecklistContentProvider contentProvider;
	/** viewer item provider */
	protected ChecklistItemProvider itemProvider;
	/** viewer sorter */
	protected ChecklistSorter sorter;

	/**
	 * Creates an interactive viewer for a table structure.
	 * Assigns the item and content providers.
	 * Assigns the sorter.
	 * @param table table with columns defined
	 */
	public ChecklistTableViewer(Table table)
	{
		super(table);

		contentProvider = new ChecklistContentProvider();
		itemProvider = new ChecklistItemProvider();
		sorter = new ChecklistSorter(this);

		setContentProvider( contentProvider );
		setLabelProvider( itemProvider );
		setInput( contentProvider.getModel() );
		setSorter( sorter );

		// TODO add dispose listeners
	}

	/**
	 * Initialize the content provider with file content.
	 * @param bor buffer overflow results
	 * @return true if loaded, false if data records null  
	 */
	public boolean initialize(Checklist c) {
		return contentProvider.getModel().initialize(c);
	}

	/**
	 * Returns the sorter, useful for fetching direction.
	 * @return line value sorter 
	 */
	@Override
	public ChecklistSorter getSorter() {
		return sorter;
	}
}

