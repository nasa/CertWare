package net.certware.example.wizards;

import java.text.MessageFormat;

import net.certware.example.Activator;
import net.certware.example.Example;
import net.certware.example.ExampleCategory;
import net.certware.example.ExampleChecklist;
import net.certware.example.ExampleContributions;
import net.certware.example.ExampleDocument;
import net.certware.example.ExamplePattern;

import org.eclipse.jface.action.Action;
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
 * A master-details block to show example candidates.
 * @author mrb
 * @since 1.0
 */
public class ScrolledPropertiesBlock extends MasterDetailsBlock {


	/** example contributions for the trees */
	private ExampleContributions ec;
	/** selected node in tree */
	//private ISelection selectedNode = null;
	/** containing wizard page, for access to buttons */
	private ExampleWizardPage wizardPage;

	
	/**
	 * Creates the scrolled properties block.
	 * Creates the supporting images.
	 * @param ec contributions class
	 */
	public ScrolledPropertiesBlock(ExampleContributions ec, ExampleWizardPage wp) {
		wizardPage = wp;
		this.ec = ec;
	}

	/**
	 * Disposes of resources used by this block.
	 */
	public void dispose() {
	}

	/**
	 * Tree content provider.
	 * Contributions info as root, categories as branches, examples as leaves.
	 */
	class MasterContentProvider implements ITreeContentProvider 
	{
		/**
		 * Gets the array of elements based on input.
		 */
		public Object[] getElements(Object inputElement) {

			// individual example contributions
			if (inputElement instanceof ExampleContributions) {
				ExampleContributions input = (ExampleContributions) inputElement;
				return input.getCategoriesArray();
			}
			
			// example contribution categories
			if ( inputElement instanceof ExampleCategory ) {
				ExampleCategory input = (ExampleCategory) inputElement;
				return input.getExamplesArray();
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
		  * @param parentElement parent object, either example contributions or example categories
		  * @return array of children for the parent, or null
		  */
		 public Object[] getChildren(Object parentElement)
		 {
			 if ( parentElement instanceof ExampleContributions ) {
				 return ((ExampleContributions)parentElement).getCategoriesArray();
			 }
			 
			 if ( parentElement instanceof ExampleCategory ) {
				 return ((ExampleCategory)parentElement).getExamplesArray();
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
			 if ( element instanceof ExampleCategory ) {
				 return ec;
			 }
			 
			 return null;
		 }

		 /**
		  * Whether the element has children.
		  * @param element to identify, either a SystemInfo or FileInfo
		  * @return true if element has non-empty children list, otherwise false
		  */
		 public boolean hasChildren(Object element)
		 {
			 if ( element instanceof ExampleContributions ) {
				 ExampleContributions si = (ExampleContributions)element;
				 if ( si.getCategories().isEmpty() == false )
					 return true;
			 }
			 
			 if ( element instanceof ExampleCategory ) {
				 ExampleCategory si = (ExampleCategory)element;
				 if ( si.getExamples().isEmpty() == false )
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
		 * Get the category or example name as the label text.
		 * @param obj object to label
		 * @return category or example name
		 */
		public String getText(Object obj) {

			if ( obj instanceof ExampleCategory ) {
				ExampleCategory c = (ExampleCategory)obj;
				return c.getName();
			}
			
			if ( obj instanceof Example ) {
				Example e = (Example)obj;
				return MessageFormat.format("{0} {1}", e.getName(), e.getVersion());
			}

			return obj.toString();
		}

		/**
		 * Get the image associated with the example type.
		 * @param obj object to identify
		 * @return image for category, document, pattern, or checklist type, or null
		 */
		public Image getImage(Object obj) {
			if ( obj instanceof ExampleCategory ) {
				return Activator.getDefault().getImageRegistry().get(Activator.EXAMPLE_CATEGORY_IMAGE);
			}

			if ( obj instanceof ExampleDocument ) {
				return Activator.getDefault().getImageRegistry().get(Activator.EXAMPLE_DOCUMENT_IMAGE);
			}

			if ( obj instanceof ExamplePattern ) {
				return Activator.getDefault().getImageRegistry().get(Activator.EXAMPLE_PATTERN_IMAGE);
			}

			if ( obj instanceof ExampleChecklist ) {
				return Activator.getDefault().getImageRegistry().get(Activator.EXAMPLE_CHECKLIST_IMAGE);
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
		// final ScrolledForm form = managedForm.getForm();
		FormToolkit toolkit = managedForm.getToolkit();
		Section section = toolkit.createSection(parent, Section.DESCRIPTION | Section.TITLE_BAR );
		section.setText("Contributed Examples");
		section.setDescription("Select a category or example for details");
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

		TreeViewer viewer = new TreeViewer(t);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				managedForm.fireSelectionChanged(spart, event.getSelection());
				wizardPage.setSelectedNode(event.getSelection());
			}
		});

		viewer.setContentProvider(new MasterContentProvider());
		viewer.setLabelProvider(new MasterLabelProvider());
		viewer.setInput(ec);
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
		haction.setImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor(Activator.EXAMPLE_HORIZONTAL_IMAGE));

		Action vaction = new Action("ver", Action.AS_RADIO_BUTTON) {
			public void run() {
				sashForm.setOrientation(SWT.VERTICAL);
				form.reflow(true);
			}
		};
		vaction.setChecked(false);
		vaction.setToolTipText("Vertical orientation");
		vaction.setImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor(Activator.EXAMPLE_VERTICAL_IMAGE));

		form.getToolBarManager().add(haction);
		form.getToolBarManager().add(vaction);
	}

	/**
	 * Adds the details pages for each master example type.
	 * There are pages for the pattern, checklist, and document types.
	 * There is no page for the branch category type.
	 */
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.registerPage(ExamplePattern.class, new PatternExamplePage(ec));
		detailsPart.registerPage(ExampleChecklist.class, new ChecklistExamplePage(ec));
		detailsPart.registerPage(ExampleDocument.class, new DocumentExamplePage(ec));
	}


}