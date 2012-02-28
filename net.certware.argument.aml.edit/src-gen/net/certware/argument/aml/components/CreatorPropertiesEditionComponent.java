/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Creator;
import net.certware.argument.aml.ObjectType3;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.CreatorPropertiesEditionPart;

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
public class CreatorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CreatorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject creator, String editing_mode) {
		super(editingContext, creator, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Creator.class;
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
			final Creator creator = (Creator)elt;
			final CreatorPropertiesEditionPart basePart = (CreatorPropertiesEditionPart)editingPart;
			// init values
			if (creator.getDescription() != null && isAccessible(AmlViewsRepository.Creator.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), creator.getDescription()));
			
			if (creator.getIdRef() != null && isAccessible(AmlViewsRepository.Creator.Properties.idRef))
				basePart.setIdRef(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), creator.getIdRef()));
			
			if (isAccessible(AmlViewsRepository.Creator.Properties.objectType)) {
				basePart.initObjectType((EEnum) AmlPackage.eINSTANCE.getCreator_ObjectType().getEType(), creator.getObjectType());
			}
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
		if (editorKey == AmlViewsRepository.Creator.Properties.description) {
			return AmlPackage.eINSTANCE.getCreator_Description();
		}
		if (editorKey == AmlViewsRepository.Creator.Properties.idRef) {
			return AmlPackage.eINSTANCE.getCreator_IdRef();
		}
		if (editorKey == AmlViewsRepository.Creator.Properties.objectType) {
			return AmlPackage.eINSTANCE.getCreator_ObjectType();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Creator creator = (Creator)semanticObject;
		if (AmlViewsRepository.Creator.Properties.description == event.getAffectedEditor()) {
			creator.setDescription((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Creator.Properties.idRef == event.getAffectedEditor()) {
			creator.setIdRef((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Creator.Properties.objectType == event.getAffectedEditor()) {
			creator.setObjectType((ObjectType3)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CreatorPropertiesEditionPart basePart = (CreatorPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getCreator_Description().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Creator.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (AmlPackage.eINSTANCE.getCreator_IdRef().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Creator.Properties.idRef)) {
				if (msg.getNewValue() != null) {
					basePart.setIdRef(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdRef("");
				}
			}
			if (AmlPackage.eINSTANCE.getCreator_ObjectType().equals(msg.getFeature()) && isAccessible(AmlViewsRepository.Creator.Properties.objectType))
				basePart.setObjectType((Enumerator)msg.getNewValue());
			
			
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
				if (AmlViewsRepository.Creator.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCreator_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCreator_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Creator.Properties.idRef == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCreator_IdRef().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCreator_IdRef().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Creator.Properties.objectType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCreator_ObjectType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCreator_ObjectType().getEAttributeType(), newValue);
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
