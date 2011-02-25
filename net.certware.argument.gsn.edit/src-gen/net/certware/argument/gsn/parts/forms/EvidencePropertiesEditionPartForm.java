/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.gsn.parts.EvidencePropertiesEditionPart;
import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.providers.GsnMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
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
public class EvidencePropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, EvidencePropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
		protected ReferencesTable<? extends EObject> isTagged;
		protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil targetEditUtil;
		protected ReferencesTable<? extends EObject> target;
		protected List<ViewerFilter> targetBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> targetFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil sourceEditUtil;
		protected ReferencesTable<? extends EObject> source;
		protected List<ViewerFilter> sourceBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> sourceFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EvidencePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(GsnMessages.EvidencePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createIdentifierText(widgetFactory, propertiesGroup);
		createDescriptionText(widgetFactory, propertiesGroup);
		createContentTextarea(widgetFactory, propertiesGroup);
		createIsTaggedTableComposition(widgetFactory, propertiesGroup);
		createTargetReferencesTable(widgetFactory, propertiesGroup);
		createSourceReferencesTable(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createIdentifierText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.EvidencePropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Evidence.identifier, GsnViewsRepository.FORM_KIND));
		identifier = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		identifier.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
			}
		});
		identifier.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, GsnViewsRepository.Evidence.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.identifier, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.EvidencePropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Evidence.description, GsnViewsRepository.FORM_KIND));
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, GsnViewsRepository.Evidence.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.description, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentTextarea(FormToolkit widgetFactory, Composite parent) {
		Label contentLabel = FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.EvidencePropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Evidence.content, GsnViewsRepository.FORM_KIND));
		GridData contentLabelData = new GridData(GridData.FILL_HORIZONTAL);
		contentLabelData.horizontalSpan = 3;
		contentLabel.setLayoutData(contentLabelData);
		content = widgetFactory.createText(parent, "", SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL); //$NON-NLS-1$
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		contentData.horizontalSpan = 2;
		contentData.heightHint = 80;
		contentData.widthHint = 200;
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		EditingUtils.setID(content, GsnViewsRepository.Evidence.content);
		EditingUtils.setEEFtype(content, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.content, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(GsnMessages.EvidencePropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.isTagged, GsnViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Evidence.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToIsTagged() {
		// Start of user code addToIsTagged() method body
				TaggedValue eObject = ArmFactory.eINSTANCE.createTaggedValue();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						isTaggedEditUtil.addElement(propertiesEditionObject);
						isTagged.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromIsTagged(TaggedValue element) {
		// Start of user code for the removeFromIsTagged() method body
				EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
				isTaggedEditUtil.removeElement(element);
				isTagged.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editIsTagged(TaggedValue element) {
		// Start of user code editIsTagged() method body
				EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						isTaggedEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						isTagged.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createTargetReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.target = new ReferencesTable<ModelElement>(GsnMessages.EvidencePropertiesEditionPart_TargetLabel, new ReferencesTableListener<ModelElement>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<ModelElement> dialog = new TabElementTreeSelectionDialog<ModelElement>(resourceSet, targetFilters, targetBusinessFilters,
				"ModelElement", ArmPackage.eINSTANCE.getModelElement(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!targetEditUtil.getVirtualList().contains(elem))
								targetEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.target,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						target.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(ModelElement element) { editTarget(element); }
			public void handleMove(ModelElement element, int oldIndex, int newIndex) { moveTarget(element, oldIndex, newIndex); }
			public void handleRemove(ModelElement element) { removeFromTarget(element); }
			public void navigateTo(ModelElement element) { }
		});
		this.target.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.target, GsnViewsRepository.FORM_KIND));
		this.target.createControls(parent, widgetFactory);
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		targetData.horizontalSpan = 3;
		this.target.setLayoutData(targetData);
		this.target.disableMove();
		target.setID(GsnViewsRepository.Evidence.target);
		target.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveTarget(ModelElement element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	protected void removeFromTarget(ModelElement element) {
		// Start of user code for the removeFromTarget() method body
				EObject editedElement = targetEditUtil.foundCorrespondingEObject(element);
				targetEditUtil.removeElement(element);
				target.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editTarget(ModelElement element) {
		// Start of user code editTarget() method body		
				EObject editedElement = targetEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						targetEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						target.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createSourceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.source = new ReferencesTable<ModelElement>(GsnMessages.EvidencePropertiesEditionPart_SourceLabel, new ReferencesTableListener<ModelElement>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<ModelElement> dialog = new TabElementTreeSelectionDialog<ModelElement>(resourceSet, sourceFilters, sourceBusinessFilters,
				"ModelElement", ArmPackage.eINSTANCE.getModelElement(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!sourceEditUtil.getVirtualList().contains(elem))
								sourceEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.source,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						source.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(ModelElement element) { editSource(element); }
			public void handleMove(ModelElement element, int oldIndex, int newIndex) { moveSource(element, oldIndex, newIndex); }
			public void handleRemove(ModelElement element) { removeFromSource(element); }
			public void navigateTo(ModelElement element) { }
		});
		this.source.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Evidence.source, GsnViewsRepository.FORM_KIND));
		this.source.createControls(parent, widgetFactory);
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		sourceData.horizontalSpan = 3;
		this.source.setLayoutData(sourceData);
		this.source.disableMove();
		source.setID(GsnViewsRepository.Evidence.source);
		source.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveSource(ModelElement element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	protected void removeFromSource(ModelElement element) {
		// Start of user code for the removeFromSource() method body
				EObject editedElement = sourceEditUtil.foundCorrespondingEObject(element);
				sourceEditUtil.removeElement(element);
				source.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editSource(ModelElement element) {
		// Start of user code editSource() method body		
				EObject editedElement = sourceEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						sourceEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						source.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartForm.this, GsnViewsRepository.Evidence.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
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
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			isTaggedEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			isTaggedEditUtil = new EMFListEditUtil(current, feature);
		this.isTagged.setInput(isTaggedEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#updateIsTagged(EObject newValue)
	 * 
	 */
	public void updateIsTagged(EObject newValue) {
		if(isTaggedEditUtil != null){
			isTaggedEditUtil.reinit(newValue);
			isTagged.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getTargetToAdd()
	 * 
	 */
	public List getTargetToAdd() {
		return targetEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getTargetToRemove()
	 * 
	 */
	public List getTargetToRemove() {
		return targetEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getTargetTable()
	 * 
	 */
	public List getTargetTable() {
		return targetEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#initTarget(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTarget(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			targetEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			targetEditUtil = new EMFListEditUtil(current, feature);
		this.target.setInput(targetEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#updateTarget(EObject newValue)
	 * 
	 */
	public void updateTarget(EObject newValue) {
		if(targetEditUtil != null){
			targetEditUtil.reinit(newValue);
			target.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		targetFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		targetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#isContainedInTargetTable(EObject element)
	 * 
	 */
	public boolean isContainedInTargetTable(EObject element) {
		return targetEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getSourceToAdd()
	 * 
	 */
	public List getSourceToAdd() {
		return sourceEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getSourceToRemove()
	 * 
	 */
	public List getSourceToRemove() {
		return sourceEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#getSourceTable()
	 * 
	 */
	public List getSourceTable() {
		return sourceEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#initSource(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSource(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			sourceEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			sourceEditUtil = new EMFListEditUtil(current, feature);
		this.source.setInput(sourceEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#updateSource(EObject newValue)
	 * 
	 */
	public void updateSource(EObject newValue) {
		if(sourceEditUtil != null){
			sourceEditUtil.reinit(newValue);
			source.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		sourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		sourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.EvidencePropertiesEditionPart#isContainedInSourceTable(EObject element)
	 * 
	 */
	public boolean isContainedInSourceTable(EObject element) {
		return sourceEditUtil.contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GsnMessages.Evidence_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
