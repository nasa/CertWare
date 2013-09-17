/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts.impl;

// Start of user code for imports
import net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;
import net.certware.measurement.sco.providers.ScoMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
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
 * 
 * 
 */
public class ImprovementChangeOrdersPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ImprovementChangeOrdersPropertiesEditionPart {

	protected Text name;
	protected Text value;
	protected EMFComboViewer type;
	protected Text brokenLines;
	protected Text fixedLines;
	protected Text repairEffort;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ImprovementChangeOrdersPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence improvementChangeOrdersStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = improvementChangeOrdersStep.addStep(ScoViewsRepository.ImprovementChangeOrders.Properties.class);
		propertiesStep.addStep(ScoViewsRepository.ImprovementChangeOrders.Properties.name);
		propertiesStep.addStep(ScoViewsRepository.ImprovementChangeOrders.Properties.value);
		propertiesStep.addStep(ScoViewsRepository.ImprovementChangeOrders.Properties.type);
		propertiesStep.addStep(ScoViewsRepository.ImprovementChangeOrders.Properties.brokenLines);
		propertiesStep.addStep(ScoViewsRepository.ImprovementChangeOrders.Properties.fixedLines);
		propertiesStep.addStep(ScoViewsRepository.ImprovementChangeOrders.Properties.repairEffort);
		
		
		composer = new PartComposer(improvementChangeOrdersStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScoViewsRepository.ImprovementChangeOrders.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ScoViewsRepository.ImprovementChangeOrders.Properties.name) {
					return createNameText(parent);
				}
				if (key == ScoViewsRepository.ImprovementChangeOrders.Properties.value) {
					return createValueText(parent);
				}
				if (key == ScoViewsRepository.ImprovementChangeOrders.Properties.type) {
					return createTypeEMFComboViewer(parent);
				}
				if (key == ScoViewsRepository.ImprovementChangeOrders.Properties.brokenLines) {
					return createBrokenLinesText(parent);
				}
				if (key == ScoViewsRepository.ImprovementChangeOrders.Properties.fixedLines) {
					return createFixedLinesText(parent);
				}
				if (key == ScoViewsRepository.ImprovementChangeOrders.Properties.repairEffort) {
					return createRepairEffortText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, ScoViewsRepository.ImprovementChangeOrders.Properties.name, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ScoViewsRepository.ImprovementChangeOrders.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.Properties.name, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createValueText(Composite parent) {
		createDescription(parent, ScoViewsRepository.ImprovementChangeOrders.Properties.value, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_ValueLabel);
		value = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
			}

		});
		value.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, ScoViewsRepository.ImprovementChangeOrders.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.Properties.value, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(Composite parent) {
		createDescription(parent, ScoViewsRepository.ImprovementChangeOrders.Properties.type, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_TypeLabel);
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(ScoViewsRepository.ImprovementChangeOrders.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.Properties.type, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createBrokenLinesText(Composite parent) {
		createDescription(parent, ScoViewsRepository.ImprovementChangeOrders.Properties.brokenLines, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_BrokenLinesLabel);
		brokenLines = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData brokenLinesData = new GridData(GridData.FILL_HORIZONTAL);
		brokenLines.setLayoutData(brokenLinesData);
		brokenLines.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.brokenLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, brokenLines.getText()));
			}

		});
		brokenLines.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.brokenLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, brokenLines.getText()));
				}
			}

		});
		EditingUtils.setID(brokenLines, ScoViewsRepository.ImprovementChangeOrders.Properties.brokenLines);
		EditingUtils.setEEFtype(brokenLines, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.Properties.brokenLines, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createBrokenLinesText

		// End of user code
		return parent;
	}

	
	protected Composite createFixedLinesText(Composite parent) {
		createDescription(parent, ScoViewsRepository.ImprovementChangeOrders.Properties.fixedLines, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_FixedLinesLabel);
		fixedLines = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData fixedLinesData = new GridData(GridData.FILL_HORIZONTAL);
		fixedLines.setLayoutData(fixedLinesData);
		fixedLines.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.fixedLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fixedLines.getText()));
			}

		});
		fixedLines.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.fixedLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fixedLines.getText()));
				}
			}

		});
		EditingUtils.setID(fixedLines, ScoViewsRepository.ImprovementChangeOrders.Properties.fixedLines);
		EditingUtils.setEEFtype(fixedLines, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.Properties.fixedLines, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createFixedLinesText

		// End of user code
		return parent;
	}

	
	protected Composite createRepairEffortText(Composite parent) {
		createDescription(parent, ScoViewsRepository.ImprovementChangeOrders.Properties.repairEffort, ScoMessages.ImprovementChangeOrdersPropertiesEditionPart_RepairEffortLabel);
		repairEffort = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData repairEffortData = new GridData(GridData.FILL_HORIZONTAL);
		repairEffort.setLayoutData(repairEffortData);
		repairEffort.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.repairEffort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repairEffort.getText()));
			}

		});
		repairEffort.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ImprovementChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.ImprovementChangeOrders.Properties.repairEffort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repairEffort.getText()));
				}
			}

		});
		EditingUtils.setID(repairEffort, ScoViewsRepository.ImprovementChangeOrders.Properties.repairEffort);
		EditingUtils.setEEFtype(repairEffort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.ImprovementChangeOrders.Properties.repairEffort, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createRepairEffortText

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
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ImprovementChangeOrders.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ScoMessages.ImprovementChangeOrders_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ImprovementChangeOrders.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(ScoMessages.ImprovementChangeOrders_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#initType(Object input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
		type.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ImprovementChangeOrders.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(ScoMessages.ImprovementChangeOrders_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ImprovementChangeOrders.Properties.type);
		if (eefElementEditorReadOnlyState && type.isEnabled()) {
			type.setEnabled(false);
			type.setToolTipText(ScoMessages.ImprovementChangeOrders_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !type.isEnabled()) {
			type.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getBrokenLines()
	 * 
	 */
	public String getBrokenLines() {
		return brokenLines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setBrokenLines(String newValue)
	 * 
	 */
	public void setBrokenLines(String newValue) {
		if (newValue != null) {
			brokenLines.setText(newValue);
		} else {
			brokenLines.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ImprovementChangeOrders.Properties.brokenLines);
		if (eefElementEditorReadOnlyState && brokenLines.isEnabled()) {
			brokenLines.setEnabled(false);
			brokenLines.setToolTipText(ScoMessages.ImprovementChangeOrders_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !brokenLines.isEnabled()) {
			brokenLines.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getFixedLines()
	 * 
	 */
	public String getFixedLines() {
		return fixedLines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setFixedLines(String newValue)
	 * 
	 */
	public void setFixedLines(String newValue) {
		if (newValue != null) {
			fixedLines.setText(newValue);
		} else {
			fixedLines.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ImprovementChangeOrders.Properties.fixedLines);
		if (eefElementEditorReadOnlyState && fixedLines.isEnabled()) {
			fixedLines.setEnabled(false);
			fixedLines.setToolTipText(ScoMessages.ImprovementChangeOrders_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !fixedLines.isEnabled()) {
			fixedLines.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#getRepairEffort()
	 * 
	 */
	public String getRepairEffort() {
		return repairEffort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.ImprovementChangeOrdersPropertiesEditionPart#setRepairEffort(String newValue)
	 * 
	 */
	public void setRepairEffort(String newValue) {
		if (newValue != null) {
			repairEffort.setText(newValue);
		} else {
			repairEffort.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.ImprovementChangeOrders.Properties.repairEffort);
		if (eefElementEditorReadOnlyState && repairEffort.isEnabled()) {
			repairEffort.setEnabled(false);
			repairEffort.setToolTipText(ScoMessages.ImprovementChangeOrders_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !repairEffort.isEnabled()) {
			repairEffort.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScoMessages.ImprovementChangeOrders_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
