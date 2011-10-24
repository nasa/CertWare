/*
 * Copyright (c) 2010-2011 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 */
package net.certware.argument.cae.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.cae.CaeFactory;
import net.certware.argument.cae.Claim;
import net.certware.argument.cae.Evidence;
import net.certware.argument.cae.Justification;
import net.certware.argument.cae.parts.ArgumentPropertiesEditionPart;
import net.certware.argument.cae.parts.CaeViewsRepository;
import net.certware.argument.cae.providers.CaeMessages;

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
 * 
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
	protected EMFListEditUtil justificationEditUtil;
	protected ReferencesTable<? extends EObject> justification;
	protected List<ViewerFilter> justificationBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> justificationFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil evidenceEditUtil;
	protected ReferencesTable<? extends EObject> evidence;
	protected List<ViewerFilter> evidenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> evidenceFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil claimsEditUtil;
	protected ReferencesTable<? extends EObject> claims;
	protected List<ViewerFilter> claimsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> claimsFilters = new ArrayList<ViewerFilter>();



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
		propertiesGroup.setText(CaeMessages.ArgumentPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createIdentifierText(propertiesGroup);
		createDescriptionText(propertiesGroup);
		createContentTextarea(propertiesGroup);
		createIsTaggedAdvancedTableComposition(propertiesGroup);
		createJustificationAdvancedTableComposition(propertiesGroup);
		createEvidenceAdvancedTableComposition(propertiesGroup);
		createClaimsAdvancedTableComposition(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, CaeMessages.ArgumentPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Argument.identifier, CaeViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, CaeViewsRepository.Argument.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.identifier, CaeViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, CaeMessages.ArgumentPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Argument.description, CaeViewsRepository.SWT_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, CaeViewsRepository.Argument.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.description, CaeViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentTextarea(Composite parent) {
		Label contentLabel = SWTUtils.createPartLabel(parent, CaeMessages.ArgumentPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(CaeViewsRepository.Argument.content, CaeViewsRepository.SWT_KIND));
		GridData contentLabelData = new GridData(GridData.FILL_HORIZONTAL);
		contentLabelData.horizontalSpan = 3;
		contentLabel.setLayoutData(contentLabelData);
		content = new Text(parent, SWT.BORDER | SWT.WRAP | SWT.MULTI | SWT.V_SCROLL);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		contentData.horizontalSpan = 2;
		contentData.heightHint = 80;
		contentData.widthHint = 200;
		content.setLayoutData(contentData);
		EditingUtils.setID(content, CaeViewsRepository.Argument.content);
		EditingUtils.setEEFtype(content, "eef::Textarea"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.content, CaeViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(CaeMessages.ArgumentPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.isTagged, CaeViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(CaeViewsRepository.Argument.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createJustificationAdvancedTableComposition(Composite parent) {
		this.justification = new ReferencesTable<Justification>(CaeMessages.ArgumentPropertiesEditionPart_JustificationLabel, new ReferencesTableListener<Justification>() {			
			public void handleAdd() { addToJustification();}
			public void handleEdit(Justification element) { editJustification(element); }
			public void handleMove(Justification element, int oldIndex, int newIndex) { moveJustification(element, oldIndex, newIndex); }
			public void handleRemove(Justification element) { removeFromJustification(element); }
			public void navigateTo(Justification element) { }
		});
		this.justification.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.justification, CaeViewsRepository.SWT_KIND));
		this.justification.createControls(parent);
		GridData justificationData = new GridData(GridData.FILL_HORIZONTAL);
		justificationData.horizontalSpan = 3;
		this.justification.setLayoutData(justificationData);
		this.justification.setLowerBound(0);
		this.justification.setUpperBound(-1);
		justification.setID(CaeViewsRepository.Argument.justification);
		justification.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveJustification(Justification element, int oldIndex, int newIndex) {
		EObject editedElement = justificationEditUtil.foundCorrespondingEObject(element);
		justificationEditUtil.moveElement(element, oldIndex, newIndex);
		justification.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToJustification() {
		// Start of user code addToJustification() method body
				Justification eObject = CaeFactory.eINSTANCE.createJustification();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						justificationEditUtil.addElement(propertiesEditionObject);
						justification.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.justification, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
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
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.justification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.justification, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createEvidenceAdvancedTableComposition(Composite parent) {
		this.evidence = new ReferencesTable<Evidence>(CaeMessages.ArgumentPropertiesEditionPart_EvidenceLabel, new ReferencesTableListener<Evidence>() {			
			public void handleAdd() { addToEvidence();}
			public void handleEdit(Evidence element) { editEvidence(element); }
			public void handleMove(Evidence element, int oldIndex, int newIndex) { moveEvidence(element, oldIndex, newIndex); }
			public void handleRemove(Evidence element) { removeFromEvidence(element); }
			public void navigateTo(Evidence element) { }
		});
		this.evidence.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.evidence, CaeViewsRepository.SWT_KIND));
		this.evidence.createControls(parent);
		GridData evidenceData = new GridData(GridData.FILL_HORIZONTAL);
		evidenceData.horizontalSpan = 3;
		this.evidence.setLayoutData(evidenceData);
		this.evidence.setLowerBound(0);
		this.evidence.setUpperBound(-1);
		evidence.setID(CaeViewsRepository.Argument.evidence);
		evidence.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveEvidence(Evidence element, int oldIndex, int newIndex) {
		EObject editedElement = evidenceEditUtil.foundCorrespondingEObject(element);
		evidenceEditUtil.moveElement(element, oldIndex, newIndex);
		evidence.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToEvidence() {
		// Start of user code addToEvidence() method body
				Evidence eObject = CaeFactory.eINSTANCE.createEvidence();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						evidenceEditUtil.addElement(propertiesEditionObject);
						evidence.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.evidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromEvidence(Evidence element) {
		// Start of user code removeFromEvidence() method body
				EObject editedElement = evidenceEditUtil.foundCorrespondingEObject(element);
				evidenceEditUtil.removeElement(element);
				evidence.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.evidence, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editEvidence(Evidence element) {
		// Start of user code editEvidence() method body
				EObject editedElement = evidenceEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						evidenceEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						evidence.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.evidence, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createClaimsAdvancedTableComposition(Composite parent) {
		this.claims = new ReferencesTable<Claim>(CaeMessages.ArgumentPropertiesEditionPart_ClaimsLabel, new ReferencesTableListener<Claim>() {			
			public void handleAdd() { addToClaims();}
			public void handleEdit(Claim element) { editClaims(element); }
			public void handleMove(Claim element, int oldIndex, int newIndex) { moveClaims(element, oldIndex, newIndex); }
			public void handleRemove(Claim element) { removeFromClaims(element); }
			public void navigateTo(Claim element) { }
		});
		this.claims.setHelpText(propertiesEditionComponent.getHelpContent(CaeViewsRepository.Argument.claims, CaeViewsRepository.SWT_KIND));
		this.claims.createControls(parent);
		GridData claimsData = new GridData(GridData.FILL_HORIZONTAL);
		claimsData.horizontalSpan = 3;
		this.claims.setLayoutData(claimsData);
		this.claims.setLowerBound(0);
		this.claims.setUpperBound(-1);
		claims.setID(CaeViewsRepository.Argument.claims);
		claims.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveClaims(Claim element, int oldIndex, int newIndex) {
		EObject editedElement = claimsEditUtil.foundCorrespondingEObject(element);
		claimsEditUtil.moveElement(element, oldIndex, newIndex);
		claims.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.claims, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToClaims() {
		// Start of user code addToClaims() method body
				Claim eObject = CaeFactory.eINSTANCE.createClaim();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						claimsEditUtil.addElement(propertiesEditionObject);
						claims.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.claims, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromClaims(Claim element) {
		// Start of user code removeFromClaims() method body
				EObject editedElement = claimsEditUtil.foundCorrespondingEObject(element);
				claimsEditUtil.removeElement(element);
				claims.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.claims, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editClaims(Claim element) {
		// Start of user code editClaims() method body
				EObject editedElement = claimsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						claimsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						claims.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArgumentPropertiesEditionPartImpl.this, CaeViewsRepository.Argument.claims, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#setIdentifier(String newValue)
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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#setDescription(String newValue)
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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText("");  //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#updateIsTagged(EObject newValue)
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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getJustificationToAdd()
	 * 
	 */
	public List getJustificationToAdd() {
		return justificationEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getJustificationToRemove()
	 * 
	 */
	public List getJustificationToRemove() {
		return justificationEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getJustificationToEdit()
	 * 
	 */
	public Map getJustificationToEdit() {
		return justificationEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getJustificationToMove()
	 * 
	 */
	public List getJustificationToMove() {
		return justificationEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getJustificationTable()
	 * 
	 */
	public List getJustificationTable() {
		return justificationEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#initJustification(EObject current, EReference containingFeature, EReference feature)
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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#updateJustification(EObject newValue)
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
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addFilterToJustification(ViewerFilter filter) {
		justificationFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addBusinessFilterJustification(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToJustification(ViewerFilter filter) {
		justificationBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#isContainedInJustificationTable(EObject element)
	 * 
	 */
	public boolean isContainedInJustificationTable(EObject element) {
		return justificationEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getEvidenceToAdd()
	 * 
	 */
	public List getEvidenceToAdd() {
		return evidenceEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getEvidenceToRemove()
	 * 
	 */
	public List getEvidenceToRemove() {
		return evidenceEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getEvidenceToEdit()
	 * 
	 */
	public Map getEvidenceToEdit() {
		return evidenceEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getEvidenceToMove()
	 * 
	 */
	public List getEvidenceToMove() {
		return evidenceEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getEvidenceTable()
	 * 
	 */
	public List getEvidenceTable() {
		return evidenceEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#initEvidence(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initEvidence(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			evidenceEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			evidenceEditUtil = new EMFListEditUtil(current, feature);
		this.evidence.setInput(evidenceEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#updateEvidence(EObject newValue)
	 * 
	 */
	public void updateEvidence(EObject newValue) {
		if(evidenceEditUtil != null){
			evidenceEditUtil.reinit(newValue);
			evidence.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEvidence(ViewerFilter filter) {
		evidenceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addBusinessFilterEvidence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEvidence(ViewerFilter filter) {
		evidenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#isContainedInEvidenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInEvidenceTable(EObject element) {
		return evidenceEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getClaimsToAdd()
	 * 
	 */
	public List getClaimsToAdd() {
		return claimsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getClaimsToRemove()
	 * 
	 */
	public List getClaimsToRemove() {
		return claimsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getClaimsToEdit()
	 * 
	 */
	public Map getClaimsToEdit() {
		return claimsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getClaimsToMove()
	 * 
	 */
	public List getClaimsToMove() {
		return claimsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#getClaimsTable()
	 * 
	 */
	public List getClaimsTable() {
		return claimsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#initClaims(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initClaims(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			claimsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			claimsEditUtil = new EMFListEditUtil(current, feature);
		this.claims.setInput(claimsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#updateClaims(EObject newValue)
	 * 
	 */
	public void updateClaims(EObject newValue) {
		if(claimsEditUtil != null){
			claimsEditUtil.reinit(newValue);
			claims.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addFilterClaims(ViewerFilter filter)
	 * 
	 */
	public void addFilterToClaims(ViewerFilter filter) {
		claimsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#addBusinessFilterClaims(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToClaims(ViewerFilter filter) {
		claimsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.cae.parts.ArgumentPropertiesEditionPart#isContainedInClaimsTable(EObject element)
	 * 
	 */
	public boolean isContainedInClaimsTable(EObject element) {
		return claimsEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CaeMessages.Argument_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
