/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.parts.impl;

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
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;



// End of user code

/**
 * 
 * 
 */
public class QuestionRelationshipsPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, QuestionRelationshipsPropertiesEditionPart {

protected ReferencesTable dependent;
protected List<ViewerFilter> dependentBusinessFilters = new ArrayList<ViewerFilter>();
protected List<ViewerFilter> dependentFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public QuestionRelationshipsPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence questionRelationshipsStep = new BindingCompositionSequence(propertiesEditionComponent);
		questionRelationshipsStep
			.addStep(AmlViewsRepository.QuestionRelationships.Properties.class)
			.addStep(AmlViewsRepository.QuestionRelationships.Properties.dependent);
		
		
		composer = new PartComposer(questionRelationshipsStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == AmlViewsRepository.QuestionRelationships.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == AmlViewsRepository.QuestionRelationships.Properties.dependent) {
					return createDependentAdvancedTableComposition(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(AmlMessages.QuestionRelationshipsPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDependentAdvancedTableComposition(Composite parent) {
		this.dependent = new ReferencesTable(AmlMessages.QuestionRelationshipsPropertiesEditionPart_DependentLabel, new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartImpl.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				dependent.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartImpl.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				dependent.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartImpl.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				dependent.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartImpl.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				dependent.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.dependentFilters) {
			this.dependent.addFilter(filter);
		}
		this.dependent.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.QuestionRelationships.Properties.dependent, AmlViewsRepository.SWT_KIND));
		this.dependent.createControls(parent);
		this.dependent.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(QuestionRelationshipsPropertiesEditionPartImpl.this, AmlViewsRepository.QuestionRelationships.Properties.dependent, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
