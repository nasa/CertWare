/**
 * CertWare Project.
 * Copyright (c) 2011 Kestrel Technology LLC.
 */
package net.certware.measurement.sco.view;

import net.certware.core.ICertWareConstants;
import net.certware.core.ui.log.CertWareLog;
import net.certware.core.ui.resources.FileOpener;
import net.certware.measurement.sco.ArtifactIdentifier;
import net.certware.measurement.sco.ArtifactList;
import net.certware.measurement.sco.ChangeOrderCount;

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
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.HyperlinkSettings;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
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
 * Selecting an SCO file in the workbench refreshes the view.
 * @author mrb
 * @since 1.0.3
 * @deprecated use the master-details view instead
 */
public class ScoView extends ViewPart implements ISelectionListener, ICertWareConstants, IResourceChangeListener {

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
	private Composite artifactClient;
	private Composite mainClient;
	Font boldFont;

	/**
	 * Creates a default section with a listener but no client.
	 * Consumes two columns of a table wrap layout.
	 * @param title section title
	 * @param description sub-head description, or null
	 * @return section
	 */
	protected Section createSection(String title, String description) {
		Section section = toolkit.createSection(form.getBody(), sectionStyle);
		section.setText(title);
		if ( description != null ) {
			section.setDescription(description);
		}
		section.setToolTipText("Expand or collapse the section");
		TableWrapData td = new TableWrapData(TableWrapData.FILL);
		td.grabHorizontal = true;
	    td.colspan = 2;
	    section.setLayoutData(td);
	    section.addExpansionListener(new ExpansionAdapter() {
	      @Override
	      public void expansionStateChanged(ExpansionEvent e) {
	        form.layout(true);
	        form.reflow(true);
	      }
	    });
	    return section;
	}
	
	
	@Override
	public void createPartControl(Composite parent) {
		toolkit = new FormToolkit(parent.getDisplay());
		form = toolkit.createScrolledForm(parent);
		form.setImage( Activator.getDefault().getImageRegistry().get( Activator.SCO_IMAGE ));
		form.setText("Software Change Orders");
		form.setMessage(null, IMessageProvider.NONE);
	    form.setToolTipText("Select an SCO file in the workbench");
	    toolkit.decorateFormHeading(form.getForm());
		TableWrapLayout layout = new TableWrapLayout();
		layout.numColumns = 2;
		form.getBody().setLayout(layout);
		
		// retrieve the bold font
		FontRegistry fontRegistry = new FontRegistry(parent.getDisplay());
		boldFont = fontRegistry.getBold(JFaceResources.DEFAULT_FONT);

		// selected file and a link to open the file in its editor
		Label fileLabel = toolkit.createLabel(form.getBody(),"Selected file:");
		TableWrapData td = new TableWrapData();
		td.colspan = 1;
		fileLabel.setLayoutData(td);
		fileLabel.setToolTipText("Select an SCO file from the navigator");
		
		toolkit.getHyperlinkGroup().setHyperlinkUnderlineMode(HyperlinkSettings.UNDERLINE_HOVER);
		fileLink = toolkit.createHyperlink(form.getBody(),"Hyperlink", SWT.WRAP);
		fileLink.setToolTipText("Click file name to open in editor");
		fileLink.setFont(JFaceResources.getDialogFont());
		fileLink.addHyperlinkListener(new HyperlinkAdapter() {
			public void linkActivated(HyperlinkEvent e) {
				FileOpener.findResourceEditor(selectedFile);
			}
		});
		refreshFileName();
		td = new TableWrapData(TableWrapData.FILL);
		// td.grabHorizontal = true;
		td.colspan = 1;
		fileLink.setLayoutData(td);

		// section creation
		Section mainSection = createSection("Roll-Up","Roll-up across all artifacts");
		mainClient = toolkit.createComposite(mainSection);
		mainClient.setLayout(new GridLayout(3,false));
		addGridLabel(mainClient,"Artifact",SWT.BEGINNING);
		addGridLabel(mainClient,"Metric",SWT.BEGINNING);
		mainSection.setClient(mainClient);

		Section artifactSection = createSection("Artifacts",null ); // "By individual SCO artifact");
		artifactClient = toolkit.createComposite(artifactSection);
		artifactClient.setLayout(new GridLayout(6,false));
		addGridLabel(artifactClient,"Artifact",SWT.BEGINNING);
		addGridLabel(artifactClient,"Metric",SWT.BEGINNING);
		artifactSection.setClient(artifactClient);
		
		// workbench selection listener
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);

