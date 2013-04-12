/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Reliability;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.ReliabilityPropertiesEditionPart;

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
public class ReliabilityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ReliabilityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject reliability, String editing_mode) {
		super(editingContext, reliability, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Reliability.class;
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
			final Reliability reliability = (Reliability)elt;
			final ReliabilityPropertiesEditionPart basePart = (ReliabilityPropertiesEditionPart)editingPart;
			// init values
			if (reliability.getDescription() != null && isAccessible(AmlViewsRepository.Reliability.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), reliability.getDescription()));
			
			if (reliability.getLabel() != null && isAccessible(AmlViewsRepository.Reliability.Properties.label))
				basePart.setLabel(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), reliability.getLabel()));
			
			if (reliability.getOrdinal() != null && isAccessible(AmlViewsRepository.Reliability.Properties.ordinal))
				basePart.setOrdinal(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), reliability.getOrdinal()));
			
			if (reliability.getSymbol() != null && isAccessible(AmlViewsRepository.Reliability.Properties.symbol))
				basePart.setSymbol(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), reliability.getSymbol()));
			
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
		if (editorKey == AmlViewsRepository.Reliability.Properties.description) {
			return AmlPackage.eINSTANCE.getReliability_Description();
		}
		if (editorKey == AmlViewsRepository.Reliability.Properties.label) {
			return AmlPackage.eINSTANCE.getReliability_Label();
		}
		if (editorKey == AmlViewsRepository.Reliability.Properties.ordinal) {
			return AmlPackage.eINSTANCE.getReliability_Ordinal();
		}
		if (editorKey == AmlViewsRepository.Reliability.Properties.symbol) {
			return AmlPackage.eINSTANCE.getReliability_Symbol();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Reliability reliability = (Reliability)semanticObject;
		if (AmlViewsRepository.Reliability.Properties.description == event.getAffectedEditor()) {
			reliability.setDescription((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Reliability.Properties.label == event.getAffectedEditor()) {
			reliability.setLabel((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Reliability.Properties.ordinal == event.getAffectedEditor()) {
			reliability.setOrdinal((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Reliability.Properties.symbol == event.getAffectedEditor()) {
			reliability.setSymbol((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ReliabilityPropertiesEditionPart basePart = (ReliabilityPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getReliability_Description().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Reliability.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (AmlPackage.eINSTANCE.getReliability_Label().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Reliability.Properties.label)) {
				if (msg.getNewValue() != null) {
					basePart.setLabel(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setLabel("");
				}
			}
			if (AmlPackage.eINSTANCE.getReliability_Ordinal().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Reliability.Properties.ordinal)) {
				if (msg.getNewValue() != null) {
					basePart.setOrdinal(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setOrdinal("");
				}
			}
			if (AmlPackage.eINSTANCE.getReliability_Symbol().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Reliability.Properties.symbol)) {
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
				if (AmlViewsRepository.Reliability.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getReliability_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getReliability_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Reliability.Properties.label == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getReliability_Label().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getReliability_Label().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Reliability.Properties.ordinal == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getReliability_Ordinal().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getReliability_Ordinal().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Reliability.Properties.symbol == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getReliability_Symbol().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getReliability_Symbol().getEAttributeType(), newValue);
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
