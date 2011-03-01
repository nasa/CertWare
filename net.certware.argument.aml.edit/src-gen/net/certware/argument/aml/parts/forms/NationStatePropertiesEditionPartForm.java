
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.NationStatePropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesContextService;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author mrb
 * 
 */
public class NationStatePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, NationStatePropertiesEditionPart {

	protected Text group;
		protected Button editGroup;
		private EList groupList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public NationStatePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		createPropertiesGroup(widgetFactory, view);

		// Start of user code for additional ui definition
		
		// End of user code
	}
	/**
	 * 
	 */
	protected void createPropertiesGroup(FormToolkit widgetFactory, final Composite view) {
		Section propertiesSection = widgetFactory.createSection(view, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(AmlMessages.NationStatePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createGroupMultiValuedEditor(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	/**
	 * 
	 */
	protected void createGroupMultiValuedEditor(FormToolkit widgetFactory, Composite parent) {
		group = widgetFactory.createText(parent, "", SWT.READ_ONLY); //$NON-NLS-1$
		GridData groupData = new GridData(GridData.FILL_HORIZONTAL);
		groupData.horizontalSpan = 2;
		group.setLayoutData(groupData);
		EditingUtils.setID(group, AmlViewsRepository.NationState.group);
		EditingUtils.setEEFtype(group, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editGroup = widgetFactory.createButton(parent, AmlMessages.NationStatePropertiesEditionPart_GroupLabel, SWT.NONE);
		GridData editGroupData = new GridData();
		editGroup.setLayoutData(editGroupData);
		editGroup.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject nationState = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), nationState, AmlPackage.eINSTANCE.getNationState_Group().getEType(), 
						groupList, "NationState", null, false, false); //$NON-NLS-1$
				if (dialog.open() == Window.OK) {
					groupList = dialog.getResult();
					if (groupList == null) {
						groupList = new BasicEList();
					}
					group.setText(groupList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(NationStatePropertiesEditionPartForm.this, AmlViewsRepository.NationState.group, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, groupList));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editGroup, AmlViewsRepository.NationState.group);
		EditingUtils.setEEFtype(editGroup, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.NationStatePropertiesEditionPart#getGroup()
	 * 
	 */
	public EList getGroup() {
		return groupList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.NationStatePropertiesEditionPart#setGroup(EList newValue)
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.NationState_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
