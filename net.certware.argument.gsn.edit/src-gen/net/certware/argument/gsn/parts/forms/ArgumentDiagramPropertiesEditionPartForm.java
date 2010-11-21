/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.gsn.Assumption;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Goal;
import net.certware.argument.gsn.GsnFactory;
import net.certware.argument.gsn.Justification;
import net.certware.argument.gsn.Solution;
import net.certware.argument.gsn.Strategy;
import net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart;
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
public class ArgumentDiagramPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ArgumentDiagramPropertiesEditionPart {

	protected EMFListEditUtil goalsEditUtil;
		protected ReferencesTable<? extends EObject> goals;
		protected List<ViewerFilter> goalsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> goalsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil strategiesEditUtil;
		protected ReferencesTable<? extends EObject> strategies;
		protected List<ViewerFilter> strategiesBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> strategiesFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil assumptionsEditUtil;
		protected ReferencesTable<? extends EObject> assumptions;
		protected List<ViewerFilter> assumptionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> assumptionsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil solutionsEditUtil;
		protected ReferencesTable<? extends EObject> solutions;
		protected List<ViewerFilter> solutionsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> solutionsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil contextsEditUtil;
		protected ReferencesTable<? extends EObject> contexts;
		protected List<ViewerFilter> contextsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> contextsFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil justificationsEditUtil;
		protected ReferencesTable<? extends EObject> justifications;
		protected List<ViewerFilter> justificationsBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> justificationsFilters = new ArrayList<ViewerFilter>();
	protected Text version;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArgumentDiagramPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(GsnMessages.ArgumentDiagramPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createGoalsTableComposition(widgetFactory, propertiesGroup);
		createStrategiesTableComposition(widgetFactory, propertiesGroup);
		createAssumptionsTableComposition(widgetFactory, propertiesGroup);
		createSolutionsTableComposition(widgetFactory, propertiesGroup);
		createContextsTableComposition(widgetFactory, propertiesGroup);
		createJustificationsTableComposition(widgetFactory, propertiesGroup);
		createVersionText(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createGoalsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.goals = new ReferencesTable<Goal>(GsnMessages.ArgumentDiagramPropertiesEditionPart_GoalsLabel, new ReferencesTableListener<Goal>() {			
			public void handleAdd() { addToGoals();}
			public void handleEdit(Goal element) { editGoals(element); }
			public void handleMove(Goal element, int oldIndex, int newIndex) { moveGoals(element, oldIndex, newIndex); }
			public void handleRemove(Goal element) { removeFromGoals(element); }
			public void navigateTo(Goal element) { }
		});
		this.goals.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.ArgumentDiagram.goals, GsnViewsRepository.FORM_KIND));
		this.goals.createControls(parent, widgetFactory);
		GridData goalsData = new GridData(GridData.FILL_HORIZONTAL);
		goalsData.horizontalSpan = 3;
		this.goals.setLayoutData(goalsData);
		this.goals.setLowerBound(0);
		this.goals.setUpperBound(-1);
		goals.setID(GsnViewsRepository.ArgumentDiagram.goals);
		goals.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveGoals(Goal element, int oldIndex, int newIndex) {
		EObject editedElement = goalsEditUtil.foundCorrespondingEObject(element);
		goalsEditUtil.moveElement(element, oldIndex, newIndex);
		goals.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToGoals() {
		// Start of user code addToGoals() method body
				Goal eObject = GsnFactory.eINSTANCE.createGoal();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						goalsEditUtil.addElement(propertiesEditionObject);
						goals.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromGoals(Goal element) {
		// Start of user code for the removeFromGoals() method body
				EObject editedElement = goalsEditUtil.foundCorrespondingEObject(element);
				goalsEditUtil.removeElement(element);
				goals.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editGoals(Goal element) {
		// Start of user code editGoals() method body
				EObject editedElement = goalsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						goalsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						goals.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.goals, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createStrategiesTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.strategies = new ReferencesTable<Strategy>(GsnMessages.ArgumentDiagramPropertiesEditionPart_StrategiesLabel, new ReferencesTableListener<Strategy>() {			
			public void handleAdd() { addToStrategies();}
			public void handleEdit(Strategy element) { editStrategies(element); }
			public void handleMove(Strategy element, int oldIndex, int newIndex) { moveStrategies(element, oldIndex, newIndex); }
			public void handleRemove(Strategy element) { removeFromStrategies(element); }
			public void navigateTo(Strategy element) { }
		});
		this.strategies.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.ArgumentDiagram.strategies, GsnViewsRepository.FORM_KIND));
		this.strategies.createControls(parent, widgetFactory);
		GridData strategiesData = new GridData(GridData.FILL_HORIZONTAL);
		strategiesData.horizontalSpan = 3;
		this.strategies.setLayoutData(strategiesData);
		this.strategies.setLowerBound(0);
		this.strategies.setUpperBound(-1);
		strategies.setID(GsnViewsRepository.ArgumentDiagram.strategies);
		strategies.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveStrategies(Strategy element, int oldIndex, int newIndex) {
		EObject editedElement = strategiesEditUtil.foundCorrespondingEObject(element);
		strategiesEditUtil.moveElement(element, oldIndex, newIndex);
		strategies.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToStrategies() {
		// Start of user code addToStrategies() method body
				Strategy eObject = GsnFactory.eINSTANCE.createStrategy();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						strategiesEditUtil.addElement(propertiesEditionObject);
						strategies.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromStrategies(Strategy element) {
		// Start of user code for the removeFromStrategies() method body
				EObject editedElement = strategiesEditUtil.foundCorrespondingEObject(element);
				strategiesEditUtil.removeElement(element);
				strategies.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editStrategies(Strategy element) {
		// Start of user code editStrategies() method body
				EObject editedElement = strategiesEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						strategiesEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						strategies.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.strategies, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAssumptionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.assumptions = new ReferencesTable<Assumption>(GsnMessages.ArgumentDiagramPropertiesEditionPart_AssumptionsLabel, new ReferencesTableListener<Assumption>() {			
			public void handleAdd() { addToAssumptions();}
			public void handleEdit(Assumption element) { editAssumptions(element); }
			public void handleMove(Assumption element, int oldIndex, int newIndex) { moveAssumptions(element, oldIndex, newIndex); }
			public void handleRemove(Assumption element) { removeFromAssumptions(element); }
			public void navigateTo(Assumption element) { }
		});
		this.assumptions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.ArgumentDiagram.assumptions, GsnViewsRepository.FORM_KIND));
		this.assumptions.createControls(parent, widgetFactory);
		GridData assumptionsData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionsData.horizontalSpan = 3;
		this.assumptions.setLayoutData(assumptionsData);
		this.assumptions.setLowerBound(0);
		this.assumptions.setUpperBound(-1);
		assumptions.setID(GsnViewsRepository.ArgumentDiagram.assumptions);
		assumptions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveAssumptions(Assumption element, int oldIndex, int newIndex) {
		EObject editedElement = assumptionsEditUtil.foundCorrespondingEObject(element);
		assumptionsEditUtil.moveElement(element, oldIndex, newIndex);
		assumptions.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToAssumptions() {
		// Start of user code addToAssumptions() method body
				Assumption eObject = GsnFactory.eINSTANCE.createAssumption();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionsEditUtil.addElement(propertiesEditionObject);
						assumptions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromAssumptions(Assumption element) {
		// Start of user code for the removeFromAssumptions() method body
				EObject editedElement = assumptionsEditUtil.foundCorrespondingEObject(element);
				assumptionsEditUtil.removeElement(element);
				assumptions.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAssumptions(Assumption element) {
		// Start of user code editAssumptions() method body
				EObject editedElement = assumptionsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						assumptions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.assumptions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createSolutionsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.solutions = new ReferencesTable<Solution>(GsnMessages.ArgumentDiagramPropertiesEditionPart_SolutionsLabel, new ReferencesTableListener<Solution>() {			
			public void handleAdd() { addToSolutions();}
			public void handleEdit(Solution element) { editSolutions(element); }
			public void handleMove(Solution element, int oldIndex, int newIndex) { moveSolutions(element, oldIndex, newIndex); }
			public void handleRemove(Solution element) { removeFromSolutions(element); }
			public void navigateTo(Solution element) { }
		});
		this.solutions.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.ArgumentDiagram.solutions, GsnViewsRepository.FORM_KIND));
		this.solutions.createControls(parent, widgetFactory);
		GridData solutionsData = new GridData(GridData.FILL_HORIZONTAL);
		solutionsData.horizontalSpan = 3;
		this.solutions.setLayoutData(solutionsData);
		this.solutions.setLowerBound(0);
		this.solutions.setUpperBound(-1);
		solutions.setID(GsnViewsRepository.ArgumentDiagram.solutions);
		solutions.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveSolutions(Solution element, int oldIndex, int newIndex) {
		EObject editedElement = solutionsEditUtil.foundCorrespondingEObject(element);
		solutionsEditUtil.moveElement(element, oldIndex, newIndex);
		solutions.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.solutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToSolutions() {
		// Start of user code addToSolutions() method body
				Solution eObject = GsnFactory.eINSTANCE.createSolution();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						solutionsEditUtil.addElement(propertiesEditionObject);
						solutions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.solutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromSolutions(Solution element) {
		// Start of user code for the removeFromSolutions() method body
				EObject editedElement = solutionsEditUtil.foundCorrespondingEObject(element);
				solutionsEditUtil.removeElement(element);
				solutions.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.solutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editSolutions(Solution element) {
		// Start of user code editSolutions() method body
				EObject editedElement = solutionsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						solutionsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						solutions.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.solutions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createContextsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.contexts = new ReferencesTable<Context>(GsnMessages.ArgumentDiagramPropertiesEditionPart_ContextsLabel, new ReferencesTableListener<Context>() {			
			public void handleAdd() { addToContexts();}
			public void handleEdit(Context element) { editContexts(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveContexts(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromContexts(element); }
			public void navigateTo(Context element) { }
		});
		this.contexts.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.ArgumentDiagram.contexts, GsnViewsRepository.FORM_KIND));
		this.contexts.createControls(parent, widgetFactory);
		GridData contextsData = new GridData(GridData.FILL_HORIZONTAL);
		contextsData.horizontalSpan = 3;
		this.contexts.setLayoutData(contextsData);
		this.contexts.setLowerBound(0);
		this.contexts.setUpperBound(-1);
		contexts.setID(GsnViewsRepository.ArgumentDiagram.contexts);
		contexts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveContexts(Context element, int oldIndex, int newIndex) {
		EObject editedElement = contextsEditUtil.foundCorrespondingEObject(element);
		contextsEditUtil.moveElement(element, oldIndex, newIndex);
		contexts.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToContexts() {
		// Start of user code addToContexts() method body
				Context eObject = GsnFactory.eINSTANCE.createContext();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						contextsEditUtil.addElement(propertiesEditionObject);
						contexts.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromContexts(Context element) {
		// Start of user code for the removeFromContexts() method body
				EObject editedElement = contextsEditUtil.foundCorrespondingEObject(element);
				contextsEditUtil.removeElement(element);
				contexts.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editContexts(Context element) {
		// Start of user code editContexts() method body
				EObject editedElement = contextsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						contextsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						contexts.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.contexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createJustificationsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.justifications = new ReferencesTable<Justification>(GsnMessages.ArgumentDiagramPropertiesEditionPart_JustificationsLabel, new ReferencesTableListener<Justification>() {			
			public void handleAdd() { addToJustifications();}
			public void handleEdit(Justification element) { editJustifications(element); }
			public void handleMove(Justification element, int oldIndex, int newIndex) { moveJustifications(element, oldIndex, newIndex); }
			public void handleRemove(Justification element) { removeFromJustifications(element); }
			public void navigateTo(Justification element) { }
		});
		this.justifications.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.ArgumentDiagram.justifications, GsnViewsRepository.FORM_KIND));
		this.justifications.createControls(parent, widgetFactory);
		GridData justificationsData = new GridData(GridData.FILL_HORIZONTAL);
		justificationsData.horizontalSpan = 3;
		this.justifications.setLayoutData(justificationsData);
		this.justifications.setLowerBound(0);
		this.justifications.setUpperBound(-1);
		justifications.setID(GsnViewsRepository.ArgumentDiagram.justifications);
		justifications.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveJustifications(Justification element, int oldIndex, int newIndex) {
		EObject editedElement = justificationsEditUtil.foundCorrespondingEObject(element);
		justificationsEditUtil.moveElement(element, oldIndex, newIndex);
		justifications.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToJustifications() {
		// Start of user code addToJustifications() method body
				Justification eObject = GsnFactory.eINSTANCE.createJustification();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						justificationsEditUtil.addElement(propertiesEditionObject);
						justifications.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromJustifications(Justification element) {
		// Start of user code for the removeFromJustifications() method body
				EObject editedElement = justificationsEditUtil.foundCorrespondingEObject(element);
				justificationsEditUtil.removeElement(element);
				justifications.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editJustifications(Justification element) {
		// Start of user code editJustifications() method body
				EObject editedElement = justificationsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						justificationsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						justifications.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.justifications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	
	protected void createVersionText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, GsnMessages.ArgumentDiagramPropertiesEditionPart_VersionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.ArgumentDiagram.version, GsnViewsRepository.FORM_KIND));
		version = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		version.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData versionData = new GridData(GridData.FILL_HORIZONTAL);
		version.setLayoutData(versionData);
		version.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
			}
		});
		version.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentDiagramPropertiesEditionPartForm.this, GsnViewsRepository.ArgumentDiagram.version, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, version.getText()));
				}
			}
		});
		EditingUtils.setID(version, GsnViewsRepository.ArgumentDiagram.version);
		EditingUtils.setEEFtype(version, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.ArgumentDiagram.version, GsnViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getGoalsToAdd()
	 * 
	 */
	public List getGoalsToAdd() {
		return goalsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getGoalsToRemove()
	 * 
	 */
	public List getGoalsToRemove() {
		return goalsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getGoalsToEdit()
	 * 
	 */
	public Map getGoalsToEdit() {
		return goalsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getGoalsToMove()
	 * 
	 */
	public List getGoalsToMove() {
		return goalsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getGoalsTable()
	 * 
	 */
	public List getGoalsTable() {
		return goalsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#initGoals(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGoals(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			goalsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			goalsEditUtil = new EMFListEditUtil(current, feature);
		this.goals.setInput(goalsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#updateGoals(EObject newValue)
	 * 
	 */
	public void updateGoals(EObject newValue) {
		if(goalsEditUtil != null){
			goalsEditUtil.reinit(newValue);
			goals.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addFilterGoals(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGoals(ViewerFilter filter) {
		goalsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addBusinessFilterGoals(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGoals(ViewerFilter filter) {
		goalsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#isContainedInGoalsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGoalsTable(EObject element) {
		return goalsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getStrategiesToAdd()
	 * 
	 */
	public List getStrategiesToAdd() {
		return strategiesEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getStrategiesToRemove()
	 * 
	 */
	public List getStrategiesToRemove() {
		return strategiesEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getStrategiesToEdit()
	 * 
	 */
	public Map getStrategiesToEdit() {
		return strategiesEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getStrategiesToMove()
	 * 
	 */
	public List getStrategiesToMove() {
		return strategiesEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getStrategiesTable()
	 * 
	 */
	public List getStrategiesTable() {
		return strategiesEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#initStrategies(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategies(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			strategiesEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			strategiesEditUtil = new EMFListEditUtil(current, feature);
		this.strategies.setInput(strategiesEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#updateStrategies(EObject newValue)
	 * 
	 */
	public void updateStrategies(EObject newValue) {
		if(strategiesEditUtil != null){
			strategiesEditUtil.reinit(newValue);
			strategies.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addFilterStrategies(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategies(ViewerFilter filter) {
		strategiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addBusinessFilterStrategies(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategies(ViewerFilter filter) {
		strategiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#isContainedInStrategiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategiesTable(EObject element) {
		return strategiesEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getAssumptionsToAdd()
	 * 
	 */
	public List getAssumptionsToAdd() {
		return assumptionsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getAssumptionsToRemove()
	 * 
	 */
	public List getAssumptionsToRemove() {
		return assumptionsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getAssumptionsToEdit()
	 * 
	 */
	public Map getAssumptionsToEdit() {
		return assumptionsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getAssumptionsToMove()
	 * 
	 */
	public List getAssumptionsToMove() {
		return assumptionsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getAssumptionsTable()
	 * 
	 */
	public List getAssumptionsTable() {
		return assumptionsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#initAssumptions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAssumptions(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			assumptionsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			assumptionsEditUtil = new EMFListEditUtil(current, feature);
		this.assumptions.setInput(assumptionsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#updateAssumptions(EObject newValue)
	 * 
	 */
	public void updateAssumptions(EObject newValue) {
		if(assumptionsEditUtil != null){
			assumptionsEditUtil.reinit(newValue);
			assumptions.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addFilterAssumptions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumptions(ViewerFilter filter) {
		assumptionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addBusinessFilterAssumptions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumptions(ViewerFilter filter) {
		assumptionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#isContainedInAssumptionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionsTable(EObject element) {
		return assumptionsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getSolutionsToAdd()
	 * 
	 */
	public List getSolutionsToAdd() {
		return solutionsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getSolutionsToRemove()
	 * 
	 */
	public List getSolutionsToRemove() {
		return solutionsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getSolutionsToEdit()
	 * 
	 */
	public Map getSolutionsToEdit() {
		return solutionsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getSolutionsToMove()
	 * 
	 */
	public List getSolutionsToMove() {
		return solutionsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getSolutionsTable()
	 * 
	 */
	public List getSolutionsTable() {
		return solutionsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#initSolutions(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSolutions(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			solutionsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			solutionsEditUtil = new EMFListEditUtil(current, feature);
		this.solutions.setInput(solutionsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#updateSolutions(EObject newValue)
	 * 
	 */
	public void updateSolutions(EObject newValue) {
		if(solutionsEditUtil != null){
			solutionsEditUtil.reinit(newValue);
			solutions.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addFilterSolutions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolutions(ViewerFilter filter) {
		solutionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addBusinessFilterSolutions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolutions(ViewerFilter filter) {
		solutionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#isContainedInSolutionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionsTable(EObject element) {
		return solutionsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getContextsToAdd()
	 * 
	 */
	public List getContextsToAdd() {
		return contextsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getContextsToRemove()
	 * 
	 */
	public List getContextsToRemove() {
		return contextsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getContextsToEdit()
	 * 
	 */
	public Map getContextsToEdit() {
		return contextsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getContextsToMove()
	 * 
	 */
	public List getContextsToMove() {
		return contextsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getContextsTable()
	 * 
	 */
	public List getContextsTable() {
		return contextsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#initContexts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initContexts(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			contextsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			contextsEditUtil = new EMFListEditUtil(current, feature);
		this.contexts.setInput(contextsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#updateContexts(EObject newValue)
	 * 
	 */
	public void updateContexts(EObject newValue) {
		if(contextsEditUtil != null){
			contextsEditUtil.reinit(newValue);
			contexts.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addFilterContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContexts(ViewerFilter filter) {
		contextsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addBusinessFilterContexts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContexts(ViewerFilter filter) {
		contextsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#isContainedInContextsTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextsTable(EObject element) {
		return contextsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getJustificationsToAdd()
	 * 
	 */
	public List getJustificationsToAdd() {
		return justificationsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getJustificationsToRemove()
	 * 
	 */
	public List getJustificationsToRemove() {
		return justificationsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getJustificationsToEdit()
	 * 
	 */
	public Map getJustificationsToEdit() {
		return justificationsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getJustificationsToMove()
	 * 
	 */
	public List getJustificationsToMove() {
		return justificationsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getJustificationsTable()
	 * 
	 */
	public List getJustificationsTable() {
		return justificationsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#initJustifications(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initJustifications(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			justificationsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			justificationsEditUtil = new EMFListEditUtil(current, feature);
		this.justifications.setInput(justificationsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#updateJustifications(EObject newValue)
	 * 
	 */
	public void updateJustifications(EObject newValue) {
		if(justificationsEditUtil != null){
			justificationsEditUtil.reinit(newValue);
			justifications.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addFilterJustifications(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustifications(ViewerFilter filter) {
		justificationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#addBusinessFilterJustifications(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustifications(ViewerFilter filter) {
		justificationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#isContainedInJustificationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationsTable(EObject element) {
		return justificationsEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#getVersion()
	 * 
	 */
	public String getVersion() {
		return version.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.ArgumentDiagramPropertiesEditionPart#setVersion(String newValue)
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
		return GsnMessages.ArgumentDiagram_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
