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
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnFactory;
import net.certware.argument.gsn.GsnPackage;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.parts.StrategyPropertiesEditionPart;
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
public class StrategyPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, StrategyPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
		protected ReferencesTable<? extends EObject> isTagged;
		protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil goalEditUtil;
		protected ReferencesTable<? extends EObject> goal;
		protected List<ViewerFilter> goalBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> goalFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil justificationEditUtil;
		protected ReferencesTable<? extends EObject> justification;
		protected List<ViewerFilter> justificationBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> justificationFilters = new ArrayList<ViewerFilter>();
	private EMFListEditUtil solutionEditUtil;
		protected ReferencesTable<? extends EObject> solution;
		protected List<ViewerFilter> solutionBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> solutionFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil contextEditUtil;
		protected ReferencesTable<? extends EObject> context;
		protected List<ViewerFilter> contextBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> contextFilters = new ArrayList<ViewerFilter>();



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
		propertiesSection.setText(GsnMessages.StrategyPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createIdentifierText(widgetFactory, propertiesGroup);
		createDescriptionText(widgetFactory, propertiesGroup);
		createContentText(widgetFactory, propertiesGroup);
		createIsTaggedTableComposition(widgetFactory, propertiesGroup);
		createGoalTableComposition(widgetFactory, propertiesGroup);
		createJustificationTableComposition(widgetFactory, propertiesGroup);
		createSolutionReferencesTable(widgetFactory, propertiesGroup);
		createContextTableComposition(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	
	protected void createIdentifierText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.StrategyPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.identifier, GsnViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}
		});
		EditingUtils.setID(identifier, GsnViewsRepository.Strategy.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.identifier, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.StrategyPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.description, GsnViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, GsnViewsRepository.Strategy.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.description, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.StrategyPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Strategy.content, GsnViewsRepository.FORM_KIND));
		content = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		content.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}
		});
		content.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}
		});
		EditingUtils.setID(content, GsnViewsRepository.Strategy.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.content, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(GsnMessages.StrategyPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.isTagged, GsnViewsRepository.FORM_KIND));
		this.isTagged.createControls(parent, widgetFactory);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Strategy.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createGoalTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.goal = new ReferencesTable<Goal>(GsnMessages.StrategyPropertiesEditionPart_GoalLabel, new ReferencesTableListener<Goal>() {			
			public void handleAdd() { addToGoal();}
			public void handleEdit(Goal element) { editGoal(element); }
			public void handleMove(Goal element, int oldIndex, int newIndex) { moveGoal(element, oldIndex, newIndex); }
			public void handleRemove(Goal element) { removeFromGoal(element); }
			public void navigateTo(Goal element) { }
		});
		this.goal.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.goal, GsnViewsRepository.FORM_KIND));
		this.goal.createControls(parent, widgetFactory);
		GridData goalData = new GridData(GridData.FILL_HORIZONTAL);
		goalData.horizontalSpan = 3;
		this.goal.setLayoutData(goalData);
		this.goal.setLowerBound(0);
		this.goal.setUpperBound(-1);
		goal.setID(GsnViewsRepository.Strategy.goal);
		goal.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveGoal(Goal element, int oldIndex, int newIndex) {
		EObject editedElement = goalEditUtil.foundCorrespondingEObject(element);
		goalEditUtil.moveElement(element, oldIndex, newIndex);
		goal.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.goal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToGoal() {
		// Start of user code addToGoal() method body
				Goal eObject = GsnFactory.eINSTANCE.createGoal();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						goalEditUtil.addElement(propertiesEditionObject);
						goal.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.goal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromGoal(Goal element) {
		// Start of user code for the removeFromGoal() method body
				EObject editedElement = goalEditUtil.foundCorrespondingEObject(element);
				goalEditUtil.removeElement(element);
				goal.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.goal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editGoal(Goal element) {
		// Start of user code editGoal() method body
				EObject editedElement = goalEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						goalEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						goal.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.goal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createJustificationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.justification = new ReferencesTable<Justification>(GsnMessages.StrategyPropertiesEditionPart_JustificationLabel, new ReferencesTableListener<Justification>() {			
			public void handleAdd() { addToJustification();}
			public void handleEdit(Justification element) { editJustification(element); }
			public void handleMove(Justification element, int oldIndex, int newIndex) { moveJustification(element, oldIndex, newIndex); }
			public void handleRemove(Justification element) { removeFromJustification(element); }
			public void navigateTo(Justification element) { }
		});
		this.justification.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.justification, GsnViewsRepository.FORM_KIND));
		this.justification.createControls(parent, widgetFactory);
		GridData justificationData = new GridData(GridData.FILL_HORIZONTAL);
		justificationData.horizontalSpan = 3;
		this.justification.setLayoutData(justificationData);
		this.justification.setLowerBound(0);
		this.justification.setUpperBound(-1);
		justification.setID(GsnViewsRepository.Strategy.justification);
		justification.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveJustification(Justification element, int oldIndex, int newIndex) {
		EObject editedElement = justificationEditUtil.foundCorrespondingEObject(element);
		justificationEditUtil.moveElement(element, oldIndex, newIndex);
		justification.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToJustification() {
		// Start of user code addToJustification() method body
				Justification eObject = GsnFactory.eINSTANCE.createJustification();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						justificationEditUtil.addElement(propertiesEditionObject);
						justification.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createSolutionReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.solution = new ReferencesTable<Solution>(GsnMessages.StrategyPropertiesEditionPart_SolutionLabel, new ReferencesTableListener<Solution>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Solution> dialog = new TabElementTreeSelectionDialog<Solution>(resourceSet, solutionFilters, solutionBusinessFilters,
				"Solution", GsnPackage.eINSTANCE.getSolution(), current.eResource()) {
					@Override
					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!solutionEditUtil.getVirtualList().contains(elem))
								solutionEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.solution,
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
		this.solution.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.solution, GsnViewsRepository.FORM_KIND));
		this.solution.createControls(parent, widgetFactory);
		GridData solutionData = new GridData(GridData.FILL_HORIZONTAL);
		solutionData.horizontalSpan = 3;
		this.solution.setLayoutData(solutionData);
		this.solution.disableMove();
		solution.setID(GsnViewsRepository.Strategy.solution);
		solution.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveSolution(Solution element, int oldIndex, int newIndex) {
		EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
		solutionEditUtil.moveElement(element, oldIndex, newIndex);
		solution.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromSolution(Solution element) {
		// Start of user code for the removeFromSolution() method body
				EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
				solutionEditUtil.removeElement(element);
				solution.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createContextTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.context = new ReferencesTable<Context>(GsnMessages.StrategyPropertiesEditionPart_ContextLabel, new ReferencesTableListener<Context>() {			
			public void handleAdd() { addToContext();}
			public void handleEdit(Context element) { editContext(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveContext(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromContext(element); }
			public void navigateTo(Context element) { }
		});
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Strategy.context, GsnViewsRepository.FORM_KIND));
		this.context.createControls(parent, widgetFactory);
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.setLowerBound(0);
		this.context.setUpperBound(-1);
		context.setID(GsnViewsRepository.Strategy.context);
		context.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveContext(Context element, int oldIndex, int newIndex) {
		EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
		contextEditUtil.moveElement(element, oldIndex, newIndex);
		context.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToContext() {
		// Start of user code addToContext() method body
				Context eObject = GsnFactory.eINSTANCE.createContext();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						contextEditUtil.addElement(propertiesEditionObject);
						context.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromContext(Context element) {
		// Start of user code for the removeFromContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				contextEditUtil.removeElement(element);
				context.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(StrategyPropertiesEditionPartForm.this, GsnViewsRepository.Strategy.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalToAdd()
	 * 
	 */
	public List getGoalToAdd() {
		return goalEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalToRemove()
	 * 
	 */
	public List getGoalToRemove() {
		return goalEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalToEdit()
	 * 
	 */
	public Map getGoalToEdit() {
		return goalEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalToMove()
	 * 
	 */
	public List getGoalToMove() {
		return goalEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getGoalTable()
	 * 
	 */
	public List getGoalTable() {
		return goalEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initGoal(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoal(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			goalEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			goalEditUtil = new EMFListEditUtil(current, feature);
		this.goal.setInput(goalEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateGoal(EObject newValue)
	 * 
	 */
	public void updateGoal(EObject newValue) {
		if(goalEditUtil != null){
			goalEditUtil.reinit(newValue);
			goal.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterGoal(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoal(ViewerFilter filter) {
		goalFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterGoal(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGoal(ViewerFilter filter) {
		goalBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInGoalTable(EObject element)
	 * 
	 */
	public boolean isContainedInGoalTable(EObject element) {
		return goalEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationToAdd()
	 * 
	 */
	public List getJustificationToAdd() {
		return justificationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationToRemove()
	 * 
	 */
	public List getJustificationToRemove() {
		return justificationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationToEdit()
	 * 
	 */
	public Map getJustificationToEdit() {
		return justificationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationToMove()
	 * 
	 */
	public List getJustificationToMove() {
		return justificationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getJustificationTable()
	 * 
	 */
	public List getJustificationTable() {
		return justificationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initJustification(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateJustification(EObject newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustification(ViewerFilter filter) {
		justificationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustification(ViewerFilter filter) {
		justificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInJustificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationTable(EObject element) {
		return justificationEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getSolutionToAdd()
	 * 
	 */
	public List getSolutionToAdd() {
		return solutionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getSolutionToRemove()
	 * 
	 */
	public List getSolutionToRemove() {
		return solutionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getSolutionTable()
	 * 
	 */
	public List getSolutionTable() {
		return solutionEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initSolution(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateSolution(EObject newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolution(ViewerFilter filter) {
		solutionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter) {
		solutionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInSolutionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element) {
		return solutionEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getContextToAdd()
	 * 
	 */
	public List getContextToAdd() {
		return contextEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getContextToRemove()
	 * 
	 */
	public List getContextToRemove() {
		return contextEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getContextToEdit()
	 * 
	 */
	public Map getContextToEdit() {
		return contextEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getContextToMove()
	 * 
	 */
	public List getContextToMove() {
		return contextEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#getContextTable()
	 * 
	 */
	public List getContextTable() {
		return contextEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#initContext(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#updateContext(EObject newValue)
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
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.StrategyPropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return contextEditUtil.contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GsnMessages.Strategy_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
