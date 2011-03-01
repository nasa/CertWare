
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.AnnotationPropertiesEditionPart;
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
public class AnnotationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AnnotationPropertiesEditionPart {

	protected Text mixed;
	protected Button editMixed;
	private EList mixedList;
	protected Text id;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AnnotationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(AmlMessages.AnnotationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createMixedMultiValuedEditor(propertiesGroup);
		createIdText(propertiesGroup);
	}

	protected void createMixedMultiValuedEditor(Composite parent) {
		mixed = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		GridData mixedData = new GridData(GridData.FILL_HORIZONTAL);
		mixedData.horizontalSpan = 2;
		mixed.setLayoutData(mixedData);
		EditingUtils.setID(mixed, AmlViewsRepository.Annotation.mixed);
		EditingUtils.setEEFtype(mixed, "eef::MultiValuedEditor::field"); //$NON-NLS-1$
		editMixed = new Button(parent, SWT.NONE);
		editMixed.setText(AmlMessages.AnnotationPropertiesEditionPart_MixedLabel);
		GridData editMixedData = new GridData();
		editMixed.setLayoutData(editMixedData);
		editMixed.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			public void widgetSelected(SelectionEvent e) {
				EObject annotation = PropertiesContextService.getInstance().lastElement();
				FeatureEditorDialog dialog = new FeatureEditorDialog(Display.getDefault().getActiveShell(), new AdapterFactoryLabelProvider(adapterFactory), annotation, AmlPackage.eINSTANCE.getAnnotation_Mixed().getEType(), 
						mixedList, "Annotation", null, false, false); //$NON-NLS-1$
						
				if (dialog.open() == Window.OK) {
					mixedList = dialog.getResult();
					if (mixedList == null) {
						mixedList = new BasicEList();
					}
					mixed.setText(mixedList.toString());
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, AmlViewsRepository.Annotation.mixed, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mixedList));
					setHasChanged(true);
				}
			}
		});
		EditingUtils.setID(editMixed, AmlViewsRepository.Annotation.mixed);
		EditingUtils.setEEFtype(editMixed, "eef::MultiValuedEditor::browsebutton"); //$NON-NLS-1$
	}

	
	protected void createIdText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.AnnotationPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Annotation.id, AmlViewsRepository.SWT_KIND));
		id = new Text(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, AmlViewsRepository.Annotation.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AnnotationPropertiesEditionPartImpl.this, AmlViewsRepository.Annotation.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, AmlViewsRepository.Annotation.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Annotation.id, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.AnnotationPropertiesEditionPart#getMixed()
	 * 
	 */
	public EList getMixed() {
		return mixedList;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AnnotationPropertiesEditionPart#setMixed(EList newValue)
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
	 * @see net.certware.argument.aml.parts.AnnotationPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AnnotationPropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Annotation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
