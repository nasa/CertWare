
package net.certware.argument.aml.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.aml.AmlFactory;
import net.certware.argument.aml.Creator;
import net.certware.argument.aml.Reader;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.MemoPropertiesEditionPart;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * @author mrb
 * 
 */
public class MemoPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, MemoPropertiesEditionPart {

	protected EMFListEditUtil creatorEditUtil;
	protected ReferencesTable<? extends EObject> creator;
	protected List<ViewerFilter> creatorBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> creatorFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil readerEditUtil;
	protected ReferencesTable<? extends EObject> reader;
	protected List<ViewerFilter> readerBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> readerFilters = new ArrayList<ViewerFilter>();
	protected Text subject;
	protected Text body;
	protected Text id;
	protected Text type;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public MemoPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		propertiesGroup.setText(AmlMessages.MemoPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createCreatorAdvancedTableComposition(propertiesGroup);
		createReaderAdvancedTableComposition(propertiesGroup);
		createSubjectTextarea(propertiesGroup);
		createBodyTextarea(propertiesGroup);
		createIdText(propertiesGroup);
		createTypeText(propertiesGroup);
	}

	/**
	 * @param container
	 * 
	 */
	protected void createCreatorAdvancedTableComposition(Composite parent) {
		this.creator = new ReferencesTable<Creator>(AmlMessages.MemoPropertiesEditionPart_CreatorLabel, new ReferencesTableListener<Creator>() {			
			public void handleAdd() { addToCreator();}
			public void handleEdit(Creator element) { editCreator(element); }
			public void handleMove(Creator element, int oldIndex, int newIndex) { moveCreator(element, oldIndex, newIndex); }
			public void handleRemove(Creator element) { removeFromCreator(element); }
			public void navigateTo(Creator element) { }
		});
		this.creator.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.creator, AmlViewsRepository.SWT_KIND));
		this.creator.createControls(parent);
		GridData creatorData = new GridData(GridData.FILL_HORIZONTAL);
		creatorData.horizontalSpan = 3;
		this.creator.setLayoutData(creatorData);
		this.creator.setLowerBound(1);
		this.creator.setUpperBound(-1);
		creator.setID(AmlViewsRepository.Memo.creator);
		creator.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveCreator(Creator element, int oldIndex, int newIndex) {
		EObject editedElement = creatorEditUtil.foundCorrespondingEObject(element);
		creatorEditUtil.moveElement(element, oldIndex, newIndex);
		creator.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.creator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToCreator() {
		// Start of user code addToCreator() method body
				Creator eObject = AmlFactory.eINSTANCE.createCreator();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						creatorEditUtil.addElement(propertiesEditionObject);
						creator.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.creator, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromCreator(Creator element) {
		// Start of user code removeFromCreator() method body
				EObject editedElement = creatorEditUtil.foundCorrespondingEObject(element);
				creatorEditUtil.removeElement(element);
				creator.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.creator, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editCreator(Creator element) {
		// Start of user code editCreator() method body
				EObject editedElement = creatorEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						creatorEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						creator.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.creator, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createReaderAdvancedTableComposition(Composite parent) {
		this.reader = new ReferencesTable<Reader>(AmlMessages.MemoPropertiesEditionPart_ReaderLabel, new ReferencesTableListener<Reader>() {			
			public void handleAdd() { addToReader();}
			public void handleEdit(Reader element) { editReader(element); }
			public void handleMove(Reader element, int oldIndex, int newIndex) { moveReader(element, oldIndex, newIndex); }
			public void handleRemove(Reader element) { removeFromReader(element); }
			public void navigateTo(Reader element) { }
		});
		this.reader.setHelpText(propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.reader, AmlViewsRepository.SWT_KIND));
		this.reader.createControls(parent);
		GridData readerData = new GridData(GridData.FILL_HORIZONTAL);
		readerData.horizontalSpan = 3;
		this.reader.setLayoutData(readerData);
		this.reader.setLowerBound(0);
		this.reader.setUpperBound(-1);
		reader.setID(AmlViewsRepository.Memo.reader);
		reader.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveReader(Reader element, int oldIndex, int newIndex) {
		EObject editedElement = readerEditUtil.foundCorrespondingEObject(element);
		readerEditUtil.moveElement(element, oldIndex, newIndex);
		reader.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.reader, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToReader() {
		// Start of user code addToReader() method body
				Reader eObject = AmlFactory.eINSTANCE.createReader();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						readerEditUtil.addElement(propertiesEditionObject);
						reader.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.reader, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromReader(Reader element) {
		// Start of user code removeFromReader() method body
				EObject editedElement = readerEditUtil.foundCorrespondingEObject(element);
				readerEditUtil.removeElement(element);
				reader.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.reader, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editReader(Reader element) {
		// Start of user code editReader() method body
				EObject editedElement = readerEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						readerEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						reader.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.reader, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	
	protected void createSubjectTextarea(Composite parent) {
		Label subjectLabel = SWTUtils.createPartLabel(parent, AmlMessages.MemoPropertiesEditionPart_SubjectLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Memo.subject, AmlViewsRepository.SWT_KIND));
		GridData subjectLabelData = new GridData(GridData.FILL_HORIZONTAL);
		subjectLabelData.horizontalSpan = 3;
		subjectLabel.setLayoutData(subjectLabelData);
		subject = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData subjectData = new GridData(GridData.FILL_HORIZONTAL);
		subjectData.horizontalSpan = 2;
		subjectData.heightHint = 80;
		subjectData.widthHint = 200;
		subject.setLayoutData(subjectData);
		EditingUtils.setID(subject, AmlViewsRepository.Memo.subject);
		EditingUtils.setEEFtype(subject, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.subject, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createBodyTextarea(Composite parent) {
		Label bodyLabel = SWTUtils.createPartLabel(parent, AmlMessages.MemoPropertiesEditionPart_BodyLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Memo.body, AmlViewsRepository.SWT_KIND));
		GridData bodyLabelData = new GridData(GridData.FILL_HORIZONTAL);
		bodyLabelData.horizontalSpan = 3;
		bodyLabel.setLayoutData(bodyLabelData);
		body = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData bodyData = new GridData(GridData.FILL_HORIZONTAL);
		bodyData.horizontalSpan = 2;
		bodyData.heightHint = 80;
		bodyData.widthHint = 200;
		body.setLayoutData(bodyData);
		EditingUtils.setID(body, AmlViewsRepository.Memo.body);
		EditingUtils.setEEFtype(body, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.body, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createIdText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.MemoPropertiesEditionPart_IdLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Memo.id, AmlViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.id, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, id.getText()));
				}
			}

		});
		EditingUtils.setID(id, AmlViewsRepository.Memo.id);
		EditingUtils.setEEFtype(id, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.id, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createTypeText(Composite parent) {
		SWTUtils.createPartLabel(parent, AmlMessages.MemoPropertiesEditionPart_TypeLabel, propertiesEditionComponent.isRequired(AmlViewsRepository.Memo.type, AmlViewsRepository.SWT_KIND));
		type = new Text(parent, SWT.BORDER);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
			}

		});
		type.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(MemoPropertiesEditionPartImpl.this, AmlViewsRepository.Memo.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, AmlViewsRepository.Memo.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(AmlViewsRepository.Memo.type, AmlViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getCreatorToAdd()
	 * 
	 */
	public List getCreatorToAdd() {
		return creatorEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getCreatorToRemove()
	 * 
	 */
	public List getCreatorToRemove() {
		return creatorEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getCreatorToEdit()
	 * 
	 */
	public Map getCreatorToEdit() {
		return creatorEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getCreatorToMove()
	 * 
	 */
	public List getCreatorToMove() {
		return creatorEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getCreatorTable()
	 * 
	 */
	public List getCreatorTable() {
		return creatorEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#initCreator(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initCreator(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			creatorEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			creatorEditUtil = new EMFListEditUtil(current, feature);
		this.creator.setInput(creatorEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#updateCreator(EObject newValue)
	 * 
	 */
	public void updateCreator(EObject newValue) {
		if(creatorEditUtil != null){
			creatorEditUtil.reinit(newValue);
			creator.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#addFilterCreator(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCreator(ViewerFilter filter) {
		creatorFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#addBusinessFilterCreator(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCreator(ViewerFilter filter) {
		creatorBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#isContainedInCreatorTable(EObject element)
	 * 
	 */
	public boolean isContainedInCreatorTable(EObject element) {
		return creatorEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getReaderToAdd()
	 * 
	 */
	public List getReaderToAdd() {
		return readerEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getReaderToRemove()
	 * 
	 */
	public List getReaderToRemove() {
		return readerEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getReaderToEdit()
	 * 
	 */
	public Map getReaderToEdit() {
		return readerEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getReaderToMove()
	 * 
	 */
	public List getReaderToMove() {
		return readerEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getReaderTable()
	 * 
	 */
	public List getReaderTable() {
		return readerEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#initReader(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initReader(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			readerEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			readerEditUtil = new EMFListEditUtil(current, feature);
		this.reader.setInput(readerEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#updateReader(EObject newValue)
	 * 
	 */
	public void updateReader(EObject newValue) {
		if(readerEditUtil != null){
			readerEditUtil.reinit(newValue);
			reader.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#addFilterReader(ViewerFilter filter)
	 * 
	 */
	public void addFilterToReader(ViewerFilter filter) {
		readerFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#addBusinessFilterReader(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToReader(ViewerFilter filter) {
		readerBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#isContainedInReaderTable(EObject element)
	 * 
	 */
	public boolean isContainedInReaderTable(EObject element) {
		return readerEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getSubject()
	 * 
	 */
	public String getSubject() {
		return subject.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#setSubject(String newValue)
	 * 
	 */
	public void setSubject(String newValue) {
		if (newValue != null) {
			subject.setText(newValue);
		} else {
			subject.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getBody()
	 * 
	 */
	public String getBody() {
		return body.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#setBody(String newValue)
	 * 
	 */
	public void setBody(String newValue) {
		if (newValue != null) {
			body.setText(newValue);
		} else {
			body.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getId()
	 * 
	 */
	public String getId() {
		return id.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#setId(String newValue)
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
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.aml.parts.MemoPropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return AmlMessages.Memo_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
