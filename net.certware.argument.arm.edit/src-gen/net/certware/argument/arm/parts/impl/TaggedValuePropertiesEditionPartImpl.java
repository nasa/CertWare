
package net.certware.argument.arm.parts.impl;

// Start of user code for imports
import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.parts.TaggedValuePropertiesEditionPart;
import net.certware.argument.arm.providers.ArmMessages;

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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author
 * 
 */
public class TaggedValuePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TaggedValuePropertiesEditionPart {

	protected Text key;
	protected Text value;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TaggedValuePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(ArmMessages.TaggedValuePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createKeyText(propertiesGroup);
		createValueTextarea(propertiesGroup);
	}

	
	protected void createKeyText(Composite parent) {
		SWTUtils.createPartLabel(parent, ArmMessages.TaggedValuePropertiesEditionPart_KeyLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.TaggedValue.key, ArmViewsRepository.SWT_KIND));
		key = new Text(parent, SWT.BORDER);
		GridData keyData = new GridData(GridData.FILL_HORIZONTAL);
		key.setLayoutData(keyData);
		key.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaggedValuePropertiesEditionPartImpl.this, ArmViewsRepository.TaggedValue.key, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, key.getText()));
			}

		});
		key.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TaggedValuePropertiesEditionPartImpl.this, ArmViewsRepository.TaggedValue.key, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, key.getText()));
				}
			}

		});
		EditingUtils.setID(key, ArmViewsRepository.TaggedValue.key);
		EditingUtils.setEEFtype(key, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.TaggedValue.key, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createValueTextarea(Composite parent) {
		Label valueLabel = SWTUtils.createPartLabel(parent, ArmMessages.TaggedValuePropertiesEditionPart_ValueLabel, propertiesEditionComponent.isRequired(ArmViewsRepository.TaggedValue.value, ArmViewsRepository.SWT_KIND));
		GridData valueLabelData = new GridData(GridData.FILL_HORIZONTAL);
		valueLabelData.horizontalSpan = 3;
		valueLabel.setLayoutData(valueLabelData);
		value = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		valueData.horizontalSpan = 2;
		valueData.heightHint = 80;
		valueData.widthHint = 200;
		value.setLayoutData(valueData);
		EditingUtils.setID(value, ArmViewsRepository.TaggedValue.value);
		EditingUtils.setEEFtype(value, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArmViewsRepository.TaggedValue.value, ArmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.arm.parts.TaggedValuePropertiesEditionPart#getKey()
	 * 
	 */
	public String getKey() {
		return key.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.TaggedValuePropertiesEditionPart#setKey(String newValue)
	 * 
	 */
	public void setKey(String newValue) {
		if (newValue != null) {
			key.setText(newValue);
		} else {
			key.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.TaggedValuePropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.arm.parts.TaggedValuePropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText("");  //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArmMessages.TaggedValue_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
