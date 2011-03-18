package net.certware.argument.sfp.review.wizard;

import java.text.MessageFormat;

import net.certware.argument.sfp.review.Activator;
import net.certware.argument.sfp.semiFormalProof.Proof;
import net.certware.argument.sfp.semiFormalProof.Statement;
import net.certware.argument.sfp.semiFormalProof.ValidationKind;
import net.certware.argument.sfp.semiFormalProof.impl.ProofImpl;
import net.certware.argument.sfp.semiFormalProof.impl.StatementImpl;
import net.certware.argument.sfp.util.ProofUtil;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

/**
 * A master-details block to show proof statements.
 * @author mrb
 * @since 1.0.3
 */
public class ScrolledPropertiesBlock extends MasterDetailsBlock {

	/** proof statements for the trees */
	private Proof proof;
	/** containing wizard page, for access to buttons */
	private ReviewValidatePage validatePage;
	/** wizard setup page */
	private ReviewSetupPage setupPage;
	/** image registry */
	private ImageRegistry imageRegistry;
	/** tree viewer */
	private TreeViewer viewer;
	/** model container */
	private ModelContainer model;
	private ProofDetailPage proofDetailPage;
	private StatementDetailPage statementDetailPage;
	
	/**
	 * Creates the scrolled properties block.
	 * Creates the supporting images.
	 * @param proof proof to display and validate
	 * @param wp wizard page for parent reference
	 */
	public ScrolledPropertiesBlock(Proof proof, ReviewValidatePage wp, ReviewSetupPage sp) {
		validatePage = wp;
		setupPage = sp;
		this.imageRegistry = Activator.getDefault().getImageRegistry();
		this.proof = proof;
		
		// create a dummy container to serve as tree root
		model = new ModelContainer();
		model.proof = proof;
	}

	/**
	 * Disposes of resources used by this block.
	 */
	public void dispose() {
		if ( proofDetailPage != null )
			proofDetailPage.dispose();
		if ( statementDetailPage != null )
			statementDetailPage.dispose();
	}

	/**
	 * Tree content provider.
	 * Proof is root, statements are leaves
	 */
	class MasterContentProvider implements ITreeContentProvider 
	{
		/**
		 * Gets the array of elements based on input.
		 */
		public Object[] getElements(Object inputElement) {
			
			// model container provides proof
			if ( inputElement instanceof ModelContainer ) {
				ModelContainer mc = (ModelContainer)inputElement;
				return new Object[] { mc.proof };
			}
			
			// individual proof statements
			if (inputElement instanceof Proof) {
				Proof p = (Proof)inputElement;
				if ( p.getProofSteps() == null ) {
					return new Object[0];
				}
				return p.getProofSteps().getStatements().toArray();
			}
			
			
			return new Object[0];
		}

		/**
		 * Nothing to dispose.
		 */
		 public void dispose() {
		 }

		 /**
		  * Input changed for provider.  Unused.
		  */
		 public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		 }

		 /**
		  * Returns the children of the given parent object.
		  * @param parentElement parent object, a proof
		  * @return array of children for the parent, or null
		  */
		 public Object[] getChildren(Object parentElement)
		 {
			 if ( parentElement instanceof Proof ) {
				 Proof p = (Proof)parentElement;
				 if ( p.getProofSteps() == null ) {
					 return null;
				 }
				 return p.getProofSteps().getStatements().toArray();
			 }
			 
			 return null;
		 }

		 /**
		  * Returns the parent of the given element.  
		  * @param element child to find parent, supports category only
		  * @return container parent of the element (a category object), or null
		  */
		 public Object getParent(Object element)
		 {
			 if ( element instanceof Statement ) {
				 return proof;
			 }
			 
			 return null;
		 }

