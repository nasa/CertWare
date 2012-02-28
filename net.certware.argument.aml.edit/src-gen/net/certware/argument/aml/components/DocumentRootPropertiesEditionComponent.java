/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.DocumentRoot;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.DocumentRootPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
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
public class DocumentRootPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for xMLNSPrefixMap ReferencesTable
	 */
	protected ReferencesTableSettings xMLNSPrefixMapSettings;
	
	/**
	 * Settings for xSISchemaLocation ReferencesTable
	 */
	protected ReferencesTableSettings xSISchemaLocationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DocumentRootPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject documentRoot, String editing_mode) {
		super(editingContext, documentRoot, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.DocumentRoot.class;
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
			final DocumentRoot documentRoot = (DocumentRoot)elt;
			final DocumentRootPropertiesEditionPart basePart = (DocumentRootPropertiesEditionPart)editingPart;
			// init values
			if (documentRoot.getMixed() != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.mixed))
				basePart.setMixed(documentRoot.getMixed());
			
			if (isAccessible(AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap)) {
				xMLNSPrefixMapSettings = new ReferencesTableSettings(documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap());
				basePart.initXMLNSPrefixMap(xMLNSPrefixMapSettings);
			}
			if (isAccessible(AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation)) {
				xSISchemaLocationSettings = new ReferencesTableSettings(documentRoot, AmlPackage.eINSTANCE.getDocumentRoot_XSISchemaLocation());
				basePart.initXSISchemaLocation(xSISchemaLocationSettings);
			}
			if (documentRoot.getDescription1() != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.description1))
				basePart.setDescription1(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), documentRoot.getDescription1()));
			
			if (documentRoot.getId() != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), documentRoot.getId()));
			
			if (documentRoot.getIdRef() != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.idRef))
				basePart.setIdRef(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), documentRoot.getIdRef()));
			
			if (documentRoot.getLabel1() != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.label1))
				basePart.setLabel1(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), documentRoot.getLabel1()));
			
			// init filters
			
			basePart.addFilterToXMLNSPrefixMap(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EStringToStringMapEntryImpl); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for xMLNSPrefixMap
			
			// End of user code
			
			basePart.addFilterToXSISchemaLocation(new ViewerFilter() {
			
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EStringToStringMapEntryImpl); //$NON-NLS-1$ 
					}
			
			});
			// Start of user code for additional businessfilters for xSISchemaLocation
			
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
		if (editorKey == AmlViewsRepository.DocumentRoot.Properties.mixed) {
			return AmlPackage.eINSTANCE.getDocumentRoot_Mixed();
		}
		if (editorKey == AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap) {
			return AmlPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap();
		}
		if (editorKey == AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation) {
			return AmlPackage.eINSTANCE.getDocumentRoot_XSISchemaLocation();
		}
		if (editorKey == AmlViewsRepository.DocumentRoot.Properties.description1) {
			return AmlPackage.eINSTANCE.getDocumentRoot_Description1();
		}
		if (editorKey == AmlViewsRepository.DocumentRoot.Properties.id) {
			return AmlPackage.eINSTANCE.getDocumentRoot_Id();
		}
		if (editorKey == AmlViewsRepository.DocumentRoot.Properties.idRef) {
			return AmlPackage.eINSTANCE.getDocumentRoot_IdRef();
		}
		if (editorKey == AmlViewsRepository.DocumentRoot.Properties.label1) {
			return AmlPackage.eINSTANCE.getDocumentRoot_Label1();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		DocumentRoot documentRoot = (DocumentRoot)semanticObject;
		if (AmlViewsRepository.DocumentRoot.Properties.mixed == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				documentRoot.getMixed().clear();
				documentRoot.getMixed().addAll(((List) event.getNewValue()));
			}
		}
		if (AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, xMLNSPrefixMapSettings, editingContext.getAdapterFactory());
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
				xMLNSPrefixMapSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				xMLNSPrefixMapSettings.move(event.getNewIndex(), (EStringToStringMapEntryImpl) event.getNewValue());
			}
		}
		if (AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, xSISchemaLocationSettings, editingContext.getAdapterFactory());
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
				xSISchemaLocationSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				xSISchemaLocationSettings.move(event.getNewIndex(), (EStringToStringMapEntryImpl) event.getNewValue());
			}
		}
		if (AmlViewsRepository.DocumentRoot.Properties.description1 == event.getAffectedEditor()) {
			documentRoot.setDescription1((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DocumentRoot.Properties.id == event.getAffectedEditor()) {
			documentRoot.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DocumentRoot.Properties.idRef == event.getAffectedEditor()) {
			documentRoot.setIdRef((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.DocumentRoot.Properties.label1 == event.getAffectedEditor()) {
			documentRoot.setLabel1((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			DocumentRootPropertiesEditionPart basePart = (DocumentRootPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getDocumentRoot_Mixed().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.mixed)) {
				basePart.setMixed(((DocumentRoot)semanticObject).getMixed());
			}
			
			if (AmlPackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.DocumentRoot.Properties.xMLNSPrefixMap))
				basePart.updateXMLNSPrefixMap();
			if (AmlPackage.eINSTANCE.getDocumentRoot_XSISchemaLocation().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.DocumentRoot.Properties.xSISchemaLocation))
				basePart.updateXSISchemaLocation();
			if (AmlPackage.eINSTANCE.getDocumentRoot_Description1().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.description1)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription1(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription1("");
				}
			}
			if (AmlPackage.eINSTANCE.getDocumentRoot_Id().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (AmlPackage.eINSTANCE.getDocumentRoot_IdRef().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.idRef)) {
				if (msg.getNewValue() != null) {
					basePart.setIdRef(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdRef("");
				}
			}
			if (AmlPackage.eINSTANCE.getDocumentRoot_Label1().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.DocumentRoot.Properties.label1)) {
				if (msg.getNewValue() != null) {
					basePart.setLabel1(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setLabel1("");
				}
			}
			
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
				if (AmlViewsRepository.DocumentRoot.Properties.mixed == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_Mixed().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (AmlViewsRepository.DocumentRoot.Properties.description1 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_Description1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_Description1().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DocumentRoot.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DocumentRoot.Properties.idRef == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_IdRef().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_IdRef().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.DocumentRoot.Properties.label1 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getDocumentRoot_Label1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getDocumentRoot_Label1().getEAttributeType(), newValue);
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
