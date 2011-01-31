/**
 * CertWare Project.
 * Copyright (c) 2011 Kestrel Technology LLC.
 */
package net.certware.measurement.sco.view;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.core.ui.resources.FileFinder;
import net.certware.core.ui.resources.FileOpener;
import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ArtifactList;
import net.certware.measurement.sco.ChangeOrderCount;
import net.certware.measurement.sco.impl.ArtifactIdentifierImpl;
import net.certware.measurement.sco.impl.CriticalDefectChangeOrdersImpl;
import net.certware.measurement.sco.impl.ImprovementChangeOrdersImpl;
import net.certware.measurement.sco.impl.NewFeatureChangeOrdersImpl;
import net.certware.measurement.sco.impl.NormalDefectChangeOrdersImpl;
import net.certware.measurement.sco.provider.ScoItemProviderAdapterFactory;
import net.certware.measurement.sco.util.ScoResourceImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.HyperlinkSettings;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.ViewPart;

/**
 * SCO model viewer.
 * Master-details layout on a view.  
 * Selecting an SCO file in the workbench refreshes the view.
 * @author mrb
 * @since 1.0.3
 */
public class ScoViewMasterDetails extends ViewPart implements ISelectionListener, ICertWareConstants, IResourceChangeListener {

	/** form toolkit */
	FormToolkit toolkit;
	/** scrolled form on the part */
	ScrolledForm form;
	/** selected SCO file */
	IFile selectedFile = null;
	/** selected file opener */
	Hyperlink fileLink = null;
	/** selected results model */
	ArtifactList artifactList;
	/** default section style */
	int sectionStyle = Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED;
	/** bold font from resources */
	Font boldFont;
	/** tree viewer, loaded with EMF controls */
	TreeViewer viewer;
	
	@Override
	public void createPartControl(Composite parent) {
		
		toolkit = new FormToolkit(parent.getDisplay());
		
		// scrolled form on which to place the block
		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayout(new FillLayout());
		
    	form = toolkit.createScrolledForm(composite);
		form.setImage( Activator.getDefault().getImageRegistry().get( Activator.SCO_IMAGE ));
		form.setText("Software Change Orders");
		form.setMessage(null, IMessageProvider.NONE);
	    form.setToolTipText("Select an SCO file in the workbench");
	    // form.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_CYAN)); // for margin testing
	    toolkit.decorateFormHeading(form.getForm());
	    
		// retrieve the bold font
		FontRegistry fontRegistry = new FontRegistry(parent.getDisplay());
		boldFont = fontRegistry.getBold(JFaceResources.DEFAULT_FONT);
    	
    	// master-details setup
    	IManagedForm managedForm = new ManagedForm(toolkit, form);
    	ScrolledPropertiesBlock block = new ScrolledPropertiesBlock();
    	block.createContent(managedForm);
		
		// workbench selection listener
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);

		// resource change listener
	    ResourcesPlugin.getWorkspace().addResourceChangeListener(this, 
	    	      IResourceChangeEvent.POST_CHANGE | IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.PRE_DELETE );

	    /* does nothing
	    GridData gd = new GridData();
	    gd.horizontalIndent = 20;
	    gd.verticalIndent = 30;
	    form.setLayoutData(gd);
	    */
	    
