package net.certware.argument.sfp.review.wizard;

import net.certware.argument.sfp.review.Activator;
import net.certware.argument.sfp.review.preferences.PreferenceConstants;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.help.IContextProvider;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.TableWrapData;



/**
 * A generic details page to be extended by proof and statement pages.
 * @author mrb
 * @since 1.0.3
 */
abstract public class GenericDetailPage implements IDetailsPage, IAdaptable
{
	/** the form toolkit created by dialog host */
	FormToolkit toolkit = null;
	/** the managed form container */
	IManagedForm mform = null;
	/** bold font labels */
	Font boldFont = null;
	/** normal font for values */
	Font normalFont = null;
	/** proof for statements */
	Proof proof;
	/** input example to display */
	Statement statement;
	/** image registry */
	ImageRegistry imageRegistry;
	/** viewer on master part to refresh */
	TreeViewer viewer;
	/** whether a save is necessary */
	boolean dirty;
	/** setup page field references */
	ReviewSetupPage setupPage;
	/** validate page method references */
	ReviewValidatePage validatePage;
	/** help context provider */
	ReviewContextProvider contextprovider;
	/** label for 'valid' inference */
	String itemValidLabel = "Valid";
	/** label for 'invalid' inference */
	String itemInvalidLabel = "Invalid";
	/** label for 'unknown' inference */
	String itemUnknownLabel = "Unknown";
	/** preference change listener */
	GenericPropertyChangeListener gpcl = null;
	
	/**
	 * Generic detail page constructor.
	 * @param proof proof object
	 * @param viewer tree viewer to refresh
	 * @param validate validate page
	 * @param setup review setup page
	 */
	public GenericDetailPage(Proof proof,TreeViewer viewer,ReviewValidatePage validate, ReviewSetupPage setup) {
		this.proof = proof;
		this.viewer = viewer;
		this.validatePage = validate;
		this.setupPage = setup;
		this.imageRegistry = Activator.getDefault().getImageRegistry();
		this.gpcl = new GenericPropertyChangeListener();
		
		IPreferenceStore ps = Activator.getDefault().getPreferenceStore();
		ps.addPropertyChangeListener(gpcl);
		itemValidLabel = ps.getString(PreferenceConstants.P_ITEM_VALID_LABEL);
		itemInvalidLabel = ps.getString(PreferenceConstants.P_ITEM_INVALID_LABEL);
	}
	
	/**
	 * Creates the initial page structure before values available.
	 * @param parent page
	 */
	abstract public void createContents(Composite parent);

	/**
	 * Commit changes.  Unused.
	 */
	public void commit(boolean onSave) {
	}

	/**
	 * Clean up.  Dispose of fonts.  Write dialog settings back to plugin.
	 */
	public void dispose() {
		if ( normalFont != null ) normalFont.dispose();
		if ( boldFont != null ) boldFont.dispose();
		if ( gpcl != null )	Activator.getDefault().getPreferenceStore().removePropertyChangeListener(gpcl);
	}

