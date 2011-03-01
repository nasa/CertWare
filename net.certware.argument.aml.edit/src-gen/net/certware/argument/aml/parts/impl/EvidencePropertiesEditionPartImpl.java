
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.EvidencePropertiesEditionPart;
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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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

	protected EMFListEditUtil annotationEditUtil;
	protected ReferencesTable<? extends EObject> annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected Text id;
	protected Text label;
	protected Text ordinal;



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
		propertiesGroup.setText(AmlMessages.EvidencePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createAnnotationAdvancedTableComposition(propertiesGroup);
		createIdText(propertiesGroup);
		createLabelText(propertiesGroup);
		createOrdinalText(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAnnotationAdvancedTableComposition(Composite parent) {
		this.annotation = new ReferencesTable<Annotation>(AmlMessages.EvidencePropertiesEditionPart_AnnotationLabel, new ReferencesTableListener<Annotation>() {			
			public void handleAdd() { addToAnnotation();}
			public void handleEdit(Annotation element) { editAnnotation(element); }
			public void handleMove(Annotation element, int oldIndex, int newIndex) { moveAnnotation(element, oldIndex, newIndex); }
			public void handleRemove(Annotation element) { removeFromAnnotation(element); }
			public void navigateTo(Annotation element) { }
		});
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Evidence.annotation, AmlViewsRepository.SWT_KIND));
		this.annotation.createControls(parent);
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(AmlViewsRepository.Evidence.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveAnnotation(Annotation element, int oldIndex, int newIndex) {
		EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
		annotationEditUtil.moveElement(element, oldIndex, newIndex);
		annotation.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToAnnotation() {
		// Start of user code addToAnnotation() method body
				Annotation eObject = AmlFactory.eINSTANCE.createAnnotation();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						annotationEditUtil.addElement(propertiesEditionObject);
						annotation.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromAnnotation(Annotation element) {
		// Start of user code removeFromAnnotation() method body
				EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
				annotationEditUtil.removeElement(element);
				annotation.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editAnnotation(Annotation element) {
		// Start of user code editAnnotation() method body
				EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						annotationEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						annotation.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	
	protected void createIdText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.EvidencePropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Evidence.id, AmlViewsRepository.SWT_KIND));
		id = new Text(parent, SWT.BORDER);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}

		});
		id.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, AmlViewsRepository.Evidence.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Evidence.id, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createLabelText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.EvidencePropertiesEditionPart_LabelLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Evidence.label, AmlViewsRepository.SWT_KIND));
		label = new Text(parent, SWT.BORDER);
		GridData labelData = new GridData(GridData.FILL_HORIZONTAL);
		label.setLayoutData(labelData);
		label.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.label, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label.getText()));
			}

		});
		label.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.label, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label.getText()));
				}
			}

		});
		EditingUtils.setID(label, AmlViewsRepository.Evidence.label);
		EditingUtils.setEEFtype(label, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Evidence.label, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createOrdinalText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.EvidencePropertiesEditionPart_OrdinalLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Evidence.ordinal, AmlViewsRepository.SWT_KIND));
		ordinal = new Text(parent, SWT.BORDER);
		GridData ordinalData = new GridData(GridData.FILL_HORIZONTAL);
		ordinal.setLayoutData(ordinalData);
		ordinal.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.ordinal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ordinal.getText()));
			}

		});
		ordinal.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EvidencePropertiesEditionPartImpl.this, AmlViewsRepository.Evidence.ordinal, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, ordinal.getText()));
				}
			}

		});
		EditingUtils.setID(ordinal, AmlViewsRepository.Evidence.ordinal);
		EditingUtils.setEEFtype(ordinal, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Evidence.ordinal, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#getAnnotationToAdd()
	 * 
	 */
	public List getAnnotationToAdd() {
		return annotationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#getAnnotationToRemove()
	 * 
	 */
	public List getAnnotationToRemove() {
		return annotationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#getAnnotationToEdit()
	 * 
	 */
	public Map getAnnotationToEdit() {
		return annotationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#getAnnotationToMove()
	 * 
	 */
	public List getAnnotationToMove() {
		return annotationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#getAnnotationTable()
	 * 
	 */
	public List getAnnotationTable() {
		return annotationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnnotation(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			annotationEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			annotationEditUtil = new EMFListEditUtil(current, feature);
		this.annotation.setInput(annotationEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#updateAnnotation(EObject newValue)
	 * 
	 */
	public void updateAnnotation(EObject newValue) {
		if(annotationEditUtil != null){
			annotationEditUtil.reinit(newValue);
			annotation.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnnotation(ViewerFilter filter) {
		annotationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return annotationEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#setId(String newValue)
	 * 
	 */
	public void setId(String newValue) {
		if (newValue != null) {
			id.setText(newValue);
		} else {
			id.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#getLabel()
	 * 
	 */
	public String getLabel() {
		return label.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#setLabel(String newValue)
	 * 
	 */
	public void setLabel(String newValue) {
		if (newValue != null) {
			label.setText(newValue);
		} else {
			label.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#getOrdinal()
	 * 
	 */
	public String getOrdinal() {
		return ordinal.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.EvidencePropertiesEditionPart#setOrdinal(String newValue)
	 * 
	 */
	public void setOrdinal(String newValue) {
		if (newValue != null) {
			ordinal.setText(newValue);
		} else {
			ordinal.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Evidence_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
