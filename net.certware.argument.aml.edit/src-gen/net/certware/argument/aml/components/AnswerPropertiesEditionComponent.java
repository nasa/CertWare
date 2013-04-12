/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;
import java.util.List;

import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Answer;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.AnswerPropertiesEditionPart;

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
public class AnswerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public AnswerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject answer, String editing_mode) {
		super(editingContext, answer, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Answer.class;
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
			final Answer answer = (Answer)elt;
			final AnswerPropertiesEditionPart basePart = (AnswerPropertiesEditionPart)editingPart;
			// init values
			if (answer.getGroup() != null && isAccessible(AmlViewsRepository.Answer.Properties.group))
				basePart.setGroup(answer.getGroup());
			
			if (answer.getQuestionId() != null && isAccessible(AmlViewsRepository.Answer.Properties.questionId))
				basePart.setQuestionId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), answer.getQuestionId()));
			
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
		if (editorKey == AmlViewsRepository.Answer.Properties.group) {
			return AmlPackage.eINSTANCE.getAnswer_Group();
		}
		if (editorKey == AmlViewsRepository.Answer.Properties.questionId) {
			return AmlPackage.eINSTANCE.getAnswer_QuestionId();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Answer answer = (Answer)semanticObject;
		if (AmlViewsRepository.Answer.Properties.group == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				answer.getGroup().clear();
				answer.getGroup().addAll(((List) event.getNewValue()));
			}
		}
		if (AmlViewsRepository.Answer.Properties.questionId == event.getAffectedEditor()) {
			answer.setQuestionId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AnswerPropertiesEditionPart basePart = (AnswerPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getAnswer_Group().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Answer.Properties.group)) {
				basePart.setGroup(((Answer)semanticObject).getGroup());
			}
			
			if (AmlPackage.eINSTANCE.getAnswer_QuestionId().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Answer.Properties.questionId)) {
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
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == AmlViewsRepository.Answer.Properties.questionId;
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
				if (AmlViewsRepository.Answer.Properties.group == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getAnswer_Group().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (AmlViewsRepository.Answer.Properties.questionId == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getAnswer_QuestionId().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getAnswer_QuestionId().getEAttributeType(), newValue);
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
