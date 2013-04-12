/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import java.util.Iterator;

import net.certware.argument.aml.AmlDocument;
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.parts.AmlDocumentPropertiesEditionPart;
import net.certware.argument.aml.parts.AmlViewsRepository;

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
public class AmlDocumentPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public AmlDocumentPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject amlDocument, String editing_mode) {
		super(editingContext, amlDocument, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.AmlDocument.class;
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
			final AmlDocument amlDocument = (AmlDocument)elt;
			final AmlDocumentPropertiesEditionPart basePart = (AmlDocumentPropertiesEditionPart)editingPart;
			// init values
			if (amlDocument.getGroup() != null && isAccessible(AmlViewsRepository.AmlDocument.Properties.group))
				basePart.setGroup(amlDocument.getGroup());
			
			if (amlDocument.getVersion() != null && isAccessible(AmlViewsRepository.AmlDocument.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), amlDocument.getVersion()));
			
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
		if (editorKey == AmlViewsRepository.AmlDocument.Properties.group) {
			return AmlPackage.eINSTANCE.getAmlDocument_Group();
		}
		if (editorKey == AmlViewsRepository.AmlDocument.Properties.version) {
			return AmlPackage.eINSTANCE.getAmlDocument_Version();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		AmlDocument amlDocument = (AmlDocument)semanticObject;
		if (AmlViewsRepository.AmlDocument.Properties.group == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				amlDocument.getGroup().clear();
				amlDocument.getGroup().addAll(((java.util.List) event.getNewValue()));
			}
		}
		if (AmlViewsRepository.AmlDocument.Properties.version == event.getAffectedEditor()) {
			amlDocument.setVersion((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			AmlDocumentPropertiesEditionPart basePart = (AmlDocumentPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getAmlDocument_Group().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.AmlDocument.Properties.group)) {
				basePart.setGroup(((AmlDocument)semanticObject).getGroup());
			}
			
			if (AmlPackage.eINSTANCE.getAmlDocument_Version().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.AmlDocument.Properties.version)) {
				if (msg.getNewValue() != null) {
					basePart.setVersion(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setVersion("");
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
				if (AmlViewsRepository.AmlDocument.Properties.group == event.getAffectedEditor()) {
					BasicDiagnostic chain = new BasicDiagnostic();
					for (Iterator iterator = ((java.util.List)event.getNewValue()).iterator(); iterator.hasNext();) {
						chain.add(Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getAmlDocument_Group().getEAttributeType(), iterator.next()));
					}
					ret = chain;
				}
				if (AmlViewsRepository.AmlDocument.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getAmlDocument_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getAmlDocument_Version().getEAttributeType(), newValue);
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
