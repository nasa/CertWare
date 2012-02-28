/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.util.EcoreAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
public class CollectionItemPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, CollectionItemPropertiesEditionPart {

	protected Text idRef;
	protected EMFComboViewer objectType;
	protected Text ordinal;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CollectionItemPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence collectionItemStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = collectionItemStep.addStep(AmlViewsRepository.CollectionItem.Properties.class);
		propertiesStep.addStep(AmlViewsRepository.CollectionItem.Properties.idRef);
		propertiesStep.addStep(AmlViewsRepository.CollectionItem.Properties.objectType);
		propertiesStep.addStep(AmlViewsRepository.CollectionItem.Properties.ordinal);
		
		
		composer = new PartComposer(collectionItemStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AmlViewsRepository.CollectionItem.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.CollectionItem.Properties.idRef) {
					return 		createIdRefText(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.CollectionItem.Properties.objectType) {
					return createObjectTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.CollectionItem.Properties.ordinal) {
					return 		createOrdinalText(widgetFactory, parent);
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
		propertiesSection.setText(AmlMessages.CollectionItemPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createIdRefText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.CollectionItemPropertiesEditionPart_IdRefLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.CollectionItem.Properties.idRef, AmlViewsRepository.FORM_KIND));
		idRef = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		idRef.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idRefData = new GridData(GridData.FILL_HORIZONTAL);
		idRef.setLayoutData(idRefData);
		idRef.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionItemPropertiesEditionPartForm.this, AmlViewsRepository.CollectionItem.Properties.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
			}
		});
		idRef.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionItemPropertiesEditionPartForm.this, AmlViewsRepository.CollectionItem.Properties.idRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, idRef.getText()));
				}
			}
		});
		EditingUtils.setID(idRef, AmlViewsRepository.CollectionItem.Properties.idRef);
		EditingUtils.setEEFtype(idRef, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.CollectionItem.Properties.idRef, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.CollectionItemPropertiesEditionPart_ObjectTypeLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.CollectionItem.Properties.objectType, AmlViewsRepository.FORM_KIND));
		objectType = new EMFComboViewer(parent);
		objectType.setContentProvider(new ArrayContentProvider());
		objectType.setLabelProvider(new AdapterFactoryLabelProvider(new EcoreAdapterFactory()));
		GridData objectTypeData = new GridData(GridData.FILL_HORIZONTAL);
		objectType.getCombo().setLayoutData(objectTypeData);
		objectType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionItemPropertiesEditionPartForm.this, AmlViewsRepository.CollectionItem.Properties.objectType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getObjectType()));
			}

		});
		objectType.setID(AmlViewsRepository.CollectionItem.Properties.objectType);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.CollectionItem.Properties.objectType, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOrdinalText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.CollectionItemPropertiesEditionPart_OrdinalLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.CollectionItem.Properties.ordinal, AmlViewsRepository.FORM_KIND));
		ordinal = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		ordinal.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData ordinalData = new GridData(GridData.FILL_HORIZONTAL);
		ordinal.setLayoutData(ordinalData);
		ordinal.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionItemPropertiesEditionPartForm.this, AmlViewsRepository.CollectionItem.Properties.ordinal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ordinal.getText()));
			}
		});
		ordinal.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CollectionItemPropertiesEditionPartForm.this, AmlViewsRepository.CollectionItem.Properties.ordinal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ordinal.getText()));
				}
			}
		});
		EditingUtils.setID(ordinal, AmlViewsRepository.CollectionItem.Properties.ordinal);
		EditingUtils.setEEFtype(ordinal, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.CollectionItem.Properties.ordinal, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart#getIdRef()
	 * 
	 */
	public String getIdRef() {
		return idRef.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart#setIdRef(String newValue)
	 * 
	 */
	public void setIdRef(String newValue) {
		if (newValue != null) {
			idRef.setText(newValue);
		} else {
			idRef.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart#getObjectType()
	 * 
	 */
	public Enumerator getObjectType() {
		EEnumLiteral selection = (EEnumLiteral) ((StructuredSelection) objectType.getSelection()).getFirstElement();
		return selection.getInstance();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart#initObjectType(EEnum eenum, Enumerator current)
	 */
	public void initObjectType(EEnum eenum, Enumerator current) {
		objectType.setInput(eenum.getELiterals());
		objectType.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart#setObjectType(Enumerator newValue)
	 * 
	 */
	public void setObjectType(Enumerator newValue) {
		objectType.modelUpdating(new StructuredSelection(newValue));
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart#getOrdinal()
	 * 
	 */
	public String getOrdinal() {
		return ordinal.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart#setOrdinal(String newValue)
	 * 
	 */
	public void setOrdinal(String newValue) {
		if (newValue != null) {
			ordinal.setText(newValue);
		} else {
			ordinal.setText(""); //$NON-NLS-1$
		}
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.CollectionItem_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
