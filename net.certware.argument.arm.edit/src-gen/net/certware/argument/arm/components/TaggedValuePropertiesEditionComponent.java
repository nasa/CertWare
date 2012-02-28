/**
 * Generated with Acceleo
 */
package net.certware.argument.arm.components;

// Start of user code for imports
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.arm.parts.ArmViewsRepository;
import net.certware.argument.arm.parts.TaggedValuePropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
	

// End of user code

/**
 * 
 * 
 */
public class TaggedValuePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public TaggedValuePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject taggedValue, String editing_mode) {
		super(editingContext, taggedValue, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ArmViewsRepository.class;
		partKey = ArmViewsRepository.TaggedValue.class;
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
			final TaggedValue taggedValue = (TaggedValue)elt;
			final TaggedValuePropertiesEditionPart basePart = (TaggedValuePropertiesEditionPart)editingPart;
			// init values
			if (taggedValue.getKey() != null && isAccessible(ArmViewsRepository.TaggedValue.Properties.key))
				basePart.setKey(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), taggedValue.getKey()));
			
			if (taggedValue.getValue() != null && isAccessible(ArmViewsRepository.TaggedValue.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(ArmPackage.eINSTANCE.getString(), taggedValue.getValue()));
			
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
		if (editorKey == ArmViewsRepository.TaggedValue.Properties.key) {
			return ArmPackage.eINSTANCE.getTaggedValue_Key();
		}
		if (editorKey == ArmViewsRepository.TaggedValue.Properties.value) {
			return ArmPackage.eINSTANCE.getTaggedValue_Value();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TaggedValue taggedValue = (TaggedValue)semanticObject;
		if (ArmViewsRepository.TaggedValue.Properties.key == event.getAffectedEditor()) {
			taggedValue.setKey((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (ArmViewsRepository.TaggedValue.Properties.value == event.getAffectedEditor()) {
			taggedValue.setValue((java.lang.String)EEFConverterUtil.createFromString(ArmPackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			TaggedValuePropertiesEditionPart basePart = (TaggedValuePropertiesEditionPart)editingPart;
			if (ArmPackage.eINSTANCE.getTaggedValue_Key().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.TaggedValue.Properties.key)) {
				if (msg.getNewValue() != null) {
					basePart.setKey(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setKey("");
				}
			}
			if (ArmPackage.eINSTANCE.getTaggedValue_Value().equals(msg.getFeature()) && basePart != null && isAccessible(ArmViewsRepository.TaggedValue.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(ArmPackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setValue("");
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
				if (ArmViewsRepository.TaggedValue.Properties.key == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getTaggedValue_Key().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getTaggedValue_Key().getEAttributeType(), newValue);
				}
				if (ArmViewsRepository.TaggedValue.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(ArmPackage.eINSTANCE.getTaggedValue_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ArmPackage.eINSTANCE.getTaggedValue_Value().getEAttributeType(), newValue);
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
