/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.CollectionItem;
import net.certware.argument.aml.ObjectType;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.CollectionItemPropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
	

// End of user code

/**
 * 
 * 
 */
public class CollectionItemPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CollectionItemPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject collectionItem, String editing_mode) {
		super(editingContext, collectionItem, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.CollectionItem.class;
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
			final CollectionItem collectionItem = (CollectionItem)elt;
			final CollectionItemPropertiesEditionPart basePart = (CollectionItemPropertiesEditionPart)editingPart;
			// init values
			if (collectionItem.getIdRef() != null && isAccessible(AmlViewsRepository.CollectionItem.Properties.idRef))
				basePart.setIdRef(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), collectionItem.getIdRef()));
			
			if (isAccessible(AmlViewsRepository.CollectionItem.Properties.objectType)) {
				basePart.initObjectType((EEnum) AmlPackage.eINSTANCE.getCollectionItem_ObjectType().getEType(), collectionItem.getObjectType());
			}
			if (collectionItem.getOrdinal() != null && isAccessible(AmlViewsRepository.CollectionItem.Properties.ordinal))
				basePart.setOrdinal(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), collectionItem.getOrdinal()));
			
			// init filters
			
			
			
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
		if (editorKey == AmlViewsRepository.CollectionItem.Properties.idRef) {
			return AmlPackage.eINSTANCE.getCollectionItem_IdRef();
		}
		if (editorKey == AmlViewsRepository.CollectionItem.Properties.objectType) {
			return AmlPackage.eINSTANCE.getCollectionItem_ObjectType();
		}
		if (editorKey == AmlViewsRepository.CollectionItem.Properties.ordinal) {
			return AmlPackage.eINSTANCE.getCollectionItem_Ordinal();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CollectionItem collectionItem = (CollectionItem)semanticObject;
		if (AmlViewsRepository.CollectionItem.Properties.idRef == event.getAffectedEditor()) {
			collectionItem.setIdRef((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.CollectionItem.Properties.objectType == event.getAffectedEditor()) {
			collectionItem.setObjectType((ObjectType)event.getNewValue());
		}
		if (AmlViewsRepository.CollectionItem.Properties.ordinal == event.getAffectedEditor()) {
			collectionItem.setOrdinal((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CollectionItemPropertiesEditionPart basePart = (CollectionItemPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getCollectionItem_IdRef().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.CollectionItem.Properties.idRef)) {
				if (msg.getNewValue() != null) {
					basePart.setIdRef(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdRef("");
				}
			}
			if (AmlPackage.eINSTANCE.getCollectionItem_ObjectType().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.CollectionItem.Properties.objectType))
				basePart.setObjectType((Enumerator)msg.getNewValue());
			
			if (AmlPackage.eINSTANCE.getCollectionItem_Ordinal().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.CollectionItem.Properties.ordinal)) {
				if (msg.getNewValue() != null) {
					basePart.setOrdinal(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setOrdinal("");
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
				if (AmlViewsRepository.CollectionItem.Properties.idRef == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCollectionItem_IdRef().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCollectionItem_IdRef().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.CollectionItem.Properties.objectType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCollectionItem_ObjectType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCollectionItem_ObjectType().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.CollectionItem.Properties.ordinal == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCollectionItem_Ordinal().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCollectionItem_Ordinal().getEAttributeType(), newValue);
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
