/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Question;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.QuestionPropertiesEditionPart;

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
public class QuestionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public QuestionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject question, String editing_mode) {
		super(editingContext, question, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Question.class;
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
			final Question question = (Question)elt;
			final QuestionPropertiesEditionPart basePart = (QuestionPropertiesEditionPart)editingPart;
			// init values
			if (question.getGroup() != null && isAccessible(AmlViewsRepository.Question.Properties.group))
				basePart.setGroup(question.getGroup());
			
			if (question.getAmplification() != null && isAccessible(AmlViewsRepository.Question.Properties.amplification))
				basePart.setAmplification(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), question.getAmplification()));
			
			if (question.getDescription() != null && isAccessible(AmlViewsRepository.Question.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), question.getDescription()));
			
			if (question.getId() != null && isAccessible(AmlViewsRepository.Question.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), question.getId()));
			
			if (question.getLabel() != null && isAccessible(AmlViewsRepository.Question.Properties.label))
				basePart.setLabel(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), question.getLabel()));
			
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
		if (editorKey == AmlViewsRepository.Question.Properties.group) {
			return AmlPackage.eINSTANCE.getQuestion_Group();
		}
		if (editorKey == AmlViewsRepository.Question.Properties.amplification) {
			return AmlPackage.eINSTANCE.getQuestion_Amplification();
		}
		if (editorKey == AmlViewsRepository.Question.Properties.description) {
			return AmlPackage.eINSTANCE.getQuestion_Description();
		}
		if (editorKey == AmlViewsRepository.Question.Properties.id) {
			return AmlPackage.eINSTANCE.getQuestion_Id();
		}
		if (editorKey == AmlViewsRepository.Question.Properties.label) {
			return AmlPackage.eINSTANCE.getQuestion_Label();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Question question = (Question)semanticObject;
		if (AmlViewsRepository.Question.Properties.group == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				question.getGroup().clear();
				question.getGroup().addAll(((List) event.getNewValue()));
			}
		}
		if (AmlViewsRepository.Question.Properties.amplification == event.getAffectedEditor()) {
			question.setAmplification((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Question.Properties.description == event.getAffectedEditor()) {
			question.setDescription((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Question.Properties.id == event.getAffectedEditor()) {
			question.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Question.Properties.label == event.getAffectedEditor()) {
			question.setLabel((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			QuestionPropertiesEditionPart basePart = (QuestionPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getQuestion_Group().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Question.Properties.group)) {
				basePart.setGroup(((Question)semanticObject).getGroup());
			}
			
			if (AmlPackage.eINSTANCE.getQuestion_Amplification().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Question.Properties.amplification)) {
				if (msg.getNewValue() != null) {
					basePart.setAmplification(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setAmplification("");
				}
			}
			if (AmlPackage.eINSTANCE.getQuestion_Description().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Question.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (AmlPackage.eINSTANCE.getQuestion_Id().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Question.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setId("");
				}
			}
			if (AmlPackage.eINSTANCE.getQuestion_Label().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Question.Properties.label)) {
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
				if (AmlViewsRepository.Question.Properties.group == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Group().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (AmlViewsRepository.Question.Properties.amplification == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Amplification().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Amplification().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Question.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Question.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Id().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Question.Properties.label == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getQuestion_Label().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getQuestion_Label().getEAttributeType(), newValue);
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
