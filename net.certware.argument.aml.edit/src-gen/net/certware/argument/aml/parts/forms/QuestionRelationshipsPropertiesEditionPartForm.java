
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.Dependent;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * @author mrb
 * 
 */
public class QuestionRelationshipsPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, QuestionRelationshipsPropertiesEditionPart {

	protected EMFListEditUtil dependentEditUtil;
		protected ReferencesTable<? extends EObject> dependent;
		protected List<ViewerFilter> dependentBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> dependentFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public QuestionRelationshipsPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(AmlMessages.QuestionRelationshipsPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createDependentTableComposition(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createDependentTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.dependent = new ReferencesTable<Dependent>(AmlMessages.QuestionRelationshipsPropertiesEditionPart_DependentLabel, new ReferencesTableListener<Dependent>() {			
			public void handleAdd() { addToDependent();}
			public void handleEdit(Dependent element) { editDependent(element); }
			public void handleMove(Dependent element, int oldIndex, int newIndex) { moveDependent(element, oldIndex, newIndex); }
			public void handleRemove(Dependent element) { removeFromDependent(element); }
			public void navigateTo(Dependent element) { }
		});
		this.dependent.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.QuestionRelationships.dependent, AmlViewsRepository.FORM_KIND));
		this.dependent.createControls(parent, widgetFactory);
		GridData dependentData = new GridData(GridData.FILL_HORIZONTAL);
		dependentData.horizontalSpan = 3;
		this.dependent.setLayoutData(dependentData);
		this.dependent.setLowerBound(0);
		this.dependent.setUpperBound(-1);
		dependent.setID(AmlViewsRepository.QuestionRelationships.dependent);
		dependent.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveDependent(Dependent element, int oldIndex, int newIndex) {
		EObject editedElement = dependentEditUtil.foundCorrespondingEObject(element);
		dependentEditUtil.moveElement(element, oldIndex, newIndex);
		dependent.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToDependent() {
		// Start of user code addToDependent() method body
				Dependent eObject = AmlFactory.eINSTANCE.createDependent();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						dependentEditUtil.addElement(propertiesEditionObject);
						dependent.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromDependent(Dependent element) {
		// Start of user code for the removeFromDependent() method body
				EObject editedElement = dependentEditUtil.foundCorrespondingEObject(element);
				dependentEditUtil.removeElement(element);
				dependent.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editDependent(Dependent element) {
		// Start of user code editDependent() method body
				EObject editedElement = dependentEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						dependentEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						dependent.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#getDependentToAdd()
	 * 
	 */
	public List getDependentToAdd() {
		return dependentEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#getDependentToRemove()
	 * 
	 */
	public List getDependentToRemove() {
		return dependentEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#getDependentToEdit()
	 * 
	 */
	public Map getDependentToEdit() {
		return dependentEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#getDependentToMove()
	 * 
	 */
	public List getDependentToMove() {
		return dependentEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#getDependentTable()
	 * 
	 */
	public List getDependentTable() {
		return dependentEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#initDependent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDependent(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			dependentEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			dependentEditUtil = new EMFListEditUtil(current, feature);
		this.dependent.setInput(dependentEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#updateDependent(EObject newValue)
	 * 
	 */
	public void updateDependent(EObject newValue) {
		if(dependentEditUtil != null){
			dependentEditUtil.reinit(newValue);
			dependent.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#addFilterDependent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDependent(ViewerFilter filter) {
		dependentFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#addBusinessFilterDependent(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDependent(ViewerFilter filter) {
		dependentBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#isContainedInDependentTable(EObject element)
	 * 
	 */
	public boolean isContainedInDependentTable(EObject element) {
		return dependentEditUtil.contains(element);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.QuestionRelationships_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
