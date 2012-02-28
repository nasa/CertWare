/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Annotation;
import net.certware.argument.aml.DiscoveryMethod;
import net.certware.argument.aml.Type;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.DiscoveryMethodPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
	

// End of user code

/**
 * 
 * 
 */
public class DiscoveryMethodPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for annotation ReferencesTable
	 */
	protected ReferencesTableSettings annotationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DiscoveryMethodPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject discoveryMethod, String editing_mode) {
		super(editingContext, discoveryMethod, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.DiscoveryMethod.class;
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
			final DiscoveryMethod discoveryMethod = (DiscoveryMethod)elt;
			final DiscoveryMethodPropertiesEditionPart basePart = (DiscoveryMethodPropertiesEditionPart)editingPart;
			// init values
			if (discoveryMethod.getUrl() != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.url))
				basePart.setUrl(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getUrl()));
			
			if (isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.annotation)) {
				annotationSettings = new ReferencesTableSettings(discoveryMethod, AmlPackage.eINSTANCE.getDiscoveryMethod_Annotation());
				basePart.initAnnotation(annotationSettings);
			}
			if (discoveryMethod.getAutoTrigger() != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.autoTrigger))
				basePart.setAutoTrigger(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getAutoTrigger()));
			
			if (discoveryMethod.getDescription() != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getDescription()));
			
			if (discoveryMethod.getId() != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getId()));
			
			if (discoveryMethod.getImportType() != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.importType))
				basePart.setImportType(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getImportType()));
			
			if (discoveryMethod.getLabel() != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.label))
				basePart.setLabel(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), discoveryMethod.getLabel()));
			
			if (isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.type)) {
				basePart.initType((EEnum) AmlPackage.eINSTANCE.getDiscoveryMethod_Type().getEType(), discoveryMethod.getType());
			}
			// init filters
			
			basePart.addFilterToAnnotation(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Annotation); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for annotation
			
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
		if (editorKey == AmlViewsRepository.DiscoveryMethod.Properties.url) {
			return AmlPackage.eINSTANCE.getDiscoveryMethod_Url();
		}
		if (editorKey == AmlViewsRepository.DiscoveryMethod.Properties.annotation) {
			return AmlPackage.eINSTANCE.getDiscoveryMethod_Annotation();
		}
		if (editorKey == AmlViewsRepository.DiscoveryMethod.Properties.autoTrigger) {
			return AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger();
		}
		if (editorKey == AmlViewsRepository.DiscoveryMethod.Properties.description) {
			return AmlPackage.eINSTANCE.getDiscoveryMethod_Description();
		}
		if (editorKey == AmlViewsRepository.DiscoveryMethod.Properties.id) {
			return AmlPackage.eINSTANCE.getDiscoveryMethod_Id();
		}
		if (editorKey == AmlViewsRepository.DiscoveryMethod.Properties.importType) {
			return AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType();
		}
		if (editorKey == AmlViewsRepository.DiscoveryMethod.Properties.label) {
			return AmlPackage.eINSTANCE.getDiscoveryMethod_Label();
		}
		if (editorKey == AmlViewsRepository.DiscoveryMethod.Properties.type) {
			return AmlPackage.eINSTANCE.getDiscoveryMethod_Type();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DiscoveryMethod discoveryMethod = (DiscoveryMethod)semanticObject;
		if (AmlViewsRepository.DiscoveryMethod.Properties.url == event.getAffectedEditor()) {
			discoveryMethod.setUrl((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DiscoveryMethod.Properties.annotation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, annotationSettings, editingContext.getAdapterFactory());
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
				annotationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				annotationSettings.move(event.getNewIndex(), (Annotation) event.getNewValue());
			}
		}
		if (AmlViewsRepository.DiscoveryMethod.Properties.autoTrigger == event.getAffectedEditor()) {
			discoveryMethod.setAutoTrigger((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DiscoveryMethod.Properties.description == event.getAffectedEditor()) {
			discoveryMethod.setDescription((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DiscoveryMethod.Properties.id == event.getAffectedEditor()) {
			discoveryMethod.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DiscoveryMethod.Properties.importType == event.getAffectedEditor()) {
			discoveryMethod.setImportType((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DiscoveryMethod.Properties.label == event.getAffectedEditor()) {
			discoveryMethod.setLabel((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DiscoveryMethod.Properties.type == event.getAffectedEditor()) {
			discoveryMethod.setType((Type)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DiscoveryMethodPropertiesEditionPart basePart = (DiscoveryMethodPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getDiscoveryMethod_Url().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.url)) {
				if (msg.getNewValue() != null) {
					basePart.setUrl(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setUrl("");
				}
			}
			if (AmlPackage.eINSTANCE.getDiscoveryMethod_Annotation().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.annotation))
				basePart.updateAnnotation();
			if (AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.autoTrigger)) {
				if (msg.getNewValue() != null) {
					basePart.setAutoTrigger(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setAutoTrigger("");
				}
			}
			if (AmlPackage.eINSTANCE.getDiscoveryMethod_Description().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (AmlPackage.eINSTANCE.getDiscoveryMethod_Id().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.importType)) {
				if (msg.getNewValue() != null) {
					basePart.setImportType(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setImportType("");
				}
			}
			if (AmlPackage.eINSTANCE.getDiscoveryMethod_Label().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.label)) {
				if (msg.getNewValue() != null) {
					basePart.setLabel(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setLabel("");
				}
			}
			if (AmlPackage.eINSTANCE.getDiscoveryMethod_Type().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.DiscoveryMethod.Properties.type))
				basePart.setType((Enumerator)msg.getNewValue());
			
			
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
				if (AmlViewsRepository.DiscoveryMethod.Properties.url == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Url().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Url().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.Properties.autoTrigger == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_AutoTrigger().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.Properties.importType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_ImportType().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.Properties.label == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Label().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Label().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DiscoveryMethod.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDiscoveryMethod_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDiscoveryMethod_Type().getEAttributeType(), newValue);
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
