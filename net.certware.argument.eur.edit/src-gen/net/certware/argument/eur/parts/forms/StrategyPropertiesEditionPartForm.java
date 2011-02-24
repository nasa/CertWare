/**
 * Copyright (c) United States Government as represented by the National Aeronautics and Space Administration.
 * All rights reserved.
 */
package net.certware.argument.eur.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.eur.Argument;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurFactory;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.Justification;
import net.certware.argument.eur.Solution;
import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.parts.StrategyPropertiesEditionPart;
import net.certware.argument.eur.providers.EurMessages;

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
 * @author mrb
 * 
 */
public class StrategyPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, StrategyPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
		protected ReferencesTable<? extends EObject> isTagged;
		protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil argumentEditUtil;
		protected ReferencesTable<? extends EObject> argument;
		protected List<ViewerFilter> argumentBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> argumentFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil justificationEditUtil;
		protected ReferencesTable<? extends EObject> justification;
		protected List<ViewerFilter> justificationBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> justificationFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil solutionEditUtil;
		protected ReferencesTable<? extends EObject> solution;
		protected List<ViewerFilter> solutionBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> solutionFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil criteriaEditUtil;
		protected ReferencesTable<? extends EObject> criteria;
		protected List<ViewerFilter> criteriaBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> criteriaFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil assumptionEditUtil;
		protected ReferencesTable<? extends EObject> assumption;
		protected List<ViewerFilter> assumptionBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> assumptionFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public StrategyPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(EurMessages.StrategyPropertiesEditionPart_PropertiesGroupLabel);
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
		createArgumentTableComposition(widgetFactory, propertiesGroup);
		createJustificationTableComposition(widgetFactory, propertiesGroup);
		createSolutionReferencesTable(widgetFactory, propertiesGroup);
		createCriteriaReferencesTable(widgetFactory, propertiesGroup);
		createAssumptionReferencesTable(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createIdentifierText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EurMessages.StrategyPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Strategy.identifier, EurViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, EurViewsRepository.Strategy.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.identifier, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, EurMessages.StrategyPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Strategy.description, EurViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, EurViewsRepository.Strategy.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.description, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentTextarea(FormToolkit widgetFactory, Composite parent) {
		Label contentLabel = FormUtils.createPartLabel(widgetFactory, parent, EurMessages.StrategyPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Strategy.content, EurViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		EditingUtils.setID(content, EurViewsRepository.Strategy.content);
		EditingUtils.setEEFtype(content, "eef::Textarea"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.content, EurViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(EurMessages.StrategyPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.isTagged, EurViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(EurViewsRepository.Strategy.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createArgumentTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.argument = new ReferencesTable<Argument>(EurMessages.StrategyPropertiesEditionPart_ArgumentLabel, new ReferencesTableListener<Argument>() {			
			public void handleAdd() { addToArgument();}
			public void handleEdit(Argument element) { editArgument(element); }
			public void handleMove(Argument element, int oldIndex, int newIndex) { moveArgument(element, oldIndex, newIndex); }
			public void handleRemove(Argument element) { removeFromArgument(element); }
			public void navigateTo(Argument element) { }
		});
		this.argument.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.argument, EurViewsRepository.FORM_KIND));
		this.argument.createControls(parent, widgetFactory);
		GridData argumentData = new GridData(GridData.FILL_HORIZONTAL);
		argumentData.horizontalSpan = 3;
		this.argument.setLayoutData(argumentData);
		this.argument.setLowerBound(0);
		this.argument.setUpperBound(-1);
		argument.setID(EurViewsRepository.Strategy.argument);
		argument.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveArgument(Argument element, int oldIndex, int newIndex) {
		EObject editedElement = argumentEditUtil.foundCorrespondingEObject(element);
		argumentEditUtil.moveElement(element, oldIndex, newIndex);
		argument.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToArgument() {
		// Start of user code addToArgument() method body
				Argument eObject = EurFactory.eINSTANCE.createArgument();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						argumentEditUtil.addElement(propertiesEditionObject);
						argument.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromArgument(Argument element) {
		// Start of user code for the removeFromArgument() method body
				EObject editedElement = argumentEditUtil.foundCorrespondingEObject(element);
				argumentEditUtil.removeElement(element);
				argument.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editArgument(Argument element) {
		// Start of user code editArgument() method body
				EObject editedElement = argumentEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						argumentEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						argument.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createJustificationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.justification = new ReferencesTable<Justification>(EurMessages.StrategyPropertiesEditionPart_JustificationLabel, new ReferencesTableListener<Justification>() {			
			public void handleAdd() { addToJustification();}
			public void handleEdit(Justification element) { editJustification(element); }
			public void handleMove(Justification element, int oldIndex, int newIndex) { moveJustification(element, oldIndex, newIndex); }
			public void handleRemove(Justification element) { removeFromJustification(element); }
			public void navigateTo(Justification element) { }
		});
		this.justification.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.justification, EurViewsRepository.FORM_KIND));
		this.justification.createControls(parent, widgetFactory);
		GridData justificationData = new GridData(GridData.FILL_HORIZONTAL);
		justificationData.horizontalSpan = 3;
		this.justification.setLayoutData(justificationData);
		this.justification.setLowerBound(0);
		this.justification.setUpperBound(-1);
		justification.setID(EurViewsRepository.Strategy.justification);
		justification.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveJustification(Justification element, int oldIndex, int newIndex) {
		EObject editedElement = justificationEditUtil.foundCorrespondingEObject(element);
		justificationEditUtil.moveElement(element, oldIndex, newIndex);
		justification.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToJustification() {
		// Start of user code addToJustification() method body
				Justification eObject = EurFactory.eINSTANCE.createJustification();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						justificationEditUtil.addElement(propertiesEditionObject);
						justification.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromJustification(Justification element) {
		// Start of user code for the removeFromJustification() method body
				EObject editedElement = justificationEditUtil.foundCorrespondingEObject(element);
				justificationEditUtil.removeElement(element);
				justification.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editJustification(Justification element) {
		// Start of user code editJustification() method body
				EObject editedElement = justificationEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						justificationEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						justification.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createSolutionReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.solution = new ReferencesTable<Solution>(EurMessages.StrategyPropertiesEditionPart_SolutionLabel, new ReferencesTableListener<Solution>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Solution> dialog = new TabElementTreeSelectionDialog<Solution>(resourceSet, solutionFilters, solutionBusinessFilters,
				"Solution", EurPackage.eINSTANCE.getSolution(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!solutionEditUtil.getVirtualList().contains(elem))
								solutionEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.solution,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						solution.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(Solution element) { editSolution(element); }
			public void handleMove(Solution element, int oldIndex, int newIndex) { moveSolution(element, oldIndex, newIndex); }
			public void handleRemove(Solution element) { removeFromSolution(element); }
			public void navigateTo(Solution element) { }
		});
		this.solution.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.solution, EurViewsRepository.FORM_KIND));
		this.solution.createControls(parent, widgetFactory);
		GridData solutionData = new GridData(GridData.FILL_HORIZONTAL);
		solutionData.horizontalSpan = 3;
		this.solution.setLayoutData(solutionData);
		this.solution.disableMove();
		solution.setID(EurViewsRepository.Strategy.solution);
		solution.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveSolution(Solution element, int oldIndex, int newIndex) {
		EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
		solutionEditUtil.moveElement(element, oldIndex, newIndex);
		solution.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromSolution(Solution element) {
		// Start of user code for the removeFromSolution() method body
				EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
				solutionEditUtil.removeElement(element);
				solution.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editSolution(Solution element) {
		// Start of user code editSolution() method body		
				EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						solutionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						solution.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createCriteriaReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.criteria = new ReferencesTable<Criteria>(EurMessages.StrategyPropertiesEditionPart_CriteriaLabel, new ReferencesTableListener<Criteria>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Criteria> dialog = new TabElementTreeSelectionDialog<Criteria>(resourceSet, criteriaFilters, criteriaBusinessFilters,
				"Criteria", EurPackage.eINSTANCE.getCriteria(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!criteriaEditUtil.getVirtualList().contains(elem))
								criteriaEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.criteria,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						criteria.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(Criteria element) { editCriteria(element); }
			public void handleMove(Criteria element, int oldIndex, int newIndex) { moveCriteria(element, oldIndex, newIndex); }
			public void handleRemove(Criteria element) { removeFromCriteria(element); }
			public void navigateTo(Criteria element) { }
		});
		this.criteria.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.criteria, EurViewsRepository.FORM_KIND));
		this.criteria.createControls(parent, widgetFactory);
		GridData criteriaData = new GridData(GridData.FILL_HORIZONTAL);
		criteriaData.horizontalSpan = 3;
		this.criteria.setLayoutData(criteriaData);
		this.criteria.disableMove();
		criteria.setID(EurViewsRepository.Strategy.criteria);
		criteria.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveCriteria(Criteria element, int oldIndex, int newIndex) {
		EObject editedElement = criteriaEditUtil.foundCorrespondingEObject(element);
		criteriaEditUtil.moveElement(element, oldIndex, newIndex);
		criteria.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromCriteria(Criteria element) {
		// Start of user code for the removeFromCriteria() method body
				EObject editedElement = criteriaEditUtil.foundCorrespondingEObject(element);
				criteriaEditUtil.removeElement(element);
				criteria.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editCriteria(Criteria element) {
		// Start of user code editCriteria() method body		
				EObject editedElement = criteriaEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						criteriaEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						criteria.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createAssumptionReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.assumption = new ReferencesTable<Assumption>(EurMessages.StrategyPropertiesEditionPart_AssumptionLabel, new ReferencesTableListener<Assumption>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Assumption> dialog = new TabElementTreeSelectionDialog<Assumption>(resourceSet, assumptionFilters, assumptionBusinessFilters,
				"Assumption", EurPackage.eINSTANCE.getAssumption(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!assumptionEditUtil.getVirtualList().contains(elem))
								assumptionEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.assumption,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						assumption.refresh();
					}
				};
				dialog.open();
			}
			public void handleEdit(Assumption element) { editAssumption(element); }
			public void handleMove(Assumption element, int oldIndex, int newIndex) { moveAssumption(element, oldIndex, newIndex); }
			public void handleRemove(Assumption element) { removeFromAssumption(element); }
			public void navigateTo(Assumption element) { }
		});
		this.assumption.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Strategy.assumption, EurViewsRepository.FORM_KIND));
		this.assumption.createControls(parent, widgetFactory);
		GridData assumptionData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionData.horizontalSpan = 3;
		this.assumption.setLayoutData(assumptionData);
		this.assumption.disableMove();
		assumption.setID(EurViewsRepository.Strategy.assumption);
		assumption.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveAssumption(Assumption element, int oldIndex, int newIndex) {
		EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
		assumptionEditUtil.moveElement(element, oldIndex, newIndex);
		assumption.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromAssumption(Assumption element) {
		// Start of user code for the removeFromAssumption() method body
				EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
				assumptionEditUtil.removeElement(element);
				assumption.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAssumption(Assumption element) {
		// Start of user code editAssumption() method body		
				EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						assumption.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, EurViewsRepository.Strategy.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getArgumentToAdd()
	 * 
	 */
	public List getArgumentToAdd() {
		return argumentEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getArgumentToRemove()
	 * 
	 */
	public List getArgumentToRemove() {
		return argumentEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getArgumentToEdit()
	 * 
	 */
	public Map getArgumentToEdit() {
		return argumentEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getArgumentToMove()
	 * 
	 */
	public List getArgumentToMove() {
		return argumentEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getArgumentTable()
	 * 
	 */
	public List getArgumentTable() {
		return argumentEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initArgument(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initArgument(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			argumentEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			argumentEditUtil = new EMFListEditUtil(current, feature);
		this.argument.setInput(argumentEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateArgument(EObject newValue)
	 * 
	 */
	public void updateArgument(EObject newValue) {
		if(argumentEditUtil != null){
			argumentEditUtil.reinit(newValue);
			argument.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArgument(ViewerFilter filter) {
		argumentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgument(ViewerFilter filter) {
		argumentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInArgumentTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentTable(EObject element) {
		return argumentEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getJustificationToAdd()
	 * 
	 */
	public List getJustificationToAdd() {
		return justificationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getJustificationToRemove()
	 * 
	 */
	public List getJustificationToRemove() {
		return justificationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getJustificationToEdit()
	 * 
	 */
	public Map getJustificationToEdit() {
		return justificationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getJustificationToMove()
	 * 
	 */
	public List getJustificationToMove() {
		return justificationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getJustificationTable()
	 * 
	 */
	public List getJustificationTable() {
		return justificationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initJustification(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initJustification(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			justificationEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			justificationEditUtil = new EMFListEditUtil(current, feature);
		this.justification.setInput(justificationEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateJustification(EObject newValue)
	 * 
	 */
	public void updateJustification(EObject newValue) {
		if(justificationEditUtil != null){
			justificationEditUtil.reinit(newValue);
			justification.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustification(ViewerFilter filter) {
		justificationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustification(ViewerFilter filter) {
		justificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInJustificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationTable(EObject element) {
		return justificationEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getSolutionToAdd()
	 * 
	 */
	public List getSolutionToAdd() {
		return solutionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getSolutionToRemove()
	 * 
	 */
	public List getSolutionToRemove() {
		return solutionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getSolutionTable()
	 * 
	 */
	public List getSolutionTable() {
		return solutionEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initSolution(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSolution(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			solutionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			solutionEditUtil = new EMFListEditUtil(current, feature);
		this.solution.setInput(solutionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateSolution(EObject newValue)
	 * 
	 */
	public void updateSolution(EObject newValue) {
		if(solutionEditUtil != null){
			solutionEditUtil.reinit(newValue);
			solution.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolution(ViewerFilter filter) {
		solutionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter) {
		solutionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInSolutionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element) {
		return solutionEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getCriteriaToAdd()
	 * 
	 */
	public List getCriteriaToAdd() {
		return criteriaEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getCriteriaToRemove()
	 * 
	 */
	public List getCriteriaToRemove() {
		return criteriaEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getCriteriaTable()
	 * 
	 */
	public List getCriteriaTable() {
		return criteriaEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initCriteria(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCriteria(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			criteriaEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			criteriaEditUtil = new EMFListEditUtil(current, feature);
		this.criteria.setInput(criteriaEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateCriteria(EObject newValue)
	 * 
	 */
	public void updateCriteria(EObject newValue) {
		if(criteriaEditUtil != null){
			criteriaEditUtil.reinit(newValue);
			criteria.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCriteria(ViewerFilter filter) {
		criteriaFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCriteria(ViewerFilter filter) {
		criteriaBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInCriteriaTable(EObject element)
	 * 
	 */
	public boolean isContainedInCriteriaTable(EObject element) {
		return criteriaEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getAssumptionToAdd()
	 * 
	 */
	public List getAssumptionToAdd() {
		return assumptionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getAssumptionToRemove()
	 * 
	 */
	public List getAssumptionToRemove() {
		return assumptionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#getAssumptionTable()
	 * 
	 */
	public List getAssumptionTable() {
		return assumptionEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#initAssumption(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssumption(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			assumptionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			assumptionEditUtil = new EMFListEditUtil(current, feature);
		this.assumption.setInput(assumptionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#updateAssumption(EObject newValue)
	 * 
	 */
	public void updateAssumption(EObject newValue) {
		if(assumptionEditUtil != null){
			assumptionEditUtil.reinit(newValue);
			assumption.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter) {
		assumptionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#addBusinessFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter) {
		assumptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.StrategyPropertiesEditionPart#isContainedInAssumptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element) {
		return assumptionEditUtil.contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EurMessages.Strategy_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
