/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.CreatingTool;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.CreatingToolPropertiesEditionPart;

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
public class CreatingToolPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public CreatingToolPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject creatingTool, String editing_mode) {
		super(editingContext, creatingTool, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.CreatingTool.class;
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
			final CreatingTool creatingTool = (CreatingTool)elt;
			final CreatingToolPropertiesEditionPart basePart = (CreatingToolPropertiesEditionPart)editingPart;
			// init values
			if (creatingTool.getLabel() != null && isAccessible(AmlViewsRepository.CreatingTool.Properties.label))
				basePart.setLabel(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), creatingTool.getLabel()));
			
			if (creatingTool.getToolType() != null && isAccessible(AmlViewsRepository.CreatingTool.Properties.toolType))
				basePart.setToolType(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), creatingTool.getToolType()));
			
			if (creatingTool.getVersion() != null && isAccessible(AmlViewsRepository.CreatingTool.Properties.version))
				basePart.setVersion(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), creatingTool.getVersion()));
			
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
		if (editorKey == AmlViewsRepository.CreatingTool.Properties.label) {
			return AmlPackage.eINSTANCE.getCreatingTool_Label();
		}
		if (editorKey == AmlViewsRepository.CreatingTool.Properties.toolType) {
			return AmlPackage.eINSTANCE.getCreatingTool_ToolType();
		}
		if (editorKey == AmlViewsRepository.CreatingTool.Properties.version) {
			return AmlPackage.eINSTANCE.getCreatingTool_Version();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		CreatingTool creatingTool = (CreatingTool)semanticObject;
		if (AmlViewsRepository.CreatingTool.Properties.label == event.getAffectedEditor()) {
			creatingTool.setLabel((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.CreatingTool.Properties.toolType == event.getAffectedEditor()) {
			creatingTool.setToolType((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.CreatingTool.Properties.version == event.getAffectedEditor()) {
			creatingTool.setVersion((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			CreatingToolPropertiesEditionPart basePart = (CreatingToolPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getCreatingTool_Label().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.CreatingTool.Properties.label)) {
				if (msg.getNewValue() != null) {
					basePart.setLabel(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setLabel("");
				}
			}
			if (AmlPackage.eINSTANCE.getCreatingTool_ToolType().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.CreatingTool.Properties.toolType)) {
				if (msg.getNewValue() != null) {
					basePart.setToolType(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setToolType("");
				}
			}
			if (AmlPackage.eINSTANCE.getCreatingTool_Version().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.CreatingTool.Properties.version)) {
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
				if (AmlViewsRepository.CreatingTool.Properties.label == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCreatingTool_Label().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCreatingTool_Label().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.CreatingTool.Properties.toolType == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCreatingTool_ToolType().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCreatingTool_ToolType().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.CreatingTool.Properties.version == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getCreatingTool_Version().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getCreatingTool_Version().getEAttributeType(), newValue);
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
