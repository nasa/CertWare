
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlDocumentPropertiesEditionPart;
import net.certware.argument.aml.parts.AmlViewsRepository;
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
public class AmlDocumentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AmlDocumentPropertiesEditionPart {

	protected Text group;
	protected Button editGroup;
	private EList groupList;
	protected Text version;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AmlDocumentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(AmlMessages.AmlDocumentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createGroupMultiValuedEditor(propertiesGroup);
		createVersionText(propertiesGroup);
	}

	protected void createGroupMultiValuedEditor(Composite parent) {
		group = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData groupData = new GridData(GridData.FILL_HORIZONTAL);
		groupData.horizontalSpan = 2;
		group.setLayoutData(groupData);
		EditingUtils.setID(group, AmlViewsRepository.AmlDocument.group);
		EditingUtils.setEEFtype(group, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editGroup = new Button(parent, SWT.NONE);
		editGroup.setText(AmlMessages.AmlDocumentPropertiesEditionPart_GroupLabel);
		GridData editGroupData = new GridData();
		editGroup.setLayoutData(editGroupData);
		editGroup.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject amlDocument = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), amlDocument, AmlPackage.eINSTANCE.getAmlDocument_Group().getEType(), 
						groupList, "AmlDocument", null, false, false); //$NON-NLS-1$
						
				if (dialog.open() == Window.OK) {
					groupList = dialog.getResult();
					if (groupList == null) {
						groupList = new BasicEList();
					}
					group.setText(groupList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AmlDocumentPropertiesEditionPartImpl.this, AmlViewsRepository.AmlDocument.group, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, groupList));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editGroup, AmlViewsRepository.AmlDocument.group);
		EditingUtils.setEEFtype(editGroup, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
	}

	
	protected void createVersionText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.AmlDocumentPropertiesEditionPart_VersionLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.AmlDocument.version, AmlViewsRepository.SWT_KIND));
		version = new Text(parent, SWT.BORDER);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AmlDocumentPropertiesEditionPartImpl.this, AmlViewsRepository.AmlDocument.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}

		});
		version.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AmlDocumentPropertiesEditionPartImpl.this, AmlViewsRepository.AmlDocument.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}

		});
		EditingUtils.setID(version, AmlViewsRepository.AmlDocument.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.AmlDocument.version, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.AmlDocumentPropertiesEditionPart#getGroup()
	 * 
	 */
	public EList getGroup() {
		return groupList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AmlDocumentPropertiesEditionPart#setGroup(EList newValue)
	 * 
	 */
	public void setGroup(EList newValue) {
		groupList = newValue;
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}
	
	public void addToGroup(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue) {
		groupList.add(newValue);		
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}
	
	public void removeToGroup(org.eclipse.emf.ecore.util.FeatureMap.Entry newValue) {
		groupList.remove(newValue);		
		if (newValue != null) {
			group.setText(groupList.toString());
		} else {
			group.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AmlDocumentPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AmlDocumentPropertiesEditionPart#setVersion(String newValue)
	 * 
	 */
	public void setVersion(String newValue) {
		if (newValue != null) {
			version.setText(newValue);
		} else {
			version.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.AmlDocument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
