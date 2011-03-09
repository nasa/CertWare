/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts.impl;

// Start of user code for imports
import net.certware.measurement.sco.parts.ScoViewsRepository;
import net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart;
import net.certware.measurement.sco.providers.ScoMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
 * @author mrb
 * 
 */
public class TotalChangeOrdersPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TotalChangeOrdersPropertiesEditionPart {

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
	public TotalChangeOrdersPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(ScoMessages.TotalChangeOrdersPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createNameText(propertiesGroup);
		createValueText(propertiesGroup);
		createTypeEMFComboViewer(propertiesGroup);
		createBrokenLinesText(propertiesGroup);
		createFixedLinesText(propertiesGroup);
		createRepairEffortText(propertiesGroup);
	}

	
	protected void createNameText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.TotalChangeOrdersPropertiesEditionPart_NameLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.TotalChangeOrders.name, ScoViewsRepository.SWT_KIND));
		name = new Text(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ScoViewsRepository.TotalChangeOrders.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.TotalChangeOrders.name, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createValueText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.TotalChangeOrdersPropertiesEditionPart_ValueLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.TotalChangeOrders.value, ScoViewsRepository.SWT_KIND));
		value = new Text(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}

		});
		EditingUtils.setID(value, ScoViewsRepository.TotalChangeOrders.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.TotalChangeOrders.value, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTypeEMFComboViewer(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.TotalChangeOrdersPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.TotalChangeOrders.type, ScoViewsRepository.SWT_KIND));
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.setID(ScoViewsRepository.TotalChangeOrders.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.TotalChangeOrders.type, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createBrokenLinesText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.TotalChangeOrdersPropertiesEditionPart_BrokenLinesLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.TotalChangeOrders.brokenLines, ScoViewsRepository.SWT_KIND));
		brokenLines = new Text(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.brokenLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, brokenLines.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.brokenLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, brokenLines.getText()));
				}
			}

		});
		EditingUtils.setID(brokenLines, ScoViewsRepository.TotalChangeOrders.brokenLines);
		EditingUtils.setEEFtype(brokenLines, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.TotalChangeOrders.brokenLines, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createFixedLinesText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.TotalChangeOrdersPropertiesEditionPart_FixedLinesLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.TotalChangeOrders.fixedLines, ScoViewsRepository.SWT_KIND));
		fixedLines = new Text(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.fixedLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fixedLines.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.fixedLines, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, fixedLines.getText()));
				}
			}

		});
		EditingUtils.setID(fixedLines, ScoViewsRepository.TotalChangeOrders.fixedLines);
		EditingUtils.setEEFtype(fixedLines, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.TotalChangeOrders.fixedLines, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createRepairEffortText(Composite parent) {
		SWTUtils.createPartLabel(parent, ScoMessages.TotalChangeOrdersPropertiesEditionPart_RepairEffortLabel, propertiesEditionComponent.isRequired(ScoViewsRepository.TotalChangeOrders.repairEffort, ScoViewsRepository.SWT_KIND));
		repairEffort = new Text(parent, SWT.BORDER);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.repairEffort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repairEffort.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TotalChangeOrdersPropertiesEditionPartImpl.this, ScoViewsRepository.TotalChangeOrders.repairEffort, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, repairEffort.getText()));
				}
			}

		});
		EditingUtils.setID(repairEffort, ScoViewsRepository.TotalChangeOrders.repairEffort);
		EditingUtils.setEEFtype(repairEffort, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ScoViewsRepository.TotalChangeOrders.repairEffort, ScoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#initType(EEnum eenum, Enumerator current)
	 */
	public void initType(EEnum eenum, Enumerator current) {
		type.setInput(eenum.getELiterals());
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#getBrokenLines()
	 * 
	 */
	public String getBrokenLines() {
		return brokenLines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#setBrokenLines(String newValue)
	 * 
	 */
	public void setBrokenLines(String newValue) {
		if (newValue != null) {
			brokenLines.setText(newValue);
		} else {
			brokenLines.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#getFixedLines()
	 * 
	 */
	public String getFixedLines() {
		return fixedLines.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#setFixedLines(String newValue)
	 * 
	 */
	public void setFixedLines(String newValue) {
		if (newValue != null) {
			fixedLines.setText(newValue);
		} else {
			fixedLines.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#getRepairEffort()
	 * 
	 */
	public String getRepairEffort() {
		return repairEffort.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.TotalChangeOrdersPropertiesEditionPart#setRepairEffort(String newValue)
	 * 
	 */
	public void setRepairEffort(String newValue) {
		if (newValue != null) {
			repairEffort.setText(newValue);
		} else {
			repairEffort.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScoMessages.TotalChangeOrders_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
