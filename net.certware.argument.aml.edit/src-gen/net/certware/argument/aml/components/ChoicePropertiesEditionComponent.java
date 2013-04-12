/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Choice;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.ChoicePropertiesEditionPart;

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
public class ChoicePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ChoicePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject choice, String editing_mode) {
		super(editingContext, choice, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Choice.class;
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
			final Choice choice = (Choice)elt;
			final ChoicePropertiesEditionPart basePart = (ChoicePropertiesEditionPart)editingPart;
			// init values
			if (choice.getDescription() != null && isAccessible(AmlViewsRepository.Choice.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), choice.getDescription()));
			
			if (choice.getLabel() != null && isAccessible(AmlViewsRepository.Choice.Properties.label))
				basePart.setLabel(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), choice.getLabel()));
			
			if (choice.getOrdinal() != null && isAccessible(AmlViewsRepository.Choice.Properties.ordinal))
				basePart.setOrdinal(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), choice.getOrdinal()));
			
			if (choice.getSymbol() != null && isAccessible(AmlViewsRepository.Choice.Properties.symbol))
				basePart.setSymbol(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), choice.getSymbol()));
			
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
		if (editorKey == AmlViewsRepository.Choice.Properties.description) {
			return AmlPackage.eINSTANCE.getChoice_Description();
		}
		if (editorKey == AmlViewsRepository.Choice.Properties.label) {
			return AmlPackage.eINSTANCE.getChoice_Label();
		}
		if (editorKey == AmlViewsRepository.Choice.Properties.ordinal) {
			return AmlPackage.eINSTANCE.getChoice_Ordinal();
		}
		if (editorKey == AmlViewsRepository.Choice.Properties.symbol) {
			return AmlPackage.eINSTANCE.getChoice_Symbol();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Choice choice = (Choice)semanticObject;
		if (AmlViewsRepository.Choice.Properties.description == event.getAffectedEditor()) {
			choice.setDescription((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Choice.Properties.label == event.getAffectedEditor()) {
			choice.setLabel((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Choice.Properties.ordinal == event.getAffectedEditor()) {
			choice.setOrdinal((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Choice.Properties.symbol == event.getAffectedEditor()) {
			choice.setSymbol((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ChoicePropertiesEditionPart basePart = (ChoicePropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getChoice_Description().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Choice.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (AmlPackage.eINSTANCE.getChoice_Label().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Choice.Properties.label)) {
				if (msg.getNewValue() != null) {
					basePart.setLabel(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setLabel("");
				}
			}
			if (AmlPackage.eINSTANCE.getChoice_Ordinal().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Choice.Properties.ordinal)) {
				if (msg.getNewValue() != null) {
					basePart.setOrdinal(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setOrdinal("");
				}
			}
			if (AmlPackage.eINSTANCE.getChoice_Symbol().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Choice.Properties.symbol)) {
				if (msg.getNewValue() != null) {
					basePart.setSymbol(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setSymbol("");
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
				if (AmlViewsRepository.Choice.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getChoice_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getChoice_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Choice.Properties.label == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getChoice_Label().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getChoice_Label().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Choice.Properties.ordinal == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getChoice_Ordinal().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getChoice_Ordinal().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Choice.Properties.symbol == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getChoice_Symbol().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getChoice_Symbol().getEAttributeType(), newValue);
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
