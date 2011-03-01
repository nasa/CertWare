
package net.certware.argument.aml.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.Answer;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.ArgumentPropertiesEditionPart;
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
 * @author mrb
 * 
 */
public class ArgumentPropertiesEditionPartForm extends CompositePropertiesEditionPart implements IFormPropertiesEditionPart, ArgumentPropertiesEditionPart {

	protected EMFListEditUtil annotationEditUtil;
		protected ReferencesTable<? extends EObject> annotation;
		protected List<ViewerFilter> annotationBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> annotationFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil answerEditUtil;
		protected ReferencesTable<? extends EObject> answer;
		protected List<ViewerFilter> answerBusinessFilters = new ArrayList<ViewerFilter>();
		protected List<ViewerFilter> answerFilters = new ArrayList<ViewerFilter>();
	protected Text id;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArgumentPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		propertiesSection.setText(AmlMessages.ArgumentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createAnnotationTableComposition(widgetFactory, propertiesGroup);
		createAnswerTableComposition(widgetFactory, propertiesGroup);
		createIdText(widgetFactory, propertiesGroup);
		propertiesSection.setClient(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAnnotationTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.annotation = new ReferencesTable<Annotation>(AmlMessages.ArgumentPropertiesEditionPart_AnnotationLabel, new ReferencesTableListener<Annotation>() {			
			public void handleAdd() { addToAnnotation();}
			public void handleEdit(Annotation element) { editAnnotation(element); }
			public void handleMove(Annotation element, int oldIndex, int newIndex) { moveAnnotation(element, oldIndex, newIndex); }
			public void handleRemove(Annotation element) { removeFromAnnotation(element); }
			public void navigateTo(Annotation element) { }
		});
		this.annotation.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Argument.annotation, AmlViewsRepository.FORM_KIND));
		this.annotation.createControls(parent, widgetFactory);
		GridData annotationData = new GridData(GridData.FILL_HORIZONTAL);
		annotationData.horizontalSpan = 3;
		this.annotation.setLayoutData(annotationData);
		this.annotation.setLowerBound(0);
		this.annotation.setUpperBound(-1);
		annotation.setID(AmlViewsRepository.Argument.annotation);
		annotation.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveAnnotation(Annotation element, int oldIndex, int newIndex) {
		EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
		annotationEditUtil.moveElement(element, oldIndex, newIndex);
		annotation.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromAnnotation(Annotation element) {
		// Start of user code for the removeFromAnnotation() method body
				EObject editedElement = annotationEditUtil.foundCorrespondingEObject(element);
				annotationEditUtil.removeElement(element);
				annotation.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.annotation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createAnswerTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.answer = new ReferencesTable<Answer>(AmlMessages.ArgumentPropertiesEditionPart_AnswerLabel, new ReferencesTableListener<Answer>() {			
			public void handleAdd() { addToAnswer();}
			public void handleEdit(Answer element) { editAnswer(element); }
			public void handleMove(Answer element, int oldIndex, int newIndex) { moveAnswer(element, oldIndex, newIndex); }
			public void handleRemove(Answer element) { removeFromAnswer(element); }
			public void navigateTo(Answer element) { }
		});
		this.answer.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Argument.answer, AmlViewsRepository.FORM_KIND));
		this.answer.createControls(parent, widgetFactory);
		GridData answerData = new GridData(GridData.FILL_HORIZONTAL);
		answerData.horizontalSpan = 3;
		this.answer.setLayoutData(answerData);
		this.answer.setLowerBound(0);
		this.answer.setUpperBound(-1);
		answer.setID(AmlViewsRepository.Argument.answer);
		answer.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveAnswer(Answer element, int oldIndex, int newIndex) {
		EObject editedElement = answerEditUtil.foundCorrespondingEObject(element);
		answerEditUtil.moveElement(element, oldIndex, newIndex);
		answer.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.answer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 * 
	 */
	protected void addToAnswer() {
		// Start of user code addToAnswer() method body
				Answer eObject = AmlFactory.eINSTANCE.createAnswer();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						answerEditUtil.addElement(propertiesEditionObject);
						answer.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.answer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		
		// End of user code

	}

	/**
	 * 
	 */
	protected void removeFromAnswer(Answer element) {
		// Start of user code for the removeFromAnswer() method body
				EObject editedElement = answerEditUtil.foundCorrespondingEObject(element);
				answerEditUtil.removeElement(element);
				answer.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.answer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void editAnswer(Answer element) {
		// Start of user code editAnswer() method body
				EObject editedElement = answerEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						answerEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						answer.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.answer, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	
	protected void createIdText(FormToolkit widgetFactory, Composite parent) {
		FormUtils.createPartLabel(widgetFactory, parent, AmlMessages.ArgumentPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Argument.id, AmlViewsRepository.FORM_KIND));
		id = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		id.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData idData = new GridData(GridData.FILL_HORIZONTAL);
		id.setLayoutData(idData);
		id.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
			}
		});
		id.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartForm.this, AmlViewsRepository.Argument.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}
		});
		EditingUtils.setID(id, AmlViewsRepository.Argument.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Argument.id, AmlViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnnotationToAdd()
	 * 
	 */
	public List getAnnotationToAdd() {
		return annotationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnnotationToRemove()
	 * 
	 */
	public List getAnnotationToRemove() {
		return annotationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnnotationToEdit()
	 * 
	 */
	public Map getAnnotationToEdit() {
		return annotationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnnotationToMove()
	 * 
	 */
	public List getAnnotationToMove() {
		return annotationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnnotationTable()
	 * 
	 */
	public List getAnnotationTable() {
		return annotationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#initAnnotation(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#updateAnnotation(EObject newValue)
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
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#addFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnnotation(ViewerFilter filter) {
		annotationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#addBusinessFilterAnnotation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnnotation(ViewerFilter filter) {
		annotationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#isContainedInAnnotationTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnnotationTable(EObject element) {
		return annotationEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnswerToAdd()
	 * 
	 */
	public List getAnswerToAdd() {
		return answerEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnswerToRemove()
	 * 
	 */
	public List getAnswerToRemove() {
		return answerEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnswerToEdit()
	 * 
	 */
	public Map getAnswerToEdit() {
		return answerEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnswerToMove()
	 * 
	 */
	public List getAnswerToMove() {
		return answerEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getAnswerTable()
	 * 
	 */
	public List getAnswerTable() {
		return answerEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#initAnswer(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnswer(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			answerEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			answerEditUtil = new EMFListEditUtil(current, feature);
		this.answer.setInput(answerEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#updateAnswer(EObject newValue)
	 * 
	 */
	public void updateAnswer(EObject newValue) {
		if(answerEditUtil != null){
			answerEditUtil.reinit(newValue);
			answer.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#addFilterAnswer(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnswer(ViewerFilter filter) {
		answerFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#addBusinessFilterAnswer(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnswer(ViewerFilter filter) {
		answerBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#isContainedInAnswerTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnswerTable(EObject element) {
		return answerEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.ArgumentPropertiesEditionPart#setId(String newValue)
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
		return AmlMessages.Argument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
