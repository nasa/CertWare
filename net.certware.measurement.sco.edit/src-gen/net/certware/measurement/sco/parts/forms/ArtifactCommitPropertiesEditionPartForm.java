/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;

import net.certware.measurement.sco.providers.ScoMessages;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class ArtifactCommitPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ArtifactCommitPropertiesEditionPart {

	protected ReferencesTable artifactIdentifiers;
	protected List<ViewerFilter> artifactIdentifiersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> artifactIdentifiersFilters = new ArrayList<ViewerFilter>();
	protected Text commitIdentifier;
	protected Text usageTime;



	/**
	 * For {@link ISection} use only.
	 */
	public ArtifactCommitPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArtifactCommitPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence artifactCommitStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = artifactCommitStep.addStep(ScoViewsRepository.ArtifactCommit.Properties.class);
		propertiesStep.addStep(ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers);
		propertiesStep.addStep(ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier);
		propertiesStep.addStep(ScoViewsRepository.ArtifactCommit.Properties.usageTime);
		
		
		composer = new PartComposer(artifactCommitStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScoViewsRepository.ArtifactCommit.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers) {
					return createArtifactIdentifiersTableComposition(widgetFactory, parent);
				}
				if (key == ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier) {
					return createCommitIdentifierText(widgetFactory, parent);
				}
				if (key == ScoViewsRepository.ArtifactCommit.Properties.usageTime) {
					return createUsageTimeText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(ScoMessages.ArtifactCommitPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createArtifactIdentifiersTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.artifactIdentifiers = new ReferencesTable(getDescription(ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers, ScoMessages.ArtifactCommitPropertiesEditionPart_ArtifactIdentifiersLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactCommitPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				artifactIdentifiers.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactCommitPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				artifactIdentifiers.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactCommitPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				artifactIdentifiers.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactCommitPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				artifactIdentifiers.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.artifactIdentifiersFilters) {
			this.artifactIdentifiers.addFilter(filter);
		}
		this.artifactIdentifiers.setHelpText(propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers, ScoViewsRepository.FORM_KIND));
		this.artifactIdentifiers.createControls(parent, widgetFactory);
		this.artifactIdentifiers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactCommitPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData artifactIdentifiersData = new GridData(GridData.FILL_HORIZONTAL);
		artifactIdentifiersData.horizontalSpan = 3;
		this.artifactIdentifiers.setLayoutData(artifactIdentifiersData);
		this.artifactIdentifiers.setLowerBound(0);
		this.artifactIdentifiers.setUpperBound(-1);
		artifactIdentifiers.setID(ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers);
		artifactIdentifiers.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createArtifactIdentifiersTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createCommitIdentifierText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier, ScoMessages.ArtifactCommitPropertiesEditionPart_CommitIdentifierLabel);
		commitIdentifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		commitIdentifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData commitIdentifierData = new GridData(GridData.FILL_HORIZONTAL);
		commitIdentifier.setLayoutData(commitIdentifierData);
		commitIdentifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArtifactCommitPropertiesEditionPartForm.this,
							ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, commitIdentifier.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArtifactCommitPropertiesEditionPartForm.this,
									ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, commitIdentifier.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArtifactCommitPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		commitIdentifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactCommitPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, commitIdentifier.getText()));
				}
			}
		});
		EditingUtils.setID(commitIdentifier, ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier);
		EditingUtils.setEEFtype(commitIdentifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommitIdentifierText

		// End of user code
		return parent;
	}

	
	protected Composite createUsageTimeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ScoViewsRepository.ArtifactCommit.Properties.usageTime, ScoMessages.ArtifactCommitPropertiesEditionPart_UsageTimeLabel);
		usageTime = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		usageTime.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData usageTimeData = new GridData(GridData.FILL_HORIZONTAL);
		usageTime.setLayoutData(usageTimeData);
		usageTime.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArtifactCommitPropertiesEditionPartForm.this,
							ScoViewsRepository.ArtifactCommit.Properties.usageTime,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, usageTime.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArtifactCommitPropertiesEditionPartForm.this,
									ScoViewsRepository.ArtifactCommit.Properties.usageTime,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, usageTime.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArtifactCommitPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		usageTime.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactCommitPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactCommit.Properties.usageTime, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, usageTime.getText()));
				}
			}
		});
		EditingUtils.setID(usageTime, ScoViewsRepository.ArtifactCommit.Properties.usageTime);
		EditingUtils.setEEFtype(usageTime, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactCommit.Properties.usageTime, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createUsageTimeText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#initArtifactIdentifiers(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initArtifactIdentifiers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		artifactIdentifiers.setContentProvider(contentProvider);
		artifactIdentifiers.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ArtifactCommit.Properties.artifactIdentifiers);
		if (eefElementEditorReadOnlyState && artifactIdentifiers.isEnabled()) {
			artifactIdentifiers.setEnabled(false);
			artifactIdentifiers.setToolTipText(ScoMessages.ArtifactCommit_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !artifactIdentifiers.isEnabled()) {
			artifactIdentifiers.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#updateArtifactIdentifiers()
	 * 
	 */
	public void updateArtifactIdentifiers() {
	artifactIdentifiers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#addFilterArtifactIdentifiers(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArtifactIdentifiers(ViewerFilter filter) {
		artifactIdentifiersFilters.add(filter);
		if (this.artifactIdentifiers != null) {
			this.artifactIdentifiers.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#addBusinessFilterArtifactIdentifiers(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArtifactIdentifiers(ViewerFilter filter) {
		artifactIdentifiersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#isContainedInArtifactIdentifiersTable(EObject element)
	 * 
	 */
	public boolean isContainedInArtifactIdentifiersTable(EObject element) {
		return ((ReferencesTableSettings)artifactIdentifiers.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#getCommitIdentifier()
	 * 
	 */
	public String getCommitIdentifier() {
		return commitIdentifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#setCommitIdentifier(String newValue)
	 * 
	 */
	public void setCommitIdentifier(String newValue) {
		if (newValue != null) {
			commitIdentifier.setText(newValue);
		} else {
			commitIdentifier.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ArtifactCommit.Properties.commitIdentifier);
		if (eefElementEditorReadOnlyState && commitIdentifier.isEnabled()) {
			commitIdentifier.setEnabled(false);
			commitIdentifier.setToolTipText(ScoMessages.ArtifactCommit_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !commitIdentifier.isEnabled()) {
			commitIdentifier.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#getUsageTime()
	 * 
	 */
	public String getUsageTime() {
		return usageTime.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactCommitPropertiesEditionPart#setUsageTime(String newValue)
	 * 
	 */
	public void setUsageTime(String newValue) {
		if (newValue != null) {
			usageTime.setText(newValue);
		} else {
			usageTime.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ArtifactCommit.Properties.usageTime);
		if (eefElementEditorReadOnlyState && usageTime.isEnabled()) {
			usageTime.setEnabled(false);
			usageTime.setToolTipText(ScoMessages.ArtifactCommit_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !usageTime.isEnabled()) {
			usageTime.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScoMessages.ArtifactCommit_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
