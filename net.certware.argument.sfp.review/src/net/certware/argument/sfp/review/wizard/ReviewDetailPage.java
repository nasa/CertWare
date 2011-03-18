package net.certware.argument.sfp.review.wizard;

import net.certware.argument.sfp.review.Activator;
import net.certware.argument.sfp.review.preferences.PreferenceConstants;
import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.SemiFormalProofFactory;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;
import net.certware.argument.sfp.util.ProofUtil;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

/**
 * A generic statement details page.  
 * Most logic contained here.  Sub-classes add help context.
 * @author mrb
 * @since 1.0.3
 */
public abstract class ReviewDetailPage extends GenericDetailPage
{
	/** details client */
	private Composite premisesClient = null;
	/** buttons client */
	private Composite buttonsClient = null;
	/** author text */
	private Text authorText;
	/** time stamp text */
	private Text timeStampText;
	/** buttons layout section */
	private Section buttonsSection;
	/** proof valid button */
	private Button validButton;
	/** proof invalid button */
	private Button invalidButton;
	/** proof unknown button */
	private Button unknownButton;
	/** client for inference statements */
	private Composite inferenceClient;
	/** section for inference client */
	private Section inferenceSection;
	/** section for justifications client */
	private Section premisesSection;
	/** section for entailments */
	private Section entailmentsSection;
	/** client for entailment section */
	private Composite entailmentsClient;
	/** section for deduction */
	private Section deductionSection;
	/** client for deduction section */
	private Composite deductionClient;
	/** whether to show premise validity */
	private boolean showPremiseValidity = true;
	/** preference change listener */
	private ReviewPropertyChangeListener reviewPropertyChangeListener;
	
	/**
	 * Constructor saves the contributions for name search.
	 * @param proof proof to display
	 */
	public ReviewDetailPage(Proof proof,TreeViewer viewer, ReviewValidatePage validate, ReviewSetupPage setup) {
		super(proof,viewer,validate,setup);
		// TODO add an insert line command to the editor, inserting numbered line and renumbering those following?
		// TODO fix the save resource on finish
	}

