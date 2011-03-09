/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts.impl;

// Start of user code for imports
import net.certware.measurement.sco.parts.ArtifactIdentifierPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;
import net.certware.measurement.sco.providers.ScoMessages;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author mrb
 * 
 */
public class ArtifactIdentifierPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ArtifactIdentifierPropertiesEditionPart {

	protected Text resourceName;
	protected Text baselinedLineCount;
	protected Text currentLineCount;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArtifactIdentifierPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ScoMessages.ArtifactIdentifierPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createResourceNameText(propertiesGroup);
		createBaselinedLineCountText(propertiesGroup);
		createCurrentLineCountText(propertiesGroup);
	}

	
	protected void createResourceNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.ArtifactIdentifierPropertiesEditionPart_ResourceNameLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ArtifactIdentifier.resourceName, ScoViewsRepository.SWT_KIND));
		resourceName = new Text(parent, SWT.BORDER);
		GridData resourceNameData = new GridData(GridData.FILL_HORIZONTAL);
		resourceName.setLayoutData(resourceNameData);
		resourceName.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartImpl.this, ScoViewsRepository.ArtifactIdentifier.resourceName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resourceName.getText()));
			}

		});
		resourceName.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartImpl.this, ScoViewsRepository.ArtifactIdentifier.resourceName, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, resourceName.getText()));
				}
			}

		});
		EditingUtils.setID(resourceName, ScoViewsRepository.ArtifactIdentifier.resourceName);
		EditingUtils.setEEFtype(resourceName, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactIdentifier.resourceName, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createBaselinedLineCountText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.ArtifactIdentifierPropertiesEditionPart_BaselinedLineCountLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ArtifactIdentifier.baselinedLineCount, ScoViewsRepository.SWT_KIND));
		baselinedLineCount = new Text(parent, SWT.BORDER);
		GridData baselinedLineCountData = new GridData(GridData.FILL_HORIZONTAL);
		baselinedLineCount.setLayoutData(baselinedLineCountData);
		baselinedLineCount.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartImpl.this, ScoViewsRepository.ArtifactIdentifier.baselinedLineCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, baselinedLineCount.getText()));
			}

		});
		baselinedLineCount.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartImpl.this, ScoViewsRepository.ArtifactIdentifier.baselinedLineCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, baselinedLineCount.getText()));
				}
			}

		});
		EditingUtils.setID(baselinedLineCount, ScoViewsRepository.ArtifactIdentifier.baselinedLineCount);
		EditingUtils.setEEFtype(baselinedLineCount, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactIdentifier.baselinedLineCount, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createCurrentLineCountText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.ArtifactIdentifierPropertiesEditionPart_CurrentLineCountLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.ArtifactIdentifier.currentLineCount, ScoViewsRepository.SWT_KIND));
		currentLineCount = new Text(parent, SWT.BORDER);
		GridData currentLineCountData = new GridData(GridData.FILL_HORIZONTAL);
		currentLineCount.setLayoutData(currentLineCountData);
		currentLineCount.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartImpl.this, ScoViewsRepository.ArtifactIdentifier.currentLineCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, currentLineCount.getText()));
			}

		});
		currentLineCount.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArtifactIdentifierPropertiesEditionPartImpl.this, ScoViewsRepository.ArtifactIdentifier.currentLineCount, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, currentLineCount.getText()));
				}
			}

		});
		EditingUtils.setID(currentLineCount, ScoViewsRepository.ArtifactIdentifier.currentLineCount);
		EditingUtils.setEEFtype(currentLineCount, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ArtifactIdentifier.currentLineCount, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
