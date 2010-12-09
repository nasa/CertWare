package net.certware.example.wizards;

import net.certware.example.Activator;
import net.certware.example.Example;
import net.certware.example.ExampleCategory;
import net.certware.example.ExampleContributions;
import net.certware.example.ExampleResource;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.events.IExpansionListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;


/**
 * A generic example page to be extended by specific example types.
 * @author mrb
 * @since 1.0
 */
public abstract class ExamplePage implements IDetailsPage
{
	/** dialog settings section key */
	static final String EXAMPLE_PAGE_SETTINGS = "EXAMPLE_PAGE_SETTINGS";
	/** related documents section key */
	static final String RELATED_DOCUMENTS_SECTION_STATE = "related_documents_section_state";
	/** related patterns section key */
	static final String RELATED_PATTERNS_SECTION_STATE = "related_patterns_section_state";
	/** resources section key */
	static final String RESOURCES_SECTION_STATE = "resources_section_state";

	/** the form toolkit created by dialog host */
	FormToolkit toolkit = null;
	/** the managed form container */
	IManagedForm mform = null;
	/** bold font labels */
	Font boldFont = null;
	/** normal font for values */
	Font normalFont = null;
	/** example name */
	Label nameValue = null;
	/** example author */
	Label authorValue = null;
	/** example version */
	Label versionValue = null;
	/** example applicability statement */
	Text applicabilityValue = null;
	/** example motivation */
	Text motivationValue = null;
	/** example intent */
	Text intentValue = null;
	/** example consequences */
	Text consequencesValue = null;
	/** example implementation */
	Text implementationValue = null;
	/** details client */
	Composite detailsClient = null;
	/** resources client */
	Composite resourcesClient = null;
	/** related documents client */
	Composite relatedDocumentsClient = null;
	/** related patterns client */
	Composite relatedPatternsClient = null;
	/** resources section */
	Section resourcesSection = null;
	/** related documents section */
	Section relatedDocumentsSection = null;
	/** related patterns section */
	Section relatedPatternsSection = null;
	/** input example to display */
	Example example;
	/** example contributions */
	ExampleContributions exampleContributions;
	
	/**
	 * Constructor saves the contributions for name search.
	 * @param ec
	 */
	public ExamplePage(ExampleContributions ec) {
		exampleContributions = ec;
	}

