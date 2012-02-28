/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.components;

// Start of user code for imports
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.AssertedChallenge;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.parts.AssertedChallengePropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * 
 * 
 */
public class AssertedChallengePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	/**
	 * Settings for target ReferencesTable
	 */
	private	ReferencesTableSettings targetSettings;
	
	/**
	 * Settings for source ReferencesTable
	 */
	private	ReferencesTableSettings sourceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public AssertedChallengePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject assertedChallenge, String editing_mode) {
		super(editingContext, assertedChallenge, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ArmViewsRepository.class;
		partKey = ArmViewsRepository.AssertedChallenge.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final AssertedChallenge assertedChallenge = (AssertedChallenge)elt;
			final AssertedChallengePropertiesEditionPart basePart = (AssertedChallengePropertiesEditionPart)editingPart;
			// init values
			if (assertedChallenge.getIdentifier() != null && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), assertedChallenge.getIdentifier()));
			
			if (assertedChallenge.getDescription() != null && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), assertedChallenge.getDescription()));
			
			if (assertedChallenge.getContent() != null && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), assertedChallenge.getContent()));
			
			if (isAccessible(ArmViewsRepository.AssertedChallenge.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(assertedChallenge, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			if (isAccessible(ArmViewsRepository.AssertedChallenge.Properties.target)) {
				targetSettings = new ReferencesTableSettings(assertedChallenge, ArmPackage.eINSTANCE.getArgumentLink_Target());
				basePart.initTarget(targetSettings);
			}
			if (isAccessible(ArmViewsRepository.AssertedChallenge.Properties.source)) {
				sourceSettings = new ReferencesTableSettings(assertedChallenge, ArmPackage.eINSTANCE.getArgumentLink_Source());
				basePart.initSource(sourceSettings);
			}
			// init filters
			
			
			
			basePart.addFilterToIsTagged(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof TaggedValue); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for isTagged
			
			// End of user code
			
			basePart.addFilterToTarget(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInTargetTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToTarget(new EObjectFilter(ArmPackage.eINSTANCE.getModelElement()));
			// Start of user code for additional businessfilters for target
			
			// End of user code
			
			basePart.addFilterToSource(new ViewerFilter() {
			
				/**
				 * {@inheritDoc}
				 * 
				 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
				 */
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (element instanceof EObject)
						return (!basePart.isContainedInSourceTable((EObject)element));
					return element instanceof Resource;
				}
			
			});
			basePart.addFilterToSource(new EObjectFilter(ArmPackage.eINSTANCE.getModelElement()));
			// Start of user code for additional businessfilters for source
			
			// End of user code
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == ArmViewsRepository.AssertedChallenge.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == ArmViewsRepository.AssertedChallenge.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == ArmViewsRepository.AssertedChallenge.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == ArmViewsRepository.AssertedChallenge.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		if (editorKey == ArmViewsRepository.AssertedChallenge.Properties.target) {
			return ArmPackage.eINSTANCE.getArgumentLink_Target();
		}
		if (editorKey == ArmViewsRepository.AssertedChallenge.Properties.source) {
			return ArmPackage.eINSTANCE.getArgumentLink_Source();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AssertedChallenge assertedChallenge = (AssertedChallenge)semanticObject;
		if (ArmViewsRepository.AssertedChallenge.Properties.identifier == event.getAffectedEditor()) {
			assertedChallenge.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (ArmViewsRepository.AssertedChallenge.Properties.description == event.getAffectedEditor()) {
			assertedChallenge.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (ArmViewsRepository.AssertedChallenge.Properties.content == event.getAffectedEditor()) {
			assertedChallenge.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (ArmViewsRepository.AssertedChallenge.Properties.isTagged == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, isTaggedSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				isTaggedSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				isTaggedSettings.move(event.getNewIndex(), (TaggedValue) event.getNewValue());
			}
		}
		if (ArmViewsRepository.AssertedChallenge.Properties.target == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ModelElement) {
					targetSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				targetSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				targetSettings.move(event.getNewIndex(), (ModelElement) event.getNewValue());
			}
		}
		if (ArmViewsRepository.AssertedChallenge.Properties.source == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof ModelElement) {
					sourceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				sourceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				sourceSettings.move(event.getNewIndex(), (ModelElement) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AssertedChallengePropertiesEditionPart basePart = (AssertedChallengePropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.isTagged))
				basePart.updateIsTagged();
			if (ArmPackage.eINSTANCE.getArgumentLink_Target().equals(msg.getFeature())  && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.target))
				basePart.updateTarget();
			if (ArmPackage.eINSTANCE.getArgumentLink_Source().equals(msg.getFeature())  && isAccessible(ArmViewsRepository.AssertedChallenge.Properties.source))
				basePart.updateSource();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (ArmViewsRepository.AssertedChallenge.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (ArmViewsRepository.AssertedChallenge.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (ArmViewsRepository.AssertedChallenge.Properties.content == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Content().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
