
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.Question;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.TemplatePropertiesEditionPart;
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
public class TemplatePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TemplatePropertiesEditionPart {

	protected EMFListEditUtil annotationEditUtil;
	protected ReferencesTable<? extends EObject> annotation;
	protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil questionEditUtil;
	protected ReferencesTable<? extends EObject> question;
	protected List<ViewerFilter> questionBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> questionFilters = new ArrayList<ViewerFilter>();
	protected Text id;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TemplatePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(AmlMessages.TemplatePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createAnnotationAdvancedTableComposition(propertiesGroup);
		createQuestionAdvancedTableComposition(propertiesGroup);
		createIdText(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAnnotationAdvancedTableComposition(Composite parent) {
		this.annotation = new ReferencesTable<Annotation>(AmlMessages.TemplatePropertiesEditionPart_AnnotationLabel, new ReferencesTableListener<Annotation>() {			
			public void handleAdd() { addToAnnotation();}
			public void handleEdit(Annotation element) { editAnnotation(element); }
			public void handleMove(Annotation element, int oldIndex, int newIndex) { moveAnnotation(element, oldIndex, newIndex); }
			public void handleRemove(Annotation element) { removeFromAnnotation(element); }
			public void navigateTo(Annotation element) { }
		});
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Template.annotation, AmlViewsRepository.SWT_KIND));
		this.annotation.createControls(parent);
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(AmlViewsRepository.Template.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveAnnotation(Annotation element, int oldIndex, int newIndex) {
		EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
		annotationEditUtil.moveElement(element, oldIndex, newIndex);
		annotation.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.annotation, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createQuestionAdvancedTableComposition(Composite parent) {
		this.question = new ReferencesTable<Question>(AmlMessages.TemplatePropertiesEditionPart_QuestionLabel, new ReferencesTableListener<Question>() {			
			public void handleAdd() { addToQuestion();}
			public void handleEdit(Question element) { editQuestion(element); }
			public void handleMove(Question element, int oldIndex, int newIndex) { moveQuestion(element, oldIndex, newIndex); }
			public void handleRemove(Question element) { removeFromQuestion(element); }
			public void navigateTo(Question element) { }
		});
		this.question.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Template.question, AmlViewsRepository.SWT_KIND));
		this.question.createControls(parent);
		GridData questionData = new GridData(GridData.FILL_HORIZONTAL);
		questionData.horizontalSpan = 3;
		this.question.setLayoutData(questionData);
		this.question.setLowerBound(0);
		this.question.setUpperBound(-1);
		question.setID(AmlViewsRepository.Template.question);
		question.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveQuestion(Question element, int oldIndex, int newIndex) {
		EObject editedElement = questionEditUtil.foundCorrespondingEObject(element);
		questionEditUtil.moveElement(element, oldIndex, newIndex);
		question.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.question, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToQuestion() {
		// Start of user code addToQuestion() method body
				Question eObject = AmlFactory.eINSTANCE.createQuestion();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						questionEditUtil.addElement(propertiesEditionObject);
						question.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.question, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromQuestion(Question element) {
		// Start of user code removeFromQuestion() method body
				EObject editedElement = questionEditUtil.foundCorrespondingEObject(element);
				questionEditUtil.removeElement(element);
				question.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.question, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editQuestion(Question element) {
		// Start of user code editQuestion() method body
				EObject editedElement = questionEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						questionEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						question.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.question, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	
	protected void createIdText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.TemplatePropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Template.id, AmlViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TemplatePropertiesEditionPartImpl.this, AmlViewsRepository.Template.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, AmlViewsRepository.Template.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Template.id, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getAnnotationToAdd()
	 * 
	 */
	public List getAnnotationToAdd() {
		return annotationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getAnnotationToRemove()
	 * 
	 */
	public List getAnnotationToRemove() {
		return annotationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getAnnotationToEdit()
	 * 
	 */
	public Map getAnnotationToEdit() {
		return annotationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getAnnotationToMove()
	 * 
	 */
	public List getAnnotationToMove() {
		return annotationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getAnnotationTable()
	 * 
	 */
	public List getAnnotationTable() {
		return annotationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#updateAnnotation(EObject newValue)
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
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnnotation(ViewerFilter filter) {
		annotationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return annotationEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getQuestionToAdd()
	 * 
	 */
	public List getQuestionToAdd() {
		return questionEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getQuestionToRemove()
	 * 
	 */
	public List getQuestionToRemove() {
		return questionEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getQuestionToEdit()
	 * 
	 */
	public Map getQuestionToEdit() {
		return questionEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getQuestionToMove()
	 * 
	 */
	public List getQuestionToMove() {
		return questionEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getQuestionTable()
	 * 
	 */
	public List getQuestionTable() {
		return questionEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#initQuestion(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initQuestion(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			questionEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			questionEditUtil = new EMFListEditUtil(current, feature);
		this.question.setInput(questionEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#updateQuestion(EObject newValue)
	 * 
	 */
	public void updateQuestion(EObject newValue) {
		if(questionEditUtil != null){
			questionEditUtil.reinit(newValue);
			question.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#addFilterQuestion(ViewerFilter filter)
	 * 
	 */
	public void addFilterToQuestion(ViewerFilter filter) {
		questionFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#addBusinessFilterQuestion(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToQuestion(ViewerFilter filter) {
		questionBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#isContainedInQuestionTable(EObject element)
	 * 
	 */
	public boolean isContainedInQuestionTable(EObject element) {
		return questionEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.TemplatePropertiesEditionPart#setId(String newValue)
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Template_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
