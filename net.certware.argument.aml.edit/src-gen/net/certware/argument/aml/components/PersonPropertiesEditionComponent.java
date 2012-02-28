/**
 * Generated with Acceleo
 */
package net.certware.argument.aml.components;

// Start of user code for imports
import net.certware.argument.aml.AmlPackage;
import net.certware.argument.aml.Person;
import net.certware.argument.aml.parts.AmlViewsRepository;
import net.certware.argument.aml.parts.PersonPropertiesEditionPart;

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
public class PersonPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public PersonPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject person, String editing_mode) {
		super(editingContext, person, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = AmlViewsRepository.class;
		partKey = AmlViewsRepository.Person.class;
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
			final Person person = (Person)elt;
			final PersonPropertiesEditionPart basePart = (PersonPropertiesEditionPart)editingPart;
			// init values
			if (person.getFirstName() != null && isAccessible(AmlViewsRepository.Person.Properties.firstName))
				basePart.setFirstName(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getFirstName()));
			
			if (person.getMiddleName() != null && isAccessible(AmlViewsRepository.Person.Properties.middleName))
				basePart.setMiddleName(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getMiddleName()));
			
			if (person.getLastName() != null && isAccessible(AmlViewsRepository.Person.Properties.lastName))
				basePart.setLastName(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getLastName()));
			
			if (person.getNickName() != null && isAccessible(AmlViewsRepository.Person.Properties.nickName))
				basePart.setNickName(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getNickName()));
			
			if (person.getOrganization() != null && isAccessible(AmlViewsRepository.Person.Properties.organization))
				basePart.setOrganization(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getOrganization()));
			
			if (person.getDepartment() != null && isAccessible(AmlViewsRepository.Person.Properties.department))
				basePart.setDepartment(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getDepartment()));
			
			if (person.getEmail() != null && isAccessible(AmlViewsRepository.Person.Properties.email))
				basePart.setEmail(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getEmail()));
			
			if (person.getDescription() != null && isAccessible(AmlViewsRepository.Person.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getDescription()));
			
			if (person.getId() != null && isAccessible(AmlViewsRepository.Person.Properties.id))
				basePart.setId(EEFConverterUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), person.getId()));
			
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
		if (editorKey == AmlViewsRepository.Person.Properties.firstName) {
			return AmlPackage.eINSTANCE.getPerson_FirstName();
		}
		if (editorKey == AmlViewsRepository.Person.Properties.middleName) {
			return AmlPackage.eINSTANCE.getPerson_MiddleName();
		}
		if (editorKey == AmlViewsRepository.Person.Properties.lastName) {
			return AmlPackage.eINSTANCE.getPerson_LastName();
		}
		if (editorKey == AmlViewsRepository.Person.Properties.nickName) {
			return AmlPackage.eINSTANCE.getPerson_NickName();
		}
		if (editorKey == AmlViewsRepository.Person.Properties.organization) {
			return AmlPackage.eINSTANCE.getPerson_Organization();
		}
		if (editorKey == AmlViewsRepository.Person.Properties.department) {
			return AmlPackage.eINSTANCE.getPerson_Department();
		}
		if (editorKey == AmlViewsRepository.Person.Properties.email) {
			return AmlPackage.eINSTANCE.getPerson_Email();
		}
		if (editorKey == AmlViewsRepository.Person.Properties.description) {
			return AmlPackage.eINSTANCE.getPerson_Description();
		}
		if (editorKey == AmlViewsRepository.Person.Properties.id) {
			return AmlPackage.eINSTANCE.getPerson_Id();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Person person = (Person)semanticObject;
		if (AmlViewsRepository.Person.Properties.firstName == event.getAffectedEditor()) {
			person.setFirstName((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Person.Properties.middleName == event.getAffectedEditor()) {
			person.setMiddleName((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Person.Properties.lastName == event.getAffectedEditor()) {
			person.setLastName((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Person.Properties.nickName == event.getAffectedEditor()) {
			person.setNickName((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Person.Properties.organization == event.getAffectedEditor()) {
			person.setOrganization((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Person.Properties.department == event.getAffectedEditor()) {
			person.setDepartment((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Person.Properties.email == event.getAffectedEditor()) {
			person.setEmail((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Person.Properties.description == event.getAffectedEditor()) {
			person.setDescription((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
		if (AmlViewsRepository.Person.Properties.id == event.getAffectedEditor()) {
			person.setId((java.lang.String)EEFConverterUtil.createFromString(XMLTypePackage.eINSTANCE.getString(), (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {	
			PersonPropertiesEditionPart basePart = (PersonPropertiesEditionPart)editingPart;
			if (AmlPackage.eINSTANCE.getPerson_FirstName().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.firstName)) {
				if (msg.getNewValue() != null) {
					basePart.setFirstName(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setFirstName("");
				}
			}
			if (AmlPackage.eINSTANCE.getPerson_MiddleName().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.middleName)) {
				if (msg.getNewValue() != null) {
					basePart.setMiddleName(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setMiddleName("");
				}
			}
			if (AmlPackage.eINSTANCE.getPerson_LastName().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.lastName)) {
				if (msg.getNewValue() != null) {
					basePart.setLastName(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setLastName("");
				}
			}
			if (AmlPackage.eINSTANCE.getPerson_NickName().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.nickName)) {
				if (msg.getNewValue() != null) {
					basePart.setNickName(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setNickName("");
				}
			}
			if (AmlPackage.eINSTANCE.getPerson_Organization().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.organization)) {
				if (msg.getNewValue() != null) {
					basePart.setOrganization(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setOrganization("");
				}
			}
			if (AmlPackage.eINSTANCE.getPerson_Department().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.department)) {
				if (msg.getNewValue() != null) {
					basePart.setDepartment(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDepartment("");
				}
			}
			if (AmlPackage.eINSTANCE.getPerson_Email().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.email)) {
				if (msg.getNewValue() != null) {
					basePart.setEmail(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setEmail("");
				}
			}
			if (AmlPackage.eINSTANCE.getPerson_Description().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (AmlPackage.eINSTANCE.getPerson_Id().equals(msg.getFeature()) && basePart != null && isAccessible(AmlViewsRepository.Person.Properties.id)) {
				if (msg.getNewValue() != null) {
					basePart.setId(EcoreUtil.convertToString(XMLTypePackage.eINSTANCE.getString(), msg.getNewValue()));
				} else {
					basePart.setId("");
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
				if (AmlViewsRepository.Person.Properties.firstName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_FirstName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_FirstName().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Person.Properties.middleName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_MiddleName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_MiddleName().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Person.Properties.lastName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_LastName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_LastName().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Person.Properties.nickName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_NickName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_NickName().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Person.Properties.organization == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_Organization().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_Organization().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Person.Properties.department == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_Department().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_Department().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Person.Properties.email == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_Email().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_Email().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Person.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_Description().getEAttributeType(), newValue);
				}
				if (AmlViewsRepository.Person.Properties.id == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EcoreUtil.createFromString(AmlPackage.eINSTANCE.getPerson_Id().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(AmlPackage.eINSTANCE.getPerson_Id().getEAttributeType(), newValue);
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
