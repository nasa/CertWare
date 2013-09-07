/**
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved. 
 */

package net.certware.measurement.spm.view;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.measurement.smm.DimensionalMeasure;
import net.certware.measurement.smm.DimensionalMeasurement;
import net.certware.measurement.smm.Measurement;
import net.certware.measurement.spm.AdaptabilityRatioMeasure;
import net.certware.measurement.spm.AdaptabilityTrend;
import net.certware.measurement.spm.BaselineCaseSizeMeasure;
import net.certware.measurement.spm.BrokenCaseSizeMeasure;
import net.certware.measurement.spm.CriticalDefectChangeOrderCount;
import net.certware.measurement.spm.DevelopmentEffortMeasure;
import net.certware.measurement.spm.FixedCaseSizeMeasure;
import net.certware.measurement.spm.ImprovementChangeOrderCount;
import net.certware.measurement.spm.MaintainabilityMeasure;
import net.certware.measurement.spm.MaturityRatioMeasure;
import net.certware.measurement.spm.MaturityTrend;
import net.certware.measurement.spm.ModularityMeasure;
import net.certware.measurement.spm.ModularityTrend;
import net.certware.measurement.spm.NewFeatureChangeOrderCount;
import net.certware.measurement.spm.NormalDefectChangeOrderCount;
import net.certware.measurement.spm.ProjectCommit;
import net.certware.measurement.spm.ProjectModel;
import net.certware.measurement.spm.RepairEffortMeasure;
import net.certware.measurement.spm.ReworkBacklogMeasure;
import net.certware.measurement.spm.ReworkRatioMeasure;
import net.certware.measurement.spm.ReworkStabilityMeasure;
import net.certware.measurement.spm.ScrapRatioMeasure;
import net.certware.measurement.spm.TotalCaseSizeMeasure;
import net.certware.measurement.spm.UsageTimeMeasure;
import net.certware.measurement.spm.impl.ProjectCommitImpl;
import net.certware.measurement.spm.impl.ProjectModelImpl;
import net.certware.measurement.spm.util.SpmResourceImpl;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.ViewPart;

/**
 * SPM details viewer.
 * High-level details-only layout on a view, latest commit in project model.  
 * Selecting an SPM file in the workbench refreshes the view.
 * @author mrb
 * @since 1.1
 */
public class SpmViewMasterDetails extends ViewPart implements ISelectionListener, ICertWareConstants, IResourceChangeListener {

	/** form toolkit */
	FormToolkit toolkit;
	/** scrolled form on the part */
	ScrolledForm form;
	/** selected SPM file */
	IFile selectedFile = null;
	/** selected file opener */
	Hyperlink fileLink = null;
	/** selected results model */
	ProjectModel projectModel;
	/** default section style */
	int sectionStyle = Section.DESCRIPTION | Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED;
	/** bold font from resources */
	Font boldFont;
	/** tree viewer for master part */
	TreeViewer viewer;

	/**
	 * Creates the view part, applying a scrolled form and master-details blocks.
	 * @param parent workbench parent composite
	 */
	@Override
	public void createPartControl(Composite parent) {
		
		toolkit = new FormToolkit(parent.getDisplay());
		
		// scrolled form on which to place the block
		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayout(new FillLayout());
		
    	form = toolkit.createScrolledForm(composite);
		form.setImage( Activator.getDefault().getImageRegistry().get( Activator.FORM_IMAGE ));
		form.setText("Software Project Management Metrics");
		form.setMessage(null, IMessageProvider.NONE);
	    form.setToolTipText("Select an SPM file in the workbench");
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
	    
		form.layout(true);
		form.reflow(true);
	}