		form.layout(true);
		form.reflow(true);
	}

	/**
	 * Refresh the part.
	 */
	protected void refreshPart() {
		// update the input to the tree viewer in the master part
		viewer.setInput(artifactList);		
		form.reflow(true);
	}
	
	
	@Override
	public void setFocus() {
		form.setFocus();
	}

	/**
	 * Disposes the toolkit.
	 * Removes the listeners for the workbench and resources.
	 */
	@Override
	public void dispose() {
		toolkit.dispose();
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
	    ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	/**
	 * Refreshes the model object given the selected file.
	 * Loads using the resource set contents.
	 * Does not refresh the display.
	 */
	protected void refreshModelFromFile() {
		if ( selectedFile == null )
			return;
		
		try {
	        // load the XML file through the EMF resource set implementation
	        ResourceSet resourceSet = new ResourceSetImpl();
	        Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true), true);
	        ArtifactList documentRoot = (ArtifactList)resource.getContents().get(0);
	        if ( documentRoot != null ) {
	          artifactList = documentRoot;
	        }
	      } catch( Exception exception ) {
	        CertWareLog.logError(String.format("%s %s", "Document root null loading" + selectedFile.getName()), exception);
	      }
	}
	
	/**
	 * Captures the selected file name if it matches our interest.
	 * @param part workbench part
	 * @param selection structured selection expecting IFile or EObject
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// skip the selection change if it came from this part
		if ( part != ScoViewMasterDetails.this ) {
			
			if ( selection instanceof IStructuredSelection ) {
				IStructuredSelection iss = (IStructuredSelection)selection;
				Object object = iss.getFirstElement();

				// save the selection if it's an SCO file
				if ( object instanceof IFile ) {
					IFile f = (IFile)object;
					if ( f.getFileExtension().equalsIgnoreCase( ICertWareConstants.SCO_EXTENSION )) {
						selectedFile = (IFile)f;
						refreshModelFromFile();
						refreshPart();
						return;
					}
				}

				// save the resource if it's an editor object
				if ( object instanceof EObject ) {
					
				    EObject eo = (EObject)object;
				    
				    if ( eo != null ) {
				    	if ( eo instanceof ArtifactList ) {
					        artifactList = (ArtifactList)eo;
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}
				    	
				    	EObject container = eo.eContainer();
				    	
				    	if ( container instanceof ArtifactList ) {
					        artifactList = (ArtifactList)container;
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}
				    	
				    	if ( container instanceof ArtifactIdentifier ) {
				    		ArtifactIdentifier ai = (ArtifactIdentifier)container;
				    		artifactList = (ArtifactList)ai.eContainer();
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}
				    	
				    	if ( container instanceof ScoResourceImpl ) {
				    		// might do something with contents later
				    		return;
				    	}

				    }
				}
			}
		}

	}


	@Override
	public void resourceChanged(IResourceChangeEvent event) {
	    try {
	      event.getDelta().accept(new IResourceDeltaVisitor() {
	        
	        public boolean visit(IResourceDelta delta) throws CoreException {
	          if ( delta.getKind() == IResourceDelta.REMOVED ) {
	            // selected results file
	            if ( selectedFile != null )
	              if ( delta.getResource() instanceof IFile && selectedFile.equals(delta.getResource()) ) {
	            	  selectedFile = null;
	            	  refreshPart();
	              }
	          } // removed
	          else
	          if ( delta.getKind() == IResourceDelta.CHANGED ) {
	            if ( selectedFile != null )
	                if ( delta.getResource() instanceof IFile && selectedFile.equals(delta.getResource()) ) {
	                	refreshPart();
	                }
	          } // changed
	          return true;
	        }
	      });
	    } catch( CoreException ce ) {
	      CertWareLog.logWarning("Refreshing SCO file" + ce.getMessage());
	    }

		
	}
	
	/**
	 * Master details block, scrolled in the parent container.
	 * Registers two details pages, one for artifact identifiers, one for change orders.
	 */
	public class ScrolledPropertiesBlock extends MasterDetailsBlock {

		// private Label commitId;

		/**
		 * Create the master part.
		 * Creates the section with a tree container and viewer.
		 * Uses the EMF providers for tree content.
		 * @param managedForm managed form scroll parent
		 * @param parent container
		 */
		protected void createMasterPart(final IManagedForm managedForm,	Composite parent) {

			FormToolkit toolkit = managedForm.getToolkit();

			/*
			TableWrapLayout layout = new TableWrapLayout();
			layout.topMargin = 5; // this value does move the comp within the sash
			layout.leftMargin = 5;
			layout.rightMargin = 5;
			layout.bottomMargin = 5;
			layout.numColumns = 1;
			parent.setLayout(layout);
			*/

			// parent.setLayoutData(new GridData(GridData.FILL_BOTH)); // fill both here ensures the block fills the view
			
			/* does nothing
			GridData g1 = new GridData();
			g1.verticalIndent = 20;
			g1.horizontalIndent = 30;
			managedForm.getForm().setLayoutData(g1); 
			*/
			
			// managedForm.getForm().setLayoutData(new GridData()); // does nothing
			/* there are no parts at this point
			IFormPart[] parts = managedForm.getParts();
			for ( IFormPart p : parts ) {
				System.err.println("part " + p);
			}
			*/
			
			Section treeSection = toolkit.createSection(parent, Section.TITLE_BAR);
			treeSection.setText("Model Objects");
			toolkit.createCompositeSeparator(treeSection);
			
			TableWrapLayout wrapLayout = new TableWrapLayout();
			wrapLayout.numColumns = 2;
			treeSection.setLayout(wrapLayout);
			
			/* does nothing
			GridData g1 = new GridData();
			g1.verticalIndent = 20;
			g1.horizontalIndent = 30;
			treeSection.setLayoutData( g1 );
			*/

			// tree client on the tree section
			// the tree itself has a grid layout, its container a table layout
			Composite treeClient = toolkit.createComposite(treeSection, SWT.WRAP);
			GridLayout gridLayout = new GridLayout();
			// gridLayout.marginLeft = 40; this moves the tree box, not the section container
			treeClient.setLayout(gridLayout);
			TableWrapData tctw = new TableWrapData();
			tctw.colspan = 2;
			treeClient.setLayoutData(tctw);

			/*
			Label commitLabel = toolkit.createLabel(treeClient,"Commit");
			commitLabel.setLayoutData(new TableWrapData());
			commitId = toolkit.createLabel(treeClient,"");
			commitId.setLayoutData(new TableWrapData());
			*/

			// tree on the tree client
			Tree tree = toolkit.createTree(treeClient, SWT.NULL);
			GridData gd2 = new GridData(GridData.FILL_BOTH); // works to fill master container
			gd2.heightHint = 100;
			gd2.widthHint = 150;
			tree.setLayoutData(gd2);
			toolkit.paintBordersFor(treeClient);
			treeSection.setClient(treeClient);
			
			final SectionPart spart = new SectionPart(treeSection);
			managedForm.addPart(spart);

			// tree viewer
			ScoItemProviderAdapterFactory factory = new ScoItemProviderAdapterFactory();
			viewer = new TreeViewer(tree);
			viewer.setContentProvider(new AdapterFactoryContentProvider(factory));
			viewer.setLabelProvider(new	AdapterFactoryLabelProvider(factory));
			viewer.setInput(artifactList);
			viewer.expandAll();
			viewer.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					managedForm.fireSelectionChanged(spart, event.getSelection());
				}
			});
			
		}

		/**
		 * Creates the typical horizontal and vertical layout actions.
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
			haction.setImageDescriptor(Activator.getDefault()
					.getImageRegistry()
					.getDescriptor(Activator.HORIZONTAL_IMAGE));
			
			Action vaction = new Action("ver", Action.AS_RADIO_BUTTON) {
				public void run() {
					sashForm.setOrientation(SWT.VERTICAL);
					form.reflow(true);
				}
			};
			vaction.setChecked(false);
			vaction.setToolTipText("Vertical orientation");
			vaction.setImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor(Activator.VERTICAL_IMAGE));
			form.getToolBarManager().add(haction);
			form.getToolBarManager().add(vaction);
		}

		/**
		 * Registers detail pages by class.
		 */
		protected void registerPages(DetailsPart detailsPart) {
			detailsPart.registerPage(ArtifactIdentifierImpl.class, new ArtifactIdentifierDetailsPage());
			detailsPart.registerPage(CriticalDefectChangeOrdersImpl.class, new ChangeOrderDetailsPage());
			detailsPart.registerPage(NormalDefectChangeOrdersImpl.class, new ChangeOrderDetailsPage());
			detailsPart.registerPage(ImprovementChangeOrdersImpl.class, new ChangeOrderDetailsPage());
			detailsPart.registerPage(NewFeatureChangeOrdersImpl.class, new ChangeOrderDetailsPage());
		}
	}

	/**
	 * Details page for artifact identifier objects. 
	 * @author mrb
	 */
	public class ArtifactIdentifierDetailsPage implements IDetailsPage {
		Composite client;
		ArtifactIdentifier artifactIdentifier;
		boolean stale = true;
		FormToolkit myToolkit;
		Label baselinedValue;
		Label currentValue;
		Hyperlink resourceValue = null;
		
		@Override
		public void initialize(IManagedForm form) {
			myToolkit = form.getToolkit();
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean isDirty() {
			return false;
		}

		@Override
		public void commit(boolean onSave) {
		}

		@Override
		public boolean setFormInput(Object input) {
			if ( input instanceof ArtifactIdentifier ) {
				artifactIdentifier = (ArtifactIdentifier)input;
				refresh();
				return true;
			}
			return false;
		}

		@Override
		public void setFocus() {
		}

		@Override
		public boolean isStale() {
			return stale;
		}

		@Override
		public void refresh() {
			resourceValue.setText(artifactIdentifier.getResourceName());
			baselinedValue.setText(String.format("%d lines",artifactIdentifier.getBaselinedLineCount()));
			currentValue.setText(String.format("%d lines",artifactIdentifier.getBaselinedLineCount()));
			stale = false;
			client.getParent().layout(true);
		}

		@Override
		public void selectionChanged(IFormPart part, ISelection selection) {
			if ( selection instanceof TreeSelection ) {
				TreeSelection ts = (TreeSelection)selection;
				artifactIdentifier = (ArtifactIdentifier)ts.getFirstElement();
				stale = true;
				setFormInput(artifactIdentifier);
			}
		}

		@Override
		public void createContents(Composite parent) {
			
			TableWrapLayout layout = new TableWrapLayout();
			layout.topMargin = 0; 
			layout.leftMargin = 5;
			layout.rightMargin = 5;
			layout.bottomMargin = 5;
			layout.numColumns = 1;
			parent.setLayout(layout);
			
			Section section = myToolkit.createSection(parent, Section.TITLE_BAR );
			section.setText("Artifact Identifier");
			section.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
			toolkit.createCompositeSeparator(section);
			
			client = myToolkit.createComposite(section);
			TableWrapLayout dcl = new TableWrapLayout();
			dcl.numColumns = 2;
			client.setLayout( dcl );

			Label resourceName = myToolkit.createLabel(client, "Resource name");
			resourceName.setFont(boldFont);
			resourceName.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			toolkit.getHyperlinkGroup().setHyperlinkUnderlineMode(HyperlinkSettings.UNDERLINE_HOVER);
			resourceValue = toolkit.createHyperlink(client,"Hyperlink", SWT.WRAP);
			resourceValue.setToolTipText("Click file name to open in editor");
			resourceValue.setFont(JFaceResources.getDialogFont());
			resourceValue.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));
			resourceValue.addHyperlinkListener(new HyperlinkAdapter() {
				public void linkActivated(HyperlinkEvent e) {
					// find the resource (first occurrence in workspace), open it
					IFile myFile = FileFinder.findResourceByName(resourceValue.getText());
					FileOpener.findResourceEditor(myFile);
				}
			});

			Label baselinedLines = myToolkit.createLabel(client,"Baselined lines");
			baselinedLines.setFont(boldFont);
			baselinedLines.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			baselinedValue = myToolkit.createLabel(client,"");
			baselinedValue.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			Label currentLines = myToolkit.createLabel(client,"Current lines");
			currentLines.setFont(boldFont);
			currentLines.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			currentValue = myToolkit.createLabel(client,"");
			currentValue.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			section.setClient(client);
			stale = false;
			// parent.setSize(300, 100);
		}
		
	}
	
	public class ChangeOrderDetailsPage implements IDetailsPage {
		Composite client;
		ChangeOrderCount changeOrder;
		boolean stale = true;
		FormToolkit myToolkit;
		Label changeOrderValue;
		Label changeOrderBroken;
		Label changeType;
		Label changeOrderFixed;
		Label changeOrderRepair;
		
		@Override
		public void initialize(IManagedForm form) {
			myToolkit = form.getToolkit();
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean isDirty() {
			return false;
		}

		@Override
		public void commit(boolean onSave) {
		}

		@Override
		public boolean setFormInput(Object input) {
			if ( input instanceof ChangeOrderCount ) {
				changeOrder = (ChangeOrderCount)input;
				refresh();
				return true;
			}
			return false;
		}

		@Override
		public void setFocus() {
		}

		@Override
		public boolean isStale() {
			return stale;
		}

		@Override
		public void refresh() {
			changeType.setText(changeOrder.getType().getLiteral());
			changeOrderValue.setText(String.format("%d orders",changeOrder.getValue()));
			changeOrderBroken.setText(String.format("%d lines",changeOrder.getBrokenLines()));
			changeOrderFixed.setText(String.format("%d lines",changeOrder.getFixedLines()));
			changeOrderRepair.setText(String.format("%6.1f hrs",changeOrder.getRepairEffort()));
			stale = false;
			client.getParent().layout(true);
		}

		@Override
		public void selectionChanged(IFormPart part, ISelection selection) {
			if ( selection instanceof TreeSelection ) {
				TreeSelection ts = (TreeSelection)selection;
				changeOrder = (ChangeOrderCount)ts.getFirstElement();
				stale = true;
				setFormInput(changeOrder);
			}
		}

		@Override
		public void createContents(Composite parent) {
			
			TableWrapLayout layout = new TableWrapLayout();
			layout.topMargin = 0;
			layout.leftMargin = 5;
			layout.rightMargin = 5;
			layout.bottomMargin = 5;
			layout.numColumns = 1;
			parent.setLayout(layout);
			
			Section section = myToolkit.createSection(parent, Section.TITLE_BAR );
			section.setText("Change Order");
			section.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
			toolkit.createCompositeSeparator(section);
			
			client = myToolkit.createComposite(section);
			TableWrapLayout dcl = new TableWrapLayout();
			dcl.numColumns = 2;
			client.setLayout( dcl );

			Label changeTypeName = myToolkit.createLabel(client, "Type");
			changeTypeName.setFont(boldFont);
			changeTypeName.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			changeType = myToolkit.createLabel(client,"");
			changeType.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			Label changeOrderValueLabel = myToolkit.createLabel(client,"Count");
			changeOrderValueLabel.setFont(boldFont);
			changeOrderValueLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			changeOrderValue = myToolkit.createLabel(client,"");
			changeOrderValue.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			Label changeOrderBrokenLabel = myToolkit.createLabel(client,"Broken");
			changeOrderBrokenLabel.setFont(boldFont);
			changeOrderBrokenLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			changeOrderBroken = myToolkit.createLabel(client,"");
			changeOrderBroken.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			Label changeOrderFixedLabel = myToolkit.createLabel(client,"Fixed");
			changeOrderFixedLabel.setFont(boldFont);
			changeOrderFixedLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			changeOrderFixed = myToolkit.createLabel(client,"");
			changeOrderFixed.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			Label changeOrderRepairLabel = myToolkit.createLabel(client,"Repair");
			changeOrderRepairLabel.setFont(boldFont);
			changeOrderRepairLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			changeOrderRepair = myToolkit.createLabel(client,"");
			changeOrderRepair.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			section.setClient(client);
			stale = false;
		}
	}
	
}
