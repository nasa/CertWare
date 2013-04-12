/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts.forms;

// Start of user code for imports
import net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;
import net.certware.measurement.sco.providers.ScoMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
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
public class ArtifactIdentifierPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ArtifactIdentifierPropertiesEditionPart {

	protected Text resourceName;
	protected Text baselinedLineCount;
	protected Text currentLineCount;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArtifactIdentifierPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence artifactIdentifierStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = artifactIdentifierStep.addStep(ScoViewsRepository.ArtifactIdentifier.Properties.class);
		propertiesStep.addStep(ScoViewsRepository.ArtifactIdentifier.Properties.resourceName);
		propertiesStep.addStep(ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount);
		propertiesStep.addStep(ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount);
		
		
		composer = new PartComposer(artifactIdentifierStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScoViewsRepository.ArtifactIdentifier.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ScoViewsRepository.ArtifactIdentifier.Properties.resourceName) {
					return 		createResourceNameText(widgetFactory, parent);
				}
				if (key == ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount) {
					return 		createBaselinedLineCountText(widgetFactory, parent);
				}
				if (key == ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount) {
					return 		createCurrentLineCountText(widgetFactory, parent);
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
		propertiesSection.setText(ScoMessages.ArtifactIdentifierPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createResourceNameText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ArtifactIdentifierPropertiesEditionPart_ResourceNameLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ArtifactIdentifier.Properties.resourceName, ScoViewsRepository.FORM_KIND));
		resourceName = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		resourceName.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData resourceNameData = new GridData(GridData.FILL_HORIZONTAL);
		resourceName.setLayoutData(resourceNameData);
		resourceName.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactIdentifier.Properties.resourceName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resourceName.getText()));
			}
		});
		resourceName.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactIdentifier.Properties.resourceName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resourceName.getText()));
				}
			}
		});
		EditingUtils.setID(resourceName, ScoViewsRepository.ArtifactIdentifier.Properties.resourceName);
		EditingUtils.setEEFtype(resourceName, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactIdentifier.Properties.resourceName, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createBaselinedLineCountText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ArtifactIdentifierPropertiesEditionPart_BaselinedLineCountLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount, ScoViewsRepository.FORM_KIND));
		baselinedLineCount = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		baselinedLineCount.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData baselinedLineCountData = new GridData(GridData.FILL_HORIZONTAL);
		baselinedLineCount.setLayoutData(baselinedLineCountData);
		baselinedLineCount.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, baselinedLineCount.getText()));
			}
		});
		baselinedLineCount.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, baselinedLineCount.getText()));
				}
			}
		});
		EditingUtils.setID(baselinedLineCount, ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount);
		EditingUtils.setEEFtype(baselinedLineCount, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactIdentifier.Properties.baselinedLineCount, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCurrentLineCountText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, ScoMessages.ArtifactIdentifierPropertiesEditionPart_CurrentLineCountLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount, ScoViewsRepository.FORM_KIND));
		currentLineCount = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		currentLineCount.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData currentLineCountData = new GridData(GridData.FILL_HORIZONTAL);
		currentLineCount.setLayoutData(currentLineCountData);
		currentLineCount.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, currentLineCount.getText()));
			}
		});
		currentLineCount.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartForm.this, ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, currentLineCount.getText()));
				}
			}
		});
		EditingUtils.setID(currentLineCount, ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount);
		EditingUtils.setEEFtype(currentLineCount, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactIdentifier.Properties.currentLineCount, ScoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart#getResourceName()
	 * 
	 */
	public String getResourceName() {
		return resourceName.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart#setResourceName(String newValue)
	 * 
	 */
	public void setResourceName(String newValue) {
		if (newValue != null) {
			resourceName.setText(newValue);
		} else {
			resourceName.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart#getBaselinedLineCount()
	 * 
	 */
	public String getBaselinedLineCount() {
		return baselinedLineCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart#setBaselinedLineCount(String newValue)
	 * 
	 */
	public void setBaselinedLineCount(String newValue) {
		if (newValue != null) {
			baselinedLineCount.setText(newValue);
		} else {
			baselinedLineCount.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart#getCurrentLineCount()
	 * 
	 */
	public String getCurrentLineCount() {
		return currentLineCount.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart#setCurrentLineCount(String newValue)
	 * 
	 */
	public void setCurrentLineCount(String newValue) {
		if (newValue != null) {
			currentLineCount.setText(newValue);
		} else {
			currentLineCount.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScoMessages.ArtifactIdentifier_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