	/**
	 * Creates the initial page structure before values available.
	 * @param parent details page of scrolled block
	 */
	public void createContents(Composite parent)
	{
		// put a table wrap layout onto the scrolled block area for the details pages
		TableWrapLayout layout = new TableWrapLayout();
		layout.topMargin = 5;
		layout.leftMargin = 5;
		layout.rightMargin = 5;
		layout.bottomMargin = 5;
		layout.numColumns = 1;
		parent.setLayout(layout);

		toolkit = mform.getToolkit();

		// instructions area
		Section instructionsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		instructionsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		instructionsSection.setText("Statement Validation");
		instructionsSection.setDescription("Evaluate the statement's validity according to its logical elements below:");
		toolkit.createCompositeSeparator(instructionsSection);
		Composite instructionsClient = toolkit.createComposite(instructionsSection);
		TableWrapLayout vcl = new TableWrapLayout();
		vcl.numColumns = 1;
		instructionsClient.setLayout( vcl );
		instructionsSection.setClient(instructionsClient);
		
		// premises area
		premisesSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		premisesSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		premisesSection.setText("Premises");
		premisesSection.setDescription("");
		premisesClient = toolkit.createComposite(premisesSection);
		TableWrapLayout pcl = new TableWrapLayout();
		pcl.numColumns = 3;
		premisesClient.setLayout( pcl );
		premisesSection.setClient(premisesClient);

		// inference area
		inferenceSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		inferenceSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		inferenceSection.setText("Inference");
		inferenceSection.setDescription("");
		inferenceClient = toolkit.createComposite(inferenceSection);
		TableWrapLayout icl = new TableWrapLayout();
		icl.numColumns = 3;
		inferenceClient.setLayout( icl );
		inferenceSection.setClient(inferenceClient);
		
		// entailment area
		entailmentsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		entailmentsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		entailmentsSection.setText("Entailments");
		entailmentsSection.setDescription("");
		entailmentsClient = toolkit.createComposite(entailmentsSection);
		TableWrapLayout ecl = new TableWrapLayout();
		ecl.numColumns = 3;
		entailmentsClient.setLayout( ecl );
		entailmentsSection.setClient(entailmentsClient);
		
		// deduction area
		deductionSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		deductionSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		deductionSection.setText("Deduction");
		deductionSection.setDescription("");
		deductionClient = toolkit.createComposite(deductionSection);
		TableWrapLayout dcl = new TableWrapLayout();
		dcl.numColumns = 3;
		deductionClient.setLayout( dcl );
		deductionSection.setClient(deductionClient);
		
		
		// buttons area
		buttonsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR ); // Section.NO_TITLE );
		buttonsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB ));
		buttonsSection.setText("Validation"); 
		buttonsSection.setDescription("");
		buttonsClient = toolkit.createComposite(buttonsSection);
		TableWrapLayout bcl = new TableWrapLayout();
		bcl.makeColumnsEqualWidth = false;
		bcl.numColumns = 1;
		buttonsClient.setLayout(bcl);
		buttonsSection.setClient(buttonsClient);

		// populate the sections with latest selections
		populatePremises();
		populateInference();
		populateEntailments();
		populateDeduction();
		populateButtons();

		parent.setSize(300, 100);

		
		// listen to preference changes
		reviewPropertyChangeListener = new ReviewPropertyChangeListener();
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(reviewPropertyChangeListener);
		
		Boolean b = Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_SHOW_PREMISE_VALIDITY);
		if ( b != null )
			setPremiseValidity(b.booleanValue());
	}

	/**
	 * Dispose of resources and listeners.
	 */
	@Override
	public void dispose() {
		if ( reviewPropertyChangeListener != null ) {
			Activator.getDefault().getPreferenceStore().removePropertyChangeListener(reviewPropertyChangeListener);
		}
		super.dispose();
	}

	/**
	 * Update the validation element of the selected statement.
	 * Adds validation kind, author, and time stamp to the validation entry.
	 * Creates the validation element if it is missing.
	 * @param kind validation kind
	 */
	public void updateValidation( ValidationKind kind ) {

		if ( statement != null ) {
			if ( statement.getValidation() == null ) {
				statement.setValidation( SemiFormalProofFactory.eINSTANCE.createValidation() );
			}

			// update the model
			statement.getValidation().setState( kind );
			statement.getValidation().setAuthor( addQuotes( setupPage.getAuthor()) );
			statement.getValidation().setTimeStamp( addQuotes( setupPage.getTimeStamp()) );

			// update the details page to show the new author and time stamp
			authorText.setText( removeQuotes( setupPage.getAuthor() ) );
			timeStampText.setText( removeQuotes( setupPage.getTimeStamp() ) );

			// refresh labels on master and details pages
			update(); 
			viewer.refresh(); 
		}
	}

	/**
	 * Get the author stored in the statement's validation record.
	 * @return statement validation author
	 */
	public String getOriginalAuthor() {
		if ( statement != null && statement.getValidation() != null ) {
			return statement.getValidation().getAuthor();
		}
		return "";
	}

	/**
	 * Get the time stamp stored in the statement's validation record.
	 * @return statement validation time stamp
	 */
	public String getOriginalTimeStamp() {
		if ( statement != null && statement.getValidation() != null ) {
			return statement.getValidation().getTimeStamp();
		}
		return "";
	}

	/**
	 * Populate the premise rows.
	 */
	private void populatePremises() {

		// show only the selected statement's justifications
		if ( statement != null ) {

			// find statement justifications, returned as list
			EList<Statement> premises = ProofUtil.getStatementPremises(proof, statement);

			if ( premises.size() > 0 ) {
				populateHeader(premisesClient);

				// show justifiers
				for ( Statement s : premises ) {
					displayStatementLine(premisesClient,s);
				}
			}

			// update section description
			switch( premises.size() ) {
				case 0: premisesSection.setDescription("No premises given."); 
				premisesSection.setExpanded(false); 
				break;
				case 1: premisesSection.setDescription("Inference Premise:"); 
				premisesSection.setExpanded(true); 
				break;
				default: premisesSection.setDescription("Inference Premises:"); 
				premisesSection.setExpanded(true); 
				break;
			}
			
		} else {
			//premisesSection.setDescription("");
			clearClient(premisesClient);
			premisesSection.setExpanded(false);
		}

	}

	/**
	 * Populate the entailment rows.
	 */
	private void populateEntailments() {

		// show only the selected statement's entailments
		if ( statement != null ) {

			// find statement entailments, returned as list
			EList<Entailment> entailments = ProofUtil.getStatementEntailments(statement);

			if ( entailments.size() > 0 ) {
				populateHeader(entailmentsClient);

				// show entailments
				boolean firstPass = true;
				for ( Entailment e : entailments ) {

					// separator
					if ( firstPass == false ) {
						populateHeader(entailmentsClient);
					}
					
					// entailment heads
					EList<String> heads = ProofUtil.getHeadList(e);
					
					for ( String head : heads ) {
						Statement es = ProofUtil.findStatement(proof, head);
						if ( es != null ) {
							displayStatementLine(entailmentsClient, es);
						}
					}
					
					// entailment tail
					Statement ts = ProofUtil.findStatement(proof, e.getTail());
					displayEntailmentLine(entailmentsClient,ts,heads.size()>1);
					firstPass = false;
				}
			}

			// update section description
			switch( entailments.size() ) {
				case 0: 
					clearClient(entailmentsClient);
					entailmentsSection.setExpanded(false);
					break;
				case 1: 
					entailmentsSection.setDescription("Deduction entailment:");
					entailmentsSection.setExpanded(true);
					break;
				default: 
					entailmentsSection.setDescription("Deduction entailments:");
					entailmentsSection.setExpanded(true);
					break;
			}
			
		} else {
			clearClient(entailmentsClient);
			entailmentsSection.setExpanded(false);
		}
		
	}
	
	
	/**
	 * Populate the inference row.
	 */
	private void populateInference() {
		if ( statement != null ) {
			
			EList<Statement> premises = ProofUtil.getStatementPremises(proof, statement);
			EList<Entailment> entailments = ProofUtil.getStatementEntailments(statement);
			
			if ( premises.isEmpty() ) {
				if ( entailments.isEmpty() == false ) {
					inferenceSection.setDescription("Deduction:");
				} else if ( ProofUtil.statementIsEpsilon(statement)) {
					inferenceSection.setDescription("Empty set");
				} else if ( ProofUtil.statementIsHypothesis(statement)) {
					inferenceSection.setDescription("Hypothesis:");
				} else {
					inferenceSection.setDescription("Definition:");
				}
			} else {
				inferenceSection.setDescription("Inference given the above premises:");
			}

			populateHeader(inferenceClient);
			displayStatementLine(inferenceClient,statement);
			
			inferenceSection.setExpanded(true);
		} else {
			inferenceSection.setExpanded(false);
		}
	}
	
	/**
	 * Populate the deduction row.
	 */
	private void populateDeduction() {
		if ( statement != null ) {
			
			EList<Entailment> entailments = ProofUtil.getStatementEntailments(statement);
			if ( entailments.isEmpty() ) {
				clearClient(deductionClient);
				deductionSection.setExpanded(false);
			} else {
				deductionSection.setDescription("Deduction given the above entailments:");
				deductionSection.setExpanded(true);
			}
			
			populateHeader(deductionClient);
			displayStatementLine(deductionClient,statement);
		} else {
			deductionSection.setExpanded(false);
		}
	}
	
	/**
	 * Create the buttons row and validation reference row on their form clients.
	 * Adds button listeners to update validation and button enabled states.
	 */
	private void populateButtons() {

		// buttons composite row
		Composite buttonsComposite = toolkit.createComposite(buttonsClient);
		TableWrapLayout buttonsCompositeLayout = new TableWrapLayout();
		buttonsCompositeLayout.makeColumnsEqualWidth = true;
		buttonsCompositeLayout.numColumns = 3;
		buttonsComposite.setLayout(buttonsCompositeLayout);
		
		// author composite row
		Composite authorComposite = toolkit.createComposite(buttonsClient);
		TableWrapLayout authorCompositeLayout = new TableWrapLayout();
		authorCompositeLayout.makeColumnsEqualWidth = false;
		authorCompositeLayout.numColumns = 4;
		authorComposite.setLayout(authorCompositeLayout);
		
		// buttons on the buttons client
		validButton = toolkit.createButton(buttonsComposite, getItemValidLabel(), SWT.PUSH);
		validButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
		validButton.setImage( imageRegistry.get( Activator.REVIEW_VALID_IMAGE ));
		validButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateValidation(ValidationKind.VALID);
				updateButtons();
			}
		});
		invalidButton = toolkit.createButton(buttonsComposite, getItemInvalidLabel(), SWT.PUSH);
		invalidButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
		invalidButton.setImage( imageRegistry.get( Activator.REVIEW_INVALID_IMAGE ));
		invalidButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateValidation(ValidationKind.INVALID);
				updateButtons();
			}
		});
		unknownButton = toolkit.createButton(buttonsComposite, getItemUnknownLabel(), SWT.PUSH);
		unknownButton.setLayoutData(new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP));
		unknownButton.setImage( imageRegistry.get( Activator.REVIEW_UNKNOWN_IMAGE ));
		unknownButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateValidation(ValidationKind.UNKNOWN);
				updateButtons();
			}
		});

		// add labels made from validation setup fields
		toolkit.createLabel(authorComposite,"Previous Author");
		authorText = toolkit.createText(authorComposite,removeQuotes(getOriginalAuthor()));
		authorText.setEditable(false);

		toolkit.createLabel(authorComposite,"Time Stamp");
		timeStampText = toolkit.createText(authorComposite, removeQuotes(getOriginalTimeStamp()));
		timeStampText.setEditable(false);

		// update description
		if ( statement != null ) {
			buttonsSection.setDescription("Validate the statement:");
		}

		// set enabled states based on statement selection
		updateButtons();
	}

	/**
	 * Update the enable states of the buttons based on validation kind.
	 * Adds the validation object if not present in statement.
	 */
	private void updateButtons() {

		if ( statement == null )
			return;
		
		if ( statement.getValidation() == null ) {
			statement.setValidation( SemiFormalProofFactory.eINSTANCE.createValidation() );
		}

		if ( statement.getValidation().getState() == ValidationKind.INVALID ) {
			invalidButton.setEnabled(false);
			validButton.setEnabled(true);
			unknownButton.setEnabled(true);
		}
		if ( statement.getValidation().getState() == ValidationKind.VALID ) {
			invalidButton.setEnabled(true);
			validButton.setEnabled(false);
			unknownButton.setEnabled(true);
		}
		if ( statement.getValidation().getState() == ValidationKind.UNKNOWN ) {
			invalidButton.setEnabled(true);
			validButton.setEnabled(true);
			unknownButton.setEnabled(false);
		}

		// if any predecessors invalid, disable the valid button
		if ( ProofUtil.justificationsValid(proof,statement) == false ) {
			validButton.setEnabled(false);
		}

		markDirty();
		validatePage.setPageComplete(true);
	}

	/**
	 * Create the widgets for an entailment line.
	 * @param client client on which to add children
	 * @param s statement to display
	 * @param plural whether there is more than one head item
	 */
	private void displayEntailmentLine(Composite client, Statement s, boolean plural) {

		// first row, show entailment signal
		Label c1 = toolkit.createLabel(client,"");
		c1.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
		c1.setImage( imageRegistry.get( Activator.REVIEW_ENTAILMENT_IMAGE ) );

		Label c2 = toolkit.createLabel(client, plural ? "Imply" : "Implies");
		c2.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));

		Label c3 = toolkit.createLabel(client,"");
		c3.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));

		// next row, display the statement content
		displayStatementLine(client,s);
	}
	
	/**
	 * Create the widgets for a statement line.
	 * @param client client on which to add children
	 * @param s statement to display
	 */
	private void displayStatementLine(Composite client, Statement s) {
		
		Label idValue = toolkit.createLabel(client,s.getId());
		idValue.setFont(normalFont);
		idValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
		if ( this.showPremiseValidity ) {
			idValue.setImage( getImageForStatement(s) );
		} else {
			idValue.setImage(null);
			idValue.setText(" "); //$NON-NLS-1$
		}
		idValue.setToolTipText( s.getId() );

		FormText bodyValue = toolkit.createFormText(client, false);
		bodyValue.setWhitespaceNormalized(true);
		bodyValue.setText( removeQuotes(s.getStatement()) , false, false);
		bodyValue.setFont(normalFont);
		bodyValue.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));
		bodyValue.setToolTipText( s.getId() + ' ' + s.getStatement() );

		Label commentValue = toolkit.createLabel(client, ProofUtil.getStatementComment(s));
		commentValue.setFont(normalFont);
		commentValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
		commentValue.setToolTipText( commentValue.getText() );
	}

	/**
	 * Refreshes the page with new selection data.
	 */
	protected void update() {

		if ( proof == null )
			return;

		// clear previous data
		clearClient(premisesClient);
		clearClient(inferenceClient);
		clearClient(entailmentsClient);
		clearClient(deductionClient);
		clearClient(buttonsClient);

		// reload the clients
		// populateHeader();
		populatePremises();
		populateInference();
		populateEntailments();
		populateDeduction();
		populateButtons();

		// layout clients
		premisesSection.getParent().layout(true);
		premisesClient.getParent().layout(true, true);
		
		inferenceSection.getParent().layout(true, true);
		inferenceClient.getParent().layout(true, true);
		
		entailmentsSection.getParent().layout(true);
		entailmentsClient.getParent().layout(true,true);
		
		deductionSection.getParent().layout(true);
		deductionClient.getParent().layout(true,true);
		
		buttonsSection.getParent().layout(true);
		buttonsClient.getParent().layout(true, true);

		// layout form
		mform.reflow(true);
		setHelpContext(inferenceClient); // TODO is this right?
	}

	/**
	 * Sets the help context ID.
	 * @param c control for help system reference
	 */
	// abstract void setHelpContext(Control c);

	/**
	 * Sets the form input object to the given value.
	 * Expects an Example object.
	 * @return always returns false
	 */
	public boolean setFormInput(Object input) {
		statement = (Statement)input;
		return false;
	}

	/**
	 * Sets the object to display as a result of master selection.
	 * Listener mapped to objects of the statement type.
	 * Uses the first selected item.  Calls <code>update()</code>. 
	 */
	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection ssel = (IStructuredSelection)selection;

		if ( ssel == null || ssel.getFirstElement() == null )
			return;

		// check selection type
		if ( ssel.getFirstElement() instanceof Proof ) {
			proof = (Proof)ssel.getFirstElement();
		} else if ( ssel.getFirstElement() instanceof Statement) {
			statement = (Statement)ssel.getFirstElement();
			proof = (Proof) EcoreUtil.getRootContainer(statement);
		}

		update();
	}

	/**
	 * Sets the premise validity flag for review page.
	 * @param value new value
	 */
	private void setPremiseValidity(boolean value) {
		this.showPremiseValidity = value;
	}
	
	
	/**
	 * Preference change listener.
	 */
	class ReviewPropertyChangeListener implements IPropertyChangeListener {
		
		/**
		 * Captures changes and refreshes display if necessary.
		 */
		@Override
		public void propertyChange(PropertyChangeEvent event) {
			boolean needUpdate = false;
			if ( event.getProperty().equals(PreferenceConstants.P_SHOW_PREMISE_VALIDITY )) {
				Boolean v = (Boolean)event.getNewValue();
				if ( showPremiseValidity != v.booleanValue() ) {
					setPremiseValidity(v.booleanValue());
					needUpdate = true;
				}
			}

			// refresh once for all preference changes
			if ( needUpdate )
				update();
		}
		
	}
}