	/**
	 * Adapter to identify context provider.
	 * Supports the help system contribution.
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class key) {

		if (key.equals(IContextProvider.class)) {
			if (contextprovider == null)
				contextprovider = new ReviewContextProvider();
			return contextprovider;
		}

		return null;
	}


	/**
	 * Populate the column header.
	 */
	protected void populateHeader(Composite client) {
		Label idLabel = new Label(client, SWT.NONE);
		idLabel.setText( getItemValidLabel() );
		idLabel.setFont(boldFont);
		idLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));

		Label bodyLabel = new Label(client, SWT.NONE);
		bodyLabel.setText("Statement");
		bodyLabel.setFont(boldFont);
		bodyLabel.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.MIDDLE));

		Label commentLabel = new Label(client, SWT.NONE);
		commentLabel.setText("Comment"); 
		commentLabel.setFont(boldFont);
		commentLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
	}

	/**
	 * Gets the image to be associated with a statement in its label.
	 * @param s statement
	 * @return return image from image registry
	 */
	protected Image getImageForStatement(Statement s) {

		if ( s.getValidation() != null ) {
			if ( s.getValidation().getState() == ValidationKind.INVALID ) {
				return imageRegistry.get( Activator.REVIEW_INVALID_IMAGE );
			}

			if ( s.getValidation().getState() == ValidationKind.VALID ) {
				return imageRegistry.get( Activator.REVIEW_VALID_IMAGE );
			}
		}

		return imageRegistry.get( Activator.REVIEW_UNKNOWN_IMAGE );
	}
	
	/**
	 * Initialize the page.  Create fonts.
	 */
	public void initialize(IManagedForm form) {
		mform = form;

		// create some fonts
		FontDescriptor d = JFaceResources.getDefaultFontDescriptor();
		d = d.setStyle(SWT.BOLD);
		boldFont = new Font(form.getForm().getDisplay(),d.getFontData());
		d = d.setStyle(SWT.NORMAL);
		normalFont = new Font(form.getForm().getDisplay(),d.getFontData());
	}

	/**
	 * Whether the model is dirty.
	 * @return the value of the {@code dirty} field
	 */
	public boolean isDirty() {
		return dirty;
	}

	/**
	 * Is stale from refresh.  Unused.
	 * @return always returns false
	 */
	public boolean isStale() {
		return false;
	}

	/**
	 * Clears the client's children by disposal.
	 * @param client client to clear, client remains viable
	 */
	protected void clearClient(Composite client) {
		if ( client != null ) {
			for ( Control control : client.getChildren() ) {
				control.dispose();
			}
			client.layout(true);
		}
	}

	/**
	 * Refreshes the page with new selection data.
	 */
	abstract protected void update();

	/**
	 * Refresh calls update.
	 */
	public void refresh() {
		update();
	}

	/**
	 * Sets the focus for editing.  Unused.
	 */
	public void setFocus() {
	}

	/**
	 * Marks the model as dirty. 
	 */
	public void markDirty() {
		dirty = true;
	}
	
	/**
	 * Sets the form input object to the given value.
	 * @return always returns false
	 */
	abstract public boolean setFormInput(Object input);

	/**
	 * Sets the object to display as a result of master selection.
	 * Listener mapped to objects of the statement type.
	 * Uses the first selected item.  Calls <code>update()</code>. 
	 */
	abstract public void selectionChanged(IFormPart part, ISelection selection);

	/**
	 * Adds quotation marks to a string if missing.
	 * @param s string presumed to lack quotation marks as first and last characters
	 * @return s with quotation marks added, or s unchanged
	 */
	protected String addQuotes(String s) {
		if ( s != null && s.isEmpty() == false && s.charAt(0) != '"') {
			return '"' + s + '"';
		}
			
		return s;
	}
	
	/**
	 * Remove quotation marks from a string for display.
	 * @param s string presumed to have quotation marks as first and last characters
	 * @return s without first and last quotation marks, or s unchanged
	 */
	protected String removeQuotes(String s) {
		if ( s != null && s.isEmpty() == false ) {
			if ( s.charAt(0) == '"') {
				return s.substring(1,s.length()-1);
			}
		}
		
		return s;
	}

	/**
	 * Set the help context.
	 * @param c parent control
	 */
	abstract void setHelpContext(Control c);

	/**
	 * Sets the item valid label.
	 * @param label new label
	 */
	protected void setItemValidLabel(String label) {
		this.itemValidLabel = label;
	}
	
	/**
	 * Gets the item valid label.
	 * @return string from last preference fetch
	 */
	protected String getItemValidLabel() {
		if ( itemValidLabel == null )
			return "";
		return itemValidLabel;
	}

	/**
	 * Gets the item invalid label.
	 * @return string from last preference fetch
	 */
	protected String getItemInvalidLabel() {
		if ( itemInvalidLabel == null )
			return "";
		return itemInvalidLabel;
	}
	
	/**
	 * Sets the item unknown label.
	 * @param label new label
	 */
	protected void setItemUnknownLabel(String label) {
		this.itemUnknownLabel = label;
	}

	/**
	 * Gets the item unknown label.
	 * @return string from last preference fetch
	 */
	protected String getItemUnknownLabel() {
		if ( itemUnknownLabel == null )
			return "";
		return itemUnknownLabel;
	}
	
	/**
	 * Sets the item invalid label.
	 * @param label new label
	 */
	protected void setItemInvalidLabel(String label) {
		this.itemInvalidLabel = label;
	}

	/**
	 * Preference change listener.
	 */
	class GenericPropertyChangeListener implements IPropertyChangeListener {
		/**
		 * Captures changes and refreshes display if necessary.
		 */
		@Override
		public void propertyChange(PropertyChangeEvent event) {
			
			boolean needUpdate = false;
			
			if ( event.getProperty().equals(PreferenceConstants.P_ITEM_VALID_LABEL)) {
				if ( itemValidLabel.equals((String)event.getNewValue()) == false) {
					setItemValidLabel((String)event.getNewValue());
					needUpdate = true;
				}
			}
			if ( event.getProperty().equals(PreferenceConstants.P_ITEM_INVALID_LABEL)) {
				if ( itemInvalidLabel.equals((String)event.getNewValue()) == false) {
					setItemInvalidLabel((String)event.getNewValue());
					needUpdate = true;
				}
			}
			if ( event.getProperty().equals(PreferenceConstants.P_ITEM_UNKNOWN_LABEL)) {
				if ( itemUnknownLabel.equals((String)event.getNewValue()) == false) {
					setItemUnknownLabel((String)event.getNewValue());
					needUpdate = true;
				}
			}
			
			if ( needUpdate )
				update();
		}
		
	}
}
