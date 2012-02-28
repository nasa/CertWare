/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Flag;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.FlagPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
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
public class FlagPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public FlagPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject flag, String editing_mode) {
		super(editingContext, flag, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Flag.class;
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
			final Flag flag = (Flag)elt;
			final FlagPropertiesEditionPart basePart = (FlagPropertiesEditionPart)editingPart;
			// init values
			if (flag.getDescription() != null && isAccessible(AmlViewsRepository.Flag.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), flag.getDescription()));
			
			if (flag.getFlagType() != null && isAccessible(AmlViewsRepository.Flag.Properties.flagType))
				basePart.setFlagType(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), flag.getFlagType()));
			
			if (flag.getLabel() != null && isAccessible(AmlViewsRepository.Flag.Properties.label))
				basePart.setLabel(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), flag.getLabel()));
			
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
		if (editorKey == AmlViewsRepository.Flag.Properties.description) {
			return AmlPackage.eINSTANCE.getFlag_Description();
		}
		if (editorKey == AmlViewsRepository.Flag.Properties.flagType) {
			return AmlPackage.eINSTANCE.getFlag_FlagType();
		}
		if (editorKey == AmlViewsRepository.Flag.Properties.label) {
			return AmlPackage.eINSTANCE.getFlag_Label();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Flag flag = (Flag)semanticObject;
		if (AmlViewsRepository.Flag.Properties.description == event.getAffectedEditor()) {
			flag.setDescription((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Flag.Properties.flagType == event.getAffectedEditor()) {
			flag.setFlagType((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Flag.Properties.label == event.getAffectedEditor()) {
			flag.setLabel((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			FlagPropertiesEditionPart basePart = (FlagPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getFlag_Description().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Flag.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (AmlPackage.eINSTANCE.getFlag_FlagType().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Flag.Properties.flagType)) {
				if (msg.getNewValue() != null) {
					basePart.setFlagType(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setFlagType("");
				}
			}
			if (AmlPackage.eINSTANCE.getFlag_Label().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Flag.Properties.label)) {
				if (msg.getNewValue() != null) {
					basePart.setLabel(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setLabel("");
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
				if (AmlViewsRepository.Flag.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getFlag_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getFlag_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Flag.Properties.flagType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getFlag_FlagType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getFlag_FlagType().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Flag.Properties.label == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getFlag_Label().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getFlag_Label().getEAttributeType(), newValue);
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
