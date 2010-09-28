
package net.certware.argument.eur.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.eur.Argument;
import net.certware.argument.eur.Assumption;
import net.certware.argument.eur.Context;
import net.certware.argument.eur.Criteria;
import net.certware.argument.eur.EurFactory;
import net.certware.argument.eur.EurPackage;
import net.certware.argument.eur.Justification;
import net.certware.argument.eur.Solution;
import net.certware.argument.eur.Strategy;
import net.certware.argument.eur.parts.ArgumentPropertiesEditionPart;
import net.certware.argument.eur.parts.EurViewsRepository;
import net.certware.argument.eur.providers.EurMessages;

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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author mrb
 * 
 */
public class ArgumentPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, ArgumentPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
	protected ReferencesTable<? extends EObject> isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected Button assumed;
	protected Button toBeSupported;
	protected EMFListEditUtil strategyEditUtil;
	protected ReferencesTable<? extends EObject> strategy;
	protected List<ViewerFilter> strategyBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> strategyFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil assumptionEditUtil;
	protected ReferencesTable<? extends EObject> assumption;
	protected List<ViewerFilter> assumptionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> assumptionFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil contextEditUtil;
	protected ReferencesTable<? extends EObject> context;
	protected List<ViewerFilter> contextBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> contextFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil solutionEditUtil;
	protected ReferencesTable<? extends EObject> solution;
	protected List<ViewerFilter> solutionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> solutionFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil argumentEditUtil;
	protected ReferencesTable<? extends EObject> argument;
	protected List<ViewerFilter> argumentBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> argumentFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil criteriaEditUtil;
	protected ReferencesTable<? extends EObject> criteria;
	protected List<ViewerFilter> criteriaBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> criteriaFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil justificationEditUtil;
	protected ReferencesTable<? extends EObject> justification;
	protected List<ViewerFilter> justificationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> justificationFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArgumentPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(EurMessages.ArgumentPropertiesEditionPart_PropertiesGroupLabel);
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
		createAssumedCheckbox(propertiesGroup);
		createToBeSupportedCheckbox(propertiesGroup);
		createStrategyAdvancedTableComposition(propertiesGroup);
		createAssumptionAdvancedReferencesTable(propertiesGroup);
		createContextAdvancedReferencesTable(propertiesGroup);
		createSolutionAdvancedTableComposition(propertiesGroup);
		createArgumentAdvancedTableComposition(propertiesGroup);
		createCriteriaAdvancedReferencesTable(propertiesGroup);
		createJustificationAdvancedTableComposition(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.ArgumentPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Argument.identifier, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, EurViewsRepository.Argument.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.identifier, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.ArgumentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Argument.description, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, EurViewsRepository.Argument.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.description, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, EurMessages.ArgumentPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(EurViewsRepository.Argument.content, EurViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, EurViewsRepository.Argument.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.content, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(EurMessages.ArgumentPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.isTagged, EurViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(EurViewsRepository.Argument.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	
	protected void createAssumedCheckbox(Composite parent) {
		assumed = new Button(parent, SWT.CHECK);
		assumed.setText(EurMessages.ArgumentPropertiesEditionPart_AssumedLabel);
		GridData assumedData = new GridData(GridData.FILL_HORIZONTAL);
		assumedData.horizontalSpan = 2;
		assumed.setLayoutData(assumedData);
		EditingUtils.setID(assumed, EurViewsRepository.Argument.assumed);
		EditingUtils.setEEFtype(assumed, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.assumed, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createToBeSupportedCheckbox(Composite parent) {
		toBeSupported = new Button(parent, SWT.CHECK);
		toBeSupported.setText(EurMessages.ArgumentPropertiesEditionPart_ToBeSupportedLabel);
		GridData toBeSupportedData = new GridData(GridData.FILL_HORIZONTAL);
		toBeSupportedData.horizontalSpan = 2;
		toBeSupported.setLayoutData(toBeSupportedData);
		EditingUtils.setID(toBeSupported, EurViewsRepository.Argument.toBeSupported);
		EditingUtils.setEEFtype(toBeSupported, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.toBeSupported, EurViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createStrategyAdvancedTableComposition(Composite parent) {
		this.strategy = new ReferencesTable<Strategy>(EurMessages.ArgumentPropertiesEditionPart_StrategyLabel, new ReferencesTableListener<Strategy>() {			
			public void handleAdd() { addToStrategy();}
			public void handleEdit(Strategy element) { editStrategy(element); }
			public void handleMove(Strategy element, int oldIndex, int newIndex) { moveStrategy(element, oldIndex, newIndex); }
			public void handleRemove(Strategy element) { removeFromStrategy(element); }
			public void navigateTo(Strategy element) { }
		});
		this.strategy.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.strategy, EurViewsRepository.SWT_KIND));
		this.strategy.createControls(parent);
		GridData strategyData = new GridData(GridData.FILL_HORIZONTAL);
		strategyData.horizontalSpan = 3;
		this.strategy.setLayoutData(strategyData);
		this.strategy.setLowerBound(0);
		this.strategy.setUpperBound(-1);
		strategy.setID(EurViewsRepository.Argument.strategy);
		strategy.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveStrategy(Strategy element, int oldIndex, int newIndex) {
		EObject editedElement = strategyEditUtil.foundCorrespondingEObject(element);
		strategyEditUtil.moveElement(element, oldIndex, newIndex);
		strategy.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToStrategy() {
		// Start of user code addToStrategy() method body
				Strategy eObject = EurFactory.eINSTANCE.createStrategy();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						strategyEditUtil.addElement(propertiesEditionObject);
						strategy.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.strategy, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromStrategy(Strategy element) {
		// Start of user code removeFromStrategy() method body
				EObject editedElement = strategyEditUtil.foundCorrespondingEObject(element);
				strategyEditUtil.removeElement(element);
				strategy.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.strategy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editStrategy(Strategy element) {
		// Start of user code editStrategy() method body
				EObject editedElement = strategyEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						strategyEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						strategy.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.strategy, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * 
	 */
	protected void createAssumptionAdvancedReferencesTable(Composite parent) {
		this.assumption = new ReferencesTable<Assumption>(EurMessages.ArgumentPropertiesEditionPart_AssumptionLabel, new ReferencesTableListener<Assumption>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Assumption> dialog = new TabElementTreeSelectionDialog<Assumption>(resourceSet, assumptionFilters, assumptionBusinessFilters,
				"Assumption", EurPackage.eINSTANCE.getAssumption(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!assumptionEditUtil.getVirtualList().contains(elem))
								assumptionEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.assumption,
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
		this.assumption.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.assumption, EurViewsRepository.SWT_KIND));
		this.assumption.createControls(parent);
		GridData assumptionData = new GridData(GridData.FILL_HORIZONTAL);
		assumptionData.horizontalSpan = 3;
		this.assumption.setLayoutData(assumptionData);
		this.assumption.disableMove();
		assumption.setID(EurViewsRepository.Argument.assumption);
		assumption.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveAssumption(Assumption element, int oldIndex, int newIndex) {
		EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
		assumptionEditUtil.moveElement(element, oldIndex, newIndex);
		assumption.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromAssumption(Assumption element) {

		// Start of user code removeFromAssumption() method body
				EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
				assumptionEditUtil.removeElement(element);
				assumption.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editAssumption(Assumption element) {

		// Start of user code editAssumption() method body
				EObject editedElement = assumptionEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						assumptionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						assumption.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.assumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void createContextAdvancedReferencesTable(Composite parent) {
		this.context = new ReferencesTable<Context>(EurMessages.ArgumentPropertiesEditionPart_ContextLabel, new ReferencesTableListener<Context>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Context> dialog = new TabElementTreeSelectionDialog<Context>(resourceSet, contextFilters, contextBusinessFilters,
				"Context", EurPackage.eINSTANCE.getContext(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!contextEditUtil.getVirtualList().contains(elem))
								contextEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.context,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						context.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(Context element) { editContext(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveContext(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromContext(element); }
			public void navigateTo(Context element) { }
		});
		this.context.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.context, EurViewsRepository.SWT_KIND));
		this.context.createControls(parent);
		GridData contextData = new GridData(GridData.FILL_HORIZONTAL);
		contextData.horizontalSpan = 3;
		this.context.setLayoutData(contextData);
		this.context.disableMove();
		context.setID(EurViewsRepository.Argument.context);
		context.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveContext(Context element, int oldIndex, int newIndex) {
		EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
		contextEditUtil.moveElement(element, oldIndex, newIndex);
		context.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromContext(Context element) {

		// Start of user code removeFromContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				contextEditUtil.removeElement(element);
				context.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editContext(Context element) {

		// Start of user code editContext() method body
				EObject editedElement = contextEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						contextEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						context.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.context, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code

	}

	/**
	 * @param container
	 * 
	 */
	protected void createSolutionAdvancedTableComposition(Composite parent) {
		this.solution = new ReferencesTable<Solution>(EurMessages.ArgumentPropertiesEditionPart_SolutionLabel, new ReferencesTableListener<Solution>() {			
			public void handleAdd() { addToSolution();}
			public void handleEdit(Solution element) { editSolution(element); }
			public void handleMove(Solution element, int oldIndex, int newIndex) { moveSolution(element, oldIndex, newIndex); }
			public void handleRemove(Solution element) { removeFromSolution(element); }
			public void navigateTo(Solution element) { }
		});
		this.solution.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.solution, EurViewsRepository.SWT_KIND));
		this.solution.createControls(parent);
		GridData solutionData = new GridData(GridData.FILL_HORIZONTAL);
		solutionData.horizontalSpan = 3;
		this.solution.setLayoutData(solutionData);
		this.solution.setLowerBound(0);
		this.solution.setUpperBound(-1);
		solution.setID(EurViewsRepository.Argument.solution);
		solution.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveSolution(Solution element, int oldIndex, int newIndex) {
		EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
		solutionEditUtil.moveElement(element, oldIndex, newIndex);
		solution.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToSolution() {
		// Start of user code addToSolution() method body
				Solution eObject = EurFactory.eINSTANCE.createSolution();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						solutionEditUtil.addElement(propertiesEditionObject);
						solution.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.solution, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromSolution(Solution element) {
		// Start of user code removeFromSolution() method body
				EObject editedElement = solutionEditUtil.foundCorrespondingEObject(element);
				solutionEditUtil.removeElement(element);
				solution.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.solution, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.solution, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createArgumentAdvancedTableComposition(Composite parent) {
		this.argument = new ReferencesTable<Argument>(EurMessages.ArgumentPropertiesEditionPart_ArgumentLabel, new ReferencesTableListener<Argument>() {			
			public void handleAdd() { addToArgument();}
			public void handleEdit(Argument element) { editArgument(element); }
			public void handleMove(Argument element, int oldIndex, int newIndex) { moveArgument(element, oldIndex, newIndex); }
			public void handleRemove(Argument element) { removeFromArgument(element); }
			public void navigateTo(Argument element) { }
		});
		this.argument.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.argument, EurViewsRepository.SWT_KIND));
		this.argument.createControls(parent);
		GridData argumentData = new GridData(GridData.FILL_HORIZONTAL);
		argumentData.horizontalSpan = 3;
		this.argument.setLayoutData(argumentData);
		this.argument.setLowerBound(0);
		this.argument.setUpperBound(-1);
		argument.setID(EurViewsRepository.Argument.argument);
		argument.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveArgument(Argument element, int oldIndex, int newIndex) {
		EObject editedElement = argumentEditUtil.foundCorrespondingEObject(element);
		argumentEditUtil.moveElement(element, oldIndex, newIndex);
		argument.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.argument, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromArgument(Argument element) {
		// Start of user code removeFromArgument() method body
				EObject editedElement = argumentEditUtil.foundCorrespondingEObject(element);
				argumentEditUtil.removeElement(element);
				argument.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.argument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.argument, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * 
	 */
	protected void createCriteriaAdvancedReferencesTable(Composite parent) {
		this.criteria = new ReferencesTable<Criteria>(EurMessages.ArgumentPropertiesEditionPart_CriteriaLabel, new ReferencesTableListener<Criteria>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<Criteria> dialog = new TabElementTreeSelectionDialog<Criteria>(resourceSet, criteriaFilters, criteriaBusinessFilters,
				"Criteria", EurPackage.eINSTANCE.getCriteria(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!criteriaEditUtil.getVirtualList().contains(elem))
								criteriaEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.criteria,
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
		this.criteria.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.criteria, EurViewsRepository.SWT_KIND));
		this.criteria.createControls(parent);
		GridData criteriaData = new GridData(GridData.FILL_HORIZONTAL);
		criteriaData.horizontalSpan = 3;
		this.criteria.setLayoutData(criteriaData);
		this.criteria.disableMove();
		criteria.setID(EurViewsRepository.Argument.criteria);
		criteria.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveCriteria(Criteria element, int oldIndex, int newIndex) {
		EObject editedElement = criteriaEditUtil.foundCorrespondingEObject(element);
		criteriaEditUtil.moveElement(element, oldIndex, newIndex);
		criteria.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));
	}

	/**
	 * 
	 */
	protected void removeFromCriteria(Criteria element) {

		// Start of user code removeFromCriteria() method body
				EObject editedElement = criteriaEditUtil.foundCorrespondingEObject(element);
				criteriaEditUtil.removeElement(element);
				criteria.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editCriteria(Criteria element) {

		// Start of user code editCriteria() method body
				EObject editedElement = criteriaEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						criteriaEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						criteria.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.criteria, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code

	}

	/**
	 * @param container
	 * 
	 */
	protected void createJustificationAdvancedTableComposition(Composite parent) {
		this.justification = new ReferencesTable<Justification>(EurMessages.ArgumentPropertiesEditionPart_JustificationLabel, new ReferencesTableListener<Justification>() {			
			public void handleAdd() { addToJustification();}
			public void handleEdit(Justification element) { editJustification(element); }
			public void handleMove(Justification element, int oldIndex, int newIndex) { moveJustification(element, oldIndex, newIndex); }
			public void handleRemove(Justification element) { removeFromJustification(element); }
			public void navigateTo(Justification element) { }
		});
		this.justification.setHelpText(propertiesEditionComponent.getHelpContent(EurViewsRepository.Argument.justification, EurViewsRepository.SWT_KIND));
		this.justification.createControls(parent);
		GridData justificationData = new GridData(GridData.FILL_HORIZONTAL);
		justificationData.horizontalSpan = 3;
		this.justification.setLayoutData(justificationData);
		this.justification.setLowerBound(0);
		this.justification.setUpperBound(-1);
		justification.setID(EurViewsRepository.Argument.justification);
		justification.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveJustification(Justification element, int oldIndex, int newIndex) {
		EObject editedElement = justificationEditUtil.foundCorrespondingEObject(element);
		justificationEditUtil.moveElement(element, oldIndex, newIndex);
		justification.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromJustification(Justification element) {
		// Start of user code removeFromJustification() method body
				EObject editedElement = justificationEditUtil.foundCorrespondingEObject(element);
				justificationEditUtil.removeElement(element);
				justification.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.justification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, EurViewsRepository.Argument.justification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setContent(String newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getAssumed()
	 * 
	 */
	public Boolean getAssumed() {
		return Boolean.valueOf(assumed.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setAssumed(Boolean newValue)
	 * 
	 */
	public void setAssumed(Boolean newValue) {
		if (newValue != null) {
			assumed.setSelection(newValue.booleanValue());
		} else {
			assumed.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getToBeSupported()
	 * 
	 */
	public Boolean getToBeSupported() {
		return Boolean.valueOf(toBeSupported.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#setToBeSupported(Boolean newValue)
	 * 
	 */
	public void setToBeSupported(Boolean newValue) {
		if (newValue != null) {
			toBeSupported.setSelection(newValue.booleanValue());
		} else {
			toBeSupported.setSelection(false);
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getStrategyToAdd()
	 * 
	 */
	public List getStrategyToAdd() {
		return strategyEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getStrategyToRemove()
	 * 
	 */
	public List getStrategyToRemove() {
		return strategyEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getStrategyToEdit()
	 * 
	 */
	public Map getStrategyToEdit() {
		return strategyEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getStrategyToMove()
	 * 
	 */
	public List getStrategyToMove() {
		return strategyEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getStrategyTable()
	 * 
	 */
	public List getStrategyTable() {
		return strategyEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initStrategy(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initStrategy(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			strategyEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			strategyEditUtil = new EMFListEditUtil(current, feature);
		this.strategy.setInput(strategyEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateStrategy(EObject newValue)
	 * 
	 */
	public void updateStrategy(EObject newValue) {
		if(strategyEditUtil != null){
			strategyEditUtil.reinit(newValue);
			strategy.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterStrategy(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStrategy(ViewerFilter filter) {
		strategyFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterStrategy(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStrategy(ViewerFilter filter) {
		strategyBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInStrategyTable(EObject element)
	 * 
	 */
	public boolean isContainedInStrategyTable(EObject element) {
		return strategyEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getAssumptionToAdd()
	 * 
	 */
	public List getAssumptionToAdd() {
		return assumptionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getAssumptionToRemove()
	 * 
	 */
	public List getAssumptionToRemove() {
		return assumptionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getAssumptionTable()
	 * 
	 */
	public List getAssumptionTable() {
		return assumptionEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initAssumption(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateAssumption(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAssumption(ViewerFilter filter) {
		assumptionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterAssumption(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAssumption(ViewerFilter filter) {
		assumptionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInAssumptionTable(EObject element)
	 * 
	 */
	public boolean isContainedInAssumptionTable(EObject element) {
		return assumptionEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getContextToAdd()
	 * 
	 */
	public List getContextToAdd() {
		return contextEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getContextToRemove()
	 * 
	 */
	public List getContextToRemove() {
		return contextEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getContextTable()
	 * 
	 */
	public List getContextTable() {
		return contextEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initContext(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateContext(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addFilterToContext(ViewerFilter filter) {
		contextFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterContext(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToContext(ViewerFilter filter) {
		contextBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInContextTable(EObject element)
	 * 
	 */
	public boolean isContainedInContextTable(EObject element) {
		return contextEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getSolutionToAdd()
	 * 
	 */
	public List getSolutionToAdd() {
		return solutionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getSolutionToRemove()
	 * 
	 */
	public List getSolutionToRemove() {
		return solutionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getSolutionToEdit()
	 * 
	 */
	public Map getSolutionToEdit() {
		return solutionEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getSolutionToMove()
	 * 
	 */
	public List getSolutionToMove() {
		return solutionEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getSolutionTable()
	 * 
	 */
	public List getSolutionTable() {
		return solutionEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initSolution(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateSolution(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolution(ViewerFilter filter) {
		solutionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterSolution(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolution(ViewerFilter filter) {
		solutionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInSolutionTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionTable(EObject element) {
		return solutionEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getArgumentToAdd()
	 * 
	 */
	public List getArgumentToAdd() {
		return argumentEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getArgumentToRemove()
	 * 
	 */
	public List getArgumentToRemove() {
		return argumentEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getArgumentToEdit()
	 * 
	 */
	public Map getArgumentToEdit() {
		return argumentEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getArgumentToMove()
	 * 
	 */
	public List getArgumentToMove() {
		return argumentEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getArgumentTable()
	 * 
	 */
	public List getArgumentTable() {
		return argumentEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initArgument(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateArgument(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addFilterToArgument(ViewerFilter filter) {
		argumentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterArgument(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToArgument(ViewerFilter filter) {
		argumentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInArgumentTable(EObject element)
	 * 
	 */
	public boolean isContainedInArgumentTable(EObject element) {
		return argumentEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getCriteriaToAdd()
	 * 
	 */
	public List getCriteriaToAdd() {
		return criteriaEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getCriteriaToRemove()
	 * 
	 */
	public List getCriteriaToRemove() {
		return criteriaEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getCriteriaTable()
	 * 
	 */
	public List getCriteriaTable() {
		return criteriaEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initCriteria(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateCriteria(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCriteria(ViewerFilter filter) {
		criteriaFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterCriteria(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCriteria(ViewerFilter filter) {
		criteriaBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInCriteriaTable(EObject element)
	 * 
	 */
	public boolean isContainedInCriteriaTable(EObject element) {
		return criteriaEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getJustificationToAdd()
	 * 
	 */
	public List getJustificationToAdd() {
		return justificationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getJustificationToRemove()
	 * 
	 */
	public List getJustificationToRemove() {
		return justificationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getJustificationToEdit()
	 * 
	 */
	public Map getJustificationToEdit() {
		return justificationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getJustificationToMove()
	 * 
	 */
	public List getJustificationToMove() {
		return justificationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#getJustificationTable()
	 * 
	 */
	public List getJustificationTable() {
		return justificationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#initJustification(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#updateJustification(EObject newValue)
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
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustification(ViewerFilter filter) {
		justificationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#addBusinessFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustification(ViewerFilter filter) {
		justificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.eur.parts.ArgumentPropertiesEditionPart#isContainedInJustificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationTable(EObject element) {
		return justificationEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EurMessages.Argument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
