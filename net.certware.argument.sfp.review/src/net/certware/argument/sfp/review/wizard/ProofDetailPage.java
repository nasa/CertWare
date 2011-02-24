package net.certware.argument.sfp.review.wizard;

import net.certware.argument.sfp.review.Activator;
import net.certware.argument.sfp.semiFormalProof.Entailment;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;
import net.certware.argument.sfp.util.ProofUtil;
import net.certware.core.ui.help.IHelpContext;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.help.IWorkbenchHelpSystem;



/**
 * A details page for the proof theorem statement.
 * @author mrb
 * @since 1.0.3
 */
public class ProofDetailPage extends GenericDetailPage
{
	/** premises client */
	Composite premisesClient = null;
	/** entailments client */
	Composite entailmentsClient = null;
	/** deduction client */
	private Composite theoremClient;
	/** deduction section */
	private Section theoremSection;
	/** premises section */
	private Section premisesSection;
	/** entailments section */
	private Section entailmentsSection;

	/**
	 * Detail page for proofs.
	 * @param proof proof object
	 * @param viewer tree viewer to refresh
	 * @param validate validate page
	 * @param setup review setup page
	 */
	public ProofDetailPage(Proof proof,TreeViewer viewer,ReviewValidatePage validate, ReviewSetupPage setup) {
		super(proof,viewer,validate,setup);
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
		
		// instructions area
		Section instructionsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		instructionsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		instructionsSection.setText("Theorem Justification");
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
		TableWrapLayout jcl = new TableWrapLayout();
		jcl.numColumns = 3;
		premisesClient.setLayout( jcl );
		premisesSection.setClient(premisesClient);

		// entailments area
		entailmentsSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		entailmentsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		entailmentsSection.setText("Entailments");
		entailmentsSection.setDescription("");
		entailmentsClient = toolkit.createComposite(entailmentsSection);
		TableWrapLayout ecl = new TableWrapLayout();
		ecl.numColumns = 3;
		entailmentsClient.setLayout( ecl );
		entailmentsSection.setClient(entailmentsClient);

		// theorem area
		theoremSection = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR);
		theoremSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.FILL_GRAB));
		theoremSection.setText("Theorem");
		theoremSection.setDescription("");
		theoremClient = toolkit.createComposite(theoremSection);
		TableWrapLayout dcl = new TableWrapLayout();
		dcl.numColumns = 3;
		theoremClient.setLayout( dcl );
		theoremSection.setClient(theoremClient);
		
		populatePremises();
		populateEntailments();
		populateTheorem();

		parent.setSize(300, 100);
	}

	/**
	 * Populate the premises.
	 */
	private void populatePremises() {

		// show only the selected proof's justifications
		if ( proof != null ) {

			// find theorem justifications, returned as list
			EList<Statement> justifiers = ProofUtil.getTheoremPremises(proof);

			if ( justifiers.size() > 0 ) {
				populateHeader(premisesClient);

				// show justifiers
				for ( Statement s : justifiers ) {
					displayStatementLine(premisesClient,s);
				}
			}

			// update section description
			switch( justifiers.size() ) {
			case 0: premisesSection.setDescription("");
				premisesSection.setExpanded(false);
				break;
			case 1: premisesSection.setDescription("Theorem premise:");
				premisesSection.setExpanded(true);
			break;
			default: premisesSection.setDescription("Theorem premises:");
				premisesSection.setExpanded(true);
				break;
			}
			
		} else {
			premisesSection.setDescription("");
			premisesSection.setExpanded(false);
		}

	}
	
	/**
	 * Populate the entailments.
	 */
	private void populateEntailments() {
		if ( proof != null ) {
			// find statement entailments, returned as list
			EList<Entailment> entailments = ProofUtil.getTheoremEntailments(proof);

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
					entailmentsSection.setDescription("Theorem entailment:");
					entailmentsSection.setExpanded(true);
					break;
				default: 
					entailmentsSection.setDescription("Theorem entailments:");
					entailmentsSection.setExpanded(true);
					break;
			}
			
		} else {
			clearClient(entailmentsClient);
			entailmentsSection.setExpanded(false);
		}
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
	 * Populate the theorem row.
	 */
	private void populateTheorem() {
		if ( proof != null ) {
			EList<Statement> premises = ProofUtil.getTheoremPremises(proof);
			EList<Entailment> entailments = ProofUtil.getTheoremEntailments(proof);

			if ( premises.isEmpty() && entailments.isEmpty() ) {
				theoremSection.setDescription("Theorem:");
			} else if ( premises.isEmpty() ) {
				theoremSection.setDescription("Theorem given the above entailments:");
			} else if ( entailments.isEmpty() ) {
				theoremSection.setDescription("Theorem given the above premises:");
			} else {
				theoremSection.setDescription("Theorem given the above justifications:");
			}

			populateHeader(theoremClient);
			displayTheoremLine(theoremClient);
		}
	}
	
	/**
	 * Populate the theorem line.
	 * @param client client for children
	 */
	private void displayTheoremLine(Composite client) {
		Label idValue = toolkit.createLabel(client,"Theorem");
		idValue.setFont(normalFont);
		idValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
		idValue.setImage( getImageForProof() );

		FormText bodyValue = toolkit.createFormText(client, false);
		bodyValue.setWhitespaceNormalized(true);
		bodyValue.setText( removeQuotes(proof.getTitle()), false, false);
		bodyValue.setFont(normalFont);
		bodyValue.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));

		Label commentValue = toolkit.createLabel(client, "");
		commentValue.setFont(normalFont);
		commentValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
	}

	/**
	 * Return an image based on the total validation state of the proof.
	 * @return image from the plugin's image registry
	 */
	private Image getImageForProof() {
		ValidationKind vk = ProofUtil.getProofValidationKind(proof);
		if ( vk == ValidationKind.VALID )
			return imageRegistry.get(Activator.REVIEW_VALID_IMAGE);
		if ( vk == ValidationKind.INVALID )
			return imageRegistry.get(Activator.REVIEW_INVALID_IMAGE);
		return imageRegistry.get(Activator.REVIEW_UNKNOWN_IMAGE);
	}
	
	/**
	 * Create the widgets for a statement line.
	 * @param client client on which to add children
	 * @param s statement to display
	 */
	private void displayStatementLine(Composite client, Statement s) {
		String id = s.getId();
		if ( id == null )
			id = "";
		Label idValue = toolkit.createLabel(client,id);
		idValue.setFont(normalFont);
		idValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
		idValue.setImage( getImageForStatement(s) );
		idValue.setToolTipText( id );

		FormText bodyValue = toolkit.createFormText(client, false);
		bodyValue.setWhitespaceNormalized(true);
		bodyValue.setText( removeQuotes(s.getStatement()), false, false);
		bodyValue.setFont(normalFont);
		bodyValue.setLayoutData(new TableWrapData(TableWrapData.FILL, TableWrapData.TOP));
		bodyValue.setToolTipText( id + ' ' + s.getStatement() );

		Label commentValue = toolkit.createLabel(client, ProofUtil.getStatementComment(s));
		commentValue.setFont(normalFont);
		commentValue.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
	}


	/**
	 * Refreshes the page with new selection data.
	 */
	protected void update() {

		if ( proof == null )
			return;

		// clear previous data
		clearClient(premisesClient);
		clearClient(entailmentsClient);
		clearClient(theoremClient);

		// reload the clients
		// populateHeader();
		populatePremises();
		populateEntailments();
		populateTheorem();

		// layout clients
		premisesSection.getParent().layout(true);
		premisesClient.getParent().layout(true, true);
		entailmentsSection.getParent().layout(true);
		entailmentsClient.getParent().layout(true, true);
		theoremSection.getParent().layout(true, true);
		theoremClient.getParent().layout(true, true);

		mform.reflow(true);
		setHelpContext(theoremClient);
	}


	/**
	 * Sets the form input object to the given value.
	 * Expects a {@code Proof} object.
	 * @return always returns false
	 */
	@Override
	public boolean setFormInput(Object input) {
		proof = (Proof)input;
		return false;
	}

	/**
	 * Sets the object to display as a result of master selection.
	 * Listener mapped to objects of the statement type.
	 * Uses the first selected item.  Calls <code>update()</code>. 
	 */
	@Override
	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection ssel = (IStructuredSelection)selection;

		if ( ssel == null || ssel.getFirstElement() == null )
			return;

		// check selection type
		if ( ssel.getFirstElement() instanceof Proof ) {
			proof = (Proof)ssel.getFirstElement();
		} 
		
		update();
	}

	/**
	 * Set the help context.
	 * @param c parent control
	 */
	void setHelpContext(Control c) {
		IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		helpSystem.setHelp(c, IHelpContext.REVIEW_WIZARD_PROOF);
	}

	
}
