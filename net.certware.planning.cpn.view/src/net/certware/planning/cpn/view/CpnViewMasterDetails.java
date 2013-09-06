/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.planning.cpn.view;

import java.util.ArrayList;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.core.ui.resources.FileFinder;
import net.certware.core.ui.resources.FileOpener;
import net.certware.planning.cpn.cpnDsl.Allocation;
import net.certware.planning.cpn.cpnDsl.ArgumentModels;
import net.certware.planning.cpn.cpnDsl.Plan;
import net.certware.planning.cpn.cpnDsl.Plans;
import net.certware.planning.cpn.cpnDsl.impl.AllocationImpl;
import net.certware.planning.cpn.cpnDsl.impl.ArgumentModelsImpl;
import net.certware.planning.cpn.cpnDsl.impl.PlanImpl;
import net.certware.sacm.SACM.ModelElement;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
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
import org.eclipse.swt.widgets.Text;
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
 * CPN model viewer.
 * Master-details layout on a view.  
 * Selecting a CPN file in the workbench refreshes the view.
 * @author mrb
 * @since 1.1
 */
public class CpnViewMasterDetails extends ViewPart implements ISelectionListener, ICertWareConstants, IResourceChangeListener {

	/** form toolkit */
	FormToolkit toolkit;
	/** scrolled form on the part */
	ScrolledForm form;
	/** selected CPN file */
	IFile selectedFile = null;
	/** selected file opener */
	Hyperlink fileLink = null;
	/** selected plans model */
	Plans plans;
	/** default section style */
	int sectionStyle = Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED;
	/** bold font from resources */
	Font boldFont;
	/** tree viewer, loaded with EMF controls */
	TreeViewer viewer;
	/** commit id label */
	Label commitId;
	/** usage time label */
	Label usageTime;
	
	@Override
	public void createPartControl(Composite parent) {
		
		toolkit = new FormToolkit(parent.getDisplay());
		
		// scrolled form on which to place the block
		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayout(new FillLayout());
		
    	form = toolkit.createScrolledForm(composite);
		form.setImage( Activator.getDefault().getImageRegistry().get( Activator.CPN_IMAGE ));
		form.setText("CertWare Planning Notation");
		form.setMessage(null, IMessageProvider.NONE);
	    form.setToolTipText("Select a CPN file in the workbench");
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
	    	      IResourceChangeEvent.POST_CHANGE | 
	    	      IResourceChangeEvent.PRE_CLOSE | 
	    	      IResourceChangeEvent.PRE_DELETE );

