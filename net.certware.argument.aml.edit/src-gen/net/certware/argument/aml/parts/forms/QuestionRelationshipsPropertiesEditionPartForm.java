/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart;
import net.certware.argument.aml.providers.AmlMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;


// End of user code

/**
 * 
 * 
 */
public class QuestionRelationshipsPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, QuestionRelationshipsPropertiesEditionPart {

	protected ReferencesTable dependent;
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
		CompositionSequence questionRelationshipsStep = new BindingCompositionSequence(propertiesEditionComponent);
		questionRelationshipsStep
			.addStep(AmlViewsRepository.QuestionRelationships.Properties.class)
			.addStep(AmlViewsRepository.QuestionRelationships.Properties.dependent);
		
		
		composer = new PartComposer(questionRelationshipsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AmlViewsRepository.QuestionRelationships.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == AmlViewsRepository.QuestionRelationships.Properties.dependent) {
					return createDependentTableComposition(widgetFactory, parent);
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
		propertiesSection.setText(AmlMessages.QuestionRelationshipsPropertiesEditionPart_PropertiesGroupLabel);
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

	/**
	 * @param container
	 * 
	 */
	protected Composite createDependentTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.dependent = new ReferencesTable(AmlMessages.QuestionRelationshipsPropertiesEditionPart_DependentLabel, new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dependent.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dependent.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dependent.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dependent.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dependentFilters) {
			this.dependent.addFilter(filter);
		}
		this.dependent.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.QuestionRelationships.Properties.dependent, AmlViewsRepository.FORM_KIND));
		this.dependent.createControls(parent, widgetFactory);
		this.dependent.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartForm.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData dependentData = new GridData(GridData.FILL_HORIZONTAL);
		dependentData.horizontalSpan = 3;
		this.dependent.setLayoutData(dependentData);
		this.dependent.setLowerBound(0);
		this.dependent.setUpperBound(-1);
		dependent.setID(AmlViewsRepository.QuestionRelationships.Properties.dependent);
		dependent.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#initDependent(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDependent(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		dependent.setContentProvider(contentProvider);
		dependent.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#updateDependent()
	 * 
	 */
	public void updateDependent() {
	dependent.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.QuestionRelationshipsPropertiesEditionPart#addFilterDependent(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDependent(ViewerFilter filter) {
		dependentFilters.add(filter);
		if (this.dependent != null) {
			this.dependent.addFilter(filter);
		}
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
		return ((ReferencesTableSettings)dependent.getInput()).contains(element);
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
