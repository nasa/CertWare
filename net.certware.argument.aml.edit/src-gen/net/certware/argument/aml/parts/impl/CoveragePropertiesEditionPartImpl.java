
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.CoveragePropertiesEditionPart;
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
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
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
public class CoveragePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CoveragePropertiesEditionPart {

	protected Text mixed;
	protected Button editMixed;
	private EList mixedList;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CoveragePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(AmlMessages.CoveragePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createMixedMultiValuedEditor(propertiesGroup);
	}

	protected void createMixedMultiValuedEditor(Composite parent) {
		mixed = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData mixedData = new GridData(GridData.FILL_HORIZONTAL);
		mixedData.horizontalSpan = 2;
		mixed.setLayoutData(mixedData);
		EditingUtils.setID(mixed, AmlViewsRepository.Coverage.mixed);
		EditingUtils.setEEFtype(mixed, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMixed = new Button(parent, SWT.NONE);
		editMixed.setText(AmlMessages.CoveragePropertiesEditionPart_MixedLabel);
		GridData editMixedData = new GridData();
		editMixed.setLayoutData(editMixedData);
		editMixed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject coverage = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), coverage, AmlPackage.eINSTANCE.getCoverage_Mixed().getEType(), 
						mixedList, "Coverage", null, false, false); //$NON-NLS-1$
						
				if (dialog.open() == Window.OK) {
					mixedList = dialog.getResult();
					if (mixedList == null) {
						mixedList = new BasicEList();
					}
					mixed.setText(mixedList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CoveragePropertiesEditionPartImpl.this, AmlViewsRepository.Coverage.mixed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mixedList));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMixed, AmlViewsRepository.Coverage.mixed);
		EditingUtils.setEEFtype(editMixed, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.CoveragePropertiesEditionPart#getMixed()
	 * 
	 */
	public EList getMixed() {
		return mixedList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CoveragePropertiesEditionPart#setMixed(EList newValue)
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Coverage_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
