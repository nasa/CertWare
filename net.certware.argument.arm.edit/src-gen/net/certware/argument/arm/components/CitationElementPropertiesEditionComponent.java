/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.components;

// Start of user code for imports
import net.certware.argument.arm.Argument;
import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.CitationElement;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.parts.CitationElementPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * 
 * 
 */
public class CitationElementPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for isTagged ReferencesTable
	 */
	protected ReferencesTableSettings isTaggedSettings;
	
	/**
	 * Settings for refersToArgumentElement EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings refersToArgumentElementSettings;
	
	/**
	 * Settings for refersToArgument EObjectFlatComboViewer
	 */
	private	EObjectFlatComboSettings refersToArgumentSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public CitationElementPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject citationElement, String editing_mode) {
		super(editingContext, citationElement, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ArmViewsRepository.class;
		partKey = ArmViewsRepository.CitationElement.class;
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
			final CitationElement citationElement = (CitationElement)elt;
			final CitationElementPropertiesEditionPart basePart = (CitationElementPropertiesEditionPart)editingPart;
			// init values
			if (citationElement.getIdentifier() != null && isAccessible(ArmViewsRepository.CitationElement.Properties.identifier))
				basePart.setIdentifier(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), citationElement.getIdentifier()));
			
			if (citationElement.getDescription() != null && isAccessible(ArmViewsRepository.CitationElement.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), citationElement.getDescription()));
			
			if (citationElement.getContent() != null && isAccessible(ArmViewsRepository.CitationElement.Properties.content))
				basePart.setContent(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), citationElement.getContent()));
			
			if (isAccessible(ArmViewsRepository.CitationElement.Properties.isTagged)) {
				isTaggedSettings = new ReferencesTableSettings(citationElement, ArmPackage.eINSTANCE.getModelElement_IsTagged());
				basePart.initIsTagged(isTaggedSettings);
			}
			if (isAccessible(ArmViewsRepository.CitationElement.Properties.refersToArgumentElement)) {
				// init part
				refersToArgumentElementSettings = new EObjectFlatComboSettings(citationElement, ArmPackage.eINSTANCE.getCitationElement_RefersToArgumentElement());
				basePart.initRefersToArgumentElement(refersToArgumentElementSettings);
				// set the button mode
				basePart.setRefersToArgumentElementButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ArmViewsRepository.CitationElement.Properties.refersToArgument)) {
				// init part
				refersToArgumentSettings = new EObjectFlatComboSettings(citationElement, ArmPackage.eINSTANCE.getCitationElement_RefersToArgument());
				basePart.initRefersToArgument(refersToArgumentSettings);
				// set the button mode
				basePart.setRefersToArgumentButtonMode(ButtonsModeEnum.BROWSE);
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
			
			basePart.addFilterToRefersToArgumentElement(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof ArgumentElement); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for refersToArgumentElement
			
			// End of user code
			
			basePart.addFilterToRefersToArgument(new ViewerFilter() {
			
			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
			 */
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return (element instanceof String && element.equals("")) || (element instanceof Argument); //$NON-NLS-1$ 
				}
			
			});
			// Start of user code for additional businessfilters for refersToArgument
			
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
		if (editorKey == ArmViewsRepository.CitationElement.Properties.identifier) {
			return ArmPackage.eINSTANCE.getModelElement_Identifier();
		}
		if (editorKey == ArmViewsRepository.CitationElement.Properties.description) {
			return ArmPackage.eINSTANCE.getModelElement_Description();
		}
		if (editorKey == ArmViewsRepository.CitationElement.Properties.content) {
			return ArmPackage.eINSTANCE.getModelElement_Content();
		}
		if (editorKey == ArmViewsRepository.CitationElement.Properties.isTagged) {
			return ArmPackage.eINSTANCE.getModelElement_IsTagged();
		}
		if (editorKey == ArmViewsRepository.CitationElement.Properties.refersToArgumentElement) {
			return ArmPackage.eINSTANCE.getCitationElement_RefersToArgumentElement();
		}
		if (editorKey == ArmViewsRepository.CitationElement.Properties.refersToArgument) {
			return ArmPackage.eINSTANCE.getCitationElement_RefersToArgument();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CitationElement citationElement = (CitationElement)semanticObject;
		if (ArmViewsRepository.CitationElement.Properties.identifier == event.getAffectedEditor()) {
			citationElement.setIdentifier((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (ArmViewsRepository.CitationElement.Properties.description == event.getAffectedEditor()) {
			citationElement.setDescription((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (ArmViewsRepository.CitationElement.Properties.content == event.getAffectedEditor()) {
			citationElement.setContent((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (ArmViewsRepository.CitationElement.Properties.isTagged == event.getAffectedEditor()) {
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
		if (ArmViewsRepository.CitationElement.Properties.refersToArgumentElement == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				refersToArgumentElementSettings.setToReference((ArgumentElement)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, refersToArgumentElementSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (ArmViewsRepository.CitationElement.Properties.refersToArgument == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				refersToArgumentSettings.setToReference((Argument)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Argument eObject = ArmFactory.eINSTANCE.createArgument();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				refersToArgumentSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CitationElementPropertiesEditionPart basePart = (CitationElementPropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getModelElement_Identifier().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.CitationElement.Properties.identifier)) {
				if (msg.getNewValue() != null) {
					basePart.setIdentifier(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdentifier("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.CitationElement.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_Content().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.CitationElement.Properties.content)) {
				if (msg.getNewValue() != null) {
					basePart.setContent(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setContent("");
				}
			}
			if (ArmPackage.eINSTANCE.getModelElement_IsTagged().equals(msg.getFeature()) && isAccessible(ArmViewsRepository.CitationElement.Properties.isTagged))
				basePart.updateIsTagged();
			if (ArmPackage.eINSTANCE.getCitationElement_RefersToArgumentElement().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.CitationElement.Properties.refersToArgumentElement))
				basePart.setRefersToArgumentElement((EObject)msg.getNewValue());
			if (ArmPackage.eINSTANCE.getCitationElement_RefersToArgument().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.CitationElement.Properties.refersToArgument))
				basePart.setRefersToArgument((EObject)msg.getNewValue());
			
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
				if (ArmViewsRepository.CitationElement.Properties.identifier == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Identifier().getEAttributeType(), newValue);
				}
				if (ArmViewsRepository.CitationElement.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getModelElement_Description().getEAttributeType(), newValue);
				}
				if (ArmViewsRepository.CitationElement.Properties.content == event.getAffectedEditor()) {
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
