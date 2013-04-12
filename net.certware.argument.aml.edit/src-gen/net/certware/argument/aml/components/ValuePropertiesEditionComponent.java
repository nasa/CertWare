/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Value;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.ValuePropertiesEditionPart;

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
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
	

// End of user code

/**
 * 
 * 
 */
public class ValuePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ValuePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject value, String editing_mode) {
		super(editingContext, value, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Value.class;
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
			final Value value = (Value)elt;
			final ValuePropertiesEditionPart basePart = (ValuePropertiesEditionPart)editingPart;
			// init values
			if (value.getMixed() != null && isAccessible(AmlViewsRepository.Value.Properties.mixed))
				basePart.setMixed(value.getMixed());
			
			if (value.getType() != null && isAccessible(AmlViewsRepository.Value.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), value.getType()));
			
			if (value.getUnit() != null && isAccessible(AmlViewsRepository.Value.Properties.unit))
				basePart.setUnit(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), value.getUnit()));
			
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
		if (editorKey == AmlViewsRepository.Value.Properties.mixed) {
			return AmlPackage.eINSTANCE.getValue_Mixed();
		}
		if (editorKey == AmlViewsRepository.Value.Properties.type) {
			return AmlPackage.eINSTANCE.getValue_Type();
		}
		if (editorKey == AmlViewsRepository.Value.Properties.unit) {
			return AmlPackage.eINSTANCE.getValue_Unit();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Value value = (Value)semanticObject;
		if (AmlViewsRepository.Value.Properties.mixed == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				value.getMixed().clear();
				value.getMixed().addAll(((List) event.getNewValue()));
			}
		}
		if (AmlViewsRepository.Value.Properties.type == event.getAffectedEditor()) {
			value.setType((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Value.Properties.unit == event.getAffectedEditor()) {
			value.setUnit((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			ValuePropertiesEditionPart basePart = (ValuePropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getValue_Mixed().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Value.Properties.mixed)) {
				basePart.setMixed(((Value)semanticObject).getMixed());
			}
			
			if (AmlPackage.eINSTANCE.getValue_Type().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Value.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (AmlPackage.eINSTANCE.getValue_Unit().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Value.Properties.unit)) {
				if (msg.getNewValue() != null) {
					basePart.setUnit(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setUnit("");
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
				if (AmlViewsRepository.Value.Properties.mixed == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getValue_Mixed().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (AmlViewsRepository.Value.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getValue_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getValue_Type().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Value.Properties.unit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getValue_Unit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getValue_Unit().getEAttributeType(), newValue);
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