		 /**
		  * Whether the element has children.
		  * @param element to identify
		  * @return true if element has non-empty children list, otherwise false
		  */
		 public boolean hasChildren(Object element)
		 {
			 if ( element instanceof Proof ) {
				 Proof p = (Proof)element;
				 if ( p.getProofSteps() != null && p.getProofSteps().getStatements().isEmpty() == false )
					 return true;
			 }

			 return false;
		 }
	}


	
	/**
	 * Label provider class.
	 */
	class MasterLabelProvider implements  ILabelProvider 
	{
		/**
		 * Get the proof or statement as the label text.
		 * @param obj object to label
		 * @return proof or statement label text
		 */
		public String getText(Object obj) {

			if ( obj instanceof Proof ) {
				Proof p = (Proof)obj;
				return MessageFormat.format("{0}: {1}", "Theorem:", p.getTitle());
			}
			
			if ( obj instanceof Statement ) {
				Statement s = (Statement)obj;
				if ( ProofUtil.statementIsHypothesis(s) ) {
					return MessageFormat.format("{0}. {1} ({2})", 
							s.getId(), s.getStatement(), "hypothesis");
				}
				if ( ProofUtil.statementIsEpsilon(s) ) {
					return MessageFormat.format("{0}. {1} ({2})", 
							s.getId(), s.getStatement(), "epsilon");
				}
				return MessageFormat.format("{0}. {1}", s.getId(), s.getStatement());
			}

			return obj.toString();
		}

		/**
		 * Get the image associated with the statement type.
		 * @param obj object to identify
		 * @return image for proof, hypothesis, statement, or null
		 */
		public Image getImage(Object obj) {
			
			// proof image based on validation of statements
			if ( obj instanceof Proof ) {
				Proof p = (Proof)obj;
				ValidationKind vk = ProofUtil.getProofValidationKind(p);
				if ( vk == ValidationKind.INVALID )
					return imageRegistry.get( Activator.REVIEW_INVALID_IMAGE );
				if ( vk == ValidationKind.VALID )
					return imageRegistry.get( Activator.REVIEW_VALID_IMAGE );
				return imageRegistry.get( Activator.REVIEW_UNKNOWN_IMAGE );
			}

			// statement image based on its validation
			if ( obj instanceof Statement ) {
				Statement s = (Statement)obj;
				if ( s.getValidation() != null ) {
					if ( s.getValidation().getState().getValue() == ValidationKind.INVALID_VALUE ) {
						return imageRegistry.get( Activator.REVIEW_INVALID_IMAGE );
					}
					if ( s.getValidation().getState().getValue() == ValidationKind.VALID_VALUE ) {
						return imageRegistry.get( Activator.REVIEW_VALID_IMAGE );
					}
				}
				return imageRegistry.get( Activator.REVIEW_UNKNOWN_IMAGE );
			}

			return null;
		}

		/**
		 * Not used.
		 */
		public void addListener(ILabelProviderListener listener)
		{
		}

		/**
		 * Not used.
		 */
		public void dispose()
		{
		}

		/**
		 * @return always returns false
		 */
		public boolean isLabelProperty(Object element, String property)
		{
			return false;
		}

		/**
		 * Not used.
		 */
		public void removeListener(ILabelProviderListener listener)
		{
		}
	}

	/**
	 * Creates the master part of the master-details block.
	 * @param managedForm managed for for toolkit reference
	 * @param parent composite parent for the part; we put a new composite on it
	 */
	protected void createMasterPart(final IManagedForm managedForm, Composite parent) 
	{
		FormToolkit toolkit = managedForm.getToolkit();

		Section section = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR );
		section.setText("Proof Statements");
		section.setDescription("Select a statement to review");
		section.marginWidth = 10;
		section.marginHeight = 5;
		toolkit.createCompositeSeparator(section);

		Composite client = toolkit.createComposite(section, SWT.WRAP);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		client.setLayout(layout);
		Tree t = toolkit.createTree(client, SWT.NULL);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 300;
		gd.widthHint = 200;
		t.setLayoutData(gd);
		toolkit.paintBordersFor(client);
		section.setClient(client);

		final SectionPart spart = new SectionPart(section);
		managedForm.addPart(spart);

		viewer = new TreeViewer(t);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				managedForm.fireSelectionChanged(spart, event.getSelection());
				validatePage.setSelectedNode(event.getSelection());
			}
		});

		viewer.setContentProvider(new MasterContentProvider());
		viewer.setLabelProvider(new MasterLabelProvider());
		viewer.setInput( model ); 
		viewer.expandAll();
	}

	/**
	 * Create toolbar actions to change the layout from vertical to horizontal orientation.
	 * @param managedForm form reference for toolbar manager
	 */
	protected void createToolBarActions(IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();

		Action haction = new Action("hor", Action.AS_RADIO_BUTTON) {
			public void run() {
				sashForm.setOrientation(SWT.HORIZONTAL);
				form.reflow(true);
			}
		};
		haction.setChecked(true);
		haction.setToolTipText("Horizontal orientation");
		haction.setImageDescriptor( Activator.getDefault().getImageRegistry().getDescriptor( Activator.REVIEW_HORIZONTAL_IMAGE));

		Action vaction = new Action("ver", Action.AS_RADIO_BUTTON) {
			public void run() {
				sashForm.setOrientation(SWT.VERTICAL);
				form.reflow(true);
			}
		};
		vaction.setChecked(false);
		vaction.setToolTipText("Vertical orientation");
		vaction.setImageDescriptor( Activator.getDefault().getImageRegistry().getDescriptor( Activator.REVIEW_VERTICAL_IMAGE ));

		form.getToolBarManager().add(haction);
		form.getToolBarManager().add(vaction);
	}

	/**
	 * Adds the details pages for each master example type.
	 * There are pages for statements and proofs.
	 */
	protected void registerPages(DetailsPart detailsPart) {
		proofDetailPage = new ProofDetailPage(proof,viewer,validatePage,setupPage);
		statementDetailPage = new StatementDetailPage(proof,viewer,validatePage,setupPage);
		detailsPart.registerPage(ProofImpl.class, proofDetailPage);
		detailsPart.registerPage(StatementImpl.class, statementDetailPage );
	}

	class ModelContainer {
		Proof proof;
	}

}