		form.layout(true);
		form.reflow(true);
	}

	/**
	 * Refresh the part.
	 */
	protected void refreshPart() {
		// update the input to the tree viewer in the master part
		viewer.setInput(plans);
		
		// update master side fields
		if ( plans != null ) {
			// none
		}

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
	        Plans documentRoot = (Plans)resource.getContents().get(0);
	        if ( documentRoot != null ) {
	          plans = documentRoot;
	        }
	      } catch( Exception exception ) {
	        CertWareLog.logError(String.format("%s %s", 
	        		"Document root null loading" + selectedFile.getName()), 
	        		exception);
	      }
	}
	
	/**
	 * Sets the selected file.
	 * For use by other actions.
	 * @param sf selected file
	 */
	public void setSelectedFile(IFile sf) {
		if ( sf != null ) {
			if ( sf != selectedFile ) {
				selectedFile = sf;
				refreshModelFromFile();
				refreshPart();
			}
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
		if ( part != CpnViewMasterDetails.this ) {
			
			if ( selection instanceof IStructuredSelection ) {
				IStructuredSelection iss = (IStructuredSelection)selection;
				Object object = iss.getFirstElement();
				
				// save the selection if it's a CPN file
				if ( object instanceof IFile ) {
					IFile f = (IFile)object;
					// skip if already loaded
					if ( f == selectedFile )
						return;

					if ( f.getFileExtension().equalsIgnoreCase( ICertWareConstants.CPN_EXTENSION )) {
						setSelectedFile((IFile)f);
					}
					return;
				}

				// save the resource if it's an editor object
				if ( object instanceof EObject ) {
					
				    EObject eo = (EObject)object;

				    if ( eo != null ) {
				    	if ( eo instanceof Plans ) {
					        plans = (Plans)eo;
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}
				    	
				    	EObject container = eo.eContainer();
				    	
				    	if ( container instanceof Plans ) {
					        plans = (Plans)container;
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}
				    	
				    	if ( container instanceof Plan ) {
				    		Plan p = (Plan)container;
				    		plans = (Plans)p.eContainer();
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}

				    	if ( container instanceof ArgumentModels ) {
				    		ArgumentModels am = (ArgumentModels)container;
				    		plans = (Plans)am.eContainer();
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}
				    }
				}
			}
		}
	}


	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		if ( event == null || event.getDelta() == null ) {
			return;
		}
		
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
	      CertWareLog.logWarning("Refreshing CPN file" + ce.getMessage());
	    }

		
	}
	
	/**
	 * Master details block, scrolled in the parent container.
	 * Registers two details pages, one for artifact identifiers, one for change orders.
	 */
	public class ScrolledPropertiesBlock extends MasterDetailsBlock {

		/**
		 * Create the master part.
		 * Creates the section with a tree container and viewer.
		 * Uses the EMF providers for tree content.
		 * @param managedForm managed form scroll parent
		 * @param parent container
		 */
		protected void createMasterPart(final IManagedForm managedForm,	Composite parent) {

			FormToolkit toolkit = managedForm.getToolkit();

			Section treeSection = toolkit.createSection(parent, Section.TITLE_BAR);
			treeSection.setText("Model Objects");
			toolkit.createCompositeSeparator(treeSection);
			
			TableWrapLayout wrapLayout = new TableWrapLayout();
			wrapLayout.numColumns = 2;
			treeSection.setLayout(wrapLayout);
			
			// tree client on the tree section
			// the tree itself has a grid layout, its container a table layout
			Composite sectionClient = toolkit.createComposite(treeSection, SWT.WRAP);
			GridLayout gridLayout = new GridLayout(2,false);
			sectionClient.setLayout(gridLayout);
			TableWrapData tctw = new TableWrapData();
			tctw.colspan = 2;
			sectionClient.setLayoutData(tctw);

			// tree on the tree client
			Tree tree = toolkit.createTree(sectionClient, SWT.NULL);
			GridData gd2 = new GridData(GridData.FILL,GridData.FILL,true,true); // works to fill master container
			gd2.horizontalSpan = 2;
			gd2.heightHint = 100;
			gd2.widthHint = 200;
			tree.setLayoutData(gd2);
			
			toolkit.paintBordersFor(sectionClient);
			treeSection.setClient(sectionClient);
			
			final SectionPart spart = new SectionPart(treeSection);
			managedForm.addPart(spart);

			// tree viewer
			// xtext does not create an item provider adapter factory, so we concoct a reflective one here
			// disadvantaged by not finding the xtext image provider adapter factory
			ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
	        factories.add(new ResourceItemProviderAdapterFactory());
	        // factories.add(new CpnDslAdapterFactory());
	        factories.add(new EcoreItemProviderAdapterFactory());
	        factories.add(new ReflectiveItemProviderAdapterFactory());
			ComposedAdapterFactory factory = new ComposedAdapterFactory(factories);
	        
			viewer = new TreeViewer(tree);
			viewer.setContentProvider(new AdapterFactoryContentProvider(factory));
			viewer.setLabelProvider(new	AdapterFactoryLabelProvider(factory));
			viewer.setInput(plans);
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
			detailsPart.registerPage(ArgumentModelsImpl.class, new ArgumentModelsDetalsPage());
			detailsPart.registerPage(PlanImpl.class, new PlanDetailsPage());
			detailsPart.registerPage(AllocationImpl.class, new AllocationDetailsPage());
		}
	}

	/**
	 * Details page for argument model objects. 
	 */
	public class ArgumentModelsDetalsPage implements IDetailsPage {
		Composite client;
		ArgumentModels argumentModel;
		boolean stale = true;
		FormToolkit myToolkit;
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
			if ( input instanceof ArgumentModels ) {
				argumentModel = (ArgumentModels)input;
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
			String i = argumentModel.getImportURI() == null ? "<n/a>" : argumentModel.getImportURI();
			resourceValue.setText(i);
			stale = false;
			client.getParent().layout(true);
		}

		@Override
		public void selectionChanged(IFormPart part, ISelection selection) {
			if ( selection instanceof TreeSelection ) {
				TreeSelection ts = (TreeSelection)selection;
				argumentModel = (ArgumentModels)ts.getFirstElement();
				stale = true;
				setFormInput(argumentModel);
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
			section.setText("Argument Model");
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

			section.setClient(client);
			stale = false;
		}
	}

	/**
	 * Plan item details page.
	 */
	public class PlanDetailsPage implements IDetailsPage {
		Composite client;
		Plan plan;
		boolean stale = true;
		FormToolkit myToolkit;
		Label planId;
		Label modelElementId;
		Text modelElementContent;
		Text modelElementDescription;
		
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
			if ( input instanceof Plan ) {
				plan = (Plan)input;
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
			String pid = plan.getId() == null ? "" : plan.getId();
			planId.setText(pid);
			planId.setToolTipText(pid);

			ModelElement me = plan.getElement();
			String mid = me.getId() == null ? "" : me.getId();
			//String mec = me.getContent() == null ? "" : me.getContent();
			//String med = me.getDescription() == null ? "" : me.getDescription();

			modelElementId.setText(mid);
			modelElementId.setToolTipText(mid);
			//modelElementContent.setText(mec);
			//modelElementContent.setToolTipText(mec);
			//modelElementDescription.setText(med);
			//modelElementDescription.setToolTipText(med);

			stale = false;
			client.getParent().layout(true);
		}

		@Override
		public void selectionChanged(IFormPart part, ISelection selection) {
			if ( selection instanceof TreeSelection ) {
				TreeSelection ts = (TreeSelection)selection;
				plan = (Plan)ts.getFirstElement();
				stale = true;
				setFormInput(plan);
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
			section.setText("Plan");
			section.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
			toolkit.createCompositeSeparator(section);
			
			client = myToolkit.createComposite(section);
			TableWrapLayout dcl = new TableWrapLayout();
			dcl.numColumns = 2;
			client.setLayout( dcl );

			Label planIdLabel = myToolkit.createLabel(client, "Plan ID");
			planIdLabel.setFont(boldFont);
			planIdLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			planId = myToolkit.createLabel(client,"");
			planId.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));

			Label modelElementIdLabel = myToolkit.createLabel(client,"Model Element ID");
			modelElementIdLabel.setFont(boldFont);
			modelElementIdLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			modelElementId = myToolkit.createLabel(client,"");
			modelElementId.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));

			Label modelElementContentLabel = myToolkit.createLabel(client,"Content");
			modelElementContentLabel.setFont(boldFont);
			modelElementContentLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			modelElementContent = myToolkit.createText(client,"",SWT.MULTI |SWT.WRAP);
			modelElementContent.setEditable(false);
			modelElementContent.setLayoutData( new TableWrapData(TableWrapData.LEFT,TableWrapData.TOP) );
			
			Label modelElementDescriptionLabel = myToolkit.createLabel(client,"Description");
			modelElementDescriptionLabel.setFont(boldFont);
			modelElementDescriptionLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			modelElementDescription = myToolkit.createText(client,"",SWT.MULTI | SWT.WRAP);
			modelElementDescription.setEditable(false);
			modelElementDescription.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));

			section.setClient(client);
			stale = false;
		}
	}

	/**
	 * Allocation details page.
	 */
	public class AllocationDetailsPage implements IDetailsPage {
		Composite client;
		Allocation allocation;
		boolean stale = true;
		FormToolkit myToolkit;
		Label duration;
		Label team;
		Label cost;
		Label facility;
		
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
			if ( input instanceof Allocation ) {
				allocation = (Allocation)input;
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
			String t = allocation.getTeam() == null ? "" : allocation.getTeam();
			String f = allocation.getFacility() == null ? "" : allocation.getFacility();
			cost.setText(String.format("$%d",allocation.getCost()));
			duration.setText(String.format("%d hrs",allocation.getDuration()));
			team.setText(t);
			facility.setText(f);
			stale = false;
			client.getParent().layout(true);
		}

		@Override
		public void selectionChanged(IFormPart part, ISelection selection) {
			if ( selection instanceof TreeSelection ) {
				TreeSelection ts = (TreeSelection)selection;
				allocation = (Allocation)ts.getFirstElement();
				stale = true;
				setFormInput(allocation);
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
			section.setText("Allocation");
			section.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
			toolkit.createCompositeSeparator(section);
			
			client = myToolkit.createComposite(section);
			TableWrapLayout dcl = new TableWrapLayout();
			dcl.numColumns = 2;
			client.setLayout( dcl );

			Label costLabel = myToolkit.createLabel(client, "Cost");
			costLabel.setFont(boldFont);
			costLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			cost = myToolkit.createLabel(client,"");
			cost.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			Label durationLabel = myToolkit.createLabel(client,"Duration");
			durationLabel.setFont(boldFont);
			durationLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			duration = myToolkit.createLabel(client,"");
			duration.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			Label teamLabel = myToolkit.createLabel(client,"Team");
			teamLabel.setFont(boldFont);
			teamLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			team = myToolkit.createLabel(client,"");
			team.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			Label facilityLabel = myToolkit.createLabel(client,"Facility");
			facilityLabel.setFont(boldFont);
			facilityLabel.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));
			facility = myToolkit.createLabel(client,"");
			facility.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));

			section.setClient(client);
			stale = false;
		}
	}
}