	/**
	 * Creates the initial page structure before values available.
	 * @param parent page
	 */
	public void createContents(Composite parent)
	{
		TableWrapLayout layout = new TableWrapLayout();
		layout.topMargin = 5;
		layout.leftMargin = 5;
		layout.rightMargin = 5;
		layout.bottomMargin = 5;
		layout.numColumns = 1;
		parent.setLayout(layout);

		toolkit = mform.getToolkit();
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		s1.setText("Example Details");
		s1.setDescription("Properties established by example contribution");
		s1.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		toolkit.createCompositeSeparator(s1);
		detailsClient = toolkit.createComposite(s1);
		TableWrapLayout dcl = new TableWrapLayout();
		dcl.numColumns = 2;
		detailsClient.setLayout( dcl );
		// detailsClient.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB, 1, 2));

		// name and value
		Label nameLabel = toolkit.createLabel(detailsClient, "Name");
		nameLabel.setFont(boldFont);
		nameLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
		nameValue = toolkit.createLabel(detailsClient,"<TBD>");
		nameValue.setFont(normalFont);
		nameValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));

		// version
		Label versionLabel = toolkit.createLabel(detailsClient, "Version");
		versionLabel.setFont(boldFont);
		versionLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
		versionValue = toolkit.createLabel(detailsClient,"<TBD>");
		versionValue.setFont(normalFont);
		versionValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));

		// author
		Label authorLabel = toolkit.createLabel(detailsClient, "Author");
		authorLabel.setFont(boldFont);
		authorLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
		authorValue = toolkit.createLabel(detailsClient,"<TBD>");
		authorValue.setFont(normalFont);
		authorValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));

		// applicability
		Label applicabilityLabel = toolkit.createLabel(detailsClient, "Applicability");
		applicabilityLabel.setFont(boldFont);
		applicabilityLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
		applicabilityValue = toolkit.createText(detailsClient,"<TBD>",  SWT.BORDER | SWT.V_SCROLL | SWT.WRAP);
		applicabilityValue.setLayoutData( new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB) );
		applicabilityValue.setFont(normalFont);
		applicabilityValue.setEditable(false);

		// motivation
		Label motivationLabel = toolkit.createLabel(detailsClient, "Motivation");
		motivationLabel.setFont(boldFont);
		motivationLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
		motivationValue = toolkit.createText(detailsClient,"<TBD>", SWT.BORDER | SWT.V_SCROLL | SWT.WRAP);
		motivationValue.setLayoutData( new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB) );
		motivationValue.setFont(normalFont);
		motivationValue.setEditable(false);

		// intent
		Label intentLabel = toolkit.createLabel(detailsClient, "Intent");
		intentLabel.setFont(boldFont);
		intentLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
		intentValue = toolkit.createText(detailsClient, "<TBD>", SWT.BORDER | SWT.V_SCROLL | SWT.WRAP );
		intentValue.setLayoutData( new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB) );
		intentValue.setFont(normalFont);
		intentValue.setEditable(false);

		// consequences
		Label consequencesLabel = toolkit.createLabel(detailsClient, "Consequences");
		consequencesLabel.setFont(boldFont);
		consequencesLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
		consequencesValue = toolkit.createText(detailsClient, "<TBD>", SWT.BORDER | SWT.V_SCROLL | SWT.WRAP );
		consequencesValue.setLayoutData( new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB) );
		consequencesValue.setFont(normalFont);
		consequencesValue.setEditable(false);

		// implementation
		Label implementationLabel = toolkit.createLabel(detailsClient, "Implementation");
		implementationLabel.setFont(boldFont);
		implementationLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.MIDDLE));
		implementationValue = toolkit.createText(detailsClient, "<TBD>", SWT.BORDER | SWT.V_SCROLL | SWT.WRAP );
		implementationValue.setLayoutData( new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB) );
		implementationValue.setFont(normalFont);
		implementationValue.setEditable(false);

		s1.setClient(detailsClient);

		// resources section
		resourcesSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
		resourcesSection.setText("Contributed Resources");
		resourcesSection.setDescription("Resources to copy into workspace container");
		resourcesSection.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));
		toolkit.createCompositeSeparator(resourcesSection);
		resourcesClient = toolkit.createComposite(resourcesSection);
		dcl = new TableWrapLayout();
		dcl.numColumns = 2;
		resourcesClient.setLayout( dcl );
		resourcesSection.setClient(resourcesClient);

		// related documents section
		relatedDocumentsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
		relatedDocumentsSection.setText("Related Documents");
		relatedDocumentsSection.setDescription("Related document examples");
		relatedDocumentsSection.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));
		toolkit.createCompositeSeparator(relatedDocumentsSection);
		relatedDocumentsClient = toolkit.createComposite(relatedDocumentsSection);
		dcl = new TableWrapLayout();
		dcl.numColumns = 1;
		relatedDocumentsClient.setLayout( dcl );
		relatedDocumentsSection.setClient(relatedDocumentsClient);

		// related patterns section
		relatedPatternsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE);
		relatedPatternsSection.setText("Related Patterns");
		relatedPatternsSection.setDescription("Related pattern examples");
		relatedPatternsSection.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));
		toolkit.createCompositeSeparator(relatedPatternsSection);
		relatedPatternsClient = toolkit.createComposite(relatedPatternsSection);
		dcl = new TableWrapLayout();
		dcl.numColumns = 1;
		relatedPatternsClient.setLayout( dcl );
		relatedPatternsSection.setClient(relatedPatternsClient);

		// recover expanded state from the dialog settings store
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings tsection = settings.getSection(EXAMPLE_PAGE_SETTINGS);
		if (tsection == null) {
			tsection = settings.addNewSection(EXAMPLE_PAGE_SETTINGS);
		}
		final IDialogSettings section = tsection;

		parent.setSize(300, 100);

		resourcesSection.setExpanded(section.getBoolean(RESOURCES_SECTION_STATE));
		resourcesSection.addExpansionListener(new IExpansionListener(){
			public void expansionStateChanged(ExpansionEvent e) {
				section.put(RESOURCES_SECTION_STATE, e.getState() );
			}
			public void expansionStateChanging(ExpansionEvent e) {
			}});

		relatedDocumentsSection.setExpanded(section.getBoolean(RELATED_DOCUMENTS_SECTION_STATE));
		relatedDocumentsSection.addExpansionListener(new IExpansionListener(){
			public void expansionStateChanged(ExpansionEvent e) {
				section.put(RELATED_DOCUMENTS_SECTION_STATE, e.getState() );
			}
			public void expansionStateChanging(ExpansionEvent e) {
			}});

		relatedPatternsSection.setExpanded(section.getBoolean(RELATED_PATTERNS_SECTION_STATE));
		relatedPatternsSection.addExpansionListener(new IExpansionListener(){
			public void expansionStateChanged(ExpansionEvent e) {
				section.put(RELATED_PATTERNS_SECTION_STATE, e.getState() );
			}
			public void expansionStateChanging(ExpansionEvent e) {
			}});
		
	}

	/**
	 * Find the example name associated with an ID.
	 * @param id reference ID
	 * @return example name if found, or returns back the ID if not found
	 */
	private String getNameForId(String id) {
		
		for ( ExampleCategory c : exampleContributions.getCategories()) {
			for ( Example e : c.getExamples() ) {
				if ( id.equals( e.getId() )) {
					return e.getName();
				}
			}
		}

		return id;
	}
	
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

		// put values back into dialog store
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings section = settings.getSection(EXAMPLE_PAGE_SETTINGS);
		section.put(RESOURCES_SECTION_STATE, resourcesSection.isExpanded());
		section.put(RELATED_DOCUMENTS_SECTION_STATE, relatedDocumentsSection.isExpanded());
		section.put(RELATED_PATTERNS_SECTION_STATE, relatedPatternsSection.isExpanded());
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
	 * Is dirty from edits.  Unused.
	 * @return always returns false
	 */
	public boolean isDirty() {
		return false;
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
	private void clearClient(Composite client) {
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
	private void update() {

		if ( example == null )
			return;

		// clear previous data
		clearClient(resourcesClient);
		clearClient(relatedDocumentsClient);
		clearClient(relatedPatternsClient);

		// display the new values
		nameValue.setText(example.getName());
		authorValue.setText(example.getAuthor());
		versionValue.setText(example.getVersion());
		applicabilityValue.setText(example.getApplicability());
		motivationValue.setText(example.getMotivation());
		intentValue.setText(example.getIntent());
		consequencesValue.setText(example.getConsequences());
		implementationValue.setText(example.getImplementation());

		// display resources
		if ( example.getRelatedResources().size() > 0 ) {
			toolkit.createLabel(resourcesClient, "Resource").setFont(boldFont);
			toolkit.createLabel(resourcesClient, "Description").setFont(boldFont);
		}
		for ( ExampleResource er : example.getRelatedResources() ) {
			String structure = er.getStructure();
			int lio = structure.lastIndexOf( Path.SEPARATOR );
			if ( lio > 0 ) 
				structure = structure.substring( lio + 1);
			toolkit.createLabel(resourcesClient, structure );
			toolkit.createLabel(resourcesClient, er.getDescription() );
		}
		
		// display related documents
		if ( example.getRelatedDocuments().size() > 0 ) {
			toolkit.createLabel(relatedDocumentsClient, "Document").setFont(boldFont);
		}
		for ( String rd : example.getRelatedDocuments() ) {
			toolkit.createLabel(relatedDocumentsClient, getNameForId(rd));
		}

		// display related patterns
		if ( example.getRelatedPatterns().size() > 0 ) {
			toolkit.createLabel(relatedPatternsClient, "Pattern").setFont(boldFont);
		}
		for ( String rp : example.getRelatedPatterns() ) {
			toolkit.createLabel(relatedPatternsClient, getNameForId(rp));
		}

		// layout clients
		detailsClient.getParent().layout(true, true);
		resourcesSection.getParent().layout(true,true);
		relatedDocumentsSection.getParent().layout(true,true);
		relatedPatternsSection.getParent().layout(true,true);

		mform.reflow(true);
		
		setHelpContext(detailsClient);
	}

	/**
	 * Sets the help context ID.
	 * @param c control for help system reference
	 */
	abstract void setHelpContext(Control c);
	
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
	 * Sets the form input object to the given value.
	 * Expects an Example object.
	 * @return always returns false
	 */
	public boolean setFormInput(Object input) {
		example = (Example)input;
		return false;
	}

	/**
	 * Sets the object to display as a result of master selection.
	 * Listener mapped to objects of the file info type.
	 * Uses the first selected item.  Calls <code>update()</code>. 
	 */
	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection ssel = (IStructuredSelection)selection;
		if ( ssel == null || ssel.getFirstElement() == null )
			return;

		example = (Example)ssel.getFirstElement();
		update();
	}

}