		// resource change listener
	    ResourcesPlugin.getWorkspace().addResourceChangeListener(this, 
	    	      IResourceChangeEvent.POST_CHANGE | IResourceChangeEvent.PRE_CLOSE | IResourceChangeEvent.PRE_DELETE );

		form.layout(true);
		form.reflow(true);
	}

	/**
	 * Refresh the file name in the main section and set its enable state.
	 */
	protected void refreshFileName() {
		if ( selectedFile == null ) {
			if ( artifactList != null ) {
				// show the path, but not enabled as a link
				Resource selectedResource = artifactList.eResource();
				fileLink.setText(selectedResource.getURI().path());
			} else { 
				fileLink.setText("<content selected from editor>");
			}
			fileLink.setEnabled(false);
		}
		else {
			fileLink.setText( selectedFile.getName() );
			fileLink.setEnabled(true);
		}
	}
	
	/**
	 * Clears the client by disposing of its children.
	 * @param client client reference
	 */
	protected void clearClient(Composite client) {
		for ( Control c : client.getChildren() ) {
			c.dispose();
		}
	}

	protected Label addGridLabel(Composite parent, String text, int horizontal) {
		Label label = toolkit.createLabel(parent,text);
		label.setLayoutData(new GridData(horizontal,SWT.TOP,false,false,1,1));
		return label;
	}
	
	protected Label addGridLabel(Composite parent, Image image) {
		Label label = toolkit.createLabel(parent,""); //$NON-NLS-1$
		if ( image != null ) label.setImage(image);
		label.setLayoutData(new GridData(SWT.CENTER,SWT.TOP,false,false,1,1));
		return label;
	}
	
	protected Label addGridLabel(Composite parent, String text, int horizontal, Font f) {
		Label label = addGridLabel(parent,text,horizontal);
		label.setFont(f);
		return label;
	}

	/**
	 * Update the main client section.
	 * Writes the commit core information into three rows of three columns.
	 */
	protected void updateMainClient() {

		addGridLabel(mainClient, "", SWT.BEGINNING);
		addGridLabel(mainClient,"Commit ID",SWT.BEGINNING);
		addGridLabel(mainClient, artifactList.getCommitIdentifier(),SWT.BEGINNING);

		addGridLabel(mainClient,Activator.getDefault().getImageRegistry().get(Activator.NODE_BASELINE));
		addGridLabel(mainClient,"Baseline",SWT.BEGINNING);
		addGridLabel(mainClient,String.format("%s lines", artifactList.getAllBaselinedLineCount()),SWT.RIGHT);
		
		addGridLabel(mainClient,Activator.getDefault().getImageRegistry().get(Activator.NODE_CURRENT));
		addGridLabel(mainClient,"Current",SWT.BEGINNING);
		addGridLabel(mainClient,String.format("%s lines", artifactList.getAllCurrentLineCount()),SWT.RIGHT);
	}

	/**
	 * Update the artifact client section. 
	 * For each artifact identifier, write its core content and change orders into the grid 
	 */
	protected void updateArtifactClient() {
		
		for ( ArtifactIdentifier ai : artifactList.getArtifactIdentifiers() ) {
			addGridLabel(artifactClient, PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE));
			addGridLabel(artifactClient,"File",SWT.BEGINNING);
			addGridLabel(artifactClient,ai.getResourceName(),SWT.BEGINNING,JFaceResources.getDialogFont());
			addGridLabel(artifactClient,"",SWT.RIGHT);
			addGridLabel(artifactClient,"",SWT.RIGHT);
			addGridLabel(artifactClient,"",SWT.RIGHT);
			
			addGridLabel(artifactClient,Activator.getDefault().getImageRegistry().get(Activator.NODE_BASELINE));
			addGridLabel(artifactClient,"Baseline",SWT.BEGINNING);
			addGridLabel(artifactClient,String.format("%d lines",ai.getBaselinedLineCount()),SWT.RIGHT);
			addGridLabel(artifactClient,"",SWT.RIGHT);
			addGridLabel(artifactClient,"",SWT.RIGHT);
			addGridLabel(artifactClient,"",SWT.RIGHT);
			
			addGridLabel(artifactClient,Activator.getDefault().getImageRegistry().get(Activator.NODE_CURRENT));
			addGridLabel(artifactClient,"Current",SWT.BEGINNING);
			addGridLabel(artifactClient,String.format("%d lines",ai.getCurrentLineCount()),SWT.RIGHT);
			addGridLabel(artifactClient,"",SWT.RIGHT);
			addGridLabel(artifactClient,"",SWT.RIGHT);
			addGridLabel(artifactClient,"",SWT.RIGHT);

			// each change order type
			updateChangeOrderHeader(artifactClient);
			updateChangeOrders(artifactClient,ai.getCriticalDefectChangeOrders(),"Critical",Activator.NODE_CRITICAL);
			updateChangeOrders(artifactClient,ai.getNormalDefectChangeOrders(),"Normal",Activator.NODE_NORMAL);
			updateChangeOrders(artifactClient,ai.getImprovementChangeOrders(),"Improvement",Activator.NODE_IMPROVEMENT);
			updateChangeOrders(artifactClient,ai.getNewFeatureChangeOrders(),"New Features",Activator.NODE_NEW_FEATURE);
		}
	}

	/**
	 * Writes a change order header row into the section client.
	 * Presumes grid layout with six columns, for use with {@code updateChangeOrders}.
	 * @param client section client to write into
	 */
	protected void updateChangeOrderHeader(Composite client) {
		Color bg = JFaceColors.getBannerBackground(client.getDisplay());
		Color fg = JFaceColors.getBannerForeground(client.getDisplay());
		Label l = addGridLabel(client,"",SWT.BEGINNING);
		l.setBackground(bg);
		l.setForeground(fg);
		l = addGridLabel(client,"Change Type",SWT.BEGINNING);
		l.setBackground(bg);
		l.setForeground(fg);
		l = addGridLabel(client,"Count",SWT.CENTER);
		l.setBackground(bg);
		l.setForeground(fg);
		l = addGridLabel(client,"Broken",SWT.CENTER);
		l.setBackground(bg);
		l.setForeground(fg);
		l = addGridLabel(client,"Fixed",SWT.CENTER);
		l.setBackground(bg);
		l.setForeground(fg);
		l = addGridLabel(client,"Effort",SWT.CENTER);
		l.setBackground(bg);
		l.setForeground(fg);
	}
	
	/**
	 * Updates the artifact client rows for change orders.  
	 * Presumes grid layout with six columns.
	 * If the change order is null, return without adding to grid.
	 * @param client the section client to write into
	 * @param changeOrder change order record for the commit
	 * @param label row label
	 * @param imageKey image key for row, from plug-in registry
	 */
	protected void updateChangeOrders(Composite client, ChangeOrderCount changeOrder, String label, String imageKey) {
		if ( changeOrder == null ) {
			return;
		}
		addGridLabel(client,Activator.getDefault().getImageRegistry().get(imageKey));
		addGridLabel(client,label,SWT.BEGINNING);
		addGridLabel(client,String.format("%d orders",changeOrder.getValue()),SWT.RIGHT);
		addGridLabel(client,String.format("%d lines",changeOrder.getBrokenLines()),SWT.RIGHT);
		addGridLabel(client,String.format("%d lines",changeOrder.getFixedLines()),SWT.RIGHT);
		addGridLabel(client,String.format("%6.1f hrs", changeOrder.getRepairEffort()),SWT.RIGHT);
	}
	
	/**
	 * Refresh the part.
	 */
	protected void refreshPart() {
		refreshFileName();

		clearClient(mainClient);
		clearClient(artifactClient);

		updateMainClient();
		updateArtifactClient();

		mainClient.getParent().layout(true);
		artifactClient.getParent().layout(true);
		
		form.layout();
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
		if ( part != ScoView.this ) {
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

				    // find the containing document object for results objects
				    while( eo != null ) {
				      if ( eo instanceof ArtifactList ) {
				        artifactList = (ArtifactList)eo;
				        selectedFile = null;
				        refreshPart();
				        // latestSelection = selection;
				        return;
				      }
				      eo = eo.eContainer();
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
}
