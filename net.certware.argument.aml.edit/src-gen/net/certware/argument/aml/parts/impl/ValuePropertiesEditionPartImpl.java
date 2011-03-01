
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.ValuePropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author mrb
 * 
 */
public class ValuePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ValuePropertiesEditionPart {

	protected Text mixed;
	protected Button editMixed;
	private EList mixedList;
	protected Text type;
	protected Text unit;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ValuePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(AmlMessages.ValuePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createMixedMultiValuedEditor(propertiesGroup);
		createTypeText(propertiesGroup);
		createUnitText(propertiesGroup);
	}

	protected void createMixedMultiValuedEditor(Composite parent) {
		mixed = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData mixedData = new GridData(GridData.FILL_HORIZONTAL);
		mixedData.horizontalSpan = 2;
		mixed.setLayoutData(mixedData);
		EditingUtils.setID(mixed, AmlViewsRepository.Value.mixed);
		EditingUtils.setEEFtype(mixed, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMixed = new Button(parent, SWT.NONE);
		editMixed.setText(AmlMessages.ValuePropertiesEditionPart_MixedLabel);
		GridData editMixedData = new GridData();
		editMixed.setLayoutData(editMixedData);
		editMixed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject value = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), value, AmlPackage.eINSTANCE.getValue_Mixed().getEType(), 
						mixedList, "Value", null, false, false); //$NON-NLS-1$
						
				if (dialog.open() == Window.OK) {
					mixedList = dialog.getResult();
					if (mixedList == null) {
						mixedList = new BasicEList();
					}
					mixed.setText(mixedList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ValuePropertiesEditionPartImpl.this, AmlViewsRepository.Value.mixed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mixedList));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMixed, AmlViewsRepository.Value.mixed);
		EditingUtils.setEEFtype(editMixed, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
	}

	
	protected void createTypeText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.ValuePropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Value.type, AmlViewsRepository.SWT_KIND));
		type = new Text(parent, SWT.BORDER);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ValuePropertiesEditionPartImpl.this, AmlViewsRepository.Value.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
			}

		});
		type.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ValuePropertiesEditionPartImpl.this, AmlViewsRepository.Value.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, AmlViewsRepository.Value.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Value.type, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createUnitText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.ValuePropertiesEditionPart_UnitLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Value.unit, AmlViewsRepository.SWT_KIND));
		unit = new Text(parent, SWT.BORDER);
		GridData unitData = new GridData(GridData.FILL_HORIZONTAL);
		unit.setLayoutData(unitData);
		unit.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ValuePropertiesEditionPartImpl.this, AmlViewsRepository.Value.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unit.getText()));
			}

		});
		unit.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ValuePropertiesEditionPartImpl.this, AmlViewsRepository.Value.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unit.getText()));
				}
			}

		});
		EditingUtils.setID(unit, AmlViewsRepository.Value.unit);
		EditingUtils.setEEFtype(unit, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Value.unit, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.ValuePropertiesEditionPart#getMixed()
	 * 
	 */
	public EList getMixed() {
		return mixedList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ValuePropertiesEditionPart#setMixed(EList newValue)
	 * 
	 */
	public void setMixed(EList newValue) {
		mixedList = newValue;
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}
	
	public void addToMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue) {
		mixedList.add(newValue);		
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}
	
	public void removeToMixed(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue) {
		mixedList.remove(newValue);		
		if (newValue != null) {
			mixed.setText(mixedList.toString());
		} else {
			mixed.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ValuePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ValuePropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ValuePropertiesEditionPart#getUnit()
	 * 
	 */
	public String getUnit() {
		return unit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ValuePropertiesEditionPart#setUnit(String newValue)
	 * 
	 */
	public void setUnit(String newValue) {
		if (newValue != null) {
			unit.setText(newValue);
		} else {
			unit.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Value_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