	/**
	 * Refresh the part.
	 * Tries to use a safe thread on default display.
	 */
	protected void refreshPart() {
		// update the input to the tree viewer in the master part
		new Thread(new Runnable() {
			public void run() {
				// try { Thread.sleep(1000); } catch (Exception e) { }
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						viewer.setInput(projectModel);
						
						if ( projectModel != null ) {
							// update master side fields, if any
							// unused at this point as there are no product model element fields to display
						}
						
						form.reflow(true);
					}
				});
			}
		}).start();
	}
	

	/**
	 * Sets the focus to the form.
	 */
	@Override
	public void setFocus() {
		form.setFocus();
	}

	/**
	 * Disposes the toolkit.
	 * Removes the listeners for the workbench and resources.
	 * Calls super class dispose.
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
	        Resource resource = resourceSet.getResource( 
	        		URI.createPlatformResourceURI(selectedFile.getFullPath().toString(), true), true);
	        ProjectModel documentRoot = (ProjectModel)resource.getContents().get(0);
	        if ( documentRoot != null ) {
	          projectModel = documentRoot;
	        }
	      } catch( Exception exception ) {
	        CertWareLog.logError(String.format("%s %s", 
	        		"Document root null loading" + selectedFile.getName()), exception);
	      }
	}
	
	/**
	 * Sets the selected file.
	 * For use by other actions.
	 * If the selected file changes, calls {@link refreshModelFromFile} and {@link refreshPart}.
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
	 * @param selection structured selection expecting {@code IFile} or an {@code EObject} with {@code ProjectModel} container 
	 */
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// skip the selection change if it came from this part
		if ( part != SpmViewMasterDetails.this ) {
			
			if ( selection instanceof IStructuredSelection ) {
				IStructuredSelection iss = (IStructuredSelection)selection;
				Object object = iss.getFirstElement();
				
				// save the selection if it's an SPM file
				if ( object instanceof IFile ) {
					IFile f = (IFile)object;
					// skip if already loaded
					if ( f == selectedFile )
						return;

					if ( f.getFileExtension().equalsIgnoreCase( ICertWareConstants.SPM_EXTENSION )) {
						setSelectedFile((IFile)f);
					}
					return;
				}

				// save the resource if it's an editor object
				if ( object instanceof EObject ) {
					
				    EObject eo = (EObject)object;

				    if ( eo != null ) {
				    	if ( eo instanceof ProjectModel ) {
					        projectModel = (ProjectModel)eo;
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}
				    	
				    	EObject container = eo.eContainer();
				    	
				    	if ( container instanceof ProjectModel ) {
					        projectModel = (ProjectModel)container;
					        selectedFile = null;
					        refreshPart();
					        return;
				    	}
				    	
				    	if ( container instanceof SpmResourceImpl ) {
				    		// might do something with contents later
				    		return;
				    	}
				    }
				}
			}
		}
	}

	/**
	 * Responds to resource change events.
	 * Checks for removed and change events.  Refreshes part if necessary.
	 */
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
	      CertWareLog.logWarning("Refreshing SPM file" + ce.getMessage());
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

			// section has a table wrap layout for the form
			Section treeSection = toolkit.createSection(parent, Section.TITLE_BAR);
			treeSection.setText("Project Commits");
			toolkit.createCompositeSeparator(treeSection);
			TableWrapLayout wrapLayout = new TableWrapLayout();
			wrapLayout.numColumns = 1;
			treeSection.setLayout(wrapLayout);
			
			// section client has a grid layout for its tree container 
			Composite sectionClient = toolkit.createComposite(treeSection);
			sectionClient.setLayout(new GridLayout(1, false));
			treeSection.setClient(sectionClient);
			
			// tree on the client
			Tree tree = toolkit.createTree(sectionClient, SWT.NULL);
			GridData gd2 = new GridData(GridData.FILL,GridData.FILL,true,true); // works to fill master container
			gd2.heightHint = 100;
			gd2.widthHint = 200;
			tree.setLayoutData(gd2);
			
			toolkit.paintBordersFor(sectionClient);
			treeSection.setClient(sectionClient);
			
			final SectionPart spart = new SectionPart(treeSection);
			managedForm.addPart(spart);

			// tree viewer
			//SpmItemProviderAdapterFactory factory = new SpmItemProviderAdapterFactory();
			viewer = new TreeViewer(tree);
			viewer.setContentProvider(new ContentProvider());
			viewer.setLabelProvider(new	LabelProvider());
			viewer.setInput(projectModel);
			viewer.expandAll();
			viewer.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					managedForm.fireSelectionChanged(spart, event.getSelection());
				}
			});
		}

		/**
		 * Creates the typical horizontal and vertical layout actions for the tool bar.
		 * @param managedForm form for toolbar
		 */
		protected void createToolBarActions(IManagedForm managedForm) {
			final ScrolledForm form = managedForm.getForm();

			// layout horizontal
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
			
			// layout vertical
			Action vaction = new Action("ver", Action.AS_RADIO_BUTTON) {
				public void run() {
					sashForm.setOrientation(SWT.VERTICAL);
					form.reflow(true);
				}
			};
			vaction.setChecked(false);
			vaction.setToolTipText("Vertical orientation");
			vaction.setImageDescriptor(Activator.getDefault()
					.getImageRegistry()
					.getDescriptor(Activator.VERTICAL_IMAGE));
			
			// add buttons to the tool bar
			form.getToolBarManager().add(haction);
			form.getToolBarManager().add(vaction);
		}
		
		/**
		 * Registers detail pages by class.
		 * Registers a page for {@code ProjectModelImpl} and {@code ProjectCommitImpl}.
		 */
		protected void registerPages(DetailsPart detailsPart) {
			detailsPart.registerPage(ProjectModelImpl.class, new ProjectModelDetailsPage());
			detailsPart.registerPage(ProjectCommitImpl.class, new ProjectCommitDetailsPage());
		}
	}

	/**
	 * Details page for a commit record.
	 */
	public class ProjectCommitDetailsPage implements IDetailsPage {
		/** whether the page content is stale */
		boolean stale = true;
		/** commit metrics client on the section */ 
		Composite metricsClient;
		/** commit metrics section */
		Composite statisticsClient;
		/** selected commit object from the master side */
		ProjectCommit projectCommit;
		/** toolkit for creating form content */
		FormToolkit myToolkit;
		/** scrap ratio label */
		Label scrapRatio;
		/** maturity ratio label */
		Label maturityRatio;
		/** maturity trend label */
		Label maturityTrend;
		/** maintainability label */
		Label maintainability;
		/** rework stability label */
		Label reworkStability;
		/** rework ratio label */
		Label reworkRatio;
		/** rework backlog label */
		Label reworkBacklog;
		/** modularity label */
		Label modularity;
		/** adaptability ratio label */
		Label adaptabilityRatio;
		/** adaptability trend label */
		Label adaptabilityTrend;
		/** modularity trend label */
		Label modularityTrend;
		/** critical change orders count label */
		Label criticalCount;
		/** normal change orders count label */
		Label normalCount;
		/** improvement change orders count label */
		Label improvementCount;
		/** new feature change orders count label */ 
		Label newCount;
		/** broken case size label */
		Label brokenSize;
		/** fixed case size label */
		Label fixedSize;
		/** total case size label */
		Label totalSize;
		/** baselined case size label */
		Label baselineSize;
		/** usage time label */
		Label usageTime;
		/** repair effort label */
		Label repairEffort;
		/** development effort label */
		Label developmentEffort;
		
		
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
			if ( input instanceof ProjectCommit ) {
				projectCommit = (ProjectCommit)input;
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
		
		/**
		 * Returns the value from the first attribute of the observation.
		 * @param measure dimensional measure, ratio or trend
		 * @param index measurement index, usually zero
		 * @return value formatted, or none string
		 */
		public String getValue(DimensionalMeasure measure, int index) {
			if ( measure.getMeasurement() != null && measure.getMeasurement().size() > 0 ) {
				Measurement measurement = measure.getMeasurement().get(index);
				// direct measurement
				if ( measurement instanceof DimensionalMeasurement ) {
					DimensionalMeasurement dm = (DimensionalMeasurement)measurement;
					String unit = measure.getUnit();
					if ( unit == null ) {
						return String.format("%7.2f",dm.getValue());
					} else {
						return String.format("%7.2f %s",dm.getValue(),unit);
					}
				}
				// other measurement types, such as ranking, not used in this model 
			}

			return "<none>";
		}

		@Override
		public void refresh() {

			// visit the model, collect statistics
			// these are all direct measurement measures, so the tree data content expects only these types
			// we are only using the first measurement (index 0) in every case 
			TreeIterator<EObject> ti = projectCommit.eAllContents();
			while( ti.hasNext() ) {
				EObject eo = (EObject)ti.next();
				
				// individual statistics
				if ( eo instanceof CriticalDefectChangeOrderCount ) {
					criticalCount.setText( getValue((CriticalDefectChangeOrderCount)eo,0));
					continue;
				}
				if ( eo instanceof NormalDefectChangeOrderCount ) {
					normalCount.setText( getValue((NormalDefectChangeOrderCount)eo,0));
					continue;
				}
				if ( eo instanceof ImprovementChangeOrderCount ) {
					improvementCount.setText( getValue((ImprovementChangeOrderCount)eo,0));
					continue;
				}
				if ( eo instanceof NewFeatureChangeOrderCount ) {
					newCount.setText( getValue((NewFeatureChangeOrderCount)eo,0));
					continue;
				}
				if ( eo instanceof BrokenCaseSizeMeasure ) {
					brokenSize.setText( getValue((BrokenCaseSizeMeasure)eo,0));
				}
				if ( eo instanceof FixedCaseSizeMeasure ) {
					fixedSize.setText( getValue((FixedCaseSizeMeasure)eo,0));
				}
				if ( eo instanceof TotalCaseSizeMeasure ) {
					totalSize.setText( getValue((TotalCaseSizeMeasure)eo,0));
				}
				if ( eo instanceof BaselineCaseSizeMeasure ) {
					baselineSize.setText( getValue((BaselineCaseSizeMeasure)eo,0));
				}
				if ( eo instanceof UsageTimeMeasure ) {
					usageTime.setText( getValue((UsageTimeMeasure)eo,0));
				}
				if ( eo instanceof DevelopmentEffortMeasure ) {
					developmentEffort.setText( getValue((DevelopmentEffortMeasure)eo,0));
				}
				if ( eo instanceof RepairEffortMeasure ) {
					repairEffort.setText( getValue((RepairEffortMeasure)eo,0));
				}
				
				// computed metrics
				if ( eo instanceof ScrapRatioMeasure ) {
					scrapRatio.setText( getValue((ScrapRatioMeasure)eo,0) );
					continue;
				}
				if ( eo instanceof MaturityRatioMeasure ) {
					maturityRatio.setText( getValue((MaturityRatioMeasure)eo,0) );
					continue;
				}
				if ( eo instanceof MaturityTrend ) {
					maturityTrend.setText( getValue((MaturityTrend)eo,0) );
					continue;
				}
				if ( eo instanceof MaintainabilityMeasure ) {
					maintainability.setText( getValue((MaintainabilityMeasure)eo,0) );
					continue;
				}
				if ( eo instanceof ReworkStabilityMeasure ) {
					reworkStability.setText( getValue((ReworkStabilityMeasure)eo,0) );
					continue;
				}
				if ( eo instanceof ReworkRatioMeasure ) {
					reworkRatio.setText( getValue((ReworkRatioMeasure)eo,0) );
					continue;
				}
				if ( eo instanceof ReworkBacklogMeasure ) {
					reworkBacklog.setText( getValue((ReworkBacklogMeasure)eo,0) );
					continue;
				}
				if ( eo instanceof ModularityMeasure ) {
					modularity.setText( getValue((ModularityMeasure)eo,0) );
					continue;
				}
				if ( eo instanceof AdaptabilityRatioMeasure) {
					adaptabilityRatio.setText( getValue((AdaptabilityRatioMeasure)eo,0) );
					continue;
				}
				if ( eo instanceof AdaptabilityTrend) {
					adaptabilityTrend.setText( getValue((AdaptabilityTrend)eo,0) );
					continue;
				}
				if ( eo instanceof ModularityTrend) {
					modularityTrend.setText( getValue((ModularityTrend)eo,0) );
					continue;
				}
			}

			stale = false;
			metricsClient.getParent().layout(true);
			statisticsClient.getParent().layout(true);
		}

		@Override
		public void selectionChanged(IFormPart part, ISelection selection) {
			if ( selection instanceof TreeSelection ) {
				TreeSelection ts = (TreeSelection)selection;
				
				Object first = ts.getFirstElement();
				
				if ( first instanceof ProjectCommit ) {
					projectCommit = (ProjectCommit)first;
					stale = true;
					setFormInput(projectCommit);
				}
			}
		}

		/**
		 * Creates two sections on the form, one for computed metrics and one for the raw statistics 
		 * used to compute those metrics.
		 * @param parent parent for the sections
		 */
		@Override
		public void createContents(Composite parent) {
			
			TableWrapLayout layout = new TableWrapLayout();
			layout.topMargin = 0;
			layout.leftMargin = 5;
			layout.rightMargin = 5;
			layout.bottomMargin = 5;
			layout.numColumns = 1;
			parent.setLayout(layout);
			
			// computed metrics section
			Section metricsSection = myToolkit.createSection(parent, Section.TITLE_BAR | Section.EXPANDED | Section.TWISTIE );
			metricsSection.setText("Commit Metrics");
			metricsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
			// toolkit.createCompositeSeparator(metricsSection);

			metricsClient = myToolkit.createComposite(metricsSection);
			TableWrapLayout dcl = new TableWrapLayout();
			dcl.numColumns = 3;
			metricsClient.setLayout( dcl );

			// each creation creates three cells for its row
			scrapRatio = createLabel(metricsClient, "Scrap Ratio",Activator.NODE_SCRAP_RATIO);
			maturityRatio = createLabel(metricsClient, "Maturity Ratio",Activator.NODE_MATURITY);
			maturityTrend = createLabel(metricsClient, "Maturity Trend",Activator.NODE_MATURITY_TREND);
			maintainability = createLabel(metricsClient, "Maintainability",Activator.NODE_MAINTAINABILITY);
			reworkRatio = createLabel(metricsClient, "Rework Ratio",Activator.NODE_REWORK_RATIO);
			reworkStability = createLabel(metricsClient, "Rework Stability",Activator.NODE_REWORK_STABILITY);
			reworkBacklog = createLabel(metricsClient, "Rework Backlog",Activator.NODE_REWORK_BACKLOG);
			modularity = createLabel(metricsClient, "Modularity",Activator.NODE_MODULARITY);
			modularityTrend = createLabel(metricsClient, "Modularity Trend",Activator.NODE_MODULARITY_TREND);
			adaptabilityRatio = createLabel(metricsClient, "Adaptability Ratio",Activator.NODE_ADAPTABILITY);
			adaptabilityTrend = createLabel(metricsClient, "Adaptability Trend",Activator.NODE_ADAPTABILITY_TREND);

			metricsSection.setClient(metricsClient);

			
			// raw statistics section
			Section statisticsSection = myToolkit.createSection(parent, Section.TITLE_BAR | Section.TWISTIE );
			statisticsSection.setText("Raw Statistics");
			statisticsSection.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
			// toolkit.createCompositeSeparator(statisticsSection);
			
			statisticsClient = myToolkit.createComposite(statisticsSection);
			dcl = new TableWrapLayout();
			dcl.numColumns = 3;
			statisticsClient.setLayout( dcl );

			// each creation creates three cells for its row
			criticalCount = createLabel(statisticsClient, "Critical Defect Change Orders",Activator.NODE_CRITICAL_CHANGE_ORDERS);
			normalCount = createLabel(statisticsClient, "Normal Defect Change Orders",Activator.NODE_NORMAL_CHANGE_ORDERS);
			improvementCount = createLabel(statisticsClient, "Improvement Change Orders",Activator.NODE_IMPROVEMENT_CHANGE_ORDERS);
			newCount = createLabel(statisticsClient, "New Feature Change Orders",Activator.NODE_NEW_CHANGE_ORDERS);
			
			totalSize = createLabel(statisticsClient, "Total Case Size",Activator.NODE_TOTAL_SIZE);
			brokenSize = createLabel(statisticsClient, "Broken Case Size",Activator.NODE_BROKEN_SIZE);
			fixedSize = createLabel(statisticsClient, "Fixed Case Size",Activator.NODE_FIXED_SIZE);
			baselineSize = createLabel(statisticsClient, "Baselined Case Size",Activator.NODE_BASELINED_LINES);
			
			usageTime = createLabel(statisticsClient,"Usage Time",Activator.NODE_USAGE_TIME);
			repairEffort = createLabel(statisticsClient,"Repair Effort",Activator.NODE_REPAIR_EFFORT);
			developmentEffort = createLabel(statisticsClient,"Development Effort",Activator.NODE_DEVELOPMENT_EFFORT);

			statisticsSection.setClient(statisticsClient);

			
			stale = false;
		}

		/**
		 * Creates the image, text, and value cells for the table layout.
		 * Used for convenience to produce three labels on a row for image, description, and value cells.
		 * @param client details client
		 * @param name row name
		 * @param imageId row image id key from plug-in image registry
		 * @return value label with its text set to empty string
		 */
		protected Label createLabel(Composite client, String name, String imageId) {
			Label image = myToolkit.createLabel(client, "");
			image.setImage(Activator.getDefault().getImageRegistry().get(imageId));
			image.setLayoutData(new TableWrapData(TableWrapData.CENTER, TableWrapData.TOP));
			
			Label label = myToolkit.createLabel(client, name);
			label.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));

			Label value = myToolkit.createLabel(client, "");
			value.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));
			
			return value;
		}
	}

	/**
	 * Project model details page.
	 */
	public class ProjectModelDetailsPage implements IDetailsPage {
		Composite client;
		boolean stale = true;
		ProjectModel inputModel;
		FormToolkit myToolkit;
		Label commitCount;
		
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
			if ( input instanceof ProjectModel ) {
				inputModel = (ProjectModel)input;
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
			if ( inputModel.getCommits() != null ) {
				commitCount.setText(String.format("%d commits",inputModel.getCommits().size()));
			} else {
				commitCount.setText("none");
			}
			stale = false;
			client.getParent().layout(true);
		}

		@Override
		public void selectionChanged(IFormPart part, ISelection selection) {
			if ( selection instanceof TreeSelection ) {
				TreeSelection ts = (TreeSelection)selection;
				inputModel = (ProjectModel)ts.getFirstElement();
				stale = true;
				setFormInput(inputModel);
			}
		}

		@Override
		public void createContents(Composite parent) {
			
			TableWrapLayout layout = new TableWrapLayout();
			layout.topMargin = 0;
			layout.leftMargin = 5;
			layout.rightMargin = 5;
			layout.bottomMargin = 5;
			layout.numColumns = 3;
			parent.setLayout(layout);
			
			Section section = myToolkit.createSection(parent, Section.TWISTIE | Section.EXPANDED | Section.TITLE_BAR );
			section.setText("Project Model");
			section.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP));
			// toolkit.createCompositeSeparator(section);
			
			client = myToolkit.createComposite(section);
			TableWrapLayout dcl = new TableWrapLayout();
			dcl.numColumns = 3;
			client.setLayout( dcl );

			// creates three cells for the row
			commitCount = createLabel(client,"Project commits",Activator.COMMIT_IMAGE);
			
			section.setClient(client);
			stale = false;
		}
		
		/**
		 * Creates the image, text, and value cells for the table layout.
		 * @param client details client
		 * @param name row name
		 * @param imageId row image id key from plug-in image registry
		 * @return value label with its text set to empty string
		 */
		protected Label createLabel(Composite client, String name, String imageId) {
			Label image = myToolkit.createLabel(client, "");
			image.setImage(Activator.getDefault().getImageRegistry().get(imageId));
			image.setLayoutData(new TableWrapData(TableWrapData.CENTER, TableWrapData.TOP));
			
			Label label = myToolkit.createLabel(client, name);
			label.setLayoutData(new TableWrapData(TableWrapData.LEFT, TableWrapData.TOP));

			Label value = myToolkit.createLabel(client, "");
			value.setLayoutData(new TableWrapData(TableWrapData.RIGHT, TableWrapData.TOP));
			
			return value;
		}
	}
}
