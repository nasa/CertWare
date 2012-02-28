/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.EvidenceExhibit;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.EvidenceExhibitPropertiesEditionPart;

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
public class EvidenceExhibitPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EvidenceExhibitPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject evidenceExhibit, String editing_mode) {
		super(editingContext, evidenceExhibit, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.EvidenceExhibit.class;
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
			final EvidenceExhibit evidenceExhibit = (EvidenceExhibit)elt;
			final EvidenceExhibitPropertiesEditionPart basePart = (EvidenceExhibitPropertiesEditionPart)editingPart;
			// init values
			if (evidenceExhibit.getValue() != null && isAccessible(AmlViewsRepository.EvidenceExhibit.Properties.value))
				basePart.setValue(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), evidenceExhibit.getValue()));
			
			if (evidenceExhibit.getIdRef() != null && isAccessible(AmlViewsRepository.EvidenceExhibit.Properties.idRef))
				basePart.setIdRef(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), evidenceExhibit.getIdRef()));
			
			if (evidenceExhibit.getQuestionId() != null && isAccessible(AmlViewsRepository.EvidenceExhibit.Properties.questionId))
				basePart.setQuestionId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), evidenceExhibit.getQuestionId()));
			
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
		if (editorKey == AmlViewsRepository.EvidenceExhibit.Properties.value) {
			return AmlPackage.eINSTANCE.getEvidenceExhibit_Value();
		}
		if (editorKey == AmlViewsRepository.EvidenceExhibit.Properties.idRef) {
			return AmlPackage.eINSTANCE.getEvidenceExhibit_IdRef();
		}
		if (editorKey == AmlViewsRepository.EvidenceExhibit.Properties.questionId) {
			return AmlPackage.eINSTANCE.getEvidenceExhibit_QuestionId();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EvidenceExhibit evidenceExhibit = (EvidenceExhibit)semanticObject;
		if (AmlViewsRepository.EvidenceExhibit.Properties.value == event.getAffectedEditor()) {
			evidenceExhibit.setValue((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.EvidenceExhibit.Properties.idRef == event.getAffectedEditor()) {
			evidenceExhibit.setIdRef((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.EvidenceExhibit.Properties.questionId == event.getAffectedEditor()) {
			evidenceExhibit.setQuestionId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			EvidenceExhibitPropertiesEditionPart basePart = (EvidenceExhibitPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getEvidenceExhibit_Value().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.EvidenceExhibit.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setValue("");
				}
			}
			if (AmlPackage.eINSTANCE.getEvidenceExhibit_IdRef().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.EvidenceExhibit.Properties.idRef)) {
				if (msg.getNewValue() != null) {
					basePart.setIdRef(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setIdRef("");
				}
			}
			if (AmlPackage.eINSTANCE.getEvidenceExhibit_QuestionId().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.EvidenceExhibit.Properties.questionId)) {
				if (msg.getNewValue() != null) {
					basePart.setQuestionId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setQuestionId("");
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
				if (AmlViewsRepository.EvidenceExhibit.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getEvidenceExhibit_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getEvidenceExhibit_Value().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.EvidenceExhibit.Properties.idRef == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getEvidenceExhibit_IdRef().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getEvidenceExhibit_IdRef().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.EvidenceExhibit.Properties.questionId == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getEvidenceExhibit_QuestionId().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getEvidenceExhibit_QuestionId().getEAttributeType(), newValue);
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
