
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.Parameter;
import net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.providers.AmlMessages;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code	

/**
 * @author mrb
 * 
 */
public class AggregationRulePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, AggregationRulePropertiesEditionPart {

	protected EMFListEditUtil parameterEditUtil;
	protected ReferencesTable<? extends EObject> parameter;
	protected List<ViewerFilter> parameterBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> parameterFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public AggregationRulePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(AmlMessages.AggregationRulePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createParameterAdvancedTableComposition(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createParameterAdvancedTableComposition(Composite parent) {
		this.parameter = new ReferencesTable<Parameter>(AmlMessages.AggregationRulePropertiesEditionPart_ParameterLabel, new ReferencesTableListener<Parameter>() {			
			public void handleAdd() { addToParameter();}
			public void handleEdit(Parameter element) { editParameter(element); }
			public void handleMove(Parameter element, int oldIndex, int newIndex) { moveParameter(element, oldIndex, newIndex); }
			public void handleRemove(Parameter element) { removeFromParameter(element); }
			public void navigateTo(Parameter element) { }
		});
		this.parameter.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.AggregationRule.parameter, AmlViewsRepository.SWT_KIND));
		this.parameter.createControls(parent);
		GridData parameterData = new GridData(GridData.FILL_HORIZONTAL);
		parameterData.horizontalSpan = 3;
		this.parameter.setLayoutData(parameterData);
		this.parameter.setLowerBound(0);
		this.parameter.setUpperBound(-1);
		parameter.setID(AmlViewsRepository.AggregationRule.parameter);
		parameter.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveParameter(Parameter element, int oldIndex, int newIndex) {
		EObject editedElement = parameterEditUtil.foundCorrespondingEObject(element);
		parameterEditUtil.moveElement(element, oldIndex, newIndex);
		parameter.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregationRulePropertiesEditionPartImpl.this, AmlViewsRepository.AggregationRule.parameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToParameter() {
		// Start of user code addToParameter() method body
				Parameter eObject = AmlFactory.eINSTANCE.createParameter();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						parameterEditUtil.addElement(propertiesEditionObject);
						parameter.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregationRulePropertiesEditionPartImpl.this, AmlViewsRepository.AggregationRule.parameter, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromParameter(Parameter element) {
		// Start of user code removeFromParameter() method body
				EObject editedElement = parameterEditUtil.foundCorrespondingEObject(element);
				parameterEditUtil.removeElement(element);
				parameter.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregationRulePropertiesEditionPartImpl.this, AmlViewsRepository.AggregationRule.parameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editParameter(Parameter element) {
		// Start of user code editParameter() method body
				EObject editedElement = parameterEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						parameterEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						parameter.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(AggregationRulePropertiesEditionPartImpl.this, AmlViewsRepository.AggregationRule.parameter, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#getParameterToAdd()
	 * 
	 */
	public List getParameterToAdd() {
		return parameterEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#getParameterToRemove()
	 * 
	 */
	public List getParameterToRemove() {
		return parameterEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#getParameterToEdit()
	 * 
	 */
	public Map getParameterToEdit() {
		return parameterEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#getParameterToMove()
	 * 
	 */
	public List getParameterToMove() {
		return parameterEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#getParameterTable()
	 * 
	 */
	public List getParameterTable() {
		return parameterEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#initParameter(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initParameter(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			parameterEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			parameterEditUtil = new EMFListEditUtil(current, feature);
		this.parameter.setInput(parameterEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#updateParameter(EObject newValue)
	 * 
	 */
	public void updateParameter(EObject newValue) {
		if(parameterEditUtil != null){
			parameterEditUtil.reinit(newValue);
			parameter.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#addFilterParameter(ViewerFilter filter)
	 * 
	 */
	public void addFilterToParameter(ViewerFilter filter) {
		parameterFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#addBusinessFilterParameter(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToParameter(ViewerFilter filter) {
		parameterBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.AggregationRulePropertiesEditionPart#isContainedInParameterTable(EObject element)
	 * 
	 */
	public boolean isContainedInParameterTable(EObject element) {
		return parameterEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.AggregationRule_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
