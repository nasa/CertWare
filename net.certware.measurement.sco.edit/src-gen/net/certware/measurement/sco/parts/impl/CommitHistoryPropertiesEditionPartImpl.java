/**
 * Generated with Acceleo
 */
package net.certware.measurement.sco.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.certware.measurement.sco.parts.CommitHistoryPropertiesEditionPart;
import net.certware.measurement.sco.parts.ScoViewsRepository;
import net.certware.measurement.sco.providers.ScoMessages;

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
public class CommitHistoryPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, CommitHistoryPropertiesEditionPart {

	protected ReferencesTable commitRecord;
	protected List<ViewerFilter> commitRecordBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> commitRecordFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public CommitHistoryPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence commitHistoryStep = new BindingCompositionSequence(propertiesEditionComponent);
		commitHistoryStep
			.addStep(ScoViewsRepository.CommitHistory.Properties.class)
			.addStep(ScoViewsRepository.CommitHistory.Properties.commitRecord);
		
		
		composer = new PartComposer(commitHistoryStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ScoViewsRepository.CommitHistory.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ScoViewsRepository.CommitHistory.Properties.commitRecord) {
					return createCommitRecordAdvancedTableComposition(parent);
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
		propertiesGroup.setText(ScoMessages.CommitHistoryPropertiesEditionPart_PropertiesGroupLabel);
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
	protected Composite createCommitRecordAdvancedTableComposition(Composite parent) {
		this.commitRecord = new ReferencesTable(getDescription(ScoViewsRepository.CommitHistory.Properties.commitRecord, ScoMessages.CommitHistoryPropertiesEditionPart_CommitRecordLabel), new ReferencesTableListener() {
			public void handleAdd() { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommitHistoryPropertiesEditionPartImpl.this, ScoViewsRepository.CommitHistory.Properties.commitRecord, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				commitRecord.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommitHistoryPropertiesEditionPartImpl.this, ScoViewsRepository.CommitHistory.Properties.commitRecord, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				commitRecord.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommitHistoryPropertiesEditionPartImpl.this, ScoViewsRepository.CommitHistory.Properties.commitRecord, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				commitRecord.refresh();
			}
			public void handleRemove(EObject element) { 
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommitHistoryPropertiesEditionPartImpl.this, ScoViewsRepository.CommitHistory.Properties.commitRecord, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				commitRecord.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.commitRecordFilters) {
			this.commitRecord.addFilter(filter);
		}
		this.commitRecord.setHelpText(propertiesEditionComponent.getHelpContent(ScoViewsRepository.CommitHistory.Properties.commitRecord, ScoViewsRepository.SWT_KIND));
		this.commitRecord.createControls(parent);
		this.commitRecord.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(CommitHistoryPropertiesEditionPartImpl.this, ScoViewsRepository.CommitHistory.Properties.commitRecord, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData commitRecordData = new GridData(GridData.FILL_HORIZONTAL);
		commitRecordData.horizontalSpan = 3;
		this.commitRecord.setLayoutData(commitRecordData);
		this.commitRecord.setLowerBound(0);
		this.commitRecord.setUpperBound(-1);
		commitRecord.setID(ScoViewsRepository.CommitHistory.Properties.commitRecord);
		commitRecord.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createCommitRecordAdvancedTableComposition

		// End of user code
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
	 * @see net.certware.measurement.sco.parts.CommitHistoryPropertiesEditionPart#initCommitRecord(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCommitRecord(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		commitRecord.setContentProvider(contentProvider);
		commitRecord.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ScoViewsRepository.CommitHistory.Properties.commitRecord);
		if (eefElementEditorReadOnlyState && commitRecord.isEnabled()) {
			commitRecord.setEnabled(false);
			commitRecord.setToolTipText(ScoMessages.CommitHistory_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !commitRecord.isEnabled()) {
			commitRecord.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CommitHistoryPropertiesEditionPart#updateCommitRecord()
	 * 
	 */
	public void updateCommitRecord() {
	commitRecord.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CommitHistoryPropertiesEditionPart#addFilterCommitRecord(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCommitRecord(ViewerFilter filter) {
		commitRecordFilters.add(filter);
		if (this.commitRecord != null) {
			this.commitRecord.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CommitHistoryPropertiesEditionPart#addBusinessFilterCommitRecord(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCommitRecord(ViewerFilter filter) {
		commitRecordBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.measurement.sco.parts.CommitHistoryPropertiesEditionPart#isContainedInCommitRecordTable(EObject element)
	 * 
	 */
	public boolean isContainedInCommitRecordTable(EObject element) {
		return ((ReferencesTableSettings)commitRecord.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ScoMessages.CommitHistory_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
