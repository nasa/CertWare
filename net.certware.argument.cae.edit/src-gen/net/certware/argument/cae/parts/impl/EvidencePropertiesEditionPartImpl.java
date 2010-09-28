/**
 * Generated with Acceleo
 */
package net.certware.argument.cae.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.InformationElement;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.cae.CaeFactory;
import net.certware.argument.cae.Context;
import net.certware.argument.cae.parts.CaeViewsRepository;
import net.certware.argument.cae.parts.EvidencePropertiesEditionPart;
import net.certware.argument.cae.providers.CaeMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author mrb
 * 
 */
public class EvidencePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EvidencePropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
	protected ReferencesTable<? extends EObject> isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil targetEditUtil;
	protected ReferencesTable<? extends EObject> target;
	protected List<ViewerFilter> targetBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> targetFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil sourceEditUtil;
	protected ReferencesTable<? extends EObject> source;
	protected List<ViewerFilter> sourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sourceFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil contextEditUtil;
	protected ReferencesTable<? extends EObject> context;
	protected List<ViewerFilter> contextBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil evidenceEditUtil;
	protected ReferencesTable<? extends EObject> evidence;
	protected List<ViewerFilter> evidenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> evidenceFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EvidencePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(CaeMessages.EvidencePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createIdentifierText(propertiesGroup);
		createDescriptionText(propertiesGroup);
		createContentText(propertiesGroup);
		createIsTaggedAdvancedTableComposition(propertiesGroup);
		createTargetAdvancedReferencesTable(propertiesGroup);
		createSourceAdvancedReferencesTable(propertiesGroup);
		createContextAdvancedTableComposition(propertiesGroup);
		createEvidenceAdvancedReferencesTable(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, CaeMessages.EvidencePropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Evidence.identifier, CaeViewsRepository.SWT_KIND));
		identifier = new Text(parent, SWT.BORDER);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
			}

		});
		identifier.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, CaeViewsRepository.Evidence.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Evidence.identifier, CaeViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, CaeMessages.EvidencePropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Evidence.description, CaeViewsRepository.SWT_KIND));
		description = new Text(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, CaeViewsRepository.Evidence.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Evidence.description, CaeViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, CaeMessages.EvidencePropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Evidence.content, CaeViewsRepository.SWT_KIND));
		content = new Text(parent, SWT.BORDER);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		content.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, CaeViewsRepository.Evidence.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Evidence.content, CaeViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(CaeMessages.EvidencePropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Evidence.isTagged, CaeViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(CaeViewsRepository.Evidence.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromIsTagged(TaggedValue element) {
		// Start of user code removeFromIsTagged() method body
				EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
				isTaggedEditUtil.removeElement(element);
				isTagged.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * 
	 */
	protected void createTargetAdvancedReferencesTable(Composite parent) {
		this.target = new ReferencesTable<ModelElement>(CaeMessages.EvidencePropertiesEditionPart_TargetLabel, new ReferencesTableListener<ModelElement>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<ModelElement> dialog = new TabElementTreeSelectionDialog<ModelElement>(resourceSet, targetFilters, targetBusinessFilters,
				"ModelElement", ArmPackage.eINSTANCE.getModelElement(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!targetEditUtil.getVirtualList().contains(elem))
								targetEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.target,
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
		this.target.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Evidence.target, CaeViewsRepository.SWT_KIND));
		this.target.createControls(parent);
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		targetData.horizontalSpan = 3;
		this.target.setLayoutData(targetData);
		this.target.disableMove();
		target.setID(CaeViewsRepository.Evidence.target);
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

		// Start of user code removeFromTarget() method body
				EObject editedElement = targetEditUtil.foundCorrespondingEObject(element);
				targetEditUtil.removeElement(element);
				target.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editTarget(ModelElement element) {

		// Start of user code editTarget() method body
				EObject editedElement = targetEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						targetEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						target.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void createSourceAdvancedReferencesTable(Composite parent) {
		this.source = new ReferencesTable<ModelElement>(CaeMessages.EvidencePropertiesEditionPart_SourceLabel, new ReferencesTableListener<ModelElement>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<ModelElement> dialog = new TabElementTreeSelectionDialog<ModelElement>(resourceSet, sourceFilters, sourceBusinessFilters,
				"ModelElement", ArmPackage.eINSTANCE.getModelElement(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!sourceEditUtil.getVirtualList().contains(elem))
								sourceEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.source,
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
		this.source.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Evidence.source, CaeViewsRepository.SWT_KIND));
		this.source.createControls(parent);
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		sourceData.horizontalSpan = 3;
		this.source.setLayoutData(sourceData);
		this.source.disableMove();
		source.setID(CaeViewsRepository.Evidence.source);
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

		// Start of user code removeFromSource() method body
				EObject editedElement = sourceEditUtil.foundCorrespondingEObject(element);
				sourceEditUtil.removeElement(element);
				source.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editSource(ModelElement element) {

		// Start of user code editSource() method body
				EObject editedElement = sourceEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						sourceEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						source.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code

	}

	/**
	 * @param container
	 * 
	 */
	protected void createContextAdvancedTableComposition(Composite parent) {
		this.context = new ReferencesTable<Context>(CaeMessages.EvidencePropertiesEditionPart_ContextLabel, new ReferencesTableListener<Context>() {			
			public void handleAdd() { addToContext();}
			public void handleEdit(Context element) { editContext(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveContext(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromContext(element); }
			public void navigateTo(Context element) { }
		});
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Evidence.context, CaeViewsRepository.SWT_KIND));
		this.context.createControls(parent);
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.setLowerBound(0);
		this.context.setUpperBound(-1);
		context.setID(CaeViewsRepository.Evidence.context);
		context.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveContext(Context element, int oldIndex, int newIndex) {
		EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
		contextEditUtil.moveElement(element, oldIndex, newIndex);
		context.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToContext() {
		// Start of user code addToContext() method body
				Context eObject = CaeFactory.eINSTANCE.createContext();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						contextEditUtil.addElement(propertiesEditionObject);
						context.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromContext(Context element) {
		// Start of user code removeFromContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				contextEditUtil.removeElement(element);
				context.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editContext(Context element) {
		// Start of user code editContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						contextEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						context.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.context, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * 
	 */
	protected void createEvidenceAdvancedReferencesTable(Composite parent) {
		this.evidence = new ReferencesTable<InformationElement>(CaeMessages.EvidencePropertiesEditionPart_EvidenceLabel, new ReferencesTableListener<InformationElement>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<InformationElement> dialog = new TabElementTreeSelectionDialog<InformationElement>(resourceSet, evidenceFilters, evidenceBusinessFilters,
				"InformationElement", ArmPackage.eINSTANCE.getInformationElement(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!evidenceEditUtil.getVirtualList().contains(elem))
								evidenceEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.evidence,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						evidence.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(InformationElement element) { editEvidence(element); }
			public void handleMove(InformationElement element, int oldIndex, int newIndex) { moveEvidence(element, oldIndex, newIndex); }
			public void handleRemove(InformationElement element) { removeFromEvidence(element); }
			public void navigateTo(InformationElement element) { }
		});
		this.evidence.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Evidence.evidence, CaeViewsRepository.SWT_KIND));
		this.evidence.createControls(parent);
		GridData evidenceData = new GridData(GridData.FILL_HORIZONTAL);
		evidenceData.horizontalSpan = 3;
		this.evidence.setLayoutData(evidenceData);
		this.evidence.disableMove();
		evidence.setID(CaeViewsRepository.Evidence.evidence);
		evidence.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveEvidence(InformationElement element, int oldIndex, int newIndex) {
		EObject editedElement = evidenceEditUtil.foundCorrespondingEObject(element);
		evidenceEditUtil.moveElement(element, oldIndex, newIndex);
		evidence.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromEvidence(InformationElement element) {

		// Start of user code removeFromEvidence() method body
				EObject editedElement = evidenceEditUtil.foundCorrespondingEObject(element);
				evidenceEditUtil.removeElement(element);
				evidence.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editEvidence(InformationElement element) {

		// Start of user code editEvidence() method body
				EObject editedElement = evidenceEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						evidenceEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						evidence.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, CaeViewsRepository.Evidence.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getTargetToAdd()
	 * 
	 */
	public List getTargetToAdd() {
		return targetEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getTargetToRemove()
	 * 
	 */
	public List getTargetToRemove() {
		return targetEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getTargetTable()
	 * 
	 */
	public List getTargetTable() {
		return targetEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#initTarget(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#updateTarget(EObject newValue)
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		targetFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		targetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#isContainedInTargetTable(EObject element)
	 * 
	 */
	public boolean isContainedInTargetTable(EObject element) {
		return targetEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getSourceToAdd()
	 * 
	 */
	public List getSourceToAdd() {
		return sourceEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getSourceToRemove()
	 * 
	 */
	public List getSourceToRemove() {
		return sourceEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getSourceTable()
	 * 
	 */
	public List getSourceTable() {
		return sourceEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#initSource(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#updateSource(EObject newValue)
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
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		sourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		sourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#isContainedInSourceTable(EObject element)
	 * 
	 */
	public boolean isContainedInSourceTable(EObject element) {
		return sourceEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getContextToAdd()
	 * 
	 */
	public List getContextToAdd() {
		return contextEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getContextToRemove()
	 * 
	 */
	public List getContextToRemove() {
		return contextEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getContextToEdit()
	 * 
	 */
	public Map getContextToEdit() {
		return contextEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getContextToMove()
	 * 
	 */
	public List getContextToMove() {
		return contextEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getContextTable()
	 * 
	 */
	public List getContextTable() {
		return contextEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#initContext(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContext(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			contextEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			contextEditUtil = new EMFListEditUtil(current, feature);
		this.context.setInput(contextEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#updateContext(EObject newValue)
	 * 
	 */
	public void updateContext(EObject newValue) {
		if(contextEditUtil != null){
			contextEditUtil.reinit(newValue);
			context.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return contextEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getEvidenceToAdd()
	 * 
	 */
	public List getEvidenceToAdd() {
		return evidenceEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getEvidenceToRemove()
	 * 
	 */
	public List getEvidenceToRemove() {
		return evidenceEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#getEvidenceTable()
	 * 
	 */
	public List getEvidenceTable() {
		return evidenceEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#initEvidence(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvidence(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			evidenceEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			evidenceEditUtil = new EMFListEditUtil(current, feature);
		this.evidence.setInput(evidenceEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#updateEvidence(EObject newValue)
	 * 
	 */
	public void updateEvidence(EObject newValue) {
		if(evidenceEditUtil != null){
			evidenceEditUtil.reinit(newValue);
			evidence.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvidence(ViewerFilter filter) {
		evidenceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#addBusinessFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvidence(ViewerFilter filter) {
		evidenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.EvidencePropertiesEditionPart#isContainedInEvidenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInEvidenceTable(EObject element) {
		return evidenceEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CaeMessages.Evidence_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
